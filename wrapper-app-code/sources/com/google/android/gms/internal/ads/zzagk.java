package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzagk extends zzago {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzagk() {
    }

    public static boolean zzd(zzef zzef) {
        return zzk(zzef, zza);
    }

    private static boolean zzk(zzef zzef, byte[] bArr) {
        if (zzef.zza() < 8) {
            return false;
        }
        int zzc2 = zzef.zzc();
        byte[] bArr2 = new byte[8];
        zzef.zzB(bArr2, 0, 8);
        zzef.zzF(zzc2);
        return Arrays.equals(bArr2, bArr);
    }

    /* access modifiers changed from: protected */
    public final long zza(zzef zzef) {
        byte[] zzH = zzef.zzH();
        byte b2 = zzH[0] & 255;
        byte b3 = b2 & 3;
        byte b4 = 2;
        if (b3 == 0) {
            b4 = 1;
        } else if (!(b3 == 1 || b3 == 2)) {
            b4 = zzH[1] & 63;
        }
        int i = b2 >> 3;
        int i2 = i & 3;
        return zzg(((long) b4) * ((long) (i >= 16 ? IronSourceConstants.IS_INSTANCE_NOT_FOUND << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2)));
    }

    /* access modifiers changed from: protected */
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zzc = false;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzc(zzef zzef, long j, zzagl zzagl) throws zzbu {
        if (zzk(zzef, zza)) {
            byte[] copyOf = Arrays.copyOf(zzef.zzH(), zzef.zzd());
            byte b2 = copyOf[9] & 255;
            List zza2 = zzaah.zza(copyOf);
            if (zzagl.zza != null) {
                return true;
            }
            zzad zzad = new zzad();
            zzad.zzS("audio/opus");
            zzad.zzw(b2);
            zzad.zzT(48000);
            zzad.zzI(zza2);
            zzagl.zza = zzad.zzY();
            return true;
        } else if (zzk(zzef, zzb)) {
            zzdd.zzb(zzagl.zza);
            if (this.zzc) {
                return true;
            }
            this.zzc = true;
            zzef.zzG(8);
            zzbq zzb2 = zzaaw.zzb(zzgau.zzn(zzaaw.zzc(zzef, false, false).zzb));
            if (zzb2 == null) {
                return true;
            }
            zzad zzb3 = zzagl.zza.zzb();
            zzb3.zzM(zzb2.zzd(zzagl.zza.zzk));
            zzagl.zza = zzb3.zzY();
            return true;
        } else {
            zzdd.zzb(zzagl.zza);
            return false;
        }
    }
}
