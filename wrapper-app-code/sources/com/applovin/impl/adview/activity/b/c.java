package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.graphics.PointF;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.adview.j;
import com.applovin.impl.b.a;
import com.applovin.impl.b.f;
import com.applovin.impl.b.k;
import com.applovin.impl.b.l;
import com.applovin.impl.b.m;
import com.applovin.impl.b.o;
import com.applovin.impl.sdk.a.d;
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

public class c extends e {
    /* access modifiers changed from: private */
    public final a H;
    /* access modifiers changed from: private */
    public final Set<k> I = new HashSet();

    public c(e eVar, Activity activity, n nVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, nVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        a aVar = (a) eVar;
        this.H = aVar;
        this.I.addAll(aVar.a(a.c.VIDEO, l.f14319a));
        a(a.c.IMPRESSION);
        a(a.c.VIDEO, "creativeView");
        this.H.o().d();
    }

    private void G() {
        if (r() && !this.I.isEmpty()) {
            v vVar = this.f14045c;
            if (v.a()) {
                v vVar2 = this.f14045c;
                vVar2.d("AppLovinFullscreenActivity", "Firing " + this.I.size() + " un-fired video progress trackers when video was completed.");
            }
            a(this.I);
        }
    }

    private void a(a.c cVar) {
        a(cVar, f.UNSPECIFIED);
    }

    private void a(a.c cVar, f fVar) {
        a(cVar, "", fVar);
    }

    private void a(a.c cVar, String str) {
        a(cVar, str, f.UNSPECIFIED);
    }

    private void a(a.c cVar, String str, f fVar) {
        a(this.H.a(cVar, str), fVar);
    }

    /* access modifiers changed from: private */
    public void a(Set<k> set) {
        a(set, f.UNSPECIFIED);
    }

    private void a(Set<k> set, f fVar) {
        if (set != null && !set.isEmpty()) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(this.v.I());
            o aN = this.H.aN();
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
        G();
        if (!m.c(this.H)) {
            v vVar = this.f14045c;
            if (v.a()) {
                this.f14045c.b("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            h();
        } else if (!this.F) {
            a(a.c.COMPANION, "creativeView");
            this.H.o().i();
            this.H.o().a((View) this.f14048f, (List<d>) Collections.singletonList(new d(this.f14048f, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
            super.A();
        }
    }

    public void a(PointF pointF) {
        a(a.c.VIDEO_CLICK);
        this.H.o().o();
        super.a(pointF);
    }

    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        this.B.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1), (j.a) new j.a() {
            public void a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(c.this.D - (c.this.v.H() - c.this.v.I()));
                int F = c.this.F();
                HashSet hashSet = new HashSet();
                for (k kVar : new HashSet(c.this.I)) {
                    if (kVar.a(seconds, F)) {
                        hashSet.add(kVar);
                        c.this.I.remove(kVar);
                    }
                }
                c.this.a((Set<k>) hashSet);
                if (F >= 25 && F < 50) {
                    c.this.H.o().f();
                } else if (F >= 50 && F < 75) {
                    c.this.H.o().g();
                } else if (F >= 75) {
                    c.this.H.o().h();
                }
            }

            public boolean b() {
                return !c.this.F;
            }
        });
        ArrayList arrayList = new ArrayList();
        if (this.w != null) {
            arrayList.add(new d(this.w, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        if (this.x != null) {
            arrayList.add(new d(this.x, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        if (this.A != null) {
            arrayList.add(new d(this.A, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        if (this.y != null) {
            arrayList.add(new d(this.y, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        if (this.z != null) {
            arrayList.add(new d(this.z, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        this.H.o().a((View) this.u, (List<d>) arrayList);
    }

    public void c() {
        a(a.c.VIDEO, "skip");
        this.H.o().n();
        super.c();
    }

    /* access modifiers changed from: protected */
    public void c(long j) {
        super.c(j);
        this.H.o().a((float) TimeUnit.MILLISECONDS.toSeconds(j), Utils.isVideoMutedInitially(this.f14044b));
    }

    public void c(String str) {
        a(a.c.ERROR, f.MEDIA_FILE_ERROR);
        this.H.o().a(str);
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
        a(this.F ? a.c.COMPANION : a.c.VIDEO, "resume");
        this.H.o().k();
    }

    public void g() {
        super.g();
        a(this.F ? a.c.COMPANION : a.c.VIDEO, "pause");
        this.H.o().j();
    }

    public void h() {
        if (this.H != null) {
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
        if (this.H.ad() >= 0 || this.H.ae() >= 0) {
            int i = (this.H.ad() > 0 ? 1 : (this.H.ad() == 0 ? 0 : -1));
            a aVar = this.H;
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
                j = (long) (((double) j2) * (((double) this.H.ae()) / 100.0d));
            }
            b(j);
        }
    }

    /* access modifiers changed from: protected */
    public void x() {
        super.x();
        a aVar = this.H;
        if (aVar != null) {
            aVar.o().l();
        }
    }

    /* access modifiers changed from: protected */
    public void y() {
        super.y();
        a aVar = this.H;
        if (aVar != null) {
            aVar.o().m();
        }
    }

    public void z() {
        super.z();
        a(a.c.VIDEO, this.C ? "mute" : "unmute");
        this.H.o().a(this.C);
    }
}
