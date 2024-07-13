package com.unity3d.services.core.extensions;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u0005\u001a.\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u0005\u0002\u000b\n\u0002\b\u0019\n\u0005\b20\u0001¨\u0006\u0007"}, d2 = {"runReturnSuspendCatching", "Lkotlin/Result;", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "runSuspendCatching", "unity-ads_release"}, k = 2, mv = {1, 4, 2})
/* compiled from: CoroutineExtensions.kt */
public final class CoroutineExtensionsKt {
    public static final <R> Object runSuspendCatching(Function0<? extends R> function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        try {
            Result.Companion companion = Result.Companion;
            return Result.m44constructorimpl(function0.invoke());
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m44constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static final <R> Object runReturnSuspendCatching(Function0<? extends R> function0) {
        Object obj;
        Intrinsics.checkNotNullParameter(function0, "block");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m44constructorimpl(function0.invoke());
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m44constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m49isSuccessimpl(obj)) {
            Result.Companion companion3 = Result.Companion;
            return Result.m44constructorimpl(obj);
        }
        Throwable r0 = Result.m46exceptionOrNullimpl(obj);
        if (r0 == null) {
            return obj;
        }
        Result.Companion companion4 = Result.Companion;
        return Result.m44constructorimpl(ResultKt.createFailure(r0));
    }
}
