package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class ac implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final l f12162a = $$Lambda$ac$HmjoHnpD5QxxORvHZild8fFPM.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f12163b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12164c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List<ag> f12165d;

    /* renamed from: e  reason: collision with root package name */
    private final y f12166e;

    /* renamed from: f  reason: collision with root package name */
    private final SparseIntArray f12167f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final ad.c f12168g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final SparseArray<ad> f12169h;
    /* access modifiers changed from: private */
    public final SparseBooleanArray i;
    /* access modifiers changed from: private */
    public final SparseBooleanArray j;
    private final ab k;
    private aa l;
    /* access modifiers changed from: private */
    public j m;
    /* access modifiers changed from: private */
    public int n;
    /* access modifiers changed from: private */
    public boolean o;
    private boolean p;
    private boolean q;
    /* access modifiers changed from: private */
    public ad r;
    private int s;
    /* access modifiers changed from: private */
    public int t;

    private class a implements x {

        /* renamed from: b  reason: collision with root package name */
        private final x f12171b = new x(new byte[4]);

        public a() {
        }

        public void a(ag agVar, j jVar, ad.d dVar) {
        }

        public void a(y yVar) {
            if (yVar.h() == 0 && (yVar.h() & 128) != 0) {
                yVar.e(6);
                int a2 = yVar.a() / 4;
                for (int i = 0; i < a2; i++) {
                    yVar.a(this.f12171b, 4);
                    int c2 = this.f12171b.c(16);
                    this.f12171b.b(3);
                    if (c2 == 0) {
                        this.f12171b.b(13);
                    } else {
                        int c3 = this.f12171b.c(13);
                        if (ac.this.f12169h.get(c3) == null) {
                            ac.this.f12169h.put(c3, new y(new b(c3)));
                            ac.b(ac.this);
                        }
                    }
                }
                if (ac.this.f12163b != 2) {
                    ac.this.f12169h.remove(0);
                }
            }
        }
    }

    private class b implements x {

        /* renamed from: b  reason: collision with root package name */
        private final x f12173b = new x(new byte[5]);

        /* renamed from: c  reason: collision with root package name */
        private final SparseArray<ad> f12174c = new SparseArray<>();

        /* renamed from: d  reason: collision with root package name */
        private final SparseIntArray f12175d = new SparseIntArray();

        /* renamed from: e  reason: collision with root package name */
        private final int f12176e;

        public b(int i) {
            this.f12176e = i;
        }

        private ad.b a(y yVar, int i) {
            int c2 = yVar.c();
            int i2 = i + c2;
            String str = null;
            ArrayList arrayList = null;
            int i3 = -1;
            while (yVar.c() < i2) {
                int h2 = yVar.h();
                int c3 = yVar.c() + yVar.h();
                if (c3 > i2) {
                    break;
                }
                if (h2 == 5) {
                    long o = yVar.o();
                    if (o != 1094921523) {
                        if (o != 1161904947) {
                            if (o != 1094921524) {
                                if (o == 1212503619) {
                                    i3 = 36;
                                }
                                yVar.e(c3 - yVar.c());
                            }
                        }
                        i3 = 135;
                        yVar.e(c3 - yVar.c());
                    }
                    i3 = 129;
                    yVar.e(c3 - yVar.c());
                } else {
                    if (h2 != 106) {
                        if (h2 != 122) {
                            if (h2 == 127) {
                                if (yVar.h() != 21) {
                                }
                            } else if (h2 == 123) {
                                i3 = 138;
                            } else if (h2 == 10) {
                                str = yVar.f(3).trim();
                            } else if (h2 == 89) {
                                arrayList = new ArrayList();
                                while (yVar.c() < c3) {
                                    String trim = yVar.f(3).trim();
                                    int h3 = yVar.h();
                                    byte[] bArr = new byte[4];
                                    yVar.a(bArr, 0, 4);
                                    arrayList.add(new ad.a(trim, h3, bArr));
                                }
                                i3 = 89;
                            } else if (h2 == 111) {
                                i3 = 257;
                            }
                            yVar.e(c3 - yVar.c());
                        }
                        i3 = 135;
                        yVar.e(c3 - yVar.c());
                    }
                    i3 = 129;
                    yVar.e(c3 - yVar.c());
                }
                i3 = 172;
                yVar.e(c3 - yVar.c());
            }
            yVar.d(i2);
            return new ad.b(i3, str, arrayList, Arrays.copyOfRange(yVar.d(), c2, i2));
        }

        public void a(ag agVar, j jVar, ad.d dVar) {
        }

        public void a(y yVar) {
            ag agVar;
            y yVar2 = yVar;
            if (yVar.h() == 2) {
                if (ac.this.f12163b == 1 || ac.this.f12163b == 2 || ac.this.n == 1) {
                    agVar = (ag) ac.this.f12165d.get(0);
                } else {
                    agVar = new ag(((ag) ac.this.f12165d.get(0)).a());
                    ac.this.f12165d.add(agVar);
                }
                if ((yVar.h() & 128) != 0) {
                    yVar2.e(1);
                    int i = yVar.i();
                    int i2 = 3;
                    yVar2.e(3);
                    yVar2.a(this.f12173b, 2);
                    this.f12173b.b(3);
                    int i3 = 13;
                    int unused = ac.this.t = this.f12173b.c(13);
                    yVar2.a(this.f12173b, 2);
                    int i4 = 4;
                    this.f12173b.b(4);
                    yVar2.e(this.f12173b.c(12));
                    if (ac.this.f12163b == 2 && ac.this.r == null) {
                        ad.b bVar = new ad.b(21, (String) null, (List<ad.a>) null, ai.f13530f);
                        ac acVar = ac.this;
                        ad unused2 = acVar.r = acVar.f12168g.a(21, bVar);
                        if (ac.this.r != null) {
                            ac.this.r.a(agVar, ac.this.m, new ad.d(i, 21, 8192));
                        }
                    }
                    this.f12174c.clear();
                    this.f12175d.clear();
                    int a2 = yVar.a();
                    while (a2 > 0) {
                        yVar2.a(this.f12173b, 5);
                        int c2 = this.f12173b.c(8);
                        this.f12173b.b(i2);
                        int c3 = this.f12173b.c(i3);
                        this.f12173b.b(i4);
                        int c4 = this.f12173b.c(12);
                        ad.b a3 = a(yVar2, c4);
                        if (c2 == 6 || c2 == 5) {
                            c2 = a3.f12180a;
                        }
                        a2 -= c4 + 5;
                        int i5 = ac.this.f12163b == 2 ? c2 : c3;
                        if (!ac.this.i.get(i5)) {
                            ad f2 = (ac.this.f12163b == 2 && c2 == 21) ? ac.this.r : ac.this.f12168g.a(c2, a3);
                            if (ac.this.f12163b != 2 || c3 < this.f12175d.get(i5, 8192)) {
                                this.f12175d.put(i5, c3);
                                this.f12174c.put(i5, f2);
                            }
                        }
                        i2 = 3;
                        i4 = 4;
                        i3 = 13;
                    }
                    int size = this.f12175d.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        int keyAt = this.f12175d.keyAt(i6);
                        int valueAt = this.f12175d.valueAt(i6);
                        ac.this.i.put(keyAt, true);
                        ac.this.j.put(valueAt, true);
                        ad valueAt2 = this.f12174c.valueAt(i6);
                        if (valueAt2 != null) {
                            if (valueAt2 != ac.this.r) {
                                valueAt2.a(agVar, ac.this.m, new ad.d(i, keyAt, 8192));
                            }
                            ac.this.f12169h.put(valueAt, valueAt2);
                        }
                    }
                    if (ac.this.f12163b != 2) {
                        ac.this.f12169h.remove(this.f12176e);
                        ac acVar2 = ac.this;
                        int unused3 = acVar2.n = acVar2.f12163b == 1 ? 0 : ac.this.n - 1;
                        if (ac.this.n == 0) {
                            ac.this.m.a();
                        } else {
                            return;
                        }
                    } else if (!ac.this.o) {
                        ac.this.m.a();
                        int unused4 = ac.this.n = 0;
                    } else {
                        return;
                    }
                    boolean unused5 = ac.this.o = true;
                }
            }
        }
    }

    public ac() {
        this(0);
    }

    public ac(int i2) {
        this(1, i2, 112800);
    }

    public ac(int i2, int i3, int i4) {
        this(i2, new ag(0), new g(i3), i4);
    }

    public ac(int i2, ag agVar, ad.c cVar, int i3) {
        this.f12168g = (ad.c) com.applovin.exoplayer2.l.a.b(cVar);
        this.f12164c = i3;
        this.f12163b = i2;
        if (i2 == 1 || i2 == 2) {
            this.f12165d = Collections.singletonList(agVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f12165d = arrayList;
            arrayList.add(agVar);
        }
        this.f12166e = new y(new byte[9400], 0);
        this.i = new SparseBooleanArray();
        this.j = new SparseBooleanArray();
        this.f12169h = new SparseArray<>();
        this.f12167f = new SparseIntArray();
        this.k = new ab(i3);
        this.m = j.f12390a;
        this.t = -1;
        b();
    }

    private int a() throws com.applovin.exoplayer2.ai {
        int c2 = this.f12166e.c();
        int b2 = this.f12166e.b();
        int a2 = ae.a(this.f12166e.d(), c2, b2);
        this.f12166e.d(a2);
        int i2 = a2 + 188;
        if (i2 > b2) {
            int i3 = this.s + (a2 - c2);
            this.s = i3;
            if (this.f12163b == 2 && i3 > 376) {
                throw com.applovin.exoplayer2.ai.b("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
            }
        } else {
            this.s = 0;
        }
        return i2;
    }

    private void a(long j2) {
        v vVar;
        j jVar;
        if (!this.p) {
            this.p = true;
            if (this.k.b() != -9223372036854775807L) {
                aa aaVar = new aa(this.k.c(), this.k.b(), j2, this.t, this.f12164c);
                this.l = aaVar;
                jVar = this.m;
                vVar = aaVar.a();
            } else {
                jVar = this.m;
                vVar = new v.b(this.k.b());
            }
            jVar.a(vVar);
        }
    }

    private boolean a(int i2) {
        return this.f12163b == 2 || this.o || !this.j.get(i2, false);
    }

    static /* synthetic */ int b(ac acVar) {
        int i2 = acVar.n;
        acVar.n = i2 + 1;
        return i2;
    }

    private void b() {
        this.i.clear();
        this.f12169h.clear();
        SparseArray<ad> a2 = this.f12168g.a();
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f12169h.put(a2.keyAt(i2), a2.valueAt(i2));
        }
        this.f12169h.put(0, new y(new a()));
        this.r = null;
    }

    private boolean b(i iVar) throws IOException {
        byte[] d2 = this.f12166e.d();
        if (9400 - this.f12166e.c() < 188) {
            int a2 = this.f12166e.a();
            if (a2 > 0) {
                System.arraycopy(d2, this.f12166e.c(), d2, 0, a2);
            }
            this.f12166e.a(d2, a2);
        }
        while (this.f12166e.a() < 188) {
            int b2 = this.f12166e.b();
            int a3 = iVar.a(d2, b2, 9400 - b2);
            if (a3 == -1) {
                return false;
            }
            this.f12166e.c(b2 + a3);
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ h[] d() {
        return new h[]{new ac()};
    }

    public int a(i iVar, u uVar) throws IOException {
        i iVar2 = iVar;
        u uVar2 = uVar;
        long d2 = iVar.d();
        if (this.o) {
            if (((d2 == -1 || this.f12163b == 2) ? false : true) && !this.k.a()) {
                return this.k.a(iVar2, uVar2, this.t);
            }
            a(d2);
            if (this.q) {
                this.q = false;
                a(0, 0);
                if (iVar.c() != 0) {
                    uVar2.f12451a = 0;
                    return 1;
                }
            }
            aa aaVar = this.l;
            if (aaVar != null && aaVar.b()) {
                return this.l.a(iVar2, uVar2);
            }
        }
        if (!b(iVar)) {
            return -1;
        }
        int a2 = a();
        int b2 = this.f12166e.b();
        if (a2 > b2) {
            return 0;
        }
        int q2 = this.f12166e.q();
        if ((8388608 & q2) == 0) {
            int i2 = ((4194304 & q2) != 0 ? 1 : 0) | 0;
            int i3 = (2096896 & q2) >> 8;
            boolean z = (q2 & 32) != 0;
            ad adVar = (q2 & 16) != 0 ? this.f12169h.get(i3) : null;
            if (adVar != null) {
                if (this.f12163b != 2) {
                    int i4 = q2 & 15;
                    int i5 = this.f12167f.get(i3, i4 - 1);
                    this.f12167f.put(i3, i4);
                    if (i5 != i4) {
                        if (i4 != ((i5 + 1) & 15)) {
                            adVar.a();
                        }
                    }
                }
                if (z) {
                    int h2 = this.f12166e.h();
                    i2 |= (this.f12166e.h() & 64) != 0 ? 2 : 0;
                    this.f12166e.e(h2 - 1);
                }
                boolean z2 = this.o;
                if (a(i3)) {
                    this.f12166e.c(a2);
                    adVar.a(this.f12166e, i2);
                    this.f12166e.c(b2);
                }
                if (this.f12163b != 2 && !z2 && this.o && d2 != -1) {
                    this.q = true;
                }
            }
        }
        this.f12166e.d(a2);
        return 0;
    }

    public void a(long j2, long j3) {
        aa aaVar;
        com.applovin.exoplayer2.l.a.b(this.f12163b != 2);
        int size = this.f12165d.size();
        for (int i2 = 0; i2 < size; i2++) {
            ag agVar = this.f12165d.get(i2);
            boolean z = agVar.c() == -9223372036854775807L;
            if (!z) {
                long a2 = agVar.a();
                z = (a2 == -9223372036854775807L || a2 == 0 || a2 == j3) ? false : true;
            }
            if (z) {
                agVar.a(j3);
            }
        }
        if (!(j3 == 0 || (aaVar = this.l) == null)) {
            aaVar.a(j3);
        }
        this.f12166e.a(0);
        this.f12167f.clear();
        for (int i3 = 0; i3 < this.f12169h.size(); i3++) {
            this.f12169h.valueAt(i3).a();
        }
        this.s = 0;
    }

    public void a(j jVar) {
        this.m = jVar;
    }

    public boolean a(i iVar) throws IOException {
        boolean z;
        byte[] d2 = this.f12166e.d();
        iVar.d(d2, 0, 940);
        for (int i2 = 0; i2 < 188; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    z = true;
                    break;
                } else if (d2[(i3 * 188) + i2] != 71) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
            if (z) {
                iVar.b(i2);
                return true;
            }
        }
        return false;
    }

    public void c() {
    }
}
