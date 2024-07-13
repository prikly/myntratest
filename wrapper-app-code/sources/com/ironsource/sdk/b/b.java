package com.ironsource.sdk.b;

import android.os.Build;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.ironsource.environment.e.a;
import com.onesignal.outcomes.OSOutcomeConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public a f9017a;

    /* renamed from: b  reason: collision with root package name */
    public d f9018b = new d();

    /* renamed from: c  reason: collision with root package name */
    public WebView f9019c;

    /* renamed from: d  reason: collision with root package name */
    public String f9020d;

    /* renamed from: e  reason: collision with root package name */
    public String f9021e = b.class.getSimpleName();

    /* renamed from: f  reason: collision with root package name */
    private String[] f9022f = {"handleGetViewVisibility"};

    /* renamed from: g  reason: collision with root package name */
    private final String[] f9023g = {"loadWithUrl", "updateAd", "isExternalAdViewInitiated", "handleGetViewVisibility", "sendMessage"};

    private static String d(String str) {
        return String.format("window.ssa.onMessageReceived(%1$s)", new Object[]{str});
    }

    private void e(final String str) {
        final String str2 = "javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}";
        a.f8069a.a(new Runnable() {
            public final void run() {
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        b.this.f9019c.evaluateJavascript(str2, (ValueCallback) null);
                    } else {
                        b.this.f9019c.loadUrl(str2);
                    }
                } catch (Throwable unused) {
                    String a2 = b.this.f9021e;
                    Log.e(a2, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + str + "Android API level: " + Build.VERSION.SDK_INT);
                }
            }
        });
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("visibilityParams", this.f9018b.a());
            jSONObject.put("configs", jSONObject2);
            jSONObject.put("adViewId", this.f9020d);
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    public JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(OSOutcomeConstants.OUTCOME_ID, jSONObject.getString(OSOutcomeConstants.OUTCOME_ID));
            jSONObject2.put("data", this.f9018b.a());
        } catch (Exception e2) {
            String str = this.f9021e;
            Log.e(str, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            e2.printStackTrace();
        }
        return jSONObject2;
    }

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f9020d);
            a(str, jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public final void a(String str, int i, boolean z) {
        d dVar = this.f9018b;
        boolean z2 = true;
        if (dVar.f9029a.containsKey(str)) {
            dVar.f9029a.put(str, Boolean.valueOf(i == 0));
        }
        dVar.f9029a.put("isShown", Boolean.valueOf(z));
        if ((!dVar.f9029a.get("isWindowVisible").booleanValue() && !dVar.f9029a.get("isVisible").booleanValue()) || !dVar.f9029a.get("isShown").booleanValue()) {
            z2 = false;
        }
        dVar.f9029a.put("isViewVisible", Boolean.valueOf(z2));
        if ((Build.VERSION.SDK_INT <= 22 ? str.equalsIgnoreCase("isWindowVisible") : str.equalsIgnoreCase("isVisible")) && this.f9017a != null && this.f9018b != null) {
            a("containerIsVisible", a());
        }
    }

    public final void a(String str, String str2) {
        a aVar = this.f9017a;
        if (aVar != null) {
            aVar.a(str, str2, this.f9020d);
        }
    }

    public final void a(String str, String str2, String str3) {
        if (this.f9019c == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.f9021e, str4);
            this.f9017a.a(str3, str4, this.f9020d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException unused) {
            str = "\"" + str + "\"";
        }
        e(d(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f9020d);
        a(str2, jSONObject);
    }

    public final void a(String str, JSONObject jSONObject) {
        a aVar = this.f9017a;
        if (aVar != null) {
            aVar.a(str, jSONObject);
        }
    }

    public final void b(String str) {
        JSONObject a2 = this.f9018b.a();
        a2.put("adViewId", this.f9020d);
        a(str, a2);
    }

    public boolean c(String str) {
        for (String equalsIgnoreCase : this.f9022f) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
