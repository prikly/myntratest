package com.applovin.exoplayer2.m;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import io.bidmachine.BidMachineFetcher;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final e f13737a = new e();

    /* renamed from: b  reason: collision with root package name */
    private final b f13738b;

    /* renamed from: c  reason: collision with root package name */
    private final e f13739c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13740d;

    /* renamed from: e  reason: collision with root package name */
    private Surface f13741e;

    /* renamed from: f  reason: collision with root package name */
    private float f13742f;

    /* renamed from: g  reason: collision with root package name */
    private float f13743g;

    /* renamed from: h  reason: collision with root package name */
    private float f13744h;
    private float i;
    private int j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;

    private static final class a {
        public static void a(Surface surface, float f2) {
            try {
                surface.setFrameRate(f2, f2 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e2) {
                q.c("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
            }
        }
    }

    private interface b {

        public interface a {
            void onDefaultDisplayChanged(Display display);
        }

        void a();

        void a(a aVar);
    }

    private static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final WindowManager f13745a;

        private c(WindowManager windowManager) {
            this.f13745a = windowManager;
        }

        public static b a(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        public void a() {
        }

        public void a(b.a aVar) {
            aVar.onDefaultDisplayChanged(this.f13745a.getDefaultDisplay());
        }
    }

    private static final class d implements DisplayManager.DisplayListener, b {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayManager f13746a;

        /* renamed from: b  reason: collision with root package name */
        private b.a f13747b;

        private d(DisplayManager displayManager) {
            this.f13746a = displayManager;
        }

        public static b a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService(BidMachineFetcher.AD_TYPE_DISPLAY);
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        private Display b() {
            return this.f13746a.getDisplay(0);
        }

        public void a() {
            this.f13746a.unregisterDisplayListener(this);
            this.f13747b = null;
        }

        public void a(b.a aVar) {
            this.f13747b = aVar;
            this.f13746a.registerDisplayListener(this, ai.a());
            aVar.onDefaultDisplayChanged(b());
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            b.a aVar = this.f13747b;
            if (aVar != null && i == 0) {
                aVar.onDefaultDisplayChanged(b());
            }
        }

        public void onDisplayRemoved(int i) {
        }
    }

    private static final class e implements Handler.Callback, Choreographer.FrameCallback {

        /* renamed from: b  reason: collision with root package name */
        private static final e f13748b = new e();

        /* renamed from: a  reason: collision with root package name */
        public volatile long f13749a = -9223372036854775807L;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f13750c;

        /* renamed from: d  reason: collision with root package name */
        private final HandlerThread f13751d;

        /* renamed from: e  reason: collision with root package name */
        private Choreographer f13752e;

        /* renamed from: f  reason: collision with root package name */
        private int f13753f;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f13751d = handlerThread;
            handlerThread.start();
            Handler a2 = ai.a(this.f13751d.getLooper(), (Handler.Callback) this);
            this.f13750c = a2;
            a2.sendEmptyMessage(0);
        }

        public static e a() {
            return f13748b;
        }

        private void d() {
            this.f13752e = Choreographer.getInstance();
        }

        private void e() {
            int i = this.f13753f + 1;
            this.f13753f = i;
            if (i == 1) {
                ((Choreographer) com.applovin.exoplayer2.l.a.b(this.f13752e)).postFrameCallback(this);
            }
        }

        private void f() {
            int i = this.f13753f - 1;
            this.f13753f = i;
            if (i == 0) {
                ((Choreographer) com.applovin.exoplayer2.l.a.b(this.f13752e)).removeFrameCallback(this);
                this.f13749a = -9223372036854775807L;
            }
        }

        public void b() {
            this.f13750c.sendEmptyMessage(1);
        }

        public void c() {
            this.f13750c.sendEmptyMessage(2);
        }

        public void doFrame(long j) {
            this.f13749a = j;
            ((Choreographer) com.applovin.exoplayer2.l.a.b(this.f13752e)).postFrameCallbackDelayed(this, 500);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                d();
                return true;
            } else if (i == 1) {
                e();
                return true;
            } else if (i != 2) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public m(Context context) {
        b a2 = a(context);
        this.f13738b = a2;
        this.f13739c = a2 != null ? e.a() : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f13742f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    private static long a(long j2, long j3, long j4) {
        long j5;
        long j6 = j3 + (((j2 - j3) / j4) * j4);
        if (j2 <= j6) {
            j5 = j6 - j4;
        } else {
            long j7 = j6;
            j6 = j4 + j6;
            j5 = j7;
        }
        return j6 - j2 < j2 - j5 ? j6 : j5;
    }

    private static b a(Context context) {
        b bVar = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (ai.f13525a >= 17) {
            bVar = d.a(applicationContext);
        }
        return bVar == null ? c.a(applicationContext) : bVar;
    }

    /* access modifiers changed from: private */
    public void a(Display display) {
        long j2;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.k = refreshRate;
            j2 = (refreshRate * 80) / 100;
        } else {
            q.c("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j2 = -9223372036854775807L;
            this.k = -9223372036854775807L;
        }
        this.l = j2;
    }

    private void a(boolean z) {
        if (ai.f13525a >= 30 && this.f13741e != null && this.j != Integer.MIN_VALUE) {
            float f2 = 0.0f;
            if (this.f13740d) {
                float f3 = this.f13743g;
                if (f3 != -1.0f) {
                    f2 = this.i * f3;
                }
            }
            if (z || this.f13744h != f2) {
                this.f13744h = f2;
                a.a(this.f13741e, f2);
            }
        }
    }

    private static boolean a(long j2, long j3) {
        return Math.abs(j2 - j3) <= 20000000;
    }

    private void f() {
        this.m = 0;
        this.p = -1;
        this.n = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (java.lang.Math.abs(r0 - r8.f13743g) >= (r8.f13737a.b() && (r8.f13737a.d() > 5000000000L ? 1 : (r8.f13737a.d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        if (r8.f13737a.c() >= 30) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
            r8 = this;
            int r0 = com.applovin.exoplayer2.l.ai.f13525a
            r1 = 30
            if (r0 < r1) goto L_0x0073
            android.view.Surface r0 = r8.f13741e
            if (r0 != 0) goto L_0x000c
            goto L_0x0073
        L_0x000c:
            com.applovin.exoplayer2.m.e r0 = r8.f13737a
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x001b
            com.applovin.exoplayer2.m.e r0 = r8.f13737a
            float r0 = r0.f()
            goto L_0x001d
        L_0x001b:
            float r0 = r8.f13742f
        L_0x001d:
            float r2 = r8.f13743g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0024
            return
        L_0x0024:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            r5 = 1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0061
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0061
            com.applovin.exoplayer2.m.e r1 = r8.f13737a
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x0049
            com.applovin.exoplayer2.m.e r1 = r8.f13737a
            long r1 = r1.d()
            r6 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            if (r1 == 0) goto L_0x0050
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L_0x0052
        L_0x0050:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0052:
            float r2 = r8.f13743g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x005f
            goto L_0x006c
        L_0x005f:
            r5 = 0
            goto L_0x006c
        L_0x0061:
            if (r6 == 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            com.applovin.exoplayer2.m.e r2 = r8.f13737a
            int r2 = r2.c()
            if (r2 < r1) goto L_0x005f
        L_0x006c:
            if (r5 == 0) goto L_0x0073
            r8.f13743g = r0
            r8.a((boolean) r4)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.m.m.g():void");
    }

    private void h() {
        Surface surface;
        if (ai.f13525a >= 30 && (surface = this.f13741e) != null && this.j != Integer.MIN_VALUE && this.f13744h != 0.0f) {
            this.f13744h = 0.0f;
            a.a(surface, 0.0f);
        }
    }

    public void a() {
        if (this.f13738b != null) {
            ((e) com.applovin.exoplayer2.l.a.b(this.f13739c)).b();
            this.f13738b.a(new b.a() {
                public final void onDefaultDisplayChanged(Display display) {
                    m.this.a(display);
                }
            });
        }
    }

    public void a(float f2) {
        this.i = f2;
        f();
        a(false);
    }

    public void a(int i2) {
        if (this.j != i2) {
            this.j = i2;
            a(true);
        }
    }

    public void a(long j2) {
        long j3 = this.n;
        if (j3 != -1) {
            this.p = j3;
            this.q = this.o;
        }
        this.m++;
        this.f13737a.a(j2 * 1000);
        g();
    }

    public void a(Surface surface) {
        if (surface instanceof d) {
            surface = null;
        }
        if (this.f13741e != surface) {
            h();
            this.f13741e = surface;
            a(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long b(long r11) {
        /*
            r10 = this;
            long r0 = r10.p
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0030
            com.applovin.exoplayer2.m.e r0 = r10.f13737a
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0030
            com.applovin.exoplayer2.m.e r0 = r10.f13737a
            long r0 = r0.e()
            long r2 = r10.q
            long r4 = r10.m
            long r6 = r10.p
            long r4 = r4 - r6
            long r0 = r0 * r4
            float r0 = (float) r0
            float r1 = r10.i
            float r0 = r0 / r1
            long r0 = (long) r0
            long r2 = r2 + r0
            boolean r0 = a(r11, r2)
            if (r0 == 0) goto L_0x002d
            r4 = r2
            goto L_0x0031
        L_0x002d:
            r10.f()
        L_0x0030:
            r4 = r11
        L_0x0031:
            long r11 = r10.m
            r10.n = r11
            r10.o = r4
            com.applovin.exoplayer2.m.m$e r11 = r10.f13739c
            if (r11 == 0) goto L_0x0058
            long r0 = r10.k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0047
            goto L_0x0058
        L_0x0047:
            long r6 = r11.f13749a
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x004e
            return r4
        L_0x004e:
            long r8 = r10.k
            long r11 = a(r4, r6, r8)
            long r0 = r10.l
            long r11 = r11 - r0
            return r11
        L_0x0058:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.m.m.b(long):long");
    }

    public void b() {
        this.f13740d = true;
        f();
        a(false);
    }

    public void b(float f2) {
        this.f13742f = f2;
        this.f13737a.a();
        g();
    }

    public void c() {
        f();
    }

    public void d() {
        this.f13740d = false;
        h();
    }

    public void e() {
        b bVar = this.f13738b;
        if (bVar != null) {
            bVar.a();
            ((e) com.applovin.exoplayer2.l.a.b(this.f13739c)).c();
        }
    }
}
