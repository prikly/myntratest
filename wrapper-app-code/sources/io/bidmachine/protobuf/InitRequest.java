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

public final class InitRequest extends GeneratedMessageV3 implements InitRequestOrBuilder {
    public static final int APP_VER_FIELD_NUMBER = 13;
    public static final int BM_IFV_FIELD_NUMBER = 12;
    public static final int BUNDLE_FIELD_NUMBER = 2;
    public static final int CONTYPE_FIELD_NUMBER = 10;
    private static final InitRequest DEFAULT_INSTANCE = new InitRequest();
    public static final int DEVICE_TYPE_FIELD_NUMBER = 9;
    public static final int EXT_FIELD_NUMBER = 15;
    public static final int GEO_FIELD_NUMBER = 5;
    public static final int IFA_FIELD_NUMBER = 8;
    public static final int IFV_FIELD_NUMBER = 11;
    public static final int OSV_FIELD_NUMBER = 4;
    public static final int OS_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final Parser<InitRequest> PARSER = new AbstractParser<InitRequest>() {
        public InitRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new InitRequest(codedInputStream, extensionRegistryLite);
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

    private InitRequest(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private InitRequest() {
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
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new InitRequest();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private InitRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
        return InitProto.internal_static_bidmachine_protobuf_InitRequest_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_InitRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(InitRequest.class, Builder.class);
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
        if (this.ext_ != null) {
            codedOutputStream.writeMessage(15, getExt());
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
        if (this.ext_ != null) {
            i2 += CodedOutputStream.computeMessageSize(15, getExt());
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitRequest)) {
            return super.equals(obj);
        }
        InitRequest initRequest = (InitRequest) obj;
        if (!getSellerId().equals(initRequest.getSellerId()) || !getBundle().equals(initRequest.getBundle()) || this.os_ != initRequest.os_ || !getOsv().equals(initRequest.getOsv()) || hasGeo() != initRequest.hasGeo()) {
            return false;
        }
        if ((hasGeo() && !getGeo().equals(initRequest.getGeo())) || !getSdk().equals(initRequest.getSdk()) || !getSdkver().equals(initRequest.getSdkver()) || !getIfa().equals(initRequest.getIfa()) || !getIfv().equals(initRequest.getIfv()) || !getBmIfv().equals(initRequest.getBmIfv()) || this.deviceType_ != initRequest.deviceType_ || this.contype_ != initRequest.contype_ || !getAppVer().equals(initRequest.getAppVer()) || !getSessionId().equals(initRequest.getSessionId()) || hasExt() != initRequest.hasExt()) {
            return false;
        }
        if ((!hasExt() || getExt().equals(initRequest.getExt())) && this.unknownFields.equals(initRequest.unknownFields)) {
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
        int hashCode2 = (((((((((((((((((((((((((((((((((((hashCode * 37) + 6) * 53) + getSdk().hashCode()) * 37) + 7) * 53) + getSdkver().hashCode()) * 37) + 8) * 53) + getIfa().hashCode()) * 37) + 11) * 53) + getIfv().hashCode()) * 37) + 12) * 53) + getBmIfv().hashCode()) * 37) + 9) * 53) + this.deviceType_) * 37) + 10) * 53) + this.contype_) * 37) + 13) * 53) + getAppVer().hashCode()) * 37) + 14) * 53) + getSessionId().hashCode();
        if (hasExt()) {
            hashCode2 = (((hashCode2 * 37) + 15) * 53) + getExt().hashCode();
        }
        int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode3;
        return hashCode3;
    }

    public static InitRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static InitRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static InitRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static InitRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static InitRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static InitRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static InitRequest parseFrom(InputStream inputStream) throws IOException {
        return (InitRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static InitRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InitRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static InitRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InitRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static InitRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InitRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static InitRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (InitRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static InitRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InitRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(InitRequest initRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(initRequest);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InitRequestOrBuilder {
        private Object appVer_;
        private Object bmIfv_;
        private Object bundle_;
        private int contype_;
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
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(InitRequest.class, Builder.class);
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
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = InitRequest.alwaysUseFieldBuilders;
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
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_descriptor;
        }

        public InitRequest getDefaultInstanceForType() {
            return InitRequest.getDefaultInstance();
        }

        public InitRequest build() {
            InitRequest buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public InitRequest buildPartial() {
            InitRequest initRequest = new InitRequest((GeneratedMessageV3.Builder) this);
            Object unused = initRequest.sellerId_ = this.sellerId_;
            Object unused2 = initRequest.bundle_ = this.bundle_;
            int unused3 = initRequest.os_ = this.os_;
            Object unused4 = initRequest.osv_ = this.osv_;
            SingleFieldBuilderV3<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
            if (singleFieldBuilderV3 == null) {
                Context.Geo unused5 = initRequest.geo_ = this.geo_;
            } else {
                Context.Geo unused6 = initRequest.geo_ = singleFieldBuilderV3.build();
            }
            Object unused7 = initRequest.sdk_ = this.sdk_;
            Object unused8 = initRequest.sdkver_ = this.sdkver_;
            Object unused9 = initRequest.ifa_ = this.ifa_;
            Object unused10 = initRequest.ifv_ = this.ifv_;
            Object unused11 = initRequest.bmIfv_ = this.bmIfv_;
            int unused12 = initRequest.deviceType_ = this.deviceType_;
            int unused13 = initRequest.contype_ = this.contype_;
            Object unused14 = initRequest.appVer_ = this.appVer_;
            Object unused15 = initRequest.sessionId_ = this.sessionId_;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.extBuilder_;
            if (singleFieldBuilderV32 == null) {
                Struct unused16 = initRequest.ext_ = this.ext_;
            } else {
                Struct unused17 = initRequest.ext_ = singleFieldBuilderV32.build();
            }
            onBuilt();
            return initRequest;
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
            if (message instanceof InitRequest) {
                return mergeFrom((InitRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(InitRequest initRequest) {
            if (initRequest == InitRequest.getDefaultInstance()) {
                return this;
            }
            if (!initRequest.getSellerId().isEmpty()) {
                this.sellerId_ = initRequest.sellerId_;
                onChanged();
            }
            if (!initRequest.getBundle().isEmpty()) {
                this.bundle_ = initRequest.bundle_;
                onChanged();
            }
            if (initRequest.os_ != 0) {
                setOsValue(initRequest.getOsValue());
            }
            if (!initRequest.getOsv().isEmpty()) {
                this.osv_ = initRequest.osv_;
                onChanged();
            }
            if (initRequest.hasGeo()) {
                mergeGeo(initRequest.getGeo());
            }
            if (!initRequest.getSdk().isEmpty()) {
                this.sdk_ = initRequest.sdk_;
                onChanged();
            }
            if (!initRequest.getSdkver().isEmpty()) {
                this.sdkver_ = initRequest.sdkver_;
                onChanged();
            }
            if (!initRequest.getIfa().isEmpty()) {
                this.ifa_ = initRequest.ifa_;
                onChanged();
            }
            if (!initRequest.getIfv().isEmpty()) {
                this.ifv_ = initRequest.ifv_;
                onChanged();
            }
            if (!initRequest.getBmIfv().isEmpty()) {
                this.bmIfv_ = initRequest.bmIfv_;
                onChanged();
            }
            if (initRequest.deviceType_ != 0) {
                setDeviceTypeValue(initRequest.getDeviceTypeValue());
            }
            if (initRequest.contype_ != 0) {
                setContypeValue(initRequest.getContypeValue());
            }
            if (!initRequest.getAppVer().isEmpty()) {
                this.appVer_ = initRequest.appVer_;
                onChanged();
            }
            if (!initRequest.getSessionId().isEmpty()) {
                this.sessionId_ = initRequest.sessionId_;
                onChanged();
            }
            if (initRequest.hasExt()) {
                mergeExt(initRequest.getExt());
            }
            mergeUnknownFields(initRequest.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.InitRequest.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.InitRequest.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.InitRequest r3 = (io.bidmachine.protobuf.InitRequest) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.InitRequest) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.InitRequest r4 = (io.bidmachine.protobuf.InitRequest) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.InitRequest) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.InitRequest.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.InitRequest$Builder");
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
            this.sellerId_ = InitRequest.getDefaultInstance().getSellerId();
            onChanged();
            return this;
        }

        public Builder setSellerIdBytes(ByteString byteString) {
            if (byteString != null) {
                InitRequest.checkByteStringIsUtf8(byteString);
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
            this.bundle_ = InitRequest.getDefaultInstance().getBundle();
            onChanged();
            return this;
        }

        public Builder setBundleBytes(ByteString byteString) {
            if (byteString != null) {
                InitRequest.checkByteStringIsUtf8(byteString);
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
            this.osv_ = InitRequest.getDefaultInstance().getOsv();
            onChanged();
            return this;
        }

        public Builder setOsvBytes(ByteString byteString) {
            if (byteString != null) {
                InitRequest.checkByteStringIsUtf8(byteString);
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
            this.sdk_ = InitRequest.getDefaultInstance().getSdk();
            onChanged();
            return this;
        }

        public Builder setSdkBytes(ByteString byteString) {
            if (byteString != null) {
                InitRequest.checkByteStringIsUtf8(byteString);
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
            this.sdkver_ = InitRequest.getDefaultInstance().getSdkver();
            onChanged();
            return this;
        }

        public Builder setSdkverBytes(ByteString byteString) {
            if (byteString != null) {
                InitRequest.checkByteStringIsUtf8(byteString);
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
            this.ifa_ = InitRequest.getDefaultInstance().getIfa();
            onChanged();
            return this;
        }

        public Builder setIfaBytes(ByteString byteString) {
            if (byteString != null) {
                InitRequest.checkByteStringIsUtf8(byteString);
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
            this.ifv_ = InitRequest.getDefaultInstance().getIfv();
            onChanged();
            return this;
        }

        public Builder setIfvBytes(ByteString byteString) {
            if (byteString != null) {
                InitRequest.checkByteStringIsUtf8(byteString);
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
            this.bmIfv_ = InitRequest.getDefaultInstance().getBmIfv();
            onChanged();
            return this;
        }

        public Builder setBmIfvBytes(ByteString byteString) {
            if (byteString != null) {
                InitRequest.checkByteStringIsUtf8(byteString);
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
            this.appVer_ = InitRequest.getDefaultInstance().getAppVer();
            onChanged();
            return this;
        }

        public Builder setAppVerBytes(ByteString byteString) {
            if (byteString != null) {
                InitRequest.checkByteStringIsUtf8(byteString);
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
            this.sessionId_ = InitRequest.getDefaultInstance().getSessionId();
            onChanged();
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            if (byteString != null) {
                InitRequest.checkByteStringIsUtf8(byteString);
                this.sessionId_ = byteString;
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

    public static InitRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<InitRequest> parser() {
        return PARSER;
    }

    public Parser<InitRequest> getParserForType() {
        return PARSER;
    }

    public InitRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
