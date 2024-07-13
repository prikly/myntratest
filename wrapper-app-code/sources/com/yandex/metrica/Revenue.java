package com.yandex.metrica;

import com.yandex.metrica.impl.ob.Gn;
import com.yandex.metrica.impl.ob.Hn;
import com.yandex.metrica.impl.ob.Kn;
import java.util.Currency;

public class Revenue {
    public final Currency currency;
    public final String payload;
    @Deprecated
    public final Double price;
    public final Long priceMicros;
    public final String productID;
    public final Integer quantity;
    public final Receipt receipt;

    public static class Receipt {
        public final String data;
        public final String signature;

        public static class Builder {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public String f3400a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public String f3401b;

            Builder() {
            }

            public Receipt build() {
                return new Receipt(this);
            }

            public Builder withData(String str) {
                this.f3400a = str;
                return this;
            }

            public Builder withSignature(String str) {
                this.f3401b = str;
                return this;
            }
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        private Receipt(Builder builder) {
            this.data = builder.f3400a;
            this.signature = builder.f3401b;
        }
    }

    @Deprecated
    public static Builder newBuilder(double d2, Currency currency2) {
        return new Builder(d2, currency2);
    }

    public static Builder newBuilderWithMicros(long j, Currency currency2) {
        return new Builder(j, currency2);
    }

    private Revenue(Builder builder) {
        this.price = builder.f3393a;
        this.priceMicros = builder.f3394b;
        this.currency = builder.f3395c;
        this.quantity = builder.f3396d;
        this.productID = builder.f3397e;
        this.payload = builder.f3398f;
        this.receipt = builder.f3399g;
    }

    public static class Builder {

        /* renamed from: h  reason: collision with root package name */
        private static final Kn<Currency> f3392h = new Hn(new Gn("revenue currency"));

        /* renamed from: a  reason: collision with root package name */
        Double f3393a;

        /* renamed from: b  reason: collision with root package name */
        Long f3394b;

        /* renamed from: c  reason: collision with root package name */
        Currency f3395c;

        /* renamed from: d  reason: collision with root package name */
        Integer f3396d;

        /* renamed from: e  reason: collision with root package name */
        String f3397e;

        /* renamed from: f  reason: collision with root package name */
        String f3398f;

        /* renamed from: g  reason: collision with root package name */
        Receipt f3399g;

        Builder(double d2, Currency currency) {
            ((Hn) f3392h).a(currency);
            this.f3393a = Double.valueOf(d2);
            this.f3395c = currency;
        }

        public Revenue build() {
            return new Revenue(this);
        }

        public Builder withPayload(String str) {
            this.f3398f = str;
            return this;
        }

        public Builder withProductID(String str) {
            this.f3397e = str;
            return this;
        }

        public Builder withQuantity(Integer num) {
            this.f3396d = num;
            return this;
        }

        public Builder withReceipt(Receipt receipt) {
            this.f3399g = receipt;
            return this;
        }

        Builder(long j, Currency currency) {
            ((Hn) f3392h).a(currency);
            this.f3394b = Long.valueOf(j);
            this.f3395c = currency;
        }
    }
}
