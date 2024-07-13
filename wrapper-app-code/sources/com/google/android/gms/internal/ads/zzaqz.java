package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaqz extends zzarx {
    public zzaqz(zzaqj zzaqj, String str, String str2, zzaml zzaml, int i, int i2) {
        super(zzaqj, "YC+pJVOZY25wDvtlWBPChLSjLU0iUh44DqTcbsbdAncZlcvrsOhFkSGXkkm3Hf4Z", "a17x9Lt/WQTGhUJAM6t8VqFWsXteADIsbbHvy7b7aMM=", zzaml, i, 5);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzm(-1);
        this.zze.zzl(-1);
        int[] iArr = (int[]) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()});
        synchronized (this.zze) {
            this.zze.zzm((long) iArr[0]);
            this.zze.zzl((long) iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                this.zze.zzk((long) i);
            }
        }
    }
}
