package com.bytedance.sdk.openadsdk.b;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.u;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: OpenAppSuccEvent */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static volatile p f344a;

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f345b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f346c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f347d = Executors.newCachedThreadPool();

    /* renamed from: e  reason: collision with root package name */
    private b f348e = b.a();

    /* renamed from: f  reason: collision with root package name */
    private Map<String, Object> f349f;

    public static p a() {
        if (f344a == null) {
            synchronized (p.class) {
                if (f344a == null) {
                    f344a = new p();
                }
            }
        }
        return f344a;
    }

    private p() {
        if (this.f345b == null) {
            HandlerThread handlerThread = new HandlerThread("OpenAppSuccEvent_HandlerThread", 10);
            this.f345b = handlerThread;
            handlerThread.start();
        }
        this.f346c = new Handler(this.f345b.getLooper(), new Handler.Callback() {
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.bytedance.sdk.openadsdk.b.p$a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean handleMessage(android.os.Message r3) {
                /*
                    r2 = this;
                    int r0 = r3.what
                    r1 = 100
                    if (r0 != r1) goto L_0x001d
                    r0 = 0
                    java.lang.Object r1 = r3.obj
                    if (r1 == 0) goto L_0x0016
                    java.lang.Object r1 = r3.obj
                    boolean r1 = r1 instanceof com.bytedance.sdk.openadsdk.b.p.a
                    if (r1 == 0) goto L_0x0016
                    java.lang.Object r3 = r3.obj
                    r0 = r3
                    com.bytedance.sdk.openadsdk.b.p$a r0 = (com.bytedance.sdk.openadsdk.b.p.a) r0
                L_0x0016:
                    if (r0 == 0) goto L_0x001d
                    com.bytedance.sdk.openadsdk.b.p r3 = com.bytedance.sdk.openadsdk.b.p.this
                    r3.b(r0)
                L_0x001d:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.b.p.AnonymousClass1.handleMessage(android.os.Message):boolean");
            }
        });
    }

    public void a(n nVar, String str) {
        Message obtainMessage = this.f346c.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = a.a(nVar, str, this.f349f);
        obtainMessage.sendToTarget();
    }

    private void a(a aVar) {
        if (aVar != null) {
            aVar.b();
            if (aVar.a() * this.f348e.f356a > this.f348e.f357b) {
                c(aVar.a(false));
                return;
            }
            Message obtainMessage = this.f346c.obtainMessage();
            obtainMessage.what = 100;
            obtainMessage.obj = aVar;
            this.f346c.sendMessageDelayed(obtainMessage, (long) this.f348e.f356a);
        }
    }

    /* access modifiers changed from: private */
    public void b(a aVar) {
        if (aVar != null) {
            Context a2 = m.a();
            if (u.c(a2, a2.getPackageName())) {
                a(aVar);
            } else {
                c(aVar.a(true));
            }
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            this.f347d.execute(aVar);
        }
    }

    /* compiled from: OpenAppSuccEvent */
    private static class a implements Serializable, Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f351a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        public final AtomicBoolean f352b = new AtomicBoolean(false);

        /* renamed from: c  reason: collision with root package name */
        public n f353c;

        /* renamed from: d  reason: collision with root package name */
        public String f354d;

        /* renamed from: e  reason: collision with root package name */
        public Map<String, Object> f355e;

        public static a a(n nVar, String str, Map<String, Object> map) {
            return new a(nVar, str, map);
        }

        public a() {
        }

        public a(n nVar, String str, Map<String, Object> map) {
            this.f353c = nVar;
            this.f354d = str;
            this.f355e = map;
        }

        public a a(boolean z) {
            this.f352b.set(z);
            return this;
        }

        public int a() {
            return this.f351a.get();
        }

        public void b() {
            this.f351a.incrementAndGet();
        }

        public void run() {
            if (this.f353c == null || TextUtils.isEmpty(this.f354d)) {
                l.a("materialMeta or eventTag is null, pls check");
            } else {
                e.d(m.a(), this.f353c, this.f354d, this.f352b.get() ? "dpl_success" : "dpl_failed", this.f355e);
            }
        }
    }

    /* compiled from: OpenAppSuccEvent */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f356a = 500;

        /* renamed from: b  reason: collision with root package name */
        public int f357b = 5000;

        public static b a() {
            return new b();
        }
    }
}
