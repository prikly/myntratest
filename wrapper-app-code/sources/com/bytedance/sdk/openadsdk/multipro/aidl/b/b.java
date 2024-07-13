package com.bytedance.sdk.openadsdk.multipro.aidl.b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.core.bannerexpress.a;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;

/* compiled from: DislikeClosedListenerImpl */
public class b extends IDislikeClosedListener.Stub {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public a.C0004a f2129a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f2130b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f2131c = new Handler(Looper.getMainLooper());

    public b(String str, a.C0004a aVar) {
        this.f2130b = str;
        this.f2129a = aVar;
    }

    private Handler a() {
        Handler handler = this.f2131c;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f2131c = handler2;
        return handler2;
    }

    public void onItemClickClosed() throws RemoteException {
        a().post(new Runnable() {
            public void run() {
                if (b.this.f2129a != null) {
                    b.this.f2129a.a();
                    TTDislikeListView.a(6, b.this.f2130b);
                }
            }
        });
    }
}
