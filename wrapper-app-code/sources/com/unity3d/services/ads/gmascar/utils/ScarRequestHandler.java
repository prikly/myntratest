package com.unity3d.services.ads.gmascar.utils;

import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.request.WebRequest;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

public class ScarRequestHandler {
    public void makeUploadRequest(String str, BiddingSignals biddingSignals, String str2) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", Collections.singletonList("application/json"));
        WebRequest webRequest = new WebRequest(str2, "POST", hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(ScarConstants.IDFI_KEY, Device.getIdfi());
        hashMap2.put(ScarConstants.TOKEN_ID_KEY, str);
        hashMap2.putAll(biddingSignals.getMap());
        webRequest.setBody(new JSONObject(hashMap2).toString());
        webRequest.makeRequest();
    }
}
