package com.criteo.publisher.i0;

import ms.bd.o.Pgl.c;

/* compiled from: Integration.kt */
public enum a {
    FALLBACK(235),
    STANDALONE(295),
    IN_HOUSE(296),
    MOPUB_MEDIATION(297),
    ADMOB_MEDIATION(298),
    MOPUB_APP_BIDDING(299),
    GAM_APP_BIDDING(c.COLLECT_MODE_FINANCE),
    CUSTOM_APP_BIDDING(301);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f2544a;

    private a(int i) {
        this.f2544a = i;
    }

    public final int a() {
        return this.f2544a;
    }
}
