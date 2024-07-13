package com.applovin.mediation.hybridAds;

import android.graphics.Color;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f16008a;

    public c(JSONObject jSONObject) {
        this.f16008a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public int a() {
        String string = JsonUtils.getString(this.f16008a, "background_color", (String) null);
        if (string != null) {
            return Color.parseColor(string);
        }
        return -16777216;
    }

    public int b() {
        return JsonUtils.getInt(this.f16008a, "close_button_top_margin", 20);
    }

    public int c() {
        return JsonUtils.getInt(this.f16008a, "close_button_h_margin", 5);
    }

    public int d() {
        return JsonUtils.getInt(this.f16008a, "close_button_size", 30);
    }

    public int e() {
        return JsonUtils.getInt(this.f16008a, "close_button_extended_touch_area_size", 10);
    }

    public long f() {
        return JsonUtils.getLong(this.f16008a, "close_button_delay_ms", 3000);
    }
}
