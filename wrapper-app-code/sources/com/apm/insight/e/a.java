package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.e.b.b;
import com.apm.insight.h;
import com.apm.insight.l.q;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f10547a;

    /* renamed from: b  reason: collision with root package name */
    private b f10548b;

    /* renamed from: c  reason: collision with root package name */
    private SQLiteDatabase f10549c;

    private a() {
    }

    public static a a() {
        if (f10547a == null) {
            synchronized (a.class) {
                if (f10547a == null) {
                    f10547a = new a();
                }
            }
        }
        return f10547a;
    }

    private void b() {
        if (this.f10548b == null) {
            a(h.g());
        }
    }

    public synchronized void a(Context context) {
        try {
            this.f10549c = new b(context).getWritableDatabase();
        } catch (Throwable th) {
            q.b(th);
        }
        this.f10548b = new b();
    }

    public synchronized void a(com.apm.insight.e.a.a aVar) {
        b();
        if (this.f10548b != null) {
            this.f10548b.a(this.f10549c, aVar);
        }
    }

    public synchronized boolean a(String str) {
        b();
        if (this.f10548b == null) {
            return false;
        }
        return this.f10548b.a(this.f10549c, str);
    }
}
