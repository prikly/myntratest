package com.applovin.exoplayer2.k;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final b f13457a = a(false, -9223372036854775807L);

    /* renamed from: b  reason: collision with root package name */
    public static final b f13458b = a(true, -9223372036854775807L);

    /* renamed from: c  reason: collision with root package name */
    public static final b f13459c = new b(2, -9223372036854775807L);

    /* renamed from: d  reason: collision with root package name */
    public static final b f13460d = new b(3, -9223372036854775807L);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final ExecutorService f13461e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public c<? extends d> f13462f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public IOException f13463g;

    public interface a<T extends d> {
        b a(T t, long j, long j2, IOException iOException, int i);

        void a(T t, long j, long j2);

        void a(T t, long j, long j2, boolean z);
    }

    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f13464a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f13465b;

        private b(int i, long j) {
            this.f13464a = i;
            this.f13465b = j;
        }

        public boolean a() {
            int i = this.f13464a;
            return i == 0 || i == 1;
        }
    }

    private final class c<T extends d> extends Handler implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f13466a;

        /* renamed from: c  reason: collision with root package name */
        private final T f13468c;

        /* renamed from: d  reason: collision with root package name */
        private final long f13469d;

        /* renamed from: e  reason: collision with root package name */
        private a<T> f13470e;

        /* renamed from: f  reason: collision with root package name */
        private IOException f13471f;

        /* renamed from: g  reason: collision with root package name */
        private int f13472g;

        /* renamed from: h  reason: collision with root package name */
        private Thread f13473h;
        private boolean i;
        private volatile boolean j;

        public c(Looper looper, T t, a<T> aVar, int i2, long j2) {
            super(looper);
            this.f13468c = t;
            this.f13470e = aVar;
            this.f13466a = i2;
            this.f13469d = j2;
        }

        private void a() {
            this.f13471f = null;
            w.this.f13461e.execute((Runnable) com.applovin.exoplayer2.l.a.b(w.this.f13462f));
        }

        private void b() {
            c unused = w.this.f13462f = null;
        }

        private long c() {
            return (long) Math.min((this.f13472g - 1) * 1000, 5000);
        }

        public void a(int i2) throws IOException {
            IOException iOException = this.f13471f;
            if (iOException != null && this.f13472g > i2) {
                throw iOException;
            }
        }

        public void a(long j2) {
            com.applovin.exoplayer2.l.a.b(w.this.f13462f == null);
            c unused = w.this.f13462f = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(0, j2);
            } else {
                a();
            }
        }

        public void a(boolean z) {
            this.j = z;
            this.f13471f = null;
            if (hasMessages(0)) {
                this.i = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.i = true;
                    this.f13468c.a();
                    Thread thread = this.f13473h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((a) com.applovin.exoplayer2.l.a.b(this.f13470e)).a(this.f13468c, elapsedRealtime, elapsedRealtime - this.f13469d, true);
                this.f13470e = null;
            }
        }

        public void handleMessage(Message message) {
            if (!this.j) {
                if (message.what == 0) {
                    a();
                } else if (message.what != 3) {
                    b();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = elapsedRealtime - this.f13469d;
                    a aVar = (a) com.applovin.exoplayer2.l.a.b(this.f13470e);
                    if (this.i) {
                        aVar.a(this.f13468c, elapsedRealtime, j2, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 == 1) {
                        try {
                            aVar.a(this.f13468c, elapsedRealtime, j2);
                        } catch (RuntimeException e2) {
                            q.c("LoadTask", "Unexpected exception handling load completed", e2);
                            IOException unused = w.this.f13463g = new g(e2);
                        }
                    } else if (i2 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f13471f = iOException;
                        int i3 = this.f13472g + 1;
                        this.f13472g = i3;
                        b a2 = aVar.a(this.f13468c, elapsedRealtime, j2, iOException, i3);
                        if (a2.f13464a == 3) {
                            IOException unused2 = w.this.f13463g = this.f13471f;
                        } else if (a2.f13464a != 2) {
                            if (a2.f13464a == 1) {
                                this.f13472g = 1;
                            }
                            a(a2.f13465b != -9223372036854775807L ? a2.f13465b : c());
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:49:0x007f, code lost:
            r0.sendToTarget();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                r0 = 2
                monitor-enter(r4)     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                boolean r1 = r4.i     // Catch:{ all -> 0x0052 }
                r2 = 1
                if (r1 != 0) goto L_0x0009
                r1 = 1
                goto L_0x000a
            L_0x0009:
                r1 = 0
            L_0x000a:
                java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0052 }
                r4.f13473h = r3     // Catch:{ all -> 0x0052 }
                monitor-exit(r4)     // Catch:{ all -> 0x0052 }
                if (r1 == 0) goto L_0x003f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                r1.<init>()     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                java.lang.String r3 = "load:"
                r1.append(r3)     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                T r3 = r4.f13468c     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                java.lang.Class r3 = r3.getClass()     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                java.lang.String r3 = r3.getSimpleName()     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                r1.append(r3)     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                com.applovin.exoplayer2.l.ah.a(r1)     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                T r1 = r4.f13468c     // Catch:{ all -> 0x003a }
                r1.b()     // Catch:{ all -> 0x003a }
                com.applovin.exoplayer2.l.ah.a()     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                goto L_0x003f
            L_0x003a:
                r1 = move-exception
                com.applovin.exoplayer2.l.ah.a()     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                throw r1     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
            L_0x003f:
                monitor-enter(r4)     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                r1 = 0
                r4.f13473h = r1     // Catch:{ all -> 0x004f }
                java.lang.Thread.interrupted()     // Catch:{ all -> 0x004f }
                monitor-exit(r4)     // Catch:{ all -> 0x004f }
                boolean r1 = r4.j     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                if (r1 != 0) goto L_0x009f
                r4.sendEmptyMessage(r2)     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                goto L_0x009f
            L_0x004f:
                r1 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x004f }
                throw r1     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
            L_0x0052:
                r1 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0052 }
                throw r1     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
            L_0x0055:
                r0 = move-exception
                boolean r1 = r4.j
                if (r1 != 0) goto L_0x0069
                java.lang.String r1 = "LoadTask"
                java.lang.String r2 = "Unexpected error loading stream"
                com.applovin.exoplayer2.l.q.c(r1, r2, r0)
                r1 = 3
                android.os.Message r1 = r4.obtainMessage(r1, r0)
                r1.sendToTarget()
            L_0x0069:
                throw r0
            L_0x006a:
                r1 = move-exception
                boolean r2 = r4.j
                if (r2 != 0) goto L_0x009f
                java.lang.String r2 = "LoadTask"
                java.lang.String r3 = "OutOfMemory error loading stream"
                com.applovin.exoplayer2.l.q.c(r2, r3, r1)
                com.applovin.exoplayer2.k.w$g r2 = new com.applovin.exoplayer2.k.w$g
                r2.<init>(r1)
            L_0x007b:
                android.os.Message r0 = r4.obtainMessage(r0, r2)
            L_0x007f:
                r0.sendToTarget()
                goto L_0x009f
            L_0x0083:
                r1 = move-exception
                boolean r2 = r4.j
                if (r2 != 0) goto L_0x009f
                java.lang.String r2 = "LoadTask"
                java.lang.String r3 = "Unexpected exception loading stream"
                com.applovin.exoplayer2.l.q.c(r2, r3, r1)
                com.applovin.exoplayer2.k.w$g r2 = new com.applovin.exoplayer2.k.w$g
                r2.<init>(r1)
                goto L_0x007b
            L_0x0095:
                r1 = move-exception
                boolean r2 = r4.j
                if (r2 != 0) goto L_0x009f
                android.os.Message r0 = r4.obtainMessage(r0, r1)
                goto L_0x007f
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.k.w.c.run():void");
        }
    }

    public interface d {
        void a();

        void b() throws IOException;
    }

    public interface e {
        void h();
    }

    private static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final e f13474a;

        public f(e eVar) {
            this.f13474a = eVar;
        }

        public void run() {
            this.f13474a.h();
        }
    }

    public static final class g extends IOException {
        public g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public w(String str) {
        this.f13461e = ai.a("ExoPlayer:Loader:" + str);
    }

    public static b a(boolean z, long j) {
        return new b(z ? 1 : 0, j);
    }

    public <T extends d> long a(T t, a<T> aVar, int i) {
        this.f13463g = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new c((Looper) com.applovin.exoplayer2.l.a.a(Looper.myLooper()), t, aVar, i, elapsedRealtime).a(0);
        return elapsedRealtime;
    }

    public void a(int i) throws IOException {
        IOException iOException = this.f13463g;
        if (iOException == null) {
            c<? extends d> cVar = this.f13462f;
            if (cVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = cVar.f13466a;
                }
                cVar.a(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void a(e eVar) {
        c<? extends d> cVar = this.f13462f;
        if (cVar != null) {
            cVar.a(true);
        }
        if (eVar != null) {
            this.f13461e.execute(new f(eVar));
        }
        this.f13461e.shutdown();
    }

    public boolean a() {
        return this.f13463g != null;
    }

    public void b() {
        this.f13463g = null;
    }

    public boolean c() {
        return this.f13462f != null;
    }

    public void d() {
        ((c) com.applovin.exoplayer2.l.a.a(this.f13462f)).a(false);
    }
}
