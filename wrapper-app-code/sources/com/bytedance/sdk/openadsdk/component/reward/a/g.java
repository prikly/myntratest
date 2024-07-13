package com.bytedance.sdk.openadsdk.component.reward.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.j.c;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.d.a;
import com.bytedance.sdk.openadsdk.utils.v;
import org.json.JSONObject;

/* compiled from: VastEndCardManager */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f651a;

    /* renamed from: b  reason: collision with root package name */
    private n f652b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f653c;

    /* renamed from: d  reason: collision with root package name */
    private SSWebView f654d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public ImageView f655e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f656f;

    /* renamed from: g  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.b.g f657g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public e f658h;
    /* access modifiers changed from: private */
    public boolean i;
    /* access modifiers changed from: private */
    public boolean j;

    public g(Activity activity) {
        this.f651a = activity;
    }

    public void a(n nVar) {
        c c2;
        Activity activity = this.f651a;
        if (activity != null) {
            this.f652b = nVar;
            this.f653c = (FrameLayout) activity.findViewById(t.e(activity, "tt_reward_full_endcard_vast"));
            if (this.f652b.ax() != null && (c2 = this.f652b.ax().c()) != null) {
                if (c2.e() != null) {
                    this.f656f = true;
                    Activity activity2 = this.f651a;
                    this.f655e = (ImageView) activity2.findViewById(t.e(activity2, "tt_reward_full_endcard_vast_image"));
                    a(c2.b(), c2.c(), this.f652b.ax());
                    a.a(c2.e()).a(com.bytedance.sdk.component.d.t.BITMAP).a((com.bytedance.sdk.component.d.n) new com.bytedance.sdk.component.d.n<Bitmap>() {
                        public void a(j<Bitmap> jVar) {
                            if (g.this.f655e != null && jVar != null) {
                                Bitmap b2 = jVar.b();
                                if (b2 == null) {
                                    g.this.a(-1);
                                    return;
                                }
                                g.this.f655e.setImageBitmap(b2);
                                boolean unused = g.this.j = true;
                            }
                        }

                        public void a(int i, String str, Throwable th) {
                            if (g.this.f655e != null) {
                                g.this.f655e.setVisibility(8);
                            }
                            g.this.a(-2);
                        }
                    });
                    return;
                }
                Activity activity3 = this.f651a;
                this.f654d = (SSWebView) activity3.findViewById(t.e(activity3, "tt_reward_full_endcard_vast_web"));
                b();
                String d2 = c2.d();
                if (d2 != null) {
                    this.f656f = true;
                    if (d2.startsWith("http")) {
                        this.f654d.a(d2);
                        return;
                    }
                    this.f654d.setDefaultTextEncodingName("UTF -8");
                    this.f654d.a((String) null, d2, "text/html", "UTF-8", (String) null);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        a(i2, (String) null);
    }

    /* access modifiers changed from: private */
    public void a(int i2, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", i2);
            if (str != null) {
                jSONObject.put("url", str);
            }
            String str2 = "";
            if (this.f652b.ax() != null) {
                str2 = this.f652b.ax().k();
            }
            e.b(m.a(), this.f652b, str2, "load_vast_endcard_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void b() {
        this.f654d.setWebViewClient(new SSWebView.a() {
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest != null && webResourceRequest.isForMainFrame() && !g.this.i && webResourceError != null) {
                    String str = null;
                    if (webResourceRequest.getUrl() != null) {
                        str = webResourceRequest.getUrl().toString();
                    }
                    g.this.a(webResourceError.getErrorCode(), str);
                    boolean unused = g.this.i = true;
                }
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                if (Build.VERSION.SDK_INT < 23 && !g.this.i) {
                    g.this.a(i, str2);
                    boolean unused = g.this.i = true;
                }
            }
        });
    }

    private void a(int i2, int i3, final com.bytedance.sdk.openadsdk.core.j.a aVar) {
        Activity activity;
        if (i2 != 0 && i3 != 0 && this.f655e != null && (activity = this.f651a) != null) {
            int c2 = v.c((Context) activity);
            int d2 = v.d((Context) this.f651a);
            float f2 = ((float) i2) / ((float) i3);
            float f3 = (float) c2;
            if (f2 <= f3 / ((float) d2)) {
                c2 = (int) Math.ceil((double) (f3 * f2));
            } else {
                d2 = (int) Math.ceil((double) (f3 / f2));
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f655e.getLayoutParams();
            layoutParams.width = c2;
            layoutParams.height = d2;
            this.f655e.setLayoutParams(layoutParams);
            AnonymousClass3 r4 = new com.bytedance.sdk.openadsdk.core.b.g("VAST_END_CARD", aVar) {
                public void a() {
                    if (aVar.c() != null) {
                        aVar.c().a(g.this.f658h != null ? g.this.f658h.s() : -1);
                    }
                }
            };
            this.f657g = r4;
            this.f655e.setOnClickListener(r4);
            this.f655e.setOnTouchListener(this.f657g);
        }
    }

    public void a() {
        v.a((View) this.f653c, 8);
    }

    public boolean a(e eVar) {
        c c2;
        if (!this.f656f) {
            return false;
        }
        this.f658h = eVar;
        ImageView imageView = this.f655e;
        if (imageView == null || !this.j) {
            SSWebView sSWebView = this.f654d;
            if (sSWebView != null) {
                sSWebView.setVisibility(0);
            }
        } else {
            imageView.setVisibility(0);
        }
        v.a((View) this.f653c, 0);
        n nVar = this.f652b;
        if (nVar == null || nVar.ax() == null || (c2 = this.f652b.ax().c()) == null) {
            return true;
        }
        e eVar2 = this.f658h;
        c2.b(eVar2 != null ? eVar2.s() : -1);
        return true;
    }

    public void a(com.bytedance.sdk.openadsdk.core.b.e eVar) {
        com.bytedance.sdk.openadsdk.core.b.g gVar = this.f657g;
        if (gVar != null) {
            gVar.a(eVar);
        }
    }
}
