package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import com.appodeal.ads.modules.common.internal.Constants;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.sql.SQLException;

public class F8 extends C0500k8 {
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "environment" + " TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "user_info" + " TEXT ");
        StringBuilder sb = new StringBuilder();
        sb.append("ALTER TABLE ");
        sb.append("reports");
        sb.append(" ADD COLUMN ");
        sb.append("session_type");
        sb.append(" INTEGER DEFAULT ");
        C0374f6 f6Var = C0374f6.FOREGROUND;
        sb.append(f6Var.a());
        sQLiteDatabase.execSQL(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append("reports");
        sb2.append(" SET ");
        sb2.append("session_type");
        sb2.append(" = ");
        C0374f6 f6Var2 = C0374f6.BACKGROUND;
        sb2.append(f6Var2.a());
        sb2.append(" WHERE ");
        sb2.append("session_id");
        sb2.append(" = ");
        sb2.append(-2);
        sQLiteDatabase.execSQL(sb2.toString());
        sQLiteDatabase.execSQL("ALTER TABLE " + Constants.SESSIONS + " ADD COLUMN " + "server_time_offset" + " INTEGER ");
        sQLiteDatabase.execSQL("ALTER TABLE " + Constants.SESSIONS + " ADD COLUMN " + "type" + " INTEGER DEFAULT " + f6Var.a());
        sQLiteDatabase.execSQL("UPDATE " + Constants.SESSIONS + " SET " + "type" + " = " + f6Var2.a() + " WHERE " + OSOutcomeConstants.OUTCOME_ID + " = " + -2);
    }
}
