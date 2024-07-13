package com.appodeal.consent.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.libs.network.HttpClient;
import com.appodeal.ads.modules.libs.network.Networking;
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
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f17826a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final HttpClient.Method f17827b = HttpClient.Method.POST;

    /* renamed from: c  reason: collision with root package name */
    public static final HttpClient.Zip f17828c = HttpClient.Zip.INSTANCE;

    @DebugMetadata(c = "com.appodeal.consent.internal.ConsentRequest", f = "ConsentRequest.kt", l = {20}, m = "execute-0E7RQCE$apd_consent")
    public static final class a extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f17829a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f17830b;

        /* renamed from: c  reason: collision with root package name */
        public int f17831c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f17830b = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17829a = obj;
            this.f17831c |= RecyclerView.UNDEFINED_DURATION;
            Object a2 = this.f17830b.a((a) null, (String) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m43boximpl(a2);
        }
    }

    @DebugMetadata(c = "com.appodeal.consent.internal.ConsentRequest$execute$2", f = "ConsentRequest.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends JSONObject>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17832a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f17833b;

        public static final class a extends Lambda implements Function1<byte[], JSONObject> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f17834a = new a();

            public a() {
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
        public b(a aVar, String str, Continuation continuation) {
            super(2, continuation);
            this.f17832a = str;
            this.f17833b = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f17833b, this.f17832a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            HttpClient.Zip a2 = c.f17828c;
            HttpClient.Method b2 = c.f17827b;
            String str = this.f17832a;
            String jSONObject = j.a(this.f17833b).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "RequestDataBinder.bind(d…              .toString()");
            byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return Result.m43boximpl(Networking.DefaultImpls.m150enqueueyxL6bBk$default(a2, b2, str, bytes, a.f17834a, false, 16, (Object) null));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.appodeal.consent.internal.a r5, java.lang.String r6, kotlin.coroutines.Continuation<? super kotlin.Result<? extends org.json.JSONObject>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.appodeal.consent.internal.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.appodeal.consent.internal.c$a r0 = (com.appodeal.consent.internal.c.a) r0
            int r1 = r0.f17831c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17831c = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.consent.internal.c$a r0 = new com.appodeal.consent.internal.c$a
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f17829a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17831c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r7)
            com.appodeal.consent.internal.c$b r7 = new com.appodeal.consent.internal.c$b
            r2 = 0
            r7.<init>(r5, r6, r2)
            r0.f17831c = r3
            r5 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r5, r7, r0)
            if (r7 != r1) goto L_0x0045
            return r1
        L_0x0045:
            kotlin.Result r7 = (kotlin.Result) r7
            if (r7 != 0) goto L_0x0050
            com.appodeal.ads.modules.libs.network.HttpError$TimeoutError r5 = com.appodeal.ads.modules.libs.network.HttpError.TimeoutError.INSTANCE
            java.lang.Object r5 = com.appodeal.ads.modules.common.internal.ext.ResultExtKt.asFailure(r5)
            goto L_0x0054
        L_0x0050:
            java.lang.Object r5 = r7.m51unboximpl()
        L_0x0054:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.internal.c.a(com.appodeal.consent.internal.a, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
