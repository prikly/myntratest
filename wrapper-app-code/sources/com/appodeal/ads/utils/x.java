package com.appodeal.ads.utils;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appodeal.ads.k0;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.libs.network.NetworkStatus;
import com.appodeal.ads.storage.b;
import com.appodeal.ads.storage.o;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

public final class x {
    public static final HashMap l = new HashMap();
    public static volatile x m;
    public static final long n;
    public static final long o;
    public static final long p;

    /* renamed from: a  reason: collision with root package name */
    public int f17585a = 7;

    /* renamed from: b  reason: collision with root package name */
    public long f17586b = n;

    /* renamed from: c  reason: collision with root package name */
    public long f17587c = o;

    /* renamed from: d  reason: collision with root package name */
    public long f17588d = p;

    /* renamed from: e  reason: collision with root package name */
    public w f17589e;

    /* renamed from: f  reason: collision with root package name */
    public Long f17590f;

    /* renamed from: g  reason: collision with root package name */
    public Long f17591g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f17592h;
    public c i;
    public b j;
    public final o k = o.f17407b;

    public static final class a {
        public static x a() {
            x xVar;
            x xVar2 = x.m;
            if (xVar2 != null) {
                return xVar2;
            }
            synchronized (x.class) {
                xVar = x.m;
                if (xVar == null) {
                    xVar = new x();
                    x.m = xVar;
                }
            }
            return xVar;
        }
    }

    public final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x f17593a;

        public b(x xVar) {
            Intrinsics.checkNotNullParameter(xVar, "this$0");
            this.f17593a = xVar;
        }

        public final void run() {
            this.f17593a.m();
            x xVar = this.f17593a;
            long j = xVar.f17587c;
            if (j > 0) {
                xVar.f17592h.postDelayed(this, j);
            }
        }
    }

    public final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Context f17594a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f17595b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ x f17596c;

        public c(x xVar, Context context, boolean z) {
            Intrinsics.checkNotNullParameter(xVar, "this$0");
            Intrinsics.checkNotNullParameter(context, "context");
            this.f17596c = xVar;
            this.f17594a = context;
            this.f17595b = z;
        }

        public final void run() {
            long a2 = x.a(this.f17596c);
            if (!this.f17595b && 0 != a2) {
                this.f17596c.a(this.f17594a, a2);
            } else if (!NetworkStatus.INSTANCE.isConnected()) {
                Log.log("SessionManager", "sendSessions", "skip: no network connection");
                x xVar = this.f17596c;
                xVar.a(this.f17594a, xVar.f17586b);
            } else {
                Log.log("SessionManager", "sendSessions", "start");
                k0.c();
            }
        }
    }

    public abstract class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f17597a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ x f17598b;

        public static final class a extends LinkedHashMap<String, JSONObject> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f17599a;

            public a(d dVar) {
                this.f17599a = dVar;
            }

            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj == null ? true : obj instanceof String)) {
                    return false;
                }
                return super.containsKey((String) obj);
            }

            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj == null ? true : obj instanceof JSONObject)) {
                    return false;
                }
                return super.containsValue((JSONObject) obj);
            }

            public final /* bridge */ Set<Map.Entry<String, JSONObject>> entrySet() {
                return super.entrySet();
            }

            public final /* bridge */ Set<String> keySet() {
                return super.keySet();
            }

            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                boolean z = true;
                if (!(obj == null ? true : obj instanceof String)) {
                    return false;
                }
                if (obj2 != null) {
                    z = obj2 instanceof JSONObject;
                }
                if (!z) {
                    return false;
                }
                return super.remove((String) obj, (JSONObject) obj2);
            }

            public final boolean removeEldestEntry(Map.Entry<String, ? extends JSONObject> entry) {
                Intrinsics.checkNotNullParameter(entry, "eldest");
                return super.size() > this.f17599a.f17597a;
            }

            public final /* bridge */ int size() {
                return super.size();
            }

            public final /* bridge */ Collection<JSONObject> values() {
                return super.values();
            }
        }

        public d(x xVar, int i) {
            Intrinsics.checkNotNullParameter(xVar, "this$0");
            this.f17598b = xVar;
            this.f17597a = i;
        }

        public abstract void a(a aVar);

        public final void run() {
            try {
                a aVar = new a(this);
                x xVar = this.f17598b;
                x.a(xVar, x.d(xVar), aVar);
                a(aVar);
                o b2 = this.f17598b.k;
                String jSONArray = new JSONArray(aVar.values()).toString();
                Intrinsics.checkNotNullExpressionValue(jSONArray, "JSONArray(sessions.values).toString()");
                b2.b(jSONArray, (long) aVar.size());
            } catch (Throwable th) {
                Log.log(th);
            }
        }
    }

    public static final class e extends d {
        public e(x xVar, int i) {
            super(xVar, i);
        }

        public final void a(d.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, Constants.SESSIONS);
            synchronized (x.l) {
                for (String remove : x.l.keySet()) {
                    aVar.remove(remove);
                }
                x.l.clear();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public static final class f extends d {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ w f17600c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(x xVar, w wVar, int i) {
            super(xVar, i);
            this.f17600c = wVar;
        }

        public final void a(d.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, Constants.SESSIONS);
            aVar.put(this.f17600c.a(), this.f17600c.d());
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        n = timeUnit.toMillis(120);
        o = timeUnit.toMillis(60);
        p = timeUnit.toMillis(30);
    }

    public x() {
        HandlerThread handlerThread = new HandlerThread("AppodealSessionHandler");
        handlerThread.start();
        this.f17592h = new Handler(handlerThread.getLooper());
    }

    public static final long a(x xVar) {
        Long l2 = xVar.f17591g;
        if (l2 == null) {
            return xVar.f17586b;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - l2.longValue();
        long j2 = xVar.f17586b;
        if (elapsedRealtime >= j2) {
            return 0;
        }
        return j2 - elapsedRealtime;
    }

    public static final JSONArray d(x xVar) {
        xVar.getClass();
        JSONArray jSONArray = new JSONArray();
        try {
            String f2 = xVar.k.f();
            if (f2 == null) {
                f2 = jSONArray.toString();
                Intrinsics.checkNotNullExpressionValue(f2, "sessions.toString()");
            }
            return new JSONArray(f2);
        } catch (Throwable th) {
            Log.log(th);
            return jSONArray;
        }
    }

    public static final void e(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "this$0");
        xVar.m();
    }

    public final synchronized void a(Context context, long j2) {
        c cVar = this.i;
        if (cVar != null) {
            this.f17592h.removeCallbacks(cVar);
            this.i = null;
        }
        if (this.f17586b > 0) {
            boolean z = 0 == j2;
            c cVar2 = new c(this, context, z);
            this.i = cVar2;
            if (z) {
                this.f17592h.postAtFrontOfQueue(cVar2);
            } else {
                this.f17592h.postDelayed(cVar2, j2);
            }
        }
    }

    public final void b() {
        this.f17592h.post(new e(this, this.f17585a));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final long c() {
        /*
            r6 = this;
            com.appodeal.ads.utils.w r0 = r6.f17589e
            r1 = 0
            if (r0 != 0) goto L_0x0007
            goto L_0x002e
        L_0x0007:
            monitor-enter(r0)
            long r3 = r0.f17578b     // Catch:{ all -> 0x0032 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x000f
            goto L_0x002d
        L_0x000f:
            monitor-enter(r0)     // Catch:{ all -> 0x0032 }
            r0.e()     // Catch:{ all -> 0x002f }
            com.appodeal.ads.storage.o r3 = com.appodeal.ads.utils.w.l     // Catch:{ all -> 0x002f }
            com.appodeal.ads.storage.b r3 = r3.f17408a     // Catch:{ all -> 0x002f }
            com.appodeal.ads.storage.b$a r4 = com.appodeal.ads.storage.b.a.Default     // Catch:{ all -> 0x002f }
            android.content.SharedPreferences r3 = r3.a((com.appodeal.ads.storage.b.a) r4)     // Catch:{ all -> 0x002f }
            java.lang.String r4 = "app_uptime"
            long r1 = r3.getLong(r4, r1)     // Catch:{ all -> 0x002f }
            long r3 = r0.f17581e     // Catch:{ all -> 0x002f }
            long r1 = r1 + r3
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            long r3 = r0.f17578b     // Catch:{ all -> 0x0032 }
            long r1 = r1 / r3
        L_0x002d:
            monitor-exit(r0)
        L_0x002e:
            return r1
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.utils.x.c():long");
    }

    public final long e() {
        w wVar = this.f17589e;
        long j2 = 0;
        if (wVar != null) {
            synchronized (wVar) {
                wVar.e();
                j2 = (w.l.f17408a.a(b.a.Default).getLong("app_uptime", 0) + wVar.f17581e) / 1000;
            }
        }
        return j2;
    }

    public final long f() {
        w wVar = this.f17589e;
        long j2 = 0;
        if (wVar != null) {
            synchronized (wVar) {
                wVar.e();
                j2 = w.l.f17408a.a(b.a.Default).getLong("app_uptime_m", 0) + wVar.f17582f;
            }
        }
        return j2;
    }

    public final long g() {
        long j2;
        w wVar = this.f17589e;
        if (wVar == null) {
            return 0;
        }
        synchronized (wVar) {
            j2 = wVar.f17578b;
        }
        return j2;
    }

    public final long h() {
        long j2;
        w wVar = this.f17589e;
        if (wVar == null) {
            return 0;
        }
        synchronized (wVar) {
            wVar.e();
            j2 = wVar.f17581e / 1000;
        }
        return j2;
    }

    public final long i() {
        long j2;
        w wVar = this.f17589e;
        if (wVar == null) {
            return 0;
        }
        synchronized (wVar) {
            wVar.e();
            j2 = wVar.f17582f;
        }
        return j2;
    }

    public final String j() {
        String str;
        w wVar = this.f17589e;
        if (wVar == null) {
            return null;
        }
        synchronized (wVar) {
            str = wVar.f17577a;
        }
        return str;
    }

    public final void k() {
        w wVar = this.f17589e;
        if (wVar != null) {
            synchronized (wVar) {
                wVar.i = System.currentTimeMillis();
                wVar.j = SystemClock.elapsedRealtime();
                wVar.e();
            }
            this.f17592h.post(new Runnable() {
                public final void run() {
                    x.e(x.this);
                }
            });
        }
        c cVar = this.i;
        if (cVar != null) {
            this.f17592h.removeCallbacks(cVar);
            this.i = null;
        }
        b bVar = this.j;
        if (bVar != null) {
            this.f17592h.removeCallbacks(bVar);
            this.j = null;
        }
    }

    public final void l() {
        long elapsedRealtime;
        long j2;
        long j3;
        Context applicationContext = com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext();
        w wVar = this.f17589e;
        if (wVar != null) {
            synchronized (wVar) {
                if (wVar.i > 0) {
                    wVar.f17583g = System.currentTimeMillis();
                }
                if (wVar.j > 0) {
                    wVar.f17584h = SystemClock.elapsedRealtime();
                }
            }
            synchronized (wVar) {
                elapsedRealtime = wVar.j > 0 ? SystemClock.elapsedRealtime() - wVar.j : 0;
            }
            if (elapsedRealtime >= this.f17588d) {
                if (this.k.f17408a.a(b.a.Default).getLong("sessions_size", 0) >= ((long) this.f17585a)) {
                    a(applicationContext, 0);
                } else {
                    Long l2 = this.f17591g;
                    if (l2 == null) {
                        j3 = this.f17586b;
                    } else {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - l2.longValue();
                        long j4 = this.f17586b;
                        j3 = elapsedRealtime2 >= j4 ? 0 : j4 - elapsedRealtime2;
                    }
                    a(applicationContext, j3);
                }
                n();
            } else {
                Long l3 = this.f17591g;
                if (l3 == null) {
                    j2 = this.f17586b;
                } else {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - l3.longValue();
                    long j5 = this.f17586b;
                    j2 = elapsedRealtime3 >= j5 ? 0 : j5 - elapsedRealtime3;
                }
                a(applicationContext, j2);
            }
        }
        synchronized (this) {
            b bVar = this.j;
            if (bVar != null) {
                this.f17592h.removeCallbacks(bVar);
                this.j = null;
            }
            if (this.f17587c > 0) {
                b bVar2 = new b(this);
                this.j = bVar2;
                this.f17592h.postDelayed(bVar2, this.f17587c);
            }
        }
    }

    public final synchronized void m() {
        w wVar = this.f17589e;
        if (wVar != null) {
            wVar.c();
        }
    }

    public final void n() {
        Long l2;
        long j2;
        long j3;
        w wVar = this.f17589e;
        Long l3 = null;
        if (wVar == null) {
            o oVar = w.l;
            String m2 = oVar.f17408a.m();
            wVar = !TextUtils.isEmpty(m2) ? new w(m2, oVar.f17408a.h(), oVar.f17408a.j(), oVar.f17408a.i(), oVar.f17408a.l(), oVar.f17408a.k()) : null;
        } else {
            wVar.c();
        }
        if (wVar == null) {
            l2 = null;
        } else {
            synchronized (wVar) {
                j3 = wVar.f17578b;
            }
            l2 = Long.valueOf(j3);
        }
        if (l2 == null) {
            j2 = this.k.f17408a.h();
        } else {
            j2 = l2.longValue();
        }
        if (this.f17590f == null) {
            String c2 = this.k.c();
            Long d2 = this.k.d();
            if ((c2 == null || StringsKt.isBlank(c2)) || j2 == 0) {
                l3 = Long.valueOf(SystemClock.elapsedRealtime());
                this.k.a(l3.longValue());
            } else if (d2 != null) {
                l3 = d2;
            }
            this.f17590f = l3;
        }
        if (wVar != null) {
            this.f17592h.post(new f(this, wVar, this.f17585a));
        }
        w wVar2 = new w(j2);
        this.f17589e = wVar2;
        wVar2.b();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final long d() {
        /*
            r6 = this;
            com.appodeal.ads.utils.w r0 = r6.f17589e
            r1 = 0
            if (r0 != 0) goto L_0x0007
            goto L_0x002b
        L_0x0007:
            monitor-enter(r0)
            long r3 = r0.f17578b     // Catch:{ all -> 0x002f }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x000f
            goto L_0x002a
        L_0x000f:
            monitor-enter(r0)     // Catch:{ all -> 0x002f }
            r0.e()     // Catch:{ all -> 0x002c }
            com.appodeal.ads.storage.o r3 = com.appodeal.ads.utils.w.l     // Catch:{ all -> 0x002c }
            com.appodeal.ads.storage.b r3 = r3.f17408a     // Catch:{ all -> 0x002c }
            com.appodeal.ads.storage.b$a r4 = com.appodeal.ads.storage.b.a.Default     // Catch:{ all -> 0x002c }
            android.content.SharedPreferences r3 = r3.a((com.appodeal.ads.storage.b.a) r4)     // Catch:{ all -> 0x002c }
            java.lang.String r4 = "app_uptime_m"
            long r1 = r3.getLong(r4, r1)     // Catch:{ all -> 0x002c }
            long r3 = r0.f17582f     // Catch:{ all -> 0x002c }
            long r1 = r1 + r3
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            long r3 = r0.f17578b     // Catch:{ all -> 0x002f }
            long r1 = r1 / r3
        L_0x002a:
            monitor-exit(r0)
        L_0x002b:
            return r1
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r1     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.utils.x.d():long");
    }

    public static final void a(x xVar, JSONArray jSONArray, d.a aVar) {
        xVar.getClass();
        int length = jSONArray.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                aVar.put(jSONObject.optString("session_uuid"), jSONObject);
            } catch (Throwable th) {
                Log.log(th);
            }
            i2 = i3;
        }
    }

    public final void a(Context context, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        if (jSONObject.has("session_store_size")) {
            this.f17585a = jSONObject.optInt("session_store_size");
        }
        if (jSONObject.has("session_report_interval")) {
            this.f17586b = jSONObject.optLong("session_report_interval");
        }
        if (jSONObject.has("session_update_interval")) {
            this.f17587c = jSONObject.optLong("session_update_interval");
        }
        if (jSONObject.has("session_timeout_duration")) {
            this.f17588d = jSONObject.optLong("session_timeout_duration");
        }
        a(context, this.f17586b);
        synchronized (this) {
            b bVar = this.j;
            if (bVar != null) {
                this.f17592h.removeCallbacks(bVar);
                this.j = null;
            }
            if (this.f17587c > 0) {
                b bVar2 = new b(this);
                this.j = bVar2;
                this.f17592h.postDelayed(bVar2, this.f17587c);
            }
        }
    }

    public final JSONArray a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17591g = Long.valueOf(SystemClock.elapsedRealtime());
        a(context, this.f17586b);
        JSONArray jSONArray = new JSONArray();
        try {
            String f2 = this.k.f();
            if (f2 == null) {
                f2 = jSONArray.toString();
                Intrinsics.checkNotNullExpressionValue(f2, "sessions.toString()");
            }
            jSONArray = new JSONArray(f2);
        } catch (Throwable th) {
            Log.log(th);
        }
        HashMap hashMap = l;
        synchronized (hashMap) {
            int i2 = 0;
            int length = jSONArray.length();
            while (i2 < length) {
                int i3 = i2 + 1;
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    hashMap.put(jSONObject.optString("session_uuid"), jSONObject);
                } catch (Throwable th2) {
                    Log.log(th2);
                }
                i2 = i3;
            }
            Unit unit = Unit.INSTANCE;
        }
        return jSONArray;
    }
}
