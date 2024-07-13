package com.unity3d.services.core.extensions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001ap\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t21\u0010\n\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000bH@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"withRetry", "T", "retryDelay", "", "retries", "", "scalingFactor", "", "fallbackException", "", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "attempt", "Lkotlin/coroutines/Continuation;", "", "(JIDLjava/lang/Throwable;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 2, mv = {1, 4, 2})
/* compiled from: TaskExtensions.kt */
public final class TaskExtensionsKt {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object withRetry(long r20, int r22, double r23, java.lang.Throwable r25, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r26, kotlin.coroutines.Continuation<? super T> r27) {
        /*
            r0 = r27
            boolean r1 = r0 instanceof com.unity3d.services.core.extensions.TaskExtensionsKt$withRetry$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.unity3d.services.core.extensions.TaskExtensionsKt$withRetry$1 r1 = (com.unity3d.services.core.extensions.TaskExtensionsKt$withRetry$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001b
        L_0x0016:
            com.unity3d.services.core.extensions.TaskExtensionsKt$withRetry$1 r1 = new com.unity3d.services.core.extensions.TaskExtensionsKt$withRetry$1
            r1.<init>(r0)
        L_0x001b:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x006e
            if (r3 == r5) goto L_0x004e
            if (r3 != r4) goto L_0x0046
            int r3 = r1.I$2
            int r6 = r1.I$1
            double r7 = r1.D$0
            int r9 = r1.I$0
            long r10 = r1.J$0
            java.lang.Object r12 = r1.L$2
            kotlin.jvm.internal.Ref$LongRef r12 = (kotlin.jvm.internal.Ref.LongRef) r12
            java.lang.Object r13 = r1.L$1
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            java.lang.Object r14 = r1.L$0
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x014c
        L_0x0046:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004e:
            int r3 = r1.I$3
            int r6 = r1.I$2
            int r7 = r1.I$1
            double r8 = r1.D$0
            int r10 = r1.I$0
            long r11 = r1.J$0
            java.lang.Object r13 = r1.L$2
            kotlin.jvm.internal.Ref$LongRef r13 = (kotlin.jvm.internal.Ref.LongRef) r13
            java.lang.Object r14 = r1.L$1
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            java.lang.Object r15 = r1.L$0
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x006b }
            goto L_0x00cf
        L_0x006b:
            r0 = move-exception
            goto L_0x00e5
        L_0x006e:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$LongRef r0 = new kotlin.jvm.internal.Ref$LongRef
            r0.<init>()
            r6 = r20
            r0.element = r6
            r3 = 0
            r8 = r23
            r3 = r25
            r10 = r26
            r14 = r0
            r11 = r1
            r12 = r2
            r13 = 0
            r1 = r22
            r2 = r1
        L_0x0088:
            if (r13 >= r1) goto L_0x0173
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r13)
            java.lang.Number r0 = (java.lang.Number) r0
            int r15 = r0.intValue()
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x00d4 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r15)     // Catch:{ all -> 0x00d4 }
            r11.L$0 = r3     // Catch:{ all -> 0x00d4 }
            r11.L$1 = r10     // Catch:{ all -> 0x00d4 }
            r11.L$2 = r14     // Catch:{ all -> 0x00d4 }
            r11.J$0 = r6     // Catch:{ all -> 0x00d4 }
            r11.I$0 = r2     // Catch:{ all -> 0x00d4 }
            r11.D$0 = r8     // Catch:{ all -> 0x00d4 }
            r11.I$1 = r13     // Catch:{ all -> 0x00d4 }
            r11.I$2 = r1     // Catch:{ all -> 0x00d4 }
            r11.I$3 = r15     // Catch:{ all -> 0x00d4 }
            r11.label = r5     // Catch:{ all -> 0x00d4 }
            r16 = 6
            kotlin.jvm.internal.InlineMarker.mark(r16)     // Catch:{ all -> 0x00d4 }
            java.lang.Object r0 = r10.invoke(r0, r11)     // Catch:{ all -> 0x00d4 }
            r16 = 7
            kotlin.jvm.internal.InlineMarker.mark(r16)     // Catch:{ all -> 0x00d4 }
            if (r0 != r12) goto L_0x00bf
            return r12
        L_0x00bf:
            r17 = r6
            r6 = r1
            r1 = r11
            r7 = r13
            r13 = r14
            r14 = r10
            r10 = r2
            r2 = r12
            r11 = r17
            r19 = r15
            r15 = r3
            r3 = r19
        L_0x00cf:
            java.lang.Object r0 = kotlin.Result.m44constructorimpl(r0)     // Catch:{ all -> 0x006b }
            goto L_0x00ef
        L_0x00d4:
            r0 = move-exception
            r17 = r6
            r6 = r1
            r1 = r11
            r7 = r13
            r13 = r14
            r14 = r10
            r10 = r2
            r2 = r12
            r11 = r17
            r19 = r15
            r15 = r3
            r3 = r19
        L_0x00e5:
            kotlin.Result$Companion r16 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m44constructorimpl(r0)
        L_0x00ef:
            r17 = r6
            r6 = r3
            r3 = r17
            boolean r16 = kotlin.Result.m49isSuccessimpl(r0)
            if (r16 == 0) goto L_0x00fe
            kotlin.ResultKt.throwOnFailure(r0)
            return r0
        L_0x00fe:
            boolean r16 = kotlin.Result.m48isFailureimpl(r0)
            if (r16 == 0) goto L_0x0163
            java.lang.Throwable r0 = kotlin.Result.m46exceptionOrNullimpl(r0)
            boolean r0 = r0 instanceof com.unity3d.services.core.extensions.AbortRetryException
            if (r0 != 0) goto L_0x0162
            int r6 = r6 + r5
            if (r6 == r10) goto L_0x0161
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Unity Ads init: retrying in "
            r0.append(r6)
            long r5 = r13.element
            r0.append(r5)
            java.lang.String r5 = " milliseconds"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r0)
            long r5 = r13.element
            r1.L$0 = r15
            r1.L$1 = r14
            r1.L$2 = r13
            r1.J$0 = r11
            r1.I$0 = r10
            r1.D$0 = r8
            r1.I$1 = r7
            r1.I$2 = r3
            r1.label = r4
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r5, r1)
            if (r0 != r2) goto L_0x0145
            return r2
        L_0x0145:
            r6 = r7
            r7 = r8
            r9 = r10
            r10 = r11
            r12 = r13
            r13 = r14
            r14 = r15
        L_0x014c:
            double r4 = (double) r10
            double r4 = r4 * r7
            long r4 = (long) r4
            r12.element = r4
            r0 = r6
            r4 = 1
            r17 = r10
            r11 = r1
            r1 = r3
            r10 = r13
            r3 = r14
            r14 = r12
            r12 = r2
            r2 = r9
            r8 = r7
            r6 = r17
            goto L_0x016d
        L_0x0161:
            throw r15
        L_0x0162:
            throw r15
        L_0x0163:
            r0 = r7
            r6 = r11
            r4 = 1
            r11 = r1
            r12 = r2
            r1 = r3
            r2 = r10
            r10 = r14
            r3 = r15
            r14 = r13
        L_0x016d:
            int r13 = r0 + 1
            r4 = 2
            r5 = 1
            goto L_0x0088
        L_0x0173:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown exception from withRetry"
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(long, int, double, java.lang.Throwable, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object withRetry$default(long j, int i, double d2, Throwable th, Function2 function2, Continuation continuation, int i2, Object obj) {
        return withRetry((i2 & 1) != 0 ? 5000 : j, (i2 & 2) != 0 ? 6 : i, (i2 & 4) != 0 ? 2.0d : d2, th, function2, continuation);
    }
}
