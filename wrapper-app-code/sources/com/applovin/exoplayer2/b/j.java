package com.applovin.exoplayer2.b;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.applovin.exoplayer2.h;
import com.applovin.exoplayer2.l.ai;
import java.lang.reflect.Method;

final class j {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* renamed from: a  reason: collision with root package name */
    private final a f11255a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f11256b;

    /* renamed from: c  reason: collision with root package name */
    private AudioTrack f11257c;

    /* renamed from: d  reason: collision with root package name */
    private int f11258d;

    /* renamed from: e  reason: collision with root package name */
    private int f11259e;

    /* renamed from: f  reason: collision with root package name */
    private i f11260f;

    /* renamed from: g  reason: collision with root package name */
    private int f11261g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11262h;
    private long i;
    private float j;
    private boolean k;
    private long l;
    private long m;
    private Method n;
    private long o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;
    private int v;
    private int w;
    private long x;
    private long y;
    private long z;

    public interface a {
        void a(int i, long j);

        void a(long j);

        void a(long j, long j2, long j3, long j4);

        void b(long j);

        void b(long j, long j2, long j3, long j4);
    }

    public j(a aVar) {
        this.f11255a = (a) com.applovin.exoplayer2.l.a.b(aVar);
        if (ai.f13525a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f11256b = new long[10];
    }

    private void a(long j2, long j3) {
        i iVar = (i) com.applovin.exoplayer2.l.a.b(this.f11260f);
        if (iVar.a(j2)) {
            long e2 = iVar.e();
            long f2 = iVar.f();
            if (Math.abs(e2 - j2) > 5000000) {
                this.f11255a.b(f2, e2, j2, j3);
            } else if (Math.abs(h(f2) - j3) > 5000000) {
                this.f11255a.a(f2, e2, j2, j3);
            } else {
                iVar.b();
                return;
            }
            iVar.a();
        }
    }

    private static boolean a(int i2) {
        return ai.f13525a < 23 && (i2 == 5 || i2 == 6);
    }

    private void e() {
        long h2 = h();
        if (h2 != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.m >= 30000) {
                long[] jArr = this.f11256b;
                int i2 = this.v;
                jArr[i2] = h2 - nanoTime;
                this.v = (i2 + 1) % 10;
                int i3 = this.w;
                if (i3 < 10) {
                    this.w = i3 + 1;
                }
                this.m = nanoTime;
                this.l = 0;
                int i4 = 0;
                while (true) {
                    int i5 = this.w;
                    if (i4 >= i5) {
                        break;
                    }
                    this.l += this.f11256b[i4] / ((long) i5);
                    i4++;
                }
            }
            if (!this.f11262h) {
                a(nanoTime, h2);
                g(nanoTime);
            }
        }
    }

    private void f() {
        this.l = 0;
        this.w = 0;
        this.v = 0;
        this.m = 0;
        this.C = 0;
        this.F = 0;
        this.k = false;
    }

    private void g(long j2) {
        Method method;
        if (this.q && (method = this.n) != null && j2 - this.r >= 500000) {
            try {
                long intValue = (((long) ((Integer) ai.a((Integer) method.invoke(com.applovin.exoplayer2.l.a.b(this.f11257c), new Object[0]))).intValue()) * 1000) - this.i;
                this.o = intValue;
                long max = Math.max(intValue, 0);
                this.o = max;
                if (max > 5000000) {
                    this.f11255a.b(max);
                    this.o = 0;
                }
            } catch (Exception unused) {
                this.n = null;
            }
            this.r = j2;
        }
    }

    private boolean g() {
        return this.f11262h && ((AudioTrack) com.applovin.exoplayer2.l.a.b(this.f11257c)).getPlayState() == 2 && i() == 0;
    }

    private long h() {
        return h(i());
    }

    private long h(long j2) {
        return (j2 * 1000000) / ((long) this.f11261g);
    }

    private long i() {
        AudioTrack audioTrack = (AudioTrack) com.applovin.exoplayer2.l.a.b(this.f11257c);
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, this.z + ((((SystemClock.elapsedRealtime() * 1000) - this.x) * ((long) this.f11261g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f11262h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.u = this.s;
            }
            playbackHeadPosition += this.u;
        }
        if (ai.f13525a <= 29) {
            if (playbackHeadPosition == 0 && this.s > 0 && playState == 3) {
                if (this.y == -9223372036854775807L) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = -9223372036854775807L;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }

    public long a(boolean z2) {
        long j2;
        if (((AudioTrack) com.applovin.exoplayer2.l.a.b(this.f11257c)).getPlayState() == 3) {
            e();
        }
        long nanoTime = System.nanoTime() / 1000;
        i iVar = (i) com.applovin.exoplayer2.l.a.b(this.f11260f);
        boolean c2 = iVar.c();
        if (c2) {
            j2 = h(iVar.f()) + ai.a(nanoTime - iVar.e(), this.j);
        } else {
            j2 = this.w == 0 ? h() : this.l + nanoTime;
            if (!z2) {
                j2 = Math.max(0, j2 - this.o);
            }
        }
        if (this.D != c2) {
            this.F = this.C;
            this.E = this.B;
        }
        long j3 = nanoTime - this.F;
        if (j3 < 1000000) {
            long j4 = (j3 * 1000) / 1000000;
            j2 = ((j2 * j4) + ((1000 - j4) * (this.E + ai.a(j3, this.j)))) / 1000;
        }
        if (!this.k) {
            long j5 = this.B;
            if (j2 > j5) {
                this.k = true;
                this.f11255a.a(System.currentTimeMillis() - h.a(ai.b(h.a(j2 - j5), this.j)));
            }
        }
        this.C = nanoTime;
        this.B = j2;
        this.D = c2;
        return j2;
    }

    public void a() {
        ((i) com.applovin.exoplayer2.l.a.b(this.f11260f)).d();
    }

    public void a(float f2) {
        this.j = f2;
        i iVar = this.f11260f;
        if (iVar != null) {
            iVar.d();
        }
    }

    public void a(AudioTrack audioTrack, boolean z2, int i2, int i3, int i4) {
        this.f11257c = audioTrack;
        this.f11258d = i3;
        this.f11259e = i4;
        this.f11260f = new i(audioTrack);
        this.f11261g = audioTrack.getSampleRate();
        this.f11262h = z2 && a(i2);
        boolean d2 = ai.d(i2);
        this.q = d2;
        this.i = d2 ? h((long) (i4 / i3)) : -9223372036854775807L;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.p = false;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.r = 0;
        this.o = 0;
        this.j = 1.0f;
    }

    public boolean a(long j2) {
        int playState = ((AudioTrack) com.applovin.exoplayer2.l.a.b(this.f11257c)).getPlayState();
        if (this.f11262h) {
            if (playState == 2) {
                this.p = false;
                return false;
            } else if (playState == 1 && i() == 0) {
                return false;
            }
        }
        boolean z2 = this.p;
        boolean f2 = f(j2);
        this.p = f2;
        if (z2 && !f2 && playState != 1) {
            this.f11255a.a(this.f11259e, h.a(this.i));
        }
        return true;
    }

    public int b(long j2) {
        return this.f11259e - ((int) (j2 - (i() * ((long) this.f11258d))));
    }

    public boolean b() {
        return ((AudioTrack) com.applovin.exoplayer2.l.a.b(this.f11257c)).getPlayState() == 3;
    }

    public long c(long j2) {
        return h.a(h(j2 - i()));
    }

    public boolean c() {
        f();
        if (this.x != -9223372036854775807L) {
            return false;
        }
        ((i) com.applovin.exoplayer2.l.a.b(this.f11260f)).d();
        return true;
    }

    public void d() {
        f();
        this.f11257c = null;
        this.f11260f = null;
    }

    public boolean d(long j2) {
        return this.y != -9223372036854775807L && j2 > 0 && SystemClock.elapsedRealtime() - this.y >= 200;
    }

    public void e(long j2) {
        this.z = i();
        this.x = SystemClock.elapsedRealtime() * 1000;
        this.A = j2;
    }

    public boolean f(long j2) {
        return j2 > i() || g();
    }
}
