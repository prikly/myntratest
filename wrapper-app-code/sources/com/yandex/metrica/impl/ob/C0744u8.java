package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.ob.C0475j8;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.u8  reason: case insensitive filesystem */
public class C0744u8 extends C0500k8 {
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS device_id_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS api_level_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS preferences");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS startup");
        sQLiteDatabase.execSQL(C0475j8.a.b.f6046b);
        sQLiteDatabase.execSQL(C0475j8.a.C0053a.f6044b);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS permissions");
    }
}
