package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.YandexMetricaPlugins;

public final class V2 implements YandexMetricaPlugins {

    /* renamed from: a  reason: collision with root package name */
    private final Tf f5205a;

    public V2(Tf tf) {
        this.f5205a = tf;
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.f5205a.a(pluginErrorDetails, str);
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f5205a.a(pluginErrorDetails);
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f5205a.a(str, str2, pluginErrorDetails);
    }
}
