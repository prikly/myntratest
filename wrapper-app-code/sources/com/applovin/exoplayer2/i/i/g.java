package com.applovin.exoplayer2.i.i;

import android.text.TextUtils;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.List;

public final class g extends d {

    /* renamed from: a  reason: collision with root package name */
    private final y f13194a = new y();

    /* renamed from: b  reason: collision with root package name */
    private final c f13195b = new c();

    public g() {
        super("WebvttDecoder");
    }

    private static int a(y yVar) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = yVar.c();
            String C = yVar.C();
            i = C == null ? 0 : "STYLE".equals(C) ? 2 : C.startsWith("NOTE") ? 1 : 3;
        }
        yVar.d(i2);
        return i;
    }

    private static void b(y yVar) {
        do {
        } while (!TextUtils.isEmpty(yVar.C()));
    }

    /* access modifiers changed from: protected */
    public f a(byte[] bArr, int i, boolean z) throws h {
        e a2;
        this.f13194a.a(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            h.a(this.f13194a);
            do {
            } while (!TextUtils.isEmpty(this.f13194a.C()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int a3 = a(this.f13194a);
                if (a3 == 0) {
                    return new i(arrayList2);
                }
                if (a3 == 1) {
                    b(this.f13194a);
                } else if (a3 == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f13194a.C();
                        arrayList.addAll(this.f13195b.a(this.f13194a));
                    } else {
                        throw new h("A style block was found after the first cue.");
                    }
                } else if (a3 == 3 && (a2 = f.a(this.f13194a, (List<d>) arrayList)) != null) {
                    arrayList2.add(a2);
                }
            }
        } catch (ai e2) {
            throw new h((Throwable) e2);
        }
    }
}
