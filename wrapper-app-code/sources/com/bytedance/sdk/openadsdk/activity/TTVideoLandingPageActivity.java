package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.b.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.b;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.core.widget.RoundImageView;
import com.bytedance.sdk.openadsdk.core.z;
import com.bytedance.sdk.openadsdk.e.d;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.com.bytedance.overseas.sdk.a.c;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class TTVideoLandingPageActivity extends Activity implements d {
    protected ViewStub A;
    protected Button B;
    protected ProgressBar C;
    protected c D;
    protected boolean E = false;
    protected String F;
    protected boolean G = false;
    protected boolean H = true;
    protected boolean I = false;
    protected String J = null;
    protected int K;
    protected com.bytedance.sdk.openadsdk.multipro.b.a L;
    protected n M;
    protected AtomicBoolean N = new AtomicBoolean(true);
    protected JSONArray O = null;
    protected String P;
    protected com.bytedance.sdk.openadsdk.core.b.a Q = null;
    private final c.b R = new c.b() {
        public void a(boolean z) {
            TTVideoLandingPageActivity.this.E = z;
            if (TTVideoLandingPageActivity.this.isFinishing()) {
                return;
            }
            if (z) {
                v.a((View) TTVideoLandingPageActivity.this.f144a, 8);
                v.a((View) TTVideoLandingPageActivity.this.k, 8);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.l.getLayoutParams();
                TTVideoLandingPageActivity.this.r = marginLayoutParams.leftMargin;
                TTVideoLandingPageActivity.this.q = marginLayoutParams.topMargin;
                TTVideoLandingPageActivity.this.s = marginLayoutParams.width;
                TTVideoLandingPageActivity.this.t = marginLayoutParams.height;
                marginLayoutParams.width = -1;
                marginLayoutParams.height = -1;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.leftMargin = 0;
                TTVideoLandingPageActivity.this.l.setLayoutParams(marginLayoutParams);
                return;
            }
            v.a((View) TTVideoLandingPageActivity.this.f144a, 0);
            v.a((View) TTVideoLandingPageActivity.this.k, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.l.getLayoutParams();
            marginLayoutParams2.width = TTVideoLandingPageActivity.this.s;
            marginLayoutParams2.height = TTVideoLandingPageActivity.this.t;
            marginLayoutParams2.leftMargin = TTVideoLandingPageActivity.this.r;
            marginLayoutParams2.topMargin = TTVideoLandingPageActivity.this.q;
            TTVideoLandingPageActivity.this.l.setLayoutParams(marginLayoutParams2);
        }
    };
    private boolean S = false;
    private final BroadcastReceiver T = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                int i = 0;
                if (!intent.getBooleanExtra("noConnectivity", false)) {
                    NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                    if (networkInfo != null) {
                        int type = networkInfo.getType();
                        if (type == 1) {
                            i = 4;
                        } else if (type == 0) {
                            i = 1;
                        }
                    } else {
                        i = o.c(context);
                    }
                }
                if (!(TTVideoLandingPageActivity.this.K != 0 || i == 0 || TTVideoLandingPageActivity.this.f144a == null || TTVideoLandingPageActivity.this.J == null)) {
                    TTVideoLandingPageActivity.this.f144a.a(TTVideoLandingPageActivity.this.J);
                }
                if (!(TTVideoLandingPageActivity.this.n == null || TTVideoLandingPageActivity.this.n.getNativeVideoController() == null || TTVideoLandingPageActivity.this.G || TTVideoLandingPageActivity.this.K == i)) {
                    ((b) TTVideoLandingPageActivity.this.n.getNativeVideoController()).a(context, i);
                }
                TTVideoLandingPageActivity.this.K = i;
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    protected SSWebView f144a;

    /* renamed from: b  reason: collision with root package name */
    protected ImageView f145b;

    /* renamed from: c  reason: collision with root package name */
    protected ImageView f146c;

    /* renamed from: d  reason: collision with root package name */
    protected TextView f147d;

    /* renamed from: e  reason: collision with root package name */
    protected Context f148e;

    /* renamed from: f  reason: collision with root package name */
    protected int f149f;

    /* renamed from: g  reason: collision with root package name */
    protected String f150g;

    /* renamed from: h  reason: collision with root package name */
    protected String f151h;
    protected w i;
    protected int j;
    protected RelativeLayout k;
    protected FrameLayout l;
    protected int m = -1;
    protected NativeVideoTsView n;
    protected long o;
    protected com.bytedance.sdk.openadsdk.core.e.n p;
    protected int q = 0;
    protected int r = 0;
    protected int s = 0;
    protected int t = 0;
    protected String u = "ダウンロード";
    protected RelativeLayout v;
    protected TextView w;
    protected RoundImageView x;
    protected TextView y;
    protected TextView z;

    /* access modifiers changed from: protected */
    public String a() {
        return "tt_activity_videolandingpage";
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "tt_titlebar_close";
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            boolean r0 = com.bytedance.sdk.openadsdk.TTAdSdk.isInitSuccess()
            if (r0 != 0) goto L_0x000c
            r12.finish()
        L_0x000c:
            android.view.Window r0 = r12.getWindow()     // Catch:{ all -> 0x0015 }
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.addFlags(r1)     // Catch:{ all -> 0x0015 }
        L_0x0015:
            com.bytedance.sdk.openadsdk.core.m.a(r12)     // Catch:{ all -> 0x0019 }
            goto L_0x001a
        L_0x0019:
        L_0x001a:
            android.content.Context r0 = r12.getApplicationContext()
            int r0 = com.bytedance.sdk.component.utils.o.c(r0)
            r12.K = r0
            java.lang.String r0 = r12.a()
            int r0 = com.bytedance.sdk.component.utils.t.f(r12, r0)
            r12.setContentView(r0)
            r12.f148e = r12
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r1 = "sdk_version"
            r2 = 1
            int r1 = r0.getIntExtra(r1, r2)
            r12.f149f = r1
            java.lang.String r1 = "adid"
            java.lang.String r1 = r0.getStringExtra(r1)
            r12.f150g = r1
            java.lang.String r1 = "log_extra"
            java.lang.String r1 = r0.getStringExtra(r1)
            r12.f151h = r1
            r1 = -1
            java.lang.String r3 = "source"
            int r1 = r0.getIntExtra(r3, r1)
            r12.j = r1
            java.lang.String r1 = "url"
            java.lang.String r1 = r0.getStringExtra(r1)
            r12.J = r1
            java.lang.String r1 = "web_title"
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.String r3 = "event_tag"
            java.lang.String r3 = r0.getStringExtra(r3)
            r12.F = r3
            java.lang.String r3 = "gecko_id"
            java.lang.String r3 = r0.getStringExtra(r3)
            r12.P = r3
            java.lang.String r3 = "video_is_auto_play"
            boolean r3 = r0.getBooleanExtra(r3, r2)
            r12.I = r3
            r3 = 0
            java.lang.String r5 = "video_play_position"
            if (r13 == 0) goto L_0x0091
            long r6 = r13.getLong(r5)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0091
            long r6 = r13.getLong(r5, r3)
            r12.o = r6
        L_0x0091:
            java.lang.String r6 = "multi_process_data"
            java.lang.String r6 = r0.getStringExtra(r6)
            boolean r7 = com.bytedance.sdk.openadsdk.multipro.b.c()
            if (r7 == 0) goto L_0x00bd
            java.lang.String r7 = "multi_process_materialmeta"
            java.lang.String r0 = r0.getStringExtra(r7)
            if (r0 == 0) goto L_0x00b2
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b1 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x00b1 }
            com.bytedance.sdk.openadsdk.core.e.n r0 = com.bytedance.sdk.openadsdk.core.b.a((org.json.JSONObject) r7)     // Catch:{ Exception -> 0x00b1 }
            r12.p = r0     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b2
        L_0x00b1:
        L_0x00b2:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.p
            if (r0 == 0) goto L_0x00d6
            int r0 = r0.ad()
            r12.m = r0
            goto L_0x00d6
        L_0x00bd:
            com.bytedance.sdk.openadsdk.core.t r0 = com.bytedance.sdk.openadsdk.core.t.a()
            com.bytedance.sdk.openadsdk.core.e.n r0 = r0.c()
            r12.p = r0
            if (r0 == 0) goto L_0x00cf
            int r0 = r0.ad()
            r12.m = r0
        L_0x00cf:
            com.bytedance.sdk.openadsdk.core.t r0 = com.bytedance.sdk.openadsdk.core.t.a()
            r0.h()
        L_0x00d6:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.p
            if (r0 != 0) goto L_0x00de
            r12.finish()
            return
        L_0x00de:
            if (r6 == 0) goto L_0x00f5
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ec }
            r0.<init>(r6)     // Catch:{ Exception -> 0x00ec }
            com.bytedance.sdk.openadsdk.multipro.b.a r0 = com.bytedance.sdk.openadsdk.multipro.b.a.a((org.json.JSONObject) r0)     // Catch:{ Exception -> 0x00ec }
            r12.L = r0     // Catch:{ Exception -> 0x00ec }
            goto L_0x00ed
        L_0x00ec:
        L_0x00ed:
            com.bytedance.sdk.openadsdk.multipro.b.a r0 = r12.L
            if (r0 == 0) goto L_0x00f5
            long r6 = r0.f2165g
            r12.o = r6
        L_0x00f5:
            if (r13 == 0) goto L_0x011d
            java.lang.String r0 = "material_meta"
            java.lang.String r0 = r13.getString(r0)
            com.bytedance.sdk.openadsdk.core.e.n r6 = r12.p
            if (r6 != 0) goto L_0x010e
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x010d }
            r6.<init>(r0)     // Catch:{ all -> 0x010d }
            com.bytedance.sdk.openadsdk.core.e.n r0 = com.bytedance.sdk.openadsdk.core.b.a((org.json.JSONObject) r6)     // Catch:{ all -> 0x010d }
            r12.p = r0     // Catch:{ all -> 0x010d }
            goto L_0x010e
        L_0x010d:
        L_0x010e:
            long r5 = r13.getLong(r5)
            java.lang.String r0 = "is_complete"
            r13.getBoolean(r0)
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x011d
            r12.o = r5
        L_0x011d:
            r12.d()
            r12.j()
            r12.n()
            r13 = 4
            r12.a((int) r13)
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 16
            r3 = 0
            if (r13 < r0) goto L_0x0133
            r13 = 1
            goto L_0x0134
        L_0x0133:
            r13 = 0
        L_0x0134:
            com.bytedance.sdk.component.widget.SSWebView r0 = r12.f144a
            java.lang.String r4 = "landingpage_split_screen"
            if (r0 == 0) goto L_0x0167
            android.content.Context r0 = r12.f148e
            com.bytedance.sdk.openadsdk.core.widget.a.b r0 = com.bytedance.sdk.openadsdk.core.widget.a.b.a((android.content.Context) r0)
            com.bytedance.sdk.openadsdk.core.widget.a.b r13 = r0.a((boolean) r13)
            com.bytedance.sdk.openadsdk.core.widget.a.b r13 = r13.b((boolean) r3)
            com.bytedance.sdk.component.widget.SSWebView r0 = r12.f144a
            android.webkit.WebView r0 = r0.getWebView()
            r13.a((android.webkit.WebView) r0)
            com.bytedance.sdk.openadsdk.b.n r13 = new com.bytedance.sdk.openadsdk.b.n
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.p
            com.bytedance.sdk.component.widget.SSWebView r5 = r12.f144a
            android.webkit.WebView r5 = r5.getWebView()
            r13.<init>(r12, r0, r5)
            com.bytedance.sdk.openadsdk.b.n r13 = r13.a((boolean) r2)
            r12.M = r13
            r13.a((java.lang.String) r4)
        L_0x0167:
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f144a
            r13.setLandingPage(r2)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f144a
            r13.setTag(r4)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f144a
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.p
            com.bytedance.sdk.component.widget.b.a r0 = r0.aC()
            r13.setMaterialMeta(r0)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f144a
            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$1 r0 = new com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$1
            android.content.Context r7 = r12.f148e
            com.bytedance.sdk.openadsdk.core.w r8 = r12.i
            java.lang.String r9 = r12.f150g
            com.bytedance.sdk.openadsdk.b.n r10 = r12.M
            r11 = 1
            r5 = r0
            r6 = r12
            r5.<init>(r7, r8, r9, r10, r11)
            r13.setWebViewClient(r0)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f144a
            if (r13 == 0) goto L_0x01a2
            android.webkit.WebView r0 = r13.getWebView()
            int r2 = r12.f149f
            java.lang.String r0 = com.bytedance.sdk.openadsdk.utils.i.a((android.webkit.WebView) r0, (int) r2)
            r13.setUserAgentString(r0)
        L_0x01a2:
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r13 < r0) goto L_0x01ad
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f144a
            r13.setMixedContentMode(r3)
        L_0x01ad:
            android.content.Context r13 = r12.f148e
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.p
            com.bytedance.sdk.openadsdk.b.e.a((android.content.Context) r13, (com.bytedance.sdk.openadsdk.core.e.n) r0, (java.lang.String) r4)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f144a
            java.lang.String r0 = r12.J
            com.bytedance.sdk.openadsdk.utils.j.a(r13, r0)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f144a
            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$3 r0 = new com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$3
            com.bytedance.sdk.openadsdk.core.w r2 = r12.i
            com.bytedance.sdk.openadsdk.b.n r3 = r12.M
            r0.<init>(r2, r3)
            r13.setWebChromeClient(r0)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f144a
            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$4 r0 = new com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$4
            r0.<init>()
            r13.setDownloadListener(r0)
            android.widget.TextView r13 = r12.f147d
            if (r13 == 0) goto L_0x01e6
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x01e3
            java.lang.String r0 = "tt_web_title_default"
            java.lang.String r1 = com.bytedance.sdk.component.utils.t.a(r12, r0)
        L_0x01e3:
            r13.setText(r1)
        L_0x01e6:
            r12.k()
            r12.e()
            r12.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.onCreate(android.os.Bundle):void");
    }

    private void m() {
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.p;
        if (nVar != null && nVar.L() == 4) {
            this.A.setVisibility(0);
            Button button = (Button) findViewById(t.e(this, "tt_browser_download_btn"));
            this.B = button;
            if (button != null) {
                a(b());
                this.B.setOnClickListener(this.Q);
                this.B.setOnTouchListener(this.Q);
            }
        }
    }

    /* access modifiers changed from: protected */
    public String b() {
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.p;
        if (nVar != null && !TextUtils.isEmpty(nVar.W())) {
            this.u = this.p.W();
        }
        return this.u;
    }

    private void a(final String str) {
        Button button;
        if (!TextUtils.isEmpty(str) && (button = this.B) != null) {
            button.post(new Runnable() {
                public void run() {
                    if (TTVideoLandingPageActivity.this.B != null && !TTVideoLandingPageActivity.this.isFinishing()) {
                        TTVideoLandingPageActivity.this.B.setText(str);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.C = (ProgressBar) findViewById(t.e(this, "tt_browser_progress"));
        this.A = (ViewStub) findViewById(t.e(this, "tt_browser_download_btn_stub"));
        this.f144a = (SSWebView) findViewById(t.e(this, "tt_browser_webview"));
        ImageView imageView = (ImageView) findViewById(t.e(this, "tt_titlebar_back"));
        this.f145b = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TTVideoLandingPageActivity.this.f144a == null) {
                        return;
                    }
                    if (TTVideoLandingPageActivity.this.f144a.e()) {
                        TTVideoLandingPageActivity.this.f144a.f();
                    } else if (TTVideoLandingPageActivity.this.r()) {
                        TTVideoLandingPageActivity.this.onBackPressed();
                    } else {
                        Map<String, Object> map = null;
                        if (!(TTVideoLandingPageActivity.this.n == null || TTVideoLandingPageActivity.this.n.getNativeVideoController() == null)) {
                            map = u.a(TTVideoLandingPageActivity.this.p, TTVideoLandingPageActivity.this.n.getNativeVideoController().h(), TTVideoLandingPageActivity.this.n.getNativeVideoController().n());
                        }
                        TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                        e.a((Context) tTVideoLandingPageActivity, tTVideoLandingPageActivity.p, "embeded_ad", "detail_back", TTVideoLandingPageActivity.this.g(), TTVideoLandingPageActivity.this.h(), map, (j) null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        NativeVideoTsView nativeVideoTsView = this.n;
        if (nativeVideoTsView != null) {
            nativeVideoTsView.setIsAutoPlay(this.I);
        }
        ImageView imageView2 = (ImageView) findViewById(t.e(this, c()));
        this.f146c = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TTVideoLandingPageActivity.this.n != null) {
                        Map<String, Object> map = null;
                        if (TTVideoLandingPageActivity.this.n.getNativeVideoController() != null) {
                            map = u.a(TTVideoLandingPageActivity.this.p, TTVideoLandingPageActivity.this.n.getNativeVideoController().h(), TTVideoLandingPageActivity.this.n.getNativeVideoController().n());
                        }
                        TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                        e.a((Context) tTVideoLandingPageActivity, tTVideoLandingPageActivity.p, "embeded_ad", "detail_skip", TTVideoLandingPageActivity.this.g(), TTVideoLandingPageActivity.this.h(), map, (j) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.f147d = (TextView) findViewById(t.e(this, "tt_titlebar_title"));
        this.l = (FrameLayout) findViewById(t.e(this, "tt_native_video_container"));
        this.k = (RelativeLayout) findViewById(t.e(this, "tt_native_video_titlebar"));
        this.v = (RelativeLayout) findViewById(t.e(this, "tt_rl_download"));
        this.w = (TextView) findViewById(t.e(this, "tt_video_btn_ad_image_tv"));
        this.y = (TextView) findViewById(t.e(this, "tt_video_ad_name"));
        this.z = (TextView) findViewById(t.e(this, "tt_video_ad_button"));
        this.x = (RoundImageView) findViewById(t.e(this, "tt_video_ad_logo_image"));
        i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m();
    }

    /* access modifiers changed from: protected */
    public void e() {
        if (f()) {
            try {
                NativeVideoTsView nativeVideoTsView = new NativeVideoTsView(this.f148e, this.p, true, (j) null);
                this.n = nativeVideoTsView;
                if (nativeVideoTsView.getNativeVideoController() != null) {
                    this.n.getNativeVideoController().a(false);
                }
                if (this.G) {
                    this.l.setVisibility(0);
                    this.l.removeAllViews();
                    this.l.addView(this.n);
                    this.n.b(true);
                } else {
                    if (!this.I) {
                        this.o = 0;
                    }
                    if (!(this.L == null || this.n.getNativeVideoController() == null)) {
                        this.n.getNativeVideoController().b(this.L.f2165g);
                        this.n.getNativeVideoController().c(this.L.f2163e);
                        this.n.setIsQuiet(m.h().a(u.f(this.p)));
                    }
                    if (this.n.a(this.o, this.H, this.G)) {
                        this.l.setVisibility(0);
                        this.l.removeAllViews();
                        this.l.addView(this.n);
                    }
                    if (this.n.getNativeVideoController() != null) {
                        this.n.getNativeVideoController().a(false);
                        this.n.getNativeVideoController().a(this.R);
                    }
                }
                com.bytedance.sdk.openadsdk.d.a.a().a(this.p.P().get(0).a()).a(com.bytedance.sdk.component.d.t.BITMAP).a((com.bytedance.sdk.component.d.n) new com.bytedance.sdk.component.d.n<Bitmap>() {
                    public void a(int i, String str, Throwable th) {
                    }

                    public void a(com.bytedance.sdk.component.d.j<Bitmap> jVar) {
                        try {
                            Bitmap b2 = jVar.b();
                            if (Build.VERSION.SDK_INT >= 17) {
                                new a(b2, TTVideoLandingPageActivity.this.n.getNativeVideoController().o()).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
                this.n.findViewById(t.e(this.f148e, "tt_root_view")).setOnTouchListener((View.OnTouchListener) null);
                this.n.findViewById(t.e(this.f148e, "tt_root_view")).setOnClickListener((View.OnClickListener) null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (this.K == 0) {
                try {
                    Toast.makeText(this, t.b(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean f() {
        return this.m == 5;
    }

    /* access modifiers changed from: protected */
    public long g() {
        NativeVideoTsView nativeVideoTsView = this.n;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0;
        }
        return this.n.getNativeVideoController().j();
    }

    /* access modifiers changed from: protected */
    public int h() {
        NativeVideoTsView nativeVideoTsView = this.n;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0;
        }
        return this.n.getNativeVideoController().l();
    }

    /* access modifiers changed from: protected */
    public void i() {
        String str;
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.p;
        if (nVar != null && nVar.L() == 4) {
            v.a((View) this.v, 0);
            if (!TextUtils.isEmpty(this.p.U())) {
                str = this.p.U();
            } else if (!TextUtils.isEmpty(this.p.V())) {
                str = this.p.V();
            } else {
                str = !TextUtils.isEmpty(this.p.K()) ? this.p.K() : "";
            }
            if (this.p.M() != null && this.p.M().a() != null) {
                v.a((View) this.x, 0);
                v.a((View) this.w, 4);
                com.bytedance.sdk.openadsdk.i.d.a().a(this.p.M(), (ImageView) this.x);
            } else if (!TextUtils.isEmpty(str)) {
                v.a((View) this.x, 4);
                v.a((View) this.w, 0);
                this.w.setText(str.substring(0, 1));
            }
            if (!TextUtils.isEmpty(this.p.W())) {
                this.z.setText(this.p.W());
            }
            if (!TextUtils.isEmpty(str)) {
                this.y.setText(str);
            }
            v.a((View) this.y, 0);
            v.a((View) this.z, 0);
        }
    }

    public void j() {
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.p;
        if (nVar != null) {
            this.D = com.com.bytedance.overseas.sdk.a.d.a(this, nVar, this.F);
            com.bytedance.sdk.openadsdk.core.b.a aVar = new com.bytedance.sdk.openadsdk.core.b.a(this, this.p, this.F, this.j);
            this.Q = aVar;
            aVar.a(false);
            this.Q.c(true);
            this.z.setOnClickListener(this.Q);
            this.z.setOnTouchListener(this.Q);
            this.Q.a(this.D);
        }
    }

    private void n() {
        w wVar = new w(this);
        this.i = wVar;
        wVar.b(this.f144a).d(this.f150g).e(this.f151h).b(this.j).a(this.p).a(this.p.F()).a(this.f144a).c("landingpage_split_screen").f(u.i(this.p));
    }

    public void onBackPressed() {
        NativeVideoTsView nativeVideoTsView;
        if (this.E && (nativeVideoTsView = this.n) != null && nativeVideoTsView.getNativeVideoController() != null) {
            ((com.bykv.vk.openvk.component.video.api.d.a) this.n.getNativeVideoController()).e((com.bykv.vk.openvk.component.video.api.d.b) null, (View) null);
            this.E = false;
        } else if (!r() || this.N.getAndSet(true)) {
            super.onBackPressed();
        } else {
            a(true);
            a(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.p;
        bundle.putString("material_meta", nVar != null ? nVar.ar().toString() : null);
        bundle.putLong("video_play_position", this.o);
        bundle.putBoolean("is_complete", this.G);
        long j2 = this.o;
        NativeVideoTsView nativeVideoTsView = this.n;
        if (!(nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null)) {
            j2 = this.n.getNativeVideoController().g();
        }
        bundle.putLong("video_play_position", j2);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!this.H) {
            o();
        }
        this.H = false;
        w wVar = this.i;
        if (wVar != null) {
            wVar.l();
        }
        n nVar = this.M;
        if (nVar != null) {
            nVar.d();
        }
        s();
    }

    private void o() {
        NativeVideoTsView nativeVideoTsView = this.n;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null && !q()) {
            this.n.l();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        NativeVideoTsView nativeVideoTsView;
        NativeVideoTsView nativeVideoTsView2;
        super.onPause();
        w wVar = this.i;
        if (wVar != null) {
            wVar.m();
        }
        p();
        if (this.G || !((nativeVideoTsView2 = this.n) == null || nativeVideoTsView2.getNativeVideoController() == null || !this.n.getNativeVideoController().q())) {
            this.G = true;
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_is_update_flag", (Boolean) true);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_native_video_complete", (Boolean) true);
            com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", (Boolean) true);
        }
        if (!this.G && (nativeVideoTsView = this.n) != null && nativeVideoTsView.getNativeVideoController() != null) {
            a(this.n.getNativeVideoController());
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        n nVar = this.M;
        if (nVar != null) {
            nVar.e();
        }
    }

    private void a(com.bykv.vk.openvk.component.video.api.d.c cVar) {
        com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_is_update_flag", (Boolean) true);
        com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", (Boolean) true);
        com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(cVar.q()));
        com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(cVar.g()));
        com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(cVar.j() + cVar.h()));
        com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_duration", Long.valueOf(cVar.j()));
    }

    private void p() {
        if (this.n != null && !q()) {
            this.n.l();
        }
    }

    private boolean q() {
        NativeVideoTsView nativeVideoTsView = this.n;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return true;
        }
        return this.n.getNativeVideoController().q();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        l();
        try {
            if (!(getWindow() == null || (viewGroup = (ViewGroup) getWindow().getDecorView()) == null)) {
                viewGroup.removeAllViews();
            }
            this.p.a(false);
        } catch (Throwable unused) {
        }
        SSWebView sSWebView = this.f144a;
        if (sSWebView != null) {
            z.a(this.f148e, sSWebView.getWebView());
            z.a(this.f144a.getWebView());
        }
        this.f144a = null;
        w wVar = this.i;
        if (wVar != null) {
            wVar.n();
        }
        NativeVideoTsView nativeVideoTsView = this.n;
        if (!(nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null)) {
            this.n.getNativeVideoController().f();
        }
        this.n = null;
        this.p = null;
        n nVar = this.M;
        if (nVar != null) {
            nVar.f();
        }
    }

    /* access modifiers changed from: protected */
    public void k() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            this.f148e.registerReceiver(this.T, intentFilter);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void l() {
        try {
            this.f148e.unregisterReceiver(this.T);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public boolean r() {
        return !TextUtils.isEmpty(this.J) && this.J.contains("__luban_sdk");
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        if (this.f146c != null && r()) {
            v.a((View) this.f146c, i2);
        }
    }

    private void a(boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", z2);
            this.i.a("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void s() {
        if (this.p != null) {
            JSONArray b2 = b(this.J);
            int f2 = u.f(this.p);
            int e2 = u.e(this.p);
            com.bytedance.sdk.openadsdk.core.n<com.bytedance.sdk.openadsdk.b.a> f3 = m.f();
            if (b2 != null && f3 != null && f2 > 0 && e2 > 0) {
                com.bytedance.sdk.openadsdk.core.e.o oVar = new com.bytedance.sdk.openadsdk.core.e.o();
                oVar.f1145e = b2;
                AdSlot x2 = this.p.x();
                if (x2 != null) {
                    x2.setAdCount(6);
                    f3.a(x2, oVar, e2, new n.a() {
                        public void a(int i, String str) {
                            TTVideoLandingPageActivity.this.a(0);
                        }

                        public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                            if (aVar != null) {
                                try {
                                    TTVideoLandingPageActivity.this.N.set(false);
                                    TTVideoLandingPageActivity.this.i.b(new JSONObject(aVar.c()));
                                } catch (Exception unused) {
                                    TTVideoLandingPageActivity.this.a(0);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    private JSONArray b(String str) {
        int i2;
        JSONArray jSONArray = this.O;
        if (jSONArray != null && jSONArray.length() > 0) {
            return this.O;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("?id=");
        int indexOf2 = str.indexOf("&");
        if (indexOf == -1 || indexOf2 == -1 || (i2 = indexOf + 4) >= indexOf2) {
            return null;
        }
        String substring = str.substring(i2, indexOf2);
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(substring);
        return jSONArray2;
    }

    public void a(boolean z2, JSONArray jSONArray) {
        if (z2 && jSONArray != null && jSONArray.length() > 0) {
            this.O = jSONArray;
            s();
        }
    }

    private static class a extends AsyncTask<Void, Void, Drawable> {

        /* renamed from: a  reason: collision with root package name */
        private Bitmap f163a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<com.bykv.vk.openvk.component.video.api.d.b> f164b;

        private a(Bitmap bitmap, com.bykv.vk.openvk.component.video.api.d.b bVar) {
            this.f163a = bitmap;
            this.f164b = new WeakReference<>(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap a2 = com.bytedance.sdk.component.adexpress.c.a.a(m.a(), this.f163a, 25);
                if (a2 == null) {
                    return null;
                }
                return new BitmapDrawable(m.a().getResources(), a2);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Drawable drawable) {
            WeakReference<com.bykv.vk.openvk.component.video.api.d.b> weakReference;
            if (drawable != null && (weakReference = this.f164b) != null && weakReference.get() != null) {
                ((com.bykv.vk.openvk.component.video.api.d.b) this.f164b.get()).a(drawable);
            }
        }
    }
}
