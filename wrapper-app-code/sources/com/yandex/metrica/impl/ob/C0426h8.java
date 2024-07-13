package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.yandex.metrica.impl.ob.h8  reason: case insensitive filesystem */
public class C0426h8 implements C0401g8 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5902a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5903b;

    /* renamed from: c  reason: collision with root package name */
    private final X7 f5904c;

    /* renamed from: d  reason: collision with root package name */
    private final C0734tm f5905d;

    /* renamed from: e  reason: collision with root package name */
    private O7 f5906e;

    public C0426h8(Context context, String str, C0734tm tmVar, X7 x7) {
        this.f5902a = context;
        this.f5903b = str;
        this.f5905d = tmVar;
        this.f5904c = x7;
    }

    public synchronized SQLiteDatabase a() {
        O7 o7;
        try {
            this.f5905d.a();
            o7 = new O7(this.f5902a, this.f5903b, this.f5904c);
            this.f5906e = o7;
        } catch (Throwable unused) {
            return null;
        }
        return o7.getWritableDatabase();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0006 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(android.database.sqlite.SQLiteDatabase r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            if (r1 == 0) goto L_0x0006
            r1.close()     // Catch:{ all -> 0x0006 }
        L_0x0006:
            com.yandex.metrica.impl.ob.O7 r1 = r0.f5906e     // Catch:{ all -> 0x0015 }
            com.yandex.metrica.impl.ob.A2.a((java.io.Closeable) r1)     // Catch:{ all -> 0x0015 }
            com.yandex.metrica.impl.ob.tm r1 = r0.f5905d     // Catch:{ all -> 0x0015 }
            r1.b()     // Catch:{ all -> 0x0015 }
            r1 = 0
            r0.f5906e = r1     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)
            return
        L_0x0015:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0426h8.a(android.database.sqlite.SQLiteDatabase):void");
    }
}
