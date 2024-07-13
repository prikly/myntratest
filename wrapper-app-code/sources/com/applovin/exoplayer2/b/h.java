package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.v;
import java.nio.ByteBuffer;

public interface h {

    public static final class a extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final v f11235a;

        public a(String str, v vVar) {
            super(str);
            this.f11235a = vVar;
        }

        public a(Throwable th, v vVar) {
            super(th);
            this.f11235a = vVar;
        }
    }

    public static final class b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final int f11236a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f11237b;

        /* renamed from: c  reason: collision with root package name */
        public final v f11238c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(int r3, int r4, int r5, int r6, com.applovin.exoplayer2.v r7, boolean r8, java.lang.Exception r9) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = "Config("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = ")"
                r0.append(r4)
                if (r8 == 0) goto L_0x0032
                java.lang.String r4 = " (recoverable)"
                goto L_0x0034
            L_0x0032:
                java.lang.String r4 = ""
            L_0x0034:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4, r9)
                r2.f11236a = r3
                r2.f11237b = r8
                r2.f11238c = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.b.h.b.<init>(int, int, int, int, com.applovin.exoplayer2.v, boolean, java.lang.Exception):void");
        }
    }

    public interface c {

        /* renamed from: com.applovin.exoplayer2.b.h$c$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(c cVar, long j) {
            }

            public static void $default$a(c cVar, Exception exc) {
            }

            public static void $default$b(c cVar) {
            }

            public static void $default$b(c cVar, long j) {
            }
        }

        void a();

        void a(int i, long j, long j2);

        void a(long j);

        void a(Exception exc);

        void a(boolean z);

        void b();

        void b(long j);
    }

    public static final class d extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final long f11239a;

        /* renamed from: b  reason: collision with root package name */
        public final long f11240b;

        public d(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.f11239a = j;
            this.f11240b = j2;
        }
    }

    public static final class e extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final int f11241a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f11242b;

        /* renamed from: c  reason: collision with root package name */
        public final v f11243c;

        public e(int i, v vVar, boolean z) {
            super("AudioTrack write failed: " + i);
            this.f11242b = z;
            this.f11241a = i;
            this.f11243c = vVar;
        }
    }

    long a(boolean z);

    void a();

    void a(float f2);

    void a(int i);

    void a(am amVar);

    void a(d dVar);

    void a(c cVar);

    void a(k kVar);

    void a(v vVar, int i, int[] iArr) throws a;

    boolean a(v vVar);

    boolean a(ByteBuffer byteBuffer, long j, int i) throws b, e;

    int b(v vVar);

    void b();

    void b(boolean z);

    void c() throws e;

    boolean d();

    boolean e();

    am f();

    void g();

    void h();

    void i();

    void j();

    void k();

    void l();
}
