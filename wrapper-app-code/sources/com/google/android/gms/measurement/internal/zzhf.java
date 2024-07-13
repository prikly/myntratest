package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.outcomes.OSOutcomeConstants;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhf implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzhx zzb;

    zzhf(zzhx zzhx, Bundle bundle) {
        this.zzb = zzhx;
        this.zza = bundle;
    }

    public final void run() {
        zzhx zzhx = this.zzb;
        Bundle bundle = this.zza;
        zzhx.zzg();
        zzhx.zza();
        Preconditions.checkNotNull(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        if (!zzhx.zzt.zzJ()) {
            zzhx.zzt.zzay().zzj().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkw zzkw = new zzkw(string, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE), string2);
        try {
            zzaw zzz = zzhx.zzt.zzv().zzz(bundle.getString(OSOutcomeConstants.APP_ID), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), string2, 0, true, true);
            zzaw zzz2 = zzhx.zzt.zzv().zzz(bundle.getString(OSOutcomeConstants.APP_ID), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), string2, 0, true, true);
            zzaw zzz3 = zzhx.zzt.zzv().zzz(bundle.getString(OSOutcomeConstants.APP_ID), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), string2, 0, true, true);
            zzhx.zzt.zzt().zzE(new zzac(bundle.getString(OSOutcomeConstants.APP_ID), string2, zzkw, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzz2, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zzz, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzz3));
        } catch (IllegalArgumentException unused) {
        }
    }
}
