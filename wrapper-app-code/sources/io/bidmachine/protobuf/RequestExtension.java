package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.MapEntry;
import com.explorestack.protobuf.MapField;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

public final class RequestExtension extends GeneratedMessageV3 implements RequestExtensionOrBuilder {
    public static final int BM_IFV_FIELD_NUMBER = 5;
    private static final RequestExtension DEFAULT_INSTANCE = new RequestExtension();
    public static final int HEADER_BIDDING_TYPE_FIELD_NUMBER = 3;
    public static final int IFV_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final Parser<RequestExtension> PARSER = new AbstractParser<RequestExtension>() {
        public RequestExtension parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new RequestExtension(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int SELLER_DATA_FIELD_NUMBER = 2;
    public static final int SELLER_ID_FIELD_NUMBER = 1;
    public static final int SESSION_ID_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public volatile Object bmIfv_;
    /* access modifiers changed from: private */
    public int headerBiddingType_;
    /* access modifiers changed from: private */
    public volatile Object ifv_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public MapField<String, String> sellerData_;
    /* access modifiers changed from: private */
    public volatile Object sellerId_;
    /* access modifiers changed from: private */
    public volatile Object sessionId_;

    private RequestExtension(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private RequestExtension() {
        this.memoizedIsInitialized = -1;
        this.sellerId_ = "";
        this.headerBiddingType_ = 0;
        this.ifv_ = "";
        this.bmIfv_ = "";
        this.sessionId_ = "";
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new RequestExtension();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private RequestExtension(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            this.sellerId_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            if (!z2 || !true) {
                                this.sellerData_ = MapField.newMapField(SellerDataDefaultEntryHolder.defaultEntry);
                                z2 |= true;
                            }
                            MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(SellerDataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                            this.sellerData_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                        } else if (readTag == 24) {
                            this.headerBiddingType_ = codedInputStream.readEnum();
                        } else if (readTag == 34) {
                            this.ifv_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 42) {
                            this.bmIfv_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 50) {
                            this.sessionId_ = codedInputStream.readStringRequireUtf8();
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
        return ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_descriptor;
    }

    /* access modifiers changed from: protected */
    public MapField internalGetMapField(int i) {
        if (i == 2) {
            return internalGetSellerData();
        }
        throw new RuntimeException("Invalid map field number: " + i);
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestExtension.class, Builder.class);
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

    private static final class SellerDataDefaultEntryHolder {
        static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_SellerDataEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

        private SellerDataDefaultEntryHolder() {
        }
    }

    /* access modifiers changed from: private */
    public MapField<String, String> internalGetSellerData() {
        MapField<String, String> mapField = this.sellerData_;
        return mapField == null ? MapField.emptyMapField(SellerDataDefaultEntryHolder.defaultEntry) : mapField;
    }

    public int getSellerDataCount() {
        return internalGetSellerData().getMap().size();
    }

    public boolean containsSellerData(String str) {
        if (str != null) {
            return internalGetSellerData().getMap().containsKey(str);
        }
        throw null;
    }

    @Deprecated
    public Map<String, String> getSellerData() {
        return getSellerDataMap();
    }

    public Map<String, String> getSellerDataMap() {
        return internalGetSellerData().getMap();
    }

    public String getSellerDataOrDefault(String str, String str2) {
        if (str != null) {
            Map<String, String> map = internalGetSellerData().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }
        throw null;
    }

    public String getSellerDataOrThrow(String str) {
        if (str != null) {
            Map<String, String> map = internalGetSellerData().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException();
        }
        throw null;
    }

    public int getHeaderBiddingTypeValue() {
        return this.headerBiddingType_;
    }

    public HeaderBiddingType getHeaderBiddingType() {
        HeaderBiddingType valueOf = HeaderBiddingType.valueOf(this.headerBiddingType_);
        return valueOf == null ? HeaderBiddingType.UNRECOGNIZED : valueOf;
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
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetSellerData(), SellerDataDefaultEntryHolder.defaultEntry, 2);
        if (this.headerBiddingType_ != HeaderBiddingType.HEADER_BIDDING_TYPE_INVALID.getNumber()) {
            codedOutputStream.writeEnum(3, this.headerBiddingType_);
        }
        if (!getIfvBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.bmIfv_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.sessionId_);
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
        for (Map.Entry next : internalGetSellerData().getMap().entrySet()) {
            i2 += CodedOutputStream.computeMessageSize(2, SellerDataDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(next.getKey()).setValue(next.getValue()).build());
        }
        if (this.headerBiddingType_ != HeaderBiddingType.HEADER_BIDDING_TYPE_INVALID.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(3, this.headerBiddingType_);
        }
        if (!getIfvBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(4, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(5, this.bmIfv_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(6, this.sessionId_);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestExtension)) {
            return super.equals(obj);
        }
        RequestExtension requestExtension = (RequestExtension) obj;
        if (getSellerId().equals(requestExtension.getSellerId()) && internalGetSellerData().equals(requestExtension.internalGetSellerData()) && this.headerBiddingType_ == requestExtension.headerBiddingType_ && getIfv().equals(requestExtension.getIfv()) && getBmIfv().equals(requestExtension.getBmIfv()) && getSessionId().equals(requestExtension.getSessionId()) && this.unknownFields.equals(requestExtension.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSellerId().hashCode();
        if (!internalGetSellerData().getMap().isEmpty()) {
            hashCode = (((hashCode * 37) + 2) * 53) + internalGetSellerData().hashCode();
        }
        int hashCode2 = (((((((((((((((((hashCode * 37) + 3) * 53) + this.headerBiddingType_) * 37) + 4) * 53) + getIfv().hashCode()) * 37) + 5) * 53) + getBmIfv().hashCode()) * 37) + 6) * 53) + getSessionId().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static RequestExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static RequestExtension parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static RequestExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static RequestExtension parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static RequestExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static RequestExtension parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static RequestExtension parseFrom(InputStream inputStream) throws IOException {
        return (RequestExtension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static RequestExtension parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestExtension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RequestExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RequestExtension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RequestExtension parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestExtension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RequestExtension parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RequestExtension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static RequestExtension parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestExtension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RequestExtension requestExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(requestExtension);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RequestExtensionOrBuilder {
        private int bitField0_;
        private Object bmIfv_;
        private int headerBiddingType_;
        private Object ifv_;
        private MapField<String, String> sellerData_;
        private Object sellerId_;
        private Object sessionId_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_descriptor;
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMapField(int i) {
            if (i == 2) {
                return internalGetSellerData();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMutableMapField(int i) {
            if (i == 2) {
                return internalGetMutableSellerData();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestExtension.class, Builder.class);
        }

        private Builder() {
            this.sellerId_ = "";
            this.headerBiddingType_ = 0;
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.sessionId_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.sellerId_ = "";
            this.headerBiddingType_ = 0;
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.sessionId_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = RequestExtension.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.sellerId_ = "";
            internalGetMutableSellerData().clear();
            this.headerBiddingType_ = 0;
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.sessionId_ = "";
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_RequestExtension_descriptor;
        }

        public RequestExtension getDefaultInstanceForType() {
            return RequestExtension.getDefaultInstance();
        }

        public RequestExtension build() {
            RequestExtension buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public RequestExtension buildPartial() {
            RequestExtension requestExtension = new RequestExtension((GeneratedMessageV3.Builder) this);
            Object unused = requestExtension.sellerId_ = this.sellerId_;
            MapField unused2 = requestExtension.sellerData_ = internalGetSellerData();
            requestExtension.sellerData_.makeImmutable();
            int unused3 = requestExtension.headerBiddingType_ = this.headerBiddingType_;
            Object unused4 = requestExtension.ifv_ = this.ifv_;
            Object unused5 = requestExtension.bmIfv_ = this.bmIfv_;
            Object unused6 = requestExtension.sessionId_ = this.sessionId_;
            onBuilt();
            return requestExtension;
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
            if (message instanceof RequestExtension) {
                return mergeFrom((RequestExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(RequestExtension requestExtension) {
            if (requestExtension == RequestExtension.getDefaultInstance()) {
                return this;
            }
            if (!requestExtension.getSellerId().isEmpty()) {
                this.sellerId_ = requestExtension.sellerId_;
                onChanged();
            }
            internalGetMutableSellerData().mergeFrom(requestExtension.internalGetSellerData());
            if (requestExtension.headerBiddingType_ != 0) {
                setHeaderBiddingTypeValue(requestExtension.getHeaderBiddingTypeValue());
            }
            if (!requestExtension.getIfv().isEmpty()) {
                this.ifv_ = requestExtension.ifv_;
                onChanged();
            }
            if (!requestExtension.getBmIfv().isEmpty()) {
                this.bmIfv_ = requestExtension.bmIfv_;
                onChanged();
            }
            if (!requestExtension.getSessionId().isEmpty()) {
                this.sessionId_ = requestExtension.sessionId_;
                onChanged();
            }
            mergeUnknownFields(requestExtension.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.RequestExtension.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.RequestExtension.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.RequestExtension r3 = (io.bidmachine.protobuf.RequestExtension) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.RequestExtension) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.RequestExtension r4 = (io.bidmachine.protobuf.RequestExtension) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.RequestExtension) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RequestExtension.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.RequestExtension$Builder");
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
            this.sellerId_ = RequestExtension.getDefaultInstance().getSellerId();
            onChanged();
            return this;
        }

        public Builder setSellerIdBytes(ByteString byteString) {
            if (byteString != null) {
                RequestExtension.checkByteStringIsUtf8(byteString);
                this.sellerId_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        private MapField<String, String> internalGetSellerData() {
            MapField<String, String> mapField = this.sellerData_;
            return mapField == null ? MapField.emptyMapField(SellerDataDefaultEntryHolder.defaultEntry) : mapField;
        }

        private MapField<String, String> internalGetMutableSellerData() {
            onChanged();
            if (this.sellerData_ == null) {
                this.sellerData_ = MapField.newMapField(SellerDataDefaultEntryHolder.defaultEntry);
            }
            if (!this.sellerData_.isMutable()) {
                this.sellerData_ = this.sellerData_.copy();
            }
            return this.sellerData_;
        }

        public int getSellerDataCount() {
            return internalGetSellerData().getMap().size();
        }

        public boolean containsSellerData(String str) {
            if (str != null) {
                return internalGetSellerData().getMap().containsKey(str);
            }
            throw null;
        }

        @Deprecated
        public Map<String, String> getSellerData() {
            return getSellerDataMap();
        }

        public Map<String, String> getSellerDataMap() {
            return internalGetSellerData().getMap();
        }

        public String getSellerDataOrDefault(String str, String str2) {
            if (str != null) {
                Map<String, String> map = internalGetSellerData().getMap();
                return map.containsKey(str) ? map.get(str) : str2;
            }
            throw null;
        }

        public String getSellerDataOrThrow(String str) {
            if (str != null) {
                Map<String, String> map = internalGetSellerData().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                throw new IllegalArgumentException();
            }
            throw null;
        }

        public Builder clearSellerData() {
            internalGetMutableSellerData().getMutableMap().clear();
            return this;
        }

        public Builder removeSellerData(String str) {
            if (str != null) {
                internalGetMutableSellerData().getMutableMap().remove(str);
                return this;
            }
            throw null;
        }

        @Deprecated
        public Map<String, String> getMutableSellerData() {
            return internalGetMutableSellerData().getMutableMap();
        }

        public Builder putSellerData(String str, String str2) {
            if (str == null) {
                throw null;
            } else if (str2 != null) {
                internalGetMutableSellerData().getMutableMap().put(str, str2);
                return this;
            } else {
                throw null;
            }
        }

        public Builder putAllSellerData(Map<String, String> map) {
            internalGetMutableSellerData().getMutableMap().putAll(map);
            return this;
        }

        public int getHeaderBiddingTypeValue() {
            return this.headerBiddingType_;
        }

        public Builder setHeaderBiddingTypeValue(int i) {
            this.headerBiddingType_ = i;
            onChanged();
            return this;
        }

        public HeaderBiddingType getHeaderBiddingType() {
            HeaderBiddingType valueOf = HeaderBiddingType.valueOf(this.headerBiddingType_);
            return valueOf == null ? HeaderBiddingType.UNRECOGNIZED : valueOf;
        }

        public Builder setHeaderBiddingType(HeaderBiddingType headerBiddingType) {
            if (headerBiddingType != null) {
                this.headerBiddingType_ = headerBiddingType.getNumber();
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearHeaderBiddingType() {
            this.headerBiddingType_ = 0;
            onChanged();
            return this;
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
            this.ifv_ = RequestExtension.getDefaultInstance().getIfv();
            onChanged();
            return this;
        }

        public Builder setIfvBytes(ByteString byteString) {
            if (byteString != null) {
                RequestExtension.checkByteStringIsUtf8(byteString);
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
            this.bmIfv_ = RequestExtension.getDefaultInstance().getBmIfv();
            onChanged();
            return this;
        }

        public Builder setBmIfvBytes(ByteString byteString) {
            if (byteString != null) {
                RequestExtension.checkByteStringIsUtf8(byteString);
                this.bmIfv_ = byteString;
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
            this.sessionId_ = RequestExtension.getDefaultInstance().getSessionId();
            onChanged();
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            if (byteString != null) {
                RequestExtension.checkByteStringIsUtf8(byteString);
                this.sessionId_ = byteString;
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

    public static RequestExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RequestExtension> parser() {
        return PARSER;
    }

    public Parser<RequestExtension> getParserForType() {
        return PARSER;
    }

    public RequestExtension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
