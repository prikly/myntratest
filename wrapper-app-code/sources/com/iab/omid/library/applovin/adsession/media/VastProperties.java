package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import io.bidmachine.utils.IabUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7642a;

    /* renamed from: b  reason: collision with root package name */
    private final Float f7643b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7644c;

    /* renamed from: d  reason: collision with root package name */
    private final Position f7645d;

    private VastProperties(boolean z, Float f2, boolean z2, Position position) {
        this.f7642a = z;
        this.f7643b = f2;
        this.f7644c = z2;
        this.f7645d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        g.a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f2, boolean z, Position position) {
        g.a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f2), z, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f7642a);
            if (this.f7642a) {
                jSONObject.put(IabUtils.KEY_SKIP_OFFSET, this.f7643b);
            }
            jSONObject.put("autoPlay", this.f7644c);
            jSONObject.put("position", this.f7645d);
        } catch (JSONException e2) {
            d.a("VastProperties: JSON error", e2);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f7645d;
    }

    public Float getSkipOffset() {
        return this.f7643b;
    }

    public boolean isAutoPlay() {
        return this.f7644c;
    }

    public boolean isSkippable() {
        return this.f7642a;
    }
}
