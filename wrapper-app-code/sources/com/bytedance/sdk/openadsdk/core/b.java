package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.e.c;
import com.bytedance.sdk.openadsdk.core.e.f;
import com.bytedance.sdk.openadsdk.core.e.h;
import com.bytedance.sdk.openadsdk.core.e.i;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.core.e.m;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.o;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.j.a.a.d;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.onesignal.OneSignalDbContract;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import io.bidmachine.utils.IabUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdInfoFactory */
public class b {
    private static int a(com.bykv.vk.openvk.component.video.api.c.b bVar, boolean z) {
        if (bVar == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(bVar.i())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z || !TextUtils.isEmpty(bVar.h())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    private static int a(c cVar) {
        if (cVar == null) {
            return TTAdConstant.DOWNLOAD_APP_INFO_CODE;
        }
        if (TextUtils.isEmpty(cVar.a())) {
            return TTAdConstant.DOWNLOAD_URL_CODE;
        }
        return 200;
    }

    private static int a(h hVar) {
        if (hVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(hVar.a())) {
            return TTAdConstant.DEEPLINK_UNAVAILABLE_CODE;
        }
        if (TextUtils.isEmpty(hVar.b())) {
            return TTAdConstant.DEEPLINK_FALLBACK_CODE;
        }
        if (hVar.c() == 1 || hVar.c() == 2) {
            return 200;
        }
        return TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0095, code lost:
        if (r0 != 50) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(com.bytedance.sdk.openadsdk.core.e.n r6) {
        /*
            r0 = 401(0x191, float:5.62E-43)
            if (r6 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.String r1 = r6.Y()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00b2
            java.lang.String r1 = r6.Y()
            int r1 = r1.length()
            r2 = 1
            if (r1 > r2) goto L_0x001e
            goto L_0x00b2
        L_0x001e:
            com.bytedance.sdk.openadsdk.core.e.h r1 = r6.ab()
            int r1 = a((com.bytedance.sdk.openadsdk.core.e.h) r1)
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L_0x002b
            return r1
        L_0x002b:
            boolean r3 = r6.ay()
            if (r3 == 0) goto L_0x004a
            java.lang.String r3 = r6.az()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x004a
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.m.a()
            r2 = 0
            java.lang.String r3 = "banner_ad"
            java.lang.String r4 = "load_html_fail"
            com.bytedance.sdk.openadsdk.b.e.b((android.content.Context) r1, (com.bytedance.sdk.openadsdk.core.e.n) r6, (java.lang.String) r3, (java.lang.String) r4, (org.json.JSONObject) r2)
            return r0
        L_0x004a:
            int r0 = r6.L()
            r3 = 4
            r4 = 3
            r5 = 2
            if (r0 == r5) goto L_0x0063
            if (r0 == r4) goto L_0x0063
            if (r0 == r3) goto L_0x0058
            goto L_0x0078
        L_0x0058:
            com.bytedance.sdk.openadsdk.core.e.c r0 = r6.aa()
            int r1 = a((com.bytedance.sdk.openadsdk.core.e.c) r0)
            if (r1 == r2) goto L_0x0078
            return r1
        L_0x0063:
            boolean r0 = b((com.bytedance.sdk.openadsdk.core.e.n) r6)
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = r6.O()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0078
            r6 = 406(0x196, float:5.69E-43)
            return r6
        L_0x0078:
            boolean r0 = r6.aw()
            if (r0 != 0) goto L_0x00b1
            int r0 = r6.ad()
            if (r0 == r5) goto L_0x00a7
            if (r0 == r4) goto L_0x00a7
            if (r0 == r3) goto L_0x00a7
            r3 = 5
            if (r0 == r3) goto L_0x0098
            r3 = 15
            if (r0 == r3) goto L_0x0098
            r3 = 16
            if (r0 == r3) goto L_0x00a7
            r3 = 50
            if (r0 == r3) goto L_0x0098
            goto L_0x00b1
        L_0x0098:
            com.bykv.vk.openvk.component.video.api.c.b r0 = r6.J()
            boolean r6 = r6.aw()
            int r1 = a((com.bykv.vk.openvk.component.video.api.c.b) r0, (boolean) r6)
            if (r1 == r2) goto L_0x00b1
            return r1
        L_0x00a7:
            java.util.List r6 = r6.P()
            int r1 = a((java.util.List<com.bytedance.sdk.openadsdk.core.e.k>) r6)
            if (r1 == r2) goto L_0x00b1
        L_0x00b1:
            return r1
        L_0x00b2:
            r6 = 402(0x192, float:5.63E-43)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.b.a(com.bytedance.sdk.openadsdk.core.e.n):int");
    }

    private static int a(List<k> list) {
        if (list == null) {
            return TTAdConstant.IMAGE_LIST_CODE;
        }
        if (list.size() <= 0) {
            return TTAdConstant.IMAGE_LIST_SIZE_CODE;
        }
        for (k next : list) {
            if (next == null) {
                return TTAdConstant.IMAGE_CODE;
            }
            if (TextUtils.isEmpty(next.a())) {
                return TTAdConstant.IMAGE_URL_CODE;
            }
        }
        return 200;
    }

    public static Pair<com.bytedance.sdk.openadsdk.core.e.a, ArrayList<Integer>> a(JSONObject jSONObject, AdSlot adSlot, o oVar) {
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.e.a aVar = new com.bytedance.sdk.openadsdk.core.e.a();
            aVar.a(jSONObject.optString("request_id"));
            aVar.a(jSONObject.optInt("ret"));
            aVar.b(jSONObject.optString(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE));
            String optString = jSONObject.optString("auction_price");
            if (aVar.a() != 0) {
                return null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    n b2 = b(optJSONArray.optJSONObject(i), adSlot, oVar);
                    int a2 = a(b2);
                    if (a2 != 200) {
                        arrayList.add(Integer.valueOf(a2));
                    } else {
                        b2.c(optString);
                        aVar.a(b2);
                    }
                }
            }
            return new Pair<>(aVar, arrayList);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static n a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return b(jSONObject, (AdSlot) null, (o) null);
    }

    private static com.bytedance.sdk.openadsdk.core.j.a a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int c2 = v.c(m.a());
        int d2 = v.d(m.a());
        if (i == 2) {
            int i2 = d2;
            d2 = c2;
            c2 = i2;
        }
        return new d(m.a(), c2, d2).b(str, (List<com.bytedance.sdk.openadsdk.core.j.b.c>) new ArrayList());
    }

    private static void a(n nVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            e.b(m.a(), nVar, str, "load_vast_fail", jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void a(n nVar, String str, com.bytedance.sdk.openadsdk.core.j.a aVar, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = "load_vast_fail";
            if (aVar != null) {
                if (!TextUtils.isEmpty(aVar.i()) && !TextUtils.isEmpty(aVar.f())) {
                    if (aVar.h() > 0.0d) {
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, System.currentTimeMillis() - j);
                        str2 = "load_vast_success";
                    }
                }
                jSONObject.put("reason_code", -3);
            } else {
                jSONObject.put("reason_code", -2);
                jSONObject.put("error_code", com.bytedance.sdk.openadsdk.core.j.a.b.f1289e);
            }
            e.b(m.a(), nVar, str, str2, jSONObject);
        } catch (Exception unused) {
        }
    }

    private static void a(com.bytedance.sdk.openadsdk.core.j.a aVar, n nVar) {
        aVar.a(nVar);
        int L = nVar.L();
        if (!(L == 2 || L == 3)) {
            nVar.r(2);
        }
        nVar.d(1);
        nVar.c(true);
        nVar.a(aVar);
        if (!TextUtils.isEmpty(aVar.d())) {
            nVar.h(aVar.d());
        }
        if (!TextUtils.isEmpty(aVar.e())) {
            nVar.i(aVar.e());
        }
        nVar.f(aVar.f());
        k kVar = null;
        nVar.a((c) null);
        com.bykv.vk.openvk.component.video.api.c.b J = nVar.J();
        if (J == null) {
            J = new com.bykv.vk.openvk.component.video.api.c.b();
        }
        J.c(aVar.g());
        J.a(aVar.h());
        J.b((String) null);
        J.d((String) null);
        nVar.a(J);
        if (aVar.b() != null) {
            kVar = new k();
            kVar.a(aVar.b().e());
            kVar.a(aVar.b().b());
            kVar.b(aVar.b().c());
        }
        nVar.a(kVar);
    }

    private static com.bytedance.sdk.openadsdk.core.e.d b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("splash_clickarea", 2);
        int optInt2 = jSONObject.optInt("splash_layout_id", 1);
        com.bytedance.sdk.openadsdk.core.e.d dVar = new com.bytedance.sdk.openadsdk.core.e.d();
        dVar.a(optInt);
        dVar.b(optInt2);
        return dVar;
    }

    public static n b(JSONObject jSONObject, AdSlot adSlot, o oVar) {
        com.bytedance.sdk.openadsdk.core.j.a aVar;
        if (jSONObject == null) {
            return null;
        }
        n nVar = new n();
        nVar.r(jSONObject.optInt("interaction_type"));
        nVar.f(jSONObject.optString("target_url"));
        nVar.k(jSONObject.optString("ad_id"));
        nVar.l(jSONObject.optString("app_log_url"));
        nVar.e(jSONObject.optString("source"));
        nVar.v(jSONObject.optInt("dislike_control", 0));
        nVar.m(jSONObject.optInt("play_bar_show_time", AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES));
        nVar.n(jSONObject.optString("gecko_id"));
        if (jSONObject.has("set_click_type")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("set_click_type");
            nVar.b(optJSONObject.optDouble(IabUtils.KEY_CTA, 2.0d));
            nVar.a(optJSONObject.optDouble("other", 1.0d));
        }
        nVar.c(jSONObject.optJSONObject("extension"));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("icon");
        nVar.b(jSONObject.optBoolean("screenshot", false));
        nVar.k(jSONObject.optInt("play_bar_style", 0));
        nVar.o(jSONObject.optString("market_url", ""));
        nVar.i(jSONObject.optInt("video_adaptation", 0));
        nVar.f(jSONObject.optInt("feed_video_opentype", 0));
        nVar.a(jSONObject.optJSONObject("session_params"));
        nVar.c(jSONObject.optString("auction_price", ""));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("render");
        if (optJSONObject3 != null) {
            nVar.g(optJSONObject3.optInt("render_sequence", 0));
            nVar.h(optJSONObject3.optInt("backup_render_control", 1));
        }
        nVar.d(jSONObject.optInt("render_control", oVar != null ? oVar.f1146f : 1));
        if (optJSONObject2 != null) {
            k kVar = new k();
            kVar.a(optJSONObject2.optString("url"));
            kVar.b(optJSONObject2.optInt(IabUtils.KEY_HEIGHT));
            kVar.a(optJSONObject2.optInt(IabUtils.KEY_WIDTH));
            nVar.a(kVar);
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("reward_data");
        if (optJSONObject4 != null) {
            nVar.c(optJSONObject4.optInt("reward_amount", 0));
            nVar.a(optJSONObject4.optString("reward_name", ""));
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("cover_image");
        if (optJSONObject5 != null) {
            k kVar2 = new k();
            kVar2.a(optJSONObject5.optString("url"));
            kVar2.b(optJSONObject5.optInt(IabUtils.KEY_HEIGHT));
            kVar2.a(optJSONObject5.optInt(IabUtils.KEY_WIDTH));
            nVar.b(kVar2);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("image");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                k kVar3 = new k();
                JSONObject optJSONObject6 = optJSONArray.optJSONObject(i);
                kVar3.a(optJSONObject6.optString("url"));
                kVar3.b(optJSONObject6.optInt(IabUtils.KEY_HEIGHT));
                kVar3.a(optJSONObject6.optInt(IabUtils.KEY_WIDTH));
                kVar3.a(optJSONObject6.optBoolean("image_preview"));
                kVar3.b(optJSONObject6.optString("image_key"));
                nVar.c(kVar3);
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("show_url");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                nVar.R().add(optJSONArray2.optString(i2));
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("click_url");
        if (optJSONArray3 != null) {
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                nVar.S().add(optJSONArray3.optString(i3));
            }
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("play_start");
        if (optJSONArray4 != null) {
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                nVar.T().add(optJSONArray4.optString(i4));
            }
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("click_area");
        if (optJSONObject7 != null) {
            f fVar = new f();
            fVar.f1056a = optJSONObject7.optBoolean("click_upper_content_area", true);
            fVar.f1057b = optJSONObject7.optBoolean("click_upper_non_content_area", true);
            fVar.f1058c = optJSONObject7.optBoolean("click_lower_content_area", true);
            fVar.f1059d = optJSONObject7.optBoolean("click_lower_non_content_area", true);
            fVar.f1060e = optJSONObject7.optBoolean("click_button_area", true);
            fVar.f1061f = optJSONObject7.optBoolean("click_video_area", true);
            nVar.a(fVar);
        }
        JSONObject optJSONObject8 = jSONObject.optJSONObject("adslot");
        if (optJSONObject8 != null) {
            adSlot = c(optJSONObject8);
        }
        nVar.a(adSlot);
        nVar.l(jSONObject.optInt("intercept_flag", 0));
        nVar.g(jSONObject.optString("phone_num"));
        nVar.h(jSONObject.optString("title"));
        nVar.i(jSONObject.optString("description"));
        nVar.j(jSONObject.optString("button_text"));
        nVar.j(jSONObject.optInt("ad_logo", 1));
        nVar.m(jSONObject.optString("ext"));
        nVar.p(jSONObject.optInt("cover_click_area", 0));
        nVar.s(jSONObject.optInt("image_mode"));
        nVar.u(jSONObject.optInt(AdUnitActivity.EXTRA_ORIENTATION, 1));
        nVar.a((float) jSONObject.optDouble("aspect_ratio", 100.0d));
        nVar.p(jSONObject.optInt("cover_click_area", 0));
        JSONObject optJSONObject9 = jSONObject.optJSONObject("app");
        JSONObject optJSONObject10 = jSONObject.optJSONObject("deep_link");
        nVar.a(e(optJSONObject9));
        nVar.a(f(jSONObject.optJSONObject("interaction_method_params")));
        nVar.a(h(optJSONObject10));
        nVar.a(new p(jSONObject));
        JSONArray optJSONArray5 = jSONObject.optJSONArray("filter_words");
        if (optJSONArray5 != null) {
            for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                FilterWord d2 = d(optJSONArray5.optJSONObject(i5));
                if (d2 != null && d2.isValid()) {
                    nVar.a(d2);
                }
            }
        }
        nVar.t(jSONObject.optInt("count_down"));
        nVar.a(jSONObject.optLong("expiration_time"));
        nVar.B(jSONObject.optInt("video_encode_type", 0));
        nVar.A(jSONObject.optInt("player_type", 0));
        JSONObject optJSONObject11 = jSONObject.optJSONObject("video");
        if (optJSONObject11 != null) {
            nVar.a(i(optJSONObject11));
        }
        JSONObject optJSONObject12 = jSONObject.optJSONObject("h265_video");
        if (optJSONObject12 != null) {
            nVar.b(i(optJSONObject12));
        }
        JSONObject optJSONObject13 = jSONObject.optJSONObject("download_conf");
        if (optJSONObject13 != null) {
            nVar.a(g(optJSONObject13));
        }
        nVar.a(j(jSONObject.optJSONObject("media_ext")));
        JSONObject optJSONObject14 = jSONObject.optJSONObject("tpl_info");
        if (optJSONObject14 != null) {
            n.a aVar2 = new n.a();
            aVar2.b(optJSONObject14.optString(OSOutcomeConstants.OUTCOME_ID));
            aVar2.c(optJSONObject14.optString("md5"));
            aVar2.d(optJSONObject14.optString("url"));
            aVar2.e(optJSONObject14.optString("data"));
            aVar2.f(optJSONObject14.optString("diff_data"));
            aVar2.g(optJSONObject14.optString("dynamic_creative"));
            aVar2.a(optJSONObject14.optString(MediationMetaData.KEY_VERSION));
            nVar.a(aVar2);
        }
        nVar.d(jSONObject.optString("creative_extra"));
        nVar.e(jSONObject.optInt("if_block_lp", 0));
        nVar.n(jSONObject.optInt("cache_sort", 1));
        nVar.o(jSONObject.optInt("if_sp_cache", 0));
        JSONObject optJSONObject15 = jSONObject.optJSONObject("splash_control");
        if (optJSONObject15 != null) {
            nVar.a(b(optJSONObject15));
        }
        nVar.w(jSONObject.optInt("is_package_open", 1));
        nVar.b(jSONObject.optString("ad_info", (String) null));
        nVar.q(jSONObject.optInt("ua_policy", 2));
        nVar.x(jSONObject.optInt("playable_duration_time", 20));
        nVar.y(jSONObject.optInt("playable_endcard_close_time", -1));
        nVar.z(jSONObject.optInt("endcard_close_time", -1));
        nVar.a(jSONObject.optInt("interaction_method"));
        nVar.d(jSONObject.optBoolean("is_html"));
        nVar.p(jSONObject.optString("dsp_html"));
        if (jSONObject.optBoolean("is_vast", false)) {
            if (jSONObject.has("vast_json")) {
                aVar = com.bytedance.sdk.openadsdk.core.j.a.a(jSONObject.optJSONObject("vast_json"));
            } else {
                String b2 = u.b(u.e(nVar));
                String optString = jSONObject.optString("dsp_vast");
                if (TextUtils.isEmpty(optString)) {
                    a(nVar, b2);
                    return null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                aVar = a(optString, nVar.am());
                a(nVar, b2, aVar, currentTimeMillis);
                if (aVar != null) {
                    aVar.f(b2);
                }
            }
            if (aVar == null) {
                return null;
            }
            a(aVar, nVar);
        }
        return nVar;
    }

    private static boolean b(n nVar) {
        return !nVar.aw() && !nVar.ay();
    }

    private static AdSlot c(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            return null;
        }
        String optString = jSONObject2.optString("mCodeId", "");
        int optInt = jSONObject2.optInt("mImgAcceptedWidth", 0);
        int optInt2 = jSONObject2.optInt("mImgAcceptedHeight", 0);
        int optInt3 = jSONObject2.optInt("mAdCount", 6);
        boolean optBoolean = jSONObject2.optBoolean("mSupportDeepLink", true);
        String optString2 = jSONObject2.optString("mRewardName", "");
        int optInt4 = jSONObject2.optInt("mRewardAmount", 0);
        String optString3 = jSONObject2.optString("mMediaExtra", "");
        String optString4 = jSONObject2.optString("mUserID", "");
        jSONObject2.optInt("mOrientation", 2);
        int optInt5 = jSONObject2.optInt("mNativeAdType", 0);
        boolean optBoolean2 = jSONObject2.optBoolean("mIsExpressAd", false);
        return new AdSlot.Builder().setCodeId(optString).setImageAcceptedSize(optInt, optInt2).setExpressViewAcceptedSize((float) jSONObject2.optDouble("mExpressViewAcceptedWidth", 0.0d), (float) jSONObject2.optDouble("mExpressViewAcceptedHeight", 0.0d)).setAdCount(optInt3).setSupportDeepLink(optBoolean).setRewardName(optString2).setRewardAmount(optInt4).setMediaExtra(optString3).setUserID(optString4).setNativeAdType(optInt5).setIsAutoPlay(jSONObject2.optBoolean("mIsAutoPlay", false)).isExpressAd(optBoolean2).withBid(jSONObject2.optString("mBidAdm", "")).build();
    }

    private static FilterWord d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString(OSOutcomeConstants.OUTCOME_ID));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray("options");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    FilterWord d2 = d(optJSONArray.optJSONObject(i));
                    if (d2 != null && d2.isValid()) {
                        filterWord.addOption(d2);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static c e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        c cVar = new c();
        cVar.b(jSONObject.optString("app_name"));
        cVar.c(jSONObject.optString("package_name"));
        cVar.a(jSONObject.optString("download_url"));
        cVar.a(jSONObject.optDouble("score", -1.0d));
        cVar.a(jSONObject.optInt("comment_num", -1));
        cVar.b(jSONObject.optInt("app_size", 0));
        return cVar;
    }

    private static m f(JSONObject jSONObject) {
        m mVar = new m();
        if (jSONObject == null) {
            mVar.a(10);
            mVar.b(20);
            mVar.a("");
            return mVar;
        }
        mVar.a(jSONObject.optLong("onlylp_loading_maxtime", 10));
        mVar.b(jSONObject.optLong("straight_lp_showtime", 20));
        mVar.a(jSONObject.optString("loading_text", ""));
        return mVar;
    }

    private static i g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        i iVar = new i();
        iVar.a(jSONObject.optInt("if_send_click", 0));
        return iVar;
    }

    private static h h(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        h hVar = new h();
        hVar.a(jSONObject.optString("deeplink_url"));
        hVar.b(jSONObject.optString("fallback_url"));
        hVar.a(jSONObject.optInt("fallback_type"));
        return hVar;
    }

    private static com.bykv.vk.openvk.component.video.api.c.b i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bykv.vk.openvk.component.video.api.c.b bVar = new com.bykv.vk.openvk.component.video.api.c.b();
        bVar.b(jSONObject.optInt("cover_height"));
        bVar.c(jSONObject.optInt("cover_width"));
        bVar.a(jSONObject.optString("resolution"));
        bVar.a(jSONObject.optLong("size"));
        bVar.a(jSONObject.optDouble("video_duration", 0.0d));
        bVar.b(jSONObject.optString("cover_url"));
        bVar.c(jSONObject.optString("video_url"));
        bVar.d(jSONObject.optString("endcard"));
        bVar.e(jSONObject.optString("playable_download_url"));
        bVar.f(jSONObject.optString("file_hash"));
        int i = 0;
        bVar.h(jSONObject.optInt("if_playable_loading_show", 0));
        bVar.i(jSONObject.optInt("remove_loading_page_type", 0));
        bVar.a(jSONObject.optInt("fallback_endcard_judge", 0));
        bVar.e(jSONObject.optInt("video_preload_size", 307200));
        bVar.f(jSONObject.optInt("reward_video_cached_type", 0));
        bVar.g(jSONObject.optInt("execute_cached_type", 0));
        if (jSONObject.optDouble("endcard_render", 0.0d) == 1.0d) {
            i = 1;
        }
        bVar.d(i);
        return bVar;
    }

    private static Map<String, Object> j(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, jSONObject.opt(next));
            }
        }
        return hashMap;
    }

    /* compiled from: AdInfoFactory */
    static class a {
        a() {
        }

        public static a a() {
            return new a();
        }

        public a a(boolean z) {
            if (z) {
                a((int) ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
            }
            return this;
        }

        public a b(boolean z) {
            if (z) {
                a(301);
            }
            return this;
        }

        public a c(boolean z) {
            if (z) {
                a((int) IronSourceConstants.OFFERWALL_AVAILABLE);
            }
            return this;
        }

        public a d(boolean z) {
            if (z) {
                a(303);
            }
            return this;
        }

        public a e(boolean z) {
            if (z) {
                a(304);
            }
            return this;
        }

        public a f(boolean z) {
            if (z) {
                a((int) IronSourceConstants.OFFERWALL_OPENED);
            }
            return this;
        }

        private void a(final int i) {
            m.i().a(new com.bytedance.sdk.openadsdk.h.a() {
                public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                    return com.bytedance.sdk.openadsdk.h.a.b.b().a("creative_error").b(i).b(g.b(i));
                }
            });
        }

        public static void a(com.bytedance.sdk.openadsdk.core.e.a aVar) {
            if (aVar != null && aVar.b() != null && !aVar.b().isEmpty()) {
                for (n next : aVar.b()) {
                    boolean z = false;
                    a d2 = a().a(TextUtils.isEmpty(next.U())).b(TextUtils.isEmpty(next.V())).c(TextUtils.isEmpty(next.X())).f(next.M() == null || TextUtils.isEmpty(next.M().a())).d(next.aa() == null || next.aa().d() == -1.0d || a(next));
                    if (next.aa() == null || next.aa().e() == -1 || b(next)) {
                        z = true;
                    }
                    d2.e(z);
                }
            }
        }

        public static boolean a(n nVar) {
            try {
                double optDouble = new JSONObject(nVar.G().g()).optDouble("score_exact_i18n", -1.0d);
                return optDouble < 0.0d || optDouble > 5.0d;
            } catch (Exception unused) {
            }
        }

        public static boolean b(n nVar) {
            try {
                return new JSONObject(nVar.G().g()).optInt("comment_num_i18n", -1) < 0;
            } catch (Exception unused) {
                return true;
            }
        }
    }
}
