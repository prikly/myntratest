package com.yandex.metrica.impl.ob;

import android.util.Log;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.f;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;

public class Nf implements IPluginReporter {

    /* renamed from: a  reason: collision with root package name */
    private final Yf f4610a;

    /* renamed from: b  reason: collision with root package name */
    private final f f4611b;

    /* renamed from: c  reason: collision with root package name */
    private final ICommonExecutor f4612c;

    /* renamed from: d  reason: collision with root package name */
    private final C0663qm<M0> f4613d;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f4614a;

        a(PluginErrorDetails pluginErrorDetails) {
            this.f4614a = pluginErrorDetails;
        }

        public void run() {
            Nf.a(Nf.this).reportUnhandledException(this.f4614a);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f4616a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f4617b;

        b(PluginErrorDetails pluginErrorDetails, String str) {
            this.f4616a = pluginErrorDetails;
            this.f4617b = str;
        }

        public void run() {
            Nf.a(Nf.this).reportError(this.f4616a, this.f4617b);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4619a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f4620b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f4621c;

        c(String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f4619a = str;
            this.f4620b = str2;
            this.f4621c = pluginErrorDetails;
        }

        public void run() {
            Nf.a(Nf.this).reportError(this.f4619a, this.f4620b, this.f4621c);
        }
    }

    public Nf(Yf yf, f fVar, ICommonExecutor iCommonExecutor, C0663qm<M0> qmVar) {
        this.f4610a = yf;
        this.f4611b = fVar;
        this.f4612c = iCommonExecutor;
        this.f4613d = qmVar;
    }

    static IPluginReporter a(Nf nf) {
        return nf.f4613d.a().getPluginExtension();
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        if (!this.f4610a.a(pluginErrorDetails, str)) {
            Log.w("AppMetrica", "Error stacktrace must be non empty");
            return;
        }
        this.f4611b.getClass();
        this.f4612c.execute(new b(pluginErrorDetails, str));
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f4610a.reportUnhandledException(pluginErrorDetails);
        this.f4611b.getClass();
        this.f4612c.execute(new a(pluginErrorDetails));
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f4610a.reportError(str, str2, pluginErrorDetails);
        this.f4611b.getClass();
        this.f4612c.execute(new c(str, str2, pluginErrorDetails));
    }
}
