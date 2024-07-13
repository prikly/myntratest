package com.applovin.exoplayer2.e.e;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.i;
import java.io.IOException;
import java.util.ArrayDeque;

final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f11909a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<C0115a> f11910b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private final f f11911c = new f();

    /* renamed from: d  reason: collision with root package name */
    private b f11912d;

    /* renamed from: e  reason: collision with root package name */
    private int f11913e;

    /* renamed from: f  reason: collision with root package name */
    private int f11914f;

    /* renamed from: g  reason: collision with root package name */
    private long f11915g;

    /* renamed from: com.applovin.exoplayer2.e.e.a$a  reason: collision with other inner class name */
    private static final class C0115a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f11916a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f11917b;

        private C0115a(int i, long j) {
            this.f11916a = i;
            this.f11917b = j;
        }
    }

    private long a(i iVar, int i) throws IOException {
        iVar.b(this.f11909a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f11909a[i2] & 255));
        }
        return j;
    }

    private double b(i iVar, int i) throws IOException {
        long a2 = a(iVar, i);
        return i == 4 ? (double) Float.intBitsToFloat((int) a2) : Double.longBitsToDouble(a2);
    }

    private long b(i iVar) throws IOException {
        iVar.a();
        while (true) {
            iVar.d(this.f11909a, 0, 4);
            int a2 = f.a(this.f11909a[0]);
            if (a2 != -1 && a2 <= 4) {
                int a3 = (int) f.a(this.f11909a, a2, false);
                if (this.f11912d.b(a3)) {
                    iVar.b(a2);
                    return (long) a3;
                }
            }
            iVar.b(1);
        }
    }

    private static String c(i iVar, int i) throws IOException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        iVar.b(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    public void a() {
        this.f11913e = 0;
        this.f11910b.clear();
        this.f11911c.a();
    }

    public void a(b bVar) {
        this.f11912d = bVar;
    }

    public boolean a(i iVar) throws IOException {
        com.applovin.exoplayer2.l.a.a(this.f11912d);
        while (true) {
            C0115a peek = this.f11910b.peek();
            if (peek == null || iVar.c() < peek.f11917b) {
                if (this.f11913e == 0) {
                    long a2 = this.f11911c.a(iVar, true, false, 4);
                    if (a2 == -2) {
                        a2 = b(iVar);
                    }
                    if (a2 == -1) {
                        return false;
                    }
                    this.f11914f = (int) a2;
                    this.f11913e = 1;
                }
                if (this.f11913e == 1) {
                    this.f11915g = this.f11911c.a(iVar, false, true, 8);
                    this.f11913e = 2;
                }
                int a3 = this.f11912d.a(this.f11914f);
                if (a3 == 0) {
                    iVar.b((int) this.f11915g);
                    this.f11913e = 0;
                } else if (a3 == 1) {
                    long c2 = iVar.c();
                    this.f11910b.push(new C0115a(this.f11914f, this.f11915g + c2));
                    this.f11912d.a(this.f11914f, c2, this.f11915g);
                    this.f11913e = 0;
                    return true;
                } else if (a3 == 2) {
                    long j = this.f11915g;
                    if (j <= 8) {
                        this.f11912d.a(this.f11914f, a(iVar, (int) j));
                        this.f11913e = 0;
                        return true;
                    }
                    throw ai.b("Invalid integer size: " + this.f11915g, (Throwable) null);
                } else if (a3 == 3) {
                    long j2 = this.f11915g;
                    if (j2 <= 2147483647L) {
                        this.f11912d.a(this.f11914f, c(iVar, (int) j2));
                        this.f11913e = 0;
                        return true;
                    }
                    throw ai.b("String element size: " + this.f11915g, (Throwable) null);
                } else if (a3 == 4) {
                    this.f11912d.a(this.f11914f, (int) this.f11915g, iVar);
                    this.f11913e = 0;
                    return true;
                } else if (a3 == 5) {
                    long j3 = this.f11915g;
                    if (j3 == 4 || j3 == 8) {
                        this.f11912d.a(this.f11914f, b(iVar, (int) this.f11915g));
                        this.f11913e = 0;
                        return true;
                    }
                    throw ai.b("Invalid float size: " + this.f11915g, (Throwable) null);
                } else {
                    throw ai.b("Invalid element type " + a3, (Throwable) null);
                }
            } else {
                this.f11912d.c(this.f11910b.pop().f11916a);
                return true;
            }
        }
    }
}
