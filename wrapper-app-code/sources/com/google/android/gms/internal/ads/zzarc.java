package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzarc extends zzarx {
    public zzarc(zzaqj zzaqj, String str, String str2, zzaml zzaml, int i, int i2) {
        super(zzaqj, "dJwO6Cl9MRqD0Gc5K3JTdZycyClQqkAPKU0XDLxQQPeGCWqiQha6f2rP1wtqtwx3", "rLNLoOjJQBnuvnCDgD+yaoADKoI2087E89SpHXw4yFg=", zzaml, i, 24);
    }

    private final void zzc() {
        AdvertisingIdClient zzh = this.zzb.zzh();
        if (zzh != null) {
            try {
                AdvertisingIdClient.Info info = zzh.getInfo();
                String zzd = zzaqn.zzd(info.getId());
                if (zzd != null) {
                    synchronized (this.zze) {
                        this.zze.zzs(zzd);
                        this.zze.zzr(info.isLimitAdTrackingEnabled());
                        this.zze.zzab(6);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (!this.zzb.zzq()) {
            synchronized (this.zze) {
                this.zze.zzs((String) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()}));
            }
            return;
        }
        zzc();
    }

    public final Void zzk() throws Exception {
        if (this.zzb.zzr()) {
            super.zzk();
            return null;
        }
        if (this.zzb.zzq()) {
            zzc();
        }
        return null;
    }
}
