package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzrq extends zzri {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzfz zzc;

    protected zzrq() {
    }

    /* access modifiers changed from: protected */
    public final void zzA(Object obj, zzsj zzsj) {
        zzdd.zzd(!this.zza.containsKey(obj));
        zzrn zzrn = new zzrn(this, obj);
        zzro zzro = new zzro(this, obj);
        this.zza.put(obj, new zzrp(zzsj, zzrn, zzro));
        Handler handler = this.zzb;
        if (handler != null) {
            zzsj.zzh(handler, zzro);
            Handler handler2 = this.zzb;
            if (handler2 != null) {
                zzsj.zzg(handler2, zzro);
                zzsj.zzm(zzrn, this.zzc, zzb());
                if (!zzt()) {
                    zzsj.zzi(zzrn);
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void zzj() {
        for (zzrp zzrp : this.zza.values()) {
            zzrp.zza.zzi(zzrp.zzb);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzl() {
        for (zzrp zzrp : this.zza.values()) {
            zzrp.zza.zzk(zzrp.zzb);
        }
    }

    /* access modifiers changed from: protected */
    public void zzn(zzfz zzfz) {
        this.zzc = zzfz;
        this.zzb = zzen.zzD((Handler.Callback) null);
    }

    /* access modifiers changed from: protected */
    public void zzq() {
        for (zzrp zzrp : this.zza.values()) {
            zzrp.zza.zzp(zzrp.zzb);
            zzrp.zza.zzs(zzrp.zzc);
            zzrp.zza.zzr(zzrp.zzc);
        }
        this.zza.clear();
    }

    /* access modifiers changed from: protected */
    public int zzv(Object obj, int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    public long zzw(Object obj, long j) {
        return j;
    }

    /* access modifiers changed from: protected */
    public zzsh zzx(Object obj, zzsh zzsh) {
        throw null;
    }

    public void zzy() throws IOException {
        for (zzrp zzrp : this.zza.values()) {
            zzrp.zza.zzy();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zzz(Object obj, zzsj zzsj, zzcn zzcn);
}
