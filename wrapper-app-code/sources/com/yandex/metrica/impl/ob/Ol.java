package com.yandex.metrica.impl.ob;

import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

public final class Ol {

    /* renamed from: a  reason: collision with root package name */
    private static final BigInteger f4717a = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: b  reason: collision with root package name */
    private static final BigInteger f4718b = BigInteger.valueOf(Long.MIN_VALUE);

    public static final Pair a(BigDecimal bigDecimal) {
        int i = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        Intrinsics.checkNotNullExpressionValue(unscaledValue, "value.unscaledValue()");
        while (true) {
            if (unscaledValue.compareTo(f4717a) <= 0 && unscaledValue.compareTo(f4718b) >= 0) {
                return TuplesKt.to(Long.valueOf(unscaledValue.longValue()), Integer.valueOf(i));
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            Intrinsics.checkNotNullExpressionValue(unscaledValue, "bigIntMantissa.divide(BigInteger.TEN)");
            i++;
        }
    }
}
