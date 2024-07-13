package com.applovin.exoplayer2.f;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.f.l;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.v;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f12566a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<a, List<i>> f12567b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static int f12568c = -1;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f12569a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12570b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f12571c;

        public a(String str, boolean z, boolean z2) {
            this.f12569a = str;
            this.f12570b = z;
            this.f12571c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return TextUtils.equals(this.f12569a, aVar.f12569a) && this.f12570b == aVar.f12570b && this.f12571c == aVar.f12571c;
        }

        public int hashCode() {
            int i = 1231;
            int hashCode = (((this.f12569a.hashCode() + 31) * 31) + (this.f12570b ? 1231 : 1237)) * 31;
            if (!this.f12571c) {
                i = 1237;
            }
            return hashCode + i;
        }
    }

    public static class b extends Exception {
        private b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    private interface c {
        int a();

        MediaCodecInfo a(int i);

        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);
    }

    private static final class d implements c {
        private d() {
        }

        public int a() {
            return MediaCodecList.getCodecCount();
        }

        public MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2);
        }

        public boolean b() {
            return false;
        }

        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }
    }

    private static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        private final int f12572a;

        /* renamed from: b  reason: collision with root package name */
        private MediaCodecInfo[] f12573b;

        public e(boolean z, boolean z2) {
            this.f12572a = (z || z2) ? 1 : 0;
        }

        private void c() {
            if (this.f12573b == null) {
                this.f12573b = new MediaCodecList(this.f12572a).getCodecInfos();
            }
        }

        public int a() {
            c();
            return this.f12573b.length;
        }

        public MediaCodecInfo a(int i) {
            c();
            return this.f12573b[i];
        }

        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        public boolean b() {
            return true;
        }

        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }
    }

    private interface f<T> {
        int getScore(T t);
    }

    private static int a(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(i iVar) {
        return iVar.f12544a.startsWith("OMX.google") ? 1 : 0;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(f fVar, Object obj, Object obj2) {
        return fVar.getScore(obj2) - fVar.getScore(obj);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(v vVar, i iVar) {
        try {
            return iVar.a(vVar) ? 1 : 0;
        } catch (b unused) {
            return -1;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (r3.equals("avc1") != false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> a(com.applovin.exoplayer2.v r6) {
        /*
            java.lang.String r0 = r6.i
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r0 = r6.i
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r6.l
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x001f
            java.lang.String r6 = r6.i
            android.util.Pair r6 = a((java.lang.String) r6, (java.lang.String[]) r0)
            return r6
        L_0x001f:
            r2 = 0
            r3 = r0[r2]
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L_0x0066;
                case 3006243: goto L_0x005d;
                case 3006244: goto L_0x0053;
                case 3199032: goto L_0x0049;
                case 3214780: goto L_0x003f;
                case 3356560: goto L_0x0035;
                case 3624515: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0070
        L_0x002b:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 2
            goto L_0x0071
        L_0x0035:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 6
            goto L_0x0071
        L_0x003f:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 4
            goto L_0x0071
        L_0x0049:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 3
            goto L_0x0071
        L_0x0053:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 1
            goto L_0x0071
        L_0x005d:
            java.lang.String r5 = "avc1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0070
            goto L_0x0071
        L_0x0066:
            java.lang.String r2 = "av01"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 5
            goto L_0x0071
        L_0x0070:
            r2 = -1
        L_0x0071:
            switch(r2) {
                case 0: goto L_0x0093;
                case 1: goto L_0x0093;
                case 2: goto L_0x008c;
                case 3: goto L_0x0085;
                case 4: goto L_0x0085;
                case 5: goto L_0x007c;
                case 6: goto L_0x0075;
                default: goto L_0x0074;
            }
        L_0x0074:
            return r1
        L_0x0075:
            java.lang.String r6 = r6.i
            android.util.Pair r6 = e(r6, r0)
            return r6
        L_0x007c:
            java.lang.String r1 = r6.i
            com.applovin.exoplayer2.m.b r6 = r6.x
            android.util.Pair r6 = a((java.lang.String) r1, (java.lang.String[]) r0, (com.applovin.exoplayer2.m.b) r6)
            return r6
        L_0x0085:
            java.lang.String r6 = r6.i
            android.util.Pair r6 = b(r6, r0)
            return r6
        L_0x008c:
            java.lang.String r6 = r6.i
            android.util.Pair r6 = d(r6, r0)
            return r6
        L_0x0093:
            java.lang.String r6 = r6.i
            android.util.Pair r6 = c(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.f.l.a(com.applovin.exoplayer2.v):android.util.Pair");
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr) {
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        if (strArr.length < 3) {
            sb2 = new StringBuilder();
        } else {
            Matcher matcher = f12566a.matcher(strArr[1]);
            if (!matcher.matches()) {
                sb2 = new StringBuilder();
            } else {
                str = matcher.group(1);
                Integer b2 = b(str);
                if (b2 == null) {
                    sb = new StringBuilder();
                    str2 = "Unknown Dolby Vision profile string: ";
                } else {
                    str = strArr[2];
                    Integer c2 = c(str);
                    if (c2 != null) {
                        return new Pair<>(b2, c2);
                    }
                    sb = new StringBuilder();
                    str2 = "Unknown Dolby Vision level string: ";
                }
                sb2.append(str2);
                sb2.append(str);
                q.c("MediaCodecUtil", sb2.toString());
                return null;
            }
        }
        sb2.append("Ignoring malformed Dolby Vision codec string: ");
        sb2.append(str);
        q.c("MediaCodecUtil", sb2.toString());
        return null;
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr, com.applovin.exoplayer2.m.b bVar) {
        StringBuilder sb;
        StringBuilder sb2;
        String sb3;
        if (strArr.length < 4) {
            sb = new StringBuilder();
        } else {
            int i = 1;
            try {
                int parseInt = Integer.parseInt(strArr[1]);
                int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
                int parseInt3 = Integer.parseInt(strArr[3]);
                if (parseInt != 0) {
                    sb2 = new StringBuilder();
                    sb2.append("Unknown AV1 profile: ");
                    sb2.append(parseInt);
                } else if (parseInt3 == 8 || parseInt3 == 10) {
                    if (parseInt3 != 8) {
                        i = (bVar == null || !(bVar.f13676d != null || bVar.f13675c == 7 || bVar.f13675c == 6)) ? 2 : 4096;
                    }
                    int f2 = f(parseInt2);
                    if (f2 != -1) {
                        return new Pair<>(Integer.valueOf(i), Integer.valueOf(f2));
                    }
                    sb2 = new StringBuilder();
                    sb2.append("Unknown AV1 level: ");
                    sb2.append(parseInt2);
                } else {
                    sb = new StringBuilder();
                    sb.append("Unknown AV1 bit depth: ");
                    sb.append(parseInt3);
                    sb3 = sb.toString();
                    q.c("MediaCodecUtil", sb3);
                    return null;
                }
                sb3 = sb2.toString();
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
            q.c("MediaCodecUtil", sb3);
            return null;
        }
        sb.append("Ignoring malformed AV1 codec string: ");
        sb.append(str);
        sb3 = sb.toString();
        q.c("MediaCodecUtil", sb3);
        return null;
    }

    public static i a() throws b {
        return a("audio/raw", false, false);
    }

    public static i a(String str, boolean z, boolean z2) throws b {
        List<i> b2 = b(str, z, z2);
        if (b2.isEmpty()) {
            return null;
        }
        return b2.get(0);
    }

    private static Integer a(String str) {
        int i;
        if (str == null) {
            return null;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c2 = 13;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c2 = 14;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c2 = 15;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c2 = 16;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c2 = 17;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c2 = 0;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c2 = 1;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c2 = 2;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c2 = 3;
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c2 = 4;
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c2 = 18;
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c2 = 19;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c2 = 20;
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c2 = 21;
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c2 = 22;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c2 = 23;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c2 = 24;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c2 = 25;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c2 = 5;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c2 = 6;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c2 = 7;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c2 = 8;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c2 = 9;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c2 = 10;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c2 = 11;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c2 = 12;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 1;
            case 1:
                return 4;
            case 2:
                return 16;
            case 3:
                i = 64;
                break;
            case 4:
                i = 256;
                break;
            case 5:
                i = 1024;
                break;
            case 6:
                i = 4096;
                break;
            case 7:
                i = 16384;
                break;
            case 8:
                i = 65536;
                break;
            case 9:
                i = 262144;
                break;
            case 10:
                i = 1048576;
                break;
            case 11:
                i = 4194304;
                break;
            case 12:
                i = 16777216;
                break;
            case 13:
                return 2;
            case 14:
                return 8;
            case 15:
                i = 32;
                break;
            case 16:
                i = 128;
                break;
            case 17:
                i = 512;
                break;
            case 18:
                i = 2048;
                break;
            case 19:
                i = 8192;
                break;
            case 20:
                i = 32768;
                break;
            case 21:
                i = 131072;
                break;
            case 22:
                i = 524288;
                break;
            case 23:
                i = 2097152;
                break;
            case 24:
                i = 8388608;
                break;
            case 25:
                i = 33554432;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i);
    }

    private static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (!str2.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(str)) {
                return null;
            }
            return "audio/x-lg-flac";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        if (r1.f12570b == false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0105 A[SYNTHETIC, Splitter:B:62:0x0105] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<com.applovin.exoplayer2.f.i> a(com.applovin.exoplayer2.f.l.a r24, com.applovin.exoplayer2.f.l.c r25) throws com.applovin.exoplayer2.f.l.b {
        /*
            r1 = r24
            r2 = r25
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0153 }
            r5.<init>()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r15 = r1.f12569a     // Catch:{ Exception -> 0x0153 }
            int r14 = r25.a()     // Catch:{ Exception -> 0x0153 }
            boolean r13 = r25.b()     // Catch:{ Exception -> 0x0153 }
            r0 = 0
            r12 = 0
        L_0x0019:
            if (r12 >= r14) goto L_0x0152
            android.media.MediaCodecInfo r0 = r2.a(r12)     // Catch:{ Exception -> 0x0153 }
            boolean r6 = a((android.media.MediaCodecInfo) r0)     // Catch:{ Exception -> 0x0153 }
            if (r6 == 0) goto L_0x002d
        L_0x0025:
            r22 = r12
            r23 = r13
            r18 = r14
            goto L_0x0124
        L_0x002d:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x0153 }
            boolean r6 = a(r0, r11, r13, r15)     // Catch:{ Exception -> 0x0153 }
            if (r6 != 0) goto L_0x0038
            goto L_0x0025
        L_0x0038:
            java.lang.String r10 = a((android.media.MediaCodecInfo) r0, (java.lang.String) r11, (java.lang.String) r15)     // Catch:{ Exception -> 0x0153 }
            if (r10 != 0) goto L_0x003f
            goto L_0x0025
        L_0x003f:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x00f3 }
            boolean r6 = r2.a(r4, r10, r9)     // Catch:{ Exception -> 0x00f3 }
            boolean r7 = r2.b(r4, r10, r9)     // Catch:{ Exception -> 0x00f3 }
            boolean r8 = r1.f12571c     // Catch:{ Exception -> 0x00f3 }
            if (r8 != 0) goto L_0x0051
            if (r7 != 0) goto L_0x0025
        L_0x0051:
            boolean r7 = r1.f12571c     // Catch:{ Exception -> 0x00f3 }
            if (r7 == 0) goto L_0x0058
            if (r6 != 0) goto L_0x0058
            goto L_0x0025
        L_0x0058:
            boolean r6 = r2.a(r3, r10, r9)     // Catch:{ Exception -> 0x00f3 }
            boolean r7 = r2.b(r3, r10, r9)     // Catch:{ Exception -> 0x00f3 }
            boolean r8 = r1.f12570b     // Catch:{ Exception -> 0x00f3 }
            if (r8 != 0) goto L_0x0066
            if (r7 != 0) goto L_0x0025
        L_0x0066:
            boolean r7 = r1.f12570b     // Catch:{ Exception -> 0x00f3 }
            if (r7 == 0) goto L_0x006d
            if (r6 != 0) goto L_0x006d
            goto L_0x0025
        L_0x006d:
            boolean r16 = c((android.media.MediaCodecInfo) r0)     // Catch:{ Exception -> 0x00f3 }
            boolean r17 = e((android.media.MediaCodecInfo) r0)     // Catch:{ Exception -> 0x00f3 }
            boolean r0 = g((android.media.MediaCodecInfo) r0)     // Catch:{ Exception -> 0x00f3 }
            if (r13 == 0) goto L_0x007f
            boolean r7 = r1.f12570b     // Catch:{ Exception -> 0x00f3 }
            if (r7 == r6) goto L_0x0085
        L_0x007f:
            if (r13 != 0) goto L_0x00b7
            boolean r7 = r1.f12570b     // Catch:{ Exception -> 0x00ac }
            if (r7 != 0) goto L_0x00b7
        L_0x0085:
            r18 = 0
            r19 = 0
            r6 = r11
            r7 = r15
            r8 = r10
            r20 = r10
            r10 = r16
            r21 = r11
            r11 = r17
            r22 = r12
            r12 = r0
            r23 = r13
            r13 = r18
            r18 = r14
            r14 = r19
            com.applovin.exoplayer2.f.i r0 = com.applovin.exoplayer2.f.i.a(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00a8 }
            r5.add(r0)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x0124
        L_0x00a8:
            r0 = move-exception
            r1 = r21
            goto L_0x00fd
        L_0x00ac:
            r0 = move-exception
            r20 = r10
            r22 = r12
            r23 = r13
            r18 = r14
            r1 = r11
            goto L_0x00fd
        L_0x00b7:
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r18 = r14
            if (r23 != 0) goto L_0x0124
            if (r6 == 0) goto L_0x0124
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a8 }
            r6.<init>()     // Catch:{ Exception -> 0x00a8 }
            r14 = r21
            r6.append(r14)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r7 = ".secure"
            r6.append(r7)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00f0 }
            r13 = 0
            r19 = 1
            r7 = r15
            r8 = r20
            r10 = r16
            r11 = r17
            r12 = r0
            r1 = r14
            r14 = r19
            com.applovin.exoplayer2.f.i r0 = com.applovin.exoplayer2.f.i.a(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00ee }
            r5.add(r0)     // Catch:{ Exception -> 0x00ee }
            return r5
        L_0x00ee:
            r0 = move-exception
            goto L_0x00fd
        L_0x00f0:
            r0 = move-exception
            r1 = r14
            goto L_0x00fd
        L_0x00f3:
            r0 = move-exception
            r20 = r10
            r1 = r11
            r22 = r12
            r23 = r13
            r18 = r14
        L_0x00fd:
            int r6 = com.applovin.exoplayer2.l.ai.f13525a     // Catch:{ Exception -> 0x0153 }
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L_0x012e
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x0153 }
            if (r6 != 0) goto L_0x012e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0153 }
            r0.<init>()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r6 = "Skipping codec "
            r0.append(r6)     // Catch:{ Exception -> 0x0153 }
            r0.append(r1)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0153 }
            com.applovin.exoplayer2.l.q.d(r8, r0)     // Catch:{ Exception -> 0x0153 }
        L_0x0124:
            int r12 = r22 + 1
            r1 = r24
            r14 = r18
            r13 = r23
            goto L_0x0019
        L_0x012e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0153 }
            r2.<init>()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x0153 }
            r2.append(r1)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x0153 }
            r1 = r20
            r2.append(r1)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0153 }
            com.applovin.exoplayer2.l.q.d(r8, r1)     // Catch:{ Exception -> 0x0153 }
            throw r0     // Catch:{ Exception -> 0x0153 }
        L_0x0152:
            return r5
        L_0x0153:
            r0 = move-exception
            com.applovin.exoplayer2.f.l$b r1 = new com.applovin.exoplayer2.f.l$b
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.f.l.a(com.applovin.exoplayer2.f.l$a, com.applovin.exoplayer2.f.l$c):java.util.ArrayList");
    }

    public static List<i> a(List<i> list, v vVar) {
        ArrayList arrayList = new ArrayList(list);
        a(arrayList, new f() {
            public final int getScore(Object obj) {
                return l.a(v.this, (i) obj);
            }
        });
        return arrayList;
    }

    private static void a(String str, List<i> list) {
        if ("audio/raw".equals(str)) {
            if (ai.f13525a < 26 && ai.f13526b.equals("R9") && list.size() == 1 && list.get(0).f12544a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(i.a("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
            }
            a(list, $$Lambda$l$Tl7kcoI8lF70y_eEfdPwqt8BwQc.INSTANCE);
        }
        if (ai.f13525a < 21 && list.size() > 1) {
            String str2 = list.get(0).f12544a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                a(list, $$Lambda$l$V0co7jnKyzCB6kZJrZXrymu7l_4.INSTANCE);
            }
        }
        if (ai.f13525a < 32 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get(0).f12544a)) {
            list.add(list.remove(0));
        }
    }

    private static <T> void a(List<T> list, f<T> fVar) {
        Collections.sort(list, new Comparator() {
            public final int compare(Object obj, Object obj2) {
                return l.a(l.f.this, obj, obj2);
            }
        });
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo) {
        return ai.f13525a >= 29 && b(mediaCodecInfo);
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        if (ai.f13525a < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (ai.f13525a < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && ("a70".equals(ai.f13526b) || ("Xiaomi".equals(ai.f13527c) && ai.f13526b.startsWith("HM")))) {
            return false;
        }
        if (ai.f13525a == 16 && "OMX.qcom.audio.decoder.mp3".equals(str) && ("dlxu".equals(ai.f13526b) || "protou".equals(ai.f13526b) || "ville".equals(ai.f13526b) || "villeplus".equals(ai.f13526b) || "villec2".equals(ai.f13526b) || ai.f13526b.startsWith("gee") || "C6602".equals(ai.f13526b) || "C6603".equals(ai.f13526b) || "C6606".equals(ai.f13526b) || "C6616".equals(ai.f13526b) || "L36h".equals(ai.f13526b) || "SO-02E".equals(ai.f13526b))) {
            return false;
        }
        if (ai.f13525a == 16 && "OMX.qcom.audio.decoder.aac".equals(str) && ("C1504".equals(ai.f13526b) || "C1505".equals(ai.f13526b) || "C1604".equals(ai.f13526b) || "C1605".equals(ai.f13526b))) {
            return false;
        }
        if (ai.f13525a < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(ai.f13527c) && (ai.f13526b.startsWith("zeroflte") || ai.f13526b.startsWith("zerolte") || ai.f13526b.startsWith("zenlte") || "SC-05G".equals(ai.f13526b) || "marinelteatt".equals(ai.f13526b) || "404SC".equals(ai.f13526b) || "SC-04G".equals(ai.f13526b) || "SCV31".equals(ai.f13526b)))) {
            return false;
        }
        if (ai.f13525a <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(ai.f13527c) && (ai.f13526b.startsWith("d2") || ai.f13526b.startsWith("serrano") || ai.f13526b.startsWith("jflte") || ai.f13526b.startsWith("santos") || ai.f13526b.startsWith("t0"))) {
            return false;
        }
        if (ai.f13525a > 19 || !ai.f13526b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
            return !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str);
        }
        return false;
    }

    public static int b() throws b {
        if (f12568c == -1) {
            int i = 0;
            i a2 = a(MimeTypes.VIDEO_H264, false, false);
            if (a2 != null) {
                MediaCodecInfo.CodecProfileLevel[] a3 = a2.a();
                int length = a3.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(a(a3[i].level), i2);
                    i++;
                }
                i = Math.max(i2, ai.f13525a >= 21 ? 345600 : 172800);
            }
            f12568c = i;
        }
        return f12568c;
    }

    private static int b(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int b(i iVar) {
        String str = iVar.f12544a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (ai.f13525a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    private static Pair<Integer, Integer> b(String str, String[] strArr) {
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        if (strArr.length < 4) {
            sb = new StringBuilder();
        } else {
            int i = 1;
            Matcher matcher = f12566a.matcher(strArr[1]);
            if (!matcher.matches()) {
                sb = new StringBuilder();
            } else {
                str = matcher.group(1);
                if (!"1".equals(str)) {
                    if ("2".equals(str)) {
                        i = 2;
                    } else {
                        sb2 = new StringBuilder();
                        str2 = "Unknown HEVC profile string: ";
                        sb.append(str2);
                        sb.append(str);
                        q.c("MediaCodecUtil", sb.toString());
                        return null;
                    }
                }
                str = strArr[3];
                Integer a2 = a(str);
                if (a2 != null) {
                    return new Pair<>(Integer.valueOf(i), a2);
                }
                sb2 = new StringBuilder();
                str2 = "Unknown HEVC level string: ";
                sb.append(str2);
                sb.append(str);
                q.c("MediaCodecUtil", sb.toString());
                return null;
            }
        }
        sb.append("Ignoring malformed HEVC codec string: ");
        sb.append(str);
        q.c("MediaCodecUtil", sb.toString());
        return null;
    }

    private static Integer b(String str) {
        int i;
        if (str == null) {
            return null;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c2 = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c2 = 8;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c2 = 9;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                i = 16;
                break;
            case 5:
                i = 32;
                break;
            case 6:
                i = 64;
                break;
            case 7:
                i = 128;
                break;
            case 8:
                i = 256;
                break;
            case 9:
                i = 512;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i);
    }

    public static synchronized List<i> b(String str, boolean z, boolean z2) throws b {
        synchronized (l.class) {
            a aVar = new a(str, z, z2);
            List<i> list = f12567b.get(aVar);
            if (list != null) {
                return list;
            }
            ArrayList<i> a2 = a(aVar, ai.f13525a >= 21 ? new e(z, z2) : new d());
            if (z && a2.isEmpty() && 21 <= ai.f13525a && ai.f13525a <= 23) {
                a2 = a(aVar, (c) new d());
                if (!a2.isEmpty()) {
                    q.c("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + a2.get(0).f12544a);
                }
            }
            a(str, (List<i>) a2);
            List<i> unmodifiableList = Collections.unmodifiableList(a2);
            f12567b.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    private static boolean b(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static int c(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static Pair<Integer, Integer> c(String str, String[] strArr) {
        StringBuilder sb;
        int i;
        int i2;
        String str2;
        if (strArr.length < 2) {
            sb = new StringBuilder();
        } else {
            try {
                if (strArr[1].length() == 6) {
                    i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                    i = Integer.parseInt(strArr[1].substring(4), 16);
                } else if (strArr.length >= 3) {
                    int parseInt = Integer.parseInt(strArr[1]);
                    i = Integer.parseInt(strArr[2]);
                    i2 = parseInt;
                } else {
                    q.c("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int b2 = b(i2);
                if (b2 == -1) {
                    str2 = "Unknown AVC profile: " + i2;
                    q.c("MediaCodecUtil", str2);
                    return null;
                }
                int c2 = c(i);
                if (c2 != -1) {
                    return new Pair<>(Integer.valueOf(b2), Integer.valueOf(c2));
                }
                sb = new StringBuilder();
                sb.append("Unknown AVC level: ");
                sb.append(i);
                str2 = sb.toString();
                q.c("MediaCodecUtil", str2);
                return null;
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
        }
        sb.append("Ignoring malformed AVC codec string: ");
        sb.append(str);
        str2 = sb.toString();
        q.c("MediaCodecUtil", str2);
        return null;
    }

    private static Integer c(String str) {
        int i;
        if (str == null) {
            return null;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        switch (hashCode) {
            case 1537:
                if (str.equals("01")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c2 = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c2 = 8;
                    break;
                }
                break;
            default:
                switch (hashCode) {
                    case 1567:
                        if (str.equals("10")) {
                            c2 = 9;
                            break;
                        }
                        break;
                    case 1568:
                        if (str.equals("11")) {
                            c2 = 10;
                            break;
                        }
                        break;
                    case 1569:
                        if (str.equals("12")) {
                            c2 = 11;
                            break;
                        }
                        break;
                    case 1570:
                        if (str.equals("13")) {
                            c2 = 12;
                            break;
                        }
                        break;
                }
        }
        switch (c2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                i = 16;
                break;
            case 5:
                i = 32;
                break;
            case 6:
                i = 64;
                break;
            case 7:
                i = 128;
                break;
            case 8:
                i = 256;
                break;
            case 9:
                i = 512;
                break;
            case 10:
                i = 1024;
                break;
            case 11:
                i = 2048;
                break;
            case 12:
                i = 4096;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i);
    }

    private static boolean c(MediaCodecInfo mediaCodecInfo) {
        return ai.f13525a >= 29 ? d(mediaCodecInfo) : !e(mediaCodecInfo);
    }

    private static int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    private static Pair<Integer, Integer> d(String str, String[] strArr) {
        StringBuilder sb;
        String str2;
        if (strArr.length < 3) {
            sb = new StringBuilder();
        } else {
            try {
                int parseInt = Integer.parseInt(strArr[1]);
                int parseInt2 = Integer.parseInt(strArr[2]);
                int d2 = d(parseInt);
                if (d2 == -1) {
                    str2 = "Unknown VP9 profile: " + parseInt;
                    q.c("MediaCodecUtil", str2);
                    return null;
                }
                int e2 = e(parseInt2);
                if (e2 != -1) {
                    return new Pair<>(Integer.valueOf(d2), Integer.valueOf(e2));
                }
                sb = new StringBuilder();
                sb.append("Unknown VP9 level: ");
                sb.append(parseInt2);
                str2 = sb.toString();
                q.c("MediaCodecUtil", str2);
                return null;
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
        }
        sb.append("Ignoring malformed VP9 codec string: ");
        sb.append(str);
        str2 = sb.toString();
        q.c("MediaCodecUtil", str2);
        return null;
    }

    private static boolean d(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static int e(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static Pair<Integer, Integer> e(String str, String[] strArr) {
        int g2;
        if (strArr.length != 3) {
            q.c("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(u.a(Integer.parseInt(strArr[1], 16))) && (g2 = g(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(g2), 0);
            }
        } catch (NumberFormatException unused) {
            q.c("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    private static boolean e(MediaCodecInfo mediaCodecInfo) {
        if (ai.f13525a >= 29) {
            return f(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || (!lowerCase.startsWith("omx.") && !lowerCase.startsWith("c2."));
    }

    private static int f(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static boolean f(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static int g(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    private static boolean g(MediaCodecInfo mediaCodecInfo) {
        if (ai.f13525a >= 29) {
            return h(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        return !lowerCase.startsWith("omx.google.") && !lowerCase.startsWith("c2.android.") && !lowerCase.startsWith("c2.google.");
    }

    private static boolean h(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }
}
