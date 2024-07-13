package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import org.json.JSONException;

public class C8 extends C0500k8 {
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
    }
}
