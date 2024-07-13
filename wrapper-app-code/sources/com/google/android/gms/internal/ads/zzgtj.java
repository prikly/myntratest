package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgtj extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgtj zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgym zze = zzaL();

    static {
        zzgtj zzgtj = new zzgtj();
        zzb = zzgtj;
        zzgyd.zzaS(zzgtj.class, zzgtj);
    }

    private zzgtj() {
    }

    public static zzgtg zzd() {
        return (zzgtg) zzb.zzaz();
    }

    public static zzgtj zzf(InputStream inputStream, zzgxp zzgxp) throws IOException {
        return (zzgtj) zzgyd.zzaG(zzb, inputStream, zzgxp);
    }

    public static zzgtj zzg(byte[] bArr, zzgxp zzgxp) throws zzgyp {
        return (zzgtj) zzgyd.zzaH(zzb, bArr, zzgxp);
    }

    static /* synthetic */ void zzj(zzgtj zzgtj, zzgti zzgti) {
        zzgti.getClass();
        zzgym zzgym = zzgtj.zze;
        if (!zzgym.zzc()) {
            zzgtj.zze = zzgyd.zzaM(zzgym);
        }
        zzgtj.zze.add(zzgti);
    }

    public final int zza() {
        return this.zze.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgti.class});
        } else if (i2 == 3) {
            return new zzgtj();
        } else {
            if (i2 == 4) {
                return new zzgtg((zzgtf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int zzc() {
        return this.zzd;
    }

    public final List zzh() {
        return this.zze;
    }
}
