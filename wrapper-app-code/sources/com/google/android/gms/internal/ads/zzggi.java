package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
class zzggi implements zzggg {
    private final zzgli zza;
    private final Class zzb;

    public zzggi(zzgli zzgli, Class cls) {
        if (zzgli.zzl().contains(cls) || Void.class.equals(cls)) {
            this.zza = zzgli;
            this.zzb = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{zzgli.toString(), cls.getName()}));
    }

    private final zzggh zzg() {
        return new zzggh(this.zza.zza());
    }

    private final Object zzh(zzgzn zzgzn) throws GeneralSecurityException {
        if (!Void.class.equals(this.zzb)) {
            this.zza.zze(zzgzn);
            return this.zza.zzk(zzgzn, this.zzb);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final zzgsw zza(zzgwv zzgwv) throws GeneralSecurityException {
        try {
            zzgzn zza2 = zzg().zza(zzgwv);
            zzgst zza3 = zzgsw.zza();
            zza3.zzb(this.zza.zzd());
            zza3.zzc(zza2.zzat());
            zza3.zza(this.zza.zzb());
            return (zzgsw) zza3.zzak();
        } catch (zzgyp e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    public final zzgzn zzb(zzgwv zzgwv) throws GeneralSecurityException {
        try {
            return zzg().zza(zzgwv);
        } catch (zzgyp e2) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zza().zzg().getName())), e2);
        }
    }

    public final Class zzc() {
        return this.zzb;
    }

    public final Object zzd(zzgwv zzgwv) throws GeneralSecurityException {
        try {
            return zzh(this.zza.zzc(zzgwv));
        } catch (zzgyp e2) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zzj().getName())), e2);
        }
    }

    public final Object zze(zzgzn zzgzn) throws GeneralSecurityException {
        String concat = "Expected proto of type ".concat(String.valueOf(this.zza.zzj().getName()));
        if (this.zza.zzj().isInstance(zzgzn)) {
            return zzh(zzgzn);
        }
        throw new GeneralSecurityException(concat);
    }

    public final String zzf() {
        return this.zza.zzd();
    }
}
