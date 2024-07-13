package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgmi {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;
    /* access modifiers changed from: private */
    public final Map zzc;
    /* access modifiers changed from: private */
    public final Map zzd;

    public zzgmi() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgmi zza(zzglb zzglb) throws GeneralSecurityException {
        zzgmk zzgmk = new zzgmk(zzglb.zzd(), zzglb.zzc(), (zzgmj) null);
        if (this.zzb.containsKey(zzgmk)) {
            zzglb zzglb2 = (zzglb) this.zzb.get(zzgmk);
            if (!zzglb2.equals(zzglb) || !zzglb.equals(zzglb2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgmk.toString()));
            }
        } else {
            this.zzb.put(zzgmk, zzglb);
        }
        return this;
    }

    public final zzgmi zzb(zzglf zzglf) throws GeneralSecurityException {
        zzgmm zzgmm = new zzgmm(zzglf.zzb(), zzglf.zzc(), (zzgml) null);
        if (this.zza.containsKey(zzgmm)) {
            zzglf zzglf2 = (zzglf) this.zza.get(zzgmm);
            if (!zzglf2.equals(zzglf) || !zzglf.equals(zzglf2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgmm.toString()));
            }
        } else {
            this.zza.put(zzgmm, zzglf);
        }
        return this;
    }

    public final zzgmi zzc(zzgly zzgly) throws GeneralSecurityException {
        zzgmk zzgmk = new zzgmk(zzgly.zzc(), zzgly.zzb(), (zzgmj) null);
        if (this.zzd.containsKey(zzgmk)) {
            zzgly zzgly2 = (zzgly) this.zzd.get(zzgmk);
            if (!zzgly2.equals(zzgly) || !zzgly.equals(zzgly2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgmk.toString()));
            }
        } else {
            this.zzd.put(zzgmk, zzgly);
        }
        return this;
    }

    public final zzgmi zzd(zzgmc zzgmc) throws GeneralSecurityException {
        zzgmm zzgmm = new zzgmm(zzgmc.zzb(), zzgmc.zzc(), (zzgml) null);
        if (this.zzc.containsKey(zzgmm)) {
            zzgmc zzgmc2 = (zzgmc) this.zzc.get(zzgmm);
            if (!zzgmc2.equals(zzgmc) || !zzgmc.equals(zzgmc2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgmm.toString()));
            }
        } else {
            this.zzc.put(zzgmm, zzgmc);
        }
        return this;
    }

    public zzgmi(zzgmo zzgmo) {
        this.zza = new HashMap(zzgmo.zza);
        this.zzb = new HashMap(zzgmo.zzb);
        this.zzc = new HashMap(zzgmo.zzc);
        this.zzd = new HashMap(zzgmo.zzd);
    }
}
