package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.yandex.metrica.impl.ob.z8  reason: case insensitive filesystem */
public class C0864z8 extends C0500k8 {
    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS permissions (name TEXT PRIMARY KEY,granted INTEGER)");
    }
}
