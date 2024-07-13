package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Format implements Bundleable {
    public static final Bundleable.Creator<Format> CREATOR = $$Lambda$Format$ZX55XDPga2MnLOKNeC4U1ivqqGc.INSTANCE;
    private static final Format DEFAULT = new Builder().build();
    public final int accessibilityChannel;
    public final int averageBitrate;
    public final int bitrate;
    public final int channelCount;
    public final String codecs;
    public final ColorInfo colorInfo;
    public final String containerMimeType;
    public final int cryptoType;
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final float frameRate;
    private int hashCode;
    public final int height;
    public final String id;
    public final List<byte[]> initializationData;
    public final String label;
    public final String language;
    public final int maxInputSize;
    public final Metadata metadata;
    public final int pcmEncoding;
    public final int peakBitrate;
    public final float pixelWidthHeightRatio;
    public final byte[] projectionData;
    public final int roleFlags;
    public final int rotationDegrees;
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int width;

    private static <T> T defaultIfNull(T t, T t2) {
        return t != null ? t : t2;
    }

    public static final class Builder {
        /* access modifiers changed from: private */
        public int accessibilityChannel = -1;
        /* access modifiers changed from: private */
        public int averageBitrate = -1;
        /* access modifiers changed from: private */
        public int channelCount = -1;
        /* access modifiers changed from: private */
        public String codecs;
        /* access modifiers changed from: private */
        public ColorInfo colorInfo;
        /* access modifiers changed from: private */
        public String containerMimeType;
        /* access modifiers changed from: private */
        public int cryptoType = 0;
        /* access modifiers changed from: private */
        public DrmInitData drmInitData;
        /* access modifiers changed from: private */
        public int encoderDelay;
        /* access modifiers changed from: private */
        public int encoderPadding;
        /* access modifiers changed from: private */
        public float frameRate = -1.0f;
        /* access modifiers changed from: private */
        public int height = -1;
        /* access modifiers changed from: private */
        public String id;
        /* access modifiers changed from: private */
        public List<byte[]> initializationData;
        /* access modifiers changed from: private */
        public String label;
        /* access modifiers changed from: private */
        public String language;
        /* access modifiers changed from: private */
        public int maxInputSize = -1;
        /* access modifiers changed from: private */
        public Metadata metadata;
        /* access modifiers changed from: private */
        public int pcmEncoding = -1;
        /* access modifiers changed from: private */
        public int peakBitrate = -1;
        /* access modifiers changed from: private */
        public float pixelWidthHeightRatio = 1.0f;
        /* access modifiers changed from: private */
        public byte[] projectionData;
        /* access modifiers changed from: private */
        public int roleFlags;
        /* access modifiers changed from: private */
        public int rotationDegrees;
        /* access modifiers changed from: private */
        public String sampleMimeType;
        /* access modifiers changed from: private */
        public int sampleRate = -1;
        /* access modifiers changed from: private */
        public int selectionFlags;
        /* access modifiers changed from: private */
        public int stereoMode = -1;
        /* access modifiers changed from: private */
        public long subsampleOffsetUs = Long.MAX_VALUE;
        /* access modifiers changed from: private */
        public int width = -1;

        public Builder setId(String str) {
            this.id = str;
            return this;
        }

        public Builder setLabel(String str) {
            this.label = str;
            return this;
        }

        public Builder setLanguage(String str) {
            this.language = str;
            return this;
        }

        public Builder setSelectionFlags(int i) {
            this.selectionFlags = i;
            return this;
        }

        public Builder setRoleFlags(int i) {
            this.roleFlags = i;
            return this;
        }

        public Builder setAverageBitrate(int i) {
            this.averageBitrate = i;
            return this;
        }

        public Builder setPeakBitrate(int i) {
            this.peakBitrate = i;
            return this;
        }

        public Builder setCodecs(String str) {
            this.codecs = str;
            return this;
        }

        public Builder setMetadata(Metadata metadata2) {
            this.metadata = metadata2;
            return this;
        }

        public Builder setContainerMimeType(String str) {
            this.containerMimeType = str;
            return this;
        }

        public Builder setSampleMimeType(String str) {
            this.sampleMimeType = str;
            return this;
        }

        public Builder setMaxInputSize(int i) {
            this.maxInputSize = i;
            return this;
        }

        public Builder setInitializationData(List<byte[]> list) {
            this.initializationData = list;
            return this;
        }

        public Builder setDrmInitData(DrmInitData drmInitData2) {
            this.drmInitData = drmInitData2;
            return this;
        }

        public Builder setSubsampleOffsetUs(long j) {
            this.subsampleOffsetUs = j;
            return this;
        }

        public Builder setWidth(int i) {
            this.width = i;
            return this;
        }

        public Builder setHeight(int i) {
            this.height = i;
            return this;
        }

        public Builder setFrameRate(float f2) {
            this.frameRate = f2;
            return this;
        }

        public Builder setRotationDegrees(int i) {
            this.rotationDegrees = i;
            return this;
        }

        public Builder setPixelWidthHeightRatio(float f2) {
            this.pixelWidthHeightRatio = f2;
            return this;
        }

        public Builder setProjectionData(byte[] bArr) {
            this.projectionData = bArr;
            return this;
        }

        public Builder setStereoMode(int i) {
            this.stereoMode = i;
            return this;
        }

        public Builder setColorInfo(ColorInfo colorInfo2) {
            this.colorInfo = colorInfo2;
            return this;
        }

        public Builder setChannelCount(int i) {
            this.channelCount = i;
            return this;
        }

        public Builder setSampleRate(int i) {
            this.sampleRate = i;
            return this;
        }

        public Builder setPcmEncoding(int i) {
            this.pcmEncoding = i;
            return this;
        }

        public Builder setEncoderDelay(int i) {
            this.encoderDelay = i;
            return this;
        }

        public Builder setEncoderPadding(int i) {
            this.encoderPadding = i;
            return this;
        }

        public Builder setAccessibilityChannel(int i) {
            this.accessibilityChannel = i;
            return this;
        }

        public Builder setCryptoType(int i) {
            this.cryptoType = i;
            return this;
        }

        public Format build() {
            return new Format(this);
        }
    }

    private Format(Builder builder) {
        this.id = builder.id;
        this.label = builder.label;
        this.language = Util.normalizeLanguageCode(builder.language);
        this.selectionFlags = builder.selectionFlags;
        this.roleFlags = builder.roleFlags;
        this.averageBitrate = builder.averageBitrate;
        int access$700 = builder.peakBitrate;
        this.peakBitrate = access$700;
        this.bitrate = access$700 == -1 ? this.averageBitrate : access$700;
        this.codecs = builder.codecs;
        this.metadata = builder.metadata;
        this.containerMimeType = builder.containerMimeType;
        this.sampleMimeType = builder.sampleMimeType;
        this.maxInputSize = builder.maxInputSize;
        this.initializationData = builder.initializationData == null ? Collections.emptyList() : builder.initializationData;
        this.drmInitData = builder.drmInitData;
        this.subsampleOffsetUs = builder.subsampleOffsetUs;
        this.width = builder.width;
        this.height = builder.height;
        this.frameRate = builder.frameRate;
        int i = 0;
        this.rotationDegrees = builder.rotationDegrees == -1 ? 0 : builder.rotationDegrees;
        this.pixelWidthHeightRatio = builder.pixelWidthHeightRatio == -1.0f ? 1.0f : builder.pixelWidthHeightRatio;
        this.projectionData = builder.projectionData;
        this.stereoMode = builder.stereoMode;
        this.colorInfo = builder.colorInfo;
        this.channelCount = builder.channelCount;
        this.sampleRate = builder.sampleRate;
        this.pcmEncoding = builder.pcmEncoding;
        this.encoderDelay = builder.encoderDelay == -1 ? 0 : builder.encoderDelay;
        this.encoderPadding = builder.encoderPadding != -1 ? builder.encoderPadding : i;
        this.accessibilityChannel = builder.accessibilityChannel;
        if (builder.cryptoType != 0 || this.drmInitData == null) {
            this.cryptoType = builder.cryptoType;
        } else {
            this.cryptoType = 1;
        }
    }

    public String toString() {
        String str = this.id;
        String str2 = this.label;
        String str3 = this.containerMimeType;
        String str4 = this.sampleMimeType;
        String str5 = this.codecs;
        int i = this.bitrate;
        String str6 = this.language;
        int i2 = this.width;
        int i3 = this.height;
        float f2 = this.frameRate;
        int i4 = this.channelCount;
        int i5 = this.sampleRate;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f2);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            String str = this.id;
            int i = 0;
            int hashCode2 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.language;
            int hashCode4 = (((((((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31) + this.averageBitrate) * 31) + this.peakBitrate) * 31;
            String str4 = this.codecs;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata2 = this.metadata;
            int hashCode6 = (hashCode5 + (metadata2 == null ? 0 : metadata2.hashCode())) * 31;
            String str5 = this.containerMimeType;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.sampleMimeType;
            if (str6 != null) {
                i = str6.hashCode();
            }
            this.hashCode = ((((((((((((((((((((((((((((((hashCode7 + i) * 31) + this.maxInputSize) * 31) + ((int) this.subsampleOffsetUs)) * 31) + this.width) * 31) + this.height) * 31) + Float.floatToIntBits(this.frameRate)) * 31) + this.rotationDegrees) * 31) + Float.floatToIntBits(this.pixelWidthHeightRatio)) * 31) + this.stereoMode) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + this.pcmEncoding) * 31) + this.encoderDelay) * 31) + this.encoderPadding) * 31) + this.accessibilityChannel) * 31) + this.cryptoType;
        }
        return this.hashCode;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i2 = this.hashCode;
        if ((i2 == 0 || (i = format.hashCode) == 0 || i2 == i) && this.selectionFlags == format.selectionFlags && this.roleFlags == format.roleFlags && this.averageBitrate == format.averageBitrate && this.peakBitrate == format.peakBitrate && this.maxInputSize == format.maxInputSize && this.subsampleOffsetUs == format.subsampleOffsetUs && this.width == format.width && this.height == format.height && this.rotationDegrees == format.rotationDegrees && this.stereoMode == format.stereoMode && this.channelCount == format.channelCount && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.accessibilityChannel == format.accessibilityChannel && this.cryptoType == format.cryptoType && Float.compare(this.frameRate, format.frameRate) == 0 && Float.compare(this.pixelWidthHeightRatio, format.pixelWidthHeightRatio) == 0 && Util.areEqual(this.id, format.id) && Util.areEqual(this.label, format.label) && Util.areEqual(this.codecs, format.codecs) && Util.areEqual(this.containerMimeType, format.containerMimeType) && Util.areEqual(this.sampleMimeType, format.sampleMimeType) && Util.areEqual(this.language, format.language) && Arrays.equals(this.projectionData, format.projectionData) && Util.areEqual(this.metadata, format.metadata) && Util.areEqual(this.colorInfo, format.colorInfo) && Util.areEqual(this.drmInitData, format.drmInitData) && initializationDataEquals(format)) {
            return true;
        }
        return false;
    }

    public boolean initializationDataEquals(Format format) {
        if (this.initializationData.size() != format.initializationData.size()) {
            return false;
        }
        for (int i = 0; i < this.initializationData.size(); i++) {
            if (!Arrays.equals(this.initializationData.get(i), format.initializationData.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static Format fromBundle(Bundle bundle) {
        Builder builder = new Builder();
        BundleableUtil.ensureClassLoader(bundle);
        int i = 0;
        builder.setId((String) defaultIfNull(bundle.getString(keyForField(0)), DEFAULT.id)).setLabel((String) defaultIfNull(bundle.getString(keyForField(1)), DEFAULT.label)).setLanguage((String) defaultIfNull(bundle.getString(keyForField(2)), DEFAULT.language)).setSelectionFlags(bundle.getInt(keyForField(3), DEFAULT.selectionFlags)).setRoleFlags(bundle.getInt(keyForField(4), DEFAULT.roleFlags)).setAverageBitrate(bundle.getInt(keyForField(5), DEFAULT.averageBitrate)).setPeakBitrate(bundle.getInt(keyForField(6), DEFAULT.peakBitrate)).setCodecs((String) defaultIfNull(bundle.getString(keyForField(7)), DEFAULT.codecs)).setMetadata((Metadata) defaultIfNull((Metadata) bundle.getParcelable(keyForField(8)), DEFAULT.metadata)).setContainerMimeType((String) defaultIfNull(bundle.getString(keyForField(9)), DEFAULT.containerMimeType)).setSampleMimeType((String) defaultIfNull(bundle.getString(keyForField(10)), DEFAULT.sampleMimeType)).setMaxInputSize(bundle.getInt(keyForField(11), DEFAULT.maxInputSize));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(keyForInitializationData(i));
            if (byteArray == null) {
                builder.setInitializationData(arrayList).setDrmInitData((DrmInitData) bundle.getParcelable(keyForField(13))).setSubsampleOffsetUs(bundle.getLong(keyForField(14), DEFAULT.subsampleOffsetUs)).setWidth(bundle.getInt(keyForField(15), DEFAULT.width)).setHeight(bundle.getInt(keyForField(16), DEFAULT.height)).setFrameRate(bundle.getFloat(keyForField(17), DEFAULT.frameRate)).setRotationDegrees(bundle.getInt(keyForField(18), DEFAULT.rotationDegrees)).setPixelWidthHeightRatio(bundle.getFloat(keyForField(19), DEFAULT.pixelWidthHeightRatio)).setProjectionData(bundle.getByteArray(keyForField(20))).setStereoMode(bundle.getInt(keyForField(21), DEFAULT.stereoMode)).setColorInfo((ColorInfo) BundleableUtil.fromNullableBundle(ColorInfo.CREATOR, bundle.getBundle(keyForField(22)))).setChannelCount(bundle.getInt(keyForField(23), DEFAULT.channelCount)).setSampleRate(bundle.getInt(keyForField(24), DEFAULT.sampleRate)).setPcmEncoding(bundle.getInt(keyForField(25), DEFAULT.pcmEncoding)).setEncoderDelay(bundle.getInt(keyForField(26), DEFAULT.encoderDelay)).setEncoderPadding(bundle.getInt(keyForField(27), DEFAULT.encoderPadding)).setAccessibilityChannel(bundle.getInt(keyForField(28), DEFAULT.accessibilityChannel)).setCryptoType(bundle.getInt(keyForField(29), DEFAULT.cryptoType));
                return builder.build();
            }
            arrayList.add(byteArray);
            i++;
        }
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    private static String keyForInitializationData(int i) {
        String keyForField = keyForField(12);
        String num = Integer.toString(i, 36);
        StringBuilder sb = new StringBuilder(String.valueOf(keyForField).length() + 1 + String.valueOf(num).length());
        sb.append(keyForField);
        sb.append("_");
        sb.append(num);
        return sb.toString();
    }
}
