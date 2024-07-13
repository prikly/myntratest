package androidx.work;

import android.content.Context;
import androidx.work.impl.WorkManagerImpl;
import java.util.Collections;
import java.util.List;

public abstract class WorkManager {
    public abstract Operation cancelAllWorkByTag(String str);

    public abstract Operation enqueue(List<? extends WorkRequest> list);

    public abstract Operation enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list);

    public static WorkManager getInstance(Context context) {
        return WorkManagerImpl.getInstance(context);
    }

    public static void initialize(Context context, Configuration configuration) {
        WorkManagerImpl.initialize(context, configuration);
    }

    public final Operation enqueue(WorkRequest workRequest) {
        return enqueue((List<? extends WorkRequest>) Collections.singletonList(workRequest));
    }

    public Operation enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest oneTimeWorkRequest) {
        return enqueueUniqueWork(str, existingWorkPolicy, (List<OneTimeWorkRequest>) Collections.singletonList(oneTimeWorkRequest));
    }

    protected WorkManager() {
    }
}
