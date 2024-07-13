package com.bytedance.sdk.openadsdk.multipro.aidl.a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.ICommonDialogListener;
import java.util.HashMap;

/* compiled from: CommonDialogListenerManagerImpl */
public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, RemoteCallbackList<ICommonDialogListener>> f2112a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static volatile c f2113b;

    public static c a() {
        if (f2113b == null) {
            synchronized (c.class) {
                if (f2113b == null) {
                    f2113b = new c();
                }
            }
        }
        return f2113b;
    }

    public void registerDialogListener(String str, ICommonDialogListener iCommonDialogListener) throws RemoteException {
        if (iCommonDialogListener != null) {
            RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
            remoteCallbackList.register(iCommonDialogListener);
            f2112a.put(str, remoteCallbackList);
        }
    }

    public void broadcastDialogListener(String str, int i) throws RemoteException {
        RemoteCallbackList remove = f2112a.remove(str);
        if (remove != null) {
            int beginBroadcast = remove.beginBroadcast();
            for (int i2 = 0; i2 < beginBroadcast; i2++) {
                ICommonDialogListener iCommonDialogListener = (ICommonDialogListener) remove.getBroadcastItem(i2);
                if (iCommonDialogListener != null) {
                    if (i == 1) {
                        iCommonDialogListener.onDialogBtnYes();
                    } else if (i == 2) {
                        iCommonDialogListener.onDialogBtnNo();
                    } else if (i != 3) {
                        iCommonDialogListener.onDialogCancel();
                    } else {
                        iCommonDialogListener.onDialogCancel();
                    }
                }
            }
            remove.finishBroadcast();
            remove.kill();
        }
    }
}
