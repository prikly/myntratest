package com.yandex.metrica.impl.ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class V7 {

    /* renamed from: a  reason: collision with root package name */
    private final C0401g8 f5222a;

    public V7(O7 o7, String str) {
        this((C0401g8) new C0451i8(o7), str);
    }

    public void a() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f5222a.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS permissions");
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.f5222a.a(sQLiteDatabase);
    }

    public List<Bd> b() {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f5222a.a();
            if (sQLiteDatabase != null) {
                try {
                    cursor = sQLiteDatabase.query("permissions", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                    if (cursor != null) {
                        try {
                            if (cursor.moveToFirst()) {
                                ArrayList arrayList = new ArrayList();
                                do {
                                    arrayList.add(new Bd(cursor.getString(cursor.getColumnIndex("name")), cursor.getLong(cursor.getColumnIndex("granted")) == 1));
                                } while (cursor.moveToNext());
                                this.f5222a.a(sQLiteDatabase);
                                A2.a(cursor);
                                return arrayList;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
                this.f5222a.a(sQLiteDatabase);
                A2.a(cursor);
                return null;
            }
            cursor = null;
        } catch (Throwable unused3) {
            sQLiteDatabase = null;
            cursor = null;
        }
        this.f5222a.a(sQLiteDatabase);
        A2.a(cursor);
        return null;
    }

    V7(C0401g8 g8Var, String str) {
        this.f5222a = g8Var;
    }
}
