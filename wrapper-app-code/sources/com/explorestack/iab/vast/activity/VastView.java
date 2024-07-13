package com.explorestack.iab.vast.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.iab.CacheControl;
import com.explorestack.iab.measurer.VastAdMeasurer;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidInterstitialListener;
import com.explorestack.iab.utils.Assets;
import com.explorestack.iab.utils.IabClickCallback;
import com.explorestack.iab.utils.IabElementStyle;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.vast.TrackingEvent;
import com.explorestack.iab.vast.VastLog;
import com.explorestack.iab.vast.VastPlaybackListener;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.VastRequestListener;
import com.explorestack.iab.vast.VideoType;
import com.explorestack.iab.vast.b;
import com.explorestack.iab.vast.processor.VastAd;
import com.explorestack.iab.vast.tags.AppodealExtensionTag;
import com.explorestack.iab.vast.tags.CompanionTag;
import com.explorestack.iab.vast.tags.PostBannerTag;
import com.explorestack.iab.view.a;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class VastView extends RelativeLayout implements IabClickCallback {
    public int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final List<View> N;
    public final List<com.explorestack.iab.utils.g<? extends View>> O;
    public final Runnable P;
    public final Runnable Q;
    public final b0 R;
    public final b0 S;
    public final LinkedList<Integer> T;
    public int U;
    public float V;
    public final b0 W;

    /* renamed from: a  reason: collision with root package name */
    public final String f3181a;
    public final TextureView.SurfaceTextureListener a0;

    /* renamed from: b  reason: collision with root package name */
    public com.explorestack.iab.vast.view.a f3182b;
    public final MediaPlayer.OnCompletionListener b0;

    /* renamed from: c  reason: collision with root package name */
    public FrameLayout f3183c;
    public final MediaPlayer.OnErrorListener c0;

    /* renamed from: d  reason: collision with root package name */
    public Surface f3184d;
    public final MediaPlayer.OnPreparedListener d0;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f3185e;
    public final MediaPlayer.OnVideoSizeChangedListener e0;

    /* renamed from: f  reason: collision with root package name */
    public com.explorestack.iab.view.a f3186f;
    public b.C0036b f0;

    /* renamed from: g  reason: collision with root package name */
    public com.explorestack.iab.utils.d f3187g;
    public final View.OnTouchListener g0;

    /* renamed from: h  reason: collision with root package name */
    public com.explorestack.iab.utils.e f3188h;
    public final WebChromeClient h0;
    public com.explorestack.iab.utils.k i;
    public final WebViewClient i0;
    public com.explorestack.iab.utils.i j;
    public com.explorestack.iab.utils.h k;
    public com.explorestack.iab.utils.j l;
    public com.explorestack.iab.utils.f m;
    public MediaPlayer n;
    public View o;
    public CompanionTag p;
    public CompanionTag q;
    public ImageView r;
    public MraidInterstitial s;
    public VastRequest t;
    public c0 u;
    public VastViewListener v;
    public VastPlaybackListener w;
    public VastAdMeasurer x;
    public z y;
    public int z;

    public interface VastViewListener {
        void onClick(VastView vastView, VastRequest vastRequest, IabClickCallback iabClickCallback, String str);

        void onComplete(VastView vastView, VastRequest vastRequest);

        void onError(VastView vastView, VastRequest vastRequest, int i);

        void onFinish(VastView vastView, VastRequest vastRequest, boolean z);

        void onOrientationRequested(VastView vastView, VastRequest vastRequest, int i);

        void onShown(VastView vastView, VastRequest vastRequest);
    }

    public class a extends z {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ WeakReference f3189f;

        /* renamed from: com.explorestack.iab.vast.activity.VastView$a$a  reason: collision with other inner class name */
        public class C0035a implements View.OnClickListener {
            public C0035a() {
            }

            public void onClick(View view) {
                boolean unused = VastView.this.j();
                VastView.this.e();
            }
        }

        public class b extends AnimatorListenerAdapter {
            public b() {
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                VastView.this.f3183c.setVisibility(8);
            }
        }

        public class c implements View.OnClickListener {
            public c() {
            }

            public void onClick(View view) {
                boolean unused = VastView.this.j();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, Uri uri, String str, WeakReference weakReference) {
            super(context, uri, str);
            this.f3189f = weakReference;
        }

        public void a(Bitmap bitmap) {
            View.OnClickListener onClickListener;
            ImageView imageView = (ImageView) this.f3189f.get();
            if (imageView != null) {
                if (bitmap == null) {
                    onClickListener = new C0035a();
                } else {
                    imageView.setImageBitmap(bitmap);
                    imageView.setAlpha(0.0f);
                    imageView.animate().alpha(1.0f).setDuration(100).setListener(new b()).start();
                    onClickListener = new c();
                }
                imageView.setOnClickListener(onClickListener);
            }
        }
    }

    public static class a0 extends View.BaseSavedState {
        public static final Parcelable.Creator<a0> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public c0 f3194a;

        public class a implements Parcelable.Creator<a0> {
            /* renamed from: a */
            public a0 createFromParcel(Parcel parcel) {
                return new a0(parcel);
            }

            /* renamed from: a */
            public a0[] newArray(int i) {
                return new a0[i];
            }
        }

        public a0(Parcel parcel) {
            super(parcel);
            this.f3194a = (c0) parcel.readParcelable(c0.class.getClassLoader());
        }

        public a0(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f3194a, 0);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            if (VastView.this.isPlaybackStarted()) {
                VastView.this.d();
            }
        }
    }

    public interface b0 {
        void a(int i, int i2, float f2);
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            try {
                if (VastView.this.isPlaybackStarted() && VastView.this.n.isPlaying()) {
                    int duration = VastView.this.n.getDuration();
                    int currentPosition = VastView.this.n.getCurrentPosition();
                    if (currentPosition > 0) {
                        float f2 = (((float) currentPosition) * 100.0f) / ((float) duration);
                        VastView.this.R.a(duration, currentPosition, f2);
                        VastView.this.S.a(duration, currentPosition, f2);
                        VastView.this.W.a(duration, currentPosition, f2);
                        if (f2 > 105.0f) {
                            VastLog.a(VastView.this.f3181a, "Playback tracking: video hang detected");
                            VastView.this.h();
                        }
                    }
                }
            } catch (Exception e2) {
                String f3 = VastView.this.f3181a;
                VastLog.a(f3, "Playback tracking exception: " + e2.getMessage());
            }
            VastView.this.postDelayed(this, 16);
        }
    }

    public static class c0 implements Parcelable {
        public static final Parcelable.Creator<c0> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public String f3197a;

        /* renamed from: b  reason: collision with root package name */
        public float f3198b;

        /* renamed from: c  reason: collision with root package name */
        public int f3199c;

        /* renamed from: d  reason: collision with root package name */
        public int f3200d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3201e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3202f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f3203g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3204h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;

        public class a implements Parcelable.Creator<c0> {
            /* renamed from: a */
            public c0 createFromParcel(Parcel parcel) {
                return new c0(parcel);
            }

            /* renamed from: a */
            public c0[] newArray(int i) {
                return new c0[i];
            }
        }

        public c0() {
            this.f3197a = null;
            this.f3198b = 5.0f;
            this.f3199c = 0;
            this.f3200d = 0;
            this.f3201e = true;
            this.f3202f = false;
            this.f3203g = false;
            this.f3204h = false;
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = false;
            this.m = true;
            this.n = false;
        }

        public c0(Parcel parcel) {
            this.f3197a = null;
            this.f3198b = 5.0f;
            boolean z = false;
            this.f3199c = 0;
            this.f3200d = 0;
            this.f3201e = true;
            this.f3202f = false;
            this.f3203g = false;
            this.f3204h = false;
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = false;
            this.m = true;
            this.n = false;
            this.f3197a = parcel.readString();
            this.f3198b = parcel.readFloat();
            this.f3199c = parcel.readInt();
            this.f3200d = parcel.readInt();
            this.f3201e = parcel.readByte() != 0;
            this.f3202f = parcel.readByte() != 0;
            this.f3203g = parcel.readByte() != 0;
            this.f3204h = parcel.readByte() != 0;
            this.i = parcel.readByte() != 0;
            this.j = parcel.readByte() != 0;
            this.k = parcel.readByte() != 0;
            this.l = parcel.readByte() != 0;
            this.m = parcel.readByte() != 0;
            this.n = parcel.readByte() != 0 ? true : z;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f3197a);
            parcel.writeFloat(this.f3198b);
            parcel.writeInt(this.f3199c);
            parcel.writeInt(this.f3200d);
            parcel.writeByte(this.f3201e ? (byte) 1 : 0);
            parcel.writeByte(this.f3202f ? (byte) 1 : 0);
            parcel.writeByte(this.f3203g ? (byte) 1 : 0);
            parcel.writeByte(this.f3204h ? (byte) 1 : 0);
            parcel.writeByte(this.i ? (byte) 1 : 0);
            parcel.writeByte(this.j ? (byte) 1 : 0);
            parcel.writeByte(this.k ? (byte) 1 : 0);
            parcel.writeByte(this.l ? (byte) 1 : 0);
            parcel.writeByte(this.m ? (byte) 1 : 0);
            parcel.writeByte(this.n ? (byte) 1 : 0);
        }
    }

    public class d implements b0 {
        public d() {
        }

        public void a(int i, int i2, float f2) {
            com.explorestack.iab.utils.e eVar;
            VastView vastView = VastView.this;
            c0 c0Var = vastView.u;
            if (!c0Var.i && c0Var.f3198b != 0.0f && vastView.t.getVideoType() == VideoType.NonRewarded) {
                VastView vastView2 = VastView.this;
                float f3 = vastView2.u.f3198b * 1000.0f;
                float f4 = (float) i2;
                float f5 = f3 - f4;
                int i3 = (int) ((f4 * 100.0f) / f3);
                String f6 = vastView2.f3181a;
                VastLog.d(f6, "Skip percent: " + i3);
                if (i3 < 100 && (eVar = VastView.this.f3188h) != null) {
                    eVar.a(i3, (int) Math.ceil(((double) f5) / 1000.0d));
                }
                if (f5 <= 0.0f) {
                    VastView vastView3 = VastView.this;
                    c0 c0Var2 = vastView3.u;
                    c0Var2.f3198b = 0.0f;
                    c0Var2.i = true;
                    vastView3.setCloseControlsVisible(true);
                }
            }
        }
    }

    public class e implements b0 {
        public e() {
        }

        public void a(int i, int i2, float f2) {
            VastView vastView = VastView.this;
            c0 c0Var = vastView.u;
            if (!c0Var.f3204h || c0Var.f3199c != 3) {
                if (vastView.t.getMaxDurationMillis() > 0 && i2 > VastView.this.t.getMaxDurationMillis() && VastView.this.t.getVideoType() == VideoType.Rewarded) {
                    VastView vastView2 = VastView.this;
                    vastView2.u.i = true;
                    vastView2.setCloseControlsVisible(true);
                }
                VastView vastView3 = VastView.this;
                int i3 = vastView3.u.f3199c;
                if (f2 > ((float) i3) * 25.0f) {
                    if (i3 == 3) {
                        VastLog.d(vastView3.f3181a, "Video at third quartile: (" + f2 + "%)");
                        VastView.this.c(TrackingEvent.thirdQuartile);
                        if (VastView.this.w != null) {
                            VastView.this.w.onVideoThirdQuartile();
                        }
                    } else if (i3 == 0) {
                        VastLog.d(vastView3.f3181a, "Video at start: (" + f2 + "%)");
                        VastView.this.c(TrackingEvent.start);
                        if (VastView.this.w != null) {
                            VastView.this.w.onVideoStarted((float) i, VastView.this.u.f3202f ? 0.0f : 1.0f);
                        }
                    } else if (i3 == 1) {
                        VastLog.d(vastView3.f3181a, "Video at first quartile: (" + f2 + "%)");
                        VastView.this.c(TrackingEvent.firstQuartile);
                        if (VastView.this.w != null) {
                            VastView.this.w.onVideoFirstQuartile();
                        }
                    } else if (i3 == 2) {
                        VastLog.d(vastView3.f3181a, "Video at midpoint: (" + f2 + "%)");
                        VastView.this.c(TrackingEvent.midpoint);
                        if (VastView.this.w != null) {
                            VastView.this.w.onVideoMidpoint();
                        }
                    }
                    VastView.this.u.f3199c++;
                }
            }
        }
    }

    public class f implements b0 {
        public f() {
        }

        public void a(int i, int i2, float f2) {
            if (VastView.this.T.size() == 2 && ((Integer) VastView.this.T.getFirst()).intValue() > ((Integer) VastView.this.T.getLast()).intValue()) {
                VastLog.a(VastView.this.f3181a, "Playing progressing error: seek");
                VastView.this.T.removeFirst();
            }
            if (VastView.this.T.size() == 19) {
                int intValue = ((Integer) VastView.this.T.getFirst()).intValue();
                int intValue2 = ((Integer) VastView.this.T.getLast()).intValue();
                VastLog.d(VastView.this.f3181a, String.format(Locale.ENGLISH, "Playing progressing position: last=%d, first=%d)", new Object[]{Integer.valueOf(intValue2), Integer.valueOf(intValue)}));
                if (intValue2 > intValue) {
                    VastView.this.T.removeFirst();
                } else {
                    VastView.l(VastView.this);
                    if (VastView.this.U >= 3) {
                        VastLog.a(VastView.this.f3181a, "Playing progressing error: video hang detected");
                        VastView.this.k();
                        return;
                    }
                }
            }
            try {
                VastView.this.T.addLast(Integer.valueOf(i2));
                if (i != 0 && i2 > 0) {
                    VastView vastView = VastView.this;
                    if (vastView.l != null) {
                        String f3 = vastView.f3181a;
                        VastLog.d(f3, "Playing progressing percent: " + f2);
                        if (VastView.this.V < f2) {
                            float unused = VastView.this.V = f2;
                            int i3 = i / 1000;
                            VastView.this.l.a(f2, Math.min(i3, (int) Math.ceil((double) (((float) i2) / 1000.0f))), i3);
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    public class g implements TextureView.SurfaceTextureListener {
        public g() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            VastLog.d(VastView.this.f3181a, "onSurfaceTextureAvailable");
            VastView.this.f3184d = new Surface(surfaceTexture);
            boolean unused = VastView.this.F = true;
            if (VastView.this.G) {
                boolean unused2 = VastView.this.G = false;
                VastView.this.startPlayback("onSurfaceTextureAvailable");
            } else if (VastView.this.isPlaybackStarted()) {
                VastView vastView = VastView.this;
                vastView.n.setSurface(vastView.f3184d);
                VastView.this.t();
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            VastLog.d(VastView.this.f3181a, "onSurfaceTextureDestroyed");
            VastView vastView = VastView.this;
            vastView.f3184d = null;
            boolean unused = vastView.F = false;
            if (VastView.this.isPlaybackStarted()) {
                VastView.this.n.setSurface((Surface) null);
                VastView.this.n();
            }
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            String f2 = VastView.this.f3181a;
            VastLog.d(f2, "onSurfaceTextureSizeChanged: " + i + "/" + i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public class h implements MediaPlayer.OnCompletionListener {
        public h() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            VastLog.d(VastView.this.f3181a, "MediaPlayer - onCompletion");
            VastView.this.h();
        }
    }

    public class i implements MediaPlayer.OnErrorListener {
        public i() {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            String f2 = VastView.this.f3181a;
            VastLog.d(f2, "MediaPlayer - onError: what=" + i + ", extra=" + i2);
            VastView.this.k();
            return true;
        }
    }

    public class j implements MediaPlayer.OnPreparedListener {
        public j() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            VastLog.d(VastView.this.f3181a, "MediaPlayer - onPrepared");
            VastView vastView = VastView.this;
            if (!vastView.u.j) {
                vastView.c(TrackingEvent.creativeView);
                VastView.this.c(TrackingEvent.fullscreen);
                VastView.this.A();
                VastView.this.setLoadingViewVisibility(false);
                boolean unused = VastView.this.I = true;
                if (!VastView.this.u.f3203g) {
                    mediaPlayer.start();
                    VastView.this.w();
                }
                VastView.this.z();
                int i = VastView.this.u.f3200d;
                if (i > 0) {
                    mediaPlayer.seekTo(i);
                    VastView.this.c(TrackingEvent.resume);
                    if (VastView.this.w != null) {
                        VastView.this.w.onVideoResumed();
                    }
                }
                VastView vastView2 = VastView.this;
                if (!vastView2.u.m) {
                    vastView2.n();
                }
                VastView vastView3 = VastView.this;
                if (!vastView3.u.k) {
                    vastView3.i();
                    if (VastView.this.t.shouldPreloadCompanion()) {
                        VastView.this.a(false);
                    }
                }
            }
        }
    }

    public class k implements View.OnClickListener {
        public k() {
        }

        public void onClick(View view) {
            if (VastView.this.isPlaybackStarted() || VastView.this.u.j) {
                VastView.this.v();
            }
        }
    }

    public class l implements MediaPlayer.OnVideoSizeChangedListener {
        public l() {
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            VastLog.d(VastView.this.f3181a, "onVideoSizeChanged");
            int unused = VastView.this.B = i;
            int unused2 = VastView.this.C = i2;
            VastView.this.d();
        }
    }

    public class m implements b.C0036b {
        public m() {
        }

        public void a(boolean z) {
            VastView.this.B();
        }
    }

    public class n implements View.OnTouchListener {
        public n() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0 && action != 1) {
                return false;
            }
            VastView.this.N.add(view);
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    public class o extends WebChromeClient {
        public o() {
        }

        public final boolean a(JsResult jsResult) {
            jsResult.cancel();
            return true;
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            VastLog.d("JS alert", str2);
            return a(jsResult);
        }

        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            VastLog.d("JS confirm", str2);
            return a(jsResult);
        }

        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            VastLog.d("JS prompt", str2);
            return a(jsPromptResult);
        }
    }

    public class p extends WebViewClient {
        public p() {
        }

        public void onPageFinished(WebView webView, String str) {
            webView.setBackgroundColor(0);
            webView.setLayerType(1, (Paint) null);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest.hasGesture()) {
                VastView.this.N.add(webView);
            }
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!VastView.this.N.contains(webView)) {
                return true;
            }
            VastLog.d(VastView.this.f3181a, "banner clicked");
            VastView vastView = VastView.this;
            boolean unused = vastView.a(vastView.p, str);
            return true;
        }
    }

    public class q implements com.explorestack.iab.vast.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f3218a;

        public q(boolean z) {
            this.f3218a = z;
        }

        public void a(VastRequest vastRequest) {
            VastView vastView = VastView.this;
            vastView.a(vastView.v, vastRequest);
        }

        public void a(VastRequest vastRequest, VastAd vastAd) {
            VastView.this.a(vastRequest, vastAd, this.f3218a);
        }
    }

    public class r implements com.explorestack.iab.vast.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f3220a;

        public r(boolean z) {
            this.f3220a = z;
        }

        public void a(VastRequest vastRequest) {
            VastView vastView = VastView.this;
            vastView.a(vastView.v, vastRequest);
        }

        public void a(VastRequest vastRequest, VastAd vastAd) {
            VastView.this.a(vastRequest, vastAd, this.f3220a);
        }
    }

    public class s implements a.d {
        public s() {
        }

        public void onCloseClick() {
            VastView vastView = VastView.this;
            vastView.a(vastView.v, VastView.this.t);
        }

        public void onCountDownFinish() {
        }
    }

    public class t implements View.OnClickListener {
        public t() {
        }

        public void onClick(View view) {
            boolean unused = VastView.this.j();
        }
    }

    public class u implements View.OnClickListener {
        public u() {
        }

        public void onClick(View view) {
            VastRequest vastRequest = VastView.this.t;
            if (vastRequest != null && vastRequest.isR1()) {
                VastView vastView = VastView.this;
                if (!vastView.u.l && vastView.j()) {
                    return;
                }
            }
            if (VastView.this.H) {
                VastView.this.e();
            } else {
                VastView.this.handleBackPress();
            }
        }
    }

    public class v implements View.OnClickListener {
        public v() {
        }

        public void onClick(View view) {
            VastView.this.C();
        }
    }

    public class w implements View.OnClickListener {
        public w() {
        }

        public void onClick(View view) {
            VastView.this.s();
        }
    }

    public class x implements View.OnClickListener {
        public x() {
        }

        public void onClick(View view) {
            boolean unused = VastView.this.j();
        }
    }

    public final class y implements MraidInterstitialListener {
        private y() {
        }

        public /* synthetic */ y(VastView vastView, k kVar) {
            this();
        }

        public void onClose(MraidInterstitial mraidInterstitial) {
            VastView.this.f();
        }

        public void onError(MraidInterstitial mraidInterstitial, int i) {
            VastView.this.g();
        }

        public void onLoaded(MraidInterstitial mraidInterstitial) {
            VastView vastView = VastView.this;
            if (vastView.u.j) {
                vastView.setLoadingViewVisibility(false);
                mraidInterstitial.showInView(VastView.this, false);
            }
        }

        public void onOpenBrowser(MraidInterstitial mraidInterstitial, String str, IabClickCallback iabClickCallback) {
            iabClickCallback.clickHandled();
            VastView vastView = VastView.this;
            boolean unused = vastView.a(vastView.q, str);
        }

        public void onPlayVideo(MraidInterstitial mraidInterstitial, String str) {
        }

        public void onShown(MraidInterstitial mraidInterstitial) {
        }
    }

    public static abstract class z extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<Context> f3229a;

        /* renamed from: b  reason: collision with root package name */
        public Uri f3230b;

        /* renamed from: c  reason: collision with root package name */
        public String f3231c;

        /* renamed from: d  reason: collision with root package name */
        public Bitmap f3232d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3233e;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                z zVar = z.this;
                zVar.a(zVar.f3232d);
            }
        }

        public z(Context context, Uri uri, String str) {
            this.f3229a = new WeakReference<>(context);
            this.f3230b = uri;
            this.f3231c = str;
            if (str != null || (uri != null && !TextUtils.isEmpty(uri.getPath()) && new File(uri.getPath()).exists())) {
                start();
            } else {
                a((Bitmap) null);
            }
        }

        public void a() {
            this.f3233e = true;
        }

        public abstract void a(Bitmap bitmap);

        public void run() {
            Context context = (Context) this.f3229a.get();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (context != null) {
                try {
                    Uri uri = this.f3230b;
                    if (uri != null) {
                        mediaMetadataRetriever.setDataSource(context, uri);
                    } else {
                        String str = this.f3231c;
                        if (str != null) {
                            mediaMetadataRetriever.setDataSource(str, new HashMap());
                        }
                    }
                    this.f3232d = mediaMetadataRetriever.getFrameAtTime((Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) / 2) * 1000, 2);
                } catch (Exception e2) {
                    VastLog.a("MediaFrameRetriever", e2.getMessage());
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e3) {
                VastLog.a("MediaFrameRetriever", e3.getMessage());
            }
            if (!this.f3233e) {
                Utils.onUiThread(new a());
            }
        }
    }

    public VastView(Context context) {
        this(context, (AttributeSet) null);
    }

    public VastView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VastView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3181a = "VASTView-" + Integer.toHexString(hashCode());
        this.u = new c0();
        this.z = 0;
        this.A = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = true;
        this.M = false;
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new b();
        this.Q = new c();
        this.R = new d();
        this.S = new e();
        this.T = new LinkedList<>();
        this.U = 0;
        this.V = 0.0f;
        this.W = new f();
        g gVar = new g();
        this.a0 = gVar;
        this.b0 = new h();
        this.c0 = new i();
        this.d0 = new j();
        this.e0 = new l();
        this.f0 = new m();
        this.g0 = new n();
        this.h0 = new o();
        this.i0 = new p();
        setBackgroundColor(-16777216);
        setOnClickListener(new k());
        com.explorestack.iab.vast.view.a aVar = new com.explorestack.iab.vast.view.a(context);
        this.f3182b = aVar;
        aVar.setSurfaceTextureListener(gVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3183c = frameLayout;
        frameLayout.addView(this.f3182b, new FrameLayout.LayoutParams(-1, -1, 17));
        addView(this.f3183c, new RelativeLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f3185e = frameLayout2;
        frameLayout2.setBackgroundColor(0);
        addView(this.f3185e, new ViewGroup.LayoutParams(-1, -1));
        com.explorestack.iab.view.a aVar2 = new com.explorestack.iab.view.a(getContext());
        this.f3186f = aVar2;
        aVar2.setBackgroundColor(0);
        addView(this.f3186f, new ViewGroup.LayoutParams(-1, -1));
    }

    private int getAvailableHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getAvailableWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public static /* synthetic */ int l(VastView vastView) {
        int i2 = vastView.U;
        vastView.U = i2 + 1;
        return i2;
    }

    /* access modifiers changed from: private */
    public void setCloseControlsVisible(boolean z2) {
        this.K = z2;
        y();
    }

    /* access modifiers changed from: private */
    public void setLoadingViewVisibility(boolean z2) {
        com.explorestack.iab.utils.h hVar = this.k;
        if (hVar != null) {
            if (z2) {
                hVar.a(0);
                this.k.a();
                return;
            }
            hVar.a(8);
        }
    }

    private void setMute(boolean z2) {
        this.u.f3202f = z2;
        z();
        c(this.u.f3202f ? TrackingEvent.mute : TrackingEvent.unmute);
    }

    private void setPlaceholderViewVisible(boolean z2) {
        com.explorestack.iab.view.a aVar = this.f3186f;
        VastRequest vastRequest = this.t;
        aVar.setCloseVisibility(z2, vastRequest != null ? vastRequest.getPlaceholderTimeoutSec() : 3.0f);
    }

    public final void A() {
        if (isLoaded()) {
            v();
        }
    }

    public final void B() {
        if (!this.D || !com.explorestack.iab.vast.b.b(getContext())) {
            n();
        } else if (this.E) {
            this.E = false;
            startPlayback("onWindowFocusChanged");
        } else if (!this.u.j) {
            t();
        } else {
            setLoadingViewVisibility(false);
        }
    }

    public final void C() {
        setMute(!this.u.f3202f);
    }

    public final View a(Context context, CompanionTag companionTag) {
        boolean isTablet = Utils.isTablet(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Utils.dpToPx(context, companionTag.getWidth() > 0 ? (float) companionTag.getWidth() : isTablet ? 728.0f : 320.0f), Utils.dpToPx(context, companionTag.getHeight() > 0 ? (float) companionTag.getHeight() : isTablet ? 90.0f : 50.0f));
        WebView webView = new WebView(context);
        webView.setId(Utils.generateViewId());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollContainer(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setScrollBarStyle(33554432);
        webView.setFocusableInTouchMode(false);
        webView.setBackgroundColor(0);
        webView.setOnTouchListener(this.g0);
        webView.setWebViewClient(this.i0);
        webView.setWebChromeClient(this.h0);
        String html = companionTag.getHtml();
        if (html != null) {
            webView.loadDataWithBaseURL("", html, "text/html", "utf-8", (String) null);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(Utils.generateViewId());
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(webView, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public final ImageView a(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageView;
    }

    public final IabElementStyle a(com.explorestack.iab.vast.a aVar, IabElementStyle iabElementStyle) {
        if (aVar == null) {
            return null;
        }
        if (iabElementStyle == null) {
            IabElementStyle iabElementStyle2 = new IabElementStyle();
            iabElementStyle2.setStrokeColor(aVar.getAssetsColor());
            iabElementStyle2.setFillColor(aVar.getAssetsBackgroundColor());
            return iabElementStyle2;
        }
        if (!iabElementStyle.hasStrokeColor()) {
            iabElementStyle.setStrokeColor(aVar.getAssetsColor());
        }
        if (!iabElementStyle.hasFillColor()) {
            iabElementStyle.setFillColor(aVar.getAssetsBackgroundColor());
        }
        return iabElementStyle;
    }

    public final void a() {
        for (com.explorestack.iab.utils.g<? extends View> b2 : this.O) {
            b2.b();
        }
    }

    public final void a(int i2) {
        VastRequest vastRequest;
        try {
            VastRequest vastRequest2 = this.t;
            if (vastRequest2 != null) {
                vastRequest2.sendError(i2);
            }
        } catch (Exception e2) {
            VastLog.a(this.f3181a, e2.getMessage());
        }
        VastViewListener vastViewListener = this.v;
        if (vastViewListener != null && (vastRequest = this.t) != null) {
            vastViewListener.onError(this, vastRequest, i2);
        }
    }

    public final void a(TrackingEvent trackingEvent) {
        VastLog.d(this.f3181a, String.format("Track Banner Event: %s", new Object[]{trackingEvent}));
        CompanionTag companionTag = this.p;
        if (companionTag != null) {
            a(companionTag.getTrackingEventListMap(), trackingEvent);
        }
    }

    public final void a(VastRequest vastRequest, VastAd vastAd, boolean z2) {
        c0 c0Var;
        float f2;
        AppodealExtensionTag appodealExtension = vastAd.getAppodealExtension();
        this.z = vastRequest.getPreferredVideoOrientation();
        this.p = (appodealExtension == null || !appodealExtension.getCtaStyle().isVisible().booleanValue()) ? null : appodealExtension.getCompanionTag();
        if (this.p == null) {
            this.p = vastAd.getBanner(getContext());
        }
        i((com.explorestack.iab.vast.a) appodealExtension);
        boolean z3 = true;
        a((com.explorestack.iab.vast.a) appodealExtension, this.o != null);
        a((com.explorestack.iab.vast.a) appodealExtension);
        b((com.explorestack.iab.vast.a) appodealExtension);
        e((com.explorestack.iab.vast.a) appodealExtension);
        h((com.explorestack.iab.vast.a) appodealExtension);
        g((com.explorestack.iab.vast.a) appodealExtension);
        d((com.explorestack.iab.vast.a) appodealExtension);
        c((com.explorestack.iab.vast.a) appodealExtension);
        setLoadingViewVisibility(false);
        VastAdMeasurer vastAdMeasurer = this.x;
        if (vastAdMeasurer != null) {
            vastAdMeasurer.registerAdContainer(this);
            this.x.registerAdView(this.f3182b);
        }
        VastViewListener vastViewListener = this.v;
        if (vastViewListener != null) {
            vastViewListener.onOrientationRequested(this, vastRequest, this.u.j ? this.A : this.z);
        }
        if (!z2) {
            this.u.f3197a = vastRequest.getId();
            c0 c0Var2 = this.u;
            c0Var2.m = this.L;
            c0Var2.n = this.M;
            if (appodealExtension != null) {
                c0Var2.f3202f = appodealExtension.isMuted();
            }
            if (vastRequest.isForceUseNativeCloseTime() || vastAd.getSkipOffsetSec() <= 0) {
                if (vastRequest.getVideoCloseTime() >= 0.0f) {
                    c0Var = this.u;
                    f2 = vastRequest.getVideoCloseTime();
                } else {
                    c0Var = this.u;
                    f2 = 5.0f;
                }
                c0Var.f3198b = f2;
            } else {
                this.u.f3198b = (float) vastAd.getSkipOffsetSec();
            }
            VastAdMeasurer vastAdMeasurer2 = this.x;
            if (vastAdMeasurer2 != null) {
                vastAdMeasurer2.onAdViewReady(this.f3182b);
            }
            VastViewListener vastViewListener2 = this.v;
            if (vastViewListener2 != null) {
                vastViewListener2.onShown(this, vastRequest);
            }
        }
        if (vastRequest.getVideoType() == VideoType.Rewarded) {
            z3 = false;
        }
        setCloseControlsVisible(z3);
        startPlayback("load (restoring: " + z2 + ")");
    }

    public final void a(com.explorestack.iab.vast.a aVar) {
        if (aVar == null || aVar.getCloseStyle().isVisible().booleanValue()) {
            if (this.f3187g == null) {
                com.explorestack.iab.utils.d dVar = new com.explorestack.iab.utils.d(new u());
                this.f3187g = dVar;
                this.O.add(dVar);
            }
            this.f3187g.a(getContext(), (ViewGroup) this.f3185e, a(aVar, aVar != null ? aVar.getCloseStyle() : null));
            return;
        }
        com.explorestack.iab.utils.d dVar2 = this.f3187g;
        if (dVar2 != null) {
            dVar2.c();
        }
    }

    public final void a(com.explorestack.iab.vast.a aVar, boolean z2) {
        if (!z2 && (aVar == null || aVar.getCtaStyle().isVisible().booleanValue())) {
            if (this.m == null) {
                com.explorestack.iab.utils.f fVar = new com.explorestack.iab.utils.f(new t());
                this.m = fVar;
                this.O.add(fVar);
            }
            this.m.a(getContext(), (ViewGroup) this.f3185e, a(aVar, aVar != null ? aVar.getCtaStyle() : null));
            return;
        }
        com.explorestack.iab.utils.f fVar2 = this.m;
        if (fVar2 != null) {
            fVar2.c();
        }
    }

    public final void a(VastViewListener vastViewListener, VastRequest vastRequest) {
        if (!(vastViewListener == null || vastRequest == null)) {
            vastViewListener.onError(this, vastRequest, 3);
        }
        if (vastViewListener != null && vastRequest != null) {
            vastViewListener.onFinish(this, vastRequest, false);
        }
    }

    public final void a(List<String> list) {
        if (isLoaded()) {
            if (list == null || list.size() == 0) {
                VastLog.d(this.f3181a, "\turl list is null");
            } else {
                this.t.fireUrls(list, (Bundle) null);
            }
        }
    }

    public final void a(Map<TrackingEvent, List<String>> map, TrackingEvent trackingEvent) {
        if (map == null || map.size() <= 0) {
            VastLog.d(this.f3181a, String.format("Processing Event - fail: %s (tracking event map is null or empty)", new Object[]{trackingEvent}));
            return;
        }
        a(map.get(trackingEvent));
    }

    public final void a(boolean z2) {
        CompanionTag companion;
        if (isLoaded()) {
            if (!z2 && this.q != (companion = this.t.getVastAd().getCompanion(getAvailableWidth(), getAvailableHeight()))) {
                this.A = (companion == null || !this.t.shouldUseScreenSizeForCompanionOrientation()) ? this.z : Utils.orientationBySize(companion.getWidth(), companion.getHeight());
                this.q = companion;
                MraidInterstitial mraidInterstitial = this.s;
                if (mraidInterstitial != null) {
                    mraidInterstitial.destroy();
                    this.s = null;
                }
            }
            if (this.q == null) {
                if (this.r == null) {
                    this.r = a(getContext());
                }
            } else if (this.s == null) {
                r();
                String htmlForMraid = this.q.getHtmlForMraid();
                if (htmlForMraid != null) {
                    AppodealExtensionTag appodealExtension = this.t.getVastAd().getAppodealExtension();
                    PostBannerTag postBannerTag = appodealExtension != null ? appodealExtension.getPostBannerTag() : null;
                    MraidInterstitial.Builder listener = MraidInterstitial.newBuilder().setBaseUrl((String) null).setCacheControl(CacheControl.FullLoad).setCloseTime(this.t.getCompanionCloseTime()).forceUseNativeCloseButton(this.t.isForceUseNativeCloseTime()).setIsTag(false).setListener(new y(this, (k) null));
                    if (postBannerTag != null) {
                        listener.setCloseStyle(postBannerTag.getCloseStyle());
                        listener.setCountDownStyle(postBannerTag.getCountDownStyle());
                        listener.setLoadingStyle(postBannerTag.getLoadingStyle());
                        listener.setProgressStyle(postBannerTag.getProgressStyle());
                        listener.setDurationSec(postBannerTag.getDurationSec());
                        listener.setProductLink(postBannerTag.getProductLink());
                        if (postBannerTag.isForceUseNativeClose()) {
                            listener.forceUseNativeCloseButton(true);
                        }
                        listener.setR1(postBannerTag.isR1());
                        listener.setR2(postBannerTag.isR2());
                    }
                    try {
                        MraidInterstitial build = listener.build(getContext());
                        this.s = build;
                        build.load(htmlForMraid);
                        return;
                    } catch (Throwable unused) {
                    }
                }
                g();
            }
        }
    }

    public final boolean a(VastRequest vastRequest, Boolean bool, boolean z2) {
        String str;
        String str2;
        stopPlayback();
        if (!z2) {
            this.u = new c0();
        }
        if (!Utils.isNetworkAvailable(getContext())) {
            this.t = null;
            e();
            str = this.f3181a;
            str2 = "vastRequest.getVastAd() is null. Stop playing...";
        } else {
            if (bool != null) {
                this.u.f3201e = bool.booleanValue();
            }
            this.t = vastRequest;
            if (vastRequest == null) {
                e();
                str = this.f3181a;
                str2 = "VastRequest is null. Stop playing...";
            } else {
                VastAd vastAd = vastRequest.getVastAd();
                if (vastAd == null) {
                    e();
                    str = this.f3181a;
                    str2 = "VastAd is null. Stop playing...";
                } else {
                    if (vastRequest.getCacheControl() == CacheControl.PartialLoad && !isVideoFileLoaded()) {
                        vastRequest.setVastFileLoadedListener(new q(z2));
                        f((com.explorestack.iab.vast.a) vastAd.getAppodealExtension());
                        setPlaceholderViewVisible(true);
                        setLoadingViewVisibility(true);
                    } else if (vastRequest.getCacheControl() != CacheControl.Stream || isVideoFileLoaded()) {
                        a(vastRequest, vastAd, z2);
                    } else {
                        vastRequest.setVastFileLoadedListener(new r(z2));
                        f((com.explorestack.iab.vast.a) vastAd.getAppodealExtension());
                        setPlaceholderViewVisible(true);
                        setLoadingViewVisibility(true);
                        vastRequest.performCache(getContext().getApplicationContext(), (VastRequestListener) null);
                    }
                    return true;
                }
            }
        }
        VastLog.a(str, str2);
        return false;
    }

    public final boolean a(CompanionTag companionTag, String str) {
        VastRequest vastRequest = this.t;
        ArrayList arrayList = null;
        VastAd vastAd = vastRequest != null ? vastRequest.getVastAd() : null;
        ArrayList<String> wrapperCompanionClickTrackingUrlList = vastAd != null ? vastAd.getWrapperCompanionClickTrackingUrlList() : null;
        List<String> companionClickTrackingList = companionTag != null ? companionTag.getCompanionClickTrackingList() : null;
        if (!(wrapperCompanionClickTrackingUrlList == null && companionClickTrackingList == null)) {
            arrayList = new ArrayList();
            if (companionClickTrackingList != null) {
                arrayList.addAll(companionClickTrackingList);
            }
            if (wrapperCompanionClickTrackingUrlList != null) {
                arrayList.addAll(wrapperCompanionClickTrackingUrlList);
            }
        }
        return a((List<String>) arrayList, str);
    }

    public final boolean a(List<String> list, String str) {
        String str2 = this.f3181a;
        VastLog.d(str2, "processClickThroughEvent: " + str);
        this.u.l = true;
        if (str == null) {
            return false;
        }
        a(list);
        if (!(this.v == null || this.t == null)) {
            n();
            setLoadingViewVisibility(true);
            this.v.onClick(this, this.t, this, str);
        }
        return true;
    }

    public void addView(View view) {
        super.addView(view);
        this.f3185e.bringToFront();
    }

    public final void b() {
        z zVar = this.y;
        if (zVar != null) {
            zVar.a();
            this.y = null;
        }
    }

    public final void b(TrackingEvent trackingEvent) {
        VastLog.d(this.f3181a, String.format("Track Companion Event: %s", new Object[]{trackingEvent}));
        CompanionTag companionTag = this.q;
        if (companionTag != null) {
            a(companionTag.getTrackingEventListMap(), trackingEvent);
        }
    }

    public final void b(com.explorestack.iab.vast.a aVar) {
        if (aVar == null || aVar.getCountDownStyle().isVisible().booleanValue()) {
            IabElementStyle iabElementStyle = null;
            if (this.f3188h == null) {
                com.explorestack.iab.utils.e eVar = new com.explorestack.iab.utils.e((View.OnClickListener) null);
                this.f3188h = eVar;
                this.O.add(eVar);
            }
            if (aVar != null) {
                iabElementStyle = aVar.getCountDownStyle();
            }
            this.f3188h.a(getContext(), (ViewGroup) this.f3185e, a(aVar, iabElementStyle));
            return;
        }
        com.explorestack.iab.utils.e eVar2 = this.f3188h;
        if (eVar2 != null) {
            eVar2.c();
        }
    }

    public final void b(boolean z2) {
        VastViewListener vastViewListener;
        if (isLoaded() && !this.H) {
            this.H = true;
            this.u.j = true;
            int i2 = getResources().getConfiguration().orientation;
            int i3 = this.A;
            if (!(i2 == i3 || (vastViewListener = this.v) == null)) {
                vastViewListener.onOrientationRequested(this, this.t, i3);
            }
            com.explorestack.iab.utils.j jVar = this.l;
            if (jVar != null) {
                jVar.c();
            }
            com.explorestack.iab.utils.i iVar = this.j;
            if (iVar != null) {
                iVar.c();
            }
            com.explorestack.iab.utils.k kVar = this.i;
            if (kVar != null) {
                kVar.c();
            }
            a();
            if (this.u.n) {
                if (this.r == null) {
                    this.r = a(getContext());
                }
                this.r.setImageBitmap(this.f3182b.getBitmap());
                addView(this.r, new FrameLayout.LayoutParams(-1, -1));
                this.f3185e.bringToFront();
                return;
            }
            a(z2);
            if (this.q == null) {
                setCloseControlsVisible(true);
                if (this.r != null) {
                    this.y = new a(getContext(), this.t.getFileUri(), this.t.getVastAd().getPickedMediaFileTag().getText(), new WeakReference(this.r));
                }
                addView(this.r, new FrameLayout.LayoutParams(-1, -1));
            } else {
                setCloseControlsVisible(false);
                this.f3183c.setVisibility(8);
                q();
                com.explorestack.iab.utils.f fVar = this.m;
                if (fVar != null) {
                    fVar.a(8);
                }
                MraidInterstitial mraidInterstitial = this.s;
                if (mraidInterstitial == null) {
                    setLoadingViewVisibility(false);
                    g();
                } else if (mraidInterstitial.isReady()) {
                    setLoadingViewVisibility(false);
                    this.s.showInView(this, false);
                } else {
                    setLoadingViewVisibility(true);
                }
            }
            stopPlayback();
            this.f3185e.bringToFront();
            b(TrackingEvent.creativeView);
        }
    }

    public final void c() {
        removeCallbacks(this.Q);
    }

    public final void c(TrackingEvent trackingEvent) {
        VastLog.d(this.f3181a, String.format("Track Event: %s", new Object[]{trackingEvent}));
        VastRequest vastRequest = this.t;
        VastAd vastAd = vastRequest != null ? vastRequest.getVastAd() : null;
        if (vastAd != null) {
            a(vastAd.getTrackingEventListMap(), trackingEvent);
        }
    }

    public final void c(com.explorestack.iab.vast.a aVar) {
        if (aVar != null && aVar.isVideoClickable()) {
            this.O.clear();
        }
    }

    public void clickHandleCanceled() {
        if (isCompanionShown()) {
            setLoadingViewVisibility(false);
        } else {
            t();
        }
    }

    public void clickHandleError() {
        if (isPlaybackStarted()) {
            t();
        } else if (!isCompanionShown()) {
            u();
        } else {
            f();
        }
    }

    public void clickHandled() {
        if (isCompanionShown()) {
            setLoadingViewVisibility(false);
        } else if (!this.D) {
            n();
        } else {
            t();
        }
    }

    public final void d() {
        int i2;
        int i3 = this.B;
        if (i3 == 0 || (i2 = this.C) == 0) {
            VastLog.d(this.f3181a, "configureVideoSurface - skip: videoWidth or videoHeight is 0");
        } else {
            this.f3182b.a(i3, i2);
        }
    }

    public final void d(com.explorestack.iab.vast.a aVar) {
        if (aVar == null || aVar.getLoadingStyle().isVisible().booleanValue()) {
            IabElementStyle iabElementStyle = null;
            if (this.k == null) {
                this.k = new com.explorestack.iab.utils.h((View.OnClickListener) null);
            }
            if (aVar != null) {
                iabElementStyle = aVar.getLoadingStyle();
            }
            this.k.a(getContext(), (ViewGroup) this, a(aVar, iabElementStyle));
            return;
        }
        com.explorestack.iab.utils.h hVar = this.k;
        if (hVar != null) {
            hVar.c();
        }
    }

    public void destroy() {
        MraidInterstitial mraidInterstitial = this.s;
        if (mraidInterstitial != null) {
            mraidInterstitial.destroy();
            this.s = null;
            this.q = null;
        }
    }

    public boolean display(VastRequest vastRequest, Boolean bool) {
        return a(vastRequest, bool, false);
    }

    public final void e() {
        VastRequest vastRequest;
        VastLog.a(this.f3181a, "handleClose");
        c(TrackingEvent.close);
        VastViewListener vastViewListener = this.v;
        if (vastViewListener != null && (vastRequest = this.t) != null) {
            vastViewListener.onFinish(this, vastRequest, isFinished());
        }
    }

    public final void e(com.explorestack.iab.vast.a aVar) {
        if (aVar == null || aVar.getMuteStyle().isVisible().booleanValue()) {
            if (this.j == null) {
                com.explorestack.iab.utils.i iVar = new com.explorestack.iab.utils.i(new v());
                this.j = iVar;
                this.O.add(iVar);
            }
            this.j.a(getContext(), (ViewGroup) this.f3185e, a(aVar, aVar != null ? aVar.getMuteStyle() : null));
            return;
        }
        com.explorestack.iab.utils.i iVar2 = this.j;
        if (iVar2 != null) {
            iVar2.c();
        }
    }

    public final void f() {
        VastRequest vastRequest;
        VastLog.a(this.f3181a, "handleCompanionClose");
        b(TrackingEvent.close);
        VastViewListener vastViewListener = this.v;
        if (vastViewListener != null && (vastRequest = this.t) != null) {
            vastViewListener.onFinish(this, vastRequest, isFinished());
        }
    }

    public final void f(com.explorestack.iab.vast.a aVar) {
        IabElementStyle iabElementStyle = null;
        this.f3186f.setCountDownStyle(a(aVar, aVar != null ? aVar.getCountDownStyle() : null));
        if (isFullscreen()) {
            if (aVar != null) {
                iabElementStyle = aVar.getCloseStyle();
            }
            this.f3186f.setCloseStyle(a(aVar, iabElementStyle));
            this.f3186f.setCloseClickListener(new s());
        }
        d(aVar);
    }

    public final void g() {
        VastRequest vastRequest;
        VastLog.a(this.f3181a, "handleCompanionShowError");
        a(600);
        if (this.q != null) {
            m();
            b(true);
            return;
        }
        VastViewListener vastViewListener = this.v;
        if (vastViewListener != null && (vastRequest = this.t) != null) {
            vastViewListener.onFinish(this, vastRequest, isFinished());
        }
    }

    public final void g(com.explorestack.iab.vast.a aVar) {
        if (aVar == null || aVar.getProgressStyle().isVisible().booleanValue()) {
            IabElementStyle iabElementStyle = null;
            if (this.l == null) {
                com.explorestack.iab.utils.j jVar = new com.explorestack.iab.utils.j((View.OnClickListener) null);
                this.l = jVar;
                this.O.add(jVar);
            }
            if (aVar != null) {
                iabElementStyle = aVar.getProgressStyle();
            }
            this.l.a(getContext(), (ViewGroup) this.f3185e, a(aVar, iabElementStyle));
            this.l.a(0.0f, 0, 0);
            return;
        }
        com.explorestack.iab.utils.j jVar2 = this.l;
        if (jVar2 != null) {
            jVar2.c();
        }
    }

    public VastViewListener getListener() {
        return this.v;
    }

    public final void h() {
        VastLog.d(this.f3181a, "handleComplete");
        c0 c0Var = this.u;
        c0Var.i = true;
        if (!this.J && !c0Var.f3204h) {
            c0Var.f3204h = true;
            VastViewListener vastViewListener = this.v;
            if (vastViewListener != null) {
                vastViewListener.onComplete(this, this.t);
            }
            VastPlaybackListener vastPlaybackListener = this.w;
            if (vastPlaybackListener != null) {
                vastPlaybackListener.onVideoCompleted();
            }
            VastRequest vastRequest = this.t;
            if (vastRequest != null && vastRequest.isR2() && !this.u.l) {
                j();
            }
            c(TrackingEvent.complete);
        }
        if (this.u.f3204h) {
            l();
        }
    }

    public final void h(com.explorestack.iab.vast.a aVar) {
        if (aVar == null || !aVar.getRepeatStyle().isVisible().booleanValue()) {
            com.explorestack.iab.utils.k kVar = this.i;
            if (kVar != null) {
                kVar.c();
                return;
            }
            return;
        }
        if (this.i == null) {
            com.explorestack.iab.utils.k kVar2 = new com.explorestack.iab.utils.k(new w());
            this.i = kVar2;
            this.O.add(kVar2);
        }
        this.i.a(getContext(), (ViewGroup) this.f3185e, a(aVar, aVar.getRepeatStyle()));
    }

    public void handleBackPress() {
        if (this.f3186f.isVisible() && this.f3186f.canBeClosed()) {
            a(this.v, this.t);
        } else if (isSkipEnabled()) {
            if (!isCompanionShown()) {
                o();
                return;
            }
            VastRequest vastRequest = this.t;
            if (vastRequest != null && vastRequest.getVideoType() == VideoType.NonRewarded) {
                if (this.q == null) {
                    e();
                    return;
                }
                MraidInterstitial mraidInterstitial = this.s;
                if (mraidInterstitial != null) {
                    mraidInterstitial.dispatchClose();
                } else {
                    f();
                }
            }
        }
    }

    public final void i() {
        VastLog.d(this.f3181a, "handleImpressions");
        VastRequest vastRequest = this.t;
        if (vastRequest != null) {
            this.u.k = true;
            a(vastRequest.getVastAd().getImpressionUrlList());
        }
    }

    public final void i(com.explorestack.iab.vast.a aVar) {
        IabElementStyle iabElementStyle;
        IabElementStyle iabElementStyle2 = Assets.defVideoStyle;
        if (aVar != null) {
            iabElementStyle2 = iabElementStyle2.copyWith(aVar.getVideoStyle());
        }
        if (aVar == null || !aVar.isVideoClickable()) {
            this.f3183c.setOnClickListener((View.OnClickListener) null);
            this.f3183c.setClickable(false);
        } else {
            this.f3183c.setOnClickListener(new x());
        }
        this.f3183c.setBackgroundColor(iabElementStyle2.getFillColor().intValue());
        q();
        if (this.p == null || this.u.j) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.f3183c.setLayoutParams(layoutParams);
            return;
        }
        this.o = a(getContext(), this.p);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.o.getLayoutParams());
        if ("inline".equals(iabElementStyle2.getStyle())) {
            iabElementStyle = Assets.defInlineBannerStyle;
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams2.addRule(15);
                layoutParams3.height = -1;
                layoutParams3.addRule(10);
                layoutParams3.addRule(12);
                if (iabElementStyle2.getHorizontalPosition().intValue() == 3) {
                    layoutParams2.addRule(9);
                    layoutParams2.addRule(0, this.o.getId());
                    layoutParams3.addRule(11);
                } else {
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(1, this.o.getId());
                    layoutParams3.addRule(9);
                }
            } else {
                layoutParams2.addRule(14);
                layoutParams3.width = -1;
                layoutParams3.addRule(9);
                layoutParams3.addRule(11);
                if (iabElementStyle2.getVerticalPosition().intValue() == 48) {
                    layoutParams2.addRule(10);
                    layoutParams2.addRule(2, this.o.getId());
                    layoutParams3.addRule(12);
                } else {
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(3, this.o.getId());
                    layoutParams3.addRule(10);
                }
            }
        } else {
            IabElementStyle iabElementStyle3 = Assets.defBannerStyle;
            layoutParams2.addRule(13);
            iabElementStyle = iabElementStyle3;
        }
        if (aVar != null) {
            iabElementStyle = iabElementStyle.copyWith(aVar.getCtaStyle());
        }
        iabElementStyle.applyPadding(getContext(), this.o);
        iabElementStyle.applyMargin(getContext(), layoutParams3);
        iabElementStyle.applyRelativeAlignment(layoutParams3);
        this.o.setBackgroundColor(iabElementStyle.getFillColor().intValue());
        iabElementStyle2.applyPadding(getContext(), this.f3183c);
        iabElementStyle2.applyMargin(getContext(), layoutParams2);
        this.f3183c.setLayoutParams(layoutParams2);
        addView(this.o, layoutParams3);
        a(TrackingEvent.creativeView);
    }

    public boolean isCompanionShown() {
        return this.u.j;
    }

    public boolean isFinished() {
        VastRequest vastRequest = this.t;
        return vastRequest != null && ((vastRequest.getCompanionCloseTime() == 0.0f && this.u.f3204h) || (this.t.getCompanionCloseTime() > 0.0f && this.u.j));
    }

    public boolean isFullscreen() {
        return this.u.f3201e;
    }

    public boolean isLoaded() {
        VastRequest vastRequest = this.t;
        return (vastRequest == null || vastRequest.getVastAd() == null) ? false : true;
    }

    public boolean isPlaybackStarted() {
        return this.n != null && this.I;
    }

    public boolean isSkipEnabled() {
        c0 c0Var = this.u;
        return c0Var.i || c0Var.f3198b == 0.0f;
    }

    public boolean isVideoFileLoaded() {
        VastRequest vastRequest = this.t;
        return vastRequest != null && vastRequest.checkFile();
    }

    public final boolean j() {
        VastLog.a(this.f3181a, "handleInfoClicked");
        VastRequest vastRequest = this.t;
        if (vastRequest != null) {
            return a(vastRequest.getVastAd().getClickTrackingUrlList(), this.t.getVastAd().getClickThroughUrl());
        }
        return false;
    }

    public final void k() {
        VastLog.a(this.f3181a, "handlePlaybackError");
        this.J = true;
        a((int) TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE);
        l();
    }

    public final void l() {
        VastLog.d(this.f3181a, "finishVideoPlaying");
        stopPlayback();
        VastRequest vastRequest = this.t;
        if (vastRequest == null || vastRequest.isAutoClose() || (this.t.getVastAd().getAppodealExtension() != null && !this.t.getVastAd().getAppodealExtension().getPostBannerTag().isVisible())) {
            e();
            return;
        }
        if (isSkipEnabled()) {
            c(TrackingEvent.close);
        }
        setLoadingViewVisibility(false);
        q();
        u();
    }

    public final void m() {
        if (this.r != null) {
            r();
        } else {
            MraidInterstitial mraidInterstitial = this.s;
            if (mraidInterstitial != null) {
                mraidInterstitial.destroy();
                this.s = null;
                this.q = null;
            }
        }
        this.H = false;
    }

    public void mute() {
        setMute(true);
    }

    public final void n() {
        if (isPlaybackStarted() && !this.u.f3203g) {
            VastLog.d(this.f3181a, "pausePlayback");
            c0 c0Var = this.u;
            c0Var.f3203g = true;
            c0Var.f3200d = this.n.getCurrentPosition();
            this.n.pause();
            c();
            a();
            c(TrackingEvent.pause);
            VastPlaybackListener vastPlaybackListener = this.w;
            if (vastPlaybackListener != null) {
                vastPlaybackListener.onVideoPaused();
            }
        }
    }

    public final void o() {
        VastLog.a(this.f3181a, "performVideoCloseClick");
        stopPlayback();
        if (!this.J) {
            if (!this.u.f3204h) {
                c(TrackingEvent.skip);
                VastPlaybackListener vastPlaybackListener = this.w;
                if (vastPlaybackListener != null) {
                    vastPlaybackListener.onVideoSkipped();
                }
            }
            VastRequest vastRequest = this.t;
            if (vastRequest != null && vastRequest.getMaxDurationMillis() > 0 && this.t.getVideoType() == VideoType.Rewarded) {
                VastViewListener vastViewListener = this.v;
                if (vastViewListener != null) {
                    vastViewListener.onComplete(this, this.t);
                }
                VastPlaybackListener vastPlaybackListener2 = this.w;
                if (vastPlaybackListener2 != null) {
                    vastPlaybackListener2.onVideoCompleted();
                }
            }
            l();
            return;
        }
        e();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.D) {
            startPlayback("onAttachedToWindow");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (isLoaded()) {
            i((com.explorestack.iab.vast.a) this.t.getVastAd().getAppodealExtension());
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopPlayback();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a0 a0Var = (a0) parcelable;
        super.onRestoreInstanceState(a0Var.getSuperState());
        c0 c0Var = a0Var.f3194a;
        if (c0Var != null) {
            this.u = c0Var;
        }
        VastRequest a2 = com.explorestack.iab.vast.c.a(this.u.f3197a);
        if (a2 != null) {
            a(a2, (Boolean) null, true);
        }
    }

    public Parcelable onSaveInstanceState() {
        if (isPlaybackStarted()) {
            this.u.f3200d = this.n.getCurrentPosition();
        }
        a0 a0Var = new a0(super.onSaveInstanceState());
        a0Var.f3194a = this.u;
        return a0Var;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        removeCallbacks(this.P);
        post(this.P);
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        String str = this.f3181a;
        VastLog.d(str, "onWindowFocusChanged: " + z2);
        this.D = z2;
        B();
    }

    public final void p() {
        try {
            if (isLoaded() && !this.u.j) {
                if (this.n == null) {
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    this.n = mediaPlayer;
                    mediaPlayer.setLooping(false);
                    this.n.setAudioStreamType(3);
                    this.n.setOnCompletionListener(this.b0);
                    this.n.setOnErrorListener(this.c0);
                    this.n.setOnPreparedListener(this.d0);
                    this.n.setOnVideoSizeChangedListener(this.e0);
                }
                this.n.setSurface(this.f3184d);
                Uri fileUri = isVideoFileLoaded() ? this.t.getFileUri() : null;
                if (fileUri == null) {
                    setLoadingViewVisibility(true);
                    this.n.setDataSource(this.t.getVastAd().getPickedMediaFileTag().getText());
                } else {
                    setLoadingViewVisibility(false);
                    this.n.setDataSource(getContext(), fileUri);
                }
                this.n.prepareAsync();
            }
        } catch (Exception e2) {
            VastLog.a(this.f3181a, e2.getMessage(), e2);
            k();
        }
    }

    public void pause() {
        setCanAutoResume(false);
        n();
    }

    public final void q() {
        View view = this.o;
        if (view != null) {
            Utils.removeFromParent(view);
            this.o = null;
        }
    }

    public final void r() {
        if (this.r != null) {
            b();
            removeView(this.r);
            this.r = null;
        }
    }

    public void resume() {
        setCanAutoResume(true);
        t();
    }

    public final void s() {
        if (isLoaded()) {
            c0 c0Var = this.u;
            c0Var.j = false;
            c0Var.f3200d = 0;
            m();
            i((com.explorestack.iab.vast.a) this.t.getVastAd().getAppodealExtension());
            startPlayback("restartPlayback");
        }
    }

    public void setAdMeasurer(VastAdMeasurer vastAdMeasurer) {
        this.x = vastAdMeasurer;
    }

    public void setCanAutoResume(boolean z2) {
        this.L = z2;
        this.u.m = z2;
    }

    public void setCanIgnorePostBanner(boolean z2) {
        this.M = z2;
        this.u.n = z2;
    }

    public void setListener(VastViewListener vastViewListener) {
        this.v = vastViewListener;
    }

    public void setPlaybackListener(VastPlaybackListener vastPlaybackListener) {
        this.w = vastPlaybackListener;
    }

    public void startPlayback(String str) {
        String str2 = this.f3181a;
        VastLog.d(str2, "startPlayback: " + str);
        if (isLoaded()) {
            setPlaceholderViewVisible(false);
            if (this.u.j) {
                u();
            } else if (this.D) {
                if (this.F) {
                    stopPlayback();
                    m();
                    d();
                    p();
                    com.explorestack.iab.vast.b.a(this, this.f0);
                } else {
                    this.G = true;
                }
                if (this.f3183c.getVisibility() != 0) {
                    this.f3183c.setVisibility(0);
                }
            } else {
                this.E = true;
            }
        }
    }

    public void stopPlayback() {
        this.u.f3203g = false;
        if (this.n != null) {
            VastLog.d(this.f3181a, "stopPlayback");
            if (this.n.isPlaying()) {
                this.n.stop();
            }
            this.n.release();
            this.n = null;
            this.I = false;
            this.J = false;
            c();
            com.explorestack.iab.vast.b.a((View) this);
        }
    }

    public final void t() {
        c0 c0Var = this.u;
        if (!c0Var.m) {
            if (isPlaybackStarted()) {
                this.n.start();
                this.n.pause();
                setLoadingViewVisibility(false);
            } else if (!this.u.j) {
                startPlayback("resumePlayback (canAutoResume: false)");
            }
        } else if (c0Var.f3203g && this.D) {
            VastLog.d(this.f3181a, "resumePlayback");
            this.u.f3203g = false;
            if (isPlaybackStarted()) {
                this.n.start();
                A();
                w();
                setLoadingViewVisibility(false);
                c(TrackingEvent.resume);
                VastPlaybackListener vastPlaybackListener = this.w;
                if (vastPlaybackListener != null) {
                    vastPlaybackListener.onVideoResumed();
                }
            } else if (!this.u.j) {
                startPlayback("resumePlayback");
            }
        }
    }

    public final void u() {
        b(false);
    }

    public void unmute() {
        setMute(false);
    }

    public final void v() {
        for (com.explorestack.iab.utils.g<? extends View> g2 : this.O) {
            g2.g();
        }
    }

    public final void w() {
        x();
        c();
        this.Q.run();
    }

    public final void x() {
        this.T.clear();
        this.U = 0;
        this.V = 0.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y() {
        /*
            r5 = this;
            boolean r0 = r5.K
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0009
            r0 = 0
        L_0x0007:
            r1 = 0
            goto L_0x0017
        L_0x0009:
            boolean r0 = r5.isSkipEnabled()
            if (r0 != 0) goto L_0x0016
            boolean r0 = r5.H
            if (r0 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0007
        L_0x0016:
            r0 = 0
        L_0x0017:
            com.explorestack.iab.utils.d r3 = r5.f3187g
            r4 = 8
            if (r3 == 0) goto L_0x0026
            if (r1 == 0) goto L_0x0021
            r1 = 0
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            r3.a((int) r1)
        L_0x0026:
            com.explorestack.iab.utils.e r1 = r5.f3188h
            if (r1 == 0) goto L_0x0032
            if (r0 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r2 = 8
        L_0x002f:
            r1.a((int) r2)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.vast.activity.VastView.y():void");
    }

    public final void z() {
        com.explorestack.iab.utils.i iVar;
        float f2;
        VastPlaybackListener vastPlaybackListener;
        if (isPlaybackStarted() && (iVar = this.j) != null) {
            iVar.a(this.u.f3202f);
            if (this.u.f3202f) {
                f2 = 0.0f;
                this.n.setVolume(0.0f, 0.0f);
                vastPlaybackListener = this.w;
                if (vastPlaybackListener == null) {
                    return;
                }
            } else {
                f2 = 1.0f;
                this.n.setVolume(1.0f, 1.0f);
                vastPlaybackListener = this.w;
                if (vastPlaybackListener == null) {
                    return;
                }
            }
            vastPlaybackListener.onVideoVolumeChanged(f2);
        }
    }
}
