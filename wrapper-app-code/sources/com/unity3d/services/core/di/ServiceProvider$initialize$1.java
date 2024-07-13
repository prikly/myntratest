package com.unity3d.services.core.di;

import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateCreateWithRemote;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateInitModules;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadConfigFile;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/unity3d/services/core/di/ServicesRegistry;", "invoke"}, k = 3, mv = {1, 4, 2})
/* compiled from: ServiceProvider.kt */
final class ServiceProvider$initialize$1 extends Lambda implements Function1<ServicesRegistry, Unit> {
    public static final ServiceProvider$initialize$1 INSTANCE = new ServiceProvider$initialize$1();

    ServiceProvider$initialize$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ServicesRegistry) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(final ServicesRegistry servicesRegistry) {
        Intrinsics.checkNotNullParameter(servicesRegistry, "$receiver");
        servicesRegistry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class)), LazyKt.lazy(AnonymousClass1.INSTANCE));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class)), LazyKt.lazy(new Function0<CoroutineExceptionHandler>() {
            public final CoroutineExceptionHandler invoke() {
                return ServiceProvider.INSTANCE.provideSDKErrorHandler((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), LazyKt.lazy(new Function0<CoroutineScope>() {
            public final CoroutineScope invoke() {
                return ServiceProvider.INSTANCE.provideSDKScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new Function0<InitializeStateNetworkError>() {
            public final InitializeStateNetworkError invoke() {
                return new InitializeStateNetworkError((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateLoadConfigFile.class)), LazyKt.lazy(new Function0<InitializeStateLoadConfigFile>() {
            public final InitializeStateLoadConfigFile invoke() {
                return new InitializeStateLoadConfigFile((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateReset.class)), LazyKt.lazy(new Function0<InitializeStateReset>() {
            public final InitializeStateReset invoke() {
                return new InitializeStateReset((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateError.class)), LazyKt.lazy(new Function0<InitializeStateError>() {
            public final InitializeStateError invoke() {
                return new InitializeStateError((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateInitModules.class)), LazyKt.lazy(new Function0<InitializeStateInitModules>() {
            public final InitializeStateInitModules invoke() {
                return new InitializeStateInitModules((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateConfigWithLoader.class)), LazyKt.lazy(new Function0<InitializeStateConfigWithLoader>() {
            public final InitializeStateConfigWithLoader invoke() {
                return new InitializeStateConfigWithLoader((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (InitializeStateNetworkError) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateNetworkError.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateConfig.class)), LazyKt.lazy(new Function0<InitializeStateConfig>() {
            public final InitializeStateConfig invoke() {
                return new InitializeStateConfig((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateConfigWithLoader.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateCreate.class)), LazyKt.lazy(new Function0<InitializeStateCreate>() {
            public final InitializeStateCreate invoke() {
                return new InitializeStateCreate((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateLoadCache.class)), LazyKt.lazy(new Function0<InitializeStateLoadCache>() {
            public final InitializeStateLoadCache invoke() {
                return new InitializeStateLoadCache((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateCreateWithRemote.class)), LazyKt.lazy(new Function0<InitializeStateCreateWithRemote>() {
            public final InitializeStateCreateWithRemote invoke() {
                return new InitializeStateCreateWithRemote((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateLoadWeb.class)), LazyKt.lazy(new Function0<InitializeStateLoadWeb>() {
            public final InitializeStateLoadWeb invoke() {
                return new InitializeStateLoadWeb((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (InitializeStateNetworkError) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateNetworkError.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateComplete.class)), LazyKt.lazy(new Function0<InitializeStateComplete>() {
            public final InitializeStateComplete invoke() {
                return new InitializeStateComplete((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeSDK.class)), LazyKt.lazy(new Function0<InitializeSDK>() {
            public final InitializeSDK invoke() {
                return new InitializeSDK((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (InitializeStateLoadConfigFile) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateLoadConfigFile.class))), (InitializeStateReset) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateReset.class))), (InitializeStateError) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateError.class))), (InitializeStateInitModules) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateInitModules.class))), (InitializeStateConfig) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateConfig.class))), (InitializeStateCreate) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateCreate.class))), (InitializeStateLoadCache) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateLoadCache.class))), (InitializeStateCreateWithRemote) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateCreateWithRemote.class))), (InitializeStateLoadWeb) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateLoadWeb.class))), (InitializeStateComplete) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeStateComplete.class))));
            }
        }));
    }
}
