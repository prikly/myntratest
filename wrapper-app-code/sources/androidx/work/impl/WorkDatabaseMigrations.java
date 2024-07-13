package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.utils.IdGenerator;
import androidx.work.impl.utils.PreferenceUtils;

public class WorkDatabaseMigrations {
    public static Migration MIGRATION_11_12 = new Migration(11, 12) {
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    };
    public static Migration MIGRATION_1_2 = new Migration(1, 2) {
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS alarmInfo");
            supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    };
    public static Migration MIGRATION_3_4 = new Migration(3, 4) {
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (Build.VERSION.SDK_INT >= 23) {
                supportSQLiteDatabase.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    };
    public static Migration MIGRATION_4_5 = new Migration(4, 5) {
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    };
    public static Migration MIGRATION_6_7 = new Migration(6, 7) {
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    };
    public static Migration MIGRATION_7_8 = new Migration(7, 8) {
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    };
    public static Migration MIGRATION_8_9 = new Migration(8, 9) {
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    };

    public static class RescheduleMigration extends Migration {
        final Context mContext;

        public RescheduleMigration(Context context, int i, int i2) {
            super(i, i2);
            this.mContext = context;
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (this.endVersion >= 10) {
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                return;
            }
            this.mContext.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }

    public static class WorkMigration9To10 extends Migration {
        final Context mContext;

        public WorkMigration9To10(Context context) {
            super(9, 10);
            this.mContext = context;
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            PreferenceUtils.migrateLegacyPreferences(this.mContext, supportSQLiteDatabase);
            IdGenerator.migrateLegacyIdGenerator(this.mContext, supportSQLiteDatabase);
        }
    }
}
