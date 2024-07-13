package com.yandex.metrica.impl.ob;

import android.util.SparseIntArray;

/* renamed from: com.yandex.metrica.impl.ob.sk  reason: case insensitive filesystem */
public class C0708sk implements Qk {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f6798a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private final int f6799b;

    public C0708sk(int i) {
        this.f6799b = i;
    }

    public void a(C0685rl rlVar) {
        SparseIntArray sparseIntArray = this.f6798a;
        int i = rlVar.f6736d;
        sparseIntArray.put(i, sparseIntArray.get(i) + 1);
    }

    public int a(int i) {
        int i2 = this.f6799b;
        Integer valueOf = Integer.valueOf(this.f6798a.get(i));
        if (valueOf == null) {
            valueOf = 0;
        }
        return i2 - valueOf.intValue();
    }
}
