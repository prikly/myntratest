package com.appodeal.ads;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.appodeal.ads.utils.Log;
import com.explorestack.iab.utils.Assets;
import com.explorestack.iab.vast.view.CircleCountdownView;

public class VideoPlayerActivity extends Activity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f16154d = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f16155a;

    /* renamed from: b  reason: collision with root package name */
    public VideoView f16156b;

    /* renamed from: c  reason: collision with root package name */
    public a f16157c;

    public interface a {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        try {
            getWindow().clearFlags(128);
        } catch (Exception e2) {
            Log.log(e2);
        }
    }

    public final void a() {
        h5.f16458a.post(new Runnable() {
            public final void run() {
                VideoPlayerActivity.this.b();
            }
        });
        finish();
    }

    public final void onBackPressed() {
        if (this.f16157c != null) {
            ((g2) this.f16157c).a(this.f16156b.isPlaying() ? this.f16156b.getCurrentPosition() : 0, false);
        }
        a();
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        a aVar = this.f16157c;
        if (aVar != null) {
            ((g2) aVar).a(0, true);
        }
        a();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.appodeal.ads.fileUri");
        int intExtra = intent.getIntExtra("com.appodeal.ads.seekTo", 0);
        this.f16155a = intExtra;
        Log.log("VideoPlayerActivity", "Start", String.format("position: %s", new Object[]{Integer.valueOf(intExtra)}));
        if (stringExtra != null) {
            this.f16157c = g2.y;
            RelativeLayout relativeLayout = new RelativeLayout(this);
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f16156b = new VideoView(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.f16156b.setLayoutParams(layoutParams);
            this.f16156b.setOnCompletionListener(this);
            this.f16156b.setOnPreparedListener(this);
            this.f16156b.setVideoPath(stringExtra);
            relativeLayout.addView(this.f16156b);
            CircleCountdownView circleCountdownView = new CircleCountdownView(this);
            circleCountdownView.setColors(Assets.mainAssetsColor, Assets.backgroundColor);
            int a2 = f1.a(this, 24.0f);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a2, a2);
            layoutParams2.addRule(11, -1);
            layoutParams2.addRule(10, -1);
            int a3 = f1.a(this, 8.0f);
            layoutParams2.setMargins(a3, a3, a3, a3);
            circleCountdownView.setImage(Assets.getBitmapFromBase64("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAYAAADnRuK4AAACY0lEQVR4Ae3aAWRbURTH4YNiKIqggKEYCiiKYQQABQAMARRBAVAADEEBUAAEAADBAMMwBADFADAURXYQoZdoOLie+338PQK4fnmJ5wUAAAAAAAAAAAAAAAAAAAAAAHACrnJ3uWVunpvFuM5zX3Pf99fz4KiL3HNu1+w195A7i3Gc5R5zb81ZvO0/b86CWe6ljafZZpBv4GXu9wdn8UtE761zuxP2sxrRBOLZnngWjznSbXs4g0Z0Sjztz9lFEPe5XT2iIeJp9y2IVW5Xj2iMeJotguYOVIlogHiazYO4ye3qEQ0VT/MfiPUAEZXjafYjDpjl/k41og7x/Ml9inf4MsWIOsSzzV0G40QkHhGJR0Ti6U9E4hGRePoTkXhEJJ7+RCQeEYmnPxGJR0TiqROReOpEJJ46EYmnTkTiqROReMpEJJ4CEYmnQETiKRGReEpEJJ4kIvH0JyLxiEg8/YlIPCIST38iEo+IxEP9ZbA+L6UhHhGJR0T9iUdE4hFRf+IRkXhE1It4RNQQz7bysFFE4rksPLEWkXj2RFQgHhGViUdEZeIRUZl4RFQmHhGViUdEZeIRkXjqRCQeEXUnHhGJR0T9iUdE4hFRf+IRkXhEJJ5uRCQeEYlHROM47x/PpCLa5M7igKf+8Uwuoodc4rp/PJOM6DU3i2DRP57JRjSPYNU/nslGtIxgOXA81YjuIpgPHk8loqtcYjNqPIWInuOAz7l/o8VTiOgldxENER2/Ez0N9vR1llsfOYt1bhZHMc8tc6vcIncd47rJ3edW++ttAAAAAAAAAAAAAAAAAAAAAAAAfOA/5Zwc/aYfb7AAAAAASUVORK5CYII="));
            circleCountdownView.setLayoutParams(layoutParams2);
            circleCountdownView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    VideoPlayerActivity.this.a(view);
                }
            });
            relativeLayout.addView(circleCountdownView);
            setContentView(relativeLayout);
        }
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        a();
        return false;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        VideoView videoView = this.f16156b;
        if (videoView != null && videoView.canSeekForward()) {
            this.f16156b.seekTo(this.f16155a);
            this.f16156b.start();
        }
    }

    /* access modifiers changed from: private */
    public void a(View view) {
        if (this.f16157c != null) {
            ((g2) this.f16157c).a(this.f16156b.isPlaying() ? this.f16156b.getCurrentPosition() : 0, false);
        }
        a();
    }
}
