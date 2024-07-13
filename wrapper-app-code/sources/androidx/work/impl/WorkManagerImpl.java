package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.Configuration;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.R;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.utils.CancelWorkRunnable;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.PreferenceUtils;
import androidx.work.impl.utils.StartWorkRunnable;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class WorkManagerImpl extends WorkManager {
    private static final String TAG = Logger.tagWithPrefix("WorkManagerImpl");
    private static WorkManagerImpl sDefaultInstance = null;
    private static WorkManagerImpl sDelegatedInstance = null;
    private static final Object sLock = new Object();
    private Configuration mConfiguration;
    private Context mContext;
    private boolean mForceStopRunnableCompleted;
    private PreferenceUtils mPreferenceUtils;
    private Processor mProcessor;
    private BroadcastReceiver.PendingResult mRescheduleReceiverResult;
    private List<Scheduler> mSchedulers;
    private WorkDatabase mWorkDatabase;
    private TaskExecutor mWorkTaskExecutor;

    @Deprecated
    public static WorkManagerImpl getInstance() {
        synchronized (sLock) {
            if (sDelegatedInstance != null) {
                WorkManagerImpl workManagerImpl = sDelegatedInstance;
                return workManagerImpl;
            }
            WorkManagerImpl workManagerImpl2 = sDefaultInstance;
            return workManagerImpl2;
        }
    }

    public static WorkManagerImpl getInstance(Context context) {
        WorkManagerImpl instance;
        synchronized (sLock) {
            instance = getInstance();
            if (instance == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Configuration.Provider) {
                    initialize(applicationContext, ((Configuration.Provider) applicationContext).getWorkManagerConfiguration());
                    instance = getInstance(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return instance;
    }

    public static void initialize(Context context, Configuration configuration) {
        synchronized (sLock) {
            if (sDelegatedInstance != null) {
                if (sDefaultInstance != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (sDelegatedInstance == null) {
                Context applicationContext = context.getApplicationContext();
                if (sDefaultInstance == null) {
                    sDefaultInstance = new WorkManagerImpl(applicationContext, configuration, new WorkManagerTaskExecutor(configuration.getTaskExecutor()));
                }
                sDelegatedInstance = sDefaultInstance;
            }
        }
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskExecutor) {
        this(context, configuration, taskExecutor, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskExecutor, boolean z) {
        this(context, configuration, taskExecutor, WorkDatabase.create(context.getApplicationContext(), taskExecutor.getBackgroundExecutor(), z));
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        Logger.setLogger(new Logger.LogcatLogger(configuration.getMinimumLoggingLevel()));
        Context context2 = context;
        Configuration configuration2 = configuration;
        TaskExecutor taskExecutor2 = taskExecutor;
        WorkDatabase workDatabase2 = workDatabase;
        List<Scheduler> createSchedulers = createSchedulers(applicationContext, configuration, taskExecutor);
        internalInit(context2, configuration2, taskExecutor2, workDatabase2, createSchedulers, new Processor(context2, configuration2, taskExecutor2, workDatabase2, createSchedulers));
    }

    public Context getApplicationContext() {
        return this.mContext;
    }

    public WorkDatabase getWorkDatabase() {
        return this.mWorkDatabase;
    }

    public Configuration getConfiguration() {
        return this.mConfiguration;
    }

    public List<Scheduler> getSchedulers() {
        return this.mSchedulers;
    }

    public Processor getProcessor() {
        return this.mProcessor;
    }

    public TaskExecutor getWorkTaskExecutor() {
        return this.mWorkTaskExecutor;
    }

    public PreferenceUtils getPreferenceUtils() {
        return this.mPreferenceUtils;
    }

    public Operation enqueue(List<? extends WorkRequest> list) {
        if (!list.isEmpty()) {
            return new WorkContinuationImpl(this, list).enqueue();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public Operation enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list) {
        return new WorkContinuationImpl(this, str, existingWorkPolicy, list).enqueue();
    }

    public Operation cancelWorkById(UUID uuid) {
        CancelWorkRunnable forId = CancelWorkRunnable.forId(uuid, this);
        this.mWorkTaskExecutor.executeOnBackgroundThread(forId);
        return forId.getOperation();
    }

    public Operation cancelAllWorkByTag(String str) {
        CancelWorkRunnable forTag = CancelWorkRunnable.forTag(str, this);
        this.mWorkTaskExecutor.executeOnBackgroundThread(forTag);
        return forTag.getOperation();
    }

    public void startWork(String str) {
        startWork(str, (WorkerParameters.RuntimeExtras) null);
    }

    public void startWork(String str, WorkerParameters.RuntimeExtras runtimeExtras) {
        this.mWorkTaskExecutor.executeOnBackgroundThread(new StartWorkRunnable(this, str, runtimeExtras));
    }

    public void stopWork(String str) {
        this.mWorkTaskExecutor.executeOnBackgroundThread(new StopWorkRunnable(this, str, false));
    }

    public void stopForegroundWork(String str) {
        this.mWorkTaskExecutor.executeOnBackgroundThread(new StopWorkRunnable(this, str, true));
    }

    public void rescheduleEligibleWork() {
        if (Build.VERSION.SDK_INT >= 23) {
            SystemJobScheduler.cancelAll(getApplicationContext());
        }
        getWorkDatabase().workSpecDao().resetScheduledState();
        Schedulers.schedule(getConfiguration(), getWorkDatabase(), getSchedulers());
    }

    public void onForceStopRunnableCompleted() {
        synchronized (sLock) {
            this.mForceStopRunnableCompleted = true;
            if (this.mRescheduleReceiverResult != null) {
                this.mRescheduleReceiverResult.finish();
                this.mRescheduleReceiverResult = null;
            }
        }
    }

    public void setReschedulePendingResult(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (sLock) {
            this.mRescheduleReceiverResult = pendingResult;
            if (this.mForceStopRunnableCompleted) {
                pendingResult.finish();
                this.mRescheduleReceiverResult = null;
            }
        }
    }

    private void internalInit(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, List<Scheduler> list, Processor processor) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mConfiguration = configuration;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkDatabase = workDatabase;
        this.mSchedulers = list;
        this.mProcessor = processor;
        this.mPreferenceUtils = new PreferenceUtils(workDatabase);
        this.mForceStopRunnableCompleted = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext.isDeviceProtectedStorage()) {
            this.mWorkTaskExecutor.executeOnBackgroundThread(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public List<Scheduler> createSchedulers(Context context, Configuration configuration, TaskExecutor taskExecutor) {
        return Arrays.asList(new Scheduler[]{Schedulers.createBestAvailableBackgroundScheduler(context, this), new GreedyScheduler(context, configuration, taskExecutor, this)});
    }
}
