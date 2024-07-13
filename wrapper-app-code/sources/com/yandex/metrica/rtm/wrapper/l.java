package com.yandex.metrica.rtm.wrapper;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.rtm.service.EventToReporterProxy;
import java.util.concurrent.Executor;

public class l implements f {

    /* renamed from: a  reason: collision with root package name */
    private final EventToReporterProxy f7389a;

    public l(i iVar, Context context, Executor executor, j jVar) {
        this(new EventToReporterProxy(new a(iVar), context, executor, new c(jVar)));
    }

    public void reportData(Bundle bundle) {
        try {
            this.f7389a.reportData(bundle);
        } catch (Throwable unused) {
        }
    }

    l(EventToReporterProxy eventToReporterProxy) {
        this.f7389a = eventToReporterProxy;
    }
}
