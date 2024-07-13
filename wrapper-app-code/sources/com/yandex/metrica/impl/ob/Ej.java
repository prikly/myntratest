package com.yandex.metrica.impl.ob;

import android.telephony.CellIdentityLte;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yandex/metrica/impl/ob/Ej;", "", "Landroid/telephony/CellIdentityLte;", "cellIdentityLte", "", "a", "(Landroid/telephony/CellIdentityLte;)I", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, k = 1, mv = {1, 1, 15})
public final class Ej {

    /* renamed from: a  reason: collision with root package name */
    public static final Ej f3966a = new Ej();

    private Ej() {
    }

    public static final int a(CellIdentityLte cellIdentityLte) {
        return cellIdentityLte.getBandwidth();
    }
}
