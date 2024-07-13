package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzakk {
    public final Object zza;
    public final zzajn zzb;
    public final zzakn zzc;
    public boolean zzd;

    private zzakk(zzakn zzakn) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzakn;
    }

    private zzakk(Object obj, zzajn zzajn) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzajn;
        this.zzc = null;
    }

    public static zzakk zza(zzakn zzakn) {
        return new zzakk(zzakn);
    }

    public static zzakk zzb(Object obj, zzajn zzajn) {
        return new zzakk(obj, zzajn);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
