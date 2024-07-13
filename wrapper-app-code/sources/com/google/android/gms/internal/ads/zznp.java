package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zznp {
    private final Handler zza;
    private final zznq zzb;

    public zznp(Handler handler, zznq zznq) {
        this.zza = zznq == null ? null : handler;
        this.zzb = zznq;
    }

    public final void zza(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznf(this, exc));
        }
    }

    public final void zzb(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznl(this, exc));
        }
    }

    public final void zzc(String str, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznk(this, str, j, j2));
        }
    }

    public final void zzd(String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznm(this, str));
        }
    }

    public final void zze(zzgs zzgs) {
        zzgs.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzng(this, zzgs));
        }
    }

    public final void zzf(zzgs zzgs) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznh(this, zzgs));
        }
    }

    public final void zzg(zzaf zzaf, zzgt zzgt) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznn(this, zzaf, zzgt));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(Exception exc) {
        zznq zznq = this.zzb;
        int i = zzen.zza;
        zznq.zzb(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(Exception exc) {
        zznq zznq = this.zzb;
        int i = zzen.zza;
        zznq.zzi(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(String str, long j, long j2) {
        zznq zznq = this.zzb;
        int i = zzen.zza;
        zznq.zzc(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(String str) {
        zznq zznq = this.zzb;
        int i = zzen.zza;
        zznq.zzd(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzgs zzgs) {
        zzgs.zza();
        zznq zznq = this.zzb;
        int i = zzen.zza;
        zznq.zze(zzgs);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(zzgs zzgs) {
        zznq zznq = this.zzb;
        int i = zzen.zza;
        zznq.zzf(zzgs);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(zzaf zzaf, zzgt zzgt) {
        int i = zzen.zza;
        this.zzb.zzg(zzaf, zzgt);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(long j) {
        zznq zznq = this.zzb;
        int i = zzen.zza;
        zznq.zzh(j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(boolean z) {
        zznq zznq = this.zzb;
        int i = zzen.zza;
        zznq.zzm(z);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(int i, long j, long j2) {
        zznq zznq = this.zzb;
        int i2 = zzen.zza;
        zznq.zzj(i, j, j2);
    }

    public final void zzr(long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzni(this, j));
        }
    }

    public final void zzs(boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznj(this, z));
        }
    }

    public final void zzt(int i, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzno(this, i, j, j2));
        }
    }
}
