package com.bytedance.sdk.component.adexpress.a.b;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.a.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.c.c;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.f;
import java.io.File;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: TTDynamic */
public class a {

    /* renamed from: a  reason: collision with root package name */
    static Object f18308a = new Object();

    public static void a() {
        b.a();
        c.a().c();
    }

    public static void b() {
        try {
            e.d();
            File f2 = b.f();
            if (f2 != null && f2.exists()) {
                if (f2.getParentFile() != null) {
                    f.c(f2.getParentFile());
                } else {
                    f.c(f2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(com.bytedance.sdk.component.adexpress.a.c.c cVar) {
        d.a().a(cVar, cVar.f18356f);
    }

    public static String c() {
        return c.c();
    }

    public static b a(String str) {
        return d.a().a(str);
    }

    public static Set<String> b(String str) {
        return d.a().b(str);
    }

    public static b c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        b a2 = d.a().a(str);
        if (a2 != null) {
            a2.a(Long.valueOf(System.currentTimeMillis()));
            a(a2);
        }
        return a2;
    }

    private static void a(final b bVar) {
        e.a(new g("updateTmplTime") {
            public void run() {
                synchronized (a.f18308a) {
                    c.a().a(bVar);
                }
            }
        }, 10);
    }

    public static com.bytedance.sdk.component.adexpress.a.c.a d() {
        return b.a().d();
    }

    public static String e() {
        if (d() == null) {
            return null;
        }
        return d().c();
    }

    public static boolean f() {
        return b.a().c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (r2.b().equals(r6) != false) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[SYNTHETIC, Splitter:B:18:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.webkit.WebResourceResponse a(java.lang.String r4, com.bytedance.sdk.component.adexpress.c.c.a r5, java.lang.String r6) {
        /*
            boolean r0 = f()
            r1 = 0
            if (r0 == 0) goto L_0x005c
            com.bytedance.sdk.component.adexpress.a.c.a r0 = d()
            java.util.List r0 = r0.e()
            java.util.Iterator r0 = r0.iterator()
        L_0x0013:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x005c
            java.lang.Object r2 = r0.next()
            com.bytedance.sdk.component.adexpress.a.c.a$a r2 = (com.bytedance.sdk.component.adexpress.a.c.a.C0225a) r2
            java.lang.String r3 = r2.a()
            if (r3 == 0) goto L_0x0013
            java.lang.String r3 = r2.a()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0013
            java.lang.String r4 = r2.a()
            java.lang.String r4 = com.bytedance.sdk.component.utils.e.a((java.lang.String) r4)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r6 = r4
        L_0x003f:
            java.io.File r4 = new java.io.File
            java.io.File r0 = com.bytedance.sdk.component.adexpress.a.b.b.f()
            r4.<init>(r0, r6)
            java.lang.String r6 = com.bytedance.sdk.component.utils.e.a((java.io.File) r4)
            java.lang.String r0 = r2.b()
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = r2.b()
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x005d
        L_0x005c:
            r4 = r1
        L_0x005d:
            if (r4 == 0) goto L_0x0079
            android.webkit.WebResourceResponse r6 = new android.webkit.WebResourceResponse     // Catch:{ all -> 0x0071 }
            java.lang.String r5 = r5.a()     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "utf-8"
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0071 }
            r2.<init>(r4)     // Catch:{ all -> 0x0071 }
            r6.<init>(r5, r0, r2)     // Catch:{ all -> 0x0071 }
            r1 = r6
            goto L_0x0079
        L_0x0071:
            r4 = move-exception
            java.lang.String r5 = "TTDynamic"
            java.lang.String r6 = "get html WebResourceResponse error"
            com.bytedance.sdk.component.utils.l.c(r5, r6, r4)
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.a.b.a.a(java.lang.String, com.bytedance.sdk.component.adexpress.c.c$a, java.lang.String):android.webkit.WebResourceResponse");
    }

    public static boolean a(JSONObject jSONObject) {
        Object opt;
        if (jSONObject == null || (opt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(opt.toString())) {
            return false;
        }
        return true;
    }
}
