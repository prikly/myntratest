package com.appodeal.ads.adapters.nast.native_ad;

import com.appodeal.ads.adapters.nast.NASTNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.UnifiedNativeParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;
import com.appodeal.ads.utils.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b extends UnifiedNative<NASTNetwork.RequestParams> {

    public static final class a extends UnifiedNativeAd {
        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Float f2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            super(str, str2, str3, str4, str5, f2);
            String str8 = str6;
            setClickUrl(str6);
            String str9 = str7;
            setVastVideoTag(str7);
            setImpressionNotifyUrls(arrayList);
            setClickNotifyUrls(arrayList2);
            setFinishNotifyUrls(arrayList3);
        }

        public static a a(String str) {
            JSONArray optJSONArray;
            JSONArray jSONArray;
            Float f2;
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("native");
                if (optJSONObject != null) {
                    jSONObject = optJSONObject;
                }
                JSONArray jSONArray2 = jSONObject.getJSONArray("assets");
                String str2 = "";
                String str3 = str2;
                String str4 = str3;
                String str5 = str4;
                String str6 = str5;
                String str7 = str6;
                int i = 0;
                Float f3 = null;
                while (i < jSONArray2.length()) {
                    JSONObject optJSONObject2 = jSONArray2.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        int i2 = optJSONObject2.getInt(OSOutcomeConstants.OUTCOME_ID);
                        if (i2 != 4) {
                            jSONArray = jSONArray2;
                            if (i2 == 7) {
                                f2 = f3;
                                double optDouble = optJSONObject2.getJSONObject("data").optDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE, 0.0d);
                                if (optDouble != 0.0d) {
                                    f3 = Float.valueOf((float) optDouble);
                                    i++;
                                    jSONArray2 = jSONArray;
                                }
                            } else if (i2 == 8) {
                                f2 = f3;
                                str4 = optJSONObject2.getJSONObject("data").optString(AppMeasurementSdk.ConditionalUserProperty.VALUE, "Learn more");
                            } else if (i2 != 123) {
                                f2 = f3;
                                if (i2 == 124) {
                                    JSONObject jSONObject2 = optJSONObject2.getJSONObject("img");
                                    if (jSONObject2 != null) {
                                        str6 = jSONObject2.getString("url");
                                    }
                                } else if (i2 == 127) {
                                    str3 = optJSONObject2.getJSONObject("data").optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                } else if (i2 == 128) {
                                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("img");
                                    if (optJSONObject3 != null) {
                                        str5 = optJSONObject3.optString("url");
                                    }
                                }
                            } else {
                                f2 = f3;
                                str2 = optJSONObject2.getJSONObject("title").getString("text");
                            }
                        } else {
                            jSONArray = jSONArray2;
                            f2 = f3;
                            JSONObject optJSONObject4 = optJSONObject2.optJSONObject("video");
                            if (optJSONObject4 != null) {
                                str7 = optJSONObject4.optString("vasttag");
                            }
                        }
                    } else {
                        jSONArray = jSONArray2;
                        f2 = f3;
                    }
                    f3 = f2;
                    i++;
                    jSONArray2 = jSONArray;
                }
                Float f4 = f3;
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("imptrackers");
                if (optJSONArray2 != null) {
                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                        arrayList.add(optJSONArray2.getString(i3));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                JSONObject jSONObject3 = jSONObject.getJSONObject("link");
                String string = jSONObject3.getString("url");
                JSONArray optJSONArray3 = jSONObject3.optJSONArray("clicktrackers");
                if (optJSONArray3 != null) {
                    for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                        arrayList2.add(optJSONArray3.getString(i4));
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                if (jSONObject.has("ext") && (optJSONArray = jSONObject.getJSONObject("ext").optJSONArray("finishtrackers")) != null) {
                    for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                        arrayList3.add(optJSONArray.getString(i5));
                    }
                }
                return new a(str2, str3, str4, str5, str6, string, str7, f4, arrayList, arrayList2, arrayList3);
            } catch (Exception e2) {
                Log.log(e2);
                return null;
            }
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        UnifiedNativeParams unifiedNativeParams = (UnifiedNativeParams) unifiedAdParams;
        NASTNetwork.RequestParams requestParams = (NASTNetwork.RequestParams) obj;
        UnifiedNativeCallback unifiedNativeCallback = (UnifiedNativeCallback) unifiedAdCallback;
        S2SAdTask.requestNast(contextProvider.getApplicationContext(), requestParams.url, requestParams.restrictedData, unifiedNativeCallback, new a(unifiedNativeCallback));
    }

    public final void onDestroy() {
    }
}
