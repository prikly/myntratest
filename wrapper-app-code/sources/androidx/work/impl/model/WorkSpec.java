package androidx.work.impl.model;

import androidx.arch.core.util.Function;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import java.util.List;

public final class WorkSpec {
    private static final String TAG = Logger.tagWithPrefix("WorkSpec");
    public static final Function<List<Object>, List<WorkInfo>> WORK_INFO_MAPPER = new Function<List<Object>, List<WorkInfo>>() {
    };
    public long backoffDelayDuration = 30000;
    public BackoffPolicy backoffPolicy = BackoffPolicy.EXPONENTIAL;
    public Constraints constraints = Constraints.NONE;
    public boolean expedited;
    public long flexDuration;
    public String id;
    public long initialDelay;
    public Data input = Data.EMPTY;
    public String inputMergerClassName;
    public long intervalDuration;
    public long minimumRetentionDuration;
    public OutOfQuotaPolicy outOfQuotaPolicy = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    public Data output = Data.EMPTY;
    public long periodStartTime;
    public int runAttemptCount;
    public long scheduleRequestedAt = -1;
    public WorkInfo.State state = WorkInfo.State.ENQUEUED;
    public String workerClassName;

    public WorkSpec(String str, String str2) {
        this.id = str;
        this.workerClassName = str2;
    }

    public WorkSpec(WorkSpec workSpec) {
        this.id = workSpec.id;
        this.workerClassName = workSpec.workerClassName;
        this.state = workSpec.state;
        this.inputMergerClassName = workSpec.inputMergerClassName;
        this.input = new Data(workSpec.input);
        this.output = new Data(workSpec.output);
        this.initialDelay = workSpec.initialDelay;
        this.intervalDuration = workSpec.intervalDuration;
        this.flexDuration = workSpec.flexDuration;
        this.constraints = new Constraints(workSpec.constraints);
        this.runAttemptCount = workSpec.runAttemptCount;
        this.backoffPolicy = workSpec.backoffPolicy;
        this.backoffDelayDuration = workSpec.backoffDelayDuration;
        this.periodStartTime = workSpec.periodStartTime;
        this.minimumRetentionDuration = workSpec.minimumRetentionDuration;
        this.scheduleRequestedAt = workSpec.scheduleRequestedAt;
        this.expedited = workSpec.expedited;
        this.outOfQuotaPolicy = workSpec.outOfQuotaPolicy;
    }

    public boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public boolean isBackedOff() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public long calculateNextRunTime() {
        long j;
        boolean z = false;
        if (isBackedOff()) {
            if (this.backoffPolicy == BackoffPolicy.LINEAR) {
                z = true;
            }
            if (z) {
                j = this.backoffDelayDuration * ((long) this.runAttemptCount);
            } else {
                j = (long) Math.scalb((float) this.backoffDelayDuration, this.runAttemptCount - 1);
            }
            return this.periodStartTime + Math.min(18000000, j);
        }
        long j2 = 0;
        if (isPeriodic()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.periodStartTime;
            if (j3 == 0) {
                j3 = this.initialDelay + currentTimeMillis;
            }
            if (this.flexDuration != this.intervalDuration) {
                z = true;
            }
            if (z) {
                if (this.periodStartTime == 0) {
                    j2 = this.flexDuration * -1;
                }
                return j3 + this.intervalDuration + j2;
            }
            if (this.periodStartTime != 0) {
                j2 = this.intervalDuration;
            }
            return j3 + j2;
        }
        long j4 = this.periodStartTime;
        if (j4 == 0) {
            j4 = System.currentTimeMillis();
        }
        return j4 + this.initialDelay;
    }

    public boolean hasConstraints() {
        return !Constraints.NONE.equals(this.constraints);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        if (this.initialDelay != workSpec.initialDelay || this.intervalDuration != workSpec.intervalDuration || this.flexDuration != workSpec.flexDuration || this.runAttemptCount != workSpec.runAttemptCount || this.backoffDelayDuration != workSpec.backoffDelayDuration || this.periodStartTime != workSpec.periodStartTime || this.minimumRetentionDuration != workSpec.minimumRetentionDuration || this.scheduleRequestedAt != workSpec.scheduleRequestedAt || this.expedited != workSpec.expedited || !this.id.equals(workSpec.id) || this.state != workSpec.state || !this.workerClassName.equals(workSpec.workerClassName)) {
            return false;
        }
        String str = this.inputMergerClassName;
        if (str == null ? workSpec.inputMergerClassName != null : !str.equals(workSpec.inputMergerClassName)) {
            return false;
        }
        if (this.input.equals(workSpec.input) && this.output.equals(workSpec.output) && this.constraints.equals(workSpec.constraints) && this.backoffPolicy == workSpec.backoffPolicy && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31;
        String str = this.inputMergerClassName;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.initialDelay;
        long j2 = this.intervalDuration;
        long j3 = this.flexDuration;
        long j4 = this.backoffDelayDuration;
        long j5 = this.periodStartTime;
        long j6 = this.minimumRetentionDuration;
        long j7 = this.scheduleRequestedAt;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.constraints.hashCode()) * 31) + this.runAttemptCount) * 31) + this.backoffPolicy.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.expedited ? 1 : 0)) * 31) + this.outOfQuotaPolicy.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.id + "}";
    }

    public static class IdAndState {
        public String id;
        public WorkInfo.State state;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            if (this.state != idAndState.state) {
                return false;
            }
            return this.id.equals(idAndState.id);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }
    }
}
