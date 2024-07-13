package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.d;
import com.bytedance.sdk.openadsdk.core.nativeexpress.f;
import com.bytedance.sdk.openadsdk.core.nativeexpress.m;
import com.bytedance.sdk.openadsdk.utils.q;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.com.bytedance.overseas.sdk.a.c;
import com.com.bytedance.overseas.sdk.a.d;
import io.bidmachine.utils.IabUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.json.JSONObject;

/* compiled from: TTBannerExpressAdImpl */
public class a extends m implements x.a {

    /* renamed from: a  reason: collision with root package name */
    protected BannerExpressView f987a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f988b;

    /* renamed from: c  reason: collision with root package name */
    protected n f989c;

    /* renamed from: d  reason: collision with root package name */
    protected AdSlot f990d;

    /* renamed from: e  reason: collision with root package name */
    protected TTNativeExpressAd.ExpressAdInteractionListener f991e;

    /* renamed from: f  reason: collision with root package name */
    TTDislikeDialogAbstract f992f;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.dislike.b f993h;
    /* access modifiers changed from: private */
    public c i;
    private x j;
    /* access modifiers changed from: private */
    public int k;
    private int l = 0;
    private TTAdDislike.DislikeInteractionCallback m;
    private Context n;
    /* access modifiers changed from: private */
    public final Queue<Long> o = new LinkedList();
    private boolean p;
    private boolean q;
    /* access modifiers changed from: private */
    public Double r = null;
    /* access modifiers changed from: private */
    public String s = "banner_ad";
    /* access modifiers changed from: private */
    public NativeExpressView t;

    /* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.a$a  reason: collision with other inner class name */
    /* compiled from: TTBannerExpressAdImpl */
    public interface C0004a {
        void a();
    }

    public a(Context context, n nVar, AdSlot adSlot) {
        this.f988b = context;
        this.f989c = nVar;
        this.f990d = adSlot;
        a(context, nVar, adSlot);
    }

    public void a(Context context, n nVar, AdSlot adSlot) {
        BannerExpressView bannerExpressView = new BannerExpressView(context, nVar, adSlot);
        this.f987a = bannerExpressView;
        a(bannerExpressView.getCurView(), this.f989c);
    }

    public View getExpressAdView() {
        return this.f987a;
    }

    public int getImageMode() {
        n nVar = this.f989c;
        if (nVar == null) {
            return -1;
        }
        return nVar.ad();
    }

    public List<FilterWord> getFilterWords() {
        n nVar = this.f989c;
        if (nVar == null) {
            return null;
        }
        return nVar.ae();
    }

    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f991e = expressAdInteractionListener;
        this.f987a.setExpressInteractionListener(expressAdInteractionListener);
    }

    public void setExpressInteractionListener(TTNativeExpressAd.AdInteractionListener adInteractionListener) {
        this.f991e = adInteractionListener;
        this.f987a.setExpressInteractionListener(adInteractionListener);
    }

    public int getInteractionType() {
        n nVar = this.f989c;
        if (nVar == null) {
            return -1;
        }
        return nVar.L();
    }

    public void render() {
        this.f987a.b();
    }

    public void destroy() {
        BannerExpressView bannerExpressView = this.f987a;
        if (bannerExpressView != null) {
            bannerExpressView.c();
        }
        c();
    }

    public void setDislikeCallback(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        if (dislikeInteractionCallback != null && activity != null) {
            this.m = dislikeInteractionCallback;
            a(activity, dislikeInteractionCallback);
        }
    }

    public void setDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        if (tTDislikeDialogAbstract == null) {
            l.b("dialog is null, please check");
            return;
        }
        this.f992f = tTDislikeDialogAbstract;
        tTDislikeDialogAbstract.setMaterialMeta(this.f989c);
        BannerExpressView bannerExpressView = this.f987a;
        if (bannerExpressView != null && bannerExpressView.getCurView() != null) {
            this.f987a.getCurView().setOuterDislike(tTDislikeDialogAbstract);
        }
    }

    private void a(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        if (this.f993h == null) {
            this.f993h = new com.bytedance.sdk.openadsdk.dislike.b(activity, this.f989c);
        }
        this.n = activity;
        this.f993h.setDislikeInteractionCallback(dislikeInteractionCallback);
        BannerExpressView bannerExpressView = this.f987a;
        if (bannerExpressView != null && bannerExpressView.getCurView() != null) {
            this.f987a.getCurView().setDislike(this.f993h);
        }
    }

    private c a(n nVar) {
        if (nVar.L() == 4) {
            return d.a(this.f988b, nVar, this.s);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public void b(n nVar) {
        if (this.f987a.getNextView() != null && this.f987a.f()) {
            b(this.f987a.getNextView(), nVar);
            a(this.f987a.getNextView(), nVar);
        }
    }

    private void b(NativeExpressView nativeExpressView, n nVar) {
        if (nativeExpressView != null && nVar != null) {
            if (this.m != null) {
                this.f993h.a(nVar);
                if (nativeExpressView != null) {
                    nativeExpressView.setDislike(this.f993h);
                }
            }
            TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f992f;
            if (tTDislikeDialogAbstract != null) {
                tTDislikeDialogAbstract.setMaterialMeta(nVar);
                if (nativeExpressView != null) {
                    nativeExpressView.setOuterDislike(this.f992f);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(final NativeExpressView nativeExpressView, n nVar) {
        if (nativeExpressView != null && nVar != null) {
            this.f989c = nVar;
            this.i = a(nVar);
            this.t = nativeExpressView;
            final String a2 = com.bytedance.sdk.openadsdk.utils.l.a();
            final C0004a a3 = a();
            nativeExpressView.setClosedListenerKey(a2);
            nativeExpressView.setBannerClickClosedListener(a3);
            nativeExpressView.setBackupListener(new com.bytedance.sdk.component.adexpress.b.c() {
                public boolean a(ViewGroup viewGroup, int i) {
                    try {
                        nativeExpressView.m();
                        BannerExpressBackupView bannerExpressBackupView = new BannerExpressBackupView(nativeExpressView.getContext());
                        bannerExpressBackupView.setClosedListenerKey(a2);
                        bannerExpressBackupView.a(a.this.f989c, nativeExpressView, a.this.i);
                        bannerExpressBackupView.setDislikeInner(a.this.f993h);
                        bannerExpressBackupView.setDislikeOuter(a.this.f992f);
                        return true;
                    } catch (Exception unused) {
                        return false;
                    }
                }
            });
            e.a(nVar);
            EmptyView a4 = a((ViewGroup) nativeExpressView);
            if (a4 == null) {
                a4 = new EmptyView(this.f988b, nativeExpressView);
                nativeExpressView.addView(a4);
            }
            final n nVar2 = nVar;
            final EmptyView emptyView = a4;
            final NativeExpressView nativeExpressView2 = nativeExpressView;
            a4.setCallback(new EmptyView.a() {
                public void a(boolean z) {
                    if (z) {
                        a.this.b();
                        l.b("TTBannerExpressAd", "Get focus, start timing");
                    } else {
                        a.this.c();
                        l.b("TTBannerExpressAd", "Lose focus, stop timing");
                    }
                    com.bytedance.sdk.component.f.e.b().execute(new b(z, nVar2, a.this));
                }

                public void a() {
                    a.this.b();
                }

                public void b() {
                    if (a.this.f987a != null) {
                        EmptyView emptyView = emptyView;
                        a aVar = a.this;
                        if (emptyView == aVar.a((ViewGroup) aVar.f987a.getCurView())) {
                            a.this.c();
                        }
                    }
                    a.this.c(nVar2);
                }

                public void a(View view) {
                    h.d().a(a2, a3);
                    l.b("TTBannerExpressAd", "ExpressView SHOW");
                    if (a.this.o != null) {
                        a.this.o.offer(Long.valueOf(System.currentTimeMillis()));
                    }
                    HashMap hashMap = new HashMap();
                    NativeExpressView nativeExpressView = nativeExpressView2;
                    if (nativeExpressView != null) {
                        hashMap.put("dynamic_show_type", Integer.valueOf(nativeExpressView.getDynamicShowType()));
                    }
                    if (view != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(IabUtils.KEY_WIDTH, view.getWidth());
                            jSONObject.put(IabUtils.KEY_HEIGHT, view.getHeight());
                            jSONObject.put("alpha", (double) view.getAlpha());
                        } catch (Throwable unused) {
                        }
                        hashMap.put("root_view", jSONObject.toString());
                    }
                    e.a(a.this.f988b, nVar2, a.this.s, (Map<String, Object>) hashMap, a.this.r);
                    if (a.this.f991e != null) {
                        a.this.f991e.onAdShow(view, nVar2.L());
                    }
                    if (nVar2.ai()) {
                        u.a(nVar2, view);
                    }
                    a.this.b();
                    if (!(a.this.f1476g.getAndSet(true) || a.this.f987a == null || a.this.f987a.getCurView() == null || a.this.f987a.getCurView().getWebView() == null)) {
                        v.a(a.this.f988b, a.this.f989c, a.this.s, a.this.f987a.getCurView().getWebView().getWebView());
                    }
                    if (a.this.f987a != null && a.this.f987a.getCurView() != null) {
                        a.this.f987a.getCurView().k();
                        a.this.f987a.getCurView().i();
                    }
                }
            });
            f fVar = new f(this.f988b, nVar, this.s, 2);
            fVar.a((View) nativeExpressView);
            fVar.a((TTNativeExpressAd) this);
            fVar.a(this.i);
            nativeExpressView.setClickListener(fVar);
            com.bytedance.sdk.openadsdk.core.nativeexpress.e eVar = new com.bytedance.sdk.openadsdk.core.nativeexpress.e(this.f988b, nVar, this.s, 2);
            eVar.a((View) nativeExpressView);
            eVar.a((TTNativeExpressAd) this);
            eVar.a(this.i);
            nativeExpressView.setClickCreativeListener(eVar);
            a4.setNeedCheckingShow(true);
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        x xVar = this.j;
        if (xVar != null) {
            xVar.removeCallbacksAndMessages((Object) null);
            this.j.sendEmptyMessageDelayed(112202, 1000);
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        x xVar = this.j;
        if (xVar != null) {
            xVar.removeCallbacksAndMessages((Object) null);
        }
    }

    /* access modifiers changed from: private */
    public void c(n nVar) {
        Queue<Long> queue = this.o;
        if (queue != null && queue.size() > 0 && nVar != null) {
            try {
                long longValue = this.o.poll().longValue();
                if (longValue > 0 && this.t != null) {
                    e.a((System.currentTimeMillis() - longValue) + "", nVar, this.s, this.t.getAdShowTime());
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* compiled from: TTBannerExpressAdImpl */
    private static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        boolean f1007a;

        /* renamed from: b  reason: collision with root package name */
        n f1008b;

        /* renamed from: c  reason: collision with root package name */
        WeakReference<a> f1009c;

        b(boolean z, n nVar, a aVar) {
            this.f1007a = z;
            this.f1008b = nVar;
            this.f1009c = new WeakReference<>(aVar);
        }

        public void run() {
            WeakReference<a> weakReference = this.f1009c;
            if (weakReference != null && weakReference.get() != null) {
                ((a) this.f1009c.get()).a(this.f1007a, this.f1008b);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(boolean z, n nVar) {
        Long poll;
        if (z) {
            try {
                this.o.offer(Long.valueOf(System.currentTimeMillis()));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (this.o.size() > 0 && this.t != null && (poll = this.o.poll()) != null) {
            long longValue = poll.longValue();
            e.a((System.currentTimeMillis() - longValue) + "", nVar, this.s, this.t.getAdShowTime());
        }
    }

    /* access modifiers changed from: private */
    public EmptyView a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        int i2 = 0;
        while (i2 < viewGroup.getChildCount()) {
            try {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof EmptyView) {
                    return (EmptyView) childAt;
                }
                i2++;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Map<String, Object> getMediaExtraInfo() {
        n nVar = this.f989c;
        if (nVar != null) {
            return nVar.aj();
        }
        return null;
    }

    public String getAdCreativeToken() {
        return this.f989c.n();
    }

    public void setSlideIntervalTime(int i2) {
        if (i2 > 0) {
            this.s = "slide_banner_ad";
            a(this.f987a.getCurView(), this.f989c);
            this.f987a.setDuration(1000);
            if (i2 < 30000) {
                i2 = Constants.FAILED_REQUEST_PRECACHE_MS;
            } else if (i2 > 120000) {
                i2 = Constants.LOADING_TIMEOUT_MS;
            }
            this.k = i2;
            this.j = new x(Looper.getMainLooper(), this);
            this.f990d.setIsRotateBanner(1);
            this.f990d.setRotateTime(this.k);
            this.f990d.setRotateOrder(1);
        }
    }

    private void d() {
        com.bytedance.sdk.openadsdk.core.nativeexpress.d.a(this.f988b).a(this.f990d, 1, (TTAdNative.NativeExpressAdListener) null, new d.a() {
            public void a(List<n> list) {
                if (list == null || list.isEmpty()) {
                    a.this.b();
                    return;
                }
                n nVar = list.get(0);
                a.this.f987a.a(nVar, a.this.f990d);
                a.this.b(nVar);
                a.this.f987a.d();
            }

            public void a() {
                a.this.b();
            }
        }, 5000);
    }

    public void a(Message message) {
        if (message.what == 112202) {
            if (com.bytedance.sdk.openadsdk.core.x.a(this.f987a, 50, 1)) {
                this.l += 1000;
            }
            if (this.l >= this.k) {
                d();
                AdSlot adSlot = this.f990d;
                adSlot.setRotateOrder(adSlot.getRotateOrder() + 1);
                this.l = 0;
                c();
                return;
            }
            b();
        }
    }

    public void win(Double d2) {
        if (!this.p) {
            q.a(this.f989c, d2);
            this.p = true;
        }
    }

    public void loss(Double d2, String str, String str2) {
        if (!this.q) {
            q.a(this.f989c, d2, str, str2);
            this.q = true;
        }
    }

    public void setPrice(Double d2) {
        this.r = d2;
    }

    public C0004a a() {
        return new C0004a() {
            public void a() {
                View view;
                int width = a.this.t.getWidth();
                int height = a.this.t.getHeight();
                if (((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d)) {
                    view = LayoutInflater.from(a.this.f988b).inflate(t.f(a.this.f988b, "tt_banner_ad_closed_300_250"), (ViewGroup) null, false);
                } else {
                    view = LayoutInflater.from(a.this.f988b).inflate(t.f(a.this.f988b, "tt_banner_ad_closed_320_50"), (ViewGroup) null, false);
                }
                a aVar = a.this;
                EmptyView a2 = aVar.a((ViewGroup) aVar.t);
                a.this.t.removeAllViews();
                a.this.t.addView(view, new ViewGroup.LayoutParams(width, height));
                view.findViewById(t.e(a.this.f988b, "tt_ad_closed_page_logo")).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        TTWebsiteActivity.a(a.this.f988b, a.this.f989c, a.this.s);
                    }
                });
                TextView textView = (TextView) view.findViewById(t.e(a.this.f988b, "tt_ad_closed_text"));
                textView.setText(t.a(a.this.f988b, "tt_ad_is_closed"));
                textView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        TTWebsiteActivity.a(a.this.f988b, a.this.f989c, a.this.s);
                    }
                });
                a.this.t.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.nativeexpress.e) null);
                a.this.t.setClickListener((f) null);
                if (com.bytedance.sdk.openadsdk.core.m.h().n() == 1) {
                    a.this.c();
                } else if (a.this.k != 0) {
                    a.this.t.addView(a2);
                }
            }
        };
    }
}
