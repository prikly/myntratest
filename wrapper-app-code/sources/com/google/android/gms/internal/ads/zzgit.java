package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgit extends zzglh {
    final /* synthetic */ zzgiu zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgit(zzgiu zzgiu, Class cls) {
        super(cls);
        this.zza = zzgiu;
    }

    public final /* bridge */ /* synthetic */ zzgzn zza(zzgzn zzgzn) throws GeneralSecurityException {
        zzgul zzgul = (zzgul) zzgzn;
        zzguh zzc = zzgui.zzc();
        zzc.zzb(0);
        zzc.zza(zzgwv.zzv(zzgvv.zza(32)));
        return (zzgui) zzc.zzak();
    }

    public final /* synthetic */ zzgzn zzb(zzgwv zzgwv) throws zzgyp {
        return zzgul.zzd(zzgwv, zzgxp.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new zzglg(zzgul.zzc(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new zzglg(zzgul.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgzn zzgzn) throws GeneralSecurityException {
        zzgul zzgul = (zzgul) zzgzn;
    }
}
