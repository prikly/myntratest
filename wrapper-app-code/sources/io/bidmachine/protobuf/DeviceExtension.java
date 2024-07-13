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
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DeviceExtension extends GeneratedMessageV3 implements DeviceExtensionOrBuilder {
    public static final int BATTERY_FIELD_NUMBER = 1;
    private static final DeviceExtension DEFAULT_INSTANCE = new DeviceExtension();
    /* access modifiers changed from: private */
    public static final Parser<DeviceExtension> PARSER = new AbstractParser<DeviceExtension>() {
        public DeviceExtension parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new DeviceExtension(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int ROOTED_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public int battery_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public boolean rooted_;

    private DeviceExtension(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private DeviceExtension() {
        this.memoizedIsInitialized = -1;
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new DeviceExtension();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private DeviceExtension(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.battery_ = codedInputStream.readUInt32();
                        } else if (readTag == 16) {
                            this.rooted_ = codedInputStream.readBool();
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
        return ExtensionsProto.internal_static_bidmachine_protobuf_DeviceExtension_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_DeviceExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceExtension.class, Builder.class);
    }

    public int getBattery() {
        return this.battery_;
    }

    public boolean getRooted() {
        return this.rooted_;
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
        int i = this.battery_;
        if (i != 0) {
            codedOutputStream.writeUInt32(1, i);
        }
        boolean z = this.rooted_;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.battery_;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeUInt32Size(1, i3);
        }
        boolean z = this.rooted_;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(2, z);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceExtension)) {
            return super.equals(obj);
        }
        DeviceExtension deviceExtension = (DeviceExtension) obj;
        if (getBattery() == deviceExtension.getBattery() && getRooted() == deviceExtension.getRooted() && this.unknownFields.equals(deviceExtension.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getBattery()) * 37) + 2) * 53) + Internal.hashBoolean(getRooted())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static DeviceExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static DeviceExtension parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static DeviceExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static DeviceExtension parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static DeviceExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static DeviceExtension parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static DeviceExtension parseFrom(InputStream inputStream) throws IOException {
        return (DeviceExtension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static DeviceExtension parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeviceExtension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static DeviceExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DeviceExtension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DeviceExtension parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeviceExtension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static DeviceExtension parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DeviceExtension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static DeviceExtension parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeviceExtension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(DeviceExtension deviceExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceExtension);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceExtensionOrBuilder {
        private int battery_;
        private boolean rooted_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_DeviceExtension_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_DeviceExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceExtension.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = DeviceExtension.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.battery_ = 0;
            this.rooted_ = false;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_DeviceExtension_descriptor;
        }

        public DeviceExtension getDefaultInstanceForType() {
            return DeviceExtension.getDefaultInstance();
        }

        public DeviceExtension build() {
            DeviceExtension buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public DeviceExtension buildPartial() {
            DeviceExtension deviceExtension = new DeviceExtension((GeneratedMessageV3.Builder) this);
            int unused = deviceExtension.battery_ = this.battery_;
            boolean unused2 = deviceExtension.rooted_ = this.rooted_;
            onBuilt();
            return deviceExtension;
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
            if (message instanceof DeviceExtension) {
                return mergeFrom((DeviceExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(DeviceExtension deviceExtension) {
            if (deviceExtension == DeviceExtension.getDefaultInstance()) {
                return this;
            }
            if (deviceExtension.getBattery() != 0) {
                setBattery(deviceExtension.getBattery());
            }
            if (deviceExtension.getRooted()) {
                setRooted(deviceExtension.getRooted());
            }
            mergeUnknownFields(deviceExtension.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.DeviceExtension.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.DeviceExtension.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.DeviceExtension r3 = (io.bidmachine.protobuf.DeviceExtension) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.DeviceExtension) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.DeviceExtension r4 = (io.bidmachine.protobuf.DeviceExtension) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.DeviceExtension) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.DeviceExtension.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.DeviceExtension$Builder");
        }

        public int getBattery() {
            return this.battery_;
        }

        public Builder setBattery(int i) {
            this.battery_ = i;
            onChanged();
            return this;
        }

        public Builder clearBattery() {
            this.battery_ = 0;
            onChanged();
            return this;
        }

        public boolean getRooted() {
            return this.rooted_;
        }

        public Builder setRooted(boolean z) {
            this.rooted_ = z;
            onChanged();
            return this;
        }

        public Builder clearRooted() {
            this.rooted_ = false;
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

    public static DeviceExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<DeviceExtension> parser() {
        return PARSER;
    }

    public Parser<DeviceExtension> getParserForType() {
        return PARSER;
    }

    public DeviceExtension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
