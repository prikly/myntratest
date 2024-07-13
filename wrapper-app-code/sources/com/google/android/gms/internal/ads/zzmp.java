package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzmp {
    private final zzck zza;
    /* access modifiers changed from: private */
    public zzgau zzb = zzgau.zzo();
    private zzgax zzc = zzgax.zzd();
    private zzsh zzd;
    private zzsh zze;
    private zzsh zzf;

    public zzmp(zzck zzck) {
        this.zza = zzck;
    }

    private static zzsh zzj(zzcg zzcg, zzgau zzgau, zzsh zzsh, zzck zzck) {
        zzcn zzn = zzcg.zzn();
        int zzg = zzcg.zzg();
        Object zzf2 = zzn.zzo() ? null : zzn.zzf(zzg);
        int zzc2 = (zzcg.zzs() || zzn.zzo()) ? -1 : zzn.zzd(zzg, zzck, false).zzc(zzen.zzv(zzcg.zzl()));
        for (int i = 0; i < zzgau.size(); i++) {
            zzsh zzsh2 = (zzsh) zzgau.get(i);
            if (zzm(zzsh2, zzf2, zzcg.zzs(), zzcg.zzd(), zzcg.zze(), zzc2)) {
                return zzsh2;
            }
        }
        if (zzgau.isEmpty() && zzsh != null) {
            if (zzm(zzsh, zzf2, zzcg.zzs(), zzcg.zzd(), zzcg.zze(), zzc2)) {
                return zzsh;
            }
        }
        return null;
    }

    private final void zzk(zzgaw zzgaw, zzsh zzsh, zzcn zzcn) {
        if (zzsh != null) {
            if (zzcn.zza(zzsh.zza) != -1) {
                zzgaw.zza(zzsh, zzcn);
                return;
            }
            zzcn zzcn2 = (zzcn) this.zzc.get(zzsh);
            if (zzcn2 != null) {
                zzgaw.zza(zzsh, zzcn2);
            }
        }
    }

    private final void zzl(zzcn zzcn) {
        zzgaw zzgaw = new zzgaw();
        if (this.zzb.isEmpty()) {
            zzk(zzgaw, this.zze, zzcn);
            if (!zzfxz.zza(this.zzf, this.zze)) {
                zzk(zzgaw, this.zzf, zzcn);
            }
            if (!zzfxz.zza(this.zzd, this.zze) && !zzfxz.zza(this.zzd, this.zzf)) {
                zzk(zzgaw, this.zzd, zzcn);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzgaw, (zzsh) this.zzb.get(i), zzcn);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzgaw, this.zzd, zzcn);
            }
        }
        this.zzc = zzgaw.zzc();
    }

    private static boolean zzm(zzsh zzsh, Object obj, boolean z, int i, int i2, int i3) {
        if (!zzsh.zza.equals(obj)) {
            return false;
        }
        if (z) {
            if (!(zzsh.zzb == i && zzsh.zzc == i2)) {
                return false;
            }
        } else if (!(zzsh.zzb == -1 && zzsh.zze == i3)) {
            return false;
        }
        return true;
    }

    public final zzcn zza(zzsh zzsh) {
        return (zzcn) this.zzc.get(zzsh);
    }

    public final zzsh zzb() {
        return this.zzd;
    }

    public final zzsh zzc() {
        Object obj;
        Object next;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzgau zzgau = this.zzb;
        if (!(zzgau instanceof List)) {
            Iterator it = zzgau.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else if (!zzgau.isEmpty()) {
            obj = zzgau.get(zzgau.size() - 1);
        } else {
            throw new NoSuchElementException();
        }
        return (zzsh) obj;
    }

    public final zzsh zzd() {
        return this.zze;
    }

    public final zzsh zze() {
        return this.zzf;
    }

    public final void zzg(zzcg zzcg) {
        this.zzd = zzj(zzcg, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzsh zzsh, zzcg zzcg) {
        this.zzb = zzgau.zzm(list);
        if (!list.isEmpty()) {
            this.zze = (zzsh) list.get(0);
            if (zzsh != null) {
                this.zzf = zzsh;
            } else {
                throw null;
            }
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzcg, this.zzb, this.zze, this.zza);
        }
        zzl(zzcg.zzn());
    }

    public final void zzi(zzcg zzcg) {
        this.zzd = zzj(zzcg, this.zzb, this.zze, this.zza);
        zzl(zzcg.zzn());
    }
}
