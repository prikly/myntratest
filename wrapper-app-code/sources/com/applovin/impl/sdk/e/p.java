package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.ad.d;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONArray;
import org.json.JSONObject;

public class p extends a implements AppLovinAdLoadListener {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f15488a;

    /* renamed from: e  reason: collision with root package name */
    private final d f15489e;

    /* renamed from: f  reason: collision with root package name */
    private final b f15490f;

    /* renamed from: g  reason: collision with root package name */
    private final AppLovinAdLoadListener f15491g;

    public p(JSONObject jSONObject, d dVar, b bVar, AppLovinAdLoadListener appLovinAdLoadListener, n nVar) {
        super("TaskProcessAdResponse", nVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        } else if (dVar != null) {
            this.f15488a = jSONObject;
            this.f15489e = dVar;
            this.f15490f = bVar;
            this.f15491g = appLovinAdLoadListener;
        } else {
            throw new IllegalArgumentException("No zone specified");
        }
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.applovin.impl.sdk.e.a] */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.applovin.impl.sdk.e.q] */
    /* JADX WARNING: type inference failed for: r3v4, types: [com.applovin.impl.sdk.e.s] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(org.json.JSONObject r10) {
        /*
            r9 = this;
            java.lang.String r0 = "type"
            java.lang.String r1 = "undefined"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r10, r0, r1)
            java.lang.String r1 = "applovin"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x003a
            com.applovin.impl.sdk.v r0 = r9.f15420d
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto L_0x0021
            com.applovin.impl.sdk.v r0 = r9.f15420d
            java.lang.String r1 = r9.f15419c
            java.lang.String r2 = "Starting task for AppLovin ad..."
            r0.b(r1, r2)
        L_0x0021:
            com.applovin.impl.sdk.e.s r0 = new com.applovin.impl.sdk.e.s
            org.json.JSONObject r5 = r9.f15488a
            com.applovin.impl.sdk.ad.b r6 = r9.f15490f
            com.applovin.impl.sdk.n r8 = r9.f15418b
            r3 = r0
            r4 = r10
            r7 = r9
            r3.<init>(r4, r5, r6, r7, r8)
        L_0x002f:
            com.applovin.impl.sdk.n r10 = r9.f15418b
            com.applovin.impl.sdk.e.o r10 = r10.V()
            r10.a((com.applovin.impl.sdk.e.a) r0)
            goto L_0x00b4
        L_0x003a:
            java.lang.String r1 = "vast"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x0067
            com.applovin.impl.sdk.v r0 = r9.f15420d
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto L_0x0053
            com.applovin.impl.sdk.v r0 = r9.f15420d
            java.lang.String r1 = r9.f15419c
            java.lang.String r2 = "Starting task for VAST ad..."
            r0.b(r1, r2)
        L_0x0053:
            org.json.JSONObject r0 = r9.f15488a
            com.applovin.impl.sdk.ad.b r1 = r9.f15490f
            com.applovin.impl.sdk.n r2 = r9.f15418b
            com.applovin.impl.sdk.e.r r10 = com.applovin.impl.sdk.e.r.a(r10, r0, r1, r9, r2)
            com.applovin.impl.sdk.n r0 = r9.f15418b
            com.applovin.impl.sdk.e.o r0 = r0.V()
            r0.a((com.applovin.impl.sdk.e.a) r10)
            goto L_0x00b4
        L_0x0067:
            java.lang.String r1 = "js_tag"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x008f
            com.applovin.impl.sdk.v r0 = r9.f15420d
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto L_0x0080
            com.applovin.impl.sdk.v r0 = r9.f15420d
            java.lang.String r1 = r9.f15419c
            java.lang.String r2 = "Starting task for JS tag ad..."
            r0.b(r1, r2)
        L_0x0080:
            com.applovin.impl.sdk.e.q r0 = new com.applovin.impl.sdk.e.q
            org.json.JSONObject r5 = r9.f15488a
            com.applovin.impl.sdk.ad.b r6 = r9.f15490f
            com.applovin.impl.sdk.n r8 = r9.f15418b
            r3 = r0
            r4 = r10
            r7 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x002f
        L_0x008f:
            com.applovin.impl.sdk.v r10 = r9.f15420d
            boolean r10 = com.applovin.impl.sdk.v.a()
            if (r10 == 0) goto L_0x00af
            com.applovin.impl.sdk.v r10 = r9.f15420d
            java.lang.String r1 = r9.f15419c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to process ad of unknown type: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r10.d(r1, r0)
        L_0x00af:
            r10 = -800(0xfffffffffffffce0, float:NaN)
            r9.failedToReceiveAd(r10)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.p.a(org.json.JSONObject):void");
    }

    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f15491g;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
    }

    public void failedToReceiveAd(int i) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f15491g;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
    }

    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f15488a, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            v vVar = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
            return;
        }
        v vVar2 = this.f15420d;
        if (v.a()) {
            this.f15420d.d(this.f15419c, "No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher(this.f15489e.a(), this.f15489e.b(), this.f15488a, this.f15418b);
        failedToReceiveAd(204);
    }
}
