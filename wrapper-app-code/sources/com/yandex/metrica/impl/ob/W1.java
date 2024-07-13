package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.impl.ob.C0751uf;

class W1 {

    /* renamed from: a  reason: collision with root package name */
    private final Revenue f5243a;

    /* renamed from: b  reason: collision with root package name */
    private final C0391fn<String> f5244b;

    /* renamed from: c  reason: collision with root package name */
    private final C0391fn<String> f5245c;

    /* renamed from: d  reason: collision with root package name */
    private final C0391fn<String> f5246d;

    /* renamed from: e  reason: collision with root package name */
    private final C0315cm f5247e;

    W1(Revenue revenue, C0315cm cmVar) {
        this.f5247e = cmVar;
        this.f5243a = revenue;
        this.f5244b = new C0316cn(30720, "revenue payload", cmVar);
        this.f5245c = new C0366en(new C0316cn(184320, "receipt data", cmVar), "<truncated data was not sent, see METRIKALIB-4568>");
        this.f5246d = new C0366en(new C0341dn(1000, "receipt signature", cmVar), "<truncated data was not sent, see METRIKALIB-4568>");
    }

    /* access modifiers changed from: package-private */
    public Pair<byte[], Integer> a() {
        C0751uf ufVar = new C0751uf();
        ufVar.f6891c = this.f5243a.currency.getCurrencyCode().getBytes();
        if (A2.a((Object) this.f5243a.price)) {
            ufVar.f6890b = this.f5243a.price.doubleValue();
        }
        if (A2.a((Object) this.f5243a.priceMicros)) {
            ufVar.f6895g = this.f5243a.priceMicros.longValue();
        }
        ufVar.f6892d = C0267b.e(new C0341dn(200, "revenue productID", this.f5247e).a(this.f5243a.productID));
        Integer num = this.f5243a.quantity;
        if (num == null) {
            num = 1;
        }
        ufVar.f6889a = num.intValue();
        ufVar.f6893e = C0267b.e(this.f5244b.a(this.f5243a.payload));
        int i = 0;
        if (A2.a((Object) this.f5243a.receipt)) {
            C0751uf.a aVar = new C0751uf.a();
            String a2 = this.f5245c.a(this.f5243a.receipt.data);
            if (C0267b.b(this.f5243a.receipt.data, a2)) {
                i = this.f5243a.receipt.data.length() + 0;
            }
            aVar.f6897a = C0267b.e(a2);
            aVar.f6898b = C0267b.e(this.f5246d.a(this.f5243a.receipt.signature));
            ufVar.f6894f = aVar;
        }
        return new Pair<>(MessageNano.toByteArray(ufVar), Integer.valueOf(i));
    }
}
