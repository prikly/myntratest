package com.criteo.publisher;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: BidExt.kt */
public final class c {
    public static final String a(Bid bid) {
        Intrinsics.checkParameterIsNotNull(bid, "$this$loggingId");
        String hexString = Integer.toHexString(bid.hashCode());
        Intrinsics.checkExpressionValueIsNotNull(hexString, "Integer.toHexString(hashCode())");
        return hexString;
    }
}
