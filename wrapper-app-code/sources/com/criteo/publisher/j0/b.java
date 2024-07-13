package com.criteo.publisher.j0;

import com.criteo.publisher.Bid;
import com.criteo.publisher.CriteoInterstitial;
import com.criteo.publisher.c;
import com.criteo.publisher.logging.a;
import com.criteo.publisher.logging.e;
import com.criteo.publisher.model.InterstitialAdUnit;
import com.criteo.publisher.o;
import java.lang.reflect.Method;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: InterstitialLogMessage.kt */
public final class b {
    static {
        new b();
    }

    private b() {
    }

    public static final e a(InterstitialAdUnit interstitialAdUnit) {
        return new e(0, "Interstitial initialized for " + interstitialAdUnit, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e c(CriteoInterstitial criteoInterstitial) {
        Intrinsics.checkParameterIsNotNull(criteoInterstitial, "interstitial");
        return new e(0, "Interstitial(" + o.a(criteoInterstitial) + ") is loading", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e a(CriteoInterstitial criteoInterstitial, Bid bid) {
        Intrinsics.checkParameterIsNotNull(criteoInterstitial, "interstitial");
        StringBuilder sb = new StringBuilder();
        sb.append("Interstitial(");
        sb.append(o.a(criteoInterstitial));
        sb.append(") is loading with bid ");
        sb.append(bid != null ? c.a(bid) : null);
        return new e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e b(CriteoInterstitial criteoInterstitial) {
        StringBuilder sb = new StringBuilder();
        sb.append("Interstitial(");
        sb.append(criteoInterstitial != null ? o.a(criteoInterstitial) : null);
        sb.append(") is loaded");
        return new e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e a(CriteoInterstitial criteoInterstitial) {
        StringBuilder sb = new StringBuilder();
        sb.append("Interstitial(");
        sb.append(criteoInterstitial != null ? o.a(criteoInterstitial) : null);
        sb.append(") failed to load");
        return new e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e a(CriteoInterstitial criteoInterstitial, boolean z) {
        Intrinsics.checkParameterIsNotNull(criteoInterstitial, "interstitial");
        return new e(0, "Interstitial(" + o.a(criteoInterstitial) + ") is isAdLoaded=" + z, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e d(CriteoInterstitial criteoInterstitial) {
        Intrinsics.checkParameterIsNotNull(criteoInterstitial, "interstitial");
        return new e(0, "Interstitial(" + o.a(criteoInterstitial) + ") is showing", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    @a.C0026a
    public static final e a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Calling ");
        Method enclosingMethod = new com.criteo.publisher.logging.b().getClass().getEnclosingMethod();
        String str = null;
        if (enclosingMethod != null) {
            if (enclosingMethod.isAnnotationPresent(a.C0026a.class)) {
                a aVar = a.f2629a;
                StackTraceElement stackTraceElement = (StackTraceElement) SequencesKt.elementAtOrNull(SequencesKt.asSequence(ArrayIteratorKt.iterator(new Exception().getStackTrace())), 1);
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    Intrinsics.checkExpressionValueIsNotNull(className, "stackTraceElement.className");
                    str = StringsKt.removePrefix(className, "com.criteo.publisher.") + '#' + stackTraceElement.getMethodName() + ':' + stackTraceElement.getLineNumber();
                }
            } else {
                str = a.f2629a.a(enclosingMethod);
            }
        }
        sb.append(str);
        sb.append(" with a null application");
        return new e(5, sb.toString(), (Throwable) null, "onMethodCalledWithNullApplication", 4, (DefaultConstructorMarker) null);
    }
}
