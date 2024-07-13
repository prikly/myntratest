package com.appodeal.ads.adapters.bidmachine;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.appodeal.ads.AppodealStateParams;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.networking.LoadingError;
import com.explorestack.iab.mraid.MraidLog;
import com.explorestack.iab.vast.VastLog;
import io.bidmachine.BidMachine;
import io.bidmachine.InitializationCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: BidMachineInitializer */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final b f16224d = new b();

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f16225a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16226b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16227c = false;

    /* compiled from: BidMachineInitializer */
    public interface a {
        void onInitializationFailed(LoadingError loadingError);

        void onInitializationFinished();
    }

    public static b a() {
        return f16224d;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        a((LoadingError) null);
    }

    public final void a(Context context, JSONObject jSONObject, AppodealStateParams appodealStateParams, a aVar) {
        if (jSONObject == null) {
            aVar.onInitializationFailed(LoadingError.InternalError);
            return;
        }
        MraidLog.addLogListener(c.a());
        VastLog.addLogListener(c.a());
        RestrictedData restrictedData = appodealStateParams.getRestrictedData();
        if (restrictedData.isUserInGdprScope()) {
            BidMachine.setSubjectToGDPR(Boolean.TRUE);
            BidMachine.setConsentConfig(restrictedData.isUserHasConsent(), restrictedData.getIabConsentString());
        }
        if (restrictedData.isUserInCcpaScope()) {
            String uSPrivacyString = restrictedData.getUSPrivacyString();
            if (!TextUtils.isEmpty(uSPrivacyString)) {
                BidMachine.setUSPrivacyString(uSPrivacyString);
            }
        }
        if (restrictedData.isUserAgeRestricted()) {
            BidMachine.setCoppa(Boolean.TRUE);
        }
        BidMachine.setTargetingParams(c.a(context, jSONObject, appodealStateParams.getRestrictedData()));
        BidMachine.setLoggingEnabled(appodealStateParams.isTestMode());
        BidMachine.setTestMode(appodealStateParams.isTestMode());
        synchronized (b.class) {
            if (this.f16227c) {
                aVar.onInitializationFinished();
            } else {
                if (this.f16225a == null) {
                    this.f16225a = new ArrayList();
                }
                this.f16225a.add(aVar);
            }
        }
        if (!this.f16226b) {
            this.f16226b = true;
            a(context, jSONObject);
        }
    }

    public final void a(Context context, JSONObject jSONObject) {
        if (BidMachine.isInitialized()) {
            a((LoadingError) null);
            return;
        }
        String optString = jSONObject.optString("seller_id");
        if (TextUtils.isEmpty(optString)) {
            a(LoadingError.IncorrectAdunit);
            return;
        }
        String optString2 = jSONObject.optString("endpoint");
        if (!TextUtils.isEmpty(optString2)) {
            BidMachine.setEndpoint(optString2);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("mediation_config");
        if (optJSONArray != null) {
            BidMachine.registerNetworks(context, optJSONArray.toString());
        }
        BidMachine.initialize(context, optString, new InitializationCallback() {
            public final void onInitialized() {
                b.this.b();
            }
        });
    }

    public final void a(LoadingError loadingError) {
        ArrayList arrayList;
        this.f16227c = loadingError == null;
        this.f16226b = false;
        if (this.f16225a != null) {
            synchronized (b.class) {
                arrayList = new ArrayList(this.f16225a);
            }
            new Handler(Looper.getMainLooper()).post(new Runnable(arrayList, loadingError) {
                public final /* synthetic */ List f$1;
                public final /* synthetic */ LoadingError f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    b.this.a(this.f$1, this.f$2);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list, LoadingError loadingError) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (this.f16227c) {
                aVar.onInitializationFinished();
            } else {
                aVar.onInitializationFailed(loadingError);
            }
        }
        synchronized (b.class) {
            this.f16225a.removeAll(list);
        }
    }
}
