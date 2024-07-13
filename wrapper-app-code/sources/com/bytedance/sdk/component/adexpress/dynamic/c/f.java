package com.bytedance.sdk.component.adexpress.dynamic.c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.amazon.aps.shared.APSAnalytics;
import com.bytedance.sdk.component.adexpress.b.l;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.dynamic.d.b;
import com.bytedance.sdk.component.utils.e;
import com.bytedance.sdk.component.utils.k;
import com.bytedance.sdk.component.widget.SSWebView;
import io.bidmachine.utils.IabUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: DynamicJsParser */
public class f implements i {

    /* renamed from: e  reason: collision with root package name */
    private static String f18555e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<String> f18556f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"dislike", "close", "close-fill"})));
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f18557a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public SSWebView f18558b;

    /* renamed from: c  reason: collision with root package name */
    private String f18559c;

    /* renamed from: d  reason: collision with root package name */
    private b f18560d;

    public f(Context context, String str) {
        this.f18557a = context;
        this.f18559c = str;
        SSWebView sSWebView = new SSWebView(this.f18557a);
        this.f18558b = sSWebView;
        sSWebView.setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f18558b.a((Object) new a(), "JS_DYNAMIC_LAYOUT_OBJ");
        }
        this.f18558b.a("about:blank");
        a();
    }

    public static void a(String str) {
        f18555e = str;
    }

    private void a() {
        if (!i() || Build.VERSION.SDK_INT < 19) {
            b();
        } else {
            c();
        }
        b();
    }

    private void b() {
        SSWebView sSWebView;
        String e2 = e();
        if (!TextUtils.isEmpty(e2) && (sSWebView = this.f18558b) != null) {
            k.a(sSWebView.getWebView(), e2);
        }
    }

    private void c() {
        try {
            String f2 = f();
            String h2 = h();
            if (TextUtils.isEmpty(h2)) {
                b();
                return;
            }
            SSWebView sSWebView = this.f18558b;
            sSWebView.a(f2 + h2, (ValueCallback<String>) null);
        } catch (Throwable unused) {
            b();
        }
    }

    public void a(b bVar) {
        this.f18560d = bVar;
    }

    public void a(l lVar) {
        b bVar;
        if (TextUtils.isEmpty(f18555e) && (bVar = this.f18560d) != null) {
            bVar.a((h) null);
            g();
        }
        l.b(b(lVar));
        d();
    }

    private String b(l lVar) {
        return lVar == null ? "" : lVar.r();
    }

    private void d() {
        String str = "javascript:var res = getLayoutInfo(" + this.f18559c + ");window." + "JS_DYNAMIC_LAYOUT_OBJ" + ".calculateResult(JSON.stringify(res));";
        SSWebView sSWebView = this.f18558b;
        if (sSWebView != null) {
            k.a(sSWebView.getWebView(), str);
        }
    }

    private static String e() {
        String str;
        if (TextUtils.isEmpty(f18555e)) {
            return null;
        }
        String f2 = f();
        if (i()) {
            str = "(function () {var se = document.createElement('script');se.type = 'text/javascript';se.src = '" + ("file//" + com.bytedance.sdk.component.adexpress.a.b.b.f() + "/" + e.a(f18555e)) + "';document.body.appendChild(se);})();";
        } else {
            str = "(function () {var JS_TTDYNAMIC_URL = '" + f18555e + "';var xhrObj = new XMLHttpRequest();xhrObj.open('GET', JS_TTDYNAMIC_URL, false);xhrObj.send('');var se = document.createElement('script');se.type = 'text/javascript';se.text = xhrObj.responseText;document.getElementsByTagName('head')[0].appendChild(se);})();";
        }
        return "javascript:" + f2 + str;
    }

    private static String f() {
        return "var global = Function('return this')();global.jsCoreGlobal = {width:" + com.bytedance.sdk.component.adexpress.c.b.b(com.bytedance.sdk.component.adexpress.a.a.a.a().c().b(), (float) com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.a.a.a.a().c().b())) + ",height:" + com.bytedance.sdk.component.adexpress.c.b.b(com.bytedance.sdk.component.adexpress.a.a.a.a().c().b(), (float) com.bytedance.sdk.component.adexpress.c.b.b(com.bytedance.sdk.component.adexpress.a.a.a.a().c().b())) + ",os:'Android'};global.systemFontSizeRatioNative = " + 1.2d + ";";
    }

    /* compiled from: DynamicJsParser */
    private class a {
        @JavascriptInterface
        public double systemFontSizeRatioNative() {
            return 1.2d;
        }

        private a() {
        }

        @JavascriptInterface
        public String jsCoreGlobal() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IabUtils.KEY_WIDTH, com.bytedance.sdk.component.adexpress.c.b.b(f.this.f18557a, (float) com.bytedance.sdk.component.adexpress.c.b.a(f.this.f18557a)));
                jSONObject.put(IabUtils.KEY_HEIGHT, com.bytedance.sdk.component.adexpress.c.b.b(f.this.f18557a, (float) com.bytedance.sdk.component.adexpress.c.b.b(f.this.f18557a)));
                jSONObject.put("os", APSAnalytics.OS_NAME);
            } catch (Exception unused) {
            }
            return jSONObject.toString();
        }

        @JavascriptInterface
        public String getDomSizeFromNative(String str, String str2, String str3, boolean z, boolean z2, int i) {
            return l.b(str, str2, str3, z, z2, i);
        }

        @JavascriptInterface
        public void calculateResult(String str) {
            f.this.b(str);
        }
    }

    /* access modifiers changed from: private */
    public void b(String str) {
        h hVar = new h();
        try {
            h.a(new JSONObject(str), hVar, (h) null);
        } catch (Exception unused) {
            hVar = null;
        }
        b bVar = this.f18560d;
        if (bVar != null) {
            bVar.a(hVar);
        }
        g();
    }

    private void g() {
        com.bytedance.sdk.component.utils.h.b().post(new Runnable() {
            public void run() {
                if (f.this.f18558b != null) {
                    f.this.f18558b.l();
                }
                SSWebView unused = f.this.f18558b = null;
            }
        });
    }

    private String h() {
        try {
            return a((InputStream) new FileInputStream(com.bytedance.sdk.component.adexpress.a.b.b.f() + "/" + e.a(f18555e)));
        } catch (IOException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private static boolean i() {
        if (TextUtils.isEmpty(f18555e)) {
            return false;
        }
        String a2 = e.a(f18555e);
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        return new File(com.bytedance.sdk.component.adexpress.a.b.b.f(), a2).exists();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042 A[SYNTHETIC, Splitter:B:25:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004c A[SYNTHETIC, Splitter:B:30:0x004c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.io.InputStream r8) {
        /*
            r7 = this;
            java.lang.String r0 = "is error"
            java.lang.String r1 = "br error"
            java.lang.String r2 = "TemplateToModelParser"
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r4.<init>()     // Catch:{ all -> 0x0039 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x0039 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x0039 }
            r6.<init>(r8)     // Catch:{ all -> 0x0039 }
            r5.<init>(r6)     // Catch:{ all -> 0x0039 }
        L_0x0016:
            java.lang.String r6 = r5.readLine()     // Catch:{ all -> 0x0037 }
            if (r6 == 0) goto L_0x0020
            r4.append(r6)     // Catch:{ all -> 0x0037 }
            goto L_0x0016
        L_0x0020:
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0037 }
            r5.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r4 = move-exception
            com.bytedance.sdk.component.utils.l.a(r2, r1, r4)
        L_0x002c:
            if (r8 == 0) goto L_0x0036
            r8.close()     // Catch:{ all -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r8 = move-exception
            com.bytedance.sdk.component.utils.l.a(r2, r0, r8)
        L_0x0036:
            return r3
        L_0x0037:
            r4 = move-exception
            goto L_0x003b
        L_0x0039:
            r4 = move-exception
            r5 = r3
        L_0x003b:
            java.lang.String r6 = "readStream error"
            com.bytedance.sdk.component.utils.l.a(r2, r6, r4)     // Catch:{ all -> 0x0055 }
            if (r5 == 0) goto L_0x004a
            r5.close()     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r4 = move-exception
            com.bytedance.sdk.component.utils.l.a(r2, r1, r4)
        L_0x004a:
            if (r8 == 0) goto L_0x0054
            r8.close()     // Catch:{ all -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r8 = move-exception
            com.bytedance.sdk.component.utils.l.a(r2, r0, r8)
        L_0x0054:
            return r3
        L_0x0055:
            r3 = move-exception
            if (r5 == 0) goto L_0x0060
            r5.close()     // Catch:{ all -> 0x005c }
            goto L_0x0060
        L_0x005c:
            r4 = move-exception
            com.bytedance.sdk.component.utils.l.a(r2, r1, r4)
        L_0x0060:
            if (r8 == 0) goto L_0x006a
            r8.close()     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r8 = move-exception
            com.bytedance.sdk.component.utils.l.a(r2, r0, r8)
        L_0x006a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.c.f.a(java.io.InputStream):java.lang.String");
    }
}
