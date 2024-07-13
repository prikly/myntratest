package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.e.b.c;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.b;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.i.d;
import com.bytedance.sdk.openadsdk.utils.u;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: RewardVideoCache */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static volatile g f738a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f739b;

    /* renamed from: c  reason: collision with root package name */
    private final j f740c;

    /* renamed from: d  reason: collision with root package name */
    private Map<n, Long> f741d = Collections.synchronizedMap(new HashMap());

    /* compiled from: RewardVideoCache */
    interface a<T> {
        void a(boolean z, T t);
    }

    public void a(String str) {
        this.f740c.d(str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|(2:5|6)(1:7)|8|(2:14|(5:16|17|18|(2:20|44)(2:21|43)|22))|24|25|(1:52)(4:35|(5:37|38|39|46|40)|45|53)) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0075 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097 A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r9 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = "shared_prefs"
            r3 = 24
            if (r1 < r3) goto L_0x0015
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0075 }
            android.content.Context r4 = r9.f739b     // Catch:{ all -> 0x0075 }
            java.io.File r4 = r4.getDataDir()     // Catch:{ all -> 0x0075 }
            r1.<init>(r4, r2)     // Catch:{ all -> 0x0075 }
            goto L_0x002b
        L_0x0015:
            android.content.Context r1 = r9.f739b     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = "1"
            java.io.File r1 = r1.getDatabasePath(r4)     // Catch:{ all -> 0x0075 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0075 }
            java.io.File r1 = r1.getParentFile()     // Catch:{ all -> 0x0075 }
            java.io.File r1 = r1.getParentFile()     // Catch:{ all -> 0x0075 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0075 }
            r1 = r4
        L_0x002b:
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0075
            boolean r2 = r1.isDirectory()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0075
            com.bytedance.sdk.openadsdk.component.reward.g$1 r2 = new com.bytedance.sdk.openadsdk.component.reward.g$1     // Catch:{ all -> 0x0075 }
            r2.<init>()     // Catch:{ all -> 0x0075 }
            java.io.File[] r1 = r1.listFiles(r2)     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0075
            int r2 = r1.length     // Catch:{ all -> 0x0075 }
            r4 = 0
        L_0x0044:
            if (r4 >= r2) goto L_0x0075
            r5 = r1[r4]     // Catch:{ all -> 0x0075 }
            java.lang.String r6 = r5.getName()     // Catch:{ all -> 0x0072 }
            java.lang.String r7 = ".xml"
            java.lang.String r8 = ""
            java.lang.String r6 = r6.replace(r7, r8)     // Catch:{ all -> 0x0072 }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0072 }
            if (r7 < r3) goto L_0x005e
            android.content.Context r5 = r9.f739b     // Catch:{ all -> 0x0072 }
            r5.deleteSharedPreferences(r6)     // Catch:{ all -> 0x0072 }
            goto L_0x0072
        L_0x005e:
            android.content.Context r7 = r9.f739b     // Catch:{ all -> 0x0072 }
            android.content.SharedPreferences r6 = r7.getSharedPreferences(r6, r0)     // Catch:{ all -> 0x0072 }
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ all -> 0x0072 }
            android.content.SharedPreferences$Editor r6 = r6.clear()     // Catch:{ all -> 0x0072 }
            r6.apply()     // Catch:{ all -> 0x0072 }
            com.bytedance.sdk.component.utils.f.c(r5)     // Catch:{ all -> 0x0072 }
        L_0x0072:
            int r4 = r4 + 1
            goto L_0x0044
        L_0x0075:
            android.content.Context r1 = r9.f739b     // Catch:{ all -> 0x00a2 }
            java.io.File r1 = r1.getCacheDir()     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x00a2
            boolean r2 = r1.exists()     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x00a2
            boolean r2 = r1.isDirectory()     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x00a2
            com.bytedance.sdk.openadsdk.component.reward.g$2 r2 = new com.bytedance.sdk.openadsdk.component.reward.g$2     // Catch:{ all -> 0x00a2 }
            r2.<init>()     // Catch:{ all -> 0x00a2 }
            java.io.File[] r1 = r1.listFiles(r2)     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x00a2
            int r2 = r1.length     // Catch:{ all -> 0x00a2 }
            if (r2 <= 0) goto L_0x00a2
            int r2 = r1.length     // Catch:{ all -> 0x00a2 }
        L_0x0098:
            if (r0 >= r2) goto L_0x00a2
            r3 = r1[r0]     // Catch:{ all -> 0x00a2 }
            com.bytedance.sdk.component.utils.f.c(r3)     // Catch:{ all -> 0x009f }
        L_0x009f:
            int r0 = r0 + 1
            goto L_0x0098
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.g.a():void");
    }

    public void a(AdSlot adSlot, n nVar) {
        a(adSlot);
        if (nVar != null) {
            try {
                this.f740c.a(adSlot.getCodeId(), nVar.ar().toString());
            } catch (Throwable unused) {
            }
        }
    }

    public AdSlot b(String str) {
        return this.f740c.e(str);
    }

    public void a(AdSlot adSlot) {
        this.f740c.a(adSlot);
    }

    public void b(AdSlot adSlot) {
        this.f740c.b(adSlot);
    }

    public AdSlot b() {
        return this.f740c.a();
    }

    public static g a(Context context) {
        if (f738a == null) {
            synchronized (g.class) {
                if (f738a == null) {
                    f738a = new g(context);
                }
            }
        }
        return f738a;
    }

    private g(Context context) {
        Context a2 = context == null ? m.a() : context.getApplicationContext();
        this.f739b = a2;
        this.f740c = new j(a2, "sp_reward_video");
    }

    public String a(n nVar) {
        if (nVar == null || nVar.J() == null || TextUtils.isEmpty(nVar.J().i())) {
            return null;
        }
        return a(nVar.J().i(), nVar.J().l(), nVar.aD());
    }

    public String a(String str, String str2, int i) {
        File a2;
        if (!TextUtils.isEmpty(str) && (a2 = a(str2, i)) != null && a2.exists() && a2.isFile() && a2.length() > 0) {
            return a2.getAbsolutePath();
        }
        return null;
    }

    public n c(String str) {
        n a2;
        long b2 = this.f740c.b(str);
        boolean c2 = this.f740c.c(str);
        if (!(System.currentTimeMillis() - b2 < 10500000) || c2) {
            return null;
        }
        try {
            String a3 = this.f740c.a(str);
            if (TextUtils.isEmpty(a3) || (a2 = b.a(new JSONObject(a3))) == null) {
                return null;
            }
            if (p.i(a2)) {
                return a2;
            }
            com.bykv.vk.openvk.component.video.api.c.b J = a2.J();
            if (J == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 23 || !TextUtils.isEmpty(a(J.i(), J.l(), a2.aD()))) {
                return a2;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void a(boolean z, n nVar, long j, String str) {
        long j2;
        Long remove = this.f741d.remove(nVar);
        if (remove == null) {
            j2 = 0;
        } else {
            j2 = SystemClock.elapsedRealtime() - remove.longValue();
        }
        e.a(this.f739b, nVar, "rewarded_video", z ? "load_video_success" : "load_video_error", u.a(z, nVar, j2, j, (z || str == null) ? null : str));
    }

    public void a(final n nVar, final a<Object> aVar) {
        this.f741d.put(nVar, Long.valueOf(SystemClock.elapsedRealtime()));
        if (nVar == null || nVar.J() == null || TextUtils.isEmpty(nVar.J().i())) {
            if (aVar != null) {
                aVar.a(false, null);
            }
            a(false, nVar, -1, (String) null);
            return;
        }
        String i = nVar.J().i();
        File a2 = a(nVar.J().l(), nVar.aD());
        com.bytedance.sdk.component.e.b.a d2 = d.a().b().d();
        d2.a(i);
        d2.a(a2.getParent(), a2.getName());
        d2.a((com.bytedance.sdk.component.e.a.a) new com.bytedance.sdk.component.e.a.a() {
            public void a(c cVar, com.bytedance.sdk.component.e.b bVar) {
                if (!bVar.f() || bVar.e() == null || !bVar.e().exists()) {
                    a aVar = aVar;
                    if (aVar != null) {
                        aVar.a(false, null);
                    }
                    l.c("RewardVideoCache", "onFailure: RewardVideo preload fail ");
                    g.this.a(false, nVar, (long) bVar.a(), bVar.b());
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(true, null);
                }
                l.c("RewardVideoCache", "onFailure: RewardVideo preload success ");
                g.this.a(true, nVar, (long) bVar.a(), bVar.b());
            }

            public void a(c cVar, IOException iOException) {
                a aVar = aVar;
                if (aVar != null) {
                    aVar.a(false, null);
                }
                l.c("RewardVideoCache", "onFailure: RewardVideo preload fail ");
                g.this.a(false, nVar, -2, iOException.getMessage());
            }
        });
    }

    private File a(String str, int i) {
        return new File(CacheDirFactory.getICacheDir(i).b(), str);
    }
}
