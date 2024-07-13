package com.applovin.impl.mediation.debugger.b.c;

import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.e;
import com.applovin.impl.sdk.utils.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14727a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14728b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14729c;

    /* renamed from: d  reason: collision with root package name */
    private final String f14730d;

    public c(JSONObject jSONObject, n nVar) {
        this.f14727a = e.a(nVar.P()).a();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "cleartext_traffic", (JSONObject) null);
        boolean z = false;
        if (jSONObject2 != null) {
            this.f14728b = true;
            this.f14730d = JsonUtils.getString(jSONObject2, "description", "");
            if (i.a()) {
                this.f14729c = true;
                return;
            }
            List list = JsonUtils.getList(jSONObject2, "domains", new ArrayList());
            if (list.size() > 0) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!i.a((String) it.next())) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            this.f14729c = z;
            return;
        }
        this.f14728b = false;
        this.f14730d = "";
        this.f14729c = i.a();
    }

    public boolean a() {
        return this.f14728b;
    }

    public boolean b() {
        boolean z = this.f14729c;
        return z && (this.f14727a || z);
    }

    public String c() {
        return this.f14727a ? this.f14730d : "You must include an entry in your AndroidManifest.xml to point to your network_security_config.xml.\n\nFor more information, visit: https://developer.android.com/training/articles/security-config";
    }
}
