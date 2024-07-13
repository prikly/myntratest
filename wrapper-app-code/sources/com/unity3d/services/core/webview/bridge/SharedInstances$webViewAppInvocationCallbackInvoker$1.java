package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/services/core/webview/bridge/Invocation;", "invokeCallback"}, k = 3, mv = {1, 4, 2})
/* compiled from: SharedInstances.kt */
final class SharedInstances$webViewAppInvocationCallbackInvoker$1 implements IInvocationCallbackInvoker {
    public static final SharedInstances$webViewAppInvocationCallbackInvoker$1 INSTANCE = new SharedInstances$webViewAppInvocationCallbackInvoker$1();

    SharedInstances$webViewAppInvocationCallbackInvoker$1() {
    }

    public final void invokeCallback(Invocation invocation) {
        Intrinsics.checkNotNullParameter(invocation, "it");
        WebViewApp.getCurrentApp().invokeCallback(invocation);
    }
}
