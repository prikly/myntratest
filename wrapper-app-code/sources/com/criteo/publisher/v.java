package com.criteo.publisher;

import com.criteo.publisher.logging.a;
import com.criteo.publisher.logging.b;
import com.criteo.publisher.logging.e;
import java.lang.reflect.Method;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: ErrorLogMessage.kt */
public final class v {
    static {
        new v();
    }

    private v() {
    }

    @a.C0026a
    public static final e b(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        StringBuilder sb = new StringBuilder();
        sb.append("Internal error in ");
        Method enclosingMethod = new b().getClass().getEnclosingMethod();
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
        return new e(6, sb.toString(), th, "onUncaughtErrorAtPublicApi");
    }

    public static final e c(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        return new e(6, "Uncaught error in thread", th, "onUncaughtErrorInThread");
    }

    public static final e a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        return new e(6, "Assertion failed", th, "onAssertFailed");
    }

    public static final e d(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        return new e(4, "Uncaught expected exception in thread", th, "onUncaughtExpectedExceptionInThread");
    }
}
