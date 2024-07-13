package com.appodeal.ads.api;

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

public final class Adapter extends GeneratedMessageV3 implements AdapterOrBuilder {
    private static final Adapter DEFAULT_INSTANCE = new Adapter();
    /* access modifiers changed from: private */
    public static final Parser<Adapter> PARSER = new AbstractParser<Adapter>() {
        public Adapter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Adapter(codedInputStream, extensionRegistryLite);
        }
    };
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public volatile Object networkSdkVersion_;
    /* access modifiers changed from: private */
    public volatile Object status_;
    /* access modifiers changed from: private */
    public volatile Object version_;

    private Adapter(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private Adapter() {
        this.memoizedIsInitialized = -1;
        this.status_ = "";
        this.version_ = "";
        this.networkSdkVersion_ = "";
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Adapter();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Adapter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            this.status_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            this.version_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 26) {
                            this.networkSdkVersion_ = codedInputStream.readStringRequireUtf8();
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
        return Api.internal_static_com_appodeal_ads_Adapter_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Api.internal_static_com_appodeal_ads_Adapter_fieldAccessorTable.ensureFieldAccessorsInitialized(Adapter.class, Builder.class);
    }

    public String getStatus() {
        Object obj = this.status_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.status_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getStatusBytes() {
        Object obj = this.status_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.status_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getVersion() {
        Object obj = this.version_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.version_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getVersionBytes() {
        Object obj = this.version_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.version_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getNetworkSdkVersion() {
        Object obj = this.networkSdkVersion_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.networkSdkVersion_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getNetworkSdkVersionBytes() {
        Object obj = this.networkSdkVersion_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.networkSdkVersion_ = copyFromUtf8;
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
        if (!getStatusBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.status_);
        }
        if (!getVersionBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.version_);
        }
        if (!getNetworkSdkVersionBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.networkSdkVersion_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!getStatusBytes().isEmpty()) {
            i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.status_);
        }
        if (!getVersionBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(2, this.version_);
        }
        if (!getNetworkSdkVersionBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(3, this.networkSdkVersion_);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Adapter)) {
            return super.equals(obj);
        }
        Adapter adapter = (Adapter) obj;
        if (getStatus().equals(adapter.getStatus()) && getVersion().equals(adapter.getVersion()) && getNetworkSdkVersion().equals(adapter.getNetworkSdkVersion()) && this.unknownFields.equals(adapter.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getStatus().hashCode()) * 37) + 2) * 53) + getVersion().hashCode()) * 37) + 3) * 53) + getNetworkSdkVersion().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdapterOrBuilder {
        private Object networkSdkVersion_;
        private Object status_;
        private Object version_;

        public final boolean isInitialized() {
            return true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_Adapter_fieldAccessorTable.ensureFieldAccessorsInitialized(Adapter.class, Builder.class);
        }

        private Builder() {
            this.status_ = "";
            this.version_ = "";
            this.networkSdkVersion_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.status_ = "";
            this.version_ = "";
            this.networkSdkVersion_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = Adapter.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.status_ = "";
            this.version_ = "";
            this.networkSdkVersion_ = "";
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return Api.internal_static_com_appodeal_ads_Adapter_descriptor;
        }

        public Adapter getDefaultInstanceForType() {
            return Adapter.getDefaultInstance();
        }

        public Adapter build() {
            Adapter buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public Adapter buildPartial() {
            Adapter adapter = new Adapter((GeneratedMessageV3.Builder) this);
            Object unused = adapter.status_ = this.status_;
            Object unused2 = adapter.version_ = this.version_;
            Object unused3 = adapter.networkSdkVersion_ = this.networkSdkVersion_;
            onBuilt();
            return adapter;
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
            if (message instanceof Adapter) {
                return mergeFrom((Adapter) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Adapter adapter) {
            if (adapter == Adapter.getDefaultInstance()) {
                return this;
            }
            if (!adapter.getStatus().isEmpty()) {
                this.status_ = adapter.status_;
                onChanged();
            }
            if (!adapter.getVersion().isEmpty()) {
                this.version_ = adapter.version_;
                onChanged();
            }
            if (!adapter.getNetworkSdkVersion().isEmpty()) {
                this.networkSdkVersion_ = adapter.networkSdkVersion_;
                onChanged();
            }
            mergeUnknownFields(adapter.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.appodeal.ads.api.Adapter.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.Adapter.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.appodeal.ads.api.Adapter r3 = (com.appodeal.ads.api.Adapter) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.appodeal.ads.api.Adapter) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.appodeal.ads.api.Adapter r4 = (com.appodeal.ads.api.Adapter) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.appodeal.ads.api.Adapter) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Adapter.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.Adapter$Builder");
        }

        public Builder setStatus(String str) {
            if (str != null) {
                this.status_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setVersion(String str) {
            if (str != null) {
                this.version_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setNetworkSdkVersion(String str) {
            if (str != null) {
                this.networkSdkVersion_ = str;
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

    public static Adapter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Adapter> parser() {
        return PARSER;
    }

    public Parser<Adapter> getParserForType() {
        return PARSER;
    }

    public Adapter getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
