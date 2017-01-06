package com.zsmartsystems.zigbee.zcl.clusters.iaszone;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;
import com.zsmartsystems.zigbee.zcl.protocol.ZclClusterType;

import java.util.Map;
import java.util.HashMap;

/**
 * <p>
 * Zone Status Change Notification Command value object class.
 * </p>
 * <p>
 * Cluster: <b>IAS Zone</b>. Command is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the IAS Zone cluster.
 * </p>
 * <p>
 * The IAS Zone cluster defines an interface to the functionality of an IAS security
 * zone device. IAS Zone supports up to two alarm types per zone, low battery
 * reports and supervision of the IAS network.
 * </p>
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 * </p>
 */
public class ZoneStatusChangeNotificationCommand extends ZclCommand {
    /**
     * Zone Status command message field.
     */
    private Integer zoneStatus;

    /**
     * Extended Status command message field.
     */
    private Integer extendedStatus;

    /**
     * Default constructor setting the command type field.
     */
    public ZoneStatusChangeNotificationCommand() {
        genericCommand = false;
        clusterId = 1280;
        commandId = 0;
        commandDirection = false;
    }

    /**
     * Constructor copying field values from command message.
     *
     * @param fields a {@link Map} containing the value {@link Object}s
     */
    public ZoneStatusChangeNotificationCommand(final Map<Integer, Object> fields) {
        this();
        zoneStatus = (Integer) fields.get(0);
        extendedStatus = (Integer) fields.get(1);
    }

    /**
     * Gets Zone Status.
     * @return the Zone Status
     */
    public Integer getZoneStatus() {
        return zoneStatus;
    }

    /**
     * Sets Zone Status.
     * @param zoneStatus the Zone Status
     */
    public void setZoneStatus(final Integer zoneStatus) {
        this.zoneStatus = zoneStatus;
    }

    /**
     * Gets Extended Status.
     * @return the Extended Status
     */
    public Integer getExtendedStatus() {
        return extendedStatus;
    }

    /**
     * Sets Extended Status.
     * @param extendedStatus the Extended Status
     */
    public void setExtendedStatus(final Integer extendedStatus) {
        this.extendedStatus = extendedStatus;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(zoneStatus, ZclDataType.ENUMERATION_16_BIT);
        serializer.serialize(extendedStatus, ZclDataType.ENUMERATION_8_BIT);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        zoneStatus = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_16_BIT);
        extendedStatus = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_8_BIT);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(", ");
        builder.append("zoneStatus = ");
        builder.append(zoneStatus);
        builder.append(", ");
        builder.append("extendedStatus = ");
        builder.append(extendedStatus);
        return builder.toString();
    }

}
