package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfjz {
    private static zzfjz zza;
    private final Context zzb;
    private final zzcl zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfjz(Context context, zzcl zzcl) {
        this.zzb = context;
        this.zzc = zzcl;
    }

    static zzcl zza(Context context) {
        try {
            return zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context}));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            zze.zzh("Failed to retrieve lite SDK info.", e2);
            return null;
        }
    }

    public static zzfjz zzd(Context context) {
        synchronized (zzfjz.class) {
            zzfjz zzfjz = zza;
            if (zzfjz != null) {
                return zzfjz;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzblb.zzb.zze()).longValue();
            zzcl zzcl = null;
            if (longValue > 0 && longValue <= 224400003) {
                zzcl = zza(applicationContext);
            }
            zzfjz zzfjz2 = new zzfjz(applicationContext, zzcl);
            zza = zzfjz2;
            return zzfjz2;
        }
    }

    public final zzbvt zzb() {
        return (zzbvt) this.zzd.get();
    }

    public final zzchu zzc(int i, boolean z, int i2) {
        zzt.zzp();
        boolean zzA = zzs.zzA(this.zzb);
        zzchu zzchu = new zzchu(224400000, i2, true, zzA);
        if (!((Boolean) zzblb.zzc.zze()).booleanValue()) {
            return zzchu;
        }
        zzcl zzcl = this.zzc;
        zzen zzen = null;
        if (zzcl != null) {
            try {
                zzen = zzcl.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        if (zzen == null) {
            return zzchu;
        }
        return new zzchu(224400000, zzen.zza(), true, zzA);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(com.google.android.gms.internal.ads.zzbvt r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbkl r0 = com.google.android.gms.internal.ads.zzblb.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0023
            com.google.android.gms.ads.internal.client.zzcl r0 = r3.zzc
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            r0 = r1
            goto L_0x0019
        L_0x0015:
            com.google.android.gms.internal.ads.zzbvt r0 = r0.getAdapterCreator()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0019:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 != 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r4 = r0
        L_0x001f:
            com.google.android.gms.internal.ads.zzfjy.zza(r2, r1, r4)
            return
        L_0x0023:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfjy.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjz.zze(com.google.android.gms.internal.ads.zzbvt):void");
    }
}
