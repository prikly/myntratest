package com.yandex.metrica.rtm.wrapper;

import com.yandex.metrica.rtm.client.DataSender;
import com.yandex.metrica.rtm.client.ReporterDescriptor;

public class g implements d {

    /* renamed from: a  reason: collision with root package name */
    private final DataSender f7387a;

    public g(k kVar, String str, boolean z) throws Throwable {
        this(new b(new DataSender(new m(kVar), new ReporterDescriptor(str, z))));
    }

    g(b bVar) throws Throwable {
        this.f7387a = bVar.a();
    }
}
