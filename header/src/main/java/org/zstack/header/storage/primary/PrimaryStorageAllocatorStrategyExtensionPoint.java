package org.zstack.header.storage.primary;

/**
 * Created by frank on 7/1/2015.
 */
public interface PrimaryStorageAllocatorStrategyExtensionPoint {

    /**
     * Implementation methods must follow the rules:
     *      If the strategy can not be determined, request to return null
     */
    String getPrimaryStorageAllocatorStrategyName(AllocatePrimaryStorageMsg msg);


    /**
     * Implementation methods must follow the rules:
     *      Can not return null
     */
    String getAllocatorStrategy();
}
