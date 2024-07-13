package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdzg {
    final /* synthetic */ zzdzh zza;
    private final Map zzb = new ConcurrentHashMap();

    zzdzg(zzdzh zzdzh) {
        this.zza = zzdzh;
    }

    public final zzdzg zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdzg zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdzg zzd(zzfil zzfil) {
        this.zzb.put("aai", zzfil.zzx);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzgv)).booleanValue()) {
            zzc("rid", zzfil.zzap);
        }
        return this;
    }

    public final zzdzg zze(zzfio zzfio) {
        this.zzb.put("gqi", zzfio.zzb);
        return this;
    }

    public final String zzf() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzg() {
        this.zza.zzb.execute(new zzdzf(this));
    }

    public final void zzh() {
        this.zza.zzb.execute(new zzdze(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        this.zza.zza.zze(this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj() {
        this.zza.zza.zzd(this.zzb);
    }
}
