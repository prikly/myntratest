package com.yandex.metrica.impl.ob;

import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import com.yandex.metrica.impl.ob.C0755uj;

/* renamed from: com.yandex.metrica.impl.ob.zj  reason: case insensitive filesystem */
public class C0875zj extends C0636pj<CellInfoCdma> {
    /* access modifiers changed from: protected */
    public void b(CellInfo cellInfo, C0755uj.a aVar) {
        aVar.l(Integer.valueOf(((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm()));
        aVar.a(2);
    }

    /* access modifiers changed from: protected */
    public void c(CellInfo cellInfo, C0755uj.a aVar) {
        CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
    }
}
