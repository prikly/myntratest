package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import com.appodeal.ads.modules.common.internal.Constants;
import java.sql.SQLException;

public class R8 extends C0500k8 {
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE " + Constants.SESSIONS + " ADD COLUMN " + "report_request_parameters" + " TEXT DEFAULT ''");
    }
}
