package com.criteo.publisher.logging;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PublisherCodeRemover.kt */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final String f2642a = "com.criteo.";

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f2643b = CollectionsKt.listOf("java.", "javax.", "sun.", "com.sun.", "com.intellij.", "org.jetbrains.", "kotlin.", "android.", "com.android.", "androidx.", "dalvik.", "libcore.", "com.google", "com.mopub", "org.json", "com.squareup.", "org.junit.");

    /* renamed from: c  reason: collision with root package name */
    private final StackTraceElement f2644c = new StackTraceElement("<private class>", "<private method>", (String) null, 0);

    public i() {
    }

    public Throwable c(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        try {
            return a(th, (Map<Throwable, Throwable>) new LinkedHashMap());
        } catch (Throwable th2) {
            return new a(th2);
        }
    }

    public Throwable a(Throwable th, Map<Throwable, Throwable> map) {
        Throwable th2;
        Intrinsics.checkParameterIsNotNull(th, "original");
        Intrinsics.checkParameterIsNotNull(map, "visited");
        Throwable th3 = map.get(th);
        if (th3 != null) {
            return th3;
        }
        if (b(th)) {
            th2 = a(th) ? new b(th) : new b();
        } else {
            th2 = th;
        }
        map.put(th, th2);
        Throwable cause = th.getCause();
        boolean areEqual = cause != null ? Intrinsics.areEqual((Object) cause.toString(), (Object) th.getMessage()) : false;
        a(th, th2, map);
        b(th, th2, map);
        a(th, th2);
        Throwable cause2 = th2.getCause();
        if (cause2 != null && areEqual) {
            c.f2648d.a(th2, cause2.toString());
        }
        return th2;
    }

    private void a(Throwable th, Throwable th2, Map<Throwable, Throwable> map) {
        Throwable cause = th.getCause();
        if (cause != null) {
            c.f2648d.a(th2, a(cause, map));
        }
    }

    private void b(Throwable th, Throwable th2, Map<Throwable, Throwable> map) {
        Throwable[] suppressed = th.getSuppressed();
        Intrinsics.checkExpressionValueIsNotNull(suppressed, "originalSuppressed");
        if (!(suppressed.length == 0)) {
            ArrayList arrayList = new ArrayList(suppressed.length);
            for (Throwable th3 : suppressed) {
                Intrinsics.checkExpressionValueIsNotNull(th3, "it");
                arrayList.add(a(th3, map));
            }
            c.f2648d.a(th2, (List<? extends Throwable>) arrayList);
        }
    }

    private void a(Throwable th, Throwable th2) {
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkExpressionValueIsNotNull(stackTrace, "original.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            Intrinsics.checkExpressionValueIsNotNull(stackTraceElement, "it");
            if (b(stackTraceElement) || a(stackTraceElement)) {
                arrayList.add(stackTraceElement);
            } else if (arrayList.isEmpty() || (!Intrinsics.areEqual((Object) (StackTraceElement) CollectionsKt.last(arrayList), (Object) this.f2644c))) {
                arrayList.add(this.f2644c);
            }
        }
        Object[] array = arrayList.toArray(new StackTraceElement[0]);
        if (array != null) {
            th2.setStackTrace((StackTraceElement[]) array);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private boolean a(StackTraceElement stackTraceElement) {
        List<String> list = this.f2643b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String startsWith$default : list) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkExpressionValueIsNotNull(className, "className");
            if (StringsKt.startsWith$default(className, startsWith$default, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    private boolean b(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        Intrinsics.checkExpressionValueIsNotNull(className, "className");
        return StringsKt.startsWith$default(className, this.f2642a, false, 2, (Object) null);
    }

    private boolean b(Throwable th) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkExpressionValueIsNotNull(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                stackTraceElement = null;
                break;
            }
            stackTraceElement = stackTrace[i];
            Intrinsics.checkExpressionValueIsNotNull(stackTraceElement, "it");
            if (!a(stackTraceElement)) {
                break;
            }
            i++;
        }
        if (stackTraceElement != null) {
            return !b(stackTraceElement);
        }
        return false;
    }

    private boolean a(Throwable th) {
        List<String> list = this.f2643b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String startsWith$default : list) {
            String name = th.getClass().getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "javaClass.name");
            if (StringsKt.startsWith$default(name, startsWith$default, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* compiled from: PublisherCodeRemover.kt */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private static final Field f2645a;

        /* renamed from: b  reason: collision with root package name */
        private static final Field f2646b;

        /* renamed from: c  reason: collision with root package name */
        private static final Field f2647c;

        /* renamed from: d  reason: collision with root package name */
        public static final c f2648d;

        static {
            c cVar = new c();
            f2648d = cVar;
            f2645a = cVar.a("cause");
            f2646b = cVar.a("suppressedExceptions");
            f2647c = cVar.a("detailMessage");
        }

        private c() {
        }

        private final Field a(String str) {
            Field declaredField = Throwable.class.getDeclaredField(str);
            Intrinsics.checkExpressionValueIsNotNull(declaredField, "field");
            declaredField.setAccessible(true);
            return declaredField;
        }

        public final void a(Throwable th, Throwable th2) {
            Intrinsics.checkParameterIsNotNull(th, "$this$internalCause");
            f2645a.set(th, th2);
        }

        public final void a(Throwable th, List<? extends Throwable> list) {
            Intrinsics.checkParameterIsNotNull(th, "$this$internalSuppressedExceptions");
            f2646b.set(th, list);
        }

        public final void a(Throwable th, String str) {
            Intrinsics.checkParameterIsNotNull(th, "$this$internalDetailMessage");
            f2647c.set(th, str);
        }
    }

    /* compiled from: PublisherCodeRemover.kt */
    public static final class b extends RuntimeException {
        public b() {
            this(OSNotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(java.lang.Throwable r2) {
            /*
                r1 = this;
                java.lang.String r0 = "throwable"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
                java.lang.Class r2 = r2.getClass()
                java.lang.String r2 = r2.getSimpleName()
                java.lang.String r0 = "throwable.javaClass.simpleName"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r0)
                r1.<init>((java.lang.String) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.logging.i.b.<init>(java.lang.Throwable):void");
        }

        private b(String str) {
            super("A " + str + " exception occurred from publisher's code");
        }
    }

    /* compiled from: PublisherCodeRemover.kt */
    private static final class a extends RuntimeException {
        static {
            new C0027a((DefaultConstructorMarker) null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super("Exception occurred while removing publisher code. " + th.getClass().getSimpleName() + ": " + th.getMessage());
            Intrinsics.checkParameterIsNotNull(th, "cause");
            StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.checkExpressionValueIsNotNull(stackTrace, "cause.stackTrace");
            Object[] copyOf = Arrays.copyOf(stackTrace, Math.min(th.getStackTrace().length, 5));
            Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            setStackTrace((StackTraceElement[]) copyOf);
        }

        /* renamed from: com.criteo.publisher.logging.i$a$a  reason: collision with other inner class name */
        /* compiled from: PublisherCodeRemover.kt */
        private static final class C0027a {
            private C0027a() {
            }

            public /* synthetic */ C0027a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
