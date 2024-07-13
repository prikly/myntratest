package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzemh implements zzekx {
    private final Context zza;
    private final zzczi zzb;
    /* access modifiers changed from: private */
    public View zzc;
    /* access modifiers changed from: private */
    public zzbwc zzd;

    public zzemh(Context context, zzczi zzczi) {
        this.zza = context;
        this.zzb = zzczi;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl, zzeom {
        View view;
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzgZ)).booleanValue() || !zzfil.zzai) {
            view = this.zzc;
        } else {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfjl(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                } else if (zzf) {
                    try {
                        view = (View) zzger.zzn(zzger.zzi((Object) null), new zzemd(this, view, zzfil), zzcib.zze).get();
                    } catch (InterruptedException | ExecutionException e2) {
                        throw new zzfjl(e2);
                    }
                }
            } catch (RemoteException e3) {
                throw new zzfjl(e3);
            }
        }
        zzcym zza2 = this.zzb.zza(new zzdbc(zzfix, zzfil, zzekt.zza), new zzcys(view, (zzcno) null, new zzeme(zzekt), (zzfim) zzfil.zzv.get(0)));
        zza2.zzg().zza(view);
        ((zzems) zzekt.zzc).zzc(zza2.zzh());
        return zza2.zza();
    }

    public final void zzb(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl {
        try {
            ((zzbxq) zzekt.zzb).zzq(zzfil.zzaa);
            if (!((Boolean) zzba.zzc().zzb(zzbjj.zzgZ)).booleanValue() || !zzfil.zzai) {
                ((zzbxq) zzekt.zzb).zzj(zzfil.zzV, zzfil.zzw.toString(), zzfix.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzemg(this, zzekt, (zzemf) null), (zzbvz) zzekt.zzc, zzfix.zza.zza.zze);
            } else {
                ((zzbxq) zzekt.zzb).zzk(zzfil.zzV, zzfil.zzw.toString(), zzfix.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzemg(this, zzekt, (zzemf) null), (zzbvz) zzekt.zzc, zzfix.zza.zza.zze);
            }
        } catch (RemoteException e2) {
            throw new zzfjl(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzc(View view, zzfil zzfil, Object obj) throws Exception {
        return zzger.zzi(zzczz.zza(this.zza, view, zzfil));
    }
}
