package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbrd;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbzj;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzccu;
import com.google.android.gms.internal.ads.zzcdk;
import com.google.android.gms.internal.ads.zzcgf;
import com.google.android.gms.internal.ads.zzchu;
import com.google.android.gms.internal.ads.zzcpj;
import com.google.android.gms.internal.ads.zzdra;
import com.google.android.gms.internal.ads.zzdrc;
import com.google.android.gms.internal.ads.zzeap;
import com.google.android.gms.internal.ads.zzere;
import com.google.android.gms.internal.ads.zzfdj;
import com.google.android.gms.internal.ads.zzfdk;
import com.google.android.gms.internal.ads.zzfex;
import com.google.android.gms.internal.ads.zzfgq;
import com.google.android.gms.internal.ads.zzfie;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class ClientApi extends zzcd {
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbvt zzbvt, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzere(zzcpj.zza(context, zzbvt, i), context, str);
    }

    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbvt zzbvt, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfdj zzs = zzcpj.zza(context, zzbvt, i).zzs();
        zzs.zza(str);
        zzs.zzb(context);
        zzfdk zzc = zzs.zzc();
        if (i >= ((Integer) zzba.zzc().zzb(zzbjj.zzeI)).intValue()) {
            return zzc.zzb();
        }
        return zzc.zza();
    }

    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbvt zzbvt, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfex zzt = zzcpj.zza(context, zzbvt, i).zzt();
        zzt.zzc(context);
        zzt.zza(zzq);
        zzt.zzb(str);
        return zzt.zzd().zza();
    }

    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbvt zzbvt, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfgq zzu = zzcpj.zza(context, zzbvt, i).zzu();
        zzu.zzc(context);
        zzu.zza(zzq);
        zzu.zzb(str);
        return zzu.zzd().zza();
    }

    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzq, String str, int i) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzq, str, new zzchu(224400000, i, true, false));
    }

    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) {
        return zzcpj.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), (zzbvt) null, i).zzb();
    }

    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbvt zzbvt, int i) {
        return zzcpj.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvt, i).zzl();
    }

    public final zzbmp zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdrc((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 224400000);
    }

    public final zzbmv zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdra((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    public final zzbrd zzk(IObjectWrapper iObjectWrapper, zzbvt zzbvt, int i, zzbra zzbra) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeap zzj = zzcpj.zza(context, zzbvt, i).zzj();
        zzj.zzb(context);
        zzj.zza(zzbra);
        return zzj.zzc().zzd();
    }

    public final zzbzj zzl(IObjectWrapper iObjectWrapper, zzbvt zzbvt, int i) {
        return zzcpj.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvt, i).zzm();
    }

    public final zzbzq zzm(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new zzt(activity);
        }
        int i = zza.zzk;
        if (i == 1) {
            return new zzs(activity);
        }
        if (i == 2) {
            return new zzae(activity);
        }
        if (i == 3) {
            return new zzaf(activity);
        }
        if (i != 4) {
            return i != 5 ? new zzt(activity) : new zzac(activity);
        }
        return new zzy(activity, zza);
    }

    public final zzccu zzn(IObjectWrapper iObjectWrapper, zzbvt zzbvt, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfie zzv = zzcpj.zza(context, zzbvt, i).zzv();
        zzv.zzb(context);
        return zzv.zzc().zzb();
    }

    public final zzcdk zzo(IObjectWrapper iObjectWrapper, String str, zzbvt zzbvt, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfie zzv = zzcpj.zza(context, zzbvt, i).zzv();
        zzv.zzb(context);
        zzv.zza(str);
        return zzv.zzc().zza();
    }

    public final zzcgf zzp(IObjectWrapper iObjectWrapper, zzbvt zzbvt, int i) {
        return zzcpj.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvt, i).zzp();
    }
}
