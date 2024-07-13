package com.criteo.publisher.model.b0;

import java.net.URI;

/* compiled from: $AutoValue_NativeAdvertiser */
abstract class a extends m {

    /* renamed from: a  reason: collision with root package name */
    private final String f2724a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2725b;

    /* renamed from: c  reason: collision with root package name */
    private final URI f2726c;

    /* renamed from: d  reason: collision with root package name */
    private final o f2727d;

    a(String str, String str2, URI uri, o oVar) {
        if (str != null) {
            this.f2724a = str;
            if (str2 != null) {
                this.f2725b = str2;
                if (uri != null) {
                    this.f2726c = uri;
                    if (oVar != null) {
                        this.f2727d = oVar;
                        return;
                    }
                    throw new NullPointerException("Null logo");
                }
                throw new NullPointerException("Null logoClickUrl");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null domain");
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f2724a;
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.f2725b;
    }

    /* access modifiers changed from: package-private */
    public URI d() {
        return this.f2726c;
    }

    /* access modifiers changed from: package-private */
    public o c() {
        return this.f2727d;
    }

    public String toString() {
        return "NativeAdvertiser{domain=" + this.f2724a + ", description=" + this.f2725b + ", logoClickUrl=" + this.f2726c + ", logo=" + this.f2727d + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f2724a.equals(mVar.b()) || !this.f2725b.equals(mVar.a()) || !this.f2726c.equals(mVar.d()) || !this.f2727d.equals(mVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f2724a.hashCode() ^ 1000003) * 1000003) ^ this.f2725b.hashCode()) * 1000003) ^ this.f2726c.hashCode()) * 1000003) ^ this.f2727d.hashCode();
    }
}
