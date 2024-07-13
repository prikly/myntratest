package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzcah {
    private static zzcgf zza;
    private final Context zzb;
    private final AdFormat zzc;
    private final zzdx zzd;

    public zzcah(Context context, AdFormat adFormat, zzdx zzdx) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzdx;
    }

    public static zzcgf zza(Context context) {
        zzcgf zzcgf;
        synchronized (zzcah.class) {
            if (zza == null) {
                zza = zzay.zza().zzr(context, new zzbvq());
            }
            zzcgf = zza;
        }
        return zzcgf;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzl zzl;
        zzcgf zza2 = zza(this.zzb);
        if (zza2 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zzb);
        zzdx zzdx = this.zzd;
        if (zzdx == null) {
            zzl = new zzm().zza();
        } else {
            zzl = zzp.zza.zza(this.zzb, zzdx);
        }
        try {
            zza2.zze(wrap, new zzcgj((String) null, this.zzc.name(), (zzq) null, zzl), new zzcag(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
