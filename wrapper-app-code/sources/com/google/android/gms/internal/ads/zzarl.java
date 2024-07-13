package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzarl extends zzarx {
    public zzarl(zzaqj zzaqj, String str, String str2, zzaml zzaml, int i, int i2) {
        super(zzaqj, "Gdhi15k7cHPLVK8ak2AW2U8wWjJccRmTSeAAE7zSYYmR363nmijtloZo3WMMU3lH", "BmCZi3wg7cX26+HP9p5KWWgFeCy6CBwpe84PbqLu08A=", zzaml, i, 3);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        boolean booleanValue = ((Boolean) zzba.zzc().zzb(zzbjj.zzcn)).booleanValue();
        zzapq zzapq = new zzapq((String) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb(), Boolean.valueOf(booleanValue)}));
        synchronized (this.zze) {
            this.zze.zzj(zzapq.zza);
            this.zze.zzC(zzapq.zzb);
        }
    }
}
