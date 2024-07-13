package com.unity3d.services.core.di;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"Lcom/unity3d/services/core/di/IServiceComponent;", "", "getServiceProvider", "Lcom/unity3d/services/core/di/IServiceProvider;", "unity-ads_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: IServiceComponent.kt */
public interface IServiceComponent {
    IServiceProvider getServiceProvider();

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* compiled from: IServiceComponent.kt */
    public static final class DefaultImpls {
        public static IServiceProvider getServiceProvider(IServiceComponent iServiceComponent) {
            return ServiceProvider.INSTANCE;
        }
    }
}
