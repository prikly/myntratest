package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.aw;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.u;
import com.applovin.exoplayer2.j.h;
import com.applovin.exoplayer2.k.p;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.ui.f;
import com.applovin.exoplayer2.ui.g;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.j;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.s;
import com.applovin.impl.adview.t;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class e extends a implements AppLovinCommunicatorSubscriber {
    protected final ProgressBar A;
    protected final j B;
    protected boolean C;
    protected long D;
    protected int E;
    protected boolean F;
    protected boolean G;
    private final com.applovin.impl.adview.activity.a.c H = new com.applovin.impl.adview.activity.a.c(this.f14043a, this.f14047e, this.f14044b);
    private final a I = new a();
    private final Handler J;
    private final boolean K;
    private long L;
    private final AtomicBoolean M;
    private final AtomicBoolean N;
    /* access modifiers changed from: private */
    public long O;
    /* access modifiers changed from: private */
    public long P;
    protected final g u;
    protected final aw v;
    protected final com.applovin.impl.adview.a w;
    protected final m x;
    protected final ImageView y;
    protected final t z;

    private class a implements u.a {
        private a() {
        }

        public void a(t tVar) {
            v vVar = e.this.f14045c;
            if (v.a()) {
                e.this.f14045c.b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            e.this.a(tVar.getAndClearLastClickLocation());
        }

        public void b(t tVar) {
            v vVar = e.this.f14045c;
            if (v.a()) {
                e.this.f14045c.b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            e.this.h();
        }

        public void c(t tVar) {
            v vVar = e.this.f14045c;
            if (v.a()) {
                e.this.f14045c.b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            e.this.c();
        }
    }

    private class b implements an.b, f.d, AppLovinTouchToClickListener.OnClickListener {
        private b() {
        }

        public void a(int i) {
            if (i == 0) {
                e.this.u.b();
            }
        }

        public /* synthetic */ void a(ab abVar, int i) {
            an.b.CC.$default$a((an.b) this, abVar, i);
        }

        public /* synthetic */ void a(ac acVar) {
            an.b.CC.$default$a((an.b) this, acVar);
        }

        public void a(ak akVar) {
            e eVar = e.this;
            eVar.c("Video view error (" + akVar + ")");
            e.this.h();
        }

        public /* synthetic */ void a(am amVar) {
            an.b.CC.$default$a((an.b) this, amVar);
        }

        public /* synthetic */ void a(an.a aVar) {
            an.b.CC.$default$a((an.b) this, aVar);
        }

        public /* synthetic */ void a(an.e eVar, an.e eVar2, int i) {
            an.b.CC.$default$a(this, eVar, eVar2, i);
        }

        public /* synthetic */ void a(an anVar, an.c cVar) {
            an.b.CC.$default$a((an.b) this, anVar, cVar);
        }

        public /* synthetic */ void a(ba baVar, int i) {
            an.b.CC.$default$a((an.b) this, baVar, i);
        }

        public /* synthetic */ void a(ad adVar, h hVar) {
            an.b.CC.$default$a((an.b) this, adVar, hVar);
        }

        @Deprecated
        public /* synthetic */ void a(boolean z, int i) {
            an.b.CC.$default$a((an.b) this, z, i);
        }

        @Deprecated
        public /* synthetic */ void b() {
            an.b.CC.$default$b(this);
        }

        public void b(int i) {
            v vVar = e.this.f14045c;
            if (v.a()) {
                v vVar2 = e.this.f14045c;
                vVar2.b("AppLovinFullscreenActivity", "Player state changed to state " + i + " and will play when ready: " + e.this.v.x());
            }
            if (i == 2) {
                e.this.x();
                e.this.f14046d.g();
            } else if (i == 3) {
                e.this.v.a(e.this.C ^ true ? 1.0f : 0.0f);
                e eVar = e.this;
                eVar.c(eVar.v.H());
                e.this.u();
                v vVar3 = e.this.f14045c;
                if (v.a()) {
                    v vVar4 = e.this.f14045c;
                    vVar4.b("AppLovinFullscreenActivity", "MediaPlayer prepared: " + e.this.v);
                }
                e.this.B.a();
                if (e.this.x != null) {
                    e.this.C();
                }
                e.this.y();
                if (e.this.s.c()) {
                    e.this.e();
                }
            } else if (i == 4) {
                v vVar5 = e.this.f14045c;
                if (v.a()) {
                    e.this.f14045c.b("AppLovinFullscreenActivity", "Video completed");
                }
                e.this.G = true;
                if (!e.this.k) {
                    e.this.A();
                } else if (e.this.t()) {
                    e.this.H();
                }
            }
        }

        public /* synthetic */ void b(ak akVar) {
            an.b.CC.$default$b((an.b) this, akVar);
        }

        public /* synthetic */ void b(boolean z, int i) {
            an.b.CC.$default$b(this, z, i);
        }

        public /* synthetic */ void b_(boolean z) {
            an.b.CC.$default$b_(this, z);
        }

        public /* synthetic */ void c(int i) {
            an.b.CC.$default$c((an.b) this, i);
        }

        @Deprecated
        public /* synthetic */ void c(boolean z) {
            an.b.CC.$default$c((an.b) this, z);
        }

        public /* synthetic */ void d(int i) {
            an.b.CC.$default$d((an.b) this, i);
        }

        public /* synthetic */ void d(boolean z) {
            an.b.CC.$default$d((an.b) this, z);
        }

        @Deprecated
        public /* synthetic */ void e(int i) {
            an.b.CC.$default$e((an.b) this, i);
        }

        public /* synthetic */ void e(boolean z) {
            an.b.CC.$default$e((an.b) this, z);
        }

        public void onClick(View view, PointF pointF) {
            e.this.a(pointF);
        }
    }

    private class c implements View.OnClickListener {
        private c() {
        }

        public void onClick(View view) {
            if (view == e.this.x) {
                if (e.this.s()) {
                    e.this.e();
                    e.this.p();
                    e.this.s.b();
                    return;
                }
                e.this.c();
            } else if (view == e.this.y) {
                e.this.z();
            } else {
                v vVar = e.this.f14045c;
                if (v.a()) {
                    v vVar2 = e.this.f14045c;
                    vVar2.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                }
            }
        }
    }

    public e(com.applovin.impl.sdk.ad.e eVar, Activity activity, n nVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, nVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        Handler handler = new Handler(Looper.getMainLooper());
        this.J = handler;
        this.B = new j(handler, this.f14044b);
        this.K = this.f14043a.f();
        this.C = Utils.isVideoMutedInitially(this.f14044b);
        this.L = -1;
        this.M = new AtomicBoolean();
        this.N = new AtomicBoolean();
        this.O = -2;
        this.P = 0;
        if (eVar.hasVideoUrl()) {
            c cVar = new c();
            if (eVar.r() >= 0) {
                m mVar = new m(eVar.x(), activity);
                this.x = mVar;
                mVar.setVisibility(8);
                this.x.setOnClickListener(cVar);
            } else {
                this.x = null;
            }
            if (a(this.C, nVar)) {
                ImageView imageView = new ImageView(activity);
                this.y = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.y.setClickable(true);
                this.y.setOnClickListener(cVar);
                d(this.C);
            } else {
                this.y = null;
            }
            String C2 = eVar.C();
            if (StringUtils.isValidString(C2)) {
                u uVar = new u(nVar);
                uVar.a(new WeakReference(this.I));
                t tVar = new t(uVar, activity);
                this.z = tVar;
                tVar.a(C2);
            } else {
                this.z = null;
            }
            if (this.K) {
                com.applovin.impl.adview.a aVar = new com.applovin.impl.adview.a(activity, ((Integer) nVar.a(com.applovin.impl.sdk.c.b.cJ)).intValue(), 16842874);
                this.w = aVar;
                aVar.setColor(Color.parseColor("#75FFFFFF"));
                this.w.setBackgroundColor(Color.parseColor("#00000000"));
                this.w.setVisibility(8);
                AppLovinCommunicator.getInstance(activity).subscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
            } else {
                this.w = null;
            }
            if (eVar.O()) {
                ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842872);
                this.A = progressBar;
                progressBar.setMax(10000);
                this.A.setPadding(0, 0, 0, 0);
                if (com.applovin.impl.sdk.utils.h.d()) {
                    this.A.setProgressTintList(ColorStateList.valueOf(eVar.P()));
                }
                this.B.a("PROGRESS_BAR", ((Long) nVar.a(com.applovin.impl.sdk.c.b.cG)).longValue(), (j.a) new j.a() {
                    public void a() {
                        if (e.this.F) {
                            e.this.A.setVisibility(8);
                            return;
                        }
                        e.this.A.setProgress((int) ((((float) e.this.v.I()) / ((float) e.this.D)) * 10000.0f));
                    }

                    public boolean b() {
                        return !e.this.F;
                    }
                });
            } else {
                this.A = null;
            }
            this.v = new aw.a(activity).a();
            b bVar = new b();
            this.v.a((an.b) bVar);
            this.v.c(0);
            g gVar = new g(activity);
            this.u = gVar;
            gVar.b();
            this.u.setControllerVisibilityListener(bVar);
            this.u.setPlayer(this.v);
            this.u.setOnTouchListener(new AppLovinTouchToClickListener(nVar, com.applovin.impl.sdk.c.b.aV, activity, bVar));
            B();
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    private void G() {
        t tVar;
        s D2 = this.f14043a.D();
        if (D2 != null && D2.e() && !this.F && (tVar = this.z) != null) {
            final boolean z2 = tVar.getVisibility() == 4;
            final long f2 = D2.f();
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    if (z2) {
                        r.a((View) e.this.z, f2, (Runnable) null);
                    } else {
                        r.b(e.this.z, f2, (Runnable) null);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void H() {
        this.H.a(this.f14050h);
        this.j = SystemClock.elapsedRealtime();
    }

    private static boolean a(boolean z2, n nVar) {
        if (!((Boolean) nVar.a(com.applovin.impl.sdk.c.b.cy)).booleanValue()) {
            return false;
        }
        if (!((Boolean) nVar.a(com.applovin.impl.sdk.c.b.cz)).booleanValue() || z2) {
            return true;
        }
        return ((Boolean) nVar.a(com.applovin.impl.sdk.c.b.cB)).booleanValue();
    }

    public void A() {
        D();
        this.H.a(this.f14049g, this.f14048f);
        a("javascript:al_onPoststitialShow(" + this.l + "," + this.m + ");", (long) this.f14043a.S());
        if (this.f14049g != null) {
            int i = (this.f14043a.t() > 0 ? 1 : (this.f14043a.t() == 0 ? 0 : -1));
            m mVar = this.f14049g;
            if (i >= 0) {
                a(mVar, this.f14043a.t(), new Runnable() {
                    public void run() {
                        e.this.j = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                mVar.setVisibility(0);
            }
        }
        v();
        this.F = true;
    }

    /* access modifiers changed from: protected */
    public void B() {
        a(!this.K);
        com.applovin.exoplayer2.h.u a2 = new u.a(new p(this.f14047e, ai.a((Context) this.f14047e, "com.applovin.sdk"))).a(ab.a(this.f14043a.h()));
        this.v.a(this.C ^ true ? 1.0f : 0.0f);
        this.v.a((com.applovin.exoplayer2.h.p) a2);
        this.v.w();
        this.v.a(false);
    }

    /* access modifiers changed from: protected */
    public void C() {
        if (this.N.compareAndSet(false, true)) {
            a(this.x, this.f14043a.r(), new Runnable() {
                public void run() {
                    long unused = e.this.O = -1;
                    long unused2 = e.this.P = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void D() {
        this.E = F();
        this.v.a(false);
    }

    /* access modifiers changed from: protected */
    public void E() {
        if (this.F) {
            v vVar = this.f14045c;
            if (v.a()) {
                this.f14045c.d("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
            }
        } else if (this.f14044b.ag().isApplicationPaused()) {
            v vVar2 = this.f14045c;
            if (v.a()) {
                this.f14045c.d("AppLovinFullscreenActivity", "Skip video resume - app paused");
            }
        } else {
            long j = this.L;
            if (j >= 0) {
                v vVar3 = this.f14045c;
                if (v.a()) {
                    v vVar4 = this.f14045c;
                    vVar4.b("AppLovinFullscreenActivity", "Resuming video at position " + j + "ms for MediaPlayer: " + this.v);
                }
                this.v.a(true);
                this.B.a();
                this.L = -1;
                if (!this.v.a()) {
                    x();
                    return;
                }
                return;
            }
            v vVar5 = this.f14045c;
            if (v.a()) {
                v vVar6 = this.f14045c;
                vVar6.b("AppLovinFullscreenActivity", "Invalid last video position, isVideoPlaying=" + this.v.a());
            }
        }
    }

    /* access modifiers changed from: protected */
    public int F() {
        aw awVar = this.v;
        if (awVar == null) {
            return 0;
        }
        long I2 = awVar.I();
        if (this.G) {
            return 100;
        }
        return I2 > 0 ? (int) ((((float) I2) / ((float) this.D)) * 100.0f) : this.E;
    }

    public void a() {
        v vVar = this.f14045c;
        if (v.a()) {
            this.f14045c.b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    public void a(long j) {
        a((Runnable) new Runnable() {
            public void run() {
                e.this.E();
            }
        }, j);
    }

    /* access modifiers changed from: protected */
    public void a(PointF pointF) {
        if (this.f14043a.E()) {
            v vVar = this.f14045c;
            if (v.a()) {
                this.f14045c.b("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri k = this.f14043a.k();
            if (k != null) {
                this.f14044b.v().trackAndLaunchVideoClick(this.f14043a, k, pointF, this, this.f14048f != null ? this.f14048f.getContext() : this.f14044b.P());
                k.a(this.p, (AppLovinAd) this.f14043a);
                this.f14046d.b();
                this.m++;
                return;
            }
            return;
        }
        G();
    }

    public void a(ViewGroup viewGroup) {
        this.H.a(this.y, this.x, this.z, this.w, this.A, this.u, this.f14048f, (ImageView) null, viewGroup);
        this.v.a(true);
        if (this.f14043a.am()) {
            this.s.a(this.f14043a, (Runnable) new Runnable() {
                public void run() {
                    e.this.a(250);
                }
            });
        }
        if (this.K) {
            x();
        }
        this.f14048f.renderAd(this.f14043a);
        this.f14046d.b(this.K ? 1 : 0);
        if (this.x != null) {
            this.f14044b.V().a(new z(this.f14044b, new Runnable() {
                public void run() {
                    e.this.C();
                }
            }), o.a.MAIN, this.f14043a.s(), true);
        }
        super.b(this.C);
    }

    public void b() {
        v vVar = this.f14045c;
        if (v.a()) {
            this.f14045c.b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        c();
    }

    public void c() {
        this.O = SystemClock.elapsedRealtime() - this.P;
        v vVar = this.f14045c;
        if (v.a()) {
            this.f14045c.b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.O + "ms");
        }
        this.f14046d.f();
        this.l++;
        if (this.f14043a.y()) {
            h();
        } else {
            A();
        }
    }

    /* access modifiers changed from: protected */
    public void c(long j) {
        this.D = j;
    }

    /* access modifiers changed from: protected */
    public void c(String str) {
        v vVar = this.f14045c;
        if (v.a()) {
            v vVar2 = this.f14045c;
            vVar2.e("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f14043a);
        }
        if (this.M.compareAndSet(false, true)) {
            if (this.q instanceof com.applovin.impl.sdk.ad.g) {
                ((com.applovin.impl.sdk.ad.g) this.q).onAdDisplayFailed(str);
            }
            h();
        }
    }

    public void c(boolean z2) {
        super.c(z2);
        if (z2) {
            a(0);
        } else if (!this.F) {
            e();
        }
    }

    public void d() {
        a((ViewGroup) null);
    }

    /* access modifiers changed from: protected */
    public void d(boolean z2) {
        if (com.applovin.impl.sdk.utils.h.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f14047e.getDrawable(z2 ? R.drawable.applovin_ic_unmute_to_mute : R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.y.setScaleType(ImageView.ScaleType.FIT_XY);
                this.y.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aC = z2 ? this.f14043a.aC() : this.f14043a.aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.y.setImageURI(aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void e() {
        String str;
        v vVar;
        v vVar2 = this.f14045c;
        if (v.a()) {
            this.f14045c.b("AppLovinFullscreenActivity", "Pausing video");
        }
        if (this.v.a()) {
            this.L = this.v.I();
            this.v.a(false);
            this.B.c();
            v vVar3 = this.f14045c;
            if (v.a()) {
                vVar = this.f14045c;
                str = "Paused video at position " + this.L + "ms";
            } else {
                return;
            }
        } else {
            v vVar4 = this.f14045c;
            if (v.a()) {
                vVar = this.f14045c;
                str = "Nothing to pause";
            } else {
                return;
            }
        }
        vVar.b("AppLovinFullscreenActivity", str);
    }

    public String getCommunicatorId() {
        return "FullscreenVideoAdExoPlayerPresenter";
    }

    public void h() {
        this.B.b();
        this.J.removeCallbacksAndMessages((Object) null);
        m();
        super.h();
    }

    public void k() {
        this.v.E();
        if (this.K) {
            AppLovinCommunicator.getInstance(this.f14047e).unsubscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
        }
        super.k();
    }

    /* access modifiers changed from: protected */
    public void m() {
        super.a(F(), this.K, r(), this.O);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j = messageData.getLong("ad_id");
            if (((Boolean) this.f14044b.a(com.applovin.impl.sdk.c.b.eX)).booleanValue() && j == this.f14043a.getAdIdNumber() && this.K) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i < 200 || i >= 300) && !this.G && !this.v.a()) {
                    c("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean r() {
        return this.f14043a != null && F() >= this.f14043a.Q();
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
            com.applovin.impl.sdk.ad.e eVar = this.f14043a;
            if (i >= 0) {
                j = eVar.ad();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) eVar;
                long j3 = this.D;
                if (j3 > 0) {
                    j2 = 0 + j3;
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
        this.H.a((View) this.z);
        this.H.a((View) this.x);
        if (!t() || this.F) {
            H();
        }
    }

    /* access modifiers changed from: protected */
    public void x() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (e.this.w != null) {
                    e.this.w.a();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void y() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (e.this.w != null) {
                    e.this.w.b();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void z() {
        boolean z2 = !this.C;
        this.C = z2;
        this.v.a(z2 ^ true ? 1.0f : 0.0f);
        d(this.C);
        a(this.C, 0);
    }
}
