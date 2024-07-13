package com.bytedance.sdk.openadsdk.multipro.aidl.a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AppOpenAdListenerManagerImpl */
public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> f2110a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f2111b;

    public static b a() {
        if (f2111b == null) {
            synchronized (b.class) {
                if (f2111b == null) {
                    f2111b = new b();
                }
            }
        }
        return f2111b;
    }

    public synchronized void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
        RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
        remoteCallbackList.register(iAppOpenAdInteractionListener);
        f2110a.put(str, remoteCallbackList);
    }

    public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
        a(str, str2);
    }

    private synchronized void a(String str, String str2) {
        RemoteCallbackList remoteCallbackList;
        try {
            if (f2110a != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = f2110a.remove(str);
                } else {
                    remoteCallbackList = f2110a.get(str);
                }
                if (remoteCallbackList != null) {
                    int beginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < beginBroadcast; i++) {
                        IAppOpenAdInteractionListener iAppOpenAdInteractionListener = (IAppOpenAdInteractionListener) remoteCallbackList.getBroadcastItem(i);
                        if (iAppOpenAdInteractionListener != null) {
                            if ("onAdShow".equals(str2)) {
                                iAppOpenAdInteractionListener.onAdShow();
                            } else if ("onAdClicked".equals(str2)) {
                                iAppOpenAdInteractionListener.onAdClicked();
                            } else if ("onAdSkip".equals(str2)) {
                                iAppOpenAdInteractionListener.onAdSkip();
                            } else if ("onAdTimeOver".equals(str2)) {
                                iAppOpenAdInteractionListener.onAdTimeOver();
                            } else if ("recycleRes".equals(str2)) {
                                iAppOpenAdInteractionListener.onDestroy();
                            }
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList.kill();
                    }
                }
            }
        } catch (Throwable th) {
            l.c("MultiProcess", "appOpenAd1 method " + str2 + " throws Exception :", th);
        }
        return;
    }
}
