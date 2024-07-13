package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: com.yandex.metrica.impl.ob.ha  reason: case insensitive filesystem */
class C0428ha implements R7 {

    /* renamed from: a  reason: collision with root package name */
    private final C0401g8 f5907a;

    public C0428ha(C0401g8 g8Var, String str) {
        this.f5907a = g8Var;
    }

    public void a(String str, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = this.f5907a.a();
            if (sQLiteDatabase != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data_key", str);
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, bArr);
                    sQLiteDatabase.insertWithOnConflict("binary_data", (String) null, contentValues, 5);
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = sQLiteDatabase2;
            this.f5907a.a(sQLiteDatabase);
        }
        this.f5907a.a(sQLiteDatabase);
    }

    public void b(String str) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f5907a.a();
            if (sQLiteDatabase != null) {
                try {
                    new ContentValues().put("data_key", str);
                    sQLiteDatabase.delete("binary_data", "data_key = ?", new String[]{str});
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.f5907a.a(sQLiteDatabase);
    }

    public byte[] a(String str) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f5907a.a();
            if (sQLiteDatabase != null) {
                try {
                    cursor = sQLiteDatabase.query("binary_data", (String[]) null, "data_key = ?", new String[]{str}, (String) null, (String) null, (String) null);
                    if (cursor != null) {
                        try {
                            if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                                byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                                A2.a(cursor);
                                this.f5907a.a(sQLiteDatabase);
                                return blob;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (cursor != null) {
                        cursor.getCount();
                    }
                } catch (Throwable unused2) {
                }
                A2.a(cursor);
                this.f5907a.a(sQLiteDatabase);
                return null;
            }
            cursor = null;
        } catch (Throwable unused3) {
            cursor = null;
            sQLiteDatabase = null;
        }
        A2.a(cursor);
        this.f5907a.a(sQLiteDatabase);
        return null;
    }
}
