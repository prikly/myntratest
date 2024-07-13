package com.applovin.impl.mediation.a;

import com.applovin.impl.mediation.g;
import com.applovin.impl.sdk.c.a;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

public class b extends e {
    private b(b bVar, g gVar) {
        super(bVar.aa(), bVar.Q(), bVar.P(), gVar, bVar.f14445b);
    }

    public b(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, n nVar) {
        super(map, jSONObject, jSONObject2, (g) null, nVar);
    }

    public int A() {
        int b2 = b("ad_view_height", -2);
        if (b2 != -2) {
            return b2;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public long B() {
        return b("viewability_imp_delay_ms", ((Long) this.f14445b.a(com.applovin.impl.sdk.c.b.bQ)).longValue());
    }

    public boolean C() {
        return D() >= 0;
    }

    public long D() {
        long b2 = b("ad_refresh_ms", -1);
        return b2 >= 0 ? b2 : a("ad_refresh_ms", ((Long) this.f14445b.a(a.l)).longValue());
    }

    public boolean E() {
        return b("proe", (Boolean) this.f14445b.a(a.K)).booleanValue();
    }

    public long F() {
        return Utils.parseColor(b("bg_color", (String) null));
    }

    public a a(g gVar) {
        return new b(this, gVar);
    }

    public int z() {
        int b2 = b("ad_view_width", -2);
        if (b2 != -2) {
            return b2;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }
}
