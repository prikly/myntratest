package com.applovin.exoplayer2.l;

import android.os.Handler;
import android.os.Message;
import com.applovin.exoplayer2.l.o;
import java.util.ArrayList;
import java.util.List;

final class ae implements o {

    /* renamed from: a  reason: collision with root package name */
    private static final List<a> f13513a = new ArrayList(50);

    /* renamed from: b  reason: collision with root package name */
    private final Handler f13514b;

    private static final class a implements o.a {

        /* renamed from: a  reason: collision with root package name */
        private Message f13515a;

        /* renamed from: b  reason: collision with root package name */
        private ae f13516b;

        private a() {
        }

        private void b() {
            this.f13515a = null;
            this.f13516b = null;
            ae.b(this);
        }

        public a a(Message message, ae aeVar) {
            this.f13515a = message;
            this.f13516b = aeVar;
            return this;
        }

        public void a() {
            ((Message) a.b(this.f13515a)).sendToTarget();
            b();
        }

        public boolean a(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) a.b(this.f13515a));
            b();
            return sendMessageAtFrontOfQueue;
        }
    }

    public ae(Handler handler) {
        this.f13514b = handler;
    }

    private static a a() {
        a aVar;
        synchronized (f13513a) {
            aVar = f13513a.isEmpty() ? new a() : f13513a.remove(f13513a.size() - 1);
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    public static void b(a aVar) {
        synchronized (f13513a) {
            if (f13513a.size() < 50) {
                f13513a.add(aVar);
            }
        }
    }

    public o.a a(int i, int i2, int i3) {
        return a().a(this.f13514b.obtainMessage(i, i2, i3), this);
    }

    public o.a a(int i, int i2, int i3, Object obj) {
        return a().a(this.f13514b.obtainMessage(i, i2, i3, obj), this);
    }

    public o.a a(int i, Object obj) {
        return a().a(this.f13514b.obtainMessage(i, obj), this);
    }

    public void a(Object obj) {
        this.f13514b.removeCallbacksAndMessages(obj);
    }

    public boolean a(int i) {
        return this.f13514b.hasMessages(i);
    }

    public boolean a(int i, long j) {
        return this.f13514b.sendEmptyMessageAtTime(i, j);
    }

    public boolean a(o.a aVar) {
        return ((a) aVar).a(this.f13514b);
    }

    public boolean a(Runnable runnable) {
        return this.f13514b.post(runnable);
    }

    public o.a b(int i) {
        return a().a(this.f13514b.obtainMessage(i), this);
    }

    public boolean c(int i) {
        return this.f13514b.sendEmptyMessage(i);
    }

    public void d(int i) {
        this.f13514b.removeMessages(i);
    }
}
