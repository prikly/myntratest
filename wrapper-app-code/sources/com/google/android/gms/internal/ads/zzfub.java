package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfub {
    final zzfue zza;
    final boolean zzb;

    private zzfub(zzfue zzfue) {
        this.zza = zzfue;
        this.zzb = zzfue != null;
    }

    public static zzfub zzb(Context context, String str, String str2) {
        zzfue zzfue;
        try {
            IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
            if (instantiate == null) {
                zzfue = null;
            } else {
                IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                zzfue = queryLocalInterface instanceof zzfue ? (zzfue) queryLocalInterface : new zzfuc(instantiate);
            }
            try {
                zzfue.zze(ObjectWrapper.wrap(context), str, (String) null);
                Log.i("GASS", "GassClearcutLogger Initialized.");
                return new zzfub(zzfue);
            } catch (RemoteException | zzftd | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfub(new zzfuf());
            }
        } catch (Exception e2) {
            throw new zzftd(e2);
        } catch (Exception e3) {
            throw new zzftd(e3);
        }
    }

    public static zzfub zzc() {
        zzfuf zzfuf = new zzfuf();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfub(zzfuf);
    }

    public final zzfua zza(byte[] bArr) {
        return new zzfua(this, bArr, (zzftz) null);
    }
}
