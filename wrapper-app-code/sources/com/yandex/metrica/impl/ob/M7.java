package com.yandex.metrica.impl.ob;

import android.util.SparseArray;
import com.yandex.metrica.impl.ob.C0475j8;
import com.yandex.metrica.impl.ob.X7;
import java.util.HashMap;
import java.util.List;

public class M7 {

    /* renamed from: a  reason: collision with root package name */
    private final N7 f4540a;

    /* renamed from: b  reason: collision with root package name */
    private final P7 f4541b;

    /* renamed from: c  reason: collision with root package name */
    private final X7.b f4542c;

    public M7(N7 n7, P7 p7, X7.b bVar) {
        this.f4540a = n7;
        this.f4541b = p7;
        this.f4542c = bVar;
    }

    public X7 a() {
        HashMap hashMap = new HashMap();
        hashMap.put("binary_data", C0475j8.b.f6047a);
        return this.f4542c.a("auto_inapp", this.f4540a.a(), this.f4540a.b(), new SparseArray(), new Z7("auto_inapp", hashMap));
    }

    public X7 b() {
        HashMap hashMap = new HashMap();
        hashMap.put("preferences", C0475j8.c.f6048a);
        return this.f4542c.a("client storage", this.f4540a.c(), this.f4540a.d(), new SparseArray(), new Z7("metrica.db", hashMap));
    }

    public X7 c() {
        return this.f4542c.a("main", this.f4540a.e(), this.f4540a.f(), this.f4540a.l(), new Z7("main", this.f4541b.a()));
    }

    public X7 d() {
        HashMap hashMap = new HashMap();
        hashMap.put("preferences", C0475j8.c.f6048a);
        return this.f4542c.a("metrica_multiprocess.db", this.f4540a.g(), this.f4540a.h(), new SparseArray(), new Z7("metrica_multiprocess.db", hashMap));
    }

    public X7 e() {
        HashMap hashMap = new HashMap();
        List<String> list = C0475j8.c.f6048a;
        hashMap.put("preferences", list);
        hashMap.put("binary_data", C0475j8.b.f6047a);
        hashMap.put("startup", list);
        List<String> list2 = C0475j8.a.f6042a;
        hashMap.put("l_dat", list2);
        hashMap.put("lbs_dat", list2);
        return this.f4542c.a("metrica.db", this.f4540a.i(), this.f4540a.j(), this.f4540a.k(), new Z7("metrica.db", hashMap));
    }
}
