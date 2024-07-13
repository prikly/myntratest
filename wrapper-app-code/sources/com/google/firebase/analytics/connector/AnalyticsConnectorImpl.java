package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.events.Event;
import com.google.firebase.events.Subscriber;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public class AnalyticsConnectorImpl implements AnalyticsConnector {
    private static volatile AnalyticsConnector zzc;
    final AppMeasurementSdk zza;
    final Map zzb = new ConcurrentHashMap();

    AnalyticsConnectorImpl(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.zza = appMeasurementSdk;
    }

    static /* synthetic */ void zza(Event event) {
        boolean z = ((DataCollectionDefaultChange) event.getPayload()).enabled;
        synchronized (AnalyticsConnectorImpl.class) {
            ((AnalyticsConnectorImpl) Preconditions.checkNotNull(zzc)).zza.zza(z);
        }
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (zzc.zzl(str) && zzc.zzj(str2, bundle) && zzc.zzh(str, str2, bundle)) {
            zzc.zze(str, str2, bundle);
            this.zza.logEvent(str, str2, bundle);
        }
    }

    public void setUserProperty(String str, String str2, Object obj) {
        if (zzc.zzl(str) && zzc.zzm(str, str2)) {
            this.zza.setUserProperty(str, str2, obj);
        }
    }

    public static AnalyticsConnector getInstance(FirebaseApp firebaseApp, Context context, Subscriber subscriber) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(subscriber);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzc == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                if (zzc == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.isDefaultApp()) {
                        subscriber.subscribe(DataCollectionDefaultChange.class, zza.zza, zzb.zza);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    zzc = new AnalyticsConnectorImpl(zzef.zzg(context, (String) null, (String) null, (String) null, bundle).zzd());
                }
            }
        }
        return zzc;
    }
}
