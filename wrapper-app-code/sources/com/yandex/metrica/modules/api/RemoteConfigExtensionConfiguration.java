package com.yandex.metrica.modules.api;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.core.api.JsonParser;
import java.util.List;
import java.util.Map;

public interface RemoteConfigExtensionConfiguration {
    Map getBlocks();

    List getFeatures();

    JsonParser getJsonParser();

    Converter getProtobufConverter();

    RemoteConfigUpdateListener getRemoteConfigUpdateListener();
}
