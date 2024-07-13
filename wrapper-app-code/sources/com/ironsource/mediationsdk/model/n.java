package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;

public final class n {

    /* renamed from: b  reason: collision with root package name */
    private static n f8787b;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<NetworkSettings> f8788a = new ArrayList<>();

    private n() {
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            if (f8787b == null) {
                f8787b = new n();
            }
            nVar = f8787b;
        }
        return nVar;
    }

    public final NetworkSettings a(String str) {
        Iterator<NetworkSettings> it = this.f8788a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.getProviderName().equals(str)) {
                return next;
            }
        }
        NetworkSettings networkSettings = new NetworkSettings(str);
        a(networkSettings);
        return networkSettings;
    }

    public final void a(NetworkSettings networkSettings) {
        this.f8788a.add(networkSettings);
    }

    public final void b() {
        Iterator<NetworkSettings> it = this.f8788a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.isMultipleInstances() && !TextUtils.isEmpty(next.getProviderTypeForReflection())) {
                NetworkSettings a2 = a(next.getProviderDefaultInstance());
                next.setApplicationSettings(IronSourceUtils.mergeJsons(next.getApplicationSettings(), a2.getApplicationSettings()));
                next.setInterstitialSettings(IronSourceUtils.mergeJsons(next.getInterstitialSettings(), a2.getInterstitialSettings()));
                next.setRewardedVideoSettings(IronSourceUtils.mergeJsons(next.getRewardedVideoSettings(), a2.getRewardedVideoSettings()));
                next.setBannerSettings(IronSourceUtils.mergeJsons(next.getBannerSettings(), a2.getBannerSettings()));
            }
        }
    }

    public final boolean b(String str) {
        Iterator<NetworkSettings> it = this.f8788a.iterator();
        while (it.hasNext()) {
            if (it.next().getProviderName().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
