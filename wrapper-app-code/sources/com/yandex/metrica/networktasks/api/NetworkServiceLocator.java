package com.yandex.metrica.networktasks.api;

public final class NetworkServiceLocator implements NetworkServiceLifecycleObserver {

    /* renamed from: b  reason: collision with root package name */
    private static volatile NetworkServiceLocator f7309b;

    /* renamed from: a  reason: collision with root package name */
    private NetworkCore f7310a;

    private NetworkServiceLocator() {
    }

    public static NetworkServiceLocator getInstance() {
        return f7309b;
    }

    public static void init() {
        if (f7309b == null) {
            synchronized (NetworkServiceLocator.class) {
                if (f7309b == null) {
                    f7309b = new NetworkServiceLocator();
                }
            }
        }
    }

    public NetworkCore getNetworkCore() {
        return this.f7310a;
    }

    public void initAsync() {
        if (this.f7310a == null) {
            synchronized (this) {
                if (this.f7310a == null) {
                    NetworkCore networkCore = new NetworkCore();
                    this.f7310a = networkCore;
                    networkCore.setName("YMM-NC");
                    this.f7310a.start();
                }
            }
        }
    }

    public void onCreate() {
    }

    public void onDestroy() {
        NetworkCore networkCore = this.f7310a;
        if (networkCore != null) {
            networkCore.onDestroy();
        }
    }
}
