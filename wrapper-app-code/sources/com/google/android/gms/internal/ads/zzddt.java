package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzddt {
    private final zzfnj zza;
    private final zzchu zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhej zzg;
    private final String zzh;
    private final zzezp zzi;
    private final zzg zzj;
    private final zzfjg zzk;

    public zzddt(zzfnj zzfnj, zzchu zzchu, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzhej zzhej, zzg zzg2, String str2, zzezp zzezp, zzfjg zzfjg) {
        this.zza = zzfnj;
        this.zzb = zzchu;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhej;
        this.zzh = str2;
        this.zzi = zzezp;
        this.zzj = zzg2;
        this.zzk = zzfjg;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzccb zza(zzgfb zzgfb) throws Exception {
        return new zzccb((Bundle) zzgfb.get(), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, (String) ((zzgfb) this.zzg.zzb()).get(), this.zzh, (zzfkz) null, (String) null, ((Boolean) zzba.zzc().zzb(zzbjj.zzgD)).booleanValue() && this.zzj.zzP(), this.zzk.zzb());
    }

    public final zzgfb zzb() {
        zzfnj zzfnj = this.zza;
        return zzfmt.zzc(this.zzi.zza(new Bundle()), zzfnd.SIGNALS, zzfnj).zza();
    }

    public final zzgfb zzc() {
        zzgfb zzb2 = zzb();
        return this.zza.zza(zzfnd.REQUEST_PARCEL, zzb2, (zzgfb) this.zzg.zzb()).zza(new zzdds(this, zzb2)).zza();
    }
}
