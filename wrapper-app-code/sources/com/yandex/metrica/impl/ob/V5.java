package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

public class V5 {

    /* renamed from: a  reason: collision with root package name */
    private final L3 f5206a;

    /* renamed from: b  reason: collision with root package name */
    private final C0324d6 f5207b;

    /* renamed from: c  reason: collision with root package name */
    private final X5 f5208c;

    /* renamed from: d  reason: collision with root package name */
    private long f5209d;

    /* renamed from: e  reason: collision with root package name */
    private long f5210e;

    /* renamed from: f  reason: collision with root package name */
    private AtomicLong f5211f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5212g;

    /* renamed from: h  reason: collision with root package name */
    private volatile a f5213h;
    private long i;
    private long j;
    private SystemTimeProvider k;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f5214a;

        /* renamed from: b  reason: collision with root package name */
        private final String f5215b;

        /* renamed from: c  reason: collision with root package name */
        private final String f5216c;

        /* renamed from: d  reason: collision with root package name */
        private final String f5217d;

        /* renamed from: e  reason: collision with root package name */
        private final String f5218e;

        /* renamed from: f  reason: collision with root package name */
        private final int f5219f;

        /* renamed from: g  reason: collision with root package name */
        private final int f5220g;

        a(JSONObject jSONObject) {
            this.f5214a = jSONObject.optString("analyticsSdkVersionName", (String) null);
            this.f5215b = jSONObject.optString("kitBuildNumber", (String) null);
            this.f5216c = jSONObject.optString("appVer", (String) null);
            this.f5217d = jSONObject.optString("appBuild", (String) null);
            this.f5218e = jSONObject.optString("osVer", (String) null);
            this.f5219f = jSONObject.optInt("osApiLev", -1);
            this.f5220g = jSONObject.optInt("attribution_id", 0);
        }

        /* access modifiers changed from: package-private */
        public boolean a(Lg lg) {
            lg.getClass();
            return TextUtils.equals("5.3.0", this.f5214a) && TextUtils.equals("45003240", this.f5215b) && TextUtils.equals(lg.f(), this.f5216c) && TextUtils.equals(lg.b(), this.f5217d) && TextUtils.equals(lg.o(), this.f5218e) && this.f5219f == lg.n() && this.f5220g == lg.C();
        }

        public String toString() {
            return "SessionRequestParams{mKitVersionName='" + this.f5214a + '\'' + ", mKitBuildNumber='" + this.f5215b + '\'' + ", mAppVersion='" + this.f5216c + '\'' + ", mAppBuild='" + this.f5217d + '\'' + ", mOsVersion='" + this.f5218e + '\'' + ", mApiLevel=" + this.f5219f + ", mAttributionId=" + this.f5220g + '}';
        }
    }

    V5(L3 l3, C0324d6 d6Var, X5 x5, SystemTimeProvider systemTimeProvider) {
        this.f5206a = l3;
        this.f5207b = d6Var;
        this.f5208c = x5;
        this.k = systemTimeProvider;
        g();
    }

    private void g() {
        this.f5210e = this.f5208c.a(this.k.elapsedRealtime());
        this.f5209d = this.f5208c.c(-1);
        this.f5211f = new AtomicLong(this.f5208c.b(0));
        this.f5212g = this.f5208c.a(true);
        long e2 = this.f5208c.e(0);
        this.i = e2;
        this.j = this.f5208c.d(e2 - this.f5210e);
    }

    /* access modifiers changed from: package-private */
    public long a(long j2) {
        C0324d6 d6Var = this.f5207b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j2 - this.f5210e);
        this.j = seconds;
        ((C0349e6) d6Var).b(seconds);
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return Math.max(this.i - TimeUnit.MILLISECONDS.toSeconds(this.f5210e), this.j);
    }

    public long c() {
        return this.f5209d;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public long e() {
        long andIncrement = this.f5211f.getAndIncrement();
        ((C0349e6) this.f5207b).c(this.f5211f.get()).b();
        return andIncrement;
    }

    /* access modifiers changed from: protected */
    public C0374f6 f() {
        return this.f5208c.a();
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.f5212g && this.f5209d > 0;
    }

    /* access modifiers changed from: package-private */
    public synchronized void i() {
        ((C0349e6) this.f5207b).a();
        this.f5213h = null;
    }

    public String toString() {
        return "Session{mId=" + this.f5209d + ", mInitTime=" + this.f5210e + ", mCurrentReportId=" + this.f5211f + ", mSessionRequestParams=" + this.f5213h + ", mSleepStartSeconds=" + this.i + '}';
    }

    /* access modifiers changed from: package-private */
    public boolean b(long j2) {
        boolean z = this.f5209d >= 0;
        boolean a2 = a();
        long elapsedRealtime = this.k.elapsedRealtime();
        long j3 = this.i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        boolean z2 = !(((timeUnit.toSeconds(elapsedRealtime) > j3 ? 1 : (timeUnit.toSeconds(elapsedRealtime) == j3 ? 0 : -1)) < 0) || timeUnit.toSeconds(j2) - j3 >= ((long) this.f5208c.a(this.f5206a.m().N())) || timeUnit.toSeconds(j2 - this.f5210e) >= Y5.f5367b);
        if (!z || !a2 || !z2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void c(long j2) {
        C0324d6 d6Var = this.f5207b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j2);
        this.i = seconds;
        ((C0349e6) d6Var).e(seconds).b();
    }

    public void a(boolean z) {
        if (this.f5212g != z) {
            this.f5212g = z;
            ((C0349e6) this.f5207b).a(z).b();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:3|4|(3:6|7|(1:9))|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a() {
        /*
            r4 = this;
            com.yandex.metrica.impl.ob.V5$a r0 = r4.f5213h
            if (r0 != 0) goto L_0x0038
            monitor-enter(r4)
            com.yandex.metrica.impl.ob.V5$a r0 = r4.f5213h     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0033
            com.yandex.metrica.impl.ob.L3 r0 = r4.f5206a     // Catch:{ all -> 0x0033 }
            com.yandex.metrica.impl.ob.L7 r0 = r0.i()     // Catch:{ all -> 0x0033 }
            long r1 = r4.f5209d     // Catch:{ all -> 0x0033 }
            com.yandex.metrica.impl.ob.X5 r3 = r4.f5208c     // Catch:{ all -> 0x0033 }
            com.yandex.metrica.impl.ob.f6 r3 = r3.a()     // Catch:{ all -> 0x0033 }
            android.content.ContentValues r0 = r0.a((long) r1, (com.yandex.metrica.impl.ob.C0374f6) r3)     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "report_request_parameters"
            java.lang.String r0 = r0.getAsString(r1)     // Catch:{ all -> 0x0033 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0033 }
            if (r1 != 0) goto L_0x0033
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0033 }
            r1.<init>(r0)     // Catch:{ all -> 0x0033 }
            com.yandex.metrica.impl.ob.V5$a r0 = new com.yandex.metrica.impl.ob.V5$a     // Catch:{ all -> 0x0033 }
            r0.<init>(r1)     // Catch:{ all -> 0x0033 }
            r4.f5213h = r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            goto L_0x0038
        L_0x0035:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            throw r0
        L_0x0038:
            com.yandex.metrica.impl.ob.V5$a r0 = r4.f5213h
            r1 = 0
            if (r0 == 0) goto L_0x0047
            com.yandex.metrica.impl.ob.L3 r1 = r4.f5206a
            com.yandex.metrica.impl.ob.Lg r1 = r1.m()
            boolean r1 = r0.a(r1)
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.V5.a():boolean");
    }
}
