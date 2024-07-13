package com.appodeal.ads.modules.libs.network;

import android.content.Context;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0011J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/NetworkStateObserver;", "", "networkStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/appodeal/ads/modules/libs/network/NetworkState;", "getNetworkStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "init", "", "applicationContext", "Landroid/content/Context;", "isConnected", "", "subscribe", "listener", "Lcom/appodeal/ads/modules/libs/network/NetworkStateObserver$ConnectionListener;", "unsubscribe", "ConnectionListener", "apd_network"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface NetworkStateObserver {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/NetworkStateObserver$ConnectionListener;", "", "onConnectionUpdated", "", "isConnected", "", "apd_network"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface ConnectionListener {
        void onConnectionUpdated(boolean z);
    }

    StateFlow<NetworkState> getNetworkStateFlow();

    void init(Context context);

    boolean isConnected();

    void subscribe(ConnectionListener connectionListener);

    void unsubscribe(ConnectionListener connectionListener);
}
