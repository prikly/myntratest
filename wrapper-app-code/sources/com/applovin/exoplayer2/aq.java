package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.g;

public abstract class aq implements g {

    /* renamed from: b  reason: collision with root package name */
    public static final g.a<aq> f11137b = $$Lambda$aq$qZViowqSCNIjMqRs0PhWhJpxTM.INSTANCE;

    aq() {
    }

    /* access modifiers changed from: private */
    public static aq a(Bundle bundle) {
        g.a aVar;
        int i = bundle.getInt(a(0), -1);
        if (i == 0) {
            aVar = x.f13940a;
        } else if (i == 1) {
            aVar = aj.f11094a;
        } else if (i == 2) {
            aVar = ax.f11167a;
        } else if (i == 3) {
            aVar = az.f11179a;
        } else {
            throw new IllegalArgumentException("Encountered unknown rating type: " + i);
        }
        return (aq) aVar.fromBundle(bundle);
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
