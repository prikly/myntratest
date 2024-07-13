package com.appodeal.ads.adapters.meta;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import com.facebook.ads.AudienceNetworkAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f16253a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16254b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16255c = false;

    /* renamed from: com.appodeal.ads.adapters.meta.a$a  reason: collision with other inner class name */
    public interface C0173a {
        void a();

        void b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list, AudienceNetworkAds.InitResult initResult) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0173a aVar = (C0173a) it.next();
            if (initResult.isSuccess()) {
                aVar.b();
            } else {
                aVar.a();
            }
        }
        synchronized (a.class) {
            this.f16253a.removeAll(list);
        }
    }

    public final void a(Context context, String str, MetaNetwork.a aVar) {
        synchronized (a.class) {
            if (this.f16255c) {
                aVar.b();
            } else {
                if (this.f16253a == null) {
                    this.f16253a = new ArrayList();
                }
                this.f16253a.add(aVar);
            }
        }
        if (!this.f16254b) {
            this.f16254b = true;
            AudienceNetworkAds.InitSettingsBuilder buildInitSettings = AudienceNetworkAds.buildInitSettings(context);
            if (!TextUtils.isEmpty(str)) {
                buildInitSettings.withMediationService(str);
            }
            buildInitSettings.withInitListener(new AudienceNetworkAds.InitListener(context) {
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
                    a.this.a(this.f$1, initResult);
                }
            }).initialize();
        }
    }

    public final boolean a() {
        return this.f16255c;
    }

    /* renamed from: b */
    public final void a(Context context, AudienceNetworkAds.InitResult initResult) {
        ArrayList arrayList;
        Log.log(LogConstants.KEY_NETWORK, "Log", String.format("Meta %s", new Object[]{initResult.getMessage()}));
        this.f16255c = initResult.isSuccess();
        this.f16254b = false;
        if (this.f16253a != null) {
            synchronized (a.class) {
                arrayList = new ArrayList(this.f16253a);
            }
            new Handler(context.getMainLooper()).post(new Runnable(arrayList, initResult) {
                public final /* synthetic */ List f$1;
                public final /* synthetic */ AudienceNetworkAds.InitResult f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    a.this.a(this.f$1, this.f$2);
                }
            });
        }
    }
}
