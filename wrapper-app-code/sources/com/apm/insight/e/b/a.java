package com.apm.insight.e.b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.b;
import com.apm.insight.l.q;
import java.util.HashMap;

public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final String f10552a = "_id";

    /* renamed from: b  reason: collision with root package name */
    protected final String f10553b;

    protected a(String str) {
        this.f10553b = str;
    }

    /* access modifiers changed from: protected */
    public abstract ContentValues a(T t);

    /* access modifiers changed from: protected */
    public abstract HashMap<String, String> a();

    public void a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(this.f10553b);
            sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> a2 = a();
            if (a2 != null) {
                for (String next : a2.keySet()) {
                    sb.append(next);
                    sb.append(" ");
                    sb.append(a2.get(next));
                    sb.append(",");
                }
                sb.delete(sb.length() - 1, sb.length());
                sb.append(")");
                sQLiteDatabase.execSQL(sb.toString());
            }
        } catch (Throwable th) {
            b.a().a("NPTH_CATCH", th);
        }
    }

    public void a(SQLiteDatabase sQLiteDatabase, T t) {
        if (sQLiteDatabase != null && t != null) {
            try {
                sQLiteDatabase.insert(this.f10553b, (String) null, a(t));
            } catch (Throwable th) {
                q.b(th);
            }
        }
    }
}
