package com.applovin.exoplayer2.g;

import com.applovin.exoplayer2.g.b.b;
import com.applovin.exoplayer2.g.d.a;
import com.applovin.exoplayer2.g.e.g;
import com.applovin.exoplayer2.v;

public interface c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f12591a = new c() {
        public boolean a(v vVar) {
            String str = vVar.l;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        public b b(v vVar) {
            String str = vVar.l;
            if (str != null) {
                char c2 = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    return new g();
                }
                if (c2 == 1) {
                    return new b();
                }
                if (c2 == 2) {
                    return new com.applovin.exoplayer2.g.g.c();
                }
                if (c2 == 3) {
                    return new a();
                }
                if (c2 == 4) {
                    return new com.applovin.exoplayer2.g.a.b();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    };

    boolean a(v vVar);

    b b(v vVar);
}
