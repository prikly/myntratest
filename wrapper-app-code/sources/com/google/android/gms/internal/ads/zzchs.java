package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzchs {
    public static Context zza(Context context) throws zzchr {
        return zzc(context).getModuleContext();
    }

    public static Object zzb(Context context, String str, zzchq zzchq) throws zzchr {
        try {
            return zzchq.zza(zzc(context).instantiate(str));
        } catch (Exception e2) {
            throw new zzchr(e2);
        }
    }

    private static DynamiteModule zzc(Context context) throws zzchr {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID);
        } catch (Exception e2) {
            throw new zzchr(e2);
        }
    }
}
