package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayDeque;

final class c extends MediaCodec.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final Object f12515a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f12516b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f12517c;

    /* renamed from: d  reason: collision with root package name */
    private final f f12518d;

    /* renamed from: e  reason: collision with root package name */
    private final f f12519e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f12520f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f12521g;

    /* renamed from: h  reason: collision with root package name */
    private MediaFormat f12522h;
    private MediaFormat i;
    private MediaCodec.CodecException j;
    private long k;
    private boolean l;
    private IllegalStateException m;

    c(HandlerThread handlerThread) {
        this.f12516b = handlerThread;
        this.f12518d = new f();
        this.f12519e = new f();
        this.f12520f = new ArrayDeque<>();
        this.f12521g = new ArrayDeque<>();
    }

    private void a(MediaFormat mediaFormat) {
        this.f12519e.a(-2);
        this.f12521g.add(mediaFormat);
    }

    private void a(IllegalStateException illegalStateException) {
        synchronized (this.f12515a) {
            this.m = illegalStateException;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void d(Runnable runnable) {
        synchronized (this.f12515a) {
            c(runnable);
        }
    }

    private void c(Runnable runnable) {
        if (!this.l) {
            long j2 = this.k - 1;
            this.k = j2;
            if (j2 <= 0) {
                if (j2 < 0) {
                    a(new IllegalStateException());
                    return;
                }
                d();
                try {
                    runnable.run();
                } catch (IllegalStateException e2) {
                    a(e2);
                } catch (Exception e3) {
                    a(new IllegalStateException(e3));
                }
            }
        }
    }

    private void d() {
        if (!this.f12521g.isEmpty()) {
            this.i = this.f12521g.getLast();
        }
        this.f12518d.c();
        this.f12519e.c();
        this.f12520f.clear();
        this.f12521g.clear();
        this.j = null;
    }

    private boolean e() {
        return this.k > 0 || this.l;
    }

    private void f() {
        g();
        h();
    }

    private void g() {
        IllegalStateException illegalStateException = this.m;
        if (illegalStateException != null) {
            this.m = null;
            throw illegalStateException;
        }
    }

    private void h() {
        MediaCodec.CodecException codecException = this.j;
        if (codecException != null) {
            this.j = null;
            throw codecException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f12515a
            monitor-enter(r0)
            boolean r1 = r9.e()     // Catch:{ all -> 0x004a }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x000c:
            r9.f()     // Catch:{ all -> 0x004a }
            com.applovin.exoplayer2.f.f r1 = r9.f12519e     // Catch:{ all -> 0x004a }
            boolean r1 = r1.b()     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x0019:
            com.applovin.exoplayer2.f.f r1 = r9.f12519e     // Catch:{ all -> 0x004a }
            int r1 = r1.a()     // Catch:{ all -> 0x004a }
            if (r1 < 0) goto L_0x003b
            android.media.MediaFormat r2 = r9.f12522h     // Catch:{ all -> 0x004a }
            com.applovin.exoplayer2.l.a.a(r2)     // Catch:{ all -> 0x004a }
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r2 = r9.f12520f     // Catch:{ all -> 0x004a }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x004a }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x004a }
            int r4 = r2.offset     // Catch:{ all -> 0x004a }
            int r5 = r2.size     // Catch:{ all -> 0x004a }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x004a }
            int r8 = r2.flags     // Catch:{ all -> 0x004a }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x004a }
            goto L_0x0048
        L_0x003b:
            r10 = -2
            if (r1 != r10) goto L_0x0048
            java.util.ArrayDeque<android.media.MediaFormat> r10 = r9.f12521g     // Catch:{ all -> 0x004a }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x004a }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x004a }
            r9.f12522h = r10     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x004a:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.f.c.a(android.media.MediaCodec$BufferInfo):int");
    }

    public void a() {
        synchronized (this.f12515a) {
            this.l = true;
            this.f12516b.quit();
            d();
        }
    }

    public void a(MediaCodec mediaCodec) {
        a.b(this.f12517c == null);
        this.f12516b.start();
        Handler handler = new Handler(this.f12516b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f12517c = handler;
    }

    public void a(Runnable runnable) {
        synchronized (this.f12515a) {
            this.k++;
            ((Handler) ai.a(this.f12517c)).post(new Runnable(runnable) {
                public final /* synthetic */ Runnable f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    c.this.d(this.f$1);
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f12515a
            monitor-enter(r0)
            boolean r1 = r3.e()     // Catch:{ all -> 0x0020 }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x000c:
            r3.f()     // Catch:{ all -> 0x0020 }
            com.applovin.exoplayer2.f.f r1 = r3.f12518d     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.b()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            com.applovin.exoplayer2.f.f r1 = r3.f12518d     // Catch:{ all -> 0x0020 }
            int r2 = r1.a()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.f.c.b():int");
    }

    public MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f12515a) {
            if (this.f12522h != null) {
                mediaFormat = this.f12522h;
            } else {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f12515a) {
            this.j = codecException;
        }
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        synchronized (this.f12515a) {
            this.f12518d.a(i2);
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f12515a) {
            if (this.i != null) {
                a(this.i);
                this.i = null;
            }
            this.f12519e.a(i2);
            this.f12520f.add(bufferInfo);
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f12515a) {
            a(mediaFormat);
            this.i = null;
        }
    }
}
