package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.b.g;
import com.bytedance.sdk.openadsdk.b.m;
import com.bytedance.sdk.openadsdk.b.q;
import com.bytedance.sdk.openadsdk.b.s;
import com.bytedance.sdk.openadsdk.k.h;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DBHelper */
class f {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1173c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private c f1174a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Context f1175b;

    f(Context context) {
        Context context2;
        if (context == null) {
            try {
                context2 = m.a();
            } catch (Throwable unused) {
                return;
            }
        } else {
            context2 = context.getApplicationContext();
        }
        this.f1175b = context2;
        if (this.f1174a == null) {
            this.f1174a = new c();
        }
    }

    /* access modifiers changed from: private */
    public Context c() {
        Context context = this.f1175b;
        return context == null ? m.a() : context;
    }

    /* compiled from: DBHelper */
    public class c {

        /* renamed from: b  reason: collision with root package name */
        private SQLiteDatabase f1188b = null;

        public c() {
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
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        private synchronized void d() {
            /*
                r4 = this;
                monitor-enter(r4)
                java.lang.Object r0 = com.bytedance.sdk.openadsdk.core.f.f1173c     // Catch:{ all -> 0x002e }
                monitor-enter(r0)     // Catch:{ all -> 0x002e }
                android.database.sqlite.SQLiteDatabase r1 = r4.f1188b     // Catch:{ all -> 0x002b }
                if (r1 == 0) goto L_0x0012
                android.database.sqlite.SQLiteDatabase r1 = r4.f1188b     // Catch:{ all -> 0x002b }
                boolean r1 = r1.isOpen()     // Catch:{ all -> 0x002b }
                if (r1 != 0) goto L_0x0029
            L_0x0012:
                com.bytedance.sdk.openadsdk.core.f$a r1 = new com.bytedance.sdk.openadsdk.core.f$a     // Catch:{ all -> 0x002b }
                com.bytedance.sdk.openadsdk.core.f r2 = com.bytedance.sdk.openadsdk.core.f.this     // Catch:{ all -> 0x002b }
                com.bytedance.sdk.openadsdk.core.f r3 = com.bytedance.sdk.openadsdk.core.f.this     // Catch:{ all -> 0x002b }
                android.content.Context r3 = r3.c()     // Catch:{ all -> 0x002b }
                r1.<init>(r3)     // Catch:{ all -> 0x002b }
                android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ all -> 0x002b }
                r4.f1188b = r1     // Catch:{ all -> 0x002b }
                r2 = 0
                r1.setLockingEnabled(r2)     // Catch:{ all -> 0x002b }
            L_0x0029:
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                goto L_0x0038
            L_0x002b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r1     // Catch:{ all -> 0x002e }
            L_0x002e:
                r0 = move-exception
                r0.printStackTrace()     // Catch:{ all -> 0x003b }
                boolean r1 = r4.e()     // Catch:{ all -> 0x003b }
                if (r1 != 0) goto L_0x003a
            L_0x0038:
                monitor-exit(r4)
                return
            L_0x003a:
                throw r0     // Catch:{ all -> 0x003b }
            L_0x003b:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.f.c.d():void");
        }

        public synchronized void a(String str) throws SQLException {
            try {
                d();
                this.f1188b.execSQL(str);
            } catch (Throwable th) {
                if (e()) {
                    throw th;
                }
            }
        }

        public synchronized Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursor;
            try {
                d();
                cursor = this.f1188b.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                th.printStackTrace();
                b bVar = new b();
                if (!e()) {
                    cursor = bVar;
                } else {
                    throw th;
                }
            }
            return cursor;
        }

        public synchronized int a(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i;
            try {
                d();
                i = this.f1188b.update(str, contentValues, str2, strArr);
            } catch (Exception e2) {
                e2.printStackTrace();
                if (!e()) {
                    i = 0;
                } else {
                    throw e2;
                }
            }
            return i;
        }

        public synchronized long a(String str, String str2, ContentValues contentValues) {
            long j;
            try {
                d();
                j = this.f1188b.replace(str, str2, contentValues);
            } catch (Exception e2) {
                e2.printStackTrace();
                if (!e()) {
                    j = -1;
                } else {
                    throw e2;
                }
            }
            return j;
        }

        public synchronized int a(String str, String str2, String[] strArr) {
            int i;
            try {
                d();
                i = this.f1188b.delete(str, str2, strArr);
            } catch (Exception e2) {
                e2.printStackTrace();
                if (!e()) {
                    i = 0;
                } else {
                    throw e2;
                }
            }
            return i;
        }

        public synchronized void a() {
            d();
            if (this.f1188b != null) {
                this.f1188b.beginTransaction();
            }
        }

        public synchronized void b() {
            d();
            if (this.f1188b != null) {
                this.f1188b.setTransactionSuccessful();
            }
        }

        public synchronized void c() {
            d();
            if (this.f1188b != null) {
                this.f1188b.endTransaction();
            }
        }

        private synchronized boolean e() {
            SQLiteDatabase sQLiteDatabase;
            sQLiteDatabase = this.f1188b;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }
    }

    /* compiled from: DBHelper */
    private class a extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        final Context f1176a;

        public a(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 6);
            this.f1176a = context;
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                a(sQLiteDatabase, this.f1176a);
            } catch (Throwable unused) {
            }
        }

        private void a(SQLiteDatabase sQLiteDatabase, Context context) {
            l.b("DBHelper", "initDB........");
            sQLiteDatabase.execSQL(g.e());
            sQLiteDatabase.execSQL(m.f());
            sQLiteDatabase.execSQL(s.f());
            sQLiteDatabase.execSQL(q.d());
            sQLiteDatabase.execSQL(h.b());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.a.b.a.c());
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            try {
                l.b("DBHelper", "onUpgrade....Database version upgrade.....old:" + i + ",new:" + i2);
                if (i > i2) {
                    a(sQLiteDatabase);
                    a(sQLiteDatabase, f.this.f1175b);
                    l.b("DBHelper", "onUpgrade...Reverse installation. Database reset and create table.....");
                } else {
                    a(sQLiteDatabase, f.this.f1175b);
                }
                if (i == 1) {
                    l.b("DBHelper", "onUpgrade.....perform table creation.....");
                } else if (i == 2) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                } else if (i == 3) {
                    sQLiteDatabase.execSQL(s.f());
                } else if (i == 4) {
                    sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.a.b.a.c());
                } else if (i == 5) {
                    sQLiteDatabase.execSQL(q.d());
                }
            } catch (Throwable unused) {
            }
        }

        private void a(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> b2 = b(sQLiteDatabase);
            if (b2 != null && b2.size() > 0) {
                Iterator<String> it = b2.iterator();
                while (it.hasNext()) {
                    sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", new Object[]{it.next()}));
                }
            }
        }

        private ArrayList<String> b(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            try {
                Cursor rawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", (String[]) null);
                if (rawQuery != null) {
                    while (rawQuery.moveToNext()) {
                        String string = rawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                    rawQuery.close();
                }
            } catch (Exception unused) {
            }
            return arrayList;
        }
    }

    public c a() {
        return this.f1174a;
    }

    /* compiled from: DBHelper */
    private class b extends AbstractCursor {
        public String[] getColumnNames() {
            return new String[0];
        }

        public int getCount() {
            return 0;
        }

        public double getDouble(int i) {
            return 0.0d;
        }

        public float getFloat(int i) {
            return 0.0f;
        }

        public int getInt(int i) {
            return 0;
        }

        public long getLong(int i) {
            return 0;
        }

        public short getShort(int i) {
            return 0;
        }

        public String getString(int i) {
            return null;
        }

        public boolean isNull(int i) {
            return true;
        }

        private b() {
        }
    }
}
