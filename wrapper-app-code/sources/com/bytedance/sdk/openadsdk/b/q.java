package com.bytedance.sdk.openadsdk.b;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.outcomes.OSOutcomeConstants;

/* compiled from: StatsBatchEventRepertoryImpl */
public class q extends s {
    public String c() {
        return "logstatsbatch";
    }

    public q(Context context) {
        super(context);
    }

    public int b() {
        return this.f360a.b("stats_serverbusy_retrycount", 0);
    }

    public void a(int i) {
        this.f360a.a("stats_serverbusy_retrycount", i);
    }

    public static String d() {
        return "CREATE TABLE IF NOT EXISTS " + "logstatsbatch" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + OSOutcomeConstants.OUTCOME_ID + " TEXT UNIQUE," + AppMeasurementSdk.ConditionalUserProperty.VALUE + " TEXT ," + "gen_time" + " TEXT , " + "retry" + " INTEGER default 0" + ")";
    }
}
