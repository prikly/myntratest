package com.ironsource.mediationsdk.server;

import com.appodeal.ads.adapters.admob.BuildConfig;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f8873a;

    /* renamed from: b  reason: collision with root package name */
    private String f8874b;

    /* renamed from: c  reason: collision with root package name */
    private String f8875c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f8876d;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f8877e;

    /* renamed from: f  reason: collision with root package name */
    private List<String> f8878f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8879g;

    /* renamed from: h  reason: collision with root package name */
    private ImpressionData f8880h;

    public b(String str) {
        this.f8873a = str;
        this.f8874b = "";
        this.f8875c = "";
        this.f8876d = new ArrayList();
        this.f8877e = new ArrayList();
        this.f8878f = new ArrayList();
        this.f8879g = true;
        this.f8880h = null;
    }

    public b(JSONObject jSONObject) {
        this(jSONObject, (JSONObject) null);
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f8879g = false;
        try {
            if (jSONObject.has("instance")) {
                this.f8873a = jSONObject.getString("instance");
            }
            this.f8874b = jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : jSONObject.has("serverData") ? jSONObject.getString("serverData") : "";
            this.f8875c = jSONObject.has(InAppPurchaseMetaData.KEY_PRICE) ? jSONObject.getString(InAppPurchaseMetaData.KEY_PRICE) : BuildConfig.ADAPTER_VERSION;
            this.f8876d = new ArrayList();
            this.f8877e = new ArrayList();
            this.f8878f = new ArrayList();
            if (jSONObject.has("notifications")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("notifications");
                if (optJSONObject.has("burl")) {
                    JSONArray jSONArray = optJSONObject.getJSONArray("burl");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        this.f8876d.add(jSONArray.getString(i));
                    }
                }
                if (optJSONObject.has("lurl")) {
                    JSONArray jSONArray2 = optJSONObject.getJSONArray("lurl");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        this.f8877e.add(jSONArray2.getString(i2));
                    }
                }
                if (optJSONObject.has("nurl")) {
                    JSONArray jSONArray3 = optJSONObject.getJSONArray("nurl");
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        this.f8878f.add(jSONArray3.getString(i3));
                    }
                }
            }
            this.f8880h = new ImpressionData(com.ironsource.mediationsdk.c.b.a(jSONObject2, jSONObject.has("armData") ? jSONObject.optJSONObject("armData") : null));
            this.f8879g = true;
        } catch (Exception unused) {
        }
    }

    public ImpressionData a(String str) {
        ImpressionData impressionData = this.f8880h;
        if (impressionData != null) {
            impressionData.replaceMacroForPlacementWithValue("${PLACEMENT_NAME}", str);
        }
        return this.f8880h;
    }

    public String a() {
        return this.f8873a;
    }

    public String b() {
        return this.f8874b;
    }

    public String c() {
        return this.f8875c;
    }

    public List<String> d() {
        return this.f8876d;
    }

    public List<String> e() {
        return this.f8877e;
    }

    public List<String> f() {
        return this.f8878f;
    }

    public boolean g() {
        return this.f8879g;
    }
}
