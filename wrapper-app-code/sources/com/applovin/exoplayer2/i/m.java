package com.applovin.exoplayer2.i;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.c.g;
import com.applovin.exoplayer2.e;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import java.util.Collections;
import java.util.List;

public final class m extends e implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f13203a;

    /* renamed from: b  reason: collision with root package name */
    private final l f13204b;

    /* renamed from: c  reason: collision with root package name */
    private final i f13205c;

    /* renamed from: d  reason: collision with root package name */
    private final w f13206d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13207e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13208f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13209g;

    /* renamed from: h  reason: collision with root package name */
    private int f13210h;
    private v i;
    private g j;
    private j k;
    private k l;
    private k m;
    private int n;
    private long o;

    public m(l lVar, Looper looper) {
        this(lVar, looper, i.f13155a);
    }

    public m(l lVar, Looper looper, i iVar) {
        super(3);
        this.f13204b = (l) a.b(lVar);
        this.f13203a = looper == null ? null : ai.a(looper, (Handler.Callback) this);
        this.f13205c = iVar;
        this.f13206d = new w();
        this.o = -9223372036854775807L;
    }

    private void B() {
        this.k = null;
        this.n = -1;
        k kVar = this.l;
        if (kVar != null) {
            kVar.f();
            this.l = null;
        }
        k kVar2 = this.m;
        if (kVar2 != null) {
            kVar2.f();
            this.m = null;
        }
    }

    private void C() {
        B();
        ((g) a.b(this.j)).d();
        this.j = null;
        this.f13210h = 0;
    }

    private void D() {
        this.f13209g = true;
        this.j = this.f13205c.b((v) a.b(this.i));
    }

    private void E() {
        C();
        D();
    }

    private long F() {
        if (this.n == -1) {
            return Long.MAX_VALUE;
        }
        a.b(this.l);
        if (this.n >= this.l.f_()) {
            return Long.MAX_VALUE;
        }
        return this.l.a(this.n);
    }

    private void G() {
        a((List<a>) Collections.emptyList());
    }

    private void a(h hVar) {
        q.c("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.i, hVar);
        G();
        E();
    }

    private void a(List<a> list) {
        Handler handler = this.f13203a;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            b(list);
        }
    }

    private void b(List<a> list) {
        this.f13204b.a(list);
    }

    public boolean A() {
        return this.f13208f;
    }

    public int a(v vVar) {
        if (this.f13205c.a(vVar)) {
            return as.CC.b(vVar.E == 0 ? 4 : 2);
        }
        return as.CC.b(u.c(vVar.l) ? 1 : 0);
    }

    public void a(long j2, long j3) {
        boolean z;
        if (j()) {
            long j4 = this.o;
            if (j4 != -9223372036854775807L && j2 >= j4) {
                B();
                this.f13208f = true;
            }
        }
        if (!this.f13208f) {
            if (this.m == null) {
                ((g) a.b(this.j)).a(j2);
                try {
                    this.m = (k) ((g) a.b(this.j)).b();
                } catch (h e2) {
                    a(e2);
                    return;
                }
            }
            if (d_() == 2) {
                if (this.l != null) {
                    long F = F();
                    z = false;
                    while (F <= j2) {
                        this.n++;
                        F = F();
                        z = true;
                    }
                } else {
                    z = false;
                }
                k kVar = this.m;
                if (kVar != null) {
                    if (kVar.c()) {
                        if (!z && F() == Long.MAX_VALUE) {
                            if (this.f13210h == 2) {
                                E();
                            } else {
                                B();
                                this.f13208f = true;
                            }
                        }
                    } else if (kVar.f11432a <= j2) {
                        k kVar2 = this.l;
                        if (kVar2 != null) {
                            kVar2.f();
                        }
                        this.n = kVar.a(j2);
                        this.l = kVar;
                        this.m = null;
                        z = true;
                    }
                }
                if (z) {
                    a.b(this.l);
                    a(this.l.b(j2));
                }
                if (this.f13210h != 2) {
                    while (!this.f13207e) {
                        try {
                            j jVar = this.k;
                            if (jVar == null) {
                                jVar = (j) ((g) a.b(this.j)).a();
                                if (jVar != null) {
                                    this.k = jVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.f13210h == 1) {
                                jVar.a_(4);
                                ((g) a.b(this.j)).a(jVar);
                                this.k = null;
                                this.f13210h = 2;
                                return;
                            }
                            int a2 = a(this.f13206d, (g) jVar, 0);
                            if (a2 == -4) {
                                if (jVar.c()) {
                                    this.f13207e = true;
                                    this.f13209g = false;
                                } else {
                                    v vVar = this.f13206d.f13939b;
                                    if (vVar != null) {
                                        jVar.f13200f = vVar.p;
                                        jVar.h();
                                        this.f13209g &= !jVar.d();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.f13209g) {
                                    ((g) a.b(this.j)).a(jVar);
                                    this.k = null;
                                }
                            } else if (a2 == -3) {
                                return;
                            }
                        } catch (h e3) {
                            a(e3);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(long j2, boolean z) {
        G();
        this.f13207e = false;
        this.f13208f = false;
        this.o = -9223372036854775807L;
        if (this.f13210h != 0) {
            E();
            return;
        }
        B();
        ((g) a.b(this.j)).c();
    }

    /* access modifiers changed from: protected */
    public void a(v[] vVarArr, long j2, long j3) {
        this.i = vVarArr[0];
        if (this.j != null) {
            this.f13210h = 1;
        } else {
            D();
        }
    }

    public void c(long j2) {
        a.b(j());
        this.o = j2;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public void r() {
        this.i = null;
        this.o = -9223372036854775807L;
        G();
        C();
    }

    public String y() {
        return "TextRenderer";
    }

    public boolean z() {
        return true;
    }
}
