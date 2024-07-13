package com.bytedance.sdk.openadsdk.multipro.aidl.a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import java.util.HashMap;

/* compiled from: CommonPermissionListenerManagerImpl */
public class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, RemoteCallbackList<ICommonPermissionListener>> f2114a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f2115b;

    public static d a() {
        if (f2115b == null) {
            synchronized (d.class) {
                if (f2115b == null) {
                    f2115b = new d();
                }
            }
        }
        return f2115b;
    }

    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
        if (iCommonPermissionListener != null) {
            l.b("MultiProcess", "CommonPermissionListenerManagerImpl registerPermissionListener");
            RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
            remoteCallbackList.register(iCommonPermissionListener);
            f2114a.put(str, remoteCallbackList);
        }
    }

    public void broadcastPermissionListener(String str, String str2) throws RemoteException {
        l.b("MultiProcess", "00000 CommonPermissionListenerManagerImpl broadcastDialogListener: 00000" + String.valueOf(str) + ", " + str2);
        RemoteCallbackList remove = f2114a.remove(str);
        if (remove != null) {
            int beginBroadcast = remove.beginBroadcast();
            for (int i = 0; i < beginBroadcast; i++) {
                ICommonPermissionListener iCommonPermissionListener = (ICommonPermissionListener) remove.getBroadcastItem(i);
                if (iCommonPermissionListener != null) {
                    l.b("MultiProcess", "CommonPermissionListenerManagerImpl broadcastDialogListener: " + String.valueOf(str) + ", " + str2);
                    if (str2 == null) {
                        iCommonPermissionListener.onGranted();
                    } else {
                        iCommonPermissionListener.onDenied(str2);
                    }
                }
            }
            remove.finishBroadcast();
            remove.kill();
        }
    }
}
