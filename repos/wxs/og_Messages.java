// IBM Confidential OCO Source Material
// 5724-J34 (C) COPYRIGHT International Business Machines Corp. 2006
// The source code for this program is not published or otherwise divested
// of its trade secrets, irrespective of what has been deposited with the
// U.S. Copyright Office.
//
// $Id$
//
// Module  :  Messages.java
//
// Source File Description:
//
//    See javadoc.
//
// Change Activity:
//
// Reason       Version   Date         Userid    Change Description
// ------------ --------- ------------ --------- -----------------------------------------
// b2203        6.1       08/24/2006   cdjohnson M5 feature additions
// ------------ --------- ------------ --------- -----------------------------------------
package com.ibm.ws.objectgrid.resources;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import com.ibm.ws.objectgrid.Constants;

public class Messages {
    private static final com.ibm.ejs.ras.TraceComponent tc=com.ibm.ejs.ras.Tr.register(Messages.class, null, null);
    private static ResourceBundle RESOURCE_BUNDLE=null;

    static {
        try {
            RESOURCE_BUNDLE = ResourceBundle.getBundle(Constants.TR_RESOURCE_BUNDLE_NAME);
        } catch (MissingResourceException e) {
            com.ibm.ws.ffdc.FFDCFilter.processException(e, "com.ibm.ws.objectgrid.resources.Messages.<clinit>", "15");
            if (tc.isDebugEnabled()) com.ibm.ejs.ras.Tr.debug(tc, "Exception retreiving resource bundle.", e);
        }

    }

    private Messages() {
    }

    public static String getString(String key) {
        try {
            if(RESOURCE_BUNDLE==null) {
                return '!' + key + '!';
            }
            return RESOURCE_BUNDLE.getString(key);
        } catch (MissingResourceException e) {
           com.ibm.ws.ffdc.FFDCFilter.processException(e, "com.ibm.ws.objectgrid.resources.Messages.getString", "20");
           return '!' + key + '!';
        }
    }

    public static String getString(String key, Object arg) {
        try {
            if(RESOURCE_BUNDLE==null) {
                return '!' + key + '!' + ' ' + arg;
            }
            String result = RESOURCE_BUNDLE.getString(key);
            return MessageFormat.format(result, new Object[]{arg});
        } catch (MissingResourceException e) {
            com.ibm.ws.ffdc.FFDCFilter.processException(e, "com.ibm.ws.objectgrid.resources.Messages.getString", "30");
            return '!' + key + '!' + " " + getArgsAsString(arg);
        }
    }

    public static String getString(String key, Object[] args) {
        try {
            if(RESOURCE_BUNDLE==null) {
                StringBuffer sb = new StringBuffer();
                sb.append('!').append(key).append('!');
                for(int i=0;i<args.length;i++) {
                    sb.append(args[i]);
                    if(i+1<args.length) sb.append(',');
                }
                return sb.toString();
            }
            String result = RESOURCE_BUNDLE.getString(key);
            return MessageFormat.format(result, args);
        } catch (MissingResourceException e) {
            com.ibm.ws.ffdc.FFDCFilter.processException(e, "com.ibm.ws.objectgrid.resources.Messages.getString", "40");
            return '!' + key + '!' + " " + getArgsAsString(args);
        }
    }

    public static String getArgsAsString(Object args) {
        if(args == null) {
            return "";
        }
        return '[' + args.toString() + ']';
    }

    public static String getArgsAsString(Object[] args) {
        if(args.length==0) {
            return "";
        }
        return Arrays.asList(args).toString();
    }
}
