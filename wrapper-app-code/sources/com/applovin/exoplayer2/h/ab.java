package com.applovin.exoplayer2.h;

import android.util.SparseArray;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.h;

final class ab<V> {

    /* renamed from: a  reason: collision with root package name */
    private int f12745a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<V> f12746b;

    /* renamed from: c  reason: collision with root package name */
    private final h<V> f12747c;

    public ab() {
        this($$Lambda$ab$Ac6li4hPX9FXnIWZSUJXLaI9Cps.INSTANCE);
    }

    public ab(h<V> hVar) {
        this.f12746b = new SparseArray<>();
        this.f12747c = hVar;
        this.f12745a = -1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Object obj) {
    }

    public V a() {
        SparseArray<V> sparseArray = this.f12746b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0019 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V a(int r3) {
        /*
            r2 = this;
            int r0 = r2.f12745a
            r1 = -1
            if (r0 != r1) goto L_0x0008
            r0 = 0
        L_0x0006:
            r2.f12745a = r0
        L_0x0008:
            int r0 = r2.f12745a
            if (r0 <= 0) goto L_0x0019
            android.util.SparseArray<V> r1 = r2.f12746b
            int r0 = r1.keyAt(r0)
            if (r3 >= r0) goto L_0x0019
            int r0 = r2.f12745a
            int r0 = r0 + -1
            goto L_0x0006
        L_0x0019:
            int r0 = r2.f12745a
            android.util.SparseArray<V> r1 = r2.f12746b
            int r1 = r1.size()
            int r1 = r1 + -1
            if (r0 >= r1) goto L_0x0038
            android.util.SparseArray<V> r0 = r2.f12746b
            int r1 = r2.f12745a
            int r1 = r1 + 1
            int r0 = r0.keyAt(r1)
            if (r3 < r0) goto L_0x0038
            int r0 = r2.f12745a
            int r0 = r0 + 1
            r2.f12745a = r0
            goto L_0x0019
        L_0x0038:
            android.util.SparseArray<V> r3 = r2.f12746b
            int r0 = r2.f12745a
            java.lang.Object r3 = r3.valueAt(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.ab.a(int):java.lang.Object");
    }

    public void a(int i, V v) {
        boolean z = false;
        if (this.f12745a == -1) {
            a.b(this.f12746b.size() == 0);
            this.f12745a = 0;
        }
        if (this.f12746b.size() > 0) {
            SparseArray<V> sparseArray = this.f12746b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i >= keyAt) {
                z = true;
            }
            a.a(z);
            if (keyAt == i) {
                h<V> hVar = this.f12747c;
                SparseArray<V> sparseArray2 = this.f12746b;
                hVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f12746b.append(i, v);
    }

    public void b() {
        for (int i = 0; i < this.f12746b.size(); i++) {
            this.f12747c.accept(this.f12746b.valueAt(i));
        }
        this.f12745a = -1;
        this.f12746b.clear();
    }

    public void b(int i) {
        int i2 = 0;
        while (i2 < this.f12746b.size() - 1) {
            int i3 = i2 + 1;
            if (i >= this.f12746b.keyAt(i3)) {
                this.f12747c.accept(this.f12746b.valueAt(i2));
                this.f12746b.removeAt(i2);
                int i4 = this.f12745a;
                if (i4 > 0) {
                    this.f12745a = i4 - 1;
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public void c(int i) {
        int size = this.f12746b.size() - 1;
        while (size >= 0 && i < this.f12746b.keyAt(size)) {
            this.f12747c.accept(this.f12746b.valueAt(size));
            this.f12746b.removeAt(size);
            size--;
        }
        this.f12745a = this.f12746b.size() > 0 ? Math.min(this.f12745a, this.f12746b.size() - 1) : -1;
    }

    public boolean c() {
        return this.f12746b.size() == 0;
    }
}
