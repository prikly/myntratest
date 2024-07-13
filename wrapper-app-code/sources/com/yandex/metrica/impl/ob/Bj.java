package com.yandex.metrica.impl.ob;

import android.telephony.CellIdentityGsm;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import com.yandex.metrica.impl.ob.C0755uj;

public class Bj extends C0636pj<CellInfoGsm> {

    /* renamed from: c  reason: collision with root package name */
    private final Mj<CellIdentityGsm> f3772c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Bj() {
        this(A2.a(28) ? new Oj() : new Nj());
    }

    /* access modifiers changed from: protected */
    public void b(CellInfo cellInfo, C0755uj.a aVar) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        aVar.a(1).b(Integer.valueOf(cellIdentity.getCid())).c(Integer.valueOf(cellIdentity.getLac())).l(Integer.valueOf(cellInfoGsm.getCellSignalStrength().getDbm())).i(this.f3772c.b(cellIdentity)).j(this.f3772c.a(cellIdentity));
    }

    /* access modifiers changed from: protected */
    public void c(CellInfo cellInfo, C0755uj.a aVar) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        if (A2.a(24)) {
            aVar.a(Integer.valueOf(cellInfoGsm.getCellIdentity().getArfcn()));
        }
    }

    Bj(Mj<CellIdentityGsm> mj) {
        this.f3772c = mj;
    }
}
