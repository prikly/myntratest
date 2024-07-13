package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzart extends zzarx {
    public zzart(zzaqj zzaqj, String str, String str2, zzaml zzaml, int i, int i2) {
        super(zzaqj, "n8eevinWOirOSPZe75LOlEw/rjd2yNw2EibrKlsvfLNOq/qV6IorYV+yJwJVSrU8", "z60w6+pWlGB4RCxkD/LDTBZ25WofjghjXXagNVA9cCM=", zzaml, i, 48);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzaf(3);
        boolean booleanValue = ((Boolean) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()})).booleanValue();
        synchronized (this.zze) {
            if (booleanValue) {
                this.zze.zzaf(2);
            } else {
                this.zze.zzaf(1);
            }
        }
    }
}
