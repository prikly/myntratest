package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzqm {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzqm zzc(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.zzqm r11 = new com.google.android.gms.internal.ads.zzqm
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L_0x003f
            int r3 = com.google.android.gms.internal.ads.zzen.zza
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L_0x003f
            int r3 = com.google.android.gms.internal.ads.zzen.zza
            r5 = 22
            if (r3 > r5) goto L_0x003d
            java.lang.String r3 = com.google.android.gms.internal.ads.zzen.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x002c
            java.lang.String r3 = com.google.android.gms.internal.ads.zzen.zzd
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x003d
        L_0x002c:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x003f
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r8 = 1
            goto L_0x0040
        L_0x003f:
            r8 = 0
        L_0x0040:
            r3 = 21
            if (r4 == 0) goto L_0x0052
            int r5 = com.google.android.gms.internal.ads.zzen.zza
            if (r5 < r3) goto L_0x0052
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x0052
            r9 = 1
            goto L_0x0053
        L_0x0052:
            r9 = 0
        L_0x0053:
            if (r20 != 0) goto L_0x0066
            if (r4 == 0) goto L_0x0064
            int r5 = com.google.android.gms.internal.ads.zzen.zza
            if (r5 < r3) goto L_0x0064
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r10 = 0
            goto L_0x0067
        L_0x0066:
            r10 = 1
        L_0x0067:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqm.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzqm");
    }

    private static Point zzh(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzen.zze(i, widthAlignment) * widthAlignment, zzen.zze(i2, heightAlignment) * heightAlignment);
    }

    private final void zzi(String str) {
        String str2 = this.zza;
        String str3 = this.zzb;
        String str4 = zzen.zze;
        zzdw.zza("MediaCodecInfo", "NoSupport [" + str + "] [" + str2 + ", " + str3 + "] [" + str4 + "]");
    }

    private static boolean zzj(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d2) {
        Point zzh2 = zzh(videoCapabilities, i, i2);
        int i3 = zzh2.x;
        int i4 = zzh2.y;
        if (d2 == -1.0d || d2 < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d2));
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzh(videoCapabilities, i, i2);
    }

    public final zzgt zzb(zzaf zzaf, zzaf zzaf2) {
        int i = true != zzen.zzT(zzaf.zzm, zzaf2.zzm) ? 8 : 0;
        if (this.zzh) {
            if (zzaf.zzu != zzaf2.zzu) {
                i |= 1024;
            }
            if (!this.zze && !(zzaf.zzr == zzaf2.zzr && zzaf.zzs == zzaf2.zzs)) {
                i |= 512;
            }
            if (!zzen.zzT(zzaf.zzy, zzaf2.zzy)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzen.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzaf.zzd(zzaf2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzgt(this.zza, zzaf, zzaf2, true != zzaf.zzd(zzaf2) ? 2 : 3, 0);
            }
        } else {
            if (zzaf.zzz != zzaf2.zzz) {
                i |= 4096;
            }
            if (zzaf.zzA != zzaf2.zzA) {
                i |= 8192;
            }
            if (zzaf.zzB != zzaf2.zzB) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair zzb2 = zzre.zzb(zzaf);
                Pair zzb3 = zzre.zzb(zzaf2);
                if (!(zzb2 == null || zzb3 == null)) {
                    int intValue = ((Integer) zzb2.first).intValue();
                    int intValue2 = ((Integer) zzb3.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzgt(this.zza, zzaf, zzaf2, 3, 0);
                    }
                }
            }
            if (!zzaf.zzd(zzaf2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzgt(this.zza, zzaf, zzaf2, 1, 0);
            }
        }
        return new zzgt(this.zza, zzaf, zzaf2, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        r5 = r5.getVideoCapabilities();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzd(com.google.android.gms.internal.ads.zzaf r13) throws com.google.android.gms.internal.ads.zzqy {
        /*
            r12 = this;
            java.lang.String r0 = r12.zzb
            java.lang.String r1 = r13.zzm
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = r12.zzb
            java.lang.String r2 = com.google.android.gms.internal.ads.zzre.zze(r13)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return r1
        L_0x0019:
            java.lang.String r0 = r13.zzj
            r2 = 16
            r3 = 1
            if (r0 != 0) goto L_0x0022
            goto L_0x0145
        L_0x0022:
            android.util.Pair r0 = com.google.android.gms.internal.ads.zzre.zzb(r13)
            if (r0 == 0) goto L_0x0145
            java.lang.Object r4 = r0.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.String r5 = r13.zzm
            java.lang.String r6 = "video/dolby-vision"
            boolean r5 = r6.equals(r5)
            r6 = 8
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r5 == 0) goto L_0x005f
            java.lang.String r5 = r12.zzb
            java.lang.String r9 = "video/avc"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0055
            r0 = 0
            r4 = 8
            goto L_0x005f
        L_0x0055:
            java.lang.String r5 = r12.zzb
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x005f
            r0 = 0
            r4 = 2
        L_0x005f:
            boolean r5 = r12.zzh
            r9 = 42
            if (r5 != 0) goto L_0x0069
            if (r4 != r9) goto L_0x0145
            r4 = 42
        L_0x0069:
            android.media.MediaCodecInfo$CodecProfileLevel[] r5 = r12.zzg()
            int r9 = com.google.android.gms.internal.ads.zzen.zza
            r10 = 23
            if (r9 > r10) goto L_0x00f5
            java.lang.String r9 = r12.zzb
            java.lang.String r10 = "video/x-vnd.on2.vp9"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x00f5
            int r9 = r5.length
            if (r9 != 0) goto L_0x00f5
            android.media.MediaCodecInfo$CodecCapabilities r5 = r12.zzd
            if (r5 == 0) goto L_0x0099
            android.media.MediaCodecInfo$VideoCapabilities r5 = r5.getVideoCapabilities()
            if (r5 == 0) goto L_0x0099
            android.util.Range r5 = r5.getBitrateRange()
            java.lang.Comparable r5 = r5.getUpper()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x009a
        L_0x0099:
            r5 = 0
        L_0x009a:
            r9 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r5 < r9) goto L_0x00a2
            r6 = 1024(0x400, float:1.435E-42)
            goto L_0x00e7
        L_0x00a2:
            r9 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r5 < r9) goto L_0x00aa
            r6 = 512(0x200, float:7.175E-43)
            goto L_0x00e7
        L_0x00aa:
            r9 = 60000000(0x3938700, float:8.670878E-37)
            if (r5 < r9) goto L_0x00b2
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x00e7
        L_0x00b2:
            r9 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r5 < r9) goto L_0x00ba
            r6 = 128(0x80, float:1.794E-43)
            goto L_0x00e7
        L_0x00ba:
            r9 = 18000000(0x112a880, float:2.6936858E-38)
            if (r5 < r9) goto L_0x00c2
            r6 = 64
            goto L_0x00e7
        L_0x00c2:
            r9 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r5 < r9) goto L_0x00ca
            r6 = 32
            goto L_0x00e7
        L_0x00ca:
            r9 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r5 < r9) goto L_0x00d2
            r6 = 16
            goto L_0x00e7
        L_0x00d2:
            r9 = 3600000(0x36ee80, float:5.044674E-39)
            if (r5 < r9) goto L_0x00d8
            goto L_0x00e7
        L_0x00d8:
            r6 = 1800000(0x1b7740, float:2.522337E-39)
            if (r5 < r6) goto L_0x00df
            r6 = 4
            goto L_0x00e7
        L_0x00df:
            r6 = 800000(0xc3500, float:1.121039E-39)
            if (r5 < r6) goto L_0x00e6
            r6 = 2
            goto L_0x00e7
        L_0x00e6:
            r6 = 1
        L_0x00e7:
            android.media.MediaCodecInfo$CodecProfileLevel r5 = new android.media.MediaCodecInfo$CodecProfileLevel
            r5.<init>()
            r5.profile = r3
            r5.level = r6
            android.media.MediaCodecInfo$CodecProfileLevel[] r6 = new android.media.MediaCodecInfo.CodecProfileLevel[r3]
            r6[r1] = r5
            r5 = r6
        L_0x00f5:
            int r6 = r5.length
            r9 = 0
        L_0x00f7:
            if (r9 >= r6) goto L_0x0124
            r10 = r5[r9]
            int r11 = r10.profile
            if (r11 != r4) goto L_0x0121
            int r10 = r10.level
            if (r10 < r0) goto L_0x0121
            java.lang.String r10 = r12.zzb
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L_0x0145
            if (r4 != r8) goto L_0x0145
            java.lang.String r10 = com.google.android.gms.internal.ads.zzen.zzb
            java.lang.String r11 = "sailfish"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0121
            java.lang.String r10 = com.google.android.gms.internal.ads.zzen.zzb
            java.lang.String r11 = "marlin"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x0145
        L_0x0121:
            int r9 = r9 + 1
            goto L_0x00f7
        L_0x0124:
            java.lang.String r13 = r13.zzj
            java.lang.String r0 = r12.zzc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "codec.profileLevel, "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r13 = ", "
            r2.append(r13)
            r2.append(r0)
            java.lang.String r13 = r2.toString()
            r12.zzi(r13)
            return r1
        L_0x0145:
            boolean r0 = r12.zzh
            r4 = 21
            if (r0 == 0) goto L_0x0195
            int r0 = r13.zzr
            if (r0 <= 0) goto L_0x0194
            int r0 = r13.zzs
            if (r0 > 0) goto L_0x0154
            goto L_0x0194
        L_0x0154:
            int r0 = com.google.android.gms.internal.ads.zzen.zza
            if (r0 < r4) goto L_0x0164
            int r0 = r13.zzr
            int r1 = r13.zzs
            float r13 = r13.zzt
            double r2 = (double) r13
            boolean r13 = r12.zzf(r0, r1, r2)
            return r13
        L_0x0164:
            int r0 = r13.zzr
            int r2 = r13.zzs
            int r0 = r0 * r2
            int r2 = com.google.android.gms.internal.ads.zzre.zza()
            if (r0 > r2) goto L_0x0171
            r1 = 1
        L_0x0171:
            if (r1 != 0) goto L_0x0193
            int r0 = r13.zzr
            int r13 = r13.zzs
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "legacyFrameSize, "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "x"
            r2.append(r0)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r12.zzi(r13)
        L_0x0193:
            return r1
        L_0x0194:
            return r3
        L_0x0195:
            int r0 = com.google.android.gms.internal.ads.zzen.zza
            if (r0 < r4) goto L_0x02b3
            int r0 = r13.zzA
            r4 = -1
            if (r0 == r4) goto L_0x01d2
            android.media.MediaCodecInfo$CodecCapabilities r5 = r12.zzd
            if (r5 != 0) goto L_0x01a9
            java.lang.String r13 = "sampleRate.caps"
            r12.zzi(r13)
            goto L_0x02b4
        L_0x01a9:
            android.media.MediaCodecInfo$AudioCapabilities r5 = r5.getAudioCapabilities()
            if (r5 != 0) goto L_0x01b6
            java.lang.String r13 = "sampleRate.aCaps"
            r12.zzi(r13)
            goto L_0x02b4
        L_0x01b6:
            boolean r5 = r5.isSampleRateSupported(r0)
            if (r5 != 0) goto L_0x01d2
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "sampleRate.support, "
            r13.append(r2)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.zzi(r13)
            goto L_0x02b4
        L_0x01d2:
            int r13 = r13.zzz
            if (r13 == r4) goto L_0x02b3
            android.media.MediaCodecInfo$CodecCapabilities r0 = r12.zzd
            if (r0 != 0) goto L_0x01e1
            java.lang.String r13 = "channelCount.caps"
            r12.zzi(r13)
            goto L_0x02b2
        L_0x01e1:
            android.media.MediaCodecInfo$AudioCapabilities r0 = r0.getAudioCapabilities()
            if (r0 != 0) goto L_0x01ee
            java.lang.String r13 = "channelCount.aCaps"
            r12.zzi(r13)
            goto L_0x02b2
        L_0x01ee:
            java.lang.String r4 = r12.zza
            java.lang.String r5 = r12.zzb
            int r0 = r0.getMaxInputChannelCount()
            if (r0 > r3) goto L_0x029c
            int r6 = com.google.android.gms.internal.ads.zzen.zza
            r7 = 26
            if (r6 < r7) goto L_0x0202
            if (r0 <= 0) goto L_0x0202
            goto L_0x029c
        L_0x0202:
            java.lang.String r6 = "audio/mpeg"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x029c
            java.lang.String r6 = "audio/3gpp"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x029c
            java.lang.String r6 = "audio/amr-wb"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x029c
            java.lang.String r6 = "audio/mp4a-latm"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x029c
            java.lang.String r6 = "audio/vorbis"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x029c
            java.lang.String r6 = "audio/opus"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x029c
            java.lang.String r6 = "audio/raw"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x029c
            java.lang.String r6 = "audio/flac"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x029c
            java.lang.String r6 = "audio/g711-alaw"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x029c
            java.lang.String r6 = "audio/g711-mlaw"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x029c
            java.lang.String r6 = "audio/gsm"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x025b
            goto L_0x029c
        L_0x025b:
            java.lang.String r6 = "audio/ac3"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0265
            r2 = 6
            goto L_0x0270
        L_0x0265:
            java.lang.String r6 = "audio/eac3"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x026e
            goto L_0x0270
        L_0x026e:
            r2 = 30
        L_0x0270:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "AssumedMaxChannelAdjustment: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = ", ["
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = " to "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = "]"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r4 = "MediaCodecInfo"
            com.google.android.gms.internal.ads.zzdw.zze(r4, r0)
            r0 = r2
        L_0x029c:
            if (r0 >= r13) goto L_0x02b3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "channelCount.support, "
            r0.append(r2)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.zzi(r13)
        L_0x02b2:
            return r1
        L_0x02b3:
            r1 = 1
        L_0x02b4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqm.zzd(com.google.android.gms.internal.ads.zzaf):boolean");
    }

    public final boolean zze(zzaf zzaf) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zzb2 = zzre.zzb(zzaf);
        return zzb2 != null && ((Integer) zzb2.first).intValue() == 42;
    }

    public final boolean zzf(int i, int i2, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzi("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzi("sizeAndRate.vCaps");
            return false;
        }
        if (zzen.zza >= 29) {
            int zza2 = zzql.zza(videoCapabilities, i, i2, d2);
            if (zza2 == 2) {
                return true;
            }
            if (zza2 == 1) {
                zzi("sizeAndRate.cover, " + i + "x" + i2 + "@" + d2);
                return false;
            }
        }
        if (!zzj(videoCapabilities, i, i2, d2)) {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzen.zzb)) || !zzj(videoCapabilities, i2, i, d2))) {
                zzi("sizeAndRate.support, " + i + "x" + i2 + "@" + d2);
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            String str3 = zzen.zze;
            StringBuilder sb = new StringBuilder();
            sb.append("AssumedSupport [");
            sb.append("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d2);
            sb.append("] [");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            sb.append("] [");
            sb.append(str3);
            sb.append("]");
            zzdw.zza("MediaCodecInfo", sb.toString());
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzg() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.zzd.profileLevels;
    }

    zzqm(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        if (str != null) {
            this.zza = str;
            this.zzb = str2;
            this.zzc = str3;
            this.zzd = codecCapabilities;
            this.zzg = z;
            this.zze = z4;
            this.zzf = z6;
            this.zzh = zzbt.zzh(str2);
            return;
        }
        throw null;
    }
}
