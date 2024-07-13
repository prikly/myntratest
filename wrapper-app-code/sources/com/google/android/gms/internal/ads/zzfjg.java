package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfjg {
    public final zzfl zza;
    public final zzbsl zzb;
    public final zzesb zzc;
    public final zzl zzd;
    public final zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzblz zzi;
    public final zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final zzcb zzn;
    public final zzfit zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final zzcf zzr;

    /* synthetic */ zzfjg(zzfje zzfje, zzfjf zzfjf) {
        zzfl zzfl;
        zzblz zzblz;
        this.zze = zzfje.zzb;
        this.zzf = zzfje.zzc;
        this.zzr = zzfje.zzs;
        int i = zzfje.zza.zza;
        long j = zzfje.zza.zzb;
        Bundle bundle = zzfje.zza.zzc;
        int i2 = zzfje.zza.zzd;
        List list = zzfje.zza.zze;
        boolean z = zzfje.zza.zzf;
        int i3 = zzfje.zza.zzg;
        boolean z2 = true;
        if (!zzfje.zza.zzh && !zzfje.zze) {
            z2 = false;
        }
        this.zzd = new zzl(i, j, bundle, i2, list, z, i3, z2, zzfje.zza.zzi, zzfje.zza.zzj, zzfje.zza.zzk, zzfje.zza.zzl, zzfje.zza.zzm, zzfje.zza.zzn, zzfje.zza.zzo, zzfje.zza.zzp, zzfje.zza.zzq, zzfje.zza.zzr, zzfje.zza.zzs, zzfje.zza.zzt, zzfje.zza.zzu, zzfje.zza.zzv, zzs.zza(zzfje.zza.zzw), zzfje.zza.zzx);
        if (zzfje.zzd != null) {
            zzfl = zzfje.zzd;
        } else {
            zzfl = zzfje.zzh != null ? zzfje.zzh.zzf : null;
        }
        this.zza = zzfl;
        this.zzg = zzfje.zzf;
        this.zzh = zzfje.zzg;
        if (zzfje.zzf == null) {
            zzblz = null;
        } else {
            zzblz = zzfje.zzh == null ? new zzblz(new NativeAdOptions.Builder().build()) : zzfje.zzh;
        }
        this.zzi = zzblz;
        this.zzj = zzfje.zzi;
        this.zzk = zzfje.zzm;
        this.zzl = zzfje.zzj;
        this.zzm = zzfje.zzk;
        this.zzn = zzfje.zzl;
        this.zzb = zzfje.zzn;
        this.zzo = new zzfit(zzfje.zzo, (zzfis) null);
        this.zzp = zzfje.zzp;
        this.zzc = zzfje.zzq;
        this.zzq = zzfje.zzr;
    }

    public final zzboc zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        if (publisherAdViewOptions != null) {
            return publisherAdViewOptions.zzb();
        }
        return this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) zzba.zzc().zzb(zzbjj.zzcH));
    }
}
