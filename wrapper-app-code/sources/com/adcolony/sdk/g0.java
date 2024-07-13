package com.adcolony.sdk;

import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.onesignal.OneSignalDbContract;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

class g0 {

    /* renamed from: f  reason: collision with root package name */
    static boolean f10064f = false;

    /* renamed from: g  reason: collision with root package name */
    static int f10065g = 3;

    /* renamed from: h  reason: collision with root package name */
    static int f10066h = 1;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public f1 f10067a = c0.b();

    /* renamed from: b  reason: collision with root package name */
    private e1 f10068b = null;

    /* renamed from: c  reason: collision with root package name */
    private ExecutorService f10069c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<Runnable> f10070d = new ConcurrentLinkedQueue();

    /* renamed from: e  reason: collision with root package name */
    s0 f10071e;

    class a implements j0 {
        a() {
        }

        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 0, c0.h(h0Var.a(), OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE), true);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f10073a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f10074b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10075c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f10076d;

        b(int i, String str, int i2, boolean z) {
            this.f10073a = i;
            this.f10074b = str;
            this.f10075c = i2;
            this.f10076d = z;
        }

        public void run() {
            g0.this.a(this.f10073a, this.f10074b, this.f10075c);
            int i = 0;
            while (i <= this.f10074b.length() / TTAdSdk.INIT_LOCAL_FAIL_CODE) {
                int i2 = i * TTAdSdk.INIT_LOCAL_FAIL_CODE;
                i++;
                int min = Math.min(i * TTAdSdk.INIT_LOCAL_FAIL_CODE, this.f10074b.length());
                if (this.f10075c == 3) {
                    g0 g0Var = g0.this;
                    if (g0Var.a(c0.f(g0Var.f10067a, Integer.toString(this.f10073a)), 3, this.f10076d)) {
                        Log.d("AdColony [TRACE]", this.f10074b.substring(i2, min));
                    }
                }
                if (this.f10075c == 2) {
                    g0 g0Var2 = g0.this;
                    if (g0Var2.a(c0.f(g0Var2.f10067a, Integer.toString(this.f10073a)), 2, this.f10076d)) {
                        Log.i("AdColony [INFO]", this.f10074b.substring(i2, min));
                    }
                }
                if (this.f10075c == 1) {
                    g0 g0Var3 = g0.this;
                    if (g0Var3.a(c0.f(g0Var3.f10067a, Integer.toString(this.f10073a)), 1, this.f10076d)) {
                        Log.w("AdColony [WARNING]", this.f10074b.substring(i2, min));
                    }
                }
                if (this.f10075c == 0) {
                    g0 g0Var4 = g0.this;
                    if (g0Var4.a(c0.f(g0Var4.f10067a, Integer.toString(this.f10073a)), 0, this.f10076d)) {
                        Log.e("AdColony [ERROR]", this.f10074b.substring(i2, min));
                    }
                }
                if (this.f10075c == -1 && g0.f10065g >= -1) {
                    Log.e("AdColony [FATAL]", this.f10074b.substring(i2, min));
                }
            }
        }
    }

    class c implements j0 {
        c(g0 g0Var) {
        }

        public void a(h0 h0Var) {
            g0.f10065g = c0.d(h0Var.a(), AppLovinEventTypes.USER_COMPLETED_LEVEL);
        }
    }

    class d implements j0 {
        d() {
        }

        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 3, c0.h(h0Var.a(), OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE), false);
        }
    }

    class e implements j0 {
        e() {
        }

        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 3, c0.h(h0Var.a(), OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE), true);
        }
    }

    class f implements j0 {
        f() {
        }

        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 2, c0.h(h0Var.a(), OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE), false);
        }
    }

    class g implements j0 {
        g() {
        }

        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 2, c0.h(h0Var.a(), OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE), true);
        }
    }

    class h implements j0 {
        h() {
        }

        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 1, c0.h(h0Var.a(), OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE), false);
        }
    }

    class i implements j0 {
        i() {
        }

        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 1, c0.h(h0Var.a(), OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE), true);
        }
    }

    class j implements j0 {
        j() {
        }

        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 0, c0.h(h0Var.a(), OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE), false);
        }
    }

    g0() {
    }

    /* access modifiers changed from: package-private */
    public void b(int i2, int i3, String str, boolean z) {
        if (!a(a(i2, i3, str, z))) {
            synchronized (this.f10070d) {
                this.f10070d.add(a(i2, i3, str, z));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        a.a("Log.set_log_level", (j0) new c(this));
        a.a("Log.public.trace", (j0) new d());
        a.a("Log.private.trace", (j0) new e());
        a.a("Log.public.info", (j0) new f());
        a.a("Log.private.info", (j0) new g());
        a.a("Log.public.warning", (j0) new h());
        a.a("Log.private.warning", (j0) new i());
        a.a("Log.public.error", (j0) new j());
        a.a("Log.private.error", (j0) new a());
    }

    /* access modifiers changed from: package-private */
    public void d() {
        ExecutorService executorService = this.f10069c;
        if (executorService == null || executorService.isShutdown() || this.f10069c.isTerminated()) {
            this.f10069c = Executors.newSingleThreadExecutor();
        }
        synchronized (this.f10070d) {
            while (!this.f10070d.isEmpty()) {
                a(this.f10070d.poll());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, String str, boolean z) {
        b(0, i2, str, z);
    }

    private Runnable a(int i2, int i3, String str, boolean z) {
        return new b(i2, str, i3, z);
    }

    /* access modifiers changed from: package-private */
    public boolean a(f1 f1Var, int i2, boolean z) {
        int d2 = c0.d(f1Var, "print_level");
        boolean b2 = c0.b(f1Var, "log_private");
        if (f1Var.b()) {
            d2 = f10065g;
            b2 = f10064f;
        }
        return (!z || b2) && d2 != 4 && d2 >= i2;
    }

    /* access modifiers changed from: package-private */
    public void b(e1 e1Var) {
        this.f10067a = a(e1Var);
    }

    /* access modifiers changed from: package-private */
    public e1 b() {
        return this.f10068b;
    }

    /* access modifiers changed from: package-private */
    public boolean a(f1 f1Var, int i2) {
        int d2 = c0.d(f1Var, "send_level");
        if (f1Var.b()) {
            d2 = f10066h;
        }
        return d2 >= i2 && d2 != 4;
    }

    /* access modifiers changed from: package-private */
    public void a(HashMap<String, Object> hashMap) {
        try {
            s0 s0Var = new s0(new d0(new URL("https://wd.adcolony.com/logs")), Executors.newSingleThreadScheduledExecutor(), hashMap);
            this.f10071e = s0Var;
            s0Var.a(5, TimeUnit.SECONDS);
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public void a(int i2, String str, int i3) {
        if (this.f10071e != null) {
            if (i3 == 3 && a(c0.f(this.f10067a, Integer.toString(i2)), 3)) {
                this.f10071e.a(str);
            } else if (i3 == 2 && a(c0.f(this.f10067a, Integer.toString(i2)), 2)) {
                this.f10071e.c(str);
            } else if (i3 == 1 && a(c0.f(this.f10067a, Integer.toString(i2)), 1)) {
                this.f10071e.d(str);
            } else if (i3 == 0 && a(c0.f(this.f10067a, Integer.toString(i2)), 0)) {
                this.f10071e.b(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public f1 a(e1 e1Var) {
        f1 b2 = c0.b();
        for (int i2 = 0; i2 < e1Var.b(); i2++) {
            f1 a2 = c0.a(e1Var, i2);
            c0.a(b2, Integer.toString(c0.d(a2, OSOutcomeConstants.OUTCOME_ID)), a2);
        }
        return b2;
    }

    private boolean a(Runnable runnable) {
        try {
            ExecutorService executorService = this.f10069c;
            if (executorService == null || executorService.isShutdown() || this.f10069c.isTerminated()) {
                return false;
            }
            this.f10069c.submit(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting log to executor service.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(e1 e1Var) {
        if (e1Var != null) {
            e1Var.b(AppLovinEventTypes.USER_COMPLETED_LEVEL);
            e1Var.b(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        }
        this.f10068b = e1Var;
    }

    /* access modifiers changed from: package-private */
    public s0 a() {
        return this.f10071e;
    }
}
