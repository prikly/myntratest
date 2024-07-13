package com.bytedance.sdk.component.adexpress.d;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.a.z;
import java.lang.ref.WeakReference;

/* compiled from: WebViewBridgeProxy */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<z> f18429a;

    public d(z zVar) {
        this.f18429a = new WeakReference<>(zVar);
    }

    public void a(z zVar) {
        this.f18429a = new WeakReference<>(zVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<z> weakReference = this.f18429a;
        if (weakReference != null && weakReference.get() != null) {
            ((z) this.f18429a.get()).invokeMethod(str);
        }
    }
}
