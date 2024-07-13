package com.bytedance.sdk.openadsdk.f.a;

import com.bytedance.sdk.component.a.f;
import com.bytedance.sdk.component.a.r;
import com.bytedance.sdk.openadsdk.core.w;
import org.json.JSONObject;

/* compiled from: OldBridgeSyncMethod */
public class e extends com.bytedance.sdk.component.a.e<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private String f1923a;

    /* renamed from: b  reason: collision with root package name */
    private w f1924b;

    public e(String str, w wVar) {
        this.f1924b = wVar;
        this.f1923a = str;
    }

    public static void a(r rVar, w wVar) {
        rVar.a("appInfo", (com.bytedance.sdk.component.a.e<?, ?>) new e("appInfo", wVar));
        rVar.a("adInfo", (com.bytedance.sdk.component.a.e<?, ?>) new e("adInfo", wVar));
        rVar.a("sendLog", (com.bytedance.sdk.component.a.e<?, ?>) new e("sendLog", wVar));
        rVar.a("playable_style", (com.bytedance.sdk.component.a.e<?, ?>) new e("playable_style", wVar));
        rVar.a("getTemplateInfo", (com.bytedance.sdk.component.a.e<?, ?>) new e("getTemplateInfo", wVar));
        rVar.a("getTeMaiAds", (com.bytedance.sdk.component.a.e<?, ?>) new e("getTeMaiAds", wVar));
        rVar.a("isViewable", (com.bytedance.sdk.component.a.e<?, ?>) new e("isViewable", wVar));
        rVar.a("getScreenSize", (com.bytedance.sdk.component.a.e<?, ?>) new e("getScreenSize", wVar));
        rVar.a("getCloseButtonInfo", (com.bytedance.sdk.component.a.e<?, ?>) new e("getCloseButtonInfo", wVar));
        rVar.a("getVolume", (com.bytedance.sdk.component.a.e<?, ?>) new e("getVolume", wVar));
        rVar.a("removeLoading", (com.bytedance.sdk.component.a.e<?, ?>) new e("removeLoading", wVar));
        rVar.a("sendReward", (com.bytedance.sdk.component.a.e<?, ?>) new e("sendReward", wVar));
        rVar.a("subscribe_app_ad", (com.bytedance.sdk.component.a.e<?, ?>) new e("subscribe_app_ad", wVar));
        rVar.a("download_app_ad", (com.bytedance.sdk.component.a.e<?, ?>) new e("download_app_ad", wVar));
        rVar.a("cancel_download_app_ad", (com.bytedance.sdk.component.a.e<?, ?>) new e("cancel_download_app_ad", wVar));
        rVar.a("unsubscribe_app_ad", (com.bytedance.sdk.component.a.e<?, ?>) new e("unsubscribe_app_ad", wVar));
        rVar.a("landscape_click", (com.bytedance.sdk.component.a.e<?, ?>) new e("landscape_click", wVar));
        rVar.a("clickEvent", (com.bytedance.sdk.component.a.e<?, ?>) new e("clickEvent", wVar));
        rVar.a("renderDidFinish", (com.bytedance.sdk.component.a.e<?, ?>) new e("renderDidFinish", wVar));
        rVar.a("dynamicTrack", (com.bytedance.sdk.component.a.e<?, ?>) new e("dynamicTrack", wVar));
        rVar.a("skipVideo", (com.bytedance.sdk.component.a.e<?, ?>) new e("skipVideo", wVar));
        rVar.a("muteVideo", (com.bytedance.sdk.component.a.e<?, ?>) new e("muteVideo", wVar));
        rVar.a("changeVideoState", (com.bytedance.sdk.component.a.e<?, ?>) new e("changeVideoState", wVar));
        rVar.a("getCurrentVideoState", (com.bytedance.sdk.component.a.e<?, ?>) new e("getCurrentVideoState", wVar));
        rVar.a("send_temai_product_ids", (com.bytedance.sdk.component.a.e<?, ?>) new e("send_temai_product_ids", wVar));
        rVar.a("getMaterialMeta", (com.bytedance.sdk.component.a.e<?, ?>) new e("getMaterialMeta", wVar));
        rVar.a("endcard_load", (com.bytedance.sdk.component.a.e<?, ?>) new e("endcard_load", wVar));
        rVar.a("pauseWebView", (com.bytedance.sdk.component.a.e<?, ?>) new e("pauseWebView", wVar));
        rVar.a("pauseWebViewTimers", (com.bytedance.sdk.component.a.e<?, ?>) new e("pauseWebViewTimers", wVar));
        rVar.a("webview_time_track", (com.bytedance.sdk.component.a.e<?, ?>) new e("webview_time_track", wVar));
        rVar.a("openPrivacy", (com.bytedance.sdk.component.a.e<?, ?>) new e("openPrivacy", wVar));
        rVar.a("openAdLandPageLinks", (com.bytedance.sdk.component.a.e<?, ?>) new e("openAdLandPageLinks", wVar));
        rVar.a("getNativeSiteCustomData", (com.bytedance.sdk.component.a.e<?, ?>) new e("getNativeSiteCustomData", wVar));
        rVar.a("close", (com.bytedance.sdk.component.a.e<?, ?>) new e("close", wVar));
    }

    public JSONObject a(JSONObject jSONObject, f fVar) throws Exception {
        while (true) {
            char c2 = '^';
            char c3 = '}';
            while (true) {
                switch (c2) {
                    case '^':
                        break;
                    case '_':
                        switch (c3) {
                            case '^':
                            case '`':
                                break;
                            case '_':
                                w.a aVar = new w.a();
                                aVar.f1718a = "call";
                                aVar.f1720c = this.f1923a;
                                aVar.f1721d = jSONObject;
                                return this.f1924b.a(aVar, 3);
                        }
                    case '`':
                        switch (c3) {
                            case '7':
                            case '8':
                            case '9':
                                continue;
                        }
                }
                c2 = '_';
                c3 = '_';
            }
        }
    }
}
