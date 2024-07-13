package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzri implements zzsj {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzsq zzc = new zzsq();
    private final zzpi zzd = new zzpi();
    private Looper zze;
    private zzcn zzf;
    private zzmz zzg;

    public /* synthetic */ zzcn zzL() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final zzmz zzb() {
        zzmz zzmz = this.zzg;
        zzdd.zzb(zzmz);
        return zzmz;
    }

    /* access modifiers changed from: protected */
    public final zzpi zzc(zzsh zzsh) {
        return this.zzd.zza(0, zzsh);
    }

    /* access modifiers changed from: protected */
    public final zzpi zzd(int i, zzsh zzsh) {
        return this.zzd.zza(i, zzsh);
    }

    /* access modifiers changed from: protected */
    public final zzsq zze(zzsh zzsh) {
        return this.zzc.zza(0, zzsh, 0);
    }

    /* access modifiers changed from: protected */
    public final zzsq zzf(int i, zzsh zzsh, long j) {
        return this.zzc.zza(i, zzsh, 0);
    }

    public final void zzi(zzsi zzsi) {
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.remove(zzsi);
        if ((!isEmpty) && this.zzb.isEmpty()) {
            zzj();
        }
    }

    /* access modifiers changed from: protected */
    public void zzj() {
    }

    public final void zzk(zzsi zzsi) {
        if (this.zze != null) {
            boolean isEmpty = this.zzb.isEmpty();
            this.zzb.add(zzsi);
            if (isEmpty) {
                zzl();
                return;
            }
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzl() {
    }

    public final void zzm(zzsi zzsi, zzfz zzfz, zzmz zzmz) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (!(looper == null || looper == myLooper)) {
            z = false;
        }
        zzdd.zzd(z);
        this.zzg = zzmz;
        zzcn zzcn = this.zzf;
        this.zza.add(zzsi);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzsi);
            zzn(zzfz);
        } else if (zzcn != null) {
            zzk(zzsi);
            zzsi.zza(this, zzcn);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zzn(zzfz zzfz);

    /* access modifiers changed from: protected */
    public final void zzo(zzcn zzcn) {
        this.zzf = zzcn;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzsi) arrayList.get(i)).zza(this, zzcn);
        }
    }

    public final void zzp(zzsi zzsi) {
        this.zza.remove(zzsi);
        if (this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            zzq();
            return;
        }
        zzi(zzsi);
    }

    /* access modifiers changed from: protected */
    public abstract void zzq();

    public final void zzr(zzpj zzpj) {
        this.zzd.zzc(zzpj);
    }

    public final void zzs(zzsr zzsr) {
        this.zzc.zzm(zzsr);
    }

    /* access modifiers changed from: protected */
    public final boolean zzt() {
        return !this.zzb.isEmpty();
    }

    public /* synthetic */ boolean zzu() {
        return true;
    }

    public final void zzg(Handler handler, zzpj zzpj) {
        if (zzpj != null) {
            this.zzd.zzb(handler, zzpj);
            return;
        }
        throw null;
    }

    public final void zzh(Handler handler, zzsr zzsr) {
        if (zzsr != null) {
            this.zzc.zzb(handler, zzsr);
            return;
        }
        throw null;
    }
}
