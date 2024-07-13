package com.applovin.exoplayer2.e.d;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.e.d.b;
import com.applovin.exoplayer2.l.aj;
import com.applovin.exoplayer2.l.q;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f11899a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f11900b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f11901c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private static s<b.a> a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        s.a i = s.i();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (aj.b(xmlPullParser, str3)) {
                String c2 = aj.c(xmlPullParser, str2 + ":Mime");
                String c3 = aj.c(xmlPullParser, str2 + ":Semantic");
                String c4 = aj.c(xmlPullParser, str2 + ":Length");
                String c5 = aj.c(xmlPullParser, str2 + ":Padding");
                if (c2 == null || c3 == null) {
                    return s.g();
                }
                i.a(new b.a(c2, c3, c4 != null ? Long.parseLong(c4) : 0, c5 != null ? Long.parseLong(c5) : 0));
            }
        } while (!aj.a(xmlPullParser, str4));
        return i.a();
    }

    public static b a(String str) throws IOException {
        try {
            return b(str);
        } catch (ai | NumberFormatException | XmlPullParserException unused) {
            q.c("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static boolean a(XmlPullParser xmlPullParser) {
        for (String c2 : f11899a) {
            String c3 = aj.c(xmlPullParser, c2);
            if (c3 != null) {
                return Integer.parseInt(c3) == 1;
            }
        }
        return false;
    }

    private static long b(XmlPullParser xmlPullParser) {
        for (String c2 : f11900b) {
            String c3 = aj.c(xmlPullParser, c2);
            if (c3 != null) {
                long parseLong = Long.parseLong(c3);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    private static b b(String str) throws XmlPullParserException, IOException {
        String str2;
        String str3;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (aj.b(newPullParser, "x:xmpmeta")) {
            long j = -9223372036854775807L;
            s<b.a> g2 = s.g();
            do {
                newPullParser.next();
                if (!aj.b(newPullParser, "rdf:Description")) {
                    if (aj.b(newPullParser, "Container:Directory")) {
                        str2 = "Container";
                        str3 = "Item";
                    } else if (aj.b(newPullParser, "GContainer:Directory")) {
                        str2 = "GContainer";
                        str3 = "GContainerItem";
                    }
                    g2 = a(newPullParser, str2, str3);
                } else if (!a(newPullParser)) {
                    return null;
                } else {
                    j = b(newPullParser);
                    g2 = c(newPullParser);
                }
            } while (!aj.a(newPullParser, "x:xmpmeta"));
            if (g2.isEmpty()) {
                return null;
            }
            return new b(j, g2);
        }
        throw ai.b("Couldn't find xmp metadata", (Throwable) null);
    }

    private static s<b.a> c(XmlPullParser xmlPullParser) {
        for (String c2 : f11901c) {
            String c3 = aj.c(xmlPullParser, c2);
            if (c3 != null) {
                return s.a(new b.a("image/jpeg", "Primary", 0, 0), new b.a("video/mp4", "MotionPhoto", Long.parseLong(c3), 0));
            }
        }
        return s.g();
    }
}
