package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.segments.g;
import com.appodeal.ads.segments.h;
import com.appodeal.ads.segments.j;
import com.appodeal.ads.segments.n;
import com.appodeal.ads.utils.Log;
import java.util.TreeMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.json.JSONObject;

public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17419a;

    @DebugMetadata(c = "com.appodeal.ads.JsonRequestCallbacks$BaseRequestCallback$onSuccess$1", f = "JsonRequestCallbacks.kt", l = {35}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f17420a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ JSONObject f17421b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f17421b = jSONObject;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f17421b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f17420a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                r0 r0Var = r0.f17085a;
                JSONObject jSONObject = this.f17421b;
                this.f17420a = 1;
                if (r0Var.a(jSONObject, (Continuation<? super Unit>) this) == coroutine_suspended) {
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

    public t1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17419a = context;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.optBoolean("session_drop_store")) {
                q4.m().b();
            }
            Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new a(jSONObject, (Continuation<? super a>) null), 3, (Object) null);
            i0.a(this.f17419a, jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("user_data");
            l5.a(optJSONObject);
            j.b().b(optJSONObject);
            if (jSONObject.has("active_segment")) {
                n.a(this.f17419a, jSONObject.optJSONObject("active_segment"));
            } else if (jSONObject.has("segments")) {
                n.a(this.f17419a, jSONObject.optJSONArray("segments"));
            }
            try {
                if (jSONObject.has("placements")) {
                    TreeMap<String, g> treeMap = h.f17256a;
                    h.a(jSONObject.optJSONArray("placements"));
                    h.d();
                }
            } catch (Throwable th) {
                Log.log(th);
            }
        }
    }
}
