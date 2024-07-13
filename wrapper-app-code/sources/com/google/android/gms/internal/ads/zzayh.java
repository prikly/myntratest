package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzayh implements zzayk, zzayl {
    private final Uri zza;
    private final zzazs zzb;
    private final zzavi zzc;
    private final int zzd;
    private final Handler zze;
    private final zzayg zzf;
    private final zzatm zzg = new zzatm();
    private final int zzh;
    private zzayk zzi;
    private zzato zzj;
    private boolean zzk;

    public zzayh(Uri uri, zzazs zzazs, zzavi zzavi, int i, Handler handler, zzayg zzayg, String str, int i2) {
        this.zza = uri;
        this.zzb = zzazs;
        this.zzc = zzavi;
        this.zzd = i;
        this.zze = handler;
        this.zzf = zzayg;
        this.zzh = i2;
    }

    public final void zza() throws IOException {
    }

    public final void zzb(zzast zzast, boolean z, zzayk zzayk) {
        this.zzi = zzayk;
        zzayy zzayy = new zzayy(-9223372036854775807L, false);
        this.zzj = zzayy;
        zzayk.zzg(zzayy, (Object) null);
    }

    public final void zzc(zzayj zzayj) {
        ((zzayf) zzayj).zzx();
    }

    public final void zzd() {
        this.zzi = null;
    }

    public final zzayj zze(int i, zzazw zzazw) {
        zzbaj.zzc(i == 0);
        return new zzayf(this.zza, this.zzb.zza(), this.zzc.zza(), this.zzd, this.zze, this.zzf, this, zzazw, (String) null, this.zzh, (byte[]) null);
    }

    public final void zzg(zzato zzato, Object obj) {
        zzatm zzatm = this.zzg;
        boolean z = false;
        zzato.zzd(0, zzatm, false);
        if (zzatm.zzc != -9223372036854775807L) {
            z = true;
        }
        if (!this.zzk || z) {
            this.zzj = zzato;
            this.zzk = z;
            this.zzi.zzg(zzato, (Object) null);
        }
    }
}
