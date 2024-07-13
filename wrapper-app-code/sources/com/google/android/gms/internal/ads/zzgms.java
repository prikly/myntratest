package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgms {
    private zzgnc zza = null;
    private zzgwb zzb = null;
    private Integer zzc = null;

    private zzgms() {
    }

    /* synthetic */ zzgms(zzgmr zzgmr) {
    }

    public final zzgms zza(zzgwb zzgwb) throws GeneralSecurityException {
        this.zzb = zzgwb;
        return this;
    }

    public final zzgms zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgms zzc(zzgnc zzgnc) {
        this.zza = zzgnc;
        return this;
    }

    public final zzgmu zzd() throws GeneralSecurityException {
        zzgwb zzgwb;
        zzgwa zzb2;
        zzgnc zzgnc = this.zza;
        if (zzgnc == null || (zzgwb = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzgnc.zza() != zzgwb.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzgnc.zzd() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        } else if (this.zza.zzd() || this.zzc == null) {
            if (this.zza.zzc() == zzgna.zzd) {
                zzb2 = zzgwa.zzb(new byte[0]);
            } else if (this.zza.zzc() == zzgna.zzc || this.zza.zzc() == zzgna.zzb) {
                zzb2 = zzgwa.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
            } else if (this.zza.zzc() == zzgna.zza) {
                zzb2 = zzgwa.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzc()))));
            }
            return new zzgmu(this.zza, this.zzb, zzb2, this.zzc, (zzgmt) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
    }
}
