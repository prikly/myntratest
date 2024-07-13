package com.appodeal.ads;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.appodeal.ads.utils.Log;

public final class b2 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g2 f16302a;

    public b2(g2 g2Var) {
        this.f16302a = g2Var;
    }

    public final void onClick(View view) {
        Uri uri = this.f16302a.f16421a.q;
        if (uri == null) {
            Log.log(g2.x, "Video", "click url is absent");
            return;
        }
        Log.log(g2.x, "Video", "clicked");
        g2 g2Var = this.f16302a;
        g2.y = g2Var;
        g2Var.s = true;
        int i = 0;
        if (g2Var.c() && this.f16302a.f16427g.isPlaying()) {
            i = this.f16302a.f16427g.getCurrentPosition();
        }
        this.f16302a.d();
        Context context = this.f16302a.getContext();
        String path = uri.getPath();
        int i2 = VideoPlayerActivity.f16154d;
        Intent intent = new Intent(context, VideoPlayerActivity.class);
        intent.putExtra("com.appodeal.ads.fileUri", path);
        intent.putExtra("com.appodeal.ads.seekTo", i);
        this.f16302a.getContext().startActivity(intent);
    }
}
