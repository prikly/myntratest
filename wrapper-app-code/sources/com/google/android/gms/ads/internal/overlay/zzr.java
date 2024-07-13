package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzchh;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzr extends FrameLayout implements View.OnClickListener {
    /* access modifiers changed from: private */
    public final ImageButton zza;
    private final zzad zzb;

    public zzr(Context context, zzq zzq, zzad zzad) {
        super(context);
        this.zzb = zzad;
        setOnClickListener(this);
        this.zza = new ImageButton(context);
        zzc();
        this.zza.setBackgroundColor(0);
        this.zza.setOnClickListener(this);
        ImageButton imageButton = this.zza;
        zzay.zzb();
        int zzy = zzchh.zzy(context, zzq.zza);
        zzay.zzb();
        int zzy2 = zzchh.zzy(context, 0);
        zzay.zzb();
        int zzy3 = zzchh.zzy(context, zzq.zzb);
        zzay.zzb();
        imageButton.setPadding(zzy, zzy2, zzy3, zzchh.zzy(context, zzq.zzc));
        this.zza.setContentDescription("Interstitial close button");
        ImageButton imageButton2 = this.zza;
        zzay.zzb();
        int zzy4 = zzchh.zzy(context, zzq.zzd + zzq.zza + zzq.zzb);
        zzay.zzb();
        addView(imageButton2, new FrameLayout.LayoutParams(zzy4, zzchh.zzy(context, zzq.zzd + zzq.zzc), 17));
        long longValue = ((Long) zzba.zzc().zzb(zzbjj.zzaW)).longValue();
        if (longValue > 0) {
            zzp zzp = ((Boolean) zzba.zzc().zzb(zzbjj.zzaX)).booleanValue() ? new zzp(this) : null;
            this.zza.setAlpha(0.0f);
            this.zza.animate().alpha(1.0f).setDuration(longValue).setListener(zzp);
        }
    }

    private final void zzc() {
        String str = (String) zzba.zzc().zzb(zzbjj.zzaV);
        if (!PlatformVersion.isAtLeastLollipop() || TextUtils.isEmpty(str) || RewardedVideo.VIDEO_MODE_DEFAULT.equals(str)) {
            this.zza.setImageResource(17301527);
            return;
        }
        Resources zzd = zzt.zzo().zzd();
        if (zzd != null) {
            Drawable drawable = null;
            try {
                if ("white".equals(str)) {
                    drawable = zzd.getDrawable(R.drawable.admob_close_button_white_circle_black_cross);
                } else if ("black".equals(str)) {
                    drawable = zzd.getDrawable(R.drawable.admob_close_button_black_circle_white_cross);
                }
            } catch (Resources.NotFoundException unused) {
                zze.zze("Close button resource not found, falling back to default.");
            }
            if (drawable == null) {
                this.zza.setImageResource(17301527);
                return;
            }
            this.zza.setImageDrawable(drawable);
            this.zza.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        this.zza.setImageResource(17301527);
    }

    public final void onClick(View view) {
        zzad zzad = this.zzb;
        if (zzad != null) {
            zzad.zzbL();
        }
    }

    public final void zzb(boolean z) {
        if (z) {
            this.zza.setVisibility(8);
            if (((Long) zzba.zzc().zzb(zzbjj.zzaW)).longValue() > 0) {
                this.zza.animate().cancel();
                this.zza.clearAnimation();
                return;
            }
            return;
        }
        this.zza.setVisibility(0);
    }
}
