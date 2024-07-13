package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzghd {
    private final Class zza;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private zzghe zzc;
    private zzgoj zzd;

    /* synthetic */ zzghd(Class cls, zzghc zzghc) {
        this.zza = cls;
        this.zzd = zzgoj.zza;
    }

    private final zzghd zze(Object obj, zzgti zzgti, boolean z) throws GeneralSecurityException {
        byte[] bArr;
        if (this.zzb == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        } else if (zzgti.zzk() == 3) {
            ConcurrentMap concurrentMap = this.zzb;
            Integer valueOf = Integer.valueOf(zzgti.zza());
            if (zzgti.zzf() == zzguc.RAW) {
                valueOf = null;
            }
            zzggf zza2 = zzglu.zzb().zza(zzgmf.zza(zzgti.zzc().zzg(), zzgti.zzc().zzf(), zzgti.zzc().zzc(), zzgti.zzf(), valueOf), zzghn.zza());
            int ordinal = zzgti.zzf().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        bArr = zzggb.zza;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgti.zza()).array();
            } else {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgti.zza()).array();
            }
            zzghe zzghe = new zzghe(obj, bArr, zzgti.zzk(), zzgti.zzf(), zzgti.zza(), zza2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzghe);
            zzghg zzghg = new zzghg(zzghe.zzf(), (zzghf) null);
            List list = (List) concurrentMap.put(zzghg, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(zzghe);
                concurrentMap.put(zzghg, Collections.unmodifiableList(arrayList2));
            }
            if (z) {
                if (this.zzc == null) {
                    this.zzc = zzghe;
                } else {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
            }
            return this;
        } else {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
    }

    public final zzghd zza(Object obj, zzgti zzgti) throws GeneralSecurityException {
        zze(obj, zzgti, true);
        return this;
    }

    public final zzghd zzb(Object obj, zzgti zzgti) throws GeneralSecurityException {
        zze(obj, zzgti, false);
        return this;
    }

    public final zzghd zzc(zzgoj zzgoj) {
        if (this.zzb != null) {
            this.zzd = zzgoj;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzghi zzd() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap != null) {
            zzghi zzghi = new zzghi(concurrentMap, this.zzc, this.zzd, this.zza, (zzghh) null);
            this.zzb = null;
            return zzghi;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
