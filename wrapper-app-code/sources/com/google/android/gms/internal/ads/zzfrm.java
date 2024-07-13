package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzfrm extends AsyncTask {
    private zzfrn zza;
    protected final zzfre zzd;

    public zzfrm(zzfre zzfre, byte[] bArr) {
        this.zzd = zzfre;
    }

    /* access modifiers changed from: protected */
    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfrn zzfrn = this.zza;
        if (zzfrn != null) {
            zzfrn.zza(this);
        }
    }

    public final void zzb(zzfrn zzfrn) {
        this.zza = zzfrn;
    }
}
