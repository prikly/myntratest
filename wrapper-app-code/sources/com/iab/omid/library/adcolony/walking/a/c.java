package com.iab.omid.library.adcolony.walking.a;

import com.iab.omid.library.adcolony.walking.a.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<Runnable> f7516a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadPoolExecutor f7517b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<b> f7518c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private b f7519d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f7516a = linkedBlockingQueue;
        this.f7517b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f7518c.poll();
        this.f7519d = poll;
        if (poll != null) {
            poll.a(this.f7517b);
        }
    }

    public void a(b bVar) {
        this.f7519d = null;
        a();
    }

    public void b(b bVar) {
        bVar.a((b.a) this);
        this.f7518c.add(bVar);
        if (this.f7519d == null) {
            a();
        }
    }
}
