package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcfa extends zzcfu {
    private final Clock zzb;
    private final zzcfa zzc = this;
    private final zzhfc zzd;
    private final zzhfc zze;
    private final zzhfc zzf;
    private final zzhfc zzg;
    private final zzhfc zzh;
    private final zzhfc zzi;
    private final zzhfc zzj;
    private final zzhfc zzk;

    /* synthetic */ zzcfa(Context context, Clock clock, zzg zzg2, zzcft zzcft, zzcez zzcez) {
        this.zzb = clock;
        this.zzd = zzheq.zza(context);
        this.zze = zzheq.zza(zzg2);
        zzhep zza = zzheq.zza(zzcft);
        this.zzf = zza;
        this.zzg = zzheo.zzc(new zzces(this.zzd, this.zze, zza));
        zzhep zza2 = zzheq.zza(clock);
        this.zzh = zza2;
        zzhfc zzc2 = zzheo.zzc(new zzceu(zza2, this.zze, this.zzf));
        this.zzi = zzc2;
        zzcew zzcew = new zzcew(this.zzh, zzc2);
        this.zzj = zzcew;
        this.zzk = zzheo.zzc(new zzcfz(this.zzd, zzcew));
    }

    /* access modifiers changed from: package-private */
    public final zzcer zza() {
        return (zzcer) this.zzg.zzb();
    }

    /* access modifiers changed from: package-private */
    public final zzcev zzb() {
        return new zzcev(this.zzb, (zzcet) this.zzi.zzb());
    }

    /* access modifiers changed from: package-private */
    public final zzcfy zzc() {
        return (zzcfy) this.zzk.zzb();
    }
}
