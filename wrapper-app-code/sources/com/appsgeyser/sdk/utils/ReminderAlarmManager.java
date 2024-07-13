package com.appsgeyser.sdk.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appsgeyser.sdk.configuration.PreferencesCoder;
import com.appsgeyser.sdk.push.AlarmReceiver;

public class ReminderAlarmManager {
    public static void startReminderAlarm(Context context, int i, boolean z) {
        PendingIntent pendingIntent;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PreferencesCoder preferencesCoder = new PreferencesCoder(context);
        Intent intent = new Intent(context, AlarmReceiver.class);
        if (Build.VERSION.SDK_INT >= 23) {
            pendingIntent = PendingIntent.getBroadcast(context, 994, intent, 67108864);
        } else {
            pendingIntent = PendingIntent.getBroadcast(context, 994, intent, 0);
        }
        PendingIntent pendingIntent2 = pendingIntent;
        long j = ((long) i) * Constants.MILLIS_IN_DAY;
        if (alarmManager != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (z) {
                alarmManager.cancel(pendingIntent2);
                alarmManager.setRepeating(0, currentTimeMillis + j, Constants.MILLIS_IN_DAY, pendingIntent2);
                preferencesCoder.savePrefLong("appsgeyserSdk_lastReminderSetTiming", currentTimeMillis);
                return;
            }
            alarmManager.setRepeating(0, preferencesCoder.getPrefLong("appsgeyserSdk_lastReminderSetTiming", System.currentTimeMillis()) + j, Constants.MILLIS_IN_DAY, pendingIntent2);
        }
    }
}
