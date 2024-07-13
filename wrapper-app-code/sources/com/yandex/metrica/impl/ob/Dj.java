package com.yandex.metrica.impl.ob;

import android.telephony.CellSignalStrengthLte;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yandex/metrica/impl/ob/Dj;", "", "Landroid/telephony/CellSignalStrengthLte;", "cellSignalStrengthLte", "", "b", "(Landroid/telephony/CellSignalStrengthLte;)I", "c", "a", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, k = 1, mv = {1, 1, 15})
public final class Dj {

    /* renamed from: a  reason: collision with root package name */
    public static final Dj f3888a = new Dj();

    private Dj() {
    }

    public static final int a(CellSignalStrengthLte cellSignalStrengthLte) {
        return cellSignalStrengthLte.getCqi();
    }

    public static final int b(CellSignalStrengthLte cellSignalStrengthLte) {
        return cellSignalStrengthLte.getRsrq();
    }

    public static final int c(CellSignalStrengthLte cellSignalStrengthLte) {
        return cellSignalStrengthLte.getRssnr();
    }
}
