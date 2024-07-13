package com.appodeal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.applovin.sdk.AppLovinEventParameters;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.libs.network.AppodealEndpoints;
import com.appodeal.ads.modules.libs.network.HttpClient;
import com.appodeal.ads.networking.binders.c;
import com.appodeal.ads.storage.o;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.Arrays;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import org.json.JSONObject;

public abstract class s1 {

    /* renamed from: a  reason: collision with root package name */
    public final HttpClient.Method f17197a;

    /* renamed from: b  reason: collision with root package name */
    public final HttpClient.ZipBase64 f17198b;

    public static abstract class a extends s1 {

        /* renamed from: c  reason: collision with root package name */
        public final r<?> f17199c;

        /* renamed from: d  reason: collision with root package name */
        public final String f17200d;

        /* renamed from: e  reason: collision with root package name */
        public final double f17201e;

        /* renamed from: f  reason: collision with root package name */
        public final Integer f17202f;

        /* renamed from: g  reason: collision with root package name */
        public final Double f17203g;

        /* renamed from: com.appodeal.ads.s1$a$a  reason: collision with other inner class name */
        public static final class C0201a extends a {

            /* renamed from: h  reason: collision with root package name */
            public final String f17204h = Constants.CLICK;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0201a(r<?> rVar, String str, double d2, Integer num, Double d3) {
                super(rVar, str, d2, num, d3, 0);
                Intrinsics.checkNotNullParameter(rVar, "adRequest");
                Intrinsics.checkNotNullParameter(str, "adObjectId");
            }

            public final String g() {
                return this.f17204h;
            }
        }

        public static final class b extends a {

            /* renamed from: h  reason: collision with root package name */
            public final String f17205h = Constants.FINISH;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(r<?> rVar, String str, double d2, Integer num, Double d3) {
                super(rVar, str, d2, num, d3, 0);
                Intrinsics.checkNotNullParameter(rVar, "adRequest");
                Intrinsics.checkNotNullParameter(str, "adObjectId");
            }

            public final String g() {
                return this.f17205h;
            }
        }

        public static final class c extends a {

            /* renamed from: h  reason: collision with root package name */
            public final String f17206h = Constants.SHOW;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(r<?> rVar, String str, double d2, Integer num, Double d3) {
                super(rVar, str, d2, num, d3, 0);
                Intrinsics.checkNotNullParameter(rVar, "adRequest");
                Intrinsics.checkNotNullParameter(str, "adObjectId");
            }

            public final String g() {
                return this.f17206h;
            }
        }

        @DebugMetadata(c = "com.appodeal.ads.JsonRequest$AdController", f = "JsonRequest.kt", l = {157}, m = "bodyBuilder$suspendImpl")
        public static final class d extends ContinuationImpl {

            /* renamed from: a  reason: collision with root package name */
            public a f17207a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ Object f17208b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ a f17209c;

            /* renamed from: d  reason: collision with root package name */
            public int f17210d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(a aVar, Continuation<? super d> continuation) {
                super(continuation);
                this.f17209c = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f17208b = obj;
                this.f17210d |= RecyclerView.UNDEFINED_DURATION;
                return a.a(this.f17209c, this);
            }
        }

        public a(r<?> rVar, String str, double d2, Integer num, Double d3) {
            super(0);
            this.f17199c = rVar;
            this.f17200d = str;
            this.f17201e = d2;
            this.f17202f = num;
            this.f17203g = d3;
        }

        public /* synthetic */ a(r rVar, String str, double d2, Integer num, Double d3, int i) {
            this(rVar, str, d2, num, d3);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ java.lang.Object a(com.appodeal.ads.s1.a r6, kotlin.coroutines.Continuation r7) {
            /*
                boolean r0 = r7 instanceof com.appodeal.ads.s1.a.d
                if (r0 == 0) goto L_0x0013
                r0 = r7
                com.appodeal.ads.s1$a$d r0 = (com.appodeal.ads.s1.a.d) r0
                int r1 = r0.f17210d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f17210d = r1
                goto L_0x0018
            L_0x0013:
                com.appodeal.ads.s1$a$d r0 = new com.appodeal.ads.s1$a$d
                r0.<init>(r6, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f17208b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f17210d
                r3 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 != r3) goto L_0x002b
                com.appodeal.ads.s1$a r6 = r0.f17207a
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x0087
            L_0x002b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0033:
                kotlin.ResultKt.throwOnFailure(r7)
                com.appodeal.ads.b3 r7 = new com.appodeal.ads.b3
                r2 = 0
                r7.<init>((int) r2)
                com.appodeal.ads.r<?> r4 = r6.f17199c
                com.appodeal.ads.b3 r7 = r7.a((com.appodeal.ads.r<?>) r4)
                java.lang.String r4 = r6.f17200d
                java.lang.String r5 = "id"
                com.appodeal.ads.b3 r7 = r7.a((java.lang.String) r5, (java.lang.Object) r4)
                kotlin.jvm.internal.SpreadBuilder r4 = new kotlin.jvm.internal.SpreadBuilder
                r5 = 4
                r4.<init>(r5)
                java.util.Set<com.appodeal.ads.networking.binders.c> r5 = com.appodeal.ads.networking.binders.c.f16956a
                java.util.Set r5 = com.appodeal.ads.networking.binders.c.a.a()
                com.appodeal.ads.networking.binders.c[] r2 = new com.appodeal.ads.networking.binders.c[r2]
                java.lang.Object[] r2 = r5.toArray(r2)
                if (r2 == 0) goto L_0x00ae
                r4.addSpread(r2)
                com.appodeal.ads.networking.binders.c r2 = com.appodeal.ads.networking.binders.c.AdRequest
                r4.add(r2)
                com.appodeal.ads.networking.binders.c r2 = com.appodeal.ads.networking.binders.c.Sessions
                r4.add(r2)
                com.appodeal.ads.networking.binders.c r2 = com.appodeal.ads.networking.binders.c.AdStat
                r4.add(r2)
                int r2 = r4.size()
                com.appodeal.ads.networking.binders.c[] r2 = new com.appodeal.ads.networking.binders.c[r2]
                java.lang.Object[] r2 = r4.toArray(r2)
                com.appodeal.ads.networking.binders.c[] r2 = (com.appodeal.ads.networking.binders.c[]) r2
                r0.f17207a = r6
                r0.f17210d = r3
                java.lang.Object r7 = r7.a((com.appodeal.ads.networking.binders.c[]) r2, (kotlin.coroutines.Continuation<? super com.appodeal.ads.b3>) r0)
                if (r7 != r1) goto L_0x0087
                return r1
            L_0x0087:
                r0 = r7
                com.appodeal.ads.b3 r0 = (com.appodeal.ads.b3) r0
                double r1 = r6.f17201e
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L_0x009b
                java.lang.Double r1 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r1)
                java.lang.String r2 = "ecpm"
                r0.a((java.lang.String) r2, (java.lang.Object) r1)
            L_0x009b:
                java.lang.Integer r1 = r6.f17202f
                if (r1 == 0) goto L_0x00a4
                java.lang.String r2 = "placement_id"
                r0.a((java.lang.String) r2, (java.lang.Object) r1)
            L_0x00a4:
                java.lang.Double r6 = r6.f17203g
                if (r6 == 0) goto L_0x00ad
                java.lang.String r1 = "price_floor"
                r0.a((java.lang.String) r1, (java.lang.Object) r6)
            L_0x00ad:
                return r7
            L_0x00ae:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException
                java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.s1.a.a(com.appodeal.ads.s1$a, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final Object a(Continuation<? super b3> continuation) {
            return a(this, continuation);
        }
    }

    public static final class b extends s1 implements i5, k4, x0 {

        /* renamed from: c  reason: collision with root package name */
        public final b3 f17211c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ l4 f17212d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ com.appodeal.ads.networking.cache.a f17213e;

        /* renamed from: f  reason: collision with root package name */
        public final String f17214f;

        public /* synthetic */ b() {
            this(new b3(0), new l4(), new com.appodeal.ads.networking.cache.a(o.f17407b));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(b3 b3Var, l4 l4Var, com.appodeal.ads.networking.cache.a aVar) {
            super(0);
            Intrinsics.checkNotNullParameter(b3Var, "requestBodyBuilder");
            Intrinsics.checkNotNullParameter(l4Var, "retryProvider");
            Intrinsics.checkNotNullParameter(aVar, "cacheProvider");
            this.f17211c = b3Var;
            this.f17212d = l4Var;
            this.f17213e = aVar;
            this.f17214f = Constants.CONFIG;
        }

        public final Object a(Continuation<? super b3> continuation) {
            b3 b3Var = this.f17211c;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            Set<com.appodeal.ads.networking.binders.c> set = com.appodeal.ads.networking.binders.c.f16956a;
            Object[] array = SetsKt.minus(c.a.a(), com.appodeal.ads.networking.binders.c.ServicesData).toArray(new com.appodeal.ads.networking.binders.c[0]);
            if (array != null) {
                spreadBuilder.addSpread(array);
                spreadBuilder.add(com.appodeal.ads.networking.binders.c.Services);
                return b3Var.a((com.appodeal.ads.networking.binders.c[]) spreadBuilder.toArray(new com.appodeal.ads.networking.binders.c[spreadBuilder.size()]), continuation);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final JSONObject a() {
            return this.f17213e.a();
        }

        public final void a(JSONObject jSONObject) {
            this.f17213e.a(jSONObject);
        }

        public final boolean b() {
            return this.f17212d.b();
        }

        public final String g() {
            return this.f17214f;
        }
    }

    public static final class c extends s1 implements j5, x0 {

        /* renamed from: c  reason: collision with root package name */
        public final r<?> f17215c;

        /* renamed from: d  reason: collision with root package name */
        public final s<?> f17216d;

        /* renamed from: e  reason: collision with root package name */
        public final u<?, ?, ?> f17217e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ com.appodeal.ads.networking.cache.b f17218f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ k5 f17219g;

        /* renamed from: h  reason: collision with root package name */
        public final String f17220h = Constants.GET;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(r<?> rVar, s<?> sVar, u<?, ?, ?> uVar) {
            super(0);
            Intrinsics.checkNotNullParameter(rVar, "adRequest");
            Intrinsics.checkNotNullParameter(sVar, "adRequestParams");
            Intrinsics.checkNotNullParameter(uVar, "adTypeController");
            this.f17215c = rVar;
            this.f17216d = sVar;
            this.f17217e = uVar;
            String a2 = sVar.a();
            Intrinsics.checkNotNullExpressionValue(a2, "adRequestParams.requestPath");
            this.f17218f = new com.appodeal.ads.networking.cache.b(a2, o.f17407b);
            this.f17219g = new k5(sVar);
        }

        public final Object a(Continuation<? super b3> continuation) {
            b3 a2 = new b3(0).a(this.f17215c).a(this.f17216d).a(this.f17217e);
            SpreadBuilder spreadBuilder = new SpreadBuilder(6);
            Set<com.appodeal.ads.networking.binders.c> set = com.appodeal.ads.networking.binders.c.f16956a;
            Object[] array = c.a.a().toArray(new com.appodeal.ads.networking.binders.c[0]);
            if (array != null) {
                spreadBuilder.addSpread(array);
                spreadBuilder.add(com.appodeal.ads.networking.binders.c.AdRequest);
                spreadBuilder.add(com.appodeal.ads.networking.binders.c.Sessions);
                spreadBuilder.add(com.appodeal.ads.networking.binders.c.Adapters);
                spreadBuilder.add(com.appodeal.ads.networking.binders.c.AdStat);
                spreadBuilder.add(com.appodeal.ads.networking.binders.c.f16963h);
                return a2.a((com.appodeal.ads.networking.binders.c[]) spreadBuilder.toArray(new com.appodeal.ads.networking.binders.c[spreadBuilder.size()]), continuation);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final JSONObject a() {
            return this.f17218f.a();
        }

        public final void a(JSONObject jSONObject) {
            this.f17218f.a(jSONObject);
        }

        public final String c() {
            return this.f17219g.c();
        }

        public final String g() {
            return this.f17220h;
        }
    }

    public static final class d extends s1 {

        /* renamed from: c  reason: collision with root package name */
        public final double f17221c;

        /* renamed from: d  reason: collision with root package name */
        public final String f17222d;

        /* renamed from: e  reason: collision with root package name */
        public final String f17223e = "iap";

        public d(double d2, String str) {
            super(0);
            this.f17221c = d2;
            this.f17222d = str;
        }

        public final Object a(Continuation<? super b3> continuation) {
            b3 a2 = new b3(0).a(AppLovinEventParameters.REVENUE_AMOUNT, (Object) Boxing.boxDouble(this.f17221c)).a("currency", (Object) this.f17222d);
            Set<com.appodeal.ads.networking.binders.c> set = com.appodeal.ads.networking.binders.c.f16956a;
            Object[] array = c.a.a().toArray(new com.appodeal.ads.networking.binders.c[0]);
            if (array != null) {
                com.appodeal.ads.networking.binders.c[] cVarArr = (com.appodeal.ads.networking.binders.c[]) array;
                return a2.a((com.appodeal.ads.networking.binders.c[]) Arrays.copyOf(cVarArr, cVarArr.length), continuation);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String g() {
            return this.f17223e;
        }
    }

    public static final class e extends s1 implements x0 {

        /* renamed from: c  reason: collision with root package name */
        public final b3 f17224c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ com.appodeal.ads.networking.cache.c f17225d;

        /* renamed from: e  reason: collision with root package name */
        public final String f17226e;

        public /* synthetic */ e() {
            this(new b3(0), new com.appodeal.ads.networking.cache.c(o.f17407b));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(b3 b3Var, com.appodeal.ads.networking.cache.c cVar) {
            super(0);
            Intrinsics.checkNotNullParameter(b3Var, "requestBodyBuilder");
            Intrinsics.checkNotNullParameter(cVar, "cacheProvider");
            this.f17224c = b3Var;
            this.f17225d = cVar;
            this.f17226e = Constants.INIT;
        }

        public final Object a(Continuation<? super b3> continuation) {
            b3 b3Var = this.f17224c;
            SpreadBuilder spreadBuilder = new SpreadBuilder(3);
            Set<com.appodeal.ads.networking.binders.c> set = com.appodeal.ads.networking.binders.c.f16956a;
            Object[] array = c.a.a().toArray(new com.appodeal.ads.networking.binders.c[0]);
            if (array != null) {
                spreadBuilder.addSpread(array);
                spreadBuilder.add(com.appodeal.ads.networking.binders.c.Sessions);
                spreadBuilder.add(com.appodeal.ads.networking.binders.c.Adapters);
                return b3Var.a((com.appodeal.ads.networking.binders.c[]) spreadBuilder.toArray(new com.appodeal.ads.networking.binders.c[spreadBuilder.size()]), continuation);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final JSONObject a() {
            return this.f17225d.a();
        }

        public final void a(JSONObject jSONObject) {
            this.f17225d.a(jSONObject);
        }

        public final String g() {
            return this.f17226e;
        }
    }

    public static final class f extends s1 {

        /* renamed from: c  reason: collision with root package name */
        public final String f17227c;

        /* renamed from: d  reason: collision with root package name */
        public final long f17228d;

        /* renamed from: e  reason: collision with root package name */
        public final String f17229e;

        public /* synthetic */ f(String str) {
            this(str, Appodeal.getSegmentId());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str, long j) {
            super(0);
            Intrinsics.checkNotNullParameter(str, "packageName");
            this.f17227c = str;
            this.f17228d = j;
            this.f17229e = Constants.INSTALL;
        }

        public final Object a(Continuation<? super b3> continuation) {
            b3 a2 = new b3(0).a(OSOutcomeConstants.OUTCOME_ID, (Object) this.f17227c).a("segment_id", (Object) Boxing.boxLong(this.f17228d));
            Set<com.appodeal.ads.networking.binders.c> set = com.appodeal.ads.networking.binders.c.f16956a;
            Object[] array = c.a.a().toArray(new com.appodeal.ads.networking.binders.c[0]);
            if (array != null) {
                com.appodeal.ads.networking.binders.c[] cVarArr = (com.appodeal.ads.networking.binders.c[]) array;
                return a2.a((com.appodeal.ads.networking.binders.c[]) Arrays.copyOf(cVarArr, cVarArr.length), continuation);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String g() {
            return this.f17229e;
        }
    }

    public static final class g extends s1 {

        /* renamed from: c  reason: collision with root package name */
        public final String f17230c = Constants.SESSIONS;

        public g() {
            super(0);
        }

        public final Object a(Continuation<? super b3> continuation) {
            b3 b3Var = new b3(0);
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            Set<com.appodeal.ads.networking.binders.c> set = com.appodeal.ads.networking.binders.c.f16956a;
            Object[] array = c.a.a().toArray(new com.appodeal.ads.networking.binders.c[0]);
            if (array != null) {
                spreadBuilder.addSpread(array);
                spreadBuilder.add(com.appodeal.ads.networking.binders.c.Sessions);
                return b3Var.a((com.appodeal.ads.networking.binders.c[]) spreadBuilder.toArray(new com.appodeal.ads.networking.binders.c[spreadBuilder.size()]), continuation);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String g() {
            return this.f17230c;
        }
    }

    public s1() {
        this.f17197a = HttpClient.Method.POST;
        this.f17198b = HttpClient.ZipBase64.INSTANCE;
    }

    public /* synthetic */ s1(int i) {
        this();
    }

    public static String d() {
        return AppodealEndpoints.INSTANCE.getActiveEndpoint();
    }

    public abstract Object a(Continuation<? super b3> continuation);

    public final HttpClient.ZipBase64 e() {
        return this.f17198b;
    }

    public final HttpClient.Method f() {
        return this.f17197a;
    }

    public abstract String g();
}
