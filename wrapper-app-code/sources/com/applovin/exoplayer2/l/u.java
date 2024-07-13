package com.applovin.exoplayer2.l;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList<a> f13574a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f13575b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f13576a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13577b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13578c;
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f13579a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13580b;

        public b(int i, int i2) {
            this.f13579a = i;
            this.f13580b = i2;
        }

        public int a() {
            int i = this.f13580b;
            if (i == 2) {
                return 10;
            }
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i == 42) {
                return 16;
            }
            if (i != 22) {
                return i != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static String a(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return MimeTypes.VIDEO_H264;
        }
        if (i == 35) {
            return MimeTypes.VIDEO_H265;
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static boolean a(String str) {
        return MimeTypes.BASE_TYPE_AUDIO.equals(h(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008e, code lost:
        r4 = (r4 = g(r5)).a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = -1
            int r2 = r4.hashCode()
            r3 = 1
            switch(r2) {
                case -2123537834: goto L_0x0076;
                case -432837260: goto L_0x006c;
                case -432837259: goto L_0x0062;
                case -53558318: goto L_0x0057;
                case 187078296: goto L_0x004d;
                case 187094639: goto L_0x0043;
                case 1504578661: goto L_0x0038;
                case 1504619009: goto L_0x002e;
                case 1504831518: goto L_0x0024;
                case 1903231877: goto L_0x001a;
                case 1903589369: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0080
        L_0x000f:
            java.lang.String r2 = "audio/g711-mlaw"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 5
            goto L_0x0080
        L_0x001a:
            java.lang.String r2 = "audio/g711-alaw"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 4
            goto L_0x0080
        L_0x0024:
            java.lang.String r2 = "audio/mpeg"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 0
            goto L_0x0080
        L_0x002e:
            java.lang.String r2 = "audio/flac"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 6
            goto L_0x0080
        L_0x0038:
            java.lang.String r2 = "audio/eac3"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 8
            goto L_0x0080
        L_0x0043:
            java.lang.String r2 = "audio/raw"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 3
            goto L_0x0080
        L_0x004d:
            java.lang.String r2 = "audio/ac3"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 7
            goto L_0x0080
        L_0x0057:
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 10
            goto L_0x0080
        L_0x0062:
            java.lang.String r2 = "audio/mpeg-L2"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 2
            goto L_0x0080
        L_0x006c:
            java.lang.String r2 = "audio/mpeg-L1"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 1
            goto L_0x0080
        L_0x0076:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0080
            r1 = 9
        L_0x0080:
            switch(r1) {
                case 0: goto L_0x009a;
                case 1: goto L_0x009a;
                case 2: goto L_0x009a;
                case 3: goto L_0x009a;
                case 4: goto L_0x009a;
                case 5: goto L_0x009a;
                case 6: goto L_0x009a;
                case 7: goto L_0x009a;
                case 8: goto L_0x009a;
                case 9: goto L_0x009a;
                case 10: goto L_0x0084;
                default: goto L_0x0083;
            }
        L_0x0083:
            return r0
        L_0x0084:
            if (r5 != 0) goto L_0x0087
            return r0
        L_0x0087:
            com.applovin.exoplayer2.l.u$b r4 = g(r5)
            if (r4 != 0) goto L_0x008e
            return r0
        L_0x008e:
            int r4 = r4.a()
            if (r4 == 0) goto L_0x0099
            r5 = 16
            if (r4 == r5) goto L_0x0099
            r0 = 1
        L_0x0099:
            return r0
        L_0x009a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.u.a(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r6.hashCode()
            r1 = 8
            r2 = 7
            r3 = 6
            r4 = 5
            r5 = 0
            switch(r0) {
                case -2123537834: goto L_0x005f;
                case -1095064472: goto L_0x0055;
                case -53558318: goto L_0x004b;
                case 187078296: goto L_0x0041;
                case 187078297: goto L_0x0037;
                case 1504578661: goto L_0x002d;
                case 1504831518: goto L_0x0023;
                case 1505942594: goto L_0x0019;
                case 1556697186: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0069
        L_0x000e:
            java.lang.String r0 = "audio/true-hd"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 8
            goto L_0x006a
        L_0x0019:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 7
            goto L_0x006a
        L_0x0023:
            java.lang.String r0 = "audio/mpeg"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 0
            goto L_0x006a
        L_0x002d:
            java.lang.String r0 = "audio/eac3"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 3
            goto L_0x006a
        L_0x0037:
            java.lang.String r0 = "audio/ac4"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 5
            goto L_0x006a
        L_0x0041:
            java.lang.String r0 = "audio/ac3"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 2
            goto L_0x006a
        L_0x004b:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 1
            goto L_0x006a
        L_0x0055:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 6
            goto L_0x006a
        L_0x005f:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 4
            goto L_0x006a
        L_0x0069:
            r6 = -1
        L_0x006a:
            switch(r6) {
                case 0: goto L_0x008a;
                case 1: goto L_0x007b;
                case 2: goto L_0x007a;
                case 3: goto L_0x0079;
                case 4: goto L_0x0076;
                case 5: goto L_0x0073;
                case 6: goto L_0x0072;
                case 7: goto L_0x0071;
                case 8: goto L_0x006e;
                default: goto L_0x006d;
            }
        L_0x006d:
            return r5
        L_0x006e:
            r6 = 14
            return r6
        L_0x0071:
            return r1
        L_0x0072:
            return r2
        L_0x0073:
            r6 = 17
            return r6
        L_0x0076:
            r6 = 18
            return r6
        L_0x0079:
            return r3
        L_0x007a:
            return r4
        L_0x007b:
            if (r7 != 0) goto L_0x007e
            return r5
        L_0x007e:
            com.applovin.exoplayer2.l.u$b r6 = g(r7)
            if (r6 != 0) goto L_0x0085
            return r5
        L_0x0085:
            int r6 = r6.a()
            return r6
        L_0x008a:
            r6 = 9
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.u.b(java.lang.String, java.lang.String):int");
    }

    public static boolean b(String str) {
        return "video".equals(h(str));
    }

    public static boolean c(String str) {
        return "text".equals(h(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static String d(String str) {
        b g2;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
            return MimeTypes.VIDEO_H264;
        }
        if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
            return MimeTypes.VIDEO_H265;
        }
        if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (lowerCase.startsWith("av01")) {
            return "video/av01";
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!lowerCase.startsWith("mp4a")) {
            return lowerCase.startsWith("mha1") ? "audio/mha1" : lowerCase.startsWith("mhm1") ? "audio/mhm1" : (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) ? "audio/ac3" : (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) ? "audio/eac3" : lowerCase.startsWith("ec+3") ? "audio/eac3-joc" : (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) ? "audio/ac4" : lowerCase.startsWith("dtsc") ? "audio/vnd.dts" : lowerCase.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) ? "audio/vnd.dts.hd" : lowerCase.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : lowerCase.startsWith("opus") ? "audio/opus" : lowerCase.startsWith("vorbis") ? "audio/vorbis" : lowerCase.startsWith("flac") ? "audio/flac" : lowerCase.startsWith("stpp") ? "application/ttml+xml" : lowerCase.startsWith("wvtt") ? "text/vtt" : lowerCase.contains("cea708") ? "application/cea-708" : (lowerCase.contains("eia608") || lowerCase.contains("cea608")) ? "application/cea-608" : i(lowerCase);
        }
        if (lowerCase.startsWith("mp4a.") && (g2 = g(lowerCase)) != null) {
            str2 = a(g2.f13579a);
        }
        return str2 == null ? "audio/mp4a-latm" : str2;
    }

    public static int e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (a(str)) {
            return 1;
        }
        if (b(str)) {
            return 2;
        }
        if (c(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return j(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String f(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1007807498(0xffffffffc3ee13f6, float:-476.15594)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = -586683234(0xffffffffdd07ec9e, float:-6.1214856E17)
            if (r0 == r1) goto L_0x0020
            r1 = 187090231(0xb26c537, float:3.2118805E-32)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "audio/mp3"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "audio/x-wav"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "audio/x-flac"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x0042
            if (r0 == r3) goto L_0x003f
            if (r0 == r2) goto L_0x003c
            return r4
        L_0x003c:
            java.lang.String r4 = "audio/wav"
            return r4
        L_0x003f:
            java.lang.String r4 = "audio/mpeg"
            return r4
        L_0x0042:
            java.lang.String r4 = "audio/flac"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.u.f(java.lang.String):java.lang.String");
    }

    static b g(String str) {
        Matcher matcher = f13575b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) a.b(matcher.group(1));
        String group = matcher.group(2);
        int i = 0;
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i = Integer.parseInt(group);
            }
            return new b(parseInt, i);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String h(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    private static String i(String str) {
        int size = f13574a.size();
        for (int i = 0; i < size; i++) {
            a aVar = f13574a.get(i);
            if (str.startsWith(aVar.f13577b)) {
                return aVar.f13576a;
            }
        }
        return null;
    }

    private static int j(String str) {
        int size = f13574a.size();
        for (int i = 0; i < size; i++) {
            a aVar = f13574a.get(i);
            if (str.equals(aVar.f13576a)) {
                return aVar.f13578c;
            }
        }
        return -1;
    }
}
