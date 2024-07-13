package com.criteo.publisher.model.b0;

import com.criteo.publisher.model.b0.n;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* compiled from: $AutoValue_NativeAssets */
abstract class b extends n {

    /* renamed from: a  reason: collision with root package name */
    private final List<r> f2728a;

    /* renamed from: b  reason: collision with root package name */
    private final m f2729b;

    /* renamed from: c  reason: collision with root package name */
    private final q f2730c;

    /* renamed from: d  reason: collision with root package name */
    private final List<p> f2731d;

    b(List<r> list, m mVar, q qVar, List<p> list2) {
        if (list != null) {
            this.f2728a = list;
            if (mVar != null) {
                this.f2729b = mVar;
                if (qVar != null) {
                    this.f2730c = qVar;
                    if (list2 != null) {
                        this.f2731d = list2;
                        return;
                    }
                    throw new NullPointerException("Null pixels");
                }
                throw new NullPointerException("Null privacy");
            }
            throw new NullPointerException("Null advertiser");
        }
        throw new NullPointerException("Null nativeProducts");
    }

    /* access modifiers changed from: package-private */
    @SerializedName("products")
    public List<r> h() {
        return this.f2728a;
    }

    /* access modifiers changed from: package-private */
    public m b() {
        return this.f2729b;
    }

    /* access modifiers changed from: package-private */
    public q j() {
        return this.f2730c;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("impressionPixels")
    public List<p> i() {
        return this.f2731d;
    }

    public String toString() {
        return "NativeAssets{nativeProducts=" + this.f2728a + ", advertiser=" + this.f2729b + ", privacy=" + this.f2730c + ", pixels=" + this.f2731d + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f2728a.equals(nVar.h()) || !this.f2729b.equals(nVar.b()) || !this.f2730c.equals(nVar.j()) || !this.f2731d.equals(nVar.i())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f2728a.hashCode() ^ 1000003) * 1000003) ^ this.f2729b.hashCode()) * 1000003) ^ this.f2730c.hashCode()) * 1000003) ^ this.f2731d.hashCode();
    }

    /* compiled from: $AutoValue_NativeAssets */
    static class a extends n.a {

        /* renamed from: a  reason: collision with root package name */
        private List<r> f2732a;

        /* renamed from: b  reason: collision with root package name */
        private m f2733b;

        /* renamed from: c  reason: collision with root package name */
        private q f2734c;

        /* renamed from: d  reason: collision with root package name */
        private List<p> f2735d;

        a() {
        }

        /* access modifiers changed from: package-private */
        public n.a a(List<r> list) {
            if (list != null) {
                this.f2732a = list;
                return this;
            }
            throw new NullPointerException("Null nativeProducts");
        }

        /* access modifiers changed from: package-private */
        public List<r> c() {
            List<r> list = this.f2732a;
            if (list != null) {
                return list;
            }
            throw new IllegalStateException("Property \"nativeProducts\" has not been set");
        }

        /* access modifiers changed from: package-private */
        public n.a a(m mVar) {
            if (mVar != null) {
                this.f2733b = mVar;
                return this;
            }
            throw new NullPointerException("Null advertiser");
        }

        /* access modifiers changed from: package-private */
        public n.a a(q qVar) {
            if (qVar != null) {
                this.f2734c = qVar;
                return this;
            }
            throw new NullPointerException("Null privacy");
        }

        /* access modifiers changed from: package-private */
        public n.a b(List<p> list) {
            if (list != null) {
                this.f2735d = list;
                return this;
            }
            throw new NullPointerException("Null pixels");
        }

        /* access modifiers changed from: package-private */
        public List<p> d() {
            List<p> list = this.f2735d;
            if (list != null) {
                return list;
            }
            throw new IllegalStateException("Property \"pixels\" has not been set");
        }

        /* access modifiers changed from: package-private */
        public n a() {
            String str = "";
            if (this.f2732a == null) {
                str = str + " nativeProducts";
            }
            if (this.f2733b == null) {
                str = str + " advertiser";
            }
            if (this.f2734c == null) {
                str = str + " privacy";
            }
            if (this.f2735d == null) {
                str = str + " pixels";
            }
            if (str.isEmpty()) {
                return new h(this.f2732a, this.f2733b, this.f2734c, this.f2735d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
