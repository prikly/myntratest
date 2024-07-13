package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH@"}, d2 = {"executeErrorState", "", "errorState", "Lcom/unity3d/services/core/configuration/ErrorState;", "taskException", "", "configuration", "Lcom/unity3d/services/core/configuration/Configuration;", "continuation", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", ""}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {121}, m = "executeErrorState-BWLJW6A")
/* compiled from: InitializeSDK.kt */
final class InitializeSDK$executeErrorState$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeSDK$executeErrorState$1(InitializeSDK initializeSDK, Continuation continuation) {
        super(continuation);
        this.this$0 = initializeSDK;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object r2 = this.this$0.m26executeErrorStateBWLJW6A((ErrorState) null, (Throwable) null, (Configuration) null, this);
        return r2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? r2 : Result.m43boximpl(r2);
    }
}
