package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgzx implements zzgzk {
    private final zzgzn zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzgzx(zzgzn zzgzn, String str, Object[] objArr) {
        this.zza = zzgzn;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        char c2 = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c2 |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.zzd = c2 | (charAt2 << i);
                return;
            }
        }
    }

    public final zzgzn zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    /* access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }
}
