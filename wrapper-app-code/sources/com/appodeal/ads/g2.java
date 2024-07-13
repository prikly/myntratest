package com.appodeal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.appodeal.ads.Native;
import com.appodeal.ads.VideoPlayerActivity;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.m;
import com.appodeal.ads.utils.n;
import com.appodeal.ads.utils.s;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.iab.utils.Assets;
import com.explorestack.iab.vast.TrackingEvent;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.view.CircleCountdownView;
import java.io.File;
import java.util.List;
import java.util.Timer;

public final class g2 extends RelativeLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener, VideoPlayerActivity.a {
    public static final String x = g2.class.getSimpleName();
    public static g2 y;

    /* renamed from: a  reason: collision with root package name */
    public l2 f16421a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16422b = false;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f16423c;

    /* renamed from: d  reason: collision with root package name */
    public ProgressBar f16424d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f16425e;

    /* renamed from: f  reason: collision with root package name */
    public CircleCountdownView f16426f;

    /* renamed from: g  reason: collision with root package name */
    public MediaPlayer f16427g;

    /* renamed from: h  reason: collision with root package name */
    public TextureView f16428h;
    public Timer i;
    public boolean j;
    public boolean k;
    public boolean l = true;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public volatile boolean r;
    public boolean s;
    public VastRequest t;
    public int u;
    public int v;
    public int w = 1;

    public g2(Context context) {
        super(context);
    }

    public static void a(g2 g2Var, TrackingEvent trackingEvent) {
        l2 l2Var;
        List<String> list;
        VastRequest vastRequest = g2Var.t;
        if (!(vastRequest == null || vastRequest.getVastAd() == null || (list = g2Var.t.getVastAd().getTrackingEventListMap().get(trackingEvent)) == null)) {
            for (String a2 : list) {
                n5.a(a2, s.f17568e);
            }
        }
        if (trackingEvent == TrackingEvent.complete && (l2Var = g2Var.f16421a) != null) {
            l2Var.g();
        }
    }

    public static boolean b(g2 g2Var) {
        g2Var.getClass();
        return g2Var.getGlobalVisibleRect(new Rect()) && g2Var.isShown() && g2Var.hasWindowFocus();
    }

    public static /* synthetic */ void e(g2 g2Var) {
        g2Var.v++;
    }

    public final boolean c() {
        return !this.r && this.f16427g != null;
    }

    public final void d() {
        if (c() && this.f16427g.isPlaying()) {
            this.f16427g.pause();
        }
        if (this.w != 3) {
            this.w = 4;
            h();
        }
    }

    public final void e() {
        try {
            if (!this.m && this.f16421a.q != null && !this.n && !this.r) {
                this.f16427g.setDataSource(getContext(), this.f16421a.q);
                this.f16427g.prepareAsync();
                this.n = true;
            }
        } catch (Exception e2) {
            Log.log(e2);
        }
    }

    public final void f() {
        List<String> impressionUrlList;
        if (this.f16427g == null) {
            b();
        }
        if (!this.m) {
            e();
        }
        if (c() && !this.f16427g.isPlaying() && this.m && this.o) {
            if (getGlobalVisibleRect(new Rect()) && isShown() && hasWindowFocus()) {
                this.w = 2;
                h();
                this.f16427g.start();
                if (!this.j) {
                    VastRequest vastRequest = this.t;
                    if (!(vastRequest == null || vastRequest.getVastAd() == null || (impressionUrlList = this.t.getVastAd().getImpressionUrlList()) == null)) {
                        for (String a2 : impressionUrlList) {
                            n5.a(a2, s.f17568e);
                        }
                    }
                    this.j = true;
                    Log.log(x, "Video", "started");
                }
                if (this.i == null && this.q) {
                    Timer timer = new Timer();
                    this.i = timer;
                    timer.schedule(new f2(this), 0, (long) 500);
                }
            }
        }
    }

    public final void g() {
        CircleCountdownView circleCountdownView = this.f16426f;
        if (circleCountdownView != null) {
            circleCountdownView.setImage(Assets.getBitmapFromBase64(this.l ? "iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAwFBMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALOy8QAAAAQHRSTlMAT5vPRxSr/1OTn4c4s9cYEMu/XwTDu3fbYwjvt+NA8wwg3/fHKOdLj/tbPDBv03+jl4sca2d7NCTrLINDr6dz72VdRQAAA8FJREFUeAHt2dWW6zgURdEd3GFmZqZi7O7//6rmW7ZiK2VHkYo8X0MreI5GENAiEAgEAoFAIBAIhSORcBSfRSzOf8VjOFMimUpncDFZ/i+XxzkKRZJkKYrLKJNKRZUq/xdJVKAONaoV1WlpNFtQ1qZaUYd23R5U9alUVOlTlBxATZVKRUMeG/WgpE61ojEF6i9SJaJWNKHTKAMF05lSUYgu+vMPLFrQxXJlpGhdLm/gsG3TxVZ/UbRLkrsejhX2bkkL3UVb/meZgLekQ0VrUb7P/43z8JZ0Ba1F67eia7i5qfFY01DRBO5uxxQte2aK2pCYFimaDc0UQaaSpCgyMFIEuT1FcZgowglbiu5MFOGU1ZJ27ZiBIpyUEIvC0F+E0+5pt3zQX4R3xGk3gfYivGOwo11TU5EPj23aPBVMFk0e4CJBuz0MFpHh2DvnT3YrBotIjjZweF7SZg5zRSQ5LsMhSZsslKV4XDSAK9kGXXiizRCKFnSouhdRVnRHmzQ8qzRrI0p4KZIO0VabllkFHuWLFPgukk+IJG1C8KhEqhXxl9EAoudzFv47UrGIbw6njv0ReFOjalGfb9YQlWlTgCdtqhatraISRK2x/w8Recmi0IkPaNp/kHpRCaIX/1sRL1s0hCBKy7LlP0i9aA9BgTYZfUHyohxEEVrKGoPkRTH5j/WtziBp0Vx+jt1rDZIVvcgHwZXeIElRHIIVLQe9QZKiEgQ9Wkp6gyRFOwg2vscrL1w0kv8TMtIYJC/KQXBDS1djkLxoqucVUijSH6RUtKZlpx6kXhTS8rVXKLqlJaUepF6UpOVaPUi9qErLncagmdeiPi2vGoOmHos2tIlpDILHojtautAZ5LEoS8tveoM8FbX6tNThSYPngLeikP9DB154DngpEq/RhjeFEc8A/0UHeDSN0D/4L1rBq0q92qdP8F00HkDNgqfAd9HvgM4i+C6KQmsR/BZ1Aa1F8Fv0B/QWwWdRrgC9RfBZNAD0FsFvETQX4bMV4bMV4bMV4bMV4bMV4bMV4bMV4ZMVtSHxyo8pKsLd/IkfU5SEm1iKFqNFy0c4VZpP5AcVNeEU2pE0XXQ3JsluAsdazRwtBosGq/19tIVjqyeSxovk7kl+pqIH8nMVxen01JxRlIQxT3So3jinyBqm8NjyvgI4ihYwpU9RceM6aaswpUO79l0FEIqMB73SMl4UZNvIAsak33KSefl+tIY5t22SnL2IOWJREia1Qvf3vRZcPE74r9QAn0TlNvvUiEcRCAQCgUAgEAgEdPgLbm7XQrhD8bcAAAAASUVORK5CYII=" : "iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAw1BMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAcKsgAAAAQXRSTlMABFeXn38wGNP/u0AMw8tP11+/3/eTOPNH+0tnc3fvb+tDi49TEKMcY8drKCCvFJt7qyQ047eHCCw8g89bp9vns9m2qsEAAAOSSURBVHgB7drVYuNKEEXR03YMJ0aBQXHAYWbm/P9PXZyZBimOHiTVQK9H4zZDFTzP8zzP8zzP83JQtfpSo4mfRqvNfy138HPo9vhNf4CfQYPaMFAQF9IUdSAtpm3UhSza5O+kmBb5O6nPtGgMOQNmmEwhp84MSQ0VUCuz1bGCQ62tM8MGSlebk+RwE67WVlbSNkq2xf8lO0jZbWQk7SmUaZvfxS3kS6pX00NuIct+SNdBNT08RLajmLakU0kP1/GJ40Pa5idV9JD4jBrR1u5W0UN8rkHbaRU9xAIbtM0q6CEWqSU0rZ+V30MstGMXnZffQyx2Qcu49B7iC5c09UvvIb7QbdN0UHYP8ZWrdRrmuyX3EIbDa2TYoalRcg9hIM/PkLZMw40qt8cJYtREynFCw6DcHjeIcfDF+W/L7UkFkRtw7c5pOCm1xw3KLprRcIfc1MFyxMXyBHEGx/06tfk9cmr1SRYRlFzDMaJhBzmFLCiIURe2BxrqyGfGwoK4B8chtTbyWS4wiI+wBTTsIpf1IoNC2O5jagPkwiKDOFjwBN2SCAphe6J2KBHEE1im1JJ7iaAGLLs0jCWChrA9UwskgngGy4jakUjQCiwNag2RoCdYZtTqIkGXsLxQ2xMJCmHpUAtFgtqwNKk9iwRFsJxQi0SCbmDZt46SCBrC8uA+mv5JfQpLjdqrSNAWLAfUzkWCBj/bR8c+LNvUNiSCItgOpb9+bMHSTah1JIIeYOnQsCsQ1IftgtozBIIC2G6pbQsEPStY1IRaDbm8FRm0AtsODS3k8lRg0C0WPGJvyGc3KizovQXbCQ1LyOn4uaigKRx3NATIS631JkUEPcGh3qlNulX/6bkNV42GUdV/C6d77iMaHqr94zy5+GJodljtaGG+iZT9mIaXSocvp/tIe6Vhfl/heGq4iQwdmraqHOApZGjd0DDZlx5xqpCmNfEh8IimNyU9Jg9omUovEjzGNJ1Kr1o8TmiKT4SXUXYSWi6E13UCp6enRBeasErbTUt05evskrZJE6igqI9sK3M6akAVRSNk6S7R1QCqKEqukKaCiK5ToJKig6ycN6aEXZRrFpPkzQ5c90dvTLtUKFv3pXExvYfrJWKGbQUh28yy9nOtwCcHENNj2voAciZM+diHILrWA4gSv3tc7/J3j61u5jTOIG5/zm/eN+7xM7i+4b/eAoWfRHf1I1wawPM8z/M8z/M872/KUtAsVj+VvQAAAABJRU5ErkJggg=="));
        }
    }

    public final void h() {
        int a2 = m.a(this.w);
        if (a2 == 0) {
            ImageView imageView = this.f16423c;
            if (imageView != null) {
                imageView.setVisibility(0);
                this.f16423c.bringToFront();
            }
            if (this.q) {
                this.f16428h.setVisibility(4);
                this.f16424d.setVisibility(4);
            } else {
                return;
            }
        } else if (a2 == 1) {
            ImageView imageView2 = this.f16423c;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            if (this.q) {
                this.f16428h.setVisibility(0);
                this.f16428h.bringToFront();
                this.f16426f.setVisibility(0);
                this.f16426f.bringToFront();
                g();
                this.f16424d.setVisibility(4);
                this.f16425e.setVisibility(4);
                return;
            }
            return;
        } else if (a2 == 2) {
            ImageView imageView3 = this.f16423c;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
                this.f16423c.bringToFront();
            }
            if (this.q) {
                this.f16424d.setVisibility(0);
                this.f16424d.bringToFront();
                this.f16428h.setVisibility(4);
            } else {
                return;
            }
        } else if (a2 == 3) {
            ImageView imageView4 = this.f16423c;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
                this.f16423c.bringToFront();
            }
            if (this.q) {
                this.f16425e.setVisibility(0);
                this.f16425e.bringToFront();
                this.f16428h.setVisibility(4);
                this.f16424d.setVisibility(4);
                this.f16426f.setVisibility(4);
            }
            return;
        } else {
            return;
        }
        this.f16425e.setVisibility(4);
        this.f16426f.setVisibility(4);
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        l2 l2Var;
        List<String> list;
        if (!this.k) {
            TrackingEvent trackingEvent = TrackingEvent.complete;
            VastRequest vastRequest = this.t;
            if (!(vastRequest == null || vastRequest.getVastAd() == null || (list = this.t.getVastAd().getTrackingEventListMap().get(trackingEvent)) == null)) {
                for (String a2 : list) {
                    n5.a(a2, s.f17568e);
                }
            }
            if (trackingEvent == TrackingEvent.complete && (l2Var = this.f16421a) != null) {
                l2Var.g();
            }
            this.k = true;
            Log.log(x, "Video", "finished");
        }
        Timer timer = this.i;
        if (timer != null) {
            timer.cancel();
            this.i = null;
        }
        d();
        if (c()) {
            this.f16427g.seekTo(0);
        }
        this.s = true;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        Log.log(x, LogConstants.EVENT_MV_PLAYER_ERROR, String.format("what: %s, extra: %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
        a();
        return true;
    }

    public final void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(size, measuredWidth) : measuredWidth;
        }
        int i4 = (int) (((float) size) * 0.5625f);
        if (mode2 != 1073741824 || size2 >= i4) {
            size2 = i4;
        } else {
            size = (int) (((float) size2) * 1.7777778f);
        }
        if (Math.abs(size2 - measuredHeight) >= 2 || Math.abs(size - measuredWidth) >= 2) {
            getLayoutParams().width = size;
            getLayoutParams().height = size2;
        }
        super.onMeasure(i2, i3);
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        Log.log(x, LogConstants.EVENT_MV_PLAYER, "prepared");
        this.m = true;
        if (Native.f16126b == Native.NativeAdType.NoVideo) {
            return;
        }
        if (this.p) {
            f();
            return;
        }
        this.w = 4;
        h();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        try {
            if (Native.f16126b != Native.NativeAdType.NoVideo) {
                if (this.f16427g == null) {
                    b();
                }
                this.f16427g.setSurface(new Surface(surfaceTexture));
                e();
            }
        } catch (Exception e2) {
            Log.log(e2);
            this.w = 1;
            h();
            this.q = false;
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            Log.log(x, "Video", "onVideoSizeChanged - skip: width or height is 0");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f16428h.getLayoutParams();
        int width = getWidth();
        int height = getHeight();
        if (i2 > i3) {
            layoutParams.width = width;
            layoutParams.height = (width * i3) / i2;
        } else {
            layoutParams.width = (i2 * height) / i3;
            layoutParams.height = height;
        }
        this.f16428h.setLayoutParams(layoutParams);
    }

    public final void onWindowVisibilityChanged(int i2) {
        if (Native.f16126b != Native.NativeAdType.NoVideo) {
            if (i2 != 0) {
                d();
            } else if (this.p) {
                f();
            }
        }
        super.onWindowVisibilityChanged(i2);
    }

    public void setNativeAd(l2 l2Var) {
        Runnable runnable;
        l2 l2Var2;
        this.f16421a = l2Var;
        if (Native.f16126b != Native.NativeAdType.NoVideo && ((l2Var.e() != null && !l2Var.e().isEmpty()) || (l2Var.d() != null && !l2Var.d().isEmpty()))) {
            this.q = true;
            if (l2Var.c() != null) {
                this.t = l2Var.c();
            }
        }
        if (!this.f16422b) {
            this.f16422b = true;
            this.f16423c = new ImageView(getContext());
            this.f16423c.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f16423c.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f16423c.setAdjustViewBounds(true);
            addView(this.f16423c);
            if (this.q) {
                int round = Math.round(f1.l(getContext()) * 50.0f);
                this.f16424d = new ProgressBar(getContext(), (AttributeSet) null, 16842874);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(round, round);
                layoutParams.addRule(13, -1);
                this.f16424d.setLayoutParams(layoutParams);
                this.f16424d.setBackgroundColor(Color.parseColor("#6b000000"));
                addView(this.f16424d);
                ImageView imageView = new ImageView(getContext());
                this.f16425e = imageView;
                imageView.setImageResource(17301540);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(round, round);
                layoutParams2.addRule(13, -1);
                this.f16425e.setLayoutParams(layoutParams2);
                this.f16425e.setBackgroundColor(Color.parseColor("#6b000000"));
                this.f16425e.setOnClickListener(new a2(this));
                addView(this.f16425e);
                TextureView textureView = new TextureView(getContext());
                this.f16428h = textureView;
                textureView.setSurfaceTextureListener(this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(13);
                this.f16428h.setLayoutParams(layoutParams3);
                this.f16428h.setOnClickListener(new b2(this));
                addView(this.f16428h);
                CircleCountdownView circleCountdownView = new CircleCountdownView(getContext());
                this.f16426f = circleCountdownView;
                circleCountdownView.setColors(Assets.mainAssetsColor, Assets.backgroundColor);
                int a2 = f1.a(getContext(), 8.0f);
                this.f16426f.setPadding(a2, a2, a2, a2);
                int a3 = f1.a(getContext(), 40.0f);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(a3, a3);
                layoutParams4.addRule(9);
                layoutParams4.addRule(10);
                this.f16426f.setLayoutParams(layoutParams4);
                g();
                this.f16426f.setOnClickListener(new e2(this));
                addView(this.f16426f);
                b();
                if (Native.f16126b != Native.NativeAdType.Video || (l2Var2 = this.f16421a) == null || l2Var2.b() == null || !new File(this.f16421a.b().getPath()).exists()) {
                    this.w = 3;
                    h();
                    if (this.f16421a.e() != null && !this.f16421a.e().isEmpty()) {
                        runnable = new m(getContext(), new c2(this), this.f16421a.e());
                    } else if (this.f16421a.d() != null && !this.f16421a.d().isEmpty()) {
                        runnable = new n(getContext(), new d2(this), this.f16421a.d());
                    }
                    s.f17568e.f17569a.execute(runnable);
                } else {
                    this.p = Native.f16129e;
                }
            } else {
                this.w = 1;
                h();
                this.f16423c.bringToFront();
            }
        }
        l2 l2Var3 = this.f16421a;
        if (l2Var3 != null) {
            l2.a(this.f16423c, l2Var3.l, l2Var3.m);
        }
    }

    public final void b() {
        float f2;
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.f16427g = mediaPlayer2;
        mediaPlayer2.setOnCompletionListener(this);
        this.f16427g.setOnErrorListener(this);
        this.f16427g.setOnPreparedListener(this);
        this.f16427g.setOnVideoSizeChangedListener(this);
        this.f16427g.setAudioStreamType(3);
        if (c()) {
            if (this.l) {
                mediaPlayer = this.f16427g;
                f2 = 0.0f;
            } else {
                mediaPlayer = this.f16427g;
                f2 = 1.0f;
            }
            mediaPlayer.setVolume(f2, f2);
        }
    }

    public final void a() {
        this.p = false;
        if (this.f16427g != null) {
            try {
                if (!this.r) {
                    if (this.f16427g.isPlaying()) {
                        this.f16427g.stop();
                    }
                    this.f16427g.reset();
                }
                this.f16427g.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
                this.f16427g.setOnErrorListener((MediaPlayer.OnErrorListener) null);
                this.f16427g.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
                this.f16427g.setOnVideoSizeChangedListener((MediaPlayer.OnVideoSizeChangedListener) null);
                this.f16427g.release();
            } catch (Exception e2) {
                Log.log(e2);
            }
            this.f16427g = null;
        }
        this.w = 1;
        h();
        Timer timer = this.i;
        if (timer != null) {
            timer.cancel();
            this.i = null;
        }
        this.r = true;
        this.q = false;
        VastRequest vastRequest = this.t;
        if (vastRequest != null) {
            vastRequest.sendError(TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE);
        }
    }

    public final void a(int i2, boolean z) {
        l2 l2Var;
        List<String> list;
        Log.log(x, LogConstants.EVENT_MV_STATE, String.format("videoPlayerActivityClosed, position: %s, finished: %s", new Object[]{Integer.valueOf(i2), Boolean.valueOf(z)}));
        if (z) {
            try {
                if (!this.k) {
                    TrackingEvent trackingEvent = TrackingEvent.complete;
                    VastRequest vastRequest = this.t;
                    if (!(vastRequest == null || vastRequest.getVastAd() == null || (list = this.t.getVastAd().getTrackingEventListMap().get(trackingEvent)) == null)) {
                        for (String a2 : list) {
                            n5.a(a2, s.f17568e);
                        }
                    }
                    if (trackingEvent == TrackingEvent.complete && (l2Var = this.f16421a) != null) {
                        l2Var.g();
                    }
                    this.k = true;
                    Log.log(x, "Video", "finished");
                }
                Timer timer = this.i;
                if (timer != null) {
                    timer.cancel();
                    this.i = null;
                }
                d();
                if (c()) {
                    this.f16427g.seekTo(0);
                }
                this.s = true;
            } catch (Exception e2) {
                Log.log(e2);
            }
        } else if (c()) {
            this.f16427g.seekTo(i2);
        }
        y = null;
    }
}
