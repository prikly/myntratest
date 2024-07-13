package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.Comparator;

public class Cn implements Comparator<F2> {
    public int compare(Object obj, Object obj2) {
        F2 f2 = (F2) obj;
        F2 f22 = (F2) obj2;
        return (TextUtils.equals(f2.f3984a, f22.f3984a) && TextUtils.equals(f2.f3985b, f22.f3985b)) ? 0 : 10;
    }
}
