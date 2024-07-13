package com.appodeal.ads.segments;

import com.appodeal.ads.h0;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;

public final class q {
    public static final void a(k kVar) {
        StringBuilder a2 = h0.a("matched segment #");
        a2.append(kVar.f17272a);
        a2.append(" (default - ");
        a2.append(kVar.f17272a == -1);
        a2.append("): ");
        a2.append(kVar.f17273b.f17277a);
        Log.log("Segment", LogConstants.EVENT_SET, a2.toString());
    }
}
