package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzffo {
    public static void zza(AtomicReference atomicReference, zzffn zzffn) {
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                zzffn.zza(obj);
            } catch (RemoteException e2) {
                zze.zzl("#007 Could not call remote method.", e2);
            } catch (NullPointerException e3) {
                zze.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e3);
            }
        }
    }
}
