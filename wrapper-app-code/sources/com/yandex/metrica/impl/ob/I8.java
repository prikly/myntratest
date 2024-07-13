package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import org.json.JSONException;

public class I8 extends C0500k8 {
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "connection_type" + " INTEGER DEFAULT 2");
        sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "cellular_connection_type" + " TEXT ");
    }
}
