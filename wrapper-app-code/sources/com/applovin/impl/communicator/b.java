package com.applovin.impl.communicator;

import android.content.Context;
import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.v;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private boolean f14354a = true;

    /* renamed from: b  reason: collision with root package name */
    private final String f14355b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<AppLovinCommunicatorSubscriber> f14356c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<String> f14357d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    private final Object f14358e = new Object();

    b(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f14355b = str;
        this.f14356c = new WeakReference<>(appLovinCommunicatorSubscriber);
    }

    public String a() {
        return this.f14355b;
    }

    public void a(boolean z) {
        this.f14354a = z;
    }

    public AppLovinCommunicatorSubscriber b() {
        return (AppLovinCommunicatorSubscriber) this.f14356c.get();
    }

    public boolean c() {
        return this.f14354a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f14356c.get();
        b bVar = (b) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) bVar.f14356c.get();
        if (a().equals(bVar.a())) {
            if (appLovinCommunicatorSubscriber != null) {
                if (appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2)) {
                    return true;
                }
            } else if (appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f14355b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f14356c.get();
        return (hashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if (b() == null) {
            v.i("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        boolean z = false;
        synchronized (this.f14358e) {
            if (!this.f14357d.contains(communicatorMessageImpl.getUniqueId())) {
                this.f14357d.add(communicatorMessageImpl.getUniqueId());
                z = true;
            }
        }
        if (z) {
            b().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }
}
