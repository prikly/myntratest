package com.unity3d.services.core.extensions;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n21\u0010\u000b\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0010H@"}, d2 = {"withRetry", "", "T", "retryDelay", "", "retries", "", "scalingFactor", "", "fallbackException", "", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "attempt", "Lkotlin/coroutines/Continuation;", "continuation"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.unity3d.services.core.extensions.TaskExtensionsKt", f = "TaskExtensions.kt", l = {17, 29}, m = "withRetry")
/* compiled from: TaskExtensions.kt */
final class TaskExtensionsKt$withRetry$1 extends ContinuationImpl {
    double D$0;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    TaskExtensionsKt$withRetry$1(Continuation continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return TaskExtensionsKt.withRetry(0, 0, 0.0d, (Throwable) null, (Function2) null, this);
    }
}
