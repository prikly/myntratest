package com.yandex.metrica.impl.ob;

import android.util.SparseArray;
import com.yandex.metrica.impl.ob.C0775vf;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.af  reason: case insensitive filesystem */
public class C0258af {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f5479c = {0, 1, 2, 3};

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<HashMap<String, C0775vf.a>> f5480a;

    /* renamed from: b  reason: collision with root package name */
    private int f5481b;

    public C0258af() {
        this(f5479c);
    }

    public C0775vf.a a(int i, String str) {
        return (C0775vf.a) this.f5480a.get(i).get(str);
    }

    public void b() {
        this.f5481b++;
    }

    public C0775vf c() {
        C0775vf vfVar = new C0775vf();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f5480a.size(); i++) {
            SparseArray<HashMap<String, C0775vf.a>> sparseArray = this.f5480a;
            for (C0775vf.a add : sparseArray.get(sparseArray.keyAt(i)).values()) {
                arrayList.add(add);
            }
        }
        vfVar.f6989a = (C0775vf.a[]) arrayList.toArray(new C0775vf.a[arrayList.size()]);
        return vfVar;
    }

    C0258af(int[] iArr) {
        this.f5480a = new SparseArray<>();
        this.f5481b = 0;
        for (int put : iArr) {
            this.f5480a.put(put, new HashMap());
        }
    }

    /* access modifiers changed from: package-private */
    public void a(C0775vf.a aVar) {
        this.f5480a.get(aVar.f6992b).put(new String(aVar.f6991a), aVar);
    }

    public int a() {
        return this.f5481b;
    }
}
