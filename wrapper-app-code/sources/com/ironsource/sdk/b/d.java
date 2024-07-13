package com.ironsource.sdk.b;

import java.util.HashMap;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    HashMap<String, Boolean> f9029a = new HashMap<String, Boolean>() {
        {
            boolean z = true;
            put("isVisible", Boolean.valueOf(d.this.f9030b == 0));
            put("isWindowVisible", Boolean.valueOf(d.this.f9031c != 0 ? false : z));
            put("isShown", Boolean.FALSE);
            put("isViewVisible", Boolean.FALSE);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    int f9030b = 4;

    /* renamed from: c  reason: collision with root package name */
    int f9031c = 4;

    d() {
    }

    public final JSONObject a() {
        return new JSONObject(this.f9029a);
    }
}
