package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.YandexMetrica;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.v8  reason: case insensitive filesystem */
public class C0768v8 extends C0500k8 {
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS api_level_info (API_LEVEL INT )");
        ContentValues contentValues = new ContentValues();
        contentValues.put("API_LEVEL", Integer.valueOf(YandexMetrica.getLibraryApiLevel()));
        sQLiteDatabase.insert("api_level_info", "API_LEVEL", contentValues);
    }
}
