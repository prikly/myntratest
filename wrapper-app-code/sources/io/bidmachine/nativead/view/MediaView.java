package io.bidmachine.nativead.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.iab.utils.Assets;
import com.explorestack.iab.vast.TrackingEvent;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.view.CircleCountdownView;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.nativead.NativeAdObject;
import io.bidmachine.nativead.NativeData;
import io.bidmachine.nativead.NativeInteractor;
import io.bidmachine.nativead.NativeMediaPrivateData;
import io.bidmachine.nativead.tasks.DownloadVastVideoTask;
import io.bidmachine.nativead.tasks.DownloadVideoTask;
import io.bidmachine.nativead.utils.ImageHelper;
import io.bidmachine.nativead.utils.NativeNetworkExecutor;
import io.bidmachine.nativead.view.VideoPlayerActivity;
import java.io.File;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MediaView extends RelativeLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener, VideoPlayerActivity.VideoPlayerActivityListener {
    private static final float ASPECT_MULTIPLIER_HEIGHT_TO_WIDTH = 1.7777778f;
    private static final float ASPECT_MULTIPLIER_WIDTH_TO_HEIGHT = 0.5625f;
    public static VideoPlayerActivity.VideoPlayerActivityListener listener;
    /* access modifiers changed from: private */
    public volatile boolean error;
    /* access modifiers changed from: private */
    public boolean finishedOrExpanded;
    /* access modifiers changed from: private */
    public boolean hasVideo;
    private ImageView imageView;
    boolean isInitialized = false;
    /* access modifiers changed from: private */
    public boolean isMuted = true;
    private boolean isVideoFinishNotified;
    private boolean isVideoStartNotified;
    /* access modifiers changed from: private */
    public MediaPlayer mediaPlayer;
    private boolean mediaPlayerPrepared;
    private boolean mediaPlayerPreparing;
    private CircleCountdownView muteButton;
    NativeData nativeData;
    NativeInteractor nativeInteractor;
    NativeMediaPrivateData nativeMediaData;
    private ImageView playButton;
    private ProgressBar progressBarView;
    /* access modifiers changed from: private */
    public int quartile;
    /* access modifiers changed from: private */
    public boolean startPlayVideoWhenReady;
    private NativeState state = NativeState.Image;
    private TextureView textureView;
    /* access modifiers changed from: private */
    public int videoDuration;
    private int videoHeight = 0;
    private boolean videoSizeWasChanged = true;
    private Timer videoVisibilityCheckerTimer;
    private int videoWidth = 0;
    private boolean viewOnScreen;

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    static /* synthetic */ int access$1608(MediaView mediaView) {
        int i = mediaView.quartile;
        mediaView.quartile = i + 1;
        return i;
    }

    public MediaView(Context context) {
        super(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setNativeAdObject(NativeAdObject nativeAdObject) {
        applyNative(nativeAdObject, nativeAdObject, nativeAdObject);
    }

    public void applyNative(NativeData nativeData2, NativeMediaPrivateData nativeMediaPrivateData, NativeInteractor nativeInteractor2) {
        this.nativeData = nativeData2;
        this.nativeMediaData = nativeMediaPrivateData;
        this.nativeInteractor = nativeInteractor2;
        if (nativeMediaPrivateData.getVideoUri() != null || !TextUtils.isEmpty(nativeData2.getVideoUrl()) || !TextUtils.isEmpty(nativeData2.getVideoAdm())) {
            this.hasVideo = true;
        }
        createView();
    }

    /* access modifiers changed from: package-private */
    public void createView() {
        if (!this.isInitialized) {
            this.isInitialized = true;
            ImageView imageView2 = new ImageView(getContext());
            this.imageView = imageView2;
            imageView2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.imageView.setAdjustViewBounds(true);
            addView(this.imageView);
            if (this.hasVideo) {
                int round = Math.round(Utils.getScreenDensity(getContext()) * 50.0f);
                this.progressBarView = new ProgressBar(getContext(), (AttributeSet) null, 16842874);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(round, round);
                layoutParams.addRule(13, -1);
                this.progressBarView.setLayoutParams(layoutParams);
                this.progressBarView.setBackgroundColor(Color.parseColor("#6b000000"));
                this.progressBarView.setVisibility(4);
                addView(this.progressBarView);
                ImageView imageView3 = new ImageView(getContext());
                this.playButton = imageView3;
                imageView3.setImageResource(17301540);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(round, round);
                layoutParams2.addRule(13, -1);
                this.playButton.setLayoutParams(layoutParams2);
                this.playButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        boolean unused = MediaView.this.startPlayVideoWhenReady = true;
                        MediaView.this.tryPlayVideo();
                    }
                });
                this.playButton.setVisibility(4);
                addView(this.playButton);
                TextureView textureView2 = new TextureView(getContext());
                this.textureView = textureView2;
                textureView2.setSurfaceTextureListener(this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(13);
                this.textureView.setLayoutParams(layoutParams3);
                this.textureView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        if (MediaView.this.nativeMediaData != null && MediaView.this.nativeMediaData.getVideoUri() != null) {
                            Logger.log("Video has been clicked");
                            MediaView.listener = MediaView.this;
                            boolean unused = MediaView.this.finishedOrExpanded = true;
                            int i = 0;
                            if (MediaView.this.isMediaPlayerAvailable() && MediaView.this.mediaPlayer.isPlaying()) {
                                i = MediaView.this.mediaPlayer.getCurrentPosition();
                            }
                            MediaView.this.pausePlayer();
                            Utils.startActivity(MediaView.this.getContext(), VideoPlayerActivity.getIntent(MediaView.this.getContext(), MediaView.this.nativeMediaData.getVideoUri().getPath(), i));
                        }
                    }
                });
                addView(this.textureView);
                createMuteButton();
                createMediaPlayer();
                NativeMediaPrivateData nativeMediaPrivateData = this.nativeMediaData;
                if (nativeMediaPrivateData != null && nativeMediaPrivateData.getVideoUri() != null && this.nativeMediaData.getVideoUri().getPath() != null && new File(this.nativeMediaData.getVideoUri().getPath()).exists()) {
                    this.startPlayVideoWhenReady = true;
                } else if (this.nativeData != null) {
                    updateViewState(NativeState.Loading);
                    if (!TextUtils.isEmpty(this.nativeData.getVideoUrl())) {
                        executeTask(new DownloadVideoTask(getContext(), new DownloadVideoTask.OnLoadedListener() {
                            public void onVideoLoaded(DownloadVideoTask downloadVideoTask, Uri uri) {
                                Logger.log("MediaView video is loaded");
                                MediaView.this.nativeMediaData.setVideoUri(uri);
                                MediaView.this.prepareMediaPlayer();
                            }

                            public void onVideoLoadingError(DownloadVideoTask downloadVideoTask) {
                                Logger.log("MediaView video is not loaded");
                                MediaView.this.updateViewState(NativeState.Image);
                                boolean unused = MediaView.this.hasVideo = false;
                            }
                        }, this.nativeData.getVideoUrl()));
                    } else if (!TextUtils.isEmpty(this.nativeData.getVideoAdm())) {
                        executeTask(new DownloadVastVideoTask(getContext(), new DownloadVastVideoTask.OnLoadedListener() {
                            public void onVideoLoaded(DownloadVastVideoTask downloadVastVideoTask, Uri uri, VastRequest vastRequest) {
                                Logger.log("MediaView video is loaded");
                                MediaView.this.nativeMediaData.setVideoUri(uri);
                                MediaView.this.nativeMediaData.setVastRequest(vastRequest);
                                MediaView.this.prepareMediaPlayer();
                            }

                            public void onVideoLoadingError(DownloadVastVideoTask downloadVastVideoTask) {
                                Logger.log("MediaView video is not loaded");
                                MediaView.this.updateViewState(NativeState.Image);
                                boolean unused = MediaView.this.hasVideo = false;
                            }
                        }, this.nativeData.getVideoAdm()));
                    }
                }
            } else {
                updateViewState(NativeState.Image);
            }
        }
        if (this.nativeMediaData != null) {
            ImageHelper.fillImageView(getContext(), this.imageView, this.nativeMediaData.getImageUri(), this.nativeMediaData.getImageDrawable());
        }
    }

    public void release() {
        new Thread(new Runnable() {
            public void run() {
                MediaView.this.cleanUpMediaPlayer();
            }
        }).start();
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (i != 0) {
            pausePlayer();
        } else if (this.startPlayVideoWhenReady) {
            tryPlayVideo();
        }
        super.onWindowVisibilityChanged(i);
    }

    /* access modifiers changed from: private */
    public void pausePlayer() {
        try {
            if (isMediaPlayerAvailable() && this.mediaPlayer.isPlaying()) {
                this.mediaPlayer.pause();
            }
            if (this.state != NativeState.Loading) {
                updateViewState(NativeState.Paused);
            }
        } catch (Exception e2) {
            Logger.log((Throwable) e2);
        }
    }

    private void createMediaPlayer() {
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.mediaPlayer = mediaPlayer2;
        mediaPlayer2.setOnCompletionListener(this);
        this.mediaPlayer.setOnErrorListener(this);
        this.mediaPlayer.setOnPreparedListener(this);
        this.mediaPlayer.setOnVideoSizeChangedListener(this);
        this.mediaPlayer.setAudioStreamType(3);
        updateVolume();
    }

    /* access modifiers changed from: private */
    public void prepareMediaPlayer() {
        try {
            if (!this.mediaPlayerPrepared && this.nativeMediaData != null && this.nativeMediaData.getVideoUri() != null && !this.mediaPlayerPreparing && !this.error) {
                this.mediaPlayer.setDataSource(getContext(), this.nativeMediaData.getVideoUri());
                this.mediaPlayer.prepareAsync();
                this.mediaPlayerPreparing = true;
            }
        } catch (Exception e2) {
            Logger.log((Throwable) e2);
        }
    }

    /* access modifiers changed from: private */
    public void cleanUpMediaPlayer() {
        if (this.mediaPlayer != null) {
            try {
                if (!this.error) {
                    if (this.mediaPlayer.isPlaying()) {
                        this.mediaPlayer.stop();
                    }
                    this.mediaPlayer.reset();
                }
                this.mediaPlayer.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
                this.mediaPlayer.setOnErrorListener((MediaPlayer.OnErrorListener) null);
                this.mediaPlayer.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
                this.mediaPlayer.setOnVideoSizeChangedListener((MediaPlayer.OnVideoSizeChangedListener) null);
                this.mediaPlayer.release();
            } catch (Exception e2) {
                Logger.log((Throwable) e2);
            }
            this.mediaPlayer = null;
        }
    }

    /* access modifiers changed from: private */
    public void tryPlayVideo() {
        if (this.mediaPlayer == null) {
            createMediaPlayer();
        }
        if (!this.mediaPlayerPrepared) {
            prepareMediaPlayer();
        }
        if (isMediaPlayerAvailable() && this.mediaPlayerPrepared && this.viewOnScreen && isAdOnScreen()) {
            if (!this.mediaPlayer.isPlaying()) {
                this.mediaPlayer.start();
                notifyVideoStarted();
                if (this.videoVisibilityCheckerTimer == null) {
                    startVideoVisibilityCheckerTimer();
                }
            }
            if (this.mediaPlayer.getCurrentPosition() > 0 && this.state != NativeState.Playing) {
                updateViewState(NativeState.Playing);
            }
        }
    }

    /* renamed from: io.bidmachine.nativead.view.MediaView$8  reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$nativead$view$NativeState;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.bidmachine.nativead.view.NativeState[] r0 = io.bidmachine.nativead.view.NativeState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$bidmachine$nativead$view$NativeState = r0
                io.bidmachine.nativead.view.NativeState r1 = io.bidmachine.nativead.view.NativeState.Image     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$bidmachine$nativead$view$NativeState     // Catch:{ NoSuchFieldError -> 0x001d }
                io.bidmachine.nativead.view.NativeState r1 = io.bidmachine.nativead.view.NativeState.Loading     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$bidmachine$nativead$view$NativeState     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.bidmachine.nativead.view.NativeState r1 = io.bidmachine.nativead.view.NativeState.Playing     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$io$bidmachine$nativead$view$NativeState     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.bidmachine.nativead.view.NativeState r1 = io.bidmachine.nativead.view.NativeState.Paused     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.nativead.view.MediaView.AnonymousClass8.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void updateViewState(NativeState nativeState) {
        this.state = nativeState;
        int i = AnonymousClass8.$SwitchMap$io$bidmachine$nativead$view$NativeState[nativeState.ordinal()];
        if (i == 1) {
            ImageView imageView2 = this.imageView;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
                this.imageView.bringToFront();
            }
            if (this.hasVideo) {
                this.textureView.setVisibility(4);
                this.progressBarView.setVisibility(4);
                this.playButton.setVisibility(4);
                this.muteButton.setVisibility(4);
            }
        } else if (i == 2) {
            ImageView imageView3 = this.imageView;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
                this.imageView.bringToFront();
            }
            if (this.hasVideo) {
                this.progressBarView.setVisibility(0);
                this.progressBarView.bringToFront();
                this.textureView.setVisibility(4);
                this.playButton.setVisibility(4);
                this.muteButton.setVisibility(4);
            }
        } else if (i == 3) {
            ImageView imageView4 = this.imageView;
            if (imageView4 != null) {
                imageView4.setVisibility(4);
            }
            if (this.hasVideo) {
                this.textureView.setVisibility(0);
                this.textureView.bringToFront();
                this.muteButton.setVisibility(0);
                this.muteButton.bringToFront();
                updateMuteButton();
                this.progressBarView.setVisibility(4);
                this.playButton.setVisibility(4);
            }
        } else if (i == 4) {
            ImageView imageView5 = this.imageView;
            if (imageView5 != null) {
                imageView5.setVisibility(0);
                this.imageView.bringToFront();
            }
            if (this.hasVideo) {
                this.playButton.setVisibility(0);
                this.playButton.bringToFront();
                this.textureView.setVisibility(4);
                this.progressBarView.setVisibility(4);
                this.muteButton.setVisibility(4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(size, measuredWidth);
            } else {
                size = measuredWidth;
            }
        }
        int i3 = (int) (((float) size) * ASPECT_MULTIPLIER_WIDTH_TO_HEIGHT);
        if (mode2 != 1073741824 || size2 >= i3) {
            size2 = i3;
        } else {
            size = (int) (((float) size2) * ASPECT_MULTIPLIER_HEIGHT_TO_WIDTH);
        }
        if (Math.abs(size2 - measuredHeight) >= 2 || Math.abs(size - measuredWidth) >= 2) {
            getLayoutParams().width = size;
            getLayoutParams().height = size2;
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateTextureLayoutParams();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        try {
            if (this.mediaPlayer == null) {
                createMediaPlayer();
            }
            this.mediaPlayer.setSurface(new Surface(surfaceTexture));
            prepareMediaPlayer();
        } catch (Exception e2) {
            Logger.log((Throwable) e2);
            updateViewState(NativeState.Image);
            this.hasVideo = false;
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer2) {
        videoFinished();
    }

    private void videoFinished() {
        notifyVideoFinished();
        stopVideoVisibilityCheckerTimer();
        pausePlayer();
        if (isMediaPlayerAvailable()) {
            this.mediaPlayer.seekTo(0);
        }
        this.finishedOrExpanded = true;
    }

    public boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
        Logger.log("MediaView: onError");
        clearPlayerOnError();
        return true;
    }

    /* access modifiers changed from: private */
    public void clearPlayerOnError() {
        this.startPlayVideoWhenReady = false;
        cleanUpMediaPlayer();
        updateViewState(NativeState.Image);
        stopVideoVisibilityCheckerTimer();
        this.error = true;
        this.hasVideo = false;
        processErrorEvent();
    }

    public void onPrepared(MediaPlayer mediaPlayer2) {
        Logger.log("MediaView: onPrepared");
        this.mediaPlayerPrepared = true;
        if (this.startPlayVideoWhenReady) {
            tryPlayVideo();
        } else {
            updateViewState(NativeState.Paused);
        }
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i, int i2) {
        this.videoWidth = i;
        this.videoHeight = i2;
        this.videoSizeWasChanged = true;
        updateTextureLayoutParams();
    }

    private void updateTextureLayoutParams() {
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0 && this.videoSizeWasChanged && this.videoWidth != 0 && this.videoHeight != 0) {
            this.videoSizeWasChanged = false;
            ViewGroup.LayoutParams layoutParams = this.textureView.getLayoutParams();
            int i = this.videoWidth;
            int i2 = this.videoHeight;
            if (i > i2) {
                layoutParams.width = width;
                layoutParams.height = (width * this.videoHeight) / this.videoWidth;
            } else {
                layoutParams.width = (i * height) / i2;
                layoutParams.height = height;
            }
            this.textureView.setLayoutParams(layoutParams);
        }
    }

    public void onViewAppearOnScreen() {
        Logger.log("MediaView: onViewAppearOnScreen");
        this.viewOnScreen = true;
        if (this.startPlayVideoWhenReady) {
            tryPlayVideo();
        } else if (this.state != NativeState.Loading) {
            updateViewState(NativeState.Paused);
        }
    }

    /* access modifiers changed from: private */
    public boolean isMediaPlayerAvailable() {
        return !this.error && this.mediaPlayer != null;
    }

    private void notifyVideoStarted() {
        if (!this.isVideoStartNotified) {
            processImpressions();
            this.isVideoStartNotified = true;
            Logger.log("MediaView: video started");
        }
    }

    private void notifyVideoFinished() {
        if (!this.isVideoFinishNotified) {
            processEvent(TrackingEvent.complete);
            this.isVideoFinishNotified = true;
            Logger.log("MediaView: video finished");
        }
    }

    private void createMuteButton() {
        Context context = getContext();
        float screenDensity = Utils.getScreenDensity(context);
        int round = Math.round(40.0f * screenDensity);
        int round2 = Math.round(screenDensity * 8.0f);
        CircleCountdownView circleCountdownView = new CircleCountdownView(context);
        this.muteButton = circleCountdownView;
        circleCountdownView.setColors(Assets.mainAssetsColor, Assets.backgroundColor);
        this.muteButton.setPadding(round2, round2, round2, round2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(round, round);
        layoutParams.addRule(9);
        layoutParams.addRule(10);
        this.muteButton.setLayoutParams(layoutParams);
        updateMuteButton();
        this.muteButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (MediaView.this.isMediaPlayerAvailable()) {
                    if (MediaView.this.isMuted) {
                        MediaView.this.mediaPlayer.setVolume(1.0f, 1.0f);
                        boolean unused = MediaView.this.isMuted = false;
                    } else {
                        MediaView.this.mediaPlayer.setVolume(0.0f, 0.0f);
                        boolean unused2 = MediaView.this.isMuted = true;
                    }
                    MediaView.this.updateMuteButton();
                }
            }
        });
        addView(this.muteButton);
    }

    private void updateVolume() {
        if (!isMediaPlayerAvailable()) {
            return;
        }
        if (this.isMuted) {
            this.mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            this.mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    /* access modifiers changed from: private */
    public void updateMuteButton() {
        CircleCountdownView circleCountdownView = this.muteButton;
        if (circleCountdownView == null) {
            return;
        }
        if (this.isMuted) {
            circleCountdownView.setImage(Assets.getBitmapFromBase64("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAwFBMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALOy8QAAAAQHRSTlMAT5vPRxSr/1OTn4c4s9cYEMu/XwTDu3fbYwjvt+NA8wwg3/fHKOdLj/tbPDBv03+jl4sca2d7NCTrLINDr6dz72VdRQAAA8FJREFUeAHt2dWW6zgURdEd3GFmZqZi7O7//6rmW7ZiK2VHkYo8X0MreI5GENAiEAgEAoFAIBAIhSORcBSfRSzOf8VjOFMimUpncDFZ/i+XxzkKRZJkKYrLKJNKRZUq/xdJVKAONaoV1WlpNFtQ1qZaUYd23R5U9alUVOlTlBxATZVKRUMeG/WgpE61ojEF6i9SJaJWNKHTKAMF05lSUYgu+vMPLFrQxXJlpGhdLm/gsG3TxVZ/UbRLkrsejhX2bkkL3UVb/meZgLekQ0VrUb7P/43z8JZ0Ba1F67eia7i5qfFY01DRBO5uxxQte2aK2pCYFimaDc0UQaaSpCgyMFIEuT1FcZgowglbiu5MFOGU1ZJ27ZiBIpyUEIvC0F+E0+5pt3zQX4R3xGk3gfYivGOwo11TU5EPj23aPBVMFk0e4CJBuz0MFpHh2DvnT3YrBotIjjZweF7SZg5zRSQ5LsMhSZsslKV4XDSAK9kGXXiizRCKFnSouhdRVnRHmzQ8qzRrI0p4KZIO0VabllkFHuWLFPgukk+IJG1C8KhEqhXxl9EAoudzFv47UrGIbw6njv0ReFOjalGfb9YQlWlTgCdtqhatraISRK2x/w8Recmi0IkPaNp/kHpRCaIX/1sRL1s0hCBKy7LlP0i9aA9BgTYZfUHyohxEEVrKGoPkRTH5j/WtziBp0Vx+jt1rDZIVvcgHwZXeIElRHIIVLQe9QZKiEgQ9Wkp6gyRFOwg2vscrL1w0kv8TMtIYJC/KQXBDS1djkLxoqucVUijSH6RUtKZlpx6kXhTS8rVXKLqlJaUepF6UpOVaPUi9qErLncagmdeiPi2vGoOmHos2tIlpDILHojtautAZ5LEoS8tveoM8FbX6tNThSYPngLeikP9DB154DngpEq/RhjeFEc8A/0UHeDSN0D/4L1rBq0q92qdP8F00HkDNgqfAd9HvgM4i+C6KQmsR/BZ1Aa1F8Fv0B/QWwWdRrgC9RfBZNAD0FsFvETQX4bMV4bMV4bMV4bMV4bMV4bMV4bMV4ZMVtSHxyo8pKsLd/IkfU5SEm1iKFqNFy0c4VZpP5AcVNeEU2pE0XXQ3JsluAsdazRwtBosGq/19tIVjqyeSxovk7kl+pqIH8nMVxen01JxRlIQxT3So3jinyBqm8NjyvgI4ihYwpU9RceM6aaswpUO79l0FEIqMB73SMl4UZNvIAsak33KSefl+tIY5t22SnL2IOWJREia1Qvf3vRZcPE74r9QAn0TlNvvUiEcRCAQCgUAgEAgEdPgLbm7XQrhD8bcAAAAASUVORK5CYII="));
        } else {
            circleCountdownView.setImage(Assets.getBitmapFromBase64("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAw1BMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAcKsgAAAAQXRSTlMABFeXn38wGNP/u0AMw8tP11+/3/eTOPNH+0tnc3fvb+tDi49TEKMcY8drKCCvFJt7qyQ047eHCCw8g89bp9vns9m2qsEAAAOSSURBVHgB7drVYuNKEEXR03YMJ0aBQXHAYWbm/P9PXZyZBimOHiTVQK9H4zZDFTzP8zzP8zzP83JQtfpSo4mfRqvNfy138HPo9vhNf4CfQYPaMFAQF9IUdSAtpm3UhSza5O+kmBb5O6nPtGgMOQNmmEwhp84MSQ0VUCuz1bGCQ62tM8MGSlebk+RwE67WVlbSNkq2xf8lO0jZbWQk7SmUaZvfxS3kS6pX00NuIct+SNdBNT08RLajmLakU0kP1/GJ40Pa5idV9JD4jBrR1u5W0UN8rkHbaRU9xAIbtM0q6CEWqSU0rZ+V30MstGMXnZffQyx2Qcu49B7iC5c09UvvIb7QbdN0UHYP8ZWrdRrmuyX3EIbDa2TYoalRcg9hIM/PkLZMw40qt8cJYtREynFCw6DcHjeIcfDF+W/L7UkFkRtw7c5pOCm1xw3KLprRcIfc1MFyxMXyBHEGx/06tfk9cmr1SRYRlFzDMaJhBzmFLCiIURe2BxrqyGfGwoK4B8chtTbyWS4wiI+wBTTsIpf1IoNC2O5jagPkwiKDOFjwBN2SCAphe6J2KBHEE1im1JJ7iaAGLLs0jCWChrA9UwskgngGy4jakUjQCiwNag2RoCdYZtTqIkGXsLxQ2xMJCmHpUAtFgtqwNKk9iwRFsJxQi0SCbmDZt46SCBrC8uA+mv5JfQpLjdqrSNAWLAfUzkWCBj/bR8c+LNvUNiSCItgOpb9+bMHSTah1JIIeYOnQsCsQ1IftgtozBIIC2G6pbQsEPStY1IRaDbm8FRm0AtsODS3k8lRg0C0WPGJvyGc3KizovQXbCQ1LyOn4uaigKRx3NATIS631JkUEPcGh3qlNulX/6bkNV42GUdV/C6d77iMaHqr94zy5+GJodljtaGG+iZT9mIaXSocvp/tIe6Vhfl/heGq4iQwdmraqHOApZGjd0DDZlx5xqpCmNfEh8IimNyU9Jg9omUovEjzGNJ1Kr1o8TmiKT4SXUXYSWi6E13UCp6enRBeasErbTUt05evskrZJE6igqI9sK3M6akAVRSNk6S7R1QCqKEqukKaCiK5ToJKig6ycN6aEXZRrFpPkzQ5c90dvTLtUKFv3pXExvYfrJWKGbQUh28yy9nOtwCcHENNj2voAciZM+diHILrWA4gSv3tc7/J3j61u5jTOIG5/zm/eN+7xM7i+4b/eAoWfRHf1I1wawPM8z/M8z/M872/KUtAsVj+VvQAAAABJRU5ErkJggg=="));
        }
    }

    /* access modifiers changed from: private */
    public boolean isAdOnScreen() {
        return getGlobalVisibleRect(new Rect()) && isShown() && hasWindowFocus();
    }

    public void startVideoVisibilityCheckerTimer() {
        if (this.hasVideo) {
            Timer timer = new Timer();
            this.videoVisibilityCheckerTimer = timer;
            timer.schedule(new TimerTask() {
                /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
                    io.bidmachine.core.Utils.onUiThread(new io.bidmachine.nativead.view.MediaView.AnonymousClass7.AnonymousClass4(r5));
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
                    return;
                 */
                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0115 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r5 = this;
                        io.bidmachine.nativead.view.MediaView r0 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ all -> 0x011e }
                        boolean r0 = r0.error     // Catch:{ all -> 0x011e }
                        if (r0 == 0) goto L_0x0011
                        io.bidmachine.nativead.view.MediaView$7$1 r0 = new io.bidmachine.nativead.view.MediaView$7$1     // Catch:{ all -> 0x011e }
                        r0.<init>()     // Catch:{ all -> 0x011e }
                        io.bidmachine.core.Utils.onUiThread(r0)     // Catch:{ all -> 0x011e }
                        return
                    L_0x0011:
                        io.bidmachine.nativead.view.MediaView r0 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ all -> 0x011e }
                        boolean r0 = r0.isAdOnScreen()     // Catch:{ all -> 0x011e }
                        if (r0 != 0) goto L_0x0023
                        io.bidmachine.nativead.view.MediaView$7$2 r0 = new io.bidmachine.nativead.view.MediaView$7$2     // Catch:{ all -> 0x011e }
                        r0.<init>()     // Catch:{ all -> 0x011e }
                        io.bidmachine.core.Utils.onUiThread(r0)     // Catch:{ all -> 0x011e }
                        goto L_0x0126
                    L_0x0023:
                        io.bidmachine.nativead.view.MediaView r0 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        boolean r0 = r0.isMediaPlayerAvailable()     // Catch:{ IllegalStateException -> 0x0115 }
                        if (r0 == 0) goto L_0x0107
                        io.bidmachine.nativead.view.MediaView r0 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        boolean r0 = r0.error     // Catch:{ IllegalStateException -> 0x0115 }
                        if (r0 != 0) goto L_0x0107
                        io.bidmachine.nativead.view.MediaView r0 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        android.media.MediaPlayer r0 = r0.mediaPlayer     // Catch:{ IllegalStateException -> 0x0115 }
                        boolean r0 = r0.isPlaying()     // Catch:{ IllegalStateException -> 0x0115 }
                        if (r0 == 0) goto L_0x0107
                        io.bidmachine.nativead.view.MediaView r0 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        int r0 = r0.videoDuration     // Catch:{ IllegalStateException -> 0x0115 }
                        if (r0 != 0) goto L_0x0056
                        io.bidmachine.nativead.view.MediaView r0 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        io.bidmachine.nativead.view.MediaView r1 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        android.media.MediaPlayer r1 = r1.mediaPlayer     // Catch:{ IllegalStateException -> 0x0115 }
                        int r1 = r1.getDuration()     // Catch:{ IllegalStateException -> 0x0115 }
                        int unused = r0.videoDuration = r1     // Catch:{ IllegalStateException -> 0x0115 }
                    L_0x0056:
                        io.bidmachine.nativead.view.MediaView r0 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        int r0 = r0.videoDuration     // Catch:{ IllegalStateException -> 0x0115 }
                        if (r0 == 0) goto L_0x0107
                        io.bidmachine.nativead.view.MediaView r0 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        android.media.MediaPlayer r0 = r0.mediaPlayer     // Catch:{ IllegalStateException -> 0x0115 }
                        int r0 = r0.getCurrentPosition()     // Catch:{ IllegalStateException -> 0x0115 }
                        int r0 = r0 * 100
                        io.bidmachine.nativead.view.MediaView r1 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        int r1 = r1.videoDuration     // Catch:{ IllegalStateException -> 0x0115 }
                        int r0 = r0 / r1
                        io.bidmachine.nativead.view.MediaView r1 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        int r1 = r1.quartile     // Catch:{ IllegalStateException -> 0x0115 }
                        int r1 = r1 * 25
                        if (r0 < r1) goto L_0x0107
                        io.bidmachine.nativead.view.MediaView r1 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        int r1 = r1.quartile     // Catch:{ IllegalStateException -> 0x0115 }
                        r2 = 0
                        r3 = 1
                        if (r1 != 0) goto L_0x009e
                        java.lang.String r1 = "Video started: %s%%"
                        java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalStateException -> 0x0115 }
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalStateException -> 0x0115 }
                        r3[r2] = r0     // Catch:{ IllegalStateException -> 0x0115 }
                        java.lang.String r0 = java.lang.String.format(r1, r3)     // Catch:{ IllegalStateException -> 0x0115 }
                        io.bidmachine.core.Logger.log((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0115 }
                        io.bidmachine.nativead.view.MediaView r0 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        com.explorestack.iab.vast.TrackingEvent r1 = com.explorestack.iab.vast.TrackingEvent.start     // Catch:{ IllegalStateException -> 0x0115 }
                        r0.processEvent(r1)     // Catch:{ IllegalStateException -> 0x0115 }
                        goto L_0x0102
                    L_0x009e:
                        io.bidmachine.nativead.view.MediaView r1 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        int r1 = r1.quartile     // Catch:{ IllegalStateException -> 0x0115 }
                        if (r1 != r3) goto L_0x00bf
                        java.lang.String r1 = "Video at first quartile: %s%%"
                        java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalStateException -> 0x0115 }
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalStateException -> 0x0115 }
                        r3[r2] = r0     // Catch:{ IllegalStateException -> 0x0115 }
                        java.lang.String r0 = java.lang.String.format(r1, r3)     // Catch:{ IllegalStateException -> 0x0115 }
                        io.bidmachine.core.Logger.log((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0115 }
                        io.bidmachine.nativead.view.MediaView r0 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        com.explorestack.iab.vast.TrackingEvent r1 = com.explorestack.iab.vast.TrackingEvent.firstQuartile     // Catch:{ IllegalStateException -> 0x0115 }
                        r0.processEvent(r1)     // Catch:{ IllegalStateException -> 0x0115 }
                        goto L_0x0102
                    L_0x00bf:
                        io.bidmachine.nativead.view.MediaView r1 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        int r1 = r1.quartile     // Catch:{ IllegalStateException -> 0x0115 }
                        r4 = 2
                        if (r1 != r4) goto L_0x00e1
                        java.lang.String r1 = "Video at midpoint: %s%%"
                        java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalStateException -> 0x0115 }
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalStateException -> 0x0115 }
                        r3[r2] = r0     // Catch:{ IllegalStateException -> 0x0115 }
                        java.lang.String r0 = java.lang.String.format(r1, r3)     // Catch:{ IllegalStateException -> 0x0115 }
                        io.bidmachine.core.Logger.log((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0115 }
                        io.bidmachine.nativead.view.MediaView r0 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        com.explorestack.iab.vast.TrackingEvent r1 = com.explorestack.iab.vast.TrackingEvent.midpoint     // Catch:{ IllegalStateException -> 0x0115 }
                        r0.processEvent(r1)     // Catch:{ IllegalStateException -> 0x0115 }
                        goto L_0x0102
                    L_0x00e1:
                        io.bidmachine.nativead.view.MediaView r1 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        int r1 = r1.quartile     // Catch:{ IllegalStateException -> 0x0115 }
                        r4 = 3
                        if (r1 != r4) goto L_0x0102
                        java.lang.String r1 = "Video at third quartile: %s%%"
                        java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalStateException -> 0x0115 }
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalStateException -> 0x0115 }
                        r3[r2] = r0     // Catch:{ IllegalStateException -> 0x0115 }
                        java.lang.String r0 = java.lang.String.format(r1, r3)     // Catch:{ IllegalStateException -> 0x0115 }
                        io.bidmachine.core.Logger.log((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0115 }
                        io.bidmachine.nativead.view.MediaView r0 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        com.explorestack.iab.vast.TrackingEvent r1 = com.explorestack.iab.vast.TrackingEvent.thirdQuartile     // Catch:{ IllegalStateException -> 0x0115 }
                        r0.processEvent(r1)     // Catch:{ IllegalStateException -> 0x0115 }
                    L_0x0102:
                        io.bidmachine.nativead.view.MediaView r0 = io.bidmachine.nativead.view.MediaView.this     // Catch:{ IllegalStateException -> 0x0115 }
                        io.bidmachine.nativead.view.MediaView.access$1608(r0)     // Catch:{ IllegalStateException -> 0x0115 }
                    L_0x0107:
                        java.lang.String r0 = "MediaView is on screen"
                        io.bidmachine.core.Logger.log((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0115 }
                        io.bidmachine.nativead.view.MediaView$7$3 r0 = new io.bidmachine.nativead.view.MediaView$7$3     // Catch:{ IllegalStateException -> 0x0115 }
                        r0.<init>()     // Catch:{ IllegalStateException -> 0x0115 }
                        io.bidmachine.core.Utils.onUiThread(r0)     // Catch:{ IllegalStateException -> 0x0115 }
                        goto L_0x0126
                    L_0x0115:
                        io.bidmachine.nativead.view.MediaView$7$4 r0 = new io.bidmachine.nativead.view.MediaView$7$4     // Catch:{ all -> 0x011e }
                        r0.<init>()     // Catch:{ all -> 0x011e }
                        io.bidmachine.core.Utils.onUiThread(r0)     // Catch:{ all -> 0x011e }
                        goto L_0x0126
                    L_0x011e:
                        io.bidmachine.nativead.view.MediaView$7$5 r0 = new io.bidmachine.nativead.view.MediaView$7$5
                        r0.<init>()
                        io.bidmachine.core.Utils.onUiThread(r0)
                    L_0x0126:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.nativead.view.MediaView.AnonymousClass7.run():void");
                }
            }, 0, (long) 500);
        }
    }

    public void stopVideoVisibilityCheckerTimer() {
        Timer timer = this.videoVisibilityCheckerTimer;
        if (timer != null) {
            timer.cancel();
            this.videoVisibilityCheckerTimer = null;
        }
    }

    private void executeTask(Runnable runnable) {
        NativeNetworkExecutor.getInstance().execute(runnable);
    }

    private void processImpressions() {
        NativeMediaPrivateData nativeMediaPrivateData = this.nativeMediaData;
        if (nativeMediaPrivateData != null && nativeMediaPrivateData.getVastRequest() != null && this.nativeMediaData.getVastRequest().getVastAd() != null) {
            fireUrls(this.nativeMediaData.getVastRequest().getVastAd().getImpressionUrlList());
        }
    }

    /* access modifiers changed from: private */
    public void processEvent(TrackingEvent trackingEvent) {
        NativeInteractor nativeInteractor2;
        NativeMediaPrivateData nativeMediaPrivateData = this.nativeMediaData;
        if (!(nativeMediaPrivateData == null || nativeMediaPrivateData.getVastRequest() == null || this.nativeMediaData.getVastRequest().getVastAd() == null)) {
            fireUrls(this.nativeMediaData.getVastRequest().getVastAd().getTrackingEventListMap().get(trackingEvent));
        }
        if (trackingEvent == TrackingEvent.complete && (nativeInteractor2 = this.nativeInteractor) != null) {
            nativeInteractor2.dispatchVideoPlayFinished();
        }
    }

    private void fireUrls(List<String> list) {
        if (list != null) {
            for (String httpGetURL : list) {
                Utils.httpGetURL(httpGetURL, NativeNetworkExecutor.getInstance());
            }
        }
    }

    private void processErrorEvent() {
        NativeMediaPrivateData nativeMediaPrivateData = this.nativeMediaData;
        if (nativeMediaPrivateData != null && nativeMediaPrivateData.getVastRequest() != null) {
            this.nativeMediaData.getVastRequest().sendError(TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE);
        }
    }

    public void videoPlayerActivityClosed(int i, boolean z) {
        Logger.log(String.format("MediaView videoPlayerActivityClosed, position: %s, finished: %s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)}));
        if (z) {
            try {
                videoFinished();
            } catch (Exception e2) {
                Logger.log((Throwable) e2);
            }
        } else if (isMediaPlayerAvailable()) {
            this.mediaPlayer.seekTo(i);
        }
        listener = null;
    }
}
