package com.applovin.impl.sdk.nativeAd;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.R;

public class AppLovinMediaView extends FrameLayout {
    private static final String TAG = "AppLovinMediaView";
    /* access modifiers changed from: private */
    public final AppLovinNativeAdImpl ad;
    /* access modifiers changed from: private */
    public final ImageView imageView;
    /* access modifiers changed from: private */
    public final boolean isVideoMuted;
    private final com.applovin.impl.sdk.utils.a lifecycleCallbacksAdapter = new com.applovin.impl.sdk.utils.a() {
        public void onActivityPaused(Activity activity) {
            if (AppLovinMediaView.this.videoView != null) {
                AppLovinMediaView.this.videoView.pause();
            }
        }

        public void onActivityResumed(Activity activity) {
            if (AppLovinMediaView.this.videoView != null) {
                AppLovinMediaView.this.videoView.start();
            }
        }
    };
    /* access modifiers changed from: private */
    public final v logger;
    /* access modifiers changed from: private */
    public MediaPlayer mediaPlayer;
    private final n sdk;
    /* access modifiers changed from: private */
    public final a videoUiEventHandler = new a();
    /* access modifiers changed from: private */
    public AppLovinVideoView videoView;

    private class a implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener {
        private a() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            v unused = AppLovinMediaView.this.logger;
            if (v.a()) {
                AppLovinMediaView.this.logger.b(AppLovinMediaView.TAG, "Video completed");
            }
            if (AppLovinMediaView.this.videoView != null) {
                AppLovinMediaView.this.videoView.setVisibility(8);
            }
            AppLovinMediaView.this.imageView.setVisibility(0);
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            v unused = AppLovinMediaView.this.logger;
            if (!v.a()) {
                return true;
            }
            v access$500 = AppLovinMediaView.this.logger;
            access$500.e(AppLovinMediaView.TAG, "Encountered media error: Video view error (" + i + "," + i2 + ") for ad: " + AppLovinMediaView.this.ad);
            return true;
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            v unused = AppLovinMediaView.this.logger;
            if (!v.a()) {
                return false;
            }
            v access$500 = AppLovinMediaView.this.logger;
            access$500.b(AppLovinMediaView.TAG, "MediaPlayer Info: (" + i + ", " + i2 + ")");
            return false;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            MediaPlayer unused = AppLovinMediaView.this.mediaPlayer = mediaPlayer;
            mediaPlayer.setOnInfoListener(AppLovinMediaView.this.videoUiEventHandler);
            mediaPlayer.setOnErrorListener(AppLovinMediaView.this.videoUiEventHandler);
            float f2 = AppLovinMediaView.this.isVideoMuted ^ true ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f2, f2);
            v unused2 = AppLovinMediaView.this.logger;
            if (v.a()) {
                v access$500 = AppLovinMediaView.this.logger;
                access$500.b(AppLovinMediaView.TAG, "MediaPlayer prepared: " + AppLovinMediaView.this.mediaPlayer);
            }
        }
    }

    public AppLovinMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, n nVar, Context context) {
        super(context);
        setBackgroundColor(-16777216);
        this.ad = appLovinNativeAdImpl;
        this.sdk = nVar;
        this.logger = nVar.D();
        this.isVideoMuted = true;
        LayoutInflater.from(context).inflate(R.layout.applovin_native_ad_media_view, this, true);
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        com.applovin.impl.b.a vastAd = appLovinNativeAdImpl.getVastAd();
        Uri h2 = vastAd != null ? vastAd.h() : null;
        if (mainImageUri == null && h2 == null) {
            throw new IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        setOnClickListener(appLovinNativeAdImpl.getClickHandler());
        ImageView imageView2 = (ImageView) findViewById(R.id.image_view);
        this.imageView = imageView2;
        if (mainImageUri != null) {
            imageView2.setImageURI(mainImageUri);
        }
        if (h2 != null) {
            nVar.ai().a(this.lifecycleCallbacksAdapter);
            AppLovinVideoView appLovinVideoView = new AppLovinVideoView(context);
            this.videoView = appLovinVideoView;
            appLovinVideoView.setOnPreparedListener(this.videoUiEventHandler);
            this.videoView.setOnCompletionListener(this.videoUiEventHandler);
            this.videoView.setOnErrorListener(this.videoUiEventHandler);
            this.videoView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            addView(this.videoView);
            this.videoView.setVideoURI(h2);
            this.imageView.setVisibility(8);
        } else {
            this.videoView = null;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void destroy() {
        setOnClickListener((View.OnClickListener) null);
        this.sdk.ai().b(this.lifecycleCallbacksAdapter);
        try {
            if (this.videoView != null) {
                this.videoView.pause();
                this.videoView.stopPlayback();
                this.videoView.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
                this.videoView.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
                this.videoView.setOnErrorListener((MediaPlayer.OnErrorListener) null);
                this.videoView = null;
            }
            if (this.mediaPlayer != null) {
                this.mediaPlayer.release();
                this.mediaPlayer = null;
            }
        } catch (Throwable th) {
            Log.d(TAG, "Encountered exception when destroying:" + th);
        }
        removeAllViews();
    }

    public float getAspectRatio() {
        Drawable drawable;
        ImageView imageView2 = this.imageView;
        if (imageView2 == null || (drawable = imageView2.getDrawable()) == null) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            appLovinVideoView.start();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            appLovinVideoView.pause();
        }
        super.onDetachedFromWindow();
    }
}
