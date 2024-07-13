package io.bidmachine.ads.networks.adcolony;

import android.text.TextUtils;
import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyReward;
import com.adcolony.sdk.AdColonyRewardListener;
import java.util.ArrayList;
import java.util.List;

class AdColonyRewardListenerWrapper implements AdColonyRewardListener {
    private static volatile AdColonyRewardListenerWrapper instance;
    private final List<AdColonyFullscreenAdListener> listeners = new ArrayList();

    AdColonyRewardListenerWrapper() {
    }

    static AdColonyRewardListenerWrapper get() {
        if (instance == null) {
            synchronized (AdColonyRewardListenerWrapper.class) {
                if (instance == null) {
                    instance = new AdColonyRewardListenerWrapper();
                    AdColony.setRewardListener(instance);
                }
            }
        }
        return instance;
    }

    /* access modifiers changed from: package-private */
    public void addListener(AdColonyFullscreenAdListener adColonyFullscreenAdListener) {
        this.listeners.add(adColonyFullscreenAdListener);
    }

    /* access modifiers changed from: package-private */
    public void removeListener(AdColonyFullscreenAdListener adColonyFullscreenAdListener) {
        this.listeners.remove(adColonyFullscreenAdListener);
    }

    public void onReward(AdColonyReward adColonyReward) {
        for (AdColonyFullscreenAdListener next : this.listeners) {
            if (TextUtils.equals(adColonyReward.getZoneID(), next.getZoneId())) {
                next.onReward(adColonyReward);
            }
        }
    }
}
