package com.bytedance.sdk.openadsdk.multipro.aidl.a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: DislikeClosedListenerManagerImpl */
public class e extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> f2116a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static volatile e f2117b;

    public static e a() {
        if (f2117b == null) {
            synchronized (e.class) {
                if (f2117b == null) {
                    f2117b = new e();
                }
            }
        }
        return f2117b;
    }

    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
        remoteCallbackList.register(iDislikeClosedListener);
        f2116a.put(str, remoteCallbackList);
    }

    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (!TextUtils.isEmpty(str)) {
            f2116a.remove(str);
        }
    }

    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        a(str, str2);
    }

    private synchronized void a(String str, String str2) {
        RemoteCallbackList remoteCallbackList;
        try {
            if (!(f2116a == null || (remoteCallbackList = f2116a.get(str)) == null)) {
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i = 0; i < beginBroadcast; i++) {
                    IDislikeClosedListener iDislikeClosedListener = (IDislikeClosedListener) remoteCallbackList.getBroadcastItem(i);
                    if (iDislikeClosedListener != null && "onItemClickClosed".equals(str2)) {
                        iDislikeClosedListener.onItemClickClosed();
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th) {
            l.c("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th);
        }
        return;
    }
}
