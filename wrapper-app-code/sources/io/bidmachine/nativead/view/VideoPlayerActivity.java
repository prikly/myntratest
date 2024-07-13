package io.bidmachine.nativead.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.explorestack.iab.utils.Assets;
import com.explorestack.iab.vast.view.CircleCountdownView;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;

public class VideoPlayerActivity extends Activity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    private static final String FILE_URI = "io.bidmachine.fileUri";
    private static final String SEEK_TO = "io.bidmachine.seekTo";
    private VideoPlayerActivityListener listener;
    private int seekTo;
    private VideoView videoView;

    interface VideoPlayerActivityListener {
        void videoPlayerActivityClosed(int i, boolean z);
    }

    public static Intent getIntent(Context context, String str, int i) {
        Intent intent = new Intent(context, VideoPlayerActivity.class);
        intent.putExtra(FILE_URI, str);
        intent.putExtra(SEEK_TO, i);
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(FILE_URI);
        int intExtra = intent.getIntExtra(SEEK_TO, 0);
        this.seekTo = intExtra;
        Logger.log(String.format("VideoPlayerActivity started, position: %s", new Object[]{Integer.valueOf(intExtra)}));
        if (stringExtra != null) {
            this.listener = MediaView.listener;
            RelativeLayout relativeLayout = new RelativeLayout(this);
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.videoView = new VideoView(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.videoView.setLayoutParams(layoutParams);
            this.videoView.setOnCompletionListener(this);
            this.videoView.setOnPreparedListener(this);
            this.videoView.setVideoPath(stringExtra);
            relativeLayout.addView(this.videoView);
            float screenDensity = Utils.getScreenDensity(this);
            int round = Math.round(24.0f * screenDensity);
            int round2 = Math.round(screenDensity * 8.0f);
            CircleCountdownView circleCountdownView = new CircleCountdownView(this);
            circleCountdownView.setColors(Assets.mainAssetsColor, Assets.backgroundColor);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(round, round);
            layoutParams2.addRule(11, -1);
            layoutParams2.addRule(10, -1);
            layoutParams2.setMargins(round2, round2, round2, round2);
            circleCountdownView.setImage(Assets.getBitmapFromBase64("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAYAAADnRuK4AAACY0lEQVR4Ae3aAWRbURTH4YNiKIqggKEYCiiKYQQABQAMARRBAVAADEEBUAAEAADBAMMwBADFADAURXYQoZdoOLie+338PQK4fnmJ5wUAAAAAAAAAAAAAAAAAAAAAAHACrnJ3uWVunpvFuM5zX3Pf99fz4KiL3HNu1+w195A7i3Gc5R5zb81ZvO0/b86CWe6ljafZZpBv4GXu9wdn8UtE761zuxP2sxrRBOLZnngWjznSbXs4g0Z0Sjztz9lFEPe5XT2iIeJp9y2IVW5Xj2iMeJotguYOVIlogHiazYO4ye3qEQ0VT/MfiPUAEZXjafYjDpjl/k41og7x/Ml9inf4MsWIOsSzzV0G40QkHhGJR0Ti6U9E4hGRePoTkXhEJJ7+RCQeEYmnPxGJR0TiqROReOpEJJ46EYmnTkTiqROReMpEJJ4CEYmnQETiKRGReEpEJJ4kIvH0JyLxiEg8/YlIPCIST38iEo+IxEP9ZbA+L6UhHhGJR0T9iUdE4hFRf+IRkXhE1It4RNQQz7bysFFE4rksPLEWkXj2RFQgHhGViUdEZeIRUZl4RFQmHhGViUdEZeIRkXjqRCQeEXUnHhGJR0T9iUdE4hFRf+IRkXhEJJ5uRCQeEYlHROM47x/PpCLa5M7igKf+8Uwuoodc4rp/PJOM6DU3i2DRP57JRjSPYNU/nslGtIxgOXA81YjuIpgPHk8loqtcYjNqPIWInuOAz7l/o8VTiOgldxENER2/Ez0N9vR1llsfOYt1bhZHMc8tc6vcIncd47rJ3edW++ttAAAAAAAAAAAAAAAAAAAAAAAAfOA/5Zwc/aYfb7AAAAAASUVORK5CYII="));
            circleCountdownView.setLayoutParams(layoutParams2);
            circleCountdownView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    VideoPlayerActivity.this.closeClicked();
                }
            });
            relativeLayout.addView(circleCountdownView);
            setContentView(relativeLayout);
        }
    }

    private void finishActivity() {
        runOnUiThread(new Runnable() {
            public void run() {
                try {
                    VideoPlayerActivity.this.getWindow().clearFlags(128);
                } catch (Exception e2) {
                    Logger.log((Throwable) e2);
                }
            }
        });
        finish();
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        VideoPlayerActivityListener videoPlayerActivityListener = this.listener;
        if (videoPlayerActivityListener != null) {
            videoPlayerActivityListener.videoPlayerActivityClosed(0, true);
        }
        finishActivity();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        finishActivity();
        return false;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        VideoView videoView2 = this.videoView;
        if (videoView2 != null && videoView2.canSeekForward()) {
            this.videoView.seekTo(this.seekTo);
            this.videoView.start();
        }
    }

    public void onBackPressed() {
        closeClicked();
    }

    /* access modifiers changed from: private */
    public void closeClicked() {
        if (this.listener != null) {
            this.listener.videoPlayerActivityClosed(this.videoView.isPlaying() ? this.videoView.getCurrentPosition() : 0, false);
        }
        finishActivity();
    }
}
