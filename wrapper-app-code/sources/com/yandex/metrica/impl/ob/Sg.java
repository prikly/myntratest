package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.impl.ob.C0308cf;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Sg {

    /* renamed from: a  reason: collision with root package name */
    private final C0391fn<String> f4942a;

    /* renamed from: b  reason: collision with root package name */
    private final C0391fn<String> f4943b;

    /* renamed from: c  reason: collision with root package name */
    private final AdRevenue f4944c;

    static final class a extends Lambda implements Function1<byte[], Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0308cf f4945a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C0308cf cfVar) {
            super(1);
            this.f4945a = cfVar;
        }

        public Object invoke(Object obj) {
            this.f4945a.f5629e = (byte[]) obj;
            return Unit.INSTANCE;
        }
    }

    static final class b extends Lambda implements Function1<byte[], Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0308cf f4946a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C0308cf cfVar) {
            super(1);
            this.f4946a = cfVar;
        }

        public Object invoke(Object obj) {
            this.f4946a.f5632h = (byte[]) obj;
            return Unit.INSTANCE;
        }
    }

    static final class c extends Lambda implements Function1<byte[], Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0308cf f4947a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C0308cf cfVar) {
            super(1);
            this.f4947a = cfVar;
        }

        public Object invoke(Object obj) {
            this.f4947a.i = (byte[]) obj;
            return Unit.INSTANCE;
        }
    }

    static final class d extends Lambda implements Function1<byte[], Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0308cf f4948a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C0308cf cfVar) {
            super(1);
            this.f4948a = cfVar;
        }

        public Object invoke(Object obj) {
            this.f4948a.f5630f = (byte[]) obj;
            return Unit.INSTANCE;
        }
    }

    static final class e extends Lambda implements Function1<byte[], Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0308cf f4949a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C0308cf cfVar) {
            super(1);
            this.f4949a = cfVar;
        }

        public Object invoke(Object obj) {
            this.f4949a.f5631g = (byte[]) obj;
            return Unit.INSTANCE;
        }
    }

    static final class f extends Lambda implements Function1<byte[], Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0308cf f4950a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C0308cf cfVar) {
            super(1);
            this.f4950a = cfVar;
        }

        public Object invoke(Object obj) {
            this.f4950a.j = (byte[]) obj;
            return Unit.INSTANCE;
        }
    }

    static final class g extends Lambda implements Function1<byte[], Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0308cf f4951a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C0308cf cfVar) {
            super(1);
            this.f4951a = cfVar;
        }

        public Object invoke(Object obj) {
            this.f4951a.f5627c = (byte[]) obj;
            return Unit.INSTANCE;
        }
    }

    public Sg(AdRevenue adRevenue, C0315cm cmVar) {
        this.f4944c = adRevenue;
        this.f4942a = new C0341dn(100, "ad revenue strings", cmVar);
        this.f4943b = new C0316cn(30720, "ad revenue payload", cmVar);
    }

    public final Pair<byte[], Integer> a() {
        C0308cf cfVar = new C0308cf();
        Pair pair = TuplesKt.to(this.f4944c.adNetwork, new a(cfVar));
        int i = 0;
        Currency currency = this.f4944c.currency;
        Intrinsics.checkNotNullExpressionValue(currency, "revenue.currency");
        int i2 = 0;
        for (Pair pair2 : CollectionsKt.listOf(pair, TuplesKt.to(this.f4944c.adPlacementId, new b(cfVar)), TuplesKt.to(this.f4944c.adPlacementName, new c(cfVar)), TuplesKt.to(this.f4944c.adUnitId, new d(cfVar)), TuplesKt.to(this.f4944c.adUnitName, new e(cfVar)), TuplesKt.to(this.f4944c.precision, new f(cfVar)), TuplesKt.to(currency.getCurrencyCode(), new g(cfVar)))) {
            String str = (String) pair2.getFirst();
            byte[] e2 = C0267b.e(str);
            Intrinsics.checkNotNullExpressionValue(e2, "StringUtils.stringToBytesForProtobuf(value)");
            byte[] e3 = C0267b.e(this.f4942a.a(str));
            Intrinsics.checkNotNullExpressionValue(e3, "StringUtils.stringToBytesForProtobuf(result)");
            ((Function1) pair2.getSecond()).invoke(e3);
            i2 += e2.length - e3.length;
        }
        Integer num = (Integer) Tg.f5034a.get(this.f4944c.adType);
        if (num != null) {
            i = num.intValue();
        }
        cfVar.f5628d = i;
        C0308cf.a aVar = new C0308cf.a();
        BigDecimal bigDecimal = this.f4944c.adRevenue;
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "revenue.adRevenue");
        Pair a2 = Ol.a(bigDecimal);
        Nl nl = new Nl(((Number) a2.getFirst()).longValue(), ((Number) a2.getSecond()).intValue());
        aVar.f5633a = nl.b();
        aVar.f5634b = nl.a();
        cfVar.f5626b = aVar;
        Map<String, String> map = this.f4944c.payload;
        if (map != null) {
            String g2 = Tl.g(map);
            byte[] e4 = C0267b.e(this.f4943b.a(g2));
            Intrinsics.checkNotNullExpressionValue(e4, "StringUtils.stringToByte…oadTrimmer.trim(payload))");
            cfVar.k = e4;
            i2 += C0267b.e(g2).length - e4.length;
        }
        return TuplesKt.to(MessageNano.toByteArray(cfVar), Integer.valueOf(i2));
    }
}
