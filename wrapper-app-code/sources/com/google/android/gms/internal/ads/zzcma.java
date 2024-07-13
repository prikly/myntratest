package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzcma implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcma(zzcjx zzcjx) {
        this.zza = zzcjx.getContext();
        this.zzb = zzt.zzp().zzc(this.zza, zzcjx.zzp().zza);
        this.zzc = new WeakReference(zzcjx);
    }

    static /* bridge */ /* synthetic */ void zza(zzcma zzcma, String str, Map map) {
        zzcjx zzcjx = (zzcjx) zzcma.zzc.get();
        if (zzcjx != null) {
            zzcjx.zzd("onPrecacheEvent", map);
        }
    }

    public void release() {
    }

    public abstract void zzb();

    public final void zzc(String str, String str2, String str3, String str4) {
        zzchh.zza.post(new zzclz(this, str, str2, str3, str4));
    }

    /* access modifiers changed from: protected */
    public final void zzd(String str, String str2, int i) {
        zzchh.zza.post(new zzclx(this, str, str2, i));
    }

    public final void zze(String str, String str2, long j) {
        zzchh.zza.post(new zzcly(this, str, str2, j));
    }

    public final void zzf(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        zzchh.zza.post(new zzclw(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    public final void zzg(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        Handler handler = zzchh.zza;
        zzclv zzclv = r0;
        zzclv zzclv2 = new zzclv(this, str, str2, j, j2, j3, j4, j5, z, i, i2);
        handler.post(zzclv);
    }

    /* access modifiers changed from: protected */
    public void zzh(int i) {
    }

    /* access modifiers changed from: protected */
    public void zzn(int i) {
    }

    /* access modifiers changed from: protected */
    public void zzo(int i) {
    }

    /* access modifiers changed from: protected */
    public void zzp(int i) {
    }

    public abstract boolean zzq(String str);

    public boolean zzr(String str, String[] strArr) {
        return zzq(str);
    }

    public boolean zzs(String str, String[] strArr, zzcls zzcls) {
        return zzq(str);
    }
}
