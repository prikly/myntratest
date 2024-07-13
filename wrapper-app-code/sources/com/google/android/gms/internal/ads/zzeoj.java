package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeoj {
    /* access modifiers changed from: private */
    public final Clock zza;
    /* access modifiers changed from: private */
    public final zzeok zzb;
    /* access modifiers changed from: private */
    public final zzfpo zzc;
    private final List zzd = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */
    public final boolean zze;
    /* access modifiers changed from: private */
    public final zzekv zzf;

    public zzeoj(Clock clock, zzeok zzeok, zzekv zzekv, zzfpo zzfpo) {
        this.zza = clock;
        this.zzb = zzeok;
        this.zze = ((Boolean) zzba.zzc().zzb(zzbjj.zzgn)).booleanValue();
        this.zzf = zzekv;
        this.zzc = zzfpo;
    }

    static /* bridge */ /* synthetic */ void zzg(zzeoj zzeoj, String str, int i, long j, String str2, Integer num) {
        String str3 = str + "." + i + "." + j;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + str2;
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzbv)).booleanValue() && num != null && !TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + num;
        }
        zzeoj.zzd.add(str3);
    }

    /* access modifiers changed from: package-private */
    public final zzgfb zze(zzfix zzfix, zzfil zzfil, zzgfb zzgfb, zzfpk zzfpk) {
        zzfio zzfio = zzfix.zzb.zzb;
        long elapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfil.zzx;
        if (str != null) {
            zzger.zzr(zzgfb, new zzeoi(this, elapsedRealtime, str, zzfil, zzfio, zzfpk, zzfix), zzcib.zzf);
        }
        return zzgfb;
    }

    public final String zzf() {
        return TextUtils.join("_", this.zzd);
    }
}
