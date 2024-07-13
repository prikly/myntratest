package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

public class Jn implements Kn<List<In>> {
    public In a(Object obj) {
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (In in : (List) obj) {
            if (!in.b()) {
                linkedList.add(in.a());
                z = false;
            }
        }
        if (z) {
            return In.a(this);
        }
        return In.a(this, TextUtils.join(", ", linkedList));
    }
}
