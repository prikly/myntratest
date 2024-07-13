package com.appodeal.ads.modules.common.internal.ext;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\u0004\b\u0000\u0010\u0006*\u0002H\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001aJ\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00060\u00012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\nH\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u000b\u001a>\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nH\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u000b\u001a8\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u0010\u001aS\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00012'\u0010\u0012\u001a#\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\nH\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u000b\u0002\u000b\n\u0002\b\u0019\n\u0005\b20\u0001¨\u0006\u0016"}, d2 = {"asFailure", "Lkotlin/Result;", "R", "", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "asSuccess", "T", "(Ljava/lang/Object;)Ljava/lang/Object;", "flatMap", "f", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "mapError", "onAny", "Lkotlin/Function0;", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "recoverFromError", "transform", "Lkotlin/ParameterName;", "name", "cause", "apd_internal"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ResultExtKt {
    public static final <R> Object asFailure(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Result.Companion companion = Result.Companion;
        return Result.m44constructorimpl(ResultKt.createFailure(th));
    }

    public static final <T> Object asSuccess(T t) {
        Result.Companion companion = Result.Companion;
        return Result.m44constructorimpl(t);
    }

    public static final <T, R> Object flatMap(Object obj, Function1<? super T, ? extends Result<? extends R>> function1) {
        Object obj2;
        Intrinsics.checkNotNullParameter(function1, "f");
        Throwable r0 = Result.m46exceptionOrNullimpl(obj);
        if (r0 == null) {
            try {
                return ((Result) function1.invoke(obj)).m51unboximpl();
            } catch (Throwable th) {
                Result.Companion companion = Result.Companion;
                obj2 = ResultKt.createFailure(th);
            }
        } else {
            Result.Companion companion2 = Result.Companion;
            obj2 = ResultKt.createFailure(r0);
            return Result.m44constructorimpl(obj2);
        }
    }

    public static final <T> Object mapError(Object obj, Function1<? super Throwable, ? extends Throwable> function1) {
        Intrinsics.checkNotNullParameter(function1, "f");
        Throwable r0 = Result.m46exceptionOrNullimpl(obj);
        if (r0 == null) {
            return obj;
        }
        Result.Companion companion = Result.Companion;
        return Result.m44constructorimpl(ResultKt.createFailure((Throwable) function1.invoke(r0)));
    }

    public static final <T> Object onAny(Object obj, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "f");
        function0.invoke();
        return obj;
    }

    public static final <T> Object recoverFromError(Object obj, Function1<? super Throwable, ? extends Result<? extends T>> function1) {
        Intrinsics.checkNotNullParameter(function1, "transform");
        Throwable r0 = Result.m46exceptionOrNullimpl(obj);
        return r0 == null ? obj : ((Result) function1.invoke(r0)).m51unboximpl();
    }
}
