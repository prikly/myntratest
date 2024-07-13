package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import io.bidmachine.utils.IabUtils;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzczz extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private final Context zza;
    private View zzb;

    private zzczz(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzczz zza(Context context, View view, zzfil zzfil) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzczz zzczz = new zzczz(context);
        if (!(zzfil.zzv.isEmpty() || (resources = zzczz.zza.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
            zzfim zzfim = (zzfim) zzfil.zzv.get(0);
            zzczz.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) zzfim.zza) * displayMetrics.density), (int) (((float) zzfim.zzb) * displayMetrics.density)));
        }
        zzczz.zzb = view;
        zzczz.addView(view);
        zzt.zzx();
        zzcio.zzb(zzczz, zzczz);
        zzt.zzx();
        zzcio.zza(zzczz, zzczz);
        JSONObject jSONObject = zzfil.zzaj;
        RelativeLayout relativeLayout = new RelativeLayout(zzczz.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzczz.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzczz.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzczz.addView(relativeLayout);
        return zzczz;
    }

    private final int zzb(double d2) {
        zzay.zzb();
        return zzchh.zzy(this.zza, (int) d2);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb2 = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb2, 0, zzb2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble(IabUtils.KEY_HEIGHT, 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY((float) (-iArr[1]));
    }

    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY((float) (-iArr[1]));
    }
}
