package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00070\rH\b¢\u0006\u0002\u0010\u000e\u001a4\u0010\u000f\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00070\rH\b¢\u0006\u0002\u0010\u0011\u001a\f\u0010\u0012\u001a\u00020\u0003*\u00020\u0003H\u0002\u001a\u0014\u0010\u0013\u001a\u00020\u0003*\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0003H\u0007\u001a\u0013\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016*\u00020\u0017H\u0010\u001a(\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u001a"}, d2 = {"DEBUG_THREAD_NAME_SEPARATOR", "", "coroutineName", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineName", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "withContinuationContext", "T", "continuation", "Lkotlin/coroutines/Continuation;", "countOrElement", "", "block", "Lkotlin/Function0;", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withCoroutineContext", "context", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "foldCopiesForChildCoroutine", "newCoroutineContext", "Lkotlinx/coroutines/CoroutineScope;", "undispatchedCompletion", "Lkotlinx/coroutines/UndispatchedCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "updateUndispatchedCompletion", "oldValue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* compiled from: CoroutineContext.kt */
public final class CoroutineContextKt {
    public static final CoroutineContext newCoroutineContext(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext plus = foldCopiesForChildCoroutine(coroutineScope.getCoroutineContext()).plus(coroutineContext);
        CoroutineContext plus2 = DebugKt.getDEBUG() ? plus.plus(new CoroutineId(DebugKt.getCOROUTINE_ID().incrementAndGet())) : plus;
        return (plus == Dispatchers.getDefault() || plus.get(ContinuationInterceptor.Key) != null) ? plus2 : plus2.plus(Dispatchers.getDefault());
    }

    private static final CoroutineContext foldCopiesForChildCoroutine(CoroutineContext coroutineContext) {
        if (!((Boolean) coroutineContext.fold(false, CoroutineContextKt$foldCopiesForChildCoroutine$hasToCopy$1.INSTANCE)).booleanValue()) {
            return coroutineContext;
        }
        return (CoroutineContext) coroutineContext.fold(EmptyCoroutineContext.INSTANCE, CoroutineContextKt$foldCopiesForChildCoroutine$1.INSTANCE);
    }

    public static final UndispatchedCoroutine<?> updateUndispatchedCompletion(Continuation<?> continuation, CoroutineContext coroutineContext, Object obj) {
        if (!(continuation instanceof CoroutineStackFrame)) {
            return null;
        }
        if (!(coroutineContext.get(UndispatchedMarker.INSTANCE) != null)) {
            return null;
        }
        UndispatchedCoroutine<?> undispatchedCompletion = undispatchedCompletion((CoroutineStackFrame) continuation);
        if (undispatchedCompletion != null) {
            undispatchedCompletion.saveThreadContext(coroutineContext, obj);
        }
        return undispatchedCompletion;
    }

    public static final UndispatchedCoroutine<?> undispatchedCompletion(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof DispatchedCoroutine) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof UndispatchedCoroutine) {
                return (UndispatchedCoroutine) coroutineStackFrame;
            }
        }
        return null;
    }

    public static final String getCoroutineName(CoroutineContext coroutineContext) {
        CoroutineId coroutineId;
        String name;
        if (!DebugKt.getDEBUG() || (coroutineId = (CoroutineId) coroutineContext.get(CoroutineId.Key)) == null) {
            return null;
        }
        CoroutineName coroutineName = (CoroutineName) coroutineContext.get(CoroutineName.Key);
        String str = "coroutine";
        if (!(coroutineName == null || (name = coroutineName.getName()) == null)) {
            str = name;
        }
        return str + '#' + coroutineId.getId();
    }
}
