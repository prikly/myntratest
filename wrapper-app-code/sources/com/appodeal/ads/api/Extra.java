package com.appodeal.ads.api;

import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.LazyStringArrayList;
import com.explorestack.protobuf.LazyStringList;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolStringList;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;

public final class Extra extends GeneratedMessageV3 implements ExtraOrBuilder {
    private static final Extra DEFAULT_INSTANCE = new Extra();
    /* access modifiers changed from: private */
    public static final Parser<Extra> PARSER = new AbstractParser<Extra>() {
        public Extra parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Extra(codedInputStream, extensionRegistryLite);
        }
    };
    /* access modifiers changed from: private */
    public volatile Object adUnitStat_;
    /* access modifiers changed from: private */
    public LazyStringList apps_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public float priceFloor_;
    /* access modifiers changed from: private */
    public LazyStringList sa_;

    private Extra(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private Extra() {
        this.memoizedIsInitialized = -1;
        this.adUnitStat_ = "";
        this.apps_ = LazyStringArrayList.EMPTY;
        this.sa_ = LazyStringArrayList.EMPTY;
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Extra();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Extra(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 13) {
                            this.priceFloor_ = codedInputStream.readFloat();
                        } else if (readTag == 18) {
                            this.adUnitStat_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 26) {
                            String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                            if (!z2 || !true) {
                                this.apps_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.apps_.add(readStringRequireUtf8);
                        } else if (readTag == 34) {
                            String readStringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                            if (!z2 || !true) {
                                this.sa_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.sa_.add(readStringRequireUtf82);
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
                        this.apps_ = this.apps_.getUnmodifiableView();
                    }
                    if (z2 && true) {
                        this.sa_ = this.sa_.getUnmodifiableView();
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.apps_ = this.apps_.getUnmodifiableView();
            }
            if (z2 && true) {
                this.sa_ = this.sa_.getUnmodifiableView();
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw null;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Api.internal_static_com_appodeal_ads_Extra_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Api.internal_static_com_appodeal_ads_Extra_fieldAccessorTable.ensureFieldAccessorsInitialized(Extra.class, Builder.class);
    }

    public float getPriceFloor() {
        return this.priceFloor_;
    }

    public String getAdUnitStat() {
        Object obj = this.adUnitStat_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.adUnitStat_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getAdUnitStatBytes() {
        Object obj = this.adUnitStat_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.adUnitStat_ = copyFromUtf8;
        return copyFromUtf8;
    }

    @Deprecated
    public ProtocolStringList getAppsList() {
        return this.apps_;
    }

    @Deprecated
    public int getAppsCount() {
        return this.apps_.size();
    }

    public ProtocolStringList getSaList() {
        return this.sa_;
    }

    public int getSaCount() {
        return this.sa_.size();
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
        float f2 = this.priceFloor_;
        if (f2 != 0.0f) {
            codedOutputStream.writeFloat(1, f2);
        }
        if (!getAdUnitStatBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.adUnitStat_);
        }
        for (int i = 0; i < this.apps_.size(); i++) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.apps_.getRaw(i));
        }
        for (int i2 = 0; i2 < this.sa_.size(); i2++) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.sa_.getRaw(i2));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        float f2 = this.priceFloor_;
        int computeFloatSize = f2 != 0.0f ? CodedOutputStream.computeFloatSize(1, f2) + 0 : 0;
        if (!getAdUnitStatBytes().isEmpty()) {
            computeFloatSize += GeneratedMessageV3.computeStringSize(2, this.adUnitStat_);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.apps_.size(); i3++) {
            i2 += computeStringSizeNoTag(this.apps_.getRaw(i3));
        }
        int size = computeFloatSize + i2 + (getAppsList().size() * 1);
        int i4 = 0;
        for (int i5 = 0; i5 < this.sa_.size(); i5++) {
            i4 += computeStringSizeNoTag(this.sa_.getRaw(i5));
        }
        int size2 = size + i4 + (getSaList().size() * 1) + this.unknownFields.getSerializedSize();
        this.memoizedSize = size2;
        return size2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Extra)) {
            return super.equals(obj);
        }
        Extra extra = (Extra) obj;
        if (Float.floatToIntBits(getPriceFloor()) == Float.floatToIntBits(extra.getPriceFloor()) && getAdUnitStat().equals(extra.getAdUnitStat()) && getAppsList().equals(extra.getAppsList()) && getSaList().equals(extra.getSaList()) && this.unknownFields.equals(extra.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getPriceFloor())) * 37) + 2) * 53) + getAdUnitStat().hashCode();
        if (getAppsCount() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + getAppsList().hashCode();
        }
        if (getSaCount() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + getSaList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Extra extra) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(extra);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExtraOrBuilder {
        private Object adUnitStat_;
        private LazyStringList apps_;
        private int bitField0_;
        private float priceFloor_;
        private LazyStringList sa_;

        public final boolean isInitialized() {
            return true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_Extra_fieldAccessorTable.ensureFieldAccessorsInitialized(Extra.class, Builder.class);
        }

        private Builder() {
            this.adUnitStat_ = "";
            this.apps_ = LazyStringArrayList.EMPTY;
            this.sa_ = LazyStringArrayList.EMPTY;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.adUnitStat_ = "";
            this.apps_ = LazyStringArrayList.EMPTY;
            this.sa_ = LazyStringArrayList.EMPTY;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = Extra.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.priceFloor_ = 0.0f;
            this.adUnitStat_ = "";
            this.apps_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            this.sa_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return Api.internal_static_com_appodeal_ads_Extra_descriptor;
        }

        public Extra getDefaultInstanceForType() {
            return Extra.getDefaultInstance();
        }

        public Extra build() {
            Extra buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public Extra buildPartial() {
            Extra extra = new Extra((GeneratedMessageV3.Builder) this);
            float unused = extra.priceFloor_ = this.priceFloor_;
            Object unused2 = extra.adUnitStat_ = this.adUnitStat_;
            if ((this.bitField0_ & 1) != 0) {
                this.apps_ = this.apps_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            LazyStringList unused3 = extra.apps_ = this.apps_;
            if ((this.bitField0_ & 2) != 0) {
                this.sa_ = this.sa_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            LazyStringList unused4 = extra.sa_ = this.sa_;
            onBuilt();
            return extra;
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
            if (message instanceof Extra) {
                return mergeFrom((Extra) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Extra extra) {
            if (extra == Extra.getDefaultInstance()) {
                return this;
            }
            if (extra.getPriceFloor() != 0.0f) {
                setPriceFloor(extra.getPriceFloor());
            }
            if (!extra.getAdUnitStat().isEmpty()) {
                this.adUnitStat_ = extra.adUnitStat_;
                onChanged();
            }
            if (!extra.apps_.isEmpty()) {
                if (this.apps_.isEmpty()) {
                    this.apps_ = extra.apps_;
                    this.bitField0_ &= -2;
                } else {
                    ensureAppsIsMutable();
                    this.apps_.addAll(extra.apps_);
                }
                onChanged();
            }
            if (!extra.sa_.isEmpty()) {
                if (this.sa_.isEmpty()) {
                    this.sa_ = extra.sa_;
                    this.bitField0_ &= -3;
                } else {
                    ensureSaIsMutable();
                    this.sa_.addAll(extra.sa_);
                }
                onChanged();
            }
            mergeUnknownFields(extra.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.appodeal.ads.api.Extra.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.Extra.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.appodeal.ads.api.Extra r3 = (com.appodeal.ads.api.Extra) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.appodeal.ads.api.Extra) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.appodeal.ads.api.Extra r4 = (com.appodeal.ads.api.Extra) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.appodeal.ads.api.Extra) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Extra.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.Extra$Builder");
        }

        public Builder setPriceFloor(float f2) {
            this.priceFloor_ = f2;
            onChanged();
            return this;
        }

        public Builder setAdUnitStat(String str) {
            if (str != null) {
                this.adUnitStat_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        private void ensureAppsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.apps_ = new LazyStringArrayList(this.apps_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureSaIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.sa_ = new LazyStringArrayList(this.sa_);
                this.bitField0_ |= 2;
            }
        }

        public Builder addSa(String str) {
            if (str != null) {
                ensureSaIsMutable();
                this.sa_.add(str);
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

    public static Extra getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Extra> parser() {
        return PARSER;
    }

    public Parser<Extra> getParserForType() {
        return PARSER;
    }

    public Extra getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
