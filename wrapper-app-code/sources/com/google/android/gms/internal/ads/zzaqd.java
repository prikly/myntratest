package com.google.android.gms.internal.ads;

import android.view.View;
import com.appnext.base.a.c.d;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaqd implements zzfty {
    private final zzfsb zza;
    private final zzfss zzb;
    private final zzaqr zzc;
    private final zzaqc zzd;
    private final zzapn zze;
    private final zzaqt zzf;
    private final zzaqk zzg;

    zzaqd(zzfsb zzfsb, zzfss zzfss, zzaqr zzaqr, zzaqc zzaqc, zzapn zzapn, zzaqt zzaqt, zzaqk zzaqk) {
        this.zza = zzfsb;
        this.zzb = zzfss;
        this.zzc = zzaqr;
        this.zzd = zzaqc;
        this.zze = zzapn;
        this.zzf = zzaqt;
        this.zzg = zzaqk;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzanf zzb2 = this.zzb.zzb();
        hashMap.put("v", this.zza.zzb());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put("int", zzb2.zzh());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put(d.COLUMN_TYPE, new Throwable());
        zzaqk zzaqk = this.zzg;
        if (zzaqk != null) {
            hashMap.put("tcq", Long.valueOf(zzaqk.zzc()));
            hashMap.put("tpq", Long.valueOf(this.zzg.zzg()));
            hashMap.put("tcv", Long.valueOf(this.zzg.zzd()));
            hashMap.put("tpv", Long.valueOf(this.zzg.zzh()));
            hashMap.put("tchv", Long.valueOf(this.zzg.zzb()));
            hashMap.put("tphv", Long.valueOf(this.zzg.zzf()));
            hashMap.put("tcc", Long.valueOf(this.zzg.zza()));
            hashMap.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return hashMap;
    }

    public final Map zza() {
        Map zze2 = zze();
        zze2.put("lts", Long.valueOf(this.zzc.zza()));
        return zze2;
    }

    public final Map zzb() {
        Map zze2 = zze();
        zzanf zza2 = this.zzb.zza();
        zze2.put("gai", Boolean.valueOf(this.zza.zzd()));
        zze2.put("did", zza2.zzg());
        zze2.put("dst", Integer.valueOf(zza2.zzal() - 1));
        zze2.put("doo", Boolean.valueOf(zza2.zzai()));
        zzapn zzapn = this.zze;
        if (zzapn != null) {
            zze2.put("nt", Long.valueOf(zzapn.zza()));
        }
        zzaqt zzaqt = this.zzf;
        if (zzaqt != null) {
            zze2.put("vs", Long.valueOf(zzaqt.zzc()));
            zze2.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze2;
    }

    public final Map zzc() {
        return zze();
    }

    /* access modifiers changed from: package-private */
    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
