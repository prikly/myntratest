package com.yandex.metrica.impl.ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.onesignal.outcomes.data.OutcomeEventsTable;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.coreutils.services.FirstExecutionConditionService;
import com.yandex.metrica.impl.ob.Fh;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Jh implements Gh, Runnable {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ServiceConnection f4366a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f4367b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f4368c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, Bh> f4369d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Context f4370e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f4371f;

    /* renamed from: g  reason: collision with root package name */
    private ServerSocket f4372g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public C0336di f4373h;
    private Lm i;
    /* access modifiers changed from: private */
    public final M0 j;
    private final FirstExecutionConditionService.FirstExecutionHandler k;
    private final C0873zh l;
    private final C0873zh m;
    private final Fh n;
    private final Pm o;
    private final C0589nm<C0336di, List<Integer>> p;
    /* access modifiers changed from: private */
    public final C0849yh q;
    private final Ih r;
    private final String s;

    class a implements ServiceConnection {
        a(Jh jh) {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 100) {
                Jh.this.c();
                try {
                    Jh.this.f4370e.unbindService(Jh.this.f4366a);
                } catch (Throwable unused) {
                    Jh.this.j.reportEvent("socket_unbind_has_thrown_exception");
                }
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            Jh jh = Jh.this;
            Jh.a(jh, jh.f4373h);
        }
    }

    class d extends HashMap<String, Bh> {

        class a implements Bh {
            a() {
            }

            public Ah a(Socket socket, Uri uri, Hh hh) {
                Jh jh = Jh.this;
                return new C0658qh(socket, uri, jh, jh.f4373h, Jh.this.q.a(), hh);
            }
        }

        class b implements Bh {
            b() {
            }

            public Ah a(Socket socket, Uri uri, Hh hh) {
                Jh jh = Jh.this;
                return new Dh(socket, uri, jh, jh.f4373h, hh);
            }
        }

        d() {
            put(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON, new a());
            put("i", new b());
        }
    }

    class e implements Runnable {
        e() {
        }

        public void run() {
            Jh.f(Jh.this);
        }
    }

    private enum f {
        OK,
        SHOULD_RETRY,
        ORDINARY_FAIL
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    Jh(android.content.Context r15, com.yandex.metrica.impl.ob.C0635pi r16, com.yandex.metrica.impl.ob.Fh r17, com.yandex.metrica.impl.ob.C0589nm<com.yandex.metrica.impl.ob.C0336di, java.util.List<java.lang.Integer>> r18, com.yandex.metrica.impl.ob.C0801wh r19, com.yandex.metrica.impl.ob.C0801wh r20, java.lang.String r21) {
        /*
            r14 = this;
            com.yandex.metrica.coreutils.services.UtilityServiceLocator r0 = com.yandex.metrica.coreutils.services.UtilityServiceLocator.getInstance()
            com.yandex.metrica.coreutils.services.FirstExecutionConditionService r4 = r0.getFirstExecutionService()
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.ob.F0.g()
            com.yandex.metrica.impl.ob.Pm r5 = r0.q()
            com.yandex.metrica.impl.ob.M0 r6 = com.yandex.metrica.impl.ob.C0609oh.a()
            com.yandex.metrica.impl.ob.zh r7 = new com.yandex.metrica.impl.ob.zh
            java.lang.String r0 = "open"
            r1 = r19
            r7.<init>(r0, r1)
            com.yandex.metrica.impl.ob.zh r8 = new com.yandex.metrica.impl.ob.zh
            java.lang.String r0 = "port_already_in_use"
            r1 = r20
            r8.<init>(r0, r1)
            com.yandex.metrica.impl.ob.yh r9 = new com.yandex.metrica.impl.ob.yh
            r0 = r15
            r3 = r16
            r9.<init>(r15, r3)
            com.yandex.metrica.impl.ob.Ih r10 = new com.yandex.metrica.impl.ob.Ih
            r10.<init>()
            r1 = r14
            r2 = r15
            r11 = r17
            r12 = r18
            r13 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Jh.<init>(android.content.Context, com.yandex.metrica.impl.ob.pi, com.yandex.metrica.impl.ob.Fh, com.yandex.metrica.impl.ob.nm, com.yandex.metrica.impl.ob.wh, com.yandex.metrica.impl.ob.wh, java.lang.String):void");
    }

    static void f(Jh jh) {
        jh.getClass();
        Intent intent = new Intent(jh.f4370e, MetricaService.class);
        intent.setAction("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER");
        try {
            if (!jh.f4370e.bindService(intent, jh.f4366a, 1)) {
                jh.j.reportEvent("socket_bind_has_failed");
            }
        } catch (Throwable unused) {
            jh.j.reportEvent("socket_bind_has_thrown_exception");
        }
        Lm b2 = jh.o.b(jh);
        jh.i = b2;
        b2.start();
        jh.r.d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (com.yandex.metrica.impl.ob.A2.a(26) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        android.net.TrafficStats.setThreadStatsTag(40230);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r5.f4372g == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.yandex.metrica.impl.ob.di r0 = r5.f4373h     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0028
            com.yandex.metrica.impl.ob.Jh$f r0 = r5.a((com.yandex.metrica.impl.ob.C0336di) r0)     // Catch:{ all -> 0x0082 }
            com.yandex.metrica.impl.ob.Jh$f r1 = com.yandex.metrica.impl.ob.Jh.f.SHOULD_RETRY     // Catch:{ all -> 0x0082 }
            if (r0 != r1) goto L_0x0028
            r0 = 0
            r5.f4371f = r0     // Catch:{ all -> 0x0082 }
            com.yandex.metrica.impl.ob.di r0 = r5.f4373h     // Catch:{ all -> 0x0082 }
            long r0 = r0.j     // Catch:{ all -> 0x0082 }
            com.yandex.metrica.impl.ob.Pm r2 = r5.o     // Catch:{ all -> 0x0082 }
            com.yandex.metrica.core.api.executors.ICommonExecutor r2 = r2.a()     // Catch:{ all -> 0x0082 }
            java.lang.Runnable r3 = r5.f4368c     // Catch:{ all -> 0x0082 }
            r2.remove(r3)     // Catch:{ all -> 0x0082 }
            java.lang.Runnable r3 = r5.f4368c     // Catch:{ all -> 0x0082 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0082 }
            r2.executeDelayed(r3, r0, r4)     // Catch:{ all -> 0x0082 }
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            return
        L_0x0028:
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            r0 = 26
            boolean r1 = com.yandex.metrica.impl.ob.A2.a((int) r0)
            if (r1 == 0) goto L_0x0037
            r1 = 40230(0x9d26, float:5.6374E-41)
            android.net.TrafficStats.setThreadStatsTag(r1)
        L_0x0037:
            java.net.ServerSocket r1 = r5.f4372g
            if (r1 == 0) goto L_0x0081
        L_0x003b:
            boolean r1 = r5.f4371f
            if (r1 == 0) goto L_0x0081
            monitor-enter(r5)
            boolean r1 = r5.f4371f     // Catch:{ all -> 0x007e }
            r2 = 0
            if (r1 == 0) goto L_0x0048
            java.net.ServerSocket r1 = r5.f4372g     // Catch:{ all -> 0x007e }
            goto L_0x0049
        L_0x0048:
            r1 = r2
        L_0x0049:
            monitor-exit(r5)     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x003b
            java.net.Socket r2 = r1.accept()     // Catch:{ all -> 0x0075 }
            com.yandex.metrica.impl.ob.Hh r1 = new com.yandex.metrica.impl.ob.Hh     // Catch:{ all -> 0x0075 }
            com.yandex.metrica.coreutils.services.SystemTimeProvider r3 = new com.yandex.metrica.coreutils.services.SystemTimeProvider     // Catch:{ all -> 0x0075 }
            r3.<init>()     // Catch:{ all -> 0x0075 }
            com.yandex.metrica.impl.ob.gm r4 = new com.yandex.metrica.impl.ob.gm     // Catch:{ all -> 0x0075 }
            r4.<init>()     // Catch:{ all -> 0x0075 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0075 }
            boolean r3 = com.yandex.metrica.impl.ob.A2.a((int) r0)     // Catch:{ all -> 0x0075 }
            if (r3 == 0) goto L_0x0068
            android.net.TrafficStats.tagSocket(r2)     // Catch:{ all -> 0x0075 }
        L_0x0068:
            com.yandex.metrica.impl.ob.Ch r3 = new com.yandex.metrica.impl.ob.Ch     // Catch:{ all -> 0x0075 }
            java.util.HashMap<java.lang.String, com.yandex.metrica.impl.ob.Bh> r4 = r5.f4369d     // Catch:{ all -> 0x0075 }
            r3.<init>(r2, r5, r4, r1)     // Catch:{ all -> 0x0075 }
            r3.a()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x003b
            goto L_0x0078
        L_0x0075:
            if (r2 == 0) goto L_0x003b
        L_0x0078:
            r2.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x003b
        L_0x007c:
            goto L_0x003b
        L_0x007e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007e }
            throw r0
        L_0x0081:
            return
        L_0x0082:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Jh.run():void");
    }

    private synchronized void c(C0336di diVar) {
        if (!this.f4371f && this.k.tryExecute(diVar.f5688f)) {
            this.f4371f = true;
        }
    }

    public void a() {
        this.f4367b.removeMessages(100);
        this.r.e();
    }

    public synchronized void b() {
        if (this.f4371f) {
            a();
            Handler handler = this.f4367b;
            handler.sendMessageDelayed(handler.obtainMessage(100), TimeUnit.SECONDS.toMillis(this.f4373h.f5683a));
            this.r.c();
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void a(com.yandex.metrica.impl.ob.C0635pi r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            com.yandex.metrica.impl.ob.di r1 = r1.M()     // Catch:{ all -> 0x0012 }
            monitor-enter(r0)     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x000f
            r0.c((com.yandex.metrica.impl.ob.C0336di) r1)     // Catch:{ all -> 0x000c }
            goto L_0x000f
        L_0x000c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r1     // Catch:{ all -> 0x0012 }
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            monitor-exit(r0)
            return
        L_0x0012:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Jh.a(com.yandex.metrica.impl.ob.pi):void");
    }

    Jh(Context context, C0635pi piVar, FirstExecutionConditionService firstExecutionConditionService, Pm pm, M0 m0, C0873zh zhVar, C0873zh zhVar2, C0849yh yhVar, Ih ih, Fh fh, C0589nm<C0336di, List<Integer>> nmVar, String str) {
        this.f4366a = new a(this);
        this.f4367b = new b(Looper.getMainLooper());
        this.f4368c = new c();
        this.f4369d = new d();
        this.f4370e = context;
        this.j = m0;
        this.l = zhVar;
        this.m = zhVar2;
        this.n = fh;
        this.p = nmVar;
        this.o = pm;
        this.q = yhVar;
        this.r = ih;
        String format = String.format("[YandexUID%sServer]", new Object[]{str});
        this.s = format;
        this.k = firstExecutionConditionService.createFirstExecutionHandler((Runnable) new e(), pm.a(), format);
        b(piVar.M());
        C0336di diVar = this.f4373h;
        if (diVar != null) {
            c(diVar);
        }
    }

    static void a(Jh jh, C0336di diVar) {
        synchronized (jh) {
            if (diVar != null) {
                jh.c(diVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c() {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.f4371f = r0     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            com.yandex.metrica.impl.ob.Lm r0 = r2.i     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0.stopRunning()     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            r2.i = r1     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
        L_0x000e:
            java.net.ServerSocket r0 = r2.f4372g     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            if (r0 == 0) goto L_0x001b
            r0.close()     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            r2.f4372g = r1     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x001b:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Jh.c():void");
    }

    private synchronized f a(C0336di diVar) {
        f fVar;
        Integer num;
        Fh.a e2;
        String message;
        Throwable cause;
        Throwable th;
        Iterator it = this.p.a(diVar).iterator();
        Integer num2 = null;
        fVar = f.ORDINARY_FAIL;
        while (this.f4372g == null && it.hasNext()) {
            try {
                num = (Integer) it.next();
                if (num != null) {
                    try {
                        this.f4372g = this.n.a(num.intValue());
                        fVar = f.OK;
                        this.l.a(this, num.intValue(), diVar);
                    } catch (BindException unused) {
                        num2 = num;
                    } catch (Fh.a e3) {
                        e2 = e3;
                        message = e2.getMessage();
                        cause = e2.getCause();
                        if (!(cause == null || message == null)) {
                            Map<String, Object> a2 = a(num);
                            ((HashMap) a2).put("exception", Log.getStackTraceString(cause));
                            this.j.reportEvent(b(message), a2);
                        }
                        num2 = num;
                    } catch (Throwable th2) {
                        th = th2;
                        Map<String, Object> a3 = a(num);
                        ((HashMap) a3).put("exception", Log.getStackTraceString(th));
                        this.j.reportEvent(b("open_error"), a3);
                        num2 = num;
                    }
                }
            } catch (BindException unused2) {
                fVar = f.SHOULD_RETRY;
                this.m.a(this, num2.intValue(), diVar);
            } catch (Fh.a e4) {
                Fh.a aVar = e4;
                num = num2;
                e2 = aVar;
                message = e2.getMessage();
                cause = e2.getCause();
                Map<String, Object> a22 = a(num);
                ((HashMap) a22).put("exception", Log.getStackTraceString(cause));
                this.j.reportEvent(b(message), a22);
                num2 = num;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                num = num2;
                th = th4;
                Map<String, Object> a32 = a(num);
                ((HashMap) a32).put("exception", Log.getStackTraceString(th));
                this.j.reportEvent(b("open_error"), a32);
                num2 = num;
            }
            num2 = num;
        }
        return fVar;
    }

    private void b(C0336di diVar) {
        this.f4373h = diVar;
        if (diVar != null) {
            this.k.setDelaySeconds(diVar.f5687e);
        }
    }

    public void b(int i2, Hh hh) {
        this.j.reportEvent(b("sync_succeed"), a(i2, hh));
    }

    public synchronized void b(C0635pi piVar) {
        this.q.a(piVar);
        C0336di M = piVar.M();
        if (M != null) {
            this.f4373h = M;
            this.k.setDelaySeconds(M.f5687e);
            c(M);
        } else {
            c();
            b((C0336di) null);
        }
    }

    private String b(String str) {
        return "socket_" + str;
    }

    private Map<String, Object> a(Integer num) {
        String str;
        HashMap hashMap = new HashMap();
        if (num == null) {
            str = "";
        } else {
            str = String.valueOf(num);
        }
        hashMap.put("port", str);
        return hashMap;
    }

    private Map<String, Object> a(int i2, Hh hh) {
        Map<String, Object> a2 = a(Integer.valueOf(i2));
        HashMap hashMap = (HashMap) a2;
        hashMap.put("idle_interval", Double.valueOf(this.r.b()));
        hashMap.put("background_interval", Double.valueOf(this.r.a()));
        hashMap.put("request_read_time", Long.valueOf(hh.d()));
        hashMap.put("response_form_time", Long.valueOf(hh.e()));
        hashMap.put("response_send_time", Long.valueOf(hh.f()));
        return a2;
    }

    public void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("uri", str2);
        M0 m0 = this.j;
        m0.reportEvent("socket_" + str, (Map<String, Object>) hashMap);
    }

    public void a(String str) {
        this.j.reportEvent(b(str));
    }

    public void a(String str, Throwable th) {
        this.j.reportError(b(str), th);
    }

    public void a(String str, Integer num) {
        this.j.reportEvent(b(str), a(num));
    }

    public void a(Map<String, Object> map, int i2, Hh hh) {
        Map<String, Object> a2 = a(i2, hh);
        ((HashMap) a2).put(OutcomeEventsTable.COLUMN_NAME_PARAMS, map);
        this.j.reportEvent(b("reversed_sync_succeed"), a2);
    }
}
