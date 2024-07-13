package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.core.a.b;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.mediationsdk.C;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.g;
import com.ironsource.mediationsdk.model.k;
import com.ironsource.mediationsdk.model.m;
import com.ironsource.mediationsdk.model.n;
import ms.bd.o.Pgl.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class l {
    private final String A = "configurations";
    private final String B = IronSourceConstants.EVENTS_GENERIC_PARAMS;
    private final String C = "adUnits";
    private final String D = "providerLoadName";
    private final String E = "application";
    private final String F = "rewardedVideo";
    private final String G = "interstitial";
    private final String H = "offerwall";
    private final String I = "banner";
    private final String J = "integration";
    private final String K = "loggers";
    private final String L = "segment";
    private final String M = "events";
    private final String N = "crashReporter";
    private final String O = "token";
    private final String P = "external";
    private final String Q = "mediationTypes";
    private final String R = "providerDefaultInstance";
    private final String S = b.hW;
    private final String T = "maxNumOfAdaptersToLoadOnStart";
    private final String U = "advancedLoading";
    private final String V = "adapterTimeOutInSeconds";
    private final String W = "atim";
    private final String X = "bannerInterval";
    private final String Y = "loadRVInterval";
    private final String Z = "expiredDurationInMinutes";

    /* renamed from: a  reason: collision with root package name */
    public m f8937a;
    private final String aA = "maxImpressions";
    private final String aB = "numOfSeconds";
    private final String aC = "unit";
    private final String aD = "virtualItemName";
    private final String aE = "virtualItemCount";
    private final String aF = "backFill";
    private final String aG = "premium";
    private final String aH = "uuidEnabled";
    private final String aI = "abt";
    private final String aJ = "delayLoadFailure";
    private final String aK = "keysToInclude";
    private final String aL = "reporterURL";
    private final String aM = "reporterKeyword";
    private final String aN = "includeANR";
    private final String aO = "timeout";
    private final String aP = "setIgnoreDebugger";
    private final String aQ = "adSourceName";
    private final String aR = "spId";
    private final String aS = "mpis";
    private final String aT = "auction";
    private final String aU = "auctionData";
    private final String aV = "auctioneerURL";
    private final String aW = IronSourceConstants.EVENTS_PROGRAMMATIC;
    private final String aX = "objectPerWaterfall";
    private final String aY = "minTimeBeforeFirstAuction";
    private final String aZ = "timeToWaitBeforeAuction";
    private final String aa = "server";
    private final String ab = "publisher";
    private final String ac = "console";
    private final String ad = "sendUltraEvents";
    private final String ae = "sendEventsToggle";
    private final String af = "eventsCompression";
    private final String ag = "serverEventsURL";
    private final String ah = "serverEventsType";
    private final String ai = "backupThreshold";
    private final String aj = "maxNumberOfEvents";
    private final String ak = "maxEventsPerBatch";
    private final String al = "optOut";
    private final String am = "optIn";
    private final String an = "triggerEvents";
    private final String ao = "nonConnectivityEvents";
    private final String ap = "pixel";
    private final String aq = "pixelEventsUrl";
    private final String ar = "pixelEventsEnabled";
    private final String as = "placements";
    private final String at = "placementId";
    private final String au = "placementName";
    private final String av = "delivery";
    private final String aw = "isDefault";
    private final String ax = "capping";
    private final String ay = "pacing";
    private final String az = "enabled";

    /* renamed from: b  reason: collision with root package name */
    public n f8938b;
    private final String ba = "timeToWaitBeforeLoad";
    private final String bb = "auctionRetryInterval";
    private final String bc = "isAuctionOnShowStart";
    private final String bd = "isLoadWhileShow";
    private final String be = IronSourceConstants.AUCTION_TRIALS;
    private final String bf = "auctionTimeout";
    private final String bg = "auctionSavedHistory";
    private final String bh = "disableLoadWhileShowSupportFor";
    private final String bi = "timeToDeleteOldWaterfallAfterAuction";
    private final String bj = "compressAuctionRequest";
    private final String bk = "compressAuctionResponse";
    private final String bl = "encryptionVersion";
    private final String bm = "shouldSendBannerBURLFromImpression";
    private final String bn = "optInKeys";
    private final String bo = "tokenGenericParams";
    private final String bp = "oneToken";
    private final String bq = "compressToken";
    private final String br = "isExternalArmEventsEnabled";
    private final String bs = "externalArmEventsUrl";
    private final String bt = "compressExternalToken";
    private String bu;
    private String bv;
    private Context bw;

    /* renamed from: c  reason: collision with root package name */
    public g f8939c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f8940d;

    /* renamed from: e  reason: collision with root package name */
    public int f8941e = a.f8945a;

    /* renamed from: f  reason: collision with root package name */
    private final String f8942f = "error";

    /* renamed from: g  reason: collision with root package name */
    private final int f8943g = 3;

    /* renamed from: h  reason: collision with root package name */
    private final int f8944h = 2;
    private final int i = 60;
    private final int j = 10000;
    private final int k = 5000;
    private final int l = c.COLLECT_MODE_FINANCE;
    private final int m = 3;
    private final int n = 3;
    private final int o = 3;
    private final int p = 2;
    private final int q = 15;
    private final long r = 10000;
    private final int s = 0;
    private final boolean t = false;
    private final int u = Constants.FAILED_REQUEST_PRECACHE_MS;
    private final int v = -1;
    private final int w = 5000;
    private final int x = 1;
    private final String y = "providerOrder";
    private final String z = "providerSettings";

    public enum a {
        ;
        

        /* renamed from: a  reason: collision with root package name */
        public static final int f8945a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f8946b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f8947c = 3;

        static {
            f8948d = new int[]{1, 2, 3};
        }
    }

    public l(Context context, String str, String str2, String str3) {
        this.bw = context;
        try {
            this.f8940d = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            h();
            i();
            g();
            this.bu = TextUtils.isEmpty(str) ? "" : str;
            this.bv = TextUtils.isEmpty(str2) ? "" : str2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            e();
        }
    }

    public l(l lVar) {
        try {
            this.bw = lVar.bw;
            this.f8940d = new JSONObject(lVar.f8940d.toString());
            this.bu = lVar.bu;
            this.bv = lVar.bv;
            this.f8937a = lVar.f8937a;
            this.f8938b = lVar.f8938b;
            this.f8939c = lVar.f8939c;
            this.f8941e = lVar.f8941e;
        } catch (Exception unused) {
            e();
        }
    }

    private static int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i2) {
        int i3 = 0;
        if (jSONObject.has(str)) {
            i3 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i3 = jSONObject2.optInt(str, 0);
        }
        return i3 == 0 ? i2 : i3;
    }

    private static k a(JSONObject jSONObject) {
        com.ironsource.mediationsdk.model.l lVar = null;
        if (jSONObject == null) {
            return null;
        }
        k.a aVar = new k.a();
        boolean z2 = true;
        aVar.f8770a = jSONObject.optBoolean("delivery", true);
        JSONObject optJSONObject = jSONObject.optJSONObject("capping");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("unit");
            if (!TextUtils.isEmpty(optString)) {
                if (com.ironsource.mediationsdk.model.l.PER_DAY.toString().equals(optString)) {
                    lVar = com.ironsource.mediationsdk.model.l.PER_DAY;
                } else if (com.ironsource.mediationsdk.model.l.PER_HOUR.toString().equals(optString)) {
                    lVar = com.ironsource.mediationsdk.model.l.PER_HOUR;
                }
            }
            int optInt = optJSONObject.optInt("maxImpressions", 0);
            aVar.a(optJSONObject.optBoolean("enabled", false) && optInt > 0, lVar, optInt);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("pacing");
        if (optJSONObject2 != null) {
            int optInt2 = optJSONObject2.optInt("numOfSeconds", 0);
            if (!optJSONObject2.optBoolean("enabled", false) || optInt2 <= 0) {
                z2 = false;
            }
            aVar.a(z2, optInt2);
        }
        return aVar.a();
    }

    private static int[] a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int[] iArr = new int[optJSONArray.length()];
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            iArr[i2] = optJSONArray.optInt(i2);
        }
        return iArr;
    }

    private static JSONObject b(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private void e() {
        this.f8940d = new JSONObject();
        this.bu = "";
        this.bv = "";
        this.f8937a = new m();
        this.f8938b = n.a();
        this.f8939c = new g();
    }

    private boolean f() {
        JSONArray names = b(this.f8940d, "providerOrder").names();
        if (names == null) {
            return true;
        }
        JSONObject b2 = b(b(this.f8940d, "configurations"), "adUnits");
        for (int i2 = 0; i2 < names.length(); i2++) {
            JSONArray optJSONArray = b(b2, names.optString(i2)).optJSONArray("placements");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return false;
            }
        }
        return true;
    }

    private void g() {
        try {
            JSONObject b2 = b(this.f8940d, "providerOrder");
            JSONArray optJSONArray = b2.optJSONArray("rewardedVideo");
            JSONArray optJSONArray2 = b2.optJSONArray("interstitial");
            JSONArray optJSONArray3 = b2.optJSONArray("banner");
            this.f8937a = new m();
            if (!(optJSONArray == null || this.f8939c == null || this.f8939c.f8744a == null)) {
                String str = this.f8939c.f8744a.f8794f;
                String str2 = this.f8939c.f8744a.f8795g;
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    String optString = optJSONArray.optString(i2);
                    if (optString.equals(str)) {
                        this.f8937a.f8781b = str;
                    } else {
                        if (optString.equals(str2)) {
                            this.f8937a.f8782c = str2;
                        }
                        m mVar = this.f8937a;
                        if (!TextUtils.isEmpty(optString)) {
                            mVar.f8780a.add(optString);
                        }
                        NetworkSettings a2 = n.a().a(optString);
                        if (a2 != null) {
                            a2.setRewardedVideoPriority(i2);
                        }
                    }
                }
            }
            if (!(optJSONArray2 == null || this.f8939c == null || this.f8939c.f8745b == null)) {
                String str3 = this.f8939c.f8745b.f8755g;
                String str4 = this.f8939c.f8745b.f8756h;
                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                    String optString2 = optJSONArray2.optString(i3);
                    if (optString2.equals(str3)) {
                        this.f8937a.f8785f = str3;
                    } else {
                        if (optString2.equals(str4)) {
                            this.f8937a.f8786g = str4;
                        }
                        m mVar2 = this.f8937a;
                        if (!TextUtils.isEmpty(optString2)) {
                            mVar2.f8783d.add(optString2);
                        }
                        NetworkSettings a3 = n.a().a(optString2);
                        if (a3 != null) {
                            a3.setInterstitialPriority(i3);
                        }
                    }
                }
            }
            if (optJSONArray3 != null) {
                for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                    String optString3 = optJSONArray3.optString(i4);
                    m mVar3 = this.f8937a;
                    if (!TextUtils.isEmpty(optString3)) {
                        mVar3.f8784e.add(optString3);
                    }
                    NetworkSettings a4 = n.a().a(optString3);
                    if (a4 != null) {
                        a4.setBannerPriority(i4);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e2 A[Catch:{ Exception -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0132 A[Catch:{ Exception -> 0x015c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "Mediation"
            com.ironsource.mediationsdk.model.n r2 = com.ironsource.mediationsdk.model.n.a()     // Catch:{ Exception -> 0x015c }
            r1.f8938b = r2     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r2 = r1.f8940d     // Catch:{ Exception -> 0x015c }
            java.lang.String r3 = "providerSettings"
            org.json.JSONObject r2 = b(r2, r3)     // Catch:{ Exception -> 0x015c }
            java.util.Iterator r3 = r2.keys()     // Catch:{ Exception -> 0x015c }
        L_0x0016:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x015c }
            if (r4 == 0) goto L_0x0156
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x015c }
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r4 = r2.optJSONObject(r6)     // Catch:{ Exception -> 0x015c }
            if (r4 == 0) goto L_0x014c
            java.lang.String r5 = "mpis"
            r7 = 0
            boolean r13 = r4.optBoolean(r5, r7)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "spId"
            java.lang.String r8 = "0"
            java.lang.String r14 = r4.optString(r5, r8)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "adSourceName"
            r8 = 0
            java.lang.String r15 = r4.optString(r5, r8)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "providerLoadName"
            java.lang.String r8 = r4.optString(r5, r6)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "providerDefaultInstance"
            java.lang.String r9 = r4.optString(r5, r8)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "adUnits"
            org.json.JSONObject r5 = b(r4, r5)     // Catch:{ Exception -> 0x015c }
            java.lang.String r10 = "application"
            org.json.JSONObject r4 = b(r4, r10)     // Catch:{ Exception -> 0x015c }
            java.lang.String r10 = "rewardedVideo"
            org.json.JSONObject r10 = b(r5, r10)     // Catch:{ Exception -> 0x015c }
            java.lang.String r11 = "interstitial"
            org.json.JSONObject r11 = b(r5, r11)     // Catch:{ Exception -> 0x015c }
            java.lang.String r12 = "banner"
            org.json.JSONObject r5 = b(r5, r12)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r10, r4)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r11, r4)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r5, r4)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.n r5 = r1.f8938b     // Catch:{ Exception -> 0x015c }
            boolean r5 = r5.b(r6)     // Catch:{ Exception -> 0x015c }
            if (r5 == 0) goto L_0x00af
            com.ironsource.mediationsdk.model.n r4 = r1.f8938b     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.NetworkSettings r4 = r4.a((java.lang.String) r6)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = r4.getRewardedVideoSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r6 = r4.getInterstitialSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r7 = r4.getBannerSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r5, r10)     // Catch:{ Exception -> 0x015c }
            r4.setRewardedVideoSettings(r5)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r6, r11)     // Catch:{ Exception -> 0x015c }
            r4.setInterstitialSettings(r5)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r12)     // Catch:{ Exception -> 0x015c }
            r4.setBannerSettings(r5)     // Catch:{ Exception -> 0x015c }
            r4.setIsMultipleInstances(r13)     // Catch:{ Exception -> 0x015c }
            r4.setSubProviderId(r14)     // Catch:{ Exception -> 0x015c }
            r4.setAdSourceNameForEvents(r15)     // Catch:{ Exception -> 0x015c }
            goto L_0x0016
        L_0x00af:
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = r8.toLowerCase(r5)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.n r7 = r1.f8938b     // Catch:{ Exception -> 0x015c }
            boolean r7 = r7.b(r0)     // Catch:{ Exception -> 0x015c }
            if (r7 == 0) goto L_0x00dd
            java.lang.String r7 = "SupersonicAds"
            r17 = r2
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015c }
            java.lang.String r2 = r7.toLowerCase(r2)     // Catch:{ Exception -> 0x015c }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x015c }
            if (r2 != 0) goto L_0x00db
            java.lang.String r2 = "IronSource"
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015c }
            java.lang.String r2 = r2.toLowerCase(r7)     // Catch:{ Exception -> 0x015c }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x015c }
            if (r2 == 0) goto L_0x00df
        L_0x00db:
            r7 = 1
            goto L_0x00e0
        L_0x00dd:
            r17 = r2
        L_0x00df:
            r7 = 0
        L_0x00e0:
            if (r7 == 0) goto L_0x0132
            com.ironsource.mediationsdk.model.n r2 = r1.f8938b     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r2.a((java.lang.String) r0)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = r2.getRewardedVideoSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r7 = r2.getInterstitialSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r2 = r2.getBannerSettings()     // Catch:{ Exception -> 0x015c }
            r16 = r0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x015c }
            r0.<init>(r5)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x015c }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x015c }
            r5.<init>(r7)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x015c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x015c }
            r7.<init>(r2)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r0, r10)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r5, r11)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r12)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.NetworkSettings r0 = new com.ironsource.mediationsdk.model.NetworkSettings     // Catch:{ Exception -> 0x015c }
            r5 = r0
            r7 = r8
            r8 = r9
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x015c }
            r0.setIsMultipleInstances(r13)     // Catch:{ Exception -> 0x015c }
            r0.setSubProviderId(r14)     // Catch:{ Exception -> 0x015c }
            r0.setAdSourceNameForEvents(r15)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.n r2 = r1.f8938b     // Catch:{ Exception -> 0x015c }
            goto L_0x0148
        L_0x0132:
            r16 = r0
            com.ironsource.mediationsdk.model.NetworkSettings r0 = new com.ironsource.mediationsdk.model.NetworkSettings     // Catch:{ Exception -> 0x015c }
            r5 = r0
            r7 = r8
            r8 = r9
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x015c }
            r0.setIsMultipleInstances(r13)     // Catch:{ Exception -> 0x015c }
            r0.setSubProviderId(r14)     // Catch:{ Exception -> 0x015c }
            r0.setAdSourceNameForEvents(r15)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.n r2 = r1.f8938b     // Catch:{ Exception -> 0x015c }
        L_0x0148:
            r2.a((com.ironsource.mediationsdk.model.NetworkSettings) r0)     // Catch:{ Exception -> 0x015c }
            goto L_0x0150
        L_0x014c:
            r16 = r0
            r17 = r2
        L_0x0150:
            r0 = r16
            r2 = r17
            goto L_0x0016
        L_0x0156:
            com.ironsource.mediationsdk.model.n r0 = r1.f8938b     // Catch:{ Exception -> 0x015c }
            r0.b()     // Catch:{ Exception -> 0x015c }
            return
        L_0x015c:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.l.h():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:164:0x0557 A[Catch:{ Exception -> 0x058a }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x079d A[Catch:{ Exception -> 0x058a }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x08d9 A[Catch:{ Exception -> 0x058a }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0325 A[Catch:{ Exception -> 0x058a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
            r82 = this;
            r1 = r82
            java.lang.String r2 = "events"
            org.json.JSONObject r3 = r1.f8940d     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r4 = "configurations"
            org.json.JSONObject r3 = b(r3, r4)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r4 = "adUnits"
            org.json.JSONObject r4 = b(r3, r4)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r5 = "application"
            org.json.JSONObject r3 = b(r3, r5)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r5 = "rewardedVideo"
            org.json.JSONObject r5 = b(r4, r5)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r6 = "interstitial"
            org.json.JSONObject r6 = b(r4, r6)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r7 = "offerwall"
            org.json.JSONObject r7 = b(r4, r7)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r8 = "banner"
            org.json.JSONObject r4 = b(r4, r8)     // Catch:{ Exception -> 0x0ac4 }
            org.json.JSONObject r8 = b(r3, r2)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r9 = "loggers"
            org.json.JSONObject r9 = b(r3, r9)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r10 = "token"
            org.json.JSONObject r10 = b(r3, r10)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r11 = "segment"
            org.json.JSONObject r11 = b(r3, r11)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r12 = "auction"
            org.json.JSONObject r12 = b(r3, r12)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r13 = "crashReporter"
            org.json.JSONObject r13 = b(r3, r13)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r14 = "settings"
            org.json.JSONObject r14 = b(r3, r14)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r15 = "external"
            org.json.JSONObject r15 = b(r3, r15)     // Catch:{ Exception -> 0x0ac4 }
            r16 = r15
            java.lang.String r15 = "pixel"
            org.json.JSONObject r15 = b(r8, r15)     // Catch:{ Exception -> 0x0ac4 }
            r17 = r14
            r14 = 1
            if (r3 == 0) goto L_0x007d
            r18 = r11
            java.lang.String r11 = "uuidEnabled"
            boolean r11 = r3.optBoolean(r11, r14)     // Catch:{ Exception -> 0x0ac4 }
            android.content.Context r14 = r1.bw     // Catch:{ Exception -> 0x0ac4 }
            r19 = r13
            java.lang.String r13 = "uuidEnabled"
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveBooleanToSharedPrefs(r14, r13, r11)     // Catch:{ Exception -> 0x0ac4 }
            goto L_0x0081
        L_0x007d:
            r18 = r11
            r19 = r13
        L_0x0081:
            if (r8 == 0) goto L_0x009b
            java.lang.String r11 = "abt"
            java.lang.String r11 = r8.optString(r11)     // Catch:{ Exception -> 0x0ac4 }
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0ac4 }
            if (r13 != 0) goto L_0x009b
            com.ironsource.mediationsdk.a.d r13 = com.ironsource.mediationsdk.a.d.e()     // Catch:{ Exception -> 0x0ac4 }
            r13.p = r11     // Catch:{ Exception -> 0x0ac4 }
            com.ironsource.mediationsdk.a.h r13 = com.ironsource.mediationsdk.a.h.e()     // Catch:{ Exception -> 0x0ac4 }
            r13.p = r11     // Catch:{ Exception -> 0x0ac4 }
        L_0x009b:
            java.lang.String r11 = "triggerEvents"
            java.lang.String r13 = "maxEventsPerBatch"
            java.lang.String r14 = "maxNumberOfEvents"
            r20 = r9
            java.lang.String r9 = "backupThreshold"
            r21 = r6
            r22 = r7
            java.lang.String r6 = "serverEventsType"
            java.lang.String r7 = "serverEventsURL"
            r24 = r15
            java.lang.String r15 = "sendEventsToggle"
            r25 = r10
            java.lang.String r10 = "placements"
            r26 = r4
            java.lang.String r4 = "optIn"
            java.lang.String r1 = "optOut"
            r27 = r12
            java.lang.String r12 = "eventsCompression"
            r28 = r11
            java.lang.String r11 = ""
            r29 = 0
            r30 = r4
            if (r5 == 0) goto L_0x0357
            org.json.JSONArray r4 = r5.optJSONArray(r10)     // Catch:{ Exception -> 0x0352 }
            r31 = r10
            org.json.JSONObject r10 = b(r5, r2)     // Catch:{ Exception -> 0x0352 }
            r32 = r2
            java.lang.String r2 = "maxNumOfAdaptersToLoadOnStart"
            r33 = r4
            r4 = 2
            int r2 = a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "advancedLoading"
            r34 = r2
            r2 = 0
            int r4 = a(r5, r3, r4, r2)     // Catch:{ Exception -> 0x0352 }
            if (r4 <= 0) goto L_0x00ee
            r36 = r4
            r37 = 1
            goto L_0x00f2
        L_0x00ee:
            r36 = r34
            r37 = 0
        L_0x00f2:
            java.lang.String r2 = "adapterTimeOutInSeconds"
            r4 = 60
            int r38 = a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r2 = "loadRVInterval"
            r4 = 300(0x12c, float:4.2E-43)
            int r39 = a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r2 = "expiredDurationInMinutes"
            r4 = -1
            int r40 = a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r2 = "delayLoadFailure"
            r4 = 3
            int r43 = a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0352 }
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r10, r8)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "sendUltraEvents"
            r10 = 0
            boolean r45 = r2.optBoolean(r4, r10)     // Catch:{ Exception -> 0x0352 }
            boolean r46 = r2.optBoolean(r15, r10)     // Catch:{ Exception -> 0x0352 }
            boolean r47 = r2.optBoolean(r12, r10)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r48 = r2.optString(r7, r11)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r49 = r2.optString(r6, r11)     // Catch:{ Exception -> 0x0352 }
            r4 = -1
            int r50 = r2.optInt(r9, r4)     // Catch:{ Exception -> 0x0352 }
            int r51 = r2.optInt(r14, r4)     // Catch:{ Exception -> 0x0352 }
            r4 = 5000(0x1388, float:7.006E-42)
            int r52 = r2.optInt(r13, r4)     // Catch:{ Exception -> 0x0352 }
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0352 }
            if (r4 == 0) goto L_0x015d
            int r10 = r4.length()     // Catch:{ Exception -> 0x0352 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0352 }
            r34 = r1
            r57 = r13
            r1 = 0
        L_0x014b:
            int r13 = r4.length()     // Catch:{ Exception -> 0x0352 }
            if (r1 >= r13) goto L_0x015a
            int r13 = r4.optInt(r1)     // Catch:{ Exception -> 0x0352 }
            r10[r1] = r13     // Catch:{ Exception -> 0x0352 }
            int r1 = r1 + 1
            goto L_0x014b
        L_0x015a:
            r53 = r10
            goto L_0x0163
        L_0x015d:
            r34 = r1
            r57 = r13
            r53 = r29
        L_0x0163:
            r1 = r30
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0352 }
            if (r4 == 0) goto L_0x0186
            int r10 = r4.length()     // Catch:{ Exception -> 0x0352 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0352 }
            r30 = r1
            r13 = 0
        L_0x0174:
            int r1 = r4.length()     // Catch:{ Exception -> 0x0352 }
            if (r13 >= r1) goto L_0x0183
            int r1 = r4.optInt(r13)     // Catch:{ Exception -> 0x0352 }
            r10[r13] = r1     // Catch:{ Exception -> 0x0352 }
            int r13 = r13 + 1
            goto L_0x0174
        L_0x0183:
            r54 = r10
            goto L_0x018a
        L_0x0186:
            r30 = r1
            r54 = r29
        L_0x018a:
            r1 = r28
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0352 }
            if (r4 == 0) goto L_0x01ad
            int r10 = r4.length()     // Catch:{ Exception -> 0x0352 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0352 }
            r28 = r1
            r13 = 0
        L_0x019b:
            int r1 = r4.length()     // Catch:{ Exception -> 0x0352 }
            if (r13 >= r1) goto L_0x01aa
            int r1 = r4.optInt(r13)     // Catch:{ Exception -> 0x0352 }
            r10[r13] = r1     // Catch:{ Exception -> 0x0352 }
            int r13 = r13 + 1
            goto L_0x019b
        L_0x01aa:
            r55 = r10
            goto L_0x01b1
        L_0x01ad:
            r28 = r1
            r55 = r29
        L_0x01b1:
            java.lang.String r1 = "nonConnectivityEvents"
            org.json.JSONArray r1 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0352 }
            if (r1 == 0) goto L_0x01d2
            int r2 = r1.length()     // Catch:{ Exception -> 0x0352 }
            int[] r2 = new int[r2]     // Catch:{ Exception -> 0x0352 }
            r4 = 0
        L_0x01c0:
            int r10 = r1.length()     // Catch:{ Exception -> 0x0352 }
            if (r4 >= r10) goto L_0x01cf
            int r10 = r1.optInt(r4)     // Catch:{ Exception -> 0x0352 }
            r2[r4] = r10     // Catch:{ Exception -> 0x0352 }
            int r4 = r4 + 1
            goto L_0x01c0
        L_0x01cf:
            r56 = r2
            goto L_0x01d4
        L_0x01d2:
            r56 = r29
        L_0x01d4:
            com.ironsource.sdk.g.d r41 = new com.ironsource.sdk.g.d     // Catch:{ Exception -> 0x0352 }
            r44 = r41
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)     // Catch:{ Exception -> 0x0352 }
            if (r27 == 0) goto L_0x02a0
            java.lang.String r1 = "rewardedVideo"
            r2 = r27
            org.json.JSONObject r1 = b(r2, r1)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "auctionData"
            java.lang.String r59 = r2.optString(r4, r11)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "auctioneerURL"
            java.lang.String r60 = r2.optString(r4, r11)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "auctionTrials"
            r10 = 2
            int r61 = r2.optInt(r4, r10)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "auctionTimeout"
            r10 = r14
            r13 = 10000(0x2710, double:4.9407E-320)
            long r63 = r2.optLong(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "auctionSavedHistory"
            r13 = 15
            int r62 = r2.optInt(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "compressAuctionRequest"
            r13 = 0
            boolean r77 = r2.optBoolean(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "compressAuctionResponse"
            boolean r78 = r2.optBoolean(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "encryptionVersion"
            r14 = 1
            int r80 = r2.optInt(r4, r14)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "programmatic"
            boolean r65 = r1.optBoolean(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "minTimeBeforeFirstAuction"
            r13 = 2000(0x7d0, float:2.803E-42)
            int r4 = r1.optInt(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r13 = "auctionRetryInterval"
            r14 = 30000(0x7530, float:4.2039E-41)
            int r13 = r1.optInt(r13, r14)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r14 = "timeToWaitBeforeAuction"
            r27 = r2
            r2 = 5000(0x1388, float:7.006E-42)
            int r14 = r1.optInt(r14, r2)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r2 = "timeToWaitBeforeLoad"
            r44 = r10
            r10 = 50
            int r2 = r1.optInt(r2, r10)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r10 = "isAuctionOnShowStart"
            r45 = r9
            r9 = 0
            boolean r74 = r1.optBoolean(r10, r9)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r10 = "objectPerWaterfall"
            boolean r79 = r1.optBoolean(r10, r9)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r10 = "isLoadWhileShow"
            boolean r75 = r1.optBoolean(r10, r9)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r9 = "timeToDeleteOldWaterfallAfterAuction"
            r10 = 30000(0x7530, float:4.2039E-41)
            int r76 = r1.optInt(r9, r10)     // Catch:{ Exception -> 0x0352 }
            com.ironsource.mediationsdk.utils.c r9 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0352 }
            r10 = r6
            r46 = r7
            long r6 = (long) r4     // Catch:{ Exception -> 0x0352 }
            r66 = r6
            long r6 = (long) r13     // Catch:{ Exception -> 0x0352 }
            r68 = r6
            long r6 = (long) r14     // Catch:{ Exception -> 0x0352 }
            r70 = r6
            long r6 = (long) r2     // Catch:{ Exception -> 0x0352 }
            r72 = r6
            r81 = 0
            r58 = r9
            r58.<init>(r59, r60, r61, r62, r63, r65, r66, r68, r70, r72, r74, r75, r76, r77, r78, r79, r80, r81)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r2 = "disableLoadWhileShowSupportFor"
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0352 }
            if (r1 == 0) goto L_0x029d
            r2 = 0
        L_0x0285:
            int r4 = r1.length()     // Catch:{ Exception -> 0x0352 }
            if (r2 >= r4) goto L_0x029d
            java.lang.String r4 = r1.optString(r2)     // Catch:{ Exception -> 0x0352 }
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0352 }
            if (r6 != 0) goto L_0x029a
            java.util.ArrayList<java.lang.String> r6 = r9.o     // Catch:{ Exception -> 0x0352 }
            r6.add(r4)     // Catch:{ Exception -> 0x0352 }
        L_0x029a:
            int r2 = r2 + 1
            goto L_0x0285
        L_0x029d:
            r42 = r9
            goto L_0x02ae
        L_0x02a0:
            r10 = r6
            r46 = r7
            r45 = r9
            r44 = r14
            com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0352 }
            r1.<init>()     // Catch:{ Exception -> 0x0352 }
            r42 = r1
        L_0x02ae:
            com.ironsource.mediationsdk.model.o r1 = new com.ironsource.mediationsdk.model.o     // Catch:{ Exception -> 0x0352 }
            r35 = r1
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ Exception -> 0x0352 }
            if (r33 == 0) goto L_0x0331
            r2 = 0
        L_0x02b8:
            int r4 = r33.length()     // Catch:{ Exception -> 0x0352 }
            if (r2 >= r4) goto L_0x0331
            r4 = r33
            org.json.JSONObject r6 = r4.optJSONObject(r2)     // Catch:{ Exception -> 0x0352 }
            if (r6 == 0) goto L_0x0311
            java.lang.String r7 = "placementId"
            r9 = -1
            int r36 = r6.optInt(r7, r9)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r7 = "placementName"
            java.lang.String r37 = r6.optString(r7, r11)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r7 = "isDefault"
            r9 = 0
            boolean r38 = r6.optBoolean(r7, r9)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r7 = "virtualItemName"
            java.lang.String r39 = r6.optString(r7, r11)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r7 = "virtualItemCount"
            r9 = -1
            int r40 = r6.optInt(r7, r9)     // Catch:{ Exception -> 0x0352 }
            com.ironsource.mediationsdk.model.k r6 = a((org.json.JSONObject) r6)     // Catch:{ Exception -> 0x0352 }
            if (r36 < 0) goto L_0x0311
            boolean r7 = android.text.TextUtils.isEmpty(r37)     // Catch:{ Exception -> 0x0352 }
            if (r7 != 0) goto L_0x0311
            boolean r7 = android.text.TextUtils.isEmpty(r39)     // Catch:{ Exception -> 0x0352 }
            if (r7 != 0) goto L_0x0311
            if (r40 <= 0) goto L_0x0311
            com.ironsource.mediationsdk.model.Placement r7 = new com.ironsource.mediationsdk.model.Placement     // Catch:{ Exception -> 0x0352 }
            r35 = r7
            r41 = r6
            r35.<init>(r36, r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x0352 }
            if (r6 == 0) goto L_0x030e
            r6 = r82
            android.content.Context r9 = r6.bw     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.k.a((android.content.Context) r9, (com.ironsource.mediationsdk.model.Placement) r7)     // Catch:{ Exception -> 0x058a }
            goto L_0x0315
        L_0x030e:
            r6 = r82
            goto L_0x0315
        L_0x0311:
            r6 = r82
            r7 = r29
        L_0x0315:
            if (r7 == 0) goto L_0x032c
            if (r7 == 0) goto L_0x032c
            java.util.ArrayList<com.ironsource.mediationsdk.model.Placement> r9 = r1.f8789a     // Catch:{ Exception -> 0x058a }
            r9.add(r7)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.Placement r9 = r1.k     // Catch:{ Exception -> 0x058a }
            if (r9 != 0) goto L_0x0325
        L_0x0322:
            r1.k = r7     // Catch:{ Exception -> 0x058a }
            goto L_0x032c
        L_0x0325:
            int r9 = r7.getPlacementId()     // Catch:{ Exception -> 0x058a }
            if (r9 != 0) goto L_0x032c
            goto L_0x0322
        L_0x032c:
            int r2 = r2 + 1
            r33 = r4
            goto L_0x02b8
        L_0x0331:
            r6 = r82
            java.lang.String r2 = "backFill"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ Exception -> 0x058a }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x058a }
            if (r4 != 0) goto L_0x0341
            r1.f8794f = r2     // Catch:{ Exception -> 0x058a }
        L_0x0341:
            java.lang.String r2 = "premium"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ Exception -> 0x058a }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x058a }
            if (r4 != 0) goto L_0x034f
            r1.f8795g = r2     // Catch:{ Exception -> 0x058a }
        L_0x034f:
            r36 = r1
            goto L_0x036a
        L_0x0352:
            r0 = move-exception
            r6 = r82
            goto L_0x0ac6
        L_0x0357:
            r34 = r1
            r32 = r2
            r46 = r7
            r45 = r9
            r31 = r10
            r57 = r13
            r44 = r14
            r10 = r6
            r6 = r82
            r36 = r29
        L_0x036a:
            if (r21 == 0) goto L_0x058d
            r1 = r21
            r2 = r31
            org.json.JSONArray r4 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            r5 = r32
            org.json.JSONObject r7 = b(r1, r5)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "maxNumOfAdaptersToLoadOnStart"
            r13 = 2
            int r9 = a(r1, r3, r9, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r13 = "advancedLoading"
            r14 = 0
            int r13 = a(r1, r3, r13, r14)     // Catch:{ Exception -> 0x058a }
            if (r13 <= 0) goto L_0x038f
            r38 = r13
            r39 = 1
            goto L_0x0393
        L_0x038f:
            r38 = r9
            r39 = 0
        L_0x0393:
            java.lang.String r9 = "adapterTimeOutInSeconds"
            r13 = 60
            int r40 = a(r1, r3, r9, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "delayLoadFailure"
            r13 = 3
            int r43 = a(r1, r3, r9, r13)     // Catch:{ Exception -> 0x058a }
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r8)     // Catch:{ Exception -> 0x058a }
            r9 = 0
            boolean r60 = r7.optBoolean(r15, r9)     // Catch:{ Exception -> 0x058a }
            boolean r61 = r7.optBoolean(r12, r9)     // Catch:{ Exception -> 0x058a }
            r9 = r46
            java.lang.String r62 = r7.optString(r9, r11)     // Catch:{ Exception -> 0x058a }
            java.lang.String r63 = r7.optString(r10, r11)     // Catch:{ Exception -> 0x058a }
            r13 = r45
            r14 = -1
            int r64 = r7.optInt(r13, r14)     // Catch:{ Exception -> 0x058a }
            r45 = r13
            r13 = r44
            int r65 = r7.optInt(r13, r14)     // Catch:{ Exception -> 0x058a }
            r44 = r13
            r14 = r57
            r13 = 5000(0x1388, float:7.006E-42)
            int r66 = r7.optInt(r14, r13)     // Catch:{ Exception -> 0x058a }
            r57 = r14
            r13 = r34
            org.json.JSONArray r14 = r7.optJSONArray(r13)     // Catch:{ Exception -> 0x058a }
            if (r14 == 0) goto L_0x03fb
            r34 = r13
            int r13 = r14.length()     // Catch:{ Exception -> 0x058a }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x058a }
            r46 = r9
            r21 = r10
            r10 = 0
        L_0x03e9:
            int r9 = r14.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r9) goto L_0x03f8
            int r9 = r14.optInt(r10)     // Catch:{ Exception -> 0x058a }
            r13[r10] = r9     // Catch:{ Exception -> 0x058a }
            int r10 = r10 + 1
            goto L_0x03e9
        L_0x03f8:
            r67 = r13
            goto L_0x0403
        L_0x03fb:
            r46 = r9
            r21 = r10
            r34 = r13
            r67 = r29
        L_0x0403:
            r9 = r30
            org.json.JSONArray r10 = r7.optJSONArray(r9)     // Catch:{ Exception -> 0x058a }
            if (r10 == 0) goto L_0x0426
            int r13 = r10.length()     // Catch:{ Exception -> 0x058a }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x058a }
            r30 = r9
            r14 = 0
        L_0x0414:
            int r9 = r10.length()     // Catch:{ Exception -> 0x058a }
            if (r14 >= r9) goto L_0x0423
            int r9 = r10.optInt(r14)     // Catch:{ Exception -> 0x058a }
            r13[r14] = r9     // Catch:{ Exception -> 0x058a }
            int r14 = r14 + 1
            goto L_0x0414
        L_0x0423:
            r68 = r13
            goto L_0x042a
        L_0x0426:
            r30 = r9
            r68 = r29
        L_0x042a:
            r9 = r28
            org.json.JSONArray r10 = r7.optJSONArray(r9)     // Catch:{ Exception -> 0x058a }
            if (r10 == 0) goto L_0x044d
            int r13 = r10.length()     // Catch:{ Exception -> 0x058a }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x058a }
            r28 = r9
            r14 = 0
        L_0x043b:
            int r9 = r10.length()     // Catch:{ Exception -> 0x058a }
            if (r14 >= r9) goto L_0x044a
            int r9 = r10.optInt(r14)     // Catch:{ Exception -> 0x058a }
            r13[r14] = r9     // Catch:{ Exception -> 0x058a }
            int r14 = r14 + 1
            goto L_0x043b
        L_0x044a:
            r69 = r13
            goto L_0x0451
        L_0x044d:
            r28 = r9
            r69 = r29
        L_0x0451:
            java.lang.String r9 = "nonConnectivityEvents"
            org.json.JSONArray r7 = r7.optJSONArray(r9)     // Catch:{ Exception -> 0x058a }
            if (r7 == 0) goto L_0x0472
            int r9 = r7.length()     // Catch:{ Exception -> 0x058a }
            int[] r9 = new int[r9]     // Catch:{ Exception -> 0x058a }
            r10 = 0
        L_0x0460:
            int r13 = r7.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r13) goto L_0x046f
            int r13 = r7.optInt(r10)     // Catch:{ Exception -> 0x058a }
            r9[r10] = r13     // Catch:{ Exception -> 0x058a }
            int r10 = r10 + 1
            goto L_0x0460
        L_0x046f:
            r70 = r9
            goto L_0x0474
        L_0x0472:
            r70 = r29
        L_0x0474:
            com.ironsource.sdk.g.d r41 = new com.ironsource.sdk.g.d     // Catch:{ Exception -> 0x058a }
            r59 = 0
            r58 = r41
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ Exception -> 0x058a }
            if (r27 == 0) goto L_0x04ed
            java.lang.String r7 = "interstitial"
            r9 = r27
            org.json.JSONObject r7 = b(r9, r7)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "auctionData"
            java.lang.String r59 = r9.optString(r10, r11)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "auctioneerURL"
            java.lang.String r60 = r9.optString(r10, r11)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "auctionTrials"
            r13 = 2
            int r61 = r9.optInt(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "auctionSavedHistory"
            r13 = 15
            int r62 = r9.optInt(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "auctionTimeout"
            r13 = 10000(0x2710, double:4.9407E-320)
            long r63 = r9.optLong(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "compressAuctionRequest"
            r13 = 0
            boolean r77 = r9.optBoolean(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "compressAuctionResponse"
            boolean r78 = r9.optBoolean(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "encryptionVersion"
            r14 = 1
            int r80 = r9.optInt(r10, r14)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "programmatic"
            boolean r65 = r7.optBoolean(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "objectPerWaterfall"
            boolean r79 = r7.optBoolean(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "minTimeBeforeFirstAuction"
            r13 = 2000(0x7d0, float:2.803E-42)
            int r7 = r7.optInt(r10, r13)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.c r10 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x058a }
            long r13 = (long) r7     // Catch:{ Exception -> 0x058a }
            r66 = r13
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 1
            r75 = 1
            r76 = 0
            r81 = 0
            r58 = r10
            r58.<init>(r59, r60, r61, r62, r63, r65, r66, r68, r70, r72, r74, r75, r76, r77, r78, r79, r80, r81)     // Catch:{ Exception -> 0x058a }
            r42 = r10
            goto L_0x04f6
        L_0x04ed:
            r9 = r27
            com.ironsource.mediationsdk.utils.c r7 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x058a }
            r7.<init>()     // Catch:{ Exception -> 0x058a }
            r42 = r7
        L_0x04f6:
            com.ironsource.mediationsdk.model.h r7 = new com.ironsource.mediationsdk.model.h     // Catch:{ Exception -> 0x058a }
            r37 = r7
            r37.<init>(r38, r39, r40, r41, r42, r43)     // Catch:{ Exception -> 0x058a }
            if (r4 == 0) goto L_0x0567
            r10 = 0
        L_0x0500:
            int r13 = r4.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r13) goto L_0x0567
            org.json.JSONObject r13 = r4.optJSONObject(r10)     // Catch:{ Exception -> 0x058a }
            if (r13 == 0) goto L_0x053f
            java.lang.String r14 = "placementId"
            r27 = r4
            r4 = -1
            int r14 = r13.optInt(r14, r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "placementName"
            java.lang.String r4 = r13.optString(r4, r11)     // Catch:{ Exception -> 0x058a }
            r31 = r9
            java.lang.String r9 = "isDefault"
            r32 = r11
            r11 = 0
            boolean r9 = r13.optBoolean(r9, r11)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.k r11 = a((org.json.JSONObject) r13)     // Catch:{ Exception -> 0x058a }
            if (r14 < 0) goto L_0x0545
            boolean r13 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x058a }
            if (r13 != 0) goto L_0x0545
            com.ironsource.mediationsdk.model.InterstitialPlacement r13 = new com.ironsource.mediationsdk.model.InterstitialPlacement     // Catch:{ Exception -> 0x058a }
            r13.<init>(r14, r4, r9, r11)     // Catch:{ Exception -> 0x058a }
            if (r11 == 0) goto L_0x0547
            android.content.Context r4 = r6.bw     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.k.a((android.content.Context) r4, (com.ironsource.mediationsdk.model.InterstitialPlacement) r13)     // Catch:{ Exception -> 0x058a }
            goto L_0x0547
        L_0x053f:
            r27 = r4
            r31 = r9
            r32 = r11
        L_0x0545:
            r13 = r29
        L_0x0547:
            if (r13 == 0) goto L_0x055e
            if (r13 == 0) goto L_0x055e
            java.util.ArrayList<com.ironsource.mediationsdk.model.InterstitialPlacement> r4 = r7.f8749a     // Catch:{ Exception -> 0x058a }
            r4.add(r13)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.InterstitialPlacement r4 = r7.j     // Catch:{ Exception -> 0x058a }
            if (r4 != 0) goto L_0x0557
        L_0x0554:
            r7.j = r13     // Catch:{ Exception -> 0x058a }
            goto L_0x055e
        L_0x0557:
            int r4 = r13.getPlacementId()     // Catch:{ Exception -> 0x058a }
            if (r4 != 0) goto L_0x055e
            goto L_0x0554
        L_0x055e:
            int r10 = r10 + 1
            r4 = r27
            r9 = r31
            r11 = r32
            goto L_0x0500
        L_0x0567:
            r31 = r9
            r32 = r11
            java.lang.String r4 = "backFill"
            java.lang.String r4 = r1.optString(r4)     // Catch:{ Exception -> 0x058a }
            boolean r9 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x058a }
            if (r9 != 0) goto L_0x0579
            r7.f8755g = r4     // Catch:{ Exception -> 0x058a }
        L_0x0579:
            java.lang.String r4 = "premium"
            java.lang.String r1 = r1.optString(r4)     // Catch:{ Exception -> 0x058a }
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x058a }
            if (r4 != 0) goto L_0x0587
            r7.f8756h = r1     // Catch:{ Exception -> 0x058a }
        L_0x0587:
            r37 = r7
            goto L_0x0599
        L_0x058a:
            r0 = move-exception
            goto L_0x0ac6
        L_0x058d:
            r21 = r10
            r2 = r31
            r5 = r32
            r32 = r11
            r31 = r27
            r37 = r29
        L_0x0599:
            if (r26 == 0) goto L_0x07b4
            r1 = r26
            org.json.JSONArray r4 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            org.json.JSONObject r7 = b(r1, r5)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "maxNumOfAdaptersToLoadOnStart"
            r10 = 1
            int r48 = a(r1, r3, r9, r10)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "atim"
            boolean r10 = r1.has(r9)     // Catch:{ Exception -> 0x058a }
            r13 = 0
            if (r10 == 0) goto L_0x05bb
            long r9 = r1.optLong(r9, r13)     // Catch:{ Exception -> 0x058a }
            goto L_0x05c7
        L_0x05bb:
            boolean r10 = r3.has(r9)     // Catch:{ Exception -> 0x058a }
            if (r10 == 0) goto L_0x05c6
            long r9 = r3.optLong(r9, r13)     // Catch:{ Exception -> 0x058a }
            goto L_0x05c7
        L_0x05c6:
            r9 = r13
        L_0x05c7:
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x05ce
            r49 = 10000(0x2710, double:4.9407E-320)
            goto L_0x05d0
        L_0x05ce:
            r49 = r9
        L_0x05d0:
            java.lang.String r9 = "delayLoadFailure"
            r10 = 3
            int r54 = a(r1, r3, r9, r10)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "bannerInterval"
            r10 = 60
            int r52 = a(r1, r3, r9, r10)     // Catch:{ Exception -> 0x058a }
            org.json.JSONObject r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r8)     // Catch:{ Exception -> 0x058a }
            r7 = 0
            boolean r60 = r1.optBoolean(r15, r7)     // Catch:{ Exception -> 0x058a }
            boolean r61 = r1.optBoolean(r12, r7)     // Catch:{ Exception -> 0x058a }
            r9 = r32
            r7 = r46
            java.lang.String r62 = r1.optString(r7, r9)     // Catch:{ Exception -> 0x058a }
            r10 = r21
            java.lang.String r63 = r1.optString(r10, r9)     // Catch:{ Exception -> 0x058a }
            r11 = r45
            r13 = -1
            int r64 = r1.optInt(r11, r13)     // Catch:{ Exception -> 0x058a }
            r14 = r44
            int r65 = r1.optInt(r14, r13)     // Catch:{ Exception -> 0x058a }
            r21 = r3
            r13 = r57
            r3 = 5000(0x1388, float:7.006E-42)
            int r66 = r1.optInt(r13, r3)     // Catch:{ Exception -> 0x058a }
            r26 = r2
            r3 = r34
            org.json.JSONArray r2 = r1.optJSONArray(r3)     // Catch:{ Exception -> 0x058a }
            if (r2 == 0) goto L_0x063a
            r34 = r3
            int r3 = r2.length()     // Catch:{ Exception -> 0x058a }
            int[] r3 = new int[r3]     // Catch:{ Exception -> 0x058a }
            r57 = r13
            r44 = r14
            r13 = 0
        L_0x0628:
            int r14 = r2.length()     // Catch:{ Exception -> 0x058a }
            if (r13 >= r14) goto L_0x0637
            int r14 = r2.optInt(r13)     // Catch:{ Exception -> 0x058a }
            r3[r13] = r14     // Catch:{ Exception -> 0x058a }
            int r13 = r13 + 1
            goto L_0x0628
        L_0x0637:
            r67 = r3
            goto L_0x0642
        L_0x063a:
            r34 = r3
            r57 = r13
            r44 = r14
            r67 = r29
        L_0x0642:
            r2 = r30
            org.json.JSONArray r3 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            if (r3 == 0) goto L_0x0665
            int r13 = r3.length()     // Catch:{ Exception -> 0x058a }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x058a }
            r30 = r2
            r14 = 0
        L_0x0653:
            int r2 = r3.length()     // Catch:{ Exception -> 0x058a }
            if (r14 >= r2) goto L_0x0662
            int r2 = r3.optInt(r14)     // Catch:{ Exception -> 0x058a }
            r13[r14] = r2     // Catch:{ Exception -> 0x058a }
            int r14 = r14 + 1
            goto L_0x0653
        L_0x0662:
            r68 = r13
            goto L_0x0669
        L_0x0665:
            r30 = r2
            r68 = r29
        L_0x0669:
            r2 = r28
            org.json.JSONArray r3 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            if (r3 == 0) goto L_0x068c
            int r13 = r3.length()     // Catch:{ Exception -> 0x058a }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x058a }
            r28 = r2
            r14 = 0
        L_0x067a:
            int r2 = r3.length()     // Catch:{ Exception -> 0x058a }
            if (r14 >= r2) goto L_0x0689
            int r2 = r3.optInt(r14)     // Catch:{ Exception -> 0x058a }
            r13[r14] = r2     // Catch:{ Exception -> 0x058a }
            int r14 = r14 + 1
            goto L_0x067a
        L_0x0689:
            r69 = r13
            goto L_0x0690
        L_0x068c:
            r28 = r2
            r69 = r29
        L_0x0690:
            java.lang.String r2 = "nonConnectivityEvents"
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            if (r1 == 0) goto L_0x06b1
            int r2 = r1.length()     // Catch:{ Exception -> 0x058a }
            int[] r2 = new int[r2]     // Catch:{ Exception -> 0x058a }
            r3 = 0
        L_0x069f:
            int r13 = r1.length()     // Catch:{ Exception -> 0x058a }
            if (r3 >= r13) goto L_0x06ae
            int r13 = r1.optInt(r3)     // Catch:{ Exception -> 0x058a }
            r2[r3] = r13     // Catch:{ Exception -> 0x058a }
            int r3 = r3 + 1
            goto L_0x069f
        L_0x06ae:
            r70 = r2
            goto L_0x06b3
        L_0x06b1:
            r70 = r29
        L_0x06b3:
            com.ironsource.sdk.g.d r51 = new com.ironsource.sdk.g.d     // Catch:{ Exception -> 0x058a }
            r59 = 0
            r58 = r51
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ Exception -> 0x058a }
            if (r31 == 0) goto L_0x0733
            java.lang.String r1 = "banner"
            r2 = r31
            org.json.JSONObject r1 = b(r2, r1)     // Catch:{ Exception -> 0x058a }
            if (r1 == 0) goto L_0x072d
            java.lang.String r3 = "auctionData"
            java.lang.String r59 = r2.optString(r3, r9)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "auctioneerURL"
            java.lang.String r60 = r2.optString(r3, r9)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "auctionTrials"
            r13 = 2
            int r61 = r2.optInt(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "auctionSavedHistory"
            r13 = 15
            int r62 = r2.optInt(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "auctionTimeout"
            r13 = 10000(0x2710, double:4.9407E-320)
            long r63 = r2.optLong(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "compressAuctionRequest"
            r13 = 0
            boolean r77 = r2.optBoolean(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "compressAuctionResponse"
            boolean r78 = r2.optBoolean(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "encryptionVersion"
            r14 = 1
            int r80 = r2.optInt(r3, r14)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "programmatic"
            boolean r65 = r1.optBoolean(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "minTimeBeforeFirstAuction"
            r13 = 2000(0x7d0, float:2.803E-42)
            int r3 = r1.optInt(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r13 = "shouldSendBannerBURLFromImpression"
            r14 = 1
            boolean r81 = r1.optBoolean(r13, r14)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x058a }
            long r13 = (long) r3     // Catch:{ Exception -> 0x058a }
            r66 = r13
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 1
            r75 = 1
            r76 = 0
            r79 = 0
            r58 = r1
            r58.<init>(r59, r60, r61, r62, r63, r65, r66, r68, r70, r72, r74, r75, r76, r77, r78, r79, r80, r81)     // Catch:{ Exception -> 0x058a }
            goto L_0x073a
        L_0x072d:
            com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x058a }
            r1.<init>()     // Catch:{ Exception -> 0x058a }
            goto L_0x073a
        L_0x0733:
            r2 = r31
            com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x058a }
            r1.<init>()     // Catch:{ Exception -> 0x058a }
        L_0x073a:
            r53 = r1
            com.ironsource.mediationsdk.model.e r1 = new com.ironsource.mediationsdk.model.e     // Catch:{ Exception -> 0x058a }
            r47 = r1
            r47.<init>(r48, r49, r51, r52, r53, r54)     // Catch:{ Exception -> 0x058a }
            if (r4 == 0) goto L_0x07ad
            r3 = 0
        L_0x0746:
            int r13 = r4.length()     // Catch:{ Exception -> 0x058a }
            if (r3 >= r13) goto L_0x07ad
            org.json.JSONObject r13 = r4.optJSONObject(r3)     // Catch:{ Exception -> 0x058a }
            if (r13 == 0) goto L_0x0785
            java.lang.String r14 = "placementId"
            r23 = r4
            r4 = -1
            int r14 = r13.optInt(r14, r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "placementName"
            java.lang.String r4 = r13.optString(r4, r9)     // Catch:{ Exception -> 0x058a }
            r27 = r2
            java.lang.String r2 = "isDefault"
            r45 = r11
            r11 = 0
            boolean r2 = r13.optBoolean(r2, r11)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.k r11 = a((org.json.JSONObject) r13)     // Catch:{ Exception -> 0x058a }
            if (r14 < 0) goto L_0x078b
            boolean r13 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x058a }
            if (r13 != 0) goto L_0x078b
            com.ironsource.mediationsdk.model.f r13 = new com.ironsource.mediationsdk.model.f     // Catch:{ Exception -> 0x058a }
            r13.<init>(r14, r4, r2, r11)     // Catch:{ Exception -> 0x058a }
            if (r11 == 0) goto L_0x078d
            android.content.Context r2 = r6.bw     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.k.a((android.content.Context) r2, (com.ironsource.mediationsdk.model.f) r13)     // Catch:{ Exception -> 0x058a }
            goto L_0x078d
        L_0x0785:
            r27 = r2
            r23 = r4
            r45 = r11
        L_0x078b:
            r13 = r29
        L_0x078d:
            if (r13 == 0) goto L_0x07a4
            if (r13 == 0) goto L_0x07a4
            java.util.ArrayList<com.ironsource.mediationsdk.model.f> r2 = r1.f8738c     // Catch:{ Exception -> 0x058a }
            r2.add(r13)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.f r2 = r1.f8739d     // Catch:{ Exception -> 0x058a }
            if (r2 != 0) goto L_0x079d
        L_0x079a:
            r1.f8739d = r13     // Catch:{ Exception -> 0x058a }
            goto L_0x07a4
        L_0x079d:
            int r2 = r13.getPlacementId()     // Catch:{ Exception -> 0x058a }
            if (r2 != 0) goto L_0x07a4
            goto L_0x079a
        L_0x07a4:
            int r3 = r3 + 1
            r4 = r23
            r2 = r27
            r11 = r45
            goto L_0x0746
        L_0x07ad:
            r27 = r2
            r45 = r11
            r39 = r1
            goto L_0x07c2
        L_0x07b4:
            r26 = r2
            r10 = r21
            r27 = r31
            r9 = r32
            r7 = r46
            r21 = r3
            r39 = r29
        L_0x07c2:
            if (r22 == 0) goto L_0x08e4
            r1 = r22
            org.json.JSONObject r2 = b(r1, r5)     // Catch:{ Exception -> 0x058a }
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r2, r8)     // Catch:{ Exception -> 0x058a }
            r3 = 0
            boolean r60 = r2.optBoolean(r15, r3)     // Catch:{ Exception -> 0x058a }
            boolean r61 = r2.optBoolean(r12, r3)     // Catch:{ Exception -> 0x058a }
            java.lang.String r62 = r2.optString(r7, r9)     // Catch:{ Exception -> 0x058a }
            java.lang.String r63 = r2.optString(r10, r9)     // Catch:{ Exception -> 0x058a }
            r3 = r45
            r4 = -1
            int r64 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x058a }
            r3 = r44
            int r65 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x058a }
            r3 = r57
            r4 = 5000(0x1388, float:7.006E-42)
            int r66 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x058a }
            r3 = r34
            org.json.JSONArray r4 = r2.optJSONArray(r3)     // Catch:{ Exception -> 0x058a }
            if (r4 == 0) goto L_0x0815
            int r7 = r4.length()     // Catch:{ Exception -> 0x058a }
            int[] r7 = new int[r7]     // Catch:{ Exception -> 0x058a }
            r10 = 0
        L_0x0803:
            int r11 = r4.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r11) goto L_0x0812
            int r11 = r4.optInt(r10)     // Catch:{ Exception -> 0x058a }
            r7[r10] = r11     // Catch:{ Exception -> 0x058a }
            int r10 = r10 + 1
            goto L_0x0803
        L_0x0812:
            r67 = r7
            goto L_0x0817
        L_0x0815:
            r67 = r29
        L_0x0817:
            r4 = r30
            org.json.JSONArray r7 = r2.optJSONArray(r4)     // Catch:{ Exception -> 0x058a }
            if (r7 == 0) goto L_0x0838
            int r10 = r7.length()     // Catch:{ Exception -> 0x058a }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x058a }
            r11 = 0
        L_0x0826:
            int r13 = r7.length()     // Catch:{ Exception -> 0x058a }
            if (r11 >= r13) goto L_0x0835
            int r13 = r7.optInt(r11)     // Catch:{ Exception -> 0x058a }
            r10[r11] = r13     // Catch:{ Exception -> 0x058a }
            int r11 = r11 + 1
            goto L_0x0826
        L_0x0835:
            r68 = r10
            goto L_0x083a
        L_0x0838:
            r68 = r29
        L_0x083a:
            r7 = r28
            org.json.JSONArray r7 = r2.optJSONArray(r7)     // Catch:{ Exception -> 0x058a }
            if (r7 == 0) goto L_0x085b
            int r10 = r7.length()     // Catch:{ Exception -> 0x058a }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x058a }
            r11 = 0
        L_0x0849:
            int r13 = r7.length()     // Catch:{ Exception -> 0x058a }
            if (r11 >= r13) goto L_0x0858
            int r13 = r7.optInt(r11)     // Catch:{ Exception -> 0x058a }
            r10[r11] = r13     // Catch:{ Exception -> 0x058a }
            int r11 = r11 + 1
            goto L_0x0849
        L_0x0858:
            r69 = r10
            goto L_0x085d
        L_0x085b:
            r69 = r29
        L_0x085d:
            java.lang.String r7 = "nonConnectivityEvents"
            org.json.JSONArray r2 = r2.optJSONArray(r7)     // Catch:{ Exception -> 0x058a }
            if (r2 == 0) goto L_0x087e
            int r7 = r2.length()     // Catch:{ Exception -> 0x058a }
            int[] r7 = new int[r7]     // Catch:{ Exception -> 0x058a }
            r10 = 0
        L_0x086c:
            int r11 = r2.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r11) goto L_0x087b
            int r11 = r2.optInt(r10)     // Catch:{ Exception -> 0x058a }
            r7[r10] = r11     // Catch:{ Exception -> 0x058a }
            int r10 = r10 + 1
            goto L_0x086c
        L_0x087b:
            r70 = r7
            goto L_0x0880
        L_0x087e:
            r70 = r29
        L_0x0880:
            com.ironsource.sdk.g.d r2 = new com.ironsource.sdk.g.d     // Catch:{ Exception -> 0x058a }
            r59 = 0
            r58 = r2
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.i r7 = new com.ironsource.mediationsdk.model.i     // Catch:{ Exception -> 0x058a }
            r7.<init>(r2)     // Catch:{ Exception -> 0x058a }
            r7.f8760d = r1     // Catch:{ Exception -> 0x058a }
            r2 = r26
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            if (r1 == 0) goto L_0x08e1
            r2 = 0
        L_0x0899:
            int r10 = r1.length()     // Catch:{ Exception -> 0x058a }
            if (r2 >= r10) goto L_0x08e1
            org.json.JSONObject r10 = r1.optJSONObject(r2)     // Catch:{ Exception -> 0x058a }
            if (r10 == 0) goto L_0x08c7
            java.lang.String r11 = "placementId"
            r13 = -1
            int r11 = r10.optInt(r11, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r14 = "placementName"
            java.lang.String r14 = r10.optString(r14, r9)     // Catch:{ Exception -> 0x058a }
            java.lang.String r15 = "isDefault"
            r13 = 0
            boolean r10 = r10.optBoolean(r15, r13)     // Catch:{ Exception -> 0x058a }
            if (r11 < 0) goto L_0x08c7
            boolean r13 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Exception -> 0x058a }
            if (r13 != 0) goto L_0x08c7
            com.ironsource.mediationsdk.model.j r13 = new com.ironsource.mediationsdk.model.j     // Catch:{ Exception -> 0x058a }
            r13.<init>(r11, r14, r10)     // Catch:{ Exception -> 0x058a }
            goto L_0x08c9
        L_0x08c7:
            r13 = r29
        L_0x08c9:
            if (r13 == 0) goto L_0x08de
            if (r13 == 0) goto L_0x08de
            java.util.ArrayList<com.ironsource.mediationsdk.model.j> r10 = r7.f8757a     // Catch:{ Exception -> 0x058a }
            r10.add(r13)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.j r10 = r7.f8758b     // Catch:{ Exception -> 0x058a }
            if (r10 != 0) goto L_0x08d9
        L_0x08d6:
            r7.f8758b = r13     // Catch:{ Exception -> 0x058a }
            goto L_0x08de
        L_0x08d9:
            int r10 = r13.f8761a     // Catch:{ Exception -> 0x058a }
            if (r10 != 0) goto L_0x08de
            goto L_0x08d6
        L_0x08de:
            int r2 = r2 + 1
            goto L_0x0899
        L_0x08e1:
            r38 = r7
            goto L_0x08ea
        L_0x08e4:
            r4 = r30
            r3 = r34
            r38 = r29
        L_0x08ea:
            com.ironsource.mediationsdk.utils.p r1 = new com.ironsource.mediationsdk.utils.p     // Catch:{ Exception -> 0x058a }
            r1.<init>()     // Catch:{ Exception -> 0x058a }
            if (r25 == 0) goto L_0x0930
            java.lang.String r2 = "optInKeys"
            r7 = r25
            org.json.JSONArray r2 = r7.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            if (r2 == 0) goto L_0x0914
            r10 = 0
        L_0x08fc:
            int r11 = r2.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r11) goto L_0x0914
            java.lang.String r11 = r2.optString(r10)     // Catch:{ Exception -> 0x058a }
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x058a }
            if (r13 != 0) goto L_0x0911
            java.util.ArrayList<java.lang.String> r13 = r1.f8960a     // Catch:{ Exception -> 0x058a }
            r13.add(r11)     // Catch:{ Exception -> 0x058a }
        L_0x0911:
            int r10 = r10 + 1
            goto L_0x08fc
        L_0x0914:
            java.lang.String r2 = "tokenGenericParams"
            org.json.JSONObject r2 = r7.optJSONObject(r2)     // Catch:{ Exception -> 0x058a }
            if (r2 == 0) goto L_0x091e
            r1.f8962c = r2     // Catch:{ Exception -> 0x058a }
        L_0x091e:
            java.lang.String r2 = "oneToken"
            r10 = 0
            boolean r2 = r7.optBoolean(r2, r10)     // Catch:{ Exception -> 0x058a }
            r1.f8963d = r2     // Catch:{ Exception -> 0x058a }
            java.lang.String r2 = "compressToken"
            r10 = 1
            boolean r2 = r7.optBoolean(r2, r10)     // Catch:{ Exception -> 0x058a }
            r1.f8964e = r2     // Catch:{ Exception -> 0x058a }
        L_0x0930:
            com.ironsource.mediationsdk.utils.j r2 = new com.ironsource.mediationsdk.utils.j     // Catch:{ Exception -> 0x058a }
            r2.<init>()     // Catch:{ Exception -> 0x058a }
            if (r24 == 0) goto L_0x0950
            java.lang.String r7 = "pixelEventsUrl"
            java.lang.String r10 = "https://outcome-ssp.supersonicads.com/mediation?adUnit=3"
            r11 = r24
            java.lang.String r7 = r11.optString(r7, r10)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "pixelEventsEnabled"
            r13 = 1
            boolean r14 = r11.optBoolean(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r10)     // Catch:{ Exception -> 0x058a }
            r2.f8924b = r7     // Catch:{ Exception -> 0x058a }
            goto L_0x0951
        L_0x0950:
            r14 = 1
        L_0x0951:
            r2.f8923a = r14     // Catch:{ Exception -> 0x058a }
            if (r14 == 0) goto L_0x0968
            int[] r3 = a(r8, r3)     // Catch:{ Exception -> 0x058a }
            r2.f8926d = r3     // Catch:{ Exception -> 0x058a }
            int[] r3 = a(r8, r4)     // Catch:{ Exception -> 0x058a }
            r2.f8927e = r3     // Catch:{ Exception -> 0x058a }
            r3 = 0
            boolean r4 = r8.optBoolean(r12, r3)     // Catch:{ Exception -> 0x058a }
            r2.f8925c = r4     // Catch:{ Exception -> 0x058a }
        L_0x0968:
            java.lang.String r3 = "server"
            r4 = r20
            r7 = 3
            int r3 = r4.optInt(r3, r7)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "publisher"
            int r10 = r4.optInt(r10, r7)     // Catch:{ Exception -> 0x058a }
            java.lang.String r11 = "console"
            int r4 = r4.optInt(r11, r7)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.d r7 = new com.ironsource.mediationsdk.model.d     // Catch:{ Exception -> 0x058a }
            r7.<init>(r3, r10, r4)     // Catch:{ Exception -> 0x058a }
            com.ironsource.sdk.controller.u r3 = new com.ironsource.sdk.controller.u     // Catch:{ Exception -> 0x058a }
            r3.<init>()     // Catch:{ Exception -> 0x058a }
            if (r19 == 0) goto L_0x09df
            java.lang.String r4 = "enabled"
            r10 = r19
            r11 = 0
            boolean r4 = r10.optBoolean(r4, r11)     // Catch:{ Exception -> 0x058a }
            r3.a((boolean) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "reporterURL"
            java.lang.String r4 = r10.optString(r4, r9)     // Catch:{ Exception -> 0x058a }
            r3.b((java.lang.String) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "reporterKeyword"
            java.lang.String r4 = r10.optString(r4, r9)     // Catch:{ Exception -> 0x058a }
            r3.c((java.lang.String) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "includeANR"
            r11 = 0
            boolean r4 = r10.optBoolean(r4, r11)     // Catch:{ Exception -> 0x058a }
            r3.b((boolean) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "timeout"
            r11 = 5000(0x1388, float:7.006E-42)
            int r4 = r10.optInt(r4, r11)     // Catch:{ Exception -> 0x058a }
            r3.a((int) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "setIgnoreDebugger"
            r11 = 0
            boolean r4 = r10.optBoolean(r4, r11)     // Catch:{ Exception -> 0x058a }
            r3.c((boolean) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "keysToInclude"
            org.json.JSONArray r4 = r10.optJSONArray(r4)     // Catch:{ Exception -> 0x058a }
            if (r4 == 0) goto L_0x09df
            r10 = 0
        L_0x09cf:
            int r11 = r4.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r11) goto L_0x09df
            java.lang.String r11 = r4.optString(r10)     // Catch:{ Exception -> 0x058a }
            r3.a((java.lang.String) r11)     // Catch:{ Exception -> 0x058a }
            int r10 = r10 + 1
            goto L_0x09cf
        L_0x09df:
            if (r18 == 0) goto L_0x09ff
            java.lang.String r4 = "name"
            r10 = r18
            java.lang.String r4 = r10.optString(r4, r9)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "id"
            java.lang.String r11 = "-1"
            java.lang.String r9 = r10.optString(r9, r11)     // Catch:{ Exception -> 0x058a }
            java.lang.String r11 = "custom"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.p r11 = new com.ironsource.mediationsdk.model.p     // Catch:{ Exception -> 0x058a }
            r11.<init>(r4, r9, r10)     // Catch:{ Exception -> 0x058a }
            r42 = r11
            goto L_0x0a01
        L_0x09ff:
            r42 = r29
        L_0x0a01:
            com.ironsource.mediationsdk.utils.b r4 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x058a }
            r4.<init>()     // Catch:{ Exception -> 0x058a }
            if (r17 == 0) goto L_0x0a27
            java.lang.String r4 = "isExternalArmEventsEnabled"
            r9 = r17
            r10 = 1
            boolean r4 = r9.optBoolean(r4, r10)     // Catch:{ Exception -> 0x058a }
            java.lang.String r11 = "externalArmEventsUrl"
            java.lang.String r12 = "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData"
            java.lang.String r11 = r9.optString(r11, r12)     // Catch:{ Exception -> 0x058a }
            java.lang.String r12 = "sid"
            boolean r9 = r9.optBoolean(r12, r10)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.b r10 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x058a }
            r10.<init>(r4, r11, r9)     // Catch:{ Exception -> 0x058a }
            r46 = r10
            goto L_0x0a29
        L_0x0a27:
            r46 = r4
        L_0x0a29:
            com.ironsource.mediationsdk.model.c r4 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x058a }
            r4.<init>()     // Catch:{ Exception -> 0x058a }
            if (r16 == 0) goto L_0x0a4e
            java.lang.String r4 = "mediationTypes"
            r9 = r16
            org.json.JSONObject r4 = r9.optJSONObject(r4)     // Catch:{ Exception -> 0x058a }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ Exception -> 0x058a }
            r10.<init>()     // Catch:{ Exception -> 0x058a }
            if (r4 == 0) goto L_0x0a43
            java.util.Map r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r4)     // Catch:{ Exception -> 0x058a }
        L_0x0a43:
            java.lang.String r4 = "compressExternalToken"
            r11 = 0
            r9.optBoolean(r4, r11)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.c r4 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x058a }
            r4.<init>(r10)     // Catch:{ Exception -> 0x058a }
        L_0x0a4e:
            r47 = r4
            com.ironsource.mediationsdk.model.b r4 = new com.ironsource.mediationsdk.model.b     // Catch:{ Exception -> 0x058a }
            r4.<init>()     // Catch:{ Exception -> 0x058a }
            if (r27 == 0) goto L_0x0a67
            java.lang.String r4 = "auctionData"
            r9 = r27
            java.lang.String r4 = r9.optString(r4)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.b r9 = new com.ironsource.mediationsdk.model.b     // Catch:{ Exception -> 0x058a }
            r9.<init>(r4)     // Catch:{ Exception -> 0x058a }
            r49 = r9
            goto L_0x0a69
        L_0x0a67:
            r49 = r4
        L_0x0a69:
            java.lang.String r4 = "integration"
            r9 = r21
            r10 = 0
            boolean r44 = r9.optBoolean(r4, r10)     // Catch:{ Exception -> 0x058a }
            com.ironsource.sdk.f.a r4 = new com.ironsource.sdk.f.a     // Catch:{ Exception -> 0x058a }
            r40 = r4
            r41 = r7
            r43 = r1
            r45 = r3
            r48 = r2
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.g r1 = new com.ironsource.mediationsdk.model.g     // Catch:{ Exception -> 0x058a }
            r35 = r1
            r40 = r4
            r35.<init>(r36, r37, r38, r39, r40)     // Catch:{ Exception -> 0x058a }
            r6.f8939c = r1     // Catch:{ Exception -> 0x058a }
            java.lang.String r1 = "genericParams"
            org.json.JSONObject r1 = b(r8, r1)     // Catch:{ Exception -> 0x058a }
            if (r1 == 0) goto L_0x0aaf
            org.json.JSONObject r2 = b(r1, r5)     // Catch:{ Exception -> 0x058a }
            if (r2 == 0) goto L_0x0aaf
            r1.remove(r5)     // Catch:{ Exception -> 0x058a }
            java.util.Map r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r2)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.a.h r3 = com.ironsource.mediationsdk.a.h.e()     // Catch:{ Exception -> 0x058a }
            r3.b((java.util.Map<java.lang.String, java.lang.String>) r2)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.a.d.e()     // Catch:{ Exception -> 0x058a }
            r3.b((java.util.Map<java.lang.String, java.lang.String>) r2)     // Catch:{ Exception -> 0x058a }
        L_0x0aaf:
            if (r1 == 0) goto L_0x0ac3
            java.util.Map r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r1)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.a.h r2 = com.ironsource.mediationsdk.a.h.e()     // Catch:{ Exception -> 0x058a }
            r2.a((java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.a.d r2 = com.ironsource.mediationsdk.a.d.e()     // Catch:{ Exception -> 0x058a }
            r2.a((java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ Exception -> 0x058a }
        L_0x0ac3:
            return
        L_0x0ac4:
            r0 = move-exception
            r6 = r1
        L_0x0ac6:
            r1 = r0
            r1.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.l.i():void");
    }

    public final C a() {
        return new C(this.bu, this.bv);
    }

    public final void a(int i2) {
        this.f8941e = i2;
    }

    public final boolean b() {
        return (((((this.f8940d != null) && !this.f8940d.has("error")) && this.f8937a != null) && this.f8938b != null) && this.f8939c != null) && f();
    }

    public final String c() {
        try {
            return this.f8937a.f8781b;
        } catch (Exception e2) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVBackFillProvider", e2);
            return null;
        }
    }

    public final String d() {
        try {
            return this.f8937a.f8782c;
        } catch (Exception e2) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVPremiumProvider", e2);
            return null;
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.APP_KEY, this.bu);
            jSONObject.put(DataKeys.USER_ID, this.bv);
            jSONObject.put("response", this.f8940d);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }
}
