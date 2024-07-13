package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdwi implements View.OnTouchListener {
    public final /* synthetic */ zzdwo zza;

    public /* synthetic */ zzdwi(zzdwo zzdwo) {
        this.zza = zzdwo;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.zza.zzh(view, motionEvent);
        return false;
    }
}
