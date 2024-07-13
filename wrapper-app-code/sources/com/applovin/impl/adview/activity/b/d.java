package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.graphics.PointF;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.impl.adview.j;
import com.applovin.impl.b.a;
import com.applovin.impl.b.f;
import com.applovin.impl.b.k;
import com.applovin.impl.b.l;
import com.applovin.impl.b.m;
import com.applovin.impl.b.o;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class d extends f {
    /* access modifiers changed from: private */
    public final a F;
    /* access modifiers changed from: private */
    public final Set<k> G = new HashSet();

    public d(e eVar, final Activity activity, final n nVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, nVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        a aVar = (a) eVar;
        this.F = aVar;
        if (aVar.aQ()) {
            this.A = new ImageView(activity);
            this.A.setScaleType(ImageView.ScaleType.FIT_XY);
            this.A.setClickable(true);
            this.A.setVisibility(8);
            this.A.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Uri b2 = d.this.F.aP().b();
                    if (b2 != null) {
                        v vVar = d.this.f14045c;
                        if (v.a()) {
                            v vVar2 = d.this.f14045c;
                            vVar2.b("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + b2);
                        }
                        d.this.a(a.c.INDUSTRY_ICON_CLICK);
                        Utils.openUri(activity, b2, nVar);
                    }
                }
            });
        }
        this.G.addAll(this.F.a(a.c.VIDEO, l.f14319a));
        a(a.c.IMPRESSION);
        a(a.c.VIDEO, "creativeView");
        this.F.o().d();
    }

    private void C() {
        if (r() && !this.G.isEmpty()) {
            v vVar = this.f14045c;
            if (v.a()) {
                v vVar2 = this.f14045c;
                vVar2.d("AppLovinFullscreenActivity", "Firing " + this.G.size() + " un-fired video progress trackers when video was completed.");
            }
            a(this.G);
        }
    }

    private boolean D() {
        return this.A != null && this.F.aQ();
    }

    /* access modifiers changed from: private */
    public void a(a.c cVar) {
        a(cVar, f.UNSPECIFIED);
    }

    private void a(a.c cVar, f fVar) {
        a(cVar, "", fVar);
    }

    private void a(a.c cVar, String str) {
        a(cVar, str, f.UNSPECIFIED);
    }

    private void a(a.c cVar, String str, f fVar) {
        a(this.F.a(cVar, str), fVar);
    }

    /* access modifiers changed from: private */
    public void a(Set<k> set) {
        a(set, f.UNSPECIFIED);
    }

    private void a(Set<k> set, f fVar) {
        if (set != null && !set.isEmpty()) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds((long) this.u.getCurrentPosition());
            o aN = this.F.aN();
            Uri a2 = aN != null ? aN.a() : null;
            v vVar = this.f14045c;
            if (v.a()) {
                v vVar2 = this.f14045c;
                vVar2.b("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
            }
            m.a(set, seconds, a2, fVar, this.f14044b);
        }
    }

    public void A() {
        C();
        if (!m.c(this.F)) {
            v vVar = this.f14045c;
            if (v.a()) {
                this.f14045c.b("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            h();
        } else if (!this.E) {
            a(a.c.COMPANION, "creativeView");
            this.F.o().i();
            this.F.o().a((View) this.f14048f, (List<com.applovin.impl.sdk.a.d>) Collections.singletonList(new com.applovin.impl.sdk.a.d(this.f14048f, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
            super.A();
        }
    }

    public void a(PointF pointF) {
        a(a.c.VIDEO_CLICK);
        this.F.o().o();
        super.a(pointF);
    }

    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (D()) {
            a(a.c.INDUSTRY_ICON_IMPRESSION);
            Utils.setImageUrl(this.F.aP().a().toString(), this.A, this.f14044b);
            this.A.setVisibility(0);
        }
        this.B.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1), (j.a) new j.a() {
            public void a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(d.this.D - ((long) (d.this.u.getDuration() - d.this.u.getCurrentPosition())));
                int B = d.this.B();
                HashSet hashSet = new HashSet();
                for (k kVar : new HashSet(d.this.G)) {
                    if (kVar.a(seconds, B)) {
                        hashSet.add(kVar);
                        d.this.G.remove(kVar);
                    }
                }
                d.this.a((Set<k>) hashSet);
                if (B >= 25 && B < 50) {
                    d.this.F.o().f();
                } else if (B >= 50 && B < 75) {
                    d.this.F.o().g();
                } else if (B >= 75) {
                    d.this.F.o().h();
                }
            }

            public boolean b() {
                return !d.this.E;
            }
        });
        ArrayList arrayList = new ArrayList();
        if (this.v != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.v, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        if (this.w != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.w, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        if (this.z != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.z, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        if (this.x != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.x, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        if (this.y != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.y, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        this.F.o().a((View) this.u, (List<com.applovin.impl.sdk.a.d>) arrayList);
    }

    public void c() {
        a(a.c.VIDEO, "skip");
        this.F.o().n();
        super.c();
    }

    /* access modifiers changed from: protected */
    public void c(long j) {
        super.c(j);
        this.F.o().a((float) TimeUnit.MILLISECONDS.toSeconds(j), Utils.isVideoMutedInitially(this.f14044b));
    }

    public void c(String str) {
        a(a.c.ERROR, f.MEDIA_FILE_ERROR);
        this.F.o().a(str);
        super.c(str);
    }

    public void d() {
        a((ViewGroup) null);
    }

    public void e() {
        this.B.c();
        super.e();
    }

    public void f() {
        super.f();
        a(this.E ? a.c.COMPANION : a.c.VIDEO, "resume");
        this.F.o().k();
    }

    public void g() {
        super.g();
        a(this.E ? a.c.COMPANION : a.c.VIDEO, "pause");
        this.F.o().j();
    }

    public void h() {
        if (this.F != null) {
            a(a.c.VIDEO, "close");
            a(a.c.COMPANION, "close");
        }
        super.h();
    }

    /* access modifiers changed from: protected */
    public void u() {
        long j;
        int t;
        long j2 = 0;
        if (this.F.ad() >= 0 || this.F.ae() >= 0) {
            int i = (this.F.ad() > 0 ? 1 : (this.F.ad() == 0 ? 0 : -1));
            a aVar = this.F;
            if (i >= 0) {
                j = aVar.ad();
            } else {
                com.applovin.impl.b.n aM = aVar.aM();
                if (aM != null && aM.b() > 0) {
                    j2 = 0 + TimeUnit.SECONDS.toMillis((long) aM.b());
                } else if (this.D > 0) {
                    j2 = 0 + this.D;
                }
                if (aVar.af() && (t = (int) aVar.t()) > 0) {
                    j2 += TimeUnit.SECONDS.toMillis((long) t);
                }
                j = (long) (((double) j2) * (((double) this.F.ae()) / 100.0d));
            }
            b(j);
        }
    }

    /* access modifiers changed from: protected */
    public void x() {
        super.x();
        a aVar = this.F;
        if (aVar != null) {
            aVar.o().l();
        }
    }

    /* access modifiers changed from: protected */
    public void y() {
        super.y();
        a aVar = this.F;
        if (aVar != null) {
            aVar.o().m();
        }
    }

    public void z() {
        super.z();
        a(a.c.VIDEO, this.C ? "mute" : "unmute");
        this.F.o().a(this.C);
    }
}
