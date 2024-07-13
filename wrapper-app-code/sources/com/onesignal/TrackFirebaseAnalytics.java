package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import com.onesignal.OneSignalDbContract;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

class TrackFirebaseAnalytics {
    private static final String EVENT_NOTIFICATION_INFLUENCE_OPEN = "os_notification_influence_open";
    private static final String EVENT_NOTIFICATION_OPENED = "os_notification_opened";
    private static final String EVENT_NOTIFICATION_RECEIVED = "os_notification_received";
    private static Class<?> FirebaseAnalyticsClass;
    private static AtomicLong lastOpenedTime;
    private static OSNotification lastReceivedNotification;
    private static AtomicLong lastReceivedTime;
    private Context appContext;
    private Object mFirebaseAnalyticsInstance;

    TrackFirebaseAnalytics(Context context) {
        this.appContext = context;
    }

    static boolean CanTrack() {
        try {
            FirebaseAnalyticsClass = Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void trackInfluenceOpenEvent() {
        if (lastReceivedTime != null && lastReceivedNotification != null) {
            long currentTimeMillis = OneSignal.getTime().getCurrentTimeMillis();
            if (currentTimeMillis - lastReceivedTime.get() <= 120000) {
                AtomicLong atomicLong = lastOpenedTime;
                if (atomicLong == null || currentTimeMillis - atomicLong.get() >= 30000) {
                    try {
                        Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance(this.appContext);
                        Method trackMethod = getTrackMethod(FirebaseAnalyticsClass);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "OneSignal");
                        bundle.putString("medium", OneSignalDbContract.NotificationTable.TABLE_NAME);
                        bundle.putString("notification_id", lastReceivedNotification.getNotificationId());
                        bundle.putString("campaign", getCampaignNameFromNotification(lastReceivedNotification));
                        trackMethod.invoke(firebaseAnalyticsInstance, new Object[]{EVENT_NOTIFICATION_INFLUENCE_OPEN, bundle});
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void trackOpenedEvent(OSNotificationOpenedResult oSNotificationOpenedResult) {
        if (lastOpenedTime == null) {
            lastOpenedTime = new AtomicLong();
        }
        lastOpenedTime.set(OneSignal.getTime().getCurrentTimeMillis());
        try {
            Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance(this.appContext);
            Method trackMethod = getTrackMethod(FirebaseAnalyticsClass);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", OneSignalDbContract.NotificationTable.TABLE_NAME);
            bundle.putString("notification_id", oSNotificationOpenedResult.getNotification().getNotificationId());
            bundle.putString("campaign", getCampaignNameFromNotification(oSNotificationOpenedResult.getNotification()));
            trackMethod.invoke(firebaseAnalyticsInstance, new Object[]{EVENT_NOTIFICATION_OPENED, bundle});
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void trackReceivedEvent(OSNotificationOpenedResult oSNotificationOpenedResult) {
        try {
            Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance(this.appContext);
            Method trackMethod = getTrackMethod(FirebaseAnalyticsClass);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", OneSignalDbContract.NotificationTable.TABLE_NAME);
            bundle.putString("notification_id", oSNotificationOpenedResult.getNotification().getNotificationId());
            bundle.putString("campaign", getCampaignNameFromNotification(oSNotificationOpenedResult.getNotification()));
            trackMethod.invoke(firebaseAnalyticsInstance, new Object[]{EVENT_NOTIFICATION_RECEIVED, bundle});
            if (lastReceivedTime == null) {
                lastReceivedTime = new AtomicLong();
            }
            lastReceivedTime.set(OneSignal.getTime().getCurrentTimeMillis());
            lastReceivedNotification = oSNotificationOpenedResult.getNotification();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private String getCampaignNameFromNotification(OSNotification oSNotification) {
        if (oSNotification.getTemplateName().isEmpty() || oSNotification.getTemplateId().isEmpty()) {
            return oSNotification.getTitle() != null ? oSNotification.getTitle().substring(0, Math.min(10, oSNotification.getTitle().length())) : "";
        }
        return oSNotification.getTemplateName() + " - " + oSNotification.getTemplateId();
    }

    private Object getFirebaseAnalyticsInstance(Context context) {
        if (this.mFirebaseAnalyticsInstance == null) {
            try {
                this.mFirebaseAnalyticsInstance = getInstanceMethod(FirebaseAnalyticsClass).invoke((Object) null, new Object[]{context});
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.mFirebaseAnalyticsInstance;
    }

    private static Method getTrackMethod(Class cls) {
        try {
            return cls.getMethod("logEvent", new Class[]{String.class, Bundle.class});
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static Method getInstanceMethod(Class cls) {
        try {
            return cls.getMethod("getInstance", new Class[]{Context.class});
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
