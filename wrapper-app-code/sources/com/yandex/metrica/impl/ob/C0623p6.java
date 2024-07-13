package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.p6  reason: case insensitive filesystem */
public class C0623p6 implements C0598o6 {

    /* renamed from: a  reason: collision with root package name */
    private final List<C0564mm<String>> f6432a;

    /* renamed from: b  reason: collision with root package name */
    private final C0791w7 f6433b;

    /* renamed from: c  reason: collision with root package name */
    private final C0564mm<String> f6434c;

    /* renamed from: com.yandex.metrica.impl.ob.p6$a */
    class a implements C0564mm<String> {
        a() {
        }

        public void b(Object obj) {
            C0623p6.a(C0623p6.this, (String) obj);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0623p6(android.content.Context r4) {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.w7 r0 = new com.yandex.metrica.impl.ob.w7
            java.lang.String r1 = com.yandex.metrica.impl.ob.C0267b.a((android.content.Context) r4)
            java.io.File r4 = com.yandex.metrica.coreutils.io.FileUtils.getStorageDirectory(r4)
            if (r4 != 0) goto L_0x000e
            r4 = 0
            goto L_0x0028
        L_0x000e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r4.getAbsolutePath()
            r2.append(r4)
            java.lang.String r4 = "/"
            r2.append(r4)
            java.lang.String r4 = "appmetrica_native_crashes"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L_0x0028:
            r0.<init>(r1, r4)
            r3.<init>((com.yandex.metrica.impl.ob.C0791w7) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0623p6.<init>(android.content.Context):void");
    }

    public synchronized void a(C0564mm<String> mmVar) {
        this.f6432a.add(mmVar);
    }

    public synchronized void b(C0564mm<String> mmVar) {
        this.f6432a.remove(mmVar);
    }

    public void a() {
        this.f6433b.a(this.f6434c);
    }

    public void b() {
        this.f6433b.b(this.f6434c);
    }

    static void a(C0623p6 p6Var, String str) {
        ArrayList arrayList;
        synchronized (p6Var) {
            arrayList = new ArrayList(p6Var.f6432a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0564mm) it.next()).b(str);
        }
    }

    C0623p6(C0791w7 w7Var) {
        this.f6432a = new ArrayList();
        this.f6434c = new a();
        this.f6433b = w7Var;
    }
}
