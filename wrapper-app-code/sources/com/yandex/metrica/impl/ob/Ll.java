package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.List;

public class Ll<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public T f4512a;

    /* renamed from: b  reason: collision with root package name */
    private final ICommonExecutor f4513b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final List<E1<T>> f4514c = new ArrayList();

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E1 f4515a;

        a(E1 e1) {
            this.f4515a = e1;
        }

        public void run() {
            synchronized (Ll.this) {
                Object a2 = Ll.this.f4512a;
                if (a2 == null) {
                    Ll.this.f4514c.add(this.f4515a);
                } else {
                    this.f4515a.b(a2);
                }
            }
        }
    }

    public Ll(ICommonExecutor iCommonExecutor) {
        this.f4513b = iCommonExecutor;
    }

    public void a(E1<T> e1) {
        this.f4513b.execute(new a(e1));
    }

    public synchronized void a(T t) {
        this.f4512a = t;
        for (E1<T> b2 : this.f4514c) {
            b2.b(t);
        }
        this.f4514c.clear();
    }
}
