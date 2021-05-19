

if (curMapSet == null){
     throw new MetadataException(Messages.getMsg(NLSConstants.EM_MISSING_MAPSET_CWOBJ3015E,
                new Object[]{curMetadata.getName()}));
}

ObjectGridXIOException e = new ConnectionRefusedException(
		Messages.getString(NLSConstants.XIO_RECONNECT_FAILED, targetInfo));

String errorMsg = Messages.getString(NLSConstants.MAC_FAILED_CLIENT,
        new Object[] { this.conn.getTCPContext().getRemoteAddress(),
		String.valueOf(this.conn.getTCPContext().getRemotePort()) });

if(failOnError) {
	throw new ObjectGridConfigurationException(Messages.getString(NLSConstants.CONFIG_PROPERTY_UNSUPPORTED_CWOBJ1207W, new Object[]{propName, pluginClass}));
}

if(!internal && !bmc.isInternalMap()) {
    String shardID = name +":"+ (mapSetConfig == null ? "" : mapSetConfig.getName()+ ":") + getPartitionId();
    Tr.info(tc, NLSConstants.DYNAMIC_MAP_CREATED_CWOBJ4700, new Object[] { mapName,
            bmc.getName(), shardID });
} else if(mapName.startsWith(Constants.GLOBAL_INDEX_BACKINGMAP_NAME.substring(0, Constants.GLOBAL_INDEX_BACKINGMAP_NAME.length()-3))) {
	// global index is internal map, but we would like to inform users it is created.
    String shardID = name +":"+ (mapSetConfig == null ? "" : mapSetConfig.getName()+ ":") + getPartitionId();
	Tr.info(tc, NLSConstants.DYNAMIC_MAP_CREATED_CWOBJ4700, new Object[] { mapName,
                    bmc.getName(), shardID });