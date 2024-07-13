package com.unity3d.services;

import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/unity3d/services/SDKErrorHandler;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "key", "Lkotlinx/coroutines/CoroutineExceptionHandler$Key;", "getKey", "()Lkotlinx/coroutines/CoroutineExceptionHandler$Key;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "sendMetric", "metric", "Lcom/unity3d/services/core/request/metrics/Metric;", "unity-ads_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SDKErrorHandler.kt */
public final class SDKErrorHandler implements CoroutineExceptionHandler {
    private final ISDKDispatchers dispatchers;
    private final CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.Key;

    public SDKErrorHandler(ISDKDispatchers iSDKDispatchers) {
        Intrinsics.checkNotNullParameter(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
    }

    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        Intrinsics.checkNotNullParameter(function2, "operation");
        return CoroutineExceptionHandler.DefaultImpls.fold(this, r, function2);
    }

    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key2) {
        Intrinsics.checkNotNullParameter(key2, "key");
        return CoroutineExceptionHandler.DefaultImpls.get(this, key2);
    }

    public CoroutineContext minusKey(CoroutineContext.Key<?> key2) {
        Intrinsics.checkNotNullParameter(key2, "key");
        return CoroutineExceptionHandler.DefaultImpls.minusKey(this, key2);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "context");
        return CoroutineExceptionHandler.DefaultImpls.plus(this, coroutineContext);
    }

    public CoroutineExceptionHandler.Key getKey() {
        return this.key;
    }

    public void handleException(CoroutineContext coroutineContext, Throwable th) {
        String str;
        Intrinsics.checkNotNullParameter(coroutineContext, "context");
        Intrinsics.checkNotNullParameter(th, "exception");
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        Intrinsics.checkNotNullExpressionValue(stackTraceElement, "exception.stackTrace[0]");
        String fileName = stackTraceElement.getFileName();
        Intrinsics.checkNotNullExpressionValue(fileName, "exception.stackTrace[0].fileName");
        StackTraceElement stackTraceElement2 = th.getStackTrace()[0];
        Intrinsics.checkNotNullExpressionValue(stackTraceElement2, "exception.stackTrace[0]");
        int lineNumber = stackTraceElement2.getLineNumber();
        if (th instanceof NullPointerException) {
            str = "native_exception_npe";
        } else if (th instanceof OutOfMemoryError) {
            str = "native_exception_oom";
        } else if (th instanceof IllegalStateException) {
            str = "native_exception_ise";
        } else if (th instanceof RuntimeException) {
            str = "native_exception_re";
        } else {
            str = th instanceof SecurityException ? "native_exception_se" : "native_exception";
        }
        sendMetric(new Metric(str, '{' + fileName + "}_" + lineNumber, (Map<String, String>) null));
    }

    private final void sendMetric(Metric metric) {
        SDKMetrics.getInstance().sendMetric(metric);
    }
}
