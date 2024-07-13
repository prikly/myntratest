package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.PluginErrorDetails;

/* renamed from: com.yandex.metrica.impl.ob.s6  reason: case insensitive filesystem */
public final class C0694s6 {

    /* renamed from: a  reason: collision with root package name */
    private final A0 f6774a;

    public C0694s6(A0 a0) {
        this.f6774a = a0;
    }

    public final H6 a(PluginErrorDetails pluginErrorDetails) {
        return I6.a(pluginErrorDetails.getExceptionClass(), pluginErrorDetails.getMessage(), pluginErrorDetails.getStacktrace(), pluginErrorDetails.getPlatform(), pluginErrorDetails.getVirtualMachineVersion(), pluginErrorDetails.getPluginEnvironment(), this.f6774a.a(), this.f6774a.b());
    }
}
