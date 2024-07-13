package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.StructOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.DeviceType;
import com.explorestack.protobuf.adcom.OS;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SdkAnalyticContext extends GeneratedMessageV3 implements SdkAnalyticContextOrBuilder {
    public static final int APP_VER_FIELD_NUMBER = 13;
    public static final int BM_IFV_FIELD_NUMBER = 12;
    public static final int BUNDLE_FIELD_NUMBER = 2;
    public static final int CONTYPE_FIELD_NUMBER = 10;
    public static final int DCID_FIELD_NUMBER = 15;
    private static final SdkAnalyticContext DEFAULT_INSTANCE = new SdkAnalyticContext();
    public static final int DEVICE_TYPE_FIELD_NUMBER = 9;
    public static final int EXT_FIELD_NUMBER = 16;
    public static final int GEO_FIELD_NUMBER = 5;
    public static final int IFA_FIELD_NUMBER = 8;
    public static final int IFV_FIELD_NUMBER = 11;
    public static final int OSV_FIELD_NUMBER = 4;
    public static final int OS_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final Parser<SdkAnalyticContext> PARSER = new AbstractParser<SdkAnalyticContext>() {
        public SdkAnalyticContext parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new SdkAnalyticContext(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int SDKVER_FIELD_NUMBER = 7;
    public static final int SDK_FIELD_NUMBER = 6;
    public static final int SELLER_ID_FIELD_NUMBER = 1;
    public static final int SESSION_ID_FIELD_NUMBER = 14;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public volatile Object appVer_;
    /* access modifiers changed from: private */
    public volatile Object bmIfv_;
    /* access modifiers changed from: private */
    public volatile Object bundle_;
    /* access modifiers changed from: private */
    public int contype_;
    /* access modifiers changed from: private */
    public volatile Object dcid_;
    /* access modifiers changed from: private */
    public int deviceType_;
    /* access modifiers changed from: private */
    public Struct ext_;
    /* access modifiers changed from: private */
    public Context.Geo geo_;
    /* access modifiers changed from: private */
    public volatile Object ifa_;
    /* access modifiers changed from: private */
    public volatile Object ifv_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public int os_;
    /* access modifiers changed from: private */
    public volatile Object osv_;
    /* access modifiers changed from: private */
    public volatile Object sdk_;
    /* access modifiers changed from: private */
    public volatile Object sdkver_;
    /* access modifiers changed from: private */
    public volatile Object sellerId_;
    /* access modifiers changed from: private */
    public volatile Object sessionId_;

    private SdkAnalyticContext(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private SdkAnalyticContext() {
        this.memoizedIsInitialized = -1;
        this.sellerId_ = "";
        this.bundle_ = "";
        this.os_ = 0;
        this.osv_ = "";
        this.sdk_ = "";
        this.sdkver_ = "";
        this.ifa_ = "";
        this.ifv_ = "";
        this.bmIfv_ = "";
        this.deviceType_ = 0;
        this.contype_ = 0;
        this.appVer_ = "";
        this.sessionId_ = "";
        this.dcid_ = "";
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new SdkAnalyticContext();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private SdkAnalyticContext(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.sellerId_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 18:
                            this.bundle_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 24:
                            this.os_ = codedInputStream.readEnum();
                            break;
                        case 34:
                            this.osv_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 42:
                            Context.Geo.Builder builder = this.geo_ != null ? this.geo_.toBuilder() : null;
                            Context.Geo geo = (Context.Geo) codedInputStream.readMessage(Context.Geo.parser(), extensionRegistryLite);
                            this.geo_ = geo;
                            if (builder == null) {
                                break;
                            } else {
                                builder.mergeFrom(geo);
                                this.geo_ = builder.buildPartial();
                                break;
                            }
                        case 50:
                            this.sdk_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 58:
                            this.sdkver_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 66:
                            this.ifa_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 72:
                            this.deviceType_ = codedInputStream.readEnum();
                            break;
                        case 80:
                            this.contype_ = codedInputStream.readEnum();
                            break;
                        case 90:
                            this.ifv_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 98:
                            this.bmIfv_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 106:
                            this.appVer_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 114:
                            this.sessionId_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 122:
                            this.dcid_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 130:
                            Struct.Builder builder2 = this.ext_ != null ? this.ext_.toBuilder() : null;
                            Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                            this.ext_ = struct;
                            if (builder2 == null) {
                                break;
                            } else {
                                builder2.mergeFrom(struct);
                                this.ext_ = builder2.buildPartial();
                                break;
                            }
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
        return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticContext_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticContext_fieldAccessorTable.ensureFieldAccessorsInitialized(SdkAnalyticContext.class, Builder.class);
    }

    public String getSellerId() {
        Object obj = this.sellerId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sellerId_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSellerIdBytes() {
        Object obj = this.sellerId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sellerId_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getBundle() {
        Object obj = this.bundle_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bundle_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getBundleBytes() {
        Object obj = this.bundle_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bundle_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public int getOsValue() {
        return this.os_;
    }

    public OS getOs() {
        OS valueOf = OS.valueOf(this.os_);
        return valueOf == null ? OS.UNRECOGNIZED : valueOf;
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

    public boolean hasGeo() {
        return this.geo_ != null;
    }

    public Context.Geo getGeo() {
        Context.Geo geo = this.geo_;
        return geo == null ? Context.Geo.getDefaultInstance() : geo;
    }

    public Context.GeoOrBuilder getGeoOrBuilder() {
        return getGeo();
    }

    public String getSdk() {
        Object obj = this.sdk_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdk_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSdkBytes() {
        Object obj = this.sdk_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdk_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getSdkver() {
        Object obj = this.sdkver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdkver_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSdkverBytes() {
        Object obj = this.sdkver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdkver_ = copyFromUtf8;
        return copyFromUtf8;
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

    public String getIfv() {
        Object obj = this.ifv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifv_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getIfvBytes() {
        Object obj = this.ifv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ifv_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getBmIfv() {
        Object obj = this.bmIfv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bmIfv_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getBmIfvBytes() {
        Object obj = this.bmIfv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bmIfv_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public int getDeviceTypeValue() {
        return this.deviceType_;
    }

    public DeviceType getDeviceType() {
        DeviceType valueOf = DeviceType.valueOf(this.deviceType_);
        return valueOf == null ? DeviceType.UNRECOGNIZED : valueOf;
    }

    public int getContypeValue() {
        return this.contype_;
    }

    public ConnectionType getContype() {
        ConnectionType valueOf = ConnectionType.valueOf(this.contype_);
        return valueOf == null ? ConnectionType.UNRECOGNIZED : valueOf;
    }

    public String getAppVer() {
        Object obj = this.appVer_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appVer_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getAppVerBytes() {
        Object obj = this.appVer_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.appVer_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getSessionId() {
        Object obj = this.sessionId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sessionId_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSessionIdBytes() {
        Object obj = this.sessionId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sessionId_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getDcid() {
        Object obj = this.dcid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.dcid_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getDcidBytes() {
        Object obj = this.dcid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.dcid_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public boolean hasExt() {
        return this.ext_ != null;
    }

    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    public StructOrBuilder getExtOrBuilder() {
        return getExt();
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
        if (!getSellerIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.sellerId_);
        }
        if (!getBundleBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.bundle_);
        }
        if (this.os_ != OS.OS_INVALID.getNumber()) {
            codedOutputStream.writeEnum(3, this.os_);
        }
        if (!getOsvBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.osv_);
        }
        if (this.geo_ != null) {
            codedOutputStream.writeMessage(5, getGeo());
        }
        if (!getSdkBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.sdkver_);
        }
        if (!getIfaBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.ifa_);
        }
        if (this.deviceType_ != DeviceType.DEVICE_TYPE_INVALID.getNumber()) {
            codedOutputStream.writeEnum(9, this.deviceType_);
        }
        if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
            codedOutputStream.writeEnum(10, this.contype_);
        }
        if (!getIfvBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 11, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 12, this.bmIfv_);
        }
        if (!getAppVerBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 13, this.appVer_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 14, this.sessionId_);
        }
        if (!getDcidBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 15, this.dcid_);
        }
        if (this.ext_ != null) {
            codedOutputStream.writeMessage(16, getExt());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!getSellerIdBytes().isEmpty()) {
            i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.sellerId_);
        }
        if (!getBundleBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(2, this.bundle_);
        }
        if (this.os_ != OS.OS_INVALID.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(3, this.os_);
        }
        if (!getOsvBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(4, this.osv_);
        }
        if (this.geo_ != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getGeo());
        }
        if (!getSdkBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(6, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(7, this.sdkver_);
        }
        if (!getIfaBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(8, this.ifa_);
        }
        if (this.deviceType_ != DeviceType.DEVICE_TYPE_INVALID.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(9, this.deviceType_);
        }
        if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(10, this.contype_);
        }
        if (!getIfvBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(11, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(12, this.bmIfv_);
        }
        if (!getAppVerBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(13, this.appVer_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(14, this.sessionId_);
        }
        if (!getDcidBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(15, this.dcid_);
        }
        if (this.ext_ != null) {
            i2 += CodedOutputStream.computeMessageSize(16, getExt());
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkAnalyticContext)) {
            return super.equals(obj);
        }
        SdkAnalyticContext sdkAnalyticContext = (SdkAnalyticContext) obj;
        if (!getSellerId().equals(sdkAnalyticContext.getSellerId()) || !getBundle().equals(sdkAnalyticContext.getBundle()) || this.os_ != sdkAnalyticContext.os_ || !getOsv().equals(sdkAnalyticContext.getOsv()) || hasGeo() != sdkAnalyticContext.hasGeo()) {
            return false;
        }
        if ((hasGeo() && !getGeo().equals(sdkAnalyticContext.getGeo())) || !getSdk().equals(sdkAnalyticContext.getSdk()) || !getSdkver().equals(sdkAnalyticContext.getSdkver()) || !getIfa().equals(sdkAnalyticContext.getIfa()) || !getIfv().equals(sdkAnalyticContext.getIfv()) || !getBmIfv().equals(sdkAnalyticContext.getBmIfv()) || this.deviceType_ != sdkAnalyticContext.deviceType_ || this.contype_ != sdkAnalyticContext.contype_ || !getAppVer().equals(sdkAnalyticContext.getAppVer()) || !getSessionId().equals(sdkAnalyticContext.getSessionId()) || !getDcid().equals(sdkAnalyticContext.getDcid()) || hasExt() != sdkAnalyticContext.hasExt()) {
            return false;
        }
        if ((!hasExt() || getExt().equals(sdkAnalyticContext.getExt())) && this.unknownFields.equals(sdkAnalyticContext.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSellerId().hashCode()) * 37) + 2) * 53) + getBundle().hashCode()) * 37) + 3) * 53) + this.os_) * 37) + 4) * 53) + getOsv().hashCode();
        if (hasGeo()) {
            hashCode = (((hashCode * 37) + 5) * 53) + getGeo().hashCode();
        }
        int hashCode2 = (((((((((((((((((((((((((((((((((((((((hashCode * 37) + 6) * 53) + getSdk().hashCode()) * 37) + 7) * 53) + getSdkver().hashCode()) * 37) + 8) * 53) + getIfa().hashCode()) * 37) + 11) * 53) + getIfv().hashCode()) * 37) + 12) * 53) + getBmIfv().hashCode()) * 37) + 9) * 53) + this.deviceType_) * 37) + 10) * 53) + this.contype_) * 37) + 13) * 53) + getAppVer().hashCode()) * 37) + 14) * 53) + getSessionId().hashCode()) * 37) + 15) * 53) + getDcid().hashCode();
        if (hasExt()) {
            hashCode2 = (((hashCode2 * 37) + 16) * 53) + getExt().hashCode();
        }
        int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode3;
        return hashCode3;
    }

    public static SdkAnalyticContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static SdkAnalyticContext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static SdkAnalyticContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static SdkAnalyticContext parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static SdkAnalyticContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static SdkAnalyticContext parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static SdkAnalyticContext parseFrom(InputStream inputStream) throws IOException {
        return (SdkAnalyticContext) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static SdkAnalyticContext parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SdkAnalyticContext) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SdkAnalyticContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SdkAnalyticContext) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SdkAnalyticContext parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SdkAnalyticContext) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SdkAnalyticContext parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SdkAnalyticContext) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static SdkAnalyticContext parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SdkAnalyticContext) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(SdkAnalyticContext sdkAnalyticContext) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sdkAnalyticContext);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SdkAnalyticContextOrBuilder {
        private Object appVer_;
        private Object bmIfv_;
        private Object bundle_;
        private int contype_;
        private Object dcid_;
        private int deviceType_;
        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
        private Struct ext_;
        private SingleFieldBuilderV3<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> geoBuilder_;
        private Context.Geo geo_;
        private Object ifa_;
        private Object ifv_;
        private int os_;
        private Object osv_;
        private Object sdk_;
        private Object sdkver_;
        private Object sellerId_;
        private Object sessionId_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticContext_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticContext_fieldAccessorTable.ensureFieldAccessorsInitialized(SdkAnalyticContext.class, Builder.class);
        }

        private Builder() {
            this.sellerId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            this.dcid_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.sellerId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            this.dcid_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = SdkAnalyticContext.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.sellerId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            if (this.geoBuilder_ == null) {
                this.geo_ = null;
            } else {
                this.geo_ = null;
                this.geoBuilder_ = null;
            }
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            this.dcid_ = "";
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticContext_descriptor;
        }

        public SdkAnalyticContext getDefaultInstanceForType() {
            return SdkAnalyticContext.getDefaultInstance();
        }

        public SdkAnalyticContext build() {
            SdkAnalyticContext buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public SdkAnalyticContext buildPartial() {
            SdkAnalyticContext sdkAnalyticContext = new SdkAnalyticContext((GeneratedMessageV3.Builder) this);
            Object unused = sdkAnalyticContext.sellerId_ = this.sellerId_;
            Object unused2 = sdkAnalyticContext.bundle_ = this.bundle_;
            int unused3 = sdkAnalyticContext.os_ = this.os_;
            Object unused4 = sdkAnalyticContext.osv_ = this.osv_;
            SingleFieldBuilderV3<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
            if (singleFieldBuilderV3 == null) {
                Context.Geo unused5 = sdkAnalyticContext.geo_ = this.geo_;
            } else {
                Context.Geo unused6 = sdkAnalyticContext.geo_ = singleFieldBuilderV3.build();
            }
            Object unused7 = sdkAnalyticContext.sdk_ = this.sdk_;
            Object unused8 = sdkAnalyticContext.sdkver_ = this.sdkver_;
            Object unused9 = sdkAnalyticContext.ifa_ = this.ifa_;
            Object unused10 = sdkAnalyticContext.ifv_ = this.ifv_;
            Object unused11 = sdkAnalyticContext.bmIfv_ = this.bmIfv_;
            int unused12 = sdkAnalyticContext.deviceType_ = this.deviceType_;
            int unused13 = sdkAnalyticContext.contype_ = this.contype_;
            Object unused14 = sdkAnalyticContext.appVer_ = this.appVer_;
            Object unused15 = sdkAnalyticContext.sessionId_ = this.sessionId_;
            Object unused16 = sdkAnalyticContext.dcid_ = this.dcid_;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.extBuilder_;
            if (singleFieldBuilderV32 == null) {
                Struct unused17 = sdkAnalyticContext.ext_ = this.ext_;
            } else {
                Struct unused18 = sdkAnalyticContext.ext_ = singleFieldBuilderV32.build();
            }
            onBuilt();
            return sdkAnalyticContext;
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
            if (message instanceof SdkAnalyticContext) {
                return mergeFrom((SdkAnalyticContext) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(SdkAnalyticContext sdkAnalyticContext) {
            if (sdkAnalyticContext == SdkAnalyticContext.getDefaultInstance()) {
                return this;
            }
            if (!sdkAnalyticContext.getSellerId().isEmpty()) {
                this.sellerId_ = sdkAnalyticContext.sellerId_;
                onChanged();
            }
            if (!sdkAnalyticContext.getBundle().isEmpty()) {
                this.bundle_ = sdkAnalyticContext.bundle_;
                onChanged();
            }
            if (sdkAnalyticContext.os_ != 0) {
                setOsValue(sdkAnalyticContext.getOsValue());
            }
            if (!sdkAnalyticContext.getOsv().isEmpty()) {
                this.osv_ = sdkAnalyticContext.osv_;
                onChanged();
            }
            if (sdkAnalyticContext.hasGeo()) {
                mergeGeo(sdkAnalyticContext.getGeo());
            }
            if (!sdkAnalyticContext.getSdk().isEmpty()) {
                this.sdk_ = sdkAnalyticContext.sdk_;
                onChanged();
            }
            if (!sdkAnalyticContext.getSdkver().isEmpty()) {
                this.sdkver_ = sdkAnalyticContext.sdkver_;
                onChanged();
            }
            if (!sdkAnalyticContext.getIfa().isEmpty()) {
                this.ifa_ = sdkAnalyticContext.ifa_;
                onChanged();
            }
            if (!sdkAnalyticContext.getIfv().isEmpty()) {
                this.ifv_ = sdkAnalyticContext.ifv_;
                onChanged();
            }
            if (!sdkAnalyticContext.getBmIfv().isEmpty()) {
                this.bmIfv_ = sdkAnalyticContext.bmIfv_;
                onChanged();
            }
            if (sdkAnalyticContext.deviceType_ != 0) {
                setDeviceTypeValue(sdkAnalyticContext.getDeviceTypeValue());
            }
            if (sdkAnalyticContext.contype_ != 0) {
                setContypeValue(sdkAnalyticContext.getContypeValue());
            }
            if (!sdkAnalyticContext.getAppVer().isEmpty()) {
                this.appVer_ = sdkAnalyticContext.appVer_;
                onChanged();
            }
            if (!sdkAnalyticContext.getSessionId().isEmpty()) {
                this.sessionId_ = sdkAnalyticContext.sessionId_;
                onChanged();
            }
            if (!sdkAnalyticContext.getDcid().isEmpty()) {
                this.dcid_ = sdkAnalyticContext.dcid_;
                onChanged();
            }
            if (sdkAnalyticContext.hasExt()) {
                mergeExt(sdkAnalyticContext.getExt());
            }
            mergeUnknownFields(sdkAnalyticContext.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.SdkAnalyticContext.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.SdkAnalyticContext.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.SdkAnalyticContext r3 = (io.bidmachine.protobuf.SdkAnalyticContext) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.SdkAnalyticContext) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.SdkAnalyticContext r4 = (io.bidmachine.protobuf.SdkAnalyticContext) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.SdkAnalyticContext) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.SdkAnalyticContext.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.SdkAnalyticContext$Builder");
        }

        public String getSellerId() {
            Object obj = this.sellerId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sellerId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSellerIdBytes() {
            Object obj = this.sellerId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sellerId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setSellerId(String str) {
            if (str != null) {
                this.sellerId_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearSellerId() {
            this.sellerId_ = SdkAnalyticContext.getDefaultInstance().getSellerId();
            onChanged();
            return this;
        }

        public Builder setSellerIdBytes(ByteString byteString) {
            if (byteString != null) {
                SdkAnalyticContext.checkByteStringIsUtf8(byteString);
                this.sellerId_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getBundle() {
            Object obj = this.bundle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bundle_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getBundleBytes() {
            Object obj = this.bundle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bundle_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setBundle(String str) {
            if (str != null) {
                this.bundle_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearBundle() {
            this.bundle_ = SdkAnalyticContext.getDefaultInstance().getBundle();
            onChanged();
            return this;
        }

        public Builder setBundleBytes(ByteString byteString) {
            if (byteString != null) {
                SdkAnalyticContext.checkByteStringIsUtf8(byteString);
                this.bundle_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public int getOsValue() {
            return this.os_;
        }

        public Builder setOsValue(int i) {
            this.os_ = i;
            onChanged();
            return this;
        }

        public OS getOs() {
            OS valueOf = OS.valueOf(this.os_);
            return valueOf == null ? OS.UNRECOGNIZED : valueOf;
        }

        public Builder setOs(OS os) {
            if (os != null) {
                this.os_ = os.getNumber();
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearOs() {
            this.os_ = 0;
            onChanged();
            return this;
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

        public Builder setOsv(String str) {
            if (str != null) {
                this.osv_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearOsv() {
            this.osv_ = SdkAnalyticContext.getDefaultInstance().getOsv();
            onChanged();
            return this;
        }

        public Builder setOsvBytes(ByteString byteString) {
            if (byteString != null) {
                SdkAnalyticContext.checkByteStringIsUtf8(byteString);
                this.osv_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public boolean hasGeo() {
            return (this.geoBuilder_ == null && this.geo_ == null) ? false : true;
        }

        public Context.Geo getGeo() {
            SingleFieldBuilderV3<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Context.Geo geo = this.geo_;
            return geo == null ? Context.Geo.getDefaultInstance() : geo;
        }

        public Builder setGeo(Context.Geo geo) {
            SingleFieldBuilderV3<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(geo);
            } else if (geo != null) {
                this.geo_ = geo;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setGeo(Context.Geo.Builder builder) {
            SingleFieldBuilderV3<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.geo_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeGeo(Context.Geo geo) {
            SingleFieldBuilderV3<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
            if (singleFieldBuilderV3 == null) {
                Context.Geo geo2 = this.geo_;
                if (geo2 != null) {
                    this.geo_ = Context.Geo.newBuilder(geo2).mergeFrom(geo).buildPartial();
                } else {
                    this.geo_ = geo;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(geo);
            }
            return this;
        }

        public Builder clearGeo() {
            if (this.geoBuilder_ == null) {
                this.geo_ = null;
                onChanged();
            } else {
                this.geo_ = null;
                this.geoBuilder_ = null;
            }
            return this;
        }

        public Context.Geo.Builder getGeoBuilder() {
            onChanged();
            return getGeoFieldBuilder().getBuilder();
        }

        public Context.GeoOrBuilder getGeoOrBuilder() {
            SingleFieldBuilderV3<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Context.Geo geo = this.geo_;
            return geo == null ? Context.Geo.getDefaultInstance() : geo;
        }

        private SingleFieldBuilderV3<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> getGeoFieldBuilder() {
            if (this.geoBuilder_ == null) {
                this.geoBuilder_ = new SingleFieldBuilderV3<>(getGeo(), getParentForChildren(), isClean());
                this.geo_ = null;
            }
            return this.geoBuilder_;
        }

        public String getSdk() {
            Object obj = this.sdk_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdk_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSdkBytes() {
            Object obj = this.sdk_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdk_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setSdk(String str) {
            if (str != null) {
                this.sdk_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearSdk() {
            this.sdk_ = SdkAnalyticContext.getDefaultInstance().getSdk();
            onChanged();
            return this;
        }

        public Builder setSdkBytes(ByteString byteString) {
            if (byteString != null) {
                SdkAnalyticContext.checkByteStringIsUtf8(byteString);
                this.sdk_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getSdkver() {
            Object obj = this.sdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdkver_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSdkverBytes() {
            Object obj = this.sdkver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdkver_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setSdkver(String str) {
            if (str != null) {
                this.sdkver_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearSdkver() {
            this.sdkver_ = SdkAnalyticContext.getDefaultInstance().getSdkver();
            onChanged();
            return this;
        }

        public Builder setSdkverBytes(ByteString byteString) {
            if (byteString != null) {
                SdkAnalyticContext.checkByteStringIsUtf8(byteString);
                this.sdkver_ = byteString;
                onChanged();
                return this;
            }
            throw null;
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

        public Builder setIfa(String str) {
            if (str != null) {
                this.ifa_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearIfa() {
            this.ifa_ = SdkAnalyticContext.getDefaultInstance().getIfa();
            onChanged();
            return this;
        }

        public Builder setIfaBytes(ByteString byteString) {
            if (byteString != null) {
                SdkAnalyticContext.checkByteStringIsUtf8(byteString);
                this.ifa_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getIfv() {
            Object obj = this.ifv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifv_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIfvBytes() {
            Object obj = this.ifv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifv_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setIfv(String str) {
            if (str != null) {
                this.ifv_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearIfv() {
            this.ifv_ = SdkAnalyticContext.getDefaultInstance().getIfv();
            onChanged();
            return this;
        }

        public Builder setIfvBytes(ByteString byteString) {
            if (byteString != null) {
                SdkAnalyticContext.checkByteStringIsUtf8(byteString);
                this.ifv_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getBmIfv() {
            Object obj = this.bmIfv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bmIfv_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getBmIfvBytes() {
            Object obj = this.bmIfv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bmIfv_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setBmIfv(String str) {
            if (str != null) {
                this.bmIfv_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearBmIfv() {
            this.bmIfv_ = SdkAnalyticContext.getDefaultInstance().getBmIfv();
            onChanged();
            return this;
        }

        public Builder setBmIfvBytes(ByteString byteString) {
            if (byteString != null) {
                SdkAnalyticContext.checkByteStringIsUtf8(byteString);
                this.bmIfv_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public int getDeviceTypeValue() {
            return this.deviceType_;
        }

        public Builder setDeviceTypeValue(int i) {
            this.deviceType_ = i;
            onChanged();
            return this;
        }

        public DeviceType getDeviceType() {
            DeviceType valueOf = DeviceType.valueOf(this.deviceType_);
            return valueOf == null ? DeviceType.UNRECOGNIZED : valueOf;
        }

        public Builder setDeviceType(DeviceType deviceType) {
            if (deviceType != null) {
                this.deviceType_ = deviceType.getNumber();
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearDeviceType() {
            this.deviceType_ = 0;
            onChanged();
            return this;
        }

        public int getContypeValue() {
            return this.contype_;
        }

        public Builder setContypeValue(int i) {
            this.contype_ = i;
            onChanged();
            return this;
        }

        public ConnectionType getContype() {
            ConnectionType valueOf = ConnectionType.valueOf(this.contype_);
            return valueOf == null ? ConnectionType.UNRECOGNIZED : valueOf;
        }

        public Builder setContype(ConnectionType connectionType) {
            if (connectionType != null) {
                this.contype_ = connectionType.getNumber();
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearContype() {
            this.contype_ = 0;
            onChanged();
            return this;
        }

        public String getAppVer() {
            Object obj = this.appVer_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appVer_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAppVerBytes() {
            Object obj = this.appVer_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appVer_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setAppVer(String str) {
            if (str != null) {
                this.appVer_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearAppVer() {
            this.appVer_ = SdkAnalyticContext.getDefaultInstance().getAppVer();
            onChanged();
            return this;
        }

        public Builder setAppVerBytes(ByteString byteString) {
            if (byteString != null) {
                SdkAnalyticContext.checkByteStringIsUtf8(byteString);
                this.appVer_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getSessionId() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sessionId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setSessionId(String str) {
            if (str != null) {
                this.sessionId_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearSessionId() {
            this.sessionId_ = SdkAnalyticContext.getDefaultInstance().getSessionId();
            onChanged();
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            if (byteString != null) {
                SdkAnalyticContext.checkByteStringIsUtf8(byteString);
                this.sessionId_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getDcid() {
            Object obj = this.dcid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.dcid_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getDcidBytes() {
            Object obj = this.dcid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.dcid_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setDcid(String str) {
            if (str != null) {
                this.dcid_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearDcid() {
            this.dcid_ = SdkAnalyticContext.getDefaultInstance().getDcid();
            onChanged();
            return this;
        }

        public Builder setDcidBytes(ByteString byteString) {
            if (byteString != null) {
                SdkAnalyticContext.checkByteStringIsUtf8(byteString);
                this.dcid_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        public Struct getExt() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Builder setExt(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(struct);
            } else if (struct != null) {
                this.ext_ = struct;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setExt(Struct.Builder builder) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.ext_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeExt(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct2 = this.ext_;
                if (struct2 != null) {
                    this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.ext_ = struct;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(struct);
            }
            return this;
        }

        public Builder clearExt() {
            if (this.extBuilder_ == null) {
                this.ext_ = null;
                onChanged();
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            return this;
        }

        public Struct.Builder getExtBuilder() {
            onChanged();
            return getExtFieldBuilder().getBuilder();
        }

        public StructOrBuilder getExtOrBuilder() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static SdkAnalyticContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<SdkAnalyticContext> parser() {
        return PARSER;
    }

    public Parser<SdkAnalyticContext> getParserForType() {
        return PARSER;
    }

    public SdkAnalyticContext getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
