package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzsz extends zzrq {
    private static final zzbg zza;
    private final zzsj[] zzb;
    private final zzcn[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzgbq zzf;
    private int zzg = -1;
    private long[][] zzh;
    private zzsy zzi;
    private final zzrs zzj;

    static {
        zzaj zzaj = new zzaj();
        zzaj.zza("MergingMediaSource");
        zza = zzaj.zzc();
    }

    public zzsz(boolean z, boolean z2, zzsj... zzsjArr) {
        zzrs zzrs = new zzrs();
        this.zzb = zzsjArr;
        this.zzj = zzrs;
        this.zzd = new ArrayList(Arrays.asList(zzsjArr));
        this.zzc = new zzcn[zzsjArr.length];
        this.zzh = new long[0][];
        this.zze = new HashMap();
        this.zzf = zzgbx.zzb(8).zzb(2).zza();
    }

    public final void zzF(zzsf zzsf) {
        zzsx zzsx = (zzsx) zzsf;
        int i = 0;
        while (true) {
            zzsj[] zzsjArr = this.zzb;
            if (i < zzsjArr.length) {
                zzsjArr[i].zzF(zzsx.zzn(i));
                i++;
            } else {
                return;
            }
        }
    }

    public final zzsf zzH(zzsh zzsh, zzwi zzwi, long j) {
        int length = this.zzb.length;
        zzsf[] zzsfArr = new zzsf[length];
        int zza2 = this.zzc[0].zza(zzsh.zza);
        for (int i = 0; i < length; i++) {
            zzsfArr[i] = this.zzb[i].zzH(zzsh.zzc(this.zzc[i].zzf(zza2)), zzwi, j - this.zzh[zza2][i]);
        }
        return new zzsx(this.zzj, this.zzh[zza2], zzsfArr, (byte[]) null);
    }

    public final zzbg zzI() {
        zzsj[] zzsjArr = this.zzb;
        return zzsjArr.length > 0 ? zzsjArr[0].zzI() : zza;
    }

    /* access modifiers changed from: protected */
    public final void zzn(zzfz zzfz) {
        super.zzn(zzfz);
        for (int i = 0; i < this.zzb.length; i++) {
            zzA(Integer.valueOf(i), this.zzb[i]);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ zzsh zzx(Object obj, zzsh zzsh) {
        if (((Integer) obj).intValue() == 0) {
            return zzsh;
        }
        return null;
    }

    public final void zzy() throws IOException {
        zzsy zzsy = this.zzi;
        if (zzsy == null) {
            super.zzy();
            return;
        }
        throw zzsy;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzz(Object obj, zzsj zzsj, zzcn zzcn) {
        int i;
        if (this.zzi == null) {
            if (this.zzg == -1) {
                i = zzcn.zzb();
                this.zzg = i;
            } else {
                int zzb2 = zzcn.zzb();
                int i2 = this.zzg;
                if (zzb2 == i2) {
                    i = i2;
                } else {
                    this.zzi = new zzsy(0);
                    return;
                }
            }
            if (this.zzh.length == 0) {
                int[] iArr = new int[2];
                iArr[1] = this.zzc.length;
                iArr[0] = i;
                this.zzh = (long[][]) Array.newInstance(long.class, iArr);
            }
            this.zzd.remove(zzsj);
            this.zzc[((Integer) obj).intValue()] = zzcn;
            if (this.zzd.isEmpty()) {
                zzo(this.zzc[0]);
            }
        }
    }
}
