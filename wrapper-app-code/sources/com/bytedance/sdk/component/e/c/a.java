package com.bytedance.sdk.component.e.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.e.a;
import com.bytedance.sdk.component.e.b.b;
import com.bytedance.sdk.component.e.b.c;
import com.bytedance.sdk.component.e.d.e;
import com.bytedance.sdk.component.e.d.f;
import com.bytedance.sdk.component.e.d.g;
import com.onesignal.OneSignalDbContract;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: AppConfig */
public class a implements g.a {

    /* renamed from: b  reason: collision with root package name */
    private static a f19146b;

    /* renamed from: a  reason: collision with root package name */
    final g f19147a = new g(Looper.getMainLooper(), this);

    /* renamed from: c  reason: collision with root package name */
    private final boolean f19148c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f19149d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f19150e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f19151f = false;

    /* renamed from: g  reason: collision with root package name */
    private long f19152g = 0;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public long f19153h = 0;
    private ThreadPoolExecutor i = null;
    /* access modifiers changed from: private */
    public AtomicBoolean j = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public final Context k;
    private volatile boolean l = false;
    private com.bytedance.sdk.component.e.a m;
    private int n;

    public a(Context context, int i2) {
        this.k = context;
        this.f19148c = f.b(context);
        this.n = i2;
    }

    private a(Context context, boolean z) {
        this.k = context;
        this.f19148c = z;
    }

    public static a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (f19146b == null) {
                f19146b = new a(context.getApplicationContext(), f.b(context));
            }
            aVar = f19146b;
        }
        return aVar;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return "https://" + str + "/get_domains/v4/";
    }

    /* access modifiers changed from: private */
    public void a(final int i2) {
        String[] f2 = f();
        if (f2 == null || f2.length <= i2) {
            b(102);
            return;
        }
        String str = f2[i2];
        if (TextUtils.isEmpty(str)) {
            b(102);
            return;
        }
        try {
            String a2 = a(str);
            if (TextUtils.isEmpty(a2)) {
                b(102);
                return;
            }
            b c2 = i().c();
            c2.a(a2);
            a(c2);
            c2.a(new com.bytedance.sdk.component.e.a.a() {
                public void a(c cVar, com.bytedance.sdk.component.e.b bVar) {
                    JSONObject jSONObject;
                    if (bVar == null || !bVar.f()) {
                        a.this.a(i2 + 1);
                        return;
                    }
                    String str = null;
                    try {
                        jSONObject = new JSONObject(bVar.d());
                    } catch (Exception unused) {
                        jSONObject = null;
                    }
                    if (jSONObject == null) {
                        a.this.a(i2 + 1);
                        return;
                    }
                    try {
                        str = jSONObject.getString(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
                    } catch (Exception unused2) {
                    }
                    if (!"success".equals(str)) {
                        a.this.a(i2 + 1);
                        return;
                    }
                    try {
                        if (a.this.a((Object) jSONObject)) {
                            a.this.b(101);
                        } else {
                            a.this.a(i2 + 1);
                        }
                    } catch (Exception unused3) {
                    }
                }

                public void a(c cVar, IOException iOException) {
                    a.this.a(i2 + 1);
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.e.d.b.b("AppConfig", "try app config exception: " + th);
        }
    }

    private void a(b bVar) {
        if (bVar != null) {
            Address address = null;
            if (g.a().a(this.n).d() != null) {
                address = g.a().a(this.n).d().a(this.k);
            }
            if (address != null && address.hasLatitude() && address.hasLongitude()) {
                bVar.a("latitude", address.getLatitude() + "");
                bVar.a("longitude", address.getLongitude() + "");
                String locality = address.getLocality();
                if (!TextUtils.isEmpty(locality)) {
                    bVar.a("city", Uri.encode(locality));
                }
            }
            if (this.f19149d) {
                bVar.a("force", "1");
            }
            try {
                bVar.a("abi", Build.VERSION.SDK_INT < 21 ? Build.CPU_ABI : Build.SUPPORTED_ABIS[0]);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (g.a().a(this.n).d() != null) {
                bVar.a("aid", g.a().a(this.n).d().a() + "");
                bVar.a("device_platform", g.a().a(this.n).d().c());
                bVar.a("channel", g.a().a(this.n).d().b());
                bVar.a("version_code", g.a().a(this.n).d().d() + "");
                bVar.a("custom_info_1", g.a().a(this.n).d().e());
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean a(Object obj) throws Exception {
        JSONObject jSONObject;
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            jSONObject = new JSONObject(str);
            if (!"success".equals(jSONObject.getString(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE))) {
                return false;
            }
        } else {
            jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        synchronized (this) {
            SharedPreferences.Editor edit = this.k.getSharedPreferences("ss_app_config", 0).edit();
            edit.putLong("last_refresh_time", System.currentTimeMillis());
            edit.apply();
        }
        if (g.a().a(this.n).h() == null) {
            return true;
        }
        g.a().a(this.n).h().a(jSONObject2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'J';
        r1 = '7';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x000f;
            case 56: goto L_0x0026;
            case 57: goto L_0x0026;
            default: goto L_0x000e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = r2.toCharArray();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0 >= r2.length) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r2[r0] = (char) (r2[r0] ^ r0);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.lang.String(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a1657027613243dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 73
            r1 = 96
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0026;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0000;
                case 95: goto L_0x0026;
                case 96: goto L_0x0026;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x000f;
                case 56: goto L_0x0026;
                case 57: goto L_0x0026;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0000
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 74
            r1 = 55
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.c.a.a1657027613243dc(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: private */
    public void b(int i2) {
        g gVar = this.f19147a;
        if (gVar != null) {
            gVar.sendEmptyMessage(i2);
        }
    }

    public static void b(Context context) {
        a aVar = f19146b;
        if (aVar == null) {
            return;
        }
        if (f.b(context)) {
            aVar.a(true);
        } else {
            aVar.a();
        }
    }

    private void c(boolean z) {
        if (!this.f19151f) {
            if (this.f19150e) {
                this.f19150e = false;
                this.f19152g = 0;
                this.f19153h = 0;
            }
            long j2 = z ? 10800000 : 43200000;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f19152g <= j2) {
                return;
            }
            if (currentTimeMillis - this.f19153h > 120000 || !this.l) {
                c();
            }
        }
    }

    private boolean h() {
        String[] f2 = f();
        if (!(f2 == null || f2.length == 0)) {
            a(0);
        }
        return false;
    }

    private com.bytedance.sdk.component.e.a i() {
        if (this.m == null) {
            this.m = new a.C0232a().a(10, TimeUnit.SECONDS).b(10, TimeUnit.SECONDS).c(10, TimeUnit.SECONDS).a();
        }
        return this.m;
    }

    public void a() {
        a(false);
    }

    public void a(Message message) {
        int i2 = message.what;
        if (i2 == 101) {
            this.f19151f = false;
            this.f19152g = System.currentTimeMillis();
            com.bytedance.sdk.component.e.d.b.b("TNCManager", "doRefresh, succ");
            if (this.f19150e) {
                a();
            }
        } else if (i2 == 102) {
            this.f19151f = false;
            if (this.f19150e) {
                a();
            }
            com.bytedance.sdk.component.e.d.b.b("TNCManager", "doRefresh, error");
        } else {
            return;
        }
        this.j.set(false);
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        this.i = threadPoolExecutor;
    }

    public synchronized void a(boolean z) {
        if (this.f19148c) {
            c(z);
        } else if (this.f19152g <= 0) {
            try {
                g().execute(new Runnable() {
                    public void run() {
                        a.this.b();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void b() {
        if (System.currentTimeMillis() - this.f19152g > 3600000) {
            this.f19152g = System.currentTimeMillis();
            try {
                if (g.a().a(this.n).h() != null) {
                    g.a().a(this.n).h().b();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        com.bytedance.sdk.component.e.d.b.b("TNCManager", "doRefresh, actual request");
        d();
        this.f19151f = true;
        if (!z) {
            this.f19147a.sendEmptyMessage(102);
            return;
        }
        try {
            h();
        } catch (Exception unused) {
            this.j.set(false);
        }
    }

    public boolean c() {
        com.bytedance.sdk.component.e.d.b.b("TNCManager", "doRefresh: updating state " + this.j.get());
        g().execute(new Runnable() {
            public void run() {
                boolean a2 = e.a(a.this.k);
                if (a2) {
                    long unused = a.this.f19153h = System.currentTimeMillis();
                    if (!a.this.j.compareAndSet(false, true)) {
                        com.bytedance.sdk.component.e.d.b.b("TNCManager", "doRefresh, already running");
                    } else {
                        a.this.b(a2);
                    }
                }
            }
        });
        return true;
    }

    public synchronized void d() {
        if (!this.l) {
            this.l = true;
            long j2 = this.k.getSharedPreferences("ss_app_config", 0).getLong("last_refresh_time", 0);
            long currentTimeMillis = System.currentTimeMillis();
            if (j2 > currentTimeMillis) {
                j2 = currentTimeMillis;
            }
            this.f19152g = j2;
            try {
                if (g.a().a(this.n).h() != null) {
                    g.a().a(this.n).h().a();
                }
            } catch (Exception unused) {
            }
        }
    }

    public void e() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                if (this.f19148c) {
                    d();
                } else {
                    b();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public String[] f() {
        String[] f2 = g.a().a(this.n).d() != null ? g.a().a(this.n).d().f() : null;
        return (f2 == null || f2.length <= 0) ? new String[0] : f2;
    }

    public ThreadPoolExecutor g() {
        Class<a> cls = a.class;
        if (this.i == null) {
            synchronized (cls) {
                if (this.i == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    this.i = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return this.i;
    }
}
