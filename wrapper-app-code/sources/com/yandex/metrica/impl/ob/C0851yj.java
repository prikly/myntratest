package com.yandex.metrica.impl.ob;

import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import com.yandex.metrica.impl.ob.C0755uj;

/* renamed from: com.yandex.metrica.impl.ob.yj  reason: case insensitive filesystem */
public class C0851yj implements S {

    /* renamed from: a  reason: collision with root package name */
    private final Jj f7172a;

    /* renamed from: b  reason: collision with root package name */
    private final C0636pj<CellInfoGsm> f7173b;

    /* renamed from: c  reason: collision with root package name */
    private final C0636pj<CellInfoCdma> f7174c;

    /* renamed from: d  reason: collision with root package name */
    private final C0636pj<CellInfoLte> f7175d;

    /* renamed from: e  reason: collision with root package name */
    private final C0636pj<CellInfo> f7176e;

    /* renamed from: f  reason: collision with root package name */
    private final S[] f7177f;

    public C0851yj() {
        this(new Aj());
    }

    public void a(CellInfo cellInfo, C0755uj.a aVar) {
        this.f7172a.a(cellInfo, aVar);
        if (cellInfo instanceof CellInfoGsm) {
            this.f7173b.a((CellInfoGsm) cellInfo, aVar);
        } else if (cellInfo instanceof CellInfoCdma) {
            this.f7174c.a((CellInfoCdma) cellInfo, aVar);
        } else if (cellInfo instanceof CellInfoLte) {
            this.f7175d.a((CellInfoLte) cellInfo, aVar);
        } else if (A2.a(18) && (cellInfo instanceof CellInfoWcdma)) {
            this.f7176e.a((CellInfoWcdma) cellInfo, aVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C0851yj(C0636pj<CellInfo> pjVar) {
        this(new Jj(), new Bj(), new C0875zj(), new Gj(), A2.a(18) ? new Hj() : pjVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.yandex.metrica.impl.ob.S[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0851yj(com.yandex.metrica.impl.ob.Jj r2, com.yandex.metrica.impl.ob.C0636pj<android.telephony.CellInfoGsm> r3, com.yandex.metrica.impl.ob.C0636pj<android.telephony.CellInfoCdma> r4, com.yandex.metrica.impl.ob.C0636pj<android.telephony.CellInfoLte> r5, com.yandex.metrica.impl.ob.C0636pj<android.telephony.CellInfo> r6) {
        /*
            r1 = this;
            r1.<init>()
            r1.f7172a = r2
            r1.f7173b = r3
            r1.f7174c = r4
            r1.f7175d = r5
            r1.f7176e = r6
            r2 = 4
            com.yandex.metrica.impl.ob.S[] r2 = new com.yandex.metrica.impl.ob.S[r2]
            r0 = 0
            r2[r0] = r3
            r3 = 1
            r2[r3] = r4
            r3 = 2
            r2[r3] = r6
            r3 = 3
            r2[r3] = r5
            r1.f7177f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0851yj.<init>(com.yandex.metrica.impl.ob.Jj, com.yandex.metrica.impl.ob.pj, com.yandex.metrica.impl.ob.pj, com.yandex.metrica.impl.ob.pj, com.yandex.metrica.impl.ob.pj):void");
    }

    public void a(Sh sh) {
        for (S a2 : this.f7177f) {
            a2.a(sh);
        }
    }
}
