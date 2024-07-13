package com.applovin.impl.sdk.ad;

import android.net.Uri;
import com.applovin.impl.adview.i;
import com.applovin.impl.sdk.a.c;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.onesignal.OSInAppMessageContentKt;
import io.bidmachine.utils.IabUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    private final String f15234a = b();

    /* renamed from: b  reason: collision with root package name */
    private final String f15235b = i();

    /* renamed from: c  reason: collision with root package name */
    private final String f15236c = aM();

    /* renamed from: d  reason: collision with root package name */
    private final c f15237d = new c(this);

    public a(JSONObject jSONObject, JSONObject jSONObject2, b bVar, n nVar) {
        super(jSONObject, jSONObject2, bVar, nVar);
    }

    private String aM() {
        return getStringFromAdObject("stream_url", "");
    }

    public void a() {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, OSInAppMessageContentKt.HTML, this.f15234a);
            JsonUtils.putString(this.adObject, "stream_url", this.f15236c);
        }
    }

    public void a(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    public void a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, OSInAppMessageContentKt.HTML, str);
        }
    }

    public String b() {
        String string;
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, OSInAppMessageContentKt.HTML, "");
        }
        return string;
    }

    /* renamed from: c */
    public c o() {
        return this.f15237d;
    }

    public String d() {
        return this.f15235b;
    }

    public String e() {
        return this.f15236c;
    }

    public boolean f() {
        return this.adObject.has("stream_url");
    }

    public void g() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    public JSONObject getOriginalFullResponse() {
        JSONObject deepCopy;
        synchronized (this.fullResponseLock) {
            deepCopy = JsonUtils.deepCopy(this.fullResponse);
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(deepCopy, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject, OSInAppMessageContentKt.HTML, this.f15234a);
            JsonUtils.putString(jSONObject, "video", this.f15235b);
            JsonUtils.putString(jSONObject, "stream_url", this.f15236c);
        }
        return deepCopy;
    }

    public Uri h() {
        String aM = aM();
        if (StringUtils.isValidString(aM)) {
            return Uri.parse(aM);
        }
        String i = i();
        if (StringUtils.isValidString(i)) {
            return Uri.parse(i);
        }
        return null;
    }

    public boolean hasVideoUrl() {
        return h() != null;
    }

    public String i() {
        return getStringFromAdObject("video", "");
    }

    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject(IabUtils.KEY_OM_SDK_ENABLED, false);
    }

    public Uri j() {
        String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public Uri k() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : j();
    }

    public float l() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    public boolean m() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", false);
        }
        return true;
    }

    public i.a n() {
        return a(getIntFromAdObject("expandable_style", i.a.INVISIBLE.a()));
    }
}
