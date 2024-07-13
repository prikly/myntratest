package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.g.d;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<j> f8757a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public j f8758b;

    /* renamed from: c  reason: collision with root package name */
    public d f8759c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f8760d;

    public i(d dVar) {
        this.f8759c = dVar;
    }

    public final j a() {
        Iterator<j> it = this.f8757a.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (next.f8763c) {
                return next;
            }
        }
        return this.f8758b;
    }

    public final j a(String str) {
        Iterator<j> it = this.f8757a.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (next.f8762b.equals(str)) {
                return next;
            }
        }
        return null;
    }

    public final String b() {
        JSONObject jSONObject = this.f8760d;
        return (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("adapterName"))) ? IronSourceConstants.SUPERSONIC_CONFIG_NAME : this.f8760d.optString("adapterName");
    }
}
