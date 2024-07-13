package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface f {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f11227a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f11228a = new a(-1, -1, -1);

        /* renamed from: b  reason: collision with root package name */
        public final int f11229b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11230c;

        /* renamed from: d  reason: collision with root package name */
        public final int f11231d;

        /* renamed from: e  reason: collision with root package name */
        public final int f11232e;

        public a(int i, int i2, int i3) {
            this.f11229b = i;
            this.f11230c = i2;
            this.f11231d = i3;
            this.f11232e = ai.d(i3) ? ai.c(i3, i2) : -1;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f11229b + ", channelCount=" + this.f11230c + ", encoding=" + this.f11231d + ']';
        }
    }

    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    a a(a aVar) throws b;

    void a(ByteBuffer byteBuffer);

    boolean a();

    void b();

    ByteBuffer c();

    boolean d();

    void e();

    void f();
}
