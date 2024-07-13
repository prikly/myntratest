package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", l = {42, 46, 48, 53, 55, 60, 62, 68, 71, 74, 79, 81, 88, 90, 101, 103, 106}, m = "invokeSuspend")
/* compiled from: InitializeSDK.kt */
final class InitializeSDK$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeSDK$doWork$2(InitializeSDK initializeSDK, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initializeSDK;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        return new InitializeSDK$doWork$2(this.this$0, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((InitializeSDK$doWork$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01de, code lost:
        r9 = r1.getExperiments();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "configuration.experiments");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01eb, code lost:
        if (r9.isNativeWebViewCacheEnabled() == false) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ed, code lost:
        r9 = r8.this$0.initializeStateCreateWithRemote;
        kotlin.ResultKt.throwOnFailure(r3);
        r8.L$0 = r3;
        r8.L$1 = r1;
        r8.label = 8;
        r9 = r9.invoke(new com.unity3d.services.core.domain.task.InitializeStateCreateWithRemote.Params((com.unity3d.services.core.configuration.Configuration) r3), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020c, code lost:
        if (r9 != r0) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x020e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x020f, code lost:
        r9 = ((kotlin.Result) r9).m51unboximpl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0219, code lost:
        if (kotlin.Result.m49isSuccessimpl(r9) == false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x021b, code lost:
        r9 = r8.this$0.initializeStateComplete;
        kotlin.ResultKt.throwOnFailure(r3);
        r8.L$0 = null;
        r8.L$1 = null;
        r8.label = 9;
        r9 = r9.invoke(new com.unity3d.services.core.domain.task.InitializeStateComplete.Params((com.unity3d.services.core.configuration.Configuration) r3), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0239, code lost:
        if (r9 != r0) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x023b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x023c, code lost:
        kotlin.ResultKt.throwOnFailure(((kotlin.Result) r9).m51unboximpl());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0247, code lost:
        r4 = r8.this$0;
        r9 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(r9);
        r8.L$0 = r3;
        r8.L$1 = r1;
        r8.label = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0259, code lost:
        if (r4.handleInitializationException(r9, r8) != r0) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x025b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x025c, code lost:
        r9 = r8.this$0.initializeStateLoadCache;
        kotlin.ResultKt.throwOnFailure(r3);
        r8.L$0 = r3;
        r8.L$1 = r1;
        r8.label = 11;
        r9 = r9.invoke(new com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params((com.unity3d.services.core.configuration.Configuration) r3), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x027b, code lost:
        if (r9 != r0) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x027d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x027e, code lost:
        r9 = ((kotlin.Result) r9).m51unboximpl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0288, code lost:
        if (kotlin.Result.m48isFailureimpl(r9) == false) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x028a, code lost:
        r3 = r8.this$0;
        r4 = com.unity3d.services.core.configuration.ErrorState.LoadCache;
        r5 = kotlin.Result.m46exceptionOrNullimpl(r9);
        r8.L$0 = r9;
        r8.L$1 = null;
        r8.label = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x029e, code lost:
        if (r3.m26executeErrorStateBWLJW6A(r4, r5, r1, r8) != r0) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02a0, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02a1, code lost:
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02a2, code lost:
        r9 = kotlin.Result.m46exceptionOrNullimpl(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a6, code lost:
        if (r9 == null) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02a9, code lost:
        r9 = new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.LoadCache.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02b6, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02bb, code lost:
        if (kotlin.Result.m48isFailureimpl(r9) == false) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02bd, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02be, code lost:
        r9 = (java.lang.String) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02c0, code lost:
        if (r9 != null) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02c2, code lost:
        r1 = r8.this$0.initializeStateLoadWeb;
        kotlin.ResultKt.throwOnFailure(r3);
        r8.L$0 = r3;
        r8.L$1 = r9;
        r8.label = 13;
        r1 = r1.invoke(new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params((com.unity3d.services.core.configuration.Configuration) r3), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02e1, code lost:
        if (r1 != r0) goto L_0x02e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02e3, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02e4, code lost:
        r4 = r3;
        r3 = r9;
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02e7, code lost:
        r1 = ((kotlin.Result) r9).m51unboximpl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02f1, code lost:
        if (kotlin.Result.m48isFailureimpl(r1) == false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02f3, code lost:
        r9 = r8.this$0;
        r5 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(r1);
        r8.L$0 = r4;
        r8.L$1 = r3;
        r8.L$2 = r1;
        r8.label = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0307, code lost:
        if (r9.handleInitializationException(r5, r8) != r0) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0309, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x030a, code lost:
        r9 = r3;
        r3 = r4;
        kotlin.ResultKt.throwOnFailure(r1);
        r1 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0312, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0313, code lost:
        if (r1 == null) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0315, code lost:
        r4 = r1.getWebViewDataString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0319, code lost:
        if (r4 == null) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x031b, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x031c, code lost:
        if (r9 == null) goto L_0x039a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x031e, code lost:
        if (r1 == null) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0320, code lost:
        r1 = r1.getConfig();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0324, code lost:
        if (r1 == null) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0327, code lost:
        kotlin.ResultKt.throwOnFailure(r3);
        r1 = (com.unity3d.services.core.configuration.Configuration) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x032d, code lost:
        r8.L$0 = r3;
        r8.L$1 = null;
        r8.L$2 = null;
        r8.label = 15;
        r9 = r8.this$0.initializeStateCreate.invoke(new com.unity3d.services.core.domain.task.InitializeStateCreate.Params(r1, r9), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0348, code lost:
        if (r9 != r0) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x034a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x034b, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x034c, code lost:
        r9 = ((kotlin.Result) r9).m51unboximpl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0356, code lost:
        if (kotlin.Result.m48isFailureimpl(r9) == false) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0358, code lost:
        r3 = r8.this$0;
        r9 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(r9);
        r8.L$0 = r1;
        r8.label = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0368, code lost:
        if (r3.handleInitializationException(r9, r8) != r0) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x036a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x036b, code lost:
        r9 = r8.this$0.initializeStateComplete;
        kotlin.ResultKt.throwOnFailure(r1);
        r8.L$0 = null;
        r8.label = 17;
        r9 = r9.invoke(new com.unity3d.services.core.domain.task.InitializeStateComplete.Params((com.unity3d.services.core.configuration.Configuration) r1), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0387, code lost:
        if (r9 != r0) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0389, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x038a, code lost:
        kotlin.ResultKt.throwOnFailure(((kotlin.Result) r9).m51unboximpl());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0393, code lost:
        r9 = kotlin.Result.m44constructorimpl(kotlin.Unit.INSTANCE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03a1, code lost:
        throw new java.lang.Error();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00df, code lost:
        r9 = ((kotlin.Result) r9).m51unboximpl();
        r1 = new com.unity3d.services.core.configuration.Configuration();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ee, code lost:
        if (kotlin.Result.m48isFailureimpl(r9) == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f0, code lost:
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f1, code lost:
        r9 = (com.unity3d.services.core.configuration.Configuration) r9;
        r8.L$0 = r9;
        r8.label = 2;
        r1 = r8.this$0.initializeStateReset.invoke(new com.unity3d.services.core.domain.task.InitializeStateReset.Params(r9), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0109, code lost:
        if (r1 != r0) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010c, code lost:
        r7 = r1;
        r1 = r9;
        r9 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010f, code lost:
        r3 = ((kotlin.Result) r9).m51unboximpl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0119, code lost:
        if (kotlin.Result.m48isFailureimpl(r3) == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011b, code lost:
        r9 = r8.this$0;
        r2 = com.unity3d.services.core.configuration.ErrorState.ResetWebApp;
        r4 = kotlin.Result.m46exceptionOrNullimpl(r3);
        r8.L$0 = r3;
        r8.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012c, code lost:
        if (r9.m26executeErrorStateBWLJW6A(r2, r4, r1, r8) != r0) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012f, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0130, code lost:
        r9 = kotlin.Result.m46exceptionOrNullimpl(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0134, code lost:
        if (r9 == null) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0137, code lost:
        r9 = new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.ResetWebApp.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0144, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0145, code lost:
        r9 = r8.this$0.initializeStateInitModules;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0151, code lost:
        if (kotlin.Result.m48isFailureimpl(r3) == false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0153, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0155, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0156, code lost:
        r8.L$0 = r3;
        r8.L$1 = r1;
        r8.label = 4;
        r9 = r9.invoke(new com.unity3d.services.core.domain.task.InitializeStateInitModules.Params(r5), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0168, code lost:
        if (r9 != r0) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x016b, code lost:
        r9 = ((kotlin.Result) r9).m51unboximpl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0175, code lost:
        if (kotlin.Result.m48isFailureimpl(r9) == false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0177, code lost:
        r4 = r8.this$0;
        r5 = com.unity3d.services.core.configuration.ErrorState.InitModules;
        r3 = kotlin.Result.m46exceptionOrNullimpl(r3);
        r8.L$0 = r9;
        r8.L$1 = null;
        r8.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x018a, code lost:
        if (r4.m26executeErrorStateBWLJW6A(r5, r3, r1, r8) != r0) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x018c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x018d, code lost:
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x018e, code lost:
        r9 = kotlin.Result.m46exceptionOrNullimpl(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0192, code lost:
        if (r9 == null) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0195, code lost:
        r9 = new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.InitModules.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a2, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a3, code lost:
        r8.L$0 = r1;
        r8.L$1 = null;
        r8.label = 6;
        r9 = r8.this$0.initializeStateConfig.invoke(new com.unity3d.services.core.domain.task.InitializeStateConfig.Params(r1), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01bb, code lost:
        if (r9 != r0) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01bd, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01be, code lost:
        r3 = ((kotlin.Result) r9).m51unboximpl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c8, code lost:
        if (kotlin.Result.m48isFailureimpl(r3) == false) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ca, code lost:
        r9 = r8.this$0;
        r4 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(r3);
        r8.L$0 = r3;
        r8.L$1 = r1;
        r8.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01db, code lost:
        if (r9.handleInitializationException(r4, r8) != r0) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01dd, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 0
            switch(r1) {
                case 0: goto L_0x00b4;
                case 1: goto L_0x00b0;
                case 2: goto L_0x00a8;
                case 3: goto L_0x009c;
                case 4: goto L_0x0091;
                case 5: goto L_0x0085;
                case 6: goto L_0x007c;
                case 7: goto L_0x0071;
                case 8: goto L_0x0066;
                case 9: goto L_0x0061;
                case 10: goto L_0x0056;
                case 11: goto L_0x004b;
                case 12: goto L_0x003f;
                case 13: goto L_0x0032;
                case 14: goto L_0x0025;
                case 15: goto L_0x001e;
                case 16: goto L_0x0017;
                case 17: goto L_0x0012;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0012:
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x038a
        L_0x0017:
            java.lang.Object r1 = r8.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x036b
        L_0x001e:
            java.lang.Object r1 = r8.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x034c
        L_0x0025:
            java.lang.Object r1 = r8.L$2
            java.lang.Object r3 = r8.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r8.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x030a
        L_0x0032:
            java.lang.Object r1 = r8.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r8.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r4 = r3
            r3 = r1
            goto L_0x02e7
        L_0x003f:
            java.lang.Object r0 = r8.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r9.m51unboximpl()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x02a2
        L_0x004b:
            java.lang.Object r1 = r8.L$1
            com.unity3d.services.core.configuration.Configuration r1 = (com.unity3d.services.core.configuration.Configuration) r1
            java.lang.Object r3 = r8.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x027e
        L_0x0056:
            java.lang.Object r1 = r8.L$1
            com.unity3d.services.core.configuration.Configuration r1 = (com.unity3d.services.core.configuration.Configuration) r1
            java.lang.Object r3 = r8.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x025c
        L_0x0061:
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x023c
        L_0x0066:
            java.lang.Object r1 = r8.L$1
            com.unity3d.services.core.configuration.Configuration r1 = (com.unity3d.services.core.configuration.Configuration) r1
            java.lang.Object r3 = r8.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x020f
        L_0x0071:
            java.lang.Object r1 = r8.L$1
            com.unity3d.services.core.configuration.Configuration r1 = (com.unity3d.services.core.configuration.Configuration) r1
            java.lang.Object r3 = r8.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x01de
        L_0x007c:
            java.lang.Object r1 = r8.L$0
            com.unity3d.services.core.configuration.Configuration r1 = (com.unity3d.services.core.configuration.Configuration) r1
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x01be
        L_0x0085:
            java.lang.Object r0 = r8.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r9.m51unboximpl()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x018e
        L_0x0091:
            java.lang.Object r1 = r8.L$1
            com.unity3d.services.core.configuration.Configuration r1 = (com.unity3d.services.core.configuration.Configuration) r1
            java.lang.Object r3 = r8.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x016b
        L_0x009c:
            java.lang.Object r0 = r8.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r9.m51unboximpl()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x0130
        L_0x00a8:
            java.lang.Object r1 = r8.L$0
            com.unity3d.services.core.configuration.Configuration r1 = (com.unity3d.services.core.configuration.Configuration) r1
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x010f
        L_0x00b0:
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x00df
        L_0x00b4:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.Result$Companion r9 = kotlin.Result.Companion     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.configuration.IInitializeEventsMetricSender r9 = com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r9.didInitStart()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.lifecycle.CachedLifecycle.register()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeSDK r9 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateLoadConfigFile r9 = r9.initializeStateLoadConfigFile     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateLoadConfigFile$Params r1 = new com.unity3d.services.core.domain.task.InitializeStateLoadConfigFile$Params     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.configuration.Configuration r3 = new com.unity3d.services.core.configuration.Configuration     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r3.<init>()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r1.<init>(r3)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.BaseParams r1 = (com.unity3d.services.core.domain.task.BaseParams) r1     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r3 = 1
            r8.label = r3     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.invoke(r1, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 != r0) goto L_0x00df
            return r0
        L_0x00df:
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.m51unboximpl()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.configuration.Configuration r1 = new com.unity3d.services.core.configuration.Configuration     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r1.<init>()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            boolean r3 = kotlin.Result.m48isFailureimpl(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r3 == 0) goto L_0x00f1
            r9 = r1
        L_0x00f1:
            com.unity3d.services.core.configuration.Configuration r9 = (com.unity3d.services.core.configuration.Configuration) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeSDK r1 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateReset r1 = r1.initializeStateReset     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateReset$Params r3 = new com.unity3d.services.core.domain.task.InitializeStateReset$Params     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r3.<init>(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.BaseParams r3 = (com.unity3d.services.core.domain.task.BaseParams) r3     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$0 = r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r4 = 2
            r8.label = r4     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r1 = r1.invoke(r3, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r1 != r0) goto L_0x010c
            return r0
        L_0x010c:
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x010f:
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r3 = r9.m51unboximpl()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            boolean r9 = kotlin.Result.m48isFailureimpl(r3)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 == 0) goto L_0x0145
            com.unity3d.services.core.domain.task.InitializeSDK r9 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.configuration.ErrorState r2 = com.unity3d.services.core.configuration.ErrorState.ResetWebApp     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Throwable r4 = kotlin.Result.m46exceptionOrNullimpl(r3)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$0 = r3     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r5 = 3
            r8.label = r5     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.m26executeErrorStateBWLJW6A(r2, r4, r1, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 != r0) goto L_0x012f
            return r0
        L_0x012f:
            r0 = r3
        L_0x0130:
            java.lang.Throwable r9 = kotlin.Result.m46exceptionOrNullimpl(r0)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 == 0) goto L_0x0137
            goto L_0x0144
        L_0x0137:
            java.lang.Exception r9 = new java.lang.Exception     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.configuration.ErrorState r0 = com.unity3d.services.core.configuration.ErrorState.ResetWebApp     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.String r0 = r0.toString()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r9.<init>(r0)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
        L_0x0144:
            throw r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
        L_0x0145:
            com.unity3d.services.core.domain.task.InitializeSDK r9 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateInitModules r9 = r9.initializeStateInitModules     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateInitModules$Params r4 = new com.unity3d.services.core.domain.task.InitializeStateInitModules$Params     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            boolean r5 = kotlin.Result.m48isFailureimpl(r3)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r5 == 0) goto L_0x0155
            r5 = r1
            goto L_0x0156
        L_0x0155:
            r5 = r3
        L_0x0156:
            com.unity3d.services.core.configuration.Configuration r5 = (com.unity3d.services.core.configuration.Configuration) r5     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r4.<init>(r5)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.BaseParams r4 = (com.unity3d.services.core.domain.task.BaseParams) r4     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$0 = r3     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$1 = r1     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r5 = 4
            r8.label = r5     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.invoke(r4, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 != r0) goto L_0x016b
            return r0
        L_0x016b:
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.m51unboximpl()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            boolean r4 = kotlin.Result.m48isFailureimpl(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r4 == 0) goto L_0x01a3
            com.unity3d.services.core.domain.task.InitializeSDK r4 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.configuration.ErrorState r5 = com.unity3d.services.core.configuration.ErrorState.InitModules     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Throwable r3 = kotlin.Result.m46exceptionOrNullimpl(r3)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$0 = r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$1 = r2     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r2 = 5
            r8.label = r2     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r1 = r4.m26executeErrorStateBWLJW6A(r5, r3, r1, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r1 != r0) goto L_0x018d
            return r0
        L_0x018d:
            r0 = r9
        L_0x018e:
            java.lang.Throwable r9 = kotlin.Result.m46exceptionOrNullimpl(r0)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 == 0) goto L_0x0195
            goto L_0x01a2
        L_0x0195:
            java.lang.Exception r9 = new java.lang.Exception     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.configuration.ErrorState r0 = com.unity3d.services.core.configuration.ErrorState.InitModules     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.String r0 = r0.toString()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r9.<init>(r0)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
        L_0x01a2:
            throw r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
        L_0x01a3:
            com.unity3d.services.core.domain.task.InitializeSDK r9 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateConfig r9 = r9.initializeStateConfig     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateConfig$Params r3 = new com.unity3d.services.core.domain.task.InitializeStateConfig$Params     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r3.<init>(r1)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.BaseParams r3 = (com.unity3d.services.core.domain.task.BaseParams) r3     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$0 = r1     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$1 = r2     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r4 = 6
            r8.label = r4     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.invoke(r3, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 != r0) goto L_0x01be
            return r0
        L_0x01be:
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r3 = r9.m51unboximpl()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            boolean r9 = kotlin.Result.m48isFailureimpl(r3)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 == 0) goto L_0x01de
            com.unity3d.services.core.domain.task.InitializeSDK r9 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializationException r4 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(r3)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$0 = r3     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$1 = r1     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r5 = 7
            r8.label = r5     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.handleInitializationException(r4, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 != r0) goto L_0x01de
            return r0
        L_0x01de:
            com.unity3d.services.core.configuration.IExperiments r9 = r1.getExperiments()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.String r4 = "configuration.experiments"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r4)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            boolean r9 = r9.isNativeWebViewCacheEnabled()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 == 0) goto L_0x025c
            com.unity3d.services.core.domain.task.InitializeSDK r9 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateCreateWithRemote r9 = r9.initializeStateCreateWithRemote     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateCreateWithRemote$Params r4 = new com.unity3d.services.core.domain.task.InitializeStateCreateWithRemote$Params     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r5 = r3
            com.unity3d.services.core.configuration.Configuration r5 = (com.unity3d.services.core.configuration.Configuration) r5     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r4.<init>(r5)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.BaseParams r4 = (com.unity3d.services.core.domain.task.BaseParams) r4     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$0 = r3     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$1 = r1     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r5 = 8
            r8.label = r5     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.invoke(r4, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 != r0) goto L_0x020f
            return r0
        L_0x020f:
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.m51unboximpl()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            boolean r4 = kotlin.Result.m49isSuccessimpl(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r4 == 0) goto L_0x0247
            com.unity3d.services.core.domain.task.InitializeSDK r9 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateComplete r9 = r9.initializeStateComplete     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateComplete$Params r1 = new com.unity3d.services.core.domain.task.InitializeStateComplete$Params     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.configuration.Configuration r3 = (com.unity3d.services.core.configuration.Configuration) r3     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r1.<init>(r3)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.BaseParams r1 = (com.unity3d.services.core.domain.task.BaseParams) r1     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$0 = r2     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$1 = r2     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r2 = 9
            r8.label = r2     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.invoke(r1, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 != r0) goto L_0x023c
            return r0
        L_0x023c:
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.m51unboximpl()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x0393
        L_0x0247:
            com.unity3d.services.core.domain.task.InitializeSDK r4 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializationException r9 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$0 = r3     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$1 = r1     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r5 = 10
            r8.label = r5     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r4.handleInitializationException(r9, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 != r0) goto L_0x025c
            return r0
        L_0x025c:
            com.unity3d.services.core.domain.task.InitializeSDK r9 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateLoadCache r9 = r9.initializeStateLoadCache     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$Params r4 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$Params     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r5 = r3
            com.unity3d.services.core.configuration.Configuration r5 = (com.unity3d.services.core.configuration.Configuration) r5     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r4.<init>(r5)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.BaseParams r4 = (com.unity3d.services.core.domain.task.BaseParams) r4     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$0 = r3     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$1 = r1     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r5 = 11
            r8.label = r5     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.invoke(r4, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 != r0) goto L_0x027e
            return r0
        L_0x027e:
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.m51unboximpl()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            boolean r4 = kotlin.Result.m48isFailureimpl(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r4 == 0) goto L_0x02b7
            com.unity3d.services.core.domain.task.InitializeSDK r3 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.configuration.ErrorState r4 = com.unity3d.services.core.configuration.ErrorState.LoadCache     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Throwable r5 = kotlin.Result.m46exceptionOrNullimpl(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$0 = r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$1 = r2     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r2 = 12
            r8.label = r2     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r1 = r3.m26executeErrorStateBWLJW6A(r4, r5, r1, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r1 != r0) goto L_0x02a1
            return r0
        L_0x02a1:
            r0 = r9
        L_0x02a2:
            java.lang.Throwable r9 = kotlin.Result.m46exceptionOrNullimpl(r0)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 == 0) goto L_0x02a9
            goto L_0x02b6
        L_0x02a9:
            java.lang.Exception r9 = new java.lang.Exception     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.configuration.ErrorState r0 = com.unity3d.services.core.configuration.ErrorState.LoadCache     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.String r0 = r0.toString()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r9.<init>(r0)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
        L_0x02b6:
            throw r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
        L_0x02b7:
            boolean r1 = kotlin.Result.m48isFailureimpl(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r1 == 0) goto L_0x02be
            r9 = r2
        L_0x02be:
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 != 0) goto L_0x0312
            com.unity3d.services.core.domain.task.InitializeSDK r1 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb r1 = r1.initializeStateLoadWeb     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params r4 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r5 = r3
            com.unity3d.services.core.configuration.Configuration r5 = (com.unity3d.services.core.configuration.Configuration) r5     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r4.<init>(r5)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.BaseParams r4 = (com.unity3d.services.core.domain.task.BaseParams) r4     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$0 = r3     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$1 = r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r5 = 13
            r8.label = r5     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r1 = r1.invoke(r4, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r1 != r0) goto L_0x02e4
            return r0
        L_0x02e4:
            r4 = r3
            r3 = r9
            r9 = r1
        L_0x02e7:
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r1 = r9.m51unboximpl()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            boolean r9 = kotlin.Result.m48isFailureimpl(r1)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 == 0) goto L_0x030a
            com.unity3d.services.core.domain.task.InitializeSDK r9 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializationException r5 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(r1)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$0 = r4     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$1 = r3     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$2 = r1     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r6 = 14
            r8.label = r6     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.handleInitializationException(r5, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 != r0) goto L_0x030a
            return r0
        L_0x030a:
            r9 = r3
            r3 = r4
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$LoadWebResult r1 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult) r1     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x0313
        L_0x0312:
            r1 = r2
        L_0x0313:
            if (r1 == 0) goto L_0x031c
            java.lang.String r4 = r1.getWebViewDataString()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r4 == 0) goto L_0x031c
            r9 = r4
        L_0x031c:
            if (r9 == 0) goto L_0x039a
            if (r1 == 0) goto L_0x0327
            com.unity3d.services.core.configuration.Configuration r1 = r1.getConfig()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r1 == 0) goto L_0x0327
            goto L_0x032d
        L_0x0327:
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r1 = r3
            com.unity3d.services.core.configuration.Configuration r1 = (com.unity3d.services.core.configuration.Configuration) r1     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
        L_0x032d:
            com.unity3d.services.core.domain.task.InitializeSDK r4 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateCreate r4 = r4.initializeStateCreate     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateCreate$Params r5 = new com.unity3d.services.core.domain.task.InitializeStateCreate$Params     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r5.<init>(r1, r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.BaseParams r5 = (com.unity3d.services.core.domain.task.BaseParams) r5     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$0 = r3     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$1 = r2     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$2 = r2     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r9 = 15
            r8.label = r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r4.invoke(r5, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 != r0) goto L_0x034b
            return r0
        L_0x034b:
            r1 = r3
        L_0x034c:
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.m51unboximpl()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            boolean r3 = kotlin.Result.m48isFailureimpl(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r3 == 0) goto L_0x036b
            com.unity3d.services.core.domain.task.InitializeSDK r3 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializationException r9 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$0 = r1     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r4 = 16
            r8.label = r4     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r3.handleInitializationException(r9, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 != r0) goto L_0x036b
            return r0
        L_0x036b:
            com.unity3d.services.core.domain.task.InitializeSDK r9 = r8.this$0     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateComplete r9 = r9.initializeStateComplete     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.InitializeStateComplete$Params r3 = new com.unity3d.services.core.domain.task.InitializeStateComplete$Params     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.configuration.Configuration r1 = (com.unity3d.services.core.configuration.Configuration) r1     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r3.<init>(r1)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            com.unity3d.services.core.domain.task.BaseParams r3 = (com.unity3d.services.core.domain.task.BaseParams) r3     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r8.L$0 = r2     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r1 = 17
            r8.label = r1     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.invoke(r3, r8)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            if (r9 != r0) goto L_0x038a
            return r0
        L_0x038a:
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = r9.m51unboximpl()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
        L_0x0393:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Object r9 = kotlin.Result.m44constructorimpl(r9)     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            goto L_0x03ad
        L_0x039a:
            java.lang.Error r9 = new java.lang.Error     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            r9.<init>()     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
            throw r9     // Catch:{ CancellationException -> 0x03cf, all -> 0x03a2 }
        L_0x03a2:
            r9 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = kotlin.Result.m44constructorimpl(r9)
        L_0x03ad:
            boolean r0 = kotlin.Result.m49isSuccessimpl(r9)
            if (r0 == 0) goto L_0x03ba
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.Result.m44constructorimpl(r9)
            goto L_0x03ca
        L_0x03ba:
            java.lang.Throwable r0 = kotlin.Result.m46exceptionOrNullimpl(r9)
            if (r0 == 0) goto L_0x03ca
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r9 = kotlin.Result.m44constructorimpl(r9)
        L_0x03ca:
            kotlin.Result r9 = kotlin.Result.m43boximpl(r9)
            return r9
        L_0x03cf:
            r9 = move-exception
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
