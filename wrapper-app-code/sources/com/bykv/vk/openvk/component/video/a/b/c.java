package com.bykv.vk.openvk.component.video.a.b;

/* compiled from: IncrementalTimeout */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final long f17989a;

    /* renamed from: b  reason: collision with root package name */
    private final long f17990b;

    /* renamed from: c  reason: collision with root package name */
    private final long f17991c;

    public long a(int i) {
        if (i <= 0) {
            return this.f17989a;
        }
        return Math.min(this.f17989a + (this.f17990b * ((long) i)), this.f17991c);
    }
}
