package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.c.b;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final int f12432a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12433b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12434c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12435d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12436e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12437f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12438g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12439h;
    public final int i;
    public final long j;
    public final a k;
    private final com.applovin.exoplayer2.g.a l;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f12440a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f12441b;

        public a(long[] jArr, long[] jArr2) {
            this.f12440a = jArr;
            this.f12441b = jArr2;
        }
    }

    private p(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, a aVar, com.applovin.exoplayer2.g.a aVar2) {
        this.f12432a = i2;
        this.f12433b = i3;
        this.f12434c = i4;
        this.f12435d = i5;
        this.f12436e = i6;
        this.f12437f = a(i6);
        this.f12438g = i7;
        this.f12439h = i8;
        this.i = b(i8);
        this.j = j2;
        this.k = aVar;
        this.l = aVar2;
    }

    public p(byte[] bArr, int i2) {
        x xVar = new x(bArr);
        xVar.a(i2 * 8);
        this.f12432a = xVar.c(16);
        this.f12433b = xVar.c(16);
        this.f12434c = xVar.c(24);
        this.f12435d = xVar.c(24);
        int c2 = xVar.c(20);
        this.f12436e = c2;
        this.f12437f = a(c2);
        this.f12438g = xVar.c(3) + 1;
        int c3 = xVar.c(5) + 1;
        this.f12439h = c3;
        this.i = b(c3);
        this.j = xVar.d(36);
        this.k = null;
        this.l = null;
    }

    private static int a(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static com.applovin.exoplayer2.g.a a(List<String> list, List<com.applovin.exoplayer2.g.c.a> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            String[] b2 = ai.b(str, "=");
            if (b2.length != 2) {
                q.c("FlacStreamMetadata", "Failed to parse Vorbis comment: " + str);
            } else {
                arrayList.add(new b(b2[0], b2[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.applovin.exoplayer2.g.a((List<? extends a.C0122a>) arrayList);
    }

    private static int b(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 != 20) {
            return i2 != 24 ? -1 : 6;
        }
        return 5;
    }

    public long a() {
        long j2 = this.j;
        if (j2 == 0) {
            return -9223372036854775807L;
        }
        return (j2 * 1000000) / ((long) this.f12436e);
    }

    public long a(long j2) {
        return ai.a((j2 * ((long) this.f12436e)) / 1000000, 0, this.j - 1);
    }

    public p a(a aVar) {
        return new p(this.f12432a, this.f12433b, this.f12434c, this.f12435d, this.f12436e, this.f12438g, this.f12439h, this.j, aVar, this.l);
    }

    public p a(List<String> list) {
        return new p(this.f12432a, this.f12433b, this.f12434c, this.f12435d, this.f12436e, this.f12438g, this.f12439h, this.j, this.k, a(a(list, (List<com.applovin.exoplayer2.g.c.a>) Collections.emptyList())));
    }

    public com.applovin.exoplayer2.g.a a(com.applovin.exoplayer2.g.a aVar) {
        com.applovin.exoplayer2.g.a aVar2 = this.l;
        return aVar2 == null ? aVar : aVar2.a(aVar);
    }

    public v a(byte[] bArr, com.applovin.exoplayer2.g.a aVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i2 = this.f12435d;
        if (i2 <= 0) {
            i2 = -1;
        }
        return new v.a().f("audio/flac").f(i2).k(this.f12438g).l(this.f12436e).a((List<byte[]>) Collections.singletonList(bArr)).a(a(aVar)).a();
    }

    public long b() {
        long j2;
        long j3;
        int i2 = this.f12435d;
        if (i2 > 0) {
            j2 = (((long) i2) + ((long) this.f12434c)) / 2;
            j3 = 1;
        } else {
            int i3 = this.f12432a;
            j2 = ((((i3 != this.f12433b || i3 <= 0) ? 4096 : (long) i3) * ((long) this.f12438g)) * ((long) this.f12439h)) / 8;
            j3 = 64;
        }
        return j2 + j3;
    }

    public p b(List<com.applovin.exoplayer2.g.c.a> list) {
        return new p(this.f12432a, this.f12433b, this.f12434c, this.f12435d, this.f12436e, this.f12438g, this.f12439h, this.j, this.k, a(a((List<String>) Collections.emptyList(), list)));
    }
}
