package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.b;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.t;
import com.bytedance.sdk.openadsdk.multipro.aidl.a;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.f;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.utils.l;
import com.bytedance.sdk.openadsdk.utils.q;
import com.bytedance.sdk.openadsdk.utils.u;
import com.com.bytedance.overseas.sdk.a.c;
import com.com.bytedance.overseas.sdk.a.d;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTFullScreenVideoAdImpl */
class k implements TTFullScreenVideoAd {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f786a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final n f787b;

    /* renamed from: c  reason: collision with root package name */
    private final AdSlot f788c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f789d;

    /* renamed from: e  reason: collision with root package name */
    private c f790e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f791f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f792g;

    /* renamed from: h  reason: collision with root package name */
    private String f793h;
    private String i;
    private AtomicBoolean j = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public boolean k = false;
    /* access modifiers changed from: private */
    public String l;
    private boolean m;
    private boolean n;
    private Double o = null;

    k(Context context, n nVar, AdSlot adSlot) {
        this.f786a = context;
        this.f787b = nVar;
        this.f788c = adSlot;
        if (getInteractionType() == 4) {
            this.f790e = d.a(this.f786a, this.f787b, "fullscreen_interstitial_ad");
        }
        this.f792g = false;
        this.l = l.a();
    }

    public void a(boolean z) {
        this.k = z;
    }

    public void a(String str) {
        if (!this.j.get()) {
            this.f792g = true;
            this.f793h = str;
        }
    }

    public void setFullScreenVideoAdInteractionListener(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        this.f789d = fullScreenVideoAdInteractionListener;
        a(1);
    }

    public int getInteractionType() {
        n nVar = this.f787b;
        if (nVar == null) {
            return -1;
        }
        return nVar.L();
    }

    public void showFullScreenVideoAd(Activity activity) {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.l.e("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error1: activity is finishing");
            activity = null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            e.a(this.f787b, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            com.bytedance.sdk.component.utils.l.e("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
        } else if (!this.j.get()) {
            this.j.set(true);
            n nVar = this.f787b;
            if (nVar == null || (nVar.J() == null && this.f787b.P() == null)) {
                e.a(this.f787b, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            Context context = activity == null ? this.f786a : activity;
            if (context == null) {
                context = m.a();
            }
            if (this.f787b.l() != 2 || this.f787b.f() == 5 || this.f787b.f() == 6) {
                if (com.bytedance.sdk.openadsdk.component.reward.b.c.a(this.f787b)) {
                    intent = new Intent(context, TTInterstitialActivity.class);
                } else {
                    intent = new Intent(context, TTFullScreenVideoActivity.class);
                }
            } else if (com.bytedance.sdk.openadsdk.component.reward.b.c.a(this.f787b)) {
                intent = new Intent(context, TTInterstitialExpressActivity.class);
            } else {
                intent = new Intent(context, TTFullScreenExpressVideoActivity.class);
            }
            if (activity == null) {
                intent.addFlags(268435456);
            }
            int i2 = 0;
            try {
                i2 = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception unused) {
            }
            intent.putExtra("orientation_angle", i2);
            intent.putExtra("show_download_bar", this.f791f);
            intent.putExtra("is_verity_playable", this.k);
            Double d2 = this.o;
            intent.putExtra(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE, d2 == null ? "" : String.valueOf(d2));
            if (!TextUtils.isEmpty(this.i)) {
                intent.putExtra("rit_scene", this.i);
            }
            if (this.f792g) {
                intent.putExtra("video_cache_url", this.f793h);
            }
            if (b.c()) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.f787b.ar().toString());
                intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.l);
            } else {
                t.a().h();
                t.a().a(this.f787b);
                t.a().a(this.f789d);
                t.a().a(this.f790e);
                this.f789d = null;
            }
            com.bytedance.sdk.component.utils.b.a(context, intent, new b.a() {
                public void a() {
                    if (k.this.k) {
                        try {
                            com.bytedance.sdk.openadsdk.h.b.a().a(k.this.f787b.J().j());
                        } catch (Throwable unused) {
                        }
                    }
                }

                public void a(Throwable th) {
                    com.bytedance.sdk.component.utils.l.c("TTFullScreenVideoAdImpl", "show full screen video error: ", th);
                    if (k.this.k) {
                        try {
                            com.bytedance.sdk.openadsdk.h.b.a().a(k.this.f787b.J().j(), -1, th != null ? th.getMessage() : "playable tool error open");
                        } catch (Throwable unused) {
                        }
                    }
                    e.a(k.this.f787b, "fullscreen_interstitial_ad", "activity start  fail ");
                }
            });
            String a2 = u.a(this.f787b, (String) null);
            if (a2 != null) {
                try {
                    AdSlot b2 = d.a(this.f786a).b(a2);
                    d.a(this.f786a).a(a2);
                    if (b2 == null) {
                        return;
                    }
                    if (!this.f792g || TextUtils.isEmpty(this.f793h)) {
                        d.a(this.f786a).a(b2);
                    } else {
                        d.a(this.f786a).b(b2);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public void showFullScreenVideoAd(Activity activity, TTAdConstant.RitScenes ritScenes, String str) {
        if (ritScenes == null) {
            com.bytedance.sdk.component.utils.l.e("TTFullScreenVideoAdImpl", "The param ritScenes can not be null!");
            return;
        }
        if (ritScenes == TTAdConstant.RitScenes.CUSTOMIZE_SCENES) {
            this.i = str;
        } else {
            this.i = ritScenes.getScenesName();
        }
        showFullScreenVideoAd(activity);
    }

    public void setShowDownLoadBar(boolean z) {
        this.f791f = z;
    }

    public Map<String, Object> getMediaExtraInfo() {
        n nVar = this.f787b;
        if (nVar != null) {
            return nVar.aj();
        }
        return null;
    }

    public int getFullVideoAdType() {
        n nVar = this.f787b;
        if (nVar == null) {
            return -1;
        }
        if (p.i(nVar)) {
            return 2;
        }
        return p.j(this.f787b) ? 1 : 0;
    }

    public String getAdCreativeToken() {
        return this.f787b.n();
    }

    private void a(final int i2) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.component.f.e.c(new g("FullScreen_registerMultiProcessListener") {
                public void run() {
                    a a2 = a.a(k.this.f786a);
                    if (i2 == 1 && k.this.f789d != null) {
                        com.bytedance.sdk.component.utils.l.b("MultiProcess", "start registerFullScreenVideoListener ! ");
                        com.bytedance.sdk.openadsdk.multipro.aidl.b.c cVar = new com.bytedance.sdk.openadsdk.multipro.aidl.b.c(k.this.f789d);
                        IListenerManager asInterface = f.asInterface(a2.a(1));
                        if (asInterface != null) {
                            try {
                                asInterface.registerFullVideoListener(k.this.l, cVar);
                                com.bytedance.sdk.component.utils.l.b("MultiProcess", "end registerFullScreenVideoListener ! ");
                            } catch (RemoteException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                }
            }, 5);
        }
    }

    public void win(Double d2) {
        if (!this.m) {
            q.a(this.f787b, d2);
            this.m = true;
        }
    }

    public void loss(Double d2, String str, String str2) {
        if (!this.n) {
            q.a(this.f787b, d2, str, str2);
            this.n = true;
        }
    }

    public void setPrice(Double d2) {
        this.o = d2;
    }
}
