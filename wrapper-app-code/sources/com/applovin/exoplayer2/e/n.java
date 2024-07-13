package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.e.p;
import com.applovin.exoplayer2.g.e.g;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class n {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public p f12429a;

        public a(p pVar) {
            this.f12429a = pVar;
        }
    }

    private static p.a a(i iVar, int i) throws IOException {
        y yVar = new y(i);
        iVar.b(yVar.d(), 0, i);
        return a(yVar);
    }

    public static p.a a(y yVar) {
        yVar.e(1);
        int m = yVar.m();
        long c2 = ((long) yVar.c()) + ((long) m);
        int i = m / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long s = yVar.s();
            if (s == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = s;
            jArr2[i2] = yVar.s();
            yVar.e(2);
            i2++;
        }
        yVar.e((int) (c2 - ((long) yVar.c())));
        return new p.a(jArr, jArr2);
    }

    public static com.applovin.exoplayer2.g.a a(i iVar, boolean z) throws IOException {
        com.applovin.exoplayer2.g.a a2 = new s().a(iVar, z ? null : g.f12638a);
        if (a2 == null || a2.a() == 0) {
            return null;
        }
        return a2;
    }

    public static boolean a(i iVar) throws IOException {
        y yVar = new y(4);
        iVar.d(yVar.d(), 0, 4);
        return yVar.o() == 1716281667;
    }

    public static boolean a(i iVar, a aVar) throws IOException {
        p b2;
        iVar.a();
        x xVar = new x(new byte[4]);
        iVar.d(xVar.f13604a, 0, 4);
        boolean e2 = xVar.e();
        int c2 = xVar.c(7);
        int c3 = xVar.c(24) + 4;
        if (c2 == 0) {
            b2 = d(iVar);
        } else {
            p pVar = aVar.f12429a;
            if (pVar == null) {
                throw new IllegalArgumentException();
            } else if (c2 == 3) {
                b2 = pVar.a(a(iVar, c3));
            } else if (c2 == 4) {
                b2 = pVar.a(b(iVar, c3));
            } else if (c2 == 6) {
                b2 = pVar.b((List<com.applovin.exoplayer2.g.c.a>) Collections.singletonList(c(iVar, c3)));
            } else {
                iVar.b(c3);
                return e2;
            }
        }
        aVar.f12429a = b2;
        return e2;
    }

    public static com.applovin.exoplayer2.g.a b(i iVar, boolean z) throws IOException {
        iVar.a();
        long b2 = iVar.b();
        com.applovin.exoplayer2.g.a a2 = a(iVar, z);
        iVar.b((int) (iVar.b() - b2));
        return a2;
    }

    private static List<String> b(i iVar, int i) throws IOException {
        y yVar = new y(i);
        iVar.b(yVar.d(), 0, i);
        yVar.e(4);
        return Arrays.asList(z.a(yVar, false, false).f12473b);
    }

    public static void b(i iVar) throws IOException {
        y yVar = new y(4);
        iVar.b(yVar.d(), 0, 4);
        if (yVar.o() != 1716281667) {
            throw ai.b("Failed to read FLAC stream marker.", (Throwable) null);
        }
    }

    public static int c(i iVar) throws IOException {
        iVar.a();
        y yVar = new y(2);
        iVar.d(yVar.d(), 0, 2);
        int i = yVar.i();
        int i2 = i >> 2;
        iVar.a();
        if (i2 == 16382) {
            return i;
        }
        throw ai.b("First frame does not start with sync code.", (Throwable) null);
    }

    private static com.applovin.exoplayer2.g.c.a c(i iVar, int i) throws IOException {
        y yVar = new y(i);
        iVar.b(yVar.d(), 0, i);
        yVar.e(4);
        int q = yVar.q();
        String a2 = yVar.a(yVar.q(), Charsets.US_ASCII);
        String f2 = yVar.f(yVar.q());
        int q2 = yVar.q();
        int q3 = yVar.q();
        int q4 = yVar.q();
        int q5 = yVar.q();
        int q6 = yVar.q();
        byte[] bArr = new byte[q6];
        yVar.a(bArr, 0, q6);
        return new com.applovin.exoplayer2.g.c.a(q, a2, f2, q2, q3, q4, q5, bArr);
    }

    private static p d(i iVar) throws IOException {
        byte[] bArr = new byte[38];
        iVar.b(bArr, 0, 38);
        return new p(bArr, 4);
    }
}
