package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgmo {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;
    /* access modifiers changed from: private */
    public final Map zzc;
    /* access modifiers changed from: private */
    public final Map zzd;

    /* synthetic */ zzgmo(zzgmi zzgmi, zzgmn zzgmn) {
        this.zza = new HashMap(zzgmi.zza);
        this.zzb = new HashMap(zzgmi.zzb);
        this.zzc = new HashMap(zzgmi.zzc);
        this.zzd = new HashMap(zzgmi.zzd);
    }

    public final zzggf zza(zzgmh zzgmh, zzghn zzghn) throws GeneralSecurityException {
        zzgmk zzgmk = new zzgmk(zzgmh.getClass(), zzgmh.zzd(), (zzgmj) null);
        if (this.zzb.containsKey(zzgmk)) {
            return ((zzglb) this.zzb.get(zzgmk)).zza(zzgmh, zzghn);
        }
        String obj = zzgmk.toString();
        throw new GeneralSecurityException("No Key Parser for requested key type " + obj + " available");
    }
}
