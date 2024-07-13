package com.yandex.metrica.impl.ob;

import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoWcdma;
import com.yandex.metrica.impl.ob.C0755uj;

public class Hj extends C0636pj<CellInfo> {

    /* renamed from: c  reason: collision with root package name */
    private final Mj<CellIdentityWcdma> f4123c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Hj() {
        this(A2.a(28) ? new Sj() : new Rj());
    }

    /* access modifiers changed from: protected */
    public void b(CellInfo cellInfo, C0755uj.a aVar) {
        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        aVar.a(3).b(Integer.valueOf(cellIdentity.getCid())).c(Integer.valueOf(cellIdentity.getLac())).k(Integer.valueOf(cellIdentity.getPsc())).l(Integer.valueOf(cellInfoWcdma.getCellSignalStrength().getDbm())).i(this.f4123c.b(cellIdentity)).j(this.f4123c.a(cellIdentity));
    }

    /* access modifiers changed from: protected */
    public void c(CellInfo cellInfo, C0755uj.a aVar) {
        if (A2.a(24)) {
            aVar.a(Integer.valueOf(Cj.a(((CellInfoWcdma) cellInfo).getCellIdentity())));
        }
    }

    Hj(Mj<CellIdentityWcdma> mj) {
        this.f4123c = mj;
    }
}
