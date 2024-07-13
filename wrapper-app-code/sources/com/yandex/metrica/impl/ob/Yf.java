package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.StackTraceItem;
import java.util.Collection;

public class Yf implements IPluginReporter {

    /* renamed from: a  reason: collision with root package name */
    private final Kn<PluginErrorDetails> f5381a = new Hn(new Gn("Error details"));

    /* renamed from: b  reason: collision with root package name */
    private final Kn<String> f5382b = new Hn(new Fn("Error identifier"));

    /* renamed from: c  reason: collision with root package name */
    private final Kn<Collection<StackTraceItem>> f5383c = new En("Stacktrace");

    public boolean a(PluginErrorDetails pluginErrorDetails, String str) {
        this.f5381a.a(pluginErrorDetails);
        return this.f5383c.a(pluginErrorDetails.getStacktrace()).b();
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.f5381a.a(pluginErrorDetails);
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f5381a.a(pluginErrorDetails);
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f5382b.a(str);
    }
}
