package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzcho;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class NativeAdViewHolder {
    public static WeakHashMap zza = new WeakHashMap();
    private zzbmv zzb;
    private WeakReference zzc;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        Preconditions.checkNotNull(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            zzcho.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
        } else if (zza.get(view) != null) {
            zzcho.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
        } else {
            zza.put(view, this);
            this.zzc = new WeakReference(view);
            this.zzb = zzay.zza().zzi(view, zza(map), zza(map2));
        }
    }

    private static final HashMap zza(Map map) {
        if (map == null) {
            return new HashMap();
        }
        return new HashMap(map);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzb.zzb(ObjectWrapper.wrap(view));
        } catch (RemoteException e2) {
            zzcho.zzh("Unable to call setClickConfirmingView on delegate", e2);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    public void setNativeAd(NativeAd nativeAd) {
        ? zza2 = nativeAd.zza();
        WeakReference weakReference = this.zzc;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            zzcho.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zza.containsKey(view)) {
            zza.put(view, this);
        }
        zzbmv zzbmv = this.zzb;
        if (zzbmv != null) {
            try {
                zzbmv.zzc(zza2);
            } catch (RemoteException e2) {
                zzcho.zzh("Unable to call setNativeAd on delegate", e2);
            }
        }
    }

    public void unregisterNativeAd() {
        zzbmv zzbmv = this.zzb;
        if (zzbmv != null) {
            try {
                zzbmv.zzd();
            } catch (RemoteException e2) {
                zzcho.zzh("Unable to call unregisterNativeAd on delegate", e2);
            }
        }
        WeakReference weakReference = this.zzc;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}
