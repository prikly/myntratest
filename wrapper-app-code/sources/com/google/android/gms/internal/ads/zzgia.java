package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgia extends zzglh {
    final /* synthetic */ zzgib zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgia(zzgib zzgib, Class cls) {
        super(cls);
        this.zza = zzgib;
    }

    public final /* bridge */ /* synthetic */ zzgzn zza(zzgzn zzgzn) throws GeneralSecurityException {
        zzgpv zzgpv = (zzgpv) zzgzn;
        zzgpr zzc = zzgps.zzc();
        zzc.zza(zzgwv.zzv(zzgvv.zza(zzgpv.zza())));
        zzc.zzb(zzgpv.zzf());
        zzc.zzc(0);
        return (zzgps) zzc.zzak();
    }

    public final /* synthetic */ zzgzn zzb(zzgwv zzgwv) throws zzgyp {
        return zzgpv.zze(zzgwv, zzgxp.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzgib.zzg(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzgib.zzg(16, 16, 3));
        hashMap.put("AES256_EAX", zzgib.zzg(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzgib.zzg(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgzn zzgzn) throws GeneralSecurityException {
        zzgpv zzgpv = (zzgpv) zzgzn;
        zzgvx.zza(zzgpv.zza());
        if (zzgpv.zzf().zza() != 12 && zzgpv.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
