package com.iab.omid.library.ironsrc.walking.a;

import com.iab.omid.library.ironsrc.walking.a.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<Runnable> f7952a = new LinkedBlockingQueue();

    /* renamed from: b  reason: collision with root package name */
    private final ThreadPoolExecutor f7953b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f7952a);

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<b> f7954c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private b f7955d = null;

    private void a() {
        b poll = this.f7954c.poll();
        this.f7955d = poll;
        if (poll != null) {
            poll.a(this.f7953b);
        }
    }

    public void a(b bVar) {
        this.f7955d = null;
        a();
    }

    public void b(b bVar) {
        bVar.a((b.a) this);
        this.f7954c.add(bVar);
        if (this.f7955d == null) {
            a();
        }
    }
}
