package androidx.work.impl.model;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;

public final class PreferenceDao_Impl implements PreferenceDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<Preference> __insertionAdapterOfPreference;

    public PreferenceDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfPreference = new EntityInsertionAdapter<Preference>(roomDatabase) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, Preference preference) {
                if (preference.mKey == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, preference.mKey);
                }
                if (preference.mValue == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindLong(2, preference.mValue.longValue());
                }
            }
        };
    }

    public void insertPreference(Preference preference) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfPreference.insert(preference);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public Long getLongValue(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Long l = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            if (query.moveToFirst()) {
                if (!query.isNull(0)) {
                    l = Long.valueOf(query.getLong(0));
                }
            }
            return l;
        } finally {
            query.close();
            acquire.release();
        }
    }
}
