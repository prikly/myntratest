package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import com.appodeal.ads.modules.common.internal.Constants;
import java.sql.SQLException;
import org.json.JSONException;

public class P8 extends C0500k8 {
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.delete("reports", "session_id = ?", new String[]{String.valueOf(-2)});
        sQLiteDatabase.delete(Constants.SESSIONS, "id = ?", new String[]{String.valueOf(-2)});
    }
}
