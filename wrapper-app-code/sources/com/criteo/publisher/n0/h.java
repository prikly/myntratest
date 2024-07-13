package com.criteo.publisher.n0;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableFuture */
public class h<T> implements Future<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<c<T>> f2893a = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f2894b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    private final FutureTask<T> f2895c = new FutureTask<>(new b());

    public static <T> h<T> b(T t) {
        h<T> hVar = new h<>();
        hVar.a(t);
        return hVar;
    }

    public void a(T t) {
        this.f2893a.compareAndSet((Object) null, new c(t));
        this.f2894b.countDown();
    }

    public boolean cancel(boolean z) {
        return this.f2895c.cancel(z);
    }

    public boolean isCancelled() {
        return this.f2895c.isCancelled();
    }

    public boolean isDone() {
        return this.f2895c.isDone();
    }

    public T get() throws InterruptedException, ExecutionException {
        this.f2895c.run();
        return this.f2895c.get();
    }

    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        this.f2895c.run();
        return this.f2895c.get(j, timeUnit);
    }

    /* compiled from: CompletableFuture */
    private class b implements Callable<T> {
        private b() {
        }

        public T call() throws Exception {
            h.this.f2894b.await();
            return ((c) h.this.f2893a.get()).a();
        }
    }

    /* compiled from: CompletableFuture */
    private static final class c<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f2897a;

        /* renamed from: b  reason: collision with root package name */
        private final Exception f2898b = null;

        c(T t) {
            this.f2897a = t;
        }

        /* access modifiers changed from: package-private */
        public T a() throws Exception {
            Exception exc = this.f2898b;
            if (exc == null) {
                return this.f2897a;
            }
            throw exc;
        }
    }
}
