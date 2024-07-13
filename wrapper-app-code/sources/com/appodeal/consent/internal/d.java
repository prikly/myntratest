package com.appodeal.consent.internal;

import android.app.Activity;
import android.content.Context;
import com.appodeal.consent.Consent;
import com.appodeal.consent.ConsentManager;
import com.appodeal.consent.ConsentManagerError;
import com.appodeal.consent.view.ConsentActivity;
import com.appodeal.consent.view.b;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.json.JSONObject;

public final class d implements b.c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17835a;

    /* renamed from: b  reason: collision with root package name */
    public final a f17836b;

    /* renamed from: c  reason: collision with root package name */
    public int f17837c = 1;

    /* renamed from: d  reason: collision with root package name */
    public final CoroutineScope f17838d = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());

    /* renamed from: e  reason: collision with root package name */
    public final Lazy f17839e = LazyKt.lazy(new g(this));

    /* renamed from: f  reason: collision with root package name */
    public Activity f17840f;

    public interface a {
        void onClosed();

        void onError(ConsentManagerError consentManagerError);

        void onLoaded();

        void onOpened();
    }

    @DebugMetadata(c = "com.appodeal.consent.internal.InternalForm$handleClose$1", f = "InternalForm.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f17841a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ JSONObject f17842b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, JSONObject jSONObject, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f17841a = dVar;
            this.f17842b = jSONObject;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f17841a, this.f17842b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f17841a.f17837c = 1;
            Function1<? super Activity, Unit> function1 = ConsentActivity.f17883b;
            ConsentActivity.a.b();
            Activity a2 = this.f17841a.f17840f;
            if (a2 != null) {
                a2.finish();
            }
            this.f17841a.f17840f = null;
            Lazy lazy = g.f17867a;
            g.a(false);
            JSONObject jSONObject = this.f17842b;
            g.a(jSONObject == null ? Consent.copy$default(g.b(), Consent.Status.NON_PERSONALIZED, (Consent.Zone) null, 0, (String) null, 0, 0, (JSONObject) null, (JSONObject) null, (List) null, 510, (Object) null) : new Consent(jSONObject));
            Consent b2 = g.b();
            Context applicationContext = this.f17841a.b().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            b.a(b2, applicationContext);
            Consent b3 = g.b();
            Context applicationContext2 = this.f17841a.b().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            b.b(b3, applicationContext2);
            this.f17841a.c().onClosed();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.consent.internal.InternalForm$handleError$1", f = "InternalForm.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17843a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f17844b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, d dVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f17843a = str;
            this.f17844b = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f17843a, this.f17844b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String str = this.f17843a;
            if (str != null) {
                this.f17844b.c().onError(new ConsentManagerError.ShowingError(str));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.consent.internal.InternalForm$handleLoaded$1", f = "InternalForm.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.appodeal.consent.internal.d$d  reason: collision with other inner class name */
    public static final class C0213d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f17845a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0213d(d dVar, Continuation<? super C0213d> continuation) {
            super(2, continuation);
            this.f17845a = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C0213d(this.f17845a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C0213d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f17845a.f17837c = 3;
            this.f17845a.c().onLoaded();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.consent.internal.InternalForm$load$1", f = "InternalForm.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f17846a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(d dVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f17846a = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f17846a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            d dVar;
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (this.f17846a.e()) {
                dVar = this.f17846a;
                str = "Cannot simultaneously load multiple consent forms.";
            } else {
                if (this.f17846a.d()) {
                    this.f17846a.a();
                } else if (com.appodeal.consent.view.d.a(d.b(this.f17846a))) {
                    dVar = this.f17846a;
                    str = "Consent url is not valid.";
                } else {
                    this.f17846a.f17837c = 2;
                    d.d(this.f17846a).a();
                    d.d(this.f17846a).loadUrl(d.b(this.f17846a));
                }
                return Unit.INSTANCE;
            }
            dVar.a(str);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.consent.internal.InternalForm$show$1", f = "InternalForm.kt", l = {}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f17847a;

        public static final class a extends Lambda implements Function1<Activity, Unit> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f17848a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(1);
                this.f17848a = dVar;
            }

            public final Object invoke(Object obj) {
                Activity activity = (Activity) obj;
                Intrinsics.checkNotNullParameter(activity, "it");
                this.f17848a.f17840f = activity;
                Job unused = BuildersKt__Builders_commonKt.launch$default(this.f17848a.f17838d, (CoroutineContext) null, (CoroutineStart) null, new e(this.f17848a, (Continuation<? super e>) null), 3, (Object) null);
                return Unit.INSTANCE;
            }
        }

        public static final class b extends Lambda implements Function1<Activity, Unit> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f17849a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(d dVar) {
                super(1);
                this.f17849a = dVar;
            }

            public final Object invoke(Object obj) {
                Intrinsics.checkNotNullParameter((Activity) obj, "it");
                d.d(this.f17849a).getCloseButton().callOnClick();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(d dVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f17847a = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f17847a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            d dVar;
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            boolean f2 = this.f17847a.f();
            Function1<? super Activity, Unit> function1 = ConsentActivity.f17883b;
            if (f2 || ConsentActivity.a.a()) {
                dVar = this.f17847a;
                str = "Consent form is already displayed.";
            } else if (!this.f17847a.d()) {
                dVar = this.f17847a;
                str = "Consent form is not ready to be displayed.";
            } else {
                this.f17847a.f17837c = 4;
                ConsentActivity.a.a(new a(this.f17847a));
                ConsentActivity.a.a(new b(this.f17847a));
                ConsentActivity.a.a(d.d(this.f17847a));
                return Unit.INSTANCE;
            }
            dVar.a(str);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function0<com.appodeal.consent.view.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f17850a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(d dVar) {
            super(0);
            this.f17850a = dVar;
        }

        public final Object invoke() {
            d dVar = this.f17850a;
            return new com.appodeal.consent.view.b(dVar.f17835a, dVar, g.f17869c, ConsentManager.getConsent(), ConsentManager.getCustomVendors());
        }
    }

    public d(Context context, a aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f17835a = context;
        this.f17836b = aVar;
    }

    public static final String b(d dVar) {
        dVar.getClass();
        return g.f17869c;
    }

    public static final com.appodeal.consent.view.b d(d dVar) {
        return (com.appodeal.consent.view.b) dVar.f17839e.getValue();
    }

    public final void a() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.f17838d, (CoroutineContext) null, (CoroutineStart) null, new C0213d(this, (Continuation<? super C0213d>) null), 3, (Object) null);
    }

    public final void a(String str) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.f17838d, (CoroutineContext) null, (CoroutineStart) null, new c(str, this, (Continuation<? super c>) null), 3, (Object) null);
    }

    public final void a(JSONObject jSONObject) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.f17838d, (CoroutineContext) null, (CoroutineStart) null, new b(this, jSONObject, (Continuation<? super b>) null), 3, (Object) null);
    }

    public final Context b() {
        return this.f17835a;
    }

    public final a c() {
        return this.f17836b;
    }

    public final boolean d() {
        return this.f17837c == 3;
    }

    public final boolean e() {
        return this.f17837c == 2;
    }

    public final boolean f() {
        return this.f17837c == 4;
    }

    public final void g() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.f17838d, (CoroutineContext) null, (CoroutineStart) null, new e(this, (Continuation<? super e>) null), 3, (Object) null);
    }

    public final void h() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.f17838d, (CoroutineContext) null, (CoroutineStart) null, new f(this, (Continuation<? super f>) null), 3, (Object) null);
    }
}
