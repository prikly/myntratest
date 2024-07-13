package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

public class M8 extends C0500k8 {
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", new Object[]{"reports", "encrypting_mode", Integer.valueOf(Em.NONE.a())}));
        sQLiteDatabase.execSQL(String.format(locale, "UPDATE %s SET %s = %d where %s=%d", new Object[]{"reports", "encrypting_mode", Integer.valueOf(Em.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER.a()), "type", Integer.valueOf(C0244a1.EVENT_TYPE_IDENTITY.b())}));
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN profile_id TEXT ");
    }
}
