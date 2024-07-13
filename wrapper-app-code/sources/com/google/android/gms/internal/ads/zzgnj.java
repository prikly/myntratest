package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgnj {
    private zzgnu zza = null;
    private zzgwb zzb = null;
    private Integer zzc = null;

    private zzgnj() {
    }

    /* synthetic */ zzgnj(zzgni zzgni) {
    }

    public final zzgnj zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgnj zzb(zzgwb zzgwb) {
        this.zzb = zzgwb;
        return this;
    }

    public final zzgnj zzc(zzgnu zzgnu) {
        this.zza = zzgnu;
        return this;
    }

    public final zzgnl zzd() throws GeneralSecurityException {
        zzgwb zzgwb;
        zzgwa zzb2;
        zzgnu zzgnu = this.zza;
        if (zzgnu == null || (zzgwb = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzgnu.zza() != zzgwb.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzgnu.zzd() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        } else if (this.zza.zzd() || this.zzc == null) {
            if (this.zza.zzc() == zzgns.zzd) {
                zzb2 = zzgwa.zzb(new byte[0]);
            } else if (this.zza.zzc() == zzgns.zzc || this.zza.zzc() == zzgns.zzb) {
                zzb2 = zzgwa.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
            } else if (this.zza.zzc() == zzgns.zza) {
                zzb2 = zzgwa.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzc()))));
            }
            return new zzgnl(this.zza, this.zzb, zzb2, this.zzc, (zzgnk) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
    }
}
