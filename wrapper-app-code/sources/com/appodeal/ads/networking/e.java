package com.appodeal.ads.networking;

import com.appodeal.ads.api.Request;
import com.appodeal.ads.h0;
import com.appodeal.ads.i5;
import com.appodeal.ads.modules.common.internal.ext.ResultExtKt;
import com.appodeal.ads.modules.libs.network.HttpClient;
import com.appodeal.ads.modules.libs.network.HttpError;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.y2;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import org.json.JSONObject;

@DebugMetadata(c = "com.appodeal.ads.networking.JsonRequestExtKt$execute$4", f = "JsonRequestExt.kt", l = {65}, m = "invokeSuspend")
public final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends JSONObject>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f16986a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f16987b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ y2 f16988c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y2 f16989d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f16990e;

    @DebugMetadata(c = "com.appodeal.ads.networking.JsonRequestExtKt$execute$4$1", f = "JsonRequestExt.kt", l = {69}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends JSONObject>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public HttpClient.Proto f16991a;

        /* renamed from: b  reason: collision with root package name */
        public HttpClient.Method f16992b;

        /* renamed from: c  reason: collision with root package name */
        public int f16993c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ y2 f16994d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ y2 f16995e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f16996f;

        /* renamed from: com.appodeal.ads.networking.e$a$a  reason: collision with other inner class name */
        public static final class C0194a extends Lambda implements Function1<byte[], JSONObject> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0194a f16997a = new C0194a();

            public C0194a() {
                super(1);
            }

            public final Object invoke(Object obj) {
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    return null;
                }
                return new JSONObject(new String(bArr, Charsets.UTF_8));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(y2 y2Var, y2 y2Var2, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f16994d = y2Var;
            this.f16995e = y2Var2;
            this.f16996f = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f16994d, this.f16995e, this.f16996f, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            HttpClient.Method method;
            HttpClient.Proto proto;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16993c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HttpClient.Proto b2 = this.f16994d.b();
                HttpClient.Method c2 = this.f16994d.c();
                y2 y2Var = this.f16994d;
                this.f16991a = b2;
                this.f16992b = c2;
                this.f16993c = 1;
                Object a2 = y2Var.a(this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                proto = b2;
                method = c2;
                obj = a2;
            } else if (i == 1) {
                HttpClient.Method method2 = this.f16992b;
                HttpClient.Proto proto2 = this.f16991a;
                ResultKt.throwOnFailure(obj);
                HttpClient.Proto proto3 = proto2;
                method = method2;
                proto = proto3;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byte[] byteArray = ((Request.Builder) obj).build().toByteArray();
            y2 y2Var2 = this.f16994d;
            StringBuilder a3 = h0.a("Request body size to ");
            a3.append(y2Var2.d());
            a3.append(": ");
            a3.append(byteArray.length);
            a3.append(" bytes.");
            Log.log("ProtoRequest", a3.toString());
            return Result.m43boximpl(proto.m149enqueueyxL6bBk(method, this.f16996f, byteArray, C0194a.f16997a, this.f16995e instanceof i5));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(long j, y2 y2Var, y2 y2Var2, String str, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f16987b = j;
        this.f16988c = y2Var;
        this.f16989d = y2Var2;
        this.f16990e = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new e(this.f16987b, this.f16988c, this.f16989d, this.f16990e, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f16986a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.f16987b;
            a aVar = new a(this.f16988c, this.f16989d, this.f16990e, (Continuation<? super a>) null);
            this.f16986a = 1;
            obj = TimeoutKt.withTimeoutOrNull(j, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Result result = (Result) obj;
        return Result.m43boximpl(result == null ? ResultExtKt.asFailure(HttpError.TimeoutError.INSTANCE) : result.m51unboximpl());
    }
}
