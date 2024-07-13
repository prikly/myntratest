package com.bykv.vk.openvk.component.video.a.b.f;

import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.a.b.d;
import com.bykv.vk.openvk.component.video.a.b.e;
import com.bykv.vk.openvk.component.video.a.b.f;
import com.bykv.vk.openvk.component.video.api.f.c;
import com.bytedance.sdk.component.utils.l;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: VideoCachePreloader */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f18047a = c.b();

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, Boolean> f18048b;

    /* renamed from: c  reason: collision with root package name */
    private C0216a f18049c;

    /* compiled from: VideoCachePreloader */
    private static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final a f18062a = new a();
    }

    private a() {
        this.f18048b = new HashMap<>();
        b();
    }

    public static a a() {
        return b.f18062a;
    }

    public boolean b() {
        if (this.f18049c != null) {
            return true;
        }
        com.bykv.vk.openvk.component.video.a.b.a.c c2 = c();
        if (c2 == null) {
            return false;
        }
        e.a(true);
        e.b(true);
        e.a(1);
        f.a().d();
        try {
            C0216a aVar = new C0216a();
            this.f18049c = aVar;
            aVar.setName("tt_pangle_thread_video_cache_preloader");
            this.f18049c.start();
            e.a(c2, com.bykv.vk.openvk.component.video.api.b.a());
            d.c().a(30000, 30000, 30000);
            d.c().a(10485759);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean a(com.bykv.vk.openvk.component.video.api.c.c cVar) {
        if (!b()) {
            return false;
        }
        this.f18049c.a(cVar);
        return true;
    }

    public String b(com.bykv.vk.openvk.component.video.api.c.c cVar) {
        if (cVar == null) {
            return null;
        }
        boolean z = !TextUtils.isEmpty(cVar.k());
        return f.a().a(false, z, z ? cVar.k() : cVar.j(), cVar.j());
    }

    private static com.bykv.vk.openvk.component.video.a.b.a.c c() {
        File file = new File(com.bykv.vk.openvk.component.video.api.b.a().getCacheDir(), "proxy_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        com.bykv.vk.openvk.component.video.a.b.a.c cVar = null;
        try {
            com.bykv.vk.openvk.component.video.a.b.a.c cVar2 = new com.bykv.vk.openvk.component.video.a.b.a.c(file);
            try {
                cVar2.a(104857600);
                return cVar2;
            } catch (IOException e2) {
                e = e2;
                cVar = cVar2;
            }
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            return cVar;
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.f.a$a  reason: collision with other inner class name */
    /* compiled from: VideoCachePreloader */
    class C0216a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private Queue<C0217a> f18051b = new LinkedBlockingQueue();

        /* renamed from: c  reason: collision with root package name */
        private boolean f18052c = true;

        /* renamed from: d  reason: collision with root package name */
        private final Queue<C0217a> f18053d = new ArrayBlockingQueue(10);

        /* renamed from: e  reason: collision with root package name */
        private Queue<C0217a> f18054e = new LinkedBlockingQueue();

        private void a() {
        }

        private void b() {
        }

        public C0216a() {
        }

        private C0217a a(int i, com.bykv.vk.openvk.component.video.api.c.c cVar) {
            b();
            l.b("VideoCachePreloader", "pool: " + this.f18053d.size());
            C0217a poll = this.f18053d.poll();
            if (poll == null) {
                poll = new C0217a();
            }
            poll.f18055a = i;
            poll.f18060f = cVar;
            return poll;
        }

        private void a(C0217a aVar) {
            a();
            aVar.f18057c = null;
            aVar.f18056b = null;
            aVar.f18055a = -1;
            aVar.f18060f = null;
            this.f18053d.offer(aVar);
        }

        private synchronized void b(C0217a aVar) {
            b();
            this.f18054e.add(aVar);
            notify();
        }

        private void c(C0217a aVar) {
            a();
            if (aVar != null) {
                this.f18051b.offer(aVar);
                notify();
            }
        }

        public void run() {
            while (this.f18052c) {
                synchronized (this) {
                    if (!this.f18054e.isEmpty()) {
                        c();
                    }
                    while (!this.f18051b.isEmpty()) {
                        C0217a poll = this.f18051b.poll();
                        if (poll != null) {
                            int i = poll.f18055a;
                            if (i != 0) {
                                if (i == 1) {
                                    d.c().a(poll.f18056b);
                                } else if (i == 2) {
                                    d.c().d();
                                } else if (i == 3) {
                                    d.c().d();
                                    if (e.c() != null) {
                                        e.c().a();
                                    }
                                    if (e.b() != null) {
                                        e.b().a();
                                    }
                                } else if (i == 4) {
                                    d.c().d();
                                    this.f18052c = false;
                                }
                            } else if (poll.f18057c != null && poll.f18057c.length > 0) {
                                ArrayList arrayList = new ArrayList();
                                for (String str : poll.f18057c) {
                                    if (com.bykv.vk.openvk.component.video.a.c.a.a(str)) {
                                        arrayList.add(str);
                                    }
                                }
                                d.c().a(false, !TextUtils.isEmpty(poll.f18059e), poll.f18058d, poll.f18056b, (String[]) arrayList.toArray(new String[arrayList.size()]));
                            }
                            a(poll);
                        }
                    }
                    try {
                        wait();
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }

        private void c() {
            a();
            while (true) {
                C0217a poll = this.f18054e.poll();
                if (poll != null) {
                    poll.f18056b = poll.f18060f.j();
                    poll.f18057c = new String[]{poll.f18060f.j()};
                    poll.f18058d = poll.f18060f.b();
                    poll.f18059e = poll.f18060f.k();
                    if (!TextUtils.isEmpty(poll.f18060f.k())) {
                        poll.f18056b = poll.f18060f.k();
                    }
                    poll.f18060f = null;
                    c(poll);
                } else {
                    return;
                }
            }
        }

        public void a(com.bykv.vk.openvk.component.video.api.c.c cVar) {
            b(a(0, cVar));
        }

        /* renamed from: com.bykv.vk.openvk.component.video.a.b.f.a$a$a  reason: collision with other inner class name */
        /* compiled from: VideoCachePreloader */
        private class C0217a {

            /* renamed from: a  reason: collision with root package name */
            public int f18055a;

            /* renamed from: b  reason: collision with root package name */
            public String f18056b;

            /* renamed from: c  reason: collision with root package name */
            public String[] f18057c;

            /* renamed from: d  reason: collision with root package name */
            public int f18058d;

            /* renamed from: e  reason: collision with root package name */
            public String f18059e;

            /* renamed from: f  reason: collision with root package name */
            public com.bykv.vk.openvk.component.video.api.c.c f18060f;

            public C0217a() {
            }
        }
    }
}
