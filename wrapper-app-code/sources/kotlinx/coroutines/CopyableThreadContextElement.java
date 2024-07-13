package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CopyableThreadContextElement;", "S", "Lkotlinx/coroutines/ThreadContextElement;", "copyForChildCoroutine", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ThreadContextElement.kt */
public interface CopyableThreadContextElement<S> extends ThreadContextElement<S> {
    CopyableThreadContextElement<S> copyForChildCoroutine();
}
