package com.appodeal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.networking.binders.c;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.json.JSONObject;

public final class b3 {

    /* renamed from: a  reason: collision with root package name */
    public final g4 f16303a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f16304b;

    /* renamed from: c  reason: collision with root package name */
    public r<?> f16305c;

    /* renamed from: d  reason: collision with root package name */
    public s<?> f16306d;

    /* renamed from: e  reason: collision with root package name */
    public u<?, ?, ?> f16307e;

    @DebugMetadata(c = "com.appodeal.ads.RequestBodyBuilder", f = "RequestBodyBuilder.kt", l = {36}, m = "bind")
    public static final class a extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public b3 f16308a;

        /* renamed from: b  reason: collision with root package name */
        public c[] f16309b;

        /* renamed from: c  reason: collision with root package name */
        public c f16310c;

        /* renamed from: d  reason: collision with root package name */
        public int f16311d;

        /* renamed from: e  reason: collision with root package name */
        public int f16312e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f16313f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ b3 f16314g;

        /* renamed from: h  reason: collision with root package name */
        public int f16315h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b3 b3Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f16314g = b3Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f16313f = obj;
            this.f16315h |= RecyclerView.UNDEFINED_DURATION;
            return this.f16314g.a((c[]) null, (Continuation<? super b3>) this);
        }
    }

    public static final class b extends Lambda implements Function0<JSONObject> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16316a = new b();

        public b() {
            super(0);
        }

        public final Object invoke() {
            return JsonObjectBuilderKt.jsonObject(c3.f16323a);
        }
    }

    public b3() {
        this(0);
    }

    public /* synthetic */ b3(int i) {
        this(i4.a());
    }

    public b3(g4 g4Var) {
        Intrinsics.checkNotNullParameter(g4Var, IronSourceConstants.EVENTS_PROVIDER);
        this.f16303a = g4Var;
        this.f16304b = LazyKt.lazy(b.f16316a);
    }

    public final b3 a(r<?> rVar) {
        Intrinsics.checkNotNullParameter(rVar, "adRequest");
        this.f16305c = rVar;
        return this;
    }

    public final b3 a(s<?> sVar) {
        Intrinsics.checkNotNullParameter(sVar, "adRequestParams");
        this.f16306d = sVar;
        return this;
    }

    public final b3 a(u<?, ?, ?> uVar) {
        Intrinsics.checkNotNullParameter(uVar, "adTypeController");
        this.f16307e = uVar;
        return this;
    }

    public final byte[] a() {
        byte[] bArr;
        if (((JSONObject) this.f16304b.getValue()).length() != 0) {
            String jSONObject = ((JSONObject) this.f16304b.getValue()).toString();
            if (jSONObject == null) {
                bArr = null;
            } else {
                bArr = jSONObject.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bArr, "this as java.lang.String).getBytes(charset)");
            }
            if (bArr != null) {
                return bArr;
            }
        }
        return new byte[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.appodeal.ads.networking.binders.c[] r14, kotlin.coroutines.Continuation<? super com.appodeal.ads.b3> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.appodeal.ads.b3.a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.appodeal.ads.b3$a r0 = (com.appodeal.ads.b3.a) r0
            int r1 = r0.f16315h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16315h = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.b3$a r0 = new com.appodeal.ads.b3$a
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f16313f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f16315h
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            int r14 = r0.f16312e
            int r2 = r0.f16311d
            com.appodeal.ads.networking.binders.c r4 = r0.f16310c
            com.appodeal.ads.networking.binders.c[] r5 = r0.f16309b
            com.appodeal.ads.b3 r6 = r0.f16308a
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0073
        L_0x0033:
            r15 = move-exception
            goto L_0x007f
        L_0x0035:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r15)
            r15 = 0
            int r2 = r14.length
            r10 = r13
            r15 = r14
            r14 = r2
            r2 = r1
            r1 = r0
            r0 = 0
        L_0x0048:
            if (r0 >= r14) goto L_0x00a0
            r11 = r15[r0]
            int r0 = r0 + 1
            com.appodeal.ads.g4 r4 = r10.f16303a     // Catch:{ Exception -> 0x0076 }
            com.appodeal.ads.r<?> r6 = r10.f16305c     // Catch:{ Exception -> 0x0076 }
            com.appodeal.ads.s<?> r7 = r10.f16306d     // Catch:{ Exception -> 0x0076 }
            com.appodeal.ads.u<?, ?, ?> r8 = r10.f16307e     // Catch:{ Exception -> 0x0076 }
            r1.f16308a = r10     // Catch:{ Exception -> 0x0076 }
            r1.f16309b = r15     // Catch:{ Exception -> 0x0076 }
            r1.f16310c = r11     // Catch:{ Exception -> 0x0076 }
            r1.f16311d = r0     // Catch:{ Exception -> 0x0076 }
            r1.f16312e = r14     // Catch:{ Exception -> 0x0076 }
            r1.f16315h = r3     // Catch:{ Exception -> 0x0076 }
            r5 = r11
            r9 = r1
            java.lang.Object r4 = r4.a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0076 }
            if (r4 != r2) goto L_0x006b
            return r2
        L_0x006b:
            r5 = r15
            r15 = r4
            r6 = r10
            r4 = r11
            r12 = r2
            r2 = r0
            r0 = r1
            r1 = r12
        L_0x0073:
            com.appodeal.ads.networking.binders.b r15 = (com.appodeal.ads.networking.binders.b) r15     // Catch:{ Exception -> 0x0033 }
            goto L_0x008b
        L_0x0076:
            r4 = move-exception
            r5 = r15
            r15 = r4
            r6 = r10
            r4 = r11
            r12 = r2
            r2 = r0
            r0 = r1
            r1 = r12
        L_0x007f:
            java.lang.String r7 = "Error while binding data for "
            java.lang.String r4 = kotlin.jvm.internal.Intrinsics.stringPlus(r7, r4)
            java.lang.String r7 = "RequestBodyBuilder"
            com.appodeal.ads.modules.common.internal.log.InternalLogKt.logInternal(r7, r4, r15)
            r15 = 0
        L_0x008b:
            r10 = r6
            r12 = r1
            r1 = r0
            r0 = r2
            r2 = r12
            if (r15 != 0) goto L_0x0093
            goto L_0x009e
        L_0x0093:
            kotlin.Lazy r4 = r10.f16304b
            java.lang.Object r4 = r4.getValue()
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            com.appodeal.ads.f4.a(r4, r15)
        L_0x009e:
            r15 = r5
            goto L_0x0048
        L_0x00a0:
            kotlin.Lazy r14 = r10.f16304b
            java.lang.Object r14 = r14.getValue()
            org.json.JSONObject r14 = (org.json.JSONObject) r14
            com.appodeal.ads.j4 r15 = com.appodeal.ads.j4.f16495a
            java.lang.String r0 = "instance"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r0)
            com.appodeal.ads.x2.b(r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.b3.a(com.appodeal.ads.networking.binders.c[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final b3 a(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "key");
        ((JSONObject) this.f16304b.getValue()).put(str, obj);
        return this;
    }
}
