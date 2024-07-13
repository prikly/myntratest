package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import com.appodeal.ads.modules.common.internal.Constants;
import java.sql.SQLException;
import org.json.JSONException;

public class L8 extends C0500k8 {
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.execSQL("ALTER TABLE " + Constants.SESSIONS + " ADD COLUMN " + "obtained_before_first_sync" + " INTEGER DEFAULT 0");
    }
}
