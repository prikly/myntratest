package com.yandex.metrica.impl.ob;

import android.telephony.CellInfo;
import com.yandex.metrica.impl.ob.C0755uj;
import java.util.concurrent.TimeUnit;

public class Jj {

    /* renamed from: a  reason: collision with root package name */
    private C0415gm f4385a;

    public Jj() {
        this(new C0415gm());
    }

    public void a(CellInfo cellInfo, C0755uj.a aVar) {
        long timeStamp = cellInfo.getTimeStamp();
        Long l = null;
        if (timeStamp > 0) {
            C0415gm gmVar = this.f4385a;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long c2 = gmVar.c(timeStamp, timeUnit);
            if (c2 > 0 && c2 < TimeUnit.HOURS.toSeconds(1)) {
                l = Long.valueOf(c2);
            }
            if (l == null) {
                long a2 = this.f4385a.a(timeStamp, timeUnit);
                if (a2 > 0 && a2 < TimeUnit.HOURS.toSeconds(1)) {
                    l = Long.valueOf(a2);
                }
            }
        }
        aVar.a(l).a(cellInfo.isRegistered());
    }

    Jj(C0415gm gmVar) {
        this.f4385a = gmVar;
    }
}
