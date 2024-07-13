package com.applovin.exoplayer2.k;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public interface i extends g {

    /* renamed from: com.applovin.exoplayer2.k.i$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Map $default$b(i iVar) {
            return Collections.emptyMap();
        }
    }

    public interface a {
        i a();
    }

    long a(l lVar) throws IOException;

    Uri a();

    void a(aa aaVar);

    Map<String, List<String>> b();

    void c() throws IOException;
}
