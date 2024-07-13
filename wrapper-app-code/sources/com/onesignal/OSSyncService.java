package com.onesignal;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;

class OSSyncService extends OSBackgroundSync {
    private static final Object INSTANCE_LOCK = new Object();
    private static final long SYNC_AFTER_BG_DELAY_MS = 30000;
    private static final int SYNC_TASK_ID = 2071862118;
    private static final String SYNC_TASK_THREAD_ID = "OS_SYNCSRV_BG_SYNC";
    private static OSSyncService sInstance;
    /* access modifiers changed from: private */
    public Long nextScheduledSyncTimeMs = 0L;

    /* access modifiers changed from: protected */
    public int getSyncTaskId() {
        return SYNC_TASK_ID;
    }

    /* access modifiers changed from: protected */
    public String getSyncTaskThreadId() {
        return SYNC_TASK_THREAD_ID;
    }

    OSSyncService() {
    }

    static OSSyncService getInstance() {
        if (sInstance == null) {
            synchronized (INSTANCE_LOCK) {
                if (sInstance == null) {
                    sInstance = new OSSyncService();
                }
            }
        }
        return sInstance;
    }

    /* access modifiers changed from: protected */
    public Class getSyncServiceJobClass() {
        return SyncJobService.class;
    }

    /* access modifiers changed from: protected */
    public Class getSyncServicePendingIntentClass() {
        return SyncService.class;
    }

    /* access modifiers changed from: protected */
    public void scheduleSyncTask(Context context) {
        OneSignal.Log(OneSignal.LOG_LEVEL.VERBOSE, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000");
        scheduleSyncTask(context, SYNC_AFTER_BG_DELAY_MS);
    }

    /* access modifiers changed from: protected */
    public void scheduleSyncTask(Context context, long j) {
        synchronized (LOCK) {
            if (this.nextScheduledSyncTimeMs.longValue() == 0 || OneSignal.getTime().getCurrentTimeMillis() + j <= this.nextScheduledSyncTimeMs.longValue()) {
                if (j < 5000) {
                    j = 5000;
                }
                scheduleBackgroundSyncTask(context, j);
                this.nextScheduledSyncTimeMs = Long.valueOf(OneSignal.getTime().getCurrentTimeMillis() + j);
                return;
            }
            OneSignal.Log(OneSignal.LOG_LEVEL.VERBOSE, "OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.nextScheduledSyncTimeMs);
        }
    }

    /* access modifiers changed from: package-private */
    public void scheduleLocationUpdateTask(Context context, long j) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.VERBOSE;
        OneSignal.Log(log_level, "OSSyncService scheduleLocationUpdateTask:delayMs: " + j);
        scheduleSyncTask(context, j);
    }

    /* access modifiers changed from: package-private */
    public void cancelSyncTask(Context context) {
        synchronized (LOCK) {
            this.nextScheduledSyncTimeMs = 0L;
            if (!LocationController.scheduleUpdate(context)) {
                cancelBackgroundSyncTask(context);
            }
        }
    }

    static abstract class SyncRunnable implements Runnable {
        /* access modifiers changed from: protected */
        public abstract void stopSync();

        SyncRunnable() {
        }

        public final void run() {
            synchronized (OSBackgroundSync.LOCK) {
                Long unused = OSSyncService.getInstance().nextScheduledSyncTimeMs = 0L;
            }
            if (OneSignal.getUserId() == null) {
                stopSync();
                return;
            }
            OneSignal.appId = OneSignal.getSavedAppId();
            OneSignalStateSynchronizer.initUserState();
            try {
                final ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                LocationController.getLocation(OneSignal.appContext, false, false, new LocationController.LocationHandler() {
                    public LocationController.PermissionType getType() {
                        return LocationController.PermissionType.SYNC_SERVICE;
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.onesignal.LocationController$LocationPoint} */
                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.onesignal.LocationController$LocationPoint} */
                    /* JADX WARNING: Failed to insert additional move for type inference */
                    /* JADX WARNING: Multi-variable type inference failed */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void onComplete(com.onesignal.LocationController.LocationPoint r2) {
                        /*
                            r1 = this;
                            if (r2 == 0) goto L_0x0003
                            goto L_0x0008
                        L_0x0003:
                            java.lang.Object r2 = new java.lang.Object
                            r2.<init>()
                        L_0x0008:
                            java.util.concurrent.BlockingQueue r0 = r1
                            r0.offer(r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSSyncService.SyncRunnable.AnonymousClass1.onComplete(com.onesignal.LocationController$LocationPoint):void");
                    }
                });
                Object take = arrayBlockingQueue.take();
                if (take instanceof LocationController.LocationPoint) {
                    OneSignalStateSynchronizer.updateLocation((LocationController.LocationPoint) take);
                }
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            OneSignalStateSynchronizer.syncUserState(true);
            OneSignal.getFocusTimeController().doBlockingBackgroundSyncOfUnsentTime();
            stopSync();
        }
    }

    static class LollipopSyncRunnable extends SyncRunnable {
        private JobParameters jobParameters;
        private WeakReference<JobService> jobService;

        LollipopSyncRunnable(JobService jobService2, JobParameters jobParameters2) {
            this.jobService = new WeakReference<>(jobService2);
            this.jobParameters = jobParameters2;
        }

        /* access modifiers changed from: protected */
        public void stopSync() {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.Log(log_level, "LollipopSyncRunnable:JobFinished needsJobReschedule: " + OSSyncService.getInstance().needsJobReschedule);
            boolean z = OSSyncService.getInstance().needsJobReschedule;
            OSSyncService.getInstance().needsJobReschedule = false;
            if (this.jobService.get() != null) {
                ((JobService) this.jobService.get()).jobFinished(this.jobParameters, z);
            }
        }
    }

    static class LegacySyncRunnable extends SyncRunnable {
        private WeakReference<Service> callerService;

        LegacySyncRunnable(Service service) {
            this.callerService = new WeakReference<>(service);
        }

        /* access modifiers changed from: protected */
        public void stopSync() {
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "LegacySyncRunnable:Stopped");
            if (this.callerService.get() != null) {
                ((Service) this.callerService.get()).stopSelf();
            }
        }
    }
}
