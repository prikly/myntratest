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
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RegsCcpaExtension extends GeneratedMessageV3 implements RegsCcpaExtensionOrBuilder {
    private static final RegsCcpaExtension DEFAULT_INSTANCE = new RegsCcpaExtension();
    /* access modifiers changed from: private */
    public static final Parser<RegsCcpaExtension> PARSER = new AbstractParser<RegsCcpaExtension>() {
        public RegsCcpaExtension parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new RegsCcpaExtension(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int US_PRIVACY_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public volatile Object usPrivacy_;

    private RegsCcpaExtension(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private RegsCcpaExtension() {
        this.memoizedIsInitialized = -1;
        this.usPrivacy_ = "";
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new RegsCcpaExtension();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private RegsCcpaExtension(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            this.usPrivacy_ = codedInputStream.readStringRequireUtf8();
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
        return ExtensionsProto.internal_static_bidmachine_protobuf_RegsCcpaExtension_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_RegsCcpaExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(RegsCcpaExtension.class, Builder.class);
    }

    public String getUsPrivacy() {
        Object obj = this.usPrivacy_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.usPrivacy_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getUsPrivacyBytes() {
        Object obj = this.usPrivacy_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.usPrivacy_ = copyFromUtf8;
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
        if (!getUsPrivacyBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.usPrivacy_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!getUsPrivacyBytes().isEmpty()) {
            i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.usPrivacy_);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegsCcpaExtension)) {
            return super.equals(obj);
        }
        RegsCcpaExtension regsCcpaExtension = (RegsCcpaExtension) obj;
        if (getUsPrivacy().equals(regsCcpaExtension.getUsPrivacy()) && this.unknownFields.equals(regsCcpaExtension.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUsPrivacy().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static RegsCcpaExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static RegsCcpaExtension parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static RegsCcpaExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static RegsCcpaExtension parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static RegsCcpaExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static RegsCcpaExtension parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static RegsCcpaExtension parseFrom(InputStream inputStream) throws IOException {
        return (RegsCcpaExtension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static RegsCcpaExtension parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RegsCcpaExtension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RegsCcpaExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RegsCcpaExtension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RegsCcpaExtension parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RegsCcpaExtension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RegsCcpaExtension parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RegsCcpaExtension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static RegsCcpaExtension parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RegsCcpaExtension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RegsCcpaExtension regsCcpaExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(regsCcpaExtension);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RegsCcpaExtensionOrBuilder {
        private Object usPrivacy_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_RegsCcpaExtension_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_RegsCcpaExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(RegsCcpaExtension.class, Builder.class);
        }

        private Builder() {
            this.usPrivacy_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.usPrivacy_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = RegsCcpaExtension.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.usPrivacy_ = "";
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_RegsCcpaExtension_descriptor;
        }

        public RegsCcpaExtension getDefaultInstanceForType() {
            return RegsCcpaExtension.getDefaultInstance();
        }

        public RegsCcpaExtension build() {
            RegsCcpaExtension buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public RegsCcpaExtension buildPartial() {
            RegsCcpaExtension regsCcpaExtension = new RegsCcpaExtension((GeneratedMessageV3.Builder) this);
            Object unused = regsCcpaExtension.usPrivacy_ = this.usPrivacy_;
            onBuilt();
            return regsCcpaExtension;
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
            if (message instanceof RegsCcpaExtension) {
                return mergeFrom((RegsCcpaExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(RegsCcpaExtension regsCcpaExtension) {
            if (regsCcpaExtension == RegsCcpaExtension.getDefaultInstance()) {
                return this;
            }
            if (!regsCcpaExtension.getUsPrivacy().isEmpty()) {
                this.usPrivacy_ = regsCcpaExtension.usPrivacy_;
                onChanged();
            }
            mergeUnknownFields(regsCcpaExtension.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.RegsCcpaExtension.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.RegsCcpaExtension.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.RegsCcpaExtension r3 = (io.bidmachine.protobuf.RegsCcpaExtension) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.RegsCcpaExtension) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.RegsCcpaExtension r4 = (io.bidmachine.protobuf.RegsCcpaExtension) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.RegsCcpaExtension) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RegsCcpaExtension.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.RegsCcpaExtension$Builder");
        }

        public String getUsPrivacy() {
            Object obj = this.usPrivacy_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.usPrivacy_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUsPrivacyBytes() {
            Object obj = this.usPrivacy_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.usPrivacy_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setUsPrivacy(String str) {
            if (str != null) {
                this.usPrivacy_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearUsPrivacy() {
            this.usPrivacy_ = RegsCcpaExtension.getDefaultInstance().getUsPrivacy();
            onChanged();
            return this;
        }

        public Builder setUsPrivacyBytes(ByteString byteString) {
            if (byteString != null) {
                RegsCcpaExtension.checkByteStringIsUtf8(byteString);
                this.usPrivacy_ = byteString;
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

    public static RegsCcpaExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RegsCcpaExtension> parser() {
        return PARSER;
    }

    public Parser<RegsCcpaExtension> getParserForType() {
        return PARSER;
    }

    public RegsCcpaExtension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
