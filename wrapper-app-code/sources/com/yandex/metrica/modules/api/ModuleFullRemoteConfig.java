package com.yandex.metrica.modules.api;

import kotlin.jvm.internal.Intrinsics;

public final class ModuleFullRemoteConfig {

    /* renamed from: a  reason: collision with root package name */
    private final CommonIdentifiers f7254a;

    /* renamed from: b  reason: collision with root package name */
    private final RemoteConfigMetaInfo f7255b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f7256c;

    public ModuleFullRemoteConfig(CommonIdentifiers commonIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        Intrinsics.checkNotNullParameter(commonIdentifiers, "commonIdentifiers");
        Intrinsics.checkNotNullParameter(remoteConfigMetaInfo, "remoteConfigMetaInfo");
        this.f7254a = commonIdentifiers;
        this.f7255b = remoteConfigMetaInfo;
        this.f7256c = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleFullRemoteConfig)) {
            return false;
        }
        ModuleFullRemoteConfig moduleFullRemoteConfig = (ModuleFullRemoteConfig) obj;
        return Intrinsics.areEqual((Object) this.f7254a, (Object) moduleFullRemoteConfig.f7254a) && Intrinsics.areEqual((Object) this.f7255b, (Object) moduleFullRemoteConfig.f7255b) && Intrinsics.areEqual(this.f7256c, moduleFullRemoteConfig.f7256c);
    }

    public int hashCode() {
        CommonIdentifiers commonIdentifiers = this.f7254a;
        int i = 0;
        int hashCode = (commonIdentifiers != null ? commonIdentifiers.hashCode() : 0) * 31;
        RemoteConfigMetaInfo remoteConfigMetaInfo = this.f7255b;
        int hashCode2 = (hashCode + (remoteConfigMetaInfo != null ? remoteConfigMetaInfo.hashCode() : 0)) * 31;
        Object obj = this.f7256c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ModuleFullRemoteConfig(commonIdentifiers=" + this.f7254a + ", remoteConfigMetaInfo=" + this.f7255b + ", moduleConfig=" + this.f7256c + ")";
    }
}
