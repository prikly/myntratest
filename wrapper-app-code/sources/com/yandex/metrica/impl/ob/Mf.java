package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class Mf {

    /* renamed from: a  reason: collision with root package name */
    private final ICommonExecutor f4554a;

    /* renamed from: b  reason: collision with root package name */
    private final Sf f4555b;

    /* renamed from: c  reason: collision with root package name */
    private final Kf f4556c;

    /* renamed from: d  reason: collision with root package name */
    private final Kn<String> f4557d;

    /* renamed from: e  reason: collision with root package name */
    private final Kn<String> f4558e;

    public static final class a extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Mf f4559a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f4560b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f4561c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f4562d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map f4563e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Map f4564f;

        a(Mf mf, int i, String str, String str2, Map map, Map map2) {
            this.f4559a = mf;
            this.f4560b = i;
            this.f4561c = str;
            this.f4562d = str2;
            this.f4563e = map;
            this.f4564f = map2;
        }

        public void a() {
            Mf.a(this.f4559a).a(this.f4560b, this.f4561c, this.f4562d, this.f4563e, this.f4564f);
        }
    }

    public static final class b extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Mf f4565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f4566b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ byte[] f4567c;

        b(Mf mf, String str, byte[] bArr) {
            this.f4565a = mf;
            this.f4566b = str;
            this.f4567c = bArr;
        }

        public void a() {
            Mf.a(this.f4565a).a(this.f4566b, this.f4567c);
        }
    }

    public Mf(ICommonExecutor iCommonExecutor, Sf sf, Kf kf, Kn<String> kn, Kn<String> kn2) {
        this.f4554a = iCommonExecutor;
        this.f4555b = sf;
        this.f4556c = kf;
        this.f4557d = kn;
        this.f4558e = kn2;
    }

    public final void a(int i, String str, String str2, Map<String, String> map, Map<String, byte[]> map2) {
        this.f4556c.a(null);
        this.f4557d.a(str);
        this.f4554a.execute(new a(this, i, str, str2, map, map2));
    }

    public Mf(ICommonExecutor iCommonExecutor) {
        this(iCommonExecutor, new Sf());
    }

    private Mf(ICommonExecutor iCommonExecutor, Sf sf) {
        this(iCommonExecutor, sf, new Kf(sf), new Hn(new Gn("Event name")), new Hn(new Gn("Session extra key")));
    }

    public final void a(String str, byte[] bArr) {
        this.f4558e.a(str);
        this.f4554a.execute(new b(this, str, bArr));
    }

    public final boolean a() {
        this.f4555b.getClass();
        return R2.h();
    }

    public static final K0 a(Mf mf) {
        mf.f4555b.getClass();
        R2 k = R2.k();
        Intrinsics.checkNotNull(k);
        Intrinsics.checkNotNullExpressionValue(k, "provider.peekInitializedImpl()!!");
        C0493k1 d2 = k.d();
        Intrinsics.checkNotNull(d2);
        Intrinsics.checkNotNullExpressionValue(d2, "provider.peekInitialized…rterApiConsumerProvider!!");
        K0 b2 = d2.b();
        Intrinsics.checkNotNullExpressionValue(b2, "provider.peekInitialized…erProvider!!.mainReporter");
        return b2;
    }
}
