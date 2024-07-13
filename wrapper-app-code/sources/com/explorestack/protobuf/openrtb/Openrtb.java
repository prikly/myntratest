package com.explorestack.protobuf.openrtb;

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
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.openrtb.Response;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Openrtb extends GeneratedMessageV3 implements OpenrtbOrBuilder {
    private static final Openrtb DEFAULT_INSTANCE = new Openrtb();
    public static final int DOMAINSPEC_FIELD_NUMBER = 2;
    public static final int DOMAINVER_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final Parser<Openrtb> PARSER = new AbstractParser<Openrtb>() {
        public Openrtb parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Openrtb(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int REQUEST_FIELD_NUMBER = 4;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    public static final int VER_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public volatile Object domainspec_;
    /* access modifiers changed from: private */
    public volatile Object domainver_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public int payloadCase_;
    /* access modifiers changed from: private */
    public Object payload_;
    /* access modifiers changed from: private */
    public volatile Object ver_;

    private Openrtb(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = -1;
    }

    private Openrtb() {
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = -1;
        this.ver_ = "";
        this.domainspec_ = "";
        this.domainver_ = "";
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Openrtb();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Openrtb(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            this.ver_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            this.domainspec_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 26) {
                            this.domainver_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 34) {
                            Request.Builder builder = this.payloadCase_ == 4 ? ((Request) this.payload_).toBuilder() : null;
                            MessageLite readMessage = codedInputStream.readMessage(Request.parser(), extensionRegistryLite);
                            this.payload_ = readMessage;
                            if (builder != null) {
                                builder.mergeFrom((Request) readMessage);
                                this.payload_ = builder.buildPartial();
                            }
                            this.payloadCase_ = 4;
                        } else if (readTag == 42) {
                            Response.Builder builder2 = this.payloadCase_ == 5 ? ((Response) this.payload_).toBuilder() : null;
                            MessageLite readMessage2 = codedInputStream.readMessage(Response.parser(), extensionRegistryLite);
                            this.payload_ = readMessage2;
                            if (builder2 != null) {
                                builder2.mergeFrom((Response) readMessage2);
                                this.payload_ = builder2.buildPartial();
                            }
                            this.payloadCase_ = 5;
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
        return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Openrtb_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Openrtb_fieldAccessorTable.ensureFieldAccessorsInitialized(Openrtb.class, Builder.class);
    }

    public enum PayloadCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
        REQUEST(4),
        RESPONSE(5),
        PAYLOAD_NOT_SET(0);
        
        private final int value;

        private PayloadCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static PayloadCase valueOf(int i) {
            return forNumber(i);
        }

        public static PayloadCase forNumber(int i) {
            if (i == 0) {
                return PAYLOAD_NOT_SET;
            }
            if (i == 4) {
                return REQUEST;
            }
            if (i != 5) {
                return null;
            }
            return RESPONSE;
        }

        public int getNumber() {
            return this.value;
        }
    }

    public PayloadCase getPayloadCase() {
        return PayloadCase.forNumber(this.payloadCase_);
    }

    public String getVer() {
        Object obj = this.ver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ver_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getVerBytes() {
        Object obj = this.ver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ver_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getDomainspec() {
        Object obj = this.domainspec_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.domainspec_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getDomainspecBytes() {
        Object obj = this.domainspec_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.domainspec_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getDomainver() {
        Object obj = this.domainver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.domainver_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getDomainverBytes() {
        Object obj = this.domainver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.domainver_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public boolean hasRequest() {
        return this.payloadCase_ == 4;
    }

    public Request getRequest() {
        if (this.payloadCase_ == 4) {
            return (Request) this.payload_;
        }
        return Request.getDefaultInstance();
    }

    public RequestOrBuilder getRequestOrBuilder() {
        if (this.payloadCase_ == 4) {
            return (Request) this.payload_;
        }
        return Request.getDefaultInstance();
    }

    public boolean hasResponse() {
        return this.payloadCase_ == 5;
    }

    public Response getResponse() {
        if (this.payloadCase_ == 5) {
            return (Response) this.payload_;
        }
        return Response.getDefaultInstance();
    }

    public ResponseOrBuilder getResponseOrBuilder() {
        if (this.payloadCase_ == 5) {
            return (Response) this.payload_;
        }
        return Response.getDefaultInstance();
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
        if (!getVerBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.ver_);
        }
        if (!getDomainspecBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.domainspec_);
        }
        if (!getDomainverBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.domainver_);
        }
        if (this.payloadCase_ == 4) {
            codedOutputStream.writeMessage(4, (Request) this.payload_);
        }
        if (this.payloadCase_ == 5) {
            codedOutputStream.writeMessage(5, (Response) this.payload_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!getVerBytes().isEmpty()) {
            i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.ver_);
        }
        if (!getDomainspecBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(2, this.domainspec_);
        }
        if (!getDomainverBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(3, this.domainver_);
        }
        if (this.payloadCase_ == 4) {
            i2 += CodedOutputStream.computeMessageSize(4, (Request) this.payload_);
        }
        if (this.payloadCase_ == 5) {
            i2 += CodedOutputStream.computeMessageSize(5, (Response) this.payload_);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Openrtb)) {
            return super.equals(obj);
        }
        Openrtb openrtb = (Openrtb) obj;
        if (!getVer().equals(openrtb.getVer()) || !getDomainspec().equals(openrtb.getDomainspec()) || !getDomainver().equals(openrtb.getDomainver()) || !getPayloadCase().equals(openrtb.getPayloadCase())) {
            return false;
        }
        int i = this.payloadCase_;
        if (i != 4) {
            if (i == 5 && !getResponse().equals(openrtb.getResponse())) {
                return false;
            }
        } else if (!getRequest().equals(openrtb.getRequest())) {
            return false;
        }
        if (!this.unknownFields.equals(openrtb.unknownFields)) {
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
        int hashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getVer().hashCode()) * 37) + 2) * 53) + getDomainspec().hashCode()) * 37) + 3) * 53) + getDomainver().hashCode();
        int i3 = this.payloadCase_;
        if (i3 != 4) {
            if (i3 == 5) {
                i2 = ((hashCode * 37) + 5) * 53;
                i = getResponse().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }
        i2 = ((hashCode * 37) + 4) * 53;
        i = getRequest().hashCode();
        hashCode = i2 + i;
        int hashCode22 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode22;
        return hashCode22;
    }

    public static Openrtb parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Openrtb parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Openrtb parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Openrtb parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Openrtb parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Openrtb parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Openrtb parseFrom(InputStream inputStream) throws IOException {
        return (Openrtb) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Openrtb parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Openrtb) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Openrtb parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Openrtb) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Openrtb parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Openrtb) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Openrtb parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Openrtb) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Openrtb parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Openrtb) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Openrtb openrtb) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(openrtb);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OpenrtbOrBuilder {
        private Object domainspec_;
        private Object domainver_;
        private int payloadCase_;
        private Object payload_;
        private SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> requestBuilder_;
        private SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> responseBuilder_;
        private Object ver_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Openrtb_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Openrtb_fieldAccessorTable.ensureFieldAccessorsInitialized(Openrtb.class, Builder.class);
        }

        private Builder() {
            this.payloadCase_ = 0;
            this.ver_ = "";
            this.domainspec_ = "";
            this.domainver_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.payloadCase_ = 0;
            this.ver_ = "";
            this.domainspec_ = "";
            this.domainver_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = Openrtb.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.ver_ = "";
            this.domainspec_ = "";
            this.domainver_ = "";
            this.payloadCase_ = 0;
            this.payload_ = null;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Openrtb_descriptor;
        }

        public Openrtb getDefaultInstanceForType() {
            return Openrtb.getDefaultInstance();
        }

        public Openrtb build() {
            Openrtb buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public Openrtb buildPartial() {
            Openrtb openrtb = new Openrtb((GeneratedMessageV3.Builder) this);
            Object unused = openrtb.ver_ = this.ver_;
            Object unused2 = openrtb.domainspec_ = this.domainspec_;
            Object unused3 = openrtb.domainver_ = this.domainver_;
            if (this.payloadCase_ == 4) {
                SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Object unused4 = openrtb.payload_ = this.payload_;
                } else {
                    Object unused5 = openrtb.payload_ = singleFieldBuilderV3.build();
                }
            }
            if (this.payloadCase_ == 5) {
                SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> singleFieldBuilderV32 = this.responseBuilder_;
                if (singleFieldBuilderV32 == null) {
                    Object unused6 = openrtb.payload_ = this.payload_;
                } else {
                    Object unused7 = openrtb.payload_ = singleFieldBuilderV32.build();
                }
            }
            int unused8 = openrtb.payloadCase_ = this.payloadCase_;
            onBuilt();
            return openrtb;
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
            if (message instanceof Openrtb) {
                return mergeFrom((Openrtb) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Openrtb openrtb) {
            if (openrtb == Openrtb.getDefaultInstance()) {
                return this;
            }
            if (!openrtb.getVer().isEmpty()) {
                this.ver_ = openrtb.ver_;
                onChanged();
            }
            if (!openrtb.getDomainspec().isEmpty()) {
                this.domainspec_ = openrtb.domainspec_;
                onChanged();
            }
            if (!openrtb.getDomainver().isEmpty()) {
                this.domainver_ = openrtb.domainver_;
                onChanged();
            }
            int i = AnonymousClass2.$SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase[openrtb.getPayloadCase().ordinal()];
            if (i == 1) {
                mergeRequest(openrtb.getRequest());
            } else if (i == 2) {
                mergeResponse(openrtb.getResponse());
            }
            mergeUnknownFields(openrtb.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.explorestack.protobuf.openrtb.Openrtb.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.openrtb.Openrtb.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.explorestack.protobuf.openrtb.Openrtb r3 = (com.explorestack.protobuf.openrtb.Openrtb) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.explorestack.protobuf.openrtb.Openrtb) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.explorestack.protobuf.openrtb.Openrtb r4 = (com.explorestack.protobuf.openrtb.Openrtb) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.explorestack.protobuf.openrtb.Openrtb) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Openrtb.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.openrtb.Openrtb$Builder");
        }

        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        public Builder clearPayload() {
            this.payloadCase_ = 0;
            this.payload_ = null;
            onChanged();
            return this;
        }

        public String getVer() {
            Object obj = this.ver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ver_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getVerBytes() {
            Object obj = this.ver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ver_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setVer(String str) {
            if (str != null) {
                this.ver_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearVer() {
            this.ver_ = Openrtb.getDefaultInstance().getVer();
            onChanged();
            return this;
        }

        public Builder setVerBytes(ByteString byteString) {
            if (byteString != null) {
                Openrtb.checkByteStringIsUtf8(byteString);
                this.ver_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getDomainspec() {
            Object obj = this.domainspec_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.domainspec_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getDomainspecBytes() {
            Object obj = this.domainspec_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.domainspec_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setDomainspec(String str) {
            if (str != null) {
                this.domainspec_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearDomainspec() {
            this.domainspec_ = Openrtb.getDefaultInstance().getDomainspec();
            onChanged();
            return this;
        }

        public Builder setDomainspecBytes(ByteString byteString) {
            if (byteString != null) {
                Openrtb.checkByteStringIsUtf8(byteString);
                this.domainspec_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getDomainver() {
            Object obj = this.domainver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.domainver_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getDomainverBytes() {
            Object obj = this.domainver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.domainver_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setDomainver(String str) {
            if (str != null) {
                this.domainver_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearDomainver() {
            this.domainver_ = Openrtb.getDefaultInstance().getDomainver();
            onChanged();
            return this;
        }

        public Builder setDomainverBytes(ByteString byteString) {
            if (byteString != null) {
                Openrtb.checkByteStringIsUtf8(byteString);
                this.domainver_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public boolean hasRequest() {
            return this.payloadCase_ == 4;
        }

        public Request getRequest() {
            SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadCase_ == 4) {
                    return (Request) this.payload_;
                }
                return Request.getDefaultInstance();
            } else if (this.payloadCase_ == 4) {
                return singleFieldBuilderV3.getMessage();
            } else {
                return Request.getDefaultInstance();
            }
        }

        public Builder setRequest(Request request) {
            SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(request);
            } else if (request != null) {
                this.payload_ = request;
                onChanged();
            } else {
                throw null;
            }
            this.payloadCase_ = 4;
            return this;
        }

        public Builder setRequest(Request.Builder builder) {
            SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.payloadCase_ = 4;
            return this;
        }

        public Builder mergeRequest(Request request) {
            SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadCase_ != 4 || this.payload_ == Request.getDefaultInstance()) {
                    this.payload_ = request;
                } else {
                    this.payload_ = Request.newBuilder((Request) this.payload_).mergeFrom(request).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 4) {
                    singleFieldBuilderV3.mergeFrom(request);
                }
                this.requestBuilder_.setMessage(request);
            }
            this.payloadCase_ = 4;
            return this;
        }

        public Builder clearRequest() {
            if (this.requestBuilder_ != null) {
                if (this.payloadCase_ == 4) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                this.requestBuilder_.clear();
            } else if (this.payloadCase_ == 4) {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
            }
            return this;
        }

        public Request.Builder getRequestBuilder() {
            return getRequestFieldBuilder().getBuilder();
        }

        public RequestOrBuilder getRequestOrBuilder() {
            SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> singleFieldBuilderV3;
            if (this.payloadCase_ == 4 && (singleFieldBuilderV3 = this.requestBuilder_) != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (this.payloadCase_ == 4) {
                return (Request) this.payload_;
            }
            return Request.getDefaultInstance();
        }

        private SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> getRequestFieldBuilder() {
            if (this.requestBuilder_ == null) {
                if (this.payloadCase_ != 4) {
                    this.payload_ = Request.getDefaultInstance();
                }
                this.requestBuilder_ = new SingleFieldBuilderV3<>((Request) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 4;
            onChanged();
            return this.requestBuilder_;
        }

        public boolean hasResponse() {
            return this.payloadCase_ == 5;
        }

        public Response getResponse() {
            SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadCase_ == 5) {
                    return (Response) this.payload_;
                }
                return Response.getDefaultInstance();
            } else if (this.payloadCase_ == 5) {
                return singleFieldBuilderV3.getMessage();
            } else {
                return Response.getDefaultInstance();
            }
        }

        public Builder setResponse(Response response) {
            SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(response);
            } else if (response != null) {
                this.payload_ = response;
                onChanged();
            } else {
                throw null;
            }
            this.payloadCase_ = 5;
            return this;
        }

        public Builder setResponse(Response.Builder builder) {
            SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.payloadCase_ = 5;
            return this;
        }

        public Builder mergeResponse(Response response) {
            SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.payloadCase_ != 5 || this.payload_ == Response.getDefaultInstance()) {
                    this.payload_ = response;
                } else {
                    this.payload_ = Response.newBuilder((Response) this.payload_).mergeFrom(response).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 5) {
                    singleFieldBuilderV3.mergeFrom(response);
                }
                this.responseBuilder_.setMessage(response);
            }
            this.payloadCase_ = 5;
            return this;
        }

        public Builder clearResponse() {
            if (this.responseBuilder_ != null) {
                if (this.payloadCase_ == 5) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                this.responseBuilder_.clear();
            } else if (this.payloadCase_ == 5) {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
            }
            return this;
        }

        public Response.Builder getResponseBuilder() {
            return getResponseFieldBuilder().getBuilder();
        }

        public ResponseOrBuilder getResponseOrBuilder() {
            SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> singleFieldBuilderV3;
            if (this.payloadCase_ == 5 && (singleFieldBuilderV3 = this.responseBuilder_) != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (this.payloadCase_ == 5) {
                return (Response) this.payload_;
            }
            return Response.getDefaultInstance();
        }

        private SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> getResponseFieldBuilder() {
            if (this.responseBuilder_ == null) {
                if (this.payloadCase_ != 5) {
                    this.payload_ = Response.getDefaultInstance();
                }
                this.responseBuilder_ = new SingleFieldBuilderV3<>((Response) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 5;
            onChanged();
            return this.responseBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    /* renamed from: com.explorestack.protobuf.openrtb.Openrtb$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.explorestack.protobuf.openrtb.Openrtb$PayloadCase[] r0 = com.explorestack.protobuf.openrtb.Openrtb.PayloadCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase = r0
                com.explorestack.protobuf.openrtb.Openrtb$PayloadCase r1 = com.explorestack.protobuf.openrtb.Openrtb.PayloadCase.REQUEST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase     // Catch:{ NoSuchFieldError -> 0x001d }
                com.explorestack.protobuf.openrtb.Openrtb$PayloadCase r1 = com.explorestack.protobuf.openrtb.Openrtb.PayloadCase.RESPONSE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.explorestack.protobuf.openrtb.Openrtb$PayloadCase r1 = com.explorestack.protobuf.openrtb.Openrtb.PayloadCase.PAYLOAD_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Openrtb.AnonymousClass2.<clinit>():void");
        }
    }

    public static Openrtb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Openrtb> parser() {
        return PARSER;
    }

    public Parser<Openrtb> getParserForType() {
        return PARSER;
    }

    public Openrtb getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
