package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzcob implements Runnable {
    public final /* synthetic */ IObjectWrapper zza;

    public /* synthetic */ zzcob(IObjectWrapper iObjectWrapper) {
        this.zza = iObjectWrapper;
    }

    public final void run() {
        IObjectWrapper iObjectWrapper = this.zza;
        zzt.zzA();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzey)).booleanValue() && zzfpr.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzfpt) {
                ((zzfpt) unwrap).zzc();
            }
        }
    }
}
