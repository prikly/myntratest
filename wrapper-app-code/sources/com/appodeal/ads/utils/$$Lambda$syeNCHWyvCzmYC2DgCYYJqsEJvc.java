package com.appodeal.ads.utils;

import java.lang.Thread;

/* renamed from: com.appodeal.ads.utils.-$$Lambda$syeNCHWyvCzmYC2DgCYYJqsEJvc  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$syeNCHWyvCzmYC2DgCYYJqsEJvc implements Thread.UncaughtExceptionHandler {
    public static final /* synthetic */ $$Lambda$syeNCHWyvCzmYC2DgCYYJqsEJvc INSTANCE = new $$Lambda$syeNCHWyvCzmYC2DgCYYJqsEJvc();

    private /* synthetic */ $$Lambda$syeNCHWyvCzmYC2DgCYYJqsEJvc() {
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Log.log(th);
    }
}
