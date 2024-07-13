package com.unity3d.services.core.domain.task;

import com.appodeal.ads.modules.common.internal.Constants;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0002\u0010\u0011B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000ø\u0001\u0000\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$Params;", "Lkotlin/Result;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$LoadWebResult;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "initializeStateNetworkError", "Lcom/unity3d/services/core/domain/task/InitializeStateNetworkError;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/services/core/domain/task/InitializeStateNetworkError;)V", "doWork", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetricName", "", "LoadWebResult", "Params", "unity-ads_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: InitializeStateLoadWeb.kt */
public final class InitializeStateLoadWeb extends MetricTask<Params, Result<? extends LoadWebResult>> {
    /* access modifiers changed from: private */
    public final ISDKDispatchers dispatchers;
    /* access modifiers changed from: private */
    public final InitializeStateNetworkError initializeStateNetworkError;

    public InitializeStateLoadWeb(ISDKDispatchers iSDKDispatchers, InitializeStateNetworkError initializeStateNetworkError2) {
        Intrinsics.checkNotNullParameter(iSDKDispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(initializeStateNetworkError2, "initializeStateNetworkError");
        this.dispatchers = iSDKDispatchers;
        this.initializeStateNetworkError = initializeStateNetworkError2;
    }

    public String getMetricName() {
        return getMetricNameForInitializeTask("download_web_view");
    }

    /* renamed from: doWork-gIAlu-s  reason: not valid java name */
    public Object doWork(Params params, Continuation<? super Result<LoadWebResult>> continuation) {
        return BuildersKt.withContext(this.dispatchers.getDefault(), new InitializeStateLoadWeb$doWork$2(this, params, (Continuation) null), continuation);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$Params;", "Lcom/unity3d/services/core/domain/task/BaseParams;", "config", "Lcom/unity3d/services/core/configuration/Configuration;", "(Lcom/unity3d/services/core/configuration/Configuration;)V", "getConfig", "()Lcom/unity3d/services/core/configuration/Configuration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: InitializeStateLoadWeb.kt */
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$LoadWebResult;", "", "config", "Lcom/unity3d/services/core/configuration/Configuration;", "webViewDataString", "", "(Lcom/unity3d/services/core/configuration/Configuration;Ljava/lang/String;)V", "getConfig", "()Lcom/unity3d/services/core/configuration/Configuration;", "getWebViewDataString", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "unity-ads_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: InitializeStateLoadWeb.kt */
    public static final class LoadWebResult {
        private final Configuration config;
        private final String webViewDataString;

        public static /* synthetic */ LoadWebResult copy$default(LoadWebResult loadWebResult, Configuration configuration, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = loadWebResult.config;
            }
            if ((i & 2) != 0) {
                str = loadWebResult.webViewDataString;
            }
            return loadWebResult.copy(configuration, str);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final String component2() {
            return this.webViewDataString;
        }

        public final LoadWebResult copy(Configuration configuration, String str) {
            Intrinsics.checkNotNullParameter(configuration, Constants.CONFIG);
            Intrinsics.checkNotNullParameter(str, "webViewDataString");
            return new LoadWebResult(configuration, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadWebResult)) {
                return false;
            }
            LoadWebResult loadWebResult = (LoadWebResult) obj;
            return Intrinsics.areEqual((Object) this.config, (Object) loadWebResult.config) && Intrinsics.areEqual((Object) this.webViewDataString, (Object) loadWebResult.webViewDataString);
        }

        public int hashCode() {
            Configuration configuration = this.config;
            int i = 0;
            int hashCode = (configuration != null ? configuration.hashCode() : 0) * 31;
            String str = this.webViewDataString;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "LoadWebResult(config=" + this.config + ", webViewDataString=" + this.webViewDataString + ")";
        }

        public LoadWebResult(Configuration configuration, String str) {
            Intrinsics.checkNotNullParameter(configuration, Constants.CONFIG);
            Intrinsics.checkNotNullParameter(str, "webViewDataString");
            this.config = configuration;
            this.webViewDataString = str;
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public final String getWebViewDataString() {
            return this.webViewDataString;
        }
    }
}
