package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdul extends zzbne {
    private final Context zza;
    private final zzdqg zzb;
    private zzdrg zzc;
    /* access modifiers changed from: private */
    public zzdqb zzd;

    public zzdul(Context context, zzdqg zzdqg, zzdrg zzdrg, zzdqb zzdqb) {
        this.zza = context;
        this.zzb = zzdqg;
        this.zzc = zzdrg;
        this.zzd = zzdqb;
    }

    public final zzdq zze() {
        return this.zzb.zzj();
    }

    public final zzbmi zzf() throws RemoteException {
        return this.zzd.zzc().zza();
    }

    public final zzbml zzg(String str) {
        return (zzbml) this.zzb.zzh().get(str);
    }

    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    public final String zzi() {
        return this.zzb.zzy();
    }

    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    public final List zzk() {
        SimpleArrayMap zzh = this.zzb.zzh();
        SimpleArrayMap zzi = this.zzb.zzi();
        String[] strArr = new String[(zzh.size() + zzi.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < zzh.size()) {
            strArr[i3] = (String) zzh.keyAt(i2);
            i2++;
            i3++;
        }
        while (i < zzi.size()) {
            strArr[i3] = (String) zzi.keyAt(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    public final void zzl() {
        zzdqb zzdqb = this.zzd;
        if (zzdqb != null) {
            zzdqb.zzaa();
        }
        this.zzd = null;
        this.zzc = null;
    }

    public final void zzm() {
        String zzA = this.zzb.zzA();
        if ("Google".equals(zzA)) {
            zze.zzj("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(zzA)) {
            zze.zzj("Not starting OMID session. OM partner name has not been configured.");
        } else {
            zzdqb zzdqb = this.zzd;
            if (zzdqb != null) {
                zzdqb.zzr(zzA, false);
            }
        }
    }

    public final void zzn(String str) {
        zzdqb zzdqb = this.zzd;
        if (zzdqb != null) {
            zzdqb.zzB(str);
        }
    }

    public final void zzo() {
        zzdqb zzdqb = this.zzd;
        if (zzdqb != null) {
            zzdqb.zzE();
        }
    }

    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdqb zzdqb;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof View) && this.zzb.zzu() != null && (zzdqb = this.zzd) != null) {
            zzdqb.zzF((View) unwrap);
        }
    }

    public final boolean zzq() {
        zzdqb zzdqb = this.zzd;
        if ((zzdqb == null || zzdqb.zzS()) && this.zzb.zzq() != null && this.zzb.zzr() == null) {
            return true;
        }
        return false;
    }

    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdrg zzdrg;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdrg = this.zzc) == null || !zzdrg.zzf((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzr().zzaq(new zzduk(this));
        return true;
    }

    public final boolean zzs() {
        IObjectWrapper zzu = this.zzb.zzu();
        if (zzu != null) {
            zzt.zzA().zzd(zzu);
            if (this.zzb.zzq() == null) {
                return true;
            }
            this.zzb.zzq().zzd("onSdkLoaded", new ArrayMap());
            return true;
        }
        zze.zzj("Trying to start OMID session before creation.");
        return false;
    }
}
