package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzapj;
import com.google.android.gms.internal.ads.zzcho;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzq extends AsyncTask {
    final /* synthetic */ zzs zza;

    /* synthetic */ zzq(zzs zzs, zzp zzp) {
        this.zza = zzs;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzs zzs = this.zza;
        if (zzs.zzf != null && str != null) {
            zzs.zzf.loadUrl(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        try {
            zzs zzs = this.zza;
            zzs.zzh = (zzapj) zzs.zzc.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e2) {
            zzcho.zzk("", e2);
        } catch (TimeoutException e3) {
            zzcho.zzk("", e3);
        }
        return this.zza.zzp();
    }
}
