package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzjr {
    private final zzmz zza;
    private final List zzb = new ArrayList();
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final zzjq zze;
    /* access modifiers changed from: private */
    public final zzsq zzf = new zzsq();
    /* access modifiers changed from: private */
    public final zzpi zzg = new zzpi();
    private final HashMap zzh = new HashMap();
    private final Set zzi = new HashSet();
    private boolean zzj;
    private zzfz zzk;
    private zzub zzl = new zzub(0);

    public zzjr(zzjq zzjq, zzkm zzkm, Handler handler, zzmz zzmz) {
        this.zza = zzmz;
        this.zze = zzjq;
        this.zzf.zzb(handler, zzkm);
        this.zzg.zzb(handler, zzkm);
    }

    private final void zzp(int i, int i2) {
        while (i < this.zzb.size()) {
            ((zzjp) this.zzb.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzq(zzjp zzjp) {
        zzjo zzjo = (zzjo) this.zzh.get(zzjp);
        if (zzjo != null) {
            zzjo.zza.zzi(zzjo.zzb);
        }
    }

    private final void zzr() {
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            zzjp zzjp = (zzjp) it.next();
            if (zzjp.zzc.isEmpty()) {
                zzq(zzjp);
                it.remove();
            }
        }
    }

    private final void zzs(zzjp zzjp) {
        if (zzjp.zze && zzjp.zzc.isEmpty()) {
            zzjo zzjo = (zzjo) this.zzh.remove(zzjp);
            if (zzjo != null) {
                zzjo.zza.zzp(zzjo.zzb);
                zzjo.zza.zzs(zzjo.zzc);
                zzjo.zza.zzr(zzjo.zzc);
                this.zzi.remove(zzjp);
                return;
            }
            throw null;
        }
    }

    private final void zzt(zzjp zzjp) {
        zzsc zzsc = zzjp.zza;
        zzjm zzjm = new zzjm(this);
        zzjn zzjn = new zzjn(this, zzjp);
        this.zzh.put(zzjp, new zzjo(zzsc, zzjm, zzjn));
        zzsc.zzh(new Handler(zzen.zzE(), (Handler.Callback) null), zzjn);
        zzsc.zzg(new Handler(zzen.zzE(), (Handler.Callback) null), zzjn);
        zzsc.zzm(zzjm, this.zzk, this.zza);
    }

    private final void zzu(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                zzjp zzjp = (zzjp) this.zzb.remove(i2);
                this.zzd.remove(zzjp.zzb);
                zzp(i2, -zzjp.zza.zzB().zzc());
                zzjp.zze = true;
                if (this.zzj) {
                    zzs(zzjp);
                }
            } else {
                return;
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzcn zzb() {
        if (this.zzb.isEmpty()) {
            return zzcn.zza;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            zzjp zzjp = (zzjp) this.zzb.get(i2);
            zzjp.zzd = i;
            i += zzjp.zza.zzB().zzc();
        }
        return new zzjw(this.zzb, this.zzl, (byte[]) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzsj zzsj, zzcn zzcn) {
        this.zze.zzh();
    }

    public final void zzf(zzfz zzfz) {
        zzdd.zzf(!this.zzj);
        this.zzk = zzfz;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzjp zzjp = (zzjp) this.zzb.get(i);
            zzt(zzjp);
            this.zzi.add(zzjp);
        }
        this.zzj = true;
    }

    public final void zzg() {
        for (zzjo zzjo : this.zzh.values()) {
            try {
                zzjo.zza.zzp(zzjo.zzb);
            } catch (RuntimeException e2) {
                zzdw.zzc("MediaSourceList", "Failed to release child source.", e2);
            }
            zzjo.zza.zzs(zzjo.zzc);
            zzjo.zza.zzr(zzjo.zzc);
        }
        this.zzh.clear();
        this.zzi.clear();
        this.zzj = false;
    }

    public final void zzh(zzsf zzsf) {
        zzjp zzjp = (zzjp) this.zzc.remove(zzsf);
        if (zzjp != null) {
            zzjp.zza.zzF(zzsf);
            zzjp.zzc.remove(((zzrz) zzsf).zza);
            if (!this.zzc.isEmpty()) {
                zzr();
            }
            zzs(zzjp);
            return;
        }
        throw null;
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final zzcn zzj(int i, List list, zzub zzub) {
        if (!list.isEmpty()) {
            this.zzl = zzub;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzjp zzjp = (zzjp) list.get(i2 - i);
                if (i2 > 0) {
                    zzjp zzjp2 = (zzjp) this.zzb.get(i2 - 1);
                    zzjp.zzc(zzjp2.zzd + zzjp2.zza.zzB().zzc());
                } else {
                    zzjp.zzc(0);
                }
                zzp(i2, zzjp.zza.zzB().zzc());
                this.zzb.add(i2, zzjp);
                this.zzd.put(zzjp.zzb, zzjp);
                if (this.zzj) {
                    zzt(zzjp);
                    if (this.zzc.isEmpty()) {
                        this.zzi.add(zzjp);
                    } else {
                        zzq(zzjp);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzcn zzk(int i, int i2, int i3, zzub zzub) {
        zzdd.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzcn zzl(int i, int i2, zzub zzub) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zza()) {
            z = true;
        }
        zzdd.zzd(z);
        this.zzl = zzub;
        zzu(i, i2);
        return zzb();
    }

    public final zzcn zzm(List list, zzub zzub) {
        zzu(0, this.zzb.size());
        return zzj(this.zzb.size(), list, zzub);
    }

    public final zzcn zzn(zzub zzub) {
        int zza2 = zza();
        if (zzub.zzc() != zza2) {
            zzub = zzub.zzf().zzg(0, zza2);
        }
        this.zzl = zzub;
        return zzb();
    }

    public final zzsf zzo(zzsh zzsh, zzwi zzwi, long j) {
        Object obj = ((Pair) zzsh.zza).first;
        zzsh zzc2 = zzsh.zzc(((Pair) zzsh.zza).second);
        zzjp zzjp = (zzjp) this.zzd.get(obj);
        if (zzjp != null) {
            this.zzi.add(zzjp);
            zzjo zzjo = (zzjo) this.zzh.get(zzjp);
            if (zzjo != null) {
                zzjo.zza.zzk(zzjo.zzb);
            }
            zzjp.zzc.add(zzc2);
            zzrz zzG = zzjp.zza.zzH(zzc2, zzwi, j);
            this.zzc.put(zzG, zzjp);
            zzr();
            return zzG;
        }
        throw null;
    }
}
