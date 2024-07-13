package com.applovin.exoplayer2.m;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.applovin.exoplayer2.l.j;
import com.applovin.exoplayer2.l.n;
import com.applovin.exoplayer2.l.q;

public final class d extends Surface {

    /* renamed from: b  reason: collision with root package name */
    private static int f13681b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f13682c;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13683a;

    /* renamed from: d  reason: collision with root package name */
    private final a f13684d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13685e;

    private static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private j f13686a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f13687b;

        /* renamed from: c  reason: collision with root package name */
        private Error f13688c;

        /* renamed from: d  reason: collision with root package name */
        private RuntimeException f13689d;

        /* renamed from: e  reason: collision with root package name */
        private d f13690e;

        public a() {
            super("ExoPlayer:DummySurface");
        }

        private void b() {
            com.applovin.exoplayer2.l.a.b(this.f13686a);
            this.f13686a.a();
        }

        private void b(int i) {
            com.applovin.exoplayer2.l.a.b(this.f13686a);
            this.f13686a.a(i);
            this.f13690e = new d(this, this.f13686a.b(), i != 0);
        }

        public d a(int i) {
            boolean z;
            start();
            this.f13687b = new Handler(getLooper(), this);
            this.f13686a = new j(this.f13687b);
            synchronized (this) {
                z = false;
                this.f13687b.obtainMessage(1, i, 0).sendToTarget();
                while (this.f13690e == null && this.f13689d == null && this.f13688c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f13689d;
            if (runtimeException == null) {
                Error error = this.f13688c;
                if (error == null) {
                    return (d) com.applovin.exoplayer2.l.a.b(this.f13690e);
                }
                throw error;
            }
            throw runtimeException;
        }

        public void a() {
            com.applovin.exoplayer2.l.a.b(this.f13687b);
            this.f13687b.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    q.c("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f13689d = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e3) {
                    try {
                        q.c("DummySurface", "Failed to initialize dummy surface", e3);
                        this.f13688c = e3;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i != 2) {
                return true;
            } else {
                try {
                    b();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }
    }

    private d(a aVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f13684d = aVar;
        this.f13683a = z;
    }

    public static d a(Context context, boolean z) {
        int i = 0;
        com.applovin.exoplayer2.l.a.b(!z || a(context));
        a aVar = new a();
        if (z) {
            i = f13681b;
        }
        return aVar.a(i);
    }

    public static synchronized boolean a(Context context) {
        boolean z;
        synchronized (d.class) {
            z = true;
            if (!f13682c) {
                f13681b = b(context);
                f13682c = true;
            }
            if (f13681b == 0) {
                z = false;
            }
        }
        return z;
    }

    private static int b(Context context) {
        if (n.a(context)) {
            return n.a() ? 1 : 2;
        }
        return 0;
    }

    public void release() {
        super.release();
        synchronized (this.f13684d) {
            if (!this.f13685e) {
                this.f13684d.a();
                this.f13685e = true;
            }
        }
    }
}
