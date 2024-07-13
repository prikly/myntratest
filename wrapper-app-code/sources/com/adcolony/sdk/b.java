package com.adcolony.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.onesignal.outcomes.OSOutcomeConstants;
import io.bidmachine.utils.IabUtils;
import java.util.Iterator;
import java.util.Map;

class b extends Activity {

    /* renamed from: a  reason: collision with root package name */
    c f9907a;

    /* renamed from: b  reason: collision with root package name */
    int f9908b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f9909c;

    /* renamed from: d  reason: collision with root package name */
    boolean f9910d;

    /* renamed from: e  reason: collision with root package name */
    boolean f9911e;

    /* renamed from: f  reason: collision with root package name */
    boolean f9912f;

    /* renamed from: g  reason: collision with root package name */
    boolean f9913g;

    /* renamed from: h  reason: collision with root package name */
    boolean f9914h;
    boolean i;

    class a implements j0 {
        a() {
        }

        public void a(h0 h0Var) {
            b.this.a(h0Var);
        }
    }

    b() {
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        Iterator<Map.Entry<Integer, a1>> it = this.f9907a.m().entrySet().iterator();
        while (it.hasNext() && !isFinishing()) {
            a1 a1Var = (a1) it.next().getValue();
            if (!a1Var.f() && a1Var.b().isPlaying()) {
                a1Var.h();
            }
        }
        AdColonyInterstitial j = a.b().j();
        if (j != null && j.i() && j.e().c() != null && z && this.f9914h) {
            j.e().a("pause");
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        for (Map.Entry<Integer, a1> value : this.f9907a.m().entrySet()) {
            a1 a1Var = (a1) value.getValue();
            if (!a1Var.f() && !a1Var.b().isPlaying() && !a.b().o().b()) {
                a1Var.i();
            }
        }
        AdColonyInterstitial j = a.b().j();
        if (j != null && j.i() && j.e().c() != null) {
            if ((!z || !this.f9914h) && this.i) {
                j.e().a("resume");
            }
        }
    }

    public void onBackPressed() {
        f1 b2 = c0.b();
        c0.a(b2, OSOutcomeConstants.OUTCOME_ID, this.f9907a.a());
        new h0("AdSession.on_back_button", this.f9907a.k(), b2).c();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this instanceof AdColonyInterstitialActivity) {
            a();
        } else {
            ((AdColonyAdViewActivity) this).c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a.d() || a.b().l() == null) {
            finish();
            return;
        }
        k b2 = a.b();
        this.f9912f = false;
        c l = b2.l();
        this.f9907a = l;
        l.d(false);
        if (z0.g()) {
            this.f9907a.d(true);
        }
        this.f9907a.a();
        this.f9909c = this.f9907a.k();
        boolean multiWindowEnabled = b2.u().getMultiWindowEnabled();
        this.f9913g = multiWindowEnabled;
        if (multiWindowEnabled) {
            getWindow().addFlags(2048);
            getWindow().clearFlags(1024);
        } else {
            getWindow().addFlags(1024);
            getWindow().clearFlags(2048);
        }
        requestWindowFeature(1);
        getWindow().getDecorView().setBackgroundColor(-16777216);
        if (b2.u().getKeepScreenOn()) {
            getWindow().addFlags(128);
        }
        ViewParent parent = this.f9907a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f9907a);
        }
        setContentView(this.f9907a);
        this.f9907a.i().add(a.a("AdSession.finish_fullscreen_ad", (j0) new a(), true));
        this.f9907a.j().add("AdSession.finish_fullscreen_ad");
        a(this.f9908b);
        if (!this.f9907a.o()) {
            f1 b3 = c0.b();
            c0.a(b3, OSOutcomeConstants.OUTCOME_ID, this.f9907a.a());
            c0.b(b3, "screen_width", this.f9907a.d());
            c0.b(b3, "screen_height", this.f9907a.b());
            new h0("AdSession.on_fullscreen_ad_started", this.f9907a.k(), b3).c();
            this.f9907a.e(true);
            return;
        }
        a();
    }

    public void onDestroy() {
        super.onDestroy();
        if (a.d() && this.f9907a != null && !this.f9910d) {
            if ((Build.VERSION.SDK_INT < 24 || !z0.g()) && !this.f9907a.q()) {
                f1 b2 = c0.b();
                c0.a(b2, OSOutcomeConstants.OUTCOME_ID, this.f9907a.a());
                new h0("AdSession.on_error", this.f9907a.k(), b2).c();
                this.f9912f = true;
            }
        }
    }

    public void onPause() {
        super.onPause();
        a(this.f9911e);
        this.f9911e = false;
    }

    public void onResume() {
        super.onResume();
        a();
        b(this.f9911e);
        this.f9911e = true;
        this.i = true;
    }

    public void onWindowFocusChanged(boolean z) {
        if (z && this.f9911e) {
            a.b().x().b(true);
            b(this.f9911e);
            this.f9914h = true;
        } else if (!z && this.f9911e) {
            a.b().x().a(true);
            a(this.f9911e);
            this.f9914h = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Rect rect;
        k b2 = a.b();
        if (this.f9907a == null) {
            this.f9907a = b2.l();
        }
        c cVar = this.f9907a;
        if (cVar != null) {
            cVar.d(false);
            if (z0.g()) {
                this.f9907a.d(true);
            }
            if (this.f9913g) {
                rect = b2.n().x();
            } else {
                rect = b2.n().w();
            }
            if (rect.width() > 0 && rect.height() > 0) {
                f1 b3 = c0.b();
                f1 b4 = c0.b();
                float s = b2.n().s();
                c0.b(b4, IabUtils.KEY_WIDTH, (int) (((float) rect.width()) / s));
                c0.b(b4, IabUtils.KEY_HEIGHT, (int) (((float) rect.height()) / s));
                c0.b(b4, "app_orientation", z0.d(z0.f()));
                c0.b(b4, "x", 0);
                c0.b(b4, "y", 0);
                c0.a(b4, "ad_session_id", this.f9907a.a());
                c0.b(b3, "screen_width", rect.width());
                c0.b(b3, "screen_height", rect.height());
                c0.a(b3, "ad_session_id", this.f9907a.a());
                c0.b(b3, OSOutcomeConstants.OUTCOME_ID, this.f9907a.c());
                this.f9907a.setLayoutParams(new FrameLayout.LayoutParams(rect.width(), rect.height()));
                this.f9907a.b(rect.width());
                this.f9907a.a(rect.height());
                new h0("MRAID.on_size_change", this.f9907a.k(), b4).c();
                new h0("AdContainer.on_orientation_change", this.f9907a.k(), b3).c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(h0 h0Var) {
        int d2 = c0.d(h0Var.a(), "status");
        if ((d2 == 5 || d2 == 0 || d2 == 6 || d2 == 1) && !this.f9910d) {
            k b2 = a.b();
            r o = b2.o();
            b2.d(h0Var);
            if (o.a() != null) {
                o.a().dismiss();
                o.a((AlertDialog) null);
            }
            if (!this.f9912f) {
                finish();
            }
            this.f9910d = true;
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            b2.e(false);
            f1 b3 = c0.b();
            c0.a(b3, OSOutcomeConstants.OUTCOME_ID, this.f9907a.a());
            new h0("AdSession.on_close", this.f9907a.k(), b3).c();
            b2.a((c) null);
            b2.a((AdColonyInterstitial) null);
            b2.a((AdColonyAdView) null);
            a.b().c().f().remove(this.f9907a.a());
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        if (i2 == 0) {
            setRequestedOrientation(7);
        } else if (i2 != 1) {
            setRequestedOrientation(4);
        } else {
            setRequestedOrientation(6);
        }
        this.f9908b = i2;
    }
}
