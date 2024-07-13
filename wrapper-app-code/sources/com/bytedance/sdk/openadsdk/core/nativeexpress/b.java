package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.adexpress.b.d;
import com.bytedance.sdk.component.adexpress.b.f;
import com.bytedance.sdk.component.adexpress.b.m;
import com.bytedance.sdk.component.adexpress.b.n;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView;
import com.bytedance.sdk.openadsdk.core.e.g;
import com.bytedance.sdk.openadsdk.core.y;
import com.bytedance.sdk.openadsdk.utils.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: BrandBannerController */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f1418a = new HashSet<String>() {
        {
            add(".jpeg");
            add(".png");
            add(".bmp");
            add(".gif");
            add(".jpg");
            add(".webp");
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final Context f1419b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C0008b f1420c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public n f1421d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public NativeExpressView f1422e;

    /* renamed from: f  reason: collision with root package name */
    private int f1423f;

    /* renamed from: g  reason: collision with root package name */
    private int f1424g;

    /* compiled from: BrandBannerController */
    interface c {
        void a(int i, int i2);

        void b(String str);

        void c(String str);
    }

    public b(Context context, NativeExpressView nativeExpressView, com.bytedance.sdk.openadsdk.core.e.n nVar) {
        this.f1419b = context;
        this.f1422e = nativeExpressView;
        a(nativeExpressView);
        this.f1420c = new C0008b(context, nVar, this.f1423f, this.f1424g);
    }

    private void a(NativeExpressView nativeExpressView) {
        k a2 = BannerExpressBackupView.a(nativeExpressView.getExpectExpressWidth(), nativeExpressView.getExpectExpressHeight());
        if (nativeExpressView.getExpectExpressWidth() <= 0 || nativeExpressView.getExpectExpressHeight() <= 0) {
            int c2 = v.c(this.f1419b);
            this.f1423f = c2;
            this.f1424g = Float.valueOf(((float) c2) / a2.f1466b).intValue();
        } else {
            this.f1423f = v.e(this.f1419b, (float) nativeExpressView.getExpectExpressWidth());
            this.f1424g = v.e(this.f1419b, (float) nativeExpressView.getExpectExpressHeight());
        }
        int i = this.f1423f;
        if (i > 0 && i > v.c(this.f1419b)) {
            float c3 = ((float) v.c(this.f1419b)) / ((float) this.f1423f);
            this.f1423f = v.c(this.f1419b);
            this.f1424g = Float.valueOf(((float) this.f1424g) * c3).intValue();
        }
    }

    public void a(n nVar) {
        this.f1421d = nVar;
    }

    public void a() {
        C0008b bVar = this.f1420c;
        if (bVar != null) {
            bVar.a((f) new f() {
                public void a(View view, m mVar) {
                    if (b.this.f1422e != null && view != null) {
                        b.this.f1422e.removeView(view);
                        if (view.getParent() != null) {
                            ((ViewGroup) view.getParent()).removeView(view);
                        }
                        b.this.f1422e.addView(view, new ViewGroup.LayoutParams(-1, -1));
                        if (b.this.f1421d != null) {
                            b.this.f1421d.a(b.this.f1420c, mVar);
                        }
                    } else if (b.this.f1421d != null) {
                        b.this.f1421d.a_(106);
                    }
                }

                public void a(int i) {
                    if (b.this.f1421d != null) {
                        b.this.f1421d.a_(106);
                    }
                }
            });
            return;
        }
        n nVar = this.f1421d;
        if (nVar != null) {
            nVar.a_(106);
        }
    }

    public void b() {
        C0008b bVar = this.f1420c;
        if (bVar != null) {
            bVar.a();
            this.f1420c = null;
        }
        this.f1421d = null;
        this.f1422e = null;
    }

    public void a(TTAdDislike tTAdDislike) {
        C0008b bVar = this.f1420c;
        if (bVar != null) {
            bVar.a(tTAdDislike);
        }
    }

    public void a(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        C0008b bVar = this.f1420c;
        if (bVar != null) {
            bVar.a(tTDislikeDialogAbstract);
        }
    }

    public void a(String str) {
        C0008b bVar = this.f1420c;
        if (bVar != null) {
            bVar.a(str);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.b$b  reason: collision with other inner class name */
    /* compiled from: BrandBannerController */
    public static class C0008b implements d<View>, c {

        /* renamed from: a  reason: collision with root package name */
        AtomicBoolean f1428a = new AtomicBoolean(false);

        /* renamed from: b  reason: collision with root package name */
        AtomicBoolean f1429b = new AtomicBoolean(false);

        /* renamed from: c  reason: collision with root package name */
        WeakReference<ImageView> f1430c;

        /* renamed from: d  reason: collision with root package name */
        private com.bytedance.sdk.openadsdk.dislike.b f1431d;

        /* renamed from: e  reason: collision with root package name */
        private TTDislikeDialogAbstract f1432e;

        /* renamed from: f  reason: collision with root package name */
        private String f1433f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final Context f1434g;

        /* renamed from: h  reason: collision with root package name */
        private final int f1435h;
        private final int i;
        private FrameLayout j;
        /* access modifiers changed from: private */
        public com.bytedance.sdk.openadsdk.core.e.n k;
        /* access modifiers changed from: private */
        public n l;
        private int m;
        private SSWebView n;
        private f o;
        /* access modifiers changed from: private */
        public int p = 0;
        /* access modifiers changed from: private */
        public List<String> q;

        public int c() {
            return 5;
        }

        public C0008b(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, int i2, int i3) {
            this.f1434g = context;
            this.f1435h = i2;
            this.i = i3;
            this.k = nVar;
            this.m = v.e(context, 3.0f);
            this.l = new n(context);
            f();
        }

        private void f() {
            FrameLayout frameLayout = new FrameLayout(this.f1434g);
            this.j = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.f1435h, this.i);
            }
            layoutParams.width = this.f1435h;
            layoutParams.height = this.i;
            layoutParams.gravity = 17;
            this.j.setLayoutParams(layoutParams);
            this.j.addView(i());
            this.j.addView(g());
            ImageView h2 = h();
            this.j.addView(h2);
            this.f1430c = new WeakReference<>(h2);
        }

        public void a(f fVar) {
            if (!this.f1428a.get()) {
                this.f1429b.set(false);
                if (this.f1434g == null) {
                    fVar.a(106);
                    return;
                }
                this.p = 0;
                this.o = fVar;
                this.n.a((String) null, this.k.az(), "text/html", "UTF-8", (String) null);
            }
        }

        private View g() {
            View inflate = LayoutInflater.from(this.f1434g).inflate(t.f(this.f1434g, "tt_backup_ad1"), (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = this.m;
            layoutParams.leftMargin = this.m;
            inflate.setLayoutParams(layoutParams);
            inflate.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTWebsiteActivity.a(C0008b.this.f1434g, C0008b.this.k, "banner_ad");
                }
            });
            return inflate;
        }

        private ImageView h() {
            ImageView imageView = new ImageView(this.f1434g);
            imageView.setImageDrawable(this.f1434g.getResources().getDrawable(t.d(this.f1434g, "tt_dislike_icon2")));
            int e2 = v.e(this.f1434g, 15.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(e2, e2);
            layoutParams.gravity = 8388613;
            layoutParams.rightMargin = this.m;
            layoutParams.topMargin = this.m;
            imageView.setLayoutParams(layoutParams);
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C0008b.this.b();
                }
            });
            return imageView;
        }

        private SSWebView i() {
            SSWebView b2 = c.a().b();
            this.n = b2;
            if (b2 == null) {
                this.n = new SSWebView(this.f1434g);
            }
            c.a().c(this.n);
            this.n.setWebViewClient(new a(this.l, this));
            this.n.setWebChromeClient(new WebChromeClient() {
                public void onProgressChanged(WebView webView, int i) {
                    if (!C0008b.this.f1429b.get()) {
                        super.onProgressChanged(webView, i);
                        if (C0008b.this.p == 0 && i >= 75) {
                            C0008b.this.d();
                            C0008b.this.f1429b.set(true);
                        }
                        if (i == 100 && C0008b.this.q != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                JSONArray jSONArray = new JSONArray();
                                for (String put : C0008b.this.q) {
                                    jSONArray.put(put);
                                }
                                jSONObject.put("error_url", jSONArray);
                                e.b(C0008b.this.f1434g, C0008b.this.k, "banner_ad", "html_banner_error_url", jSONObject);
                                List unused = C0008b.this.q = null;
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            });
            this.n.getWebView().setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    C0008b.this.l.onTouchEvent(motionEvent);
                    return false;
                }
            });
            this.n.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.n;
        }

        public View e() {
            return this.j;
        }

        public void a() {
            this.j = null;
            this.f1431d = null;
            this.f1432e = null;
            this.o = null;
            this.k = null;
            this.l = null;
            if (this.n != null) {
                c.a().a(this.n);
            }
            this.f1428a.set(true);
            this.f1429b.set(false);
        }

        public void a(TTAdDislike tTAdDislike) {
            if (tTAdDislike instanceof com.bytedance.sdk.openadsdk.dislike.b) {
                this.f1431d = (com.bytedance.sdk.openadsdk.dislike.b) tTAdDislike;
            }
        }

        public void a(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            com.bytedance.sdk.openadsdk.core.e.n nVar;
            if (!(tTDislikeDialogAbstract == null || (nVar = this.k) == null)) {
                tTDislikeDialogAbstract.setMaterialMeta(nVar);
            }
            this.f1432e = tTDislikeDialogAbstract;
        }

        public void b() {
            TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f1432e;
            if (tTDislikeDialogAbstract != null) {
                tTDislikeDialogAbstract.show();
                return;
            }
            com.bytedance.sdk.openadsdk.dislike.b bVar = this.f1431d;
            if (bVar != null) {
                bVar.showDislikeDialog();
            } else {
                TTDelegateActivity.a(this.k, this.f1433f);
            }
        }

        public void a(String str) {
            this.f1433f = str;
        }

        public void b(String str) {
            if (!TextUtils.isEmpty(str)) {
                boolean z = false;
                if (str.contains("play.google.com/store/apps/details?id=")) {
                    z = com.com.bytedance.overseas.sdk.a.b.b(this.f1434g, str.substring(str.indexOf("?id=") + 4));
                }
                if (!z) {
                    y.a(this.f1434g, this.k, -1, (TTNativeAd) null, (TTNativeExpressAd) null, "", true, str);
                }
                if (this.l != null) {
                    View view = null;
                    WeakReference<ImageView> weakReference = this.f1430c;
                    if (weakReference != null) {
                        view = (View) weakReference.get();
                    }
                    g a2 = this.l.a(this.f1434g, (View) this.j.getParent(), view);
                    HashMap hashMap = new HashMap();
                    hashMap.put("click_scence", 1);
                    e.a(this.f1434g, Constants.CLICK, this.k, a2, "banner_ad", true, (Map<String, Object>) hashMap, this.l.b() ? 1 : 2);
                }
                n nVar = this.l;
                if (nVar != null) {
                    nVar.a();
                }
            }
        }

        public void d() {
            if (this.o != null) {
                m mVar = new m();
                mVar.a(true);
                mVar.a((double) v.d(this.f1434g, (float) this.f1435h));
                mVar.b((double) v.d(this.f1434g, (float) this.i));
                this.o.a(this.j, mVar);
            }
        }

        public void a(int i2, int i3) {
            this.p = i3;
            f fVar = this.o;
            if (fVar != null) {
                fVar.a(i2);
            }
            e.a(this.f1434g, this.k, "banner_ad", "render_html_fail");
        }

        public void c(String str) {
            if (this.q == null) {
                this.q = new ArrayList();
            }
            this.q.add(str);
        }
    }

    /* compiled from: BrandBannerController */
    static class a extends SSWebView.a {

        /* renamed from: a  reason: collision with root package name */
        n f1426a;

        /* renamed from: b  reason: collision with root package name */
        c f1427b;

        public a(n nVar, c cVar) {
            this.f1426a = nVar;
            this.f1427b = cVar;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            c cVar;
            n nVar = this.f1426a;
            if (nVar == null || !nVar.b() || (cVar = this.f1427b) == null) {
                return false;
            }
            cVar.b(str);
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r1 = r2.getUrl().toString();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceivedHttpError(android.webkit.WebView r1, android.webkit.WebResourceRequest r2, android.webkit.WebResourceResponse r3) {
            /*
                r0 = this;
                super.onReceivedHttpError(r1, r2, r3)
                if (r2 == 0) goto L_0x0040
                if (r3 == 0) goto L_0x0040
                int r1 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                if (r1 < r3) goto L_0x0040
                boolean r1 = r2.isForMainFrame()
                if (r1 == 0) goto L_0x0040
                android.net.Uri r1 = r2.getUrl()
                if (r1 == 0) goto L_0x0040
                android.net.Uri r1 = r2.getUrl()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "."
                int r2 = r1.lastIndexOf(r2)
                if (r2 <= 0) goto L_0x0040
                java.lang.String r2 = r1.substring(r2)
                java.lang.String r2 = r2.toLowerCase()
                java.util.Set<java.lang.String> r3 = com.bytedance.sdk.openadsdk.core.nativeexpress.b.f1418a
                boolean r2 = r3.contains(r2)
                if (r2 == 0) goto L_0x0040
                com.bytedance.sdk.openadsdk.core.nativeexpress.b$c r2 = r0.f1427b
                if (r2 == 0) goto L_0x0040
                r2.c(r1)
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.b.a.onReceivedHttpError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (Build.VERSION.SDK_INT >= 23 && webResourceRequest != null && webResourceRequest.isForMainFrame() && webResourceError != null) {
                String str = null;
                if (webResourceRequest.getUrl() != null) {
                    str = webResourceRequest.getUrl().toString();
                }
                a(str, webResourceError.getErrorCode(), webResourceError.getDescription().toString());
            }
        }

        private void a(String str, int i, String str2) {
            c cVar = this.f1427b;
            if (cVar != null) {
                cVar.a(106, i);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (Build.VERSION.SDK_INT < 23) {
                a(str2, i, str);
            }
        }
    }
}
