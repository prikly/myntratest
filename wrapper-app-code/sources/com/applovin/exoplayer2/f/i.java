package com.applovin.exoplayer2.f;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.applovin.exoplayer2.c.h;
import com.applovin.exoplayer2.f.l;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.v;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f12544a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12545b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12546c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f12547d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12548e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12549f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f12550g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f12551h;
    public final boolean i;
    public final boolean j;
    private final boolean k;

    i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f12544a = (String) a.b(str);
        this.f12545b = str2;
        this.f12546c = str3;
        this.f12547d = codecCapabilities;
        this.f12551h = z;
        this.i = z2;
        this.j = z3;
        this.f12548e = z4;
        this.f12549f = z5;
        this.f12550g = z6;
        this.k = u.b(str2);
    }

    private static int a(String str, String str2, int i2) {
        if (i2 > 1 || ((ai.f13525a >= 26 && i2 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i2;
        }
        int i3 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        q.c("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i2 + " to " + i3 + "]");
        return i3;
    }

    private static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(ai.a(i2, widthAlignment) * widthAlignment, ai.a(i3, heightAlignment) * heightAlignment);
    }

    public static i a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new i(str, str2, str3, codecCapabilities, z, z2, z3, !z4 && codecCapabilities != null && a(codecCapabilities) && !c(str), codecCapabilities != null && c(codecCapabilities), z5 || (codecCapabilities != null && e(codecCapabilities)));
    }

    private void a(String str) {
        q.a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f12544a + ", " + this.f12545b + "] [" + ai.f13529e + "]");
    }

    private static boolean a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ai.f13525a >= 19 && b(codecCapabilities);
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d2) {
        Point a2 = a(videoCapabilities, i2, i3);
        int i4 = a2.x;
        int i5 = a2.y;
        return (d2 == -1.0d || d2 < 1.0d) ? videoCapabilities.isSizeSupported(i4, i5) : videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d2));
    }

    private void b(String str) {
        q.a("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f12544a + ", " + this.f12545b + "] [" + ai.f13529e + "]");
    }

    private static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ai.f13525a >= 21 && d(codecCapabilities);
    }

    private static boolean c(String str) {
        return ai.f13525a <= 22 && ("ODROID-XU3".equals(ai.f13528d) || "Nexus 10".equals(ai.f13528d)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str));
    }

    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private static boolean d(String str) {
        return ai.f13528d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ai.f13525a >= 21 && f(codecCapabilities);
    }

    private static boolean e(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static final boolean f(String str) {
        return !"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(ai.f13526b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = r3.getVideoCapabilities();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.media.MediaCodecInfo.CodecProfileLevel[] g(android.media.MediaCodecInfo.CodecCapabilities r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0018
            android.media.MediaCodecInfo$VideoCapabilities r3 = r3.getVideoCapabilities()
            if (r3 == 0) goto L_0x0018
            android.util.Range r3 = r3.getBitrateRange()
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            r1 = 180000000(0xaba9500, float:1.7967196E-32)
            r2 = 1
            if (r3 < r1) goto L_0x0022
            r3 = 1024(0x400, float:1.435E-42)
            goto L_0x0069
        L_0x0022:
            r1 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r3 < r1) goto L_0x002a
            r3 = 512(0x200, float:7.175E-43)
            goto L_0x0069
        L_0x002a:
            r1 = 60000000(0x3938700, float:8.670878E-37)
            if (r3 < r1) goto L_0x0032
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0032:
            r1 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r3 < r1) goto L_0x003a
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x0069
        L_0x003a:
            r1 = 18000000(0x112a880, float:2.6936858E-38)
            if (r3 < r1) goto L_0x0042
            r3 = 64
            goto L_0x0069
        L_0x0042:
            r1 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r3 < r1) goto L_0x004a
            r3 = 32
            goto L_0x0069
        L_0x004a:
            r1 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r3 < r1) goto L_0x0052
            r3 = 16
            goto L_0x0069
        L_0x0052:
            r1 = 3600000(0x36ee80, float:5.044674E-39)
            if (r3 < r1) goto L_0x005a
            r3 = 8
            goto L_0x0069
        L_0x005a:
            r1 = 1800000(0x1b7740, float:2.522337E-39)
            if (r3 < r1) goto L_0x0061
            r3 = 4
            goto L_0x0069
        L_0x0061:
            r1 = 800000(0xc3500, float:1.121039E-39)
            if (r3 < r1) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = 1
        L_0x0069:
            android.media.MediaCodecInfo$CodecProfileLevel r1 = new android.media.MediaCodecInfo$CodecProfileLevel
            r1.<init>()
            r1.profile = r2
            r1.level = r3
            android.media.MediaCodecInfo$CodecProfileLevel[] r3 = new android.media.MediaCodecInfo.CodecProfileLevel[r2]
            r3[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.f.i.g(android.media.MediaCodecInfo$CodecCapabilities):android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    public Point a(int i2, int i3) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12547d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return a(videoCapabilities, i2, i3);
    }

    public h a(v vVar, v vVar2) {
        int i2 = !ai.a((Object) vVar.l, (Object) vVar2.l) ? 8 : 0;
        if (this.k) {
            if (vVar.t != vVar2.t) {
                i2 |= 1024;
            }
            if (!this.f12548e && !(vVar.q == vVar2.q && vVar.r == vVar2.r)) {
                i2 |= 512;
            }
            if (!ai.a((Object) vVar.x, (Object) vVar2.x)) {
                i2 |= 2048;
            }
            if (d(this.f12544a) && !vVar.a(vVar2)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new h(this.f12544a, vVar, vVar2, vVar.a(vVar2) ? 3 : 2, 0);
            }
        } else {
            if (vVar.y != vVar2.y) {
                i2 |= 4096;
            }
            if (vVar.z != vVar2.z) {
                i2 |= 8192;
            }
            if (vVar.A != vVar2.A) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.f12545b)) {
                Pair<Integer, Integer> a2 = l.a(vVar);
                Pair<Integer, Integer> a3 = l.a(vVar2);
                if (!(a2 == null || a3 == null)) {
                    int intValue = ((Integer) a2.first).intValue();
                    int intValue2 = ((Integer) a3.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new h(this.f12544a, vVar, vVar2, 3, 0);
                    }
                }
            }
            if (!vVar.a(vVar2)) {
                i2 |= 32;
            }
            if (e(this.f12545b)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new h(this.f12544a, vVar, vVar2, 1, 0);
            }
        }
        return new h(this.f12544a, vVar, vVar2, 0, i2);
    }

    public boolean a(int i2) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12547d;
        if (codecCapabilities == null) {
            str = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "sampleRate.aCaps";
            } else if (audioCapabilities.isSampleRateSupported(i2)) {
                return true;
            } else {
                str = "sampleRate.support, " + i2;
            }
        }
        a(str);
        return false;
    }

    public boolean a(int i2, int i3, double d2) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12547d;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else if (a(videoCapabilities, i2, i3, d2)) {
                return true;
            } else {
                if (i2 >= i3 || !f(this.f12544a) || !a(videoCapabilities, i3, i2, d2)) {
                    str = "sizeAndRate.support, " + i2 + "x" + i3 + "x" + d2;
                } else {
                    b("sizeAndRate.rotated, " + i2 + "x" + i3 + "x" + d2);
                    return true;
                }
            }
        }
        a(str);
        return false;
    }

    public boolean a(v vVar) throws l.b {
        boolean z = false;
        if (!b(vVar)) {
            return false;
        }
        if (!this.k) {
            if (ai.f13525a >= 21) {
                if (vVar.z == -1 || a(vVar.z)) {
                    return vVar.y == -1 || b(vVar.y);
                }
                return false;
            }
        } else if (vVar.q <= 0 || vVar.r <= 0) {
            return true;
        } else {
            if (ai.f13525a >= 21) {
                return a(vVar.q, vVar.r, (double) vVar.s);
            }
            if (vVar.q * vVar.r <= l.b()) {
                z = true;
            }
            if (!z) {
                a("legacyFrameSize, " + vVar.q + "x" + vVar.r);
            }
            return z;
        }
    }

    public MediaCodecInfo.CodecProfileLevel[] a() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12547d;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.f12547d.profileLevels;
    }

    public boolean b() {
        if (ai.f13525a >= 29 && "video/x-vnd.on2.vp9".equals(this.f12545b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b(int i2) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12547d;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else if (a(this.f12544a, this.f12545b, audioCapabilities.getMaxInputChannelCount()) >= i2) {
                return true;
            } else {
                str = "channelCount.support, " + i2;
            }
        }
        a(str);
        return false;
    }

    public boolean b(v vVar) {
        String d2;
        StringBuilder sb;
        String str;
        if (vVar.i == null || this.f12545b == null || (d2 = u.d(vVar.i)) == null) {
            return true;
        }
        if (!this.f12545b.equals(d2)) {
            sb = new StringBuilder();
            str = "codec.mime ";
        } else {
            Pair<Integer, Integer> a2 = l.a(vVar);
            if (a2 == null) {
                return true;
            }
            int intValue = ((Integer) a2.first).intValue();
            int intValue2 = ((Integer) a2.second).intValue();
            if (!this.k && intValue != 42) {
                return true;
            }
            MediaCodecInfo.CodecProfileLevel[] a3 = a();
            if (ai.f13525a <= 23 && "video/x-vnd.on2.vp9".equals(this.f12545b) && a3.length == 0) {
                a3 = g(this.f12547d);
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a3) {
                if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                    return true;
                }
            }
            sb = new StringBuilder();
            str = "codec.profileLevel, ";
        }
        sb.append(str);
        sb.append(vVar.i);
        sb.append(", ");
        sb.append(d2);
        a(sb.toString());
        return false;
    }

    public boolean c(v vVar) {
        if (this.k) {
            return this.f12548e;
        }
        Pair<Integer, Integer> a2 = l.a(vVar);
        return a2 != null && ((Integer) a2.first).intValue() == 42;
    }

    public String toString() {
        return this.f12544a;
    }
}
