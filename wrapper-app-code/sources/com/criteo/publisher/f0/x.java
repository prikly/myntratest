package com.criteo.publisher.f0;

/* compiled from: MetricSendingQueueProducer */
public class x {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final u f2504a;

    public x(u uVar) {
        this.f2504a = uVar;
    }

    public void a(r rVar) {
        for (n e2 : rVar.a()) {
            a(rVar, e2.e());
        }
    }

    /* compiled from: MetricSendingQueueProducer */
    class a implements p {
        a() {
        }

        public boolean a(n nVar) {
            return x.this.f2504a.a(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(r rVar, String str) {
        rVar.a(str, (p) new a());
    }
}
