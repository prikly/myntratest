package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
class zzjb extends zzja {
    protected final byte[] zza;

    zzjb(byte[] bArr) {
        if (bArr != null) {
            this.zza = bArr;
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzje) || zzd() != ((zzje) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzjb)) {
            return obj.equals(this);
        }
        zzjb zzjb = (zzjb) obj;
        int zzk = zzk();
        int zzk2 = zzjb.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzjb.zzd()) {
            int zzd2 = zzd();
            throw new IllegalArgumentException("Length too large: " + zzd + zzd2);
        } else if (zzd > zzjb.zzd()) {
            int zzd3 = zzjb.zzd();
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzd3);
        } else if (!(zzjb instanceof zzjb)) {
            return zzjb.zzf(0, zzd).equals(zzf(0, zzd));
        } else {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzjb.zza;
            zzjb.zzc();
            int i = 0;
            int i2 = 0;
            while (i < zzd) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        }
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: protected */
    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    public final int zze(int i, int i2, int i3) {
        return zzkn.zzd(i, this.zza, 0, i3);
    }

    public final zzje zzf(int i, int i2) {
        int zzj = zzj(0, i2, zzd());
        if (zzj == 0) {
            return zzje.zzb;
        }
        return new zziy(this.zza, 0, zzj);
    }

    /* access modifiers changed from: protected */
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void zzh(zziu zziu) throws IOException {
        ((zzjj) zziu).zzc(this.zza, 0, zzd());
    }

    public final boolean zzi() {
        return zznd.zzf(this.zza, 0, zzd());
    }
}
