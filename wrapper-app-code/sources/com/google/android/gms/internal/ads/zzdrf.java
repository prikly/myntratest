package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzdrf implements zzbly {
    final /* synthetic */ zzdsc zza;
    final /* synthetic */ ViewGroup zzb;

    zzdrf(zzdsc zzdsc, ViewGroup viewGroup) {
        this.zza = zzdsc;
        this.zzb = viewGroup;
    }

    public final JSONObject zza() {
        return this.zza.zzo();
    }

    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    public final void zzc() {
        zzdsc zzdsc = this.zza;
        zzgau zzgau = zzdrc.zza;
        Map zzm = zzdsc.zzm();
        if (zzm != null) {
            int size = zzgau.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (zzm.get((String) zzgau.get(i)) == null) {
                    i = i2;
                } else {
                    this.zza.onClick(this.zzb);
                    return;
                }
            }
        }
    }

    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch((View) null, motionEvent);
    }
}
