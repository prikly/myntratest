package androidx.work.impl.model;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.ArrayList;
import java.util.List;

public final class WorkSpecDao_Impl implements WorkSpecDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<WorkSpec> __insertionAdapterOfWorkSpec;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount;
    private final SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled;
    private final SharedSQLiteStatement __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast;
    private final SharedSQLiteStatement __preparedStmtOfResetScheduledState;
    private final SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount;
    private final SharedSQLiteStatement __preparedStmtOfSetOutput;
    private final SharedSQLiteStatement __preparedStmtOfSetPeriodStartTime;

    public WorkSpecDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfWorkSpec = new EntityInsertionAdapter<WorkSpec>(roomDatabase) {
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkSpec workSpec) {
                if (workSpec.id == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, workSpec.id);
                }
                supportSQLiteStatement.bindLong(2, (long) WorkTypeConverters.stateToInt(workSpec.state));
                if (workSpec.workerClassName == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, workSpec.workerClassName);
                }
                if (workSpec.inputMergerClassName == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, workSpec.inputMergerClassName);
                }
                byte[] byteArrayInternal = Data.toByteArrayInternal(workSpec.input);
                if (byteArrayInternal == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindBlob(5, byteArrayInternal);
                }
                byte[] byteArrayInternal2 = Data.toByteArrayInternal(workSpec.output);
                if (byteArrayInternal2 == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindBlob(6, byteArrayInternal2);
                }
                supportSQLiteStatement.bindLong(7, workSpec.initialDelay);
                supportSQLiteStatement.bindLong(8, workSpec.intervalDuration);
                supportSQLiteStatement.bindLong(9, workSpec.flexDuration);
                supportSQLiteStatement.bindLong(10, (long) workSpec.runAttemptCount);
                supportSQLiteStatement.bindLong(11, (long) WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                supportSQLiteStatement.bindLong(12, workSpec.backoffDelayDuration);
                supportSQLiteStatement.bindLong(13, workSpec.periodStartTime);
                supportSQLiteStatement.bindLong(14, workSpec.minimumRetentionDuration);
                supportSQLiteStatement.bindLong(15, workSpec.scheduleRequestedAt);
                supportSQLiteStatement.bindLong(16, workSpec.expedited ? 1 : 0);
                supportSQLiteStatement.bindLong(17, (long) WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
                Constraints constraints = workSpec.constraints;
                if (constraints != null) {
                    supportSQLiteStatement.bindLong(18, (long) WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                    supportSQLiteStatement.bindLong(19, constraints.requiresCharging() ? 1 : 0);
                    supportSQLiteStatement.bindLong(20, constraints.requiresDeviceIdle() ? 1 : 0);
                    supportSQLiteStatement.bindLong(21, constraints.requiresBatteryNotLow() ? 1 : 0);
                    supportSQLiteStatement.bindLong(22, constraints.requiresStorageNotLow() ? 1 : 0);
                    supportSQLiteStatement.bindLong(23, constraints.getTriggerContentUpdateDelay());
                    supportSQLiteStatement.bindLong(24, constraints.getTriggerMaxContentDelay());
                    byte[] contentUriTriggersToByteArray = WorkTypeConverters.contentUriTriggersToByteArray(constraints.getContentUriTriggers());
                    if (contentUriTriggersToByteArray == null) {
                        supportSQLiteStatement.bindNull(25);
                    } else {
                        supportSQLiteStatement.bindBlob(25, contentUriTriggersToByteArray);
                    }
                } else {
                    supportSQLiteStatement.bindNull(18);
                    supportSQLiteStatement.bindNull(19);
                    supportSQLiteStatement.bindNull(20);
                    supportSQLiteStatement.bindNull(21);
                    supportSQLiteStatement.bindNull(22);
                    supportSQLiteStatement.bindNull(23);
                    supportSQLiteStatement.bindNull(24);
                    supportSQLiteStatement.bindNull(25);
                }
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.__preparedStmtOfSetOutput = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.__preparedStmtOfSetPeriodStartTime = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.__preparedStmtOfIncrementWorkSpecRunAttemptCount = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfResetWorkSpecRunAttemptCount = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.__preparedStmtOfMarkWorkSpecScheduled = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.__preparedStmtOfResetScheduledState = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }

    public void insertWorkSpec(WorkSpec workSpec) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWorkSpec.insert(workSpec);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void delete(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDelete.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(acquire);
        }
    }

    public void setOutput(String str, Data data) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetOutput.acquire();
        byte[] byteArrayInternal = Data.toByteArrayInternal(data);
        if (byteArrayInternal == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindBlob(1, byteArrayInternal);
        }
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetOutput.release(acquire);
        }
    }

    public void setPeriodStartTime(String str, long j) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetPeriodStartTime.acquire();
        acquire.bindLong(1, j);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetPeriodStartTime.release(acquire);
        }
    }

    public int incrementWorkSpecRunAttemptCount(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.release(acquire);
        }
    }

    public int resetWorkSpecRunAttemptCount(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfResetWorkSpecRunAttemptCount.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfResetWorkSpecRunAttemptCount.release(acquire);
        }
    }

    public int markWorkSpecScheduled(String str, long j) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfMarkWorkSpecScheduled.acquire();
        acquire.bindLong(1, j);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfMarkWorkSpecScheduled.release(acquire);
        }
    }

    public int resetScheduledState() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfResetScheduledState.acquire();
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfResetScheduledState.release(acquire);
        }
    }

    public WorkSpec getWorkSpec(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        WorkSpec workSpec;
        String str2 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str2);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, OSOutcomeConstants.OUTCOME_ID);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, AdOperationMetric.INIT_STATE);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "output");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "period_start_time");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                if (query.moveToFirst()) {
                    String string = query.getString(columnIndexOrThrow9);
                    String string2 = query.getString(columnIndexOrThrow11);
                    int i = columnIndexOrThrow25;
                    Constraints constraints = new Constraints();
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow)));
                    constraints.setRequiresCharging(query.getInt(columnIndexOrThrow2) != 0);
                    constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow3) != 0);
                    constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow4) != 0);
                    constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow5) != 0);
                    constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow6));
                    constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow7));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec2 = new WorkSpec(string, string2);
                    workSpec2.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow10));
                    workSpec2.inputMergerClassName = query.getString(columnIndexOrThrow12);
                    workSpec2.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow13));
                    workSpec2.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow14));
                    workSpec2.initialDelay = query.getLong(columnIndexOrThrow15);
                    workSpec2.intervalDuration = query.getLong(columnIndexOrThrow16);
                    workSpec2.flexDuration = query.getLong(columnIndexOrThrow17);
                    workSpec2.runAttemptCount = query.getInt(columnIndexOrThrow18);
                    workSpec2.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow19));
                    workSpec2.backoffDelayDuration = query.getLong(columnIndexOrThrow20);
                    workSpec2.periodStartTime = query.getLong(columnIndexOrThrow21);
                    workSpec2.minimumRetentionDuration = query.getLong(columnIndexOrThrow22);
                    workSpec2.scheduleRequestedAt = query.getLong(columnIndexOrThrow23);
                    workSpec2.expedited = query.getInt(columnIndexOrThrow24) != 0;
                    workSpec2.outOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i));
                    workSpec2.constraints = constraints;
                    workSpec = workSpec2;
                } else {
                    workSpec = null;
                }
                query.close();
                roomSQLiteQuery.release();
                return workSpec;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, OSOutcomeConstants.OUTCOME_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, AdOperationMetric.INIT_STATE);
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                WorkSpec.IdAndState idAndState = new WorkSpec.IdAndState();
                idAndState.id = query.getString(columnIndexOrThrow);
                idAndState.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                arrayList.add(idAndState);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public WorkInfo.State getState(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        WorkInfo.State state = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            if (query.moveToFirst()) {
                state = WorkTypeConverters.intToState(query.getInt(0));
            }
            return state;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public List<Data> getInputsFromPrerequisites(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(Data.fromByteArray(query.getBlob(0)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public List<String> getUnfinishedWorkWithTag(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public List<String> getUnfinishedWorkWithName(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public boolean hasUnfinishedWork() {
        boolean z = false;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            if (query.moveToFirst() && query.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public List<WorkSpec> getEligibleWorkForScheduling(int i) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        acquire.bindLong(1, (long) i);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, OSOutcomeConstants.OUTCOME_ID);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, AdOperationMetric.INIT_STATE);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "output");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "period_start_time");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow9);
                    int i3 = columnIndexOrThrow9;
                    String string2 = query.getString(columnIndexOrThrow11);
                    int i4 = columnIndexOrThrow11;
                    Constraints constraints = new Constraints();
                    int i5 = columnIndexOrThrow;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow)));
                    constraints.setRequiresCharging(query.getInt(columnIndexOrThrow2) != 0);
                    constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow3) != 0);
                    constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow4) != 0);
                    constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow5) != 0);
                    int i6 = columnIndexOrThrow2;
                    int i7 = columnIndexOrThrow3;
                    constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow6));
                    constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow7));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow10));
                    workSpec.inputMergerClassName = query.getString(columnIndexOrThrow12);
                    workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow13));
                    int i8 = i2;
                    workSpec.output = Data.fromByteArray(query.getBlob(i8));
                    int i9 = i6;
                    i2 = i8;
                    int i10 = columnIndexOrThrow15;
                    workSpec.initialDelay = query.getLong(i10);
                    int i11 = columnIndexOrThrow12;
                    int i12 = columnIndexOrThrow16;
                    workSpec.intervalDuration = query.getLong(i12);
                    int i13 = i10;
                    int i14 = columnIndexOrThrow4;
                    int i15 = columnIndexOrThrow17;
                    workSpec.flexDuration = query.getLong(i15);
                    int i16 = columnIndexOrThrow18;
                    workSpec.runAttemptCount = query.getInt(i16);
                    int i17 = columnIndexOrThrow19;
                    int i18 = i12;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(i17));
                    columnIndexOrThrow17 = i15;
                    int i19 = i14;
                    int i20 = columnIndexOrThrow20;
                    workSpec.backoffDelayDuration = query.getLong(i20);
                    int i21 = i16;
                    int i22 = i17;
                    int i23 = columnIndexOrThrow21;
                    workSpec.periodStartTime = query.getLong(i23);
                    int i24 = i20;
                    columnIndexOrThrow21 = i23;
                    int i25 = columnIndexOrThrow22;
                    workSpec.minimumRetentionDuration = query.getLong(i25);
                    int i26 = i21;
                    int i27 = columnIndexOrThrow23;
                    workSpec.scheduleRequestedAt = query.getLong(i27);
                    int i28 = columnIndexOrThrow24;
                    workSpec.expedited = query.getInt(i28) != 0;
                    int i29 = columnIndexOrThrow25;
                    int i30 = i27;
                    workSpec.outOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i29));
                    workSpec.constraints = constraints;
                    arrayList.add(workSpec);
                    columnIndexOrThrow25 = i29;
                    columnIndexOrThrow2 = i9;
                    columnIndexOrThrow12 = i11;
                    columnIndexOrThrow15 = i13;
                    columnIndexOrThrow16 = i18;
                    columnIndexOrThrow18 = i26;
                    columnIndexOrThrow23 = i30;
                    columnIndexOrThrow9 = i3;
                    columnIndexOrThrow11 = i4;
                    columnIndexOrThrow = i5;
                    columnIndexOrThrow24 = i28;
                    columnIndexOrThrow22 = i25;
                    columnIndexOrThrow3 = i7;
                    int i31 = i22;
                    columnIndexOrThrow20 = i24;
                    columnIndexOrThrow4 = i19;
                    columnIndexOrThrow19 = i31;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int i) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        acquire.bindLong(1, (long) i);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, OSOutcomeConstants.OUTCOME_ID);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, AdOperationMetric.INIT_STATE);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "output");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "period_start_time");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow9);
                    int i3 = columnIndexOrThrow9;
                    String string2 = query.getString(columnIndexOrThrow11);
                    int i4 = columnIndexOrThrow11;
                    Constraints constraints = new Constraints();
                    int i5 = columnIndexOrThrow;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow)));
                    constraints.setRequiresCharging(query.getInt(columnIndexOrThrow2) != 0);
                    constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow3) != 0);
                    constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow4) != 0);
                    constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow5) != 0);
                    int i6 = columnIndexOrThrow2;
                    int i7 = columnIndexOrThrow3;
                    constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow6));
                    constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow7));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow10));
                    workSpec.inputMergerClassName = query.getString(columnIndexOrThrow12);
                    workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow13));
                    int i8 = i2;
                    workSpec.output = Data.fromByteArray(query.getBlob(i8));
                    int i9 = i6;
                    i2 = i8;
                    int i10 = columnIndexOrThrow15;
                    workSpec.initialDelay = query.getLong(i10);
                    int i11 = columnIndexOrThrow12;
                    int i12 = columnIndexOrThrow16;
                    workSpec.intervalDuration = query.getLong(i12);
                    int i13 = i10;
                    int i14 = columnIndexOrThrow4;
                    int i15 = columnIndexOrThrow17;
                    workSpec.flexDuration = query.getLong(i15);
                    int i16 = columnIndexOrThrow18;
                    workSpec.runAttemptCount = query.getInt(i16);
                    int i17 = columnIndexOrThrow19;
                    int i18 = i12;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(i17));
                    columnIndexOrThrow17 = i15;
                    int i19 = i14;
                    int i20 = columnIndexOrThrow20;
                    workSpec.backoffDelayDuration = query.getLong(i20);
                    int i21 = i16;
                    int i22 = i17;
                    int i23 = columnIndexOrThrow21;
                    workSpec.periodStartTime = query.getLong(i23);
                    int i24 = i20;
                    columnIndexOrThrow21 = i23;
                    int i25 = columnIndexOrThrow22;
                    workSpec.minimumRetentionDuration = query.getLong(i25);
                    int i26 = i21;
                    int i27 = columnIndexOrThrow23;
                    workSpec.scheduleRequestedAt = query.getLong(i27);
                    int i28 = columnIndexOrThrow24;
                    workSpec.expedited = query.getInt(i28) != 0;
                    int i29 = columnIndexOrThrow25;
                    int i30 = i27;
                    workSpec.outOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i29));
                    workSpec.constraints = constraints;
                    arrayList.add(workSpec);
                    columnIndexOrThrow25 = i29;
                    columnIndexOrThrow2 = i9;
                    columnIndexOrThrow12 = i11;
                    columnIndexOrThrow15 = i13;
                    columnIndexOrThrow16 = i18;
                    columnIndexOrThrow18 = i26;
                    columnIndexOrThrow23 = i30;
                    columnIndexOrThrow9 = i3;
                    columnIndexOrThrow11 = i4;
                    columnIndexOrThrow = i5;
                    columnIndexOrThrow24 = i28;
                    columnIndexOrThrow22 = i25;
                    columnIndexOrThrow3 = i7;
                    int i31 = i22;
                    columnIndexOrThrow20 = i24;
                    columnIndexOrThrow4 = i19;
                    columnIndexOrThrow19 = i31;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WorkSpec> getScheduledWork() {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, OSOutcomeConstants.OUTCOME_ID);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, AdOperationMetric.INIT_STATE);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "output");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "period_start_time");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow9);
                    int i2 = columnIndexOrThrow9;
                    String string2 = query.getString(columnIndexOrThrow11);
                    int i3 = columnIndexOrThrow11;
                    Constraints constraints = new Constraints();
                    int i4 = columnIndexOrThrow;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow)));
                    constraints.setRequiresCharging(query.getInt(columnIndexOrThrow2) != 0);
                    constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow3) != 0);
                    constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow4) != 0);
                    constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow5) != 0);
                    int i5 = columnIndexOrThrow2;
                    int i6 = columnIndexOrThrow3;
                    constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow6));
                    constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow7));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow10));
                    workSpec.inputMergerClassName = query.getString(columnIndexOrThrow12);
                    workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow13));
                    int i7 = i;
                    workSpec.output = Data.fromByteArray(query.getBlob(i7));
                    int i8 = i5;
                    i = i7;
                    int i9 = columnIndexOrThrow15;
                    workSpec.initialDelay = query.getLong(i9);
                    int i10 = columnIndexOrThrow13;
                    int i11 = columnIndexOrThrow16;
                    workSpec.intervalDuration = query.getLong(i11);
                    int i12 = i9;
                    int i13 = columnIndexOrThrow4;
                    int i14 = columnIndexOrThrow17;
                    workSpec.flexDuration = query.getLong(i14);
                    int i15 = columnIndexOrThrow18;
                    workSpec.runAttemptCount = query.getInt(i15);
                    int i16 = columnIndexOrThrow19;
                    int i17 = i11;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(i16));
                    columnIndexOrThrow17 = i14;
                    int i18 = i13;
                    int i19 = columnIndexOrThrow20;
                    workSpec.backoffDelayDuration = query.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = columnIndexOrThrow21;
                    workSpec.periodStartTime = query.getLong(i22);
                    int i23 = i19;
                    columnIndexOrThrow21 = i22;
                    int i24 = columnIndexOrThrow22;
                    workSpec.minimumRetentionDuration = query.getLong(i24);
                    int i25 = i20;
                    int i26 = columnIndexOrThrow23;
                    workSpec.scheduleRequestedAt = query.getLong(i26);
                    int i27 = columnIndexOrThrow24;
                    workSpec.expedited = query.getInt(i27) != 0;
                    int i28 = columnIndexOrThrow25;
                    int i29 = i26;
                    workSpec.outOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i28));
                    workSpec.constraints = constraints;
                    arrayList.add(workSpec);
                    columnIndexOrThrow25 = i28;
                    columnIndexOrThrow2 = i8;
                    columnIndexOrThrow13 = i10;
                    columnIndexOrThrow15 = i12;
                    columnIndexOrThrow16 = i17;
                    columnIndexOrThrow18 = i25;
                    columnIndexOrThrow23 = i29;
                    columnIndexOrThrow9 = i2;
                    columnIndexOrThrow11 = i3;
                    columnIndexOrThrow = i4;
                    columnIndexOrThrow24 = i27;
                    columnIndexOrThrow22 = i24;
                    columnIndexOrThrow3 = i6;
                    int i30 = i21;
                    columnIndexOrThrow20 = i23;
                    columnIndexOrThrow4 = i18;
                    columnIndexOrThrow19 = i30;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WorkSpec> getRunningWork() {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, OSOutcomeConstants.OUTCOME_ID);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, AdOperationMetric.INIT_STATE);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "output");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "period_start_time");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow9);
                    int i2 = columnIndexOrThrow9;
                    String string2 = query.getString(columnIndexOrThrow11);
                    int i3 = columnIndexOrThrow11;
                    Constraints constraints = new Constraints();
                    int i4 = columnIndexOrThrow;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow)));
                    constraints.setRequiresCharging(query.getInt(columnIndexOrThrow2) != 0);
                    constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow3) != 0);
                    constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow4) != 0);
                    constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow5) != 0);
                    int i5 = columnIndexOrThrow2;
                    int i6 = columnIndexOrThrow3;
                    constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow6));
                    constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow7));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow10));
                    workSpec.inputMergerClassName = query.getString(columnIndexOrThrow12);
                    workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow13));
                    int i7 = i;
                    workSpec.output = Data.fromByteArray(query.getBlob(i7));
                    int i8 = i5;
                    i = i7;
                    int i9 = columnIndexOrThrow15;
                    workSpec.initialDelay = query.getLong(i9);
                    int i10 = columnIndexOrThrow13;
                    int i11 = columnIndexOrThrow16;
                    workSpec.intervalDuration = query.getLong(i11);
                    int i12 = i9;
                    int i13 = columnIndexOrThrow4;
                    int i14 = columnIndexOrThrow17;
                    workSpec.flexDuration = query.getLong(i14);
                    int i15 = columnIndexOrThrow18;
                    workSpec.runAttemptCount = query.getInt(i15);
                    int i16 = columnIndexOrThrow19;
                    int i17 = i11;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(i16));
                    columnIndexOrThrow17 = i14;
                    int i18 = i13;
                    int i19 = columnIndexOrThrow20;
                    workSpec.backoffDelayDuration = query.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = columnIndexOrThrow21;
                    workSpec.periodStartTime = query.getLong(i22);
                    int i23 = i19;
                    columnIndexOrThrow21 = i22;
                    int i24 = columnIndexOrThrow22;
                    workSpec.minimumRetentionDuration = query.getLong(i24);
                    int i25 = i20;
                    int i26 = columnIndexOrThrow23;
                    workSpec.scheduleRequestedAt = query.getLong(i26);
                    int i27 = columnIndexOrThrow24;
                    workSpec.expedited = query.getInt(i27) != 0;
                    int i28 = columnIndexOrThrow25;
                    int i29 = i26;
                    workSpec.outOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i28));
                    workSpec.constraints = constraints;
                    arrayList.add(workSpec);
                    columnIndexOrThrow25 = i28;
                    columnIndexOrThrow2 = i8;
                    columnIndexOrThrow13 = i10;
                    columnIndexOrThrow15 = i12;
                    columnIndexOrThrow16 = i17;
                    columnIndexOrThrow18 = i25;
                    columnIndexOrThrow23 = i29;
                    columnIndexOrThrow9 = i2;
                    columnIndexOrThrow11 = i3;
                    columnIndexOrThrow = i4;
                    columnIndexOrThrow24 = i27;
                    columnIndexOrThrow22 = i24;
                    columnIndexOrThrow3 = i6;
                    int i30 = i21;
                    columnIndexOrThrow20 = i23;
                    columnIndexOrThrow4 = i18;
                    columnIndexOrThrow19 = i30;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WorkSpec> getRecentlyCompletedWork(long j) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        acquire.bindLong(1, j);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, OSOutcomeConstants.OUTCOME_ID);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, AdOperationMetric.INIT_STATE);
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "output");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "period_start_time");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow9);
                    int i2 = columnIndexOrThrow9;
                    String string2 = query.getString(columnIndexOrThrow11);
                    int i3 = columnIndexOrThrow11;
                    Constraints constraints = new Constraints();
                    int i4 = columnIndexOrThrow;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow)));
                    constraints.setRequiresCharging(query.getInt(columnIndexOrThrow2) != 0);
                    constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow3) != 0);
                    constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow4) != 0);
                    constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow5) != 0);
                    int i5 = columnIndexOrThrow2;
                    int i6 = columnIndexOrThrow3;
                    constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow6));
                    constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow7));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow10));
                    workSpec.inputMergerClassName = query.getString(columnIndexOrThrow12);
                    workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow13));
                    int i7 = i;
                    workSpec.output = Data.fromByteArray(query.getBlob(i7));
                    int i8 = columnIndexOrThrow15;
                    int i9 = i5;
                    i = i7;
                    workSpec.initialDelay = query.getLong(i8);
                    int i10 = columnIndexOrThrow12;
                    int i11 = columnIndexOrThrow16;
                    workSpec.intervalDuration = query.getLong(i11);
                    int i12 = i8;
                    int i13 = columnIndexOrThrow4;
                    int i14 = columnIndexOrThrow17;
                    workSpec.flexDuration = query.getLong(i14);
                    int i15 = columnIndexOrThrow18;
                    workSpec.runAttemptCount = query.getInt(i15);
                    int i16 = columnIndexOrThrow19;
                    int i17 = i11;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(i16));
                    columnIndexOrThrow17 = i14;
                    int i18 = i13;
                    int i19 = columnIndexOrThrow20;
                    workSpec.backoffDelayDuration = query.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = columnIndexOrThrow21;
                    workSpec.periodStartTime = query.getLong(i22);
                    int i23 = i19;
                    columnIndexOrThrow21 = i22;
                    int i24 = columnIndexOrThrow22;
                    workSpec.minimumRetentionDuration = query.getLong(i24);
                    int i25 = i20;
                    int i26 = columnIndexOrThrow23;
                    workSpec.scheduleRequestedAt = query.getLong(i26);
                    int i27 = columnIndexOrThrow24;
                    workSpec.expedited = query.getInt(i27) != 0;
                    int i28 = columnIndexOrThrow25;
                    int i29 = i26;
                    workSpec.outOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i28));
                    workSpec.constraints = constraints;
                    arrayList.add(workSpec);
                    columnIndexOrThrow2 = i9;
                    columnIndexOrThrow25 = i28;
                    columnIndexOrThrow12 = i10;
                    columnIndexOrThrow15 = i12;
                    columnIndexOrThrow16 = i17;
                    columnIndexOrThrow18 = i25;
                    columnIndexOrThrow23 = i29;
                    columnIndexOrThrow9 = i2;
                    columnIndexOrThrow11 = i3;
                    columnIndexOrThrow = i4;
                    columnIndexOrThrow24 = i27;
                    columnIndexOrThrow22 = i24;
                    columnIndexOrThrow3 = i6;
                    int i30 = i21;
                    columnIndexOrThrow20 = i23;
                    columnIndexOrThrow4 = i18;
                    columnIndexOrThrow19 = i30;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public int setState(WorkInfo.State state, String... strArr) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("UPDATE workspec SET state=");
        newStringBuilder.append("?");
        newStringBuilder.append(" WHERE id IN (");
        StringUtil.appendPlaceholders(newStringBuilder, strArr.length);
        newStringBuilder.append(")");
        SupportSQLiteStatement compileStatement = this.__db.compileStatement(newStringBuilder.toString());
        compileStatement.bindLong(1, (long) WorkTypeConverters.stateToInt(state));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i);
            } else {
                compileStatement.bindString(i, str);
            }
            i++;
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
        }
    }
}
