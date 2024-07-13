package com.criteo.publisher.model.b0;

import java.net.URL;

/* compiled from: $AutoValue_NativeImpressionPixel */
abstract class d extends p {

    /* renamed from: a  reason: collision with root package name */
    private final URL f2737a;

    d(URL url) {
        if (url != null) {
            this.f2737a = url;
            return;
        }
        throw new NullPointerException("Null url");
    }

    /* access modifiers changed from: package-private */
    public URL a() {
        return this.f2737a;
    }

    public String toString() {
        return "NativeImpressionPixel{url=" + this.f2737a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            return this.f2737a.equals(((p) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f2737a.hashCode() ^ 1000003;
    }
}
