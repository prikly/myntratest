package com.criteo.publisher.e0;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AsyncResources.kt */
public abstract class a {
    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void a(Function1<? super C0021a, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "resourceHandler");
        C0021a aVar = new C0021a();
        try {
            function1.invoke(aVar);
        } catch (Throwable th) {
            aVar.a();
            throw th;
        }
    }

    /* renamed from: com.criteo.publisher.e0.a$a  reason: collision with other inner class name */
    /* compiled from: AsyncResources.kt */
    public final class C0021a {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicBoolean f2395a = new AtomicBoolean(false);

        public C0021a() {
            a.this.a();
        }

        public final void a() {
            if (this.f2395a.compareAndSet(false, true)) {
                a.this.b();
            }
        }
    }
}
