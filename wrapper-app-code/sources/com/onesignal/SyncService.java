package com.onesignal;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.onesignal.OSSyncService;

public class SyncService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        OSSyncService.getInstance().doBackgroundSync(this, new OSSyncService.LegacySyncRunnable(this));
        return 1;
    }
}
