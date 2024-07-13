package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzfwq extends zzash implements zzfwr {
    public static zzfwr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return queryLocalInterface instanceof zzfwr ? (zzfwr) queryLocalInterface : new zzfwp(iBinder);
    }
}
