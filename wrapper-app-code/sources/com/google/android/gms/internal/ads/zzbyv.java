package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbyv extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbyv(zzbmd zzbmd) {
        try {
            this.zzb = zzbmd.zzg();
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
            this.zzb = "";
        }
        try {
            for (Object next : zzbmd.zzh()) {
                zzbml zzg = next instanceof IBinder ? zzbmk.zzg((IBinder) next) : null;
                if (zzg != null) {
                    this.zza.add(new zzbyx(zzg));
                }
            }
        } catch (RemoteException e3) {
            zzcho.zzh("", e3);
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    public final CharSequence getText() {
        return this.zzb;
    }
}
