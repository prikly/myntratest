package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

class x {

    /* renamed from: a  reason: collision with root package name */
    private final Queue<AppLovinAdImpl> f15967a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    private final Object f15968b = new Object();

    x() {
    }

    /* access modifiers changed from: package-private */
    public int a() {
        int size;
        synchronized (this.f15968b) {
            size = this.f15967a.size();
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f15968b) {
            if (a() <= 25) {
                this.f15967a.offer(appLovinAdImpl);
            } else {
                v.i("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        boolean z;
        synchronized (this.f15968b) {
            z = a() == 0;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public AppLovinAdImpl c() {
        AppLovinAdImpl poll;
        synchronized (this.f15968b) {
            poll = !b() ? this.f15967a.poll() : null;
        }
        return poll;
    }

    /* access modifiers changed from: package-private */
    public AppLovinAdImpl d() {
        AppLovinAdImpl peek;
        synchronized (this.f15968b) {
            peek = this.f15967a.peek();
        }
        return peek;
    }
}
