package com.applovin.exoplayer2.b;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.b.f;
import com.applovin.exoplayer2.b.h;
import com.applovin.exoplayer2.b.j;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.v;
import com.appodeal.ads.modules.common.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class n implements h {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f11274a = false;
    private long A;
    private long B;
    private long C;
    private long D;
    private int E;
    private boolean F;
    private boolean G;
    private long H;
    private float I;
    private f[] J;
    private ByteBuffer[] K;
    private ByteBuffer L;
    private int M;
    private ByteBuffer N;
    private byte[] O;
    private int P;
    private int Q;
    private boolean R;
    private boolean S;
    /* access modifiers changed from: private */
    public boolean T;
    private boolean U;
    private int V;
    private k W;
    private boolean X;
    /* access modifiers changed from: private */
    public long Y;
    private boolean Z;
    private boolean aa;

    /* renamed from: b  reason: collision with root package name */
    private final e f11275b;

    /* renamed from: c  reason: collision with root package name */
    private final a f11276c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11277d;

    /* renamed from: e  reason: collision with root package name */
    private final m f11278e;

    /* renamed from: f  reason: collision with root package name */
    private final x f11279f;

    /* renamed from: g  reason: collision with root package name */
    private final f[] f11280g;

    /* renamed from: h  reason: collision with root package name */
    private final f[] f11281h;
    /* access modifiers changed from: private */
    public final ConditionVariable i;
    private final j j;
    private final ArrayDeque<e> k;
    private final boolean l;
    private final int m;
    private h n;
    private final f<h.b> o;
    private final f<h.e> p;
    /* access modifiers changed from: private */
    public h.c q;
    private b r;
    private b s;
    /* access modifiers changed from: private */
    public AudioTrack t;
    private d u;
    private e v;
    private e w;
    private am x;
    private ByteBuffer y;
    private int z;

    public interface a {
        long a(long j);

        am a(am amVar);

        boolean a(boolean z);

        f[] a();

        long b();
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final v f11284a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11285b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11286c;

        /* renamed from: d  reason: collision with root package name */
        public final int f11287d;

        /* renamed from: e  reason: collision with root package name */
        public final int f11288e;

        /* renamed from: f  reason: collision with root package name */
        public final int f11289f;

        /* renamed from: g  reason: collision with root package name */
        public final int f11290g;

        /* renamed from: h  reason: collision with root package name */
        public final int f11291h;
        public final f[] i;

        public b(v vVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, f[] fVarArr) {
            this.f11284a = vVar;
            this.f11285b = i2;
            this.f11286c = i3;
            this.f11287d = i4;
            this.f11288e = i5;
            this.f11289f = i6;
            this.f11290g = i7;
            this.i = fVarArr;
            this.f11291h = a(i8, z);
        }

        private int a(float f2) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f11288e, this.f11289f, this.f11290g);
            com.applovin.exoplayer2.l.a.b(minBufferSize != -2);
            int a2 = ai.a(minBufferSize * 4, ((int) c(250000)) * this.f11287d, Math.max(minBufferSize, ((int) c(750000)) * this.f11287d));
            return f2 != 1.0f ? Math.round(((float) a2) * f2) : a2;
        }

        private int a(int i2, boolean z) {
            long j;
            if (i2 != 0) {
                return i2;
            }
            int i3 = this.f11286c;
            if (i3 != 0) {
                if (i3 == 1) {
                    j = 50000000;
                } else if (i3 == 2) {
                    j = 250000;
                } else {
                    throw new IllegalStateException();
                }
                return d(j);
            }
            return a(z ? 8.0f : 1.0f);
        }

        private static AudioAttributes a(d dVar, boolean z) {
            return z ? b() : dVar.a();
        }

        private AudioTrack a(d dVar, int i2) {
            int g2 = ai.g(dVar.f11215d);
            int i3 = this.f11288e;
            int i4 = this.f11289f;
            int i5 = this.f11290g;
            int i6 = this.f11291h;
            if (i2 == 0) {
                return r0;
            }
            AudioTrack audioTrack = new AudioTrack(g2, i3, i4, i5, i6, 1, i2);
            return audioTrack;
        }

        private static AudioAttributes b() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        private AudioTrack b(boolean z, d dVar, int i2) {
            return ai.f13525a >= 29 ? c(z, dVar, i2) : ai.f13525a >= 21 ? d(z, dVar, i2) : a(dVar, i2);
        }

        private AudioTrack c(boolean z, d dVar, int i2) {
            AudioFormat a2 = n.b(this.f11288e, this.f11289f, this.f11290g);
            AudioAttributes a3 = a(dVar, z);
            boolean z2 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(a3).setAudioFormat(a2).setTransferMode(1).setBufferSizeInBytes(this.f11291h).setSessionId(i2);
            if (this.f11286c != 1) {
                z2 = false;
            }
            return sessionId.setOffloadedPlayback(z2).build();
        }

        private int d(long j) {
            int b2 = n.f(this.f11290g);
            if (this.f11290g == 5) {
                b2 *= 2;
            }
            return (int) ((j * ((long) b2)) / 1000000);
        }

        private AudioTrack d(boolean z, d dVar, int i2) {
            return new AudioTrack(a(dVar, z), n.b(this.f11288e, this.f11289f, this.f11290g), this.f11291h, 1, i2);
        }

        public long a(long j) {
            return (j * 1000000) / ((long) this.f11284a.z);
        }

        public AudioTrack a(boolean z, d dVar, int i2) throws h.b {
            try {
                AudioTrack b2 = b(z, dVar, i2);
                int state = b2.getState();
                if (state == 1) {
                    return b2;
                }
                try {
                    b2.release();
                } catch (Exception unused) {
                }
                throw new h.b(state, this.f11288e, this.f11289f, this.f11291h, this.f11284a, a(), (Exception) null);
            } catch (IllegalArgumentException | UnsupportedOperationException e2) {
                throw new h.b(0, this.f11288e, this.f11289f, this.f11291h, this.f11284a, a(), e2);
            }
        }

        public boolean a() {
            return this.f11286c == 1;
        }

        public boolean a(b bVar) {
            return bVar.f11286c == this.f11286c && bVar.f11290g == this.f11290g && bVar.f11288e == this.f11288e && bVar.f11289f == this.f11289f && bVar.f11287d == this.f11287d;
        }

        public long b(long j) {
            return (j * 1000000) / ((long) this.f11288e);
        }

        public long c(long j) {
            return (j * ((long) this.f11288e)) / 1000000;
        }
    }

    public static class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final f[] f11292a;

        /* renamed from: b  reason: collision with root package name */
        private final u f11293b;

        /* renamed from: c  reason: collision with root package name */
        private final w f11294c;

        public c(f... fVarArr) {
            this(fVarArr, new u(), new w());
        }

        public c(f[] fVarArr, u uVar, w wVar) {
            f[] fVarArr2 = new f[(fVarArr.length + 2)];
            this.f11292a = fVarArr2;
            System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            this.f11293b = uVar;
            this.f11294c = wVar;
            f[] fVarArr3 = this.f11292a;
            fVarArr3[fVarArr.length] = uVar;
            fVarArr3[fVarArr.length + 1] = wVar;
        }

        public long a(long j) {
            return this.f11294c.a(j);
        }

        public am a(am amVar) {
            this.f11294c.a(amVar.f11106b);
            this.f11294c.b(amVar.f11107c);
            return amVar;
        }

        public boolean a(boolean z) {
            this.f11293b.a(z);
            return z;
        }

        public f[] a() {
            return this.f11292a;
        }

        public long b() {
            return this.f11293b.k();
        }
    }

    public static final class d extends RuntimeException {
        private d(String str) {
            super(str);
        }
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final am f11295a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f11296b;

        /* renamed from: c  reason: collision with root package name */
        public final long f11297c;

        /* renamed from: d  reason: collision with root package name */
        public final long f11298d;

        private e(am amVar, boolean z, long j, long j2) {
            this.f11295a = amVar;
            this.f11296b = z;
            this.f11297c = j;
            this.f11298d = j2;
        }
    }

    private static final class f<T extends Exception> {

        /* renamed from: a  reason: collision with root package name */
        private final long f11299a;

        /* renamed from: b  reason: collision with root package name */
        private T f11300b;

        /* renamed from: c  reason: collision with root package name */
        private long f11301c;

        public f(long j) {
            this.f11299a = j;
        }

        public void a() {
            this.f11300b = null;
        }

        public void a(T t) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f11300b == null) {
                this.f11300b = t;
                this.f11301c = this.f11299a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f11301c) {
                T t2 = this.f11300b;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f11300b;
                a();
                throw t3;
            }
        }
    }

    private final class g implements j.a {
        private g() {
        }

        public void a(int i, long j) {
            if (n.this.q != null) {
                n.this.q.a(i, j, SystemClock.elapsedRealtime() - n.this.Y);
            }
        }

        public void a(long j) {
            if (n.this.q != null) {
                n.this.q.a(j);
            }
        }

        public void a(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + n.this.z() + ", " + n.this.A();
            if (!n.f11274a) {
                q.c("DefaultAudioSink", str);
                return;
            }
            throw new d(str);
        }

        public void b(long j) {
            q.c("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        public void b(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + n.this.z() + ", " + n.this.A();
            if (!n.f11274a) {
                q.c("DefaultAudioSink", str);
                return;
            }
            throw new d(str);
        }
    }

    private final class h {

        /* renamed from: b  reason: collision with root package name */
        private final Handler f11304b = new Handler();

        /* renamed from: c  reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f11305c;

        public h() {
            this.f11305c = new AudioTrack.StreamEventCallback(n.this) {
                public void onDataRequest(AudioTrack audioTrack, int i) {
                    com.applovin.exoplayer2.l.a.b(audioTrack == n.this.t);
                    if (n.this.q != null && n.this.T) {
                        n.this.q.b();
                    }
                }

                public void onTearDown(AudioTrack audioTrack) {
                    com.applovin.exoplayer2.l.a.b(audioTrack == n.this.t);
                    if (n.this.q != null && n.this.T) {
                        n.this.q.b();
                    }
                }
            };
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f11304b;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor(handler) {
                public final /* synthetic */ Handler f$0;

                {
                    this.f$0 = r1;
                }

                public final void execute(Runnable runnable) {
                    this.f$0.post(runnable);
                }
            }, this.f11305c);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f11305c);
            this.f11304b.removeCallbacksAndMessages((Object) null);
        }
    }

    public n(e eVar, a aVar, boolean z2, boolean z3, int i2) {
        this.f11275b = eVar;
        this.f11276c = (a) com.applovin.exoplayer2.l.a.b(aVar);
        this.f11277d = ai.f13525a >= 21 && z2;
        this.l = ai.f13525a >= 23 && z3;
        this.m = ai.f13525a < 29 ? 0 : i2;
        this.i = new ConditionVariable(true);
        this.j = new j(new g());
        this.f11278e = new m();
        this.f11279f = new x();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new l[]{new t(), this.f11278e, this.f11279f});
        Collections.addAll(arrayList, aVar.a());
        this.f11280g = (f[]) arrayList.toArray(new f[0]);
        this.f11281h = new f[]{new p()};
        this.I = 1.0f;
        this.u = d.f11211a;
        this.V = 0;
        this.W = new k(0, 0.0f);
        this.w = new e(am.f11104a, false, 0, 0);
        this.x = am.f11104a;
        this.Q = -1;
        this.J = new f[0];
        this.K = new ByteBuffer[0];
        this.k = new ArrayDeque<>();
        this.o = new f<>(100);
        this.p = new f<>(100);
    }

    /* access modifiers changed from: private */
    public long A() {
        return this.s.f11286c == 0 ? this.C / ((long) this.s.f11287d) : this.D;
    }

    private void B() {
        if (!this.S) {
            this.S = true;
            this.j.e(A());
            this.t.stop();
            this.z = 0;
        }
    }

    private static int a(int i2, int i3) {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i4 = 8; i4 > 0; i4--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i3).setChannelMask(ai.f(i4)).build(), build)) {
                return i4;
            }
        }
        return 0;
    }

    private static int a(int i2, ByteBuffer byteBuffer) {
        switch (i2) {
            case 5:
            case 6:
            case 18:
                return b.a(byteBuffer);
            case 7:
            case 8:
                return o.a(byteBuffer);
            case 9:
                int b2 = r.b(ai.a(byteBuffer, byteBuffer.position()));
                if (b2 != -1) {
                    return b2;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 14:
                int b3 = b.b(byteBuffer);
                if (b3 == -1) {
                    return 0;
                }
                return b.a(byteBuffer, b3) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return c.a(byteBuffer);
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i2);
        }
    }

    private int a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        if (ai.f13525a >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return 0;
        }
        return (ai.f13525a != 30 || !ai.f13528d.startsWith("Pixel")) ? 1 : 2;
    }

    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j2) {
        if (ai.f13525a >= 26) {
            return audioTrack.write(byteBuffer, i2, 1, j2 * 1000);
        }
        if (this.y == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.y = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.y.putInt(1431633921);
        }
        if (this.z == 0) {
            this.y.putInt(4, i2);
            this.y.putLong(8, j2 * 1000);
            this.y.position(0);
            this.z = i2;
        }
        int remaining = this.y.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.y, remaining, 1);
            if (write < 0) {
                this.z = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int a2 = a(audioTrack, byteBuffer, i2);
        if (a2 < 0) {
            this.z = 0;
            return a2;
        }
        this.z -= a2;
        return a2;
    }

    private void a(long j2) throws h.e {
        ByteBuffer byteBuffer;
        int length = this.J.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.K[i2 - 1];
            } else {
                byteBuffer = this.L;
                if (byteBuffer == null) {
                    byteBuffer = f.f11227a;
                }
            }
            if (i2 == length) {
                a(byteBuffer, j2);
            } else {
                f fVar = this.J[i2];
                if (i2 > this.Q) {
                    fVar.a(byteBuffer);
                }
                ByteBuffer c2 = fVar.c();
                this.K[i2] = c2;
                if (c2.hasRemaining()) {
                    i2++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i2--;
            } else {
                return;
            }
        }
    }

    private void a(AudioTrack audioTrack) {
        if (this.n == null) {
            this.n = new h();
        }
        this.n.a(audioTrack);
    }

    private static void a(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    private void a(am amVar, boolean z2) {
        e w2 = w();
        if (!amVar.equals(w2.f11295a) || z2 != w2.f11296b) {
            e eVar = new e(amVar, z2, -9223372036854775807L, -9223372036854775807L);
            if (y()) {
                this.v = eVar;
            } else {
                this.w = eVar;
            }
        }
    }

    private void a(ByteBuffer byteBuffer, long j2) throws h.e {
        int i2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.N;
            boolean z2 = true;
            if (byteBuffer2 != null) {
                com.applovin.exoplayer2.l.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.N = byteBuffer;
                if (ai.f13525a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.O;
                    if (bArr == null || bArr.length < remaining) {
                        this.O = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.O, 0, remaining);
                    byteBuffer.position(position);
                    this.P = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (ai.f13525a < 21) {
                int b2 = this.j.b(this.C);
                if (b2 > 0) {
                    i2 = this.t.write(this.O, this.P, Math.min(remaining2, b2));
                    if (i2 > 0) {
                        this.P += i2;
                        byteBuffer.position(byteBuffer.position() + i2);
                    }
                } else {
                    i2 = 0;
                }
            } else if (this.X) {
                com.applovin.exoplayer2.l.a.b(j2 != -9223372036854775807L);
                i2 = a(this.t, byteBuffer, remaining2, j2);
            } else {
                i2 = a(this.t, byteBuffer, remaining2);
            }
            this.Y = SystemClock.elapsedRealtime();
            if (i2 < 0) {
                boolean c2 = c(i2);
                if (c2) {
                    r();
                }
                h.e eVar = new h.e(i2, this.s.f11284a, c2);
                h.c cVar = this.q;
                if (cVar != null) {
                    cVar.a((Exception) eVar);
                }
                if (!eVar.f11242b) {
                    this.p.a(eVar);
                    return;
                }
                throw eVar;
            }
            this.p.a();
            if (b(this.t)) {
                if (this.D > 0) {
                    this.aa = false;
                }
                if (this.T && this.q != null && i2 < remaining2 && !this.aa) {
                    this.q.b(this.j.c(this.D));
                }
            }
            if (this.s.f11286c == 0) {
                this.C += (long) i2;
            }
            if (i2 == remaining2) {
                if (this.s.f11286c != 0) {
                    if (byteBuffer != this.L) {
                        z2 = false;
                    }
                    com.applovin.exoplayer2.l.a.b(z2);
                    this.D += (long) (this.E * this.M);
                }
                this.N = null;
            }
        }
    }

    private boolean a(v vVar, d dVar) {
        int b2;
        int f2;
        int a2;
        if (ai.f13525a < 29 || this.m == 0 || (b2 = u.b((String) com.applovin.exoplayer2.l.a.b(vVar.l), vVar.i)) == 0 || (f2 = ai.f(vVar.y)) == 0 || (a2 = a(b(vVar.z, f2, b2), dVar.a())) == 0) {
            return false;
        }
        if (a2 == 1) {
            return !(vVar.B != 0 || vVar.C != 0) || !(this.m == 1);
        } else if (a2 == 2) {
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    private static boolean a(v vVar, e eVar) {
        return b(vVar, eVar) != null;
    }

    /* access modifiers changed from: private */
    public static AudioFormat b(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    private static Pair<Integer, Integer> b(v vVar, e eVar) {
        if (eVar == null) {
            return null;
        }
        int b2 = u.b((String) com.applovin.exoplayer2.l.a.b(vVar.l), vVar.i);
        int i2 = 6;
        if (!(b2 == 5 || b2 == 6 || b2 == 18 || b2 == 17 || b2 == 7 || b2 == 8 || b2 == 14)) {
            return null;
        }
        if (b2 == 18 && !eVar.a(18)) {
            b2 = 6;
        } else if (b2 == 8 && !eVar.a(8)) {
            b2 = 7;
        }
        if (!eVar.a(b2)) {
            return null;
        }
        if (b2 != 18) {
            i2 = vVar.y;
            if (i2 > eVar.a()) {
                return null;
            }
        } else if (ai.f13525a >= 29 && (i2 = a(18, vVar.z)) == 0) {
            q.c("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
            return null;
        }
        int e2 = e(i2);
        if (e2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(b2), Integer.valueOf(e2));
    }

    private void b(long j2) {
        am a2 = x() ? this.f11276c.a(v()) : am.f11104a;
        boolean a3 = x() ? this.f11276c.a(m()) : false;
        this.k.add(new e(a2, a3, Math.max(0, j2), this.s.b(A())));
        n();
        h.c cVar = this.q;
        if (cVar != null) {
            cVar.a(a3);
        }
    }

    private static void b(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    private void b(am amVar) {
        if (y()) {
            try {
                this.t.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(amVar.f11106b).setPitch(amVar.f11107c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                q.b("DefaultAudioSink", "Failed to set playback params", e2);
            }
            amVar = new am(this.t.getPlaybackParams().getSpeed(), this.t.getPlaybackParams().getPitch());
            this.j.a(amVar.f11106b);
        }
        this.x = amVar;
    }

    private static boolean b(AudioTrack audioTrack) {
        return ai.f13525a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private long c(long j2) {
        while (!this.k.isEmpty() && j2 >= this.k.getFirst().f11298d) {
            this.w = this.k.remove();
        }
        long j3 = j2 - this.w.f11298d;
        if (this.w.f11295a.equals(am.f11104a)) {
            return this.w.f11297c + j3;
        }
        if (this.k.isEmpty()) {
            return this.w.f11297c + this.f11276c.a(j3);
        }
        e first = this.k.getFirst();
        return first.f11297c - ai.a(first.f11298d - j2, this.w.f11295a.f11106b);
    }

    private static boolean c(int i2) {
        return (ai.f13525a >= 24 && i2 == -6) || i2 == -32;
    }

    private long d(long j2) {
        return j2 + this.s.b(this.f11276c.b());
    }

    private boolean d(int i2) {
        return this.f11277d && ai.e(i2);
    }

    private static int e(int i2) {
        if (ai.f13525a <= 28) {
            if (i2 == 7) {
                i2 = 8;
            } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                i2 = 6;
            }
        }
        if (ai.f13525a <= 26 && "fugu".equals(ai.f13526b) && i2 == 1) {
            i2 = 2;
        }
        return ai.f(i2);
    }

    /* access modifiers changed from: private */
    public static int f(int i2) {
        switch (i2) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return Constants.MAX_FAILED_REQUEST_MS;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void n() {
        f[] fVarArr = this.s.i;
        ArrayList arrayList = new ArrayList();
        for (f fVar : fVarArr) {
            if (fVar.a()) {
                arrayList.add(fVar);
            } else {
                fVar.e();
            }
        }
        int size = arrayList.size();
        this.J = (f[]) arrayList.toArray(new f[size]);
        this.K = new ByteBuffer[size];
        o();
    }

    private void o() {
        int i2 = 0;
        while (true) {
            f[] fVarArr = this.J;
            if (i2 < fVarArr.length) {
                f fVar = fVarArr[i2];
                fVar.e();
                this.K[i2] = fVar.c();
                i2++;
            } else {
                return;
            }
        }
    }

    private void p() throws h.b {
        this.i.block();
        AudioTrack q2 = q();
        this.t = q2;
        if (b(q2)) {
            a(this.t);
            if (this.m != 3) {
                this.t.setOffloadDelayPadding(this.s.f11284a.B, this.s.f11284a.C);
            }
        }
        this.V = this.t.getAudioSessionId();
        this.j.a(this.t, this.s.f11286c == 2, this.s.f11290g, this.s.f11287d, this.s.f11291h);
        t();
        if (this.W.f11263a != 0) {
            this.t.attachAuxEffect(this.W.f11263a);
            this.t.setAuxEffectSendLevel(this.W.f11264b);
        }
        this.G = true;
    }

    private AudioTrack q() throws h.b {
        try {
            return ((b) com.applovin.exoplayer2.l.a.b(this.s)).a(this.X, this.u, this.V);
        } catch (h.b e2) {
            r();
            h.c cVar = this.q;
            if (cVar != null) {
                cVar.a((Exception) e2);
            }
            throw e2;
        }
    }

    private void r() {
        if (this.s.a()) {
            this.Z = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean s() throws com.applovin.exoplayer2.b.h.e {
        /*
            r9 = this;
            int r0 = r9.Q
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.Q = r3
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.Q
            com.applovin.exoplayer2.b.f[] r5 = r9.J
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.b()
        L_0x001f:
            r9.a((long) r7)
            boolean r0 = r4.d()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.Q
            int r0 = r0 + r2
            r9.Q = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.N
            if (r0 == 0) goto L_0x003b
            r9.a((java.nio.ByteBuffer) r0, (long) r7)
            java.nio.ByteBuffer r0 = r9.N
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.Q = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.b.n.s():boolean");
    }

    private void t() {
        if (y()) {
            if (ai.f13525a >= 21) {
                a(this.t, this.I);
            } else {
                b(this.t, this.I);
            }
        }
    }

    private void u() {
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.aa = false;
        this.E = 0;
        this.w = new e(v(), m(), 0, 0);
        this.H = 0;
        this.v = null;
        this.k.clear();
        this.L = null;
        this.M = 0;
        this.N = null;
        this.S = false;
        this.R = false;
        this.Q = -1;
        this.y = null;
        this.z = 0;
        this.f11279f.k();
        o();
    }

    private am v() {
        return w().f11295a;
    }

    private e w() {
        e eVar = this.v;
        return eVar != null ? eVar : !this.k.isEmpty() ? this.k.getLast() : this.w;
    }

    private boolean x() {
        return !this.X && "audio/raw".equals(this.s.f11284a.l) && !d(this.s.f11284a.A);
    }

    private boolean y() {
        return this.t != null;
    }

    /* access modifiers changed from: private */
    public long z() {
        return this.s.f11286c == 0 ? this.A / ((long) this.s.f11285b) : this.B;
    }

    public long a(boolean z2) {
        if (!y() || this.G) {
            return Long.MIN_VALUE;
        }
        return d(c(Math.min(this.j.a(z2), this.s.b(A()))));
    }

    public void a() {
        this.T = true;
        if (y()) {
            this.j.a();
            this.t.play();
        }
    }

    public void a(float f2) {
        if (this.I != f2) {
            this.I = f2;
            t();
        }
    }

    public void a(int i2) {
        if (this.V != i2) {
            this.V = i2;
            this.U = i2 != 0;
            j();
        }
    }

    public void a(am amVar) {
        am amVar2 = new am(ai.a(amVar.f11106b, 0.1f, 8.0f), ai.a(amVar.f11107c, 0.1f, 8.0f));
        if (!this.l || ai.f13525a < 23) {
            a(amVar2, m());
        } else {
            b(amVar2);
        }
    }

    public void a(d dVar) {
        if (!this.u.equals(dVar)) {
            this.u = dVar;
            if (!this.X) {
                j();
            }
        }
    }

    public void a(h.c cVar) {
        this.q = cVar;
    }

    public void a(k kVar) {
        if (!this.W.equals(kVar)) {
            int i2 = kVar.f11263a;
            float f2 = kVar.f11264b;
            if (this.t != null) {
                if (this.W.f11263a != i2) {
                    this.t.attachAuxEffect(i2);
                }
                if (i2 != 0) {
                    this.t.setAuxEffectSendLevel(f2);
                }
            }
            this.W = kVar;
        }
    }

    public void a(v vVar, int i2, int[] iArr) throws h.a {
        f[] fVarArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr2;
        v vVar2 = vVar;
        if ("audio/raw".equals(vVar2.l)) {
            com.applovin.exoplayer2.l.a.a(ai.d(vVar2.A));
            i8 = ai.c(vVar2.A, vVar2.y);
            f[] fVarArr2 = d(vVar2.A) ? this.f11281h : this.f11280g;
            this.f11279f.a(vVar2.B, vVar2.C);
            if (ai.f13525a < 21 && vVar2.y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i9 = 0; i9 < 6; i9++) {
                    iArr2[i9] = i9;
                }
            } else {
                iArr2 = iArr;
            }
            this.f11278e.a(iArr2);
            f.a aVar = new f.a(vVar2.z, vVar2.y, vVar2.A);
            int length = fVarArr2.length;
            int i10 = 0;
            while (i10 < length) {
                f fVar = fVarArr2[i10];
                try {
                    f.a a2 = fVar.a(aVar);
                    if (fVar.a()) {
                        aVar = a2;
                    }
                    i10++;
                } catch (f.b e2) {
                    throw new h.a((Throwable) e2, vVar);
                }
            }
            int i11 = aVar.f11231d;
            i5 = aVar.f11229b;
            i4 = ai.f(aVar.f11230c);
            fVarArr = fVarArr2;
            i3 = i11;
            i6 = ai.c(i11, aVar.f11230c);
            i7 = 0;
        } else {
            f[] fVarArr3 = new f[0];
            int i12 = vVar2.z;
            if (a(vVar, this.u)) {
                fVarArr = fVarArr3;
                i3 = u.b((String) com.applovin.exoplayer2.l.a.b(vVar2.l), vVar2.i);
                i4 = ai.f(vVar2.y);
                i8 = -1;
                i6 = -1;
                i5 = i12;
                i7 = 1;
            } else {
                Pair<Integer, Integer> b2 = b(vVar, this.f11275b);
                if (b2 != null) {
                    fVarArr = fVarArr3;
                    i3 = ((Integer) b2.first).intValue();
                    i8 = -1;
                    i6 = -1;
                    i4 = ((Integer) b2.second).intValue();
                    i5 = i12;
                    i7 = 2;
                } else {
                    throw new h.a("Unable to configure passthrough for: " + vVar, vVar);
                }
            }
        }
        if (i3 == 0) {
            throw new h.a("Invalid output encoding (mode=" + i7 + ") for: " + vVar, vVar);
        } else if (i4 != 0) {
            this.Z = false;
            b bVar = new b(vVar, i8, i7, i6, i5, i4, i3, i2, this.l, fVarArr);
            if (y()) {
                this.r = bVar;
            } else {
                this.s = bVar;
            }
        } else {
            throw new h.a("Invalid output channel config (mode=" + i7 + ") for: " + vVar, vVar);
        }
    }

    public boolean a(v vVar) {
        return b(vVar) != 0;
    }

    public boolean a(ByteBuffer byteBuffer, long j2, int i2) throws h.b, h.e {
        ByteBuffer byteBuffer2 = byteBuffer;
        long j3 = j2;
        int i3 = i2;
        ByteBuffer byteBuffer3 = this.L;
        com.applovin.exoplayer2.l.a.a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (this.r != null) {
            if (!s()) {
                return false;
            }
            if (!this.r.a(this.s)) {
                B();
                if (e()) {
                    return false;
                }
                j();
            } else {
                this.s = this.r;
                this.r = null;
                if (b(this.t) && this.m != 3) {
                    this.t.setOffloadEndOfStream();
                    this.t.setOffloadDelayPadding(this.s.f11284a.B, this.s.f11284a.C);
                    this.aa = true;
                }
            }
            b(j3);
        }
        if (!y()) {
            try {
                p();
            } catch (h.b e2) {
                h.b bVar = e2;
                if (!bVar.f11237b) {
                    this.o.a(bVar);
                    return false;
                }
                throw bVar;
            }
        }
        this.o.a();
        if (this.G) {
            this.H = Math.max(0, j3);
            this.F = false;
            this.G = false;
            if (this.l && ai.f13525a >= 23) {
                b(this.x);
            }
            b(j3);
            if (this.T) {
                a();
            }
        }
        if (!this.j.a(A())) {
            return false;
        }
        if (this.L == null) {
            com.applovin.exoplayer2.l.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.s.f11286c != 0 && this.E == 0) {
                int a2 = a(this.s.f11290g, byteBuffer2);
                this.E = a2;
                if (a2 == 0) {
                    return true;
                }
            }
            if (this.v != null) {
                if (!s()) {
                    return false;
                }
                b(j3);
                this.v = null;
            }
            long a3 = this.H + this.s.a(z() - this.f11279f.l());
            if (!this.F && Math.abs(a3 - j3) > 200000) {
                this.q.a((Exception) new h.d(j3, a3));
                this.F = true;
            }
            if (this.F) {
                if (!s()) {
                    return false;
                }
                long j4 = j3 - a3;
                this.H += j4;
                this.F = false;
                b(j3);
                h.c cVar = this.q;
                if (!(cVar == null || j4 == 0)) {
                    cVar.a();
                }
            }
            if (this.s.f11286c == 0) {
                this.A += (long) byteBuffer.remaining();
            } else {
                this.B += (long) (this.E * i3);
            }
            this.L = byteBuffer2;
            this.M = i3;
        }
        a(j3);
        if (!this.L.hasRemaining()) {
            this.L = null;
            this.M = 0;
            return true;
        } else if (!this.j.d(A())) {
            return false;
        } else {
            q.c("DefaultAudioSink", "Resetting stalled audio track");
            j();
            return true;
        }
    }

    public int b(v vVar) {
        if (!"audio/raw".equals(vVar.l)) {
            return ((this.Z || !a(vVar, this.u)) && !a(vVar, this.f11275b)) ? 0 : 2;
        }
        if (ai.d(vVar.A)) {
            return (vVar.A == 2 || (this.f11277d && vVar.A == 4)) ? 2 : 1;
        }
        q.c("DefaultAudioSink", "Invalid PCM encoding: " + vVar.A);
        return 0;
    }

    public void b() {
        this.F = true;
    }

    public void b(boolean z2) {
        a(v(), z2);
    }

    public void c() throws h.e {
        if (!this.R && y() && s()) {
            B();
            this.R = true;
        }
    }

    public boolean d() {
        return !y() || (this.R && !e());
    }

    public boolean e() {
        return y() && this.j.f(A());
    }

    public am f() {
        return this.l ? this.x : v();
    }

    public void g() {
        com.applovin.exoplayer2.l.a.b(ai.f13525a >= 21);
        com.applovin.exoplayer2.l.a.b(this.U);
        if (!this.X) {
            this.X = true;
            j();
        }
    }

    public void h() {
        if (this.X) {
            this.X = false;
            j();
        }
    }

    public void i() {
        this.T = false;
        if (y() && this.j.c()) {
            this.t.pause();
        }
    }

    public void j() {
        if (y()) {
            u();
            if (this.j.b()) {
                this.t.pause();
            }
            if (b(this.t)) {
                ((h) com.applovin.exoplayer2.l.a.b(this.n)).b(this.t);
            }
            final AudioTrack audioTrack = this.t;
            this.t = null;
            if (ai.f13525a < 21 && !this.U) {
                this.V = 0;
            }
            b bVar = this.r;
            if (bVar != null) {
                this.s = bVar;
                this.r = null;
            }
            this.j.d();
            this.i.close();
            new Thread("ExoPlayer:AudioTrackReleaseThread") {
                public void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        n.this.i.open();
                    }
                }
            }.start();
        }
        this.p.a();
        this.o.a();
    }

    public void k() {
        if (ai.f13525a < 25) {
            j();
            return;
        }
        this.p.a();
        this.o.a();
        if (y()) {
            u();
            if (this.j.b()) {
                this.t.pause();
            }
            this.t.flush();
            this.j.d();
            this.j.a(this.t, this.s.f11286c == 2, this.s.f11290g, this.s.f11287d, this.s.f11291h);
            this.G = true;
        }
    }

    public void l() {
        j();
        for (f f2 : this.f11280g) {
            f2.f();
        }
        for (f f3 : this.f11281h) {
            f3.f();
        }
        this.T = false;
        this.Z = false;
    }

    public boolean m() {
        return w().f11296b;
    }
}
