package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/services/core/webview/bridge/NativeCallback;", "remove"}, k = 3, mv = {1, 4, 2})
/* compiled from: SharedInstances.kt */
final class SharedInstances$webViewAppNativeCallbackSubject$1 implements INativeCallbackSubject {
    public static final SharedInstances$webViewAppNativeCallbackSubject$1 INSTANCE = new SharedInstances$webViewAppNativeCallbackSubject$1();

    SharedInstances$webViewAppNativeCallbackSubject$1() {
    }

    public final void remove(NativeCallback nativeCallback) {
        Intrinsics.checkNotNullParameter(nativeCallback, "it");
        WebViewApp.getCurrentApp().removeCallback(nativeCallback);
    }
}
