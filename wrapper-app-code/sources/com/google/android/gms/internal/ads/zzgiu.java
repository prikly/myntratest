package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgiu extends zzgli {
    zzgiu() {
        super(zzgui.class, new zzgis(zzgfw.class));
    }

    public final zzglh zza() {
        return new zzgit(this, zzgul.class);
    }

    public final zzgsv zzb() {
        return zzgsv.SYMMETRIC;
    }

    public final /* synthetic */ zzgzn zzc(zzgwv zzgwv) throws zzgyp {
        return zzgui.zze(zzgwv, zzgxp.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgzn zzgzn) throws GeneralSecurityException {
        zzgui zzgui = (zzgui) zzgzn;
        zzgvx.zzb(zzgui.zza(), 0);
        if (zzgui.zzf().zzd() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
