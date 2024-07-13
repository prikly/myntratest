package com.ironsource.sdk.controller;

import android.os.Build;
import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

class d {

    /* renamed from: b  reason: collision with root package name */
    private static final String f9110b = d.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    final x.d f9111a;

    d(x.d dVar) {
        this.f9111a = dVar;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, String str2) {
        if (this.f9111a == null) {
            Logger.e(f9110b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = x.d.class.getDeclaredMethod(str, new Class[]{String.class});
        if (Build.VERSION.SDK_INT >= 17) {
            if (!declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
                throw new AccessControlException("Trying to access a private function: " + str);
            }
        }
        declaredMethod.invoke(this.f9111a, new Object[]{str2});
    }
}
