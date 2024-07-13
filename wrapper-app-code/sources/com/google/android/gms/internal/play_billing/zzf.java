package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public abstract class zzf extends zzi implements zzg {
    public zzf() {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzj.zzb(parcel);
        zza((Bundle) zzj.zza(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
