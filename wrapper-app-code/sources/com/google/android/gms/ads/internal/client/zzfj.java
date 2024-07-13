package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbob;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzfj extends zzbob {
    private final ShouldDelayBannerRenderingListener zza;

    public zzfj(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
        this.zza = shouldDelayBannerRenderingListener;
    }

    public final boolean zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        return this.zza.shouldDelayBannerRendering((Runnable) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
