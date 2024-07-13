package com.applovin.exoplayer2.d;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.applovin.exoplayer2.common.a.aq;
import com.applovin.exoplayer2.common.a.ax;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.common.a.w;
import com.applovin.exoplayer2.d.b;
import com.applovin.exoplayer2.d.c;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.d.h;
import com.applovin.exoplayer2.d.m;
import com.applovin.exoplayer2.h;
import com.applovin.exoplayer2.k.r;
import com.applovin.exoplayer2.k.v;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.u;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class c implements h {

    /* renamed from: a  reason: collision with root package name */
    volatile C0111c f11725a;

    /* renamed from: d  reason: collision with root package name */
    private final UUID f11726d;

    /* renamed from: e  reason: collision with root package name */
    private final m.c f11727e;

    /* renamed from: f  reason: collision with root package name */
    private final r f11728f;

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f11729g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f11730h;
    private final int[] i;
    private final boolean j;
    /* access modifiers changed from: private */
    public final f k;
    private final v l;
    private final g m;
    /* access modifiers changed from: private */
    public final long n;
    /* access modifiers changed from: private */
    public final List<b> o;
    /* access modifiers changed from: private */
    public final Set<e> p;
    /* access modifiers changed from: private */
    public final Set<b> q;
    /* access modifiers changed from: private */
    public int r;
    private m s;
    /* access modifiers changed from: private */
    public b t;
    /* access modifiers changed from: private */
    public b u;
    /* access modifiers changed from: private */
    public Looper v;
    /* access modifiers changed from: private */
    public Handler w;
    private int x;
    private byte[] y;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<String, String> f11731a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        private UUID f11732b = h.f12715d;

        /* renamed from: c  reason: collision with root package name */
        private m.c f11733c = o.f11782a;

        /* renamed from: d  reason: collision with root package name */
        private boolean f11734d;

        /* renamed from: e  reason: collision with root package name */
        private int[] f11735e = new int[0];

        /* renamed from: f  reason: collision with root package name */
        private boolean f11736f;

        /* renamed from: g  reason: collision with root package name */
        private v f11737g = new r();

        /* renamed from: h  reason: collision with root package name */
        private long f11738h = 300000;

        public a a(UUID uuid, m.c cVar) {
            this.f11732b = (UUID) com.applovin.exoplayer2.l.a.b(uuid);
            this.f11733c = (m.c) com.applovin.exoplayer2.l.a.b(cVar);
            return this;
        }

        public a a(boolean z) {
            this.f11734d = z;
            return this;
        }

        public a a(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (!(i == 2 || i == 1)) {
                    z = false;
                }
                com.applovin.exoplayer2.l.a.a(z);
            }
            this.f11735e = (int[]) iArr.clone();
            return this;
        }

        public c a(r rVar) {
            return new c(this.f11732b, this.f11733c, rVar, this.f11731a, this.f11734d, this.f11735e, this.f11736f, this.f11737g, this.f11738h);
        }

        public a b(boolean z) {
            this.f11736f = z;
            return this;
        }
    }

    private class b implements m.b {
        private b() {
        }

        public void a(m mVar, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((C0111c) com.applovin.exoplayer2.l.a.b(c.this.f11725a)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    /* renamed from: com.applovin.exoplayer2.d.c$c  reason: collision with other inner class name */
    private class C0111c extends Handler {
        public C0111c(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (b bVar : c.this.o) {
                    if (bVar.a(bArr)) {
                        bVar.a(message.what);
                        return;
                    }
                }
            }
        }
    }

    public static final class d extends Exception {
        private d(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    private class e implements h.a {

        /* renamed from: c  reason: collision with root package name */
        private final g.a f11742c;

        /* renamed from: d  reason: collision with root package name */
        private f f11743d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f11744e;

        public e(g.a aVar) {
            this.f11742c = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a() {
            if (!this.f11744e) {
                f fVar = this.f11743d;
                if (fVar != null) {
                    fVar.b(this.f11742c);
                }
                c.this.p.remove(this);
                this.f11744e = true;
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(com.applovin.exoplayer2.v vVar) {
            if (c.this.r != 0 && !this.f11744e) {
                c cVar = c.this;
                this.f11743d = cVar.a((Looper) com.applovin.exoplayer2.l.a.b(cVar.v), this.f11742c, vVar, false);
                c.this.p.add(this);
            }
        }

        public void a(com.applovin.exoplayer2.v vVar) {
            ((Handler) com.applovin.exoplayer2.l.a.b(c.this.w)).post(new Runnable(vVar) {
                public final /* synthetic */ com.applovin.exoplayer2.v f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    c.e.this.b(this.f$1);
                }
            });
        }

        public void release() {
            ai.a((Handler) com.applovin.exoplayer2.l.a.b(c.this.w), (Runnable) new Runnable() {
                public final void run() {
                    c.e.this.a();
                }
            });
        }
    }

    private class f implements b.a {

        /* renamed from: b  reason: collision with root package name */
        private final Set<b> f11746b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private b f11747c;

        public f() {
        }

        public void a() {
            this.f11747c = null;
            s<b> a2 = s.a(this.f11746b);
            this.f11746b.clear();
            ax<b> a3 = a2.iterator();
            while (a3.hasNext()) {
                a3.next().b();
            }
        }

        public void a(b bVar) {
            this.f11746b.add(bVar);
            if (this.f11747c == null) {
                this.f11747c = bVar;
                bVar.a();
            }
        }

        public void a(Exception exc, boolean z) {
            this.f11747c = null;
            s<b> a2 = s.a(this.f11746b);
            this.f11746b.clear();
            ax<b> a3 = a2.iterator();
            while (a3.hasNext()) {
                a3.next().a(exc, z);
            }
        }

        public void b(b bVar) {
            this.f11746b.remove(bVar);
            if (this.f11747c == bVar) {
                this.f11747c = null;
                if (!this.f11746b.isEmpty()) {
                    b next = this.f11746b.iterator().next();
                    this.f11747c = next;
                    next.a();
                }
            }
        }
    }

    private class g implements b.C0110b {
        private g() {
        }

        public void a(b bVar, int i) {
            if (c.this.n != -9223372036854775807L) {
                c.this.q.remove(bVar);
                ((Handler) com.applovin.exoplayer2.l.a.b(c.this.w)).removeCallbacksAndMessages(bVar);
            }
        }

        public void b(b bVar, int i) {
            if (i == 1 && c.this.r > 0 && c.this.n != -9223372036854775807L) {
                c.this.q.add(bVar);
                ((Handler) com.applovin.exoplayer2.l.a.b(c.this.w)).postAtTime(new Runnable() {
                    public final void run() {
                        b.this.b((g.a) null);
                    }
                }, bVar, SystemClock.uptimeMillis() + c.this.n);
            } else if (i == 0) {
                c.this.o.remove(bVar);
                if (c.this.t == bVar) {
                    b unused = c.this.t = null;
                }
                if (c.this.u == bVar) {
                    b unused2 = c.this.u = null;
                }
                c.this.k.b(bVar);
                if (c.this.n != -9223372036854775807L) {
                    ((Handler) com.applovin.exoplayer2.l.a.b(c.this.w)).removeCallbacksAndMessages(bVar);
                    c.this.q.remove(bVar);
                }
            }
            c.this.e();
        }
    }

    private c(UUID uuid, m.c cVar, r rVar, HashMap<String, String> hashMap, boolean z, int[] iArr, boolean z2, v vVar, long j2) {
        com.applovin.exoplayer2.l.a.b(uuid);
        com.applovin.exoplayer2.l.a.a(!com.applovin.exoplayer2.h.f12713b.equals(uuid), (Object) "Use C.CLEARKEY_UUID instead");
        this.f11726d = uuid;
        this.f11727e = cVar;
        this.f11728f = rVar;
        this.f11729g = hashMap;
        this.f11730h = z;
        this.i = iArr;
        this.j = z2;
        this.l = vVar;
        this.k = new f();
        this.m = new g();
        this.x = 0;
        this.o = new ArrayList();
        this.p = aq.b();
        this.q = aq.b();
        this.n = j2;
    }

    private b a(List<e.a> list, boolean z, g.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.s);
        List<e.a> list2 = list;
        b bVar = new b(this.f11726d, this.s, this.k, this.m, list2, this.x, this.j | z, z, this.y, this.f11729g, this.f11728f, (Looper) com.applovin.exoplayer2.l.a.b(this.v), this.l);
        bVar.a(aVar);
        if (this.n != -9223372036854775807L) {
            bVar.a((g.a) null);
        }
        return bVar;
    }

    private b a(List<e.a> list, boolean z, g.a aVar, boolean z2) {
        b a2 = a(list, z, aVar);
        if (a((f) a2) && !this.q.isEmpty()) {
            c();
            a((f) a2, aVar);
            a2 = a(list, z, aVar);
        }
        if (!a((f) a2) || !z2 || this.p.isEmpty()) {
            return a2;
        }
        d();
        if (!this.q.isEmpty()) {
            c();
        }
        a((f) a2, aVar);
        return a(list, z, aVar);
    }

    private f a(int i2, boolean z) {
        m mVar = (m) com.applovin.exoplayer2.l.a.b(this.s);
        if ((mVar.d() == 2 && n.f11778a) || ai.a(this.i, i2) == -1 || mVar.d() == 1) {
            return null;
        }
        b bVar = this.t;
        if (bVar == null) {
            b a2 = a((List<e.a>) s.g(), true, (g.a) null, z);
            this.o.add(a2);
            this.t = a2;
        } else {
            bVar.a((g.a) null);
        }
        return this.t;
    }

    /* access modifiers changed from: private */
    public f a(Looper looper, g.a aVar, com.applovin.exoplayer2.v vVar, boolean z) {
        List<e.a> list;
        b(looper);
        if (vVar.o == null) {
            return a(u.e(vVar.l), z);
        }
        b bVar = null;
        if (this.y == null) {
            list = a((e) com.applovin.exoplayer2.l.a.b(vVar.o), this.f11726d, false);
            if (list.isEmpty()) {
                d dVar = new d(this.f11726d);
                q.c("DefaultDrmSessionMgr", "DRM error", dVar);
                if (aVar != null) {
                    aVar.a((Exception) dVar);
                }
                return new l(new f.a(dVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            list = null;
        }
        if (this.f11730h) {
            Iterator<b> it = this.o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b next = it.next();
                if (ai.a((Object) next.f11709a, (Object) list)) {
                    bVar = next;
                    break;
                }
            }
        } else {
            bVar = this.u;
        }
        if (bVar == null) {
            bVar = a(list, false, aVar, z);
            if (!this.f11730h) {
                this.u = bVar;
            }
            this.o.add(bVar);
        } else {
            bVar.a(aVar);
        }
        return bVar;
    }

    private static List<e.a> a(e eVar, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(eVar.f11755b);
        for (int i2 = 0; i2 < eVar.f11755b; i2++) {
            e.a a2 = eVar.a(i2);
            if ((a2.a(uuid) || (com.applovin.exoplayer2.h.f12714c.equals(uuid) && a2.a(com.applovin.exoplayer2.h.f12713b))) && (a2.f11761d != null || z)) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    private synchronized void a(Looper looper) {
        if (this.v == null) {
            this.v = looper;
            this.w = new Handler(looper);
        } else {
            com.applovin.exoplayer2.l.a.b(this.v == looper);
            com.applovin.exoplayer2.l.a.b(this.w);
        }
    }

    private void a(f fVar, g.a aVar) {
        fVar.b(aVar);
        if (this.n != -9223372036854775807L) {
            fVar.b((g.a) null);
        }
    }

    private boolean a(e eVar) {
        if (this.y != null) {
            return true;
        }
        if (a(eVar, this.f11726d, true).isEmpty()) {
            if (eVar.f11755b != 1 || !eVar.a(0).a(com.applovin.exoplayer2.h.f12713b)) {
                return false;
            }
            q.c("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f11726d);
        }
        String str = eVar.f11754a;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? ai.f13525a >= 25 : !"cbc1".equals(str) && !"cens".equals(str);
    }

    private static boolean a(f fVar) {
        return fVar.c() == 1 && (ai.f13525a < 19 || (((f.a) com.applovin.exoplayer2.l.a.b(fVar.e())).getCause() instanceof ResourceBusyException));
    }

    private void b(Looper looper) {
        if (this.f11725a == null) {
            this.f11725a = new C0111c(looper);
        }
    }

    private void c() {
        ax<b> a2 = w.a(this.q).iterator();
        while (a2.hasNext()) {
            a2.next().b((g.a) null);
        }
    }

    private void d() {
        ax<e> a2 = w.a(this.p).iterator();
        while (a2.hasNext()) {
            a2.next().release();
        }
    }

    /* access modifiers changed from: private */
    public void e() {
        if (this.s != null && this.r == 0 && this.o.isEmpty() && this.p.isEmpty()) {
            ((m) com.applovin.exoplayer2.l.a.b(this.s)).c();
            this.s = null;
        }
    }

    public int a(com.applovin.exoplayer2.v vVar) {
        int d2 = ((m) com.applovin.exoplayer2.l.a.b(this.s)).d();
        if (vVar.o == null) {
            if (ai.a(this.i, u.e(vVar.l)) != -1) {
                return d2;
            }
            return 0;
        } else if (a(vVar.o)) {
            return d2;
        } else {
            return 1;
        }
    }

    public h.a a(Looper looper, g.a aVar, com.applovin.exoplayer2.v vVar) {
        com.applovin.exoplayer2.l.a.b(this.r > 0);
        a(looper);
        e eVar = new e(aVar);
        eVar.a(vVar);
        return eVar;
    }

    public final void a() {
        int i2 = this.r;
        this.r = i2 + 1;
        if (i2 == 0) {
            if (this.s == null) {
                m acquireExoMediaDrm = this.f11727e.acquireExoMediaDrm(this.f11726d);
                this.s = acquireExoMediaDrm;
                acquireExoMediaDrm.a((m.b) new b());
            } else if (this.n != -9223372036854775807L) {
                for (int i3 = 0; i3 < this.o.size(); i3++) {
                    this.o.get(i3).a((g.a) null);
                }
            }
        }
    }

    public void a(int i2, byte[] bArr) {
        com.applovin.exoplayer2.l.a.b(this.o.isEmpty());
        if (i2 == 1 || i2 == 3) {
            com.applovin.exoplayer2.l.a.b(bArr);
        }
        this.x = i2;
        this.y = bArr;
    }

    public f b(Looper looper, g.a aVar, com.applovin.exoplayer2.v vVar) {
        com.applovin.exoplayer2.l.a.b(this.r > 0);
        a(looper);
        return a(looper, aVar, vVar, true);
    }

    public final void b() {
        int i2 = this.r - 1;
        this.r = i2;
        if (i2 == 0) {
            if (this.n != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.o);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((b) arrayList.get(i3)).b((g.a) null);
                }
            }
            d();
            e();
        }
    }
}
