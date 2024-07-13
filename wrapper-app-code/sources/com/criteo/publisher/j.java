package com.criteo.publisher;

import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.e0.c;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.s;

/* compiled from: ConsumableBidLoader */
public class j {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final g f2548a = h.b(getClass());

    /* renamed from: b  reason: collision with root package name */
    private final e f2549b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final i f2550c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final c f2551d;

    public j(e eVar, i iVar, c cVar) {
        this.f2549b = eVar;
        this.f2550c = iVar;
        this.f2551d = cVar;
    }

    /* compiled from: ConsumableBidLoader */
    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdUnit f2552a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BidResponseListener f2553b;

        a(AdUnit adUnit, BidResponseListener bidResponseListener) {
            this.f2552a = adUnit;
            this.f2553b = bidResponseListener;
        }

        public void a(s sVar) {
            a(new Bid(this.f2552a.getAdUnitType(), j.this.f2550c, sVar));
        }

        public void a() {
            a((Bid) null);
        }

        private void a(Bid bid) {
            j.this.f2548a.a(f.a(this.f2552a, bid));
            j.this.f2551d.a(new Runnable(bid) {
                public final /* synthetic */ Bid f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    BidResponseListener.this.onResponse(this.f$1);
                }
            });
        }
    }

    public void a(AdUnit adUnit, ContextData contextData, BidResponseListener bidResponseListener) {
        this.f2549b.a(adUnit, contextData, new a(adUnit, bidResponseListener));
    }
}
