package com.applovin.impl.mediation.a;

import com.applovin.impl.mediation.g;
import com.applovin.impl.sdk.c.a;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.n;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

public abstract class e extends a {
    protected e(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, g gVar, n nVar) {
        super(map, jSONObject, jSONObject2, gVar, nVar);
    }

    public int H() {
        MaxAdFormat format = getFormat();
        b bVar = format == MaxAdFormat.BANNER ? b.bR : format == MaxAdFormat.MREC ? b.bT : format == MaxAdFormat.LEADER ? b.bV : format == MaxAdFormat.NATIVE ? b.bX : null;
        if (bVar != null) {
            return b("viewability_min_width", ((Integer) this.f14445b.a(bVar)).intValue());
        }
        return 0;
    }

    public int I() {
        MaxAdFormat format = getFormat();
        b bVar = format == MaxAdFormat.BANNER ? b.bS : format == MaxAdFormat.MREC ? b.bU : format == MaxAdFormat.LEADER ? b.bW : format == MaxAdFormat.NATIVE ? b.bY : null;
        if (bVar != null) {
            return b("viewability_min_height", ((Integer) this.f14445b.a(bVar)).intValue());
        }
        return 0;
    }

    public float J() {
        return a("viewability_min_alpha", ((Float) this.f14445b.a(a.bZ)).floatValue() / 100.0f);
    }

    public int K() {
        return b("viewability_min_pixels", -1);
    }

    public float L() {
        return a("viewability_min_percentage_dp", -1.0f);
    }

    public float M() {
        return a("viewability_min_percentage_pixels", -1.0f);
    }

    public boolean N() {
        return K() >= 0 || L() >= 0.0f || M() >= 0.0f;
    }

    public long O() {
        return b("viewability_timer_min_visible_ms", ((Long) this.f14445b.a(a.ca)).longValue());
    }
}
