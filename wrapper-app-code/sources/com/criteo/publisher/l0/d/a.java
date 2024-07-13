package com.criteo.publisher.l0.d;

/* compiled from: $AutoValue_GdprData */
abstract class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private final String f2606a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f2607b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f2608c;

    a(String str, Boolean bool, Integer num) {
        if (str != null) {
            this.f2606a = str;
            this.f2607b = bool;
            if (num != null) {
                this.f2608c = num;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null consentData");
    }

    public String a() {
        return this.f2606a;
    }

    public Boolean b() {
        return this.f2607b;
    }

    public Integer c() {
        return this.f2608c;
    }

    public String toString() {
        return "GdprData{consentData=" + this.f2606a + ", gdprApplies=" + this.f2607b + ", version=" + this.f2608c + "}";
    }

    public boolean equals(Object obj) {
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f2606a.equals(cVar.a()) || ((bool = this.f2607b) != null ? !bool.equals(cVar.b()) : cVar.b() != null) || !this.f2608c.equals(cVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.f2606a.hashCode() ^ 1000003) * 1000003;
        Boolean bool = this.f2607b;
        return ((hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.f2608c.hashCode();
    }
}
