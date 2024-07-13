package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.applovin.exoplayer2.c.c;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.g;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

class b {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayDeque<a> f12500a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f12501b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final MediaCodec f12502c;

    /* renamed from: d  reason: collision with root package name */
    private final HandlerThread f12503d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f12504e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<RuntimeException> f12505f;

    /* renamed from: g  reason: collision with root package name */
    private final g f12506g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f12507h;
    private boolean i;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f12509a;

        /* renamed from: b  reason: collision with root package name */
        public int f12510b;

        /* renamed from: c  reason: collision with root package name */
        public int f12511c;

        /* renamed from: d  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f12512d = new MediaCodec.CryptoInfo();

        /* renamed from: e  reason: collision with root package name */
        public long f12513e;

        /* renamed from: f  reason: collision with root package name */
        public int f12514f;

        a() {
        }

        public void a(int i, int i2, int i3, long j, int i4) {
            this.f12509a = i;
            this.f12510b = i2;
            this.f12511c = i3;
            this.f12513e = j;
            this.f12514f = i4;
        }
    }

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z) {
        this(mediaCodec, handlerThread, z, new g());
    }

    b(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z, g gVar) {
        this.f12502c = mediaCodec;
        this.f12503d = handlerThread;
        this.f12506g = gVar;
        this.f12505f = new AtomicReference<>();
        this.f12507h = z || i();
    }

    private void a(int i2, int i3, MediaCodec.CryptoInfo cryptoInfo, long j, int i4) {
        try {
            if (this.f12507h) {
                synchronized (f12501b) {
                    this.f12502c.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                }
                return;
            }
            this.f12502c.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
        } catch (RuntimeException e2) {
            a(e2);
        }
    }

    /* access modifiers changed from: private */
    public void a(Message message) {
        a aVar;
        int i2 = message.what;
        if (i2 == 0) {
            aVar = (a) message.obj;
            b(aVar.f12509a, aVar.f12510b, aVar.f12511c, aVar.f12513e, aVar.f12514f);
        } else if (i2 != 1) {
            if (i2 != 2) {
                a((RuntimeException) new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f12506g.a();
            }
            aVar = null;
        } else {
            aVar = (a) message.obj;
            a(aVar.f12509a, aVar.f12510b, aVar.f12512d, aVar.f12513e, aVar.f12514f);
        }
        if (aVar != null) {
            a(aVar);
        }
    }

    private static void a(c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f11405f;
        cryptoInfo.numBytesOfClearData = a(cVar.f11403d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = a(cVar.f11404e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) com.applovin.exoplayer2.l.a.b(a(cVar.f11401b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) com.applovin.exoplayer2.l.a.b(a(cVar.f11400a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f11402c;
        if (ai.f13525a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f11406g, cVar.f11407h));
        }
    }

    private static void a(a aVar) {
        synchronized (f12500a) {
            f12500a.add(aVar);
        }
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] a(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    private void b(int i2, int i3, int i4, long j, int i5) {
        try {
            this.f12502c.queueInputBuffer(i2, i3, i4, j, i5);
        } catch (RuntimeException e2) {
            a(e2);
        }
    }

    private void e() {
        RuntimeException andSet = this.f12505f.getAndSet((Object) null);
        if (andSet != null) {
            throw andSet;
        }
    }

    private void f() throws InterruptedException {
        ((Handler) ai.a(this.f12504e)).removeCallbacksAndMessages((Object) null);
        g();
        e();
    }

    private void g() throws InterruptedException {
        this.f12506g.b();
        ((Handler) ai.a(this.f12504e)).obtainMessage(2).sendToTarget();
        this.f12506g.c();
    }

    private static a h() {
        synchronized (f12500a) {
            if (f12500a.isEmpty()) {
                a aVar = new a();
                return aVar;
            }
            a removeFirst = f12500a.removeFirst();
            return removeFirst;
        }
    }

    private static boolean i() {
        String lowerCase = Ascii.toLowerCase(ai.f13527c);
        return lowerCase.contains("samsung") || lowerCase.contains("motorola");
    }

    public void a() {
        if (!this.i) {
            this.f12503d.start();
            this.f12504e = new Handler(this.f12503d.getLooper()) {
                public void handleMessage(Message message) {
                    b.this.a(message);
                }
            };
            this.i = true;
        }
    }

    public void a(int i2, int i3, int i4, long j, int i5) {
        e();
        a h2 = h();
        h2.a(i2, i3, i4, j, i5);
        ((Handler) ai.a(this.f12504e)).obtainMessage(0, h2).sendToTarget();
    }

    public void a(int i2, int i3, c cVar, long j, int i4) {
        e();
        a h2 = h();
        h2.a(i2, i3, 0, j, i4);
        a(cVar, h2.f12512d);
        ((Handler) ai.a(this.f12504e)).obtainMessage(1, h2).sendToTarget();
    }

    /* access modifiers changed from: package-private */
    public void a(RuntimeException runtimeException) {
        this.f12505f.set(runtimeException);
    }

    public void b() {
        if (this.i) {
            try {
                f();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    public void c() {
        if (this.i) {
            b();
            this.f12503d.quit();
        }
        this.i = false;
    }

    public void d() throws InterruptedException {
        g();
    }
}
