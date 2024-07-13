package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.Closeable;

public class O7 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final String f4640a;

    /* renamed from: b  reason: collision with root package name */
    private final C0315cm f4641b;

    /* renamed from: c  reason: collision with root package name */
    protected final X7 f4642c;

    public O7(Context context, String str, X7 x7) {
        this(context, str, x7, Ul.a());
    }

    public SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f4641b.forceE(th, "", new Object[0]);
            this.f4641b.forceW("Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f4640a);
            ((C0584nh) C0609oh.a()).reportError("db_read_error", th);
            return null;
        }
    }

    public SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f4641b.forceE(th, "", new Object[0]);
            this.f4641b.forceW("Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f4640a);
            ((C0584nh) C0609oh.a()).reportError("db_write_error", th);
            return null;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f4642c.a(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f4642c.a(sQLiteDatabase, i, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        this.f4642c.b(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f4642c.b(sQLiteDatabase, i, i2);
    }

    O7(Context context, String str, X7 x7, C0315cm cmVar) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, C0475j8.f6038a);
        this.f4642c = x7;
        this.f4640a = str;
        this.f4641b = cmVar;
    }
}
