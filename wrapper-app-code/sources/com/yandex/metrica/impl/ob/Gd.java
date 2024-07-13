package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

public class Gd implements Ad {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4048a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4049b;

    /* renamed from: c  reason: collision with root package name */
    private final C0565mn f4050c;

    public Gd(Context context, String str, C0565mn mnVar) {
        this.f4048a = context;
        this.f4049b = str;
        this.f4050c = mnVar;
    }

    public List<Bd> a() {
        ArrayList arrayList = new ArrayList();
        PackageInfo b2 = this.f4050c.b(this.f4048a, this.f4049b, 4096);
        if (b2 != null) {
            for (String bd : b2.requestedPermissions) {
                arrayList.add(new Bd(bd, true));
            }
        }
        return arrayList;
    }
}
