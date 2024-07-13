package com.appodeal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.n;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.r;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.utils.ExchangeAd;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.campaign_frequency.b;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class l<AdRequestType extends r, UnifiedAdType extends UnifiedAd, UnifiedAdParamsType extends UnifiedAdParams, UnifiedAdCallbackType extends UnifiedAdCallback> implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public final AdRequestType f16568a;

    /* renamed from: b  reason: collision with root package name */
    public final AdNetwork f16569b;

    /* renamed from: c  reason: collision with root package name */
    public f5 f16570c;

    /* renamed from: d  reason: collision with root package name */
    public String f16571d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f16572e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public UnifiedAdType f16573f;

    /* renamed from: g  reason: collision with root package name */
    public UnifiedAdParamsType f16574g;

    /* renamed from: h  reason: collision with root package name */
    public UnifiedAdCallbackType f16575h;
    public ExchangeAd i;
    public b j;
    public JSONObject k;
    public int l = 1;
    public final int m;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r = false;

    public interface a<AdRequestType extends r> {
    }

    public l(r rVar, AdNetwork adNetwork, @Deprecated d0 d0Var, int i2) {
        this.f16568a = rVar;
        this.f16569b = adNetwork;
        this.f16570c = d0Var;
        this.f16571d = adNetwork.getName();
        this.m = i2;
    }

    public abstract UnifiedAdType a(AdNetwork adNetwork);

    public abstract UnifiedAdParamsType a(int i2);

    public final void a(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("exchange_ad")) {
                this.i = (ExchangeAd) bundle.getParcelable("exchange_ad");
            }
            String string = bundle.getString(OSOutcomeConstants.OUTCOME_ID);
            if (!TextUtils.isEmpty(string)) {
                this.f16570c.a(string);
            }
            if (bundle.containsKey("demand_source")) {
                this.f16571d = bundle.getString("demand_source");
            }
            if (bundle.containsKey("ecpm")) {
                this.f16570c.a(bundle.getDouble("ecpm"));
            }
            if (bundle.containsKey("additional_stats")) {
                try {
                    this.k = new JSONObject(bundle.getString("additional_stats"));
                } catch (Throwable th) {
                    Log.log(th);
                }
            }
        }
    }

    public void a(ContextProvider contextProvider, UnifiedAdParamsType unifiedadparamstype, Object obj, UnifiedAdCallbackType unifiedadcallbacktype, UnifiedAdType unifiedadtype) {
        unifiedadtype.load(contextProvider, unifiedadparamstype, obj, unifiedadcallbacktype);
    }

    public final void a(String str, double d2) {
        if (this.f16573f != null && !f() && !this.r) {
            this.r = true;
            this.f16573f.onMediationLoss(str, d2);
        }
    }

    public final void a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("target_placements");
        this.f16572e.clear();
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                this.f16572e.add(optJSONArray.optString(i2));
            }
        }
    }

    public final void b() {
        this.f16570c.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003c A[Catch:{ Exception -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049 A[Catch:{ Exception -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050 A[Catch:{ Exception -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b A[Catch:{ Exception -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0094 A[Catch:{ Exception -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a9 A[Catch:{ Exception -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b6 A[Catch:{ Exception -> 0x00c3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r7) {
        /*
            r6 = this;
            com.appodeal.ads.utils.ExchangeAd r0 = r6.i
            if (r0 == 0) goto L_0x0007
            r0.trackImpression(r7)
        L_0x0007:
            com.appodeal.ads.utils.campaign_frequency.b r7 = r6.j
            if (r7 == 0) goto L_0x00c7
            com.appodeal.ads.context.b r0 = com.appodeal.ads.context.b.f16327b
            com.appodeal.ads.context.f r0 = r0.f16328a
            r0.getApplicationContext()
            com.appodeal.ads.utils.campaign_frequency.a r0 = r7.f17494a     // Catch:{ Exception -> 0x00c3 }
            com.appodeal.ads.storage.o r1 = com.appodeal.ads.utils.campaign_frequency.a.f17491b     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r0 = r0.f17493a     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r0 = r1.e(r0)     // Catch:{ Exception -> 0x00c3 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00c3 }
            if (r1 != 0) goto L_0x0039
            boolean r1 = com.appodeal.ads.utils.campaign_frequency.a.f17492c     // Catch:{ Exception -> 0x0035 }
            if (r1 != 0) goto L_0x002f
            if (r0 == 0) goto L_0x0029
            goto L_0x002f
        L_0x0029:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ Exception -> 0x0035 }
            r0.<init>()     // Catch:{ Exception -> 0x0035 }
            throw r0     // Catch:{ Exception -> 0x0035 }
        L_0x002f:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0035 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0035 }
            goto L_0x003a
        L_0x0035:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)     // Catch:{ Exception -> 0x00c3 }
        L_0x0039:
            r1 = 0
        L_0x003a:
            if (r1 != 0) goto L_0x0041
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00c3 }
            r1.<init>()     // Catch:{ Exception -> 0x00c3 }
        L_0x0041:
            java.lang.String r0 = r7.f17497d     // Catch:{ Exception -> 0x0068 }
            boolean r0 = r1.has(r0)     // Catch:{ Exception -> 0x0068 }
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = r7.f17497d     // Catch:{ Exception -> 0x0068 }
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0055
        L_0x0050:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x0068 }
            r0.<init>()     // Catch:{ Exception -> 0x0068 }
        L_0x0055:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0068 }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r4 = 60
            long r2 = r2 / r4
            r0.put(r2)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = r7.f17497d     // Catch:{ Exception -> 0x0068 }
            r1.put(r2, r0)     // Catch:{ Exception -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)     // Catch:{ Exception -> 0x00c3 }
        L_0x006c:
            com.appodeal.ads.utils.campaign_frequency.a r0 = r7.f17494a     // Catch:{ Exception -> 0x00c3 }
            r0.getClass()     // Catch:{ Exception -> 0x00c3 }
            com.appodeal.ads.storage.o r2 = com.appodeal.ads.utils.campaign_frequency.a.f17491b     // Catch:{ Exception -> 0x007d }
            java.lang.String r0 = r0.f17493a     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x007d }
            r2.a((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)     // Catch:{ Exception -> 0x00c3 }
        L_0x0081:
            java.util.HashMap r0 = com.appodeal.ads.utils.campaign_frequency.b.l     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r1 = r7.f17496c     // Catch:{ Exception -> 0x00c3 }
            boolean r1 = r0.containsKey(r1)     // Catch:{ Exception -> 0x00c3 }
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = r7.f17496c     // Catch:{ Exception -> 0x00c3 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x00c3 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x00c3 }
            goto L_0x009f
        L_0x0094:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x00c3 }
            r1.<init>()     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r2 = r7.f17496c     // Catch:{ Exception -> 0x00c3 }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x00c3 }
            r0 = r1
        L_0x009f:
            if (r0 == 0) goto L_0x00b6
            java.lang.String r1 = r7.f17497d     // Catch:{ Exception -> 0x00c3 }
            boolean r1 = r0.containsKey(r1)     // Catch:{ Exception -> 0x00c3 }
            if (r1 == 0) goto L_0x00b6
            java.lang.String r1 = r7.f17497d     // Catch:{ Exception -> 0x00c3 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x00c3 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x00c3 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00b7
        L_0x00b6:
            r1 = 0
        L_0x00b7:
            int r1 = r1 + 1
            java.lang.String r7 = r7.f17497d     // Catch:{ Exception -> 0x00c3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00c3 }
            r0.put(r7, r1)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c7
        L_0x00c3:
            r7 = move-exception
            com.appodeal.ads.utils.Log.log(r7)
        L_0x00c7:
            UnifiedAdType r7 = r6.f16573f
            if (r7 == 0) goto L_0x00ce
            r7.onImpression()
        L_0x00ce:
            long r0 = r6.p
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x00dc
            long r0 = java.lang.System.currentTimeMillis()
            r6.p = r0
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.l.b(int):void");
    }

    public abstract UnifiedAdCallbackType c();

    public final AdRequestType d() {
        return this.f16568a;
    }

    public final JSONObject e() {
        return this.k;
    }

    public final boolean f() {
        return !this.f16572e.isEmpty();
    }

    public final String getAdUnitName() {
        return this.f16570c.getAdUnitName();
    }

    public final double getEcpm() {
        return this.f16570c.getEcpm();
    }

    public final long getExpTime() {
        return this.f16570c.getExpTime();
    }

    public final String getId() {
        return this.f16570c.getId();
    }

    public final int getImpressionInterval() {
        return this.f16570c.getImpressionInterval();
    }

    public final JSONObject getJsonData() {
        return this.f16570c.getJsonData();
    }

    public final int getLoadingTimeout() {
        int loadingTimeout = this.f16570c.getLoadingTimeout();
        return loadingTimeout > 0 ? loadingTimeout : this.m;
    }

    public final String getMediatorName() {
        return this.f16570c.getMediatorName();
    }

    public final e0 getRequestResult() {
        return this.f16570c.getRequestResult();
    }

    public final String getStatus() {
        return this.f16570c.getStatus();
    }

    public final void h() {
        ExchangeAd exchangeAd = this.i;
        if (exchangeAd != null) {
            exchangeAd.trackClick();
        }
        b bVar = this.j;
        if (bVar != null) {
            try {
                com.appodeal.ads.utils.campaign_frequency.a.f17491b.a(bVar.f17494a.f17493a, System.currentTimeMillis());
            } catch (Exception e2) {
                Log.log(e2);
            }
        }
        UnifiedAdType unifiedadtype = this.f16573f;
        if (unifiedadtype != null) {
            unifiedadtype.onClicked();
        }
        if (this.o == 0) {
            this.o = System.currentTimeMillis();
        }
    }

    /* renamed from: i */
    public void g() {
        UnifiedAdType unifiedadtype = this.f16573f;
        if (unifiedadtype != null) {
            unifiedadtype.onDestroy();
        }
    }

    public final boolean isAsync() {
        return this.f16570c.isAsync();
    }

    public final Boolean isMuted() {
        return this.f16570c.isMuted();
    }

    public final boolean isPrecache() {
        return this.f16570c.isPrecache();
    }

    public final void j() {
        if (this.f16573f != null && !f() && !this.r) {
            this.r = true;
            String id = this.f16570c.getId();
            if (!TextUtils.isEmpty(id) && TextUtils.getTrimmedLength(id) > 5) {
                id = id.substring(0, 5) + APSSharedUtil.TRUNCATE_SEPARATOR;
            }
            Log.log(this.f16568a.n().getDisplayName(), LogConstants.EVENT_NOTIFY_MEDIATION_RESULT, String.format(Locale.ENGLISH, "(winner): %s - eCPM: %.2f, id: %s", new Object[]{n5.a(this.f16570c.getStatus()), Double.valueOf(this.f16570c.getEcpm()), id}));
            this.f16573f.onMediationWin();
        }
    }

    public final void k() {
        h5.f16458a.post(new Runnable() {
            public final void run() {
                l.this.g();
            }
        });
    }

    public LoadingError l() {
        return null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "[@" + Integer.toHexString(hashCode()) + "]: " + this.f16570c.getId();
    }

    public final void a(com.appodeal.ads.context.b bVar, r rVar, int i2, n.a aVar) {
        JSONObject optJSONObject = this.f16570c.getJsonData().optJSONObject(Constants.CAMPAIGN_FREQUENCY);
        if (optJSONObject != null) {
            b a2 = b.a(optJSONObject, this.f16570c.getJsonData().optString("package"));
            this.j = a2;
            if (a2 != null && !a2.a(bVar.getApplicationContext())) {
                rVar.d(this);
                aVar.a(LoadingError.Canceled);
                return;
            }
        }
        LoadingError l2 = l();
        if (l2 == null) {
            l2 = this.f16569b.verifyLoadAvailability(rVar.n());
        }
        if (l2 != null) {
            aVar.a(l2);
            return;
        }
        k kVar = new k(this, aVar, rVar, i2, bVar);
        this.f16569b.initialize(bVar, this, new h(rVar, new u2(this.f16569b.getName())), kVar);
    }
}
