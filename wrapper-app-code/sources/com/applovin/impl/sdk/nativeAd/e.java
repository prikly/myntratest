package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.e.a;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.i;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class e extends a implements a.C0152a, AppLovinAdLoadListener {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f15627a;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f15628e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final AppLovinNativeAdLoadListener f15629f;

    /* renamed from: g  reason: collision with root package name */
    private String f15630g = "";

    /* renamed from: h  reason: collision with root package name */
    private String f15631h = "";
    private String i = "";
    private String j = "";
    private Uri k = null;
    private Uri l = null;
    private com.applovin.impl.b.a m;
    private Uri n = null;
    private Uri o = null;
    private Uri p = null;
    private Uri q = null;
    private final List<String> r = new ArrayList();
    private String s;
    private final List<i> t = new ArrayList();
    private final List<i> u = new ArrayList();
    private final List<i> v = new ArrayList();
    private final List<i> w = new ArrayList();

    public e(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, n nVar) {
        super("TaskRenderNativeAd", nVar);
        this.f15627a = jSONObject;
        this.f15628e = jSONObject2;
        this.f15629f = appLovinNativeAdLoadListener;
    }

    private void a() {
        AppLovinNativeAdImpl build = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f15627a), JsonUtils.shallowCopy(this.f15628e), this.f15418b).setTitle(this.f15630g).setAdvertiser(this.f15631h).setBody(this.i).setCallToAction(this.j).setIconUri(this.k).setMainImageUri(this.l).setPrivacyIconUri(this.n).setVastAd(this.m).setPrivacyDestinationUri(this.o).setClickDestinationUri(this.p).setClickDestinationBackupUri(this.q).setClickTrackingUrls(this.r).setJsTracker(this.s).setImpressionRequests(this.t).setViewableMRC50Requests(this.u).setViewableMRC100Requests(this.v).setViewableVideo50Requests(this.w).build();
        build.getAdEventTracker().b();
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.b(str, "Starting cache task for type: " + build.getType() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.f15418b.V().a((com.applovin.impl.sdk.e.a) new a(build, this.f15418b, this), o.a.MAIN);
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            String string = JsonUtils.getString(jSONObject, "url", (String) null);
            if (StringUtils.isValidString(string)) {
                this.p = Uri.parse(string);
                v vVar = this.f15420d;
                if (v.a()) {
                    v vVar2 = this.f15420d;
                    String str = this.f15419c;
                    vVar2.b(str, "Processed click destination URL: " + this.p);
                }
            }
            String string2 = JsonUtils.getString(jSONObject, "fallback", (String) null);
            if (StringUtils.isValidString(string2)) {
                this.q = Uri.parse(string2);
                v vVar3 = this.f15420d;
                if (v.a()) {
                    v vVar4 = this.f15420d;
                    String str2 = this.f15419c;
                    vVar4.b(str2, "Processed click destination backup URL: " + this.q);
                }
            }
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", (JSONArray) null);
            if (jSONArray != null) {
                try {
                    this.r.addAll(JsonUtils.toList(jSONArray));
                    v vVar5 = this.f15420d;
                    if (v.a()) {
                        v vVar6 = this.f15420d;
                        String str3 = this.f15419c;
                        vVar6.b(str3, "Processed click tracking URLs: " + this.r);
                    }
                } catch (Throwable th) {
                    v vVar7 = this.f15420d;
                    if (v.a()) {
                        this.f15420d.b(this.f15419c, "Failed to render click tracking URLs", th);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        this.f15629f.onNativeAdLoadFailed(-6);
    }

    private void b(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                v unused = e.this.f15420d;
                if (v.a()) {
                    e.this.f15420d.b(e.this.f15419c, "Preparing native ad view components...");
                }
                try {
                    appLovinNativeAdImpl.setUpNativeAdViewComponents();
                    v unused2 = e.this.f15420d;
                    if (v.a()) {
                        e.this.f15420d.b(e.this.f15419c, "Successfully prepared native ad view components");
                    }
                    appLovinNativeAdImpl.getAdEventTracker().c();
                    e.this.f15629f.onNativeAdLoaded(appLovinNativeAdImpl);
                } catch (Throwable th) {
                    v unused3 = e.this.f15420d;
                    if (v.a()) {
                        e.this.f15420d.b(e.this.f15419c, "Failed to prepare native ad view components", th);
                    }
                    e.this.b();
                }
            }
        });
    }

    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        v vVar = this.f15420d;
        if (v.a()) {
            this.f15420d.b(this.f15419c, "Successfully cached and loaded ad");
        }
        b(appLovinNativeAdImpl);
    }

    public void adReceived(AppLovinAd appLovinAd) {
        v vVar = this.f15420d;
        if (v.a()) {
            this.f15420d.b(this.f15419c, "VAST ad rendered successfully");
        }
        this.m = (com.applovin.impl.b.a) appLovinAd;
        a();
    }

    public void failedToReceiveAd(int i2) {
        v vVar = this.f15420d;
        if (v.a()) {
            this.f15420d.e(this.f15419c, "VAST ad failed to render");
        }
        a();
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v5, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v12, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v32 */
    public void run() {
        v vVar;
        String str;
        StringBuilder sb;
        String str2;
        String str3;
        StringBuilder sb2;
        String str4;
        v vVar2;
        v vVar3;
        String str5;
        StringBuilder sb3;
        v vVar4;
        String str6;
        StringBuilder sb4;
        String str7;
        String sb5;
        String str8;
        Uri uri;
        ? r2 = 0;
        String string = JsonUtils.getString(this.f15627a, "privacy_icon_url", (String) null);
        if (URLUtil.isValidUrl(string)) {
            this.n = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f15627a, "privacy_url", (String) null);
        if (URLUtil.isValidUrl(string2)) {
            this.o = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f15627a, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            v vVar5 = this.f15420d;
            if (v.a()) {
                v vVar6 = this.f15420d;
                String str9 = this.f15419c;
                vVar6.e(str9, "No oRtb response provided: " + this.f15627a);
            }
            b();
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, MediationMetaData.KEY_VERSION, (String) null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, (JSONObject) null);
        v vVar7 = this.f15420d;
        if (v.a()) {
            v vVar8 = this.f15420d;
            String str10 = this.f15419c;
            vVar8.b(str10, "Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", (JSONArray) null);
        if (jSONArray == null || jSONArray.length() == 0) {
            v vVar9 = this.f15420d;
            if (v.a()) {
                v vVar10 = this.f15420d;
                String str11 = this.f15419c;
                vVar10.e(str11, "Unable to retrieve assets - failing ad load: " + this.f15627a);
            }
            b();
            return;
        }
        String str12 = "";
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) r2);
            if (jSONObject4.has("title")) {
                this.f15630g = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) r2), "text", r2);
                v vVar11 = this.f15420d;
                if (v.a()) {
                    v vVar12 = this.f15420d;
                    String str13 = this.f15419c;
                    vVar12.b(str13, "Processed title: " + this.f15630g);
                }
            } else if (jSONObject4.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r2));
            } else {
                if (jSONObject4.has("img")) {
                    int i3 = JsonUtils.getInt(jSONObject4, OSOutcomeConstants.OUTCOME_ID, -1);
                    JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) r2);
                    int i4 = JsonUtils.getInt(jSONObject5, "type", -1);
                    String string4 = JsonUtils.getString(jSONObject5, "url", r2);
                    if (i4 == 1 || 3 == i3) {
                        this.k = Uri.parse(string4);
                        v vVar13 = this.f15420d;
                        if (v.a()) {
                            vVar2 = this.f15420d;
                            str4 = this.f15419c;
                            sb2 = new StringBuilder();
                            sb2.append("Processed icon URL: ");
                            uri = this.k;
                        }
                    } else if (i4 == 3 || 2 == i3) {
                        this.l = Uri.parse(string4);
                        v vVar14 = this.f15420d;
                        if (v.a()) {
                            vVar2 = this.f15420d;
                            str4 = this.f15419c;
                            sb2 = new StringBuilder();
                            sb2.append("Processed main image URL: ");
                            uri = this.l;
                        }
                    } else {
                        v vVar15 = this.f15420d;
                        if (v.a()) {
                            v vVar16 = this.f15420d;
                            String str14 = this.f15419c;
                            vVar16.d(str14, "Unrecognized image: " + jSONObject4);
                        }
                        int i5 = JsonUtils.getInt(jSONObject5, "w", -1);
                        int i6 = JsonUtils.getInt(jSONObject5, "h", -1);
                        if (i5 <= 0 || i6 <= 0) {
                            v vVar17 = this.f15420d;
                            if (v.a()) {
                                vVar4 = this.f15420d;
                                str6 = this.f15419c;
                                sb5 = "Skipping...";
                            }
                        } else {
                            int i7 = (((double) (((float) i5) / ((float) i6))) > 1.0d ? 1 : (((double) (((float) i5) / ((float) i6))) == 1.0d ? 0 : -1));
                            v vVar18 = this.f15420d;
                            boolean a2 = v.a();
                            if (i7 > 0) {
                                if (a2) {
                                    v vVar19 = this.f15420d;
                                    String str15 = this.f15419c;
                                    vVar19.b(str15, "Inferring main image from " + i5 + "x" + i6 + APSSharedUtil.TRUNCATE_SEPARATOR);
                                }
                                this.l = Uri.parse(string4);
                            } else {
                                if (a2) {
                                    v vVar20 = this.f15420d;
                                    String str16 = this.f15419c;
                                    vVar20.b(str16, "Inferring icon image from " + i5 + "x" + i6 + APSSharedUtil.TRUNCATE_SEPARATOR);
                                }
                                this.k = Uri.parse(string4);
                            }
                        }
                    }
                    sb2.append(uri);
                    str8 = sb2.toString();
                    vVar2.b(str4, str8);
                } else {
                    if (jSONObject4.has("video")) {
                        str12 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", (String) null);
                        if (StringUtils.isValidString(str12)) {
                            v vVar21 = this.f15420d;
                            if (v.a()) {
                                vVar2 = this.f15420d;
                                str4 = this.f15419c;
                                str8 = "Processed VAST video";
                                vVar2.b(str4, str8);
                            }
                        } else {
                            v vVar22 = this.f15420d;
                            if (v.a()) {
                                vVar4 = this.f15420d;
                                str6 = this.f15419c;
                                sb4 = new StringBuilder();
                                str7 = "Ignoring invalid \"vasttag\" for video: ";
                            }
                        }
                    } else if (jSONObject4.has("data")) {
                        int i8 = JsonUtils.getInt(jSONObject4, OSOutcomeConstants.OUTCOME_ID, -1);
                        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                        int i9 = JsonUtils.getInt(jSONObject6, "type", -1);
                        String string5 = JsonUtils.getString(jSONObject6, AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) null);
                        if (i9 == 1 || i8 == 8) {
                            this.f15631h = string5;
                            v vVar23 = this.f15420d;
                            if (v.a()) {
                                vVar3 = this.f15420d;
                                str5 = this.f15419c;
                                sb3 = new StringBuilder();
                                sb3.append("Processed advertiser: ");
                                str3 = this.f15631h;
                            }
                        } else if (i9 == 2 || i8 == 4) {
                            this.i = string5;
                            v vVar24 = this.f15420d;
                            if (v.a()) {
                                vVar3 = this.f15420d;
                                str5 = this.f15419c;
                                sb3 = new StringBuilder();
                                sb3.append("Processed body: ");
                                str3 = this.i;
                            }
                        } else if (i9 == 12 || i8 == 5) {
                            this.j = string5;
                            v vVar25 = this.f15420d;
                            if (v.a()) {
                                vVar3 = this.f15420d;
                                str5 = this.f15419c;
                                sb3 = new StringBuilder();
                                sb3.append("Processed cta: ");
                                str3 = this.j;
                            }
                        } else {
                            v vVar26 = this.f15420d;
                            if (v.a()) {
                                vVar4 = this.f15420d;
                                str6 = this.f15419c;
                                sb4 = new StringBuilder();
                                str7 = "Skipping unsupported data: ";
                            }
                        }
                        sb2.append(str3);
                        str8 = sb2.toString();
                        vVar2.b(str4, str8);
                    } else {
                        v vVar27 = this.f15420d;
                        if (v.a()) {
                            v vVar28 = this.f15420d;
                            String str17 = this.f15419c;
                            vVar28.e(str17, "Unsupported asset object: " + jSONObject4);
                        }
                    }
                    sb4.append(str7);
                    sb4.append(jSONObject4);
                    sb5 = sb4.toString();
                }
                vVar4.d(str6, sb5);
            }
            i2++;
            r2 = 0;
        }
        String string6 = JsonUtils.getString(jSONObject3, "jstracker", (String) null);
        if (StringUtils.isValidString(string6)) {
            this.s = string6;
            v vVar29 = this.f15420d;
            if (v.a()) {
                v vVar30 = this.f15420d;
                String str18 = this.f15419c;
                vVar30.b(str18, "Processed jstracker: " + string6);
            }
        }
        Object obj = null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", (JSONArray) null);
        if (jSONArray2 != null) {
            int i10 = 0;
            while (i10 < jSONArray2.length()) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i10, obj);
                if (objectAtIndex instanceof String) {
                    String str19 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str19)) {
                        this.t.add(new i.a(this.f15418b).a(str19).d(false).c(false).a());
                        v vVar31 = this.f15420d;
                        if (v.a()) {
                            v vVar32 = this.f15420d;
                            String str20 = this.f15419c;
                            vVar32.b(str20, "Processed imptracker URL: " + str19);
                        }
                    }
                }
                i10++;
                obj = null;
            }
        }
        ? r22 = 0;
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", (JSONArray) null);
        if (jSONArray3 != null) {
            int i11 = 0;
            while (i11 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i11, (JSONObject) r22);
                int i12 = JsonUtils.getInt(jSONObject7, "event", -1);
                int i13 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string7 = JsonUtils.getString(jSONObject7, "url", r22);
                if (!TextUtils.isEmpty(string7)) {
                    if (i13 == 1 || i13 == 2) {
                        i b2 = new i.a(this.f15418b).a(string7).d(false).c(false).g(i13 == 2).a();
                        if (i12 == 1) {
                            this.t.add(b2);
                            v vVar33 = this.f15420d;
                            if (v.a()) {
                                v vVar34 = this.f15420d;
                                String str21 = this.f15419c;
                                vVar34.b(str21, "Processed impression URL: " + string7);
                            }
                        } else {
                            if (i12 == 2) {
                                this.u.add(b2);
                                v vVar35 = this.f15420d;
                                if (v.a()) {
                                    vVar = this.f15420d;
                                    str = this.f15419c;
                                    sb = new StringBuilder();
                                    str2 = "Processed viewable MRC50 URL: ";
                                }
                            } else if (i12 == 3) {
                                this.v.add(b2);
                                v vVar36 = this.f15420d;
                                if (v.a()) {
                                    vVar = this.f15420d;
                                    str = this.f15419c;
                                    sb = new StringBuilder();
                                    str2 = "Processed viewable MRC100 URL: ";
                                }
                            } else {
                                if (i12 == 4) {
                                    this.w.add(b2);
                                    v vVar37 = this.f15420d;
                                    if (v.a()) {
                                        v vVar38 = this.f15420d;
                                        String str22 = this.f15419c;
                                        vVar38.b(str22, "Processed viewable video 50 URL: " + string7);
                                    }
                                } else if (i12 == 555) {
                                    v vVar39 = this.f15420d;
                                    if (v.a()) {
                                        v vVar40 = this.f15420d;
                                        String str23 = this.f15419c;
                                        vVar40.b(str23, "Ignoring processing of OMID URL: " + string7);
                                    }
                                } else {
                                    v vVar41 = this.f15420d;
                                    if (v.a()) {
                                        v vVar42 = this.f15420d;
                                        String str24 = this.f15419c;
                                        vVar42.e(str24, "Unsupported event tracker: " + jSONObject7);
                                    }
                                }
                                i11++;
                                r22 = 0;
                            }
                            sb.append(str2);
                            sb.append(string7);
                            vVar.b(str, sb.toString());
                        }
                        i11++;
                        r22 = 0;
                    } else {
                        v vVar43 = this.f15420d;
                        if (v.a()) {
                            v vVar44 = this.f15420d;
                            String str25 = this.f15419c;
                            vVar44.e(str25, "Unsupported method for event tracker: " + jSONObject7);
                        }
                    }
                }
                i11++;
                r22 = 0;
            }
        }
        if (StringUtils.isValidString(str12)) {
            v vVar45 = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "Processing VAST video...");
            }
            this.f15418b.V().a((com.applovin.impl.sdk.e.a) r.a(str12, JsonUtils.shallowCopy(this.f15627a), JsonUtils.shallowCopy(this.f15628e), b.UNKNOWN, this, this.f15418b));
            return;
        }
        a();
    }
}
