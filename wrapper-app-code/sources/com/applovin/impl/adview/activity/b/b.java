package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.sdk.a.d;
import com.applovin.impl.sdk.ad.a;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.f;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class b extends a {
    private final com.applovin.impl.adview.activity.a.b u = new com.applovin.impl.adview.activity.a.b(this.f14043a, this.f14047e, this.f14044b);
    private f v;
    private long w;
    /* access modifiers changed from: private */
    public AtomicBoolean x = new AtomicBoolean();

    public b(e eVar, Activity activity, n nVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, nVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
    }

    private long c() {
        if (!(this.f14043a instanceof a)) {
            return 0;
        }
        float l = ((a) this.f14043a).l();
        if (l <= 0.0f) {
            l = (float) this.f14043a.t();
        }
        return (long) (((double) Utils.secondsToMillisLong(l)) * (((double) this.f14043a.R()) / 100.0d));
    }

    public void a() {
    }

    public void a(long j) {
    }

    public void a(ViewGroup viewGroup) {
        this.u.a(this.f14049g, this.f14048f, viewGroup);
        a(false);
        this.f14048f.renderAd(this.f14043a);
        a("javascript:al_onPoststitialShow();", (long) this.f14043a.S());
        if (t()) {
            long c2 = c();
            this.w = c2;
            if (c2 > 0) {
                v vVar = this.f14045c;
                if (v.a()) {
                    v vVar2 = this.f14045c;
                    vVar2.b("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.w + "ms...");
                }
                this.v = f.a(this.w, this.f14044b, new Runnable() {
                    public void run() {
                        v vVar = b.this.f14045c;
                        if (v.a()) {
                            b.this.f14045c.b("AppLovinFullscreenActivity", "Marking ad as fully watched");
                        }
                        b.this.x.set(true);
                    }
                });
            }
        }
        if (this.f14049g != null) {
            if (this.f14043a.t() >= 0) {
                a(this.f14049g, this.f14043a.t(), new Runnable() {
                    public void run() {
                        b.this.j = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f14049g.setVisibility(0);
            }
        }
        u();
        this.f14044b.V().a((com.applovin.impl.sdk.e.a) new z(this.f14044b, new Runnable() {
            public void run() {
                if (b.this.f14049g != null) {
                    b.this.f14043a.o().a((View) b.this.f14048f, (List<d>) Collections.singletonList(new d(b.this.f14049g, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
                } else {
                    b.this.f14043a.o().a((View) b.this.f14048f);
                }
            }
        }), o.a.MAIN, TimeUnit.SECONDS.toMillis(1));
        v();
        super.b(Utils.isVideoMutedInitially(this.f14044b));
    }

    public void b() {
    }

    public void d() {
        a((ViewGroup) null);
    }

    public void e() {
    }

    public void h() {
        m();
        f fVar = this.v;
        if (fVar != null) {
            fVar.a();
            this.v = null;
        }
        super.h();
    }

    /* access modifiers changed from: protected */
    public void m() {
        f fVar;
        boolean r = r();
        int i = 100;
        if (t()) {
            if (!r && (fVar = this.v) != null) {
                i = (int) Math.min(100.0d, (((double) (this.w - fVar.b())) / ((double) this.w)) * 100.0d);
            }
            v vVar = this.f14045c;
            if (v.a()) {
                v vVar2 = this.f14045c;
                vVar2.b("AppLovinFullscreenActivity", "Ad engaged at " + i + "%");
            }
        }
        super.a(i, false, r, -2);
    }

    /* access modifiers changed from: protected */
    public boolean r() {
        if (t()) {
            return this.x.get();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean s() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void u() {
        long j;
        long millis;
        long j2 = 0;
        if (this.f14043a.ad() >= 0 || this.f14043a.ae() >= 0) {
            int i = (this.f14043a.ad() > 0 ? 1 : (this.f14043a.ad() == 0 ? 0 : -1));
            e eVar = this.f14043a;
            if (i >= 0) {
                j = eVar.ad();
            } else {
                if (eVar.af()) {
                    int l = (int) ((a) this.f14043a).l();
                    if (l > 0) {
                        millis = TimeUnit.SECONDS.toMillis((long) l);
                    } else {
                        int t = (int) this.f14043a.t();
                        if (t > 0) {
                            millis = TimeUnit.SECONDS.toMillis((long) t);
                        }
                    }
                    j2 = 0 + millis;
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
        this.x.set(true);
    }
}
