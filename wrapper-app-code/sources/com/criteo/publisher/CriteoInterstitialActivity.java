package com.criteo.publisher;

import android.app.Activity;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.criteo.publisher.b0.c;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.explorestack.protobuf.openrtb.LossReason;
import java.lang.ref.WeakReference;

public class CriteoInterstitialActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private final g f2279a = h.b(getClass());

    /* renamed from: b  reason: collision with root package name */
    private WebView f2280b;

    /* renamed from: c  reason: collision with root package name */
    private ResultReceiver f2281c;

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f2282d;

    /* renamed from: e  reason: collision with root package name */
    private ComponentName f2283e;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            c();
        } catch (Throwable th) {
            this.f2279a.a(v.b(th));
            finish();
        }
    }

    private void c() {
        setContentView(R.layout.activity_criteo_interstitial);
        this.f2282d = (FrameLayout) findViewById(R.id.AdLayout);
        WebView webView = new WebView(getApplicationContext());
        this.f2280b = webView;
        this.f2282d.addView(webView, 0);
        ImageButton imageButton = (ImageButton) findViewById(R.id.closeButton);
        Bundle extras = getIntent().getExtras();
        if (!(extras == null || extras.getString("webviewdata") == null)) {
            String string = extras.getString("webviewdata");
            this.f2281c = (ResultReceiver) extras.getParcelable("resultreceiver");
            this.f2283e = (ComponentName) extras.getParcelable("callingactivity");
            d();
            a(string);
        }
        imageButton.setOnClickListener(new a());
    }

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            CriteoInterstitialActivity.this.b();
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        Bundle bundle = new Bundle();
        bundle.putInt("Action", 201);
        this.f2281c.send(100, bundle);
        finish();
    }

    /* access modifiers changed from: private */
    public void a() {
        Bundle bundle = new Bundle();
        bundle.putInt("Action", LossReason.LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE);
        this.f2281c.send(100, bundle);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f2282d.removeAllViews();
        this.f2280b.destroy();
        this.f2280b = null;
    }

    private void a(String str) {
        this.f2280b.loadDataWithBaseURL("https://criteo.com", str, "text/html", "UTF-8", "about:blank");
    }

    private void d() {
        this.f2280b.getSettings().setJavaScriptEnabled(true);
        this.f2280b.setWebViewClient(new com.criteo.publisher.b0.a(new b(new WeakReference(this), (a) null), this.f2283e));
    }

    public void onBackPressed() {
        b();
    }

    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<CriteoInterstitialActivity> f2285a;

        /* synthetic */ b(WeakReference weakReference, a aVar) {
            this(weakReference);
        }

        private b(WeakReference<CriteoInterstitialActivity> weakReference) {
            this.f2285a = weakReference;
        }

        public void b() {
            CriteoInterstitialActivity criteoInterstitialActivity = (CriteoInterstitialActivity) this.f2285a.get();
            if (criteoInterstitialActivity != null) {
                criteoInterstitialActivity.a();
            }
        }

        public void a() {
            CriteoInterstitialActivity criteoInterstitialActivity = (CriteoInterstitialActivity) this.f2285a.get();
            if (criteoInterstitialActivity != null) {
                criteoInterstitialActivity.b();
            }
        }
    }
}
