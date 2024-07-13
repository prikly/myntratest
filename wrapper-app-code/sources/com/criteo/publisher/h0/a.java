package com.criteo.publisher.h0;

import com.criteo.publisher.Bid;
import com.criteo.publisher.c;
import com.criteo.publisher.logging.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppBiddingLogMessage.kt */
public final class a {
    static {
        new a();
    }

    private a() {
    }

    public static final e a(Bid bid) {
        StringBuilder sb = new StringBuilder();
        sb.append("Attempting to set bids as AppBidding from bid ");
        sb.append(bid != null ? c.a(bid) : null);
        return new e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e a(com.criteo.publisher.i0.a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "integration");
        return new e(0, "Failed to set bids as " + aVar + ": No bid found", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e a(com.criteo.publisher.i0.a aVar, String str) {
        Intrinsics.checkParameterIsNotNull(aVar, "integration");
        Intrinsics.checkParameterIsNotNull(str, "enrichment");
        return new e(0, aVar + " bid set as targeting: " + str, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e a(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to set bids: unknown '");
        sb.append(obj != null ? obj.getClass() : null);
        sb.append("' object given");
        return new e(6, sb.toString(), (Throwable) null, "onUnknownAdObjectEnriched", 4, (DefaultConstructorMarker) null);
    }
}
