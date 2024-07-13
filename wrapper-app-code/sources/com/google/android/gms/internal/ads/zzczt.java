package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzczt extends zzcyl {
    private final zzboc zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzczt(zzdam zzdam, zzboc zzboc, Runnable runnable, Executor executor) {
        super(zzdam);
        this.zzc = zzboc;
        this.zzd = runnable;
        this.zze = executor;
    }

    static /* synthetic */ void zzi(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final int zza() {
        return 0;
    }

    public final void zzab() {
        this.zze.execute(new zzczs(this, new zzczr(new AtomicReference(this.zzd))));
    }

    public final View zzc() {
        return null;
    }

    public final zzdq zzd() {
        return null;
    }

    public final zzfim zze() {
        return null;
    }

    public final zzfim zzf() {
        return null;
    }

    public final void zzg() {
    }

    public final void zzh(ViewGroup viewGroup, zzq zzq) {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(Runnable runnable) {
        try {
            if (!this.zzc.zzb(ObjectWrapper.wrap(runnable))) {
                zzi(((zzczr) runnable).zza);
            }
        } catch (RemoteException unused) {
            zzi(((zzczr) runnable).zza);
        }
    }
}
