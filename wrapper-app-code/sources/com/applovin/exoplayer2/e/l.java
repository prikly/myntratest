package com.applovin.exoplayer2.e;

import android.net.Uri;
import java.util.List;
import java.util.Map;

public interface l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f12427a = $$Lambda$l$iyaaezwHWbqFAGupskI9Uc5Ld1o.INSTANCE;

    /* renamed from: com.applovin.exoplayer2.e.l$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static h[] $default$a(l lVar, Uri uri, Map map) {
            return lVar.createExtractors();
        }

        public static /* synthetic */ h[] a() {
            return new h[0];
        }
    }

    h[] a(Uri uri, Map<String, List<String>> map);

    h[] createExtractors();
}
