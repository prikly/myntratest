package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzg;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.ArrayUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbeh extends zzc {
    zzbeh(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzccp.zza(context), looper, 123, baseConnectionCallbacks, baseOnConnectionFailedListener, (String) null);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof zzbek ? (zzbek) queryLocalInterface : new zzbek(iBinder);
    }

    public final Feature[] getApiFeatures() {
        return zzg.zzb;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        return ((Boolean) zzba.zzc().zzb(zzbjj.zzbF)).booleanValue() && ArrayUtils.contains((T[]) getAvailableFeatures(), zzg.zza);
    }

    public final zzbek zzq() throws DeadObjectException {
        return (zzbek) super.getService();
    }
}
