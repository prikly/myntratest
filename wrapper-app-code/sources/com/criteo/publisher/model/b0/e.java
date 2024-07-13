package com.criteo.publisher.model.b0;

import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URL;

/* compiled from: $AutoValue_NativePrivacy */
abstract class e extends q {

    /* renamed from: a  reason: collision with root package name */
    private final URI f2738a;

    /* renamed from: b  reason: collision with root package name */
    private final URL f2739b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2740c;

    e(URI uri, URL url, String str) {
        if (uri != null) {
            this.f2738a = uri;
            if (url != null) {
                this.f2739b = url;
                if (str != null) {
                    this.f2740c = str;
                    return;
                }
                throw new NullPointerException("Null legalText");
            }
            throw new NullPointerException("Null imageUrl");
        }
        throw new NullPointerException("Null clickUrl");
    }

    /* access modifiers changed from: package-private */
    @SerializedName("optoutClickUrl")
    public URI a() {
        return this.f2738a;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("optoutImageUrl")
    public URL b() {
        return this.f2739b;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("longLegalText")
    public String c() {
        return this.f2740c;
    }

    public String toString() {
        return "NativePrivacy{clickUrl=" + this.f2738a + ", imageUrl=" + this.f2739b + ", legalText=" + this.f2740c + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f2738a.equals(qVar.a()) || !this.f2739b.equals(qVar.b()) || !this.f2740c.equals(qVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f2738a.hashCode() ^ 1000003) * 1000003) ^ this.f2739b.hashCode()) * 1000003) ^ this.f2740c.hashCode();
    }
}
