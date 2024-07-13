package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzggn {
    private static final Logger zza = Logger.getLogger(zzggn.class.getName());
    private final ConcurrentMap zzb;

    zzggn() {
        this.zzb = new ConcurrentHashMap();
    }

    private final synchronized zzggm zzg(String str) throws GeneralSecurityException {
        if (this.zzb.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzggm) this.zzb.get(str);
    }

    private final synchronized void zzh(zzggm zzggm, boolean z) throws GeneralSecurityException {
        String zzf = zzggm.zzb().zzf();
        zzggm zzggm2 = (zzggm) this.zzb.get(zzf);
        if (zzggm2 != null) {
            if (!zzggm2.zzc().equals(zzggm.zzc())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(zzf));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{zzf, zzggm2.zzc().getName(), zzggm.zzc().getName()}));
            }
        }
        if (!z) {
            this.zzb.putIfAbsent(zzf, zzggm);
        } else {
            this.zzb.put(zzf, zzggm);
        }
    }

    /* access modifiers changed from: package-private */
    public final zzggg zza(String str, Class cls) throws GeneralSecurityException {
        zzggm zzg = zzg(str);
        if (zzg.zze().contains(cls)) {
            return zzg.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzg.zzc());
        Set<Class> zze = zzg.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : zze) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2);
    }

    /* access modifiers changed from: package-private */
    public final zzggg zzb(String str) throws GeneralSecurityException {
        return zzg(str).zzb();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzc(zzgme zzgme, zzgli zzgli) throws GeneralSecurityException {
        Class zzd;
        int zzf = zzgli.zzf();
        if (!zzgjh.zza(1)) {
            String valueOf = String.valueOf(zzgme.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (zzgjh.zza(zzf)) {
            String zzd2 = zzgme.zzd();
            String zzd3 = zzgli.zzd();
            if (!(!this.zzb.containsKey(zzd2) || ((zzggm) this.zzb.get(zzd2)).zzd() == null || (zzd = ((zzggm) this.zzb.get(zzd2)).zzd()) == null)) {
                if (!zzd.getName().equals(zzgli.getClass().getName())) {
                    Logger logger = zza;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + zzd2 + " with inconsistent public key type " + zzd3);
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{zzgme.getClass().getName(), zzd.getName(), zzgli.getClass().getName()}));
                }
            }
            zzh(new zzggl(zzgme, zzgli), true);
            zzh(new zzggk(zzgli), false);
        } else {
            String valueOf2 = String.valueOf(zzgli.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzd(zzggg zzggg) throws GeneralSecurityException {
        if (zzgjh.zza(1)) {
            zzh(new zzggj(zzggg), false);
        } else {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zze(zzgli zzgli) throws GeneralSecurityException {
        if (zzgjh.zza(zzgli.zzf())) {
            zzh(new zzggk(zzgli), false);
        } else {
            String valueOf = String.valueOf(zzgli.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf(String str) {
        return this.zzb.containsKey(str);
    }

    zzggn(zzggn zzggn) {
        this.zzb = new ConcurrentHashMap(zzggn.zzb);
    }
}
