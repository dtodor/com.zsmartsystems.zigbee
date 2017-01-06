package com.zsmartsystems.zigbee.zcl.clusters.rssilocation;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;
import com.zsmartsystems.zigbee.zcl.protocol.ZclClusterType;

import java.util.Map;
import java.util.HashMap;

/**
 * <p>
 * Location Data Notification Command value object class.
 * </p>
 * <p>
 * Cluster: <b>RSSI Location</b>. Command is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the RSSI Location cluster.
 * </p>
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 * </p>
 */
public class LocationDataNotificationCommand extends ZclCommand {
    /**
     * Location Type command message field.
     */
    private Integer locationType;

    /**
     * Coordinate 1 command message field.
     */
    private Integer coordinate1;

    /**
     * Coordinate 2 command message field.
     */
    private Integer coordinate2;

    /**
     * Coordinate 3 command message field.
     */
    private Integer coordinate3;

    /**
     * Power command message field.
     */
    private Integer power;

    /**
     * Path Loss Exponent command message field.
     */
    private Integer pathLossExponent;

    /**
     * Location Method command message field.
     */
    private Integer locationMethod;

    /**
     * Quality Measure command message field.
     */
    private Integer qualityMeasure;

    /**
     * Location Age command message field.
     */
    private Integer locationAge;

    /**
     * Default constructor setting the command type field.
     */
    public LocationDataNotificationCommand() {
        genericCommand = false;
        clusterId = 11;
        commandId = 2;
        commandDirection = false;
    }

    /**
     * Constructor copying field values from command message.
     *
     * @param fields a {@link Map} containing the value {@link Object}s
     */
    public LocationDataNotificationCommand(final Map<Integer, Object> fields) {
        this();
        locationType = (Integer) fields.get(0);
        coordinate1 = (Integer) fields.get(1);
        coordinate2 = (Integer) fields.get(2);
        coordinate3 = (Integer) fields.get(3);
        power = (Integer) fields.get(4);
        pathLossExponent = (Integer) fields.get(5);
        locationMethod = (Integer) fields.get(6);
        qualityMeasure = (Integer) fields.get(7);
        locationAge = (Integer) fields.get(8);
    }

    /**
     * Gets Location Type.
     * @return the Location Type
     */
    public Integer getLocationType() {
        return locationType;
    }

    /**
     * Sets Location Type.
     * @param locationType the Location Type
     */
    public void setLocationType(final Integer locationType) {
        this.locationType = locationType;
    }

    /**
     * Gets Coordinate 1.
     * @return the Coordinate 1
     */
    public Integer getCoordinate1() {
        return coordinate1;
    }

    /**
     * Sets Coordinate 1.
     * @param coordinate1 the Coordinate 1
     */
    public void setCoordinate1(final Integer coordinate1) {
        this.coordinate1 = coordinate1;
    }

    /**
     * Gets Coordinate 2.
     * @return the Coordinate 2
     */
    public Integer getCoordinate2() {
        return coordinate2;
    }

    /**
     * Sets Coordinate 2.
     * @param coordinate2 the Coordinate 2
     */
    public void setCoordinate2(final Integer coordinate2) {
        this.coordinate2 = coordinate2;
    }

    /**
     * Gets Coordinate 3.
     * @return the Coordinate 3
     */
    public Integer getCoordinate3() {
        return coordinate3;
    }

    /**
     * Sets Coordinate 3.
     * @param coordinate3 the Coordinate 3
     */
    public void setCoordinate3(final Integer coordinate3) {
        this.coordinate3 = coordinate3;
    }

    /**
     * Gets Power.
     * @return the Power
     */
    public Integer getPower() {
        return power;
    }

    /**
     * Sets Power.
     * @param power the Power
     */
    public void setPower(final Integer power) {
        this.power = power;
    }

    /**
     * Gets Path Loss Exponent.
     * @return the Path Loss Exponent
     */
    public Integer getPathLossExponent() {
        return pathLossExponent;
    }

    /**
     * Sets Path Loss Exponent.
     * @param pathLossExponent the Path Loss Exponent
     */
    public void setPathLossExponent(final Integer pathLossExponent) {
        this.pathLossExponent = pathLossExponent;
    }

    /**
     * Gets Location Method.
     * @return the Location Method
     */
    public Integer getLocationMethod() {
        return locationMethod;
    }

    /**
     * Sets Location Method.
     * @param locationMethod the Location Method
     */
    public void setLocationMethod(final Integer locationMethod) {
        this.locationMethod = locationMethod;
    }

    /**
     * Gets Quality Measure.
     * @return the Quality Measure
     */
    public Integer getQualityMeasure() {
        return qualityMeasure;
    }

    /**
     * Sets Quality Measure.
     * @param qualityMeasure the Quality Measure
     */
    public void setQualityMeasure(final Integer qualityMeasure) {
        this.qualityMeasure = qualityMeasure;
    }

    /**
     * Gets Location Age.
     * @return the Location Age
     */
    public Integer getLocationAge() {
        return locationAge;
    }

    /**
     * Sets Location Age.
     * @param locationAge the Location Age
     */
    public void setLocationAge(final Integer locationAge) {
        this.locationAge = locationAge;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(locationType, ZclDataType.DATA_8_BIT);
        serializer.serialize(coordinate1, ZclDataType.SIGNED_16_BIT_INTEGER);
        serializer.serialize(coordinate2, ZclDataType.SIGNED_16_BIT_INTEGER);
        serializer.serialize(coordinate3, ZclDataType.SIGNED_16_BIT_INTEGER);
        serializer.serialize(power, ZclDataType.SIGNED_16_BIT_INTEGER);
        serializer.serialize(pathLossExponent, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(locationMethod, ZclDataType.ENUMERATION_8_BIT);
        serializer.serialize(qualityMeasure, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(locationAge, ZclDataType.UNSIGNED_16_BIT_INTEGER);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        locationType = (Integer) deserializer.deserialize(ZclDataType.DATA_8_BIT);
        coordinate1 = (Integer) deserializer.deserialize(ZclDataType.SIGNED_16_BIT_INTEGER);
        coordinate2 = (Integer) deserializer.deserialize(ZclDataType.SIGNED_16_BIT_INTEGER);
        coordinate3 = (Integer) deserializer.deserialize(ZclDataType.SIGNED_16_BIT_INTEGER);
        power = (Integer) deserializer.deserialize(ZclDataType.SIGNED_16_BIT_INTEGER);
        pathLossExponent = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        locationMethod = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_8_BIT);
        qualityMeasure = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        locationAge = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(", ");
        builder.append("locationType = ");
        builder.append(locationType);
        builder.append(", ");
        builder.append("coordinate1 = ");
        builder.append(coordinate1);
        builder.append(", ");
        builder.append("coordinate2 = ");
        builder.append(coordinate2);
        builder.append(", ");
        builder.append("coordinate3 = ");
        builder.append(coordinate3);
        builder.append(", ");
        builder.append("power = ");
        builder.append(power);
        builder.append(", ");
        builder.append("pathLossExponent = ");
        builder.append(pathLossExponent);
        builder.append(", ");
        builder.append("locationMethod = ");
        builder.append(locationMethod);
        builder.append(", ");
        builder.append("qualityMeasure = ");
        builder.append(qualityMeasure);
        builder.append(", ");
        builder.append("locationAge = ");
        builder.append(locationAge);
        return builder.toString();
    }

}
