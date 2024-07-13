package com.appodeal.ads;

import android.app.Activity;
import com.appodeal.ads.c1;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;

public final class d1 extends AdNetwork<b> {

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ContextProvider f16365a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ r f16366b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ u f16367c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ NetworkInitializationListener f16368d;

        /* renamed from: com.appodeal.ads.d1$a$a  reason: collision with other inner class name */
        public class C0182a implements c1.a {
            public C0182a() {
            }
        }

        public a(ContextProvider contextProvider, r rVar, u uVar, NetworkInitializationListener networkInitializationListener) {
            this.f16365a = contextProvider;
            this.f16366b = rVar;
            this.f16367c = uVar;
            this.f16368d = networkInitializationListener;
        }

        public final void run() {
            Activity value = this.f16365a.getTopActivityFlow().getValue();
            if (value != null) {
                c1.a(value, this.f16366b, new C0182a());
            } else {
                this.f16368d.onInitializationFailed(LoadingError.InternalError);
            }
        }
    }

    public static final class b {
    }

    public static class c extends AdNetworkBuilder {
        public final AdNetwork build() {
            return new d1(this);
        }

        public final String getAdapterVersion() {
            return "1";
        }

        public final String getName() {
            return Constants.DEBUG_INTERSTITIAL;
        }
    }

    public d1(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    public final String getVersion() {
        return "1";
    }

    public final void initialize(ContextProvider contextProvider, AdUnit adUnit, AdNetworkMediationParams adNetworkMediationParams, NetworkInitializationListener<b> networkInitializationListener) {
        u uVar = null;
        r rVar = adNetworkMediationParams instanceof h ? ((h) adNetworkMediationParams).f16441a : null;
        if (rVar == null) {
            networkInitializationListener.onInitializationFailed(LoadingError.AdTypeNotSupportedInAdapter);
            return;
        }
        if (rVar instanceof r1) {
            uVar = o1.a();
        } else if (rVar instanceof w0) {
            uVar = t0.a();
        } else if (rVar instanceof t2) {
            uVar = Native.a();
        } else if (rVar instanceof k2) {
            uVar = h2.a();
        } else if (rVar instanceof q5) {
            uVar = w2.a();
        } else if (rVar instanceof n4) {
            uVar = o4.a();
        }
        if (uVar == null) {
            networkInitializationListener.onInitializationFailed(LoadingError.AdTypeNotSupportedInAdapter);
            return;
        }
        h5.f16458a.post(new a(contextProvider, rVar, uVar, networkInitializationListener));
        networkInitializationListener.onInitializationFinished(new b());
    }

    public final void setLogging(boolean z) {
    }
}
