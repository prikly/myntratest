package com.applovin.impl.mediation.debugger.b.c;

import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.c.c;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b implements AppLovinCommunicatorSubscriber, Comparable<b> {
    private final Map<MaxAdFormat, String> A;
    private final boolean B;
    private final String C;
    private final Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.b> D;

    /* renamed from: a  reason: collision with root package name */
    private final n f14705a;

    /* renamed from: b  reason: collision with root package name */
    private final a f14706b;

    /* renamed from: c  reason: collision with root package name */
    private int f14707c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f14708d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f14709e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f14710f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f14711g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f14712h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final String n;
    private final String o;
    private final String p;
    private String q;
    private final String r;
    private final String s;
    private final String t;
    private final int u;
    private final List<MaxAdFormat> v;
    private final List<d> w;
    private final List<a> x;
    private final List<String> y;
    private final c z;

    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");
        

        /* renamed from: e  reason: collision with root package name */
        private final String f14718e;

        private a(String str) {
            this.f14718e = str;
        }

        /* access modifiers changed from: private */
        public String a() {
            return this.f14718e;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.b.c.b$b  reason: collision with other inner class name */
    public enum C0146b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");
        

        /* renamed from: f  reason: collision with root package name */
        private final String f14724f;

        /* renamed from: g  reason: collision with root package name */
        private final int f14725g;

        /* renamed from: h  reason: collision with root package name */
        private final String f14726h;

        private C0146b(String str, int i2, String str2) {
            this.f14724f = str;
            this.f14725g = i2;
            this.f14726h = str2;
        }

        public String a() {
            return this.f14724f;
        }

        public int b() {
            return this.f14725g;
        }

        public String c() {
            return this.f14726h;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(org.json.JSONObject r20, com.applovin.impl.sdk.n r21) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.String r4 = "MediatedNetwork"
            r19.<init>()
            r1.f14705a = r3
            java.lang.String r0 = "name"
            java.lang.String r5 = ""
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            r1.n = r0
            java.lang.String r0 = "display_name"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            r1.o = r0
            java.lang.String r6 = "adapter_class"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r6, r5)
            r1.p = r0
            java.lang.String r0 = "latest_adapter_version"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            r1.s = r0
            java.util.List r0 = r19.a((org.json.JSONObject) r20)
            r1.y = r0
            r7 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "hide_if_missing"
            java.lang.Boolean r8 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r2, r8, r0)
            boolean r8 = r8.booleanValue()
            r1.j = r8
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = "configuration"
            org.json.JSONObject r8 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r2, (java.lang.String) r9, (org.json.JSONObject) r8)
            java.util.List r9 = r1.a(r8, r3)
            r1.w = r9
            com.applovin.impl.mediation.debugger.b.c.c r9 = new com.applovin.impl.mediation.debugger.b.c.c
            r9.<init>(r8, r3)
            r1.z = r9
            java.lang.String r9 = "java_8_required"
            java.lang.Boolean r9 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r8, r9, r0)
            boolean r9 = r9.booleanValue()
            r1.m = r9
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r10 = "test_mode"
            org.json.JSONObject r9 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r8, (java.lang.String) r10, (org.json.JSONObject) r9)
            java.lang.String r11 = "false_coppa_required"
            java.lang.Boolean r11 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r9, r11, r0)
            boolean r11 = r11.booleanValue()
            r1.l = r11
            java.lang.String r11 = "network_names"
            r12 = 0
            org.json.JSONObject r9 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r9, (java.lang.String) r11, (org.json.JSONObject) r12)
            if (r9 == 0) goto L_0x00c0
            int r11 = r9.length()
            if (r11 <= 0) goto L_0x00c0
            int r11 = r9.length()
            java.util.Map r11 = com.applovin.impl.sdk.utils.CollectionUtils.map((int) r11)
            java.util.Iterator r13 = r9.keys()
        L_0x009c:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00bd
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            com.applovin.mediation.MaxAdFormat r15 = com.applovin.mediation.MaxAdFormat.formatFromString(r14)
            java.lang.String r14 = com.applovin.impl.sdk.utils.JsonUtils.getString(r9, r14, r12)
            if (r15 == 0) goto L_0x009c
            boolean r16 = android.text.TextUtils.isEmpty(r14)
            if (r16 == 0) goto L_0x00b9
            goto L_0x009c
        L_0x00b9:
            r11.put(r15, r14)
            goto L_0x009c
        L_0x00bd:
            r1.A = r11
            goto L_0x00c2
        L_0x00c0:
            r1.A = r12
        L_0x00c2:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            org.json.JSONObject r9 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r2, (java.lang.String) r10, (org.json.JSONObject) r9)
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)
            java.lang.String r13 = "supported"
            java.lang.Boolean r11 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r9, r13, r11)
            boolean r11 = r11.booleanValue()
            r1.f14712h = r11
            java.lang.String r11 = "test_mode_requires_init"
            java.lang.Boolean r0 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r2, r11, r0)
            boolean r0 = r0.booleanValue()
            r1.i = r0
            java.lang.String r0 = "message"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r9, r0, r12)
            r1.t = r0
            java.lang.String r0 = "existence_classes"
            java.util.List r0 = com.applovin.impl.sdk.utils.JsonUtils.getList(r2, r0, r12)
            if (r0 == 0) goto L_0x00fd
            boolean r0 = com.applovin.impl.sdk.utils.Utils.checkClassesExistence(r0)
            goto L_0x0107
        L_0x00fd:
            java.lang.String r0 = "existence_class"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            boolean r0 = com.applovin.impl.sdk.utils.Utils.checkClassExistence(r0)
        L_0x0107:
            r1.f14708d = r0
            java.util.List r9 = java.util.Collections.emptyList()
            java.lang.String r0 = r1.p
            com.applovin.mediation.adapter.MaxAdapter r0 = com.applovin.impl.mediation.c.c.b(r0, r3)
            if (r0 == 0) goto L_0x019d
            r1.f14709e = r10
            java.lang.String r11 = r0.getAdapterVersion()     // Catch:{ all -> 0x0139 }
            java.lang.String r13 = r0.getSdkVersion()     // Catch:{ all -> 0x0136 }
            if (r13 == 0) goto L_0x0126
            java.lang.String r13 = r0.getSdkVersion()     // Catch:{ all -> 0x0136 }
            goto L_0x0127
        L_0x0126:
            r13 = r5
        L_0x0127:
            java.util.List r9 = r1.a((com.applovin.mediation.adapter.MaxAdapter) r0)     // Catch:{ all -> 0x0134 }
            boolean r0 = r0.isBeta()     // Catch:{ all -> 0x0134 }
            r14 = r13
            r13 = r11
            r11 = r9
            r9 = r0
            goto L_0x015e
        L_0x0134:
            r0 = move-exception
            goto L_0x013c
        L_0x0136:
            r0 = move-exception
            r13 = r5
            goto L_0x013c
        L_0x0139:
            r0 = move-exception
            r11 = r5
            r13 = r11
        L_0x013c:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Failed to load adapter for network "
            r14.append(r15)
            java.lang.String r15 = r1.n
            r14.append(r15)
            java.lang.String r15 = ". Please check that you have a compatible network SDK integrated. Error: "
            r14.append(r15)
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            com.applovin.impl.sdk.v.i(r4, r0)
            r14 = r13
            r13 = r11
            r11 = r9
            r9 = 0
        L_0x015e:
            java.lang.String r0 = r1.p     // Catch:{ all -> 0x0186 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0186 }
            java.lang.String r15 = "loadNativeAd"
            r12 = 3
            java.lang.Class[] r12 = new java.lang.Class[r12]     // Catch:{ all -> 0x0186 }
            java.lang.Class<com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters> r17 = com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters.class
            r12[r7] = r17     // Catch:{ all -> 0x0186 }
            java.lang.Class<android.app.Activity> r17 = android.app.Activity.class
            r12[r10] = r17     // Catch:{ all -> 0x0186 }
            r17 = 2
            java.lang.Class<com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener> r18 = com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener.class
            r12[r17] = r18     // Catch:{ all -> 0x0186 }
            java.lang.reflect.Method r12 = r0.getMethod(r15, r12)     // Catch:{ all -> 0x0186 }
            java.lang.Class r12 = r12.getDeclaringClass()     // Catch:{ all -> 0x0186 }
            boolean r0 = r12.equals(r0)     // Catch:{ all -> 0x0186 }
            r4 = r9
            r9 = r11
            goto L_0x01a3
        L_0x0186:
            r0 = move-exception
            r21.D()
            boolean r12 = com.applovin.impl.sdk.v.a()
            if (r12 == 0) goto L_0x0199
            com.applovin.impl.sdk.v r12 = r21.D()
            java.lang.String r15 = "Failed to check if adapter overrides MaxNativeAdAdapter"
            r12.b(r4, r15, r0)
        L_0x0199:
            r4 = r9
            r9 = r11
            r0 = 0
            goto L_0x01a3
        L_0x019d:
            r1.f14709e = r7
            r13 = r5
            r14 = r13
            r0 = 0
            r4 = 0
        L_0x01a3:
            r1.r = r13
            r1.q = r14
            r1.v = r9
            r1.k = r0
            java.util.List r0 = r1.a(r8, r13, r3)
            r1.x = r0
            java.lang.String r0 = "alternative_network"
            r9 = 0
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r2, (java.lang.String) r0, (org.json.JSONObject) r9)
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r0, r6, r5)
            boolean r0 = com.applovin.impl.sdk.utils.Utils.checkClassExistence(r0)
            r1.f14711g = r0
            com.applovin.impl.mediation.debugger.b.c.b$a r0 = r19.D()
            r1.f14706b = r0
            java.lang.String r0 = r1.s
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x01d4
            if (r4 != 0) goto L_0x01d4
            r0 = 1
            goto L_0x01d5
        L_0x01d4:
            r0 = 0
        L_0x01d5:
            r1.f14710f = r0
            android.content.Context r0 = r21.P()
            java.lang.String r2 = r1.n
            java.lang.String r4 = "_"
            int r2 = r2.lastIndexOf(r4)
            r4 = -1
            if (r2 == r4) goto L_0x01f1
            java.lang.String r4 = r1.n
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r2 = r4.substring(r7, r2)
            goto L_0x01f7
        L_0x01f1:
            java.lang.String r2 = r1.n
            java.lang.String r2 = r2.toLowerCase()
        L_0x01f7:
            android.content.res.Resources r4 = r0.getResources()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "applovin_ic_mediation_"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.String r5 = r0.getPackageName()
            java.lang.String r6 = "drawable"
            int r2 = r4.getIdentifier(r2, r6, r5)
            r1.u = r2
            com.applovin.mediation.adapter.MaxAdapter$InitializationStatus r2 = com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.NOT_INITIALIZED
            int r2 = r2.getCode()
            r1.f14707c = r2
            com.applovin.communicator.AppLovinCommunicator r0 = com.applovin.communicator.AppLovinCommunicator.getInstance(r0)
            java.lang.String r2 = "adapter_initialization_status"
            r0.subscribe((com.applovin.communicator.AppLovinCommunicatorSubscriber) r1, (java.lang.String) r2)
            com.applovin.impl.mediation.e r0 = r21.G()
            java.util.LinkedHashMap r0 = r0.b()
            java.lang.String r2 = r1.p
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x0247
            java.lang.String r2 = r1.p
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.f14707c = r0
        L_0x0247:
            java.lang.String r0 = "amazon_marketplace"
            r2 = 0
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r8, (java.lang.String) r0, (org.json.JSONObject) r2)
            if (r0 == 0) goto L_0x02a1
            boolean r3 = r1.f14708d
            if (r3 == 0) goto L_0x02a1
            r1.B = r10
            java.lang.String r3 = "test_mode_app_id"
            java.lang.String r3 = com.applovin.impl.sdk.utils.JsonUtils.getString(r0, r3, r2)
            r1.C = r3
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "test_mode_slot_ids"
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r0, (java.lang.String) r3, (org.json.JSONObject) r2)
            int r2 = r0.length()
            java.util.Map r2 = com.applovin.impl.sdk.utils.CollectionUtils.map((int) r2)
            java.util.Iterator r3 = r0.keys()
        L_0x0275:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02a6
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.applovin.mediation.MaxAdFormat r5 = com.applovin.mediation.MaxAdFormat.formatFromString(r4)
            r6 = 0
            org.json.JSONObject r4 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r0, (java.lang.String) r4, (org.json.JSONObject) r6)
            if (r5 == 0) goto L_0x0275
            if (r4 != 0) goto L_0x028f
            goto L_0x0275
        L_0x028f:
            java.lang.String r7 = "uuid"
            java.lang.String r7 = com.applovin.impl.sdk.utils.JsonUtils.getString(r4, r7, r6)
            if (r7 != 0) goto L_0x0298
            goto L_0x0275
        L_0x0298:
            com.applovin.impl.mediation.debugger.a.b r6 = new com.applovin.impl.mediation.debugger.a.b
            r6.<init>(r7, r4, r5)
            r2.put(r5, r6)
            goto L_0x0275
        L_0x02a1:
            r1.B = r7
            r2 = 0
            r1.C = r2
        L_0x02a6:
            r1.D = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.b.c.b.<init>(org.json.JSONObject, com.applovin.impl.sdk.n):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        r0 = com.applovin.impl.mediation.debugger.b.c.b.a.f14713a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r3.f14711g != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r3.f14709e != false) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.impl.mediation.debugger.b.c.b.a D() {
        /*
            r3 = this;
            boolean r0 = r3.f14708d
            if (r0 == 0) goto L_0x0010
            boolean r0 = r3.f14709e
            if (r0 == 0) goto L_0x000b
            com.applovin.impl.mediation.debugger.b.c.b$a r0 = com.applovin.impl.mediation.debugger.b.c.b.a.COMPLETE
            goto L_0x0019
        L_0x000b:
            boolean r0 = r3.f14711g
            if (r0 == 0) goto L_0x0014
            goto L_0x0017
        L_0x0010:
            boolean r0 = r3.f14709e
            if (r0 == 0) goto L_0x0017
        L_0x0014:
            com.applovin.impl.mediation.debugger.b.c.b$a r0 = com.applovin.impl.mediation.debugger.b.c.b.a.INCOMPLETE_INTEGRATION
            goto L_0x0019
        L_0x0017:
            com.applovin.impl.mediation.debugger.b.c.b$a r0 = com.applovin.impl.mediation.debugger.b.c.b.a.MISSING
        L_0x0019:
            com.applovin.impl.mediation.debugger.b.c.b$a r1 = com.applovin.impl.mediation.debugger.b.c.b.a.MISSING
            if (r0 != r1) goto L_0x001e
            return r0
        L_0x001e:
            java.util.List<com.applovin.impl.mediation.debugger.b.c.d> r1 = r3.w
            java.util.Iterator r1 = r1.iterator()
        L_0x0024:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r1.next()
            com.applovin.impl.mediation.debugger.b.c.d r2 = (com.applovin.impl.mediation.debugger.b.c.d) r2
            boolean r2 = r2.c()
            if (r2 != 0) goto L_0x0024
            com.applovin.impl.mediation.debugger.b.c.b$a r0 = com.applovin.impl.mediation.debugger.b.c.b.a.INVALID_INTEGRATION
            return r0
        L_0x0039:
            java.util.List<com.applovin.impl.mediation.debugger.b.c.a> r1 = r3.x
            java.util.Iterator r1 = r1.iterator()
        L_0x003f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0054
            java.lang.Object r2 = r1.next()
            com.applovin.impl.mediation.debugger.b.c.a r2 = (com.applovin.impl.mediation.debugger.b.c.a) r2
            boolean r2 = r2.c()
            if (r2 != 0) goto L_0x003f
            com.applovin.impl.mediation.debugger.b.c.b$a r0 = com.applovin.impl.mediation.debugger.b.c.b.a.INVALID_INTEGRATION
            return r0
        L_0x0054:
            boolean r1 = r3.m
            if (r1 == 0) goto L_0x0061
            boolean r1 = com.applovin.impl.sdk.n.B()
            if (r1 != 0) goto L_0x0061
            com.applovin.impl.mediation.debugger.b.c.b$a r0 = com.applovin.impl.mediation.debugger.b.c.b.a.INVALID_INTEGRATION
            return r0
        L_0x0061:
            com.applovin.impl.mediation.debugger.b.c.c r1 = r3.z
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0073
            com.applovin.impl.mediation.debugger.b.c.c r1 = r3.z
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x0073
            com.applovin.impl.mediation.debugger.b.c.b$a r0 = com.applovin.impl.mediation.debugger.b.c.b.a.INCOMPLETE_INTEGRATION
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.b.c.b.D():com.applovin.impl.mediation.debugger.b.c.b$a");
    }

    private List<MaxAdFormat> a(MaxAdapter maxAdapter) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxRewardedInterstitialAdapter) {
            arrayList.add(MaxAdFormat.REWARDED_INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            arrayList.add(MaxAdFormat.MREC);
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List<String> a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", (JSONArray) null), (List) null);
    }

    private List<d> a(JSONObject jSONObject, n nVar) {
        ArrayList arrayList = new ArrayList();
        if (this.p.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            d dVar = new d("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", nVar.P());
            if (dVar.c()) {
                arrayList.add(dVar);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new d(next, jSONObject2.getString(next), nVar.P()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List<a> a(JSONObject jSONObject, String str, n nVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new a(jSONObject2, nVar));
            }
        }
        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i3, (JSONObject) null);
            if (jSONObject3 != null && a.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", (String) null), JsonUtils.getString(jSONObject3, "max_adapter_version", (String) null))) {
                arrayList.add(new a(jSONObject3, nVar));
            }
        }
        return arrayList;
    }

    public boolean A() {
        return this.B;
    }

    public String B() {
        return this.C;
    }

    public Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.b> C() {
        return this.D;
    }

    /* renamed from: a */
    public int compareTo(b bVar) {
        return this.o.compareToIgnoreCase(bVar.o);
    }

    public a a() {
        return this.f14706b;
    }

    public int b() {
        return this.f14707c;
    }

    public C0146b c() {
        return !this.f14712h ? C0146b.NOT_SUPPORTED : (this.f14706b == a.COMPLETE || (this.f14706b == a.INCOMPLETE_INTEGRATION && d() && e())) ? !this.f14705a.N().a() ? C0146b.DISABLED : (!this.i || !(this.f14707c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f14707c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? C0146b.READY : C0146b.NOT_INITIALIZED : C0146b.INVALID_INTEGRATION;
    }

    public boolean d() {
        return this.f14708d;
    }

    public boolean e() {
        return this.f14709e;
    }

    public boolean f() {
        return this.f14710f;
    }

    public boolean g() {
        return this.f14706b == a.MISSING && this.j;
    }

    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public String h() {
        return this.n;
    }

    public String i() {
        return this.o;
    }

    public String j() {
        return this.q;
    }

    public String k() {
        return this.r;
    }

    public String l() {
        return this.s;
    }

    public String m() {
        return this.p;
    }

    public List<String> n() {
        return this.y;
    }

    public int o() {
        return this.u;
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.p.equals(string)) {
            this.f14707c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter b2 = c.b(string, this.f14705a);
            if (b2 != null && !this.q.equals(b2.getSdkVersion())) {
                this.q = b2.getSdkVersion();
                this.f14705a.aj().a(this.q, string);
            }
        }
    }

    public List<MaxAdFormat> p() {
        return this.v;
    }

    public boolean q() {
        return this.k;
    }

    public List<d> r() {
        return this.w;
    }

    public List<a> s() {
        return this.x;
    }

    public boolean t() {
        return this.m;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.n + ", displayName=" + this.o + ", sdkAvailable=" + this.f14708d + ", sdkVersion=" + this.q + ", adapterAvailable=" + this.f14709e + ", adapterVersion=" + this.r + "}";
    }

    public final c u() {
        return this.z;
    }

    public Map<MaxAdFormat, String> v() {
        return this.A;
    }

    public String w() {
        return this.t;
    }

    public boolean x() {
        return this.l;
    }

    public final n y() {
        return this.f14705a;
    }

    public final String z() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------- ");
        sb.append(this.n);
        sb.append(" ----------");
        sb.append("\nStatus  - ");
        sb.append(this.f14706b.a());
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.f14708d || TextUtils.isEmpty(this.q)) ? str : this.q);
        sb.append("\nAdapter - ");
        if (this.f14709e && !TextUtils.isEmpty(this.r)) {
            str = this.r;
        }
        sb.append(str);
        if (this.z.a() && !this.z.b()) {
            sb.append("\n* ");
            sb.append(this.z.c());
        }
        for (d next : r()) {
            if (!next.c()) {
                sb.append("\n* MISSING ");
                sb.append(next.a());
                sb.append(": ");
                sb.append(next.b());
            }
        }
        for (a next2 : s()) {
            if (!next2.c()) {
                sb.append("\n* MISSING ");
                sb.append(next2.a());
                sb.append(": ");
                sb.append(next2.b());
            }
        }
        return sb.toString();
    }
}
