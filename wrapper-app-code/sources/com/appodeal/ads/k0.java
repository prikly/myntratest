package com.appodeal.ads;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.s1;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.y2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import org.json.JSONObject;

public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final k0 f16502a = new k0();

    /* renamed from: b  reason: collision with root package name */
    public static final Lazy f16503b = LazyKt.lazy(j.f16545a);

    /* renamed from: c  reason: collision with root package name */
    public static final Lazy f16504c = LazyKt.lazy(b.f16510a);

    @DebugMetadata(c = "com.appodeal.ads.AppodealNetworkRequestApi$clickRequest$1", f = "AppodealNetworkRequestApi.kt", l = {155}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f16505a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ s1.a.C0201a f16506b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ u1 f16507c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ y1 f16508d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ x1 f16509e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(s1.a.C0201a aVar, u1 u1Var, y1 y1Var, x1 x1Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f16506b = aVar;
            this.f16507c = u1Var;
            this.f16508d = y1Var;
            this.f16509e = x1Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f16506b, this.f16507c, this.f16508d, this.f16509e, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16505a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                s1.a.C0201a aVar = this.f16506b;
                this.f16505a = 1;
                obj2 = com.appodeal.ads.networking.c.a((s1) aVar, (Continuation<? super Result<? extends JSONObject>>) this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m51unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u1 u1Var = this.f16507c;
            y1 y1Var = this.f16508d;
            x1 x1Var = this.f16509e;
            if (Result.m49isSuccessimpl(obj2)) {
                JSONObject jSONObject = (JSONObject) obj2;
                u1Var.a(jSONObject);
                y1Var.getClass();
                y1.a(jSONObject);
                x1Var.getClass();
                x1.a(jSONObject);
            }
            u1 u1Var2 = this.f16507c;
            y1 y1Var2 = this.f16508d;
            x1 x1Var2 = this.f16509e;
            Throwable r5 = Result.m46exceptionOrNullimpl(obj2);
            if (r5 != null) {
                com.appodeal.ads.networking.f.a(r5);
                u1Var2.a();
                com.appodeal.ads.networking.f.a(r5);
                y1Var2.getClass();
                com.appodeal.ads.networking.f.a(r5);
                x1Var2.getClass();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function0<CoroutineScope> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16510a = new b();

        public b() {
            super(0);
        }

        public final Object invoke() {
            return CoroutineScopeKt.CoroutineScope(k0.a());
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.AppodealNetworkRequestApi", f = "AppodealNetworkRequestApi.kt", l = {27}, m = "configRequest-IoAF18A")
    public static final class c extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public t1 f16511a;

        /* renamed from: b  reason: collision with root package name */
        public x1 f16512b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f16513c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ k0 f16514d;

        /* renamed from: e  reason: collision with root package name */
        public int f16515e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(k0 k0Var, Continuation<? super c> continuation) {
            super(continuation);
            this.f16514d = k0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f16513c = obj;
            this.f16515e |= RecyclerView.UNDEFINED_DURATION;
            Object a2 = this.f16514d.a((Continuation<? super Result<? extends JSONObject>>) this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m43boximpl(a2);
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.AppodealNetworkRequestApi$finishRequest$1", f = "AppodealNetworkRequestApi.kt", l = {213}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f16516a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ s1.a.b f16517b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ y1 f16518c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ x1 f16519d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(s1.a.b bVar, y1 y1Var, x1 x1Var, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f16517b = bVar;
            this.f16518c = y1Var;
            this.f16519d = x1Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f16517b, this.f16518c, this.f16519d, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16516a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                s1.a.b bVar = this.f16517b;
                this.f16516a = 1;
                obj2 = com.appodeal.ads.networking.c.a((s1) bVar, (Continuation<? super Result<? extends JSONObject>>) this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m51unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y1 y1Var = this.f16518c;
            x1 x1Var = this.f16519d;
            if (Result.m49isSuccessimpl(obj2)) {
                JSONObject jSONObject = (JSONObject) obj2;
                y1Var.getClass();
                y1.a(jSONObject);
                x1Var.getClass();
                x1.a(jSONObject);
            }
            y1 y1Var2 = this.f16518c;
            x1 x1Var2 = this.f16519d;
            Throwable r4 = Result.m46exceptionOrNullimpl(obj2);
            if (r4 != null) {
                com.appodeal.ads.networking.f.a(r4);
                y1Var2.getClass();
                com.appodeal.ads.networking.f.a(r4);
                x1Var2.getClass();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.AppodealNetworkRequestApi$getRequest$1", f = "AppodealNetworkRequestApi.kt", l = {123}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public t1 f16520a;

        /* renamed from: b  reason: collision with root package name */
        public x1 f16521b;

        /* renamed from: c  reason: collision with root package name */
        public int f16522c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ r<?> f16523d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ s<?> f16524e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ u<?, ?, ?> f16525f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Context f16526g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ u<?, ?, ?>.e f16527h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(r<?> rVar, s<?> sVar, u<?, ?, ?> uVar, Context context, u<?, ?, ?>.e eVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f16523d = rVar;
            this.f16524e = sVar;
            this.f16525f = uVar;
            this.f16526g = context;
            this.f16527h = eVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f16523d, this.f16524e, this.f16525f, this.f16526g, this.f16527h, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            t1 t1Var;
            x1 x1Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16522c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                s1.c cVar = new s1.c(this.f16523d, this.f16524e, this.f16525f);
                t1Var = new t1(this.f16526g);
                x1 x1Var2 = new x1();
                this.f16520a = t1Var;
                this.f16521b = x1Var2;
                this.f16522c = 1;
                obj2 = com.appodeal.ads.networking.c.a((s1) cVar, (Continuation<? super Result<? extends JSONObject>>) this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                x1Var = x1Var2;
            } else if (i == 1) {
                x1Var = this.f16521b;
                t1Var = this.f16520a;
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m51unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u<?, ?, ?>.e eVar = this.f16527h;
            if (Result.m49isSuccessimpl(obj2)) {
                JSONObject jSONObject = (JSONObject) obj2;
                t1Var.a(jSONObject);
                x1Var.getClass();
                x1.a(jSONObject);
                eVar.a(jSONObject);
            }
            u<?, ?, ?>.e eVar2 = this.f16527h;
            Throwable r6 = Result.m46exceptionOrNullimpl(obj2);
            if (r6 != null) {
                com.appodeal.ads.networking.f.a(r6);
                t1Var.getClass();
                com.appodeal.ads.networking.f.a(r6);
                x1Var.getClass();
                eVar2.a(com.appodeal.ads.networking.f.a(r6));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.AppodealNetworkRequestApi$iapRequest$1", f = "AppodealNetworkRequestApi.kt", l = {79}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public v1 f16528a;

        /* renamed from: b  reason: collision with root package name */
        public x1 f16529b;

        /* renamed from: c  reason: collision with root package name */
        public int f16530c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f16531d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ s1.d f16532e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Context context, s1.d dVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f16531d = context;
            this.f16532e = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f16531d, this.f16532e, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            v1 v1Var;
            x1 x1Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16530c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                v1Var = new v1(this.f16531d);
                x1 x1Var2 = new x1();
                s1.d dVar = this.f16532e;
                this.f16528a = v1Var;
                this.f16529b = x1Var2;
                this.f16530c = 1;
                Object a2 = com.appodeal.ads.networking.c.a((s1) dVar, (Continuation<? super Result<? extends JSONObject>>) this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                x1Var = x1Var2;
                obj2 = a2;
            } else if (i == 1) {
                x1Var = this.f16529b;
                v1Var = this.f16528a;
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m51unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (Result.m49isSuccessimpl(obj2)) {
                JSONObject jSONObject = (JSONObject) obj2;
                v1Var.a(jSONObject);
                x1Var.getClass();
                x1.a(jSONObject);
            }
            Throwable r5 = Result.m46exceptionOrNullimpl(obj2);
            if (r5 != null) {
                com.appodeal.ads.networking.f.a(r5);
                v1Var.getClass();
                com.appodeal.ads.networking.f.a(r5);
                x1Var.getClass();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.AppodealNetworkRequestApi", f = "AppodealNetworkRequestApi.kt", l = {42}, m = "initRequest-IoAF18A")
    public static final class g extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public t1 f16533a;

        /* renamed from: b  reason: collision with root package name */
        public x1 f16534b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f16535c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ k0 f16536d;

        /* renamed from: e  reason: collision with root package name */
        public int f16537e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(k0 k0Var, Continuation<? super g> continuation) {
            super(continuation);
            this.f16536d = k0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f16535c = obj;
            this.f16537e |= RecyclerView.UNDEFINED_DURATION;
            Object b2 = this.f16536d.b(this);
            return b2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b2 : Result.m43boximpl(b2);
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.AppodealNetworkRequestApi", f = "AppodealNetworkRequestApi.kt", l = {63}, m = "installRequest")
    public static final class h extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public t1 f16538a;

        /* renamed from: b  reason: collision with root package name */
        public x1 f16539b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f16540c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ k0 f16541d;

        /* renamed from: e  reason: collision with root package name */
        public int f16542e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(k0 k0Var, Continuation<? super h> continuation) {
            super(continuation);
            this.f16541d = k0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f16540c = obj;
            this.f16542e |= RecyclerView.UNDEFINED_DURATION;
            return this.f16541d.a((String) null, this);
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.AppodealNetworkRequestApi$installRequestAsync$1", f = "AppodealNetworkRequestApi.kt", l = {54}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f16543a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f16544b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(String str, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f16544b = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new i(this.f16544b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16543a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                k0 k0Var = k0.f16502a;
                String str = this.f16544b;
                this.f16543a = 1;
                if (k0Var.a(str, this) == coroutine_suspended) {
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

    public static final class j extends Lambda implements Function0<ExecutorCoroutineDispatcher> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f16545a = new j();

        public j() {
            super(0);
        }

        public final Object invoke() {
            return ThreadPoolDispatcherKt.newSingleThreadContext("networking");
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.AppodealNetworkRequestApi$sessionsRequest$1", f = "AppodealNetworkRequestApi.kt", l = {96}, m = "invokeSuspend")
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f16546a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ s1.g f16547b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ w1 f16548c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ x1 f16549d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(s1.g gVar, w1 w1Var, x1 x1Var, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f16547b = gVar;
            this.f16548c = w1Var;
            this.f16549d = x1Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new k(this.f16547b, this.f16548c, this.f16549d, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16546a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                s1.g gVar = this.f16547b;
                this.f16546a = 1;
                obj2 = com.appodeal.ads.networking.c.a((s1) gVar, (Continuation<? super Result<? extends JSONObject>>) this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m51unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w1 w1Var = this.f16548c;
            x1 x1Var = this.f16549d;
            if (Result.m49isSuccessimpl(obj2)) {
                JSONObject jSONObject = (JSONObject) obj2;
                w1Var.getClass();
                w1.a(jSONObject);
                x1Var.getClass();
                x1.a(jSONObject);
            }
            w1 w1Var2 = this.f16548c;
            x1 x1Var2 = this.f16549d;
            Throwable r4 = Result.m46exceptionOrNullimpl(obj2);
            if (r4 != null) {
                com.appodeal.ads.networking.f.a(r4);
                w1Var2.getClass();
                com.appodeal.ads.networking.f.a(r4);
                x1Var2.getClass();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.AppodealNetworkRequestApi$showRequest$1", f = "AppodealNetworkRequestApi.kt", l = {185}, m = "invokeSuspend")
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f16550a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ s1.a.c f16551b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ y1 f16552c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ x1 f16553d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(s1.a.c cVar, y1 y1Var, x1 x1Var, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f16551b = cVar;
            this.f16552c = y1Var;
            this.f16553d = x1Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new l(this.f16551b, this.f16552c, this.f16553d, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16550a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                s1.a.c cVar = this.f16551b;
                this.f16550a = 1;
                obj2 = com.appodeal.ads.networking.c.a((s1) cVar, (Continuation<? super Result<? extends JSONObject>>) this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m51unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y1 y1Var = this.f16552c;
            x1 x1Var = this.f16553d;
            if (Result.m49isSuccessimpl(obj2)) {
                JSONObject jSONObject = (JSONObject) obj2;
                y1Var.getClass();
                y1.a(jSONObject);
                x1Var.getClass();
                x1.a(jSONObject);
            }
            y1 y1Var2 = this.f16552c;
            x1 x1Var2 = this.f16553d;
            Throwable r4 = Result.m46exceptionOrNullimpl(obj2);
            if (r4 != null) {
                com.appodeal.ads.networking.f.a(r4);
                y1Var2.getClass();
                com.appodeal.ads.networking.f.a(r4);
                x1Var2.getClass();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.AppodealNetworkRequestApi$statsRequest$1", f = "AppodealNetworkRequestApi.kt", l = {242}, m = "invokeSuspend")
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f16554a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ y2.a f16555b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ u<AdObjectType, AdRequestType, ?> f16556c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ AdRequestType f16557d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(y2.a aVar, u<AdObjectType, AdRequestType, ?> uVar, AdRequestType adrequesttype, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f16555b = aVar;
            this.f16556c = uVar;
            this.f16557d = adrequesttype;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new m(this.f16555b, this.f16556c, this.f16557d, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16554a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                y2.a aVar = this.f16555b;
                this.f16554a = 1;
                obj2 = com.appodeal.ads.networking.c.a(aVar, (Continuation) this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m51unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u<AdObjectType, AdRequestType, ?> uVar = this.f16556c;
            AdRequestType adrequesttype = this.f16557d;
            if (Result.m49isSuccessimpl(obj2)) {
                JSONObject jSONObject = (JSONObject) obj2;
                Log.log("PostBid", "ApiNetworkRequest: onSuccess");
                Log.logObject(LogConstants.KEY_SDK, LogConstants.EVENT_RESPONSE, jSONObject, Log.LogLevel.verbose);
                uVar.a(adrequesttype, jSONObject);
            }
            u<AdObjectType, AdRequestType, ?> uVar2 = this.f16556c;
            AdRequestType adrequesttype2 = this.f16557d;
            if (Result.m46exceptionOrNullimpl(obj2) != null) {
                Log.log("PostBid", "ApiNetworkRequest: onFail");
                uVar2.a(adrequesttype2, (JSONObject) null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final ExecutorCoroutineDispatcher a() {
        return (ExecutorCoroutineDispatcher) f16503b.getValue();
    }

    public static final void a(Context context, double d2, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Job unused = BuildersKt__Builders_commonKt.launch$default(b(), (CoroutineContext) null, (CoroutineStart) null, new f(context, new s1.d(d2, str), (Continuation<? super f>) null), 3, (Object) null);
    }

    public static final void a(Context context, u<?, ?, ?> uVar, r<?> rVar, s<?> sVar, u<?, ?, ?>.e eVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uVar, "adTypeController");
        Intrinsics.checkNotNullParameter(rVar, "adRequest");
        Intrinsics.checkNotNullParameter(sVar, "adRequestParams");
        Intrinsics.checkNotNullParameter(eVar, "callback");
        Job unused = BuildersKt__Builders_commonKt.launch$default(b(), (CoroutineContext) null, (CoroutineStart) null, new e(rVar, sVar, uVar, context, eVar, (Continuation<? super e>) null), 3, (Object) null);
    }

    public static final void a(r<?> rVar, l<?, ?, ?, ?> lVar, Integer num, Double d2) {
        Intrinsics.checkNotNullParameter(rVar, "adRequest");
        Intrinsics.checkNotNullParameter(lVar, "adObject");
        String id = lVar.getId();
        Intrinsics.checkNotNullExpressionValue(id, "adObject.id");
        Job unused = BuildersKt__Builders_commonKt.launch$default(b(), (CoroutineContext) null, (CoroutineStart) null, new d(new s1.a.b(rVar, id, lVar.getEcpm(), num, d2), new y1(), new x1(), (Continuation<? super d>) null), 3, (Object) null);
    }

    public static final void a(r<?> rVar, l<?, ?, ?, ?> lVar, Integer num, Double d2, UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
        Intrinsics.checkNotNullParameter(rVar, "adRequest");
        l<?, ?, ?, ?> lVar2 = lVar;
        Intrinsics.checkNotNullParameter(lVar, "adObject");
        String id = lVar.getId();
        Intrinsics.checkNotNullExpressionValue(id, "adObject.id");
        s1.a.C0201a aVar = new s1.a.C0201a(rVar, id, lVar.getEcpm(), num, d2);
        y1 y1Var = new y1();
        x1 x1Var = new x1();
        u1 u1Var = new u1(unifiedAdCallbackClickTrackListener);
        Job unused = BuildersKt__Builders_commonKt.launch$default(b(), (CoroutineContext) null, (CoroutineStart) null, new a(aVar, u1Var, y1Var, x1Var, (Continuation<? super a>) null), 3, (Object) null);
    }

    public static final <AdObjectType extends l<?, ?, ?, ?>, AdRequestType extends r<AdObjectType>> void a(u<AdObjectType, AdRequestType, ?> uVar, AdRequestType adrequesttype, AdObjectType adobjecttype) {
        u<AdObjectType, AdRequestType, ?> uVar2 = uVar;
        AdRequestType adrequesttype2 = adrequesttype;
        Intrinsics.checkNotNullParameter(uVar, "adController");
        Intrinsics.checkNotNullParameter(adrequesttype2, "adRequest");
        com.appodeal.ads.services.c b2 = com.appodeal.ads.services.g.b();
        Context applicationContext = com.appodeal.ads.context.b.f16327b.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(j4.f16495a, "instance");
        Job unused = BuildersKt__Builders_commonKt.launch$default(b(), (CoroutineContext) null, (CoroutineStart) null, new m(new y2.a(applicationContext, uVar, adrequesttype, adobjecttype, b2.getServicesData()), uVar, adrequesttype2, (Continuation<? super m>) null), 3, (Object) null);
    }

    public static void a(String str) {
        Intrinsics.checkNotNullParameter(str, "packageName");
        Job unused = BuildersKt__Builders_commonKt.launch$default(b(), (CoroutineContext) null, (CoroutineStart) null, new i(str, (Continuation<? super i>) null), 3, (Object) null);
    }

    public static CoroutineScope b() {
        return (CoroutineScope) f16504c.getValue();
    }

    public static final void b(r<?> rVar, l<?, ?, ?, ?> lVar, Integer num, Double d2) {
        Intrinsics.checkNotNullParameter(rVar, "adRequest");
        Intrinsics.checkNotNullParameter(lVar, "adObject");
        String id = lVar.getId();
        Intrinsics.checkNotNullExpressionValue(id, "adObject.id");
        Job unused = BuildersKt__Builders_commonKt.launch$default(b(), (CoroutineContext) null, (CoroutineStart) null, new l(new s1.a.c(rVar, id, lVar.getEcpm(), num, d2), new y1(), new x1(), (Continuation<? super l>) null), 3, (Object) null);
    }

    public static final void c() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(b(), (CoroutineContext) null, (CoroutineStart) null, new k(new s1.g(), new w1(), new x1(), (Continuation<? super k>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.appodeal.ads.k0.h
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.appodeal.ads.k0$h r0 = (com.appodeal.ads.k0.h) r0
            int r1 = r0.f16542e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16542e = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.k0$h r0 = new com.appodeal.ads.k0$h
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f16540c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f16542e
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            com.appodeal.ads.x1 r6 = r0.f16539b
            com.appodeal.ads.t1 r0 = r0.f16538a
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.m51unboximpl()
            goto L_0x0064
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r7)
            com.appodeal.ads.context.b r7 = com.appodeal.ads.context.b.f16327b
            android.content.Context r7 = r7.getApplicationContext()
            com.appodeal.ads.s1$f r2 = new com.appodeal.ads.s1$f
            r2.<init>(r6)
            com.appodeal.ads.t1 r6 = new com.appodeal.ads.t1
            r6.<init>(r7)
            com.appodeal.ads.x1 r7 = new com.appodeal.ads.x1
            r7.<init>()
            r0.f16538a = r6
            r0.f16539b = r7
            r0.f16542e = r3
            java.lang.Object r0 = com.appodeal.ads.networking.c.a((com.appodeal.ads.s1) r2, (kotlin.coroutines.Continuation<? super kotlin.Result<? extends org.json.JSONObject>>) r0)
            if (r0 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r4 = r0
            r0 = r6
            r6 = r7
            r7 = r4
        L_0x0064:
            boolean r1 = kotlin.Result.m49isSuccessimpl(r7)
            if (r1 == 0) goto L_0x0076
            r1 = r7
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            r0.a(r1)
            r6.getClass()
            com.appodeal.ads.x1.a(r1)
        L_0x0076:
            java.lang.Throwable r7 = kotlin.Result.m46exceptionOrNullimpl(r7)
            if (r7 != 0) goto L_0x007d
            goto L_0x0089
        L_0x007d:
            com.appodeal.ads.networking.f.a(r7)
            r0.getClass()
            com.appodeal.ads.networking.f.a(r7)
            r6.getClass()
        L_0x0089:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.k0.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Result<? extends org.json.JSONObject>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.appodeal.ads.k0.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.appodeal.ads.k0$c r0 = (com.appodeal.ads.k0.c) r0
            int r1 = r0.f16515e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16515e = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.k0$c r0 = new com.appodeal.ads.k0$c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f16513c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f16515e
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            com.appodeal.ads.x1 r1 = r0.f16512b
            com.appodeal.ads.t1 r0 = r0.f16511a
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.m51unboximpl()
            goto L_0x0062
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r6)
            com.appodeal.ads.s1$b r6 = new com.appodeal.ads.s1$b
            r6.<init>()
            com.appodeal.ads.context.b r2 = com.appodeal.ads.context.b.f16327b
            android.content.Context r2 = r2.getApplicationContext()
            com.appodeal.ads.t1 r4 = new com.appodeal.ads.t1
            r4.<init>(r2)
            com.appodeal.ads.x1 r2 = new com.appodeal.ads.x1
            r2.<init>()
            r0.f16511a = r4
            r0.f16512b = r2
            r0.f16515e = r3
            java.lang.Object r6 = com.appodeal.ads.networking.c.a((com.appodeal.ads.s1) r6, (kotlin.coroutines.Continuation<? super kotlin.Result<? extends org.json.JSONObject>>) r0)
            if (r6 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r1 = r2
            r0 = r4
        L_0x0062:
            boolean r2 = kotlin.Result.m49isSuccessimpl(r6)
            if (r2 == 0) goto L_0x0074
            r2 = r6
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            r0.a(r2)
            r1.getClass()
            com.appodeal.ads.x1.a(r2)
        L_0x0074:
            java.lang.Throwable r2 = kotlin.Result.m46exceptionOrNullimpl(r6)
            if (r2 != 0) goto L_0x007b
            goto L_0x0087
        L_0x007b:
            com.appodeal.ads.networking.f.a(r2)
            r0.getClass()
            com.appodeal.ads.networking.f.a(r2)
            r1.getClass()
        L_0x0087:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.k0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(kotlin.coroutines.Continuation<? super kotlin.Result<? extends org.json.JSONObject>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.appodeal.ads.k0.g
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.appodeal.ads.k0$g r0 = (com.appodeal.ads.k0.g) r0
            int r1 = r0.f16537e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16537e = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.k0$g r0 = new com.appodeal.ads.k0$g
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f16535c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f16537e
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            com.appodeal.ads.x1 r1 = r0.f16534b
            com.appodeal.ads.t1 r0 = r0.f16533a
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.m51unboximpl()
            goto L_0x0062
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r6)
            com.appodeal.ads.s1$e r6 = new com.appodeal.ads.s1$e
            r6.<init>()
            com.appodeal.ads.context.b r2 = com.appodeal.ads.context.b.f16327b
            android.content.Context r2 = r2.getApplicationContext()
            com.appodeal.ads.t1 r4 = new com.appodeal.ads.t1
            r4.<init>(r2)
            com.appodeal.ads.x1 r2 = new com.appodeal.ads.x1
            r2.<init>()
            r0.f16533a = r4
            r0.f16534b = r2
            r0.f16537e = r3
            java.lang.Object r6 = com.appodeal.ads.networking.c.a((com.appodeal.ads.s1) r6, (kotlin.coroutines.Continuation<? super kotlin.Result<? extends org.json.JSONObject>>) r0)
            if (r6 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r1 = r2
            r0 = r4
        L_0x0062:
            boolean r2 = kotlin.Result.m49isSuccessimpl(r6)
            if (r2 == 0) goto L_0x0074
            r2 = r6
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            r0.a(r2)
            r1.getClass()
            com.appodeal.ads.x1.a(r2)
        L_0x0074:
            java.lang.Throwable r2 = kotlin.Result.m46exceptionOrNullimpl(r6)
            if (r2 != 0) goto L_0x007b
            goto L_0x0087
        L_0x007b:
            com.appodeal.ads.networking.f.a(r2)
            r0.getClass()
            com.appodeal.ads.networking.f.a(r2)
            r1.getClass()
        L_0x0087:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.k0.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
