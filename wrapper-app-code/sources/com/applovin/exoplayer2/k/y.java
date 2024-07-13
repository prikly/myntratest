package com.applovin.exoplayer2.k;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class y {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<a> f13482a = $$Lambda$y$k_Ds_OqbQQcE40fOFfIXdVboMIE.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private static final Comparator<a> f13483b = $$Lambda$y$ODZiL_ZurRSMwgJath8qEMUVo1Q.INSTANCE;

    /* renamed from: c  reason: collision with root package name */
    private final int f13484c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<a> f13485d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final a[] f13486e = new a[5];

    /* renamed from: f  reason: collision with root package name */
    private int f13487f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f13488g;

    /* renamed from: h  reason: collision with root package name */
    private int f13489h;
    private int i;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f13490a;

        /* renamed from: b  reason: collision with root package name */
        public int f13491b;

        /* renamed from: c  reason: collision with root package name */
        public float f13492c;

        private a() {
        }
    }

    public y(int i2) {
        this.f13484c = i2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int b(a aVar, a aVar2) {
        return aVar.f13490a - aVar2.f13490a;
    }

    private void b() {
        if (this.f13487f != 1) {
            Collections.sort(this.f13485d, f13482a);
            this.f13487f = 1;
        }
    }

    private void c() {
        if (this.f13487f != 0) {
            Collections.sort(this.f13485d, f13483b);
            this.f13487f = 0;
        }
    }

    public float a(float f2) {
        c();
        float f3 = f2 * ((float) this.f13489h);
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13485d.size(); i3++) {
            a aVar = this.f13485d.get(i3);
            i2 += aVar.f13491b;
            if (((float) i2) >= f3) {
                return aVar.f13492c;
            }
        }
        if (this.f13485d.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<a> arrayList = this.f13485d;
        return arrayList.get(arrayList.size() - 1).f13492c;
    }

    public void a() {
        this.f13485d.clear();
        this.f13487f = -1;
        this.f13488g = 0;
        this.f13489h = 0;
    }

    public void a(int i2, float f2) {
        a aVar;
        int i3;
        a aVar2;
        b();
        int i4 = this.i;
        if (i4 > 0) {
            a[] aVarArr = this.f13486e;
            int i5 = i4 - 1;
            this.i = i5;
            aVar = aVarArr[i5];
        } else {
            aVar = new a();
        }
        int i6 = this.f13488g;
        this.f13488g = i6 + 1;
        aVar.f13490a = i6;
        aVar.f13491b = i2;
        aVar.f13492c = f2;
        this.f13485d.add(aVar);
        int i7 = this.f13489h + i2;
        while (true) {
            this.f13489h = i7;
            while (true) {
                int i8 = this.f13489h;
                int i9 = this.f13484c;
                if (i8 > i9) {
                    i3 = i8 - i9;
                    aVar2 = this.f13485d.get(0);
                    if (aVar2.f13491b > i3) {
                        break;
                    }
                    this.f13489h -= aVar2.f13491b;
                    this.f13485d.remove(0);
                    int i10 = this.i;
                    if (i10 < 5) {
                        a[] aVarArr2 = this.f13486e;
                        this.i = i10 + 1;
                        aVarArr2[i10] = aVar2;
                    }
                } else {
                    return;
                }
            }
            aVar2.f13491b -= i3;
            i7 = this.f13489h - i3;
        }
    }
}
