package com.applovin.impl.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final int f15523a = ((int) TimeUnit.SECONDS.toMillis(30));
    private static final f m = new f();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final AtomicLong f15524b = new AtomicLong(0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f15525c;

    /* renamed from: d  reason: collision with root package name */
    private final HandlerThread f15526d = new HandlerThread("applovin-anr-detector");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Handler f15527e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f15528f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f15529g = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    private n f15530h;
    /* access modifiers changed from: private */
    public Thread i;
    /* access modifiers changed from: private */
    public long j = TimeUnit.SECONDS.toMillis(4);
    /* access modifiers changed from: private */
    public long k = TimeUnit.SECONDS.toMillis(3);
    /* access modifiers changed from: private */
    public long l = TimeUnit.SECONDS.toMillis(3);

    private class a implements Runnable {
        private a() {
        }

        public void run() {
            if (!f.this.f15528f.get()) {
                long currentTimeMillis = System.currentTimeMillis() - f.this.f15524b.get();
                if (currentTimeMillis < 0 || currentTimeMillis > f.this.j) {
                    f.this.a();
                    f.this.b();
                }
                f.this.f15527e.postDelayed(this, f.this.l);
            }
        }
    }

    private class b implements Runnable {
        private b() {
        }

        public void run() {
            if (!f.this.f15528f.get()) {
                f.this.f15524b.set(System.currentTimeMillis());
                f.this.f15525c.postDelayed(this, f.this.k);
            }
        }
    }

    private f() {
    }

    private static String a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* access modifiers changed from: private */
    public void a() {
        if (this.f15529g.get()) {
            this.f15528f.set(true);
        }
    }

    public static void a(n nVar) {
        if (nVar == null) {
            return;
        }
        if (!((Boolean) nVar.a(com.applovin.impl.sdk.c.b.fa)).booleanValue() || Utils.isPubInDebugMode(nVar.P(), nVar)) {
            m.a();
        } else {
            m.b(nVar);
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) c().openConnection();
            httpURLConnection.setConnectTimeout(f15523a);
            httpURLConnection.setReadTimeout(f15523a);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(false);
            int responseCode = httpURLConnection.getResponseCode();
            Log.d("applovin-anr-detector", "ANR reported with code " + responseCode);
        } catch (Throwable th) {
            Log.w("applovin-anr-detector", "Failed to report ANR", th);
        }
    }

    private void b(n nVar) {
        if (this.f15529g.compareAndSet(false, true)) {
            this.f15530h = nVar;
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    Thread unused = f.this.i = Thread.currentThread();
                }
            });
            this.j = ((Long) nVar.a(com.applovin.impl.sdk.c.b.fb)).longValue();
            this.k = ((Long) nVar.a(com.applovin.impl.sdk.c.b.fc)).longValue();
            this.l = ((Long) nVar.a(com.applovin.impl.sdk.c.b.fd)).longValue();
            this.f15525c = new Handler(nVar.P().getMainLooper());
            this.f15526d.start();
            this.f15525c.post(new b());
            Handler handler = new Handler(this.f15526d.getLooper());
            this.f15527e = handler;
            handler.postDelayed(new a(), this.l / 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[SYNTHETIC, Splitter:B:13:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036 A[Catch:{ MalformedURLException -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0107 A[Catch:{ MalformedURLException -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0117 A[Catch:{ MalformedURLException -> 0x0190 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.net.URL c() {
        /*
            r11 = this;
            java.lang.String r0 = ""
            com.applovin.impl.sdk.n r1 = r11.f15530h
            android.content.Context r1 = r1.P()
            r2 = 0
            r3 = 0
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x0017 }
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r1, r3)     // Catch:{ all -> 0x0018 }
            goto L_0x0019
        L_0x0017:
            r1 = r0
        L_0x0018:
            r4 = r2
        L_0x0019:
            com.applovin.impl.sdk.n r5 = r11.f15530h     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.t r5 = r5.ah()     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.Object r5 = r5.c()     // Catch:{ MalformedURLException -> 0x0190 }
            boolean r6 = r5 instanceof com.applovin.impl.sdk.ad.e     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r7 = "None"
            if (r6 == 0) goto L_0x0036
            com.applovin.impl.sdk.ad.e r5 = (com.applovin.impl.sdk.ad.e) r5     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r6 = "AppLovin"
            long r8 = r5.getAdIdNumber()     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r5 = java.lang.Long.toString(r8)     // Catch:{ MalformedURLException -> 0x0190 }
            goto L_0x0047
        L_0x0036:
            boolean r6 = r5 instanceof com.applovin.impl.mediation.a.a     // Catch:{ MalformedURLException -> 0x0190 }
            if (r6 == 0) goto L_0x0045
            com.applovin.impl.mediation.a.a r5 = (com.applovin.impl.mediation.a.a) r5     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r6 = r5.getNetworkName()     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r5 = r5.getCreativeId()     // Catch:{ MalformedURLException -> 0x0190 }
            goto L_0x0047
        L_0x0045:
            r5 = r7
            r6 = r5
        L_0x0047:
            java.lang.Thread r8 = r11.i     // Catch:{ MalformedURLException -> 0x0190 }
            if (r8 == 0) goto L_0x0078
            java.lang.Thread r8 = r11.i     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.StackTraceElement[] r8 = r8.getStackTrace()     // Catch:{ MalformedURLException -> 0x0190 }
            int r8 = r8.length     // Catch:{ MalformedURLException -> 0x0190 }
            if (r8 <= 0) goto L_0x0078
            java.lang.Thread r7 = r11.i     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.StackTraceElement[] r7 = r7.getStackTrace()     // Catch:{ MalformedURLException -> 0x0190 }
            r7 = r7[r3]     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0190 }
            r8.<init>()     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r9 = r7.getClassName()     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r9 = "."
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r7 = r7.getMethodName()     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r7)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r7 = r8.toString()     // Catch:{ MalformedURLException -> 0x0190 }
        L_0x0078:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0190 }
            r8.<init>()     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.n r9 = r11.f15530h     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.c.b<java.lang.String> r10 = com.applovin.impl.sdk.c.b.bi     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.Object r9 = r9.a(r10)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r9 = "?type=anr&platform=android&package_name="
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = "&applovin_random_token="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.n r1 = r11.f15530h     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = r1.p()     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = "&compass_random_token="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.n r1 = r11.f15530h     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = r1.o()     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = "&model="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = "&brand="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = "&brand_name="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = "&hardware="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = "&revision="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = android.os.Build.DEVICE     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = "&app_version="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            if (r4 == 0) goto L_0x0109
            java.lang.String r0 = r4.versionName     // Catch:{ MalformedURLException -> 0x0190 }
        L_0x0109:
            java.lang.String r0 = a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&app_version_code="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            if (r4 == 0) goto L_0x0119
            int r3 = r4.versionCode     // Catch:{ MalformedURLException -> 0x0190 }
        L_0x0119:
            r8.append(r3)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&os="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&api_level="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&sdk_version="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = com.applovin.sdk.AppLovinSdk.VERSION     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&fs_ad_network="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = a((java.lang.String) r6)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&fs_ad_creative_id="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = a((java.lang.String) r5)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&top_main_method="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = a((java.lang.String) r7)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&aei="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.n r0 = r11.f15530h     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.c.b<java.lang.Integer> r1 = com.applovin.impl.sdk.c.b.au     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.Object r0 = r0.a(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&mei="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.n r0 = r11.f15530h     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.c.b<java.lang.Integer> r1 = com.applovin.impl.sdk.c.b.av     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.Object r0 = r0.a(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = r8.toString()     // Catch:{ MalformedURLException -> 0x0190 }
            java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0190 }
            r1.<init>(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            return r1
        L_0x0190:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.f.c():java.net.URL");
    }
}
