package com.google.android.gms.internal.play_billing;

import java.util.List;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
final class zzt extends zzu {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzu zzc;

    zzt(zzu zzu, int i, int i2) {
        this.zzc = zzu;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzm.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    public final zzu zzh(int i, int i2) {
        zzm.zzd(i, i2, this.zzb);
        zzu zzu = this.zzc;
        int i3 = this.zza;
        return zzu.subList(i + i3, i2 + i3);
    }
}
