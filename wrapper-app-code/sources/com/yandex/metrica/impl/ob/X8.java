package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.ob.C0656qf;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

public class X8 extends C0500k8 {
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.execSQL(String.format(Locale.US, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", new Object[]{"reports", "open_id", Long.valueOf(new C0656qf.d.a().w)}));
    }
}
