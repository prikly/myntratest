package com.criteo.publisher.k0;

import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.h;
import com.criteo.publisher.i;
import com.criteo.publisher.model.n;
import com.criteo.publisher.model.p;
import com.criteo.publisher.model.t;
import com.criteo.publisher.model.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* compiled from: BidRequestSender */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final p f2563a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final x f2564b;

    /* renamed from: c  reason: collision with root package name */
    private final i f2565c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final g f2566d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f2567e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<n, Future<?>> f2568f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f2569g = new Object();

    public b(p pVar, x xVar, i iVar, g gVar, Executor executor) {
        this.f2563a = pVar;
        this.f2564b = xVar;
        this.f2565c = iVar;
        this.f2566d = gVar;
        this.f2567e = executor;
        this.f2568f = new ConcurrentHashMap();
    }

    public void a(t tVar) {
        this.f2567e.execute(new C0024b(this, tVar, (a) null));
    }

    public void b(List<n> list, ContextData contextData, h hVar) {
        ArrayList<n> arrayList = new ArrayList<>(list);
        synchronized (this.f2569g) {
            arrayList.removeAll(this.f2568f.keySet());
            if (!arrayList.isEmpty()) {
                FutureTask<Void> a2 = a(arrayList, contextData, hVar);
                for (n put : arrayList) {
                    this.f2568f.put(put, a2);
                }
                try {
                    this.f2567e.execute(a2);
                } catch (Throwable th) {
                    if (a2 != null) {
                        a((List<n>) arrayList);
                    }
                    throw th;
                }
            }
        }
    }

    private FutureTask<Void> a(List<n> list, ContextData contextData, h hVar) {
        return new FutureTask<>(new a(new c(this.f2566d, this.f2563a, this.f2565c, list, contextData, hVar), list), (Object) null);
    }

    /* compiled from: BidRequestSender */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f2570a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f2571b;

        a(c cVar, List list) {
            this.f2570a = cVar;
            this.f2571b = list;
        }

        public void run() {
            try {
                this.f2570a.run();
            } finally {
                b.this.a((List<n>) this.f2571b);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(List<n> list) {
        synchronized (this.f2569g) {
            this.f2568f.keySet().removeAll(list);
        }
    }

    public void a() {
        synchronized (this.f2569g) {
            for (Future<?> cancel : this.f2568f.values()) {
                cancel.cancel(true);
            }
            this.f2568f.clear();
        }
    }

    /* renamed from: com.criteo.publisher.k0.b$b  reason: collision with other inner class name */
    /* compiled from: BidRequestSender */
    private class C0024b extends com.criteo.publisher.x {

        /* renamed from: c  reason: collision with root package name */
        private final t f2573c;

        /* synthetic */ C0024b(b bVar, t tVar, a aVar) {
            this(tVar);
        }

        private C0024b(t tVar) {
            this.f2573c = tVar;
        }

        public void a() throws IOException {
            this.f2573c.b(b.this.f2566d.a(b.this.f2564b.a()));
        }
    }
}
