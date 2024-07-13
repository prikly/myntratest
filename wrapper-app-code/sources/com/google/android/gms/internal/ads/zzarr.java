package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzarr extends zzarx {
    private final zzaqr zzi;
    private long zzj;

    public zzarr(zzaqj zzaqj, String str, String str2, zzaml zzaml, int i, int i2, zzaqr zzaqr) {
        super(zzaqj, "yXY8/mGMSUXAD/doic4NhOcSiaIXIqWtQGozx2RibPkZkGDEn3zdgJKu8ncuIp2B", "lomf+VO0Ecj7WivSbw6aVWdgbo/lmDysFNgyXwY+gTY=", zzaml, i, 53);
        this.zzi = zzaqr;
        if (zzaqr != null) {
            this.zzj = zzaqr.zza();
        }
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            this.zze.zzP(((Long) this.zzf.invoke((Object) null, new Object[]{Long.valueOf(this.zzj)})).longValue());
        }
    }
}
