package com.unity3d.services.core.di;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0000\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"registry", "Lcom/unity3d/services/core/di/ServicesRegistry;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "unity-ads_release"}, k = 2, mv = {1, 4, 2})
/* compiled from: ServicesRegistry.kt */
public final class ServicesRegistryKt {
    public static final ServicesRegistry registry(Function1<? super ServicesRegistry, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "registry");
        ServicesRegistry servicesRegistry = new ServicesRegistry();
        function1.invoke(servicesRegistry);
        return servicesRegistry;
    }
}
