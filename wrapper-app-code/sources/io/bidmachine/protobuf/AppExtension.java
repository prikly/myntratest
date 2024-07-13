package io.bidmachine.protobuf;

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
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.TimestampOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class AppExtension extends GeneratedMessageV3 implements AppExtensionOrBuilder {
    private static final AppExtension DEFAULT_INSTANCE = new AppExtension();
    public static final int INSTALL_TIME_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final Parser<AppExtension> PARSER = new AbstractParser<AppExtension>() {
        public AppExtension parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AppExtension(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int UPTIME_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public Timestamp installTime_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public long uptime_;

    private AppExtension(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private AppExtension() {
        this.memoizedIsInitialized = -1;
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AppExtension();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private AppExtension(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            Timestamp.Builder builder = this.installTime_ != null ? this.installTime_.toBuilder() : null;
                            Timestamp timestamp = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            this.installTime_ = timestamp;
                            if (builder != null) {
                                builder.mergeFrom(timestamp);
                                this.installTime_ = builder.buildPartial();
                            }
                        } else if (readTag == 16) {
                            this.uptime_ = codedInputStream.readUInt64();
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
        return ExtensionsProto.internal_static_bidmachine_protobuf_AppExtension_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_AppExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(AppExtension.class, Builder.class);
    }

    public boolean hasInstallTime() {
        return this.installTime_ != null;
    }

    public Timestamp getInstallTime() {
        Timestamp timestamp = this.installTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public TimestampOrBuilder getInstallTimeOrBuilder() {
        return getInstallTime();
    }

    public long getUptime() {
        return this.uptime_;
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
        if (this.installTime_ != null) {
            codedOutputStream.writeMessage(1, getInstallTime());
        }
        long j = this.uptime_;
        if (j != 0) {
            codedOutputStream.writeUInt64(2, j);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.installTime_ != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getInstallTime());
        }
        long j = this.uptime_;
        if (j != 0) {
            i2 += CodedOutputStream.computeUInt64Size(2, j);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppExtension)) {
            return super.equals(obj);
        }
        AppExtension appExtension = (AppExtension) obj;
        if (hasInstallTime() != appExtension.hasInstallTime()) {
            return false;
        }
        if ((!hasInstallTime() || getInstallTime().equals(appExtension.getInstallTime())) && getUptime() == appExtension.getUptime() && this.unknownFields.equals(appExtension.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasInstallTime()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getInstallTime().hashCode();
        }
        int hashLong = (((((hashCode * 37) + 2) * 53) + Internal.hashLong(getUptime())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashLong;
        return hashLong;
    }

    public static AppExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static AppExtension parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AppExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static AppExtension parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static AppExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static AppExtension parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AppExtension parseFrom(InputStream inputStream) throws IOException {
        return (AppExtension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static AppExtension parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AppExtension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AppExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AppExtension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AppExtension parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AppExtension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AppExtension parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AppExtension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static AppExtension parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AppExtension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AppExtension appExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(appExtension);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AppExtensionOrBuilder {
        private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> installTimeBuilder_;
        private Timestamp installTime_;
        private long uptime_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AppExtension_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AppExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(AppExtension.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = AppExtension.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            if (this.installTimeBuilder_ == null) {
                this.installTime_ = null;
            } else {
                this.installTime_ = null;
                this.installTimeBuilder_ = null;
            }
            this.uptime_ = 0;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AppExtension_descriptor;
        }

        public AppExtension getDefaultInstanceForType() {
            return AppExtension.getDefaultInstance();
        }

        public AppExtension build() {
            AppExtension buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public AppExtension buildPartial() {
            AppExtension appExtension = new AppExtension((GeneratedMessageV3.Builder) this);
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.installTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp unused = appExtension.installTime_ = this.installTime_;
            } else {
                Timestamp unused2 = appExtension.installTime_ = singleFieldBuilderV3.build();
            }
            long unused3 = appExtension.uptime_ = this.uptime_;
            onBuilt();
            return appExtension;
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
            if (message instanceof AppExtension) {
                return mergeFrom((AppExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AppExtension appExtension) {
            if (appExtension == AppExtension.getDefaultInstance()) {
                return this;
            }
            if (appExtension.hasInstallTime()) {
                mergeInstallTime(appExtension.getInstallTime());
            }
            if (appExtension.getUptime() != 0) {
                setUptime(appExtension.getUptime());
            }
            mergeUnknownFields(appExtension.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.AppExtension.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.AppExtension.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.AppExtension r3 = (io.bidmachine.protobuf.AppExtension) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.AppExtension) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.AppExtension r4 = (io.bidmachine.protobuf.AppExtension) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.AppExtension) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AppExtension.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.AppExtension$Builder");
        }

        public boolean hasInstallTime() {
            return (this.installTimeBuilder_ == null && this.installTime_ == null) ? false : true;
        }

        public Timestamp getInstallTime() {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.installTimeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Timestamp timestamp = this.installTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Builder setInstallTime(Timestamp timestamp) {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.installTimeBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(timestamp);
            } else if (timestamp != null) {
                this.installTime_ = timestamp;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setInstallTime(Timestamp.Builder builder) {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.installTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.installTime_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeInstallTime(Timestamp timestamp) {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.installTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp2 = this.installTime_;
                if (timestamp2 != null) {
                    this.installTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.installTime_ = timestamp;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(timestamp);
            }
            return this;
        }

        public Builder clearInstallTime() {
            if (this.installTimeBuilder_ == null) {
                this.installTime_ = null;
                onChanged();
            } else {
                this.installTime_ = null;
                this.installTimeBuilder_ = null;
            }
            return this;
        }

        public Timestamp.Builder getInstallTimeBuilder() {
            onChanged();
            return getInstallTimeFieldBuilder().getBuilder();
        }

        public TimestampOrBuilder getInstallTimeOrBuilder() {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.installTimeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Timestamp timestamp = this.installTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getInstallTimeFieldBuilder() {
            if (this.installTimeBuilder_ == null) {
                this.installTimeBuilder_ = new SingleFieldBuilderV3<>(getInstallTime(), getParentForChildren(), isClean());
                this.installTime_ = null;
            }
            return this.installTimeBuilder_;
        }

        public long getUptime() {
            return this.uptime_;
        }

        public Builder setUptime(long j) {
            this.uptime_ = j;
            onChanged();
            return this;
        }

        public Builder clearUptime() {
            this.uptime_ = 0;
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

    public static AppExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AppExtension> parser() {
        return PARSER;
    }

    public Parser<AppExtension> getParserForType() {
        return PARSER;
    }

    public AppExtension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
