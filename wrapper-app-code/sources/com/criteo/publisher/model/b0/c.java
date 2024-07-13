package com.criteo.publisher.model.b0;

import java.net.URL;

/* compiled from: $AutoValue_NativeImage */
abstract class c extends o {

    /* renamed from: a  reason: collision with root package name */
    private final URL f2736a;

    c(URL url) {
        if (url != null) {
            this.f2736a = url;
            return;
        }
        throw new NullPointerException("Null url");
    }

    /* access modifiers changed from: package-private */
    public URL a() {
        return this.f2736a;
    }

    public String toString() {
        return "NativeImage{url=" + this.f2736a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f2736a.equals(((o) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f2736a.hashCode() ^ 1000003;
    }
}
