package com.applovin.impl.sdk.d;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private long f15390a;

    /* renamed from: b  reason: collision with root package name */
    private long f15391b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15392c;

    /* renamed from: d  reason: collision with root package name */
    private long f15393d;

    /* renamed from: e  reason: collision with root package name */
    private long f15394e;

    /* renamed from: f  reason: collision with root package name */
    private int f15395f;

    /* renamed from: g  reason: collision with root package name */
    private Exception f15396g;

    public void a() {
        this.f15392c = true;
    }

    public void a(int i) {
        this.f15395f = i;
    }

    public void a(long j) {
        this.f15390a += j;
    }

    public void a(Exception exc) {
        this.f15396g = exc;
    }

    public void b() {
        this.f15393d++;
    }

    public void b(long j) {
        this.f15391b += j;
    }

    public void c() {
        this.f15394e++;
    }

    public Exception d() {
        return this.f15396g;
    }

    public int e() {
        return this.f15395f;
    }

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.f15390a + ", totalCachedBytes=" + this.f15391b + ", isHTMLCachingCancelled=" + this.f15392c + ", htmlResourceCacheSuccessCount=" + this.f15393d + ", htmlResourceCacheFailureCount=" + this.f15394e + '}';
    }
}
