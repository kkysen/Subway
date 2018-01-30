// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gtfs-realtime.proto

package sen.khyber.web.subway.client.proto;

public interface VehicleDescriptorOrBuilder extends
        // @@protoc_insertion_point(interface_extends:transit_realtime.VehicleDescriptor)
        com.google.protobuf.GeneratedMessageV3.
                ExtendableMessageOrBuilder<VehicleDescriptor> {
    
    /**
     * <pre>
     * Internal system identification of the vehicle. Should be unique per
     * vehicle, and can be used for tracking the vehicle as it proceeds through
     * the system.
     * </pre>
     * <p>
     * <code>optional string id = 1;</code>
     */
    boolean hasId();
    
    /**
     * <pre>
     * Internal system identification of the vehicle. Should be unique per
     * vehicle, and can be used for tracking the vehicle as it proceeds through
     * the system.
     * </pre>
     * <p>
     * <code>optional string id = 1;</code>
     */
    java.lang.String getId();
    
    /**
     * <pre>
     * Internal system identification of the vehicle. Should be unique per
     * vehicle, and can be used for tracking the vehicle as it proceeds through
     * the system.
     * </pre>
     * <p>
     * <code>optional string id = 1;</code>
     */
    com.google.protobuf.ByteString
    getIdBytes();
    
    /**
     * <pre>
     * User visible label, i.e., something that must be shown to the passenger to
     * help identify the correct vehicle.
     * </pre>
     * <p>
     * <code>optional string label = 2;</code>
     */
    boolean hasLabel();
    
    /**
     * <pre>
     * User visible label, i.e., something that must be shown to the passenger to
     * help identify the correct vehicle.
     * </pre>
     * <p>
     * <code>optional string label = 2;</code>
     */
    java.lang.String getLabel();
    
    /**
     * <pre>
     * User visible label, i.e., something that must be shown to the passenger to
     * help identify the correct vehicle.
     * </pre>
     * <p>
     * <code>optional string label = 2;</code>
     */
    com.google.protobuf.ByteString
    getLabelBytes();
    
    /**
     * <pre>
     * The license plate of the vehicle.
     * </pre>
     * <p>
     * <code>optional string license_plate = 3;</code>
     */
    boolean hasLicensePlate();
    
    /**
     * <pre>
     * The license plate of the vehicle.
     * </pre>
     * <p>
     * <code>optional string license_plate = 3;</code>
     */
    java.lang.String getLicensePlate();
    
    /**
     * <pre>
     * The license plate of the vehicle.
     * </pre>
     * <p>
     * <code>optional string license_plate = 3;</code>
     */
    com.google.protobuf.ByteString
    getLicensePlateBytes();
}