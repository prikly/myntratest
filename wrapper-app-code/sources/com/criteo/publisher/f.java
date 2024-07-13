package com.criteo.publisher;

import com.criteo.publisher.i0.a;
import com.criteo.publisher.logging.e;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BiddingLogMessage.kt */
public final class f {
    static {
        new f();
    }

    private f() {
    }

    public static final e a(AdUnit adUnit, Bid bid) {
        Intrinsics.checkParameterIsNotNull(adUnit, "adUnit");
        StringBuilder sb = new StringBuilder();
        sb.append("Getting bid response for ");
        sb.append(adUnit);
        sb.append(". Bid: ");
        Double d2 = null;
        sb.append(bid != null ? c.a(bid) : null);
        sb.append(", price: ");
        if (bid != null) {
            d2 = Double.valueOf(bid.getPrice());
        }
        sb.append(d2);
        return new e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e a(int i) {
        return new e(0, "Silent mode is enabled, no requests will be fired for the next " + i + " seconds", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e a(n nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "adUnit");
        return new e(5, "Found an invalid AdUnit: " + nVar, (Throwable) null, "onInvalidAdUnit", 4, (DefaultConstructorMarker) null);
    }

    public static final e a(n nVar, a aVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "cacheAdUnit");
        Intrinsics.checkParameterIsNotNull(aVar, "integration");
        return new e(6, nVar + " requested but it is not supported for " + aVar, (Throwable) null, "onUnsupportedAdFormat", 4, (DefaultConstructorMarker) null);
    }
}
