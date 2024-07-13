package com.yandex.metrica.impl.ob;

import android.util.Log;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.f;
import com.yandex.metrica.plugins.PluginErrorDetails;
import kotlin.jvm.internal.Intrinsics;

public final class Tf {

    /* renamed from: a  reason: collision with root package name */
    private final ICommonExecutor f5020a;

    /* renamed from: b  reason: collision with root package name */
    private final Sf f5021b;

    /* renamed from: c  reason: collision with root package name */
    private final Kf f5022c;

    /* renamed from: d  reason: collision with root package name */
    private final Xf f5023d;

    /* renamed from: e  reason: collision with root package name */
    private final f f5024e;

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Tf f5025a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f5026b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f5027c;

        a(Tf tf, PluginErrorDetails pluginErrorDetails, String str) {
            this.f5025a = tf;
            this.f5026b = pluginErrorDetails;
            this.f5027c = str;
        }

        public final void run() {
            Tf.a(this.f5025a).getPluginExtension().reportError(this.f5026b, this.f5027c);
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Tf f5028a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5029b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f5030c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f5031d;

        b(Tf tf, String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f5028a = tf;
            this.f5029b = str;
            this.f5030c = str2;
            this.f5031d = pluginErrorDetails;
        }

        public final void run() {
            Tf.a(this.f5028a).getPluginExtension().reportError(this.f5029b, this.f5030c, this.f5031d);
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Tf f5032a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f5033b;

        c(Tf tf, PluginErrorDetails pluginErrorDetails) {
            this.f5032a = tf;
            this.f5033b = pluginErrorDetails;
        }

        public final void run() {
            Tf.a(this.f5032a).getPluginExtension().reportUnhandledException(this.f5033b);
        }
    }

    public Tf(ICommonExecutor iCommonExecutor, Sf sf, Kf kf, Xf xf, f fVar) {
        this.f5020a = iCommonExecutor;
        this.f5021b = sf;
        this.f5022c = kf;
        this.f5023d = xf;
        this.f5024e = fVar;
    }

    public final void a(PluginErrorDetails pluginErrorDetails) {
        this.f5022c.a(null);
        this.f5023d.a().reportUnhandledException(pluginErrorDetails);
        f fVar = this.f5024e;
        Intrinsics.checkNotNull(pluginErrorDetails);
        fVar.getClass();
        this.f5020a.execute(new c(this, pluginErrorDetails));
    }

    public Tf(ICommonExecutor iCommonExecutor) {
        this(iCommonExecutor, new Sf());
    }

    private Tf(ICommonExecutor iCommonExecutor, Sf sf) {
        this(iCommonExecutor, sf, new Kf(sf), new Xf(), new f(sf, new D2()));
    }

    public final void a(PluginErrorDetails pluginErrorDetails, String str) {
        this.f5022c.a(null);
        if (!this.f5023d.a().a(pluginErrorDetails, str)) {
            Log.w("AppMetrica", "Error stacktrace must be non empty");
            return;
        }
        f fVar = this.f5024e;
        Intrinsics.checkNotNull(pluginErrorDetails);
        fVar.getClass();
        this.f5020a.execute(new a(this, pluginErrorDetails, str));
    }

    public final void a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f5022c.a(null);
        this.f5023d.a().reportError(str, str2, pluginErrorDetails);
        f fVar = this.f5024e;
        Intrinsics.checkNotNull(str);
        fVar.getClass();
        this.f5020a.execute(new b(this, str, str2, pluginErrorDetails));
    }

    public static final K0 a(Tf tf) {
        tf.f5021b.getClass();
        R2 k = R2.k();
        Intrinsics.checkNotNull(k);
        Intrinsics.checkNotNullExpressionValue(k, "provider.peekInitializedImpl()!!");
        C0493k1 d2 = k.d();
        Intrinsics.checkNotNull(d2);
        Intrinsics.checkNotNullExpressionValue(d2, "provider.peekInitialized…rterApiConsumerProvider!!");
        K0 b2 = d2.b();
        Intrinsics.checkNotNullExpressionValue(b2, "provider.peekInitialized…erProvider!!.mainReporter");
        return b2;
    }
}
