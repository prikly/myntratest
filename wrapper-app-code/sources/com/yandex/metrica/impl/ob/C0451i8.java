package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.yandex.metrica.impl.ob.i8  reason: case insensitive filesystem */
public class C0451i8 implements C0401g8 {

    /* renamed from: a  reason: collision with root package name */
    private final O7 f5974a;

    public C0451i8(O7 o7) {
        this.f5974a = o7;
    }

    public SQLiteDatabase a() {
        try {
            return this.f5974a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
    }
}
