package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbes {
    /* access modifiers changed from: private */
    public zzbeh zza;
    /* access modifiers changed from: private */
    public boolean zzb;
    private final Context zzc;
    /* access modifiers changed from: private */
    public final Object zzd = new Object();

    zzbes(Context context) {
        this.zzc = context;
    }

    /* access modifiers changed from: package-private */
    public final Future zzc(zzbei zzbei) {
        zzbem zzbem = new zzbem(this);
        zzbeq zzbeq = new zzbeq(this, zzbei, zzbem);
        zzber zzber = new zzber(this, zzbem);
        synchronized (this.zzd) {
            zzbeh zzbeh = new zzbeh(this.zzc, zzt.zzt().zzb(), zzbeq, zzber);
            this.zza = zzbeh;
            zzbeh.checkAvailabilityAndConnect();
        }
        return zzbem;
    }

    static /* bridge */ /* synthetic */ void zze(zzbes zzbes) {
        synchronized (zzbes.zzd) {
            zzbeh zzbeh = zzbes.zza;
            if (zzbeh != null) {
                zzbeh.disconnect();
                zzbes.zza = null;
                Binder.flushPendingCommands();
            }
        }
    }
}
