package com.bytedance.sdk.openadsdk.b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.openadsdk.b.h;
import com.bytedance.sdk.openadsdk.b.k;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.h.c.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AdEventDispatcher */
public class c<T extends k> {

    /* renamed from: a  reason: collision with root package name */
    private h<T> f291a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f292b;

    /* renamed from: c  reason: collision with root package name */
    private h<T> f293c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f294d;

    /* renamed from: e  reason: collision with root package name */
    private AtomicBoolean f295e;

    public c(f<T> fVar, n<T> nVar, h.c cVar, h.b bVar) {
        this.f291a = new h<>(fVar, nVar, cVar, bVar);
        this.f293c = new l(new m(m.a()), nVar, cVar, bVar);
        this.f295e = new AtomicBoolean(false);
    }

    public c(f<T> fVar, n<T> nVar, h.c cVar, h.b bVar, h<T> hVar) {
        this.f291a = hVar;
        this.f293c = new l(new m(m.a()), nVar, cVar, bVar);
        this.f295e = new AtomicBoolean(false);
    }

    c() {
    }

    public synchronized void a() {
        try {
            if (this.f295e != null && !this.f295e.get()) {
                if (this.f291a.getLooper() == null) {
                    this.f291a.start();
                    Handler handler = new Handler(this.f291a.getLooper(), this.f291a);
                    this.f292b = handler;
                    Message obtainMessage = handler.obtainMessage();
                    obtainMessage.what = 5;
                    this.f292b.sendMessageDelayed(obtainMessage, 10000);
                }
                if (this.f293c.getLooper() == null) {
                    this.f293c.start();
                    Handler handler2 = new Handler(this.f293c.getLooper(), this.f293c);
                    this.f294d = handler2;
                    Message obtainMessage2 = handler2.obtainMessage();
                    obtainMessage2.what = 5;
                    this.f294d.sendMessageDelayed(obtainMessage2, 10000);
                }
                this.f295e.set(true);
            }
        } catch (Throwable unused) {
        }
    }

    public void b() {
        this.f295e.set(false);
        this.f291a.quit();
        this.f293c.quit();
        this.f292b.removeCallbacksAndMessages((Object) null);
        this.f294d.removeCallbacksAndMessages((Object) null);
    }

    public void a(T t) {
        if (!this.f295e.get()) {
            a();
        }
        if (t.e()) {
            Message obtainMessage = this.f294d.obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.obj = t;
            this.f294d.sendMessage(obtainMessage);
            return;
        }
        Message obtainMessage2 = this.f292b.obtainMessage();
        obtainMessage2.what = 1;
        obtainMessage2.obj = t;
        this.f292b.sendMessage(obtainMessage2);
    }

    public static a c() {
        return a.e();
    }

    public static b d() {
        return b.e();
    }

    /* compiled from: AdEventDispatcher */
    private static class a extends c<a> {

        /* renamed from: a  reason: collision with root package name */
        private static volatile a f296a;

        public void a(a aVar) {
        }

        public void b() {
        }

        public static a e() {
            if (f296a == null) {
                synchronized (a.class) {
                    if (f296a == null) {
                        f296a = new a();
                    }
                }
            }
            return f296a;
        }

        a() {
        }

        public synchronized void a() {
        }
    }

    /* compiled from: AdEventDispatcher */
    private static class b extends c<c.a> {

        /* renamed from: a  reason: collision with root package name */
        private static volatile b f297a;

        public void a(c.a aVar) {
        }

        public void b() {
        }

        public static b e() {
            if (f297a == null) {
                synchronized (b.class) {
                    if (f297a == null) {
                        f297a = new b();
                    }
                }
            }
            return f297a;
        }

        b() {
        }

        public synchronized void a() {
        }
    }
}
