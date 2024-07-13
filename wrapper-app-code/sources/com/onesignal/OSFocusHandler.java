package com.onesignal;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkRequest;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.OneSignal;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\u0006\u0010\u0012\u001a\u00020\bJ\u001e\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/onesignal/OSFocusHandler;", "", "()V", "stopRunnable", "Ljava/lang/Runnable;", "buildConstraints", "Landroidx/work/Constraints;", "cancelOnLostFocusWorker", "", "tag", "", "context", "Landroid/content/Context;", "hasBackgrounded", "", "hasCompleted", "resetBackgroundState", "resetStopState", "startOnFocusWork", "startOnLostFocusWorker", "delay", "", "startOnStartFocusWork", "startOnStopFocusWork", "Companion", "OnLostFocusWorker", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: OSFocusHandler.kt */
public final class OSFocusHandler {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static boolean backgrounded = false;
    /* access modifiers changed from: private */
    public static boolean completed = false;
    private static final long stopDelay = 1500;
    /* access modifiers changed from: private */
    public static boolean stopped;
    private Runnable stopRunnable;

    public final boolean hasBackgrounded() {
        return backgrounded;
    }

    public final boolean hasCompleted() {
        return completed;
    }

    public final void startOnFocusWork() {
        resetBackgroundState();
        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "OSFocusHandler running onAppFocus");
        OneSignal.onAppFocus();
    }

    public final void startOnStartFocusWork() {
        if (stopped) {
            stopped = false;
            this.stopRunnable = null;
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "OSFocusHandler running onAppStartFocusLogic");
            OneSignal.onAppStartFocusLogic();
            return;
        }
        resetStopState();
    }

    public final void startOnStopFocusWork() {
        Runnable runnable = OSFocusHandler$startOnStopFocusWork$1.INSTANCE;
        OSTimeoutHandler.getTimeoutHandler().startTimeout(stopDelay, runnable);
        Unit unit = Unit.INSTANCE;
        this.stopRunnable = runnable;
    }

    public final void startOnLostFocusWorker(String str, long j, Context context) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(context, "context");
        WorkRequest build = ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(OnLostFocusWorker.class).setConstraints(buildConstraints())).setInitialDelay(j, TimeUnit.MILLISECONDS)).addTag(str)).build();
        Intrinsics.checkNotNullExpressionValue(build, "OneTimeWorkRequest.Build…tag)\n            .build()");
        OSWorkManagerHelper.getInstance(context).enqueueUniqueWork(str, ExistingWorkPolicy.KEEP, (OneTimeWorkRequest) build);
    }

    public final void cancelOnLostFocusWorker(String str, Context context) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(context, "context");
        OSWorkManagerHelper.getInstance(context).cancelAllWorkByTag(str);
    }

    private final void resetStopState() {
        stopped = false;
        Runnable runnable = this.stopRunnable;
        if (runnable != null) {
            OSTimeoutHandler.getTimeoutHandler().destroyTimeout(runnable);
        }
    }

    private final void resetBackgroundState() {
        resetStopState();
        backgrounded = false;
    }

    private final Constraints buildConstraints() {
        Constraints build = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        Intrinsics.checkNotNullExpressionValue(build, "Constraints.Builder()\n  …TED)\n            .build()");
        return build;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/onesignal/OSFocusHandler$OnLostFocusWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "onesignal_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: OSFocusHandler.kt */
    public static final class OnLostFocusWorker extends Worker {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OnLostFocusWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        }

        public ListenableWorker.Result doWork() {
            OSFocusHandler.Companion.onLostFocusDoWork();
            ListenableWorker.Result success = ListenableWorker.Result.success();
            Intrinsics.checkNotNullExpressionValue(success, "Result.success()");
            return success;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/onesignal/OSFocusHandler$Companion;", "", "()V", "backgrounded", "", "completed", "stopDelay", "", "stopped", "onLostFocusDoWork", "", "onesignal_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: OSFocusHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void onLostFocusDoWork() {
            ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
            if (activityLifecycleHandler == null || activityLifecycleHandler.getCurActivity() == null) {
                OneSignal.setInForeground(false);
            }
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "OSFocusHandler running onAppLostFocus");
            OSFocusHandler.backgrounded = true;
            OneSignal.onAppLostFocus();
            OSFocusHandler.completed = true;
        }
    }
}
