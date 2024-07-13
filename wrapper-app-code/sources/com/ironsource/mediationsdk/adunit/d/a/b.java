package com.ironsource.mediationsdk.adunit.d.a;

import com.ironsource.mediationsdk.H;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.c.a.c;
import com.ironsource.mediationsdk.adunit.d.a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.f;
import java.util.HashMap;

public class b<Listener extends c> extends a<Listener> implements AdapterAdRewardListener {

    /* renamed from: g  reason: collision with root package name */
    private f f8532g;

    public b(a aVar, BaseAdInteractionAdapter<?, AdapterAdRewardListener> baseAdInteractionAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
    }

    public void onAdClosed() {
        this.f8532g = new f();
        super.onAdClosed();
    }

    public void onAdOpened() {
        this.f8532g = null;
        super.onAdOpened();
    }

    public void onAdRewarded() {
        if (this.f8537e != null) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(c("placement name = " + q()));
            if (this.f8535c != null) {
                HashMap hashMap = new HashMap();
                if (H.a().n != null) {
                    for (String next : H.a().n.keySet()) {
                        hashMap.put("custom_" + next, H.a().n.get(next));
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                this.f8535c.f8473d.a(q(), this.f8537e.getRewardName(), this.f8537e.getRewardAmount(), currentTimeMillis, IronSourceUtils.getTransId(currentTimeMillis, k()), f.a(this.f8532g), hashMap, H.a().m);
            }
            ((c) this.f8534b).a(this, this.f8537e);
            return;
        }
        IronLog.INTERNAL.verbose(c("placement is null "));
        if (this.f8535c != null) {
            this.f8535c.f8474e.l("mCurrentPlacement is null");
        }
    }
}
