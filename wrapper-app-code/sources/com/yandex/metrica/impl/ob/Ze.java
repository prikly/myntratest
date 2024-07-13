package com.yandex.metrica.impl.ob;

import android.util.SparseArray;

public class Ze {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<String> f5413a;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f5413a = sparseArray;
        sparseArray.put(0, "String");
        f5413a.put(1, "Number");
        f5413a.put(2, "Counter");
    }

    static String a(int i) {
        return f5413a.get(i);
    }
}
