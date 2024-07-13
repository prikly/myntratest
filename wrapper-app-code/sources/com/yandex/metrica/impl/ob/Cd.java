package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Build;
import java.util.Collection;
import java.util.List;

public class Cd {
    public List<Bd> a(Context context, List<Bd> list) {
        Ad ad;
        if (Build.VERSION.SDK_INT >= 16) {
            ad = new Dd(context, new C0565mn());
        } else {
            ad = new Gd(context, context.getPackageName(), new C0565mn());
        }
        List<Bd> a2 = ad.a();
        if (C0267b.a((Collection<?>) a2, (Collection<?>) list)) {
            return null;
        }
        return a2;
    }
}
