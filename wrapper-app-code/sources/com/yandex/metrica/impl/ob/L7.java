package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.ob.C0475j8;
import com.yandex.metrica.impl.ob.C0615on;
import com.yandex.metrica.impl.ob.C0687s;
import com.yandex.metrica.impl.ob.C0754ui;
import com.yandex.metrica.impl.ob.K7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class L7 {
    private static final HashSet<Integer> o;

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantReadWriteLock f4472a;

    /* renamed from: b  reason: collision with root package name */
    private final Lock f4473b;

    /* renamed from: c  reason: collision with root package name */
    private final Lock f4474c;

    /* renamed from: d  reason: collision with root package name */
    private final O7 f4475d;

    /* renamed from: e  reason: collision with root package name */
    private final a f4476e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Object f4477f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final List<ContentValues> f4478g = new ArrayList(3);

    /* renamed from: h  reason: collision with root package name */
    private final Context f4479h;
    private final L3 i;
    private final AtomicLong j;
    /* access modifiers changed from: private */
    public final List<C0578nb> k;
    private final K7 l;
    private volatile qn<C0754ui.b, Object> m;
    private final rn<C0754ui.b, Object> n;

    private class a extends Lm {

        /* renamed from: b  reason: collision with root package name */
        private final L3 f4480b;

        a(L3 l3) {
            this.f4480b = l3;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
            	at java.util.ArrayList.get(ArrayList.java:435)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public void run() {
            /*
                r4 = this;
            L_0x0000:
                boolean r0 = r4.isRunning()
                if (r0 == 0) goto L_0x008b
                monitor-enter(r4)     // Catch:{ all -> 0x0017 }
                com.yandex.metrica.impl.ob.L7 r0 = com.yandex.metrica.impl.ob.L7.this     // Catch:{ all -> 0x0014 }
                boolean r0 = com.yandex.metrica.impl.ob.L7.a((com.yandex.metrica.impl.ob.L7) r0)     // Catch:{ all -> 0x0014 }
                if (r0 == 0) goto L_0x0012
                r4.wait()     // Catch:{ all -> 0x0014 }
            L_0x0012:
                monitor-exit(r4)     // Catch:{ all -> 0x0014 }
                goto L_0x001a
            L_0x0014:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0014 }
                throw r0     // Catch:{ all -> 0x0017 }
            L_0x0017:
                r4.stopRunning()
            L_0x001a:
                com.yandex.metrica.impl.ob.L7 r0 = com.yandex.metrica.impl.ob.L7.this
                java.lang.Object r0 = r0.f4477f
                monitor-enter(r0)
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0088 }
                com.yandex.metrica.impl.ob.L7 r2 = com.yandex.metrica.impl.ob.L7.this     // Catch:{ all -> 0x0088 }
                java.util.List r2 = r2.f4478g     // Catch:{ all -> 0x0088 }
                r1.<init>(r2)     // Catch:{ all -> 0x0088 }
                com.yandex.metrica.impl.ob.L7 r2 = com.yandex.metrica.impl.ob.L7.this     // Catch:{ all -> 0x0088 }
                java.util.List r2 = r2.f4478g     // Catch:{ all -> 0x0088 }
                r2.clear()     // Catch:{ all -> 0x0088 }
                monitor-exit(r0)     // Catch:{ all -> 0x0088 }
                com.yandex.metrica.impl.ob.L7 r0 = com.yandex.metrica.impl.ob.L7.this
                r0.a((java.util.List<android.content.ContentValues>) r1)
                monitor-enter(r4)
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0085 }
                r0.<init>()     // Catch:{ all -> 0x0085 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0085 }
            L_0x0045:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0085 }
                if (r2 == 0) goto L_0x005f
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0085 }
                android.content.ContentValues r2 = (android.content.ContentValues) r2     // Catch:{ all -> 0x0085 }
                com.yandex.metrica.impl.ob.L7 r3 = com.yandex.metrica.impl.ob.L7.this     // Catch:{ all -> 0x0085 }
                int r2 = r3.a((android.content.ContentValues) r2)     // Catch:{ all -> 0x0085 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0085 }
                r0.add(r2)     // Catch:{ all -> 0x0085 }
                goto L_0x0045
            L_0x005f:
                com.yandex.metrica.impl.ob.L7 r1 = com.yandex.metrica.impl.ob.L7.this     // Catch:{ all -> 0x0085 }
                java.util.List r1 = r1.k     // Catch:{ all -> 0x0085 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0085 }
            L_0x0069:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0085 }
                if (r2 == 0) goto L_0x0079
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0085 }
                com.yandex.metrica.impl.ob.nb r2 = (com.yandex.metrica.impl.ob.C0578nb) r2     // Catch:{ all -> 0x0085 }
                r2.a(r0)     // Catch:{ all -> 0x0085 }
                goto L_0x0069
            L_0x0079:
                com.yandex.metrica.impl.ob.L3 r0 = r4.f4480b     // Catch:{ all -> 0x0085 }
                com.yandex.metrica.impl.ob.ob r0 = r0.l()     // Catch:{ all -> 0x0085 }
                r0.c()     // Catch:{ all -> 0x0085 }
                monitor-exit(r4)
                goto L_0x0000
            L_0x0085:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            L_0x0088:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0088 }
                throw r1
            L_0x008b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.L7.a.run():void");
        }
    }

    static {
        HashSet<Integer> hashSet = new HashSet<>();
        o = hashSet;
        hashSet.add(Integer.valueOf(C0244a1.EVENT_TYPE_INIT.b()));
        hashSet.add(Integer.valueOf(C0244a1.EVENT_TYPE_START.b()));
    }

    public L7(L3 l3, O7 o7, K7 k7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f4472a = reentrantReadWriteLock;
        this.f4473b = reentrantReadWriteLock.readLock();
        this.f4474c = reentrantReadWriteLock.writeLock();
        AtomicLong atomicLong = new AtomicLong();
        this.j = atomicLong;
        this.k = new ArrayList();
        this.n = new rn<>();
        this.f4475d = o7;
        this.f4479h = l3.g();
        this.i = l3;
        this.l = k7;
        atomicLong.set(d());
        a aVar = new a(l3);
        this.f4476e = aVar;
        aVar.setName(a((P3) l3));
        a(l3.w());
    }

    public void e() {
        this.f4476e.start();
    }

    private void a(C0635pi piVar) {
        Object obj;
        Object obj2;
        C0754ui.a aVar = null;
        C0754ui.a aVar2 = (!piVar.f().o || piVar.Q() == null) ? null : piVar.Q().f6925b;
        if (piVar.f().o && piVar.Q() != null) {
            aVar = piVar.Q().f6924a;
        }
        EnumMap enumMap = new EnumMap(C0754ui.b.class);
        C0754ui.b bVar = C0754ui.b.WIFI;
        if (aVar2 == null) {
            obj = new sn();
        } else {
            obj = new yn(new xn(new Bn(), new Cn()), new SystemTimeProvider(), aVar2.f6926a, aVar2.f6927b);
        }
        enumMap.put(bVar, obj);
        C0754ui.b bVar2 = C0754ui.b.CELL;
        if (aVar == null) {
            obj2 = new sn();
        } else {
            obj2 = new yn(new xn(new C0615on.a(), new pn()), new SystemTimeProvider(), aVar.f6926a, aVar.f6927b);
        }
        enumMap.put(bVar2, obj2);
        this.m = new qn<>(enumMap);
    }

    private long d() {
        long j2;
        this.f4473b.lock();
        try {
            SQLiteDatabase readableDatabase = this.f4475d.getReadableDatabase();
            if (readableDatabase != null) {
                j2 = C0267b.a(readableDatabase, "reports");
                this.f4473b.unlock();
                return j2;
            }
        } catch (Throwable unused) {
        }
        j2 = 0;
        this.f4473b.unlock();
        return j2;
    }

    public Cursor b(long j2, C0374f6 f6Var) throws SQLiteException {
        Cursor cursor;
        this.f4473b.lock();
        try {
            SQLiteDatabase readableDatabase = this.f4475d.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.query("reports", (String[]) null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j2), Integer.toString(f6Var.a())}, (String) null, (String) null, "number ASC", (String) null);
                this.f4473b.unlock();
                return cursor;
            }
        } catch (Throwable unused) {
        }
        cursor = null;
        this.f4473b.unlock();
        return cursor;
    }

    public long c() {
        this.f4473b.lock();
        try {
            return this.j.get();
        } finally {
            this.f4473b.unlock();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        com.yandex.metrica.impl.ob.A2.a((android.database.Cursor) r1);
        r4.f4473b.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0034 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<android.content.ContentValues> b() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.Lock r1 = r4.f4473b
            r1.lock()
            r1 = 0
            com.yandex.metrica.impl.ob.O7 r2 = r4.f4475d     // Catch:{ all -> 0x0034 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x002b
            java.lang.String r3 = com.yandex.metrica.impl.ob.C0475j8.e.f6053c     // Catch:{ all -> 0x0034 }
            android.database.Cursor r1 = r2.rawQuery(r3, r1)     // Catch:{ all -> 0x0034 }
        L_0x0019:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x002b
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            android.database.DatabaseUtils.cursorRowToContentValues(r1, r2)     // Catch:{ all -> 0x0034 }
            r0.add(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0019
        L_0x002b:
            com.yandex.metrica.impl.ob.A2.a((android.database.Cursor) r1)
            java.util.concurrent.locks.Lock r1 = r4.f4473b
            r1.unlock()
            goto L_0x0041
        L_0x0034:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0042 }
            r0.<init>()     // Catch:{ all -> 0x0042 }
            com.yandex.metrica.impl.ob.A2.a((android.database.Cursor) r1)
            java.util.concurrent.locks.Lock r1 = r4.f4473b
            r1.unlock()
        L_0x0041:
            return r0
        L_0x0042:
            r0 = move-exception
            com.yandex.metrica.impl.ob.A2.a((android.database.Cursor) r1)
            java.util.concurrent.locks.Lock r1 = r4.f4473b
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.L7.b():java.util.List");
    }

    public long a(Set<Integer> set) {
        this.f4473b.lock();
        Cursor cursor = null;
        long j2 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f4475d.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM reports");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                int i2 = 0;
                for (Integer next : set) {
                    if (i2 > 0) {
                        sb.append(" OR ");
                    }
                    sb.append("type == " + next);
                    i2++;
                }
                cursor = readableDatabase.rawQuery(sb.toString(), (String[]) null);
                if (cursor.moveToFirst()) {
                    j2 = cursor.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        A2.a(cursor);
        this.f4473b.unlock();
        return j2;
    }

    public void b(C0635pi piVar) {
        a(piVar);
    }

    public void a(C0578nb nbVar) {
        this.k.add(nbVar);
    }

    private static String a(P3 p3) {
        return "DatabaseWorker [" + ((L3) p3).e().c() + "]";
    }

    public void a(long j2, C0374f6 f6Var, long j3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(OSOutcomeConstants.OUTCOME_ID, Long.valueOf(j2));
        contentValues.put("start_time", Long.valueOf(j3));
        contentValues.put("server_time_offset", Long.valueOf(C0390fm.c().a()));
        contentValues.put("obtained_before_first_sync", Boolean.valueOf(C0390fm.c().e()));
        contentValues.put("type", Integer.valueOf(f6Var.a()));
        new C0443i0(this.f4479h).a(this.i.m()).a(contentValues).a();
        this.f4474c.lock();
        try {
            SQLiteDatabase writableDatabase = this.f4475d.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow(Constants.SESSIONS, (String) null, contentValues);
            }
        } catch (Throwable unused) {
        }
        this.f4474c.unlock();
    }

    public void a(Bm bm, int i2, C0299c6 c6Var, C0687s.a aVar, O3 o3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("number", Long.valueOf(c6Var.a()));
        contentValues.put("global_number", Integer.valueOf(C0856z0.d(i2) ? o3.a() : 0));
        contentValues.put("number_of_type", Integer.valueOf(o3.a(i2)));
        contentValues.put("time", Long.valueOf(c6Var.b()));
        contentValues.put("session_id", Long.valueOf(c6Var.c()));
        contentValues.put("session_type", Integer.valueOf(c6Var.d().a()));
        new C0443i0(this.f4479h).a(this.i.m()).a(contentValues).a(bm, aVar, o.contains(Integer.valueOf(i2)) ? this.n : this.m);
        synchronized (this.f4477f) {
            this.f4478g.add(contentValues);
        }
        synchronized (this.f4476e) {
            this.f4476e.notifyAll();
        }
    }

    public int a(long j2) {
        this.f4474c.lock();
        int i2 = 0;
        try {
            int i3 = C0475j8.f6038a;
            SQLiteDatabase writableDatabase = this.f4475d.getWritableDatabase();
            if (writableDatabase != null) {
                i2 = writableDatabase.delete(Constants.SESSIONS, C0475j8.e.f6054d, new String[]{String.valueOf(j2)});
            }
        } catch (Throwable unused) {
        }
        this.f4474c.unlock();
        return i2;
    }

    public void a() {
        SQLiteDatabase writableDatabase;
        try {
            this.f4474c.lock();
            if (this.j.get() > this.i.m().J() && (writableDatabase = this.f4475d.getWritableDatabase()) != null) {
                this.j.addAndGet((long) (-a(writableDatabase)));
            }
        } catch (Throwable unused) {
        }
        this.f4474c.unlock();
    }

    private int a(SQLiteDatabase sQLiteDatabase) {
        try {
            String format = String.format("%1$s IN (SELECT %1$s FROM %2$s ORDER BY CASE WHEN %3$s IN (%4$s) THEN 2 WHEN %3$s IN (%5$s) THEN 1 ELSE 0 END, %6$s LIMIT (SELECT count() FROM %2$s) / %7$s)", new Object[]{OSOutcomeConstants.OUTCOME_ID, "reports", "type", TextUtils.join(", ", C0856z0.i), TextUtils.join(", ", C0856z0.j), OSOutcomeConstants.OUTCOME_ID, 10});
            return this.l.a(sQLiteDatabase, "reports", format, K7.b.DB_OVERFLOW, this.i.e().a(), true).f4422b;
        } catch (Throwable th) {
            ((C0584nh) C0609oh.a()).reportError("deleteExcessiveReports exception", th);
            return 0;
        }
    }

    public void a(long j2, int i2, int i3, boolean z) throws SQLiteException {
        List<ContentValues> list;
        if (i3 > 0) {
            this.f4474c.lock();
            try {
                Locale locale = Locale.US;
                String format = String.format(locale, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", new Object[]{"session_id", Long.toString(j2), "session_type", Integer.toString(i2), OSOutcomeConstants.OUTCOME_ID, "reports", Integer.toString(i3 - 1)});
                SQLiteDatabase writableDatabase = this.f4475d.getWritableDatabase();
                if (writableDatabase != null) {
                    K7.a a2 = this.l.a(writableDatabase, "reports", format, K7.b.BAD_REQUEST, this.i.e().a(), z);
                    if (a2.f4421a != null) {
                        ArrayList arrayList = new ArrayList();
                        for (ContentValues a3 : a2.f4421a) {
                            arrayList.add(Integer.valueOf(a(a3)));
                        }
                        for (C0578nb b2 : this.k) {
                            b2.b(arrayList);
                        }
                    }
                    if (this.i.q().isEnabled() && (list = a2.f4421a) != null) {
                        for (int i4 = 0; i4 < list.size(); i4++) {
                            a(list.get(i4), "Event removed from db");
                        }
                    }
                    this.j.addAndGet((long) (-a2.f4422b));
                }
            } catch (Throwable unused) {
            }
            this.f4474c.unlock();
        }
    }

    public Cursor a(Map<String, String> map) {
        Cursor cursor;
        this.f4473b.lock();
        try {
            SQLiteDatabase readableDatabase = this.f4475d.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.query(Constants.SESSIONS, (String[]) null, a("id >= ?", map), a(new String[]{Long.toString(0)}, map), (String) null, (String) null, "id ASC", (String) null);
                this.f4473b.unlock();
                return cursor;
            }
        } catch (Throwable unused) {
        }
        cursor = null;
        this.f4473b.unlock();
        return cursor;
    }

    /* access modifiers changed from: package-private */
    public void a(List<ContentValues> list) {
        SQLiteDatabase sQLiteDatabase;
        if (!list.isEmpty()) {
            this.f4474c.lock();
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                sQLiteDatabase = this.f4475d.getWritableDatabase();
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.beginTransaction();
                        for (ContentValues next : list) {
                            sQLiteDatabase.insertOrThrow("reports", (String) null, next);
                            this.j.incrementAndGet();
                            a(next, "Event saved to db");
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        this.j.get();
                    } catch (Throwable unused) {
                        sQLiteDatabase2 = sQLiteDatabase;
                        sQLiteDatabase = sQLiteDatabase2;
                        A2.a(sQLiteDatabase);
                        this.f4474c.unlock();
                    }
                }
            } catch (Throwable unused2) {
                sQLiteDatabase = sQLiteDatabase2;
                A2.a(sQLiteDatabase);
                this.f4474c.unlock();
            }
            A2.a(sQLiteDatabase);
            this.f4474c.unlock();
        }
    }

    public ContentValues a(long j2, C0374f6 f6Var) {
        ContentValues contentValues = new ContentValues();
        this.f4473b.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f4475d.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursor = readableDatabase.rawQuery(String.format(locale, "SELECT report_request_parameters FROM sessions WHERE id = %s AND type = %s ORDER BY id DESC LIMIT 1", new Object[]{Long.valueOf(j2), Integer.valueOf(f6Var.a())}), (String[]) null);
                if (cursor.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            }
            A2.a(cursor);
            this.f4473b.unlock();
        } catch (Throwable unused) {
            A2.a((Cursor) null);
            this.f4473b.unlock();
        }
        return contentValues;
    }

    private static String a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(str);
        for (String next : map.keySet()) {
            sb.append(sb.length() > 0 ? " AND " : "");
            sb.append(next + " = ? ");
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return sb.toString();
    }

    private static String[] a(String[] strArr, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        for (Map.Entry<String, String> value : map.entrySet()) {
            arrayList.add(value.getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private void a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (C0856z0.c(asInteger != null ? asInteger.intValue() : -1)) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(": ");
            String asString = contentValues.getAsString("name");
            String str2 = "";
            if (asString == null) {
                asString = str2;
            }
            sb.append(asString);
            String asString2 = contentValues.getAsString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (asString2 != null) {
                str2 = asString2;
            }
            if (C0856z0.e(a(contentValues)) && !TextUtils.isEmpty(str2)) {
                sb.append(" with value ");
                sb.append(str2);
            }
            this.i.q().i(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public int a(ContentValues contentValues) {
        return contentValues.getAsInteger("type").intValue();
    }

    static boolean a(L7 l7) {
        boolean isEmpty;
        synchronized (l7.f4477f) {
            isEmpty = l7.f4478g.isEmpty();
        }
        return isEmpty;
    }
}
