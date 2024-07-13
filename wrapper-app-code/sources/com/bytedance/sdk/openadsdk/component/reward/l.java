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
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.t;
import com.bytedance.sdk.openadsdk.multipro.aidl.a;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.h;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.utils.q;
import com.bytedance.sdk.openadsdk.utils.u;
import com.com.bytedance.overseas.sdk.a.c;
import com.com.bytedance.overseas.sdk.a.d;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTRewardVideoAdImpl */
class l implements TTRewardVideoAd {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f797a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final n f798b;

    /* renamed from: c  reason: collision with root package name */
    private final AdSlot f799c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public TTRewardVideoAd.RewardAdInteractionListener f800d;

    /* renamed from: e  reason: collision with root package name */
    private c f801e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f802f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f803g;

    /* renamed from: h  reason: collision with root package name */
    private String f804h;
    private String i;
    private AtomicBoolean j = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public String k;
    private boolean l;
    private boolean m;
    private Double n = null;

    l(Context context, n nVar, AdSlot adSlot) {
        this.f797a = context;
        this.f798b = nVar;
        this.f799c = adSlot;
        if (getInteractionType() == 4) {
            this.f801e = d.a(this.f797a, this.f798b, "rewarded_video");
        }
        this.f803g = false;
        this.k = com.bytedance.sdk.openadsdk.utils.l.a();
    }

    public void a(String str) {
        if (!this.j.get()) {
            this.f803g = true;
            this.f804h = str;
        }
    }

    public void setRewardAdInteractionListener(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        this.f800d = rewardAdInteractionListener;
        a(0);
    }

    public int getInteractionType() {
        n nVar = this.f798b;
        if (nVar == null) {
            return -1;
        }
        return nVar.L();
    }

    public void setShowDownLoadBar(boolean z) {
        this.f802f = z;
    }

    public int getRewardVideoAdType() {
        n nVar = this.f798b;
        if (nVar == null) {
            return -1;
        }
        if (p.i(nVar)) {
            return 2;
        }
        return p.j(this.f798b) ? 1 : 0;
    }

    public String getAdCreativeToken() {
        return this.f798b.n();
    }

    public void showRewardVideoAd(Activity activity) {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.l.e("TTRewardVideoAdImpl", "showRewardVideoAd error1: activity is finishing");
            activity = null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            e.a(this.f798b, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            com.bytedance.sdk.component.utils.l.e("TTRewardVideoAdImpl", "showRewardVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
        } else if (!this.j.get()) {
            this.j.set(true);
            n nVar = this.f798b;
            if (nVar == null || nVar.J() == null) {
                e.a(this.f798b, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            Context context = activity == null ? this.f797a : activity;
            if (context == null) {
                context = m.a();
            }
            if (this.f798b.l() != 2 || this.f798b.f() == 5 || this.f798b.f() == 6) {
                intent = new Intent(context, TTRewardVideoActivity.class);
            } else {
                intent = new Intent(context, TTRewardExpressVideoActivity.class);
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
            intent.putExtra("reward_name", this.f798b.j());
            intent.putExtra("reward_amount", this.f798b.k());
            intent.putExtra("media_extra", this.f799c.getMediaExtra());
            intent.putExtra("user_id", this.f799c.getUserID());
            intent.putExtra("show_download_bar", this.f802f);
            Double d2 = this.n;
            intent.putExtra(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE, d2 == null ? "" : String.valueOf(d2));
            if (!TextUtils.isEmpty(this.i)) {
                intent.putExtra("rit_scene", this.i);
            }
            if (this.f803g) {
                intent.putExtra("video_cache_url", this.f804h);
            }
            if (b.c()) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.f798b.ar().toString());
                intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.k);
            } else {
                t.a().h();
                t.a().a(this.f798b);
                t.a().a(this.f800d);
                t.a().a(this.f801e);
                this.f800d = null;
            }
            com.bytedance.sdk.component.utils.b.a(context, intent, new b.a() {
                public void a() {
                }

                public void a(Throwable th) {
                    com.bytedance.sdk.component.utils.l.c("TTRewardVideoAdImpl", "show reward video error: ", th);
                    e.a(l.this.f798b, "fullscreen_interstitial_ad", "activity start  fail ");
                }
            });
            String a2 = u.a(this.f798b, (String) null);
            if (a2 != null) {
                try {
                    AdSlot b2 = i.a(this.f797a).b(a2);
                    i.a(this.f797a).a(a2);
                    if (b2 == null) {
                        return;
                    }
                    if (!this.f803g || TextUtils.isEmpty(this.f804h)) {
                        i.a(this.f797a).a(b2);
                    } else {
                        i.a(this.f797a).b(b2);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public Map<String, Object> getMediaExtraInfo() {
        n nVar = this.f798b;
        if (nVar != null) {
            return nVar.aj();
        }
        return null;
    }

    public void showRewardVideoAd(Activity activity, TTAdConstant.RitScenes ritScenes, String str) {
        if (ritScenes == null) {
            com.bytedance.sdk.component.utils.l.e("TTRewardVideoAdImpl", "The param ritScenes can not be null!");
            return;
        }
        if (ritScenes == TTAdConstant.RitScenes.CUSTOMIZE_SCENES) {
            this.i = str;
        } else {
            this.i = ritScenes.getScenesName();
        }
        showRewardVideoAd(activity);
    }

    private void a(final int i2) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.component.f.e.c(new g("Reward_registerMultiProcessListener") {
                public void run() {
                    a a2 = a.a(l.this.f797a);
                    if (i2 == 0 && l.this.f800d != null) {
                        com.bytedance.sdk.component.utils.l.b("MultiProcess", "start registerRewardVideoListener ! ");
                        com.bytedance.sdk.openadsdk.multipro.aidl.b.d dVar = new com.bytedance.sdk.openadsdk.multipro.aidl.b.d(l.this.f800d);
                        IListenerManager asInterface = h.asInterface(a2.a(0));
                        if (asInterface != null) {
                            try {
                                asInterface.registerRewardVideoListener(l.this.k, dVar);
                                com.bytedance.sdk.component.utils.l.b("MultiProcess", "end registerRewardVideoListener ! ");
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
        if (!this.l) {
            q.a(this.f798b, d2);
            this.l = true;
        }
    }

    public void loss(Double d2, String str, String str2) {
        if (!this.m) {
            q.a(this.f798b, d2, str, str2);
            this.m = true;
        }
    }

    public void setPrice(Double d2) {
        this.n = d2;
    }
}
