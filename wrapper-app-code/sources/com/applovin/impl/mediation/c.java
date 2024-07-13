package com.applovin.impl.mediation;

import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.f;
import com.applovin.impl.sdk.v;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final n f14601a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final v f14602b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final a f14603c;

    /* renamed from: d  reason: collision with root package name */
    private f f14604d;

    public interface a {
        void c(com.applovin.impl.mediation.a.c cVar);
    }

    c(n nVar, a aVar) {
        this.f14601a = nVar;
        this.f14602b = nVar.D();
        this.f14603c = aVar;
    }

    public void a() {
        if (v.a()) {
            this.f14602b.b("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        f fVar = this.f14604d;
        if (fVar != null) {
            fVar.a();
            this.f14604d = null;
        }
    }

    public void a(final com.applovin.impl.mediation.a.c cVar, long j) {
        if (v.a()) {
            v vVar = this.f14602b;
            vVar.b("AdHiddenCallbackTimeoutManager", "Scheduling in " + j + "ms...");
        }
        this.f14604d = f.a(j, this.f14601a, new Runnable() {
            public void run() {
                v unused = c.this.f14602b;
                if (v.a()) {
                    c.this.f14602b.b("AdHiddenCallbackTimeoutManager", "Timing out...");
                }
                c.this.f14603c.c(cVar);
            }
        });
    }
}
