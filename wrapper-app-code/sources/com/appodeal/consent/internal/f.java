package com.appodeal.consent.internal;

import android.content.Context;
import com.appodeal.consent.Consent;
import com.appodeal.consent.ConsentManagerError;
import com.appodeal.consent.IConsentInfoUpdateListener;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(c = "com.appodeal.consent.internal.InternalManager$requestConsentInfoUpdate$1", f = "InternalManager.kt", l = {41, 51, 58, 62, 74, 79, 87}, m = "invokeSuspend")
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public Object f17852a;

    /* renamed from: b  reason: collision with root package name */
    public Object f17853b;

    /* renamed from: c  reason: collision with root package name */
    public String f17854c;

    /* renamed from: d  reason: collision with root package name */
    public Consent f17855d;

    /* renamed from: e  reason: collision with root package name */
    public int f17856e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f17857f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Context f17858g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Consent f17859h;
    public final /* synthetic */ IConsentInfoUpdateListener i;

    @DebugMetadata(c = "com.appodeal.consent.internal.InternalManager$requestConsentInfoUpdate$1$1", f = "InternalManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IConsentInfoUpdateListener f17860a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(IConsentInfoUpdateListener iConsentInfoUpdateListener, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f17860a = iConsentInfoUpdateListener;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f17860a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f17860a.onFailedToUpdateConsentInfo(new ConsentManagerError.LoadingError("Appodeal APP KEY is empty"));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.consent.internal.InternalManager$requestConsentInfoUpdate$1$2$1", f = "InternalManager.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IConsentInfoUpdateListener f17861a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(IConsentInfoUpdateListener iConsentInfoUpdateListener, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f17861a = iConsentInfoUpdateListener;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f17861a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f17861a.onFailedToUpdateConsentInfo(new ConsentManagerError.LoadingError("response is error"));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.consent.internal.InternalManager$requestConsentInfoUpdate$1$2$3", f = "InternalManager.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IConsentInfoUpdateListener f17862a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(IConsentInfoUpdateListener iConsentInfoUpdateListener, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f17862a = iConsentInfoUpdateListener;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f17862a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IConsentInfoUpdateListener iConsentInfoUpdateListener = this.f17862a;
            Lazy lazy = g.f17867a;
            iConsentInfoUpdateListener.onConsentInfoUpdated(g.b());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.consent.internal.InternalManager$requestConsentInfoUpdate$1$2$4", f = "InternalManager.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IConsentInfoUpdateListener f17863a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Throwable f17864b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(IConsentInfoUpdateListener iConsentInfoUpdateListener, Throwable th, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f17863a = iConsentInfoUpdateListener;
            this.f17864b = th;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f17863a, this.f17864b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IConsentInfoUpdateListener iConsentInfoUpdateListener = this.f17863a;
            String message = this.f17864b.getMessage();
            if (message == null) {
                message = "";
            }
            iConsentInfoUpdateListener.onFailedToUpdateConsentInfo(new ConsentManagerError.LoadingError(message));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.consent.internal.InternalManager$requestConsentInfoUpdate$1$3$1", f = "InternalManager.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IConsentInfoUpdateListener f17865a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Throwable f17866b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(IConsentInfoUpdateListener iConsentInfoUpdateListener, Throwable th, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f17865a = iConsentInfoUpdateListener;
            this.f17866b = th;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f17865a, this.f17866b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IConsentInfoUpdateListener iConsentInfoUpdateListener = this.f17865a;
            String message = this.f17866b.getMessage();
            if (message == null) {
                message = "";
            }
            iConsentInfoUpdateListener.onFailedToUpdateConsentInfo(new ConsentManagerError.LoadingError(message));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(String str, Context context, Consent consent, IConsentInfoUpdateListener iConsentInfoUpdateListener, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f17857f = str;
        this.f17858g = context;
        this.f17859h = consent;
        this.i = iConsentInfoUpdateListener;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new f(this.f17857f, this.f17858g, this.f17859h, this.i, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r13 = r1;
        r1 = r15;
        r15 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        r8 = com.appodeal.consent.ConsentManager.getExtraData();
        r9 = android.os.Build.MODEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "MODEL");
        r10 = android.os.Build.MANUFACTURER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, "MANUFACTURER");
        r11 = android.os.Build.VERSION.RELEASE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, "RELEASE");
        r12 = java.util.Locale.getDefault().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, "getDefault().toString()");
        r3 = new com.appodeal.consent.internal.a(r4, r5, r6, (com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile) r15, r8, r9, r10, r11, r12);
        r3 = com.appodeal.consent.internal.c.f17826a;
        r14.f17852a = r1;
        r14.f17853b = null;
        r14.f17854c = null;
        r14.f17855d = null;
        r14.f17856e = 3;
        r15 = com.appodeal.consent.internal.c.f17826a.a(r3, "https://a.appbaqend.com/consent/check", r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e2, code lost:
        if (r15 != r0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e4, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e5, code lost:
        r3 = r14.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00eb, code lost:
        if (kotlin.Result.m49isSuccessimpl(r1) == false) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ed, code lost:
        r4 = (org.json.JSONObject) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f0, code lost:
        if (r4 != null) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r15 = kotlinx.coroutines.Dispatchers.getMain();
        r4 = new com.appodeal.consent.internal.f.b(r3, (kotlin.coroutines.Continuation<? super com.appodeal.consent.internal.f.b>) null);
        r14.f17852a = r1;
        r14.f17853b = r3;
        r14.f17856e = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0106, code lost:
        if (kotlinx.coroutines.BuildersKt.withContext(r15, r4, r14) != r0) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0108, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0109, code lost:
        r5 = com.appodeal.consent.internal.g.f17867a;
        com.appodeal.consent.internal.g.a().getClass();
        r4 = com.appodeal.consent.internal.k.a(r4);
        r5 = r4.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011a, code lost:
        if (r5 != null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011d, code lost:
        com.appodeal.consent.internal.g.a(r5);
        com.appodeal.consent.internal.b.a(com.appodeal.consent.internal.g.b(), r15);
        com.appodeal.consent.internal.b.b(com.appodeal.consent.internal.g.b(), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012e, code lost:
        r15 = r4.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0132, code lost:
        if (r15 != null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0134, code lost:
        r15 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0136, code lost:
        com.appodeal.consent.internal.g.a(r15);
        r15 = r4.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013d, code lost:
        if (r15 != null) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013f, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0141, code lost:
        r15 = r15.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0145, code lost:
        com.appodeal.consent.internal.g.a(r15);
        r15 = kotlinx.coroutines.Dispatchers.getMain();
        r4 = new com.appodeal.consent.internal.f.c(r3, (kotlin.coroutines.Continuation<? super com.appodeal.consent.internal.f.c>) null);
        r14.f17852a = r1;
        r14.f17853b = r3;
        r14.f17856e = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015c, code lost:
        if (kotlinx.coroutines.BuildersKt.withContext(r15, r4, r14) != r0) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x015f, code lost:
        r15 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0176 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.f17856e
            r2 = 0
            switch(r1) {
                case 0: goto L_0x0059;
                case 1: goto L_0x0055;
                case 2: goto L_0x0042;
                case 3: goto L_0x0030;
                case 4: goto L_0x001e;
                case 5: goto L_0x001e;
                case 6: goto L_0x0017;
                case 7: goto L_0x0012;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0012:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0197
        L_0x0017:
            java.lang.Object r1 = r14.f17852a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0177
        L_0x001e:
            java.lang.Object r1 = r14.f17853b
            com.appodeal.consent.IConsentInfoUpdateListener r1 = (com.appodeal.consent.IConsentInfoUpdateListener) r1
            java.lang.Object r3 = r14.f17852a
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ all -> 0x002a }
            r1 = r3
            goto L_0x0177
        L_0x002a:
            r15 = move-exception
            r13 = r3
            r3 = r1
            r1 = r13
            goto L_0x0160
        L_0x0030:
            java.lang.Object r1 = r14.f17852a
            android.content.Context r1 = (android.content.Context) r1
            kotlin.ResultKt.throwOnFailure(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.m51unboximpl()
        L_0x003d:
            r13 = r1
            r1 = r15
            r15 = r13
            goto L_0x00e5
        L_0x0042:
            com.appodeal.consent.Consent r1 = r14.f17855d
            java.lang.String r3 = r14.f17854c
            java.lang.Object r4 = r14.f17853b
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r5 = r14.f17852a
            android.content.Context r5 = (android.content.Context) r5
            kotlin.ResultKt.throwOnFailure(r15)
            r6 = r1
            r1 = r5
            r5 = r3
            goto L_0x00a2
        L_0x0055:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0079
        L_0x0059:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.String r15 = r14.f17857f
            boolean r15 = kotlin.text.StringsKt.isBlank(r15)
            if (r15 == 0) goto L_0x007c
            kotlinx.coroutines.MainCoroutineDispatcher r15 = kotlinx.coroutines.Dispatchers.getMain()
            com.appodeal.consent.internal.f$a r1 = new com.appodeal.consent.internal.f$a
            com.appodeal.consent.IConsentInfoUpdateListener r3 = r14.i
            r1.<init>(r3, r2)
            r2 = 1
            r14.f17856e = r2
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r15, r1, r14)
            if (r15 != r0) goto L_0x0079
            return r0
        L_0x0079:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        L_0x007c:
            android.content.Context r15 = r14.f17858g
            android.content.Context r4 = r15.getApplicationContext()
            java.lang.String r15 = "context.applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r15)
            java.lang.String r3 = r14.f17857f
            com.appodeal.consent.Consent r1 = r14.f17859h
            com.appodeal.advertising.AdvertisingInfo r15 = com.appodeal.advertising.AdvertisingInfo.INSTANCE
            r14.f17852a = r4
            r14.f17853b = r4
            r14.f17854c = r3
            r14.f17855d = r1
            r5 = 2
            r14.f17856e = r5
            java.lang.Object r15 = r15.getAdvertisingProfile(r4, r14)
            if (r15 != r0) goto L_0x009f
            return r0
        L_0x009f:
            r6 = r1
            r5 = r3
            r1 = r4
        L_0x00a2:
            r7 = r15
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r7 = (com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile) r7
            java.util.Map r8 = com.appodeal.consent.ConsentManager.getExtraData()
            java.lang.String r9 = android.os.Build.MODEL
            java.lang.String r15 = "MODEL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r15)
            java.lang.String r10 = android.os.Build.MANUFACTURER
            java.lang.String r15 = "MANUFACTURER"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r15)
            java.lang.String r11 = android.os.Build.VERSION.RELEASE
            java.lang.String r15 = "RELEASE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r15)
            java.util.Locale r15 = java.util.Locale.getDefault()
            java.lang.String r12 = r15.toString()
            java.lang.String r15 = "getDefault().toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r15)
            com.appodeal.consent.internal.a r15 = new com.appodeal.consent.internal.a
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.appodeal.consent.internal.c r3 = com.appodeal.consent.internal.c.f17826a
            r14.f17852a = r1
            r14.f17853b = r2
            r14.f17854c = r2
            r14.f17855d = r2
            r3 = 3
            r14.f17856e = r3
            java.lang.Object r15 = com.appodeal.consent.internal.c.f17826a.a(r15, "https://a.appbaqend.com/consent/check", r14)
            if (r15 != r0) goto L_0x003d
            return r0
        L_0x00e5:
            com.appodeal.consent.IConsentInfoUpdateListener r3 = r14.i
            boolean r4 = kotlin.Result.m49isSuccessimpl(r1)
            if (r4 == 0) goto L_0x0177
            r4 = r1
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            if (r4 != 0) goto L_0x0109
            kotlinx.coroutines.MainCoroutineDispatcher r15 = kotlinx.coroutines.Dispatchers.getMain()     // Catch:{ all -> 0x015f }
            com.appodeal.consent.internal.f$b r4 = new com.appodeal.consent.internal.f$b     // Catch:{ all -> 0x015f }
            r4.<init>(r3, r2)     // Catch:{ all -> 0x015f }
            r14.f17852a = r1     // Catch:{ all -> 0x015f }
            r14.f17853b = r3     // Catch:{ all -> 0x015f }
            r5 = 4
            r14.f17856e = r5     // Catch:{ all -> 0x015f }
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r15, r4, r14)     // Catch:{ all -> 0x015f }
            if (r15 != r0) goto L_0x0177
            return r0
        L_0x0109:
            kotlin.Lazy r5 = com.appodeal.consent.internal.g.f17867a     // Catch:{ all -> 0x015f }
            com.appodeal.consent.internal.k r5 = com.appodeal.consent.internal.g.a()     // Catch:{ all -> 0x015f }
            r5.getClass()     // Catch:{ all -> 0x015f }
            com.appodeal.consent.internal.k$a r4 = com.appodeal.consent.internal.k.a(r4)     // Catch:{ all -> 0x015f }
            com.appodeal.consent.Consent r5 = r4.a()     // Catch:{ all -> 0x015f }
            if (r5 != 0) goto L_0x011d
            goto L_0x012e
        L_0x011d:
            com.appodeal.consent.internal.g.a((com.appodeal.consent.Consent) r5)     // Catch:{ all -> 0x015f }
            com.appodeal.consent.Consent r5 = com.appodeal.consent.internal.g.b()     // Catch:{ all -> 0x015f }
            com.appodeal.consent.internal.b.a((com.appodeal.consent.Consent) r5, (android.content.Context) r15)     // Catch:{ all -> 0x015f }
            com.appodeal.consent.Consent r5 = com.appodeal.consent.internal.g.b()     // Catch:{ all -> 0x015f }
            com.appodeal.consent.internal.b.b(r5, r15)     // Catch:{ all -> 0x015f }
        L_0x012e:
            java.lang.String r15 = r4.b()     // Catch:{ all -> 0x015f }
            if (r15 != 0) goto L_0x0136
            java.lang.String r15 = ""
        L_0x0136:
            com.appodeal.consent.internal.g.a((java.lang.String) r15)     // Catch:{ all -> 0x015f }
            java.lang.Boolean r15 = r4.c()     // Catch:{ all -> 0x015f }
            if (r15 != 0) goto L_0x0141
            r15 = 0
            goto L_0x0145
        L_0x0141:
            boolean r15 = r15.booleanValue()     // Catch:{ all -> 0x015f }
        L_0x0145:
            com.appodeal.consent.internal.g.a((boolean) r15)     // Catch:{ all -> 0x015f }
            kotlinx.coroutines.MainCoroutineDispatcher r15 = kotlinx.coroutines.Dispatchers.getMain()     // Catch:{ all -> 0x015f }
            com.appodeal.consent.internal.f$c r4 = new com.appodeal.consent.internal.f$c     // Catch:{ all -> 0x015f }
            r4.<init>(r3, r2)     // Catch:{ all -> 0x015f }
            r14.f17852a = r1     // Catch:{ all -> 0x015f }
            r14.f17853b = r3     // Catch:{ all -> 0x015f }
            r5 = 5
            r14.f17856e = r5     // Catch:{ all -> 0x015f }
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r15, r4, r14)     // Catch:{ all -> 0x015f }
            if (r15 != r0) goto L_0x0177
            return r0
        L_0x015f:
            r15 = move-exception
        L_0x0160:
            kotlinx.coroutines.MainCoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getMain()
            com.appodeal.consent.internal.f$d r5 = new com.appodeal.consent.internal.f$d
            r5.<init>(r3, r15, r2)
            r14.f17852a = r1
            r14.f17853b = r2
            r15 = 6
            r14.f17856e = r15
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r14)
            if (r15 != r0) goto L_0x0177
            return r0
        L_0x0177:
            com.appodeal.consent.IConsentInfoUpdateListener r15 = r14.i
            java.lang.Throwable r3 = kotlin.Result.m46exceptionOrNullimpl(r1)
            if (r3 != 0) goto L_0x0180
            goto L_0x0197
        L_0x0180:
            kotlinx.coroutines.MainCoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getMain()
            com.appodeal.consent.internal.f$e r5 = new com.appodeal.consent.internal.f$e
            r5.<init>(r15, r3, r2)
            r14.f17852a = r1
            r14.f17853b = r2
            r15 = 7
            r14.f17856e = r15
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r14)
            if (r15 != r0) goto L_0x0197
            return r0
        L_0x0197:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.internal.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
