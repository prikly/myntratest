package com.unity3d.services.core.domain.task;

import com.appodeal.ads.modules.common.internal.Constants;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000ø\u0001\u0000\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateError;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/InitializeStateError$Params;", "Lkotlin/Result;", "", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "doWork", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/InitializeStateError$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetricName", "", "Params", "unity-ads_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: InitializeStateError.kt */
public final class InitializeStateError extends MetricTask<Params, Result<? extends Unit>> {
    private final ISDKDispatchers dispatchers;

    public InitializeStateError(ISDKDispatchers iSDKDispatchers) {
        Intrinsics.checkNotNullParameter(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
    }

    public String getMetricName() {
        return getMetricNameForInitializeTask("error");
    }

    /* renamed from: doWork-gIAlu-s  reason: not valid java name */
    public Object doWork(Params params, Continuation<? super Result<Unit>> continuation) {
        return BuildersKt.withContext(this.dispatchers.getDefault(), new InitializeStateError$doWork$2(params, (Continuation) null), continuation);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0011\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateError$Params;", "Lcom/unity3d/services/core/domain/task/BaseParams;", "errorState", "Lcom/unity3d/services/core/configuration/ErrorState;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "config", "Lcom/unity3d/services/core/configuration/Configuration;", "(Lcom/unity3d/services/core/configuration/ErrorState;Ljava/lang/Exception;Lcom/unity3d/services/core/configuration/Configuration;)V", "getConfig", "()Lcom/unity3d/services/core/configuration/Configuration;", "getErrorState", "()Lcom/unity3d/services/core/configuration/ErrorState;", "getException", "()Ljava/lang/Exception;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: InitializeStateError.kt */
    public static final class Params implements BaseParams {
        private final Configuration config;
        private final ErrorState errorState;
        private final Exception exception;

        public static /* synthetic */ Params copy$default(Params params, ErrorState errorState2, Exception exc, Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                errorState2 = params.errorState;
            }
            if ((i & 2) != 0) {
                exc = params.exception;
            }
            if ((i & 4) != 0) {
                configuration = params.config;
            }
            return params.copy(errorState2, exc, configuration);
        }

        public final ErrorState component1() {
            return this.errorState;
        }

        public final Exception component2() {
            return this.exception;
        }

        public final Configuration component3() {
            return this.config;
        }

        public final Params copy(ErrorState errorState2, Exception exc, Configuration configuration) {
            Intrinsics.checkNotNullParameter(errorState2, "errorState");
            Intrinsics.checkNotNullParameter(exc, "exception");
            Intrinsics.checkNotNullParameter(configuration, Constants.CONFIG);
            return new Params(errorState2, exc, configuration);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return Intrinsics.areEqual((Object) this.errorState, (Object) params.errorState) && Intrinsics.areEqual((Object) this.exception, (Object) params.exception) && Intrinsics.areEqual((Object) this.config, (Object) params.config);
        }

        public int hashCode() {
            ErrorState errorState2 = this.errorState;
            int i = 0;
            int hashCode = (errorState2 != null ? errorState2.hashCode() : 0) * 31;
            Exception exc = this.exception;
            int hashCode2 = (hashCode + (exc != null ? exc.hashCode() : 0)) * 31;
            Configuration configuration = this.config;
            if (configuration != null) {
                i = configuration.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Params(errorState=" + this.errorState + ", exception=" + this.exception + ", config=" + this.config + ")";
        }

        public Params(ErrorState errorState2, Exception exc, Configuration configuration) {
            Intrinsics.checkNotNullParameter(errorState2, "errorState");
            Intrinsics.checkNotNullParameter(exc, "exception");
            Intrinsics.checkNotNullParameter(configuration, Constants.CONFIG);
            this.errorState = errorState2;
            this.exception = exc;
            this.config = configuration;
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public final Exception getException() {
            return this.exception;
        }
    }
}
