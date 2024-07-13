package com.appodeal.ads.storage;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.r0;
import com.appodeal.ads.storage.a;
import com.appodeal.ads.w4;
import com.appodeal.ads.x4;
import com.appodeal.ads.y4;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import org.json.JSONObject;

public final class b implements a, a.C0204a {

    /* renamed from: a  reason: collision with root package name */
    public final Lazy f17329a = LazyKt.lazy(f.f17347a);

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f17330b = LazyKt.lazy(new q(this));

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f17331c = new LinkedHashMap();

    public enum a {
        Default("appodeal"),
        Placement(Constants.PLACEMENT_FREQUENCY),
        InstallTracking("install_tracking"),
        CampaignFrequency(Constants.CAMPAIGN_FREQUENCY),
        CampaignFrequencyClicks("freq_clicks");
        

        /* renamed from: a  reason: collision with root package name */
        public final String f17338a;

        /* access modifiers changed from: public */
        a(String str) {
            this.f17338a = str;
        }

        public final String a() {
            return this.f17338a;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$clearClicks$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.storage.b$b  reason: collision with other inner class name */
    public static final class C0205b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17339a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f17340b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0205b(b bVar, long j, Continuation<? super C0205b> continuation) {
            super(2, continuation);
            this.f17339a = bVar;
            this.f17340b = j;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C0205b(this.f17339a, this.f17340b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C0205b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Map<String, ?> all = this.f17339a.a(a.CampaignFrequencyClicks).getAll();
            Intrinsics.checkNotNullExpressionValue(all, "getInstance(CampaignFrequencyClicks).all");
            ArrayList arrayList = new ArrayList();
            for (Map.Entry next : all.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                Pair pair = null;
                Long l = value instanceof Long ? (Long) value : null;
                if (l != null) {
                    l.longValue();
                    pair = TuplesKt.to(str, value);
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            Map map = MapsKt.toMap(arrayList);
            SharedPreferences.Editor edit = this.f17339a.a(a.CampaignFrequencyClicks).edit();
            long j = this.f17340b - 259200000;
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                if (((Number) entry.getValue()).longValue() < j) {
                    edit.remove(str2);
                }
            }
            edit.apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$clearExpiredTrackingDataAsync$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17341a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f17342b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, long j, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f17341a = bVar;
            this.f17342b = j;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f17341a, this.f17342b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Map<String, ?> all = this.f17341a.a(a.InstallTracking).getAll();
            Intrinsics.checkNotNullExpressionValue(all, "getInstance(InstallTracking).all");
            long j = this.f17342b;
            b bVar = this.f17341a;
            for (Map.Entry next : all.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                Long l = value instanceof Long ? (Long) value : null;
                if ((l == null ? 0 : l.longValue()) < j) {
                    bVar.a(a.InstallTracking).edit().remove(str).apply();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$clearRequestDataAsync$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17343a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f17344b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(b bVar, String str, Continuation continuation) {
            super(2, continuation);
            this.f17343a = str;
            this.f17344b = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f17344b, this.f17343a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String stringPlus = Intrinsics.stringPlus(this.f17343a, "_timestamp");
            this.f17344b.a(a.Default).edit().remove(this.f17343a).remove(stringPlus).remove(Intrinsics.stringPlus(this.f17343a, "_wst")).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$clearTrackingExpireTimeAsync$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17345a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f17346b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(b bVar, String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f17345a = bVar;
            this.f17346b = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f17345a, this.f17346b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f17345a.a(a.InstallTracking).edit().remove(this.f17346b).apply();
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function0<ExecutorCoroutineDispatcher> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f17347a = new f();

        public f() {
            super(0);
        }

        public final Object invoke() {
            return ThreadPoolDispatcherKt.newSingleThreadContext("shared_prefs");
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveAllCampaigns$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17348a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ JSONObject f17349b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(b bVar, JSONObject jSONObject, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f17348a = bVar;
            this.f17349b = jSONObject;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new g(this.f17348a, this.f17349b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            SharedPreferences.Editor edit = this.f17348a.a(a.CampaignFrequency).edit();
            edit.clear();
            Iterator<String> keys = this.f17349b.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "campaigns.keys()");
            JSONObject jSONObject = this.f17349b;
            while (keys.hasNext()) {
                String next = keys.next();
                edit.putString(next, jSONObject.getString(next));
            }
            edit.apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveCampaign$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17350a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f17351b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f17352c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(b bVar, String str, String str2, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f17350a = bVar;
            this.f17351b = str;
            this.f17352c = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new h(this.f17350a, this.f17351b, this.f17352c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f17350a.a(a.CampaignFrequency).edit().putString(this.f17351b, this.f17352c).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveClicks$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17353a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f17354b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ long f17355c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(b bVar, String str, long j, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f17353a = bVar;
            this.f17354b = str;
            this.f17355c = j;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new i(this.f17353a, this.f17354b, this.f17355c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f17353a.a(a.CampaignFrequencyClicks).edit().putLong(this.f17354b, this.f17355c).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveEventDataAsync$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17356a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f17357b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f17358c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(b bVar, String str, String str2, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f17356a = bVar;
            this.f17357b = str;
            this.f17358c = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new j(this.f17356a, this.f17357b, this.f17358c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f17356a.a(a.Default).edit().putString(this.f17357b, this.f17358c).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveFirstAdSessionLaunchTimeAsync$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17359a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f17360b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(b bVar, long j, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f17359a = bVar;
            this.f17360b = j;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new k(this.f17359a, this.f17360b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f17359a.a(a.Default).edit().putLong("first_ad_session_launch_time", this.f17360b).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$savePlacementAsync$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17361a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f17362b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f17363c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(b bVar, String str, String str2, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f17361a = bVar;
            this.f17362b = str;
            this.f17363c = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new l(this.f17361a, this.f17362b, this.f17363c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f17361a.a(a.Placement).edit().putString(this.f17362b, this.f17363c).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveSessionUptimeAsync$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17364a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f17365b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ long f17366c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(b bVar, long j, long j2, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f17364a = bVar;
            this.f17365b = j;
            this.f17366c = j2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new m(this.f17364a, this.f17365b, this.f17366c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f17364a.a(a.Default).edit().putLong("session_uptime", this.f17365b).putLong("session_uptime_m", this.f17366c).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveSessionsData$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17367a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f17368b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ long f17369c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(b bVar, String str, long j, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f17367a = bVar;
            this.f17368b = str;
            this.f17369c = j;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new n(this.f17367a, this.f17368b, this.f17369c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f17367a.a(a.Default).edit().putString(Constants.SESSIONS, this.f17368b).putLong("sessions_size", this.f17369c).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveTrackingExpireTimeAsync$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17370a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f17371b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ long f17372c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(b bVar, String str, long j, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f17370a = bVar;
            this.f17371b = str;
            this.f17372c = j;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new o(this.f17370a, this.f17371b, this.f17372c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f17370a.a(a.InstallTracking).edit().putLong(this.f17371b, this.f17372c).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveUserToken$1", f = "KeyValueStorageImpl.kt", l = {}, m = "invokeSuspend")
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17373a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f17374b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(b bVar, String str, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f17373a = bVar;
            this.f17374b = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new p(this.f17373a, this.f17374b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f17373a.a(a.Default).edit().putString("user_token", this.f17374b).apply();
            return Unit.INSTANCE;
        }
    }

    public static final class q extends Lambda implements Function0<CoroutineScope> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17375a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(b bVar) {
            super(0);
            this.f17375a = bVar;
        }

        public final Object invoke() {
            return CoroutineScopeKt.CoroutineScope(this.f17375a.e());
        }
    }

    public final SharedPreferences a(a aVar) {
        Object obj = this.f17331c.get(aVar);
        if (obj != null) {
            return ((q) obj).a();
        }
        throw new IllegalArgumentException(("Prefs " + aVar + " is not initialized").toString());
    }

    public final Object a(r0.a aVar) {
        return BuildersKt.withContext(e(), new e(this, (Continuation<? super e>) null), aVar);
    }

    public final Object a(w4 w4Var) {
        return BuildersKt.withContext(e(), new c(this, (Continuation<? super c>) null), w4Var);
    }

    public final Object a(x4.a aVar) {
        Object withContext = BuildersKt.withContext(e(), new f(this, (Continuation<? super f>) null), aVar);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object a(y4 y4Var) {
        Object withContext = BuildersKt.withContext(e(), new l(this, (Continuation<? super l>) null), y4Var);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object a(String str, y4 y4Var) {
        Object withContext = BuildersKt.withContext(e(), new g(this, str, (Continuation<? super g>) null), y4Var);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object a(LinkedHashSet linkedHashSet, r0.b bVar) {
        Object withContext = BuildersKt.withContext(e(), new k(this, linkedHashSet, (Continuation<? super k>) null), bVar);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        return BuildersKt.withContext(e(), new d(this, (Continuation<? super d>) null), continuationImpl);
    }

    public final String a() {
        return a(a.Default).getString("user_token", (String) null);
    }

    public final Triple<JSONObject, Long, Integer> a(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        String stringPlus = Intrinsics.stringPlus(str, "_timestamp");
        String stringPlus2 = Intrinsics.stringPlus(str, "_wst");
        a aVar = a.Default;
        JSONObject jSONObject = null;
        String string = a(aVar).getString(str, (String) null);
        if (string != null) {
            jSONObject = new JSONObject(string);
        }
        return new Triple<>(jSONObject, Long.valueOf(a(aVar).getLong(stringPlus, 0)), Integer.valueOf(a(aVar).getInt(stringPlus2, Constants.DEFAULT_WATERFALL_VALIDITY_PERIOD)));
    }

    public final void a(int i2) {
        Intrinsics.checkNotNullParameter("part_of_audience", "key");
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new h(this, "part_of_audience", i2, (Continuation<? super h>) null), 3, (Object) null);
    }

    public final void a(int i2, long j2, String str, String str2) {
        String str3 = str;
        Intrinsics.checkNotNullParameter(str3, "key");
        String str4 = str2;
        Intrinsics.checkNotNullParameter(str4, "jsonString");
        String stringPlus = Intrinsics.stringPlus(str3, "_timestamp");
        String stringPlus2 = Intrinsics.stringPlus(str3, "_wst");
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new i(this, str3, str4, stringPlus, j2, stringPlus2, i2, (Continuation<? super i>) null), 3, (Object) null);
    }

    public final void a(long j2) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new C0205b(this, j2, (Continuation<? super C0205b>) null), 3, (Object) null);
    }

    public final void a(long j2, long j3) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new m(this, j2, j3, (Continuation<? super m>) null), 3, (Object) null);
    }

    public final void a(String str, long j2) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new i(this, str, j2, (Continuation<? super i>) null), 3, (Object) null);
    }

    public final void a(String str, long j2, long j3, long j4, long j5, long j6) {
        Intrinsics.checkNotNullParameter(str, Constants.UUID);
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new j(this, str, j2, 0, 0, j3, j4, j5, j6, (Continuation<? super j>) null), 3, (Object) null);
    }

    public final void a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        Intrinsics.checkNotNullParameter(str2, "campaignData");
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new h(this, str, str2, (Continuation<? super h>) null), 3, (Object) null);
    }

    public final void a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "campaigns");
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new g(this, jSONObject, (Continuation<? super g>) null), 3, (Object) null);
    }

    public final int b() {
        Intrinsics.checkNotNullParameter("part_of_audience", "key");
        return a(a.Default).getInt("part_of_audience", -1);
    }

    public final void b(long j2) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new c(this, j2, (Continuation<? super c>) null), 3, (Object) null);
    }

    public final void b(String str) {
        Intrinsics.checkNotNullParameter(str, "userToken");
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new p(this, str, (Continuation<? super p>) null), 3, (Object) null);
    }

    public final void b(String str, long j2) {
        Intrinsics.checkNotNullParameter(str, Constants.SESSIONS);
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new n(this, str, j2, (Continuation<? super n>) null), 3, (Object) null);
    }

    public final void b(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new j(this, str, str2, (Continuation<? super j>) null), 3, (Object) null);
    }

    public final String c() {
        return a(a.Default).getString(Constants.APP_KEY, (String) null);
    }

    public final void c(long j2) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new k(this, j2, (Continuation<? super k>) null), 3, (Object) null);
    }

    public final void c(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new d(this, str, (Continuation) null), 3, (Object) null);
    }

    public final void c(String str, long j2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new o(this, str, j2, (Continuation<? super o>) null), 3, (Object) null);
    }

    public final void c(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "string");
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new l(this, str, str2, (Continuation<? super l>) null), 3, (Object) null);
    }

    public final Map<String, String> d() {
        Map<String, ?> all = a(a.CampaignFrequency).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getInstance(CampaignFrequency).all");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : all.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            Pair pair = null;
            if ((value instanceof String ? (String) value : null) != null) {
                pair = TuplesKt.to(str, value);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    public final void d(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        Job unused = BuildersKt__Builders_commonKt.launch$default(g(), (CoroutineContext) null, (CoroutineStart) null, new e(this, str, (Continuation<? super e>) null), 3, (Object) null);
    }

    public final String e(String str) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        return a(a.CampaignFrequency).getString(str, (String) null);
    }

    public final ExecutorCoroutineDispatcher e() {
        return (ExecutorCoroutineDispatcher) this.f17329a.getValue();
    }

    public final String f(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        String string = a(a.Default).getString(str, JsonUtils.EMPTY_JSON);
        return string == null ? JsonUtils.EMPTY_JSON : string;
    }

    public final Map<String, String> f() {
        Map<String, ?> all = a(a.Placement).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getInstance(Placement).all");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : all.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            Pair pair = value == null ? null : TuplesKt.to(str, value.toString());
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    public final Long g(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        a aVar = a.InstallTracking;
        if (!a(aVar).contains(str)) {
            return null;
        }
        return Long.valueOf(a(aVar).getLong(str, 0));
    }

    public final CoroutineScope g() {
        return (CoroutineScope) this.f17330b.getValue();
    }

    public final long h() {
        return a(a.Default).getLong("session_id", 0);
    }

    public final long i() {
        return a(a.Default).getLong("session_start_ts_m", 0);
    }

    public final long j() {
        return a(a.Default).getLong("session_start_ts", 0);
    }

    public final long k() {
        return a(a.Default).getLong("session_uptime_m", 0);
    }

    public final long l() {
        return a(a.Default).getLong("session_uptime", 0);
    }

    public final String m() {
        return a(a.Default).getString("session_uuid", (String) null);
    }
}
