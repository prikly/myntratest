package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzcdu implements RewardItem {
    private final zzcdh zza;

    public zzcdu(zzcdh zzcdh) {
        this.zza = zzcdh;
    }

    public final int getAmount() {
        zzcdh zzcdh = this.zza;
        if (zzcdh != null) {
            try {
                return zzcdh.zze();
            } catch (RemoteException e2) {
                zzcho.zzk("Could not forward getAmount to RewardItem", e2);
            }
        }
        return 0;
    }

    public final String getType() {
        zzcdh zzcdh = this.zza;
        if (zzcdh != null) {
            try {
                return zzcdh.zzf();
            } catch (RemoteException e2) {
                zzcho.zzk("Could not forward getType to RewardItem", e2);
            }
        }
        return null;
    }
}
