package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class q0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<Callable<T>> f10253a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f10254b = false;

    interface a<T> extends Callable<T> {
        T a();
    }

    q0() {
    }

    /* access modifiers changed from: package-private */
    public void a(Callable<T> callable) {
        if (!this.f10254b) {
            this.f10253a.add(callable);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f10253a.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public List<T> a() {
        return a(-1);
    }

    /* access modifiers changed from: package-private */
    public List<T> a(long j) {
        List<Future<T>> list;
        this.f10254b = true;
        ArrayList arrayList = new ArrayList();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(this.f10253a.size());
        ArrayList arrayList2 = new ArrayList();
        if (j > 0) {
            try {
                list = newFixedThreadPool.invokeAll(this.f10253a, j, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
        } else {
            list = newFixedThreadPool.invokeAll(this.f10253a);
        }
        arrayList2.addAll(list);
        newFixedThreadPool.shutdownNow();
        for (int i = 0; i < arrayList2.size(); i++) {
            Future future = (Future) arrayList2.get(i);
            if (!future.isCancelled()) {
                try {
                    arrayList.add(future.get());
                } catch (Exception unused2) {
                }
            } else if (this.f10253a.get(i) instanceof a) {
                arrayList.add(((a) this.f10253a.get(i)).a());
            }
        }
        return arrayList;
    }
}
