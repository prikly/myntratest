package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbtz extends zzcin {
    private final Object zza = new Object();
    /* access modifiers changed from: private */
    public final zzbue zzb;
    private boolean zzc;

    public zzbtz(zzbue zzbue) {
        this.zzb = zzbue;
    }

    public final void zzb() {
        synchronized (this.zza) {
            if (!this.zzc) {
                this.zzc = true;
                zzi(new zzbtw(this), new zzcij());
                zzi(new zzbtx(this), new zzbty(this));
            }
        }
    }
}
