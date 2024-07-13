package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<Runnable> f7737a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadPoolExecutor f7738b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<b> f7739c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private b f7740d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f7737a = linkedBlockingQueue;
        this.f7738b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f7739c.poll();
        this.f7740d = poll;
        if (poll != null) {
            poll.a(this.f7738b);
        }
    }

    public void a(b bVar) {
        this.f7740d = null;
        a();
    }

    public void b(b bVar) {
        bVar.a((b.a) this);
        this.f7739c.add(bVar);
        if (this.f7740d == null) {
            a();
        }
    }
}
