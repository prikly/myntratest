package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgij extends zzglh {
    final /* synthetic */ zzgik zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgij(zzgik zzgik, Class cls) {
        super(cls);
        this.zza = zzgik;
    }

    public final /* bridge */ /* synthetic */ zzgzn zza(zzgzn zzgzn) throws GeneralSecurityException {
        zzgqw zzgqw = (zzgqw) zzgzn;
        zzgqs zzc = zzgqt.zzc();
        zzc.zzb(0);
        zzc.zza(zzgwv.zzv(zzgvv.zza(32)));
        return (zzgqt) zzc.zzak();
    }

    public final /* synthetic */ zzgzn zzb(zzgwv zzgwv) throws zzgyp {
        return zzgqw.zzd(zzgwv, zzgxp.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzglg(zzgqw.zzc(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzglg(zzgqw.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgzn zzgzn) throws GeneralSecurityException {
        zzgqw zzgqw = (zzgqw) zzgzn;
    }
}
