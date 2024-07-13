package com.unity3d.services.core.di;

import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/core/di/ServiceProvider;", "Lcom/unity3d/services/core/di/IServiceProvider;", "()V", "NAMED_SDK", "", "serviceRegistry", "Lcom/unity3d/services/core/di/IServicesRegistry;", "getRegistry", "initialize", "provideSDKDispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "provideSDKErrorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "dispatchers", "provideSDKScope", "Lkotlinx/coroutines/CoroutineScope;", "errorHandler", "unity-ads_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ServiceProvider.kt */
public final class ServiceProvider implements IServiceProvider {
    public static final ServiceProvider INSTANCE;
    public static final String NAMED_SDK = "sdk";
    private static final IServicesRegistry serviceRegistry;

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    private ServiceProvider() {
    }

    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(ServiceProvider$initialize$1.INSTANCE);
    }

    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    /* access modifiers changed from: private */
    public final ISDKDispatchers provideSDKDispatchers() {
        return new SDKDispatchers();
    }

    /* access modifiers changed from: private */
    public final CoroutineExceptionHandler provideSDKErrorHandler(ISDKDispatchers iSDKDispatchers) {
        return new SDKErrorHandler(iSDKDispatchers);
    }

    /* access modifiers changed from: private */
    public final CoroutineScope provideSDKScope(ISDKDispatchers iSDKDispatchers, CoroutineExceptionHandler coroutineExceptionHandler) {
        return CoroutineScopeKt.CoroutineScope(iSDKDispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(coroutineExceptionHandler));
    }
}
