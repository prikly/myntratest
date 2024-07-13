package com.onesignal;

import androidx.core.app.NotificationCompat;

public class OSMutableNotification extends OSNotification {
    OSMutableNotification(OSNotification oSNotification) {
        super(oSNotification);
    }

    public void setExtender(NotificationCompat.Extender extender) {
        setNotificationExtender(extender);
    }

    public void setAndroidNotificationId(int i) {
        super.setAndroidNotificationId(i);
    }
}
