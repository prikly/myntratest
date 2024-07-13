package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.e.r;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.e.e;
import com.applovin.exoplayer2.g.e.h;
import com.applovin.exoplayer2.g.e.i;
import com.applovin.exoplayer2.g.e.l;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import kotlin.KotlinVersion;

final class f {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f12038a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static a.C0122a a(y yVar) {
        int c2 = yVar.c() + yVar.q();
        int q = yVar.q();
        int i = (q >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i == 169 || i == 253) {
            int i2 = 16777215 & q;
            if (i2 == 6516084) {
                e a2 = a(q, yVar);
                yVar.d(c2);
                return a2;
            } else if (i2 == 7233901 || i2 == 7631467) {
                l a3 = a(q, "TIT2", yVar);
                yVar.d(c2);
                return a3;
            } else if (i2 == 6516589 || i2 == 7828084) {
                l a4 = a(q, "TCOM", yVar);
                yVar.d(c2);
                return a4;
            } else if (i2 == 6578553) {
                l a5 = a(q, "TDRC", yVar);
                yVar.d(c2);
                return a5;
            } else if (i2 == 4280916) {
                l a6 = a(q, "TPE1", yVar);
                yVar.d(c2);
                return a6;
            } else if (i2 == 7630703) {
                l a7 = a(q, "TSSE", yVar);
                yVar.d(c2);
                return a7;
            } else if (i2 == 6384738) {
                l a8 = a(q, "TALB", yVar);
                yVar.d(c2);
                return a8;
            } else if (i2 == 7108978) {
                l a9 = a(q, "USLT", yVar);
                yVar.d(c2);
                return a9;
            } else if (i2 == 6776174) {
                l a10 = a(q, "TCON", yVar);
                yVar.d(c2);
                return a10;
            } else if (i2 == 6779504) {
                l a11 = a(q, "TIT1", yVar);
                yVar.d(c2);
                return a11;
            }
        } else if (q == 1735291493) {
            try {
                return b(yVar);
            } finally {
                yVar.d(c2);
            }
        } else if (q == 1684632427) {
            l b2 = b(q, "TPOS", yVar);
            yVar.d(c2);
            return b2;
        } else if (q == 1953655662) {
            l b3 = b(q, "TRCK", yVar);
            yVar.d(c2);
            return b3;
        } else if (q == 1953329263) {
            h a12 = a(q, "TBPM", yVar, true, false);
            yVar.d(c2);
            return a12;
        } else if (q == 1668311404) {
            h a13 = a(q, "TCMP", yVar, true, true);
            yVar.d(c2);
            return a13;
        } else if (q == 1668249202) {
            com.applovin.exoplayer2.g.e.a c3 = c(yVar);
            yVar.d(c2);
            return c3;
        } else if (q == 1631670868) {
            l a14 = a(q, "TPE2", yVar);
            yVar.d(c2);
            return a14;
        } else if (q == 1936682605) {
            l a15 = a(q, "TSOT", yVar);
            yVar.d(c2);
            return a15;
        } else if (q == 1936679276) {
            l a16 = a(q, "TSO2", yVar);
            yVar.d(c2);
            return a16;
        } else if (q == 1936679282) {
            l a17 = a(q, "TSOA", yVar);
            yVar.d(c2);
            return a17;
        } else if (q == 1936679265) {
            l a18 = a(q, "TSOP", yVar);
            yVar.d(c2);
            return a18;
        } else if (q == 1936679791) {
            l a19 = a(q, "TSOC", yVar);
            yVar.d(c2);
            return a19;
        } else if (q == 1920233063) {
            h a20 = a(q, "ITUNESADVISORY", yVar, false, false);
            yVar.d(c2);
            return a20;
        } else if (q == 1885823344) {
            h a21 = a(q, "ITUNESGAPLESS", yVar, false, true);
            yVar.d(c2);
            return a21;
        } else if (q == 1936683886) {
            l a22 = a(q, "TVSHOWSORT", yVar);
            yVar.d(c2);
            return a22;
        } else if (q == 1953919848) {
            l a23 = a(q, "TVSHOW", yVar);
            yVar.d(c2);
            return a23;
        } else if (q == 757935405) {
            h a24 = a(yVar, c2);
            yVar.d(c2);
            return a24;
        }
        q.a("MetadataUtil", "Skipped unknown metadata entry: " + a.c(q));
        yVar.d(c2);
        return null;
    }

    private static e a(int i, y yVar) {
        int q = yVar.q();
        if (yVar.q() == 1684108385) {
            yVar.e(8);
            String g2 = yVar.g(q - 16);
            return new e("und", g2, g2);
        }
        q.c("MetadataUtil", "Failed to parse comment attribute: " + a.c(i));
        return null;
    }

    private static h a(int i, String str, y yVar, boolean z, boolean z2) {
        int d2 = d(yVar);
        if (z2) {
            d2 = Math.min(1, d2);
        }
        if (d2 >= 0) {
            return z ? new l(str, (String) null, Integer.toString(d2)) : new e("und", str, Integer.toString(d2));
        }
        q.c("MetadataUtil", "Failed to parse uint8 attribute: " + a.c(i));
        return null;
    }

    private static h a(y yVar, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (yVar.c() < i) {
            int c2 = yVar.c();
            int q = yVar.q();
            int q2 = yVar.q();
            yVar.e(4);
            if (q2 == 1835360622) {
                str = yVar.g(q - 12);
            } else if (q2 == 1851878757) {
                str2 = yVar.g(q - 12);
            } else {
                if (q2 == 1684108385) {
                    i2 = c2;
                    i3 = q;
                }
                yVar.e(q - 12);
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        yVar.d(i2);
        yVar.e(16);
        return new i(str, str2, yVar.g(i3 - 16));
    }

    private static l a(int i, String str, y yVar) {
        int q = yVar.q();
        if (yVar.q() == 1684108385) {
            yVar.e(8);
            return new l(str, (String) null, yVar.g(q - 16));
        }
        q.c("MetadataUtil", "Failed to parse text attribute: " + a.c(i));
        return null;
    }

    public static com.applovin.exoplayer2.g.f.a a(y yVar, int i, String str) {
        while (true) {
            int c2 = yVar.c();
            if (c2 >= i) {
                return null;
            }
            int q = yVar.q();
            if (yVar.q() == 1684108385) {
                int q2 = yVar.q();
                int q3 = yVar.q();
                int i2 = q - 16;
                byte[] bArr = new byte[i2];
                yVar.a(bArr, 0, i2);
                return new com.applovin.exoplayer2.g.f.a(str, bArr, q3, q2);
            }
            yVar.d(c2 + q);
        }
    }

    public static void a(int i, r rVar, v.a aVar) {
        if (i == 1 && rVar.a()) {
            aVar.n(rVar.f12444a).o(rVar.f12445b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r6 != null) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[LOOP:1: B:17:0x003e->B:18:0x0040, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r5, com.applovin.exoplayer2.g.a r6, com.applovin.exoplayer2.g.a r7, com.applovin.exoplayer2.v.a r8, com.applovin.exoplayer2.g.a... r9) {
        /*
            com.applovin.exoplayer2.g.a r0 = new com.applovin.exoplayer2.g.a
            r1 = 0
            com.applovin.exoplayer2.g.a$a[] r2 = new com.applovin.exoplayer2.g.a.C0122a[r1]
            r0.<init>((com.applovin.exoplayer2.g.a.C0122a[]) r2)
            r2 = 1
            if (r5 != r2) goto L_0x000e
            if (r6 == 0) goto L_0x003c
            goto L_0x003d
        L_0x000e:
            r6 = 2
            if (r5 != r6) goto L_0x003c
            if (r7 == 0) goto L_0x003c
            r5 = 0
        L_0x0014:
            int r6 = r7.a()
            if (r5 >= r6) goto L_0x003c
            com.applovin.exoplayer2.g.a$a r6 = r7.a((int) r5)
            boolean r3 = r6 instanceof com.applovin.exoplayer2.g.f.a
            if (r3 == 0) goto L_0x0039
            com.applovin.exoplayer2.g.f.a r6 = (com.applovin.exoplayer2.g.f.a) r6
            java.lang.String r3 = r6.f12666a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0039
            com.applovin.exoplayer2.g.a r5 = new com.applovin.exoplayer2.g.a
            com.applovin.exoplayer2.g.a$a[] r7 = new com.applovin.exoplayer2.g.a.C0122a[r2]
            r7[r1] = r6
            r5.<init>((com.applovin.exoplayer2.g.a.C0122a[]) r7)
            r6 = r5
            goto L_0x003d
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x0014
        L_0x003c:
            r6 = r0
        L_0x003d:
            int r5 = r9.length
        L_0x003e:
            if (r1 >= r5) goto L_0x0049
            r7 = r9[r1]
            com.applovin.exoplayer2.g.a r6 = r6.a((com.applovin.exoplayer2.g.a) r7)
            int r1 = r1 + 1
            goto L_0x003e
        L_0x0049:
            int r5 = r6.a()
            if (r5 <= 0) goto L_0x0052
            r8.a((com.applovin.exoplayer2.g.a) r6)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.g.f.a(int, com.applovin.exoplayer2.g.a, com.applovin.exoplayer2.g.a, com.applovin.exoplayer2.v$a, com.applovin.exoplayer2.g.a[]):void");
    }

    private static l b(int i, String str, y yVar) {
        int q = yVar.q();
        if (yVar.q() == 1684108385 && q >= 22) {
            yVar.e(10);
            int i2 = yVar.i();
            if (i2 > 0) {
                String str2 = "" + i2;
                int i3 = yVar.i();
                if (i3 > 0) {
                    str2 = str2 + "/" + i3;
                }
                return new l(str, (String) null, str2);
            }
        }
        q.c("MetadataUtil", "Failed to parse index/count attribute: " + a.c(i));
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.exoplayer2.g.e.l b(com.applovin.exoplayer2.l.y r3) {
        /*
            int r3 = d(r3)
            r0 = 0
            if (r3 <= 0) goto L_0x0011
            java.lang.String[] r1 = f12038a
            int r2 = r1.length
            if (r3 > r2) goto L_0x0011
            int r3 = r3 + -1
            r3 = r1[r3]
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x001c
            com.applovin.exoplayer2.g.e.l r1 = new com.applovin.exoplayer2.g.e.l
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L_0x001c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            com.applovin.exoplayer2.l.q.c(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.g.f.b(com.applovin.exoplayer2.l.y):com.applovin.exoplayer2.g.e.l");
    }

    private static com.applovin.exoplayer2.g.e.a c(y yVar) {
        String str;
        int q = yVar.q();
        if (yVar.q() == 1684108385) {
            int b2 = a.b(yVar.q());
            String str2 = b2 == 13 ? "image/jpeg" : b2 == 14 ? "image/png" : null;
            if (str2 == null) {
                str = "Unrecognized cover art flags: " + b2;
            } else {
                yVar.e(4);
                int i = q - 16;
                byte[] bArr = new byte[i];
                yVar.a(bArr, 0, i);
                return new com.applovin.exoplayer2.g.e.a(str2, (String) null, 3, bArr);
            }
        } else {
            str = "Failed to parse cover art attribute";
        }
        q.c("MetadataUtil", str);
        return null;
    }

    private static int d(y yVar) {
        yVar.e(4);
        if (yVar.q() == 1684108385) {
            yVar.e(8);
            return yVar.h();
        }
        q.c("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
