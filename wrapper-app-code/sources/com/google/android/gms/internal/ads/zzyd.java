package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzyd {
    private final Handler zza;
    private final zzye zzb;

    public zzyd(Handler handler, zzye zzye) {
        this.zza = zzye == null ? null : handler;
        this.zzb = zzye;
    }

    public final void zza(String str, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxz(this, str, j, j2));
        }
    }

    public final void zzb(String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzyc(this, str));
        }
    }

    public final void zzc(zzgs zzgs) {
        zzgs.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxy(this, zzgs));
        }
    }

    public final void zzd(int i, long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxt(this, i, j));
        }
    }

    public final void zze(zzgs zzgs) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxx(this, zzgs));
        }
    }

    public final void zzf(zzaf zzaf, zzgt zzgt) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzya(this, zzaf, zzgt));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(String str, long j, long j2) {
        zzye zzye = this.zzb;
        int i = zzen.zza;
        zzye.zzo(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(String str) {
        zzye zzye = this.zzb;
        int i = zzen.zza;
        zzye.zzp(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzgs zzgs) {
        zzgs.zza();
        zzye zzye = this.zzb;
        int i = zzen.zza;
        zzye.zzq(zzgs);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(int i, long j) {
        zzye zzye = this.zzb;
        int i2 = zzen.zza;
        zzye.zzk(i, j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzgs zzgs) {
        zzye zzye = this.zzb;
        int i = zzen.zza;
        zzye.zzr(zzgs);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzaf zzaf, zzgt zzgt) {
        int i = zzen.zza;
        this.zzb.zzt(zzaf, zzgt);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(Object obj, long j) {
        zzye zzye = this.zzb;
        int i = zzen.zza;
        zzye.zzl(obj, j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(long j, int i) {
        zzye zzye = this.zzb;
        int i2 = zzen.zza;
        zzye.zzs(j, i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(Exception exc) {
        zzye zzye = this.zzb;
        int i = zzen.zza;
        zzye.zzn(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(zzda zzda) {
        zzye zzye = this.zzb;
        int i = zzen.zza;
        zzye.zzu(zzda);
    }

    public final void zzq(Object obj) {
        if (this.zza != null) {
            this.zza.post(new zzxu(this, obj, SystemClock.elapsedRealtime()));
        }
    }

    public final void zzr(long j, int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxw(this, j, i));
        }
    }

    public final void zzs(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxv(this, exc));
        }
    }

    public final void zzt(zzda zzda) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzyb(this, zzda));
        }
    }
}
