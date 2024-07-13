package com.unity3d.services.core.di;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\r\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/unity3d/services/core/di/ServiceKey;", "", "named", "", "instanceClass", "Lkotlin/reflect/KClass;", "(Ljava/lang/String;Lkotlin/reflect/KClass;)V", "getInstanceClass", "()Lkotlin/reflect/KClass;", "getNamed", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "unity-ads_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ServiceKey.kt */
public final class ServiceKey {
    private final KClass<?> instanceClass;
    private final String named;

    public static /* synthetic */ ServiceKey copy$default(ServiceKey serviceKey, String str, KClass<?> kClass, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceKey.named;
        }
        if ((i & 2) != 0) {
            kClass = serviceKey.instanceClass;
        }
        return serviceKey.copy(str, kClass);
    }

    public final String component1() {
        return this.named;
    }

    public final KClass<?> component2() {
        return this.instanceClass;
    }

    public final ServiceKey copy(String str, KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(str, "named");
        Intrinsics.checkNotNullParameter(kClass, "instanceClass");
        return new ServiceKey(str, kClass);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceKey)) {
            return false;
        }
        ServiceKey serviceKey = (ServiceKey) obj;
        return Intrinsics.areEqual((Object) this.named, (Object) serviceKey.named) && Intrinsics.areEqual((Object) this.instanceClass, (Object) serviceKey.instanceClass);
    }

    public int hashCode() {
        String str = this.named;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        KClass<?> kClass = this.instanceClass;
        if (kClass != null) {
            i = kClass.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ServiceKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ")";
    }

    public ServiceKey(String str, KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(str, "named");
        Intrinsics.checkNotNullParameter(kClass, "instanceClass");
        this.named = str;
        this.instanceClass = kClass;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceKey(String str, KClass kClass, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, kClass);
    }

    public final String getNamed() {
        return this.named;
    }

    public final KClass<?> getInstanceClass() {
        return this.instanceClass;
    }
}
