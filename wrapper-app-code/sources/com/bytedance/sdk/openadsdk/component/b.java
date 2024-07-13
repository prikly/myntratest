package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.b;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.t;
import com.bytedance.sdk.openadsdk.multipro.aidl.a;
import com.bytedance.sdk.openadsdk.utils.l;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTAppOpenAdImpl */
public class b implements TTAppOpenAd {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f523a;

    /* renamed from: b  reason: collision with root package name */
    private final n f524b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public TTAppOpenAd.AppOpenAdInteractionListener f525c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f526d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final String f527e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f528f;

    public b(Context context, n nVar, boolean z) {
        this.f523a = context;
        this.f524b = nVar;
        this.f528f = z;
        this.f527e = l.a();
    }

    public void setOpenAdInteractionListener(TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener) {
        this.f525c = appOpenAdInteractionListener;
        a();
    }

    private void a() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            e.c(new g("AppOpenAd_registerMultiProcessListener") {
                public void run() {
                    a a2 = a.a(b.this.f523a);
                    if (b.this.f525c != null) {
                        com.bytedance.sdk.component.utils.l.b("MultiProcess", "start registerAppOpenListener ! ");
                        IListenerManager asInterface = com.bytedance.sdk.openadsdk.multipro.aidl.a.b.asInterface(a2.a(7));
                        if (asInterface != null) {
                            try {
                                asInterface.registerAppOpenAdListener(b.this.f527e, new com.bytedance.sdk.openadsdk.multipro.aidl.b.a(b.this.f525c));
                                TTAppOpenAd.AppOpenAdInteractionListener unused = b.this.f525c = null;
                                com.bytedance.sdk.component.utils.l.b("MultiProcess", "end registerAppOpenAdListener ! ");
                            } catch (RemoteException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                }
            }, 5);
        }
    }

    public void showAppOpenAd(Activity activity) {
        Context context;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        int i = 1;
        if (!this.f526d.getAndSet(true)) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (activity != null) {
                    context = activity;
                } else {
                    context = this.f523a;
                }
                if (context == null) {
                    context = m.a();
                }
                int i2 = 0;
                try {
                    i2 = activity.getWindowManager().getDefaultDisplay().getRotation();
                } catch (Exception unused) {
                }
                Intent intent = new Intent(context, TTAppOpenAdActivity.class);
                intent.putExtra("orientation_angle", i2);
                if (!this.f528f) {
                    i = 2;
                }
                intent.putExtra(FullscreenAdService.DATA_KEY_AD_SOURCE, i);
                if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.f524b.ar().toString());
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.f527e);
                } else {
                    t.a().h();
                    t.a().a(this.f524b);
                    t.a().a(this.f525c);
                    this.f525c = null;
                }
                com.bytedance.sdk.component.utils.b.a(context, intent, new b.a() {
                    public void a() {
                        com.bytedance.sdk.component.utils.l.b("TTAppOpenAdImpl", "app open ad startActivitySuccess");
                    }

                    public void a(Throwable th) {
                        com.bytedance.sdk.component.utils.l.b("TTAppOpenAdImpl", "app open ad startActivityFail");
                    }
                });
                return;
            }
            com.bytedance.sdk.component.utils.l.e("TTAppOpenAdImpl", "showTTAppOpenAd error: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
    }
}
