package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
final class zzae extends zzu {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzae(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    public final Object get(int i) {
        zzm.zza(i, this.zzc, "index");
        Object obj = this.zza[i + i + this.zzb];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return true;
    }
}
