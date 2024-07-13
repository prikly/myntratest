package com.yandex.metrica;

import com.yandex.metrica.impl.ob.A2;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class AdRevenue {
    public final String adNetwork;
    public final String adPlacementId;
    public final String adPlacementName;
    public final BigDecimal adRevenue;
    public final AdType adType;
    public final String adUnitId;
    public final String adUnitName;
    public final Currency currency;
    public final Map<String, String> payload;
    public final String precision;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final BigDecimal f3353a;

        /* renamed from: b  reason: collision with root package name */
        private final Currency f3354b;

        /* renamed from: c  reason: collision with root package name */
        private AdType f3355c;

        /* renamed from: d  reason: collision with root package name */
        private String f3356d;

        /* renamed from: e  reason: collision with root package name */
        private String f3357e;

        /* renamed from: f  reason: collision with root package name */
        private String f3358f;

        /* renamed from: g  reason: collision with root package name */
        private String f3359g;

        /* renamed from: h  reason: collision with root package name */
        private String f3360h;
        private String i;
        private Map<String, String> j;

        public AdRevenue build() {
            return new AdRevenue(this.f3353a, this.f3354b, this.f3355c, this.f3356d, this.f3357e, this.f3358f, this.f3359g, this.f3360h, this.i, this.j);
        }

        public Builder withAdNetwork(String str) {
            this.f3356d = str;
            return this;
        }

        public Builder withAdPlacementId(String str) {
            this.f3359g = str;
            return this;
        }

        public Builder withAdPlacementName(String str) {
            this.f3360h = str;
            return this;
        }

        public Builder withAdType(AdType adType) {
            this.f3355c = adType;
            return this;
        }

        public Builder withAdUnitId(String str) {
            this.f3357e = str;
            return this;
        }

        public Builder withAdUnitName(String str) {
            this.f3358f = str;
            return this;
        }

        public Builder withPayload(Map<String, String> map) {
            this.j = (map != null && !A2.b((Map) map)) ? new HashMap(map) : null;
            return this;
        }

        public Builder withPrecision(String str) {
            this.i = str;
            return this;
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f3353a = bigDecimal;
            this.f3354b = currency;
        }
    }

    public static Builder newBuilder(BigDecimal bigDecimal, Currency currency2) {
        return new Builder(bigDecimal, currency2);
    }

    private AdRevenue(BigDecimal bigDecimal, Currency currency2, AdType adType2, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        Map<String, String> map2;
        this.adRevenue = bigDecimal;
        this.currency = currency2;
        this.adType = adType2;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        if (map == null) {
            map2 = null;
        } else {
            map2 = A2.d(map);
        }
        this.payload = map2;
    }

    public static Builder newBuilder(long j, Currency currency2) {
        return new Builder(A2.a(j), currency2);
    }

    public static Builder newBuilder(double d2, Currency currency2) {
        return new Builder(new BigDecimal(A2.a(d2, 0.0d)), currency2);
    }
}
