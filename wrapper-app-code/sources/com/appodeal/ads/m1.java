package com.appodeal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    public final k0 f16600a;

    /* renamed from: b  reason: collision with root package name */
    public final ContextProvider f16601b;

    @DebugMetadata(c = "com.appodeal.ads.InitRequestUseCase", f = "InitRequestUseCase.kt", l = {13, 16}, m = "invoke-IoAF18A")
    public static final class a extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public m1 f16602a;

        /* renamed from: b  reason: collision with root package name */
        public JSONObject f16603b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f16604c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m1 f16605d;

        /* renamed from: e  reason: collision with root package name */
        public int f16606e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m1 m1Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f16605d = m1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f16604c = obj;
            this.f16606e |= RecyclerView.UNDEFINED_DURATION;
            Object a2 = this.f16605d.a(this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m43boximpl(a2);
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.InitRequestUseCase", f = "InitRequestUseCase.kt", l = {24}, m = "parseResponse")
    public static final class b extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public m1 f16607a;

        /* renamed from: b  reason: collision with root package name */
        public JSONObject f16608b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f16609c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m1 f16610d;

        /* renamed from: e  reason: collision with root package name */
        public int f16611e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m1 m1Var, Continuation<? super b> continuation) {
            super(continuation);
            this.f16610d = m1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f16609c = obj;
            this.f16611e |= RecyclerView.UNDEFINED_DURATION;
            return this.f16610d.a((JSONObject) null, this);
        }
    }

    public /* synthetic */ m1(int i) {
        this(k0.f16502a, com.appodeal.ads.context.b.f16327b);
    }

    public m1(k0 k0Var, ContextProvider contextProvider) {
        Intrinsics.checkNotNullParameter(k0Var, "appodealNetworkRequestApi");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f16600a = k0Var;
        this.f16601b = contextProvider;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.appodeal.ads.m1.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.appodeal.ads.m1$a r0 = (com.appodeal.ads.m1.a) r0
            int r1 = r0.f16606e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16606e = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.m1$a r0 = new com.appodeal.ads.m1$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f16604c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f16606e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            org.json.JSONObject r1 = r0.f16603b
            com.appodeal.ads.m1 r0 = r0.f16602a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0071
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0038:
            com.appodeal.ads.m1 r2 = r0.f16602a
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.m51unboximpl()
            goto L_0x0055
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r6)
            com.appodeal.ads.k0 r6 = r5.f16600a
            r0.f16602a = r5
            r0.f16606e = r4
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r2 = r5
        L_0x0055:
            boolean r4 = kotlin.Result.m49isSuccessimpl(r6)
            if (r4 == 0) goto L_0x0089
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            if (r6 != 0) goto L_0x0062
            goto L_0x0087
        L_0x0062:
            r0.f16602a = r2
            r0.f16603b = r6
            r0.f16606e = r3
            java.lang.Object r0 = r2.a(r6, r0)
            if (r0 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r1 = r6
            r0 = r2
        L_0x0071:
            r0.getClass()
            java.lang.String r6 = "init"
            org.json.JSONArray r6 = r1.optJSONArray(r6)
            com.appodeal.ads.ApdServiceRegistry r1 = com.appodeal.ads.ApdServiceRegistry.getInstance()
            com.appodeal.ads.modules.common.internal.context.ContextProvider r0 = r0.f16601b
            android.content.Context r0 = r0.getApplicationContext()
            r1.initialize(r0, r6)
        L_0x0087:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L_0x0089:
            java.lang.Object r6 = kotlin.Result.m44constructorimpl(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.m1.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(org.json.JSONObject r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.appodeal.ads.m1.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.appodeal.ads.m1$b r0 = (com.appodeal.ads.m1.b) r0
            int r1 = r0.f16611e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16611e = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.m1$b r0 = new com.appodeal.ads.m1$b
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f16609c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f16611e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            org.json.JSONObject r5 = r0.f16608b
            com.appodeal.ads.m1 r0 = r0.f16607a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004b
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r6)
            com.appodeal.ads.r0 r6 = com.appodeal.ads.r0.f17085a
            com.appodeal.ads.r0.a((org.json.JSONObject) r5)
            r0.f16607a = r4
            r0.f16608b = r5
            r0.f16611e = r3
            java.lang.Object r6 = r6.a((org.json.JSONObject) r5, (kotlin.coroutines.Continuation<? super kotlin.Unit>) r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r0 = r4
        L_0x004b:
            com.appodeal.ads.r0 r6 = com.appodeal.ads.r0.f17085a
            com.appodeal.ads.r0.b(r5)
            com.appodeal.ads.i0.a(r5)
            com.appodeal.ads.x2.a((org.json.JSONObject) r5)
            com.appodeal.ads.utils.x r6 = com.appodeal.ads.q4.m()
            com.appodeal.ads.modules.common.internal.context.ContextProvider r0 = r0.f16601b
            android.content.Context r0 = r0.getApplicationContext()
            r6.a((android.content.Context) r0, (org.json.JSONObject) r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.m1.a(org.json.JSONObject, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
