package com.appodeal.ads.api;

import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
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

public final class Device extends GeneratedMessageV3 implements DeviceOrBuilder {
    private static final Device DEFAULT_INSTANCE = new Device();
    /* access modifiers changed from: private */
    public static final Parser<Device> PARSER = new AbstractParser<Device>() {
        public Device parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Device(codedInputStream, extensionRegistryLite);
        }
    };
    /* access modifiers changed from: private */
    public boolean adidg_;
    /* access modifiers changed from: private */
    public int battery_;
    /* access modifiers changed from: private */
    public int connectiontype_;
    /* access modifiers changed from: private */
    public float cpuUsage_;
    /* access modifiers changed from: private */
    public int devicetype_;
    /* access modifiers changed from: private */
    public int h_;
    /* access modifiers changed from: private */
    public volatile Object idfv_;
    /* access modifiers changed from: private */
    public volatile Object ifa_;
    /* access modifiers changed from: private */
    public int lmt_;
    /* access modifiers changed from: private */
    public volatile Object locale_;
    /* access modifiers changed from: private */
    public volatile Object make_;
    /* access modifiers changed from: private */
    public volatile Object mccmnc_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public volatile Object model_;
    /* access modifiers changed from: private */
    public volatile Object os_;
    /* access modifiers changed from: private */
    public volatile Object osv_;
    /* access modifiers changed from: private */
    public float pxratio_;
    /* access modifiers changed from: private */
    public long ramFree_;
    /* access modifiers changed from: private */
    public long ramSize_;
    /* access modifiers changed from: private */
    public long ramUsed_;
    /* access modifiers changed from: private */
    public boolean rooted_;
    /* access modifiers changed from: private */
    public volatile Object secureAndroidId_;
    /* access modifiers changed from: private */
    public long storageFree_;
    /* access modifiers changed from: private */
    public long storageSize_;
    /* access modifiers changed from: private */
    public long storageUsed_;
    /* access modifiers changed from: private */
    public int trackingStatus_;
    /* access modifiers changed from: private */
    public volatile Object ua_;
    /* access modifiers changed from: private */
    public int w_;
    /* access modifiers changed from: private */
    public volatile Object webviewVersion_;

    private Device(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private Device() {
        this.memoizedIsInitialized = -1;
        this.ua_ = "";
        this.osv_ = "";
        this.os_ = "";
        this.devicetype_ = 0;
        this.make_ = "";
        this.model_ = "";
        this.webviewVersion_ = "";
        this.mccmnc_ = "";
        this.locale_ = "";
        this.connectiontype_ = 0;
        this.ifa_ = "";
        this.trackingStatus_ = 0;
        this.idfv_ = "";
        this.secureAndroidId_ = "";
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Device();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Device(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    switch (readTag) {
                        case 0:
                            z = true;
                            break;
                        case 10:
                            this.ua_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 18:
                            this.osv_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 26:
                            this.os_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 32:
                            this.w_ = codedInputStream.readInt32();
                            break;
                        case 40:
                            this.h_ = codedInputStream.readInt32();
                            break;
                        case 53:
                            this.pxratio_ = codedInputStream.readFloat();
                            break;
                        case 56:
                            this.devicetype_ = codedInputStream.readEnum();
                            break;
                        case 66:
                            this.make_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 74:
                            this.model_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 80:
                            this.rooted_ = codedInputStream.readBool();
                            break;
                        case 90:
                            this.webviewVersion_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 96:
                            this.battery_ = codedInputStream.readInt32();
                            break;
                        case 106:
                            this.mccmnc_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 114:
                            this.locale_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 120:
                            this.connectiontype_ = codedInputStream.readEnum();
                            break;
                        case 130:
                            this.ifa_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 136:
                            this.lmt_ = codedInputStream.readInt32();
                            break;
                        case 144:
                            this.adidg_ = codedInputStream.readBool();
                            break;
                        case 152:
                            this.trackingStatus_ = codedInputStream.readEnum();
                            break;
                        case 162:
                            this.idfv_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 168:
                            this.storageSize_ = codedInputStream.readUInt64();
                            break;
                        case 176:
                            this.storageFree_ = codedInputStream.readUInt64();
                            break;
                        case 184:
                            this.storageUsed_ = codedInputStream.readUInt64();
                            break;
                        case 192:
                            this.ramSize_ = codedInputStream.readUInt64();
                            break;
                        case 200:
                            this.ramFree_ = codedInputStream.readUInt64();
                            break;
                        case LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS_VALUE:
                            this.ramUsed_ = codedInputStream.readUInt64();
                            break;
                        case 221:
                            this.cpuUsage_ = codedInputStream.readFloat();
                            break;
                        case 226:
                            this.secureAndroidId_ = codedInputStream.readStringRequireUtf8();
                            break;
                        default:
                            if (parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                break;
                            }
                            z = true;
                            break;
                    }
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
        return Api.internal_static_com_appodeal_ads_Device_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Api.internal_static_com_appodeal_ads_Device_fieldAccessorTable.ensureFieldAccessorsInitialized(Device.class, Builder.class);
    }

    public enum ConnectionType implements ProtocolMessageEnum {
        CONNECTIONTYPE_UNKNOWN(0),
        ETHERNET(1),
        WIFI(2),
        MOBILE_UNKNOWN(3),
        MOBILE_2G(4),
        MOBILE_3G(5),
        MOBILE_4G(6),
        UNRECOGNIZED(-1);
        
        private static final ConnectionType[] VALUES = null;
        private static final Internal.EnumLiteMap<ConnectionType> internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new Internal.EnumLiteMap<ConnectionType>() {
                public ConnectionType findValueByNumber(int i) {
                    return ConnectionType.forNumber(i);
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

        public static ConnectionType forNumber(int i) {
            switch (i) {
                case 0:
                    return CONNECTIONTYPE_UNKNOWN;
                case 1:
                    return ETHERNET;
                case 2:
                    return WIFI;
                case 3:
                    return MOBILE_UNKNOWN;
                case 4:
                    return MOBILE_2G;
                case 5:
                    return MOBILE_3G;
                case 6:
                    return MOBILE_4G;
                default:
                    return null;
            }
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
            return Device.getDescriptor().getEnumTypes().get(0);
        }

        private ConnectionType(int i) {
            this.value = i;
        }
    }

    public enum DeviceType implements ProtocolMessageEnum {
        DEVICETYPE_UNKNOWN(0),
        PHONE(4),
        TABLET(5),
        UNRECOGNIZED(-1);
        
        private static final DeviceType[] VALUES = null;
        private static final Internal.EnumLiteMap<DeviceType> internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new Internal.EnumLiteMap<DeviceType>() {
                public DeviceType findValueByNumber(int i) {
                    return DeviceType.forNumber(i);
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

        public static DeviceType forNumber(int i) {
            if (i == 0) {
                return DEVICETYPE_UNKNOWN;
            }
            if (i == 4) {
                return PHONE;
            }
            if (i != 5) {
                return null;
            }
            return TABLET;
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
            return Device.getDescriptor().getEnumTypes().get(1);
        }

        private DeviceType(int i) {
            this.value = i;
        }
    }

    public enum TrackingAuthorizationStatus implements ProtocolMessageEnum {
        NOT_DETERMINED(0),
        RESTRICTED(1),
        DENIED(2),
        AUTHORIZED(3),
        UNRECOGNIZED(-1);
        
        private static final TrackingAuthorizationStatus[] VALUES = null;
        private static final Internal.EnumLiteMap<TrackingAuthorizationStatus> internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new Internal.EnumLiteMap<TrackingAuthorizationStatus>() {
                public TrackingAuthorizationStatus findValueByNumber(int i) {
                    return TrackingAuthorizationStatus.forNumber(i);
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

        public static TrackingAuthorizationStatus forNumber(int i) {
            if (i == 0) {
                return NOT_DETERMINED;
            }
            if (i == 1) {
                return RESTRICTED;
            }
            if (i == 2) {
                return DENIED;
            }
            if (i != 3) {
                return null;
            }
            return AUTHORIZED;
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
            return Device.getDescriptor().getEnumTypes().get(2);
        }

        private TrackingAuthorizationStatus(int i) {
            this.value = i;
        }
    }

    public String getUa() {
        Object obj = this.ua_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ua_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getUaBytes() {
        Object obj = this.ua_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ua_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getOsv() {
        Object obj = this.osv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.osv_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getOsvBytes() {
        Object obj = this.osv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.osv_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getOs() {
        Object obj = this.os_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.os_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getOsBytes() {
        Object obj = this.os_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.os_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public int getW() {
        return this.w_;
    }

    public int getH() {
        return this.h_;
    }

    public float getPxratio() {
        return this.pxratio_;
    }

    public int getDevicetypeValue() {
        return this.devicetype_;
    }

    public String getMake() {
        Object obj = this.make_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.make_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getMakeBytes() {
        Object obj = this.make_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.make_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getModel() {
        Object obj = this.model_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.model_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getModelBytes() {
        Object obj = this.model_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.model_ = copyFromUtf8;
        return copyFromUtf8;
    }

    @Deprecated
    public boolean getRooted() {
        return this.rooted_;
    }

    @Deprecated
    public String getWebviewVersion() {
        Object obj = this.webviewVersion_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.webviewVersion_ = stringUtf8;
        return stringUtf8;
    }

    @Deprecated
    public ByteString getWebviewVersionBytes() {
        Object obj = this.webviewVersion_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.webviewVersion_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public int getBattery() {
        return this.battery_;
    }

    public String getMccmnc() {
        Object obj = this.mccmnc_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.mccmnc_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getMccmncBytes() {
        Object obj = this.mccmnc_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.mccmnc_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getLocale() {
        Object obj = this.locale_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.locale_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getLocaleBytes() {
        Object obj = this.locale_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.locale_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public int getConnectiontypeValue() {
        return this.connectiontype_;
    }

    public String getIfa() {
        Object obj = this.ifa_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifa_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getIfaBytes() {
        Object obj = this.ifa_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ifa_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public int getLmt() {
        return this.lmt_;
    }

    public boolean getAdidg() {
        return this.adidg_;
    }

    public int getTrackingStatusValue() {
        return this.trackingStatus_;
    }

    public String getIdfv() {
        Object obj = this.idfv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.idfv_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getIdfvBytes() {
        Object obj = this.idfv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.idfv_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public long getStorageSize() {
        return this.storageSize_;
    }

    public long getStorageFree() {
        return this.storageFree_;
    }

    public long getStorageUsed() {
        return this.storageUsed_;
    }

    public long getRamSize() {
        return this.ramSize_;
    }

    public long getRamFree() {
        return this.ramFree_;
    }

    public long getRamUsed() {
        return this.ramUsed_;
    }

    public float getCpuUsage() {
        return this.cpuUsage_;
    }

    public String getSecureAndroidId() {
        Object obj = this.secureAndroidId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.secureAndroidId_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSecureAndroidIdBytes() {
        Object obj = this.secureAndroidId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.secureAndroidId_ = copyFromUtf8;
        return copyFromUtf8;
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
        if (!getUaBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.ua_);
        }
        if (!getOsvBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.osv_);
        }
        if (!getOsBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.os_);
        }
        int i = this.w_;
        if (i != 0) {
            codedOutputStream.writeInt32(4, i);
        }
        int i2 = this.h_;
        if (i2 != 0) {
            codedOutputStream.writeInt32(5, i2);
        }
        float f2 = this.pxratio_;
        if (f2 != 0.0f) {
            codedOutputStream.writeFloat(6, f2);
        }
        if (this.devicetype_ != DeviceType.DEVICETYPE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(7, this.devicetype_);
        }
        if (!getMakeBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.make_);
        }
        if (!getModelBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 9, this.model_);
        }
        boolean z = this.rooted_;
        if (z) {
            codedOutputStream.writeBool(10, z);
        }
        if (!getWebviewVersionBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 11, this.webviewVersion_);
        }
        int i3 = this.battery_;
        if (i3 != 0) {
            codedOutputStream.writeInt32(12, i3);
        }
        if (!getMccmncBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 13, this.mccmnc_);
        }
        if (!getLocaleBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 14, this.locale_);
        }
        if (this.connectiontype_ != ConnectionType.CONNECTIONTYPE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(15, this.connectiontype_);
        }
        if (!getIfaBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 16, this.ifa_);
        }
        int i4 = this.lmt_;
        if (i4 != 0) {
            codedOutputStream.writeInt32(17, i4);
        }
        boolean z2 = this.adidg_;
        if (z2) {
            codedOutputStream.writeBool(18, z2);
        }
        if (this.trackingStatus_ != TrackingAuthorizationStatus.NOT_DETERMINED.getNumber()) {
            codedOutputStream.writeEnum(19, this.trackingStatus_);
        }
        if (!getIdfvBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 20, this.idfv_);
        }
        long j = this.storageSize_;
        if (j != 0) {
            codedOutputStream.writeUInt64(21, j);
        }
        long j2 = this.storageFree_;
        if (j2 != 0) {
            codedOutputStream.writeUInt64(22, j2);
        }
        long j3 = this.storageUsed_;
        if (j3 != 0) {
            codedOutputStream.writeUInt64(23, j3);
        }
        long j4 = this.ramSize_;
        if (j4 != 0) {
            codedOutputStream.writeUInt64(24, j4);
        }
        long j5 = this.ramFree_;
        if (j5 != 0) {
            codedOutputStream.writeUInt64(25, j5);
        }
        long j6 = this.ramUsed_;
        if (j6 != 0) {
            codedOutputStream.writeUInt64(26, j6);
        }
        float f3 = this.cpuUsage_;
        if (f3 != 0.0f) {
            codedOutputStream.writeFloat(27, f3);
        }
        if (!getSecureAndroidIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 28, this.secureAndroidId_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!getUaBytes().isEmpty()) {
            i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.ua_);
        }
        if (!getOsvBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(2, this.osv_);
        }
        if (!getOsBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(3, this.os_);
        }
        int i3 = this.w_;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(4, i3);
        }
        int i4 = this.h_;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(5, i4);
        }
        float f2 = this.pxratio_;
        if (f2 != 0.0f) {
            i2 += CodedOutputStream.computeFloatSize(6, f2);
        }
        if (this.devicetype_ != DeviceType.DEVICETYPE_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(7, this.devicetype_);
        }
        if (!getMakeBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(8, this.make_);
        }
        if (!getModelBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(9, this.model_);
        }
        boolean z = this.rooted_;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(10, z);
        }
        if (!getWebviewVersionBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(11, this.webviewVersion_);
        }
        int i5 = this.battery_;
        if (i5 != 0) {
            i2 += CodedOutputStream.computeInt32Size(12, i5);
        }
        if (!getMccmncBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(13, this.mccmnc_);
        }
        if (!getLocaleBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(14, this.locale_);
        }
        if (this.connectiontype_ != ConnectionType.CONNECTIONTYPE_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(15, this.connectiontype_);
        }
        if (!getIfaBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(16, this.ifa_);
        }
        int i6 = this.lmt_;
        if (i6 != 0) {
            i2 += CodedOutputStream.computeInt32Size(17, i6);
        }
        boolean z2 = this.adidg_;
        if (z2) {
            i2 += CodedOutputStream.computeBoolSize(18, z2);
        }
        if (this.trackingStatus_ != TrackingAuthorizationStatus.NOT_DETERMINED.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(19, this.trackingStatus_);
        }
        if (!getIdfvBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(20, this.idfv_);
        }
        long j = this.storageSize_;
        if (j != 0) {
            i2 += CodedOutputStream.computeUInt64Size(21, j);
        }
        long j2 = this.storageFree_;
        if (j2 != 0) {
            i2 += CodedOutputStream.computeUInt64Size(22, j2);
        }
        long j3 = this.storageUsed_;
        if (j3 != 0) {
            i2 += CodedOutputStream.computeUInt64Size(23, j3);
        }
        long j4 = this.ramSize_;
        if (j4 != 0) {
            i2 += CodedOutputStream.computeUInt64Size(24, j4);
        }
        long j5 = this.ramFree_;
        if (j5 != 0) {
            i2 += CodedOutputStream.computeUInt64Size(25, j5);
        }
        long j6 = this.ramUsed_;
        if (j6 != 0) {
            i2 += CodedOutputStream.computeUInt64Size(26, j6);
        }
        float f3 = this.cpuUsage_;
        if (f3 != 0.0f) {
            i2 += CodedOutputStream.computeFloatSize(27, f3);
        }
        if (!getSecureAndroidIdBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(28, this.secureAndroidId_);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return super.equals(obj);
        }
        Device device = (Device) obj;
        if (getUa().equals(device.getUa()) && getOsv().equals(device.getOsv()) && getOs().equals(device.getOs()) && getW() == device.getW() && getH() == device.getH() && Float.floatToIntBits(getPxratio()) == Float.floatToIntBits(device.getPxratio()) && this.devicetype_ == device.devicetype_ && getMake().equals(device.getMake()) && getModel().equals(device.getModel()) && getRooted() == device.getRooted() && getWebviewVersion().equals(device.getWebviewVersion()) && getBattery() == device.getBattery() && getMccmnc().equals(device.getMccmnc()) && getLocale().equals(device.getLocale()) && this.connectiontype_ == device.connectiontype_ && getIfa().equals(device.getIfa()) && getLmt() == device.getLmt() && getAdidg() == device.getAdidg() && this.trackingStatus_ == device.trackingStatus_ && getIdfv().equals(device.getIdfv()) && getStorageSize() == device.getStorageSize() && getStorageFree() == device.getStorageFree() && getStorageUsed() == device.getStorageUsed() && getRamSize() == device.getRamSize() && getRamFree() == device.getRamFree() && getRamUsed() == device.getRamUsed() && Float.floatToIntBits(getCpuUsage()) == Float.floatToIntBits(device.getCpuUsage()) && getSecureAndroidId().equals(device.getSecureAndroidId()) && this.unknownFields.equals(device.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUa().hashCode()) * 37) + 2) * 53) + getOsv().hashCode()) * 37) + 3) * 53) + getOs().hashCode()) * 37) + 4) * 53) + getW()) * 37) + 5) * 53) + getH()) * 37) + 6) * 53) + Float.floatToIntBits(getPxratio())) * 37) + 7) * 53) + this.devicetype_) * 37) + 8) * 53) + getMake().hashCode()) * 37) + 9) * 53) + getModel().hashCode()) * 37) + 10) * 53) + Internal.hashBoolean(getRooted())) * 37) + 11) * 53) + getWebviewVersion().hashCode()) * 37) + 12) * 53) + getBattery()) * 37) + 13) * 53) + getMccmnc().hashCode()) * 37) + 14) * 53) + getLocale().hashCode()) * 37) + 15) * 53) + this.connectiontype_) * 37) + 16) * 53) + getIfa().hashCode()) * 37) + 17) * 53) + getLmt()) * 37) + 18) * 53) + Internal.hashBoolean(getAdidg())) * 37) + 19) * 53) + this.trackingStatus_) * 37) + 20) * 53) + getIdfv().hashCode()) * 37) + 21) * 53) + Internal.hashLong(getStorageSize())) * 37) + 22) * 53) + Internal.hashLong(getStorageFree())) * 37) + 23) * 53) + Internal.hashLong(getStorageUsed())) * 37) + 24) * 53) + Internal.hashLong(getRamSize())) * 37) + 25) * 53) + Internal.hashLong(getRamFree())) * 37) + 26) * 53) + Internal.hashLong(getRamUsed())) * 37) + 27) * 53) + Float.floatToIntBits(getCpuUsage())) * 37) + 28) * 53) + getSecureAndroidId().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Device device) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(device);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceOrBuilder {
        private boolean adidg_;
        private int battery_;
        private int connectiontype_;
        private float cpuUsage_;
        private int devicetype_;
        private int h_;
        private Object idfv_;
        private Object ifa_;
        private int lmt_;
        private Object locale_;
        private Object make_;
        private Object mccmnc_;
        private Object model_;
        private Object os_;
        private Object osv_;
        private float pxratio_;
        private long ramFree_;
        private long ramSize_;
        private long ramUsed_;
        private boolean rooted_;
        private Object secureAndroidId_;
        private long storageFree_;
        private long storageSize_;
        private long storageUsed_;
        private int trackingStatus_;
        private Object ua_;
        private int w_;
        private Object webviewVersion_;

        public final boolean isInitialized() {
            return true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_Device_fieldAccessorTable.ensureFieldAccessorsInitialized(Device.class, Builder.class);
        }

        private Builder() {
            this.ua_ = "";
            this.osv_ = "";
            this.os_ = "";
            this.devicetype_ = 0;
            this.make_ = "";
            this.model_ = "";
            this.webviewVersion_ = "";
            this.mccmnc_ = "";
            this.locale_ = "";
            this.connectiontype_ = 0;
            this.ifa_ = "";
            this.trackingStatus_ = 0;
            this.idfv_ = "";
            this.secureAndroidId_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.ua_ = "";
            this.osv_ = "";
            this.os_ = "";
            this.devicetype_ = 0;
            this.make_ = "";
            this.model_ = "";
            this.webviewVersion_ = "";
            this.mccmnc_ = "";
            this.locale_ = "";
            this.connectiontype_ = 0;
            this.ifa_ = "";
            this.trackingStatus_ = 0;
            this.idfv_ = "";
            this.secureAndroidId_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = Device.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.ua_ = "";
            this.osv_ = "";
            this.os_ = "";
            this.w_ = 0;
            this.h_ = 0;
            this.pxratio_ = 0.0f;
            this.devicetype_ = 0;
            this.make_ = "";
            this.model_ = "";
            this.rooted_ = false;
            this.webviewVersion_ = "";
            this.battery_ = 0;
            this.mccmnc_ = "";
            this.locale_ = "";
            this.connectiontype_ = 0;
            this.ifa_ = "";
            this.lmt_ = 0;
            this.adidg_ = false;
            this.trackingStatus_ = 0;
            this.idfv_ = "";
            this.storageSize_ = 0;
            this.storageFree_ = 0;
            this.storageUsed_ = 0;
            this.ramSize_ = 0;
            this.ramFree_ = 0;
            this.ramUsed_ = 0;
            this.cpuUsage_ = 0.0f;
            this.secureAndroidId_ = "";
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return Api.internal_static_com_appodeal_ads_Device_descriptor;
        }

        public Device getDefaultInstanceForType() {
            return Device.getDefaultInstance();
        }

        public Device build() {
            Device buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public Device buildPartial() {
            Device device = new Device((GeneratedMessageV3.Builder) this);
            Object unused = device.ua_ = this.ua_;
            Object unused2 = device.osv_ = this.osv_;
            Object unused3 = device.os_ = this.os_;
            int unused4 = device.w_ = this.w_;
            int unused5 = device.h_ = this.h_;
            float unused6 = device.pxratio_ = this.pxratio_;
            int unused7 = device.devicetype_ = this.devicetype_;
            Object unused8 = device.make_ = this.make_;
            Object unused9 = device.model_ = this.model_;
            boolean unused10 = device.rooted_ = this.rooted_;
            Object unused11 = device.webviewVersion_ = this.webviewVersion_;
            int unused12 = device.battery_ = this.battery_;
            Object unused13 = device.mccmnc_ = this.mccmnc_;
            Object unused14 = device.locale_ = this.locale_;
            int unused15 = device.connectiontype_ = this.connectiontype_;
            Object unused16 = device.ifa_ = this.ifa_;
            int unused17 = device.lmt_ = this.lmt_;
            boolean unused18 = device.adidg_ = this.adidg_;
            int unused19 = device.trackingStatus_ = this.trackingStatus_;
            Object unused20 = device.idfv_ = this.idfv_;
            long unused21 = device.storageSize_ = this.storageSize_;
            long unused22 = device.storageFree_ = this.storageFree_;
            long unused23 = device.storageUsed_ = this.storageUsed_;
            long unused24 = device.ramSize_ = this.ramSize_;
            long unused25 = device.ramFree_ = this.ramFree_;
            long unused26 = device.ramUsed_ = this.ramUsed_;
            float unused27 = device.cpuUsage_ = this.cpuUsage_;
            Object unused28 = device.secureAndroidId_ = this.secureAndroidId_;
            onBuilt();
            return device;
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
            if (message instanceof Device) {
                return mergeFrom((Device) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Device device) {
            if (device == Device.getDefaultInstance()) {
                return this;
            }
            if (!device.getUa().isEmpty()) {
                this.ua_ = device.ua_;
                onChanged();
            }
            if (!device.getOsv().isEmpty()) {
                this.osv_ = device.osv_;
                onChanged();
            }
            if (!device.getOs().isEmpty()) {
                this.os_ = device.os_;
                onChanged();
            }
            if (device.getW() != 0) {
                setW(device.getW());
            }
            if (device.getH() != 0) {
                setH(device.getH());
            }
            if (device.getPxratio() != 0.0f) {
                setPxratio(device.getPxratio());
            }
            if (device.devicetype_ != 0) {
                setDevicetypeValue(device.getDevicetypeValue());
            }
            if (!device.getMake().isEmpty()) {
                this.make_ = device.make_;
                onChanged();
            }
            if (!device.getModel().isEmpty()) {
                this.model_ = device.model_;
                onChanged();
            }
            if (device.getRooted()) {
                setRooted(device.getRooted());
            }
            if (!device.getWebviewVersion().isEmpty()) {
                this.webviewVersion_ = device.webviewVersion_;
                onChanged();
            }
            if (device.getBattery() != 0) {
                setBattery(device.getBattery());
            }
            if (!device.getMccmnc().isEmpty()) {
                this.mccmnc_ = device.mccmnc_;
                onChanged();
            }
            if (!device.getLocale().isEmpty()) {
                this.locale_ = device.locale_;
                onChanged();
            }
            if (device.connectiontype_ != 0) {
                setConnectiontypeValue(device.getConnectiontypeValue());
            }
            if (!device.getIfa().isEmpty()) {
                this.ifa_ = device.ifa_;
                onChanged();
            }
            if (device.getLmt() != 0) {
                setLmt(device.getLmt());
            }
            if (device.getAdidg()) {
                setAdidg(device.getAdidg());
            }
            if (device.trackingStatus_ != 0) {
                setTrackingStatusValue(device.getTrackingStatusValue());
            }
            if (!device.getIdfv().isEmpty()) {
                this.idfv_ = device.idfv_;
                onChanged();
            }
            if (device.getStorageSize() != 0) {
                setStorageSize(device.getStorageSize());
            }
            if (device.getStorageFree() != 0) {
                setStorageFree(device.getStorageFree());
            }
            if (device.getStorageUsed() != 0) {
                setStorageUsed(device.getStorageUsed());
            }
            if (device.getRamSize() != 0) {
                setRamSize(device.getRamSize());
            }
            if (device.getRamFree() != 0) {
                setRamFree(device.getRamFree());
            }
            if (device.getRamUsed() != 0) {
                setRamUsed(device.getRamUsed());
            }
            if (device.getCpuUsage() != 0.0f) {
                setCpuUsage(device.getCpuUsage());
            }
            if (!device.getSecureAndroidId().isEmpty()) {
                this.secureAndroidId_ = device.secureAndroidId_;
                onChanged();
            }
            mergeUnknownFields(device.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.appodeal.ads.api.Device.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.Device.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.appodeal.ads.api.Device r3 = (com.appodeal.ads.api.Device) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.appodeal.ads.api.Device) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.appodeal.ads.api.Device r4 = (com.appodeal.ads.api.Device) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.appodeal.ads.api.Device) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Device.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.Device$Builder");
        }

        public Builder setUa(String str) {
            if (str != null) {
                this.ua_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setOsv(String str) {
            if (str != null) {
                this.osv_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setOs(String str) {
            if (str != null) {
                this.os_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setW(int i) {
            this.w_ = i;
            onChanged();
            return this;
        }

        public Builder setH(int i) {
            this.h_ = i;
            onChanged();
            return this;
        }

        public Builder setPxratio(float f2) {
            this.pxratio_ = f2;
            onChanged();
            return this;
        }

        public Builder setDevicetypeValue(int i) {
            this.devicetype_ = i;
            onChanged();
            return this;
        }

        public Builder setDevicetype(DeviceType deviceType) {
            if (deviceType != null) {
                this.devicetype_ = deviceType.getNumber();
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setMake(String str) {
            if (str != null) {
                this.make_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setModel(String str) {
            if (str != null) {
                this.model_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        @Deprecated
        public Builder setRooted(boolean z) {
            this.rooted_ = z;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setWebviewVersion(String str) {
            if (str != null) {
                this.webviewVersion_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setBattery(int i) {
            this.battery_ = i;
            onChanged();
            return this;
        }

        public Builder setMccmnc(String str) {
            if (str != null) {
                this.mccmnc_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setLocale(String str) {
            if (str != null) {
                this.locale_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setConnectiontypeValue(int i) {
            this.connectiontype_ = i;
            onChanged();
            return this;
        }

        public Builder setConnectiontype(ConnectionType connectionType) {
            if (connectionType != null) {
                this.connectiontype_ = connectionType.getNumber();
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setIfa(String str) {
            if (str != null) {
                this.ifa_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setLmt(int i) {
            this.lmt_ = i;
            onChanged();
            return this;
        }

        public Builder setAdidg(boolean z) {
            this.adidg_ = z;
            onChanged();
            return this;
        }

        public Builder setTrackingStatusValue(int i) {
            this.trackingStatus_ = i;
            onChanged();
            return this;
        }

        public Builder setStorageSize(long j) {
            this.storageSize_ = j;
            onChanged();
            return this;
        }

        public Builder setStorageFree(long j) {
            this.storageFree_ = j;
            onChanged();
            return this;
        }

        public Builder setStorageUsed(long j) {
            this.storageUsed_ = j;
            onChanged();
            return this;
        }

        public Builder setRamSize(long j) {
            this.ramSize_ = j;
            onChanged();
            return this;
        }

        public Builder setRamFree(long j) {
            this.ramFree_ = j;
            onChanged();
            return this;
        }

        public Builder setRamUsed(long j) {
            this.ramUsed_ = j;
            onChanged();
            return this;
        }

        public Builder setCpuUsage(float f2) {
            this.cpuUsage_ = f2;
            onChanged();
            return this;
        }

        public Builder setSecureAndroidId(String str) {
            if (str != null) {
                this.secureAndroidId_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static Device getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Device> parser() {
        return PARSER;
    }

    public Parser<Device> getParserForType() {
        return PARSER;
    }

    public Device getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
