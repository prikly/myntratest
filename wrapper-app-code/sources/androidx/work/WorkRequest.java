package androidx.work;

import android.os.Build;
import androidx.work.impl.model.WorkSpec;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public abstract class WorkRequest {
    private UUID mId;
    private Set<String> mTags;
    private WorkSpec mWorkSpec;

    protected WorkRequest(UUID uuid, WorkSpec workSpec, Set<String> set) {
        this.mId = uuid;
        this.mWorkSpec = workSpec;
        this.mTags = set;
    }

    public String getStringId() {
        return this.mId.toString();
    }

    public WorkSpec getWorkSpec() {
        return this.mWorkSpec;
    }

    public Set<String> getTags() {
        return this.mTags;
    }

    public static abstract class Builder<B extends Builder<?, ?>, W extends WorkRequest> {
        boolean mBackoffCriteriaSet = false;
        UUID mId;
        Set<String> mTags = new HashSet();
        WorkSpec mWorkSpec;
        Class<? extends ListenableWorker> mWorkerClass;

        /* access modifiers changed from: package-private */
        public abstract W buildInternal();

        /* access modifiers changed from: package-private */
        public abstract B getThis();

        Builder(Class<? extends ListenableWorker> cls) {
            UUID randomUUID = UUID.randomUUID();
            this.mId = randomUUID;
            this.mWorkerClass = cls;
            this.mWorkSpec = new WorkSpec(randomUUID.toString(), cls.getName());
            addTag(cls.getName());
        }

        public final B setConstraints(Constraints constraints) {
            this.mWorkSpec.constraints = constraints;
            return getThis();
        }

        public final B setInputData(Data data) {
            this.mWorkSpec.input = data;
            return getThis();
        }

        public final B addTag(String str) {
            this.mTags.add(str);
            return getThis();
        }

        public B setInitialDelay(long j, TimeUnit timeUnit) {
            this.mWorkSpec.initialDelay = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.mWorkSpec.initialDelay) {
                return getThis();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final W build() {
            W buildInternal = buildInternal();
            Constraints constraints = this.mWorkSpec.constraints;
            boolean z = (Build.VERSION.SDK_INT >= 24 && constraints.hasContentUriTriggers()) || constraints.requiresBatteryNotLow() || constraints.requiresCharging() || (Build.VERSION.SDK_INT >= 23 && constraints.requiresDeviceIdle());
            if (!this.mWorkSpec.expedited || !z) {
                this.mId = UUID.randomUUID();
                WorkSpec workSpec = new WorkSpec(this.mWorkSpec);
                this.mWorkSpec = workSpec;
                workSpec.id = this.mId.toString();
                return buildInternal;
            }
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
    }
}
