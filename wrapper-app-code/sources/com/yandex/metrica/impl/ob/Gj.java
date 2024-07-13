package com.yandex.metrica.impl.ob;

import android.telephony.CellIdentityLte;
import android.telephony.CellInfo;
import android.telephony.CellInfoLte;
import com.yandex.metrica.impl.ob.C0755uj;

public class Gj extends C0636pj<CellInfoLte> {

    /* renamed from: c  reason: collision with root package name */
    private final Mj<CellIdentityLte> f4056c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Gj() {
        this(A2.a(28) ? new Qj() : new Pj());
    }

    /* access modifiers changed from: protected */
    public void b(CellInfo cellInfo, C0755uj.a aVar) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        aVar.a(4).b(Integer.valueOf(cellIdentity.getCi())).c(Integer.valueOf(cellIdentity.getTac())).k(Integer.valueOf(cellIdentity.getPci())).l(Integer.valueOf(cellInfoLte.getCellSignalStrength().getDbm())).i(this.f4056c.b(cellIdentity)).j(this.f4056c.a(cellIdentity));
    }

    /* access modifiers changed from: protected */
    public void c(CellInfo cellInfo, C0755uj.a aVar) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        if (A2.a(24)) {
            aVar.a(Integer.valueOf(Cj.a(cellInfoLte.getCellIdentity())));
        }
        if (A2.a(26)) {
            aVar.f(Integer.valueOf(Dj.b(cellInfoLte.getCellSignalStrength())));
            aVar.h(Integer.valueOf(Dj.c(cellInfoLte.getCellSignalStrength())));
            aVar.e(Integer.valueOf(Dj.a(cellInfoLte.getCellSignalStrength())));
        }
        if (A2.a(28)) {
            aVar.d(Integer.valueOf(Ej.a(cellInfoLte.getCellIdentity())));
        }
        if (A2.a(29)) {
            aVar.g(Integer.valueOf(Fj.a(cellInfoLte.getCellSignalStrength())));
        }
    }

    Gj(Mj<CellIdentityLte> mj) {
        this.f4056c = mj;
    }
}
