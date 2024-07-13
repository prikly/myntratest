package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
class zzgwr extends zzgwq {
    protected final byte[] zza;

    zzgwr(byte[] bArr) {
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
        if (!(obj instanceof zzgwv) || zzd() != ((zzgwv) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgwr)) {
            return obj.equals(this);
        }
        zzgwr zzgwr = (zzgwr) obj;
        int zzr = zzr();
        int zzr2 = zzgwr.zzr();
        if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
            return zzg(zzgwr, 0, zzd());
        }
        return false;
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
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg(zzgwv zzgwv, int i, int i2) {
        if (i2 <= zzgwv.zzd()) {
            int i3 = i + i2;
            if (i3 > zzgwv.zzd()) {
                int zzd = zzgwv.zzd();
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + zzd);
            } else if (!(zzgwv instanceof zzgwr)) {
                return zzgwv.zzk(i, i3).equals(zzk(0, i2));
            } else {
                zzgwr zzgwr = (zzgwr) zzgwv;
                byte[] bArr = this.zza;
                byte[] bArr2 = zzgwr.zza;
                int zzc = zzc() + i2;
                int zzc2 = zzc();
                int zzc3 = zzgwr.zzc() + i;
                while (zzc2 < zzc) {
                    if (bArr[zzc2] != bArr2[zzc3]) {
                        return false;
                    }
                    zzc2++;
                    zzc3++;
                }
                return true;
            }
        } else {
            int zzd2 = zzd();
            throw new IllegalArgumentException("Length too large: " + i2 + zzd2);
        }
    }

    /* access modifiers changed from: protected */
    public final int zzi(int i, int i2, int i3) {
        return zzgyn.zzd(i, this.zza, zzc() + i2, i3);
    }

    /* access modifiers changed from: protected */
    public final int zzj(int i, int i2, int i3) {
        int zzc = zzc() + i2;
        return zzhbm.zzf(i, this.zza, zzc, i3 + zzc);
    }

    public final zzgwv zzk(int i, int i2) {
        int zzq = zzq(i, i2, zzd());
        if (zzq == 0) {
            return zzgwv.zzb;
        }
        return new zzgwo(this.zza, zzc() + i, zzq);
    }

    public final zzgxd zzl() {
        return zzgxd.zzI(this.zza, zzc(), zzd(), true);
    }

    /* access modifiers changed from: protected */
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    public final void zzo(zzgwk zzgwk) throws IOException {
        zzgwk.zza(this.zza, zzc(), zzd());
    }

    public final boolean zzp() {
        int zzc = zzc();
        return zzhbm.zzj(this.zza, zzc, zzd() + zzc);
    }
}
