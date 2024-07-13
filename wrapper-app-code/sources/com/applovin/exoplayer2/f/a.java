package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.applovin.exoplayer2.c.c;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.exoplayer2.f.a;
import com.applovin.exoplayer2.f.g;
import com.applovin.exoplayer2.l.ah;
import java.nio.ByteBuffer;
import java.util.Objects;

final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f12489a;

    /* renamed from: b  reason: collision with root package name */
    private final c f12490b;

    /* renamed from: c  reason: collision with root package name */
    private final b f12491c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12492d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12493e;

    /* renamed from: f  reason: collision with root package name */
    private int f12494f;

    /* renamed from: g  reason: collision with root package name */
    private Surface f12495g;

    /* renamed from: com.applovin.exoplayer2.f.a$a  reason: collision with other inner class name */
    public static final class C0121a implements g.b {

        /* renamed from: b  reason: collision with root package name */
        private final Supplier<HandlerThread> f12496b;

        /* renamed from: c  reason: collision with root package name */
        private final Supplier<HandlerThread> f12497c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f12498d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f12499e;

        public C0121a(int i, boolean z, boolean z2) {
            this(new Supplier(i) {
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                public final Object get() {
                    return a.C0121a.b(this.f$0);
                }
            }, new Supplier(i) {
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                public final Object get() {
                    return a.C0121a.a(this.f$0);
                }
            }, z, z2);
        }

        C0121a(Supplier<HandlerThread> supplier, Supplier<HandlerThread> supplier2, boolean z, boolean z2) {
            this.f12496b = supplier;
            this.f12497c = supplier2;
            this.f12498d = z;
            this.f12499e = z2;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ HandlerThread a(int i) {
            return new HandlerThread(a.g(i));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ HandlerThread b(int i) {
            return new HandlerThread(a.f(i));
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.applovin.exoplayer2.f.a b(com.applovin.exoplayer2.f.g.a r12) throws java.io.IOException {
            /*
                r11 = this;
                com.applovin.exoplayer2.f.i r0 = r12.f12534a
                java.lang.String r0 = r0.f12544a
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0052 }
                r2.<init>()     // Catch:{ Exception -> 0x0052 }
                java.lang.String r3 = "createCodec:"
                r2.append(r3)     // Catch:{ Exception -> 0x0052 }
                r2.append(r0)     // Catch:{ Exception -> 0x0052 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0052 }
                com.applovin.exoplayer2.l.ah.a(r2)     // Catch:{ Exception -> 0x0052 }
                android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x0052 }
                com.applovin.exoplayer2.f.a r10 = new com.applovin.exoplayer2.f.a     // Catch:{ Exception -> 0x0050 }
                com.applovin.exoplayer2.common.base.Supplier<android.os.HandlerThread> r2 = r11.f12496b     // Catch:{ Exception -> 0x0050 }
                java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x0050 }
                r5 = r2
                android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x0050 }
                com.applovin.exoplayer2.common.base.Supplier<android.os.HandlerThread> r2 = r11.f12497c     // Catch:{ Exception -> 0x0050 }
                java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x0050 }
                r6 = r2
                android.os.HandlerThread r6 = (android.os.HandlerThread) r6     // Catch:{ Exception -> 0x0050 }
                boolean r7 = r11.f12498d     // Catch:{ Exception -> 0x0050 }
                boolean r8 = r11.f12499e     // Catch:{ Exception -> 0x0050 }
                r9 = 0
                r3 = r10
                r4 = r0
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0050 }
                com.applovin.exoplayer2.l.ah.a()     // Catch:{ Exception -> 0x004d }
                android.media.MediaFormat r3 = r12.f12535b     // Catch:{ Exception -> 0x004d }
                android.view.Surface r4 = r12.f12537d     // Catch:{ Exception -> 0x004d }
                android.media.MediaCrypto r5 = r12.f12538e     // Catch:{ Exception -> 0x004d }
                int r6 = r12.f12539f     // Catch:{ Exception -> 0x004d }
                boolean r7 = r12.f12540g     // Catch:{ Exception -> 0x004d }
                r2 = r10
                r2.a((android.media.MediaFormat) r3, (android.view.Surface) r4, (android.media.MediaCrypto) r5, (int) r6, (boolean) r7)     // Catch:{ Exception -> 0x004d }
                return r10
            L_0x004d:
                r12 = move-exception
                r1 = r10
                goto L_0x0054
            L_0x0050:
                r12 = move-exception
                goto L_0x0054
            L_0x0052:
                r12 = move-exception
                r0 = r1
            L_0x0054:
                if (r1 != 0) goto L_0x005c
                if (r0 == 0) goto L_0x005f
                r0.release()
                goto L_0x005f
            L_0x005c:
                r1.e()
            L_0x005f:
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.f.a.C0121a.b(com.applovin.exoplayer2.f.g$a):com.applovin.exoplayer2.f.a");
        }
    }

    private a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.f12489a = mediaCodec;
        this.f12490b = new c(handlerThread);
        this.f12491c = new b(mediaCodec, handlerThread2, z);
        this.f12492d = z2;
        this.f12494f = 0;
    }

    private static String a(int i, String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            str2 = "Audio";
        } else if (i == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
        this.f12490b.a(this.f12489a);
        ah.a("configureCodec");
        this.f12489a.configure(mediaFormat, surface, mediaCrypto, i);
        ah.a();
        if (z) {
            this.f12495g = this.f12489a.createInputSurface();
        }
        this.f12491c.a();
        ah.a("startCodec");
        this.f12489a.start();
        ah.a();
        this.f12494f = 1;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(g.c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.a(this, j, j2);
    }

    /* access modifiers changed from: private */
    public static String f(int i) {
        return a(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    private void f() {
        if (this.f12492d) {
            try {
                this.f12491c.d();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public static String g(int i) {
        return a(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public int a(MediaCodec.BufferInfo bufferInfo) {
        return this.f12490b.a(bufferInfo);
    }

    public ByteBuffer a(int i) {
        return this.f12489a.getInputBuffer(i);
    }

    public void a(int i, int i2, int i3, long j, int i4) {
        this.f12491c.a(i, i2, i3, j, i4);
    }

    public void a(int i, int i2, c cVar, long j, int i3) {
        this.f12491c.a(i, i2, cVar, j, i3);
    }

    public void a(int i, long j) {
        this.f12489a.releaseOutputBuffer(i, j);
    }

    public void a(int i, boolean z) {
        this.f12489a.releaseOutputBuffer(i, z);
    }

    public void a(Bundle bundle) {
        f();
        this.f12489a.setParameters(bundle);
    }

    public void a(Surface surface) {
        f();
        this.f12489a.setOutputSurface(surface);
    }

    public void a(g.c cVar, Handler handler) {
        f();
        this.f12489a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(cVar) {
            public final /* synthetic */ g.c f$1;

            {
                this.f$1 = r2;
            }

            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                a.this.a(this.f$1, mediaCodec, j, j2);
            }
        }, handler);
    }

    public boolean a() {
        return false;
    }

    public int b() {
        return this.f12490b.b();
    }

    public ByteBuffer b(int i) {
        return this.f12489a.getOutputBuffer(i);
    }

    public MediaFormat c() {
        return this.f12490b.c();
    }

    public void c(int i) {
        f();
        this.f12489a.setVideoScalingMode(i);
    }

    public void d() {
        this.f12491c.b();
        this.f12489a.flush();
        c cVar = this.f12490b;
        MediaCodec mediaCodec = this.f12489a;
        Objects.requireNonNull(mediaCodec);
        cVar.a((Runnable) new Runnable(mediaCodec) {
            public final /* synthetic */ MediaCodec f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                this.f$0.start();
            }
        });
    }

    public void e() {
        try {
            if (this.f12494f == 1) {
                this.f12491c.c();
                this.f12490b.a();
            }
            this.f12494f = 2;
        } finally {
            Surface surface = this.f12495g;
            if (surface != null) {
                surface.release();
            }
            if (!this.f12493e) {
                this.f12489a.release();
                this.f12493e = true;
            }
        }
    }
}
