package com.yandex.metrica.impl.ob;

import android.telephony.CellIdentityGsm;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/yandex/metrica/impl/ob/Nj;", "Lcom/yandex/metrica/impl/ob/Mj;", "Landroid/telephony/CellIdentityGsm;", "cellIdentity", "", "a", "(Landroid/telephony/CellIdentityGsm;)Ljava/lang/Integer;", "b", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, k = 1, mv = {1, 1, 15})
public final class Nj implements Mj<CellIdentityGsm> {
    /* renamed from: a */
    public Integer b(CellIdentityGsm cellIdentityGsm) {
        return Integer.valueOf(cellIdentityGsm.getMcc());
    }

    /* renamed from: b */
    public Integer a(CellIdentityGsm cellIdentityGsm) {
        return Integer.valueOf(cellIdentityGsm.getMnc());
    }
}
