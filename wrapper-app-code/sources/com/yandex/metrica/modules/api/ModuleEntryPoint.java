package com.yandex.metrica.modules.api;

public interface ModuleEntryPoint {
    String getIdentifier();

    RemoteConfigExtensionConfiguration getRemoteConfigExtensionConfiguration();
}
