package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfqi {
    private static final zzfqi zza = new zzfqi();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfqi() {
    }

    public static zzfqi zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfpx zzfpx) {
        this.zzb.add(zzfpx);
    }

    public final void zze(zzfpx zzfpx) {
        boolean zzg = zzg();
        this.zzb.remove(zzfpx);
        this.zzc.remove(zzfpx);
        if (zzg && !zzg()) {
            zzfqo.zzb().zzf();
        }
    }

    public final void zzf(zzfpx zzfpx) {
        boolean zzg = zzg();
        this.zzc.add(zzfpx);
        if (!zzg) {
            zzfqo.zzb().zze();
        }
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
