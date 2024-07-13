package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.adview.j;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.s;
import com.applovin.impl.adview.t;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.ad.g;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
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

public class f extends a implements AppLovinCommunicatorSubscriber {
    protected ImageView A = null;
    protected final j B;
    protected boolean C;
    protected long D;
    protected boolean E;
    private final com.applovin.impl.adview.activity.a.c F = new com.applovin.impl.adview.activity.a.c(this.f14043a, this.f14047e, this.f14044b);
    /* access modifiers changed from: private */
    public MediaPlayer G;
    /* access modifiers changed from: private */
    public final b H = new b();
    private final a I = new a();
    private final Handler J;
    private final boolean K;
    private int L;
    private int M;
    /* access modifiers changed from: private */
    public boolean N;
    private final AtomicBoolean O;
    private final AtomicBoolean P;
    /* access modifiers changed from: private */
    public long Q;
    /* access modifiers changed from: private */
    public long R;
    protected final AppLovinVideoView u;
    protected final com.applovin.impl.adview.a v;
    protected final m w;
    protected final ImageView x;
    protected final t y;
    protected final ProgressBar z;

    private class a implements u.a {
        private a() {
        }

        public void a(t tVar) {
            v vVar = f.this.f14045c;
            if (v.a()) {
                f.this.f14045c.b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            f.this.a(tVar.getAndClearLastClickLocation());
        }

        public void b(t tVar) {
            v vVar = f.this.f14045c;
            if (v.a()) {
                f.this.f14045c.b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            f.this.h();
        }

        public void c(t tVar) {
            v vVar = f.this.f14045c;
            if (v.a()) {
                f.this.f14045c.b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            f.this.c();
        }
    }

    private class b implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, AppLovinTouchToClickListener.OnClickListener {
        private b() {
        }

        public void onClick(View view, PointF pointF) {
            f.this.a(pointF);
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            v vVar = f.this.f14045c;
            if (v.a()) {
                f.this.f14045c.b("AppLovinFullscreenActivity", "Video completed");
            }
            boolean unused = f.this.N = true;
            if (!f.this.k) {
                f.this.A();
            } else if (f.this.t()) {
                f.this.F();
            }
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            f fVar = f.this;
            fVar.c("Video view error (" + i + "," + i2 + ")");
            f.this.u.start();
            return true;
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            v vVar = f.this.f14045c;
            if (v.a()) {
                v vVar2 = f.this.f14045c;
                vVar2.b("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i + ", " + i2 + ")");
            }
            if (i == 701) {
                f.this.x();
                f.this.f14046d.g();
                return false;
            } else if (i == 3) {
                f.this.B.a();
                if (f.this.w != null) {
                    f.this.C();
                }
                f.this.y();
                if (!f.this.s.c()) {
                    return false;
                }
                f.this.e();
                return false;
            } else if (i != 702) {
                return false;
            } else {
                f.this.y();
                return false;
            }
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            MediaPlayer unused = f.this.G = mediaPlayer;
            mediaPlayer.setOnInfoListener(f.this.H);
            mediaPlayer.setOnErrorListener(f.this.H);
            float f2 = f.this.C ^ true ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f2, f2);
            f.this.c((long) mediaPlayer.getDuration());
            f.this.u();
            v vVar = f.this.f14045c;
            if (v.a()) {
                v vVar2 = f.this.f14045c;
                vVar2.b("AppLovinFullscreenActivity", "MediaPlayer prepared: " + f.this.G);
            }
        }
    }

    private class c implements View.OnClickListener {
        private c() {
        }

        public void onClick(View view) {
            if (view == f.this.w) {
                if (f.this.s()) {
                    f.this.e();
                    f.this.p();
                    f.this.s.b();
                    return;
                }
                f.this.c();
            } else if (view == f.this.x) {
                f.this.z();
            } else {
                v vVar = f.this.f14045c;
                if (v.a()) {
                    v vVar2 = f.this.f14045c;
                    vVar2.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                }
            }
        }
    }

    public f(e eVar, Activity activity, n nVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, nVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        Handler handler = new Handler(Looper.getMainLooper());
        this.J = handler;
        this.B = new j(handler, this.f14044b);
        this.K = this.f14043a.f();
        this.C = Utils.isVideoMutedInitially(this.f14044b);
        this.M = -1;
        this.O = new AtomicBoolean();
        this.P = new AtomicBoolean();
        this.Q = -2;
        this.R = 0;
        if (eVar.hasVideoUrl()) {
            AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
            this.u = appLovinVideoView;
            appLovinVideoView.setOnPreparedListener(this.H);
            this.u.setOnCompletionListener(this.H);
            this.u.setOnErrorListener(this.H);
            this.u.setOnTouchListener(new AppLovinTouchToClickListener(nVar, com.applovin.impl.sdk.c.b.aV, activity, this.H));
            c cVar = new c();
            if (eVar.r() >= 0) {
                m mVar = new m(eVar.x(), activity);
                this.w = mVar;
                mVar.setVisibility(8);
                this.w.setOnClickListener(cVar);
            } else {
                this.w = null;
            }
            if (a(this.C, nVar)) {
                ImageView imageView = new ImageView(activity);
                this.x = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.x.setClickable(true);
                this.x.setOnClickListener(cVar);
                e(this.C);
            } else {
                this.x = null;
            }
            String C2 = eVar.C();
            if (StringUtils.isValidString(C2)) {
                u uVar = new u(nVar);
                uVar.a(new WeakReference(this.I));
                t tVar = new t(uVar, activity);
                this.y = tVar;
                tVar.a(C2);
            } else {
                this.y = null;
            }
            if (this.K) {
                com.applovin.impl.adview.a aVar = new com.applovin.impl.adview.a(activity, ((Integer) nVar.a(com.applovin.impl.sdk.c.b.cJ)).intValue(), 16842874);
                this.v = aVar;
                aVar.setColor(Color.parseColor("#75FFFFFF"));
                this.v.setBackgroundColor(Color.parseColor("#00000000"));
                this.v.setVisibility(8);
                AppLovinCommunicator.getInstance(activity).subscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
            } else {
                this.v = null;
            }
            if (eVar.O()) {
                ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842872);
                this.z = progressBar;
                progressBar.setMax(10000);
                this.z.setPadding(0, 0, 0, 0);
                if (h.d()) {
                    this.z.setProgressTintList(ColorStateList.valueOf(eVar.P()));
                }
                this.B.a("PROGRESS_BAR", ((Long) nVar.a(com.applovin.impl.sdk.c.b.cG)).longValue(), (j.a) new j.a() {
                    public void a() {
                        if (f.this.E) {
                            f.this.z.setVisibility(8);
                            return;
                        }
                        f.this.z.setProgress((int) ((((float) f.this.u.getCurrentPosition()) / ((float) f.this.D)) * 10000.0f));
                    }

                    public boolean b() {
                        return !f.this.E;
                    }
                });
                return;
            }
            this.z = null;
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    /* access modifiers changed from: private */
    public void C() {
        if (this.P.compareAndSet(false, true)) {
            a(this.w, this.f14043a.r(), new Runnable() {
                public void run() {
                    long unused = f.this.Q = -1;
                    long unused2 = f.this.R = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    private void D() {
        t tVar;
        s D2 = this.f14043a.D();
        if (D2 != null && D2.e() && !this.E && (tVar = this.y) != null) {
            final boolean z2 = tVar.getVisibility() == 4;
            final long f2 = D2.f();
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    if (z2) {
                        r.a((View) f.this.y, f2, (Runnable) null);
                    } else {
                        r.b(f.this.y, f2, (Runnable) null);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void E() {
        if (this.E) {
            v vVar = this.f14045c;
            if (v.a()) {
                this.f14045c.d("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
            }
        } else if (this.f14044b.ag().isApplicationPaused()) {
            v vVar2 = this.f14045c;
            if (v.a()) {
                this.f14045c.d("AppLovinFullscreenActivity", "Skip video resume - app paused");
            }
        } else if (this.M >= 0) {
            v vVar3 = this.f14045c;
            if (v.a()) {
                v vVar4 = this.f14045c;
                vVar4.b("AppLovinFullscreenActivity", "Resuming video at position " + this.M + "ms for MediaPlayer: " + this.G);
            }
            this.u.seekTo(this.M);
            this.u.start();
            this.B.a();
            this.M = -1;
            a((Runnable) new Runnable() {
                public void run() {
                    if (f.this.v != null) {
                        f.this.v.a();
                        f.this.a((Runnable) new Runnable() {
                            public void run() {
                                f.this.v.b();
                            }
                        }, 2000);
                    }
                }
            }, 250);
        } else {
            v vVar5 = this.f14045c;
            if (v.a()) {
                this.f14045c.b("AppLovinFullscreenActivity", "Invalid last video position");
            }
        }
    }

    /* access modifiers changed from: private */
    public void F() {
        this.F.a(this.f14050h);
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

    private void d(boolean z2) {
        this.L = B();
        if (z2) {
            this.u.pause();
        } else {
            this.u.stopPlayback();
        }
    }

    private void e(boolean z2) {
        if (h.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f14047e.getDrawable(z2 ? R.drawable.applovin_ic_unmute_to_mute : R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.x.setScaleType(ImageView.ScaleType.FIT_XY);
                this.x.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aC = z2 ? this.f14043a.aC() : this.f14043a.aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.x.setImageURI(aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void A() {
        v vVar = this.f14045c;
        if (v.a()) {
            this.f14045c.b("AppLovinFullscreenActivity", "Showing postitial...");
        }
        d(this.f14043a.aJ());
        this.F.a(this.f14049g, this.f14048f);
        a("javascript:al_onPoststitialShow(" + this.l + "," + this.m + ");", (long) this.f14043a.S());
        if (this.f14049g != null) {
            int i = (this.f14043a.t() > 0 ? 1 : (this.f14043a.t() == 0 ? 0 : -1));
            m mVar = this.f14049g;
            if (i >= 0) {
                a(mVar, this.f14043a.t(), new Runnable() {
                    public void run() {
                        f.this.j = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                mVar.setVisibility(0);
            }
        }
        v();
        this.E = true;
    }

    /* access modifiers changed from: protected */
    public int B() {
        long currentPosition = (long) this.u.getCurrentPosition();
        if (this.N) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.D)) * 100.0f) : this.L;
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
                f.this.E();
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
        D();
    }

    public void a(ViewGroup viewGroup) {
        String str;
        this.F.a(this.x, this.w, this.y, this.v, this.z, this.u, this.f14048f, this.A, viewGroup);
        if (h.g() && (str = this.f14044b.q().getExtraParameters().get(AppLovinSdkExtraParameterKey.AUDIO_FOCUS_REQUEST)) != null) {
            this.u.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        a(!this.K);
        this.u.setVideoURI(this.f14043a.h());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (this.f14043a.am()) {
            this.s.a(this.f14043a, (Runnable) new Runnable() {
                public void run() {
                    f.this.a(250);
                }
            });
        }
        this.u.start();
        if (this.K) {
            x();
        }
        this.f14048f.renderAd(this.f14043a);
        this.f14046d.b(this.K ? 1 : 0);
        if (this.w != null) {
            this.f14044b.V().a(new z(this.f14044b, new Runnable() {
                public void run() {
                    f.this.C();
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
        this.Q = SystemClock.elapsedRealtime() - this.R;
        v vVar = this.f14045c;
        if (v.a()) {
            this.f14045c.b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.Q + "ms");
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
        if (this.O.compareAndSet(false, true)) {
            if (this.q instanceof g) {
                ((g) this.q).onAdDisplayFailed(str);
            }
            h();
        }
    }

    public void c(boolean z2) {
        super.c(z2);
        if (z2) {
            a(0);
        } else if (!this.E) {
            e();
        }
    }

    public void d() {
        a((ViewGroup) null);
    }

    public void e() {
        v vVar = this.f14045c;
        if (v.a()) {
            this.f14045c.b("AppLovinFullscreenActivity", "Pausing video");
        }
        this.M = this.u.getCurrentPosition();
        this.u.pause();
        this.B.c();
        v vVar2 = this.f14045c;
        if (v.a()) {
            v vVar3 = this.f14045c;
            vVar3.b("AppLovinFullscreenActivity", "Paused video at position " + this.M + "ms");
        }
    }

    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    public void h() {
        this.B.b();
        this.J.removeCallbacksAndMessages((Object) null);
        m();
        super.h();
    }

    public void k() {
        v vVar = this.f14045c;
        if (v.a()) {
            this.f14045c.c("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (this.K) {
                AppLovinCommunicator.getInstance(this.f14047e).unsubscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
            }
            if (this.u != null) {
                this.u.pause();
                this.u.stopPlayback();
            }
            if (this.G != null) {
                this.G.release();
            }
        } catch (Throwable th) {
            Log.e("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.k();
    }

    /* access modifiers changed from: protected */
    public void m() {
        super.a(B(), this.K, r(), this.Q);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j = messageData.getLong("ad_id");
            if (((Boolean) this.f14044b.a(com.applovin.impl.sdk.c.b.eX)).booleanValue() && j == this.f14043a.getAdIdNumber() && this.K) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i < 200 || i >= 300) && !this.N && !this.u.isPlaying()) {
                    c("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean r() {
        return B() >= this.f14043a.Q();
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
        this.F.a((View) this.y);
        this.F.a((View) this.w);
        if (!t() || this.E) {
            F();
        }
    }

    /* access modifiers changed from: protected */
    public void x() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (f.this.v != null) {
                    f.this.v.a();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void y() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (f.this.v != null) {
                    f.this.v.b();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void z() {
        if (this.G != null) {
            try {
                boolean z2 = false;
                float f2 = (float) (!this.C ? 0 : 1);
                this.G.setVolume(f2, f2);
                if (!this.C) {
                    z2 = true;
                }
                this.C = z2;
                e(z2);
                a(this.C, 0);
            } catch (Throwable unused) {
            }
        }
    }
}
