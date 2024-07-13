package com.iab.omid.library.adcolony.adsession.media;

import com.iab.omid.library.adcolony.d.c;
import com.iab.omid.library.adcolony.d.e;
import io.bidmachine.utils.IabUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7433a;

    /* renamed from: b  reason: collision with root package name */
    private final Float f7434b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7435c;

    /* renamed from: d  reason: collision with root package name */
    private final Position f7436d;

    private VastProperties(boolean z, Float f2, boolean z2, Position position) {
        this.f7433a = z;
        this.f7434b = f2;
        this.f7435c = z2;
        this.f7436d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        e.a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f2, boolean z, Position position) {
        e.a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f2), z, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f7433a);
            if (this.f7433a) {
                jSONObject.put(IabUtils.KEY_SKIP_OFFSET, this.f7434b);
            }
            jSONObject.put("autoPlay", this.f7435c);
            jSONObject.put("position", this.f7436d);
        } catch (JSONException e2) {
            c.a("VastProperties: JSON error", e2);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f7436d;
    }

    public Float getSkipOffset() {
        return this.f7434b;
    }

    public boolean isAutoPlay() {
        return this.f7435c;
    }

    public boolean isSkippable() {
        return this.f7433a;
    }
}
