package com.yandex.metrica.impl.ob;

import com.yandex.metrica.modules.api.CommonIdentifiers;
import com.yandex.metrica.modules.api.ModuleFullRemoteConfig;
import com.yandex.metrica.modules.api.RemoteConfigMetaInfo;

/* renamed from: com.yandex.metrica.impl.ob.id  reason: case insensitive filesystem */
public final class C0456id {

    /* renamed from: a  reason: collision with root package name */
    private final CommonIdentifiers f5986a;

    /* renamed from: b  reason: collision with root package name */
    private final RemoteConfigMetaInfo f5987b;

    /* renamed from: c  reason: collision with root package name */
    private final C0635pi f5988c;

    public C0456id(C0635pi piVar) {
        this.f5988c = piVar;
        this.f5986a = new CommonIdentifiers(piVar.V(), piVar.i());
        this.f5987b = new RemoteConfigMetaInfo(piVar.o(), piVar.B());
    }

    public final ModuleFullRemoteConfig<Object> a(String str) {
        return new ModuleFullRemoteConfig(this.f5986a, this.f5987b, this.f5988c.A().get(str));
    }
}
