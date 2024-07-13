package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.d.c;
import com.iab.omid.library.ironsrc.d.e;
import io.bidmachine.utils.IabUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7868a;

    /* renamed from: b  reason: collision with root package name */
    private final Float f7869b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7870c;

    /* renamed from: d  reason: collision with root package name */
    private final Position f7871d;

    private VastProperties(boolean z, Float f2, boolean z2, Position position) {
        this.f7868a = z;
        this.f7869b = f2;
        this.f7870c = z2;
        this.f7871d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        e.a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f2, boolean z, Position position) {
        e.a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f2), z, position);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f7868a);
            if (this.f7868a) {
                jSONObject.put(IabUtils.KEY_SKIP_OFFSET, this.f7869b);
            }
            jSONObject.put("autoPlay", this.f7870c);
            jSONObject.put("position", this.f7871d);
        } catch (JSONException e2) {
            c.a("VastProperties: JSON error", e2);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f7871d;
    }

    public final Float getSkipOffset() {
        return this.f7869b;
    }

    public final boolean isAutoPlay() {
        return this.f7870c;
    }

    public final boolean isSkippable() {
        return this.f7868a;
    }
}
