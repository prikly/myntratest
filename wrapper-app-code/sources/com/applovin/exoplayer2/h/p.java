package com.applovin.exoplayer2.h;

import android.os.Handler;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.k.aa;
import java.io.IOException;

public interface p {

    /* renamed from: com.applovin.exoplayer2.h.p$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static ba $default$h(p pVar) {
            return null;
        }

        public static boolean $default$i(p pVar) {
            return true;
        }
    }

    public static final class a extends o {
        public a(o oVar) {
            super(oVar);
        }

        public a(Object obj) {
            super(obj);
        }

        public a(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j);
        }

        public a(Object obj, long j, int i) {
            super(obj, j, i);
        }

        /* renamed from: b */
        public a a(Object obj) {
            return new a(super.a(obj));
        }
    }

    public interface b {
        void onSourceInfoRefreshed(p pVar, ba baVar);
    }

    void a(Handler handler, g gVar);

    void a(Handler handler, q qVar);

    void a(g gVar);

    void a(n nVar);

    void a(b bVar);

    void a(b bVar, aa aaVar);

    void a(q qVar);

    n b(a aVar, com.applovin.exoplayer2.k.b bVar, long j);

    void b(b bVar);

    void c(b bVar);

    void e() throws IOException;

    ab g();

    ba h();

    boolean i();
}
