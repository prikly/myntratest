package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class G6 {

    /* renamed from: a  reason: collision with root package name */
    public static final G6 f4039a = new G6();

    private G6() {
    }

    public static final F6 a(Throwable th) {
        return f4039a.a(th, 1, 0);
    }

    private final F6 a(Throwable th, int i, int i2) {
        StackTraceElement[] stackTraceElementArr;
        F6 f6;
        ArrayList arrayList;
        String name = th.getClass().getName();
        String message = th.getMessage();
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (Throwable unused) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        Intrinsics.checkNotNullExpressionValue(stackTraceElementArr, "Utils.getStackTraceSafely(throwable)");
        ArrayList arrayList2 = new ArrayList(stackTraceElementArr.length);
        for (StackTraceElement d6 : stackTraceElementArr) {
            arrayList2.add(new D6(d6));
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            if (!(i2 < i)) {
                cause = null;
            }
            if (cause != null) {
                f6 = f4039a.a(cause, 30, i2 + 1);
                if (A2.a(19) || i2 >= i) {
                    arrayList = null;
                } else {
                    Throwable[] suppressed = th.getSuppressed();
                    Intrinsics.checkNotNullExpressionValue(suppressed, "throwable.suppressed");
                    ArrayList arrayList3 = new ArrayList(suppressed.length);
                    for (Throwable th2 : suppressed) {
                        G6 g6 = f4039a;
                        Intrinsics.checkNotNullExpressionValue(th2, "it");
                        arrayList3.add(g6.a(th2, 1, i2));
                    }
                    arrayList = arrayList3;
                }
                return new F6(name, message, arrayList2, f6, arrayList);
            }
        }
        f6 = null;
        if (A2.a(19)) {
        }
        arrayList = null;
        return new F6(name, message, arrayList2, f6, arrayList);
    }
}
