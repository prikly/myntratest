package com.onesignal;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.WorkManager;
import androidx.work.impl.WorkManagerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0003¨\u0006\t"}, d2 = {"Lcom/onesignal/OSWorkManagerHelper;", "", "()V", "getInstance", "Landroidx/work/WorkManager;", "context", "Landroid/content/Context;", "isInitialized", "", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: OSWorkManagerHelper.kt */
public final class OSWorkManagerHelper {
    public static final OSWorkManagerHelper INSTANCE = new OSWorkManagerHelper();

    private OSWorkManagerHelper() {
    }

    private final boolean isInitialized() {
        return WorkManagerImpl.getInstance() != null;
    }

    public static final synchronized WorkManager getInstance(Context context) {
        WorkManager instance;
        synchronized (OSWorkManagerHelper.class) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (!INSTANCE.isInitialized()) {
                WorkManager.initialize(context, new Configuration.Builder().build());
            }
            instance = WorkManager.getInstance(context);
            Intrinsics.checkNotNullExpressionValue(instance, "WorkManager.getInstance(context)");
        }
        return instance;
    }
}
