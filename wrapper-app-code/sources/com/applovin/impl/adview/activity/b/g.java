package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.impl.adview.activity.a.d;
import com.applovin.impl.adview.m;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class g extends a implements com.applovin.impl.adview.g {
    private double A;
    private AtomicBoolean B = new AtomicBoolean();
    private AtomicBoolean C = new AtomicBoolean();
    private boolean D = Utils.isVideoMutedInitially(this.f14044b);
    /* access modifiers changed from: private */
    public long E = -2;
    /* access modifiers changed from: private */
    public long F = 0;
    private final d u = new d(this.f14043a, this.f14047e, this.f14044b);
    /* access modifiers changed from: private */
    public final m v;
    /* access modifiers changed from: private */
    public final ImageView w;
    private final com.applovin.impl.adview.a x;
    private final boolean y = this.f14043a.f();
    private double z;

    private class a implements View.OnClickListener {
        private a() {
        }

        public void onClick(View view) {
            if (view == g.this.v) {
                if (g.this.s()) {
                    g.this.p();
                    g.this.s.b();
                    return;
                }
                g.this.x();
            } else if (view == g.this.w) {
                g.this.z();
            } else {
                v vVar = g.this.f14045c;
                if (v.a()) {
                    v vVar2 = g.this.f14045c;
                    vVar2.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                }
            }
        }
    }

    public g(e eVar, Activity activity, n nVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, nVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        a aVar = new a();
        if (eVar.r() >= 0) {
            m mVar = new m(eVar.x(), activity);
            this.v = mVar;
            mVar.setVisibility(8);
            this.v.setOnClickListener(aVar);
        } else {
            this.v = null;
        }
        if (a(this.D, nVar)) {
            ImageView imageView = new ImageView(activity);
            this.w = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.w.setClickable(true);
            this.w.setOnClickListener(aVar);
            d(this.D);
        } else {
            this.w = null;
        }
        if (this.y) {
            com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(activity, ((Integer) nVar.a(b.cJ)).intValue(), 16842874);
            this.x = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            this.x.setBackgroundColor(Color.parseColor("#00000000"));
            this.x.setVisibility(8);
            return;
        }
        this.x = null;
    }

    /* access modifiers changed from: private */
    public void A() {
        if (this.C.compareAndSet(false, true)) {
            a(this.v, this.f14043a.r(), new Runnable() {
                public void run() {
                    long unused = g.this.E = -1;
                    long unused2 = g.this.F = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    private static boolean a(boolean z2, n nVar) {
        if (!((Boolean) nVar.a(b.cy)).booleanValue()) {
            return false;
        }
        if (!((Boolean) nVar.a(b.cz)).booleanValue() || z2) {
            return true;
        }
        return ((Boolean) nVar.a(b.cB)).booleanValue();
    }

    private void d(boolean z2) {
        if (h.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f14047e.getDrawable(z2 ? R.drawable.applovin_ic_unmute_to_mute : R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.w.setScaleType(ImageView.ScaleType.FIT_XY);
                this.w.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aC = z2 ? this.f14043a.aC() : this.f14043a.aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.w.setImageURI(aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void a() {
        v vVar = this.f14045c;
        if (v.a()) {
            this.f14045c.b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    public void a(double d2) {
        b("javascript:al_setVideoMuted(" + this.D + ");");
        com.applovin.impl.adview.a aVar = this.x;
        if (aVar != null) {
            aVar.b();
        }
        if (this.v != null) {
            A();
        }
        this.f14048f.getController().m();
        this.A = d2;
        u();
        if (this.f14043a.am()) {
            this.s.a(this.f14043a, (Runnable) null);
        }
    }

    public void a(long j) {
    }

    public void a(ViewGroup viewGroup) {
        this.u.a(this.w, this.v, this.f14049g, this.x, this.f14048f, viewGroup);
        this.f14048f.getController().a((com.applovin.impl.adview.g) this);
        a(false);
        com.applovin.impl.adview.a aVar = this.x;
        if (aVar != null) {
            aVar.a();
        }
        this.f14048f.renderAd(this.f14043a);
        if (this.v != null) {
            this.f14044b.V().a(new z(this.f14044b, new Runnable() {
                public void run() {
                    g.this.A();
                }
            }), o.a.MAIN, this.f14043a.s(), true);
        }
        this.f14044b.V().a((com.applovin.impl.sdk.e.a) new z(this.f14044b, new Runnable() {
            public void run() {
                if (g.this.f14049g != null) {
                    g.this.f14043a.o().a((View) g.this.f14048f, (List<com.applovin.impl.sdk.a.d>) Collections.singletonList(new com.applovin.impl.sdk.a.d(g.this.f14049g, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
                } else {
                    g.this.f14043a.o().a((View) g.this.f14048f);
                }
            }
        }), o.a.MAIN, 500);
        super.b(this.D);
    }

    public void b() {
        v vVar = this.f14045c;
        if (v.a()) {
            this.f14045c.b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        x();
    }

    public void b(double d2) {
        this.z = d2;
    }

    public void c() {
        com.applovin.impl.adview.a aVar = this.x;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void d() {
        a((ViewGroup) null);
    }

    public void e() {
    }

    public void g_() {
        y();
    }

    public void h() {
        m();
        super.h();
    }

    public void h_() {
        com.applovin.impl.adview.a aVar = this.x;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: protected */
    public void m() {
        super.a((int) this.z, this.y, r(), this.E);
    }

    /* access modifiers changed from: protected */
    public boolean r() {
        return this.z >= ((double) this.f14043a.Q());
    }

    /* access modifiers changed from: protected */
    public boolean s() {
        return t() && !r();
    }

    /* access modifiers changed from: protected */
    public void u() {
        long j;
        int l;
        long j2 = 0;
        if (this.f14043a.ad() >= 0 || this.f14043a.ae() >= 0) {
            int i = (this.f14043a.ad() > 0 ? 1 : (this.f14043a.ad() == 0 ? 0 : -1));
            e eVar = this.f14043a;
            if (i >= 0) {
                j = eVar.ad();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) eVar;
                if (this.A > 0.0d) {
                    j2 = 0 + TimeUnit.SECONDS.toMillis((long) this.A);
                }
                if (aVar.af() && ((l = (int) ((com.applovin.impl.sdk.ad.a) this.f14043a).l()) > 0 || (l = (int) aVar.t()) > 0)) {
                    j2 += TimeUnit.SECONDS.toMillis((long) l);
                }
                j = (long) (((double) j2) * (((double) this.f14043a.ae()) / 100.0d));
            }
            b(j);
        }
    }

    public void w() {
        super.w();
        this.u.a(this.f14050h);
        this.j = SystemClock.elapsedRealtime();
        this.z = 100.0d;
    }

    public void x() {
        this.E = SystemClock.elapsedRealtime() - this.F;
        v vVar = this.f14045c;
        if (v.a()) {
            this.f14045c.b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.E + "ms");
        }
        this.f14046d.f();
        this.l++;
        if (this.f14043a.y()) {
            h();
        } else {
            y();
        }
    }

    public void y() {
        if (this.B.compareAndSet(false, true)) {
            v vVar = this.f14045c;
            if (v.a()) {
                this.f14045c.b("AppLovinFullscreenActivity", "Showing postitial...");
            }
            b("javascript:al_showPostitial();");
            m mVar = this.v;
            if (mVar != null) {
                mVar.setVisibility(8);
            }
            ImageView imageView = this.w;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            com.applovin.impl.adview.a aVar = this.x;
            if (aVar != null) {
                aVar.b();
            }
            if (this.f14049g != null) {
                if (this.f14043a.t() >= 0) {
                    a(this.f14049g, this.f14043a.t(), new Runnable() {
                        public void run() {
                            g.this.j = SystemClock.elapsedRealtime();
                        }
                    });
                } else {
                    this.f14049g.setVisibility(0);
                }
            }
            this.f14048f.getController().n();
            v();
        }
    }

    /* access modifiers changed from: protected */
    public void z() {
        this.D = !this.D;
        b("javascript:al_setVideoMuted(" + this.D + ");");
        d(this.D);
        a(this.D, 0);
    }
}
