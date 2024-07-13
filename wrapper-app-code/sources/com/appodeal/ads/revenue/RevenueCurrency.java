package com.appodeal.ads.revenue;

import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/revenue/RevenueCurrency;", "", "stringValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStringValue", "()Ljava/lang/String;", "asCurrency", "Ljava/util/Currency;", "USD", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
public enum RevenueCurrency {
    USD("USD");
    
    private final String stringValue;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] iArr = new int[RevenueCurrency.values().length];
            iArr[RevenueCurrency.USD.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private RevenueCurrency(String str) {
        this.stringValue = str;
    }

    public final Currency asCurrency() {
        if (WhenMappings.$EnumSwitchMapping$0[ordinal()] == 1) {
            Currency instance = Currency.getInstance(Locale.US);
            Intrinsics.checkNotNullExpressionValue(instance, "getInstance(Locale.US)");
            return instance;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getStringValue() {
        return this.stringValue;
    }
}
