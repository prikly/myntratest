package com.bytedance.sdk.openadsdk.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.b.k;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: AdEventThread */
public class h<T extends k> extends HandlerThread implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static String f306a = "AdEventThread";

    /* renamed from: b  reason: collision with root package name */
    public static String f307b = "ttad_bk";
    /* access modifiers changed from: private */
    public static long l = 180000;

    /* renamed from: c  reason: collision with root package name */
    public final f<T> f308c;

    /* renamed from: d  reason: collision with root package name */
    public n<T> f309d;

    /* renamed from: e  reason: collision with root package name */
    public final List<T> f310e;

    /* renamed from: f  reason: collision with root package name */
    public long f311f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f312g;

    /* renamed from: h  reason: collision with root package name */
    public int f313h;
    public Handler i;
    public final b j;
    public final c k;

    /* compiled from: AdEventThread */
    public interface b {
        boolean a();
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return true;
    }

    public h(f<T> fVar, n<T> nVar, c cVar, b bVar) {
        this(f307b, f306a, fVar, nVar, cVar, bVar);
    }

    public h(String str, String str2, f<T> fVar, n<T> nVar, c cVar, b bVar) {
        super(str);
        f306a = str2;
        this.k = cVar;
        this.j = bVar;
        this.f308c = fVar;
        this.f309d = nVar;
        this.f310e = Collections.synchronizedList(new LinkedList());
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        this.f311f = System.currentTimeMillis();
        this.i = new Handler(getLooper(), this);
        com.bytedance.sdk.openadsdk.core.k.c().postDelayed(new a(this.i), l);
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                a((k) message.obj);
                return true;
            case 2:
                g();
                return true;
            case 3:
                f();
                return true;
            case 4:
                e();
                return true;
            case 5:
                c();
                return true;
            case 6:
                d();
                return true;
            default:
                return true;
        }
    }

    private void c() {
        this.f308c.a(this.k.f318d, this.k.f319e);
        this.f312g = this.f308c.a();
        this.f313h = this.f308c.b();
        if (this.f312g) {
            a("onHandleInitEvent serverBusy, retryCount = " + this.f313h);
            i();
            return;
        }
        b(this.f308c.a(30, "_id"));
        a("onHandleInitEvent cacheData count = " + this.f310e.size());
        h();
    }

    private void d() {
        this.f308c.a(this.k.f318d, this.k.f319e);
        this.f312g = this.f308c.a();
        this.f313h = this.f308c.b();
        if (this.f312g) {
            a("onHandleInitEvent serverBusy, retryCount = " + this.f313h);
            i();
            return;
        }
        b(this.f308c.a(30, "_id"));
        d(this.f310e);
        a("onHandleInitEvent cacheData count = " + this.f310e.size());
        h();
    }

    private void b(List<T> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    HashSet hashSet = new HashSet();
                    for (T d2 : this.f310e) {
                        hashSet.add(d2.d());
                    }
                    for (T t : list) {
                        if (!hashSet.contains(t.d())) {
                            this.f310e.add(t);
                        }
                    }
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        a("reloadCacheList adEventList is empty======");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045 A[LOOP:0: B:11:0x0045->B:14:0x0060, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e() {
        /*
            r4 = this;
            com.bytedance.sdk.openadsdk.b.h$b r0 = r4.j
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0016
            r0 = 4
            com.bytedance.sdk.openadsdk.b.h$c r1 = r4.k
            long r1 = r1.f317c
            r4.a((int) r0, (long) r1)
            java.lang.String r0 = "onHandleServerBusyRetryEvent, no net"
            r4.a((java.lang.String) r0)
            return
        L_0x0016:
            com.bytedance.sdk.openadsdk.b.f<T> r0 = r4.f308c
            r1 = 30
            java.lang.String r2 = "_id"
            java.util.List r0 = r0.a((int) r1, (java.lang.String) r2)
            boolean r1 = com.bytedance.sdk.component.utils.j.a(r0)
            if (r1 == 0) goto L_0x0032
            java.lang.String r0 = "onHandleServerBusyRetryEvent, empty list start routine"
            r4.a((java.lang.String) r0)
            r4.o()
            r4.k()
            return
        L_0x0032:
            boolean r1 = r4.a()
            r2 = 1
            if (r1 == 0) goto L_0x0063
            java.util.HashMap r0 = r4.f(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0045:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0066
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r3 = r0.hasNext()
            r3 = r3 ^ r2
            boolean r1 = r4.a(r1, (boolean) r3)
            if (r1 != 0) goto L_0x0045
            goto L_0x0066
        L_0x0063:
            r4.a(r0, (boolean) r2)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.b.h.e():void");
    }

    private boolean a(List<T> list, boolean z) {
        i a2 = a(list);
        if (a2 == null) {
            return false;
        }
        if (a2.f321a) {
            a("onHandleServerBusyRetryEvent, success");
            e(list);
            a(z);
            return true;
        } else if (a(a2)) {
            int i2 = this.f313h + 1;
            this.f313h = i2;
            this.f308c.a(i2);
            this.f308c.a(list, this.k.f318d, this.k.f319e);
            i();
            a("onHandleServerBusyRetryEvent, serverbusy, count = " + this.f313h);
            return false;
        } else if (b(a2) || a(list, a2)) {
            e(list);
            a(true);
            return false;
        } else {
            j();
            return false;
        }
    }

    private boolean c(List<T> list) {
        JSONObject b2;
        if (list == null || list.size() == 0 || !(list.get(0) instanceof a) || (b2 = ((a) list.get(0)).b()) == null) {
            return true;
        }
        return TextUtils.isEmpty(b2.optString("app_log_url"));
    }

    public i a(List<T> list) {
        if (this.f309d == null) {
            m.f();
        }
        n<T> nVar = this.f309d;
        if (nVar == null) {
            return null;
        }
        return nVar.a(list);
    }

    private void f() {
        if (!this.f312g) {
            a("onHandleRoutineRetryEvent");
            h();
        }
    }

    private void g() {
        if (!this.f312g) {
            a("onHandleRoutineUploadEvent");
            h();
        }
    }

    private void a(T t) {
        l.b("ReportEvent", "execute onHandleReceivedAdEvent()  start...");
        this.f308c.a(t);
        if (!this.f312g) {
            a("onHandleReceivedAdEvent");
            this.f310e.add(t);
            d(this.f310e);
            l.b("ReportEvent", "execute onHandleReceivedAdEvent() ... mIsServerBusy =" + this.f312g);
            if (n()) {
                l.b("ReportEvent", "execute onHandleReceivedAdEvent()  needUploadRoutine ... upload ");
                h();
            }
        }
    }

    private void d(List<T> list) {
        if (list != null) {
            if (list.size() <= 45) {
                a("start and return, checkAndDeleteEvent local size:" + list.size() + "less than:" + 45);
                return;
            }
            int size = list.size() - 30;
            a("start checkAndDeleteEvent local size,deleteCnt:" + list.size() + "," + size);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add((k) list.get(i2));
            }
            list.removeAll(arrayList);
            a("end checkAndDeleteEvent local size:" + list.size());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006b A[LOOP:0: B:11:0x006b->B:14:0x0086, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
            r4 = this;
            java.lang.String r0 = "ReportEvent"
            java.lang.String r1 = "execute doRoutineUpload ... start "
            com.bytedance.sdk.component.utils.l.c(r0, r1)
            android.os.Handler r1 = r4.i
            r2 = 3
            r1.removeMessages(r2)
            android.os.Handler r1 = r4.i
            r2 = 2
            r1.removeMessages(r2)
            android.os.Handler r1 = r4.i
            r2 = 6
            r1.removeMessages(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "execute doRoutineUpload ... ListUtils.isEmpty(mCacheList) :"
            r1.append(r2)
            java.util.List<T> r2 = r4.f310e
            boolean r2 = com.bytedance.sdk.component.utils.j.a(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.l.c(r0, r1)
            java.util.List<T> r1 = r4.f310e
            boolean r1 = com.bytedance.sdk.component.utils.j.a(r1)
            if (r1 == 0) goto L_0x0045
            long r0 = java.lang.System.currentTimeMillis()
            r4.f311f = r0
            r4.k()
            return
        L_0x0045:
            com.bytedance.sdk.openadsdk.b.h$b r1 = r4.j
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x0056
            java.lang.String r1 = "execute doRoutineUpload ...no network, wait retry "
            com.bytedance.sdk.component.utils.l.c(r0, r1)
            r4.j()
            return
        L_0x0056:
            boolean r0 = r4.a()
            r1 = 1
            if (r0 == 0) goto L_0x0089
            java.util.List<T> r0 = r4.f310e
            java.util.HashMap r0 = r4.f(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x006b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r0.hasNext()
            r3 = r3 ^ r1
            boolean r2 = r4.b(r2, r3)
            if (r2 != 0) goto L_0x006b
            goto L_0x008e
        L_0x0089:
            java.util.List<T> r0 = r4.f310e
            r4.b(r0, r1)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.b.h.h():void");
    }

    private boolean b(List<T> list, boolean z) {
        i a2 = a(list);
        if (a2 == null) {
            return false;
        }
        if (a2.f321a) {
            l.c("ReportEvent", "doRoutineUpload success");
            e(list);
            a(z);
            return true;
        } else if (a(a2)) {
            l();
            return false;
        } else if (b(a2) || a(list, a2)) {
            e(list);
            a(true);
            return false;
        } else if (this.f312g) {
            return false;
        } else {
            j();
            return false;
        }
    }

    private void a(boolean z) {
        this.f311f = System.currentTimeMillis();
        o();
        if (z) {
            k();
        }
    }

    private void e(List<T> list) {
        this.f308c.a(list);
        this.f310e.removeAll(list);
    }

    private void i() {
        a(4, m());
    }

    private void j() {
        a(3, this.k.f317c);
    }

    private void k() {
        a(2, this.k.f316b);
    }

    private void a(int i2, long j2) {
        Message obtainMessage = this.i.obtainMessage();
        obtainMessage.what = i2;
        this.i.sendMessageDelayed(obtainMessage, j2);
    }

    private void l() {
        this.f312g = true;
        this.f308c.a(true);
        this.f310e.clear();
        this.i.removeMessages(3);
        this.i.removeMessages(2);
        i();
    }

    private long m() {
        return ((long) ((this.f313h % 3) + 1)) * this.k.f320f;
    }

    private static boolean a(i iVar) {
        return iVar.f322b == 509;
    }

    private boolean a(List<T> list, i iVar) {
        if (!c(list) && iVar.f322b >= 400 && iVar.f322b < 500) {
            return true;
        }
        return false;
    }

    private static boolean b(i iVar) {
        return iVar.f324d;
    }

    private boolean n() {
        return !this.f312g && (this.f310e.size() >= this.k.f315a || System.currentTimeMillis() - this.f311f >= this.k.f316b);
    }

    private void o() {
        this.f312g = false;
        this.f308c.a(false);
        this.f313h = 0;
        this.f308c.a(0);
        this.i.removeMessages(4);
    }

    private void a(String str) {
        l.c(f306a, str);
    }

    /* compiled from: AdEventThread */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final int f315a;

        /* renamed from: b  reason: collision with root package name */
        final long f316b;

        /* renamed from: c  reason: collision with root package name */
        final long f317c;

        /* renamed from: d  reason: collision with root package name */
        final int f318d;

        /* renamed from: e  reason: collision with root package name */
        final long f319e;

        /* renamed from: f  reason: collision with root package name */
        final long f320f;

        c(int i, long j, long j2, int i2, long j3, long j4) {
            this.f315a = i;
            this.f316b = j;
            this.f317c = j2;
            this.f318d = i2;
            this.f319e = j3;
            this.f320f = j4;
        }

        public static c a() {
            return new c(1, 120000, 15000, 5, 172800000, 300000);
        }

        public static c b() {
            return new c(3, 120000, 15000, 5, 172800000, 300000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r2 = (com.bytedance.sdk.openadsdk.b.a) r6.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.HashMap<java.lang.String, java.util.List<T>> f(java.util.List<T> r6) {
        /*
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
        L_0x0006:
            int r2 = r6.size()
            if (r1 >= r2) goto L_0x003c
            java.lang.Object r2 = r6.get(r1)
            boolean r2 = r2 instanceof com.bytedance.sdk.openadsdk.b.a
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r6.get(r1)
            com.bytedance.sdk.openadsdk.b.a r2 = (com.bytedance.sdk.openadsdk.b.a) r2
            org.json.JSONObject r3 = r2.b()
            if (r3 == 0) goto L_0x0039
            java.lang.String r4 = "app_log_url"
            java.lang.String r3 = r3.optString(r4)
            java.lang.Object r4 = r0.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x0036
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.put(r3, r4)
        L_0x0036:
            r4.add(r2)
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x0006
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.b.h.f(java.util.List):java.util.HashMap");
    }

    /* compiled from: AdEventThread */
    private static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<Handler> f314a;

        public a(Handler handler) {
            this.f314a = new WeakReference<>(handler);
        }

        public void run() {
            Handler handler;
            l.c(h.f306a, "EventTimerRunnable: run");
            WeakReference<Handler> weakReference = this.f314a;
            if (weakReference != null && weakReference.get() != null && (handler = (Handler) this.f314a.get()) != null) {
                handler.removeMessages(6);
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = 6;
                handler.sendMessage(obtainMessage);
                com.bytedance.sdk.openadsdk.core.k.c().postDelayed(this, h.l);
            }
        }
    }
}
