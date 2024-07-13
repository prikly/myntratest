package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;
import com.yandex.metrica.gpllibrary.a;
import com.yandex.metrica.gpllibrary.b;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.dc  reason: case insensitive filesystem */
public class C0330dc extends Dc<C0305cc> {

    /* renamed from: f  reason: collision with root package name */
    private final b f5657f;

    public C0330dc(Context context, Pc pc, IHandlerExecutor iHandlerExecutor, C0845yd ydVar) {
        this(context, pc, iHandlerExecutor, ydVar, new G1());
    }

    public boolean a(Object obj) {
        C0305cc ccVar = (C0305cc) obj;
        if (ccVar.f5615b != null && this.f3870b.a(this.f3869a)) {
            try {
                this.f5657f.startLocationUpdates(ccVar.f5615b.f5475a);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public void b() {
        if (this.f3870b.a(this.f3869a)) {
            try {
                this.f5657f.updateLastKnownLocation();
            } catch (Throwable unused) {
            }
        }
    }

    private C0330dc(Context context, Pc pc, IHandlerExecutor iHandlerExecutor, C0845yd ydVar, G1 g1) {
        this(context, iHandlerExecutor, (LocationListener) new C0868zc(pc), g1.a(ydVar));
    }

    public void a() {
        try {
            this.f5657f.stopLocationUpdates();
        } catch (Throwable unused) {
        }
    }

    private static b a(Context context, LocationListener locationListener, IHandlerExecutor iHandlerExecutor) {
        if (C0420h2.a("com.google.android.gms.location.LocationRequest")) {
            try {
                return new a(context, locationListener, iHandlerExecutor.getLooper(), (Executor) iHandlerExecutor, Dc.f3868e);
            } catch (Throwable unused) {
            }
        }
        return new Tb();
    }

    C0330dc(Context context, IHandlerExecutor iHandlerExecutor, LocationListener locationListener, C0869zd zdVar) {
        this(context, iHandlerExecutor.getLooper(), locationListener, zdVar, a(context, locationListener, iHandlerExecutor));
    }

    C0330dc(Context context, Looper looper, LocationListener locationListener, C0869zd zdVar, b bVar) {
        super(context, locationListener, zdVar, looper);
        this.f5657f = bVar;
    }
}
