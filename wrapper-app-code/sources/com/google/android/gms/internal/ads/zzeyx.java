package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeyx implements zzezm {
    private final zzcft zza;
    private final zzgfc zzb;
    private final Context zzc;

    public zzeyx(zzcft zzcft, zzgfc zzgfc, Context context) {
        this.zza = zzcft;
        this.zzb = zzgfc;
        this.zzc = context;
    }

    public final int zza() {
        return 34;
    }

    public final zzgfb zzb() {
        return this.zzb.zzb(new zzeyw(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeyy zzc() throws Exception {
        String str;
        String str2;
        String str3;
        if (!this.zza.zzu(this.zzc)) {
            return new zzeyy((String) null, (String) null, (String) null, (String) null, (Long) null);
        }
        String zze = this.zza.zze(this.zzc);
        String str4 = zze == null ? "" : zze;
        String zzc2 = this.zza.zzc(this.zzc);
        if (zzc2 == null) {
            str = "";
        } else {
            str = zzc2;
        }
        String zza2 = this.zza.zza(this.zzc);
        if (zza2 == null) {
            str2 = "";
        } else {
            str2 = zza2;
        }
        String zzb2 = this.zza.zzb(this.zzc);
        if (zzb2 == null) {
            str3 = "";
        } else {
            str3 = zzb2;
        }
        return new zzeyy(str4, str, str2, str3, "TIME_OUT".equals(str) ? (Long) zzba.zzc().zzb(zzbjj.zzad) : null);
    }
}
