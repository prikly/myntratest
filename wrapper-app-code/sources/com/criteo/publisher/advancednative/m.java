package com.criteo.publisher.advancednative;

import com.criteo.publisher.Bid;
import com.criteo.publisher.c;
import com.criteo.publisher.logging.e;
import com.criteo.publisher.model.NativeAdUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeLogMessage.kt */
public final class m {
    static {
        new m();
    }

    private m() {
    }

    public static final e c(NativeAdUnit nativeAdUnit) {
        return new e(0, "NativeLoader initialized for " + nativeAdUnit, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e e(CriteoNativeLoader criteoNativeLoader) {
        Intrinsics.checkParameterIsNotNull(criteoNativeLoader, "nativeLoader");
        return new e(0, "Native(" + criteoNativeLoader.adUnit + ") is loading", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e a(CriteoNativeLoader criteoNativeLoader, Bid bid) {
        Intrinsics.checkParameterIsNotNull(criteoNativeLoader, "nativeLoader");
        StringBuilder sb = new StringBuilder();
        sb.append("Native(");
        sb.append(criteoNativeLoader.adUnit);
        sb.append(") is loading with bid ");
        sb.append(bid != null ? c.a(bid) : null);
        return new e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e d(CriteoNativeLoader criteoNativeLoader) {
        StringBuilder sb = new StringBuilder();
        sb.append("Native(");
        sb.append(criteoNativeLoader != null ? criteoNativeLoader.adUnit : null);
        sb.append(") is loaded");
        return new e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e b(CriteoNativeLoader criteoNativeLoader) {
        StringBuilder sb = new StringBuilder();
        sb.append("Native(");
        sb.append(criteoNativeLoader != null ? criteoNativeLoader.adUnit : null);
        sb.append(") failed to load");
        return new e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e c(CriteoNativeLoader criteoNativeLoader) {
        return b(criteoNativeLoader != null ? criteoNativeLoader.adUnit : null);
    }

    public static final e b(NativeAdUnit nativeAdUnit) {
        return new e(0, "Native(" + nativeAdUnit + ") impression registered", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e a(CriteoNativeLoader criteoNativeLoader) {
        return a(criteoNativeLoader != null ? criteoNativeLoader.adUnit : null);
    }

    public static final e a(NativeAdUnit nativeAdUnit) {
        return new e(0, "Native(" + nativeAdUnit + ") clicked", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }
}
