package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzbzj;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public class OfflineNotificationPoster extends Worker {
    private final zzbzj zza;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzay.zza().zzm(context, new zzbvq());
    }

    public final ListenableWorker.Result doWork() {
        try {
            this.zza.zzg(ObjectWrapper.wrap(getApplicationContext()), getInputData().getString("uri"), getInputData().getString("gws_query_id"));
            return ListenableWorker.Result.success();
        } catch (RemoteException unused) {
            return ListenableWorker.Result.failure();
        }
    }
}
