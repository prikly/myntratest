package com.appodeal.ads;

import android.util.SparseArray;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.s;
import com.appodeal.ads.utils.v;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f16799a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f16800b;

    /* renamed from: c  reason: collision with root package name */
    public final Lazy f16801c;

    /* renamed from: d  reason: collision with root package name */
    public AppodealRequestCallbacks f16802d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<JSONObject> f16803e;

    /* renamed from: f  reason: collision with root package name */
    public final SparseArray<Pair<String, Long>> f16804f;

    @DebugMetadata(c = "com.appodeal.ads.AppodealRequestCallbacksWrapper$onClick$1", f = "AppodealRequestCallbacksWrapper.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n0 f16805a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AdType f16806b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f16807c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f16808d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ double f16809e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(n0 n0Var, AdType adType, String str, String str2, double d2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f16805a = n0Var;
            this.f16806b = adType;
            this.f16807c = str;
            this.f16808d = str2;
            this.f16809e = d2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f16805a, this.f16806b, this.f16807c, this.f16808d, this.f16809e, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AppodealRequestCallbacks b2 = this.f16805a.f16802d;
            if (b2 != null) {
                b2.onClick(this.f16806b.getDisplayName(), this.f16807c, this.f16808d, this.f16809e);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.AppodealRequestCallbacksWrapper$onImpression$1", f = "AppodealRequestCallbacksWrapper.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n0 f16810a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AdType f16811b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f16812c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f16813d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ double f16814e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(n0 n0Var, AdType adType, String str, String str2, double d2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f16810a = n0Var;
            this.f16811b = adType;
            this.f16812c = str;
            this.f16813d = str2;
            this.f16814e = d2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f16810a, this.f16811b, this.f16812c, this.f16813d, this.f16814e, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AppodealRequestCallbacks b2 = this.f16810a.f16802d;
            if (b2 != null) {
                b2.onImpression(this.f16811b.getDisplayName(), this.f16812c, this.f16813d, this.f16814e);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.AppodealRequestCallbacksWrapper$onRequestFinish$1", f = "AppodealRequestCallbacksWrapper.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n0 f16815a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AdType f16816b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f16817c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f16818d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f16819e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ double f16820f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(n0 n0Var, AdType adType, String str, String str2, boolean z, double d2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f16815a = n0Var;
            this.f16816b = adType;
            this.f16817c = str;
            this.f16818d = str2;
            this.f16819e = z;
            this.f16820f = d2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f16815a, this.f16816b, this.f16817c, this.f16818d, this.f16819e, this.f16820f, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AppodealRequestCallbacks b2 = this.f16815a.f16802d;
            if (b2 != null) {
                String displayName = this.f16816b.getDisplayName();
                String str = this.f16817c;
                String str2 = this.f16818d;
                boolean z = this.f16819e;
                b2.onRequestFinish(displayName, str, str2, z ? this.f16820f : 0.0d, z);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.AppodealRequestCallbacksWrapper$onRequestStart$1", f = "AppodealRequestCallbacksWrapper.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n0 f16821a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AdType f16822b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f16823c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f16824d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ double f16825e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(n0 n0Var, AdType adType, String str, String str2, double d2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f16821a = n0Var;
            this.f16822b = adType;
            this.f16823c = str;
            this.f16824d = str2;
            this.f16825e = d2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f16821a, this.f16822b, this.f16823c, this.f16824d, this.f16825e, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AppodealRequestCallbacks b2 = this.f16821a.f16802d;
            if (b2 != null) {
                b2.onRequestStart(this.f16822b.getDisplayName(), this.f16823c, this.f16824d, this.f16825e);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.AppodealRequestCallbacksWrapper$onWaterfallFinish$1", f = "AppodealRequestCallbacksWrapper.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n0 f16826a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AdType f16827b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f16828c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ double f16829d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(n0 n0Var, AdType adType, boolean z, double d2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f16826a = n0Var;
            this.f16827b = adType;
            this.f16828c = z;
            this.f16829d = d2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f16826a, this.f16827b, this.f16828c, this.f16829d, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AppodealRequestCallbacks b2 = this.f16826a.f16802d;
            if (b2 != null) {
                String displayName = this.f16827b.getDisplayName();
                boolean z = this.f16828c;
                b2.onWaterfallFinish(displayName, z ? this.f16829d : 0.0d, z);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.AppodealRequestCallbacksWrapper$onWaterfallStart$1", f = "AppodealRequestCallbacksWrapper.kt", l = {}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n0 f16830a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AdType f16831b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(n0 n0Var, AdType adType, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f16830a = n0Var;
            this.f16831b = adType;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f16830a, this.f16831b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AppodealRequestCallbacks b2 = this.f16830a.f16802d;
            if (b2 != null) {
                b2.onWaterfallStart(this.f16831b.getDisplayName());
            }
            return Unit.INSTANCE;
        }
    }

    public n0() {
        this(0);
    }

    public /* synthetic */ n0(int i) {
        this(q0.a(), "https://rri.appodeal.com/api/stat");
    }

    public n0(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(jSONObject, "defaultWaterfall");
        this.f16799a = str;
        this.f16800b = jSONObject;
        this.f16801c = LazyKt.lazy(o0.f17006a);
        this.f16803e = new SparseArray<>();
        this.f16804f = new SparseArray<>();
    }

    public static boolean a(int i) {
        if (i == 128) {
            return o4.a().s;
        }
        if (i == 256) {
            return h2.a().s;
        }
        if (i == 512) {
            return Native.a().s;
        }
        if (i == 1) {
            return o1.a().s;
        }
        if (i == 2) {
            return w2.a().s;
        }
        if (i != 3) {
            if (i != 4) {
                return false;
            }
            return t0.a().s;
        } else if (o1.a().s || w2.a().s) {
            return true;
        } else {
            return false;
        }
    }

    public final CoroutineScope a() {
        return (CoroutineScope) this.f16801c.getValue();
    }

    public final void a(AdType adType, double d2, String str, String str2) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Job unused = BuildersKt__Builders_commonKt.launch$default(a(), (CoroutineContext) null, (CoroutineStart) null, new a(this, adType, str, str2, d2, (Continuation<? super a>) null), 3, (Object) null);
    }

    public final void a(AdType adType, double d2, String str, String str2, boolean z, int i) {
        Pair pair;
        boolean z2 = z;
        Intrinsics.checkNotNullParameter(adType, "adType");
        try {
            int notifyType = adType.getNotifyType();
            if (a(notifyType) && (pair = this.f16804f.get(notifyType)) != null) {
                String str3 = (String) pair.getFirst();
                long longValue = ((Number) pair.getSecond()).longValue();
                JSONObject jSONObject = this.f16803e.get(notifyType);
                if (jSONObject != null) {
                    long currentTimeMillis = System.currentTimeMillis() - longValue;
                    JSONArray jSONArray = jSONObject.getJSONArray("ad_units");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("aid", str3);
                    jSONObject2.put("network_name", str);
                    jSONObject2.put("fill", z2);
                    jSONObject2.put("delta", currentTimeMillis);
                    if (!z2) {
                        jSONObject2.put(IronSourceConstants.EVENTS_ERROR_REASON, i);
                    }
                    jSONArray.put(jSONObject2);
                    Job unused = BuildersKt__Builders_commonKt.launch$default(a(), (CoroutineContext) null, (CoroutineStart) null, new c(this, adType, str, str2, z, d2, (Continuation<? super c>) null), 3, (Object) null);
                }
            }
            String str4 = str;
            Job unused2 = BuildersKt__Builders_commonKt.launch$default(a(), (CoroutineContext) null, (CoroutineStart) null, new c(this, adType, str, str2, z, d2, (Continuation<? super c>) null), 3, (Object) null);
        } catch (Exception e2) {
            Log.log(e2);
        }
    }

    public final void b(AdType adType, double d2, String str, String str2) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Job unused = BuildersKt__Builders_commonKt.launch$default(a(), (CoroutineContext) null, (CoroutineStart) null, new b(this, adType, str, str2, d2, (Continuation<? super b>) null), 3, (Object) null);
    }

    public final void c(AdType adType, double d2, String str, String str2) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        a(adType, d2, str, str2, true, 0);
    }

    public final void d(AdType adType, double d2, String str, String str2) {
        AdType adType2 = adType;
        Intrinsics.checkNotNullParameter(adType, "adType");
        int notifyType = adType.getNotifyType();
        if (a(notifyType)) {
            this.f16804f.put(notifyType, TuplesKt.to(str2, Long.valueOf(System.currentTimeMillis())));
        } else {
            String str3 = str2;
        }
        Job unused = BuildersKt__Builders_commonKt.launch$default(a(), (CoroutineContext) null, (CoroutineStart) null, new d(this, adType, str, str2, d2, (Continuation<? super d>) null), 3, (Object) null);
    }

    public final void a(AdType adType, double d2, boolean z) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(adType, "adType");
        try {
            int notifyType = adType.getNotifyType();
            if (a(notifyType) && (jSONObject = this.f16803e.get(notifyType)) != null) {
                jSONObject.put(IronSourceConstants.EVENTS_RESULT, z);
                Intrinsics.checkNotNullParameter(jSONObject, "waterfall");
                this.f16803e.remove(notifyType);
                this.f16804f.remove(notifyType);
                s.f17568e.execute(new v(jSONObject.toString(), this.f16799a));
            }
            Job unused = BuildersKt__Builders_commonKt.launch$default(a(), (CoroutineContext) null, (CoroutineStart) null, new e(this, adType, z, d2, (Continuation<? super e>) null), 3, (Object) null);
        } catch (Exception e2) {
            Log.log(e2);
        }
    }

    public final void a(AdType adType) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(adType, "adType");
        int notifyType = adType.getNotifyType();
        if (a(notifyType)) {
            SparseArray<JSONObject> sparseArray = this.f16803e;
            synchronized (this) {
                try {
                    jSONObject = JsonObjectBuilderKt.jsonObject(new m0(this, notifyType));
                } catch (Exception e2) {
                    Log.log(e2);
                    jSONObject = null;
                }
            }
            sparseArray.put(notifyType, jSONObject);
        }
        Job unused = BuildersKt__Builders_commonKt.launch$default(a(), (CoroutineContext) null, (CoroutineStart) null, new f(this, adType, (Continuation<? super f>) null), 3, (Object) null);
    }
}
