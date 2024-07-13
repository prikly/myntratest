package com.appodeal.ads.api;

import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.LazyStringArrayList;
import com.explorestack.protobuf.LazyStringList;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolStringList;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;

public final class Get extends GeneratedMessageV3 implements GetOrBuilder {
    private static final Get DEFAULT_INSTANCE = new Get();
    /* access modifiers changed from: private */
    public static final Parser<Get> PARSER = new AbstractParser<Get>() {
        public Get parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Get(codedInputStream, extensionRegistryLite);
        }
    };
    /* access modifiers changed from: private */
    public boolean checkSdkVersion_;
    /* access modifiers changed from: private */
    public boolean debug_;
    /* access modifiers changed from: private */
    public boolean largeBanners_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public boolean rewardedVideo_;
    /* access modifiers changed from: private */
    public LazyStringList showArray_;
    /* access modifiers changed from: private */
    public volatile Object type_;

    private Get(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private Get() {
        this.memoizedIsInitialized = -1;
        this.type_ = "";
        this.showArray_ = LazyStringArrayList.EMPTY;
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Get();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Get(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.type_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 16) {
                            this.largeBanners_ = codedInputStream.readBool();
                        } else if (readTag == 24) {
                            this.rewardedVideo_ = codedInputStream.readBool();
                        } else if (readTag == 32) {
                            this.debug_ = codedInputStream.readBool();
                        } else if (readTag == 42) {
                            String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                            if (!z2 || !true) {
                                this.showArray_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.showArray_.add(readStringRequireUtf8);
                        } else if (readTag == 48) {
                            this.checkSdkVersion_ = codedInputStream.readBool();
                        } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.showArray_ = this.showArray_.getUnmodifiableView();
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.showArray_ = this.showArray_.getUnmodifiableView();
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw null;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Api.internal_static_com_appodeal_ads_Get_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Api.internal_static_com_appodeal_ads_Get_fieldAccessorTable.ensureFieldAccessorsInitialized(Get.class, Builder.class);
    }

    public String getType() {
        Object obj = this.type_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.type_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getTypeBytes() {
        Object obj = this.type_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.type_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public boolean getLargeBanners() {
        return this.largeBanners_;
    }

    public boolean getRewardedVideo() {
        return this.rewardedVideo_;
    }

    public boolean getDebug() {
        return this.debug_;
    }

    public ProtocolStringList getShowArrayList() {
        return this.showArray_;
    }

    public int getShowArrayCount() {
        return this.showArray_.size();
    }

    @Deprecated
    public boolean getCheckSdkVersion() {
        return this.checkSdkVersion_;
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
        if (!getTypeBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.type_);
        }
        boolean z = this.largeBanners_;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
        boolean z2 = this.rewardedVideo_;
        if (z2) {
            codedOutputStream.writeBool(3, z2);
        }
        boolean z3 = this.debug_;
        if (z3) {
            codedOutputStream.writeBool(4, z3);
        }
        for (int i = 0; i < this.showArray_.size(); i++) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.showArray_.getRaw(i));
        }
        boolean z4 = this.checkSdkVersion_;
        if (z4) {
            codedOutputStream.writeBool(6, z4);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getTypeBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.type_) + 0 : 0;
        boolean z = this.largeBanners_;
        if (z) {
            computeStringSize += CodedOutputStream.computeBoolSize(2, z);
        }
        boolean z2 = this.rewardedVideo_;
        if (z2) {
            computeStringSize += CodedOutputStream.computeBoolSize(3, z2);
        }
        boolean z3 = this.debug_;
        if (z3) {
            computeStringSize += CodedOutputStream.computeBoolSize(4, z3);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.showArray_.size(); i3++) {
            i2 += computeStringSizeNoTag(this.showArray_.getRaw(i3));
        }
        int size = computeStringSize + i2 + (getShowArrayList().size() * 1);
        boolean z4 = this.checkSdkVersion_;
        if (z4) {
            size += CodedOutputStream.computeBoolSize(6, z4);
        }
        int serializedSize = size + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Get)) {
            return super.equals(obj);
        }
        Get get = (Get) obj;
        if (getType().equals(get.getType()) && getLargeBanners() == get.getLargeBanners() && getRewardedVideo() == get.getRewardedVideo() && getDebug() == get.getDebug() && getShowArrayList().equals(get.getShowArrayList()) && getCheckSdkVersion() == get.getCheckSdkVersion() && this.unknownFields.equals(get.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getType().hashCode()) * 37) + 2) * 53) + Internal.hashBoolean(getLargeBanners())) * 37) + 3) * 53) + Internal.hashBoolean(getRewardedVideo())) * 37) + 4) * 53) + Internal.hashBoolean(getDebug());
        if (getShowArrayCount() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + getShowArrayList().hashCode();
        }
        int hashBoolean = (((((hashCode * 37) + 6) * 53) + Internal.hashBoolean(getCheckSdkVersion())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashBoolean;
        return hashBoolean;
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Get get) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(get);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetOrBuilder {
        private int bitField0_;
        private boolean checkSdkVersion_;
        private boolean debug_;
        private boolean largeBanners_;
        private boolean rewardedVideo_;
        private LazyStringList showArray_;
        private Object type_;

        public final boolean isInitialized() {
            return true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_Get_fieldAccessorTable.ensureFieldAccessorsInitialized(Get.class, Builder.class);
        }

        private Builder() {
            this.type_ = "";
            this.showArray_ = LazyStringArrayList.EMPTY;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.type_ = "";
            this.showArray_ = LazyStringArrayList.EMPTY;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = Get.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.type_ = "";
            this.largeBanners_ = false;
            this.rewardedVideo_ = false;
            this.debug_ = false;
            this.showArray_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            this.checkSdkVersion_ = false;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return Api.internal_static_com_appodeal_ads_Get_descriptor;
        }

        public Get getDefaultInstanceForType() {
            return Get.getDefaultInstance();
        }

        public Get build() {
            Get buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public Get buildPartial() {
            Get get = new Get((GeneratedMessageV3.Builder) this);
            Object unused = get.type_ = this.type_;
            boolean unused2 = get.largeBanners_ = this.largeBanners_;
            boolean unused3 = get.rewardedVideo_ = this.rewardedVideo_;
            boolean unused4 = get.debug_ = this.debug_;
            if ((this.bitField0_ & 1) != 0) {
                this.showArray_ = this.showArray_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            LazyStringList unused5 = get.showArray_ = this.showArray_;
            boolean unused6 = get.checkSdkVersion_ = this.checkSdkVersion_;
            onBuilt();
            return get;
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
            if (message instanceof Get) {
                return mergeFrom((Get) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Get get) {
            if (get == Get.getDefaultInstance()) {
                return this;
            }
            if (!get.getType().isEmpty()) {
                this.type_ = get.type_;
                onChanged();
            }
            if (get.getLargeBanners()) {
                setLargeBanners(get.getLargeBanners());
            }
            if (get.getRewardedVideo()) {
                setRewardedVideo(get.getRewardedVideo());
            }
            if (get.getDebug()) {
                setDebug(get.getDebug());
            }
            if (!get.showArray_.isEmpty()) {
                if (this.showArray_.isEmpty()) {
                    this.showArray_ = get.showArray_;
                    this.bitField0_ &= -2;
                } else {
                    ensureShowArrayIsMutable();
                    this.showArray_.addAll(get.showArray_);
                }
                onChanged();
            }
            if (get.getCheckSdkVersion()) {
                setCheckSdkVersion(get.getCheckSdkVersion());
            }
            mergeUnknownFields(get.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.appodeal.ads.api.Get.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.Get.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.appodeal.ads.api.Get r3 = (com.appodeal.ads.api.Get) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.appodeal.ads.api.Get) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.appodeal.ads.api.Get r4 = (com.appodeal.ads.api.Get) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.appodeal.ads.api.Get) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Get.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.Get$Builder");
        }

        public Builder setLargeBanners(boolean z) {
            this.largeBanners_ = z;
            onChanged();
            return this;
        }

        public Builder setRewardedVideo(boolean z) {
            this.rewardedVideo_ = z;
            onChanged();
            return this;
        }

        public Builder setDebug(boolean z) {
            this.debug_ = z;
            onChanged();
            return this;
        }

        private void ensureShowArrayIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.showArray_ = new LazyStringArrayList(this.showArray_);
                this.bitField0_ |= 1;
            }
        }

        @Deprecated
        public Builder setCheckSdkVersion(boolean z) {
            this.checkSdkVersion_ = z;
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

    public static Get getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Get> parser() {
        return PARSER;
    }

    public Parser<Get> getParserForType() {
        return PARSER;
    }

    public Get getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
