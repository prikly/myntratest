package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.security.ProviderInstaller;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class i extends a {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f15448a = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private final int f15449e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Object f15450f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public a f15451g;

    public interface a {
        void a(JSONObject jSONObject);
    }

    private class b extends a {
        public b(n nVar) {
            super("TaskTimeoutFetchBasicSettings", nVar, true);
        }

        public void run() {
            synchronized (i.this.f15450f) {
                if (i.this.f15451g != null) {
                    v vVar = this.f15420d;
                    if (v.a()) {
                        this.f15420d.e(this.f15419c, "Timing out fetch basic settings...");
                    }
                    i.this.a(new JSONObject());
                }
            }
        }
    }

    public i(int i, n nVar, a aVar) {
        super("TaskFetchBasicSettings", nVar, true);
        this.f15449e = i;
        this.f15451g = aVar;
    }

    /* access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        synchronized (this.f15450f) {
            if (this.f15451g != null) {
                this.f15451g.a(jSONObject);
                this.f15451g = null;
            }
        }
    }

    private String c() {
        return com.applovin.impl.sdk.utils.i.a((String) this.f15418b.a(com.applovin.impl.sdk.c.b.aY), "5.0/i", d());
    }

    private String h() {
        return com.applovin.impl.sdk.utils.i.a((String) this.f15418b.a(com.applovin.impl.sdk.c.b.aZ), "5.0/i", d());
    }

    /* access modifiers changed from: protected */
    public Map<String, String> a() {
        Map<String, String> map = CollectionUtils.map();
        map.put("rid", UUID.randomUUID().toString());
        if (!((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.b.eA)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f15418b.C());
        }
        Boolean a2 = k.b().a(f());
        if (a2 != null) {
            map.put(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, a2.toString());
        }
        Boolean a3 = k.a().a(f());
        if (a3 != null) {
            map.put(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, a3.toString());
        }
        Boolean a4 = k.c().a(f());
        if (a4 != null) {
            map.put(AppLovinSdkExtraParameterKey.DO_NOT_SELL, a4.toString());
        }
        return map;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|(1:4)|5|(1:7)|8|(1:10)|11|(1:13)|14|(1:18)|19|(1:21)|22|23|(1:25)|26|27|(1:29)|30|(1:36)|37|(1:42)|43|(1:45)|46|(1:48)|49|(1:51)|52|(1:54)|55|(1:57)|58|63) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x01c1 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01d1 A[Catch:{ JSONException -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x026c A[Catch:{ JSONException -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0287 A[Catch:{ JSONException -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x02a2 A[Catch:{ JSONException -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02b9 A[Catch:{ JSONException -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02ce A[Catch:{ JSONException -> 0x02e8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject b() {
        /*
            r23 = this;
            r1 = r23
            java.lang.String r0 = "screen_size_in"
            java.lang.String r2 = "is_tablet"
            java.lang.String r3 = "revision"
            java.lang.String r4 = "model"
            java.lang.String r5 = "hardware"
            java.lang.String r6 = "brand_name"
            java.lang.String r7 = "brand"
            java.lang.String r8 = "locale"
            java.lang.String r9 = "os"
            java.lang.String r10 = "platform"
            java.lang.String r11 = "IABTCF_gdprApplies"
            java.lang.String r12 = "IABTCF_TCString"
            java.lang.String r13 = "target_sdk"
            java.lang.String r14 = "tg"
            java.lang.String r15 = "debug"
            r16 = r0
            java.lang.String r0 = "test_ads"
            r17 = r2
            java.lang.String r2 = "app_version"
            r18 = r3
            java.lang.String r3 = "package_name"
            r19 = r4
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r20 = r5
            java.lang.String r5 = "sdk_version"
            r21 = r6
            java.lang.String r6 = com.applovin.sdk.AppLovinSdk.VERSION     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r5 = "is_cross_promo"
            com.applovin.impl.sdk.n r6 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            boolean r6 = r6.e()     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r5 = "init_count"
            int r6 = r1.f15449e     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r5 = "server_installed_at"
            com.applovin.impl.sdk.n r6 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            r22 = r7
            com.applovin.impl.sdk.c.b<java.lang.String> r7 = com.applovin.impl.sdk.c.b.ai     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r6 = r6.a(r7)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.n r5 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            boolean r5 = r5.S()     // Catch:{ JSONException -> 0x02e8 }
            r6 = 1
            if (r5 == 0) goto L_0x006d
            java.lang.String r5 = "first_install"
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x02e8 }
        L_0x006d:
            com.applovin.impl.sdk.n r5 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            boolean r5 = r5.T()     // Catch:{ JSONException -> 0x02e8 }
            if (r5 != 0) goto L_0x007a
            java.lang.String r5 = "first_install_v2"
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x02e8 }
        L_0x007a:
            com.applovin.impl.sdk.n r5 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.c.b<java.lang.String> r7 = com.applovin.impl.sdk.c.b.dI     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r5 = r5.a(r7)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x02e8 }
            boolean r7 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)     // Catch:{ JSONException -> 0x02e8 }
            if (r7 == 0) goto L_0x008f
            java.lang.String r7 = "plugin_version"
            r4.put(r7, r5)     // Catch:{ JSONException -> 0x02e8 }
        L_0x008f:
            com.applovin.impl.sdk.n r5 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r5 = r5.u()     // Catch:{ JSONException -> 0x02e8 }
            boolean r7 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)     // Catch:{ JSONException -> 0x02e8 }
            if (r7 == 0) goto L_0x00a0
            java.lang.String r7 = "mediation_provider"
            r4.put(r7, r5)     // Catch:{ JSONException -> 0x02e8 }
        L_0x00a0:
            java.lang.String r5 = "installed_mediation_adapters"
            com.applovin.impl.sdk.n r7 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            org.json.JSONArray r7 = com.applovin.impl.mediation.c.c.a((com.applovin.impl.sdk.n) r7)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r5, r7)     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.n r5 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.o r5 = r5.Y()     // Catch:{ JSONException -> 0x02e8 }
            java.util.Map r5 = r5.h()     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r7 = r5.get(r3)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r3, r7)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r3 = r5.get(r2)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r2 = r5.get(r0)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r0, r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r0 = r5.get(r15)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r15, r0)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r0 = r5.get(r14)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r14, r0)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r0 = r5.get(r13)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r13, r0)     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.n r0 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.sdk.AppLovinSdkSettings r0 = r0.q()     // Catch:{ JSONException -> 0x02e8 }
            java.util.List r0 = r0.getInitializationAdUnitIds()     // Catch:{ JSONException -> 0x02e8 }
            if (r0 == 0) goto L_0x0102
            int r2 = r0.size()     // Catch:{ JSONException -> 0x02e8 }
            if (r2 <= 0) goto L_0x0102
            java.util.List r0 = com.applovin.impl.sdk.utils.CollectionUtils.removeTrimmedEmptyStrings(r0)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r2 = "ad_unit_ids"
            int r3 = r0.size()     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r0 = com.applovin.impl.sdk.utils.CollectionUtils.implode(r0, r3)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x02e8 }
        L_0x0102:
            java.lang.Object r0 = r5.get(r12)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r12, r0)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r0 = r5.get(r11)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r11, r0)     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.n r0 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.o r0 = r0.Y()     // Catch:{ JSONException -> 0x02e8 }
            java.util.Map r0 = r0.b()     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r2 = r0.get(r10)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r10, r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r2 = r0.get(r9)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r9, r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r2 = r0.get(r8)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r8, r2)     // Catch:{ JSONException -> 0x02e8 }
            r2 = r22
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            r2 = r21
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            r2 = r20
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            r2 = r19
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            r2 = r18
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            r2 = r17
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            r2 = r16
            java.lang.Object r0 = r0.get(r2)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.n r0 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.c.b.dR     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r0 = r0.a(r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x02e8 }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x02e8 }
            if (r0 == 0) goto L_0x018d
            java.lang.String r0 = "mtl"
            com.applovin.impl.sdk.n r2 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.SessionTracker r2 = r2.ag()     // Catch:{ JSONException -> 0x02e8 }
            int r2 = r2.getLastTrimMemoryLevel()     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r0, r2)     // Catch:{ JSONException -> 0x02e8 }
        L_0x018d:
            com.applovin.impl.sdk.n r0 = r1.f15418b     // Catch:{ all -> 0x01c1 }
            android.content.Context r0 = r0.P()     // Catch:{ all -> 0x01c1 }
            java.lang.String r2 = "activity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ all -> 0x01c1 }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ all -> 0x01c1 }
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch:{ all -> 0x01c1 }
            r2.<init>()     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x01c1
            r0.getMemoryInfo(r2)     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "fm"
            long r7 = r2.availMem     // Catch:{ all -> 0x01c1 }
            r4.put(r0, r7)     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "tm"
            long r7 = r2.totalMem     // Catch:{ all -> 0x01c1 }
            r4.put(r0, r7)     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "lmt"
            long r7 = r2.threshold     // Catch:{ all -> 0x01c1 }
            r4.put(r0, r7)     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "lm"
            boolean r2 = r2.lowMemory     // Catch:{ all -> 0x01c1 }
            r4.put(r0, r2)     // Catch:{ all -> 0x01c1 }
        L_0x01c1:
            com.applovin.impl.sdk.n r0 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.AppLovinTargetingDataImpl r0 = r0.s()     // Catch:{ JSONException -> 0x02e8 }
            java.util.Map r0 = r0.getAllData()     // Catch:{ JSONException -> 0x02e8 }
            boolean r2 = r0.isEmpty()     // Catch:{ JSONException -> 0x02e8 }
            if (r2 != 0) goto L_0x01db
            java.lang.String r2 = "targeting_data"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02e8 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
        L_0x01db:
            com.applovin.impl.sdk.n r0 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.o r0 = r0.Y()     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.o$a r0 = r0.k()     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r2 = "dnt"
            boolean r3 = r0.f15749a     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r2 = "dnt_code"
            com.applovin.impl.sdk.o$d r3 = r0.f15751c     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r3 = r3.a()     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.k$a r2 = com.applovin.impl.sdk.k.a()     // Catch:{ JSONException -> 0x02e8 }
            android.content.Context r3 = r23.f()     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Boolean r2 = r2.a((android.content.Context) r3)     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.n r3 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r5 = com.applovin.impl.sdk.c.b.dE     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r3 = r3.a(r5)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x02e8 }
            boolean r3 = r3.booleanValue()     // Catch:{ JSONException -> 0x02e8 }
            if (r3 == 0) goto L_0x022a
            java.lang.String r3 = r0.f15750b     // Catch:{ JSONException -> 0x02e8 }
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r3)     // Catch:{ JSONException -> 0x02e8 }
            if (r3 == 0) goto L_0x022a
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x02e8 }
            boolean r3 = r3.equals(r2)     // Catch:{ JSONException -> 0x02e8 }
            if (r3 != 0) goto L_0x022a
            java.lang.String r3 = "idfa"
            java.lang.String r0 = r0.f15750b     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r3, r0)     // Catch:{ JSONException -> 0x02e8 }
        L_0x022a:
            com.applovin.impl.sdk.n r0 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.o r0 = r0.Y()     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.o$b r0 = r0.l()     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.n r3 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r5 = com.applovin.impl.sdk.c.b.dx     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r3 = r3.a(r5)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x02e8 }
            boolean r3 = r3.booleanValue()     // Catch:{ JSONException -> 0x02e8 }
            if (r3 == 0) goto L_0x025c
            if (r0 == 0) goto L_0x025c
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x02e8 }
            boolean r2 = r3.equals(r2)     // Catch:{ JSONException -> 0x02e8 }
            if (r2 != 0) goto L_0x025c
            java.lang.String r2 = "idfv"
            java.lang.String r3 = r0.f15752a     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r2 = "idfv_scope"
            int r0 = r0.f15753b     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x02e8 }
        L_0x025c:
            com.applovin.impl.sdk.n r0 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.sdk.AppLovinUserSegment r0 = r0.r()     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r0 = r0.getName()     // Catch:{ JSONException -> 0x02e8 }
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)     // Catch:{ JSONException -> 0x02e8 }
            if (r2 == 0) goto L_0x0277
            java.lang.String r2 = "user_segment_name"
            com.applovin.impl.sdk.n r3 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.encodeUriString(r0, r3)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x02e8 }
        L_0x0277:
            com.applovin.impl.sdk.n r0 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.c.b.dA     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r0 = r0.a(r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x02e8 }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x02e8 }
            if (r0 == 0) goto L_0x0292
            java.lang.String r0 = "compass_random_token"
            com.applovin.impl.sdk.n r2 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r2 = r2.o()     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r0, r2)     // Catch:{ JSONException -> 0x02e8 }
        L_0x0292:
            com.applovin.impl.sdk.n r0 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.c.b.dC     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r0 = r0.a(r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x02e8 }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x02e8 }
            if (r0 == 0) goto L_0x02ad
            java.lang.String r0 = "applovin_random_token"
            com.applovin.impl.sdk.n r2 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r2 = r2.p()     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r0, r2)     // Catch:{ JSONException -> 0x02e8 }
        L_0x02ad:
            com.applovin.impl.sdk.n r0 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.mediation.debugger.ui.testmode.c r0 = r0.N()     // Catch:{ JSONException -> 0x02e8 }
            boolean r0 = r0.a()     // Catch:{ JSONException -> 0x02e8 }
            if (r0 == 0) goto L_0x02be
            java.lang.String r0 = "test_mode"
            r4.put(r0, r6)     // Catch:{ JSONException -> 0x02e8 }
        L_0x02be:
            com.applovin.impl.sdk.n r0 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.mediation.debugger.ui.testmode.c r0 = r0.N()     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r0 = r0.c()     // Catch:{ JSONException -> 0x02e8 }
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)     // Catch:{ JSONException -> 0x02e8 }
            if (r2 == 0) goto L_0x02d3
            java.lang.String r2 = "test_mode_network"
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x02e8 }
        L_0x02d3:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.n r2 = r1.f15418b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.sdk.AppLovinSdkSettings r2 = r2.q()     // Catch:{ JSONException -> 0x02e8 }
            java.util.Map r2 = r2.getExtraParameters()     // Catch:{ JSONException -> 0x02e8 }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r2 = "sdk_extra_parameters"
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x02fa
        L_0x02e8:
            r0 = move-exception
            com.applovin.impl.sdk.v r2 = r1.f15420d
            boolean r2 = com.applovin.impl.sdk.v.a()
            if (r2 == 0) goto L_0x02fa
            com.applovin.impl.sdk.v r2 = r1.f15420d
            java.lang.String r3 = r1.f15419c
            java.lang.String r5 = "Failed to construct JSON body"
            r2.b(r3, r5, r0)
        L_0x02fa:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.i.b():org.json.JSONObject");
    }

    public void run() {
        if (!h.i() && f15448a.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(this.f15418b.P());
            } catch (Throwable th) {
                v vVar = this.f15420d;
                if (v.a()) {
                    this.f15420d.b(this.f15419c, "Cannot update security provider", th);
                }
            }
        }
        Map<String, String> a2 = a();
        c<T> a3 = c.a(this.f15418b).a(c()).c(h()).a(a2).a(b()).d(((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.b.eG)).booleanValue()).b("POST").a(new JSONObject()).a(((Integer) this.f15418b.a(com.applovin.impl.sdk.c.b.df)).intValue()).c(((Integer) this.f15418b.a(com.applovin.impl.sdk.c.b.di)).intValue()).b(((Integer) this.f15418b.a(com.applovin.impl.sdk.c.b.de)).intValue()).a();
        this.f15418b.V().a((a) new b(this.f15418b), o.a.TIMEOUT, ((long) ((Integer) this.f15418b.a(com.applovin.impl.sdk.c.b.de)).intValue()) + 250);
        AnonymousClass1 r1 = new u<JSONObject>(a3, this.f15418b, g()) {
            public void a(int i, String str, JSONObject jSONObject) {
                v vVar = this.f15420d;
                if (v.a()) {
                    v vVar2 = this.f15420d;
                    String str2 = this.f15419c;
                    vVar2.e(str2, "Unable to fetch basic SDK settings: server returned " + i);
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                i.this.a(jSONObject);
            }

            public void a(JSONObject jSONObject, int i) {
                i.this.a(jSONObject);
            }
        };
        r1.a(com.applovin.impl.sdk.c.b.aY);
        r1.b(com.applovin.impl.sdk.c.b.aZ);
        this.f15418b.V().a((a) r1);
    }
}
