package com.appodeal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.FrameLayout;
import com.appodeal.ads.Native;
import com.appodeal.ads.UserSettings;
import com.appodeal.ads.h2;
import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.inapp.InAppPurchaseValidateCallback;
import com.appodeal.ads.initializing.ApdInitializationCallback;
import com.appodeal.ads.initializing.ApdInitializationError;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.domain.ParsePriceUseCase;
import com.appodeal.ads.modules.libs.network.NetworkStatus;
import com.appodeal.ads.o1;
import com.appodeal.ads.o4;
import com.appodeal.ads.regulator.UserConsent;
import com.appodeal.ads.revenue.AdRevenueCallbacks;
import com.appodeal.ads.revenue.RevenueInfo;
import com.appodeal.ads.rewarded.Reward;
import com.appodeal.ads.segments.j;
import com.appodeal.ads.segments.n;
import com.appodeal.ads.t0;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.x;
import com.appodeal.ads.w2;
import com.appodeal.consent.Consent;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

public final class q4 {

    /* renamed from: a  reason: collision with root package name */
    public static final q4 f17047a = new q4();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f17048b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f17049c;

    /* renamed from: d  reason: collision with root package name */
    public static TestActivity f17050d;

    /* renamed from: e  reason: collision with root package name */
    public static final Lazy f17051e = LazyKt.lazy(e.f17068a);

    /* renamed from: f  reason: collision with root package name */
    public static AdRevenueCallbacks f17052f;

    /* renamed from: g  reason: collision with root package name */
    public static String f17053g = MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;

    /* renamed from: h  reason: collision with root package name */
    public static String f17054h;
    public static String i;
    public static final Lazy j = LazyKt.lazy(g.f17070a);
    public static final Lazy k = LazyKt.lazy(a.f17055a);
    public static final LinkedHashSet l = new LinkedHashSet();
    public static final Lazy m = LazyKt.lazy(f.f17069a);
    public static final Lazy n = LazyKt.lazy(d.f17067a);
    public static final MutableStateFlow<Boolean> o = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    public static final ArrayList p = new ArrayList();

    public static final class a extends Lambda implements Function0<List<? extends u<? extends l<? extends r<? extends l<?, ?, ?, ?>>, ? extends UnifiedAd<? extends UnifiedAdParams, ? extends UnifiedAdCallback, ? extends Object>, ? extends UnifiedAdParams, ? extends UnifiedAdCallback>, ? extends r<? extends l<? extends r<?>, ? extends UnifiedAd<?, ?, ?>, ? extends UnifiedAdParams, ? extends UnifiedAdCallback>>, ? extends s<?>>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17055a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return CollectionsKt.listOf(t0.a(), Native.a(), o1.a(), w2.a(), o4.a(), h2.a());
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.SdkCore$logEvent$1", f = "SdkCore.kt", l = {810}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f17056a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f17057b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f17058c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, Map<String, ? extends Object> map, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f17057b = str;
            this.f17058c = map;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f17057b, this.f17058c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f17056a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.appodeal.ads.services.c c2 = q4.c(q4.f17047a);
                String str = this.f17057b;
                Map<String, Object> map = this.f17058c;
                this.f17056a = 1;
                if (c2.a(str, map, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.SdkCore$onImpression$1", f = "SdkCore.kt", l = {851}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public RevenueInfo f17059a;

        /* renamed from: b  reason: collision with root package name */
        public int f17060b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f17061c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f17062d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f17063e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ com.appodeal.ads.segments.g f17064f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ double f17065g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ AdType f17066h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, com.appodeal.ads.segments.g gVar, double d2, AdType adType, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f17061c = str;
            this.f17062d = str2;
            this.f17063e = str3;
            this.f17064f = gVar;
            this.f17065g = d2;
            this.f17066h = adType;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f17061c, this.f17062d, this.f17063e, this.f17064f, this.f17065g, this.f17066h, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            RevenueInfo revenueInfo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f17060b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f17061c;
                String str2 = str == null ? "" : str;
                String str3 = this.f17062d;
                String str4 = str3 == null ? "" : str3;
                String str5 = this.f17063e;
                String str6 = str5 == null ? "" : str5;
                com.appodeal.ads.segments.g gVar = this.f17064f;
                String b2 = gVar == null ? null : gVar.b();
                RevenueInfo revenueInfo2 = new RevenueInfo(str2, str4, str6, b2 == null ? "" : b2, this.f17065g / ((double) 1000), this.f17066h.getCode(), this.f17066h.getCodeName());
                com.appodeal.ads.services.c c2 = q4.c(q4.f17047a);
                this.f17059a = revenueInfo2;
                this.f17060b = 1;
                if (c2.a(revenueInfo2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                revenueInfo = revenueInfo2;
            } else if (i == 1) {
                revenueInfo = this.f17059a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AdRevenueCallbacks e2 = q4.e();
            if (e2 != null) {
                e2.onAdRevenueReceive(revenueInfo);
            }
            q4.k().b(this.f17066h, this.f17065g, this.f17061c, this.f17063e);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function0<ParsePriceUseCase> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f17067a = new d();

        public d() {
            super(0);
        }

        public final Object invoke() {
            return new ParsePriceUseCase();
        }
    }

    public static final class e extends Lambda implements Function0<n0> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f17068a = new e();

        public e() {
            super(0);
        }

        public final Object invoke() {
            return new n0(0);
        }
    }

    public static final class f extends Lambda implements Function0<CoroutineScope> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f17069a = new f();

        public f() {
            super(0);
        }

        public final Object invoke() {
            return CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        }
    }

    public static final class g extends Lambda implements Function0<x> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f17070a = new g();

        public g() {
            super(0);
        }

        public final Object invoke() {
            HashMap hashMap = x.l;
            return x.a.a();
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.SdkCore$validateInAppPurchase$1", f = "SdkCore.kt", l = {822}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f17071a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ InAppPurchase f17072b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ InAppPurchaseValidateCallback f17073c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f17074d;

        public static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f17075a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ InAppPurchase f17076b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Context context, InAppPurchase inAppPurchase) {
                super(0);
                this.f17075a = context;
                this.f17076b = inAppPurchase;
            }

            public final Object invoke() {
                Context applicationContext = this.f17075a.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                Double invoke = q4.b(q4.f17047a).invoke(this.f17076b.getPrice(), this.f17076b.getCurrency());
                q4.a(applicationContext, invoke == null ? 0.0d : invoke.doubleValue(), this.f17076b.getCurrency());
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(InAppPurchase inAppPurchase, InAppPurchaseValidateCallback inAppPurchaseValidateCallback, Context context, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f17072b = inAppPurchase;
            this.f17073c = inAppPurchaseValidateCallback;
            this.f17074d = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new h(this.f17072b, this.f17073c, this.f17074d, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f17071a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.appodeal.ads.services.c c2 = q4.c(q4.f17047a);
                InAppPurchase inAppPurchase = this.f17072b;
                InAppPurchaseValidateCallback inAppPurchaseValidateCallback = this.f17073c;
                a aVar = new a(this.f17074d, inAppPurchase);
                this.f17071a = 1;
                if (c2.a(inAppPurchase, inAppPurchaseValidateCallback, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    public static final BannerView a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Log.log(LogConstants.KEY_SDK_PUBLIC, LogConstants.EVENT_GET, "BannerView", Log.LogLevel.verbose);
        BannerView bannerView = new BannerView(context, (AttributeSet) null);
        t0.c().a(-1);
        t0.c().a((FrameLayout) bannerView);
        return bannerView;
    }

    public static final com.appodeal.ads.context.b a(q4 q4Var) {
        q4Var.getClass();
        return com.appodeal.ads.context.b.f16327b;
    }

    public static final ArrayList a(int i2) {
        Log.log(LogConstants.KEY_SDK_PUBLIC, LogConstants.EVENT_GET, Intrinsics.stringPlus("NativeAds: ", Integer.valueOf(i2)), Log.LogLevel.verbose);
        ArrayList a2 = Native.c().a(i2);
        Intrinsics.checkNotNullExpressionValue(a2, "getNativeAdBox().getNativeAds(count)");
        return a2;
    }

    public static final List<String> a(Context context, int i2) {
        List<T> list;
        Intrinsics.checkNotNullParameter(context, "context");
        f17047a.getClass();
        List<u> d2 = d();
        ArrayList arrayList = new ArrayList();
        for (u uVar : d2) {
            if ((s4.a(uVar) & i2) > 0) {
                Set<String> a2 = uVar.g().b(context).a();
                Intrinsics.checkNotNullExpressionValue(a2, "adController.networkRegi…  .availableNetworksNames");
                list = CollectionsKt.filterNotNull(a2);
            } else {
                list = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, list);
        }
        return CollectionsKt.sorted(CollectionsKt.distinct(arrayList));
    }

    public static final void a(Context context, double d2, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!f17049c && !f17048b) {
            g1.w.b("Appodeal is not initialized");
        } else if (str == null) {
            g1.w.b("currency is null");
        } else if (j4.f16495a.isUserProtected()) {
            g1.w.b("The user did not accept the agreement");
        } else {
            i1 i1Var = g1.w;
            i1Var.a("inapp purchase, amount: " + d2 + ", currency: " + str);
            k0.a(context, d2, str);
        }
    }

    public static final void a(Native.MediaAssetType mediaAssetType) {
        Intrinsics.checkNotNullParameter(mediaAssetType, "requiredMediaAssetType");
        g1.v.a(Intrinsics.stringPlus("required native media assets type: ", mediaAssetType));
        Native.f16127c = mediaAssetType;
    }

    public static final void a(Native.NativeAdType nativeAdType) {
        if (nativeAdType == null) {
            g1.j.b("adType is null");
            return;
        }
        g1.j.a(Intrinsics.stringPlus("NativeAd type: ", nativeAdType));
        Native.f16126b = nativeAdType;
    }

    public static final void a(UserSettings.Gender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        g1.z.a();
        l5.a().setGender(gender);
    }

    public static final void a(UserConsent userConsent) {
        Intrinsics.checkNotNullParameter(userConsent, "userConsent");
        i1 i1Var = g1.f16414b;
        i1Var.a(userConsent.getZone().name() + " consent is " + userConsent.getStatus());
        x2.f17639a.getClass();
        x2.a(userConsent);
    }

    public static final void a(Log.LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        r0.f17088d = logLevel;
        g1.C.a(Intrinsics.stringPlus("log level: ", logLevel));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r1 = r3.getStatus();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(com.appodeal.consent.Consent r3) {
        /*
            com.appodeal.ads.i1 r0 = com.appodeal.ads.g1.f16414b
            if (r3 != 0) goto L_0x0005
            goto L_0x000b
        L_0x0005:
            com.appodeal.consent.Consent$Status r1 = r3.getStatus()
            if (r1 != 0) goto L_0x000d
        L_0x000b:
            r1 = 0
            goto L_0x0011
        L_0x000d:
            java.lang.String r1 = r1.name()
        L_0x0011:
            java.lang.String r2 = "consent is "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r1)
            r0.a(r1)
            com.appodeal.ads.x2 r0 = com.appodeal.ads.x2.f17639a
            r0.getClass()
            com.appodeal.ads.x2.a((com.appodeal.consent.Consent) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.q4.a(com.appodeal.consent.Consent):void");
    }

    public static final void a(Boolean bool) {
        g1.f16414b.a(Intrinsics.stringPlus("consent is ", bool == null ? null : bool.toString()));
        x2.a(bool);
    }

    public static final void a(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "name");
        if (StringsKt.isBlank(str)) {
            g1.D.b("name is blank");
            return;
        }
        i1 i1Var = g1.D;
        i1Var.a("set custom filter: " + str + ", value: " + obj);
        j.a(str, obj);
    }

    public static final void a(String str, String str2, String str3) {
        String str4;
        f17053g = str;
        f17054h = str2;
        i = str3;
        if (str3 != null) {
            str4 = "framework: " + str + ", pluginVersion: " + str2 + ", engineVersion: " + str3;
        } else {
            str4 = "framework: " + str + ", pluginVersion: " + str2;
        }
        g1.F.a(str4);
    }

    public static final void a(boolean z) {
        g1.G.a(Intrinsics.stringPlus("muteVideosIfCallsMuted: ", Boolean.valueOf(z)));
        r0.f17089e = z;
    }

    public static final boolean a(Activity activity, int i2, String str) {
        Intrinsics.checkNotNullParameter(str, "placementName");
        f17047a.getClass();
        boolean b2 = b(activity, i2, str);
        i1 i1Var = g1.l;
        i1Var.a(n5.a(i2) + ", result: " + b2);
        return b2;
    }

    public static final MrecView b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Log.log(LogConstants.KEY_SDK_PUBLIC, LogConstants.EVENT_GET, "MrecView", Log.LogLevel.verbose);
        MrecView mrecView = new MrecView(context, (AttributeSet) null);
        h2.c().a(-1);
        h2.c().a((FrameLayout) mrecView);
        return mrecView;
    }

    public static final ParsePriceUseCase b(q4 q4Var) {
        q4Var.getClass();
        return (ParsePriceUseCase) n.getValue();
    }

    public static final Reward b(String str) {
        Intrinsics.checkNotNullParameter(str, "placementName");
        com.appodeal.ads.segments.g a2 = com.appodeal.ads.segments.h.a(str);
        return new Reward(a2.c(), a2.d());
    }

    public static final void b(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "key");
        if (StringsKt.isBlank(str)) {
            g1.L.b("key is blank");
            return;
        }
        g1.L.a();
        ExtraData.INSTANCE.putExtra(str, obj);
    }

    public static final void b(boolean z) {
        g1.r.a(Intrinsics.stringPlus("728x90 Banners: ", Boolean.valueOf(z)));
        t0.f17415c = z;
    }

    public static final Pair<Double, String> c(String str) {
        Intrinsics.checkNotNullParameter(str, "placementName");
        com.appodeal.ads.segments.g a2 = com.appodeal.ads.segments.h.a(str);
        return new Pair<>(Double.valueOf(a2.c()), a2.d());
    }

    public static final com.appodeal.ads.services.c c(q4 q4Var) {
        q4Var.getClass();
        return com.appodeal.ads.services.g.b();
    }

    public static final void c(boolean z) {
        g1.s.a(Intrinsics.stringPlus("Banner animation: ", Boolean.valueOf(z)));
        t0.c().a(z);
    }

    public static List d() {
        return (List) k.getValue();
    }

    public static final void d(String str) {
        Intrinsics.checkNotNullParameter(str, DataKeys.USER_ID);
        g1.y.a();
        l5.a().setUserId(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002a, code lost:
        if (r2 != 2048) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean d(int r2) {
        /*
            r0 = 1
            if (r2 == r0) goto L_0x0059
            r1 = 2
            if (r2 == r1) goto L_0x0054
            r1 = 3
            if (r2 == r1) goto L_0x0041
            r0 = 4
            if (r2 == r0) goto L_0x003c
            r0 = 8
            if (r2 == r0) goto L_0x003c
            r0 = 16
            if (r2 == r0) goto L_0x003c
            r0 = 64
            if (r2 == r0) goto L_0x003c
            r0 = 128(0x80, float:1.794E-43)
            if (r2 == r0) goto L_0x0037
            r0 = 256(0x100, float:3.59E-43)
            if (r2 == r0) goto L_0x0032
            r0 = 512(0x200, float:7.175E-43)
            if (r2 == r0) goto L_0x002d
            r0 = 1024(0x400, float:1.435E-42)
            if (r2 == r0) goto L_0x003c
            r0 = 2048(0x800, float:2.87E-42)
            if (r2 == r0) goto L_0x003c
            goto L_0x0052
        L_0x002d:
            com.appodeal.ads.Native$a r2 = com.appodeal.ads.Native.a()
            goto L_0x005d
        L_0x0032:
            com.appodeal.ads.h2$b r2 = com.appodeal.ads.h2.a()
            goto L_0x005d
        L_0x0037:
            com.appodeal.ads.o4$b r2 = com.appodeal.ads.o4.a()
            goto L_0x005d
        L_0x003c:
            com.appodeal.ads.t0$b r2 = com.appodeal.ads.t0.a()
            goto L_0x005d
        L_0x0041:
            com.appodeal.ads.o1$a r2 = com.appodeal.ads.o1.a()
            boolean r2 = r2.i
            if (r2 == 0) goto L_0x0052
            com.appodeal.ads.w2$b r2 = com.appodeal.ads.w2.a()
            boolean r2 = r2.i
            if (r2 == 0) goto L_0x0052
            goto L_0x005f
        L_0x0052:
            r0 = 0
            goto L_0x005f
        L_0x0054:
            com.appodeal.ads.w2$b r2 = com.appodeal.ads.w2.a()
            goto L_0x005d
        L_0x0059:
            com.appodeal.ads.o1$a r2 = com.appodeal.ads.o1.a()
        L_0x005d:
            boolean r0 = r2.i
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.q4.d(int):boolean");
    }

    public static final AdRevenueCallbacks e() {
        return f17052f;
    }

    public static final void e(boolean z) {
        g1.q.a(Intrinsics.stringPlus("smart Banners: ", Boolean.valueOf(z)));
        t0.f17414b = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0058, code lost:
        if (r0 == false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037 A[Catch:{ Exception -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008a A[Catch:{ Exception -> 0x005b }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00b7 A[Catch:{ Exception -> 0x005b }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00e4 A[Catch:{ Exception -> 0x005b }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean e(int r5) {
        /*
            boolean r0 = o()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r5 & 3
            java.lang.String r2 = "getAdController()"
            r3 = 1
            if (r0 <= 0) goto L_0x005e
            com.appodeal.ads.q4 r0 = f17047a     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.o1$a r4 = com.appodeal.ads.o1.a()     // Catch:{ Exception -> 0x005b }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)     // Catch:{ Exception -> 0x005b }
            r0.getClass()     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.r r0 = r4.f()     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x0034
            boolean r4 = r0.C     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x002f
            boolean r4 = r0.u     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x002d
            boolean r0 = r0.v     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x002f
        L_0x002d:
            r0 = 1
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 != 0) goto L_0x005a
            com.appodeal.ads.w2$b r0 = com.appodeal.ads.w2.a()     // Catch:{ Exception -> 0x005b }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.r r0 = r0.f()     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x0057
            boolean r4 = r0.C     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x0052
            boolean r4 = r0.u     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x0050
            boolean r0 = r0.v     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x0052
        L_0x0050:
            r0 = 1
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r0 == 0) goto L_0x0057
            r0 = 1
            goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            if (r0 == 0) goto L_0x005e
        L_0x005a:
            return r3
        L_0x005b:
            r5 = move-exception
            goto L_0x00f4
        L_0x005e:
            r0 = r5 & 128(0x80, float:1.794E-43)
            if (r0 <= 0) goto L_0x008b
            com.appodeal.ads.q4 r0 = f17047a     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.o4$b r4 = com.appodeal.ads.o4.a()     // Catch:{ Exception -> 0x005b }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)     // Catch:{ Exception -> 0x005b }
            r0.getClass()     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.r r0 = r4.f()     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x0087
            boolean r4 = r0.C     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x0082
            boolean r4 = r0.u     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x0080
            boolean r0 = r0.v     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x0082
        L_0x0080:
            r0 = 1
            goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            if (r0 == 0) goto L_0x0087
            r0 = 1
            goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            if (r0 == 0) goto L_0x008b
            return r3
        L_0x008b:
            r0 = r5 & 3164(0xc5c, float:4.434E-42)
            if (r0 <= 0) goto L_0x00b8
            com.appodeal.ads.q4 r0 = f17047a     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.t0$b r4 = com.appodeal.ads.t0.a()     // Catch:{ Exception -> 0x005b }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)     // Catch:{ Exception -> 0x005b }
            r0.getClass()     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.r r0 = r4.f()     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x00b4
            boolean r4 = r0.C     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x00af
            boolean r4 = r0.u     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x00ad
            boolean r0 = r0.v     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x00af
        L_0x00ad:
            r0 = 1
            goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            if (r0 == 0) goto L_0x00b4
            r0 = 1
            goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            if (r0 == 0) goto L_0x00b8
            return r3
        L_0x00b8:
            r0 = r5 & 256(0x100, float:3.59E-43)
            if (r0 <= 0) goto L_0x00e5
            com.appodeal.ads.q4 r0 = f17047a     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.h2$b r4 = com.appodeal.ads.h2.a()     // Catch:{ Exception -> 0x005b }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)     // Catch:{ Exception -> 0x005b }
            r0.getClass()     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.r r0 = r4.f()     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x00e1
            boolean r2 = r0.C     // Catch:{ Exception -> 0x005b }
            if (r2 != 0) goto L_0x00dc
            boolean r2 = r0.u     // Catch:{ Exception -> 0x005b }
            if (r2 != 0) goto L_0x00da
            boolean r0 = r0.v     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x00dc
        L_0x00da:
            r0 = 1
            goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            if (r0 == 0) goto L_0x00e1
            r0 = 1
            goto L_0x00e2
        L_0x00e1:
            r0 = 0
        L_0x00e2:
            if (r0 == 0) goto L_0x00e5
            return r3
        L_0x00e5:
            r5 = r5 & 512(0x200, float:7.175E-43)
            if (r5 <= 0) goto L_0x00f7
            com.appodeal.ads.n2 r5 = com.appodeal.ads.Native.c()     // Catch:{ Exception -> 0x005b }
            boolean r5 = r5.b()     // Catch:{ Exception -> 0x005b }
            if (r5 == 0) goto L_0x00f7
            return r3
        L_0x00f4:
            com.appodeal.ads.utils.Log.log(r5)
        L_0x00f7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.q4.e(int):boolean");
    }

    public static final Date f() {
        return Constants.BUILD_DATE;
    }

    public static final void f(boolean z) {
        g1.B.a(Intrinsics.stringPlus("testing: ", Boolean.valueOf(z)));
        r0.f17086b = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
        if (r7 != 2048) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0093, code lost:
        if (r3 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0041 A[Catch:{ Exception -> 0x00a6 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005a A[Catch:{ Exception -> 0x00a6 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00aa A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean f(int r7) {
        /*
            boolean r0 = o()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 3
            r2 = 1
            if (r7 == r0) goto L_0x005b
            r0 = 4
            if (r7 == r0) goto L_0x0042
            r0 = 8
            if (r7 == r0) goto L_0x0042
            r0 = 16
            if (r7 == r0) goto L_0x0042
            r0 = 64
            if (r7 == r0) goto L_0x0042
            r0 = 256(0x100, float:3.59E-43)
            if (r7 == r0) goto L_0x0029
            r0 = 1024(0x400, float:1.435E-42)
            if (r7 == r0) goto L_0x0042
            r0 = 2048(0x800, float:2.87E-42)
            if (r7 == r0) goto L_0x0042
            goto L_0x00aa
        L_0x0029:
            com.appodeal.ads.h2$b r7 = com.appodeal.ads.h2.a()     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.r r7 = r7.f()     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.k2 r7 = (com.appodeal.ads.k2) r7     // Catch:{ Exception -> 0x00a6 }
            if (r7 != 0) goto L_0x0036
            goto L_0x003e
        L_0x0036:
            boolean r7 = r7.v()     // Catch:{ Exception -> 0x00a6 }
            if (r7 != r2) goto L_0x003e
            r7 = 1
            goto L_0x003f
        L_0x003e:
            r7 = 0
        L_0x003f:
            if (r7 == 0) goto L_0x00aa
            return r2
        L_0x0042:
            com.appodeal.ads.t0$b r7 = com.appodeal.ads.t0.a()     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.r r7 = r7.f()     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.w0 r7 = (com.appodeal.ads.w0) r7     // Catch:{ Exception -> 0x00a6 }
            if (r7 != 0) goto L_0x004f
            goto L_0x0057
        L_0x004f:
            boolean r7 = r7.v()     // Catch:{ Exception -> 0x00a6 }
            if (r7 != r2) goto L_0x0057
            r7 = 1
            goto L_0x0058
        L_0x0057:
            r7 = 0
        L_0x0058:
            if (r7 == 0) goto L_0x00aa
            return r2
        L_0x005b:
            com.appodeal.ads.o1$a r7 = com.appodeal.ads.o1.a()     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.r r7 = r7.f()     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.r1 r7 = (com.appodeal.ads.r1) r7     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.w2$b r0 = com.appodeal.ads.w2.a()     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.r r0 = r0.f()     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.q5 r0 = (com.appodeal.ads.q5) r0     // Catch:{ Exception -> 0x00a6 }
            if (r7 == 0) goto L_0x0085
            if (r0 == 0) goto L_0x0085
            double r2 = r7.t     // Catch:{ Exception -> 0x00a6 }
            double r4 = r0.t     // Catch:{ Exception -> 0x00a6 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0080
            boolean r7 = r7.v()     // Catch:{ Exception -> 0x00a6 }
            goto L_0x0084
        L_0x0080:
            boolean r7 = r0.v()     // Catch:{ Exception -> 0x00a6 }
        L_0x0084:
            return r7
        L_0x0085:
            if (r0 != 0) goto L_0x0095
            if (r7 != 0) goto L_0x008a
            goto L_0x0092
        L_0x008a:
            boolean r3 = r7.v()     // Catch:{ Exception -> 0x00a6 }
            if (r3 != r2) goto L_0x0092
            r3 = 1
            goto L_0x0093
        L_0x0092:
            r3 = 0
        L_0x0093:
            if (r3 != 0) goto L_0x00a5
        L_0x0095:
            if (r7 != 0) goto L_0x00aa
            if (r0 != 0) goto L_0x009a
            goto L_0x00a2
        L_0x009a:
            boolean r7 = r0.v()     // Catch:{ Exception -> 0x00a6 }
            if (r7 != r2) goto L_0x00a2
            r7 = 1
            goto L_0x00a3
        L_0x00a2:
            r7 = 0
        L_0x00a3:
            if (r7 == 0) goto L_0x00aa
        L_0x00a5:
            return r2
        L_0x00a6:
            r7 = move-exception
            com.appodeal.ads.utils.Log.log(r7)
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.q4.f(int):boolean");
    }

    public static final String g() {
        return i;
    }

    public static final void g(int i2) {
        g1.p.a(Intrinsics.stringPlus("Banner ViewId: ", Integer.valueOf(i2)));
        t0.c().a(i2);
        t0.c().a((FrameLayout) null);
    }

    public static final String h() {
        return f17053g;
    }

    public static final void h(int i2) {
        g1.u.a(Intrinsics.stringPlus("Mrec ViewId: ", Integer.valueOf(i2)));
        h2.c().a(i2);
        h2.c().a((FrameLayout) null);
    }

    public static final Log.LogLevel i() {
        return r0.f17088d;
    }

    public static final String j() {
        return f17054h;
    }

    public static final n0 k() {
        return (n0) f17051e.getValue();
    }

    public static final long l() {
        return n.c().f17272a;
    }

    public static final x m() {
        return (x) j.getValue();
    }

    public static final String n() {
        return Constants.SDK_VERSION;
    }

    public static final boolean o() {
        return f1.j() < 21;
    }

    public static boolean p() {
        return !(!c.f16319b.f16320a.f16353e.get());
    }

    public static final void a(q4 q4Var, Context context, int i2, List list) {
        q4Var.getClass();
        if (c1.b()) {
            a(4095, false);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((u) it.next()).a(context);
            }
            Activity activity = com.appodeal.ads.context.b.f16327b.getActivity();
            if (activity != null) {
                a(activity);
                return;
            }
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            u uVar = (u) it2.next();
            if ((s4.a(uVar) & i2) > 0) {
                uVar.a(context);
            }
        }
        if (f17049c) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ((u) it3.next()).q();
            }
        }
    }

    public static final double b(int i2) {
        boolean z = false;
        if (i2 == 1) {
            q4 q4Var = f17047a;
            r f2 = o1.a().f();
            q4Var.getClass();
            if (f2 == null) {
                return 0.0d;
            }
            if (!f2.C && (f2.u || f2.v)) {
                z = true;
            }
            if (z) {
                return f2.t;
            }
            return 0.0d;
        } else if (i2 == 2) {
            q4 q4Var2 = f17047a;
            r f3 = w2.a().f();
            q4Var2.getClass();
            if (f3 == null) {
                return 0.0d;
            }
            if (!f3.C && (f3.u || f3.v)) {
                z = true;
            }
            if (z) {
                return f3.t;
            }
            return 0.0d;
        } else if (i2 == 3) {
            return Math.max(b(1), b(2));
        } else {
            if (!(i2 == 4 || i2 == 8 || i2 == 16 || i2 == 64)) {
                if (i2 == 128) {
                    q4 q4Var3 = f17047a;
                    r f4 = o4.a().f();
                    q4Var3.getClass();
                    if (f4 == null) {
                        return 0.0d;
                    }
                    if (!f4.C && (f4.u || f4.v)) {
                        z = true;
                    }
                    if (z) {
                        return f4.t;
                    }
                    return 0.0d;
                } else if (i2 == 256) {
                    q4 q4Var4 = f17047a;
                    r f5 = h2.a().f();
                    q4Var4.getClass();
                    if (f5 == null) {
                        return 0.0d;
                    }
                    if (!f5.C && (f5.u || f5.v)) {
                        z = true;
                    }
                    if (z) {
                        return f5.t;
                    }
                    return 0.0d;
                } else if (!(i2 == 1024 || i2 == 2048)) {
                    return 0.0d;
                }
            }
            q4 q4Var5 = f17047a;
            r f6 = t0.a().f();
            q4Var5.getClass();
            if (f6 == null) {
                return 0.0d;
            }
            if (!f6.C && (f6.u || f6.v)) {
                z = true;
            }
            if (z) {
                return f6.t;
            }
            return 0.0d;
        }
    }

    public static final boolean c(int i2) {
        u uVar;
        if (i2 == 3) {
            return q1.a().f17036c;
        }
        if (!(i2 == 4 || i2 == 8 || i2 == 16 || i2 == 64)) {
            if (i2 == 128) {
                uVar = o4.a();
            } else if (i2 == 256) {
                uVar = h2.a();
            } else if (i2 == 512) {
                uVar = Native.a();
            } else if (!(i2 == 1024 || i2 == 2048)) {
                return false;
            }
            return uVar.k;
        }
        uVar = t0.a();
        return uVar.k;
    }

    public static final void a(Activity activity, int i2, int i3) {
        if (activity == null) {
            g1.k.b("activity is null");
        } else if (!o()) {
            g1.k.a();
            f17047a.getClass();
            com.appodeal.ads.context.g.f16345b.setActivity(activity);
            if ((i2 & 3) > 0) {
                q5 q5Var = (q5) w2.a().f();
                r1 r1Var = (r1) o1.a().f();
                if ((q5Var == null && r1Var == null) || !q1.a().b()) {
                    q1.a().c();
                    o1.a().c(activity);
                    w2.a().c(activity);
                }
            }
            if ((i2 & 128) > 0) {
                o4.a().d(activity);
            }
            if ((i2 & 3164) > 0) {
                t0.a().d(activity);
            }
            if ((i2 & 256) > 0) {
                h2.a().d(activity);
            }
            if ((i2 & 512) > 0) {
                Native.c().b(i3);
                Native.c().c();
            }
        }
    }

    public static final void d(boolean z) {
        g1.M.a(Intrinsics.stringPlus("value: ", Boolean.valueOf(z)));
        f17047a.getClass();
        com.appodeal.ads.context.g.f16345b.setAutomaticActivityObserving(z);
        r0.l = z;
    }

    public static final boolean a(int i2, String str) {
        i1 i1Var;
        String str2;
        Intrinsics.checkNotNullParameter(str, "placementName");
        if (!f17049c) {
            i1Var = g1.E;
            str2 = "Appodeal is not initialized";
        } else if (!NetworkStatus.INSTANCE.isConnected()) {
            i1Var = g1.E;
            str2 = "no Internet";
        } else {
            g1.E.a();
            try {
                com.appodeal.ads.segments.g a2 = com.appodeal.ads.segments.h.a(str);
                q4 q4Var = f17047a;
                t0.b a3 = t0.a();
                Intrinsics.checkNotNullExpressionValue(a3, "getAdController()");
                q4Var.getClass();
                if (!((i2 & 3164) > 0 ? a(a3.f(), a2) : false)) {
                    h2.b a4 = h2.a();
                    Intrinsics.checkNotNullExpressionValue(a4, "getAdController()");
                    if (!((i2 & 256) > 0 ? a(a4.f(), a2) : false)) {
                        o1.a a5 = o1.a();
                        Intrinsics.checkNotNullExpressionValue(a5, "getAdController()");
                        if (!((i2 & 1) > 0 ? a(a5.f(), a2) : false)) {
                            o4.b a6 = o4.a();
                            Intrinsics.checkNotNullExpressionValue(a6, "getAdController()");
                            if (!((i2 & 128) > 0 ? a(a6.f(), a2) : false)) {
                                w2.b a7 = w2.a();
                                Intrinsics.checkNotNullExpressionValue(a7, "getAdController()");
                                if ((i2 & 2) > 0 ? a(a7.f(), a2) : false) {
                                    return true;
                                }
                                return false;
                            }
                        }
                    }
                }
                return true;
            } catch (Exception e2) {
                Log.log(e2);
                return false;
            }
        }
        i1Var.b(str2);
        return false;
    }

    public static final void b(Activity activity, int i2) {
        if (activity == null) {
            g1.m.b("activity is null");
        } else if (!o()) {
            g1.m.a(n5.a(i2));
            f17047a.getClass();
            com.appodeal.ads.context.g.f16345b.setActivity(activity);
            if ((i2 & 3164) > 0) {
                t0.a(activity);
            }
            if ((i2 & 256) > 0) {
                h2.a(activity);
            }
        }
    }

    public static boolean a(r rVar, com.appodeal.ads.segments.g gVar) {
        if (rVar != null) {
            if (!rVar.C && (rVar.u || rVar.v)) {
                Context applicationContext = com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext();
                AdType n2 = rVar.n();
                gVar.getClass();
                if (gVar.a(applicationContext, n2, rVar.t)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void b(int i2, boolean z) {
        i1 i1Var = g1.o;
        StringBuilder a2 = h0.a("triggerOnLoadedOnPrecache for ");
        a2.append(n5.a(i2));
        a2.append(": ");
        a2.append(z);
        i1Var.a(a2.toString());
        if ((i2 & 3) > 0) {
            o1.a().t = z;
            w2.a().t = z;
        }
        if ((i2 & 128) > 0) {
            o4.a().t = z;
        }
        if ((i2 & 3164) > 0) {
            t0.a().t = z;
        }
        if ((i2 & 256) > 0) {
            h2.a().t = z;
        }
    }

    public static final void a(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "network");
        if (StringsKt.isBlank(str)) {
            g1.x.b("network is blank");
        } else if (!o()) {
            i1 i1Var = g1.x;
            i1Var.a(str + " - " + n5.a(i2));
            f17047a.getClass();
            for (u uVar : d()) {
                q4 q4Var = f17047a;
                int a2 = s4.a(uVar);
                q4Var.getClass();
                if ((i2 & a2) > 0 && !uVar.i) {
                    uVar.f17434e.a(str);
                }
            }
        }
    }

    public static final void a(Activity activity, String str, int i2, Consent consent, Boolean bool, ApdInitializationCallback apdInitializationCallback) {
        Activity activity2 = activity;
        ApdInitializationCallback apdInitializationCallback2 = apdInitializationCallback;
        String str2 = str;
        Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
        ArrayList arrayList = new ArrayList();
        if (activity2 == null) {
            arrayList.add(ApdInitializationError.Critical.ActivityIsNull.INSTANCE);
        }
        if (StringsKt.isBlank(str)) {
            String packageName = activity2 != null ? activity.getPackageName() : "your app";
            Intrinsics.checkNotNullExpressionValue(packageName, "bundleId");
            arrayList.add(new ApdInitializationError.Critical.AppKeyIsNullOrEmpty(packageName));
        }
        if (o()) {
            arrayList.add(ApdInitializationError.Critical.SdkVersionIsNotSupported.INSTANCE);
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                g1.f16413a.b(((ApdInitializationError.Critical) it.next()).getDescription());
            }
            if (apdInitializationCallback2 != null) {
                apdInitializationCallback2.onInitializationFinished(arrayList);
            }
        } else if (activity2 != null) {
            Application application = activity.getApplication();
            f17047a.getClass();
            com.appodeal.ads.context.g gVar = com.appodeal.ads.context.g.f16345b;
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "checkedActivity.applicationContext");
            gVar.setApplicationContext(applicationContext);
            gVar.setActivity(activity);
            Intrinsics.checkNotNullExpressionValue(application, "application");
            Job unused = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) m.getValue(), (CoroutineContext) null, (CoroutineStart) null, new r4(apdInitializationCallback, z4.a(), application, str, consent, bool, i2, (Continuation<? super r4>) null), 3, (Object) null);
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public static boolean b(Activity activity, int i2, String str) {
        Activity activity2 = activity;
        int i3 = i2;
        String str2 = str;
        if (activity2 == null) {
            Log.log(new com.appodeal.ads.utils.exception_handler.a("Unable to show an ad: activity = null"));
            return false;
        } else if (o()) {
            return false;
        } else {
            com.appodeal.ads.context.g.f16345b.setActivity(activity2);
            try {
                com.appodeal.ads.segments.g a2 = com.appodeal.ads.segments.h.a(str);
                if (i3 == 1) {
                    if (com.appodeal.ads.segments.h.a(a2) && !com.appodeal.ads.segments.h.c()) {
                        o1.a().a(str2);
                    }
                    return o1.a(activity2, new q(a2));
                } else if (i3 == 2) {
                    if (com.appodeal.ads.segments.h.a(a2) && !com.appodeal.ads.segments.h.c()) {
                        w2.a().a(str2);
                    }
                    return w2.a(activity2, new q(a2));
                } else if (i3 == 4) {
                    if (com.appodeal.ads.segments.h.a(a2) && !com.appodeal.ads.segments.h.c()) {
                        t0.a().a(str2);
                    }
                    return t0.a(activity2, new y5(a2, t0.c().b(activity2)));
                } else if (i3 == 8) {
                    if (com.appodeal.ads.segments.h.a(a2) && !com.appodeal.ads.segments.h.c()) {
                        t0.a().a(str2);
                    }
                    return t0.a(activity2, new y5(a2, a.BOTTOM));
                } else if (i3 == 16) {
                    if (com.appodeal.ads.segments.h.a(a2) && !com.appodeal.ads.segments.h.c()) {
                        t0.a().a(str2);
                    }
                    return t0.a(activity2, new y5(a2, a.TOP));
                } else if (i3 == 64) {
                    if (com.appodeal.ads.segments.h.a(a2) && !com.appodeal.ads.segments.h.c()) {
                        t0.a().a(str2);
                    }
                    return t0.a(activity2, new y5(a2, a.VIEW));
                } else if (i3 == 128) {
                    if (com.appodeal.ads.segments.h.a(a2) && !com.appodeal.ads.segments.h.c()) {
                        o4.a().a(str2);
                    }
                    return o4.a(activity2, new q(a2));
                } else if (i3 == 256) {
                    if (com.appodeal.ads.segments.h.a(a2) && !com.appodeal.ads.segments.h.c()) {
                        h2.a().a(str2);
                    }
                    return h2.a(activity2, new y5(a2, a.VIEW));
                } else if (i3 == 1024) {
                    if (com.appodeal.ads.segments.h.a(a2) && !com.appodeal.ads.segments.h.c()) {
                        t0.a().a(str2);
                    }
                    return t0.a(activity2, new y5(a2, a.f16160f));
                } else if (i3 != 2048) {
                    TreeMap treeMap = new TreeMap();
                    w0 w0Var = (w0) t0.a().f();
                    if ((i3 & 3164) > 0) {
                        if (a((r) w0Var, a2)) {
                            if (w0Var != null) {
                                if ((i3 & 4) > 0) {
                                    treeMap.put(Double.valueOf(((v0) w0Var.a(str2)).getEcpm()), 4);
                                }
                                if ((i3 & 8) > 0) {
                                    treeMap.put(Double.valueOf(((v0) w0Var.a(str2)).getEcpm()), 8);
                                }
                                if ((i3 & 16) > 0) {
                                    treeMap.put(Double.valueOf(((v0) w0Var.a(str2)).getEcpm()), 16);
                                }
                                if ((i3 & 1024) > 0) {
                                    treeMap.put(Double.valueOf(((v0) w0Var.a(str2)).getEcpm()), 1024);
                                }
                                if ((i3 & 2048) > 0) {
                                    treeMap.put(Double.valueOf(((v0) w0Var.a(str2)).getEcpm()), 2048);
                                }
                                if ((i3 & 64) > 0) {
                                    treeMap.put(Double.valueOf(((v0) w0Var.a(str2)).getEcpm()), 64);
                                }
                            } else {
                                throw new IllegalArgumentException("Already checked at [canShow]".toString());
                            }
                        }
                    }
                    k2 k2Var = (k2) h2.a().f();
                    if ((i3 & 256) > 0 && a((r) k2Var, a2)) {
                        if (k2Var != null) {
                            treeMap.put(Double.valueOf(((j2) k2Var.a(str2)).getEcpm()), 256);
                        } else {
                            throw new IllegalArgumentException("Already checked at [canShow]".toString());
                        }
                    }
                    r1 r1Var = (r1) o1.a().f();
                    int i4 = i3 & 1;
                    if (i4 > 0 && a((r) r1Var, a2)) {
                        if (r1Var != null) {
                            treeMap.put(Double.valueOf(((p1) r1Var.a(str2)).getEcpm()), 1);
                        } else {
                            throw new IllegalArgumentException("Already checked at [canShow]".toString());
                        }
                    }
                    n4 n4Var = (n4) o4.a().f();
                    if ((i3 & 128) > 0 && a((r) n4Var, a2)) {
                        if (n4Var != null) {
                            treeMap.put(Double.valueOf(((m4) n4Var.a(str2)).getEcpm()), 128);
                        } else {
                            throw new IllegalArgumentException("Already checked at [canShow]".toString());
                        }
                    }
                    q5 q5Var = (q5) w2.a().f();
                    if ((i3 & 2) > 0 && a((r) q5Var, a2)) {
                        if (q5Var != null) {
                            treeMap.put(Double.valueOf(((o5) q5Var.a(str2)).getEcpm()), 2);
                        } else {
                            throw new IllegalArgumentException("Already checked at [canShow]".toString());
                        }
                    }
                    if (!treeMap.isEmpty()) {
                        Map.Entry lastEntry = treeMap.lastEntry();
                        Integer num = lastEntry == null ? null : (Integer) lastEntry.getValue();
                        if (num != null) {
                            if (num.intValue() == 1) {
                                return o1.a(activity2, new q(a2));
                            }
                        }
                        if (num != null) {
                            if (num.intValue() == 2) {
                                return w2.a(activity2, new q(a2));
                            }
                        }
                        if (num != null) {
                            if (num.intValue() == 128) {
                                return o4.a(activity2, new q(a2));
                            }
                        }
                        if (num != null) {
                            if (num.intValue() == 4) {
                                return t0.a(activity2, new y5(a2, t0.c().b(activity2)));
                            }
                        }
                        if (num != null) {
                            if (num.intValue() == 8) {
                                return t0.a(activity2, new y5(a2, a.BOTTOM));
                            }
                        }
                        if (num != null) {
                            if (num.intValue() == 16) {
                                return t0.a(activity2, new y5(a2, a.TOP));
                            }
                        }
                        if (num != null) {
                            if (num.intValue() == 1024) {
                                return t0.a(activity2, new y5(a2, a.f16160f));
                            }
                        }
                        if (num != null) {
                            if (num.intValue() == 2048) {
                                return t0.a(activity2, new y5(a2, a.f16161g));
                            }
                        }
                        if (num != null) {
                            if (num.intValue() == 64) {
                                return t0.a(activity2, new y5(a2, a.VIEW));
                            }
                        }
                        if (num == null) {
                            return false;
                        }
                        if (num.intValue() == 256) {
                            return h2.a(activity2, new y5(a2, a.VIEW));
                        }
                        return false;
                    } else if (i4 <= 0) {
                        return false;
                    } else {
                        if (com.appodeal.ads.segments.h.a(a2) && !com.appodeal.ads.segments.h.c()) {
                            o1.a().a(str2);
                        }
                        return o1.a(activity2, new q(a2));
                    }
                } else {
                    if (com.appodeal.ads.segments.h.a(a2) && !com.appodeal.ads.segments.h.c()) {
                        t0.a().a(str2);
                    }
                    return t0.a(activity2, new y5(a2, a.f16161g));
                }
            } catch (Exception e2) {
                Log.log(e2);
                return false;
            }
        }
    }

    public static final void a(String str, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "eventName");
        if (StringsKt.isBlank(str)) {
            g1.N.b("event name is blank");
            return;
        }
        i1 i1Var = g1.N;
        i1Var.a("event: " + str + ", params: " + map);
        f17047a.getClass();
        Job unused = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) m.getValue(), (CoroutineContext) null, (CoroutineStart) null, new b(str, map, (Continuation<? super b>) null), 3, (Object) null);
    }

    public static final void a(AdType adType, String str, String str2, String str3, com.appodeal.ads.segments.g gVar, double d2) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        f17047a.getClass();
        Job unused = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) m.getValue(), (CoroutineContext) null, (CoroutineStart) null, new c(str, str2, str3, gVar, d2, adType, (Continuation<? super c>) null), 3, (Object) null);
    }

    public static final void a(int i2, boolean z) {
        i1 i1Var = g1.n;
        StringBuilder a2 = h0.a("auto cache for ");
        a2.append(n5.a(i2));
        a2.append(": ");
        a2.append(z);
        i1Var.a(a2.toString());
        if ((i2 & 3) > 0) {
            q1.a().f17036c = z;
        }
        if ((i2 & 128) > 0) {
            o4.a().k = z;
        }
        if ((i2 & 3164) > 0) {
            t0.a().k = z;
        }
        if ((i2 & 256) > 0) {
            h2.a().k = z;
        }
        if ((i2 & 512) > 0) {
            Native.a().k = z;
        }
    }

    public static final void a(BannerCallbacks bannerCallbacks) {
        g1.f16419g.a((String) null);
        t0.f17413a.f17448a = bannerCallbacks;
    }

    public static final void a(InterstitialCallbacks interstitialCallbacks) {
        g1.f16417e.a((String) null);
        q1.a().f17034a = interstitialCallbacks;
    }

    public static final void a(MrecCallbacks mrecCallbacks) {
        g1.f16420h.a((String) null);
        h2.f16451a.f16482a = mrecCallbacks;
    }

    public static final void a(NativeCallbacks nativeCallbacks) {
        g1.i.a((String) null);
        n2.f16832e = nativeCallbacks;
    }

    public static final void a(RewardedVideoCallbacks rewardedVideoCallbacks) {
        g1.f16418f.a((String) null);
        o4.f17013a.f17030a = rewardedVideoCallbacks;
    }

    public static final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        g1.I.a();
        f17047a.getClass();
        com.appodeal.ads.context.g.f16345b.setActivity(activity);
        activity.startActivity(new Intent(activity, TestActivity.class));
    }

    public static final void a(Context context, InAppPurchase inAppPurchase, InAppPurchaseValidateCallback inAppPurchaseValidateCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppPurchase, "purchase");
        g1.O.a(Intrinsics.stringPlus("purchase: ", inAppPurchase));
        f17047a.getClass();
        Job unused = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) m.getValue(), (CoroutineContext) null, (CoroutineStart) null, new h(inAppPurchase, inAppPurchaseValidateCallback, context, (Continuation<? super h>) null), 3, (Object) null);
    }
}
