package com.applovin.exoplayer2.d;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.d.m;
import com.applovin.exoplayer2.h.j;
import com.applovin.exoplayer2.k.v;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.h;
import com.applovin.exoplayer2.l.i;
import com.applovin.exoplayer2.l.q;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final List<e.a> f11709a;

    /* renamed from: b  reason: collision with root package name */
    final r f11710b;

    /* renamed from: c  reason: collision with root package name */
    final UUID f11711c;

    /* renamed from: d  reason: collision with root package name */
    final e f11712d;

    /* renamed from: e  reason: collision with root package name */
    private final m f11713e;

    /* renamed from: f  reason: collision with root package name */
    private final a f11714f;

    /* renamed from: g  reason: collision with root package name */
    private final C0110b f11715g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11716h;
    private final boolean i;
    private final boolean j;
    private final HashMap<String, String> k;
    private final i<g.a> l;
    /* access modifiers changed from: private */
    public final v m;
    private int n;
    private int o;
    private HandlerThread p;
    private c q;
    private com.applovin.exoplayer2.c.b r;
    private f.a s;
    private byte[] t;
    private byte[] u;
    private m.a v;
    private m.d w;

    public interface a {
        void a();

        void a(b bVar);

        void a(Exception exc, boolean z);
    }

    /* renamed from: com.applovin.exoplayer2.d.b$b  reason: collision with other inner class name */
    public interface C0110b {
        void a(b bVar, int i);

        void b(b bVar, int i);
    }

    private class c extends Handler {

        /* renamed from: b  reason: collision with root package name */
        private boolean f11718b;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, s sVar) {
            s sVar2 = sVar;
            d dVar = (d) message.obj;
            if (!dVar.f11720b) {
                return false;
            }
            dVar.f11723e++;
            if (dVar.f11723e > b.this.m.a(3)) {
                return false;
            }
            long a2 = b.this.m.a(new v.a(new j(dVar.f11719a, sVar2.f11790a, sVar2.f11791b, sVar2.f11792c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f11721c, sVar2.f11793d), new com.applovin.exoplayer2.h.m(3), sVar.getCause() instanceof IOException ? (IOException) sVar.getCause() : new f(sVar.getCause()), dVar.f11723e));
            if (a2 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f11718b) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), a2);
                return true;
            }
        }

        public synchronized void a() {
            removeCallbacksAndMessages((Object) null);
            this.f11718b = true;
        }

        /* access modifiers changed from: package-private */
        public void a(int i, Object obj, boolean z) {
            obtainMessage(i, new d(j.a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.applovin.exoplayer2.d.s} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.applovin.exoplayer2.d.s} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.applovin.exoplayer2.d.s} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Throwable, java.lang.Exception] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r6.obj
                com.applovin.exoplayer2.d.b$d r0 = (com.applovin.exoplayer2.d.b.d) r0
                int r1 = r6.what     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                if (r1 == 0) goto L_0x0022
                r2 = 1
                if (r1 != r2) goto L_0x001c
                com.applovin.exoplayer2.d.b r1 = com.applovin.exoplayer2.d.b.this     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                com.applovin.exoplayer2.d.r r1 = r1.f11710b     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                com.applovin.exoplayer2.d.b r2 = com.applovin.exoplayer2.d.b.this     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                java.util.UUID r2 = r2.f11711c     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                java.lang.Object r3 = r0.f11722d     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                com.applovin.exoplayer2.d.m$a r3 = (com.applovin.exoplayer2.d.m.a) r3     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                byte[] r1 = r1.a((java.util.UUID) r2, (com.applovin.exoplayer2.d.m.a) r3)     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                goto L_0x0044
            L_0x001c:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                r1.<init>()     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                throw r1     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
            L_0x0022:
                com.applovin.exoplayer2.d.b r1 = com.applovin.exoplayer2.d.b.this     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                com.applovin.exoplayer2.d.r r1 = r1.f11710b     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                com.applovin.exoplayer2.d.b r2 = com.applovin.exoplayer2.d.b.this     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                java.util.UUID r2 = r2.f11711c     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                java.lang.Object r3 = r0.f11722d     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                com.applovin.exoplayer2.d.m$d r3 = (com.applovin.exoplayer2.d.m.d) r3     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                byte[] r1 = r1.a((java.util.UUID) r2, (com.applovin.exoplayer2.d.m.d) r3)     // Catch:{ s -> 0x003c, Exception -> 0x0033 }
                goto L_0x0044
            L_0x0033:
                r1 = move-exception
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                com.applovin.exoplayer2.l.q.b(r2, r3, r1)
                goto L_0x0044
            L_0x003c:
                r1 = move-exception
                boolean r2 = r5.a(r6, r1)
                if (r2 == 0) goto L_0x0044
                return
            L_0x0044:
                com.applovin.exoplayer2.d.b r2 = com.applovin.exoplayer2.d.b.this
                com.applovin.exoplayer2.k.v r2 = r2.m
                long r3 = r0.f11719a
                r2.a((long) r3)
                monitor-enter(r5)
                boolean r2 = r5.f11718b     // Catch:{ all -> 0x0069 }
                if (r2 != 0) goto L_0x0067
                com.applovin.exoplayer2.d.b r2 = com.applovin.exoplayer2.d.b.this     // Catch:{ all -> 0x0069 }
                com.applovin.exoplayer2.d.b$e r2 = r2.f11712d     // Catch:{ all -> 0x0069 }
                int r6 = r6.what     // Catch:{ all -> 0x0069 }
                java.lang.Object r0 = r0.f11722d     // Catch:{ all -> 0x0069 }
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x0069 }
                android.os.Message r6 = r2.obtainMessage(r6, r0)     // Catch:{ all -> 0x0069 }
                r6.sendToTarget()     // Catch:{ all -> 0x0069 }
            L_0x0067:
                monitor-exit(r5)     // Catch:{ all -> 0x0069 }
                return
            L_0x0069:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0069 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.d.b.c.handleMessage(android.os.Message):void");
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f11719a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f11720b;

        /* renamed from: c  reason: collision with root package name */
        public final long f11721c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f11722d;

        /* renamed from: e  reason: collision with root package name */
        public int f11723e;

        public d(long j, boolean z, long j2, Object obj) {
            this.f11719a = j;
            this.f11720b = z;
            this.f11721c = j2;
            this.f11722d = obj;
        }
    }

    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                b.this.a(obj, obj2);
            } else if (i == 1) {
                b.this.b(obj, obj2);
            }
        }
    }

    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public b(UUID uuid, m mVar, a aVar, C0110b bVar, List<e.a> list, int i2, boolean z, boolean z2, byte[] bArr, HashMap<String, String> hashMap, r rVar, Looper looper, v vVar) {
        List<e.a> list2;
        if (i2 == 1 || i2 == 3) {
            com.applovin.exoplayer2.l.a.b(bArr);
        }
        this.f11711c = uuid;
        this.f11714f = aVar;
        this.f11715g = bVar;
        this.f11713e = mVar;
        this.f11716h = i2;
        this.i = z;
        this.j = z2;
        if (bArr != null) {
            this.u = bArr;
            list2 = null;
        } else {
            list2 = Collections.unmodifiableList((List) com.applovin.exoplayer2.l.a.b(list));
        }
        this.f11709a = list2;
        this.k = hashMap;
        this.f11710b = rVar;
        this.l = new i<>();
        this.m = vVar;
        this.n = 2;
        this.f11712d = new e(looper);
    }

    private void a(h<g.a> hVar) {
        for (g.a accept : this.l.a()) {
            hVar.accept(accept);
        }
    }

    private void a(Exception exc, int i2) {
        this.s = new f.a(exc, j.a(exc, i2));
        q.c("DefaultDrmSession", "DRM session error", exc);
        a((h<g.a>) new h(exc) {
            public final /* synthetic */ Exception f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((g.a) obj).a(this.f$0);
            }
        });
        if (this.n != 4) {
            this.n = 1;
        }
    }

    /* access modifiers changed from: private */
    public void a(Object obj, Object obj2) {
        if (obj != this.w) {
            return;
        }
        if (this.n == 2 || m()) {
            this.w = null;
            if (obj2 instanceof Exception) {
                this.f11714f.a((Exception) obj2, false);
                return;
            }
            try {
                this.f11713e.b((byte[]) obj2);
                this.f11714f.a();
            } catch (Exception e2) {
                this.f11714f.a(e2, true);
            }
        }
    }

    private void a(boolean z) {
        if (!this.j) {
            byte[] bArr = (byte[]) ai.a(this.t);
            int i2 = this.f11716h;
            if (i2 == 0 || i2 == 1) {
                if (this.u == null) {
                    a(bArr, 1, z);
                    return;
                } else if (this.n == 4 || j()) {
                    long k2 = k();
                    if (this.f11716h == 0 && k2 <= 60) {
                        q.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + k2);
                    } else if (k2 <= 0) {
                        a((Exception) new q(), 2);
                        return;
                    } else {
                        this.n = 4;
                        a((h<g.a>) $$Lambda$Gzv1dYveRHC7e0zRjSFyD1B82w.INSTANCE);
                        return;
                    }
                } else {
                    return;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    com.applovin.exoplayer2.l.a.b(this.u);
                    com.applovin.exoplayer2.l.a.b(this.t);
                    a(this.u, 3, z);
                    return;
                }
                return;
            } else if (this.u != null && !j()) {
                return;
            }
            a(bArr, 2, z);
        }
    }

    private void a(byte[] bArr, int i2, boolean z) {
        try {
            this.v = this.f11713e.a(bArr, this.f11709a, i2, this.k);
            ((c) ai.a(this.q)).a(1, com.applovin.exoplayer2.l.a.b(this.v), z);
        } catch (Exception e2) {
            b(e2, true);
        }
    }

    private void b(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            this.f11714f.a(this);
        } else {
            a(exc, z ? 1 : 2);
        }
    }

    /* access modifiers changed from: private */
    public void b(Object obj, Object obj2) {
        h hVar;
        if (obj == this.v && m()) {
            this.v = null;
            if (obj2 instanceof Exception) {
                b((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f11716h == 3) {
                    this.f11713e.a((byte[]) ai.a(this.u), bArr);
                    hVar = $$Lambda$vjhS4PV9Iv0rWoJZGb7FkEkouCU.INSTANCE;
                } else {
                    byte[] a2 = this.f11713e.a(this.t, bArr);
                    if (!((this.f11716h != 2 && (this.f11716h != 0 || this.u == null)) || a2 == null || a2.length == 0)) {
                        this.u = a2;
                    }
                    this.n = 4;
                    hVar = $$Lambda$Gs2KjknzbLUN5GYKO7rmhuMiyf4.INSTANCE;
                }
                a((h<g.a>) hVar);
            } catch (Exception e2) {
                b(e2, true);
            }
        }
    }

    private boolean i() {
        if (m()) {
            return true;
        }
        try {
            byte[] a2 = this.f11713e.a();
            this.t = a2;
            this.r = this.f11713e.d(a2);
            this.n = 3;
            a((h<g.a>) new h(3) {
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    ((g.a) obj).a(this.f$0);
                }
            });
            com.applovin.exoplayer2.l.a.b(this.t);
            return true;
        } catch (NotProvisionedException unused) {
            this.f11714f.a(this);
            return false;
        } catch (Exception e2) {
            a(e2, 1);
            return false;
        }
    }

    private boolean j() {
        try {
            this.f11713e.b(this.t, this.u);
            return true;
        } catch (Exception e2) {
            a(e2, 1);
            return false;
        }
    }

    private long k() {
        if (!com.applovin.exoplayer2.h.f12715d.equals(this.f11711c)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) com.applovin.exoplayer2.l.a.b(u.a(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private void l() {
        if (this.f11716h == 0 && this.n == 4) {
            ai.a(this.t);
            a(false);
        }
    }

    private boolean m() {
        int i2 = this.n;
        return i2 == 3 || i2 == 4;
    }

    public void a() {
        this.w = this.f11713e.b();
        ((c) ai.a(this.q)).a(0, com.applovin.exoplayer2.l.a.b(this.w), true);
    }

    public void a(int i2) {
        if (i2 == 2) {
            l();
        }
    }

    public void a(g.a aVar) {
        boolean z = false;
        com.applovin.exoplayer2.l.a.b(this.o >= 0);
        if (aVar != null) {
            this.l.a(aVar);
        }
        int i2 = this.o + 1;
        this.o = i2;
        if (i2 == 1) {
            if (this.n == 2) {
                z = true;
            }
            com.applovin.exoplayer2.l.a.b(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.p = handlerThread;
            handlerThread.start();
            this.q = new c(this.p.getLooper());
            if (i()) {
                a(true);
            }
        } else if (aVar != null && m() && this.l.c(aVar) == 1) {
            aVar.a(this.n);
        }
        this.f11715g.a(this, this.o);
    }

    public void a(Exception exc, boolean z) {
        a(exc, z ? 1 : 3);
    }

    public boolean a(String str) {
        return this.f11713e.a((byte[]) com.applovin.exoplayer2.l.a.a(this.t), str);
    }

    public boolean a(byte[] bArr) {
        return Arrays.equals(this.t, bArr);
    }

    public void b() {
        if (i()) {
            a(true);
        }
    }

    public void b(g.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.o > 0);
        int i2 = this.o - 1;
        this.o = i2;
        if (i2 == 0) {
            this.n = 0;
            ((e) ai.a(this.f11712d)).removeCallbacksAndMessages((Object) null);
            ((c) ai.a(this.q)).a();
            this.q = null;
            ((HandlerThread) ai.a(this.p)).quit();
            this.p = null;
            this.r = null;
            this.s = null;
            this.v = null;
            this.w = null;
            byte[] bArr = this.t;
            if (bArr != null) {
                this.f11713e.a(bArr);
                this.t = null;
            }
        }
        if (aVar != null) {
            this.l.b(aVar);
            if (this.l.c(aVar) == 0) {
                aVar.d();
            }
        }
        this.f11715g.b(this, this.o);
    }

    public final int c() {
        return this.n;
    }

    public boolean d() {
        return this.i;
    }

    public final f.a e() {
        if (this.n == 1) {
            return this.s;
        }
        return null;
    }

    public final UUID f() {
        return this.f11711c;
    }

    public final com.applovin.exoplayer2.c.b g() {
        return this.r;
    }

    public Map<String, String> h() {
        byte[] bArr = this.t;
        if (bArr == null) {
            return null;
        }
        return this.f11713e.c(bArr);
    }
}
