package com.appodeal.ads.adapters.bidmachine;

import android.content.Context;
import com.appodeal.ads.ApdService;
import com.appodeal.ads.ApdServiceInitParams;
import com.appodeal.ads.ApdServiceInitializationListener;
import com.appodeal.ads.AppodealNetworks;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.adapters.bidmachine.b;
import com.appodeal.ads.networking.LoadingError;
import io.bidmachine.BidMachine;

/* compiled from: ApdBidMachineService */
public final class a extends ApdService {

    /* renamed from: com.appodeal.ads.adapters.bidmachine.a$a  reason: collision with other inner class name */
    /* compiled from: ApdBidMachineService */
    public class C0166a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ApdServiceInitializationListener f16223a;

        public C0166a(ApdServiceInitializationListener apdServiceInitializationListener) {
            this.f16223a = apdServiceInitializationListener;
        }

        public final void onInitializationFailed(LoadingError loadingError) {
            this.f16223a.onInitializationFailed(loadingError);
        }

        public final void onInitializationFinished() {
            this.f16223a.onInitializationFinished();
        }
    }

    public a() {
        super(AppodealNetworks.BIDMACHINE, BuildConfig.ADAPTER_VERSION);
    }

    public final void onInitialize(Context context, ApdServiceInitParams apdServiceInitParams, ApdServiceInitializationListener apdServiceInitializationListener) throws Throwable {
        if (apdServiceInitParams.getJsonData() == null) {
            apdServiceInitializationListener.onInitializationFailed(LoadingError.IncorrectAdunit);
            return;
        }
        b.a().a(context, apdServiceInitParams.getJsonData(), apdServiceInitParams, new C0166a(apdServiceInitializationListener));
    }

    public final void setLogging(boolean z) {
        BidMachine.setLoggingEnabled(z);
    }
}
