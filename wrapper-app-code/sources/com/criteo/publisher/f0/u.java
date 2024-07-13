package com.criteo.publisher.f0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MetricSendingQueue.kt */
public interface u extends k<n> {

    /* compiled from: MetricSendingQueue.kt */
    public static final class a implements u {

        /* renamed from: a  reason: collision with root package name */
        private final k<n> f2496a;

        public a(k<n> kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "delegate");
            this.f2496a = kVar;
        }

        public boolean a(n nVar) {
            Intrinsics.checkParameterIsNotNull(nVar, "element");
            return this.f2496a.a(nVar);
        }

        public List<n> a(int i) {
            return this.f2496a.a(i);
        }

        public int a() {
            return this.f2496a.a();
        }
    }
}
