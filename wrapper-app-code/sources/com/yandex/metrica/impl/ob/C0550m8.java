package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.m8  reason: case insensitive filesystem */
public class C0550m8 extends C0500k8 {
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS binary_data");
    }
}
