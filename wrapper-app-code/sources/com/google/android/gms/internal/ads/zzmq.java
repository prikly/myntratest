package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzmq implements zzkm {
    private final zzde zza;
    private final zzck zzb;
    private final zzcm zzc;
    private final zzmp zzd;
    private final SparseArray zze;
    private zzdt zzf;
    private zzcg zzg;
    private zzdn zzh;
    private boolean zzi;

    public static /* synthetic */ void zzW(zzmq zzmq) {
        zzkn zzU = zzmq.zzU();
        zzmq.zzZ(zzU, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new zzlm(zzU));
        zzmq.zzf.zze();
    }

    private final zzkn zzab(int i, zzsh zzsh) {
        zzcg zzcg = this.zzg;
        if (zzcg == null) {
            throw null;
        } else if (zzsh == null) {
            zzcn zzn = zzcg.zzn();
            if (i >= zzn.zzc()) {
                zzn = zzcn.zza;
            }
            return zzV(zzn, i, (zzsh) null);
        } else if (this.zzd.zza(zzsh) != null) {
            return zzaa(zzsh);
        } else {
            return zzV(zzcn.zza, i, zzsh);
        }
    }

    private final zzkn zzac() {
        return zzaa(this.zzd.zzd());
    }

    private final zzkn zzad() {
        return zzaa(this.zzd.zze());
    }

    private final zzkn zzae(zzbw zzbw) {
        zzbn zzbn;
        if (!(zzbw instanceof zzha) || (zzbn = ((zzha) zzbw).zzj) == null) {
            return zzU();
        }
        return zzaa(new zzsh(zzbn));
    }

    public final void zzA(String str) {
        zzkn zzad = zzad();
        zzZ(zzad, 1012, new zzmo(zzad, str));
    }

    public final void zzB(zzgs zzgs) {
        zzkn zzac = zzac();
        zzZ(zzac, 1013, new zzme(zzac, zzgs));
    }

    public final void zzC(zzgs zzgs) {
        zzkn zzad = zzad();
        zzZ(zzad, IronSourceError.AUCTION_REQUEST_ERROR_MISSING_PARAMS, new zzlt(zzad, zzgs));
    }

    public final void zzD(zzaf zzaf, zzgt zzgt) {
        zzkn zzad = zzad();
        zzZ(zzad, 1009, new zzmd(zzad, zzaf, zzgt));
    }

    public final void zzE(long j) {
        zzkn zzad = zzad();
        zzZ(zzad, 1010, new zzmg(zzad, j));
    }

    public final void zzF(Exception exc) {
        zzkn zzad = zzad();
        zzZ(zzad, 1014, new zzlb(zzad, exc));
    }

    public final void zzG(int i, long j, long j2) {
        zzkn zzad = zzad();
        zzZ(zzad, IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND, new zzkt(zzad, i, j, j2));
    }

    public final void zzH(int i, long j) {
        zzkn zzac = zzac();
        zzZ(zzac, 1018, new zzlo(zzac, i, j));
    }

    public final void zzI(Object obj, long j) {
        zzkn zzad = zzad();
        zzZ(zzad, 26, new zzmk(zzad, obj, j));
    }

    public final void zzJ(Exception exc) {
        zzkn zzad = zzad();
        zzZ(zzad, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new zzkz(zzad, exc));
    }

    public final void zzK(String str, long j, long j2) {
        zzkn zzad = zzad();
        zzZ(zzad, 1016, new zzlk(zzad, str, j2, j));
    }

    public final void zzL(String str) {
        zzkn zzad = zzad();
        zzZ(zzad, 1019, new zzks(zzad, str));
    }

    public final void zzM(zzgs zzgs) {
        zzkn zzac = zzac();
        zzZ(zzac, IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT, new zzmj(zzac, zzgs));
    }

    public final void zzN(zzgs zzgs) {
        zzkn zzad = zzad();
        zzZ(zzad, IronSourceError.ERROR_SESSION_KEY_ENCRYPTION_FAILURE, new zzlp(zzad, zzgs));
    }

    public final void zzO(long j, int i) {
        zzkn zzac = zzac();
        zzZ(zzac, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new zzlc(zzac, j, i));
    }

    public final void zzP(zzaf zzaf, zzgt zzgt) {
        zzkn zzad = zzad();
        zzZ(zzad, 1017, new zzkr(zzad, zzaf, zzgt));
    }

    public final void zzQ() {
        zzdn zzdn = this.zzh;
        zzdd.zzb(zzdn);
        zzdn.zzg(new zzmf(this));
    }

    public final void zzR(zzkp zzkp) {
        this.zzf.zzf(zzkp);
    }

    public final void zzS(zzcg zzcg, Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzb.isEmpty()) {
            z = false;
        }
        zzdd.zzf(z);
        if (zzcg != null) {
            this.zzg = zzcg;
            this.zzh = this.zza.zzb(looper, (Handler.Callback) null);
            this.zzf = this.zzf.zza(looper, new zzlj(this, zzcg));
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final zzkn zzU() {
        return zzaa(this.zzd.zzb());
    }

    /* access modifiers changed from: protected */
    public final zzkn zzV(zzcn zzcn, int i, zzsh zzsh) {
        zzcn zzcn2 = zzcn;
        int i2 = i;
        boolean z = true;
        zzsh zzsh2 = true == zzcn.zzo() ? null : zzsh;
        long zza2 = this.zza.zza();
        if (!zzcn2.equals(this.zzg.zzn()) || i2 != this.zzg.zzf()) {
            z = false;
        }
        long j = 0;
        if (zzsh2 == null || !zzsh2.zzb()) {
            if (z) {
                j = this.zzg.zzk();
            } else if (!zzcn.zzo()) {
                long j2 = zzcn2.zze(i2, this.zzc, 0).zzm;
                j = zzen.zzz(0);
            }
        } else if (z && this.zzg.zzd() == zzsh2.zzb && this.zzg.zze() == zzsh2.zzc) {
            j = this.zzg.zzl();
        }
        return new zzkn(zza2, zzcn, i, zzsh2, j, this.zzg.zzn(), this.zzg.zzf(), this.zzd.zzb(), this.zzg.zzl(), this.zzg.zzm());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzX(zzcg zzcg, zzkp zzkp, zzaa zzaa) {
        zzkp.zzi(zzcg, new zzko(zzaa, this.zze));
    }

    public final void zzY(int i, long j, long j2) {
        zzkn zzaa = zzaa(this.zzd.zzc());
        zzZ(zzaa, 1006, new zzla(zzaa, i, j, j2));
    }

    /* access modifiers changed from: protected */
    public final void zzZ(zzkn zzkn, int i, zzdq zzdq) {
        this.zze.put(i, zzkn);
        zzdt zzdt = this.zzf;
        zzdt.zzd(i, zzdq);
        zzdt.zzc();
    }

    public final void zza(zzcc zzcc) {
        zzkn zzU = zzU();
        zzZ(zzU, 13, new zzle(zzU, zzcc));
    }

    public final void zzaf(int i, zzsh zzsh, zzsd zzsd) {
        zzkn zzab = zzab(i, zzsh);
        zzZ(zzab, 1004, new zzky(zzab, zzsd));
    }

    public final void zzag(int i, zzsh zzsh, zzry zzry, zzsd zzsd) {
        zzkn zzab = zzab(i, zzsh);
        zzZ(zzab, 1002, new zzlq(zzab, zzry, zzsd));
    }

    public final void zzah(int i, zzsh zzsh, zzry zzry, zzsd zzsd) {
        zzkn zzab = zzab(i, zzsh);
        zzZ(zzab, 1001, new zzma(zzab, zzry, zzsd));
    }

    public final void zzai(int i, zzsh zzsh, zzry zzry, zzsd zzsd, IOException iOException, boolean z) {
        zzkn zzab = zzab(i, zzsh);
        zzZ(zzab, 1003, new zzll(zzab, zzry, zzsd, iOException, z));
    }

    public final void zzaj(int i, zzsh zzsh, zzry zzry, zzsd zzsd) {
        zzkn zzab = zzab(i, zzsh);
        zzZ(zzab, 1000, new zzlu(zzab, zzry, zzsd));
    }

    public final void zzb(zzt zzt) {
        zzkn zzU = zzU();
        zzZ(zzU, 29, new zzlf(zzU, zzt));
    }

    public final void zzc(int i, boolean z) {
        zzkn zzU = zzU();
        zzZ(zzU, 30, new zzli(zzU, i, z));
    }

    public final void zzd(boolean z) {
        zzkn zzU = zzU();
        zzZ(zzU, 3, new zzmn(zzU, z));
    }

    public final void zze(boolean z) {
        zzkn zzU = zzU();
        zzZ(zzU, 7, new zzlw(zzU, z));
    }

    public final void zzf(zzbg zzbg, int i) {
        zzkn zzU = zzU();
        zzZ(zzU, 1, new zzlz(zzU, zzbg, i));
    }

    public final void zzg(zzbm zzbm) {
        zzkn zzU = zzU();
        zzZ(zzU, 14, new zzmc(zzU, zzbm));
    }

    public final void zzh(boolean z, int i) {
        zzkn zzU = zzU();
        zzZ(zzU, 5, new zzlv(zzU, z, i));
    }

    public final void zzi(zzby zzby) {
        zzkn zzU = zzU();
        zzZ(zzU, 12, new zzkv(zzU, zzby));
    }

    public final void zzj(int i) {
        zzkn zzU = zzU();
        zzZ(zzU, 4, new zzly(zzU, i));
    }

    public final void zzk(int i) {
        zzkn zzU = zzU();
        zzZ(zzU, 6, new zzmm(zzU, i));
    }

    public final void zzl(zzbw zzbw) {
        zzkn zzae = zzae(zzbw);
        zzZ(zzae, 10, new zzlr(zzae, zzbw));
    }

    public final void zzm(zzbw zzbw) {
        zzkn zzae = zzae(zzbw);
        zzZ(zzae, 10, new zzmb(zzae, zzbw));
    }

    public final void zzn(boolean z, int i) {
        zzkn zzU = zzU();
        zzZ(zzU, -1, new zzkq(zzU, z, i));
    }

    public final void zzp() {
        zzkn zzU = zzU();
        zzZ(zzU, -1, new zzkx(zzU));
    }

    public final void zzq(boolean z) {
        zzkn zzad = zzad();
        zzZ(zzad, 23, new zzlx(zzad, z));
    }

    public final void zzr(int i, int i2) {
        zzkn zzad = zzad();
        zzZ(zzad, 24, new zzml(zzad, i, i2));
    }

    public final void zzt(zzcy zzcy) {
        zzkn zzU = zzU();
        zzZ(zzU, 2, new zzlg(zzU, zzcy));
    }

    public final void zzu(zzda zzda) {
        zzkn zzad = zzad();
        zzZ(zzad, 25, new zzmi(zzad, zzda));
    }

    public final void zzv(float f2) {
        zzkn zzad = zzad();
        zzZ(zzad, 22, new zzku(zzad, f2));
    }

    public final void zzw(zzkp zzkp) {
        this.zzf.zzb(zzkp);
    }

    public final void zzx() {
        if (!this.zzi) {
            zzkn zzU = zzU();
            this.zzi = true;
            zzZ(zzU, -1, new zzmh(zzU));
        }
    }

    public final void zzy(Exception exc) {
        zzkn zzad = zzad();
        zzZ(zzad, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new zzlh(zzad, exc));
    }

    public final void zzz(String str, long j, long j2) {
        zzkn zzad = zzad();
        zzZ(zzad, IronSourceError.AUCTION_ERROR_DECOMPRESSION, new zzls(zzad, str, j2, j));
    }

    private final zzkn zzaa(zzsh zzsh) {
        zzcn zzcn;
        if (this.zzg != null) {
            if (zzsh == null) {
                zzcn = null;
            } else {
                zzcn = this.zzd.zza(zzsh);
            }
            if (zzsh != null && zzcn != null) {
                return zzV(zzcn, zzcn.zzn(zzsh.zza, this.zzb).zzd, zzsh);
            }
            int zzf2 = this.zzg.zzf();
            zzcn zzn = this.zzg.zzn();
            if (zzf2 >= zzn.zzc()) {
                zzn = zzcn.zza;
            }
            return zzV(zzn, zzf2, (zzsh) null);
        }
        throw null;
    }

    public final void zzT(List list, zzsh zzsh) {
        zzmp zzmp = this.zzd;
        zzcg zzcg = this.zzg;
        if (zzcg != null) {
            zzmp.zzh(list, zzsh, zzcg);
            return;
        }
        throw null;
    }

    public final void zzo(zzcf zzcf, zzcf zzcf2, int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzmp zzmp = this.zzd;
        zzcg zzcg = this.zzg;
        if (zzcg != null) {
            zzmp.zzg(zzcg);
            zzkn zzU = zzU();
            zzZ(zzU, 11, new zzld(zzU, i, zzcf, zzcf2));
            return;
        }
        throw null;
    }

    public final void zzs(zzcn zzcn, int i) {
        zzmp zzmp = this.zzd;
        zzcg zzcg = this.zzg;
        if (zzcg != null) {
            zzmp.zzi(zzcg);
            zzkn zzU = zzU();
            zzZ(zzU, 0, new zzln(zzU, i));
            return;
        }
        throw null;
    }

    public zzmq(zzde zzde) {
        if (zzde != null) {
            this.zza = zzde;
            this.zzf = new zzdt(zzen.zzE(), zzde, zzkw.zza);
            this.zzb = new zzck();
            this.zzc = new zzcm();
            this.zzd = new zzmp(this.zzb);
            this.zze = new SparseArray();
            return;
        }
        throw null;
    }
}
