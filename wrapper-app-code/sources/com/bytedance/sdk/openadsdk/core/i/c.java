package com.bytedance.sdk.openadsdk.core.i;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsConfiglInfo */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public String f1240a = "https://sf16-scmcdn-sg.ibytedtos.com/goofy/bytecom/resource/tetris/oversea_pi.01f77b3a.js";

    /* renamed from: b  reason: collision with root package name */
    public boolean f1241b = true;

    public c(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("performance_js");
            this.f1240a = optJSONObject.optString("url", "https://sf16-scmcdn-sg.ibytedtos.com/goofy/bytecom/resource/tetris/oversea_pi.01f77b3a.js");
            JSONArray optJSONArray = optJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
            }
            this.f1241b = arrayList.contains("load_finish");
        } catch (Exception unused) {
        }
    }
}
