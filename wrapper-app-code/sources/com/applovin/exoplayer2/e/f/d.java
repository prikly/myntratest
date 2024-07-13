package com.applovin.exoplayer2.e.f;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.s;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.e.g;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.EOFException;
import java.io.IOException;

public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final l f11962a = $$Lambda$d$M00HXtLQ4mGUqsI0jBaBwLQNDFI.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private static final g.a f11963b = $$Lambda$d$PsVn2vj1IEaDQ66FqrWGI__HiT8.INSTANCE;

    /* renamed from: c  reason: collision with root package name */
    private final int f11964c;

    /* renamed from: d  reason: collision with root package name */
    private final long f11965d;

    /* renamed from: e  reason: collision with root package name */
    private final y f11966e;

    /* renamed from: f  reason: collision with root package name */
    private final r.a f11967f;

    /* renamed from: g  reason: collision with root package name */
    private final com.applovin.exoplayer2.e.r f11968g;

    /* renamed from: h  reason: collision with root package name */
    private final s f11969h;
    private final x i;
    private j j;
    private x k;
    private x l;
    private int m;
    private a n;
    private long o;
    private long p;
    private long q;
    private int r;
    private e s;
    private boolean t;
    private boolean u;
    private long v;

    public d() {
        this(0);
    }

    public d(int i2) {
        this(i2, -9223372036854775807L);
    }

    public d(int i2, long j2) {
        this.f11964c = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.f11965d = j2;
        this.f11966e = new y(10);
        this.f11967f = new r.a();
        this.f11968g = new com.applovin.exoplayer2.e.r();
        this.o = -9223372036854775807L;
        this.f11969h = new s();
        com.applovin.exoplayer2.e.g gVar = new com.applovin.exoplayer2.e.g();
        this.i = gVar;
        this.l = gVar;
    }

    private static int a(y yVar, int i2) {
        if (yVar.b() >= i2 + 4) {
            yVar.d(i2);
            int q2 = yVar.q();
            if (q2 == 1483304551 || q2 == 1231971951) {
                return q2;
            }
        }
        if (yVar.b() < 40) {
            return 0;
        }
        yVar.d(36);
        return yVar.q() == 1447187017 ? 1447187017 : 0;
    }

    private long a(long j2) {
        return this.o + ((j2 * 1000000) / ((long) this.f11967f.f11330d));
    }

    private static long a(a aVar) {
        if (aVar == null) {
            return -9223372036854775807L;
        }
        int a2 = aVar.a();
        for (int i2 = 0; i2 < a2; i2++) {
            a.C0122a a3 = aVar.a(i2);
            if (a3 instanceof com.applovin.exoplayer2.g.e.l) {
                com.applovin.exoplayer2.g.e.l lVar = (com.applovin.exoplayer2.g.e.l) a3;
                if (lVar.f12643f.equals("TLEN")) {
                    return com.applovin.exoplayer2.h.b(Long.parseLong(lVar.f12655b));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static c a(a aVar, long j2) {
        if (aVar == null) {
            return null;
        }
        int a2 = aVar.a();
        for (int i2 = 0; i2 < a2; i2++) {
            a.C0122a a3 = aVar.a(i2);
            if (a3 instanceof com.applovin.exoplayer2.g.e.j) {
                return c.a(j2, (com.applovin.exoplayer2.g.e.j) a3, a(aVar));
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(int i2, int i3, int i4, int i5, int i6) {
        return (i3 == 67 && i4 == 79 && i5 == 77 && (i6 == 77 || i2 == 2)) || (i3 == 77 && i4 == 76 && i5 == 76 && (i6 == 84 || i2 == 2));
    }

    private static boolean a(int i2, long j2) {
        return ((long) (i2 & -128000)) == (j2 & -128000);
    }

    private boolean a(i iVar, boolean z) throws IOException {
        int i2;
        int i3;
        int a2;
        int i4 = z ? 32768 : 131072;
        iVar.a();
        if (iVar.c() == 0) {
            a a3 = this.f11969h.a(iVar, (this.f11964c & 8) == 0 ? null : f11963b);
            this.n = a3;
            if (a3 != null) {
                this.f11968g.a(a3);
            }
            i2 = (int) iVar.b();
            if (!z) {
                iVar.b(i2);
            }
            i3 = 0;
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (!d(iVar)) {
                this.f11966e.d(0);
                int q2 = this.f11966e.q();
                if ((i3 == 0 || a(q2, (long) i3)) && (a2 = r.a(q2)) != -1) {
                    i5++;
                    if (i5 != 1) {
                        if (i5 == 4) {
                            break;
                        }
                    } else {
                        this.f11967f.a(q2);
                        i3 = q2;
                    }
                    iVar.c(a2 - 4);
                } else {
                    int i7 = i6 + 1;
                    if (i6 != i4) {
                        if (z) {
                            iVar.a();
                            iVar.c(i2 + i7);
                        } else {
                            iVar.b(1);
                        }
                        i6 = i7;
                        i3 = 0;
                        i5 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw ai.b("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i5 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            iVar.b(i2 + i6);
        } else {
            iVar.a();
        }
        this.m = i3;
        return true;
    }

    private int b(i iVar) throws IOException {
        if (this.m == 0) {
            try {
                a(iVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.s == null) {
            e e2 = e(iVar);
            this.s = e2;
            this.j.a(e2);
            this.l.a(new v.a().f(this.f11967f.f11328b).f(4096).k(this.f11967f.f11331e).l(this.f11967f.f11330d).n(this.f11968g.f12444a).o(this.f11968g.f12445b).a((this.f11964c & 8) != 0 ? null : this.n).a());
            this.q = iVar.c();
        } else if (this.q != 0) {
            long c2 = iVar.c();
            long j2 = this.q;
            if (c2 < j2) {
                iVar.b((int) (j2 - c2));
            }
        }
        return c(iVar);
    }

    private e b(i iVar, boolean z) throws IOException {
        iVar.d(this.f11966e.d(), 0, 4);
        this.f11966e.d(0);
        this.f11967f.a(this.f11966e.q());
        return new a(iVar.d(), iVar.c(), this.f11967f, z);
    }

    private void b() {
        com.applovin.exoplayer2.l.a.a(this.k);
        com.applovin.exoplayer2.l.ai.a(this.j);
    }

    private int c(i iVar) throws IOException {
        if (this.r == 0) {
            iVar.a();
            if (d(iVar)) {
                return -1;
            }
            this.f11966e.d(0);
            int q2 = this.f11966e.q();
            if (!a(q2, (long) this.m) || r.a(q2) == -1) {
                iVar.b(1);
                this.m = 0;
                return 0;
            }
            this.f11967f.a(q2);
            if (this.o == -9223372036854775807L) {
                this.o = this.s.c(iVar.c());
                if (this.f11965d != -9223372036854775807L) {
                    this.o += this.f11965d - this.s.c(0);
                }
            }
            this.r = this.f11967f.f11329c;
            e eVar = this.s;
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                bVar.a(a(this.p + ((long) this.f11967f.f11333g)), iVar.c() + ((long) this.f11967f.f11329c));
                if (this.u && bVar.b(this.v)) {
                    this.u = false;
                    this.l = this.k;
                }
            }
        }
        int a2 = this.l.a((com.applovin.exoplayer2.k.g) iVar, this.r, true);
        if (a2 == -1) {
            return -1;
        }
        int i2 = this.r - a2;
        this.r = i2;
        if (i2 > 0) {
            return 0;
        }
        this.l.a(a(this.p), 1, this.f11967f.f11329c, 0, (x.a) null);
        this.p += (long) this.f11967f.f11333g;
        this.r = 0;
        return 0;
    }

    private boolean d(i iVar) throws IOException {
        e eVar = this.s;
        if (eVar != null) {
            long c2 = eVar.c();
            if (c2 != -1 && iVar.b() > c2 - 4) {
                return true;
            }
        }
        try {
            return !iVar.b(this.f11966e.d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ h[] d() {
        return new h[]{new d()};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.applovin.exoplayer2.e.f.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.applovin.exoplayer2.e.f.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.applovin.exoplayer2.e.f.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.applovin.exoplayer2.e.f.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.applovin.exoplayer2.e.f.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.applovin.exoplayer2.e.f.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.applovin.exoplayer2.e.f.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r0 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.exoplayer2.e.f.e e(com.applovin.exoplayer2.e.i r12) throws java.io.IOException {
        /*
            r11 = this;
            com.applovin.exoplayer2.e.f.e r0 = r11.f(r12)
            com.applovin.exoplayer2.g.a r1 = r11.n
            long r2 = r12.c()
            com.applovin.exoplayer2.e.f.c r1 = a((com.applovin.exoplayer2.g.a) r1, (long) r2)
            boolean r2 = r11.t
            if (r2 == 0) goto L_0x0018
            com.applovin.exoplayer2.e.f.e$a r12 = new com.applovin.exoplayer2.e.f.e$a
            r12.<init>()
            return r12
        L_0x0018:
            r2 = 0
            int r3 = r11.f11964c
            r3 = r3 & 4
            if (r3 == 0) goto L_0x004c
            r2 = -1
            if (r1 == 0) goto L_0x002e
            long r2 = r1.b()
            long r0 = r1.c()
        L_0x002b:
            r9 = r0
            r5 = r2
            goto L_0x0041
        L_0x002e:
            if (r0 == 0) goto L_0x0039
            long r2 = r0.b()
            long r0 = r0.c()
            goto L_0x002b
        L_0x0039:
            com.applovin.exoplayer2.g.a r0 = r11.n
            long r0 = a((com.applovin.exoplayer2.g.a) r0)
            r5 = r0
            r9 = r2
        L_0x0041:
            com.applovin.exoplayer2.e.f.b r0 = new com.applovin.exoplayer2.e.f.b
            long r7 = r12.c()
            r4 = r0
            r4.<init>(r5, r7, r9)
            goto L_0x0054
        L_0x004c:
            if (r1 == 0) goto L_0x0050
            r0 = r1
            goto L_0x0054
        L_0x0050:
            if (r0 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            r1 = 1
            if (r0 == 0) goto L_0x0062
            boolean r2 = r0.a()
            if (r2 != 0) goto L_0x006e
            int r2 = r11.f11964c
            r2 = r2 & r1
            if (r2 == 0) goto L_0x006e
        L_0x0062:
            int r0 = r11.f11964c
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            com.applovin.exoplayer2.e.f.e r0 = r11.b(r12, r1)
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.f.d.e(com.applovin.exoplayer2.e.i):com.applovin.exoplayer2.e.f.e");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.exoplayer2.e.f.e f(com.applovin.exoplayer2.e.i r11) throws java.io.IOException {
        /*
            r10 = this;
            com.applovin.exoplayer2.l.y r5 = new com.applovin.exoplayer2.l.y
            com.applovin.exoplayer2.b.r$a r0 = r10.f11967f
            int r0 = r0.f11329c
            r5.<init>((int) r0)
            byte[] r0 = r5.d()
            com.applovin.exoplayer2.b.r$a r1 = r10.f11967f
            int r1 = r1.f11329c
            r6 = 0
            r11.d(r0, r6, r1)
            com.applovin.exoplayer2.b.r$a r0 = r10.f11967f
            int r0 = r0.f11327a
            r1 = 1
            r0 = r0 & r1
            r2 = 21
            if (r0 == 0) goto L_0x002a
            com.applovin.exoplayer2.b.r$a r0 = r10.f11967f
            int r0 = r0.f11331e
            if (r0 == r1) goto L_0x0030
            r2 = 36
            r7 = 36
            goto L_0x0037
        L_0x002a:
            com.applovin.exoplayer2.b.r$a r0 = r10.f11967f
            int r0 = r0.f11331e
            if (r0 == r1) goto L_0x0033
        L_0x0030:
            r7 = 21
            goto L_0x0037
        L_0x0033:
            r2 = 13
            r7 = 13
        L_0x0037:
            int r8 = a((com.applovin.exoplayer2.l.y) r5, (int) r7)
            r0 = 1483304551(0x58696e67, float:1.02664153E15)
            r9 = 1231971951(0x496e666f, float:976486.94)
            if (r8 == r0) goto L_0x0066
            if (r8 != r9) goto L_0x0046
            goto L_0x0066
        L_0x0046:
            r0 = 1447187017(0x56425249, float:5.3414667E13)
            if (r8 != r0) goto L_0x0061
            long r0 = r11.d()
            long r2 = r11.c()
            com.applovin.exoplayer2.b.r$a r4 = r10.f11967f
            com.applovin.exoplayer2.e.f.f r0 = com.applovin.exoplayer2.e.f.f.a(r0, r2, r4, r5)
            com.applovin.exoplayer2.b.r$a r1 = r10.f11967f
            int r1 = r1.f11329c
            r11.b(r1)
            goto L_0x00b6
        L_0x0061:
            r0 = 0
            r11.a()
            goto L_0x00b6
        L_0x0066:
            long r0 = r11.d()
            long r2 = r11.c()
            com.applovin.exoplayer2.b.r$a r4 = r10.f11967f
            com.applovin.exoplayer2.e.f.g r0 = com.applovin.exoplayer2.e.f.g.a(r0, r2, r4, r5)
            if (r0 == 0) goto L_0x00a0
            com.applovin.exoplayer2.e.r r1 = r10.f11968g
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x00a0
            r11.a()
            int r7 = r7 + 141
            r11.c(r7)
            com.applovin.exoplayer2.l.y r1 = r10.f11966e
            byte[] r1 = r1.d()
            r2 = 3
            r11.d(r1, r6, r2)
            com.applovin.exoplayer2.l.y r1 = r10.f11966e
            r1.d(r6)
            com.applovin.exoplayer2.e.r r1 = r10.f11968g
            com.applovin.exoplayer2.l.y r2 = r10.f11966e
            int r2 = r2.m()
            r1.a((int) r2)
        L_0x00a0:
            com.applovin.exoplayer2.b.r$a r1 = r10.f11967f
            int r1 = r1.f11329c
            r11.b(r1)
            if (r0 == 0) goto L_0x00b6
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x00b6
            if (r8 != r9) goto L_0x00b6
            com.applovin.exoplayer2.e.f.e r11 = r10.b(r11, r6)
            return r11
        L_0x00b6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.f.d.f(com.applovin.exoplayer2.e.i):com.applovin.exoplayer2.e.f.e");
    }

    public int a(i iVar, u uVar) throws IOException {
        b();
        int b2 = b(iVar);
        if (b2 == -1 && (this.s instanceof b)) {
            long a2 = a(this.p);
            if (this.s.b() != a2) {
                ((b) this.s).d(a2);
                this.j.a(this.s);
            }
        }
        return b2;
    }

    public void a() {
        this.t = true;
    }

    public void a(long j2, long j3) {
        this.m = 0;
        this.o = -9223372036854775807L;
        this.p = 0;
        this.r = 0;
        this.v = j3;
        e eVar = this.s;
        if ((eVar instanceof b) && !((b) eVar).b(j3)) {
            this.u = true;
            this.l = this.i;
        }
    }

    public void a(j jVar) {
        this.j = jVar;
        x a2 = jVar.a(0, 1);
        this.k = a2;
        this.l = a2;
        this.j.a();
    }

    public boolean a(i iVar) throws IOException {
        return a(iVar, true);
    }

    public void c() {
    }
}
