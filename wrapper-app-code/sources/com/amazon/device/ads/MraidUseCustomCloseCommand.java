package com.amazon.device.ads;

import com.unity3d.services.core.request.metrics.AdOperationMetric;
import org.json.JSONException;
import org.json.JSONObject;

public class MraidUseCustomCloseCommand extends MraidCommand {
    static final String NAME = "useCustomClose";

    static String getMraidName() {
        return NAME;
    }

    public String getName() {
        return NAME;
    }

    /* access modifiers changed from: package-private */
    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) throws JSONException {
        dTBAdMRAIDController.setUseCustomClose(jSONObject.getBoolean(AdOperationMetric.INIT_STATE));
    }
}
