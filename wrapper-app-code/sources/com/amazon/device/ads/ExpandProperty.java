package com.amazon.device.ads;

import io.bidmachine.utils.IabUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MraidProperty */
class ExpandProperty extends MraidProperty {
    int height;
    int width;

    /* access modifiers changed from: package-private */
    public void formJSON(JSONObject jSONObject) throws JSONException {
    }

    ExpandProperty(JSONObject jSONObject) throws JSONException {
        super("expandProperty");
        this.width = jSONObject.getInt(IabUtils.KEY_WIDTH);
        this.height = jSONObject.getInt(IabUtils.KEY_HEIGHT);
    }
}
