package com.criteo.publisher.advancednative;

import java.net.URL;

/* compiled from: AutoValue_CriteoMedia */
final class d extends CriteoMedia {

    /* renamed from: a  reason: collision with root package name */
    private final URL f2315a;

    d(URL url) {
        if (url != null) {
            this.f2315a = url;
            return;
        }
        throw new NullPointerException("Null imageUrl");
    }

    /* access modifiers changed from: package-private */
    public URL getImageUrl() {
        return this.f2315a;
    }

    public String toString() {
        return "CriteoMedia{imageUrl=" + this.f2315a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CriteoMedia) {
            return this.f2315a.equals(((CriteoMedia) obj).getImageUrl());
        }
        return false;
    }

    public int hashCode() {
        return this.f2315a.hashCode() ^ 1000003;
    }
}
