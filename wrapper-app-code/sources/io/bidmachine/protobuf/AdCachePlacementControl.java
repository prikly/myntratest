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

public final class AdCachePlacementControl extends GeneratedMessageV3 implements AdCachePlacementControlOrBuilder {
    private static final AdCachePlacementControl DEFAULT_INSTANCE = new AdCachePlacementControl();
    public static final int MAX_AGE_FIELD_NUMBER = 3;
    public static final int MAX_CACHE_SIZE_FIELD_NUMBER = 2;
    public static final int MAX_RETAIN_COUNT_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final Parser<AdCachePlacementControl> PARSER = new AbstractParser<AdCachePlacementControl>() {
        public AdCachePlacementControl parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AdCachePlacementControl(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public int maxAge_;
    /* access modifiers changed from: private */
    public int maxCacheSize_;
    /* access modifiers changed from: private */
    public int maxRetainCount_;
    private byte memoizedIsInitialized;

    private AdCachePlacementControl(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private AdCachePlacementControl() {
        this.memoizedIsInitialized = -1;
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AdCachePlacementControl();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private AdCachePlacementControl(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 16) {
                            this.maxCacheSize_ = codedInputStream.readUInt32();
                        } else if (readTag == 24) {
                            this.maxAge_ = codedInputStream.readUInt32();
                        } else if (readTag == 32) {
                            this.maxRetainCount_ = codedInputStream.readUInt32();
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
        return InitProto.internal_static_bidmachine_protobuf_AdCachePlacementControl_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_AdCachePlacementControl_fieldAccessorTable.ensureFieldAccessorsInitialized(AdCachePlacementControl.class, Builder.class);
    }

    public int getMaxCacheSize() {
        return this.maxCacheSize_;
    }

    public int getMaxRetainCount() {
        return this.maxRetainCount_;
    }

    public int getMaxAge() {
        return this.maxAge_;
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
        int i = this.maxCacheSize_;
        if (i != 0) {
            codedOutputStream.writeUInt32(2, i);
        }
        int i2 = this.maxAge_;
        if (i2 != 0) {
            codedOutputStream.writeUInt32(3, i2);
        }
        int i3 = this.maxRetainCount_;
        if (i3 != 0) {
            codedOutputStream.writeUInt32(4, i3);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.maxCacheSize_;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeUInt32Size(2, i3);
        }
        int i4 = this.maxAge_;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeUInt32Size(3, i4);
        }
        int i5 = this.maxRetainCount_;
        if (i5 != 0) {
            i2 += CodedOutputStream.computeUInt32Size(4, i5);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdCachePlacementControl)) {
            return super.equals(obj);
        }
        AdCachePlacementControl adCachePlacementControl = (AdCachePlacementControl) obj;
        if (getMaxCacheSize() == adCachePlacementControl.getMaxCacheSize() && getMaxRetainCount() == adCachePlacementControl.getMaxRetainCount() && getMaxAge() == adCachePlacementControl.getMaxAge() && this.unknownFields.equals(adCachePlacementControl.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 2) * 53) + getMaxCacheSize()) * 37) + 4) * 53) + getMaxRetainCount()) * 37) + 3) * 53) + getMaxAge()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static AdCachePlacementControl parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static AdCachePlacementControl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AdCachePlacementControl parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static AdCachePlacementControl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static AdCachePlacementControl parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static AdCachePlacementControl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AdCachePlacementControl parseFrom(InputStream inputStream) throws IOException {
        return (AdCachePlacementControl) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static AdCachePlacementControl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdCachePlacementControl) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AdCachePlacementControl parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdCachePlacementControl) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AdCachePlacementControl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdCachePlacementControl) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AdCachePlacementControl parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AdCachePlacementControl) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static AdCachePlacementControl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdCachePlacementControl) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AdCachePlacementControl adCachePlacementControl) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(adCachePlacementControl);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdCachePlacementControlOrBuilder {
        private int maxAge_;
        private int maxCacheSize_;
        private int maxRetainCount_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_AdCachePlacementControl_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_AdCachePlacementControl_fieldAccessorTable.ensureFieldAccessorsInitialized(AdCachePlacementControl.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = AdCachePlacementControl.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.maxCacheSize_ = 0;
            this.maxRetainCount_ = 0;
            this.maxAge_ = 0;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_AdCachePlacementControl_descriptor;
        }

        public AdCachePlacementControl getDefaultInstanceForType() {
            return AdCachePlacementControl.getDefaultInstance();
        }

        public AdCachePlacementControl build() {
            AdCachePlacementControl buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public AdCachePlacementControl buildPartial() {
            AdCachePlacementControl adCachePlacementControl = new AdCachePlacementControl((GeneratedMessageV3.Builder) this);
            int unused = adCachePlacementControl.maxCacheSize_ = this.maxCacheSize_;
            int unused2 = adCachePlacementControl.maxRetainCount_ = this.maxRetainCount_;
            int unused3 = adCachePlacementControl.maxAge_ = this.maxAge_;
            onBuilt();
            return adCachePlacementControl;
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
            if (message instanceof AdCachePlacementControl) {
                return mergeFrom((AdCachePlacementControl) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AdCachePlacementControl adCachePlacementControl) {
            if (adCachePlacementControl == AdCachePlacementControl.getDefaultInstance()) {
                return this;
            }
            if (adCachePlacementControl.getMaxCacheSize() != 0) {
                setMaxCacheSize(adCachePlacementControl.getMaxCacheSize());
            }
            if (adCachePlacementControl.getMaxRetainCount() != 0) {
                setMaxRetainCount(adCachePlacementControl.getMaxRetainCount());
            }
            if (adCachePlacementControl.getMaxAge() != 0) {
                setMaxAge(adCachePlacementControl.getMaxAge());
            }
            mergeUnknownFields(adCachePlacementControl.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.AdCachePlacementControl.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.AdCachePlacementControl.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.AdCachePlacementControl r3 = (io.bidmachine.protobuf.AdCachePlacementControl) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.AdCachePlacementControl) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.AdCachePlacementControl r4 = (io.bidmachine.protobuf.AdCachePlacementControl) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.AdCachePlacementControl) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AdCachePlacementControl.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.AdCachePlacementControl$Builder");
        }

        public int getMaxCacheSize() {
            return this.maxCacheSize_;
        }

        public Builder setMaxCacheSize(int i) {
            this.maxCacheSize_ = i;
            onChanged();
            return this;
        }

        public Builder clearMaxCacheSize() {
            this.maxCacheSize_ = 0;
            onChanged();
            return this;
        }

        public int getMaxRetainCount() {
            return this.maxRetainCount_;
        }

        public Builder setMaxRetainCount(int i) {
            this.maxRetainCount_ = i;
            onChanged();
            return this;
        }

        public Builder clearMaxRetainCount() {
            this.maxRetainCount_ = 0;
            onChanged();
            return this;
        }

        public int getMaxAge() {
            return this.maxAge_;
        }

        public Builder setMaxAge(int i) {
            this.maxAge_ = i;
            onChanged();
            return this;
        }

        public Builder clearMaxAge() {
            this.maxAge_ = 0;
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

    public static AdCachePlacementControl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AdCachePlacementControl> parser() {
        return PARSER;
    }

    public Parser<AdCachePlacementControl> getParserForType() {
        return PARSER;
    }

    public AdCachePlacementControl getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
