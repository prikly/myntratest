package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;

public class X7 {

    /* renamed from: a  reason: collision with root package name */
    private final C0500k8 f5318a;

    /* renamed from: b  reason: collision with root package name */
    private final C0500k8 f5319b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<C0500k8> f5320c;

    /* renamed from: d  reason: collision with root package name */
    private final Y7 f5321d;

    public static class b {
        public X7 a(String str, C0500k8 k8Var, C0500k8 k8Var2, SparseArray<C0500k8> sparseArray, Y7 y7) {
            return new X7(str, k8Var, k8Var2, sparseArray, y7);
        }
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f5318a.a(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.database.sqlite.SQLiteDatabase r2) {
        /*
            r1 = this;
            com.yandex.metrica.impl.ob.Y7 r0 = r1.f5321d     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0016
            com.yandex.metrica.impl.ob.Z7 r0 = (com.yandex.metrica.impl.ob.Z7) r0
            boolean r0 = r0.a(r2)     // Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0016
            com.yandex.metrica.impl.ob.k8 r0 = r1.f5319b     // Catch:{ all -> 0x0016 }
            r0.a(r2)     // Catch:{ all -> 0x0011 }
        L_0x0011:
            com.yandex.metrica.impl.ob.k8 r0 = r1.f5318a     // Catch:{ all -> 0x0016 }
            r0.a(r2)     // Catch:{ all -> 0x0016 }
        L_0x0016:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.X7.b(android.database.sqlite.SQLiteDatabase):void");
    }

    private X7(String str, C0500k8 k8Var, C0500k8 k8Var2, SparseArray<C0500k8> sparseArray, Y7 y7) {
        this.f5318a = k8Var;
        this.f5319b = k8Var2;
        this.f5320c = sparseArray;
        this.f5321d = y7;
    }

    public void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            try {
                this.f5319b.a(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            try {
                this.f5318a.a(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
        /*
            r3 = this;
            r0 = 1
            if (r6 <= r5) goto L_0x0017
            r1 = 0
            int r5 = r5 + r0
        L_0x0005:
            if (r5 > r6) goto L_0x0018
            android.util.SparseArray<com.yandex.metrica.impl.ob.k8> r2 = r3.f5320c     // Catch:{ all -> 0x0017 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x0017 }
            com.yandex.metrica.impl.ob.k8 r2 = (com.yandex.metrica.impl.ob.C0500k8) r2     // Catch:{ all -> 0x0017 }
            if (r2 == 0) goto L_0x0014
            r2.a(r4)     // Catch:{ all -> 0x0017 }
        L_0x0014:
            int r5 = r5 + 1
            goto L_0x0005
        L_0x0017:
            r1 = 1
        L_0x0018:
            com.yandex.metrica.impl.ob.Y7 r5 = r3.f5321d
            com.yandex.metrica.impl.ob.Z7 r5 = (com.yandex.metrica.impl.ob.Z7) r5
            boolean r5 = r5.a(r4)
            r5 = r5 ^ r0
            r5 = r5 | r1
            if (r5 == 0) goto L_0x002e
            com.yandex.metrica.impl.ob.k8 r5 = r3.f5319b
            r5.a(r4)     // Catch:{ all -> 0x0029 }
        L_0x0029:
            com.yandex.metrica.impl.ob.k8 r5 = r3.f5318a
            r5.a(r4)     // Catch:{ all -> 0x002e }
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.X7.b(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
