package com.applovin.exoplayer2.d;

import com.applovin.exoplayer2.c.b;
import com.applovin.exoplayer2.d.g;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

public interface f {

    /* renamed from: com.applovin.exoplayer2.d.f$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$d(f fVar) {
            return false;
        }

        public static void a(f fVar, f fVar2) {
            if (fVar != fVar2) {
                if (fVar2 != null) {
                    fVar2.a((g.a) null);
                }
                if (fVar != null) {
                    fVar.b((g.a) null);
                }
            }
        }
    }

    public static class a extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final int f11763a;

        public a(Throwable th, int i) {
            super(th);
            this.f11763a = i;
        }
    }

    void a(g.a aVar);

    boolean a(String str);

    void b(g.a aVar);

    int c();

    boolean d();

    a e();

    UUID f();

    b g();

    Map<String, String> h();
}
