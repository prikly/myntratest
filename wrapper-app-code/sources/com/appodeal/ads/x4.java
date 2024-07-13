package com.appodeal.ads;

import android.app.Application;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.services.c;
import com.appodeal.ads.storage.a;
import com.appodeal.ads.storage.n;
import com.appodeal.ads.storage.o;
import com.appodeal.consent.Consent;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

public final class x4 implements t4 {

    /* renamed from: a  reason: collision with root package name */
    public final com.appodeal.ads.networking.usecases.a f17655a;

    /* renamed from: b  reason: collision with root package name */
    public final c.a f17656b;

    /* renamed from: c  reason: collision with root package name */
    public final a3 f17657c;

    /* renamed from: d  reason: collision with root package name */
    public final com.appodeal.ads.initializing.a f17658d;

    /* renamed from: e  reason: collision with root package name */
    public final m1 f17659e;

    /* renamed from: f  reason: collision with root package name */
    public final com.appodeal.ads.utils.tracker.a f17660f;

    /* renamed from: g  reason: collision with root package name */
    public final c5 f17661g;

    /* renamed from: h  reason: collision with root package name */
    public final b f17662h;
    public final com.appodeal.ads.storage.a i;
    public final a.C0204a j;

    @DebugMetadata(c = "com.appodeal.ads.SdkCoreInitializerImpl", f = "SdkCoreInitializer.kt", l = {84, 85}, m = "invoke-yxL6bBk")
    public static final class a extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public x4 f17663a;

        /* renamed from: b  reason: collision with root package name */
        public Application f17664b;

        /* renamed from: c  reason: collision with root package name */
        public String f17665c;

        /* renamed from: d  reason: collision with root package name */
        public Consent f17666d;

        /* renamed from: e  reason: collision with root package name */
        public Boolean f17667e;

        /* renamed from: f  reason: collision with root package name */
        public Context f17668f;

        /* renamed from: g  reason: collision with root package name */
        public /* synthetic */ Object f17669g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ x4 f17670h;
        public int i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(x4 x4Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f17670h = x4Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17669g = obj;
            this.i |= RecyclerView.UNDEFINED_DURATION;
            Object a2 = this.f17670h.a((Application) null, (String) null, (Consent) null, (Boolean) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m43boximpl(a2);
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.SdkCoreInitializerImpl$invoke$2", f = "SdkCoreInitializer.kt", l = {86, 90, 96, 97, 101, 105}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Object f17671a;

        /* renamed from: b  reason: collision with root package name */
        public x4 f17672b;

        /* renamed from: c  reason: collision with root package name */
        public int f17673c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f17674d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ x4 f17675e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Application f17676f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ String f17677g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Context f17678h;
        public final /* synthetic */ Consent i;
        public final /* synthetic */ Boolean j;

        @DebugMetadata(c = "com.appodeal.ads.SdkCoreInitializerImpl$invoke$2$3", f = "SdkCoreInitializer.kt", l = {108}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f17679a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ x4 f17680b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ Context f17681c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(x4 x4Var, Context context, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f17680b = x4Var;
                this.f17681c = context;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f17680b, this.f17681c, continuation);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f17679a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    x4 x4Var = this.f17680b;
                    Context context = this.f17681c;
                    Intrinsics.checkNotNullExpressionValue(context, "applicationContext");
                    this.f17679a = 1;
                    if (x4.a(x4Var, context, this) == coroutine_suspended) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(x4 x4Var, Application application, String str, Context context, Consent consent, Boolean bool, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f17675e = x4Var;
            this.f17676f = application;
            this.f17677g = str;
            this.f17678h = context;
            this.i = consent;
            this.j = bool;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f17675e, this.f17676f, this.f17677g, this.f17678h, this.i, this.j, continuation);
            bVar.f17674d = obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0076, code lost:
            r4 = r12.f17675e;
            r5 = r12.f17678h;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "applicationContext");
            r6 = r12.i;
            r7 = r12.j;
            r8 = r12.f17677g;
            r12.f17674d = r1;
            r12.f17673c = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x008d, code lost:
            if (com.appodeal.ads.x4.a(r4, r5, r6, r7, r8, r12) != r0) goto L_0x0090;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x008f, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0090, code lost:
            r13 = com.appodeal.ads.x4.b(r12.f17675e);
            r12.f17674d = r1;
            r12.f17673c = 3;
            r13 = r13.a((kotlin.coroutines.Continuation<? super kotlin.Result<com.appodeal.ads.networking.b>>) r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x009f, code lost:
            if (r13 != r0) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a1, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a2, code lost:
            r13 = r12.f17675e;
            r5 = r12.f17678h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00aa, code lost:
            if (kotlin.Result.m49isSuccessimpl(r1) == false) goto L_0x00dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ac, code lost:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "applicationContext");
            r12.f17674d = r4;
            r12.f17671a = r1;
            r12.f17672b = r13;
            r12.f17673c = 4;
            r2 = com.appodeal.ads.x4.a(r13, r5, (com.appodeal.ads.networking.b) r1, (kotlin.coroutines.Continuation) r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bf, code lost:
            if (r2 != r0) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c1, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c2, code lost:
            r11 = r1;
            r1 = r13;
            r13 = r2;
            r2 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c6, code lost:
            r1 = com.appodeal.ads.x4.d(r1);
            r12.f17674d = r4;
            r12.f17671a = r2;
            r12.f17672b = null;
            r12.f17673c = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d9, code lost:
            if (r1.a((java.util.List) r13, r12) != r0) goto L_0x00dc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00db, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dc, code lost:
            r1 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dd, code lost:
            r13 = r12.f17675e;
            r1 = kotlin.Result.m46exceptionOrNullimpl(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e3, code lost:
            if (r1 != null) goto L_0x00e6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e6, code lost:
            com.appodeal.ads.x4.a(r13).a(new com.appodeal.ads.initializing.ApdInitializationError.InternalError.SdkConfigurationError(r1));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f2, code lost:
            r13 = com.appodeal.ads.x4.c(r12.f17675e);
            r12.f17674d = r4;
            r12.f17671a = null;
            r12.f17673c = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0103, code lost:
            if (r13.a(r12) != r0) goto L_0x0106;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0105, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0106, code lost:
            r5 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x011b, code lost:
            return kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r5, kotlinx.coroutines.Dispatchers.getDefault(), (kotlinx.coroutines.CoroutineStart) null, new com.appodeal.ads.x4.b.a(r12.f17675e, r12.f17678h, (kotlin.coroutines.Continuation<? super com.appodeal.ads.x4.b.a>) null), 2, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0049, code lost:
            r4 = r1;
            r1 = r13;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.f17673c
                java.lang.String r2 = "applicationContext"
                r3 = 0
                switch(r1) {
                    case 0: goto L_0x005c;
                    case 1: goto L_0x0054;
                    case 2: goto L_0x004c;
                    case 3: goto L_0x003c;
                    case 4: goto L_0x002f;
                    case 5: goto L_0x0023;
                    case 6: goto L_0x0014;
                    default: goto L_0x000c;
                }
            L_0x000c:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0014:
                java.lang.Object r0 = r12.f17674d
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                kotlin.ResultKt.throwOnFailure(r13)
                kotlin.Result r13 = (kotlin.Result) r13
                r13.m51unboximpl()
                r5 = r0
                goto L_0x0107
            L_0x0023:
                java.lang.Object r1 = r12.f17671a
                java.lang.Object r2 = r12.f17674d
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlin.ResultKt.throwOnFailure(r13)
                r4 = r2
                goto L_0x00dd
            L_0x002f:
                com.appodeal.ads.x4 r1 = r12.f17672b
                java.lang.Object r2 = r12.f17671a
                java.lang.Object r4 = r12.f17674d
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x00c6
            L_0x003c:
                java.lang.Object r1 = r12.f17674d
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r13)
                kotlin.Result r13 = (kotlin.Result) r13
                java.lang.Object r13 = r13.m51unboximpl()
            L_0x0049:
                r4 = r1
                r1 = r13
                goto L_0x00a2
            L_0x004c:
                java.lang.Object r1 = r12.f17674d
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x0090
            L_0x0054:
                java.lang.Object r1 = r12.f17674d
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x0076
            L_0x005c:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.f17674d
                kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
                com.appodeal.ads.x4 r1 = r12.f17675e
                android.app.Application r4 = r12.f17676f
                java.lang.String r5 = r12.f17677g
                r12.f17674d = r13
                r6 = 1
                r12.f17673c = r6
                java.lang.Object r1 = com.appodeal.ads.x4.a((com.appodeal.ads.x4) r1, (android.app.Application) r4, (java.lang.String) r5, (kotlin.coroutines.Continuation) r12)
                if (r1 != r0) goto L_0x0075
                return r0
            L_0x0075:
                r1 = r13
            L_0x0076:
                com.appodeal.ads.x4 r4 = r12.f17675e
                android.content.Context r5 = r12.f17678h
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
                com.appodeal.consent.Consent r6 = r12.i
                java.lang.Boolean r7 = r12.j
                java.lang.String r8 = r12.f17677g
                r12.f17674d = r1
                r13 = 2
                r12.f17673c = r13
                r9 = r12
                java.lang.Object r13 = com.appodeal.ads.x4.a(r4, r5, r6, r7, r8, r9)
                if (r13 != r0) goto L_0x0090
                return r0
            L_0x0090:
                com.appodeal.ads.x4 r13 = r12.f17675e
                com.appodeal.ads.networking.usecases.a r13 = r13.f17655a
                r12.f17674d = r1
                r4 = 3
                r12.f17673c = r4
                java.lang.Object r13 = r13.a((kotlin.coroutines.Continuation<? super kotlin.Result<com.appodeal.ads.networking.b>>) r12)
                if (r13 != r0) goto L_0x0049
                return r0
            L_0x00a2:
                com.appodeal.ads.x4 r13 = r12.f17675e
                android.content.Context r5 = r12.f17678h
                boolean r6 = kotlin.Result.m49isSuccessimpl(r1)
                if (r6 == 0) goto L_0x00dd
                r6 = r1
                com.appodeal.ads.networking.b r6 = (com.appodeal.ads.networking.b) r6
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
                r12.f17674d = r4
                r12.f17671a = r1
                r12.f17672b = r13
                r2 = 4
                r12.f17673c = r2
                java.lang.Object r2 = com.appodeal.ads.x4.a((com.appodeal.ads.x4) r13, (android.content.Context) r5, (com.appodeal.ads.networking.b) r6, (kotlin.coroutines.Continuation) r12)
                if (r2 != r0) goto L_0x00c2
                return r0
            L_0x00c2:
                r11 = r1
                r1 = r13
                r13 = r2
                r2 = r11
            L_0x00c6:
                java.util.List r13 = (java.util.List) r13
                com.appodeal.ads.services.c$a r1 = r1.f17656b
                r12.f17674d = r4
                r12.f17671a = r2
                r12.f17672b = r3
                r5 = 5
                r12.f17673c = r5
                java.lang.Object r13 = r1.a(r13, r12)
                if (r13 != r0) goto L_0x00dc
                return r0
            L_0x00dc:
                r1 = r2
            L_0x00dd:
                com.appodeal.ads.x4 r13 = r12.f17675e
                java.lang.Throwable r1 = kotlin.Result.m46exceptionOrNullimpl(r1)
                if (r1 != 0) goto L_0x00e6
                goto L_0x00f2
            L_0x00e6:
                com.appodeal.ads.initializing.a r13 = r13.f17658d
                com.appodeal.ads.initializing.ApdInitializationError$InternalError$SdkConfigurationError r2 = new com.appodeal.ads.initializing.ApdInitializationError$InternalError$SdkConfigurationError
                r2.<init>(r1)
                r13.a(r2)
            L_0x00f2:
                com.appodeal.ads.x4 r13 = r12.f17675e
                com.appodeal.ads.m1 r13 = r13.f17659e
                r12.f17674d = r4
                r12.f17671a = r3
                r1 = 6
                r12.f17673c = r1
                java.lang.Object r13 = r13.a(r12)
                if (r13 != r0) goto L_0x0106
                return r0
            L_0x0106:
                r5 = r4
            L_0x0107:
                kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getDefault()
                com.appodeal.ads.x4$b$a r8 = new com.appodeal.ads.x4$b$a
                com.appodeal.ads.x4 r13 = r12.f17675e
                android.content.Context r0 = r12.f17678h
                r8.<init>(r13, r0, r3)
                r7 = 0
                r9 = 2
                r10 = 0
                kotlinx.coroutines.Job r13 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r5, r6, r7, r8, r9, r10)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.x4.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public x4(com.appodeal.ads.networking.usecases.a aVar, c.a aVar2, a3 a3Var, com.appodeal.ads.initializing.b bVar, m1 m1Var, com.appodeal.ads.utils.tracker.b bVar2, d5 d5Var, c cVar, o oVar, n nVar) {
        Intrinsics.checkNotNullParameter(aVar, "getConfig");
        Intrinsics.checkNotNullParameter(aVar2, "servicesSolutionInitializer");
        Intrinsics.checkNotNullParameter(a3Var, "registerServices");
        Intrinsics.checkNotNullParameter(bVar, "errorContainer");
        Intrinsics.checkNotNullParameter(m1Var, "initRequest");
        Intrinsics.checkNotNullParameter(bVar2, "memoryTracker");
        Intrinsics.checkNotNullParameter(d5Var, "sessionTimeTracker");
        Intrinsics.checkNotNullParameter(cVar, "adLifecycleTracker");
        Intrinsics.checkNotNullParameter(oVar, "keyValueStorage");
        Intrinsics.checkNotNullParameter(nVar, "keyValueStorageInitializer");
        this.f17655a = aVar;
        this.f17656b = aVar2;
        this.f17657c = a3Var;
        this.f17658d = bVar;
        this.f17659e = m1Var;
        this.f17660f = bVar2;
        this.f17661g = d5Var;
        this.f17662h = cVar;
        this.i = oVar;
        this.j = nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(com.appodeal.ads.x4 r5, android.content.Context r6, com.appodeal.consent.Consent r7, java.lang.Boolean r8, java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r5.getClass()
            boolean r0 = r10 instanceof com.appodeal.ads.u4
            if (r0 == 0) goto L_0x0016
            r0 = r10
            com.appodeal.ads.u4 r0 = (com.appodeal.ads.u4) r0
            int r1 = r0.f17458g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f17458g = r1
            goto L_0x001b
        L_0x0016:
            com.appodeal.ads.u4 r0 = new com.appodeal.ads.u4
            r0.<init>(r5, r10)
        L_0x001b:
            java.lang.Object r5 = r0.f17456e
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f17458g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0043
            if (r1 == r3) goto L_0x0037
            if (r1 != r2) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0083
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            java.lang.String r9 = r0.f17455d
            java.lang.Boolean r8 = r0.f17454c
            com.appodeal.consent.Consent r7 = r0.f17453b
            android.content.Context r6 = r0.f17452a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0059
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r5)
            com.appodeal.advertising.AdvertisingInfo r5 = com.appodeal.advertising.AdvertisingInfo.INSTANCE
            r0.f17452a = r6
            r0.f17453b = r7
            r0.f17454c = r8
            r0.f17455d = r9
            r0.f17458g = r3
            java.lang.Object r5 = r5.getAdvertisingProfile(r6, r0)
            if (r5 != r10) goto L_0x0059
            goto L_0x0085
        L_0x0059:
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r5 = (com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile) r5
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r3 = "AdvertisingProfile"
            java.lang.String r4 = "Extract"
            com.appodeal.ads.utils.Log.log((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r1)
            com.appodeal.ads.x2.a((java.lang.Boolean) r8)
            com.appodeal.ads.x2 r8 = com.appodeal.ads.x2.f17639a
            r8.getClass()
            com.appodeal.ads.x2.a((com.appodeal.consent.Consent) r7)
            r7 = 0
            r0.f17452a = r7
            r0.f17453b = r7
            r0.f17454c = r7
            r0.f17455d = r7
            r0.f17458g = r2
            java.lang.Object r5 = r8.a(r9, r6, r5, r0)
            if (r5 != r10) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
        L_0x0085:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.x4.a(com.appodeal.ads.x4, android.content.Context, com.appodeal.consent.Consent, java.lang.Boolean, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.appodeal.ads.service.ServiceError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r7 == r1) goto L_0x0103;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d4 A[EDGE_INSN: B:55:0x00d4->B:44:0x00d4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(com.appodeal.ads.x4 r4, android.content.Context r5, com.appodeal.ads.networking.b r6, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof com.appodeal.ads.v4
            if (r0 == 0) goto L_0x0016
            r0 = r7
            com.appodeal.ads.v4 r0 = (com.appodeal.ads.v4) r0
            int r1 = r0.f17612d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f17612d = r1
            goto L_0x001b
        L_0x0016:
            com.appodeal.ads.v4 r0 = new com.appodeal.ads.v4
            r0.<init>(r4, r7)
        L_0x001b:
            java.lang.Object r7 = r0.f17610b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17612d
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            com.appodeal.ads.x4 r4 = r0.f17609a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0047
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r7)
            com.appodeal.ads.a3 r7 = r4.f17657c
            r0.f17609a = r4
            r0.f17612d = r3
            java.lang.Object r7 = com.appodeal.ads.a3.a(r7, r5, r6, r0)
            if (r7 != r1) goto L_0x0047
            goto L_0x0103
        L_0x0047:
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r5 = r7.iterator()
        L_0x004d:
            boolean r6 = r5.hasNext()
            r0 = 0
            if (r6 == 0) goto L_0x00d4
            java.lang.Object r6 = r5.next()
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r1 = r6.component1()
            com.appodeal.ads.modules.common.internal.service.ServiceVariant r1 = (com.appodeal.ads.modules.common.internal.service.ServiceVariant) r1
            java.lang.Object r6 = r6.component2()
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.m51unboximpl()
            boolean r2 = kotlin.Result.m48isFailureimpl(r6)
            if (r2 == 0) goto L_0x004d
            java.lang.Throwable r6 = kotlin.Result.m46exceptionOrNullimpl(r6)
            if (r6 == 0) goto L_0x004d
            boolean r2 = r6 instanceof com.appodeal.ads.service.ServiceError
            if (r2 == 0) goto L_0x007d
            r0 = r6
            com.appodeal.ads.service.ServiceError r0 = (com.appodeal.ads.service.ServiceError) r0
        L_0x007d:
            com.appodeal.ads.service.ServiceError$Adjust$NoAppToken r2 = com.appodeal.ads.service.ServiceError.Adjust.NoAppToken.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0088
            com.appodeal.ads.initializing.ApdInitializationError$NonCritical$AdjustNotInitialized$NoAppToken r6 = com.appodeal.ads.initializing.ApdInitializationError.NonCritical.AdjustNotInitialized.NoAppToken.INSTANCE
            goto L_0x00cd
        L_0x0088:
            com.appodeal.ads.service.ServiceError$Adjust$NoEnvironment r2 = com.appodeal.ads.service.ServiceError.Adjust.NoEnvironment.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0093
            com.appodeal.ads.initializing.ApdInitializationError$NonCritical$AdjustNotInitialized$NoEnvironment r6 = com.appodeal.ads.initializing.ApdInitializationError.NonCritical.AdjustNotInitialized.NoEnvironment.INSTANCE
            goto L_0x00cd
        L_0x0093:
            com.appodeal.ads.service.ServiceError$Appsflyer$NoAppIdProvided r2 = com.appodeal.ads.service.ServiceError.Appsflyer.NoAppIdProvided.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x009e
            com.appodeal.ads.initializing.ApdInitializationError$NonCritical$AppsflyerNotInitialized$NoAppIdProvided r6 = com.appodeal.ads.initializing.ApdInitializationError.NonCritical.AppsflyerNotInitialized.NoAppIdProvided.INSTANCE
            goto L_0x00cd
        L_0x009e:
            com.appodeal.ads.service.ServiceError$Appsflyer$NoDevKeyProvided r2 = com.appodeal.ads.service.ServiceError.Appsflyer.NoDevKeyProvided.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x00a9
            com.appodeal.ads.initializing.ApdInitializationError$NonCritical$AppsflyerNotInitialized$NoDevKeyProvided r6 = com.appodeal.ads.initializing.ApdInitializationError.NonCritical.AppsflyerNotInitialized.NoDevKeyProvided.INSTANCE
            goto L_0x00cd
        L_0x00a9:
            com.appodeal.ads.service.ServiceError$FacebookAnalytics$AppIdIsNotOverridden r2 = com.appodeal.ads.service.ServiceError.FacebookAnalytics.AppIdIsNotOverridden.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x00b4
            com.appodeal.ads.initializing.ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized$AppIdIsNotOverridden r6 = com.appodeal.ads.initializing.ApdInitializationError.NonCritical.FacebookAnalyticsNotInitialized.AppIdIsNotOverridden.INSTANCE
            goto L_0x00cd
        L_0x00b4:
            com.appodeal.ads.service.ServiceError$FacebookAnalytics$ClientTokenIsNotOverridden r2 = com.appodeal.ads.service.ServiceError.FacebookAnalytics.ClientTokenIsNotOverridden.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x00bf
            com.appodeal.ads.initializing.ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized$ClientTokenIsNotOverridden r6 = com.appodeal.ads.initializing.ApdInitializationError.NonCritical.FacebookAnalyticsNotInitialized.ClientTokenIsNotOverridden.INSTANCE
            goto L_0x00cd
        L_0x00bf:
            com.appodeal.ads.initializing.ApdInitializationError$NonCritical$OtherError r0 = new com.appodeal.ads.initializing.ApdInitializationError$NonCritical$OtherError
            java.lang.String r1 = r1.getServiceName()
            java.lang.String r6 = r6.getMessage()
            r0.<init>(r1, r6)
            r6 = r0
        L_0x00cd:
            com.appodeal.ads.initializing.a r0 = r4.f17658d
            r0.a(r6)
            goto L_0x004d
        L_0x00d4:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r7.iterator()
        L_0x00dd:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0103
            java.lang.Object r5 = r4.next()
            kotlin.Pair r5 = (kotlin.Pair) r5
            java.lang.Object r5 = r5.getSecond()
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.m51unboximpl()
            boolean r6 = kotlin.Result.m48isFailureimpl(r5)
            if (r6 == 0) goto L_0x00fa
            r5 = r0
        L_0x00fa:
            com.appodeal.ads.modules.common.internal.service.Service r5 = (com.appodeal.ads.modules.common.internal.service.Service) r5
            if (r5 != 0) goto L_0x00ff
            goto L_0x00dd
        L_0x00ff:
            r1.add(r5)
            goto L_0x00dd
        L_0x0103:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.x4.a(com.appodeal.ads.x4, android.content.Context, com.appodeal.ads.networking.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(com.appodeal.ads.x4 r5, android.content.Context r6, kotlin.coroutines.Continuation r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.appodeal.ads.w4
            if (r0 == 0) goto L_0x0016
            r0 = r7
            com.appodeal.ads.w4 r0 = (com.appodeal.ads.w4) r0
            int r1 = r0.f17625d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f17625d = r1
            goto L_0x001b
        L_0x0016:
            com.appodeal.ads.w4 r0 = new com.appodeal.ads.w4
            r0.<init>(r5, r7)
        L_0x001b:
            java.lang.Object r7 = r0.f17623b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17625d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x006c
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            android.content.Context r6 = r0.f17622a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004d
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r7)
            com.appodeal.ads.storage.a r5 = r5.i
            r0.f17622a = r6
            r0.f17625d = r4
            java.lang.Object r7 = r5.a((com.appodeal.ads.w4) r0)
            if (r7 != r1) goto L_0x004d
            goto L_0x006e
        L_0x004d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            if (r5 != 0) goto L_0x006c
            com.appodeal.ads.k0 r5 = com.appodeal.ads.k0.f16502a
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r7 = "applicationContext.packageName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r7 = 0
            r0.f17622a = r7
            r0.f17625d = r3
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.x4.a(com.appodeal.ads.x4, android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e3 A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e5 A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0115 A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0117 A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0133 A[Catch:{ Exception -> 0x022f }, LOOP:0: B:38:0x0131->B:39:0x0133, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017c A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x017e A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0190 A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0191 A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ae A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01b1 A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01d0 A[SYNTHETIC, Splitter:B:62:0x01d0] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01f3 A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(com.appodeal.ads.x4 r17, android.app.Application r18, java.lang.String r19, kotlin.coroutines.Continuation r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "Initialize"
            java.lang.String r5 = "SDK-Public"
            r17.getClass()
            boolean r6 = r3 instanceof com.appodeal.ads.y4
            if (r6 == 0) goto L_0x0022
            r6 = r3
            com.appodeal.ads.y4 r6 = (com.appodeal.ads.y4) r6
            int r7 = r6.i
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x0022
            int r7 = r7 - r8
            r6.i = r7
            goto L_0x0027
        L_0x0022:
            com.appodeal.ads.y4 r6 = new com.appodeal.ads.y4
            r6.<init>(r0, r3)
        L_0x0027:
            java.lang.Object r3 = r6.f17736g
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r8 = r6.i
            java.lang.String r9 = "context"
            r10 = 0
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            if (r8 == 0) goto L_0x008e
            if (r8 == r13) goto L_0x0075
            if (r8 == r12) goto L_0x0057
            if (r8 != r11) goto L_0x004f
            java.lang.Object r0 = r6.f17732c
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r6.f17731b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.f17730a
            android.app.Application r2 = (android.app.Application) r2
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ Exception -> 0x022f }
            goto L_0x0119
        L_0x004f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0057:
            java.lang.String r0 = r6.f17735f
            com.appodeal.ads.modules.libs.network.AppodealEndpoints r1 = r6.f17734e
            android.content.Context r2 = r6.f17733d
            java.lang.Object r8 = r6.f17732c
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r12 = r6.f17731b
            android.app.Application r12 = (android.app.Application) r12
            java.lang.Object r13 = r6.f17730a
            com.appodeal.ads.x4 r13 = (com.appodeal.ads.x4) r13
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ Exception -> 0x022f }
            r16 = r13
            r13 = r0
            r0 = r2
            r2 = r8
            r8 = r16
            goto L_0x00ed
        L_0x0075:
            android.content.Context r0 = r6.f17733d
            java.lang.Object r1 = r6.f17732c
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.f17731b
            android.app.Application r2 = (android.app.Application) r2
            java.lang.Object r8 = r6.f17730a
            com.appodeal.ads.x4 r8 = (com.appodeal.ads.x4) r8
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ Exception -> 0x022f }
            r3 = r0
            r0 = r8
            r16 = r2
            r2 = r1
            r1 = r16
            goto L_0x00b8
        L_0x008e:
            kotlin.ResultKt.throwOnFailure(r3)
            com.appodeal.ads.utils.tracker.a r3 = r0.f17660f     // Catch:{ Exception -> 0x022f }
            r3.a(r1)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.c5 r3 = r0.f17661g     // Catch:{ Exception -> 0x022f }
            r3.a()     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.b r3 = r0.f17662h     // Catch:{ Exception -> 0x022f }
            r3.a()     // Catch:{ Exception -> 0x022f }
            android.content.Context r3 = r18.getApplicationContext()     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.storage.a r8 = r0.i     // Catch:{ Exception -> 0x022f }
            r6.f17730a = r0     // Catch:{ Exception -> 0x022f }
            r6.f17731b = r1     // Catch:{ Exception -> 0x022f }
            r6.f17732c = r2     // Catch:{ Exception -> 0x022f }
            r6.f17733d = r3     // Catch:{ Exception -> 0x022f }
            r6.i = r13     // Catch:{ Exception -> 0x022f }
            java.lang.Object r8 = r8.a(r2, r6)     // Catch:{ Exception -> 0x022f }
            if (r8 != r7) goto L_0x00b8
            goto L_0x0241
        L_0x00b8:
            com.appodeal.ads.modules.libs.network.NetworkStatus r8 = com.appodeal.ads.modules.libs.network.NetworkStatus.INSTANCE     // Catch:{ Exception -> 0x022f }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r9)     // Catch:{ Exception -> 0x022f }
            r8.init(r3)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.modules.libs.network.AppodealEndpoints r8 = com.appodeal.ads.modules.libs.network.AppodealEndpoints.INSTANCE     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.r0 r13 = com.appodeal.ads.r0.f17085a     // Catch:{ Exception -> 0x022f }
            java.lang.String r13 = com.appodeal.ads.c1.a()     // Catch:{ Exception -> 0x022f }
            java.lang.String r15 = "AppodealSettings.actualHost ?: Debug.getHost()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r15)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.r0 r15 = com.appodeal.ads.r0.f17085a     // Catch:{ Exception -> 0x022f }
            r6.f17730a = r0     // Catch:{ Exception -> 0x022f }
            r6.f17731b = r1     // Catch:{ Exception -> 0x022f }
            r6.f17732c = r2     // Catch:{ Exception -> 0x022f }
            r6.f17733d = r3     // Catch:{ Exception -> 0x022f }
            r6.f17734e = r8     // Catch:{ Exception -> 0x022f }
            r6.f17735f = r13     // Catch:{ Exception -> 0x022f }
            r6.i = r12     // Catch:{ Exception -> 0x022f }
            java.lang.Object r12 = r15.a((kotlin.coroutines.Continuation<? super java.util.Set<java.lang.String>>) r6)     // Catch:{ Exception -> 0x022f }
            if (r12 != r7) goto L_0x00e5
            goto L_0x0241
        L_0x00e5:
            r16 = r8
            r8 = r0
            r0 = r3
            r3 = r12
            r12 = r1
            r1 = r16
        L_0x00ed:
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ Exception -> 0x022f }
            r1.init(r13, r3)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.a5.a(r0)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.x r1 = com.appodeal.ads.q4.m()     // Catch:{ Exception -> 0x022f }
            r1.n()     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.c1.a(r0)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.storage.a r1 = r8.i     // Catch:{ Exception -> 0x022f }
            r6.f17730a = r12     // Catch:{ Exception -> 0x022f }
            r6.f17731b = r2     // Catch:{ Exception -> 0x022f }
            r6.f17732c = r0     // Catch:{ Exception -> 0x022f }
            r6.f17733d = r14     // Catch:{ Exception -> 0x022f }
            r6.f17734e = r14     // Catch:{ Exception -> 0x022f }
            r6.f17735f = r14     // Catch:{ Exception -> 0x022f }
            r6.i = r11     // Catch:{ Exception -> 0x022f }
            java.lang.Object r1 = r1.a((com.appodeal.ads.y4) r6)     // Catch:{ Exception -> 0x022f }
            if (r1 != r7) goto L_0x0117
            goto L_0x0241
        L_0x0117:
            r1 = r2
            r2 = r12
        L_0x0119:
            com.appodeal.ads.utils.c.c(r0)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.c.a((android.content.Context) r0)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.c.b(r0)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.f.a((android.content.Context) r0)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.campaign_frequency.b.a()     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.segments.h.a()     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.app.b[] r3 = com.appodeal.ads.utils.app.b.values()     // Catch:{ Exception -> 0x022f }
            int r6 = r3.length     // Catch:{ Exception -> 0x022f }
            r7 = 0
        L_0x0131:
            if (r7 >= r6) goto L_0x013e
            r8 = r3[r7]     // Catch:{ Exception -> 0x022f }
            int r7 = r7 + 1
            r2.registerActivityLifecycleCallbacks(r8)     // Catch:{ Exception -> 0x022f }
            r2.registerComponentCallbacks(r8)     // Catch:{ Exception -> 0x022f }
            goto L_0x0131
        L_0x013e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022f }
            r2.<init>()     // Catch:{ Exception -> 0x022f }
            r3 = 118(0x76, float:1.65E-43)
            r2.append(r3)     // Catch:{ Exception -> 0x022f }
            java.lang.String r3 = com.appodeal.ads.modules.common.internal.Constants.SDK_VERSION     // Catch:{ Exception -> 0x022f }
            r2.append(r3)     // Catch:{ Exception -> 0x022f }
            r3 = 47
            r2.append(r3)     // Catch:{ Exception -> 0x022f }
            java.lang.String r3 = "ddMMyy"
            java.util.Date r6 = com.appodeal.ads.modules.common.internal.Constants.BUILD_DATE     // Catch:{ Exception -> 0x022f }
            java.lang.CharSequence r3 = android.text.format.DateFormat.format(r3, r6)     // Catch:{ Exception -> 0x022f }
            r2.append(r3)     // Catch:{ Exception -> 0x022f }
            java.lang.String r3 = " initialized, appKey: "
            r2.append(r3)     // Catch:{ Exception -> 0x022f }
            r2.append(r1)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = ", package name: "
            r2.append(r1)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ Exception -> 0x022f }
            r2.append(r1)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = ", consent: "
            r2.append(r1)     // Catch:{ Exception -> 0x022f }
            java.lang.Boolean r1 = com.appodeal.ads.x2.c()     // Catch:{ Exception -> 0x022f }
            if (r1 != 0) goto L_0x017e
            r1 = r14
            goto L_0x0182
        L_0x017e:
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x022f }
        L_0x0182:
            r2.append(r1)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = ", manager consent: "
            r2.append(r1)     // Catch:{ Exception -> 0x022f }
            com.appodeal.consent.Consent r1 = com.appodeal.ads.x2.d()     // Catch:{ Exception -> 0x022f }
            if (r1 != 0) goto L_0x0191
            goto L_0x019c
        L_0x0191:
            com.appodeal.consent.Consent$Status r1 = r1.getStatus()     // Catch:{ Exception -> 0x022f }
            if (r1 != 0) goto L_0x0198
            goto L_0x019c
        L_0x0198:
            java.lang.String r14 = r1.name()     // Catch:{ Exception -> 0x022f }
        L_0x019c:
            r2.append(r14)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.Log.log((java.lang.String) r5, (java.lang.String) r4, (java.lang.String) r1)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = "Current device is: "
            boolean r2 = com.appodeal.ads.f1.l()     // Catch:{ Exception -> 0x022f }
            if (r2 == 0) goto L_0x01b1
            java.lang.String r2 = "Emulator"
            goto L_0x01b3
        L_0x01b1:
            java.lang.String r2 = "Real Device"
        L_0x01b3:
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.Log.log((java.lang.String) r5, (java.lang.String) r4, (java.lang.String) r1)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = com.appodeal.ads.q4.h()     // Catch:{ Exception -> 0x022f }
            if (r1 == 0) goto L_0x0213
            java.lang.String r1 = com.appodeal.ads.q4.j()     // Catch:{ Exception -> 0x022f }
            if (r1 == 0) goto L_0x0213
            java.lang.String r1 = com.appodeal.ads.q4.g()     // Catch:{ Exception -> 0x022f }
            java.lang.String r2 = " v"
            java.lang.String r3 = "For "
            if (r1 == 0) goto L_0x01f3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022f }
            r1.<init>()     // Catch:{ Exception -> 0x022f }
            r1.append(r3)     // Catch:{ Exception -> 0x022f }
            java.lang.String r3 = com.appodeal.ads.q4.h()     // Catch:{ Exception -> 0x022f }
            r1.append(r3)     // Catch:{ Exception -> 0x022f }
            r1.append(r2)     // Catch:{ Exception -> 0x022f }
            java.lang.String r2 = com.appodeal.ads.q4.j()     // Catch:{ Exception -> 0x022f }
            r1.append(r2)     // Catch:{ Exception -> 0x022f }
            java.lang.String r2 = " ev"
            r1.append(r2)     // Catch:{ Exception -> 0x022f }
            java.lang.String r2 = com.appodeal.ads.q4.g()     // Catch:{ Exception -> 0x022f }
            goto L_0x0209
        L_0x01f3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022f }
            r1.<init>()     // Catch:{ Exception -> 0x022f }
            r1.append(r3)     // Catch:{ Exception -> 0x022f }
            java.lang.String r3 = com.appodeal.ads.q4.h()     // Catch:{ Exception -> 0x022f }
            r1.append(r3)     // Catch:{ Exception -> 0x022f }
            r1.append(r2)     // Catch:{ Exception -> 0x022f }
            java.lang.String r2 = com.appodeal.ads.q4.j()     // Catch:{ Exception -> 0x022f }
        L_0x0209:
            r1.append(r2)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.Log.log((java.lang.String) r5, (java.lang.String) r4, (java.lang.String) r1)     // Catch:{ Exception -> 0x022f }
        L_0x0213:
            java.lang.String r1 = "Google play services version: "
            java.lang.String r2 = com.appodeal.ads.n5.e(r0)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.Log.log((java.lang.String) r5, (java.lang.String) r4, (java.lang.String) r1)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.AppodealPackageAddedReceiver r1 = new com.appodeal.ads.AppodealPackageAddedReceiver     // Catch:{ Exception -> 0x022f }
            r1.<init>()     // Catch:{ Exception -> 0x022f }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r9)     // Catch:{ Exception -> 0x022f }
            r1.register(r0)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.i.d(r0)     // Catch:{ Exception -> 0x022f }
            goto L_0x023f
        L_0x022f:
            r0 = move-exception
            com.appodeal.ads.i1 r1 = com.appodeal.ads.g1.f16413a
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x023a
            java.lang.String r0 = ""
        L_0x023a:
            r1.b(r0)
            com.appodeal.ads.q4.f17048b = r10
        L_0x023f:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L_0x0241:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.x4.a(com.appodeal.ads.x4, android.app.Application, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(android.app.Application r17, java.lang.String r18, com.appodeal.consent.Consent r19, java.lang.Boolean r20, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<? extends com.appodeal.ads.initializing.ApdInitializationError>>> r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r21
            boolean r2 = r1 instanceof com.appodeal.ads.x4.a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.appodeal.ads.x4$a r2 = (com.appodeal.ads.x4.a) r2
            int r3 = r2.i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.i = r3
            goto L_0x001c
        L_0x0017:
            com.appodeal.ads.x4$a r2 = new com.appodeal.ads.x4$a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f17669g
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.i
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0052
            if (r4 == r6) goto L_0x003b
            if (r4 != r5) goto L_0x0033
            com.appodeal.ads.x4 r2 = r2.f17663a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00a6
        L_0x0033:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            android.content.Context r4 = r2.f17668f
            java.lang.Boolean r6 = r2.f17667e
            com.appodeal.consent.Consent r7 = r2.f17666d
            java.lang.String r8 = r2.f17665c
            android.app.Application r9 = r2.f17664b
            com.appodeal.ads.x4 r10 = r2.f17663a
            kotlin.ResultKt.throwOnFailure(r1)
            r12 = r6
            r11 = r7
            r1 = r10
            r10 = r4
            r15 = r9
            r9 = r8
            r8 = r15
            goto L_0x0083
        L_0x0052:
            kotlin.ResultKt.throwOnFailure(r1)
            android.content.Context r4 = r17.getApplicationContext()
            com.appodeal.ads.i1 r1 = com.appodeal.ads.g1.f16413a
            r1.a()
            com.appodeal.ads.storage.a$a r1 = r0.j
            r2.f17663a = r0
            r7 = r17
            r2.f17664b = r7
            r8 = r18
            r2.f17665c = r8
            r9 = r19
            r2.f17666d = r9
            r10 = r20
            r2.f17667e = r10
            r2.f17668f = r4
            r2.i = r6
            java.lang.Object r1 = r1.a(r2)
            if (r1 != r3) goto L_0x007d
            return r3
        L_0x007d:
            r1 = r0
            r11 = r9
            r12 = r10
            r10 = r4
            r9 = r8
            r8 = r7
        L_0x0083:
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            com.appodeal.ads.x4$b r14 = new com.appodeal.ads.x4$b
            r13 = 0
            r6 = r14
            r7 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r2.f17663a = r1
            r6 = 0
            r2.f17664b = r6
            r2.f17665c = r6
            r2.f17666d = r6
            r2.f17667e = r6
            r2.f17668f = r6
            r2.i = r5
            java.lang.Object r2 = kotlinx.coroutines.BuildersKt.withContext(r4, r14, r2)
            if (r2 != r3) goto L_0x00a5
            return r3
        L_0x00a5:
            r2 = r1
        L_0x00a6:
            com.appodeal.ads.initializing.a r1 = r2.f17658d
            java.util.ArrayList r1 = r1.a()
            java.util.List r1 = kotlin.collections.CollectionsKt.toList(r1)
            com.appodeal.ads.initializing.a r3 = r2.f17658d
            java.util.ArrayList r3 = r3.a()
            java.util.Iterator r3 = r3.iterator()
        L_0x00ba:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x010c
            java.lang.Object r4 = r3.next()
            com.appodeal.ads.initializing.ApdInitializationError r4 = (com.appodeal.ads.initializing.ApdInitializationError) r4
            boolean r5 = r4 instanceof com.appodeal.ads.initializing.ApdInitializationError.Critical
            if (r5 == 0) goto L_0x00d1
            com.appodeal.ads.initializing.ApdInitializationError$Critical r4 = (com.appodeal.ads.initializing.ApdInitializationError.Critical) r4
            java.lang.String r4 = r4.getDescription()
            goto L_0x00fc
        L_0x00d1:
            boolean r5 = r4 instanceof com.appodeal.ads.initializing.ApdInitializationError.NonCritical
            if (r5 == 0) goto L_0x00f4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.appodeal.ads.initializing.ApdInitializationError$NonCritical r4 = (com.appodeal.ads.initializing.ApdInitializationError.NonCritical) r4
            java.lang.String r6 = r4.getComponentName()
            r5.append(r6)
            java.lang.String r6 = ": "
            r5.append(r6)
            java.lang.String r4 = r4.getDescription()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            goto L_0x00fc
        L_0x00f4:
            boolean r5 = r4 instanceof com.appodeal.ads.initializing.ApdInitializationError.InternalError
            if (r5 == 0) goto L_0x0106
            java.lang.String r4 = r4.getMessage()
        L_0x00fc:
            com.appodeal.ads.i1 r5 = com.appodeal.ads.g1.f16413a
            if (r4 != 0) goto L_0x0102
            java.lang.String r4 = ""
        L_0x0102:
            r5.b(r4)
            goto L_0x00ba
        L_0x0106:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x010c:
            com.appodeal.ads.initializing.a r2 = r2.f17658d
            r2.clear()
            java.lang.Object r1 = com.appodeal.ads.modules.common.internal.ext.ResultExtKt.asSuccess(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.x4.a(android.app.Application, java.lang.String, com.appodeal.consent.Consent, java.lang.Boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
