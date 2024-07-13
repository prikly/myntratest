package com.appodeal.ads.api;

import com.explorestack.protobuf.AbstractParser;
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

public final class AdStats extends GeneratedMessageV3 implements AdStatsOrBuilder {
    private static final AdStats DEFAULT_INSTANCE = new AdStats();
    /* access modifiers changed from: private */
    public static final Parser<AdStats> PARSER = new AbstractParser<AdStats>() {
        public AdStats parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AdStats(codedInputStream, extensionRegistryLite);
        }
    };
    /* access modifiers changed from: private */
    public int banner320Click_;
    /* access modifiers changed from: private */
    public int banner320Show_;
    /* access modifiers changed from: private */
    public int bannerClick_;
    /* access modifiers changed from: private */
    public int bannerMrecClick_;
    /* access modifiers changed from: private */
    public int bannerMrecShow_;
    /* access modifiers changed from: private */
    public int bannerShow_;
    /* access modifiers changed from: private */
    public int click_;
    /* access modifiers changed from: private */
    public int finish_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public int nativeClick_;
    /* access modifiers changed from: private */
    public int nativeShow_;
    /* access modifiers changed from: private */
    public int rewardedVideoClick_;
    /* access modifiers changed from: private */
    public int rewardedVideoFinish_;
    /* access modifiers changed from: private */
    public int rewardedVideoShow_;
    /* access modifiers changed from: private */
    public int show_;
    /* access modifiers changed from: private */
    public int videoClick_;
    /* access modifiers changed from: private */
    public int videoFinish_;
    /* access modifiers changed from: private */
    public int videoShow_;

    private AdStats(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private AdStats() {
        this.memoizedIsInitialized = -1;
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AdStats();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private AdStats(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    switch (readTag) {
                        case 0:
                            z = true;
                            break;
                        case 8:
                            this.show_ = codedInputStream.readInt32();
                            break;
                        case 16:
                            this.click_ = codedInputStream.readInt32();
                            break;
                        case 24:
                            this.finish_ = codedInputStream.readInt32();
                            break;
                        case 32:
                            this.bannerShow_ = codedInputStream.readInt32();
                            break;
                        case 40:
                            this.bannerClick_ = codedInputStream.readInt32();
                            break;
                        case 48:
                            this.videoShow_ = codedInputStream.readInt32();
                            break;
                        case 56:
                            this.videoClick_ = codedInputStream.readInt32();
                            break;
                        case 64:
                            this.videoFinish_ = codedInputStream.readInt32();
                            break;
                        case 72:
                            this.rewardedVideoShow_ = codedInputStream.readInt32();
                            break;
                        case 80:
                            this.rewardedVideoClick_ = codedInputStream.readInt32();
                            break;
                        case 88:
                            this.rewardedVideoFinish_ = codedInputStream.readInt32();
                            break;
                        case 96:
                            this.banner320Show_ = codedInputStream.readInt32();
                            break;
                        case 104:
                            this.banner320Click_ = codedInputStream.readInt32();
                            break;
                        case 112:
                            this.bannerMrecShow_ = codedInputStream.readInt32();
                            break;
                        case 120:
                            this.bannerMrecClick_ = codedInputStream.readInt32();
                            break;
                        case 128:
                            this.nativeShow_ = codedInputStream.readInt32();
                            break;
                        case 136:
                            this.nativeClick_ = codedInputStream.readInt32();
                            break;
                        default:
                            if (parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                break;
                            }
                            z = true;
                            break;
                    }
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
        return Api.internal_static_com_appodeal_ads_AdStats_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Api.internal_static_com_appodeal_ads_AdStats_fieldAccessorTable.ensureFieldAccessorsInitialized(AdStats.class, Builder.class);
    }

    public int getShow() {
        return this.show_;
    }

    public int getClick() {
        return this.click_;
    }

    public int getFinish() {
        return this.finish_;
    }

    public int getBannerShow() {
        return this.bannerShow_;
    }

    public int getBannerClick() {
        return this.bannerClick_;
    }

    public int getVideoShow() {
        return this.videoShow_;
    }

    public int getVideoClick() {
        return this.videoClick_;
    }

    public int getVideoFinish() {
        return this.videoFinish_;
    }

    public int getRewardedVideoShow() {
        return this.rewardedVideoShow_;
    }

    public int getRewardedVideoClick() {
        return this.rewardedVideoClick_;
    }

    public int getRewardedVideoFinish() {
        return this.rewardedVideoFinish_;
    }

    public int getBanner320Show() {
        return this.banner320Show_;
    }

    public int getBanner320Click() {
        return this.banner320Click_;
    }

    public int getBannerMrecShow() {
        return this.bannerMrecShow_;
    }

    public int getBannerMrecClick() {
        return this.bannerMrecClick_;
    }

    public int getNativeShow() {
        return this.nativeShow_;
    }

    public int getNativeClick() {
        return this.nativeClick_;
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
        int i = this.show_;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        int i2 = this.click_;
        if (i2 != 0) {
            codedOutputStream.writeInt32(2, i2);
        }
        int i3 = this.finish_;
        if (i3 != 0) {
            codedOutputStream.writeInt32(3, i3);
        }
        int i4 = this.bannerShow_;
        if (i4 != 0) {
            codedOutputStream.writeInt32(4, i4);
        }
        int i5 = this.bannerClick_;
        if (i5 != 0) {
            codedOutputStream.writeInt32(5, i5);
        }
        int i6 = this.videoShow_;
        if (i6 != 0) {
            codedOutputStream.writeInt32(6, i6);
        }
        int i7 = this.videoClick_;
        if (i7 != 0) {
            codedOutputStream.writeInt32(7, i7);
        }
        int i8 = this.videoFinish_;
        if (i8 != 0) {
            codedOutputStream.writeInt32(8, i8);
        }
        int i9 = this.rewardedVideoShow_;
        if (i9 != 0) {
            codedOutputStream.writeInt32(9, i9);
        }
        int i10 = this.rewardedVideoClick_;
        if (i10 != 0) {
            codedOutputStream.writeInt32(10, i10);
        }
        int i11 = this.rewardedVideoFinish_;
        if (i11 != 0) {
            codedOutputStream.writeInt32(11, i11);
        }
        int i12 = this.banner320Show_;
        if (i12 != 0) {
            codedOutputStream.writeInt32(12, i12);
        }
        int i13 = this.banner320Click_;
        if (i13 != 0) {
            codedOutputStream.writeInt32(13, i13);
        }
        int i14 = this.bannerMrecShow_;
        if (i14 != 0) {
            codedOutputStream.writeInt32(14, i14);
        }
        int i15 = this.bannerMrecClick_;
        if (i15 != 0) {
            codedOutputStream.writeInt32(15, i15);
        }
        int i16 = this.nativeShow_;
        if (i16 != 0) {
            codedOutputStream.writeInt32(16, i16);
        }
        int i17 = this.nativeClick_;
        if (i17 != 0) {
            codedOutputStream.writeInt32(17, i17);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.show_;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
        }
        int i4 = this.click_;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(2, i4);
        }
        int i5 = this.finish_;
        if (i5 != 0) {
            i2 += CodedOutputStream.computeInt32Size(3, i5);
        }
        int i6 = this.bannerShow_;
        if (i6 != 0) {
            i2 += CodedOutputStream.computeInt32Size(4, i6);
        }
        int i7 = this.bannerClick_;
        if (i7 != 0) {
            i2 += CodedOutputStream.computeInt32Size(5, i7);
        }
        int i8 = this.videoShow_;
        if (i8 != 0) {
            i2 += CodedOutputStream.computeInt32Size(6, i8);
        }
        int i9 = this.videoClick_;
        if (i9 != 0) {
            i2 += CodedOutputStream.computeInt32Size(7, i9);
        }
        int i10 = this.videoFinish_;
        if (i10 != 0) {
            i2 += CodedOutputStream.computeInt32Size(8, i10);
        }
        int i11 = this.rewardedVideoShow_;
        if (i11 != 0) {
            i2 += CodedOutputStream.computeInt32Size(9, i11);
        }
        int i12 = this.rewardedVideoClick_;
        if (i12 != 0) {
            i2 += CodedOutputStream.computeInt32Size(10, i12);
        }
        int i13 = this.rewardedVideoFinish_;
        if (i13 != 0) {
            i2 += CodedOutputStream.computeInt32Size(11, i13);
        }
        int i14 = this.banner320Show_;
        if (i14 != 0) {
            i2 += CodedOutputStream.computeInt32Size(12, i14);
        }
        int i15 = this.banner320Click_;
        if (i15 != 0) {
            i2 += CodedOutputStream.computeInt32Size(13, i15);
        }
        int i16 = this.bannerMrecShow_;
        if (i16 != 0) {
            i2 += CodedOutputStream.computeInt32Size(14, i16);
        }
        int i17 = this.bannerMrecClick_;
        if (i17 != 0) {
            i2 += CodedOutputStream.computeInt32Size(15, i17);
        }
        int i18 = this.nativeShow_;
        if (i18 != 0) {
            i2 += CodedOutputStream.computeInt32Size(16, i18);
        }
        int i19 = this.nativeClick_;
        if (i19 != 0) {
            i2 += CodedOutputStream.computeInt32Size(17, i19);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdStats)) {
            return super.equals(obj);
        }
        AdStats adStats = (AdStats) obj;
        if (getShow() == adStats.getShow() && getClick() == adStats.getClick() && getFinish() == adStats.getFinish() && getBannerShow() == adStats.getBannerShow() && getBannerClick() == adStats.getBannerClick() && getVideoShow() == adStats.getVideoShow() && getVideoClick() == adStats.getVideoClick() && getVideoFinish() == adStats.getVideoFinish() && getRewardedVideoShow() == adStats.getRewardedVideoShow() && getRewardedVideoClick() == adStats.getRewardedVideoClick() && getRewardedVideoFinish() == adStats.getRewardedVideoFinish() && getBanner320Show() == adStats.getBanner320Show() && getBanner320Click() == adStats.getBanner320Click() && getBannerMrecShow() == adStats.getBannerMrecShow() && getBannerMrecClick() == adStats.getBannerMrecClick() && getNativeShow() == adStats.getNativeShow() && getNativeClick() == adStats.getNativeClick() && this.unknownFields.equals(adStats.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getShow()) * 37) + 2) * 53) + getClick()) * 37) + 3) * 53) + getFinish()) * 37) + 4) * 53) + getBannerShow()) * 37) + 5) * 53) + getBannerClick()) * 37) + 6) * 53) + getVideoShow()) * 37) + 7) * 53) + getVideoClick()) * 37) + 8) * 53) + getVideoFinish()) * 37) + 9) * 53) + getRewardedVideoShow()) * 37) + 10) * 53) + getRewardedVideoClick()) * 37) + 11) * 53) + getRewardedVideoFinish()) * 37) + 12) * 53) + getBanner320Show()) * 37) + 13) * 53) + getBanner320Click()) * 37) + 14) * 53) + getBannerMrecShow()) * 37) + 15) * 53) + getBannerMrecClick()) * 37) + 16) * 53) + getNativeShow()) * 37) + 17) * 53) + getNativeClick()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AdStats adStats) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(adStats);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdStatsOrBuilder {
        private int banner320Click_;
        private int banner320Show_;
        private int bannerClick_;
        private int bannerMrecClick_;
        private int bannerMrecShow_;
        private int bannerShow_;
        private int click_;
        private int finish_;
        private int nativeClick_;
        private int nativeShow_;
        private int rewardedVideoClick_;
        private int rewardedVideoFinish_;
        private int rewardedVideoShow_;
        private int show_;
        private int videoClick_;
        private int videoFinish_;
        private int videoShow_;

        public final boolean isInitialized() {
            return true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_AdStats_fieldAccessorTable.ensureFieldAccessorsInitialized(AdStats.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = AdStats.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.show_ = 0;
            this.click_ = 0;
            this.finish_ = 0;
            this.bannerShow_ = 0;
            this.bannerClick_ = 0;
            this.videoShow_ = 0;
            this.videoClick_ = 0;
            this.videoFinish_ = 0;
            this.rewardedVideoShow_ = 0;
            this.rewardedVideoClick_ = 0;
            this.rewardedVideoFinish_ = 0;
            this.banner320Show_ = 0;
            this.banner320Click_ = 0;
            this.bannerMrecShow_ = 0;
            this.bannerMrecClick_ = 0;
            this.nativeShow_ = 0;
            this.nativeClick_ = 0;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return Api.internal_static_com_appodeal_ads_AdStats_descriptor;
        }

        public AdStats getDefaultInstanceForType() {
            return AdStats.getDefaultInstance();
        }

        public AdStats build() {
            AdStats buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public AdStats buildPartial() {
            AdStats adStats = new AdStats((GeneratedMessageV3.Builder) this);
            int unused = adStats.show_ = this.show_;
            int unused2 = adStats.click_ = this.click_;
            int unused3 = adStats.finish_ = this.finish_;
            int unused4 = adStats.bannerShow_ = this.bannerShow_;
            int unused5 = adStats.bannerClick_ = this.bannerClick_;
            int unused6 = adStats.videoShow_ = this.videoShow_;
            int unused7 = adStats.videoClick_ = this.videoClick_;
            int unused8 = adStats.videoFinish_ = this.videoFinish_;
            int unused9 = adStats.rewardedVideoShow_ = this.rewardedVideoShow_;
            int unused10 = adStats.rewardedVideoClick_ = this.rewardedVideoClick_;
            int unused11 = adStats.rewardedVideoFinish_ = this.rewardedVideoFinish_;
            int unused12 = adStats.banner320Show_ = this.banner320Show_;
            int unused13 = adStats.banner320Click_ = this.banner320Click_;
            int unused14 = adStats.bannerMrecShow_ = this.bannerMrecShow_;
            int unused15 = adStats.bannerMrecClick_ = this.bannerMrecClick_;
            int unused16 = adStats.nativeShow_ = this.nativeShow_;
            int unused17 = adStats.nativeClick_ = this.nativeClick_;
            onBuilt();
            return adStats;
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
            if (message instanceof AdStats) {
                return mergeFrom((AdStats) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AdStats adStats) {
            if (adStats == AdStats.getDefaultInstance()) {
                return this;
            }
            if (adStats.getShow() != 0) {
                setShow(adStats.getShow());
            }
            if (adStats.getClick() != 0) {
                setClick(adStats.getClick());
            }
            if (adStats.getFinish() != 0) {
                setFinish(adStats.getFinish());
            }
            if (adStats.getBannerShow() != 0) {
                setBannerShow(adStats.getBannerShow());
            }
            if (adStats.getBannerClick() != 0) {
                setBannerClick(adStats.getBannerClick());
            }
            if (adStats.getVideoShow() != 0) {
                setVideoShow(adStats.getVideoShow());
            }
            if (adStats.getVideoClick() != 0) {
                setVideoClick(adStats.getVideoClick());
            }
            if (adStats.getVideoFinish() != 0) {
                setVideoFinish(adStats.getVideoFinish());
            }
            if (adStats.getRewardedVideoShow() != 0) {
                setRewardedVideoShow(adStats.getRewardedVideoShow());
            }
            if (adStats.getRewardedVideoClick() != 0) {
                setRewardedVideoClick(adStats.getRewardedVideoClick());
            }
            if (adStats.getRewardedVideoFinish() != 0) {
                setRewardedVideoFinish(adStats.getRewardedVideoFinish());
            }
            if (adStats.getBanner320Show() != 0) {
                setBanner320Show(adStats.getBanner320Show());
            }
            if (adStats.getBanner320Click() != 0) {
                setBanner320Click(adStats.getBanner320Click());
            }
            if (adStats.getBannerMrecShow() != 0) {
                setBannerMrecShow(adStats.getBannerMrecShow());
            }
            if (adStats.getBannerMrecClick() != 0) {
                setBannerMrecClick(adStats.getBannerMrecClick());
            }
            if (adStats.getNativeShow() != 0) {
                setNativeShow(adStats.getNativeShow());
            }
            if (adStats.getNativeClick() != 0) {
                setNativeClick(adStats.getNativeClick());
            }
            mergeUnknownFields(adStats.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.appodeal.ads.api.AdStats.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.AdStats.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.appodeal.ads.api.AdStats r3 = (com.appodeal.ads.api.AdStats) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.appodeal.ads.api.AdStats) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.appodeal.ads.api.AdStats r4 = (com.appodeal.ads.api.AdStats) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.appodeal.ads.api.AdStats) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.AdStats.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.AdStats$Builder");
        }

        public Builder setShow(int i) {
            this.show_ = i;
            onChanged();
            return this;
        }

        public Builder setClick(int i) {
            this.click_ = i;
            onChanged();
            return this;
        }

        public Builder setFinish(int i) {
            this.finish_ = i;
            onChanged();
            return this;
        }

        public Builder setBannerShow(int i) {
            this.bannerShow_ = i;
            onChanged();
            return this;
        }

        public Builder setBannerClick(int i) {
            this.bannerClick_ = i;
            onChanged();
            return this;
        }

        public Builder setVideoShow(int i) {
            this.videoShow_ = i;
            onChanged();
            return this;
        }

        public Builder setVideoClick(int i) {
            this.videoClick_ = i;
            onChanged();
            return this;
        }

        public Builder setVideoFinish(int i) {
            this.videoFinish_ = i;
            onChanged();
            return this;
        }

        public Builder setRewardedVideoShow(int i) {
            this.rewardedVideoShow_ = i;
            onChanged();
            return this;
        }

        public Builder setRewardedVideoClick(int i) {
            this.rewardedVideoClick_ = i;
            onChanged();
            return this;
        }

        public Builder setRewardedVideoFinish(int i) {
            this.rewardedVideoFinish_ = i;
            onChanged();
            return this;
        }

        public Builder setBanner320Show(int i) {
            this.banner320Show_ = i;
            onChanged();
            return this;
        }

        public Builder setBanner320Click(int i) {
            this.banner320Click_ = i;
            onChanged();
            return this;
        }

        public Builder setBannerMrecShow(int i) {
            this.bannerMrecShow_ = i;
            onChanged();
            return this;
        }

        public Builder setBannerMrecClick(int i) {
            this.bannerMrecClick_ = i;
            onChanged();
            return this;
        }

        public Builder setNativeShow(int i) {
            this.nativeShow_ = i;
            onChanged();
            return this;
        }

        public Builder setNativeClick(int i) {
            this.nativeClick_ = i;
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

    public static AdStats getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AdStats> parser() {
        return PARSER;
    }

    public Parser<AdStats> getParserForType() {
        return PARSER;
    }

    public AdStats getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
