package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.appodeal.ads.modules.common.internal.Constants;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.yandex.metrica.impl.ob.C0475j8;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class E8 extends C0500k8 {
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS " + "sessions_BACKUP" + " (" + OSOutcomeConstants.OUTCOME_ID + " INTEGER" + "," + "start_time" + " INTEGER" + "," + "connection_type" + " INTEGER" + "," + "network_type" + " TEXT" + "," + "country_code" + " INTEGER" + "," + "operator_id" + " INTEGER" + "," + "lac" + " INTEGER" + "," + "report_request_parameters" + " TEXT" + " );");
        StringBuilder sb = new StringBuilder();
        sb.append(OSOutcomeConstants.OUTCOME_ID);
        sb.append(",");
        sb.append("start_time");
        sb.append(",");
        sb.append("connection_type");
        sb.append(",");
        sb.append("network_type");
        sb.append(",");
        sb.append("country_code");
        sb.append(",");
        sb.append("operator_id");
        sb.append(",");
        sb.append("lac");
        sb.append(",");
        sb.append("report_request_parameters");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("INSERT INTO ");
        sb2.append("sessions_BACKUP");
        sb2.append(" SELECT ");
        sb2.append(sb);
        sb2.append(" FROM ");
        sb2.append(Constants.SESSIONS);
        sb2.append(";");
        sQLiteDatabase2.execSQL(sb2.toString());
        sQLiteDatabase2.execSQL("DROP TABLE sessions;");
        sQLiteDatabase2.execSQL(C0475j8.e.f6052b);
        Cursor cursor = null;
        try {
            Cursor rawQuery = sQLiteDatabase2.rawQuery("SELECT * FROM sessions_BACKUP", (String[]) null);
            while (rawQuery.moveToNext()) {
                try {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(rawQuery, contentValues);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(OSOutcomeConstants.OUTCOME_ID);
                    arrayList.add("start_time");
                    arrayList.add("report_request_parameters");
                    ContentValues contentValues2 = new ContentValues(contentValues);
                    for (Map.Entry next : contentValues.valueSet()) {
                        if (!arrayList.contains(next.getKey())) {
                            contentValues2.remove((String) next.getKey());
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        contentValues.remove((String) it.next());
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("conn_type", contentValues.getAsInteger("connection_type"));
                    jSONObject.putOpt("net_type", contentValues.get("network_type"));
                    jSONObject.putOpt("operator_id", contentValues.get("operator_id"));
                    jSONObject.putOpt("lac", contentValues.get("lac"));
                    jSONObject.putOpt("country_code", contentValues.get("country_code"));
                    contentValues2.put("network_info", jSONObject.toString());
                    sQLiteDatabase2.insertOrThrow(Constants.SESSIONS, (String) null, contentValues2);
                } catch (Throwable th) {
                    th = th;
                    cursor = rawQuery;
                }
            }
            A2.a(rawQuery);
            sQLiteDatabase2.execSQL("DROP TABLE sessions_BACKUP;");
            sQLiteDatabase2.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "wifi_network_info" + " TEXT DEFAULT ''");
            sQLiteDatabase2.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "cell_info" + " TEXT DEFAULT ''");
            sQLiteDatabase2.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "location_info" + " TEXT DEFAULT ''");
        } catch (Throwable th2) {
            th = th2;
            A2.a(cursor);
            throw th;
        }
    }
}
