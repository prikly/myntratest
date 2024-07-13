package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzghm {
    private static final Logger zza = Logger.getLogger(zzghm.class.getName());
    private static final AtomicReference zzb = new AtomicReference(new zzggn());
    private static final ConcurrentMap zzc = new ConcurrentHashMap();
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzghm() {
    }

    @Deprecated
    public static zzgfz zza(String str) throws GeneralSecurityException {
        if (str != null) {
            zzgfz zzgfz = (zzgfz) zze.get(str.toLowerCase(Locale.US));
            if (zzgfz != null) {
                return zzgfz;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase(Locale.US).startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase(Locale.US).startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkhybriddecrypt") || str.toLowerCase(Locale.US).startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkpublickeysign") || str.toLowerCase(Locale.US).startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    public static zzggg zzb(String str) throws GeneralSecurityException {
        return ((zzggn) zzb.get()).zzb(str);
    }

    public static synchronized zzgsw zzc(zzgtb zzgtb) throws GeneralSecurityException {
        zzgsw zza2;
        synchronized (zzghm.class) {
            zzggg zzb2 = zzb(zzgtb.zzg());
            if (((Boolean) zzd.get(zzgtb.zzg())).booleanValue()) {
                zza2 = zzb2.zza(zzgtb.zzf());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgtb.zzg())));
            }
        }
        return zza2;
    }

    public static synchronized zzgzn zzd(zzgtb zzgtb) throws GeneralSecurityException {
        zzgzn zzb2;
        synchronized (zzghm.class) {
            zzggg zzb3 = zzb(zzgtb.zzg());
            if (((Boolean) zzd.get(zzgtb.zzg())).booleanValue()) {
                zzb2 = zzb3.zzb(zzgtb.zzf());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgtb.zzg())));
            }
        }
        return zzb2;
    }

    public static Class zze(Class cls) {
        zzghj zzghj = (zzghj) zzf.get(cls);
        if (zzghj == null) {
            return null;
        }
        return zzghj.zza();
    }

    public static Object zzf(zzgsw zzgsw, Class cls) throws GeneralSecurityException {
        return zzg(zzgsw.zzg(), zzgsw.zzf(), cls);
    }

    public static Object zzg(String str, zzgwv zzgwv, Class cls) throws GeneralSecurityException {
        return ((zzggn) zzb.get()).zza(str, cls).zzd(zzgwv);
    }

    public static Object zzh(String str, zzgzn zzgzn, Class cls) throws GeneralSecurityException {
        return ((zzggn) zzb.get()).zza(str, cls).zze(zzgzn);
    }

    public static Object zzi(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return zzg(str, zzgwv.zzv(bArr), cls);
    }

    public static Object zzj(zzghi zzghi, Class cls) throws GeneralSecurityException {
        zzghj zzghj = (zzghj) zzf.get(cls);
        if (zzghj == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(zzghi.zzc().getName())));
        } else if (zzghj.zza().equals(zzghi.zzc())) {
            return zzghj.zzc(zzghi);
        } else {
            String obj = zzghj.zza().toString();
            String obj2 = zzghi.zzc().toString();
            throw new GeneralSecurityException("Wrong input primitive class, expected " + obj + ", got " + obj2);
        }
    }

    static synchronized Map zzk() {
        Map unmodifiableMap;
        synchronized (zzghm.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzg);
        }
        return unmodifiableMap;
    }

    public static synchronized void zzl(zzgme zzgme, zzgli zzgli, boolean z) throws GeneralSecurityException {
        synchronized (zzghm.class) {
            zzggn zzggn = new zzggn((zzggn) zzb.get());
            zzggn.zzc(zzgme, zzgli);
            String zzd2 = zzgme.zzd();
            String zzd3 = zzgli.zzd();
            zzp(zzd2, zzgme.zza().zzc(), true);
            zzp(zzd3, Collections.emptyMap(), false);
            if (!((zzggn) zzb.get()).zzf(zzd2)) {
                zzc.put(zzd2, new zzghl(zzgme));
                zzq(zzgme.zzd(), zzgme.zza().zzc());
            }
            zzd.put(zzd2, true);
            zzd.put(zzd3, false);
            zzb.set(zzggn);
        }
    }

    public static synchronized void zzn(zzgli zzgli, boolean z) throws GeneralSecurityException {
        synchronized (zzghm.class) {
            zzggn zzggn = new zzggn((zzggn) zzb.get());
            zzggn.zze(zzgli);
            String zzd2 = zzgli.zzd();
            zzp(zzd2, zzgli.zza().zzc(), true);
            if (!((zzggn) zzb.get()).zzf(zzd2)) {
                zzc.put(zzd2, new zzghl(zzgli));
                zzq(zzd2, zzgli.zza().zzc());
            }
            zzd.put(zzd2, true);
            zzb.set(zzggn);
        }
    }

    public static synchronized void zzo(zzghj zzghj) throws GeneralSecurityException {
        synchronized (zzghm.class) {
            if (zzghj != null) {
                Class zzb2 = zzghj.zzb();
                if (zzf.containsKey(zzb2)) {
                    zzghj zzghj2 = (zzghj) zzf.get(zzb2);
                    if (!zzghj.getClass().getName().equals(zzghj2.getClass().getName())) {
                        zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb2.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{zzb2.getName(), zzghj2.getClass().getName(), zzghj.getClass().getName()}));
                    }
                }
                zzf.put(zzb2, zzghj);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    private static synchronized void zzp(String str, Map map, boolean z) throws GeneralSecurityException {
        synchronized (zzghm.class) {
            if (z) {
                if (zzd.containsKey(str)) {
                    if (!((Boolean) zzd.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                }
                if (((zzggn) zzb.get()).zzf(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!zzg.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (zzg.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, com.google.android.gms.internal.ads.zzgzn] */
    private static void zzq(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzg.put((String) entry.getKey(), zzggp.zze(str, ((zzglg) entry.getValue()).zza.zzaw(), ((zzglg) entry.getValue()).zzb));
        }
    }

    public static synchronized void zzm(zzggg zzggg, boolean z) throws GeneralSecurityException {
        synchronized (zzghm.class) {
            if (zzggg != null) {
                try {
                    zzggn zzggn = new zzggn((zzggn) zzb.get());
                    zzggn.zzd(zzggg);
                    if (zzgjh.zza(1)) {
                        String zzf2 = zzggg.zzf();
                        zzp(zzf2, Collections.emptyMap(), z);
                        zzd.put(zzf2, Boolean.valueOf(z));
                        zzb.set(zzggn);
                    } else {
                        throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }
}
