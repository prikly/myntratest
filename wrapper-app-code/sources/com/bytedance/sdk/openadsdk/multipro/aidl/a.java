package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.c;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.d;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.f;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.h;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.utils.u;

/* compiled from: BinderPool */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f2098c = new a();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static b f2099d;

    /* renamed from: a  reason: collision with root package name */
    private Context f2100a = m.a().getApplicationContext();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public IBinderPool f2101b;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public long f2102e = 0;

    /* renamed from: f  reason: collision with root package name */
    private ServiceConnection f2103f = new ServiceConnection() {
        public void onServiceDisconnected(ComponentName componentName) {
            l.c("MultiProcess", "BinderPool......onServiceDisconnected");
        }

        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            e.a(new g("onServiceConnected") {
                public void run() {
                    IBinderPool unused = a.this.f2101b = IBinderPool.Stub.asInterface(iBinder);
                    try {
                        a.this.f2101b.asBinder().linkToDeath(a.this.f2104g, 0);
                    } catch (RemoteException e2) {
                        l.c("MultiProcess", "onServiceConnected throws :", e2);
                    }
                    l.b("MultiProcess", "onServiceConnected - binderService consume time ：" + (System.currentTimeMillis() - a.this.f2102e));
                    if (a.f2099d != null) {
                        a.f2099d.a();
                    }
                }
            }, 5);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public IBinder.DeathRecipient f2104g = new IBinder.DeathRecipient() {
        public void binderDied() {
            e.a(new g("binderDied") {
                public void run() {
                    l.d("MultiProcess", "binder died.");
                    a.this.f2101b.asBinder().unlinkToDeath(a.this.f2104g, 0);
                    IBinderPool unused = a.this.f2101b = null;
                    a.this.c();
                }
            }, 5);
        }
    };

    private a() {
        c();
    }

    public static a a(Context context) {
        return f2098c;
    }

    public void a() {
        this.f2100a.bindService(new Intent(this.f2100a, BinderPoolService.class), this.f2103f, 1);
        this.f2102e = System.currentTimeMillis();
    }

    public static void a(b bVar) {
        f2099d = bVar;
    }

    public IBinder a(int i) {
        try {
            if (b.c()) {
                try {
                    if (this.f2101b != null) {
                        return this.f2101b.queryBinder(i);
                    }
                    return null;
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    u.l("queryBinder error");
                    return null;
                }
            } else if (i == 0) {
                return h.a();
            } else {
                if (i == 1) {
                    return f.a();
                }
                if (i == 2) {
                    return c.a();
                }
                if (i == 4) {
                    return d.a();
                }
                if (i == 5) {
                    return com.bytedance.sdk.openadsdk.multipro.aidl.a.g.a();
                }
                if (i == 6) {
                    return com.bytedance.sdk.openadsdk.multipro.aidl.a.e.a();
                }
                if (i != 7) {
                    return null;
                }
                return com.bytedance.sdk.openadsdk.multipro.aidl.a.b.a();
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        if (b.c()) {
            l.c("MultiProcess", "BinderPool......connectBinderPoolService");
            a();
        }
    }
}
