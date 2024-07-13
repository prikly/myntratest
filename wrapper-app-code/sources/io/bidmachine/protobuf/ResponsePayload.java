package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessageLite;
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
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.TimestampOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.PlacementOrBuilder;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.OpenrtbOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ResponsePayload extends GeneratedMessageV3 implements ResponsePayloadOrBuilder {
    public static final int CACHE_TIME_FIELD_NUMBER = 1;
    private static final ResponsePayload DEFAULT_INSTANCE = new ResponsePayload();
    /* access modifiers changed from: private */
    public static final Parser<ResponsePayload> PARSER = new AbstractParser<ResponsePayload>() {
        public ResponsePayload parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new ResponsePayload(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int REQUEST_ITEM_SPEC_FIELD_NUMBER = 4;
    public static final int RESPONSE_CACHE_FIELD_NUMBER = 3;
    public static final int RESPONSE_CACHE_URL_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public Timestamp cacheTime_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public int payloadOneofCase_;
    /* access modifiers changed from: private */
    public Object payloadOneof_;
    /* access modifiers changed from: private */
    public Placement requestItemSpec_;

    private ResponsePayload(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.payloadOneofCase_ = 0;
        this.memoizedIsInitialized = -1;
    }

    private ResponsePayload() {
        this.payloadOneofCase_ = 0;
        this.memoizedIsInitialized = -1;
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ResponsePayload();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private ResponsePayload(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            Timestamp.Builder builder = this.cacheTime_ != null ? this.cacheTime_.toBuilder() : null;
                            Timestamp timestamp = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            this.cacheTime_ = timestamp;
                            if (builder != null) {
                                builder.mergeFrom(timestamp);
                                this.cacheTime_ = builder.buildPartial();
                            }
                        } else if (readTag == 18) {
                            String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                            this.payloadOneofCase_ = 2;
                            this.payloadOneof_ = readStringRequireUtf8;
                        } else if (readTag == 26) {
                            Openrtb.Builder builder2 = this.payloadOneofCase_ == 3 ? ((Openrtb) this.payloadOneof_).toBuilder() : null;
                            MessageLite readMessage = codedInputStream.readMessage(Openrtb.parser(), extensionRegistryLite);
                            this.payloadOneof_ = readMessage;
                            if (builder2 != null) {
                                builder2.mergeFrom((Openrtb) readMessage);
                                this.payloadOneof_ = builder2.buildPartial();
                            }
                            this.payloadOneofCase_ = 3;
                        } else if (readTag == 34) {
                            Placement.Builder builder3 = this.requestItemSpec_ != null ? this.requestItemSpec_.toBuilder() : null;
                            Placement placement = (Placement) codedInputStream.readMessage(Placement.parser(), extensionRegistryLite);
                            this.requestItemSpec_ = placement;
                            if (builder3 != null) {
                                builder3.mergeFrom(placement);
                                this.requestItemSpec_ = builder3.buildPartial();
                            }
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
        return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_fieldAccessorTable.ensureFieldAccessorsInitialized(ResponsePayload.class, Builder.class);
    }

    public enum PayloadOneofCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
        RESPONSE_CACHE_URL(2),
        RESPONSE_CACHE(3),
        PAYLOADONEOF_NOT_SET(0);
        
        private final int value;

        private PayloadOneofCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static PayloadOneofCase valueOf(int i) {
            return forNumber(i);
        }

        public static PayloadOneofCase forNumber(int i) {
            if (i == 0) {
                return PAYLOADONEOF_NOT_SET;
            }
            if (i == 2) {
                return RESPONSE_CACHE_URL;
            }
            if (i != 3) {
                return null;
            }
            return RESPONSE_CACHE;
        }

        public int getNumber() {
            return this.value;
        }
    }

    public PayloadOneofCase getPayloadOneofCase() {
        return PayloadOneofCase.forNumber(this.payloadOneofCase_);
    }

    public boolean hasCacheTime() {
        return this.cacheTime_ != null;
    }

    public Timestamp getCacheTime() {
        Timestamp timestamp = this.cacheTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public TimestampOrBuilder getCacheTimeOrBuilder() {
        return getCacheTime();
    }

    public boolean hasRequestItemSpec() {
        return this.requestItemSpec_ != null;
    }

    public Placement getRequestItemSpec() {
        Placement placement = this.requestItemSpec_;
        return placement == null ? Placement.getDefaultInstance() : placement;
    }

    public PlacementOrBuilder getRequestItemSpecOrBuilder() {
        return getRequestItemSpec();
    }

    public boolean hasResponseCacheUrl() {
        return this.payloadOneofCase_ == 2;
    }

    public String getResponseCacheUrl() {
        String str = this.payloadOneofCase_ == 2 ? this.payloadOneof_ : "";
        if (str instanceof String) {
            return (String) str;
        }
        String stringUtf8 = ((ByteString) str).toStringUtf8();
        if (this.payloadOneofCase_ == 2) {
            this.payloadOneof_ = stringUtf8;
        }
        return stringUtf8;
    }

    public ByteString getResponseCacheUrlBytes() {
        String str = this.payloadOneofCase_ == 2 ? this.payloadOneof_ : "";
        if (!(str instanceof String)) {
            return (ByteString) str;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) str);
        if (this.payloadOneofCase_ == 2) {
            this.payloadOneof_ = copyFromUtf8;
        }
        return copyFromUtf8;
    }

    public boolean hasResponseCache() {
        return this.payloadOneofCase_ == 3;
    }

    public Openrtb getResponseCache() {
        if (this.payloadOneofCase_ == 3) {
            return (Openrtb) this.payloadOneof_;
        }
        return Openrtb.getDefaultInstance();
    }

    public OpenrtbOrBuilder getResponseCacheOrBuilder() {
        if (this.payloadOneofCase_ == 3) {
            return (Openrtb) this.payloadOneof_;
        }
        return Openrtb.getDefaultInstance();
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
        if (this.cacheTime_ != null) {
            codedOutputStream.writeMessage(1, getCacheTime());
        }
        if (this.payloadOneofCase_ == 2) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.payloadOneof_);
        }
        if (this.payloadOneofCase_ == 3) {
            codedOutputStream.writeMessage(3, (Openrtb) this.payloadOneof_);
        }
        if (this.requestItemSpec_ != null) {
            codedOutputStream.writeMessage(4, getRequestItemSpec());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.cacheTime_ != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getCacheTime());
        }
        if (this.payloadOneofCase_ == 2) {
            i2 += GeneratedMessageV3.computeStringSize(2, this.payloadOneof_);
        }
        if (this.payloadOneofCase_ == 3) {
            i2 += CodedOutputStream.computeMessageSize(3, (Openrtb) this.payloadOneof_);
        }
        if (this.requestItemSpec_ != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getRequestItemSpec());
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResponsePayload)) {
            return super.equals(obj);
        }
        ResponsePayload responsePayload = (ResponsePayload) obj;
        if (hasCacheTime() != responsePayload.hasCacheTime()) {
            return false;
        }
        if ((hasCacheTime() && !getCacheTime().equals(responsePayload.getCacheTime())) || hasRequestItemSpec() != responsePayload.hasRequestItemSpec()) {
            return false;
        }
        if ((hasRequestItemSpec() && !getRequestItemSpec().equals(responsePayload.getRequestItemSpec())) || !getPayloadOneofCase().equals(responsePayload.getPayloadOneofCase())) {
            return false;
        }
        int i = this.payloadOneofCase_;
        if (i != 2) {
            if (i == 3 && !getResponseCache().equals(responsePayload.getResponseCache())) {
                return false;
            }
        } else if (!getResponseCacheUrl().equals(responsePayload.getResponseCacheUrl())) {
            return false;
        }
        if (!this.unknownFields.equals(responsePayload.unknownFields)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasCacheTime()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getCacheTime().hashCode();
        }
        if (hasRequestItemSpec()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getRequestItemSpec().hashCode();
        }
        int i3 = this.payloadOneofCase_;
        if (i3 != 2) {
            if (i3 == 3) {
                i2 = ((hashCode * 37) + 3) * 53;
                i = getResponseCache().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }
        i2 = ((hashCode * 37) + 2) * 53;
        i = getResponseCacheUrl().hashCode();
        hashCode = i2 + i;
        int hashCode22 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode22;
        return hashCode22;
    }

    public static ResponsePayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static ResponsePayload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ResponsePayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static ResponsePayload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ResponsePayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static ResponsePayload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ResponsePayload parseFrom(InputStream inputStream) throws IOException {
        return (ResponsePayload) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ResponsePayload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponsePayload) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ResponsePayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResponsePayload) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ResponsePayload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponsePayload) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ResponsePayload parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResponsePayload) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ResponsePayload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponsePayload) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ResponsePayload responsePayload) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(responsePayload);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResponsePayloadOrBuilder {
        private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> cacheTimeBuilder_;
        private Timestamp cacheTime_;
        private int payloadOneofCase_;
        private Object payloadOneof_;
        private SingleFieldBuilderV3<Placement, Placement.Builder, PlacementOrBuilder> requestItemSpecBuilder_;
        private Placement requestItemSpec_;
        private SingleFieldBuilderV3<Openrtb, Openrtb.Builder, OpenrtbOrBuilder> responseCacheBuilder_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_fieldAccessorTable.ensureFieldAccessorsInitialized(ResponsePayload.class, Builder.class);
        }

        private Builder() {
            this.payloadOneofCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.payloadOneofCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = ResponsePayload.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            if (this.cacheTimeBuilder_ == null) {
                this.cacheTime_ = null;
            } else {
                this.cacheTime_ = null;
                this.cacheTimeBuilder_ = null;
            }
            if (this.requestItemSpecBuilder_ == null) {
                this.requestItemSpec_ = null;
            } else {
                this.requestItemSpec_ = null;
                this.requestItemSpecBuilder_ = null;
            }
            this.payloadOneofCase_ = 0;
            this.payloadOneof_ = null;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_descriptor;
        }

        public ResponsePayload getDefaultInstanceForType() {
            return ResponsePayload.getDefaultInstance();
        }

        public ResponsePayload build() {
            ResponsePayload buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public ResponsePayload buildPartial() {
            ResponsePayload responsePayload = new ResponsePayload((GeneratedMessageV3.Builder) this);
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.cacheTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp unused = responsePayload.cacheTime_ = this.cacheTime_;
            } else {
                Timestamp unused2 = responsePayload.cacheTime_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<Placement, Placement.Builder, PlacementOrBuilder> singleFieldBuilderV32 = this.requestItemSpecBuilder_;
            if (singleFieldBuilderV32 == null) {
                Placement unused3 = responsePayload.requestItemSpec_ = this.requestItemSpec_;
            } else {
                Placement unused4 = responsePayload.requestItemSpec_ = singleFieldBuilderV32.build();
            }
            if (this.payloadOneofCase_ == 2) {
                Object unused5 = responsePayload.payloadOneof_ = this.payloadOneof_;
            }
            if (this.payloadOneofCase_ == 3) {
                SingleFieldBuilderV3<Openrtb, Openrtb.Builder, OpenrtbOrBuilder> singleFieldBuilderV33 = this.responseCacheBuilder_;
                if (singleFieldBuilderV33 == null) {
                    Object unused6 = responsePayload.payloadOneof_ = this.payloadOneof_;
                } else {
                    Object unused7 = responsePayload.payloadOneof_ = singleFieldBuilderV33.build();
                }
            }
            int unused8 = responsePayload.payloadOneofCase_ = this.payloadOneofCase_;
            onBuilt();
            return responsePayload;
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
            if (message instanceof ResponsePayload) {
                return mergeFrom((ResponsePayload) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ResponsePayload responsePayload) {
            if (responsePayload == ResponsePayload.getDefaultInstance()) {
                return this;
            }
            if (responsePayload.hasCacheTime()) {
                mergeCacheTime(responsePayload.getCacheTime());
            }
            if (responsePayload.hasRequestItemSpec()) {
                mergeRequestItemSpec(responsePayload.getRequestItemSpec());
            }
            int i = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase[responsePayload.getPayloadOneofCase().ordinal()];
            if (i == 1) {
                this.payloadOneofCase_ = 2;
                this.payloadOneof_ = responsePayload.payloadOneof_;
                onChanged();
            } else if (i == 2) {
                mergeResponseCache(responsePayload.getResponseCache());
            }
            mergeUnknownFields(responsePayload.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.ResponsePayload.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.ResponsePayload.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.ResponsePayload r3 = (io.bidmachine.protobuf.ResponsePayload) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.ResponsePayload) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.ResponsePayload r4 = (io.bidmachine.protobuf.ResponsePayload) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.ResponsePayload) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.ResponsePayload.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.ResponsePayload$Builder");
        }

        public PayloadOneofCase getPayloadOneofCase() {
            return PayloadOneofCase.forNumber(this.payloadOneofCase_);
        }

        public Builder clearPayloadOneof() {
            this.payloadOneofCase_ = 0;
            this.payloadOneof_ = null;
            onChanged();
            return this;
        }

        public boolean hasCacheTime() {
            return (this.cacheTimeBuilder_ == null && this.cacheTime_ == null) ? false : true;
        }

        public Timestamp getCacheTime() {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.cacheTimeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Timestamp timestamp = this.cacheTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Builder setCacheTime(Timestamp timestamp) {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.cacheTimeBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(timestamp);
            } else if (timestamp != null) {
                this.cacheTime_ = timestamp;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setCacheTime(Timestamp.Builder builder) {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.cacheTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.cacheTime_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeCacheTime(Timestamp timestamp) {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.cacheTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp2 = this.cacheTime_;
                if (timestamp2 != null) {
                    this.cacheTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.cacheTime_ = timestamp;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(timestamp);
            }
            return this;
        }

        public Builder clearCacheTime() {
            if (this.cacheTimeBuilder_ == null) {
                this.cacheTime_ = null;
                onChanged();
            } else {
                this.cacheTime_ = null;
                this.cacheTimeBuilder_ = null;
            }
            return this;
        }

        public Timestamp.Builder getCacheTimeBuilder() {
            onChanged();
            return getCacheTimeFieldBuilder().getBuilder();
        }

        public TimestampOrBuilder getCacheTimeOrBuilder() {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.cacheTimeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Timestamp timestamp = this.cacheTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getCacheTimeFieldBuilder() {
            if (this.cacheTimeBuilder_ == null) {
                this.cacheTimeBuilder_ = new SingleFieldBuilderV3<>(getCacheTime(), getParentForChildren(), isClean());
                this.cacheTime_ = null;
            }
            return this.cacheTimeBuilder_;
        }

        public boolean hasRequestItemSpec() {
            return (this.requestItemSpecBuilder_ == null && this.requestItemSpec_ == null) ? false : true;
        }

        public Placement getRequestItemSpec() {
            SingleFieldBuilderV3<Placement, Placement.Builder, PlacementOrBuilder> singleFieldBuilderV3 = this.requestItemSpecBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Placement placement = this.requestItemSpec_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        public Builder setRequestItemSpec(Placement placement) {
            SingleFieldBuilderV3<Placement, Placement.Builder, PlacementOrBuilder> singleFieldBuilderV3 = this.requestItemSpecBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(placement);
            } else if (placement != null) {
                this.requestItemSpec_ = placement;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setRequestItemSpec(Placement.Builder builder) {
            SingleFieldBuilderV3<Placement, Placement.Builder, PlacementOrBuilder> singleFieldBuilderV3 = this.requestItemSpecBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.requestItemSpec_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeRequestItemSpec(Placement placement) {
            SingleFieldBuilderV3<Placement, Placement.Builder, PlacementOrBuilder> singleFieldBuilderV3 = this.requestItemSpecBuilder_;
            if (singleFieldBuilderV3 == null) {
                Placement placement2 = this.requestItemSpec_;
                if (placement2 != null) {
                    this.requestItemSpec_ = Placement.newBuilder(placement2).mergeFrom(placement).buildPartial();
                } else {
                    this.requestItemSpec_ = placement;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(placement);
            }
            return this;
        }

        public Builder clearRequestItemSpec() {
            if (this.requestItemSpecBuilder_ == null) {
                this.requestItemSpec_ = null;
                onChanged();
            } else {
                this.requestItemSpec_ = null;
                this.requestItemSpecBuilder_ = null;
            }
            return this;
        }

        public Placement.Builder getRequestItemSpecBuilder() {
            onChanged();
            return getRequestItemSpecFieldBuilder().getBuilder();
        }

        public PlacementOrBuilder getRequestItemSpecOrBuilder() {
            SingleFieldBuilderV3<Placement, Placement.Builder, PlacementOrBuilder> singleFieldBuilderV3 = this.requestItemSpecBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Placement placement = this.requestItemSpec_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        private SingleFieldBuilderV3<Placement, Placement.Builder, PlacementOrBuilder> getRequestItemSpecFieldBuilder() {
            if (this.requestItemSpecBuilder_ == null) {
                this.requestItemSpecBuilder_ = new SingleFieldBuilderV3<>(getRequestItemSpec(), getParentForChildren(), isClean());
                this.requestItemSpec_ = null;
            }
            return this.requestItemSpecBuilder_;
        }

        public boolean hasResponseCacheUrl() {
            return this.payloadOneofCase_ == 2;
        }

        public String getResponseCacheUrl() {
            String str = this.payloadOneofCase_ == 2 ? this.payloadOneof_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            String stringUtf8 = ((ByteString) str).toStringUtf8();
            if (this.payloadOneofCase_ == 2) {
                this.payloadOneof_ = stringUtf8;
            }
            return stringUtf8;
        }

        public ByteString getResponseCacheUrlBytes() {
            String str = this.payloadOneofCase_ == 2 ? this.payloadOneof_ : "";
            if (!(str instanceof String)) {
                return (ByteString) str;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) str);
            if (this.payloadOneofCase_ == 2) {
                this.payloadOneof_ = copyFromUtf8;
            }
            return copyFromUtf8;
        }

        public Builder setResponseCacheUrl(String str) {
            if (str != null) {
                this.payloadOneofCase_ = 2;
                this.payloadOneof_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearResponseCacheUrl() {
            if (this.payloadOneofCase_ == 2) {
                this.payloadOneofCase_ = 0;
                this.payloadOneof_ = null;
                onChanged();
            }
            return this;
        }

        public Builder setResponseCacheUrlBytes(ByteString byteString) {
            if (byteString != null) {
                ResponsePayload.checkByteStringIsUtf8(byteString);
                this.payloadOneofCase_ = 2;
                this.payloadOneof_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public boolean hasResponseCache() {
            return this.payloadOneofCase_ == 3;
        }

        public Openrtb getResponseCache() {
            SingleFieldBuilderV3<Openrtb, Openrtb.Builder, OpenrtbOrBuilder> singleFieldBuilderV3 = this.responseCacheBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadOneofCase_ == 3) {
                    return (Openrtb) this.payloadOneof_;
                }
                return Openrtb.getDefaultInstance();
            } else if (this.payloadOneofCase_ == 3) {
                return singleFieldBuilderV3.getMessage();
            } else {
                return Openrtb.getDefaultInstance();
            }
        }

        public Builder setResponseCache(Openrtb openrtb) {
            SingleFieldBuilderV3<Openrtb, Openrtb.Builder, OpenrtbOrBuilder> singleFieldBuilderV3 = this.responseCacheBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(openrtb);
            } else if (openrtb != null) {
                this.payloadOneof_ = openrtb;
                onChanged();
            } else {
                throw null;
            }
            this.payloadOneofCase_ = 3;
            return this;
        }

        public Builder setResponseCache(Openrtb.Builder builder) {
            SingleFieldBuilderV3<Openrtb, Openrtb.Builder, OpenrtbOrBuilder> singleFieldBuilderV3 = this.responseCacheBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.payloadOneof_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.payloadOneofCase_ = 3;
            return this;
        }

        public Builder mergeResponseCache(Openrtb openrtb) {
            SingleFieldBuilderV3<Openrtb, Openrtb.Builder, OpenrtbOrBuilder> singleFieldBuilderV3 = this.responseCacheBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadOneofCase_ != 3 || this.payloadOneof_ == Openrtb.getDefaultInstance()) {
                    this.payloadOneof_ = openrtb;
                } else {
                    this.payloadOneof_ = Openrtb.newBuilder((Openrtb) this.payloadOneof_).mergeFrom(openrtb).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadOneofCase_ == 3) {
                    singleFieldBuilderV3.mergeFrom(openrtb);
                }
                this.responseCacheBuilder_.setMessage(openrtb);
            }
            this.payloadOneofCase_ = 3;
            return this;
        }

        public Builder clearResponseCache() {
            if (this.responseCacheBuilder_ != null) {
                if (this.payloadOneofCase_ == 3) {
                    this.payloadOneofCase_ = 0;
                    this.payloadOneof_ = null;
                }
                this.responseCacheBuilder_.clear();
            } else if (this.payloadOneofCase_ == 3) {
                this.payloadOneofCase_ = 0;
                this.payloadOneof_ = null;
                onChanged();
            }
            return this;
        }

        public Openrtb.Builder getResponseCacheBuilder() {
            return getResponseCacheFieldBuilder().getBuilder();
        }

        public OpenrtbOrBuilder getResponseCacheOrBuilder() {
            SingleFieldBuilderV3<Openrtb, Openrtb.Builder, OpenrtbOrBuilder> singleFieldBuilderV3;
            if (this.payloadOneofCase_ == 3 && (singleFieldBuilderV3 = this.responseCacheBuilder_) != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (this.payloadOneofCase_ == 3) {
                return (Openrtb) this.payloadOneof_;
            }
            return Openrtb.getDefaultInstance();
        }

        private SingleFieldBuilderV3<Openrtb, Openrtb.Builder, OpenrtbOrBuilder> getResponseCacheFieldBuilder() {
            if (this.responseCacheBuilder_ == null) {
                if (this.payloadOneofCase_ != 3) {
                    this.payloadOneof_ = Openrtb.getDefaultInstance();
                }
                this.responseCacheBuilder_ = new SingleFieldBuilderV3<>((Openrtb) this.payloadOneof_, getParentForChildren(), isClean());
                this.payloadOneof_ = null;
            }
            this.payloadOneofCase_ = 3;
            onChanged();
            return this.responseCacheBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    /* renamed from: io.bidmachine.protobuf.ResponsePayload$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                io.bidmachine.protobuf.ResponsePayload$PayloadOneofCase[] r0 = io.bidmachine.protobuf.ResponsePayload.PayloadOneofCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase = r0
                io.bidmachine.protobuf.ResponsePayload$PayloadOneofCase r1 = io.bidmachine.protobuf.ResponsePayload.PayloadOneofCase.RESPONSE_CACHE_URL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase     // Catch:{ NoSuchFieldError -> 0x001d }
                io.bidmachine.protobuf.ResponsePayload$PayloadOneofCase r1 = io.bidmachine.protobuf.ResponsePayload.PayloadOneofCase.RESPONSE_CACHE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.bidmachine.protobuf.ResponsePayload$PayloadOneofCase r1 = io.bidmachine.protobuf.ResponsePayload.PayloadOneofCase.PAYLOADONEOF_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.ResponsePayload.AnonymousClass2.<clinit>():void");
        }
    }

    public static ResponsePayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ResponsePayload> parser() {
        return PARSER;
    }

    public Parser<ResponsePayload> getParserForType() {
        return PARSER;
    }

    public ResponsePayload getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
