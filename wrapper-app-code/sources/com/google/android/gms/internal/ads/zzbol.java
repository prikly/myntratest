package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbol extends RemoteCreator {
    public zzbol() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof zzbmy ? (zzbmy) queryLocalInterface : new zzbmw(iBinder);
    }

    public final zzbmv zza(View view, HashMap hashMap, HashMap hashMap2) {
        try {
            IBinder zze = ((zzbmy) getRemoteCreatorInstance(view.getContext())).zze(ObjectWrapper.wrap(view), ObjectWrapper.wrap(hashMap), ObjectWrapper.wrap(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof zzbmv ? (zzbmv) queryLocalInterface : new zzbmt(zze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzcho.zzk("Could not create remote NativeAdViewHolderDelegate.", e2);
            return null;
        }
    }
}
