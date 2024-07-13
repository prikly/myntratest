package com.criteo.publisher.model.b0;

import java.net.URI;

/* compiled from: $AutoValue_NativeProduct */
abstract class f extends r {

    /* renamed from: a  reason: collision with root package name */
    private final String f2741a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2742b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2743c;

    /* renamed from: d  reason: collision with root package name */
    private final URI f2744d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2745e;

    /* renamed from: f  reason: collision with root package name */
    private final o f2746f;

    f(String str, String str2, String str3, URI uri, String str4, o oVar) {
        if (str != null) {
            this.f2741a = str;
            if (str2 != null) {
                this.f2742b = str2;
                if (str3 != null) {
                    this.f2743c = str3;
                    if (uri != null) {
                        this.f2744d = uri;
                        if (str4 != null) {
                            this.f2745e = str4;
                            if (oVar != null) {
                                this.f2746f = oVar;
                                return;
                            }
                            throw new NullPointerException("Null image");
                        }
                        throw new NullPointerException("Null callToAction");
                    }
                    throw new NullPointerException("Null clickUrl");
                }
                throw new NullPointerException("Null price");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null title");
    }

    public String g() {
        return this.f2741a;
    }

    public String c() {
        return this.f2742b;
    }

    public String f() {
        return this.f2743c;
    }

    public URI b() {
        return this.f2744d;
    }

    public String a() {
        return this.f2745e;
    }

    /* access modifiers changed from: package-private */
    public o d() {
        return this.f2746f;
    }

    public String toString() {
        return "NativeProduct{title=" + this.f2741a + ", description=" + this.f2742b + ", price=" + this.f2743c + ", clickUrl=" + this.f2744d + ", callToAction=" + this.f2745e + ", image=" + this.f2746f + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f2741a.equals(rVar.g()) || !this.f2742b.equals(rVar.c()) || !this.f2743c.equals(rVar.f()) || !this.f2744d.equals(rVar.b()) || !this.f2745e.equals(rVar.a()) || !this.f2746f.equals(rVar.d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((this.f2741a.hashCode() ^ 1000003) * 1000003) ^ this.f2742b.hashCode()) * 1000003) ^ this.f2743c.hashCode()) * 1000003) ^ this.f2744d.hashCode()) * 1000003) ^ this.f2745e.hashCode()) * 1000003) ^ this.f2746f.hashCode();
    }
}
