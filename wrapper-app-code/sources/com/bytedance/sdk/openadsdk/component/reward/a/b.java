package com.bytedance.sdk.openadsdk.component.reward.a;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.HomeWatcherReceiver;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.core.widget.a.c;
import com.bytedance.sdk.openadsdk.core.widget.a.d;
import com.bytedance.sdk.openadsdk.utils.v;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: RewardFullPlayableManager */
public class b {

    /* renamed from: a  reason: collision with root package name */
    protected final AtomicBoolean f592a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    protected final AtomicBoolean f593b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    boolean f594c = false;

    /* renamed from: d  reason: collision with root package name */
    boolean f595d = false;

    /* renamed from: e  reason: collision with root package name */
    long f596e = 0;

    /* renamed from: f  reason: collision with root package name */
    int f597f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f598g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f599h = 0;
    private Activity i;
    /* access modifiers changed from: private */
    public n j;
    private f k;
    /* access modifiers changed from: private */
    public String l;
    private int m = 1;
    private PlayableLoadingView n;
    /* access modifiers changed from: private */
    public boolean o = true;
    private HomeWatcherReceiver p;
    private boolean q = false;

    public b(Activity activity) {
        this.i = activity;
    }

    public void a(f fVar, n nVar, String str, int i2) {
        if (!this.q) {
            this.q = true;
            this.k = fVar;
            this.j = nVar;
            this.l = str;
            this.m = i2;
            l();
        }
    }

    private void l() {
        Activity activity = this.i;
        this.n = (PlayableLoadingView) activity.findViewById(t.e(activity, "tt_reward_playable_loading"));
    }

    public boolean a() {
        if (this.n == null) {
            return false;
        }
        n nVar = this.j;
        if (nVar == null || !nVar.aG() || !p.i(this.j)) {
            this.n.a();
            return false;
        }
        this.n.b();
        return true;
    }

    public void b() {
        if (!this.f592a.getAndSet(true) && this.k.c() != null && this.k.d() != null) {
            v.a((View) this.k.c(), 0);
            v.a((View) this.k.d(), 8);
        }
    }

    public void a(DownloadListener downloadListener) {
        if (this.k.d() != null) {
            String m2 = m();
            if (!TextUtils.isEmpty(m2)) {
                this.k.d().setWebViewClient(new d(this.i, this.k.f(), this.j.Y(), (com.bytedance.sdk.openadsdk.b.n) null, false) {
                    public void onPageFinished(WebView webView, String str) {
                        if (b.this.o) {
                            e.c(this.f1800d, b.this.j, b.this.l, "loading_h5_success", (JSONObject) null);
                        }
                        super.onPageFinished(webView, str);
                    }

                    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                        boolean unused = b.this.o = false;
                    }

                    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView, webResourceRequest, webResourceError);
                        boolean unused = b.this.o = false;
                    }

                    public void onReceivedError(WebView webView, int i, String str, String str2) {
                        super.onReceivedError(webView, i, str, str2);
                        boolean unused = b.this.o = false;
                    }
                });
                this.k.d().a(m2);
                this.k.d().setDisplayZoomControls(false);
                this.k.d().setWebChromeClient(new c(this.k.f(), this.k.g()));
                this.k.d().setDownloadListener(downloadListener);
            }
        }
    }

    private String m() {
        n nVar;
        String l2 = m.h().l();
        l.c("Playable", "getPlayableLoadH5Url->loadH5Url=" + l2);
        if (TextUtils.isEmpty(l2) || (nVar = this.j) == null || nVar.aa() == null) {
            return l2;
        }
        String b2 = this.j.aa().b();
        double d2 = this.j.aa().d();
        int e2 = this.j.aa().e();
        String a2 = (this.j.M() == null || TextUtils.isEmpty(this.j.M().a())) ? "" : this.j.M().a();
        String Y = this.j.Y();
        String c2 = this.j.aa().c();
        String a3 = this.j.aa().a();
        String b3 = this.j.aa().b();
        String U = this.j.U();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("appname=");
        stringBuffer.append(URLEncoder.encode(b2));
        stringBuffer.append("&stars=");
        stringBuffer.append(d2);
        stringBuffer.append("&comments=");
        stringBuffer.append(e2);
        stringBuffer.append("&icon=");
        stringBuffer.append(URLEncoder.encode(a2));
        stringBuffer.append("&downloading=");
        stringBuffer.append(true);
        stringBuffer.append("&id=");
        stringBuffer.append(URLEncoder.encode(Y));
        stringBuffer.append("&packageName=");
        stringBuffer.append(URLEncoder.encode(c2));
        stringBuffer.append("&downloadUrl=");
        stringBuffer.append(URLEncoder.encode(a3));
        stringBuffer.append("&name=");
        stringBuffer.append(URLEncoder.encode(b3));
        stringBuffer.append("&orientation=");
        stringBuffer.append(this.m == 1 ? "portrait" : "landscape");
        stringBuffer.append("&apptitle=");
        stringBuffer.append(URLEncoder.encode(U));
        String str = l2 + "?" + stringBuffer.toString();
        l.c("Playable", "Playable-loadH5Url=" + str);
        return str;
    }

    public void c() {
        this.f594c = true;
    }

    public boolean d() {
        return this.f594c;
    }

    public void a(boolean z) {
        if (Build.VERSION.SDK_INT >= 19 && z) {
            this.k.c().setDomStorageEnabled(true);
        }
    }

    public void b(boolean z) {
        if (z) {
            try {
                if (!TextUtils.isEmpty(this.k.p()) && this.k.n() != 0) {
                    com.bytedance.sdk.openadsdk.h.b.a().a(this.k.p(), this.k.n(), this.k.o());
                }
            } catch (Throwable unused) {
            }
        }
        if (z) {
            try {
                if (!TextUtils.isEmpty(this.k.p())) {
                    com.bytedance.sdk.openadsdk.h.b.a().b(this.k.p());
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public void e() {
        try {
            HomeWatcherReceiver homeWatcherReceiver = new HomeWatcherReceiver();
            this.p = homeWatcherReceiver;
            homeWatcherReceiver.a(new HomeWatcherReceiver.a() {
                public void a() {
                    b.this.f595d = true;
                }

                public void b() {
                    b.this.f595d = true;
                }
            });
            this.i.getApplicationContext().registerReceiver(this.p, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (Throwable unused) {
        }
    }

    public void a(Context context) {
        try {
            this.p.a((HomeWatcherReceiver.a) null);
            context.getApplicationContext().unregisterReceiver(this.p);
        } catch (Throwable unused) {
        }
    }

    public void a(String str) {
        if (this.f595d) {
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(System.currentTimeMillis() - this.f596e));
            e.c((Context) this.i, this.j, this.l, str, (Map<String, Object>) hashMap);
            if ("return_foreground".equals(str)) {
                this.f595d = false;
            }
        }
    }

    public void f() {
        this.f596e = System.currentTimeMillis();
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(System.currentTimeMillis() - this.f596e));
        }
    }

    public void a(int i2) {
        PlayableLoadingView playableLoadingView = this.n;
        if (playableLoadingView != null) {
            playableLoadingView.setProgress(i2);
        }
    }

    public void a(com.bytedance.sdk.openadsdk.core.b.e eVar) {
        PlayableLoadingView playableLoadingView = this.n;
        if (playableLoadingView != null && playableLoadingView.getPlayView() != null && p.i(this.j)) {
            this.n.getPlayView().setOnClickListener(eVar);
            this.n.getPlayView().setOnTouchListener(eVar);
        }
    }

    public void g() {
        PlayableLoadingView playableLoadingView = this.n;
        if (playableLoadingView != null) {
            playableLoadingView.a();
        }
    }

    public void h() {
        this.f593b.set(true);
    }

    public boolean i() {
        return this.f593b.get();
    }

    public int b(int i2) {
        return this.f599h - (this.f598g - i2);
    }

    public int j() {
        return this.f598g;
    }

    public int k() {
        return this.f597f;
    }

    public void a(int i2, n nVar, boolean z) {
        if (nVar != null) {
            this.f598g = nVar.at();
            this.f599h = m.h().a(String.valueOf(i2), z);
        }
    }

    public void c(int i2) {
        this.f597f = i2 - 1;
    }

    public void d(int i2) {
        this.f597f = i2;
    }
}
