package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\n\b\u0000\u0010\u0002 \u0000*\u00020\u0003\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007HB"}, d2 = {"invoke", "", "P", "Lcom/unity3d/services/core/domain/task/BaseParams;", "R", "params", "continuation", "Lkotlin/coroutines/Continuation;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.MetricTask", f = "MetricTask.kt", l = {23}, m = "invoke$suspendImpl")
/* compiled from: MetricTask.kt */
final class MetricTask$invoke$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MetricTask this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MetricTask$invoke$1(MetricTask metricTask, Continuation continuation) {
        super(continuation);
        this.this$0 = metricTask;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return MetricTask.invoke$suspendImpl(this.this$0, (BaseParams) null, this);
    }
}
