package com.appodeal.ads.modules.libs.network.state;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.appodeal.ads.modules.libs.network.NetworkState;
import com.appodeal.ads.modules.libs.network.NetworkStateObserver;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

public final class a implements NetworkStateObserver {

    /* renamed from: a  reason: collision with root package name */
    public ConnectivityManager f16793a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArraySet<NetworkStateObserver.ConnectionListener> f16794b = new CopyOnWriteArraySet<>();

    /* renamed from: c  reason: collision with root package name */
    public final MutableStateFlow<NetworkState> f16795c = StateFlowKt.MutableStateFlow(NetworkState.NotInitialized);

    /* renamed from: com.appodeal.ads.modules.libs.network.state.a$a  reason: collision with other inner class name */
    public static final class C0187a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f16796a;

        public C0187a(a aVar) {
            this.f16796a = aVar;
        }

        public final void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onAvailable(network);
            a.a(this.f16796a);
        }

        public final void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onLost(network);
            a.a(this.f16796a);
        }

        public final void onUnavailable() {
            super.onUnavailable();
            a.a(this.f16796a);
        }
    }

    public static final void a(a aVar) {
        aVar.f16795c.setValue(aVar.isConnected() ? NetworkState.Enabled : NetworkState.Disabled);
        Iterator<NetworkStateObserver.ConnectionListener> it = aVar.f16794b.iterator();
        while (it.hasNext()) {
            it.next().onConnectionUpdated(aVar.isConnected());
        }
    }

    public final StateFlow getNetworkStateFlow() {
        return this.f16795c;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        if (this.f16795c.getValue() == NetworkState.NotInitialized) {
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            this.f16793a = connectivityManager;
            if (connectivityManager != null) {
                this.f16795c.setValue(NetworkState.Disabled);
                try {
                    connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), new C0187a(this));
                } catch (Throwable unused) {
                    this.f16795c.setValue(NetworkState.ConnectivityManagerError);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getActiveNetworkInfo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isConnected() {
        /*
            r2 = this;
            android.net.ConnectivityManager r0 = r2.f16793a
            r1 = 1
            if (r0 != 0) goto L_0x0006
            goto L_0x0014
        L_0x0006:
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 != 0) goto L_0x000d
            goto L_0x0014
        L_0x000d:
            boolean r0 = r0.isConnected()
            if (r0 != r1) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.modules.libs.network.state.a.isConnected():boolean");
    }

    public final void subscribe(NetworkStateObserver.ConnectionListener connectionListener) {
        Intrinsics.checkNotNullParameter(connectionListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f16794b.add(connectionListener);
    }

    public final void unsubscribe(NetworkStateObserver.ConnectionListener connectionListener) {
        Intrinsics.checkNotNullParameter(connectionListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f16794b.remove(connectionListener);
    }
}
