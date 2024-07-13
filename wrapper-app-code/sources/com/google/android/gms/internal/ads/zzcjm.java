package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcjm {
    private final Context zza;
    private final zzcjx zzb;
    private final ViewGroup zzc;
    private zzcjl zzd;

    public zzcjm(Context context, ViewGroup viewGroup, zzcno zzcno) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcno;
        this.zzd = null;
    }

    public final zzcjl zza() {
        return this.zzd;
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcjl zzcjl = this.zzd;
        if (zzcjl != null) {
            zzcjl.zzF(i, i2, i3, i4);
        }
    }

    public final void zzc(int i, int i2, int i3, int i4, int i5, boolean z, zzcjw zzcjw, Integer num) {
        if (this.zzd == null) {
            zzbjq.zza(this.zzb.zzo().zza(), this.zzb.zzn(), "vpr2");
            Context context = this.zza;
            zzcjx zzcjx = this.zzb;
            zzcjl zzcjl = new zzcjl(context, zzcjx, i5, z, zzcjx.zzo().zza(), zzcjw, num);
            this.zzd = zzcjl;
            this.zzc.addView(zzcjl, 0, new ViewGroup.LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            this.zzd.zzF(i, i2, i3, i4);
            this.zzb.zzB(false);
        }
    }

    public final void zzd() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcjl zzcjl = this.zzd;
        if (zzcjl != null) {
            zzcjl.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zze() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcjl zzcjl = this.zzd;
        if (zzcjl != null) {
            zzcjl.zzu();
        }
    }

    public final void zzf(int i) {
        zzcjl zzcjl = this.zzd;
        if (zzcjl != null) {
            zzcjl.zzC(i);
        }
    }
}
