package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzcho;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public class AdService extends IntentService {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    /* access modifiers changed from: protected */
    public final void onHandleIntent(Intent intent) {
        try {
            zzay.zza().zzm(this, new zzbvq()).zze(intent);
        } catch (RemoteException e2) {
            zzcho.zzg("RemoteException calling handleNotificationIntent: ".concat(e2.toString()));
        }
    }
}
