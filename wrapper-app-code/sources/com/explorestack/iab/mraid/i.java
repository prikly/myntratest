package com.explorestack.iab.mraid;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.explorestack.iab.utils.m;

public class i extends WebView {

    /* renamed from: g  reason: collision with root package name */
    public static final String f3018g = i.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    public static final d f3019h = new d((a) null);

    /* renamed from: a  reason: collision with root package name */
    public final m f3020a;

    /* renamed from: b  reason: collision with root package name */
    public final m f3021b;

    /* renamed from: c  reason: collision with root package name */
    public e f3022c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3023d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3024e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3025f = false;

    public class a implements View.OnTouchListener {
        public a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            i.this.f3020a.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if ((action != 0 && action != 1) || view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    public class b implements m.d {
        public b() {
        }

        public void a(boolean z) {
            i.this.i();
        }
    }

    public class c implements ValueCallback<String> {
        public c() {
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
            String a2 = i.f3018g;
            MraidLog.d(a2, "evaluate js complete: " + str);
        }
    }

    public static final class d extends WebChromeClient {
        private d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        public final boolean a(JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String str;
            if (consoleMessage == null || consoleMessage.message() == null) {
                return false;
            }
            if (!consoleMessage.message().contains("Uncaught ReferenceError")) {
                Object[] objArr = new Object[3];
                objArr[0] = consoleMessage.message();
                if (consoleMessage.sourceId() == null) {
                    str = "";
                } else {
                    str = " at " + consoleMessage.sourceId();
                }
                objArr[1] = str;
                objArr[2] = Integer.valueOf(consoleMessage.lineNumber());
                MraidLog.d("JS console", String.format("%s%s:%d", objArr));
            }
            if (consoleMessage.message().contains("AppodealAlert")) {
                MraidLog.a("Appodeal", consoleMessage.message().replace("AppodealAlert:", ""));
            }
            return true;
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            MraidLog.d("JS alert", str2);
            return a(jsResult);
        }

        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            MraidLog.d("JS confirm", str2);
            return a(jsResult);
        }

        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            MraidLog.d("JS prompt", str2);
            return a(jsPromptResult);
        }
    }

    public interface e {
        void a(boolean z);
    }

    public i(Context context) {
        super(context);
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setScrollBarStyle(33554432);
        setFocusableInTouchMode(false);
        this.f3020a = new m(context);
        setOnTouchListener(new a());
        setWebChromeClient(f3019h);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        setBackgroundColor(0);
        this.f3021b = new m(context, this, new b());
    }

    public void a(String str) {
        if (d()) {
            MraidLog.d(f3018g, "can't evaluating js: WebView is destroyed");
        } else if (TextUtils.isEmpty(str)) {
            MraidLog.d(f3018g, "can't evaluating js: js is empty");
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    String str2 = f3018g;
                    MraidLog.d(str2, "evaluating js: " + str);
                    evaluateJavascript(str, new c());
                    return;
                } catch (Throwable th) {
                    MraidLog.a(f3018g, th.getMessage());
                }
            }
            String str3 = f3018g;
            MraidLog.d(str3, "loading url: " + str);
            loadUrl("javascript:" + str);
        }
    }

    public final void b() {
        MraidLog.d(f3018g, "onPause");
        try {
            onPause();
        } catch (Throwable th) {
            MraidLog.a(f3018g, th);
        }
        this.f3024e = true;
        i();
    }

    public final void c() {
        MraidLog.d(f3018g, "onResume");
        try {
            onResume();
        } catch (Throwable th) {
            MraidLog.a(f3018g, th);
        }
        this.f3024e = false;
        i();
    }

    public void computeScroll() {
    }

    public boolean d() {
        return this.f3025f;
    }

    public void destroy() {
        this.f3025f = true;
        try {
            g();
            removeAllViews();
            this.f3021b.c();
            super.destroy();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean e() {
        return this.f3023d;
    }

    public void f() {
        this.f3021b.e();
    }

    public void g() {
        stopLoading();
        loadUrl("");
        b();
    }

    public void h() {
        this.f3020a.b();
    }

    public final void i() {
        boolean z = !this.f3024e && this.f3021b.b();
        if (z != this.f3023d) {
            this.f3023d = z;
            e eVar = this.f3022c;
            if (eVar != null) {
                eVar.a(z);
            }
        }
    }

    public boolean j() {
        return this.f3020a.a();
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            c();
        } else {
            b();
        }
    }

    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return false;
    }

    public void setListener(e eVar) {
        this.f3022c = eVar;
    }
}
