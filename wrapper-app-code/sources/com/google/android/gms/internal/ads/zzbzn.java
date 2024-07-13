package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbzn extends RemoteCreator {
    public zzbzn() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzbzt ? (zzbzt) queryLocalInterface : new zzbzr(iBinder);
    }

    public final zzbzq zza(Activity activity) {
        try {
            IBinder zze = ((zzbzt) getRemoteCreatorInstance(activity)).zze(ObjectWrapper.wrap(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzbzq ? (zzbzq) queryLocalInterface : new zzbzo(zze);
        } catch (RemoteException e2) {
            zzcho.zzk("Could not create remote AdOverlay.", e2);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e3) {
            zzcho.zzk("Could not create remote AdOverlay.", e3);
            return null;
        }
    }
}
