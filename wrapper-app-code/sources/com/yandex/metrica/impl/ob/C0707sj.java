package com.yandex.metrica.impl.ob;

import android.telephony.CellInfo;
import com.yandex.metrica.impl.ob.C0755uj;

/* renamed from: com.yandex.metrica.impl.ob.sj  reason: case insensitive filesystem */
public class C0707sj implements Lj {

    /* renamed from: a  reason: collision with root package name */
    private final C0851yj f6796a;

    /* renamed from: b  reason: collision with root package name */
    private final C0827xj f6797b;

    public C0707sj() {
        this(new C0851yj(), new C0827xj());
    }

    public void a(Sh sh) {
        this.f6796a.a(sh);
    }

    C0707sj(C0851yj yjVar, C0827xj xjVar) {
        this.f6796a = yjVar;
        this.f6797b = xjVar;
    }

    public C0755uj a(CellInfo cellInfo) {
        C0755uj.a aVar = new C0755uj.a();
        this.f6796a.a(cellInfo, aVar);
        return this.f6797b.a(new C0755uj(aVar));
    }
}
