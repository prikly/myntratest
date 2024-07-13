package com.bytedance.sdk.openadsdk.b;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.outcomes.OSOutcomeConstants;

/* compiled from: HighPriorityEventRepertoryImpl */
public class m extends g {
    public String d() {
        return "loghighpriority";
    }

    public m(Context context) {
        super(context);
    }

    public static String f() {
        return "CREATE TABLE IF NOT EXISTS " + "loghighpriority" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + OSOutcomeConstants.OUTCOME_ID + " TEXT UNIQUE," + AppMeasurementSdk.ConditionalUserProperty.VALUE + " TEXT ," + "gen_time" + " TEXT , " + "retry" + " INTEGER default 0" + ")";
    }
}
