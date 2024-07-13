package com.unity3d.services.core.domain.task;

import com.appodeal.ads.modules.common.internal.Constants;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000ø\u0001\u0000\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateConfig;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/InitializeStateConfig$Params;", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "initializeStateConfigWithLoader", "Lcom/unity3d/services/core/domain/task/InitializeStateConfigWithLoader;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/services/core/domain/task/InitializeStateConfigWithLoader;)V", "doWork", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/InitializeStateConfig$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetricName", "", "Params", "unity-ads_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: InitializeStateConfig.kt */
public final class InitializeStateConfig extends MetricTask<Params, Result<? extends Configuration>> {
    private final ISDKDispatchers dispatchers;
    /* access modifiers changed from: private */
    public final InitializeStateConfigWithLoader initializeStateConfigWithLoader;

    public InitializeStateConfig(ISDKDispatchers iSDKDispatchers, InitializeStateConfigWithLoader initializeStateConfigWithLoader2) {
        Intrinsics.checkNotNullParameter(iSDKDispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(initializeStateConfigWithLoader2, "initializeStateConfigWithLoader");
        this.dispatchers = iSDKDispatchers;
        this.initializeStateConfigWithLoader = initializeStateConfigWithLoader2;
    }

    public String getMetricName() {
        return getMetricNameForInitializeTask("config_fetch");
    }

    /* renamed from: doWork-gIAlu-s  reason: not valid java name */
    public Object doWork(Params params, Continuation<? super Result<? extends Configuration>> continuation) {
        return BuildersKt.withContext(this.dispatchers.getDefault(), new InitializeStateConfig$doWork$2(this, params, (Continuation) null), continuation);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateConfig$Params;", "Lcom/unity3d/services/core/domain/task/BaseParams;", "config", "Lcom/unity3d/services/core/configuration/Configuration;", "(Lcom/unity3d/services/core/configuration/Configuration;)V", "getConfig", "()Lcom/unity3d/services/core/configuration/Configuration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: InitializeStateConfig.kt */
    public static final class Params implements BaseParams {
        private final Configuration config;

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final Params copy(Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, Constants.CONFIG);
            return new Params(configuration);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Params) && Intrinsics.areEqual((Object) this.config, (Object) ((Params) obj).config);
            }
            return true;
        }

        public int hashCode() {
            Configuration configuration = this.config;
            if (configuration != null) {
                return configuration.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Params(config=" + this.config + ")";
        }

        public Params(Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, Constants.CONFIG);
            this.config = configuration;
        }

        public final Configuration getConfig() {
            return this.config;
        }
    }
}
