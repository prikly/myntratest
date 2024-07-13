package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.e.a;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.d.t;
import com.bytedance.sdk.component.utils.e;
import com.bytedance.sdk.component.utils.f;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.core.e.o;
import com.bytedance.sdk.openadsdk.core.e.r;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.utils.g;
import com.bytedance.sdk.openadsdk.utils.u;
import com.onesignal.OneSignalDbContract;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTAppOpenAdCacheManager */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f487a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.a.b f488b;

    /* renamed from: c  reason: collision with root package name */
    private final n<com.bytedance.sdk.openadsdk.b.a> f489c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Context f490d;

    /* compiled from: TTAppOpenAdCacheManager */
    public interface b {
        void a();

        void a(com.bytedance.sdk.openadsdk.i.a.b bVar);
    }

    /* compiled from: TTAppOpenAdCacheManager */
    interface c {
        void a();

        void a(int i, String str);
    }

    /* compiled from: TTAppOpenAdCacheManager */
    public interface d {
        void a();

        void a(Bitmap bitmap);
    }

    private a(Context context) {
        if (context != null) {
            this.f490d = context.getApplicationContext();
        } else {
            this.f490d = m.a();
        }
        this.f488b = new com.bytedance.sdk.openadsdk.a.b(10, 8, true);
        this.f489c = m.f();
    }

    public static a a(Context context) {
        if (f487a == null) {
            synchronized (a.class) {
                if (f487a == null) {
                    f487a = new a(context);
                }
            }
        }
        return f487a;
    }

    public void a(final AdSlot adSlot) {
        long currentTimeMillis = System.currentTimeMillis();
        final r rVar = new r();
        rVar.a(currentTimeMillis);
        o oVar = new o();
        oVar.f1147g = currentTimeMillis;
        oVar.i = rVar;
        oVar.f1144d = 2;
        this.f489c.a(adSlot, oVar, 3, new n.a() {
            public void a(int i, String str) {
                l.b("TTAppOpenAdCacheManager", "cache Load App OpenAd From Network fail");
            }

            public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                l.b("TTAppOpenAdCacheManager", "cache Load App Open Ad From Network success");
                if (aVar == null || aVar.b() == null || aVar.b().size() == 0) {
                    l.b("TTAppOpenAdCacheManager", "material is null");
                    bVar.a(-3);
                    com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.e.n nVar = aVar.b().get(0);
                if (com.bytedance.sdk.openadsdk.core.e.n.c(nVar)) {
                    a.this.a(nVar, adSlot, rVar);
                } else {
                    a.this.a(nVar, rVar);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(final com.bytedance.sdk.openadsdk.core.e.n nVar, AdSlot adSlot, final r rVar) {
        final int f2 = u.f(nVar);
        a(nVar, adSlot, rVar, (c) new c() {
            public void a(int i, String str) {
            }

            public void a() {
                com.bytedance.sdk.openadsdk.component.d.a aVar = new com.bytedance.sdk.openadsdk.component.d.a(f2, nVar);
                a.this.a(aVar);
                com.bytedance.sdk.openadsdk.component.c.a.a(aVar.b(), 1, rVar);
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(final com.bytedance.sdk.openadsdk.core.e.n nVar, final r rVar) {
        final int f2 = u.f(nVar);
        a(nVar, rVar, (b) new b() {
            public void a() {
            }

            public void a(com.bytedance.sdk.openadsdk.i.a.b bVar) {
                com.bytedance.sdk.openadsdk.component.d.a aVar = new com.bytedance.sdk.openadsdk.component.d.a(f2, nVar);
                a.this.a(aVar);
                com.bytedance.sdk.openadsdk.component.c.a.a(aVar.b(), 1, rVar);
            }
        });
    }

    public void a(com.bytedance.sdk.openadsdk.core.e.n nVar, AdSlot adSlot, r rVar, c cVar) {
        com.bytedance.sdk.openadsdk.core.e.n nVar2 = nVar;
        r rVar2 = rVar;
        long currentTimeMillis = System.currentTimeMillis();
        int f2 = u.f(nVar);
        com.bykv.vk.openvk.component.video.api.c.b J = nVar.J();
        String i = J.i();
        String l = J.l();
        if (TextUtils.isEmpty(l)) {
            l = e.a(i);
        }
        final File a2 = com.bytedance.sdk.openadsdk.component.f.a.a(l, f2);
        if (a2.exists()) {
            l.b("TTAppOpenAdCacheManager", "The video cache exists locally, use the cache directly");
            com.bytedance.sdk.openadsdk.component.f.a.a(a2);
            a(f2);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (rVar2 != null) {
                rVar2.c(currentTimeMillis2);
                rVar2.a(1);
            }
            cVar.a();
            a(nVar2, (d) null);
        } else if (!m.h().m(String.valueOf(f2)) || com.bytedance.sdk.component.utils.o.d(m.a())) {
            c cVar2 = cVar;
            com.bykv.vk.openvk.component.video.api.c.c a3 = com.bytedance.sdk.openadsdk.core.e.n.a(a2.getParent(), nVar2);
            a3.a("material_meta", nVar2);
            a3.a("ad_slot", adSlot);
            final int i2 = f2;
            AnonymousClass4 r15 = r0;
            final long j = currentTimeMillis;
            com.bykv.vk.openvk.component.video.api.c.c cVar3 = a3;
            final com.bytedance.sdk.openadsdk.core.e.n nVar3 = nVar;
            final r rVar3 = rVar;
            final c cVar4 = cVar;
            AnonymousClass4 r0 = new a.C0222a() {
                public void b(com.bykv.vk.openvk.component.video.api.c.c cVar, int i) {
                }

                public void a(com.bykv.vk.openvk.component.video.api.c.c cVar, int i) {
                    l.b("TTAppOpenAdCacheManager", "Video file caching success");
                    a.this.a(a2);
                    a.this.a(i2);
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    com.bytedance.sdk.openadsdk.component.c.a.b(nVar3, currentTimeMillis, true);
                    r rVar = rVar3;
                    if (rVar != null) {
                        rVar.c(currentTimeMillis);
                        rVar3.a(2);
                    }
                    cVar4.a();
                    a.a(nVar3, (d) null);
                }

                public void a(com.bykv.vk.openvk.component.video.api.c.c cVar, int i, String str) {
                    l.b("TTAppOpenAdCacheManager", "Video file caching failed");
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    com.bytedance.sdk.openadsdk.component.c.a.b(nVar3, currentTimeMillis, false);
                    r rVar = rVar3;
                    if (rVar != null) {
                        rVar.c(currentTimeMillis);
                    }
                    cVar4.a(i, str);
                    try {
                        if (a2.exists() && a2.isFile()) {
                            f.c(a2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            };
            com.bytedance.sdk.openadsdk.core.video.d.a.a(cVar3, r15);
            if (Build.VERSION.SDK_INT < 23) {
                a(new File(com.bykv.vk.openvk.component.video.api.b.a().getCacheDir(), "proxy_cache"));
                a(f2);
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                com.bytedance.sdk.openadsdk.component.c.a.b(nVar2, currentTimeMillis3, true);
                r rVar4 = rVar;
                if (rVar4 != null) {
                    rVar4.c(currentTimeMillis3);
                    rVar4.a(2);
                }
                cVar.a();
                a(nVar2, (d) null);
            }
        } else {
            cVar.a(100, "OnlyWifi");
        }
    }

    public void a(com.bytedance.sdk.openadsdk.core.e.n nVar, r rVar, b bVar) {
        r rVar2 = rVar;
        final long currentTimeMillis = System.currentTimeMillis();
        final int f2 = u.f(nVar);
        k kVar = nVar.P().get(0);
        String g2 = kVar.g();
        String a2 = kVar.a();
        int b2 = kVar.b();
        int c2 = kVar.c();
        File b3 = com.bytedance.sdk.openadsdk.component.f.a.b(TextUtils.isEmpty(g2) ? e.a(a2) : g2, f2);
        if (a(a2, g2)) {
            l.b("TTAppOpenAdCacheManager", "The image cache exists locally, directly use the cache");
            c(f2);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (rVar2 != null) {
                rVar2.c(currentTimeMillis2);
                rVar2.a(1);
            }
            bVar.a((com.bytedance.sdk.openadsdk.i.a.b) null);
            return;
        }
        final b bVar2 = bVar;
        com.bytedance.sdk.openadsdk.i.a aVar = new com.bytedance.sdk.openadsdk.i.a(a2, kVar.g());
        final com.bytedance.sdk.openadsdk.core.e.n nVar2 = nVar;
        final r rVar3 = rVar;
        g.a(aVar, b2, c2, new g.a() {
            public void a(com.bytedance.sdk.openadsdk.i.a.b bVar) {
                if (bVar.c()) {
                    l.b("TTAppOpenAdCacheManager", "Image loaded successfully");
                    a.this.c(f2);
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    com.bytedance.sdk.openadsdk.component.c.a.a(nVar2, currentTimeMillis, true);
                    r rVar = rVar3;
                    if (rVar != null) {
                        rVar.c(currentTimeMillis);
                        rVar3.a(2);
                    }
                    bVar2.a(bVar);
                    return;
                }
                com.bytedance.sdk.openadsdk.component.c.a.a(nVar2, System.currentTimeMillis() - currentTimeMillis, false);
                bVar2.a();
            }

            public void a() {
                l.b("TTAppOpenAdCacheManager", "Image loading failed");
                com.bytedance.sdk.openadsdk.component.c.a.a(nVar2, System.currentTimeMillis() - currentTimeMillis, false);
                bVar2.a();
            }

            public void b() {
                l.b("TTAppOpenAdCacheManager", "Image caching success");
            }
        }, b3.getParent());
    }

    public static void a(com.bytedance.sdk.openadsdk.core.e.n nVar, final d dVar) {
        com.bytedance.sdk.openadsdk.d.a.a(nVar.J().h()).a(t.BITMAP).a((com.bytedance.sdk.component.d.n) new com.bytedance.sdk.component.d.n<Bitmap>() {
            public void a(j<Bitmap> jVar) {
                if (jVar == null || jVar.b() == null) {
                    d dVar = dVar;
                    if (dVar != null) {
                        dVar.a();
                        return;
                    }
                    return;
                }
                d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.a(jVar.b());
                }
            }

            public void a(int i, String str, Throwable th) {
                d dVar = dVar;
                if (dVar != null) {
                    dVar.a();
                }
            }
        });
    }

    public void a(int i) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_openad", "video_has_cached" + i, (Boolean) true);
            return;
        }
        SharedPreferences.Editor edit = this.f490d.getSharedPreferences("tt_openad", 0).edit();
        edit.putBoolean("video_has_cached" + i, true).apply();
    }

    public boolean b(int i) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_openad", "video_has_cached" + i, false);
        }
        SharedPreferences sharedPreferences = this.f490d.getSharedPreferences("tt_openad", 0);
        return sharedPreferences.getBoolean("video_has_cached" + i, false);
    }

    public void c(int i) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_openad", "image_has_cached" + i, (Boolean) true);
            return;
        }
        SharedPreferences.Editor edit = this.f490d.getSharedPreferences("tt_openad", 0).edit();
        edit.putBoolean("image_has_cached" + i, true).apply();
    }

    public boolean d(int i) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_openad", "image_has_cached" + i, false);
        }
        SharedPreferences sharedPreferences = this.f490d.getSharedPreferences("tt_openad", 0);
        return sharedPreferences.getBoolean("image_has_cached" + i, false);
    }

    public void a(com.bytedance.sdk.openadsdk.component.d.a aVar) {
        if (aVar.b() != null && aVar.a() != 0) {
            long ag = aVar.b().ag();
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_openad", "material_expiration_time" + aVar.a(), Long.valueOf(ag));
            } else {
                SharedPreferences.Editor edit = this.f490d.getSharedPreferences("tt_openad", 0).edit();
                edit.putLong("material_expiration_time" + aVar.a(), ag).apply();
            }
            b(aVar);
        }
    }

    public boolean e(int i) {
        long j;
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            j = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_openad", "material_expiration_time" + i, -1);
        } else {
            SharedPreferences sharedPreferences = this.f490d.getSharedPreferences("tt_openad", 0);
            j = sharedPreferences.getLong("material_expiration_time" + i, -1);
        }
        if (System.currentTimeMillis() / 1000 < j) {
            return true;
        }
        if (j != -1) {
            com.bytedance.sdk.openadsdk.core.e.n f2 = f(i);
            if (f2 != null) {
                com.bytedance.sdk.openadsdk.component.c.a.a(f2);
            }
            g(i);
        }
        return false;
    }

    public com.bytedance.sdk.openadsdk.core.e.n f(int i) {
        String str;
        String str2;
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            str = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_openad_materialMeta", "material" + i, (String) null);
        } else {
            str = this.f490d.getSharedPreferences("tt_openad_materialMeta", 0).getString("material" + i, (String) null);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.optInt("cypher", -1);
                str2 = com.bytedance.sdk.component.utils.a.b(jSONObject.optString(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE));
            } catch (JSONException e2) {
                e2.printStackTrace();
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    com.bytedance.sdk.openadsdk.core.e.n a2 = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(str2));
                    if (a2 != null) {
                        return a2;
                    }
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }
        return null;
    }

    private void b(com.bytedance.sdk.openadsdk.component.d.a aVar) {
        com.bytedance.sdk.component.f.e.a(new C0001a(aVar), 10, 5);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.a$a  reason: collision with other inner class name */
    /* compiled from: TTAppOpenAdCacheManager */
    private class C0001a extends com.bytedance.sdk.component.f.g {

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.sdk.openadsdk.component.d.a f518b;

        public C0001a(com.bytedance.sdk.openadsdk.component.d.a aVar) {
            super("App Open Ad Write Cache");
            this.f518b = aVar;
        }

        public void run() {
            try {
                String jSONObject = com.bytedance.sdk.component.utils.a.a(this.f518b.b().ar()).toString();
                if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                    com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_openad_materialMeta", "material" + this.f518b.a(), jSONObject);
                    return;
                }
                SharedPreferences.Editor edit = a.this.f490d.getSharedPreferences("tt_openad_materialMeta", 0).edit();
                edit.putString("material" + this.f518b.a(), jSONObject).apply();
            } catch (Throwable unused) {
            }
        }
    }

    public String a(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        if (!(nVar == null || nVar.J() == null || TextUtils.isEmpty(nVar.J().i()))) {
            String i = nVar.J().i();
            String l = nVar.J().l();
            String valueOf = String.valueOf(u.f(nVar));
            if (TextUtils.isEmpty(l)) {
                l = e.a(i);
            }
            File a2 = com.bytedance.sdk.openadsdk.component.f.a.a(this.f490d, a(valueOf), l);
            if (a2.exists() && a2.isFile()) {
                return a2.getAbsolutePath();
            }
        }
        return null;
    }

    public boolean b(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        if (nVar == null || nVar.P() == null || nVar.P().size() == 0 || TextUtils.isEmpty(nVar.P().get(0).a())) {
            return false;
        }
        k kVar = nVar.P().get(0);
        return a(kVar.a(), kVar.g());
    }

    public boolean a(String str, String str2) {
        boolean z;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = e.a(str);
            }
            File b2 = com.bytedance.sdk.openadsdk.component.f.a.b(str2, 0);
            InputStream a2 = com.bytedance.sdk.openadsdk.d.a.a(str, str2);
            if (a2 != null) {
                try {
                    a2.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (com.bytedance.sdk.openadsdk.d.a.a(str, str2, b2.getParent())) {
                    return true;
                }
                if (new File(b2.getPath() + ".0").exists()) {
                    return true;
                }
            }
            return z;
        } catch (Exception e3) {
            l.e("TTAppOpenAdCacheManager", e3.getMessage());
            return false;
        }
    }

    public void a(File file) {
        try {
            this.f488b.a(file);
        } catch (IOException e2) {
            l.e("TTAppOpenAdCacheManager", "trimFileCache IOException:" + e2.toString());
        }
    }

    public void g(int i) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_openad_materialMeta", "material" + i);
            com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_openad", "material_expiration_time" + i);
            com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_openad", "video_has_cached" + i);
            com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_openad", "image_has_cached" + i);
            return;
        }
        SharedPreferences.Editor edit = this.f490d.getSharedPreferences("tt_openad_materialMeta", 0).edit();
        edit.remove("material" + i).apply();
        SharedPreferences.Editor edit2 = this.f490d.getSharedPreferences("tt_openad", 0).edit();
        SharedPreferences.Editor remove = edit2.remove("material_expiration_time" + i);
        SharedPreferences.Editor remove2 = remove.remove("video_has_cached" + i);
        remove2.remove("image_has_cached" + i).apply();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|(2:5|6)(1:7)|8|9|(1:34)(4:19|(5:21|22|23|28|24)|27|35)) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0034 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056 A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r4 = this;
            r0 = 0
            boolean r1 = com.bytedance.sdk.openadsdk.multipro.b.c()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "tt_openad"
            java.lang.String r3 = "tt_openad_materialMeta"
            if (r1 == 0) goto L_0x0012
            com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3)     // Catch:{ all -> 0x0034 }
            com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0034
        L_0x0012:
            android.content.Context r1 = r4.f490d     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r0)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r1.clear()     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
            android.content.Context r1 = r4.f490d     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r1.clear()     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
        L_0x0034:
            android.content.Context r1 = r4.f490d     // Catch:{ all -> 0x0061 }
            java.io.File r1 = r1.getCacheDir()     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0061
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0061
            boolean r2 = r1.isDirectory()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0061
            com.bytedance.sdk.openadsdk.component.a$7 r2 = new com.bytedance.sdk.openadsdk.component.a$7     // Catch:{ all -> 0x0061 }
            r2.<init>()     // Catch:{ all -> 0x0061 }
            java.io.File[] r1 = r1.listFiles(r2)     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0061
            int r2 = r1.length     // Catch:{ all -> 0x0061 }
            if (r2 <= 0) goto L_0x0061
            int r2 = r1.length     // Catch:{ all -> 0x0061 }
        L_0x0057:
            if (r0 >= r2) goto L_0x0061
            r3 = r1[r0]     // Catch:{ all -> 0x0061 }
            com.bytedance.sdk.component.utils.f.c(r3)     // Catch:{ all -> 0x005e }
        L_0x005e:
            int r0 = r0 + 1
            goto L_0x0057
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.a.a():void");
    }

    public String a(String str) {
        return com.bytedance.sdk.openadsdk.multipro.b.c() ? "openad_video_cache/" : "/openad_video_cache/";
    }

    public String h(int i) {
        return com.bytedance.sdk.openadsdk.multipro.b.c() ? "openad_image_cache/" : "/openad_image_cache/";
    }
}
