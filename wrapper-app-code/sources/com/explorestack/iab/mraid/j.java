package com.explorestack.iab.mraid;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.explorestack.iab.bridge.JsBridgeHandler;
import com.explorestack.iab.mraid.i;
import com.explorestack.iab.utils.Logger;
import com.explorestack.iab.utils.Utils;
import java.util.Map;

public class j {

    /* renamed from: g  reason: collision with root package name */
    public static final String f3029g;

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ boolean f3030h;

    /* renamed from: a  reason: collision with root package name */
    public final b f3031a;

    /* renamed from: b  reason: collision with root package name */
    public final i f3032b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3033c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3034d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3035e = false;

    /* renamed from: f  reason: collision with root package name */
    public c f3036f;

    public class a implements i.e {
        public a() {
        }

        public void a(boolean z) {
            if (j.this.f3033c) {
                j.this.a(z);
            }
            j.this.f3031a.a(z);
        }
    }

    public interface b {
        void a();

        void a(int i);

        void a(c cVar);

        void a(e eVar);

        void a(String str);

        void a(boolean z);

        void b();

        void b(String str);

        void b(boolean z);

        void c(String str);

        void d(String str);
    }

    public class c extends WebViewClient {
        private c() {
        }

        public /* synthetic */ c(j jVar, a aVar) {
            this();
        }

        public final void a(String str, String str2, int i) {
            MraidLog.d(j.f3029g, String.format("onError: %s / %s / %d", new Object[]{str, str2, Integer.valueOf(i)}));
            if (str2 != null && str2.contains("ERR_INTERNET_DISCONNECTED")) {
                boolean unused = j.this.f3035e = true;
            }
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            MraidLog.d(j.f3029g, "onPageFinished");
            if (!j.this.f3033c) {
                boolean unused = j.this.f3033c = true;
                j.this.c().f();
                j.this.f3031a.d(str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            MraidLog.d(j.f3029g, "onPageStarted");
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            a(str2, str, i);
            super.onReceivedError(webView, i, str, str2);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Uri url = webResourceRequest.getUrl();
            a(url != null ? url.toString() : null, webResourceError.getDescription().toString(), webResourceError.getErrorCode());
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            MraidLog.d(j.f3029g, "onRenderProcessGone");
            j.this.f3031a.a(1);
            return true;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("mraid://")) {
                j.this.a(str);
                return true;
            } else if (JsBridgeHandler.b(str)) {
                JsBridgeHandler.a(j.this.f3032b, str);
                return true;
            } else {
                j.this.e(str);
                return true;
            }
        }
    }

    static {
        Class<j> cls = j.class;
        f3030h = !cls.desiredAssertionStatus();
        f3029g = cls.getSimpleName();
    }

    public j(Context context, b bVar) {
        this.f3031a = bVar;
        this.f3034d = false;
        i iVar = new i(context);
        this.f3032b = iVar;
        iVar.setWebViewClient(new c(this, (a) null));
        iVar.setListener(new a());
    }

    public void a() {
        i c2 = c();
        Utils.removeFromParent(c2);
        c2.destroy();
    }

    public void a(int i, int i2) {
        b(String.format("(function click(x, y) {var ev = new MouseEvent('click', {    'view': window,    'bubbles': true,    'cancelable': true,    'screenX': x,    'screenY': y});var el = document.elementFromPoint(x, y);if (el !== null) {      el.dispatchEvent(ev); }})(%s, %s)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    public void a(b bVar) {
        b("mraid.setSupports(mraid.SUPPORTED_FEATURES.CALENDAR, " + bVar.a() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.INLINEVIDEO, " + bVar.b() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.SMS, " + bVar.c() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.STOREPICTURE, " + bVar.d() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.TEL, " + bVar.e() + ");");
    }

    public void a(d dVar) {
        b("mraid.setPlacementType('" + dVar.a() + "');");
    }

    public void a(f fVar) {
        Rect e2 = fVar.e();
        Rect d2 = fVar.d();
        b("mraid.setScreenSize(" + e2.width() + "," + e2.height() + ");mraid.setMaxSize(" + d2.width() + "," + d2.height() + ");mraid.setCurrentPosition(" + Utils.stringifyRect(fVar.a()) + ");mraid.setDefaultPosition(" + Utils.stringifyRect(fVar.c()) + ");mraid.fireSizeChangeEvent(" + Utils.stringifySize(fVar.a()) + ");");
    }

    public void a(h hVar) {
        b("mraid.fireStateChangeEvent('" + hVar.a() + "');");
    }

    public void a(Logger.LogLevel logLevel) {
        String str;
        if (logLevel == Logger.LogLevel.debug) {
            str = "mraid.logLevel = mraid.LogLevelEnum.DEBUG;";
        } else if (logLevel == Logger.LogLevel.info) {
            str = "mraid.logLevel = mraid.LogLevelEnum.INFO;";
        } else if (logLevel == Logger.LogLevel.warning) {
            str = "mraid.logLevel = mraid.LogLevelEnum.WARNING;";
        } else if (logLevel == Logger.LogLevel.error) {
            str = "mraid.logLevel = mraid.LogLevelEnum.ERROR;";
        } else if (logLevel == Logger.LogLevel.none) {
            str = "mraid.logLevel = mraid.LogLevelEnum.NONE;";
        } else {
            return;
        }
        b(str);
    }

    public final void a(String str) {
        String str2 = f3029g;
        MraidLog.d(str2, "handleJsCommand " + str);
        try {
            Map<String, String> c2 = g.c(str);
            if (c2 != null) {
                String str3 = c2.get("command");
                if (str3 == null) {
                    MraidLog.b(str2, "handleJsCommand: not found");
                    return;
                }
                a(str3, c2);
                g();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        this.f3033c = false;
        c().loadDataWithBaseURL(str, str2, str3, str4, (String) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            r3 = this;
            r4.hashCode()
            int r0 = r4.hashCode()
            r1 = 0
            java.lang.String r2 = "useCustomClose"
            switch(r0) {
                case -1886160473: goto L_0x0068;
                case -1289167206: goto L_0x005d;
                case -1097519099: goto L_0x0052;
                case -1041060124: goto L_0x0047;
                case -934437708: goto L_0x003c;
                case 3417674: goto L_0x0031;
                case 94756344: goto L_0x0026;
                case 133423073: goto L_0x001b;
                case 1614272768: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0073
        L_0x000f:
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0017
            goto L_0x0073
        L_0x0017:
            r4 = 8
            goto L_0x0074
        L_0x001b:
            java.lang.String r0 = "setOrientationProperties"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0024
            goto L_0x0073
        L_0x0024:
            r4 = 7
            goto L_0x0074
        L_0x0026:
            java.lang.String r0 = "close"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x002f
            goto L_0x0073
        L_0x002f:
            r4 = 6
            goto L_0x0074
        L_0x0031:
            java.lang.String r0 = "open"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x003a
            goto L_0x0073
        L_0x003a:
            r4 = 5
            goto L_0x0074
        L_0x003c:
            java.lang.String r0 = "resize"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0045
            goto L_0x0073
        L_0x0045:
            r4 = 4
            goto L_0x0074
        L_0x0047:
            java.lang.String r0 = "noFill"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0050
            goto L_0x0073
        L_0x0050:
            r4 = 3
            goto L_0x0074
        L_0x0052:
            java.lang.String r0 = "loaded"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x005b
            goto L_0x0073
        L_0x005b:
            r4 = 2
            goto L_0x0074
        L_0x005d:
            java.lang.String r0 = "expand"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0066
            goto L_0x0073
        L_0x0066:
            r4 = 1
            goto L_0x0074
        L_0x0068:
            java.lang.String r0 = "playVideo"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r4 = 0
            goto L_0x0074
        L_0x0073:
            r4 = -1
        L_0x0074:
            java.lang.String r0 = "url"
            switch(r4) {
                case 0: goto L_0x015d;
                case 1: goto L_0x0151;
                case 2: goto L_0x014b;
                case 3: goto L_0x0145;
                case 4: goto L_0x00e6;
                case 5: goto L_0x00bf;
                case 6: goto L_0x00b8;
                case 7: goto L_0x0092;
                case 8: goto L_0x007b;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x0168
        L_0x007b:
            java.lang.Object r4 = r5.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            boolean r5 = r3.f3034d
            if (r5 == r4) goto L_0x0168
            r3.f3034d = r4
            com.explorestack.iab.mraid.j$b r5 = r3.f3031a
            r5.b((boolean) r4)
            goto L_0x0168
        L_0x0092:
            java.lang.String r4 = "allowOrientationChange"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.lang.String r0 = "forceOrientation"
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.explorestack.iab.mraid.c.a((java.lang.String) r5)
            com.explorestack.iab.mraid.c r0 = new com.explorestack.iab.mraid.c
            r0.<init>(r4, r5)
            r3.f3036f = r0
            com.explorestack.iab.mraid.j$b r4 = r3.f3031a
            r4.a((com.explorestack.iab.mraid.c) r0)
            goto L_0x0168
        L_0x00b8:
            com.explorestack.iab.mraid.j$b r4 = r3.f3031a
            r4.b()
            goto L_0x0168
        L_0x00bf:
            java.lang.Object r4 = r5.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x00d4
            java.lang.String r4 = f3029g
            java.lang.String r5 = "url is null or empty"
            com.explorestack.iab.mraid.MraidLog.a((java.lang.String) r4, (java.lang.String) r5)
            goto L_0x0168
        L_0x00d4:
            boolean r5 = f3030h
            if (r5 != 0) goto L_0x00e1
            if (r4 == 0) goto L_0x00db
            goto L_0x00e1
        L_0x00db:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L_0x00e1:
            r3.e(r4)
            goto L_0x0168
        L_0x00e6:
            com.explorestack.iab.mraid.e r4 = new com.explorestack.iab.mraid.e
            r4.<init>()
            java.lang.String r0 = "width"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r3.d(r0)
            r4.f2992a = r0
            java.lang.String r0 = "height"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r3.d(r0)
            r4.f2993b = r0
            java.lang.String r0 = "offsetX"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r3.d(r0)
            r4.f2994c = r0
            java.lang.String r0 = "offsetY"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r3.d(r0)
            r4.f2995d = r0
            java.lang.String r0 = "allowOffscreen"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r4.f2997f = r0
            java.lang.String r0 = "customClosePosition"
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            com.explorestack.iab.mraid.l r5 = com.explorestack.iab.mraid.l.a(r5)
            r4.f2996e = r5
            com.explorestack.iab.mraid.j$b r5 = r3.f3031a
            r5.a((com.explorestack.iab.mraid.e) r4)
            goto L_0x0168
        L_0x0145:
            com.explorestack.iab.mraid.j$b r4 = r3.f3031a
            r4.a((int) r1)
            goto L_0x0168
        L_0x014b:
            com.explorestack.iab.mraid.j$b r4 = r3.f3031a
            r4.a()
            goto L_0x0168
        L_0x0151:
            com.explorestack.iab.mraid.j$b r4 = r3.f3031a
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            r4.b((java.lang.String) r5)
            goto L_0x0168
        L_0x015d:
            com.explorestack.iab.mraid.j$b r4 = r3.f3031a
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            r4.c(r5)
        L_0x0168:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.mraid.j.a(java.lang.String, java.util.Map):void");
    }

    public void a(boolean z) {
        b("mraid.fireViewableChangeEvent(" + z + ");");
    }

    public c b() {
        return this.f3036f;
    }

    public void b(String str) {
        this.f3032b.a(str);
    }

    public i c() {
        return this.f3032b;
    }

    public void c(String str) {
        this.f3033c = false;
        c().loadUrl(str);
    }

    public final int d(String str) {
        if (str != null) {
            try {
                return Integer.parseInt(str, 10);
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
        return 0;
    }

    public boolean d() {
        return this.f3035e;
    }

    public final void e(String str) {
        if (this.f3032b.j()) {
            this.f3031a.a(str);
            this.f3032b.h();
            return;
        }
        MraidLog.d(f3029g, "Can't open url because webView wasn't clicked");
    }

    public boolean e() {
        return this.f3034d;
    }

    public boolean f() {
        return this.f3032b.e();
    }

    public final void g() {
        b("mraid.nativeCallComplete();");
    }

    public void h() {
        b("mraid.fireReadyEvent();");
    }
}
