package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

public class N8 extends C0500k8 {
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.execSQL(String.format(Locale.US, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", new Object[]{"reports", "first_occurrence_status", 0}));
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
    }
}
