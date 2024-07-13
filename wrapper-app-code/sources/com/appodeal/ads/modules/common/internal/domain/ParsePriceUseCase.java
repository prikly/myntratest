package com.appodeal.ads.modules.common.internal.domain;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/domain/ParsePriceUseCase;", "", "", "price", "currency", "", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Double;", "<init>", "()V", "apd_internal"}, k = 1, mv = {1, 6, 0})
public final class ParsePriceUseCase {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0017 A[Catch:{ all -> 0x0011 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x001c A[Catch:{ all -> 0x0011 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f A[Catch:{ all -> 0x0011 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Double invoke(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0004
            r11 = 0
            return r11
        L_0x0004:
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L_0x0014
            int r2 = r12.length()     // Catch:{ all -> 0x0011 }
            if (r2 != 0) goto L_0x000f
            goto L_0x0014
        L_0x000f:
            r2 = 0
            goto L_0x0015
        L_0x0011:
            r12 = move-exception
            goto L_0x0098
        L_0x0014:
            r2 = 1
        L_0x0015:
            if (r2 == 0) goto L_0x001c
            java.lang.Double r11 = kotlin.text.StringsKt.toDoubleOrNull(r11)     // Catch:{ all -> 0x0011 }
            return r11
        L_0x001c:
            java.text.DecimalFormat r2 = new java.text.DecimalFormat     // Catch:{ all -> 0x0011 }
            r2.<init>()     // Catch:{ all -> 0x0011 }
            java.util.Currency r12 = java.util.Currency.getInstance(r12)     // Catch:{ all -> 0x0011 }
            r2.setCurrency(r12)     // Catch:{ all -> 0x0011 }
            r4 = 46
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r11
            int r3 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r3, (char) r4, (int) r5, (boolean) r6, (int) r7, (java.lang.Object) r8)     // Catch:{ all -> 0x0011 }
            r5 = 44
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r11
            int r4 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r4, (char) r5, (int) r6, (boolean) r7, (int) r8, (java.lang.Object) r9)     // Catch:{ all -> 0x0011 }
            r5 = -1
            if (r3 <= r5) goto L_0x0043
            r6 = 1
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            if (r4 <= r5) goto L_0x0047
            r0 = 1
        L_0x0047:
            java.text.DecimalFormatSymbols r1 = new java.text.DecimalFormatSymbols     // Catch:{ all -> 0x0011 }
            r1.<init>()     // Catch:{ all -> 0x0011 }
            r5 = 44
            r7 = 46
            if (r6 == 0) goto L_0x0058
            if (r0 != 0) goto L_0x0058
            r1.setDecimalSeparator(r7)     // Catch:{ all -> 0x0011 }
            goto L_0x0069
        L_0x0058:
            if (r6 != 0) goto L_0x0060
            if (r0 == 0) goto L_0x0060
            r1.setDecimalSeparator(r5)     // Catch:{ all -> 0x0011 }
            goto L_0x0070
        L_0x0060:
            if (r6 == 0) goto L_0x0073
            if (r0 == 0) goto L_0x0073
            if (r3 <= r4) goto L_0x006d
            r1.setDecimalSeparator(r7)     // Catch:{ all -> 0x0011 }
        L_0x0069:
            r1.setGroupingSeparator(r5)     // Catch:{ all -> 0x0011 }
            goto L_0x0073
        L_0x006d:
            r1.setDecimalSeparator(r5)     // Catch:{ all -> 0x0011 }
        L_0x0070:
            r1.setGroupingSeparator(r7)     // Catch:{ all -> 0x0011 }
        L_0x0073:
            r2.setDecimalFormatSymbols(r1)     // Catch:{ all -> 0x0011 }
            java.lang.String r4 = r12.getSymbol()     // Catch:{ all -> 0x0011 }
            java.lang.String r12 = "formatCurrency.symbol"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r12)     // Catch:{ all -> 0x0011 }
            java.lang.String r5 = ""
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r11
            java.lang.String r12 = kotlin.text.StringsKt.replace$default((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (boolean) r6, (int) r7, (java.lang.Object) r8)     // Catch:{ all -> 0x0011 }
            java.lang.Number r12 = r2.parse(r12)     // Catch:{ all -> 0x0011 }
            if (r12 == 0) goto L_0x009b
            double r0 = r12.doubleValue()     // Catch:{ all -> 0x0011 }
            java.lang.Double r11 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0011 }
            return r11
        L_0x0098:
            r12.printStackTrace()
        L_0x009b:
            java.lang.Double r11 = kotlin.text.StringsKt.toDoubleOrNull(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.modules.common.internal.domain.ParsePriceUseCase.invoke(java.lang.String, java.lang.String):java.lang.Double");
    }
}
