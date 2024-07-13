package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.l.e;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.util.ArrayList;
import java.util.List;

public final class g implements ad.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f12227a;

    /* renamed from: b  reason: collision with root package name */
    private final List<v> f12228b;

    public g() {
        this(0);
    }

    public g(int i) {
        this(i, s.g());
    }

    public g(int i, List<v> list) {
        this.f12227a = i;
        this.f12228b = list;
    }

    private z a(ad.b bVar) {
        return new z(c(bVar));
    }

    private boolean a(int i) {
        return (i & this.f12227a) != 0;
    }

    private af b(ad.b bVar) {
        return new af(c(bVar));
    }

    private List<v> c(ad.b bVar) {
        String str;
        int i;
        if (a(32)) {
            return this.f12228b;
        }
        y yVar = new y(bVar.f12183d);
        List<v> list = this.f12228b;
        while (yVar.a() > 0) {
            int h2 = yVar.h();
            int c2 = yVar.c() + yVar.h();
            if (h2 == 134) {
                list = new ArrayList<>();
                int h3 = yVar.h() & 31;
                for (int i2 = 0; i2 < h3; i2++) {
                    String f2 = yVar.f(3);
                    int h4 = yVar.h();
                    boolean z = true;
                    boolean z2 = (h4 & 128) != 0;
                    if (z2) {
                        i = h4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte h5 = (byte) yVar.h();
                    yVar.e(1);
                    List<byte[]> list2 = null;
                    if (z2) {
                        if ((h5 & 64) == 0) {
                            z = false;
                        }
                        list2 = e.a(z);
                    }
                    list.add(new v.a().f(str).c(f2).p(i).a(list2).a());
                }
            }
            yVar.d(c2);
        }
        return list;
    }

    public SparseArray<ad> a() {
        return new SparseArray<>();
    }

    public ad a(int i, ad.b bVar) {
        if (i == 2) {
            return new t(new k(b(bVar)));
        }
        if (i == 3 || i == 4) {
            return new t(new q(bVar.f12181b));
        }
        if (i == 21) {
            return new t(new o());
        }
        if (i != 27) {
            if (i == 36) {
                return new t(new n(a(bVar)));
            }
            if (i == 89) {
                return new t(new i(bVar.f12182c));
            }
            if (i != 138) {
                if (i == 172) {
                    return new t(new d(bVar.f12181b));
                }
                if (i == 257) {
                    return new y(new s("application/vnd.dvb.ait"));
                }
                if (i != 129) {
                    if (i != 130) {
                        if (i != 134) {
                            if (i != 135) {
                                switch (i) {
                                    case 15:
                                        if (a(2)) {
                                            return null;
                                        }
                                        return new t(new f(false, bVar.f12181b));
                                    case 16:
                                        return new t(new l(b(bVar)));
                                    case 17:
                                        if (a(2)) {
                                            return null;
                                        }
                                        return new t(new p(bVar.f12181b));
                                    default:
                                        return null;
                                }
                            }
                        } else if (a(16)) {
                            return null;
                        } else {
                            return new y(new s("application/x-scte35"));
                        }
                    } else if (!a(64)) {
                        return null;
                    }
                }
                return new t(new b(bVar.f12181b));
            }
            return new t(new h(bVar.f12181b));
        } else if (a(4)) {
            return null;
        } else {
            return new t(new m(a(bVar), a(1), a(8)));
        }
    }
}
