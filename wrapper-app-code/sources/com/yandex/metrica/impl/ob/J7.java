package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

public abstract class J7 {

    /* renamed from: a  reason: collision with root package name */
    private final O7 f4314a;

    /* renamed from: b  reason: collision with root package name */
    private final C0251a8 f4315b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicLong f4316c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f4317d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicLong f4318e;

    /* renamed from: f  reason: collision with root package name */
    private final ContentValues f4319f = new ContentValues();

    J7(O7 o7, C0251a8 a8Var) {
        this.f4314a = o7;
        this.f4315b = a8Var;
        this.f4316c = new AtomicLong(d());
        this.f4317d = new AtomicLong(a(Long.MAX_VALUE));
        this.f4318e = new AtomicLong(a());
    }

    private long d() {
        try {
            SQLiteDatabase readableDatabase = this.f4314a.getReadableDatabase();
            if (readableDatabase != null) {
                return C0267b.a(readableDatabase, e());
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public abstract long a();

    public synchronized void a(long j, String str) {
        try {
            SQLiteDatabase writableDatabase = this.f4314a.getWritableDatabase();
            if (writableDatabase != null) {
                this.f4319f.clear();
                this.f4319f.put("incremental_id", Long.valueOf(this.f4318e.get() + 1));
                this.f4319f.put("timestamp", Long.valueOf(j));
                this.f4319f.put("data", str);
                if (writableDatabase.insert(e(), (String) null, this.f4319f) != -1) {
                    this.f4316c.incrementAndGet();
                    this.f4318e.incrementAndGet();
                    b(this.f4318e.get());
                    if (this.f4317d.get() > j) {
                        this.f4317d.set(j);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public long b() {
        return this.f4317d.get();
    }

    /* access modifiers changed from: protected */
    public abstract void b(long j);

    public long c() {
        return this.f4316c.get();
    }

    public abstract String e();

    /* access modifiers changed from: package-private */
    public C0251a8 f() {
        return this.f4315b;
    }

    public synchronized int b(int i) {
        int i2;
        i2 = 0;
        if (i < 1) {
            return 0;
        }
        String format = String.format(Locale.US, "%1$s <= (select max(%1$s) from (select %1$s from %2$s order by %1$s limit ?))", new Object[]{"incremental_id", e()});
        try {
            SQLiteDatabase writableDatabase = this.f4314a.getWritableDatabase();
            if (writableDatabase != null && (i2 = writableDatabase.delete(e(), format, new String[]{String.valueOf(i)})) > 0) {
                this.f4316c.getAndAdd((long) (-i2));
                this.f4317d.set(a(Long.MAX_VALUE));
            }
        } catch (Throwable unused) {
        }
        return i2;
    }

    public synchronized int c(long j) {
        int i;
        i = 0;
        String format = String.format(Locale.US, "%s <= ?", new Object[]{"incremental_id"});
        try {
            SQLiteDatabase writableDatabase = this.f4314a.getWritableDatabase();
            if (writableDatabase != null && (i = writableDatabase.delete(e(), format, new String[]{String.valueOf(j)})) > 0) {
                this.f4316c.getAndAdd((long) (-i));
                this.f4317d.set(a(Long.MAX_VALUE));
            }
        } catch (Throwable unused) {
        }
        return i;
    }

    public long a(long j) {
        String format = String.format(Locale.US, "Select min(%s) from %s", new Object[]{"timestamp", e()});
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f4314a.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(format, (String[]) null);
                if (cursor.moveToFirst()) {
                    long j2 = cursor.getLong(0);
                    if (j2 != 0) {
                        j = j2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        A2.a(cursor);
        return j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:13|14|15|16|17|(2:20|31)|28|11) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|(5:7|8|9|10|(8:13|14|15|16|17|(2:20|31)|28|11))(0)|21|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.Map<java.lang.Long, java.lang.String> a(int r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0056 }
            r0.<init>()     // Catch:{ all -> 0x0056 }
            r1 = 0
            com.yandex.metrica.impl.ob.O7 r2 = r12.f4314a     // Catch:{ all -> 0x0051 }
            android.database.sqlite.SQLiteDatabase r3 = r2.getReadableDatabase()     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0051
            java.lang.String r4 = r12.e()     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "incremental_id"
            java.lang.String r5 = "data"
            java.lang.String[] r5 = new java.lang.String[]{r2, r5}     // Catch:{ all -> 0x0051 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r10 = "incremental_id ASC"
            java.lang.String r11 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0051 }
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0051 }
        L_0x0029:
            boolean r13 = r1.moveToNext()     // Catch:{ all -> 0x0051 }
            if (r13 == 0) goto L_0x0051
            android.content.ContentValues r13 = r12.f4319f     // Catch:{ all -> 0x0051 }
            r13.clear()     // Catch:{ all -> 0x0051 }
            android.content.ContentValues r13 = r12.f4319f     // Catch:{ all -> 0x0051 }
            com.yandex.metrica.impl.ob.C0267b.a((android.database.Cursor) r1, (android.content.ContentValues) r13)     // Catch:{ all -> 0x0039 }
        L_0x0039:
            android.content.ContentValues r13 = r12.f4319f     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "incremental_id"
            java.lang.Long r13 = r13.getAsLong(r2)     // Catch:{ all -> 0x0051 }
            android.content.ContentValues r2 = r12.f4319f     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "data"
            java.lang.String r2 = r2.getAsString(r3)     // Catch:{ all -> 0x0051 }
            if (r13 == 0) goto L_0x0029
            if (r2 == 0) goto L_0x0029
            r0.put(r13, r2)     // Catch:{ all -> 0x0051 }
            goto L_0x0029
        L_0x0051:
            com.yandex.metrica.impl.ob.A2.a((android.database.Cursor) r1)     // Catch:{ all -> 0x0056 }
            monitor-exit(r12)
            return r0
        L_0x0056:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.J7.a(int):java.util.Map");
    }
}
