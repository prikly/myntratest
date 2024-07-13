package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgat extends zzgau {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzgau zzc;

    zzgat(zzgau zzgau, int i, int i2) {
        this.zzc = zzgau;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzfye.zza(i, this.zzb, "index");
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

    public final zzgau zzh(int i, int i2) {
        zzfye.zzg(i, i2, this.zzb);
        zzgau zzgau = this.zzc;
        int i3 = this.zza;
        return zzgau.subList(i + i3, i2 + i3);
    }
}
