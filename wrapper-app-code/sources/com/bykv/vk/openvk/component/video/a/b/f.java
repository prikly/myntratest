package com.bykv.vk.openvk.component.video.a.b;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.vk.openvk.component.video.a.b.a.b;
import com.bykv.vk.openvk.component.video.a.b.b.c;
import com.bykv.vk.openvk.component.video.a.b.g;
import com.bytedance.sdk.component.f.e;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ProxyServer */
public class f {

    /* renamed from: d  reason: collision with root package name */
    private static volatile f f18033d;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public volatile ServerSocket f18034a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public volatile int f18035b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final AtomicInteger f18036c = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public volatile c f18037e;

    /* renamed from: f  reason: collision with root package name */
    private volatile com.bykv.vk.openvk.component.video.a.b.a.c f18038f;

    /* renamed from: g  reason: collision with root package name */
    private volatile b f18039g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final SparseArray<Set<g>> f18040h = new SparseArray<>(2);
    /* access modifiers changed from: private */
    public final g.c i = new g.c() {
        public void a(g gVar) {
            synchronized (f.this.f18040h) {
                Set set = (Set) f.this.f18040h.get(gVar.f());
                if (set != null) {
                    set.add(gVar);
                }
            }
        }

        public void b(g gVar) {
            if (e.f18017c) {
                Log.d("ProxyServer", "afterExecute, ProxyTask: " + gVar);
            }
            int f2 = gVar.f();
            synchronized (f.this.f18040h) {
                Set set = (Set) f.this.f18040h.get(f2);
                if (set != null) {
                    set.remove(gVar);
                }
            }
        }
    };
    private volatile c j;
    private volatile c k;
    private final Runnable l = new Runnable() {
        public void run() {
            try {
                int i = 0;
                ServerSocket unused = f.this.f18034a = new ServerSocket(0, 50, InetAddress.getByName(f.this.i()));
                f fVar = f.this;
                int unused2 = fVar.f18035b = fVar.f18034a.getLocalPort();
                if (f.this.f18035b == -1) {
                    f.b("socket not bound", "");
                    f.this.e();
                    return;
                }
                j.a(f.this.i(), f.this.f18035b);
                if (f.this.g()) {
                    com.bykv.vk.openvk.component.video.api.f.c.b("ProxyServer", "run:  state = ", f.this.f18036c);
                    if (f.this.f18036c.compareAndSet(0, 1)) {
                        com.bykv.vk.openvk.component.video.api.f.c.b("ProxyServer", "run:  state = ", f.this.f18036c);
                        if (e.f18017c) {
                            com.bykv.vk.openvk.component.video.api.f.c.b("ProxyServer", "proxy server start!");
                        }
                        while (f.this.f18036c.get() == 1) {
                            try {
                                Socket accept = f.this.f18034a.accept();
                                c h2 = f.this.f18037e;
                                if (h2 != null) {
                                    final g a2 = new g.a().a(h2).a(accept).a(f.this.i).a();
                                    e.a().execute(new com.bytedance.sdk.component.f.g("ProxyTask", 10) {
                                        public void run() {
                                            a2.run();
                                        }
                                    });
                                } else {
                                    com.bykv.vk.openvk.component.video.a.c.a.a(accept);
                                }
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                f.b("accept error", Log.getStackTraceString(e2));
                                i++;
                                if (i > 3) {
                                    break;
                                }
                            } catch (Throwable th) {
                                String stackTraceString = Log.getStackTraceString(th);
                                Log.e("ProxyServer", "proxy server crashed!  " + stackTraceString);
                                f.b("error", stackTraceString);
                            }
                        }
                        if (e.f18017c) {
                            com.bykv.vk.openvk.component.video.api.f.c.b("ProxyServer", "proxy server closed!");
                        }
                        f.this.e();
                    }
                }
            } catch (IOException e3) {
                if (e.f18017c) {
                    Log.e("ProxyServer", "create ServerSocket error!  " + Log.getStackTraceString(e3));
                }
                f.b("create ServerSocket error", Log.getStackTraceString(e3));
                f.this.e();
            }
        }
    };
    private final AtomicBoolean m = new AtomicBoolean();

    /* access modifiers changed from: private */
    public static void b(String str, String str2) {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.component.video.a.b.g>> r1 = r3.f18040h
            monitor-enter(r1)
            android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.component.video.a.b.g>> r2 = r3.f18040h     // Catch:{ all -> 0x0030 }
            java.lang.Object r4 = r2.get(r4)     // Catch:{ all -> 0x0030 }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ all -> 0x0030 }
            if (r4 == 0) goto L_0x002e
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0030 }
        L_0x0015:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0030 }
            com.bykv.vk.openvk.component.video.a.b.g r2 = (com.bykv.vk.openvk.component.video.a.b.g) r2     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = r2.f17946h     // Catch:{ all -> 0x0030 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0015
            r4 = 1
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return r4
        L_0x002e:
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return r0
        L_0x0030:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.a.b.f.a(int, java.lang.String):boolean");
    }

    public static f a() {
        if (f18033d == null) {
            synchronized (f.class) {
                if (f18033d == null) {
                    f18033d = new f();
                }
            }
        }
        return f18033d;
    }

    private f() {
        this.f18040h.put(0, new HashSet());
        this.f18040h.put(1, new HashSet());
    }

    /* access modifiers changed from: package-private */
    public c b() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public c c() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        this.f18037e = cVar;
    }

    /* access modifiers changed from: package-private */
    public void a(com.bykv.vk.openvk.component.video.a.b.a.c cVar) {
        this.f18038f = cVar;
    }

    public String a(boolean z, boolean z2, String str, String... strArr) {
        String str2;
        String str3;
        if (strArr == null || strArr.length == 0) {
            b("url", "url is empty");
            return null;
        } else if (TextUtils.isEmpty(str)) {
            b("key", "key is empty");
            return strArr[0];
        } else if (this.f18037e == null) {
            b("db", "VideoProxyDB is null");
            return strArr[0];
        } else {
            if ((z ? this.f18039g : this.f18038f) == null) {
                b("cache", "Cache is null");
                return strArr[0];
            }
            int i2 = this.f18036c.get();
            if (i2 != 1) {
                b(AdOperationMetric.INIT_STATE, "ProxyServer is not running, " + i2);
                return strArr[0];
            }
            List<String> a2 = com.bykv.vk.openvk.component.video.a.c.a.a(strArr);
            if (a2 == null) {
                b("url", "url not start with http/https");
                return strArr[0];
            }
            if (z2) {
                str2 = str;
            } else {
                str2 = com.bykv.vk.openvk.component.video.api.f.b.a(str);
            }
            String a3 = i.a(str, str2, a2);
            if (a3 == null) {
                b("url", "combine proxy url error");
                return strArr[0];
            }
            if (z) {
                str3 = "https://" + i() + ":" + this.f18035b + "?f=" + 1 + "&" + a3;
            } else {
                str3 = "https://" + i() + ":" + this.f18035b + "?" + a3;
            }
            return str3.replaceFirst("s", "");
        }
    }

    public void d() {
        if (this.m.compareAndSet(false, true)) {
            Thread thread = new Thread(this.l);
            thread.setName("tt_pangle_thread_proxy_server");
            thread.start();
        }
    }

    /* access modifiers changed from: private */
    public void e() {
        if (this.f18036c.compareAndSet(1, 2) || this.f18036c.compareAndSet(0, 2)) {
            com.bykv.vk.openvk.component.video.a.c.a.a(this.f18034a);
            f();
        }
    }

    private void f() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f18040h) {
            int size = this.f18040h.size();
            for (int i2 = 0; i2 < size; i2++) {
                Set set = this.f18040h.get(this.f18040h.keyAt(i2));
                if (set != null) {
                    arrayList.addAll(set);
                    set.clear();
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a();
        }
    }

    /* access modifiers changed from: private */
    public boolean g() {
        com.bytedance.sdk.component.f.f fVar = new com.bytedance.sdk.component.f.f(new a(i(), this.f18035b), 5, 1);
        e.a().submit(fVar);
        h();
        try {
            if (!((Boolean) fVar.get()).booleanValue()) {
                Log.e("ProxyServer", "Ping error");
                b("ping error", "");
                e();
                return false;
            }
            com.bykv.vk.openvk.component.video.api.f.c.b("ProxyServer", "pingTest: ");
            if (e.f18017c) {
                com.bykv.vk.openvk.component.video.api.f.c.b("ProxyServer", "Ping OK!");
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            b("ping error", Log.getStackTraceString(th));
            e();
            return false;
        }
    }

    /* compiled from: ProxyServer */
    private static final class a implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final String f18045a;

        /* renamed from: b  reason: collision with root package name */
        private final int f18046b;

        a(String str, int i) {
            this.f18045a = str;
            this.f18046b = i;
        }

        /* renamed from: a */
        public Boolean call() {
            Socket socket;
            Throwable th;
            try {
                com.bykv.vk.openvk.component.video.api.f.c.b("ProxyServer", "call: ");
                socket = new Socket(this.f18045a, this.f18046b);
                try {
                    socket.setSoTimeout(2000);
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("Ping\n".getBytes(com.bykv.vk.openvk.component.video.a.c.a.f18103a));
                    outputStream.flush();
                    if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                        com.bykv.vk.openvk.component.video.a.c.a.a(socket);
                        return true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.printStackTrace();
                        com.bykv.vk.openvk.component.video.api.f.c.b("ProxyServer", "call: " + th.getMessage());
                        f.b("ping error", Log.getStackTraceString(th));
                        com.bykv.vk.openvk.component.video.a.c.a.a(socket);
                        return false;
                    } catch (Throwable th3) {
                        com.bykv.vk.openvk.component.video.a.c.a.a(socket);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                Throwable th5 = th4;
                socket = null;
                th = th5;
                th.printStackTrace();
                com.bykv.vk.openvk.component.video.api.f.c.b("ProxyServer", "call: " + th.getMessage());
                f.b("ping error", Log.getStackTraceString(th));
                com.bykv.vk.openvk.component.video.a.c.a.a(socket);
                return false;
            }
            com.bykv.vk.openvk.component.video.a.c.a.a(socket);
            return false;
        }
    }

    private void h() {
        Socket socket = null;
        try {
            socket = this.f18034a.accept();
            socket.setSoTimeout(2000);
            if ("Ping".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("OK\n".getBytes(com.bykv.vk.openvk.component.video.a.c.a.f18103a));
                outputStream.flush();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            b("ping error", Log.getStackTraceString(e2));
        } catch (Throwable th) {
            com.bykv.vk.openvk.component.video.a.c.a.a((Socket) null);
            throw th;
        }
        com.bykv.vk.openvk.component.video.a.c.a.a(socket);
        com.bykv.vk.openvk.component.video.api.f.c.b("ProxyServer", "answerPing: ");
    }

    /* access modifiers changed from: private */
    public String i() {
        return new String(Base64.decode("MTI3LjAuMC4x".getBytes(), 0));
    }
}
