package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcok extends zzdp {
    private final zzcjx zza;
    private final Object zzb = new Object();
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private zzdt zzf;
    private boolean zzg;
    private boolean zzh = true;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbnt zzn;

    public zzcok(zzcjx zzcjx, float f2, boolean z, boolean z2) {
        this.zza = zzcjx;
        this.zzi = f2;
        this.zzc = z;
        this.zzd = z2;
    }

    private final void zzw(int i, int i2, boolean z, boolean z2) {
        zzcib.zze.execute(new zzcoj(this, i, i2, z, z2));
    }

    private final void zzx(String str, Map map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzcib.zze.execute(new zzcoi(this, hashMap));
    }

    public final void zzc(float f2, float f3, int i, boolean z, float f4) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.zzb) {
            z2 = true;
            if (f3 == this.zzi) {
                if (f4 == this.zzk) {
                    z2 = false;
                }
            }
            this.zzi = f3;
            this.zzj = f2;
            z3 = this.zzh;
            this.zzh = z;
            i2 = this.zze;
            this.zze = i;
            float f5 = this.zzk;
            this.zzk = f4;
            if (Math.abs(f4 - f5) > 1.0E-4f) {
                this.zza.zzH().invalidate();
            }
        }
        if (z2) {
            try {
                zzbnt zzbnt = this.zzn;
                if (zzbnt != null) {
                    zzbnt.zze();
                }
            } catch (RemoteException e2) {
                zzcho.zzl("#007 Could not call remote method.", e2);
            }
        }
        zzw(i2, i, z3, z);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        zzdt zzdt;
        zzdt zzdt2;
        zzdt zzdt3;
        synchronized (this.zzb) {
            boolean z5 = false;
            boolean z6 = i != i2;
            boolean z7 = this.zzg;
            if (z7 || i2 != 1) {
                z3 = false;
            } else {
                i2 = 1;
                z3 = true;
            }
            if (!z6 || i2 != 1) {
                z4 = false;
            } else {
                i2 = 1;
                z4 = true;
            }
            boolean z8 = z6 && i2 == 2;
            boolean z9 = z6 && i2 == 3;
            if (z7 || z3) {
                z5 = true;
            }
            this.zzg = z5;
            if (z3) {
                try {
                    zzdt zzdt4 = this.zzf;
                    if (zzdt4 != null) {
                        zzdt4.zzi();
                    }
                } catch (RemoteException e2) {
                    zzcho.zzl("#007 Could not call remote method.", e2);
                }
            }
            if (z4 && (zzdt3 = this.zzf) != null) {
                zzdt3.zzh();
            }
            if (z8 && (zzdt2 = this.zzf) != null) {
                zzdt2.zzg();
            }
            if (z9) {
                zzdt zzdt5 = this.zzf;
                if (zzdt5 != null) {
                    zzdt5.zze();
                }
                this.zza.zzy();
            }
            if (!(z == z2 || (zzdt = this.zzf) == null)) {
                zzdt.zzf(z2);
            }
        }
    }

    public final float zze() {
        float f2;
        synchronized (this.zzb) {
            f2 = this.zzk;
        }
        return f2;
    }

    public final float zzf() {
        float f2;
        synchronized (this.zzb) {
            f2 = this.zzj;
        }
        return f2;
    }

    public final float zzg() {
        float f2;
        synchronized (this.zzb) {
            f2 = this.zzi;
        }
        return f2;
    }

    public final int zzh() {
        int i;
        synchronized (this.zzb) {
            i = this.zze;
        }
        return i;
    }

    public final zzdt zzi() throws RemoteException {
        zzdt zzdt;
        synchronized (this.zzb) {
            zzdt = this.zzf;
        }
        return zzdt;
    }

    public final void zzj(boolean z) {
        zzx(true != z ? "unmute" : "mute", (Map) null);
    }

    public final void zzk() {
        zzx("pause", (Map) null);
    }

    public final void zzl() {
        zzx("play", (Map) null);
    }

    public final void zzm(zzdt zzdt) {
        synchronized (this.zzb) {
            this.zzf = zzdt;
        }
    }

    public final void zzn() {
        zzx("stop", (Map) null);
    }

    public final boolean zzo() {
        boolean z;
        boolean zzp = zzp();
        synchronized (this.zzb) {
            z = false;
            if (!zzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    public final boolean zzp() {
        boolean z;
        synchronized (this.zzb) {
            z = false;
            if (this.zzc && this.zzl) {
                z = true;
            }
        }
        return z;
    }

    public final boolean zzq() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzh;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzr(Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(zzfl zzfl) {
        boolean z = zzfl.zza;
        boolean z2 = zzfl.zzb;
        boolean z3 = zzfl.zzc;
        synchronized (this.zzb) {
            this.zzl = z2;
            this.zzm = z3;
        }
        zzx("initialState", CollectionUtils.mapOf("muteStart", true != z ? BuildConfig.ADAPTER_VERSION : "1", "customControlsRequested", true != z2 ? BuildConfig.ADAPTER_VERSION : "1", "clickToExpandRequested", true != z3 ? BuildConfig.ADAPTER_VERSION : "1"));
    }

    public final void zzt(float f2) {
        synchronized (this.zzb) {
            this.zzj = f2;
        }
    }

    public final void zzu() {
        boolean z;
        int i;
        synchronized (this.zzb) {
            z = this.zzh;
            i = this.zze;
            this.zze = 3;
        }
        zzw(i, 3, z, z);
    }

    public final void zzv(zzbnt zzbnt) {
        synchronized (this.zzb) {
            this.zzn = zzbnt;
        }
    }
}
