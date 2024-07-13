package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.w8  reason: case insensitive filesystem */
public class C0792w8 extends C0500k8 {
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS api_level_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS device_id_info");
    }
}
