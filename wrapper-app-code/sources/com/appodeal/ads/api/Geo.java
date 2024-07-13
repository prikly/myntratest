package com.appodeal.ads.api;

import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolMessageEnum;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;

public final class Geo extends GeneratedMessageV3 implements GeoOrBuilder {
    private static final Geo DEFAULT_INSTANCE = new Geo();
    /* access modifiers changed from: private */
    public static final Parser<Geo> PARSER = new AbstractParser<Geo>() {
        public Geo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Geo(codedInputStream, extensionRegistryLite);
        }
    };
    /* access modifiers changed from: private */
    public float lat_;
    /* access modifiers changed from: private */
    public long localTime_;
    /* access modifiers changed from: private */
    public float lon_;
    /* access modifiers changed from: private */
    public int lt_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public int utcoffset_;

    private Geo(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private Geo() {
        this.memoizedIsInitialized = -1;
        this.lt_ = 0;
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Geo();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Geo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.utcoffset_ = codedInputStream.readInt32();
                        } else if (readTag == 16) {
                            this.localTime_ = codedInputStream.readInt64();
                        } else if (readTag == 24) {
                            this.lt_ = codedInputStream.readEnum();
                        } else if (readTag == 37) {
                            this.lat_ = codedInputStream.readFloat();
                        } else if (readTag == 45) {
                            this.lon_ = codedInputStream.readFloat();
                        } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw null;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Api.internal_static_com_appodeal_ads_Geo_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Api.internal_static_com_appodeal_ads_Geo_fieldAccessorTable.ensureFieldAccessorsInitialized(Geo.class, Builder.class);
    }

    public enum LocationType implements ProtocolMessageEnum {
        LOCATIONTYPE_UNKNOWN(0),
        GPS(1),
        IP(2),
        USERPROVIDED(3),
        UNRECOGNIZED(-1);
        
        private static final LocationType[] VALUES = null;
        private static final Internal.EnumLiteMap<LocationType> internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new Internal.EnumLiteMap<LocationType>() {
                public LocationType findValueByNumber(int i) {
                    return LocationType.forNumber(i);
                }
            };
            VALUES = values();
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static LocationType forNumber(int i) {
            if (i == 0) {
                return LOCATIONTYPE_UNKNOWN;
            }
            if (i == 1) {
                return GPS;
            }
            if (i == 2) {
                return IP;
            }
            if (i != 3) {
                return null;
            }
            return USERPROVIDED;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Geo.getDescriptor().getEnumTypes().get(0);
        }

        private LocationType(int i) {
            this.value = i;
        }
    }

    public int getUtcoffset() {
        return this.utcoffset_;
    }

    public long getLocalTime() {
        return this.localTime_;
    }

    public int getLtValue() {
        return this.lt_;
    }

    public float getLat() {
        return this.lat_;
    }

    public float getLon() {
        return this.lon_;
    }

    public final boolean isInitialized() {
        byte b2 = this.memoizedIsInitialized;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.utcoffset_;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        long j = this.localTime_;
        if (j != 0) {
            codedOutputStream.writeInt64(2, j);
        }
        if (this.lt_ != LocationType.LOCATIONTYPE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(3, this.lt_);
        }
        float f2 = this.lat_;
        if (f2 != 0.0f) {
            codedOutputStream.writeFloat(4, f2);
        }
        float f3 = this.lon_;
        if (f3 != 0.0f) {
            codedOutputStream.writeFloat(5, f3);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.utcoffset_;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
        }
        long j = this.localTime_;
        if (j != 0) {
            i2 += CodedOutputStream.computeInt64Size(2, j);
        }
        if (this.lt_ != LocationType.LOCATIONTYPE_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(3, this.lt_);
        }
        float f2 = this.lat_;
        if (f2 != 0.0f) {
            i2 += CodedOutputStream.computeFloatSize(4, f2);
        }
        float f3 = this.lon_;
        if (f3 != 0.0f) {
            i2 += CodedOutputStream.computeFloatSize(5, f3);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Geo)) {
            return super.equals(obj);
        }
        Geo geo = (Geo) obj;
        if (getUtcoffset() == geo.getUtcoffset() && getLocalTime() == geo.getLocalTime() && this.lt_ == geo.lt_ && Float.floatToIntBits(getLat()) == Float.floatToIntBits(geo.getLat()) && Float.floatToIntBits(getLon()) == Float.floatToIntBits(geo.getLon()) && this.unknownFields.equals(geo.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUtcoffset()) * 37) + 2) * 53) + Internal.hashLong(getLocalTime())) * 37) + 3) * 53) + this.lt_) * 37) + 4) * 53) + Float.floatToIntBits(getLat())) * 37) + 5) * 53) + Float.floatToIntBits(getLon())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Geo geo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(geo);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GeoOrBuilder {
        private float lat_;
        private long localTime_;
        private float lon_;
        private int lt_;
        private int utcoffset_;

        public final boolean isInitialized() {
            return true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_Geo_fieldAccessorTable.ensureFieldAccessorsInitialized(Geo.class, Builder.class);
        }

        private Builder() {
            this.lt_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.lt_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = Geo.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.utcoffset_ = 0;
            this.localTime_ = 0;
            this.lt_ = 0;
            this.lat_ = 0.0f;
            this.lon_ = 0.0f;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return Api.internal_static_com_appodeal_ads_Geo_descriptor;
        }

        public Geo getDefaultInstanceForType() {
            return Geo.getDefaultInstance();
        }

        public Geo build() {
            Geo buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public Geo buildPartial() {
            Geo geo = new Geo((GeneratedMessageV3.Builder) this);
            int unused = geo.utcoffset_ = this.utcoffset_;
            long unused2 = geo.localTime_ = this.localTime_;
            int unused3 = geo.lt_ = this.lt_;
            float unused4 = geo.lat_ = this.lat_;
            float unused5 = geo.lon_ = this.lon_;
            onBuilt();
            return geo;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public Builder mergeFrom(Message message) {
            if (message instanceof Geo) {
                return mergeFrom((Geo) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Geo geo) {
            if (geo == Geo.getDefaultInstance()) {
                return this;
            }
            if (geo.getUtcoffset() != 0) {
                setUtcoffset(geo.getUtcoffset());
            }
            if (geo.getLocalTime() != 0) {
                setLocalTime(geo.getLocalTime());
            }
            if (geo.lt_ != 0) {
                setLtValue(geo.getLtValue());
            }
            if (geo.getLat() != 0.0f) {
                setLat(geo.getLat());
            }
            if (geo.getLon() != 0.0f) {
                setLon(geo.getLon());
            }
            mergeUnknownFields(geo.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.appodeal.ads.api.Geo.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.Geo.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.appodeal.ads.api.Geo r3 = (com.appodeal.ads.api.Geo) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.appodeal.ads.api.Geo) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.appodeal.ads.api.Geo r4 = (com.appodeal.ads.api.Geo) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.appodeal.ads.api.Geo) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Geo.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.Geo$Builder");
        }

        public Builder setUtcoffset(int i) {
            this.utcoffset_ = i;
            onChanged();
            return this;
        }

        public Builder setLocalTime(long j) {
            this.localTime_ = j;
            onChanged();
            return this;
        }

        public Builder setLtValue(int i) {
            this.lt_ = i;
            onChanged();
            return this;
        }

        public Builder setLt(LocationType locationType) {
            if (locationType != null) {
                this.lt_ = locationType.getNumber();
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setLat(float f2) {
            this.lat_ = f2;
            onChanged();
            return this;
        }

        public Builder setLon(float f2) {
            this.lon_ = f2;
            onChanged();
            return this;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static Geo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Geo> parser() {
        return PARSER;
    }

    public Parser<Geo> getParserForType() {
        return PARSER;
    }

    public Geo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
