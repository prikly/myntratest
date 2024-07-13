package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.adcolony.sdk.e0;
import com.adcolony.sdk.n0;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

class o {

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n0 f10196a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SQLiteDatabase f10197b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f10198c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f10199d;

        a(n0 n0Var, SQLiteDatabase sQLiteDatabase, b bVar, CountDownLatch countDownLatch) {
            this.f10196a = n0Var;
            this.f10197b = sQLiteDatabase;
            this.f10198c = bVar;
            this.f10199d = countDownLatch;
        }

        public void run() {
            for (n0.a next : this.f10196a.a()) {
                for (Map.Entry next2 : next.e().entrySet()) {
                    c a2 = o.a((String) next2.getValue(), this.f10197b);
                    if (a2 != null) {
                        this.f10198c.a(next.d(), (String) next2.getKey(), a2);
                    }
                }
            }
            o0.c().a(this.f10198c);
            this.f10199d.countDown();
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f10200a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, ArrayList<a>> f10201b;

        static class a {

            /* renamed from: a  reason: collision with root package name */
            private final String f10202a;

            /* renamed from: b  reason: collision with root package name */
            private final c f10203b;

            /* synthetic */ a(String str, c cVar, a aVar) {
                this(str, cVar);
            }

            /* access modifiers changed from: package-private */
            public String a() {
                return this.f10202a;
            }

            /* access modifiers changed from: package-private */
            public c b() {
                return this.f10203b;
            }

            private a(String str, c cVar) {
                this.f10202a = str;
                this.f10203b = cVar;
            }
        }

        /* synthetic */ b(int i, a aVar) {
            this(i);
        }

        /* access modifiers changed from: package-private */
        public f1 b() {
            f1 b2 = c0.b();
            c0.b(b2, MediationMetaData.KEY_VERSION, a());
            for (Map.Entry next : this.f10201b.entrySet()) {
                f1 b3 = c0.b();
                Iterator it = ((ArrayList) next.getValue()).iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    e1 a2 = c0.a();
                    for (String b4 : aVar.b().a((Character) ',')) {
                        a2.b(b4);
                    }
                    c0.a(b3, aVar.a(), a2);
                }
                c0.a(b2, (String) next.getKey(), b3);
            }
            return b2;
        }

        private b(int i) {
            this.f10201b = new ConcurrentHashMap();
            this.f10200a = i;
        }

        /* access modifiers changed from: private */
        public void a(String str, String str2, c cVar) {
            ArrayList arrayList;
            a aVar = new a(str2, cVar, (a) null);
            if (!this.f10201b.containsKey(str) || (arrayList = this.f10201b.get(str)) == null) {
                this.f10201b.put(str, new ArrayList(Collections.singletonList(aVar)));
            } else {
                arrayList.add(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f10200a;
        }
    }

    static b a(n0 n0Var, SQLiteDatabase sQLiteDatabase, Executor executor, long j) {
        b bVar = new b(n0Var.b(), (a) null);
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            executor.execute(new a(n0Var, sQLiteDatabase, bVar, countDownLatch));
            if (j > 0) {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } else {
                countDownLatch.await();
            }
        } catch (InterruptedException | RejectedExecutionException e2) {
            e0.a aVar = new e0.a();
            aVar.a("ADCDbReader.calculateFeatureVectors failed with: " + e2.toString()).a(e0.i);
        }
        return bVar;
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        private final List<a> f10204a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<ContentValues> f10205b = new ArrayList();

        static class a {

            /* renamed from: a  reason: collision with root package name */
            private final int f10206a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public final String f10207b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public final int f10208c;

            /* synthetic */ a(int i, String str, int i2, a aVar) {
                this(i, str, i2);
            }

            /* access modifiers changed from: package-private */
            public int c() {
                return this.f10208c;
            }

            private a(int i, String str, int i2) {
                this.f10206a = i;
                this.f10207b = str;
                this.f10208c = i2;
            }

            /* access modifiers changed from: package-private */
            public int a() {
                return this.f10206a;
            }

            /* access modifiers changed from: package-private */
            public String b() {
                return this.f10207b;
            }
        }

        c() {
        }

        /* access modifiers changed from: package-private */
        public int b(int i) {
            if (i < 0 || i >= this.f10204a.size()) {
                return -1;
            }
            return this.f10204a.get(i).c();
        }

        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                str = "\n";
                if (i >= this.f10204a.size()) {
                    break;
                }
                sb.append(this.f10204a.get(i).f10207b);
                if (i != this.f10204a.size() - 1) {
                    str = " | ";
                }
                sb.append(str);
                i++;
            }
            for (ContentValues next : this.f10205b) {
                for (int i2 = 0; i2 < this.f10204a.size(); i2++) {
                    sb.append(next.getAsString(a(i2)));
                    if (i2 == this.f10204a.size() - 1) {
                        str2 = str;
                    } else {
                        str2 = " | ";
                    }
                    sb.append(str2);
                }
            }
            return sb.toString();
        }

        /* access modifiers changed from: private */
        public void a(int i, String str, int i2) {
            this.f10204a.add(new a(i, str, i2, (a) null));
        }

        /* access modifiers changed from: package-private */
        public String a(int i) {
            if (i < 0 || i >= this.f10204a.size()) {
                return null;
            }
            return this.f10204a.get(i).b();
        }

        /* access modifiers changed from: private */
        public void a(Cursor cursor) {
            ContentValues contentValues = new ContentValues();
            for (a next : this.f10204a) {
                int a2 = next.f10208c;
                if (a2 == 1) {
                    contentValues.put(next.b(), Long.valueOf(cursor.getLong(next.a())));
                } else if (a2 == 2) {
                    contentValues.put(next.b(), Double.valueOf(cursor.getDouble(next.a())));
                } else if (a2 != 4) {
                    contentValues.put(next.b(), cursor.getString(next.a()));
                } else {
                    contentValues.put(next.b(), cursor.getBlob(next.a()));
                }
            }
            this.f10205b.add(contentValues);
        }

        /* access modifiers changed from: package-private */
        public String a(int i, Character ch) {
            if (i < 0 || i >= this.f10205b.size()) {
                return null;
            }
            ContentValues contentValues = this.f10205b.get(i);
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (i2 < this.f10204a.size()) {
                if (b(i2) == 3) {
                    sb.append("\"");
                    sb.append(contentValues.get(a(i2)));
                    sb.append("\"");
                } else {
                    sb.append(contentValues.getAsString(a(i2)));
                }
                sb.append(i2 == this.f10204a.size() + -1 ? "" : ch);
                i2++;
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public List<String> a(Character ch) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f10205b.size(); i++) {
                arrayList.add(a(i, ch));
            }
            return arrayList;
        }
    }

    static c a(String str, SQLiteDatabase sQLiteDatabase) {
        c cVar;
        Throwable th;
        c cVar2 = null;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(str, (String[]) null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.moveToFirst()) {
                        cVar = new c();
                        int i = 0;
                        while (i < rawQuery.getColumnCount()) {
                            try {
                                cVar.a(i, rawQuery.getColumnName(i), rawQuery.getType(i));
                                i++;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    rawQuery.close();
                                } catch (Throwable th3) {
                                    try {
                                        th.addSuppressed(th3);
                                    } catch (SQLException e2) {
                                        e = e2;
                                        new e0.a().a("SQLException on execute query: ").a(e.toString()).a(e0.i);
                                        return cVar;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        new e0.a().a("Error on execute query: ").a(th.toString()).a(e0.i);
                                        return cVar;
                                    }
                                }
                                throw th;
                            }
                        }
                        do {
                            cVar.a(rawQuery);
                        } while (rawQuery.moveToNext());
                        cVar2 = cVar;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    cVar = null;
                    rawQuery.close();
                    throw th;
                }
            }
            if (rawQuery == null) {
                return cVar2;
            }
            rawQuery.close();
            return cVar2;
        } catch (SQLException e3) {
            e = e3;
            cVar = cVar2;
        } catch (Throwable th6) {
            th = th6;
            cVar = cVar2;
            new e0.a().a("Error on execute query: ").a(th.toString()).a(e0.i);
            return cVar;
        }
    }
}
