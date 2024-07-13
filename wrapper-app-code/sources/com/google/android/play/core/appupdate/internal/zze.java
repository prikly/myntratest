package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.play:app-update@@2.0.0 */
public abstract class zze extends zzb implements zzf {
    public static zzf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof zzf ? (zzf) queryLocalInterface : new zzd(iBinder);
    }
}
