package com.applovin.exoplayer2.e;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f12456a = new w(0, 0);

    /* renamed from: b  reason: collision with root package name */
    public final long f12457b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12458c;

    public w(long j, long j2) {
        this.f12457b = j;
        this.f12458c = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f12457b == wVar.f12457b && this.f12458c == wVar.f12458c;
    }

    public int hashCode() {
        return (((int) this.f12457b) * 31) + ((int) this.f12458c);
    }

    public String toString() {
        return "[timeUs=" + this.f12457b + ", position=" + this.f12458c + "]";
    }
}
