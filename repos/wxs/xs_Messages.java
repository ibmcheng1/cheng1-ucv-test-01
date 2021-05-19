// IBM Confidential OCO Source Material
// 5724-J34 (C) COPYRIGHT International Business Machines Corp. 2005
// The source code for this program is not published or otherwise divested
// of its trade secrets, irrespective of what has been deposited with the
// U.S. Copyright Office.
//
// Module  :  Messages.java
//
// Source File Description: 
//
// Need a file description.
//
// Change Activity:
//
// Reason       Version   Date         Userid    Change Description
// ------------ --------- ------------ --------- -----------------------------------------
// XD60_M3_B.13 WASX.XD   04/13/2005   jitang    ObjectGrid - JAAS / Security - Drop 1 - Basic Support
// ------------ --------- ------------ --------- -----------------------------------------
///I/ /W/ /G/ /U/   <-- CMVC Keywords, replace / with %
//1.2 XD/ws/code/objectgrid.core/src/com/ibm/ws/objectgrid/Messages.java, WAS.objectgrid, WASX.XD, b0614.107 12/22/05 23:54:34 
//

package com.ibm.ws.xs.util;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import com.ibm.ejs.ras.Tr;
import com.ibm.ejs.ras.TraceComponent;
import com.ibm.ws.ffdc.FFDCFilter;
import com.ibm.ws.xs.NLSConstants;

/**
 * Retrieve messages from the ObjectGrid resource bundle(s).
 */
public class Messages {
    private static final TraceComponent TC = Tr.register( Messages.class,
                                                          NLSConstants.TR_GROUP_NAME,
                                                          NLSConstants.TR_RESOURCE_BUNDLE_NAME);

    private static final String CLASS_NAME = Messages.class.getName();

    private static ResourceBundle bundle = null;

    static {
        // get the resource bundle for the locale on this machine
        try {
            bundle = ResourceBundle
                .getBundle(NLSConstants.TR_RESOURCE_BUNDLE_NAME);
        }
        catch (MissingResourceException e) {
            // Just log a FFDC and debug message and continue
            FFDCFilter.processException(e, "com.ibm.ws.objectgrid.Messages.<clinit>", "57");
            if (TC.isDebugEnabled())
                Tr.debug(TC, "static initializer", new Object[] {
                    "An unexpected exception occurred while retrieving Message resources: "
                        + e.toString() + ".", e });
        }
    }

    /**
     * The resource bundle to one for a specific locale.
     */
    public static void setLocaleSpecificResourceBundle(Locale locale) {
        if (locale != null) {
            try {
                bundle = ResourceBundle.getBundle(
                	NLSConstants.TR_RESOURCE_BUNDLE_NAME,
                    locale);
            }
            catch (MissingResourceException e) {
                // Just log a FFDC and debug messag and continue
                
                FFDCFilter.processException(e, CLASS_NAME
                    + ".setLocaleSpecificResourceBundle", "83");
                if (TC.isDebugEnabled())
                    Tr.debug(
                        TC,
                        "setLocaleSpecificResourceBundle",
                        new Object[] {
                            "An unexpected exception occurred while retrieving Message resources: "
                                + e.toString() + ".", locale, e });
            }
        }
    }

    /**
     * Retrieve a message from our resource bundle.
     * @param key the non-translated key for the message in the resource bundle
     * @return user message from the NL enabled bundle
     *                      or in case of failure the original message key is returned 
     **/
    public static String getMsg(String key) {
        return getMsgImpl(key, null, true);
    }

    private static String getMsgImpl(String key, Object[] args, boolean printNotFoundMsg) {
        String userMessage = key; 
        if( bundle != null) {
            try {
                if ( args == null ) {
                    userMessage = bundle.getString(key);
                } else {
                    userMessage = MessageFormat.format(bundle.getString(key), args);
                }
            } catch ( Exception ex ) {
                // Failure should be silent... unless the caller needs to be identified in debug mode
                if ( TC.isDebugEnabled()
                        && printNotFoundMsg ) {
                    // ONLY_FOR_DEBUG: attempts to discover callers that call with invalid message keys
                    discoverMessageCaller(key);
                }
            }
        }
        // failure to retrieve user message from bundle would still return the key passed in
        // which is rather more meaningful than an empty or null string for a worst case scenario
        return userMessage;
    }

    private static void discoverMessageCaller(String key) {
        try {
            StackTraceElement[] stes = Thread.currentThread().getStackTrace();
            //find who called Messages.getMsg:
            String caller = null;
            for (int i=0; i<stes.length; i++) {
                StackTraceElement ste = stes[i];
                if (CLASS_NAME.equals(ste.getClassName()) && ("getMsg".equals(ste.getMethodName()) || "getMsgOrUseDefault".equals(ste.getMethodName()))
                        && (i+1) < stes.length) {
                    caller = stes[i+1].getClassName() + "." + stes[i+1].getMethodName() + "(...) at line " + stes[i+1].getLineNumber();
                    break;
                }
            }
            // uncomment only when testing in a non-RAS env
            //System.out.println("Mising key, " + key + ", from caller, " + caller);
            
            //This message should only be printed if the printNotFoundMessage is true or if debug tracing is enabled
            Tr.debug(TC, NLSConstants.MISSING_KEY_ERROR_CWOBJ0010, new Object[] { key, caller });
        } catch ( Throwable th) { // ensure no possible interference in production environments
            Tr.event(TC, "Failed to identify the caller passing message key ["+ key +"]  due to Ex: "+ th );
        }
    }

    /**
     * Checks to see if the passed-in string is a valid message key for in this class's
     * ResourceBundle.  
     * @param key - the message key to check.
     * @return true if the message key exists in this resource bundle and is not null.  Otherwise false.
     */
    public static boolean isValidKey(String key) {
        String msg;
        try {
            msg = bundle.getString(key);
        } catch ( Exception ex ) {
            msg = null;
        }
        return msg != null;
    }

    /**
     * Retrieve a message from our resource bundle.
     * @param key the non-translated key for the message in the resource bundle
     * @param arg the single argument that the message requires.
     **/
    public static String getMsg(String key, Object arg) {
        return getMsgImpl(key, new Object[]{arg}, true);
    }
    
    /**
     * Retrieve a message from our resource bundle.
     * @param key the non-translated key for the message in the resource bundle
     * @param args the arguments that the message requires.
     **/
    public static String getMsg(String key, Object[] args) {
        return getMsgImpl(key, args, true);
    }

    /**
     * Retrieve a message from our resource bundle.  If no resource bundle
     * was found, return default string.
     * 
     * @param id message key
     * @param defaultMsg default message
     * @return translated message
     */
    public static String getMsgOrUseDefault(String id, String defaultMsg) {
        return getMsgOrUseDefault(id, null, defaultMsg);
    }

    /**
     *
     * Retrieve a message from our resource bundle. The additional parameter
     * will be appended to the message.  If no resouce  bundle was found,
     * return the default string with the extra argument appended.
     * 
     * @param id key ID
     * @param args the arguments that the message requires. 
     * @param defaultMsg default message
     * @return
     */
    public static String getMsgOrUseDefault(String id, Object[] args, String defaultMsg) {
        String msg = getMsgImpl(id, args, false);
        if (msg == null) {
            msg = defaultMsg;
            if (args != null) {
                for (Object arg : args) {
                    msg += "   " + arg;
                }
            }
        }
        return msg;
    }

    private static String getMsg() {

        return getMsgImpl("test", null, true);
    }

    public static void main(String[] args) {

        //Tests that invalid messages are displayed appropriately:
        System.out.println();
        System.out.println("getMsg(\"blah\") = " + getMsg("blah"));
        System.out.println();
        
        System.out.println();
        System.out.println("getMsg(\"blah\", \"arg1\") = " + getMsg("blah", "arg1"));
        System.out.println();
        
        System.out.println();
        System.out.println("getMsg(\"blah\", new Object[]{\"arg1\", \"arg2\"}) = " + getMsg("blah", new Object[]{"arg1", "arg2"}));
        System.out.println();
        
        System.out.println();
        System.out.println("getMsgOrUseDefault(\"blah\", \"defaultMsg\") = " + getMsgOrUseDefault("blah", "defaultMsg"));
        System.out.println();
        
        System.out.println();
        System.out.println("getMsgOrUseDefault(\"blah\", new Object[]{\"arg1\", \"arg2\"}, \"defaultMsg {0} {1}\") = " + getMsgOrUseDefault("blah", new Object[]{"arg1", "arg2"}, "defaultMsg {0} {1}"));
        System.out.println();
        
        System.out.println();
        System.out.println("getMsg() = " + getMsg());
        System.out.println();
    }
}