package kotlinx.coroutines;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {100}, m = "withTimeoutOrNull")
/* compiled from: Timeout.kt */
final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    TimeoutKt$withTimeoutOrNull$1(Continuation<? super TimeoutKt$withTimeoutOrNull$1> continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return TimeoutKt.withTimeoutOrNull(0, (Function2) null, this);
    }
}
