package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzari extends zzarx {
    private final zzapn zzi;
    private final long zzj;
    private final long zzk;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzari(zzaqj zzaqj, String str, String str2, zzaml zzaml, int i, int i2, zzapn zzapn, long j, long j2) {
        super(zzaqj, "uXer3UA11jv0SZxM8rEYS7HzXCd8ucSITS/VghhemVPtPpwzWKxJYN2vUPP5dw9E", "hs3/rpu0ZtoaPE+A6aRGA1SNmSKC7zzkLMT9t285eJ8=", zzaml, i, 11);
        this.zzi = zzapn;
        this.zzj = j;
        this.zzk = j2;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzapn zzapn = this.zzi;
        if (zzapn != null) {
            zzapl zzapl = new zzapl((String) this.zzf.invoke((Object) null, new Object[]{zzapn.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)}));
            synchronized (this.zze) {
                this.zze.zzz(zzapl.zza.longValue());
                if (zzapl.zzb.longValue() >= 0) {
                    this.zze.zzQ(zzapl.zzb.longValue());
                }
                if (zzapl.zzc.longValue() >= 0) {
                    this.zze.zzf(zzapl.zzc.longValue());
                }
            }
        }
    }
}
