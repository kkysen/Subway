// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gtfs-realtime.proto

package sen.khyber.web.subway.client.proto;

/**
 * <pre>
 * A position.
 * </pre>
 * <p>
 * Protobuf type {@code transit_realtime.Position}
 */
public final class Position extends
        com.google.protobuf.GeneratedMessageV3.ExtendableMessage<
                Position> implements
        // @@protoc_insertion_point(message_implements:transit_realtime.Position)
        PositionOrBuilder {
    
    private static final long serialVersionUID = 0L;
    
    // Use Position.newBuilder() to construct.
    private Position(
            final com.google.protobuf.GeneratedMessageV3.ExtendableBuilder<Position, ?> builder) {
        super(builder);
    }
    
    private Position() {
        latitude_ = 0F;
        longitude_ = 0F;
        bearing_ = 0F;
        odometer_ = 0D;
        speed_ = 0F;
    }
    
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return unknownFields;
    }
    
    private Position(
            final com.google.protobuf.CodedInputStream input,
            final com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        final int mutable_bitField0_ = 0;
        final com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            while (!done) {
                final int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    default: {
                        if (!parseUnknownField(
                                input, unknownFields, extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                    }
                    case 13: {
                        bitField0_ |= 0x00000001;
                        latitude_ = input.readFloat();
                        break;
                    }
                    case 21: {
                        bitField0_ |= 0x00000002;
                        longitude_ = input.readFloat();
                        break;
                    }
                    case 29: {
                        bitField0_ |= 0x00000004;
                        bearing_ = input.readFloat();
                        break;
                    }
                    case 33: {
                        bitField0_ |= 0x00000008;
                        odometer_ = input.readDouble();
                        break;
                    }
                    case 45: {
                        bitField0_ |= 0x00000010;
                        speed_ = input.readFloat();
                        break;
                    }
                }
            }
        } catch (final com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (final java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(
                    e).setUnfinishedMessage(this);
        } finally {
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return GtfsRealtime.internal_static_transit_realtime_Position_descriptor;
    }
    
    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return GtfsRealtime.internal_static_transit_realtime_Position_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        Position.class, Position.Builder.class);
    }
    
    private int bitField0_;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    private float latitude_;
    
    /**
     * <pre>
     * Degrees North, in the WGS-84 coordinate system.
     * </pre>
     * <p>
     * <code>required float latitude = 1;</code>
     */
    @Override
    public boolean hasLatitude() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    
    /**
     * <pre>
     * Degrees North, in the WGS-84 coordinate system.
     * </pre>
     * <p>
     * <code>required float latitude = 1;</code>
     */
    @Override
    public float getLatitude() {
        return latitude_;
    }
    
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private float longitude_;
    
    /**
     * <pre>
     * Degrees East, in the WGS-84 coordinate system.
     * </pre>
     * <p>
     * <code>required float longitude = 2;</code>
     */
    @Override
    public boolean hasLongitude() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    
    /**
     * <pre>
     * Degrees East, in the WGS-84 coordinate system.
     * </pre>
     * <p>
     * <code>required float longitude = 2;</code>
     */
    @Override
    public float getLongitude() {
        return longitude_;
    }
    
    public static final int BEARING_FIELD_NUMBER = 3;
    private float bearing_;
    
    /**
     * <pre>
     * Bearing, in degrees, clockwise from North, i.e., 0 is North and 90 is East.
     * This can be the compass bearing, or the direction towards the next stop
     * or intermediate location.
     * This should not be direction deduced from the sequence of previous
     * positions, which can be computed from previous data.
     * </pre>
     * <p>
     * <code>optional float bearing = 3;</code>
     */
    @Override
    public boolean hasBearing() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    
    /**
     * <pre>
     * Bearing, in degrees, clockwise from North, i.e., 0 is North and 90 is East.
     * This can be the compass bearing, or the direction towards the next stop
     * or intermediate location.
     * This should not be direction deduced from the sequence of previous
     * positions, which can be computed from previous data.
     * </pre>
     * <p>
     * <code>optional float bearing = 3;</code>
     */
    @Override
    public float getBearing() {
        return bearing_;
    }
    
    public static final int ODOMETER_FIELD_NUMBER = 4;
    private double odometer_;
    
    /**
     * <pre>
     * Odometer value, in meters.
     * </pre>
     * <p>
     * <code>optional double odometer = 4;</code>
     */
    @Override
    public boolean hasOdometer() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    
    /**
     * <pre>
     * Odometer value, in meters.
     * </pre>
     * <p>
     * <code>optional double odometer = 4;</code>
     */
    @Override
    public double getOdometer() {
        return odometer_;
    }
    
    public static final int SPEED_FIELD_NUMBER = 5;
    private float speed_;
    
    /**
     * <pre>
     * Momentary speed measured by the vehicle, in meters per second.
     * </pre>
     * <p>
     * <code>optional float speed = 5;</code>
     */
    @Override
    public boolean hasSpeed() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    
    /**
     * <pre>
     * Momentary speed measured by the vehicle, in meters per second.
     * </pre>
     * <p>
     * <code>optional float speed = 5;</code>
     */
    @Override
    public float getSpeed() {
        return speed_;
    }
    
    private byte memoizedIsInitialized = -1;
    
    @Override
    public final boolean isInitialized() {
        final byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) {return true;}
        if (isInitialized == 0) {return false;}
        
        if (!hasLatitude()) {
            memoizedIsInitialized = 0;
            return false;
        }
        if (!hasLongitude()) {
            memoizedIsInitialized = 0;
            return false;
        }
        if (!extensionsAreInitialized()) {
            memoizedIsInitialized = 0;
            return false;
        }
        memoizedIsInitialized = 1;
        return true;
    }
    
    @Override
    public void writeTo(final com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        final com.google.protobuf.GeneratedMessageV3
                .ExtendableMessage<Position>.ExtensionWriter
                extensionWriter = newExtensionWriter();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
            output.writeFloat(1, latitude_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            output.writeFloat(2, longitude_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            output.writeFloat(3, bearing_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
            output.writeDouble(4, odometer_);
        }
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
            output.writeFloat(5, speed_);
        }
        extensionWriter.writeUntil(2000, output);
        unknownFields.writeTo(output);
    }
    
    @Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) {return size;}
        
        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeFloatSize(1, latitude_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeFloatSize(2, longitude_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeFloatSize(3, bearing_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeDoubleSize(4, odometer_);
        }
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeFloatSize(5, speed_);
        }
        size += extensionsSerializedSize();
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
    }
    
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return super.equals(obj);
        }
        final Position other = (Position) obj;
        
        boolean result = true;
        result = result && (hasLatitude() == other.hasLatitude());
        if (hasLatitude()) {
            result = result && (
                    java.lang.Float.floatToIntBits(getLatitude())
                            == java.lang.Float.floatToIntBits(
                            other.getLatitude()));
        }
        result = result && (hasLongitude() == other.hasLongitude());
        if (hasLongitude()) {
            result = result && (
                    java.lang.Float.floatToIntBits(getLongitude())
                            == java.lang.Float.floatToIntBits(
                            other.getLongitude()));
        }
        result = result && (hasBearing() == other.hasBearing());
        if (hasBearing()) {
            result = result && (
                    java.lang.Float.floatToIntBits(getBearing())
                            == java.lang.Float.floatToIntBits(
                            other.getBearing()));
        }
        result = result && (hasOdometer() == other.hasOdometer());
        if (hasOdometer()) {
            result = result && (
                    java.lang.Double.doubleToLongBits(getOdometer())
                            == java.lang.Double.doubleToLongBits(
                            other.getOdometer()));
        }
        result = result && (hasSpeed() == other.hasSpeed());
        if (hasSpeed()) {
            result = result && (
                    java.lang.Float.floatToIntBits(getSpeed())
                            == java.lang.Float.floatToIntBits(
                            other.getSpeed()));
        }
        result = result && unknownFields.equals(other.unknownFields);
        result = result &&
                getExtensionFields().equals(other.getExtensionFields());
        return result;
    }
    
    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasLatitude()) {
            hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
            hash = (53 * hash) + java.lang.Float.floatToIntBits(
                    getLatitude());
        }
        if (hasLongitude()) {
            hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
            hash = (53 * hash) + java.lang.Float.floatToIntBits(
                    getLongitude());
        }
        if (hasBearing()) {
            hash = (37 * hash) + BEARING_FIELD_NUMBER;
            hash = (53 * hash) + java.lang.Float.floatToIntBits(
                    getBearing());
        }
        if (hasOdometer()) {
            hash = (37 * hash) + ODOMETER_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getOdometer()));
        }
        if (hasSpeed()) {
            hash = (37 * hash) + SPEED_FIELD_NUMBER;
            hash = (53 * hash) + java.lang.Float.floatToIntBits(
                    getSpeed());
        }
        hash = hashFields(hash, getExtensionFields());
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }
    
    public static Position parseFrom(
            final java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    
    public static Position parseFrom(
            final java.nio.ByteBuffer data,
            final com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    
    public static Position parseFrom(
            final com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    
    public static Position parseFrom(
            final com.google.protobuf.ByteString data,
            final com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    
    public static Position parseFrom(final byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    
    public static Position parseFrom(
            final byte[] data,
            final com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    
    public static Position parseFrom(final java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }
    
    public static Position parseFrom(
            final java.io.InputStream input,
            final com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }
    
    public static Position parseDelimitedFrom(final java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }
    
    public static Position parseDelimitedFrom(
            final java.io.InputStream input,
            final com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    
    public static Position parseFrom(
            final com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }
    
    public static Position parseFrom(
            final com.google.protobuf.CodedInputStream input,
            final com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }
    
    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    
    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }
    
    public static Builder newBuilder(final Position prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    
    @Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
                ? new Builder() : new Builder().mergeFrom(this);
    }
    
    @java.lang.Override
    protected Builder newBuilderForType(
            final com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        final Builder builder = new Builder(parent);
        return builder;
    }
    
    /**
     * <pre>
     * A position.
     * </pre>
     * <p>
     * Protobuf type {@code transit_realtime.Position}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.ExtendableBuilder<
                    Position, Builder> implements
            // @@protoc_insertion_point(builder_implements:transit_realtime.Position)
            PositionOrBuilder {
        
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return GtfsRealtime.internal_static_transit_realtime_Position_descriptor;
        }
        
        @Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return GtfsRealtime.internal_static_transit_realtime_Position_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Position.class, Position.Builder.class);
        }
        
        // Construct using sen.khyber.subway.client.proto.Position.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }
        
        private Builder(
                final com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }
        
        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                    .alwaysUseFieldBuilders) {
            }
        }
        
        @Override
        public Builder clear() {
            super.clear();
            latitude_ = 0F;
            bitField0_ = (bitField0_ & ~0x00000001);
            longitude_ = 0F;
            bitField0_ = (bitField0_ & ~0x00000002);
            bearing_ = 0F;
            bitField0_ = (bitField0_ & ~0x00000004);
            odometer_ = 0D;
            bitField0_ = (bitField0_ & ~0x00000008);
            speed_ = 0F;
            bitField0_ = (bitField0_ & ~0x00000010);
            return this;
        }
        
        @Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return GtfsRealtime.internal_static_transit_realtime_Position_descriptor;
        }
        
        @Override
        public Position getDefaultInstanceForType() {
            return Position.getDefaultInstance();
        }
        
        @Override
        public Position build() {
            final Position result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }
        
        @Override
        public Position buildPartial() {
            final Position result = new Position(this);
            final int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                to_bitField0_ |= 0x00000001;
            }
            result.latitude_ = latitude_;
            if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                to_bitField0_ |= 0x00000002;
            }
            result.longitude_ = longitude_;
            if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                to_bitField0_ |= 0x00000004;
            }
            result.bearing_ = bearing_;
            if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                to_bitField0_ |= 0x00000008;
            }
            result.odometer_ = odometer_;
            if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                to_bitField0_ |= 0x00000010;
            }
            result.speed_ = speed_;
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }
        
        @Override
        public Builder clone() {
            return (Builder) super.clone();
        }
        
        @Override
        public Builder setField(
                final com.google.protobuf.Descriptors.FieldDescriptor field,
                final java.lang.Object value) {
            return (Builder) super.setField(field, value);
        }
        
        @Override
        public Builder clearField(
                final com.google.protobuf.Descriptors.FieldDescriptor field) {
            return (Builder) super.clearField(field);
        }
        
        @Override
        public Builder clearOneof(
                final com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return (Builder) super.clearOneof(oneof);
        }
        
        @Override
        public Builder setRepeatedField(
                final com.google.protobuf.Descriptors.FieldDescriptor field,
                final int index, final java.lang.Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }
        
        @Override
        public Builder addRepeatedField(
                final com.google.protobuf.Descriptors.FieldDescriptor field,
                final java.lang.Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }
        
        @Override
        public <Type> Builder setExtension(
                final com.google.protobuf.GeneratedMessage.GeneratedExtension<
                        Position, Type> extension,
                final Type value) {
            return (Builder) super.setExtension(extension, value);
        }
        
        @Override
        public <Type> Builder setExtension(
                final com.google.protobuf.GeneratedMessage.GeneratedExtension<
                        Position, java.util.List<Type>> extension,
                final int index, final Type value) {
            return (Builder) super.setExtension(extension, index, value);
        }
        
        @Override
        public <Type> Builder addExtension(
                final com.google.protobuf.GeneratedMessage.GeneratedExtension<
                        Position, java.util.List<Type>> extension,
                final Type value) {
            return (Builder) super.addExtension(extension, value);
        }
        
        @Override
        public <Type> Builder clearExtension(
                final com.google.protobuf.GeneratedMessage.GeneratedExtension<
                        Position, ?> extension) {
            return (Builder) super.clearExtension(extension);
        }
        
        @Override
        public Builder mergeFrom(final com.google.protobuf.Message other) {
            if (other instanceof Position) {
                return mergeFrom((Position) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }
        
        public Builder mergeFrom(final Position other) {
            if (other == Position.getDefaultInstance()) {return this;}
            if (other.hasLatitude()) {
                setLatitude(other.getLatitude());
            }
            if (other.hasLongitude()) {
                setLongitude(other.getLongitude());
            }
            if (other.hasBearing()) {
                setBearing(other.getBearing());
            }
            if (other.hasOdometer()) {
                setOdometer(other.getOdometer());
            }
            if (other.hasSpeed()) {
                setSpeed(other.getSpeed());
            }
            mergeExtensionFields(other);
            mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }
        
        @Override
        public final boolean isInitialized() {
            if (!hasLatitude()) {
                return false;
            }
            if (!hasLongitude()) {
                return false;
            }
            if (!extensionsAreInitialized()) {
                return false;
            }
            return true;
        }
        
        @Override
        public Builder mergeFrom(
                final com.google.protobuf.CodedInputStream input,
                final com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Position parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (final com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (Position) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }
        
        private int bitField0_;
        
        private float latitude_;
        
        /**
         * <pre>
         * Degrees North, in the WGS-84 coordinate system.
         * </pre>
         * <p>
         * <code>required float latitude = 1;</code>
         */
        @Override
        public boolean hasLatitude() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        
        /**
         * <pre>
         * Degrees North, in the WGS-84 coordinate system.
         * </pre>
         * <p>
         * <code>required float latitude = 1;</code>
         */
        @Override
        public float getLatitude() {
            return latitude_;
        }
        
        /**
         * <pre>
         * Degrees North, in the WGS-84 coordinate system.
         * </pre>
         * <p>
         * <code>required float latitude = 1;</code>
         */
        public Builder setLatitude(final float value) {
            bitField0_ |= 0x00000001;
            latitude_ = value;
            onChanged();
            return this;
        }
        
        /**
         * <pre>
         * Degrees North, in the WGS-84 coordinate system.
         * </pre>
         * <p>
         * <code>required float latitude = 1;</code>
         */
        public Builder clearLatitude() {
            bitField0_ = (bitField0_ & ~0x00000001);
            latitude_ = 0F;
            onChanged();
            return this;
        }
        
        private float longitude_;
        
        /**
         * <pre>
         * Degrees East, in the WGS-84 coordinate system.
         * </pre>
         * <p>
         * <code>required float longitude = 2;</code>
         */
        @Override
        public boolean hasLongitude() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        
        /**
         * <pre>
         * Degrees East, in the WGS-84 coordinate system.
         * </pre>
         * <p>
         * <code>required float longitude = 2;</code>
         */
        @Override
        public float getLongitude() {
            return longitude_;
        }
        
        /**
         * <pre>
         * Degrees East, in the WGS-84 coordinate system.
         * </pre>
         * <p>
         * <code>required float longitude = 2;</code>
         */
        public Builder setLongitude(final float value) {
            bitField0_ |= 0x00000002;
            longitude_ = value;
            onChanged();
            return this;
        }
        
        /**
         * <pre>
         * Degrees East, in the WGS-84 coordinate system.
         * </pre>
         * <p>
         * <code>required float longitude = 2;</code>
         */
        public Builder clearLongitude() {
            bitField0_ = (bitField0_ & ~0x00000002);
            longitude_ = 0F;
            onChanged();
            return this;
        }
        
        private float bearing_;
        
        /**
         * <pre>
         * Bearing, in degrees, clockwise from North, i.e., 0 is North and 90 is East.
         * This can be the compass bearing, or the direction towards the next stop
         * or intermediate location.
         * This should not be direction deduced from the sequence of previous
         * positions, which can be computed from previous data.
         * </pre>
         * <p>
         * <code>optional float bearing = 3;</code>
         */
        @Override
        public boolean hasBearing() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        
        /**
         * <pre>
         * Bearing, in degrees, clockwise from North, i.e., 0 is North and 90 is East.
         * This can be the compass bearing, or the direction towards the next stop
         * or intermediate location.
         * This should not be direction deduced from the sequence of previous
         * positions, which can be computed from previous data.
         * </pre>
         * <p>
         * <code>optional float bearing = 3;</code>
         */
        @Override
        public float getBearing() {
            return bearing_;
        }
        
        /**
         * <pre>
         * Bearing, in degrees, clockwise from North, i.e., 0 is North and 90 is East.
         * This can be the compass bearing, or the direction towards the next stop
         * or intermediate location.
         * This should not be direction deduced from the sequence of previous
         * positions, which can be computed from previous data.
         * </pre>
         * <p>
         * <code>optional float bearing = 3;</code>
         */
        public Builder setBearing(final float value) {
            bitField0_ |= 0x00000004;
            bearing_ = value;
            onChanged();
            return this;
        }
        
        /**
         * <pre>
         * Bearing, in degrees, clockwise from North, i.e., 0 is North and 90 is East.
         * This can be the compass bearing, or the direction towards the next stop
         * or intermediate location.
         * This should not be direction deduced from the sequence of previous
         * positions, which can be computed from previous data.
         * </pre>
         * <p>
         * <code>optional float bearing = 3;</code>
         */
        public Builder clearBearing() {
            bitField0_ = (bitField0_ & ~0x00000004);
            bearing_ = 0F;
            onChanged();
            return this;
        }
        
        private double odometer_;
        
        /**
         * <pre>
         * Odometer value, in meters.
         * </pre>
         * <p>
         * <code>optional double odometer = 4;</code>
         */
        @Override
        public boolean hasOdometer() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        
        /**
         * <pre>
         * Odometer value, in meters.
         * </pre>
         * <p>
         * <code>optional double odometer = 4;</code>
         */
        @Override
        public double getOdometer() {
            return odometer_;
        }
        
        /**
         * <pre>
         * Odometer value, in meters.
         * </pre>
         * <p>
         * <code>optional double odometer = 4;</code>
         */
        public Builder setOdometer(final double value) {
            bitField0_ |= 0x00000008;
            odometer_ = value;
            onChanged();
            return this;
        }
        
        /**
         * <pre>
         * Odometer value, in meters.
         * </pre>
         * <p>
         * <code>optional double odometer = 4;</code>
         */
        public Builder clearOdometer() {
            bitField0_ = (bitField0_ & ~0x00000008);
            odometer_ = 0D;
            onChanged();
            return this;
        }
        
        private float speed_;
        
        /**
         * <pre>
         * Momentary speed measured by the vehicle, in meters per second.
         * </pre>
         * <p>
         * <code>optional float speed = 5;</code>
         */
        @Override
        public boolean hasSpeed() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        
        /**
         * <pre>
         * Momentary speed measured by the vehicle, in meters per second.
         * </pre>
         * <p>
         * <code>optional float speed = 5;</code>
         */
        @Override
        public float getSpeed() {
            return speed_;
        }
        
        /**
         * <pre>
         * Momentary speed measured by the vehicle, in meters per second.
         * </pre>
         * <p>
         * <code>optional float speed = 5;</code>
         */
        public Builder setSpeed(final float value) {
            bitField0_ |= 0x00000010;
            speed_ = value;
            onChanged();
            return this;
        }
        
        /**
         * <pre>
         * Momentary speed measured by the vehicle, in meters per second.
         * </pre>
         * <p>
         * <code>optional float speed = 5;</code>
         */
        public Builder clearSpeed() {
            bitField0_ = (bitField0_ & ~0x00000010);
            speed_ = 0F;
            onChanged();
            return this;
        }
        
        @Override
        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }
        
        @Override
        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }
        
        
        // @@protoc_insertion_point(builder_scope:transit_realtime.Position)
    }
    
    // @@protoc_insertion_point(class_scope:transit_realtime.Position)
    private static final Position DEFAULT_INSTANCE;
    
    static {
        DEFAULT_INSTANCE = new Position();
    }
    
    public static Position getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }
    
    @java.lang.Deprecated public static final com.google.protobuf.Parser<Position>
            PARSER = new com.google.protobuf.AbstractParser<>() {
        
        @Override
        public Position parsePartialFrom(
                final com.google.protobuf.CodedInputStream input,
                final com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new Position(input, extensionRegistry);
        }
    };
    
    public static com.google.protobuf.Parser<Position> parser() {
        return PARSER;
    }
    
    @java.lang.Override
    public com.google.protobuf.Parser<Position> getParserForType() {
        return PARSER;
    }
    
    @Override
    public Position getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
    
}
