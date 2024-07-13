package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcno;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzh {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzh(zzcno zzcno) throws zzf {
        this.zzb = zzcno.getLayoutParams();
        ViewParent parent = zzcno.getParent();
        this.zzd = zzcno.zzG();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzf("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(zzcno.zzH());
        this.zzc.removeView(zzcno.zzH());
        zzcno.zzap(true);
    }
}
