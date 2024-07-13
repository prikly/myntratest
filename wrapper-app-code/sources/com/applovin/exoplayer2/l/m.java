package com.applovin.exoplayer2.l;

import android.util.SparseBooleanArray;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final SparseBooleanArray f13555a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final SparseBooleanArray f13556a = new SparseBooleanArray();

        /* renamed from: b  reason: collision with root package name */
        private boolean f13557b;

        public a a(int i) {
            a.b(!this.f13557b);
            this.f13556a.append(i, true);
            return this;
        }

        public a a(int i, boolean z) {
            return z ? a(i) : this;
        }

        public a a(m mVar) {
            for (int i = 0; i < mVar.a(); i++) {
                a(mVar.b(i));
            }
            return this;
        }

        public a a(int... iArr) {
            for (int a2 : iArr) {
                a(a2);
            }
            return this;
        }

        public m a() {
            a.b(!this.f13557b);
            this.f13557b = true;
            return new m(this.f13556a);
        }
    }

    private m(SparseBooleanArray sparseBooleanArray) {
        this.f13555a = sparseBooleanArray;
    }

    public int a() {
        return this.f13555a.size();
    }

    public boolean a(int i) {
        return this.f13555a.get(i);
    }

    public boolean a(int... iArr) {
        for (int a2 : iArr) {
            if (a(a2)) {
                return true;
            }
        }
        return false;
    }

    public int b(int i) {
        a.a(i, 0, a());
        return this.f13555a.keyAt(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (ai.f13525a >= 24) {
            return this.f13555a.equals(mVar.f13555a);
        }
        if (a() != mVar.a()) {
            return false;
        }
        for (int i = 0; i < a(); i++) {
            if (b(i) != mVar.b(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (ai.f13525a >= 24) {
            return this.f13555a.hashCode();
        }
        int a2 = a();
        for (int i = 0; i < a(); i++) {
            a2 = (a2 * 31) + b(i);
        }
        return a2;
    }
}
