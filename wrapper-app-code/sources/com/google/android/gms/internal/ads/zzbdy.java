package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbdy {
    private zzbu zza;
    private final Context zzb;
    private final String zzc;
    private final zzdx zzd;
    private final int zze;
    private final AppOpenAd.AppOpenAdLoadCallback zzf;
    private final zzbvq zzg = new zzbvq();
    private final zzp zzh;

    public zzbdy(Context context, String str, zzdx zzdx, int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = zzdx;
        this.zze = i;
        this.zzf = appOpenAdLoadCallback;
        this.zzh = zzp.zza;
    }

    public final void zza() {
        try {
            zzbu zzd2 = zzay.zza().zzd(this.zzb, zzq.zzb(), this.zzc, this.zzg);
            this.zza = zzd2;
            if (zzd2 != null) {
                if (this.zze != 3) {
                    this.zza.zzI(new zzw(this.zze));
                }
                this.zza.zzH(new zzbdl(this.zzf, this.zzc));
                this.zza.zzaa(this.zzh.zza(this.zzb, this.zzd));
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
    }
}
