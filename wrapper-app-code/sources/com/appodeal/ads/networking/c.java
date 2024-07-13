package com.appodeal.ads.networking;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.b3;
import com.appodeal.ads.h0;
import com.appodeal.ads.i5;
import com.appodeal.ads.j5;
import com.appodeal.ads.k4;
import com.appodeal.ads.modules.common.internal.ext.ResultExtKt;
import com.appodeal.ads.modules.common.internal.log.InternalLogKt;
import com.appodeal.ads.modules.libs.network.HttpClient;
import com.appodeal.ads.modules.libs.network.HttpError;
import com.appodeal.ads.s1;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.x0;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import org.json.JSONObject;

public final class c {

    @DebugMetadata(c = "com.appodeal.ads.networking.JsonRequestExtKt", f = "JsonRequestExt.kt", l = {26}, m = "execute")
    public static final class a extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f16964a;

        /* renamed from: b  reason: collision with root package name */
        public int f16965b;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f16964a = obj;
            this.f16965b |= RecyclerView.UNDEFINED_DURATION;
            Object a2 = c.a((s1) null, (Continuation<? super Result<? extends JSONObject>>) this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m43boximpl(a2);
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.networking.JsonRequestExtKt$execute$2", f = "JsonRequestExt.kt", l = {27}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends JSONObject>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f16966a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f16967b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ s1 f16968c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ s1 f16969d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f16970e;

        @DebugMetadata(c = "com.appodeal.ads.networking.JsonRequestExtKt$execute$2$1", f = "JsonRequestExt.kt", l = {31, 47}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends JSONObject>>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public HttpClient.ZipBase64 f16971a;

            /* renamed from: b  reason: collision with root package name */
            public HttpClient.Method f16972b;

            /* renamed from: c  reason: collision with root package name */
            public int f16973c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ s1 f16974d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ s1 f16975e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ String f16976f;

            /* renamed from: com.appodeal.ads.networking.c$b$a$a  reason: collision with other inner class name */
            public static final class C0193a extends Lambda implements Function1<byte[], JSONObject> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0193a f16977a = new C0193a();

                public C0193a() {
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
            public a(s1 s1Var, s1 s1Var2, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f16974d = s1Var;
                this.f16975e = s1Var2;
                this.f16976f = str;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f16974d, this.f16975e, this.f16976f, continuation);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                HttpClient.ZipBase64 zipBase64;
                HttpClient.Method method;
                JSONObject a2;
                JSONObject jSONObject;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f16973c;
                boolean z = true;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    zipBase64 = this.f16974d.e();
                    method = this.f16974d.f();
                    s1 s1Var = this.f16974d;
                    this.f16971a = zipBase64;
                    this.f16972b = method;
                    this.f16973c = 1;
                    obj = s1Var.a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    method = this.f16972b;
                    zipBase64 = this.f16971a;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    obj2 = ((Result) obj).m51unboximpl();
                    return Result.m43boximpl(obj2);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                HttpClient.Method method2 = method;
                byte[] a3 = ((b3) obj).a();
                s1 s1Var2 = this.f16974d;
                StringBuilder a4 = h0.a("Request body size to ");
                a4.append(s1Var2.g());
                a4.append(": ");
                a4.append(a3.length);
                a4.append(" bytes.");
                Log.log("JsonRequest", a4.toString());
                obj2 = zipBase64.m149enqueueyxL6bBk(method2, this.f16976f, a3, C0193a.f16977a, this.f16975e instanceof i5);
                s1 s1Var3 = this.f16975e;
                Result result = null;
                if (Result.m49isSuccessimpl(obj2) && (jSONObject = (JSONObject) obj2) != null) {
                    x0 x0Var = s1Var3 instanceof x0 ? (x0) s1Var3 : null;
                    if (x0Var != null) {
                        x0Var.a(jSONObject);
                    }
                }
                s1 s1Var4 = this.f16975e;
                String str = this.f16976f;
                Throwable r6 = Result.m46exceptionOrNullimpl(obj2);
                if (r6 != null) {
                    k4 k4Var = s1Var4 instanceof k4 ? (k4) s1Var4 : null;
                    boolean b2 = k4Var == null ? false : k4Var.b();
                    j5 j5Var = s1Var4 instanceof j5 ? (j5) s1Var4 : null;
                    if ((j5Var == null ? null : j5Var.c()) == null) {
                        z = false;
                    }
                    if (z || !b2) {
                        InternalLogKt.logInternal("JsonRequestExt", Intrinsics.stringPlus("Request failed: ", str), r6);
                        x0 x0Var2 = s1Var4 instanceof x0 ? (x0) s1Var4 : null;
                        if (!(x0Var2 == null || (a2 = x0Var2.a()) == null)) {
                            Result r11 = Result.m43boximpl(ResultExtKt.asSuccess(a2));
                            Object r0 = r11.m51unboximpl();
                            if (Result.m48isFailureimpl(r0)) {
                                r0 = null;
                            }
                            InternalLogKt.logInternal$default("JsonRequestExt", Intrinsics.stringPlus("Using cached result: ", r0), (Throwable) null, 4, (Object) null);
                            result = r11;
                        }
                        obj2 = result == null ? ResultExtKt.asFailure(r6) : result.m51unboximpl();
                    } else {
                        InternalLogKt.logInternal("JsonRequestExt", "Applying retry logic (Failed at " + str + ')', r6);
                        this.f16971a = null;
                        this.f16972b = null;
                        this.f16973c = 2;
                        obj2 = c.a(s1Var4, (Continuation<? super Result<? extends JSONObject>>) this);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Result.m43boximpl(obj2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(int i, s1 s1Var, s1 s1Var2, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f16967b = i;
            this.f16968c = s1Var;
            this.f16969d = s1Var2;
            this.f16970e = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f16967b, this.f16968c, this.f16969d, this.f16970e, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16966a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = (long) this.f16967b;
                a aVar = new a(this.f16968c, this.f16969d, this.f16970e, (Continuation<? super a>) null);
                this.f16966a = 1;
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

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(com.appodeal.ads.s1 r10, kotlin.coroutines.Continuation<? super kotlin.Result<? extends org.json.JSONObject>> r11) {
        /*
            boolean r0 = r11 instanceof com.appodeal.ads.networking.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.appodeal.ads.networking.c$a r0 = (com.appodeal.ads.networking.c.a) r0
            int r1 = r0.f16965b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16965b = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.networking.c$a r0 = new com.appodeal.ads.networking.c$a
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.f16964a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f16965b
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0099
        L_0x002a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r11)
            boolean r11 = r10 instanceof com.appodeal.ads.x0
            r2 = 0
            if (r11 == 0) goto L_0x003e
            r11 = r10
            com.appodeal.ads.x0 r11 = (com.appodeal.ads.x0) r11
            goto L_0x003f
        L_0x003e:
            r11 = r2
        L_0x003f:
            if (r11 != 0) goto L_0x0043
            r11 = r2
            goto L_0x0047
        L_0x0043:
            org.json.JSONObject r11 = r11.a()
        L_0x0047:
            if (r11 == 0) goto L_0x004e
            r11 = 10000(0x2710, float:1.4013E-41)
            r5 = 10000(0x2710, float:1.4013E-41)
            goto L_0x0052
        L_0x004e:
            r11 = 20000(0x4e20, float:2.8026E-41)
            r5 = 20000(0x4e20, float:2.8026E-41)
        L_0x0052:
            boolean r11 = r10 instanceof com.appodeal.ads.j5
            if (r11 == 0) goto L_0x005a
            r11 = r10
            com.appodeal.ads.j5 r11 = (com.appodeal.ads.j5) r11
            goto L_0x005b
        L_0x005a:
            r11 = r2
        L_0x005b:
            if (r11 != 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            java.lang.String r2 = r11.c()
        L_0x0062:
            if (r2 != 0) goto L_0x006b
            r10.getClass()
            java.lang.String r2 = com.appodeal.ads.s1.d()
        L_0x006b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r2 = 47
            r11.append(r2)
            java.lang.String r2 = r10.g()
            r11.append(r2)
            java.lang.String r8 = r11.toString()
            kotlinx.coroutines.CoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getIO()
            com.appodeal.ads.networking.c$b r2 = new com.appodeal.ads.networking.c$b
            r9 = 0
            r4 = r2
            r6 = r10
            r7 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f16965b = r3
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r11, r2, r0)
            if (r11 != r1) goto L_0x0099
            return r1
        L_0x0099:
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r10 = r11.m51unboximpl()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.networking.c.a(com.appodeal.ads.s1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(com.appodeal.ads.y2.a r11, kotlin.coroutines.Continuation r12) {
        /*
            boolean r0 = r12 instanceof com.appodeal.ads.networking.d
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.appodeal.ads.networking.d r0 = (com.appodeal.ads.networking.d) r0
            int r1 = r0.f16985b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16985b = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.networking.d r0 = new com.appodeal.ads.networking.d
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.f16984a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f16985b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x006b
        L_0x0029:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r12)
            r11.getClass()
            java.lang.String r12 = com.appodeal.ads.y2.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r12 = 47
            r2.append(r12)
            java.lang.String r12 = r11.d()
            r2.append(r12)
            java.lang.String r9 = r2.toString()
            kotlinx.coroutines.CoroutineDispatcher r12 = kotlinx.coroutines.Dispatchers.getIO()
            com.appodeal.ads.networking.e r2 = new com.appodeal.ads.networking.e
            r5 = 20000(0x4e20, double:9.8813E-320)
            r10 = 0
            r4 = r2
            r7 = r11
            r8 = r11
            r4.<init>(r5, r7, r8, r9, r10)
            r0.f16985b = r3
            java.lang.Object r12 = kotlinx.coroutines.BuildersKt.withContext(r12, r2, r0)
            if (r12 != r1) goto L_0x006b
            return r1
        L_0x006b:
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r11 = r12.m51unboximpl()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.networking.c.a(com.appodeal.ads.y2$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
