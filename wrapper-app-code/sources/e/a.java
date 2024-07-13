package e;

import e.a;
import f.c;
import f.e;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.entity.Event;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final AnalyticsConfig f7398a;

    /* renamed from: b  reason: collision with root package name */
    public final g.a f7399b;

    /* renamed from: c  reason: collision with root package name */
    public final b f7400c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f7401d = new Runnable() {
        public final void run() {
            a.this.a();
        }
    };

    public static final class b implements f.b<e>, c<e> {

        /* renamed from: a  reason: collision with root package name */
        public final g.a f7402a;

        private b(g.a aVar) {
            this.f7402a = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(e eVar) {
            try {
                this.f7402a.c(eVar.h());
            } catch (Throwable unused) {
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(e eVar) {
            try {
                this.f7402a.a(eVar.h());
            } catch (Throwable unused) {
            }
        }

        /* renamed from: c */
        public void b(e eVar) {
            a.a.b(new Runnable(eVar) {
                public final /* synthetic */ e f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    a.b.this.a(this.f$1);
                }
            });
        }

        /* renamed from: d */
        public void a(e eVar) {
            a.a.b(new Runnable(eVar) {
                public final /* synthetic */ e f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    a.b.this.b(this.f$1);
                }
            });
        }
    }

    public a(AnalyticsConfig analyticsConfig, g.a aVar) {
        this.f7398a = analyticsConfig;
        this.f7399b = aVar;
        this.f7400c = new b(aVar);
        a.a.b(new Runnable() {
            public final void run() {
                a.this.c();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        a(0);
    }

    public final void a(int i) {
        try {
            List<b.a> a2 = this.f7399b.a(this.f7398a.getEventBatchMaxSize());
            int size = a2.size();
            if (size <= 0 || size < i) {
                b();
            } else {
                a(a2);
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(b.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        a((List<b.a>) arrayList);
    }

    public final void a(List<b.a> list) {
        for (List next : a.a.a(list, this.f7398a.getEventBatchMaxSize())) {
            this.f7399b.b(next);
            ((e) ((e) new e(this.f7398a.getRequestUrl(), next).a(this.f7400c)).a(this.f7400c)).f();
        }
        b();
    }

    public final void b() {
        a.a.b(this.f7401d, this.f7398a.getIntervalMs());
    }

    public void b(Event event) {
        a.a.b(new Runnable(event) {
            public final /* synthetic */ Event f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                a.this.a(this.f$1);
            }
        });
    }

    public final boolean b(b.a aVar) {
        return this.f7399b.a(aVar);
    }

    public final void c() {
        try {
            a(this.f7399b.a());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public final synchronized void a(Event event) {
        try {
            b.a aVar = new b.a(this.f7398a.getContext(), event);
            if (b(aVar)) {
                a(this.f7398a.getEventBatchSize());
            } else {
                a(aVar);
            }
        } catch (Throwable unused) {
        }
    }
}
