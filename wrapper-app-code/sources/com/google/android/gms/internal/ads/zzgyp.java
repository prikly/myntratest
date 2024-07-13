package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzgyp extends IOException {
    private zzgzn zza = null;
    private boolean zzb;

    public zzgyp(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    static zzgyo zza() {
        return new zzgyo("Protocol message tag had invalid wire type.");
    }

    static zzgyp zzb() {
        return new zzgyp("Protocol message end-group tag did not match expected tag.");
    }

    static zzgyp zzc() {
        return new zzgyp("Protocol message contained an invalid tag (zero).");
    }

    static zzgyp zzd() {
        return new zzgyp("Protocol message had invalid UTF-8.");
    }

    static zzgyp zze() {
        return new zzgyp("CodedInputStream encountered a malformed varint.");
    }

    static zzgyp zzf() {
        return new zzgyp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzgyp zzg() {
        return new zzgyp("Failed to parse the message.");
    }

    static zzgyp zzi() {
        return new zzgyp("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static zzgyp zzj() {
        return new zzgyp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzgyp zzh(zzgzn zzgzn) {
        this.zza = zzgzn;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void zzk() {
        this.zzb = true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzl() {
        return this.zzb;
    }

    public zzgyp(String str) {
        super(str);
    }
}
