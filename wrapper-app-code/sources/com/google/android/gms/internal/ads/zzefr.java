package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzefr {
    private final zzgfc zza;
    private final zzeex zzb;
    private final zzhej zzc;
    private final zzfoy zzd;
    private final Context zze;
    private final zzchu zzf;

    public zzefr(zzgfc zzgfc, zzeex zzeex, zzhej zzhej, zzfoy zzfoy, Context context, zzchu zzchu) {
        this.zza = zzgfc;
        this.zzb = zzeex;
        this.zzc = zzhej;
        this.zzd = zzfoy;
        this.zze = context;
        this.zzf = zzchu;
    }

    private final zzgfb zzh(zzccb zzccb, zzefq zzefq, zzefq zzefq2, zzgdy zzgdy) {
        zzgfb zzgfb;
        String str = zzccb.zzd;
        zzt.zzp();
        if (zzs.zzy(str)) {
            zzgfb = zzger.zzh(new zzefg(1));
        } else {
            zzgfb = zzger.zzg(zzefq.zza(zzccb), ExecutionException.class, zzefh.zza, this.zza);
        }
        return zzger.zzg(zzger.zzn(zzgei.zzv(zzgfb), zzgdy, this.zza), zzefg.class, new zzefp(this, zzefq2, zzccb, zzgdy), this.zza);
    }

    public final zzgfb zza(zzccb zzccb) {
        return zzh(zzccb, new zzefn(this.zzb), new zzefo(this), new zzefm(zzccb));
    }

    public final zzgfb zzb(JSONObject jSONObject) {
        return zzger.zzn(zzgei.zzv(zzger.zzi(jSONObject)), zzt.zzf().zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbuq.zza, zzefl.zza), this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzc(zzefq zzefq, zzccb zzccb, zzgdy zzgdy, zzefg zzefg) throws Exception {
        return zzger.zzn(zzefq.zza(zzccb), zzgdy, this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzd(zzccb zzccb) {
        return ((zzehm) this.zzc.zzb()).zzb(zzccb, Binder.getCallingUid());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zze(zzccb zzccb) {
        return this.zzb.zzc(zzccb.zzh);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzf(zzccb zzccb) {
        return ((zzehm) this.zzc.zzb()).zzi(zzccb.zzh);
    }

    public final zzgfb zzg(zzccb zzccb) {
        return zzh(zzccb, new zzefj(this), new zzefk(this), zzefi.zza);
    }
}
