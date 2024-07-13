package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzask extends zzash implements zzasl {
    public static zzasl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof zzasl ? (zzasl) queryLocalInterface : new zzasj(iBinder);
    }
}
