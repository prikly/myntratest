package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.la  reason: case insensitive filesystem */
class C0527la implements S7, Closeable {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f6133a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Object> f6134b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6135c;

    /* renamed from: d  reason: collision with root package name */
    private final a f6136d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f6137e;

    /* renamed from: f  reason: collision with root package name */
    private final C0401g8 f6138f;

    /* renamed from: com.yandex.metrica.impl.ob.la$a */
    private class a extends Lm {
        public a(String str) {
            super(str);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|(2:11|12)|13|14|15) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x001c A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                com.yandex.metrica.impl.ob.la r0 = com.yandex.metrica.impl.ob.C0527la.this
                java.util.Map r0 = r0.f6133a
                monitor-enter(r0)
                com.yandex.metrica.impl.ob.la r1 = com.yandex.metrica.impl.ob.C0527la.this     // Catch:{ all -> 0x005a }
                com.yandex.metrica.impl.ob.C0527la.b((com.yandex.metrica.impl.ob.C0527la) r1)     // Catch:{ all -> 0x005a }
                com.yandex.metrica.impl.ob.la r1 = com.yandex.metrica.impl.ob.C0527la.this     // Catch:{ all -> 0x005a }
                r2 = 1
                boolean unused = r1.f6137e = r2     // Catch:{ all -> 0x005a }
                com.yandex.metrica.impl.ob.la r1 = com.yandex.metrica.impl.ob.C0527la.this     // Catch:{ all -> 0x005a }
                java.util.Map r1 = r1.f6133a     // Catch:{ all -> 0x005a }
                r1.notifyAll()     // Catch:{ all -> 0x005a }
                monitor-exit(r0)     // Catch:{ all -> 0x005a }
            L_0x001c:
                boolean r0 = r3.isRunning()
                if (r0 == 0) goto L_0x0059
                monitor-enter(r3)
                com.yandex.metrica.impl.ob.la r0 = com.yandex.metrica.impl.ob.C0527la.this     // Catch:{ all -> 0x0056 }
                java.util.Map r0 = r0.f6134b     // Catch:{ all -> 0x0056 }
                int r0 = r0.size()     // Catch:{ all -> 0x0056 }
                if (r0 != 0) goto L_0x0032
                r3.wait()     // Catch:{ InterruptedException -> 0x0032 }
            L_0x0032:
                java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0056 }
                com.yandex.metrica.impl.ob.la r1 = com.yandex.metrica.impl.ob.C0527la.this     // Catch:{ all -> 0x0056 }
                java.util.Map r1 = r1.f6134b     // Catch:{ all -> 0x0056 }
                r0.<init>(r1)     // Catch:{ all -> 0x0056 }
                com.yandex.metrica.impl.ob.la r1 = com.yandex.metrica.impl.ob.C0527la.this     // Catch:{ all -> 0x0056 }
                java.util.Map r1 = r1.f6134b     // Catch:{ all -> 0x0056 }
                r1.clear()     // Catch:{ all -> 0x0056 }
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                int r1 = r0.size()
                if (r1 <= 0) goto L_0x001c
                com.yandex.metrica.impl.ob.la r1 = com.yandex.metrica.impl.ob.C0527la.this
                com.yandex.metrica.impl.ob.C0527la.a((com.yandex.metrica.impl.ob.C0527la) r1, (java.util.Map) r0)
                r0.clear()
                goto L_0x001c
            L_0x0056:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                throw r0
            L_0x0059:
                return
            L_0x005a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x005a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0527la.a.run():void");
        }
    }

    public C0527la(O7 o7, String str) {
        this(str, (C0401g8) new C0451i8(o7));
    }

    static void a(C0527la laVar, Map map) {
        SQLiteDatabase sQLiteDatabase;
        laVar.getClass();
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            Object value = entry.getValue();
            contentValues.put("key", (String) entry.getKey());
            if (value == laVar) {
                contentValues.putNull(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            } else if (value instanceof String) {
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) value);
                contentValues.put("type", 4);
            } else if (value instanceof Long) {
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Long) value);
                contentValues.put("type", 3);
            } else if (value instanceof Integer) {
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Integer) value);
                contentValues.put("type", 2);
            } else if (value instanceof Boolean) {
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", 1);
            } else if (value instanceof Float) {
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Float) value);
                contentValues.put("type", 5);
            }
            contentValuesArr[i] = contentValues;
            i++;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = laVar.f6138f.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int i2 = 0; i2 < size; i2++) {
                        ContentValues contentValues2 = contentValuesArr[i2];
                        if (contentValues2.getAsString(AppMeasurementSdk.ConditionalUserProperty.VALUE) == null) {
                            String asString = contentValues2.getAsString("key");
                            sQLiteDatabase.delete(laVar.f6135c, "key = ?", new String[]{asString});
                        } else {
                            sQLiteDatabase.insertWithOnConflict(laVar.f6135c, (String) null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    A2.a(sQLiteDatabase);
                    laVar.f6138f.a(sQLiteDatabase);
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = sQLiteDatabase2;
            A2.a(sQLiteDatabase);
            laVar.f6138f.a(sQLiteDatabase);
        }
        A2.a(sQLiteDatabase);
        laVar.f6138f.a(sQLiteDatabase);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a A[Catch:{ all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0022 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void b(com.yandex.metrica.impl.ob.C0527la r13) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "value"
            java.lang.String r2 = "key"
            r13.getClass()
            r3 = 0
            com.yandex.metrica.impl.ob.g8 r4 = r13.f6138f     // Catch:{ all -> 0x0092 }
            android.database.sqlite.SQLiteDatabase r4 = r4.a()     // Catch:{ all -> 0x0092 }
            if (r4 == 0) goto L_0x0093
            java.lang.String r6 = r13.f6135c     // Catch:{ all -> 0x0093 }
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch:{ all -> 0x0093 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r4
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0093 }
        L_0x0022:
            boolean r6 = r5.moveToNext()     // Catch:{ all -> 0x0090 }
            if (r6 == 0) goto L_0x0090
            int r6 = r5.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x0090 }
            int r7 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0090 }
            java.lang.String r7 = r5.getString(r7)     // Catch:{ all -> 0x0090 }
            int r8 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0090 }
            int r8 = r5.getInt(r8)     // Catch:{ all -> 0x0090 }
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0090 }
            if (r9 != 0) goto L_0x0022
            r9 = 1
            if (r8 == r9) goto L_0x0071
            r9 = 2
            if (r8 == r9) goto L_0x0068
            r9 = 3
            if (r8 == r9) goto L_0x005f
            r9 = 4
            if (r8 == r9) goto L_0x0088
            r9 = 5
            if (r8 == r9) goto L_0x0056
            goto L_0x0087
        L_0x0056:
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            goto L_0x0088
        L_0x005f:
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            goto L_0x0088
        L_0x0068:
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            goto L_0x0088
        L_0x0071:
            java.lang.String r8 = "true"
            boolean r8 = r8.equals(r7)     // Catch:{ all -> 0x0090 }
            if (r8 == 0) goto L_0x007c
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0090 }
            goto L_0x0088
        L_0x007c:
            java.lang.String r8 = "false"
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0090 }
            if (r7 == 0) goto L_0x0087
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0090 }
            goto L_0x0088
        L_0x0087:
            r7 = r3
        L_0x0088:
            if (r7 == 0) goto L_0x0022
            java.util.Map<java.lang.String, java.lang.Object> r8 = r13.f6133a     // Catch:{ all -> 0x0090 }
            r8.put(r6, r7)     // Catch:{ all -> 0x0090 }
            goto L_0x0022
        L_0x0090:
            r3 = r5
            goto L_0x0093
        L_0x0092:
            r4 = r3
        L_0x0093:
            com.yandex.metrica.impl.ob.A2.a((android.database.Cursor) r3)
            com.yandex.metrica.impl.ob.g8 r13 = r13.f6138f
            r13.a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0527la.b(com.yandex.metrica.impl.ob.la):void");
    }

    public void close() {
        if (this.f6136d.isRunning()) {
            this.f6136d.stopRunning();
        }
    }

    protected C0527la(String str, C0401g8 g8Var) {
        this.f6133a = new HashMap();
        this.f6134b = new HashMap();
        this.f6138f = g8Var;
        this.f6135c = str;
        a aVar = new a(String.format(Locale.US, "YMM-DW-%s", new Object[]{Integer.valueOf(Mm.c())}));
        this.f6136d = aVar;
        aVar.start();
    }

    private Object c(String str) {
        Object obj;
        synchronized (this.f6133a) {
            c();
            obj = this.f6133a.get(str);
        }
        return obj;
    }

    private void c() {
        if (!this.f6137e) {
            try {
                this.f6133a.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void b() {
        synchronized (this.f6136d) {
            this.f6136d.notifyAll();
        }
    }

    public String b(String str, String str2) {
        Object c2 = c(str);
        return c2 instanceof String ? (String) c2 : str2;
    }

    public boolean b(String str, boolean z) {
        Object c2 = c(str);
        return c2 instanceof Boolean ? ((Boolean) c2).booleanValue() : z;
    }

    public S7 b(String str) {
        synchronized (this.f6133a) {
            c();
            this.f6133a.remove(str);
        }
        synchronized (this.f6136d) {
            this.f6134b.put(str, this);
            this.f6136d.notifyAll();
        }
        return this;
    }

    public S7 b(String str, long j) {
        a(str, (Object) Long.valueOf(j));
        return this;
    }

    public synchronized S7 b(String str, int i) {
        a(str, (Object) Integer.valueOf(i));
        return this;
    }

    public int a(String str, int i) {
        Object c2 = c(str);
        return c2 instanceof Integer ? ((Integer) c2).intValue() : i;
    }

    public long a(String str, long j) {
        Object c2 = c(str);
        return c2 instanceof Long ? ((Long) c2).longValue() : j;
    }

    public synchronized S7 a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    public S7 a(String str, boolean z) {
        a(str, (Object) Boolean.valueOf(z));
        return this;
    }

    public boolean a(String str) {
        boolean containsKey;
        synchronized (this.f6133a) {
            c();
            containsKey = this.f6133a.containsKey(str);
        }
        return containsKey;
    }

    public Set<String> a() {
        HashSet hashSet;
        synchronized (this.f6133a) {
            hashSet = new HashSet(this.f6133a.keySet());
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, Object obj) {
        synchronized (this.f6133a) {
            c();
            this.f6133a.put(str, obj);
        }
        synchronized (this.f6136d) {
            this.f6134b.put(str, obj);
            this.f6136d.notifyAll();
        }
    }
}
