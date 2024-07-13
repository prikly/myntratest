package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.b.a.e;
import com.bytedance.sdk.component.d.d.d;
import com.bytedance.sdk.component.d.d.g;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.d.n;
import com.bytedance.sdk.component.e.d.c;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.b.i;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.core.e.s;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.utils.m;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NetApiImpl */
public class o implements n<com.bytedance.sdk.openadsdk.b.a> {

    /* renamed from: g  reason: collision with root package name */
    private static volatile boolean f1486g = false;
    private static boolean i = true;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f1487a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1488b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f1489c = Executors.newFixedThreadPool(1);

    /* renamed from: d  reason: collision with root package name */
    private final String f1490d;

    /* renamed from: e  reason: collision with root package name */
    private long f1491e;

    /* renamed from: f  reason: collision with root package name */
    private int f1492f;

    /* renamed from: h  reason: collision with root package name */
    private n f1493h = new n() {
        public void a(int i, String str, Throwable th) {
        }

        public void a(j jVar) {
        }
    };

    /* compiled from: NetApiImpl */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final int f1518a;

        /* renamed from: b  reason: collision with root package name */
        final long f1519b;

        /* renamed from: c  reason: collision with root package name */
        final long f1520c;

        /* renamed from: d  reason: collision with root package name */
        final int f1521d;

        /* renamed from: e  reason: collision with root package name */
        final String f1522e;

        /* renamed from: f  reason: collision with root package name */
        final int f1523f;

        /* renamed from: g  reason: collision with root package name */
        final String f1524g;

        /* renamed from: h  reason: collision with root package name */
        public final com.bytedance.sdk.openadsdk.core.e.a f1525h;
        final String i;
        final ArrayList<Integer> j;

        private a(String str, int i2, int i3, String str2, int i4, String str3, com.bytedance.sdk.openadsdk.core.e.a aVar, long j2, long j3, ArrayList<Integer> arrayList) {
            this.f1518a = i2;
            this.f1521d = i3;
            this.f1522e = str2;
            this.f1524g = str3;
            this.f1525h = aVar;
            this.i = str;
            this.f1523f = i4;
            this.f1519b = j2;
            this.f1520c = j3;
            this.j = arrayList;
        }

        public static a a(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.e.o oVar) {
            a aVar;
            JSONObject jSONObject2 = jSONObject;
            String optString = jSONObject2.optString(d.d1657027613261dc("dhf"));
            int optInt = jSONObject2.optInt(d.d1657027613261dc("psm`avunfnUe`kP}b"));
            long optLong = jSONObject2.optLong(d.d1657027613261dc("s^pfg`oqmV~x"));
            long optLong2 = jSONObject2.optLong(d.d1657027613261dc("s^qfjaYs{"));
            int optInt2 = jSONObject2.optInt(i.i1657027613257dc("sucwqvYdgmo"));
            String optString2 = jSONObject2.optString(i.i1657027613257dc("ddq`"));
            String optString3 = jSONObject2.optString(i.i1657027613257dc("rdsvavrXam"));
            int optInt3 = jSONObject2.optInt(i.i1657027613257dc("rdcpkk"));
            Pair<com.bytedance.sdk.openadsdk.core.e.a, ArrayList<Integer>> a2 = b.a(jSONObject, adSlot, oVar);
            if (!(a2 == null || a2.first == null)) {
                ((com.bytedance.sdk.openadsdk.core.e.a) a2.first).a(jSONObject2.optLong(i.i1657027613257dc("rdsvavrXio~n~")));
            }
            if (a2 == null) {
                return aVar;
            }
            new a(optString, optInt, optInt2, optString2, optInt3, optString3, (com.bytedance.sdk.openadsdk.core.e.a) a2.first, optLong, optLong2, (ArrayList) a2.second);
            return aVar;
        }
    }

    /* compiled from: NetApiImpl */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f1526a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f1527b;

        /* renamed from: c  reason: collision with root package name */
        public final s f1528c;

        private b(int i, boolean z, s sVar) {
            this.f1526a = i;
            this.f1527b = z;
            this.f1528c = sVar;
        }

        public static b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int optInt = jSONObject.optInt(e.e1657027613270dc("cnff"));
            boolean optBoolean = jSONObject.optBoolean(e.e1657027613270dc("vdpjb|"));
            JSONObject optJSONObject = jSONObject.optJSONObject(e.e1657027613270dc("d`vb"));
            s sVar = new s();
            if (optJSONObject != null) {
                try {
                    sVar.a(optJSONObject.optInt(e.e1657027613270dc("rdcpkk")));
                    sVar.b(optJSONObject.optInt(e.e1657027613270dc("cnps[qwm")));
                    sVar.c(optJSONObject.optInt(e.e1657027613270dc("rdubvaYfefex")));
                    sVar.a(optJSONObject.optString(e.e1657027613270dc("rdubvaYiido")));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return new b(optInt, optBoolean, sVar);
        }
    }

    o(Context context) {
        this.f1487a = context;
        this.f1488b = d();
        this.f1490d = g();
    }

    private static String a(int i2) {
        String str;
        if (i2 != 120) {
            if (i2 != 160) {
                if (i2 == 240) {
                    str = "herj";
                } else if (i2 == 320) {
                    str = "xifsm";
                } else if (i2 == 480) {
                    str = "xyjgtl";
                } else if (i2 == 640) {
                    str = "xyzk`uo";
                }
            }
            return c.c1657027613239dc("merj");
        }
        str = "lerj";
        return c.c1657027613239dc(str);
    }

    private static String a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g.g1657027613257dc("pimma"));
            return telephonyManager == null ? "" : telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static JSONObject a(AdSlot adSlot) {
        p pVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("pdppkkgkasooSlj"), m.h().A());
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("llv"), com.bytedance.sdk.openadsdk.utils.e.b());
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("cnrse"), h.d().k());
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("gerq"), h.d().j());
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ir]d`utX}zoy"), m.h().x());
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("cbrb"), h.d().v());
            if (!(adSlot == null || !p.f1529a.containsKey(Integer.valueOf(adSlot.getCodeId())) || (pVar = p.f1529a.get(Integer.valueOf(adSlot.getCodeId()))) == null)) {
                jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("l`qweaiji`d"), pVar.b());
                jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("l`qwfphcdl"), pVar.c());
                jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("l`qwgiodc"), pVar.d());
                jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("l`qwwnow"), pVar.e());
            }
            a(jSONObject, com.bytedance.sdk.component.e.c.d.d1657027613220dc("kd{tkwbt"), h.d().m());
            a(jSONObject, com.bytedance.sdk.component.e.c.d.d1657027613220dc("d`vb"), b(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0126 A[Catch:{ Exception -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012a A[Catch:{ Exception -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0148 A[Catch:{ Exception -> 0x017d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject a(com.bytedance.sdk.openadsdk.AdSlot r6, int r7, com.bytedance.sdk.openadsdk.core.e.o r8) {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "ie"
            java.lang.String r1 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r1)     // Catch:{ Exception -> 0x017d }
            java.lang.String r2 = r6.getCodeId()     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = "aevzt`"
            java.lang.String r1 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r1)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r7)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = r6.getAdId()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x017d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x017d }
            if (r1 == 0) goto L_0x003f
            java.lang.String r1 = r6.getCreativeId()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x017d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x017d }
            if (r1 == 0) goto L_0x003f
            java.lang.String r1 = r6.getExt()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x017d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x017d }
            if (r1 != 0) goto L_0x0092
        L_0x003f:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x017d }
            r1.<init>()     // Catch:{ Exception -> 0x017d }
            java.lang.String r2 = r6.getAdId()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x017d }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x017d }
            if (r2 != 0) goto L_0x005d
            java.lang.String r2 = "ae]j`"
            java.lang.String r2 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r3 = r6.getAdId()     // Catch:{ Exception -> 0x017d }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x017d }
        L_0x005d:
            java.lang.String r2 = r6.getCreativeId()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x017d }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x017d }
            if (r2 != 0) goto L_0x0076
            java.lang.String r2 = "csgbplpbW`n"
            java.lang.String r2 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r3 = r6.getCreativeId()     // Catch:{ Exception -> 0x017d }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x017d }
        L_0x0076:
            java.lang.String r2 = r6.getExt()     // Catch:{ Exception -> 0x017d }
            if (r2 == 0) goto L_0x0089
            java.lang.String r2 = "eyv"
            java.lang.String r2 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r3 = r6.getExt()     // Catch:{ Exception -> 0x017d }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x017d }
        L_0x0089:
            java.lang.String r2 = "psgum`qXimy"
            java.lang.String r2 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r2)     // Catch:{ Exception -> 0x017d }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x017d }
        L_0x0092:
            java.lang.String r1 = "rdlgawYjm}bdh"
            java.lang.String r2 = "abaftqccWzcqi"
            r3 = 1
            if (r8 == 0) goto L_0x00cb
            java.lang.String r1 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r1)     // Catch:{ Exception -> 0x017d }
            int r4 = r8.f1146f     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r4)     // Catch:{ Exception -> 0x017d }
            int r1 = r8.f1146f     // Catch:{ Exception -> 0x017d }
            if (r1 != r3) goto L_0x00b6
            java.lang.String r1 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r2)     // Catch:{ Exception -> 0x017d }
            int r2 = r6.getImgAcceptedWidth()     // Catch:{ Exception -> 0x017d }
        L_0x00ae:
            int r4 = r6.getImgAcceptedHeight()     // Catch:{ Exception -> 0x017d }
            r5.a((org.json.JSONObject) r0, (java.lang.String) r1, (int) r2, (int) r4)     // Catch:{ Exception -> 0x017d }
            goto L_0x00db
        L_0x00b6:
            int r1 = r8.f1146f     // Catch:{ Exception -> 0x017d }
            r4 = 2
            if (r1 != r4) goto L_0x00db
            java.lang.String r1 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r2)     // Catch:{ Exception -> 0x017d }
            float r2 = r6.getExpressViewAcceptedWidth()     // Catch:{ Exception -> 0x017d }
            float r4 = r6.getExpressViewAcceptedHeight()     // Catch:{ Exception -> 0x017d }
            r5.a((org.json.JSONObject) r0, (java.lang.String) r1, (float) r2, (float) r4)     // Catch:{ Exception -> 0x017d }
            goto L_0x00db
        L_0x00cb:
            java.lang.String r1 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r1)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r2)     // Catch:{ Exception -> 0x017d }
            int r2 = r6.getImgAcceptedWidth()     // Catch:{ Exception -> 0x017d }
            goto L_0x00ae
        L_0x00db:
            java.lang.String r1 = "puro[lbt"
            java.lang.String r1 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r1)     // Catch:{ Exception -> 0x017d }
            com.bytedance.sdk.openadsdk.core.i.f r2 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch:{ Exception -> 0x017d }
            java.lang.String r4 = r6.getCodeId()     // Catch:{ Exception -> 0x017d }
            org.json.JSONArray r2 = r2.g((java.lang.String) r4)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = "pnq"
            java.lang.String r1 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r1)     // Catch:{ Exception -> 0x017d }
            int r2 = com.bytedance.sdk.openadsdk.AdSlot.getPosition(r7)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = "ir]pquvhz}Uo|a"
            java.lang.String r1 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r1)     // Catch:{ Exception -> 0x017d }
            boolean r2 = r6.isSupportDeepLink()     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017d }
            int r1 = r6.getNativeAdType()     // Catch:{ Exception -> 0x017d }
            if (r1 > 0) goto L_0x0117
            r1 = 9
            if (r7 == r1) goto L_0x0117
            r1 = 5
            if (r7 != r1) goto L_0x0120
        L_0x0117:
            java.lang.String r1 = "ir]lvlanfVko"
            java.lang.String r1 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r1)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x017d }
        L_0x0120:
            int r1 = r6.getAdCount()     // Catch:{ Exception -> 0x017d }
            if (r1 >= r3) goto L_0x0127
            r1 = 1
        L_0x0127:
            r2 = 3
            if (r1 <= r2) goto L_0x012b
            r1 = 3
        L_0x012b:
            r2 = 7
            if (r7 == r2) goto L_0x0132
            r2 = 8
            if (r7 != r2) goto L_0x0133
        L_0x0132:
            r1 = 1
        L_0x0133:
            if (r8 == 0) goto L_0x013d
            org.json.JSONArray r8 = r8.f1145e     // Catch:{ Exception -> 0x017d }
            if (r8 == 0) goto L_0x013d
            int r1 = r6.getAdCount()     // Catch:{ Exception -> 0x017d }
        L_0x013d:
            java.lang.String r8 = "ae]`kphs"
            java.lang.String r8 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r8)     // Catch:{ Exception -> 0x017d }
            r0.put(r8, r1)     // Catch:{ Exception -> 0x017d }
            if (r7 != r3) goto L_0x017d
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x017d }
            r7.<init>()     // Catch:{ Exception -> 0x017d }
            java.lang.String r8 = "ir]qkqgsmVhjbck}"
            java.lang.String r8 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r8)     // Catch:{ Exception -> 0x017d }
            int r1 = r6.getIsRotateBanner()     // Catch:{ Exception -> 0x017d }
            r7.put(r8, r1)     // Catch:{ Exception -> 0x017d }
            java.lang.String r8 = "rnvbp`Ysado"
            java.lang.String r8 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r8)     // Catch:{ Exception -> 0x017d }
            int r1 = r6.getRotateTime()     // Catch:{ Exception -> 0x017d }
            r7.put(r8, r1)     // Catch:{ Exception -> 0x017d }
            java.lang.String r8 = "rnvbp`Yhzmoy"
            java.lang.String r8 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r8)     // Catch:{ Exception -> 0x017d }
            int r6 = r6.getRotateOrder()     // Catch:{ Exception -> 0x017d }
            r7.put(r8, r6)     // Catch:{ Exception -> 0x017d }
            java.lang.String r6 = "b`lmaw"
            java.lang.String r6 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r6)     // Catch:{ Exception -> 0x017d }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x017d }
        L_0x017d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.a(com.bytedance.sdk.openadsdk.AdSlot, int, com.bytedance.sdk.openadsdk.core.e.o):org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[Catch:{ all -> 0x015a }] */
    @com.bytedance.JProtect
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject a(com.bytedance.sdk.openadsdk.AdSlot r11, com.bytedance.sdk.openadsdk.core.e.o r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "aqr"
            java.lang.String r1 = "4/7-4+0"
            java.lang.String r2 = "ae]p`nYqm{ybcc"
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x015a }
            r4.<init>()     // Catch:{ all -> 0x015a }
            if (r12 == 0) goto L_0x0020
            java.lang.String r5 = r12.f1141a     // Catch:{ all -> 0x015a }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x015a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x015a }
            if (r5 == 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            java.lang.String r5 = r12.f1141a     // Catch:{ all -> 0x015a }
            goto L_0x0024
        L_0x0020:
            java.lang.String r5 = com.bytedance.sdk.openadsdk.utils.u.c()     // Catch:{ all -> 0x015a }
        L_0x0024:
            r6 = 7
            java.lang.String r7 = "rds\\p|vb"
            if (r13 != r6) goto L_0x0039
            if (r12 == 0) goto L_0x005a
            int r6 = r12.f1142b     // Catch:{ all -> 0x015a }
            if (r6 <= 0) goto L_0x005a
            java.lang.String r6 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r7)     // Catch:{ all -> 0x015a }
            int r7 = r12.f1142b     // Catch:{ all -> 0x015a }
        L_0x0035:
            r4.put(r6, r7)     // Catch:{ all -> 0x015a }
            goto L_0x005a
        L_0x0039:
            r6 = 8
            if (r13 != r6) goto L_0x004a
            if (r12 == 0) goto L_0x005a
            int r6 = r12.f1143c     // Catch:{ all -> 0x015a }
            if (r6 <= 0) goto L_0x005a
            java.lang.String r6 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r7)     // Catch:{ all -> 0x015a }
            int r7 = r12.f1143c     // Catch:{ all -> 0x015a }
            goto L_0x0035
        L_0x004a:
            r6 = 3
            if (r13 != r6) goto L_0x005a
            if (r12 == 0) goto L_0x005a
            int r6 = r12.f1144d     // Catch:{ all -> 0x015a }
            if (r6 <= 0) goto L_0x005a
            java.lang.String r6 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r7)     // Catch:{ all -> 0x015a }
            int r7 = r12.f1144d     // Catch:{ all -> 0x015a }
            goto L_0x0035
        L_0x005a:
            com.bytedance.sdk.openadsdk.core.i.f r6 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch:{ all -> 0x008e }
            java.lang.String r6 = r6.e()     // Catch:{ all -> 0x008e }
            com.bytedance.sdk.openadsdk.core.i.f r7 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch:{ all -> 0x008e }
            java.lang.String r7 = r7.f()     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x008e
            if (r7 == 0) goto L_0x008e
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x008e }
            r8.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r9 = "vdppmjh"
            java.lang.String r9 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r9)     // Catch:{ all -> 0x008e }
            r8.put(r9, r6)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "p`pbi"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r6)     // Catch:{ all -> 0x008e }
            r8.put(r6, r7)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "acvfwq"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r6)     // Catch:{ all -> 0x008e }
            r4.put(r6, r8)     // Catch:{ all -> 0x008e }
        L_0x008e:
            java.lang.String r6 = "rdsvavrXam"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r6)     // Catch:{ all -> 0x015a }
            r4.put(r6, r5)     // Catch:{ all -> 0x015a }
            java.lang.String r6 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r2)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r1)     // Catch:{ all -> 0x015a }
            r4.put(r6, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r6 = "snwqg`Ysqyo"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r6)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r0)     // Catch:{ all -> 0x015a }
            r4.put(r6, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r0)     // Catch:{ all -> 0x015a }
            org.json.JSONObject r6 = r10.b()     // Catch:{ all -> 0x015a }
            r4.put(r0, r6)     // Catch:{ all -> 0x015a }
            android.content.Context r0 = r10.f1487a     // Catch:{ all -> 0x015a }
            r6 = 1
            org.json.JSONObject r0 = com.bytedance.sdk.openadsdk.utils.e.a(r0, r6)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = "ddtjg`"
            java.lang.String r7 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r7)     // Catch:{ all -> 0x015a }
            r4.put(r7, r0)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "urgq"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r0)     // Catch:{ all -> 0x015a }
            org.json.JSONObject r7 = a((com.bytedance.sdk.openadsdk.AdSlot) r11)     // Catch:{ all -> 0x015a }
            r4.put(r0, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "u`"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r0)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = com.bytedance.sdk.openadsdk.utils.u.b()     // Catch:{ all -> 0x015a }
            r4.put(r0, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "cicmj`j"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r0)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = "m`km"
            java.lang.String r7 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r7)     // Catch:{ all -> 0x015a }
            r4.put(r0, r7)     // Catch:{ all -> 0x015a }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x015a }
            r0.<init>()     // Catch:{ all -> 0x015a }
            org.json.JSONObject r13 = r10.a((com.bytedance.sdk.openadsdk.AdSlot) r11, (int) r13, (com.bytedance.sdk.openadsdk.core.e.o) r12)     // Catch:{ all -> 0x015a }
            r0.put(r13)     // Catch:{ all -> 0x015a }
            java.lang.String r13 = "aeqokqu"
            java.lang.String r13 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r13)     // Catch:{ all -> 0x015a }
            r4.put(r13, r0)     // Catch:{ all -> 0x015a }
            r10.a((org.json.JSONObject) r4, (com.bytedance.sdk.openadsdk.core.e.o) r12)     // Catch:{ all -> 0x015a }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x015a }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r7
            java.lang.String r0 = "tr"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r0)     // Catch:{ all -> 0x015a }
            r4.put(r0, r12)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = ""
            java.lang.String r7 = r11.getCodeId()     // Catch:{ all -> 0x015a }
            if (r7 == 0) goto L_0x0135
            if (r5 == 0) goto L_0x0135
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x015a }
            java.lang.String r11 = r11.getCodeId()     // Catch:{ all -> 0x015a }
            java.lang.String r11 = r12.concat(r11)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = r11.concat(r5)     // Catch:{ all -> 0x015a }
        L_0x0135:
            java.lang.String r11 = "rds\\wlai"
            java.lang.String r11 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r11)     // Catch:{ all -> 0x015a }
            java.lang.String r12 = com.bytedance.sdk.component.utils.e.a((java.lang.String) r0)     // Catch:{ all -> 0x015a }
            r4.put(r11, r12)     // Catch:{ all -> 0x015a }
            org.json.JSONObject r3 = com.bytedance.sdk.component.utils.a.a((org.json.JSONObject) r4)     // Catch:{ all -> 0x015a }
            java.lang.String r11 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r2)     // Catch:{ all -> 0x015a }
            java.lang.String r12 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r1)     // Catch:{ all -> 0x015a }
            r3.put(r11, r12)     // Catch:{ all -> 0x015a }
            java.lang.String r11 = "owgqw`gX~lxxeb`Pdhbv"
            java.lang.String r11 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r11)     // Catch:{ all -> 0x015a }
            r3.put(r11, r6)     // Catch:{ all -> 0x015a }
        L_0x015a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.a(com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.e.o, int):org.json.JSONObject");
    }

    /* access modifiers changed from: private */
    public void a(long j, String str, int i2, a aVar, int i3, String str2) {
    }

    private void a(com.bytedance.sdk.openadsdk.b.a aVar) {
        if (aVar != null) {
            String optString = aVar.b().optString(i.i1657027613257dc("lne\\a}rui"), "");
            long c2 = u.c(optString);
            int d2 = u.d(optString);
            if (c2 == 0) {
                c2 = this.f1491e;
            }
            this.f1491e = c2;
            if (d2 == 0) {
                d2 = this.f1492f;
            }
            this.f1492f = d2;
        }
    }

    /* access modifiers changed from: private */
    public void a(com.bytedance.sdk.openadsdk.core.e.a aVar) {
        List<com.bytedance.sdk.openadsdk.core.e.n> b2 = aVar.b();
        if (b2 != null && b2.size() != 0) {
            for (int i2 = 0; i2 < b2.size(); i2++) {
                com.bytedance.sdk.openadsdk.core.e.n nVar = b2.get(i2);
                if (nVar != null && nVar.b() == null) {
                    a("", nVar.M());
                    a("", nVar.N());
                    List<k> P = nVar.P();
                    if (P != null && P.size() > 0) {
                        for (int i3 = 0; i3 < P.size(); i3++) {
                            a(nVar, P.get(i3));
                        }
                    }
                    if (nVar.J() != null) {
                        a(nVar.J().h(), (k) null);
                    }
                }
            }
        }
    }

    private void a(final com.bytedance.sdk.openadsdk.core.e.n nVar, k kVar) {
        l.c(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ile@efnb"), com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("lncgMhaFfmXn|b|{*1"));
        if (kVar != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.d.a.a(kVar).a((n) new n() {
                public void a(int i, String str, Throwable th) {
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(c.c1657027613239dc("esplvZehll"), i);
                        jSONObject.put(c.c1657027613239dc("esplvZkb{zkli"), str);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    l.c(c.c1657027613239dc("ile@efnb"), c.c1657027613239dc("lncgMhaFfmXn|b|{*1夣贶"));
                    Context a2 = o.this.f1487a;
                    com.bytedance.sdk.openadsdk.core.e.n nVar = nVar;
                    com.bytedance.sdk.openadsdk.b.e.b(a2, nVar, u.a(nVar), c.c1657027613239dc("lncg[lkfolUn~a}"), currentTimeMillis, jSONObject);
                }

                public void a(j jVar) {
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("psgokdbX{`pn"), jVar.f() / 1024);
                        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("lnabhZefkao"), jVar.d() ? 1 : 0);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    l.c(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ile@efnb"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("lncgMhaFfmXn|b|{*1戂劌"));
                    Context a2 = o.this.f1487a;
                    com.bytedance.sdk.openadsdk.core.e.n nVar = nVar;
                    com.bytedance.sdk.openadsdk.b.e.b(a2, nVar, u.a(nVar), com.bytedance.sdk.component.e.c.g.g1657027613239dc("lncg[lkfolUxynmjcb"), currentTimeMillis, jSONObject);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void a(com.bytedance.sdk.openadsdk.core.e.o oVar, long j, long j2, int i2, long j3, com.bytedance.sdk.openadsdk.core.e.n nVar, String str) {
        com.bytedance.sdk.openadsdk.core.e.o oVar2 = oVar;
        if (m.h().F()) {
            JSONObject jSONObject = new JSONObject();
            long j4 = 0;
            if (oVar2 != null) {
                try {
                    if (oVar2.f1147g > 0) {
                        jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("cmkfjqYt|hxSygbu"), j - oVar2.f1147g);
                        j4 = j3 - oVar2.f1147g;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ndvtkwmX|`gn"), j2 - j);
            int i3 = i2;
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("sdtfvZrnel"), i2);
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("cmkfjqYbfmUe`k"), j3 - j2);
            try {
                com.bytedance.sdk.openadsdk.b.e.a(this.f1487a, nVar, str, com.bytedance.sdk.component.e.c.d.d1657027613220dc("lncg[dbX|`gn"), j4, jSONObject);
                while (true) {
                    char c2 = 19;
                    while (true) {
                        switch (c2) {
                            case 18:
                                return;
                            case 20:
                            default:
                                c2 = 18;
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(n.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
        aVar.a(-1, g.a(-1));
        bVar.a(-1);
        com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
    }

    /* access modifiers changed from: private */
    public void a(n.b bVar) {
        bVar.a(-1, g.a(-1));
    }

    private void a(String str, k kVar) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.d.a.a(str).a(this.f1493h);
        } else if (kVar != null) {
            com.bytedance.sdk.openadsdk.d.a.a(kVar).a(this.f1493h);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r2 = 'J';
        r3 = '7';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        switch(r3) {
            case 55: goto L_0x0029;
            case 56: goto L_0x0029;
            case 57: goto L_0x0021;
            default: goto L_0x0020;
        };
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(org.json.JSONObject r2, com.bytedance.sdk.openadsdk.core.e.o r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0029
            org.json.JSONArray r0 = r3.f1145e
            if (r0 != 0) goto L_0x0007
            goto L_0x0029
        L_0x0007:
            java.lang.String r0 = "snwqg`YsmdkbS}|`tdqgK|rd"
            java.lang.String r0 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r0)     // Catch:{ Exception -> 0x0029 }
            org.json.JSONArray r3 = r3.f1145e     // Catch:{ Exception -> 0x0029 }
            r2.put(r0, r3)     // Catch:{ Exception -> 0x0029 }
        L_0x0012:
            r2 = 73
            r3 = 96
        L_0x0016:
            switch(r2) {
                case 72: goto L_0x0021;
                case 73: goto L_0x001a;
                case 74: goto L_0x001d;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0026
        L_0x001a:
            switch(r3) {
                case 94: goto L_0x0012;
                case 95: goto L_0x0021;
                case 96: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            switch(r3) {
                case 55: goto L_0x0029;
                case 56: goto L_0x0029;
                case 57: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0012
        L_0x0021:
            r2 = 74
            r3 = 55
            goto L_0x0016
        L_0x0026:
            r2 = 72
            goto L_0x0016
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.a(org.json.JSONObject, com.bytedance.sdk.openadsdk.core.e.o):void");
    }

    private void a(JSONObject jSONObject, String str, float f2, float f3) {
        if (f2 >= 0.0f && f3 >= 0.0f) {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            try {
                jSONObject2.put(i.i1657027613257dc("whfwl"), (int) f2);
                jSONObject2.put(i.i1657027613257dc("hdkdlq"), (int) f3);
                jSONArray.put(jSONObject2);
                jSONObject.put(str, jSONArray);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        r4 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        switch(r5) {
            case 52: goto L_0x0029;
            case 53: goto L_0x0033;
            case 54: goto L_0x003e;
            default: goto L_0x0032;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        switch(r4) {
            case 29: goto L_0x0029;
            case 30: goto L_0x0029;
            case 31: goto L_0x002f;
            default: goto L_0x0036;
        };
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(org.json.JSONObject r4, java.lang.String r5, int r6, int r7) {
        /*
            r3 = this;
            if (r6 <= 0) goto L_0x0043
            if (r7 <= 0) goto L_0x0043
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.lang.String r2 = "whfwl"
            java.lang.String r2 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r2)     // Catch:{ Exception -> 0x0043 }
            r0.put(r2, r6)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r6 = "hdkdlq"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r6)     // Catch:{ Exception -> 0x0043 }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x0043 }
            r1.put(r0)     // Catch:{ Exception -> 0x0043 }
            r4.put(r5, r1)     // Catch:{ Exception -> 0x0043 }
            r4 = 55
            r5 = 0
        L_0x0029:
            r6 = 72
        L_0x002b:
            switch(r6) {
                case 72: goto L_0x003e;
                case 73: goto L_0x0039;
                case 74: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0029
        L_0x002f:
            switch(r5) {
                case 52: goto L_0x0029;
                case 53: goto L_0x0033;
                case 54: goto L_0x003e;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x003e
        L_0x0033:
            switch(r4) {
                case 29: goto L_0x0029;
                case 30: goto L_0x0029;
                case 31: goto L_0x002f;
                default: goto L_0x0036;
            }
        L_0x0036:
            r4 = 30
            goto L_0x0033
        L_0x0039:
            r6 = 57
            if (r5 > r6) goto L_0x003e
            goto L_0x0043
        L_0x003e:
            r6 = 73
            r5 = 16
            goto L_0x002b
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.a(org.json.JSONObject, java.lang.String, int, int):void");
    }

    private static void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put(str, str2);
        }
    }

    private static String b(AdSlot adSlot) {
        if (adSlot == null) {
            return "";
        }
        String n = h.d().n();
        String userData = adSlot.getUserData();
        if (TextUtils.isEmpty(n)) {
            return userData;
        }
        if (TextUtils.isEmpty(userData)) {
            return n;
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(userData);
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (jSONObject != null) {
                    hashSet.add(jSONObject.optString(com.bytedance.sdk.component.e.c.a.a1657027613243dc("n`of"), (String) null));
                }
            }
            try {
                JSONArray jSONArray2 = new JSONArray(n);
                int length2 = jSONArray2.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i3);
                    if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString(com.bytedance.sdk.component.e.c.a.a1657027613243dc("n`of"), (String) null))) {
                        jSONArray.put(jSONObject2);
                    }
                }
                return jSONArray.toString();
            } catch (Throwable unused) {
                return userData;
            }
        } catch (Throwable unused2) {
            return n;
        }
    }

    private JSONArray b(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (FilterWord id : list) {
            jSONArray.put(id.getId());
        }
        return jSONArray;
    }

    @JProtect
    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("aqrj`"), h.d().f());
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("n`of"), h.d().g());
            g(jSONObject);
            Context a2 = m.a();
            String str = "";
            if (a2 != null) {
                try {
                    str = a2.getPackageResourcePath();
                } catch (Throwable th) {
                    String g1657027613239dc = com.bytedance.sdk.component.e.c.g.g1657027613239dc("NdvBtlOjxe");
                    l.e(g1657027613239dc, com.bytedance.sdk.component.e.c.g.g1657027613239dc("f`koaa&sg)mnx-zgu1scdytymstr=wqSUCOHDRNGG\n[MNENWT\u0012CUA^\u0019\u0018\\HISO\u0004\u001f") + th.getMessage());
                }
            }
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("p`ahebcXagymabP`pf{"), str);
            int i2 = 0;
            u.a(jSONObject, false);
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ir]selbXiyz"), h.d().l());
            if (s.a() != null) {
                jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("aqi\\wlai"), s.a());
            }
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("aqr\\vphiagmTxdcj"), (System.currentTimeMillis() - TTAdSdk.INIT_TIME) / 1000);
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("flumehc"), com.bytedance.sdk.openadsdk.utils.e.i(this.f1487a));
            String g1657027613239dc2 = com.bytedance.sdk.component.e.c.g.g1657027613239dc("ir]jjlr");
            if (TTAdSdk.isInitSuccess()) {
                i2 = 1;
            }
            jSONObject.put(g1657027613239dc2, i2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @JProtect
    private JSONObject b(com.bytedance.sdk.openadsdk.core.e.n nVar, List<FilterWord> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(d.d1657027613261dc("abvjkk"), d.d1657027613261dc("dhqomnc"));
            jSONObject2.put(d.d1657027613261dc("thofwqgjx"), System.currentTimeMillis());
            jSONObject2.put(d.d1657027613261dc("ae]p`nYqm{ybcc"), c.c1657027613239dc("4/7-4+0"));
            jSONObject2.put(c.c1657027613239dc("eyvqe"), nVar.ac());
            jSONObject2.put(c.c1657027613239dc("fhnwawYpg{nx"), b(list));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put(c.c1657027613239dc("abvjkku"), jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    @JProtect
    public void b(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.e.o oVar, int i2, n.a aVar) {
        AdSlot adSlot2 = adSlot;
        n.a aVar2 = aVar;
        final com.bytedance.sdk.openadsdk.core.e.b bVar = new com.bytedance.sdk.openadsdk.core.e.b();
        bVar.a(adSlot2);
        if (!com.bytedance.sdk.openadsdk.core.i.e.a()) {
            if (aVar2 != null) {
                aVar2.a(1000, com.bytedance.sdk.component.e.c.e.e1657027613237dc("Ae\"qatsb{}*b-zj}a}aug{a9jzin{{\f\u0001rOADUB\bJEEXLM[\u0010H]FF\u0015fVV^V^\u001c|s"));
                bVar.a(1000);
                com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
            }
        } else if (m.h().z()) {
            com.bytedance.sdk.openadsdk.core.i.d.a((com.bytedance.sdk.openadsdk.core.i.b) null).a(false);
            if (aVar2 != null) {
                if (b(adSlot.getCodeId())) {
                    aVar2.a(-8, g.a(-8));
                    bVar.a(-8);
                    com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                } else if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    com.bytedance.sdk.openadsdk.h.b.a().c();
                    bVar.b(2);
                    bVar.a(adSlot.getBidAdm());
                    String e1657027613237dc = com.bytedance.sdk.component.e.c.e.e1657027613237dc("bhfgmka");
                    l.b(e1657027613237dc, com.bytedance.sdk.component.e.c.e.e1657027613237dc("gdvB`%dnlHnf,d}/fp~zp９c8nswp=zvRDAWH\\\u0006WI[YN\fYFJ\u0010CWGAGXR\\\u0019[_JXLK)2'.!+2}h\u000b#/\r)#bn\u001c\u0016fyk") + com.bykv.vk.openvk.component.video.api.f.b.a(adSlot.getBidAdm()));
                    if (m.h().D() && TTAdSdk.getAdManager().getDebugLog() == 1) {
                        u.a(com.bytedance.sdk.component.e.c.e.e1657027613237dc("P`ldh`YCmklS@aku"), adSlot.getBidAdm(), this.f1487a);
                    }
                    try {
                        JSONObject a2 = a(new JSONObject(adSlot.getBidAdm()));
                        if (a2 == null) {
                            a(aVar2, bVar);
                            return;
                        }
                        a a3 = a.a(a2, adSlot2, oVar);
                        bVar.a(a3.j);
                        j.a(this.f1487a, a3.i);
                        if (a3.f1521d != 20000) {
                            aVar2.a(a3.f1521d, a3.f1522e);
                            bVar.a(a3.f1521d);
                            com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                        } else if (a3.f1525h == null) {
                            a(aVar2, bVar);
                        } else {
                            if (a3.f1525h.b() != null && a3.f1525h.b().size() > 0) {
                                com.bytedance.sdk.openadsdk.b.e.a(a3.f1525h.b().get(0), u.b(i2));
                            }
                            a3.f1525h.c(a2.toString());
                            aVar2.a(a3.f1525h, bVar);
                            a(a3.f1525h);
                        }
                    } catch (Throwable th) {
                        l.c(com.bytedance.sdk.component.e.c.e.e1657027613237dc("NdvBtlOjxe"), com.bytedance.sdk.component.e.c.e.e1657027613237dc("gdv#ea&bz{ey6-"), th);
                        a(aVar2, bVar);
                    }
                } else {
                    com.bytedance.sdk.openadsdk.core.e.o oVar2 = oVar;
                    JSONObject a4 = a(adSlot, oVar, i2);
                    if (a4 == null) {
                        aVar2.a(-9, g.a(-9));
                        bVar.a(-9);
                        com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                        return;
                    }
                    if (m.h().D() && TTAdSdk.getAdManager().getDebugLog() == 1) {
                        u.a(com.bytedance.sdk.component.e.c.e.e1657027613237dc("P`ldh`YCmklS@aku"), a4.toString(), this.f1487a);
                    }
                    String a5 = u.a(com.bytedance.sdk.component.e.c.e.e1657027613237dc("/`rj+db(}gcdb\"}k{>uv`Jwsk6"), true);
                    com.bytedance.sdk.component.e.b.d b2 = com.bytedance.sdk.openadsdk.i.d.a().b().b();
                    try {
                        b2.a(com.bytedance.sdk.openadsdk.c.d.a(b2, a5));
                    } catch (Exception unused) {
                    }
                    b2.a(a4);
                    HashMap hashMap = new HashMap();
                    hashMap.put(com.bytedance.sdk.component.e.c.e.e1657027613237dc("eyvqeZrnelUxxl|{"), Long.valueOf(System.currentTimeMillis()));
                    b2.e(hashMap);
                    Map<String, String> a6 = s.a(a5, a4.toString());
                    if (a6 != null && a6.size() > 0) {
                        l.c(com.bytedance.sdk.component.e.c.e.e1657027613237dc("mrqgo%kt{maCiljjbb("), a6.toString());
                        for (String next : a6.keySet()) {
                            try {
                                b2.b(next, a6.get(next));
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    try {
                        b2.b(com.bytedance.sdk.component.e.c.e.e1657027613237dc("Urgq)Dabf}"), u.b());
                    } catch (Exception unused3) {
                    }
                    final long currentTimeMillis = System.currentTimeMillis();
                    final AtomicLong atomicLong = new AtomicLong(currentTimeMillis);
                    final AtomicLong atomicLong2 = new AtomicLong(currentTimeMillis);
                    final n.a aVar3 = aVar;
                    final AdSlot adSlot3 = adSlot;
                    final int i3 = i2;
                    final com.bytedance.sdk.openadsdk.core.e.o oVar3 = oVar;
                    b2.a((com.bytedance.sdk.component.e.a.a) new com.bytedance.sdk.component.e.a.a() {
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                            */
                        /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
                        /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
                        public void a(com.bytedance.sdk.component.e.b.c r23, com.bytedance.sdk.component.e.b r24) {
                            /*
                                r22 = this;
                                r1 = r22
                                java.lang.String r2 = "p`ppaZ`fae"
                                if (r24 == 0) goto L_0x030c
                                boolean r0 = r24.f()
                                if (r0 == 0) goto L_0x02dc
                                java.util.concurrent.atomic.AtomicLong r0 = r3     // Catch:{ all -> 0x02ab }
                                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02ab }
                                r0.set(r3)     // Catch:{ all -> 0x02ab }
                                java.lang.String r0 = r24.d()     // Catch:{ all -> 0x02ab }
                                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x02ab }
                                r3.<init>(r0)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.i.f r4 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch:{ all -> 0x02ab }
                                boolean r4 = r4.D()     // Catch:{ all -> 0x02ab }
                                if (r4 == 0) goto L_0x0046
                                com.bytedance.sdk.openadsdk.TTAdManager r4 = com.bytedance.sdk.openadsdk.TTAdSdk.getAdManager()     // Catch:{ all -> 0x02ab }
                                int r4 = r4.getDebugLog()     // Catch:{ all -> 0x02ab }
                                r5 = 1
                                if (r4 != r5) goto L_0x0046
                                java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "P`ldh`YCmklS@aku"
                                java.lang.String r5 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r5)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r6 = com.bytedance.sdk.openadsdk.core.o.this     // Catch:{ all -> 0x02ab }
                                android.content.Context r6 = r6.f1487a     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.utils.u.a((java.lang.String) r5, (java.lang.String) r4, (android.content.Context) r6)     // Catch:{ all -> 0x02ab }
                            L_0x0046:
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4     // Catch:{ all -> 0x02ab }
                                r4.a((java.lang.String) r0)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.o.this     // Catch:{ all -> 0x02ab }
                                org.json.JSONObject r0 = r0.a((org.json.JSONObject) r3)     // Catch:{ all -> 0x02ab }
                                if (r0 != 0) goto L_0x0076
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.o.this     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.n$a r3 = r5     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4     // Catch:{ all -> 0x02ab }
                                r0.a((com.bytedance.sdk.openadsdk.core.n.a) r3, (com.bytedance.sdk.openadsdk.core.e.b) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r5 = com.bytedance.sdk.openadsdk.core.o.this     // Catch:{ all -> 0x02ab }
                                long r6 = r24.g()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.AdSlot r0 = r6     // Catch:{ all -> 0x02ab }
                                java.lang.String r8 = r0.getCodeId()     // Catch:{ all -> 0x02ab }
                                int r9 = r7     // Catch:{ all -> 0x02ab }
                                r10 = 0
                                r11 = -1
                                java.lang.String r0 = "m`vf$ugu{lUmmdb"
                                java.lang.String r12 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r0)     // Catch:{ all -> 0x02ab }
                                r5.a(r6, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x02ab }
                                return
                            L_0x0076:
                                com.bytedance.sdk.openadsdk.AdSlot r3 = r6     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r4 = r8     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o$a r10 = com.bytedance.sdk.openadsdk.core.o.a.a(r0, r3, r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b r3 = r4     // Catch:{ all -> 0x02ab }
                                java.util.ArrayList<java.lang.Integer> r4 = r10.j     // Catch:{ all -> 0x02ab }
                                r3.a((java.util.ArrayList<java.lang.Integer>) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f1525h     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.b.a.a((com.bytedance.sdk.openadsdk.core.e.a) r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r3 = com.bytedance.sdk.openadsdk.core.o.this     // Catch:{ all -> 0x02ab }
                                android.content.Context r3 = r3.f1487a     // Catch:{ all -> 0x02ab }
                                java.lang.String r4 = r10.i     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.j.a(r3, r4)     // Catch:{ all -> 0x02ab }
                                int r3 = r10.f1521d     // Catch:{ all -> 0x02ab }
                                r4 = 20000(0x4e20, float:2.8026E-41)
                                if (r3 == r4) goto L_0x00e6
                                com.bytedance.sdk.openadsdk.core.e.b r0 = r4     // Catch:{ all -> 0x02ab }
                                int r3 = r10.f1521d     // Catch:{ all -> 0x02ab }
                                r0.a((int) r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.i.f r0 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch:{ all -> 0x02ab }
                                boolean r0 = r0.o()     // Catch:{ all -> 0x02ab }
                                if (r0 != 0) goto L_0x00bf
                                int r0 = r10.f1521d     // Catch:{ all -> 0x02ab }
                                r3 = 40029(0x9c5d, float:5.6093E-41)
                                if (r0 != r3) goto L_0x00bf
                                com.bytedance.sdk.openadsdk.core.n$a r0 = r5     // Catch:{ all -> 0x02ab }
                                r3 = -100
                                java.lang.String r4 = com.bytedance.sdk.openadsdk.core.g.a(r3)     // Catch:{ all -> 0x02ab }
                            L_0x00bb:
                                r0.a((int) r3, (java.lang.String) r4)     // Catch:{ all -> 0x02ab }
                                goto L_0x00c6
                            L_0x00bf:
                                com.bytedance.sdk.openadsdk.core.n$a r0 = r5     // Catch:{ all -> 0x02ab }
                                int r3 = r10.f1521d     // Catch:{ all -> 0x02ab }
                                java.lang.String r4 = r10.f1522e     // Catch:{ all -> 0x02ab }
                                goto L_0x00bb
                            L_0x00c6:
                                com.bytedance.sdk.openadsdk.core.e.b r0 = r4     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b.a((com.bytedance.sdk.openadsdk.core.e.b) r0)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r5 = com.bytedance.sdk.openadsdk.core.o.this     // Catch:{ all -> 0x02ab }
                                long r6 = r24.g()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.AdSlot r0 = r6     // Catch:{ all -> 0x02ab }
                                java.lang.String r8 = r0.getCodeId()     // Catch:{ all -> 0x02ab }
                                int r9 = r7     // Catch:{ all -> 0x02ab }
                                int r11 = r10.f1521d     // Catch:{ all -> 0x02ab }
                                int r0 = r10.f1523f     // Catch:{ all -> 0x02ab }
                                java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02ab }
                                r5.a(r6, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x02ab }
                                goto L_0x02aa
                            L_0x00e6:
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f1525h     // Catch:{ all -> 0x02ab }
                                if (r3 != 0) goto L_0x010a
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.o.this     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.n$a r3 = r5     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4     // Catch:{ all -> 0x02ab }
                                r0.a((com.bytedance.sdk.openadsdk.core.n.a) r3, (com.bytedance.sdk.openadsdk.core.e.b) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r5 = com.bytedance.sdk.openadsdk.core.o.this     // Catch:{ all -> 0x02ab }
                                long r6 = r24.g()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.AdSlot r0 = r6     // Catch:{ all -> 0x02ab }
                                java.lang.String r8 = r0.getCodeId()     // Catch:{ all -> 0x02ab }
                                int r9 = r7     // Catch:{ all -> 0x02ab }
                                r11 = -1
                                java.lang.String r12 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r2)     // Catch:{ all -> 0x02ab }
                                r5.a(r6, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x02ab }
                                return
                            L_0x010a:
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f1525h     // Catch:{ all -> 0x02ab }
                                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02ab }
                                r3.c(r0)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r0 = r9     // Catch:{ all -> 0x02ab }
                                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02ab }
                                r0.set(r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r0 = r8     // Catch:{ all -> 0x02ab }
                                if (r0 == 0) goto L_0x013f
                                com.bytedance.sdk.openadsdk.core.e.o r0 = r8     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.r r0 = r0.i     // Catch:{ all -> 0x02ab }
                                if (r0 == 0) goto L_0x013f
                                com.bytedance.sdk.openadsdk.core.e.o r0 = r8     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.r r11 = r0.i     // Catch:{ all -> 0x02ab }
                                long r12 = r10     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r0 = r3     // Catch:{ all -> 0x02ab }
                                long r14 = r0.get()     // Catch:{ all -> 0x02ab }
                                int r0 = r10.f1518a     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r3 = r9     // Catch:{ all -> 0x02ab }
                                long r17 = r3.get()     // Catch:{ all -> 0x02ab }
                                r16 = r0
                                r11.a(r12, r14, r16, r17)     // Catch:{ all -> 0x02ab }
                            L_0x013f:
                                com.bytedance.sdk.openadsdk.core.n$a r0 = r5     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f1525h     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4     // Catch:{ all -> 0x02ab }
                                r0.a((com.bytedance.sdk.openadsdk.core.e.a) r3, (com.bytedance.sdk.openadsdk.core.e.b) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.o.this     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f1525h     // Catch:{ all -> 0x02ab }
                                r0.a((com.bytedance.sdk.openadsdk.core.e.a) r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r0 = r10.f1525h     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a.a((com.bytedance.sdk.openadsdk.core.e.a) r0)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r0 = r10.f1525h     // Catch:{ all -> 0x02ab }
                                java.util.List r0 = r0.b()     // Catch:{ all -> 0x02ab }
                                if (r0 == 0) goto L_0x02a4
                                com.bytedance.sdk.openadsdk.core.e.a r0 = r10.f1525h     // Catch:{ all -> 0x02ab }
                                java.util.List r0 = r0.b()     // Catch:{ all -> 0x02ab }
                                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x02ab }
                                if (r0 != 0) goto L_0x02a1
                                com.bytedance.sdk.openadsdk.core.e.a r0 = r10.f1525h     // Catch:{ all -> 0x02ab }
                                java.util.List r0 = r0.b()     // Catch:{ all -> 0x02ab }
                                r3 = 0
                                java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.n r0 = (com.bytedance.sdk.openadsdk.core.e.n) r0     // Catch:{ all -> 0x02ab }
                                int r3 = r7     // Catch:{ all -> 0x02ab }
                                java.lang.String r3 = com.bytedance.sdk.openadsdk.utils.u.b((int) r3)     // Catch:{ all -> 0x02ab }
                                java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x02ab }
                                r4.<init>()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r5 = r8     // Catch:{ all -> 0x02ab }
                                if (r5 == 0) goto L_0x01cb
                                com.bytedance.sdk.openadsdk.core.e.o r5 = r8     // Catch:{ all -> 0x02ab }
                                long r5 = r5.f1147g     // Catch:{ all -> 0x02ab }
                                r7 = 0
                                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                                if (r9 <= 0) goto L_0x01cb
                                java.lang.String r5 = "cmkfjqYt|hxSygbu"
                                java.lang.String r5 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r8 = r8     // Catch:{ all -> 0x02ab }
                                long r8 = r8.f1147g     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "lncg[qu"
                                java.lang.String r5 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r5)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r6 = r8     // Catch:{ all -> 0x02ab }
                                long r6 = r6.f1147g     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "tnvbhZrnel"
                                java.lang.String r5 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r9     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r8 = r8     // Catch:{ all -> 0x02ab }
                                long r8 = r8.f1147g     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                            L_0x01cb:
                                java.lang.String r5 = "rdsvavrX|z"
                                java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "s^pfrlebW}y"
                                java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10.f1519b     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "s^qfjaYs{"
                                java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10.f1520c     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "c^pfrlebW}y"
                                java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r3     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "c^gm`Zrt"
                                java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r9     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "ndvtkwmX|`gn"
                                java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r24.g()     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "gn]wmhc"
                                java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10.f1519b     // Catch:{ all -> 0x02ab }
                                long r8 = r10     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "sdtfvZrnel"
                                java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                int r6 = r10.f1518a     // Catch:{ all -> 0x02ab }
                                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "b`ah[qojm"
                                java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r3     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                long r8 = r10.f1520c     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "cmkfjqYbfmUe`k"
                                java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r9     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r8 = r3     // Catch:{ all -> 0x02ab }
                                long r8 = r8.get()     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.b.e.a((com.bytedance.sdk.openadsdk.core.e.n) r0, (java.lang.String) r3, (java.util.Map<java.lang.String, java.lang.Object>) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r11 = com.bytedance.sdk.openadsdk.core.o.this     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r12 = r8     // Catch:{ all -> 0x02ab }
                                long r13 = r10     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r4 = r3     // Catch:{ all -> 0x02ab }
                                long r15 = r4.get()     // Catch:{ all -> 0x02ab }
                                int r4 = r10.f1518a     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r5 = r9     // Catch:{ all -> 0x02ab }
                                long r18 = r5.get()     // Catch:{ all -> 0x02ab }
                                r17 = r4
                                r20 = r0
                                r21 = r3
                                r11.a((com.bytedance.sdk.openadsdk.core.e.o) r12, (long) r13, (long) r15, (int) r17, (long) r18, (com.bytedance.sdk.openadsdk.core.e.n) r20, (java.lang.String) r21)     // Catch:{ all -> 0x02ab }
                                goto L_0x030c
                            L_0x02a1:
                                r0 = 53
                                goto L_0x02a6
                            L_0x02a4:
                                r0 = 51
                            L_0x02a6:
                                switch(r0) {
                                    case 51: goto L_0x030c;
                                    case 52: goto L_0x02aa;
                                    case 53: goto L_0x030c;
                                    default: goto L_0x02a9;
                                }
                            L_0x02a9:
                                goto L_0x02a4
                            L_0x02aa:
                                return
                            L_0x02ab:
                                r0 = move-exception
                                java.lang.String r3 = "NdvBtlOjxe"
                                java.lang.String r3 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r3)
                                java.lang.String r4 = "gdv#ea&bz{ey6-"
                                java.lang.String r4 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r4)
                                com.bytedance.sdk.component.utils.l.c(r3, r4, r0)
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.o.this
                                com.bytedance.sdk.openadsdk.core.n$a r3 = r5
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4
                                r0.a((com.bytedance.sdk.openadsdk.core.n.a) r3, (com.bytedance.sdk.openadsdk.core.e.b) r4)
                                com.bytedance.sdk.openadsdk.core.o r5 = com.bytedance.sdk.openadsdk.core.o.this
                                long r6 = r24.g()
                                com.bytedance.sdk.openadsdk.AdSlot r0 = r6
                                java.lang.String r8 = r0.getCodeId()
                                int r9 = r7
                                r10 = 0
                                r11 = -1
                                java.lang.String r12 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r2)
                                r5.a(r6, r8, r9, r10, r11, r12)
                                goto L_0x030c
                            L_0x02dc:
                                int r0 = r24.a()
                                java.lang.String r2 = r24.b()
                                com.bytedance.sdk.openadsdk.core.n$a r3 = r5
                                r3.a((int) r0, (java.lang.String) r2)
                                com.bytedance.sdk.openadsdk.core.e.b r3 = r4
                                r3.a((int) r0)
                                com.bytedance.sdk.openadsdk.core.e.b r3 = r4
                                com.bytedance.sdk.openadsdk.core.e.b.a((com.bytedance.sdk.openadsdk.core.e.b) r3)
                                com.bytedance.sdk.openadsdk.core.o r13 = com.bytedance.sdk.openadsdk.core.o.this
                                long r14 = r24.g()
                                com.bytedance.sdk.openadsdk.AdSlot r3 = r6
                                java.lang.String r16 = r3.getCodeId()
                                int r3 = r7
                                r18 = 0
                                r17 = r3
                                r19 = r0
                                r20 = r2
                                r13.a(r14, r16, r17, r18, r19, r20)
                            L_0x030c:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.AnonymousClass3.a(com.bytedance.sdk.component.e.b.c, com.bytedance.sdk.component.e.b):void");
                        }

                        public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                            if (m.h().D() && TTAdSdk.getAdManager().getDebugLog() == 1) {
                                u.a(e.e1657027613270dc("P`ldh`YCmklS@aku"), iOException != null ? iOException.getMessage() : null, o.this.f1487a);
                            }
                            long longValue = ((Long) cVar.c().get(e.e1657027613270dc("eyvqeZrnelUxxl|{"))).longValue();
                            long currentTimeMillis = System.currentTimeMillis();
                            String message = iOException != null ? iOException.getMessage() : "";
                            if (iOException != null && SocketTimeoutException.class.equals(iOException.getCause())) {
                                aVar3.a(602, message);
                            }
                            aVar3.a(602, message);
                            l.a(e.e1657027613270dc("NdvBtlOjxe"), e.e1657027613270dc("ooDbmisum3*"), 601);
                            bVar.a(601);
                            com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                            o.this.a(currentTimeMillis - longValue, adSlot3.getCodeId(), i3, (a) null, 601, message);
                        }
                    });
                    d.a().b();
                }
            }
        } else if (aVar2 != null) {
            aVar2.a(-16, g.a(-16));
            bVar.a(1001);
            com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
        }
    }

    private void b(JSONObject jSONObject, String str) {
        com.bytedance.sdk.component.e.b.d b2 = com.bytedance.sdk.openadsdk.i.d.a().b().b();
        b2.a(str);
        b2.a(jSONObject);
        b2.a();
    }

    private boolean b(String str) {
        if (com.bytedance.sdk.openadsdk.core.d.b.a()) {
            return true;
        }
        if (!com.bytedance.sdk.openadsdk.core.d.b.a(str)) {
            return false;
        }
        String b2 = com.bytedance.sdk.openadsdk.core.d.b.b();
        if (!TextUtils.isEmpty(b2)) {
            com.bytedance.sdk.openadsdk.b.e.a(this.f1487a, b2, System.currentTimeMillis());
        }
        return true;
    }

    @JProtect
    private JSONObject c() {
        char c2 = ' ';
        while (true) {
            switch (c2) {
                case 31:
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(i.i1657027613257dc("u`"), u.b());
                        jSONObject.put(i.i1657027613257dc("ae]p`nYqm{ybcc"), i.i1657027613257dc("4/7-4+0"));
                        jSONObject.put(i.i1657027613257dc("sho\\ku"), a(this.f1487a));
                        int i2 = 1;
                        jSONObject.put(i.i1657027613257dc("rnmw"), this.f1488b ? 1 : 0);
                        jSONObject.put(i.i1657027613257dc("thof~jhb"), f());
                        jSONObject.put(i.i1657027613257dc("abafwv"), com.bytedance.sdk.component.utils.o.g(this.f1487a));
                        jSONObject.put(i.i1657027613257dc("or"), i.i1657027613257dc("Aofqklb"));
                        jSONObject.put(i.i1657027613257dc("or]uawungg"), Build.VERSION.RELEASE);
                        jSONObject.put(i.i1657027613257dc("or]btl"), Build.VERSION.SDK_INT);
                        jSONObject.put(i.i1657027613257dc("ddtjg`Ysqyo"), this.f1490d);
                        jSONObject.put(i.i1657027613257dc("ddtjg`Yjgmog"), Build.MODEL);
                        jSONObject.put(i.i1657027613257dc("ddtjg`Yezhdo"), Build.BRAND);
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("ddtjg`Yjigmmnzzbt`"), Build.MANUFACTURER);
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("l`ldqdab"), Locale.getDefault().getLanguage());
                        String a1657027613243dc = com.bytedance.sdk.component.e.c.a.a1657027613243dc("rdqlhprngg");
                        jSONObject.put(a1657027613243dc, v.d(this.f1487a) + com.bytedance.sdk.component.e.c.a.a1657027613243dc("x") + v.c(this.f1487a));
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("dhqshdXlldxeyw"), a(v.g(this.f1487a)));
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("ddlpmqXlyc"), v.g(this.f1487a));
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("ddtjg`Ynl"), j.a(this.f1487a));
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("ahf"), com.bytedance.sdk.component.e.c.a.a1657027613243dc("1252"));
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("rno"), e());
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("cqw\\ego"), Build.CPU_ABI);
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("uu"), this.f1492f);
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("uhf"), this.f1491e);
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("gnmdh`Yfam"), com.com.bytedance.overseas.sdk.b.a.a().b());
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("lnabh`Ykigm~mjk"), com.bytedance.sdk.openadsdk.utils.e.c());
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("sbpfakYez`mcx"), Math.ceil((double) (com.bytedance.sdk.openadsdk.utils.e.d() * 10.0f)) / 10.0d);
                        String a1657027613243dc2 = com.bytedance.sdk.component.e.c.a.a1657027613243dc("ir]pgwcbfVemj");
                        if (com.bytedance.sdk.openadsdk.utils.e.a()) {
                            i2 = 0;
                        }
                        jSONObject.put(a1657027613243dc2, i2);
                        f h2 = m.h();
                        jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("fnp`aZjffnjkh"), t.a(this.f1487a, com.bytedance.sdk.component.e.c.a.a1657027613243dc("tu]`ljitmVfjbj{nwt")));
                        if (h2.p(com.bytedance.sdk.component.e.c.a.a1657027613243dc("moa"))) {
                            jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("moa"), com.bytedance.sdk.openadsdk.utils.n.c());
                        }
                        if (h2.p(com.bytedance.sdk.component.e.c.a.a1657027613243dc("mba"))) {
                            jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("mba"), com.bytedance.sdk.openadsdk.utils.n.b());
                        }
                    } catch (Exception unused) {
                    }
                    return jSONObject;
                case ' ':
                case '!':
                    break;
                default:
                    if (c2 <= 'N') {
                        break;
                    }
            }
            c2 = 31;
        }
    }

    /* access modifiers changed from: private */
    public void c(String str) {
        com.bytedance.sdk.component.e.b.b c2 = com.bytedance.sdk.openadsdk.i.d.a().b().c();
        c2.a(str);
        c2.a(new com.bytedance.sdk.component.e.a.a() {
            public void a(com.bytedance.sdk.component.e.b.c cVar, com.bytedance.sdk.component.e.b bVar) {
                l.b(com.bytedance.sdk.component.e.c.e.e1657027613237dc("cmkfjq&eamnbbj.|erqvgf"), bVar.d());
            }

            public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                l.b(com.bytedance.sdk.component.e.c.e.e1657027613237dc("cmkfjq&eamnbbj.iqx~"), iOException.toString());
            }
        });
    }

    private boolean c(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    @JProtect
    private void d(JSONObject jSONObject) {
        if (h.d().s()) {
            try {
                jSONObject.getJSONObject(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("hdcgaw")).put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ahf"), com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("4441"));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            JSONObject a2 = com.bytedance.sdk.component.utils.a.a(jSONObject);
            if (c(a2)) {
                jSONObject = a2;
            }
            Map<String, String> e3 = e(jSONObject);
            com.bytedance.sdk.component.e.b.d b2 = com.bytedance.sdk.openadsdk.i.d.a().b().b();
            b2.a(u.l());
            if (e3 != null) {
                for (Map.Entry next : e3.entrySet()) {
                    try {
                        b2.b((String) next.getKey(), (String) next.getValue());
                    } catch (Exception unused) {
                    }
                }
            }
            b2.c(jSONObject.toString());
            try {
                b2.b(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("Urgq)Dabf}"), u.b());
            } catch (Exception unused2) {
            }
            b2.a((com.bytedance.sdk.component.e.a.a) new com.bytedance.sdk.component.e.a.a() {
                public void a(com.bytedance.sdk.component.e.b.c cVar, com.bytedance.sdk.component.e.b bVar) {
                    if (bVar == null || !bVar.f()) {
                        l.c(com.bytedance.sdk.component.e.c.g.g1657027613239dc("NdvBtlOjxe"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("ooPfwuii{l0+Bhz]ubb|zfs7qj:uiqr"));
                        return;
                    }
                    l.a(com.bytedance.sdk.component.e.c.g.g1657027613239dc("NdvBtlOjxe"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("ooPfwuii{l0+"), bVar.d());
                }

                public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                    l.a(com.bytedance.sdk.component.e.c.a.a1657027613243dc("NdvBtlOjxe"), com.bytedance.sdk.component.e.c.a.a1657027613243dc("ooDbmisum3*"), iOException.getMessage());
                }
            });
        }
    }

    private static boolean d() {
        try {
            return new File(g.g1657027613257dc("/r{pp`k(j`d$x")).exists() || new File(g.g1657027613257dc("/r{pp`k(pkce#~{")).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    @JProtect
    private static String e() {
        String str;
        StringBuilder sb = new StringBuilder();
        try {
            if (m.e()) {
                str = "MHWJ)";
            } else if (m.b()) {
                str = "FM[NA(";
            } else {
                String n = m.n();
                if (m.a(n)) {
                    sb.append(c.c1657027613239dc("ELWJ)"));
                }
                if (!TextUtils.isEmpty(n)) {
                    sb.append(n);
                    str = "-";
                }
                sb.append(Build.VERSION.INCREMENTAL);
                return sb.toString();
            }
            sb.append(c.c1657027613239dc(str));
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    private Map<String, String> e(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("Cnlwakr*\\pzn"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("aqromfgsafd$f~aa+1q{ugerl$ooz0&"));
        if (c(jSONObject)) {
            hashMap.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("Cnlwakr*Mgidhd`h"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("uokljZuccVoeobjj"));
        }
        return hashMap;
    }

    private static int f() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    private boolean f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            boolean equalsIgnoreCase = jSONObject.optString(com.bytedance.sdk.component.e.c.g.g1657027613239dc("mdqpebc")).equalsIgnoreCase(com.bytedance.sdk.component.e.c.g.g1657027613239dc("sta`avu"));
            while (true) {
                char c2 = '_';
                char c3 = '_';
                while (true) {
                    switch (c2) {
                        case '^':
                            if (c3 != '\'') {
                                break;
                            } else {
                                continue;
                            }
                        case '_':
                            switch (c3) {
                                case '^':
                                case '`':
                                    continue;
                                case '_':
                                    break;
                            }
                        case '`':
                            break;
                    }
                    switch (c3) {
                        case '8':
                            break;
                    }
                    c2 = '^';
                    c3 = '}';
                }
            }
            return equalsIgnoreCase;
        } catch (Throwable unused) {
            return false;
        }
    }

    private String g() {
        String str;
        if (com.bytedance.sdk.openadsdk.utils.e.c(this.f1487a)) {
            str = "tw";
        } else if (com.bytedance.sdk.openadsdk.utils.e.b(this.f1487a)) {
            return com.bytedance.sdk.component.e.c.e.e1657027613237dc("aofqklbXxhn");
        } else {
            str = "aofqklb";
        }
        return com.bytedance.sdk.component.e.c.e.e1657027613237dc(str);
    }

    @JProtect
    private void g(JSONObject jSONObject) {
        try {
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("p`ahebcXfhgn"), u.d());
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("vdppmjhXkfnn"), u.e());
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("vdppmjh"), u.f());
        } catch (Exception unused) {
        }
    }

    public com.bytedance.sdk.component.adexpress.a.c.a a() {
        if (!com.bytedance.sdk.openadsdk.core.i.e.a()) {
            return null;
        }
        com.bytedance.sdk.component.e.b.b c2 = com.bytedance.sdk.openadsdk.i.d.a().b().c();
        try {
            c2.a(com.bytedance.sdk.openadsdk.c.d.a(c2, m.h().v()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        com.bytedance.sdk.component.e.b a2 = c2.a();
        if (a2 == null) {
            return null;
        }
        try {
            if (a2.f()) {
                return com.bytedance.sdk.component.adexpress.a.c.a.e(a2.d());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(26:5|(1:11)|12|13|14|(2:17|15)|64|18|19|20|(1:22)|23|(2:25|(6:29|30|31|66|65|26))|32|33|34|35|36|37|38|(1:45)(1:44)|46|(1:48)(1:49)|(2:(1:57)|58)(1:53)|59|60) */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0146, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0147, code lost:
        com.bytedance.sdk.component.utils.l.c(com.bytedance.sdk.component.d.d.g.g1657027613257dc("NdvBtlOjxe"), com.bytedance.sdk.component.d.d.g.g1657027613257dc("uqnleaCqmg~+i|`b"), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0163, code lost:
        return new com.bytedance.sdk.openadsdk.b.i(false, 509, com.bytedance.sdk.component.d.d.g.g1657027613257dc("sdpumfcXj|yr"), false);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0091 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00ed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009b A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b5 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0105 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0113 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011c A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0121 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0128 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0130 A[ADDED_TO_REGION, Catch:{ all -> 0x0146 }] */
    @com.bytedance.JProtect
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.openadsdk.b.i a(java.util.List<com.bytedance.sdk.openadsdk.b.a> r8) {
        /*
            r7 = this;
            r0 = 0
            boolean r1 = com.bytedance.sdk.openadsdk.core.i.e.a()     // Catch:{ all -> 0x0146 }
            if (r1 != 0) goto L_0x0009
            r8 = 0
            return r8
        L_0x0009:
            java.lang.String r1 = ""
            int r2 = r8.size()     // Catch:{ all -> 0x0146 }
            if (r2 <= 0) goto L_0x0037
            java.lang.Object r2 = r8.get(r0)     // Catch:{ all -> 0x0146 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r8.get(r0)     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.openadsdk.b.a r2 = (com.bytedance.sdk.openadsdk.b.a) r2     // Catch:{ all -> 0x0146 }
            org.json.JSONObject r2 = r2.b()     // Catch:{ all -> 0x0146 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r1 = r8.get(r0)     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.openadsdk.b.a r1 = (com.bytedance.sdk.openadsdk.b.a) r1     // Catch:{ all -> 0x0146 }
            org.json.JSONObject r1 = r1.b()     // Catch:{ all -> 0x0146 }
            java.lang.String r2 = "aqr\\hjaX}{f"
            java.lang.String r2 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r2)     // Catch:{ all -> 0x0146 }
            java.lang.String r1 = r1.optString(r2)     // Catch:{ all -> 0x0146 }
        L_0x0037:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0146 }
            r2.<init>()     // Catch:{ all -> 0x0146 }
            java.lang.Object r3 = r8.get(r0)     // Catch:{ JSONException -> 0x0091 }
            com.bytedance.sdk.openadsdk.b.a r3 = (com.bytedance.sdk.openadsdk.b.a) r3     // Catch:{ JSONException -> 0x0091 }
            r7.a((com.bytedance.sdk.openadsdk.b.a) r3)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r3 = "hdcgaw"
            java.lang.String r3 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r3)     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONObject r4 = r7.c()     // Catch:{ JSONException -> 0x0091 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0091 }
            r3.<init>()     // Catch:{ JSONException -> 0x0091 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ JSONException -> 0x0091 }
        L_0x005b:
            boolean r4 = r8.hasNext()     // Catch:{ JSONException -> 0x0091 }
            if (r4 == 0) goto L_0x006f
            java.lang.Object r4 = r8.next()     // Catch:{ JSONException -> 0x0091 }
            com.bytedance.sdk.openadsdk.b.a r4 = (com.bytedance.sdk.openadsdk.b.a) r4     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONObject r4 = r4.c()     // Catch:{ JSONException -> 0x0091 }
            r3.put(r4)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x005b
        L_0x006f:
            java.lang.String r8 = "ewgmp"
            java.lang.String r8 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r8)     // Catch:{ JSONException -> 0x0091 }
            r2.put(r8, r3)     // Catch:{ JSONException -> 0x0091 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r8 = "_fgm[qojm"
            java.lang.String r8 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r8)     // Catch:{ JSONException -> 0x0091 }
            r2.put(r8, r3)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r8 = "lnabhZrnel"
            java.lang.String r8 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r8)     // Catch:{ JSONException -> 0x0091 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            r2.put(r8, r3)     // Catch:{ JSONException -> 0x0091 }
        L_0x0091:
            org.json.JSONObject r8 = com.bytedance.sdk.component.utils.a.a((org.json.JSONObject) r2)     // Catch:{ all -> 0x0146 }
            boolean r3 = r7.c((org.json.JSONObject) r8)     // Catch:{ all -> 0x0146 }
            if (r3 != 0) goto L_0x009c
            r8 = r2
        L_0x009c:
            java.util.Map r3 = r7.e(r8)     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.openadsdk.i.d r4 = com.bytedance.sdk.openadsdk.i.d.a()     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.component.e.a r4 = r4.b()     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.component.e.b.d r4 = r4.b()     // Catch:{ all -> 0x0146 }
            java.lang.String r1 = com.bytedance.sdk.openadsdk.utils.u.h((java.lang.String) r1)     // Catch:{ all -> 0x0146 }
            r4.a((java.lang.String) r1)     // Catch:{ all -> 0x0146 }
            if (r3 == 0) goto L_0x00d9
            java.util.Set r1 = r3.entrySet()     // Catch:{ all -> 0x0146 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0146 }
        L_0x00bd:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0146 }
            if (r3 == 0) goto L_0x00d9
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0146 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0146 }
            java.lang.Object r5 = r3.getKey()     // Catch:{ Exception -> 0x00bd }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00bd }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x00bd }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00bd }
            r4.b(r5, r3)     // Catch:{ Exception -> 0x00bd }
            goto L_0x00bd
        L_0x00d9:
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0146 }
            r4.c(r8)     // Catch:{ all -> 0x0146 }
            java.lang.String r8 = "Urgq)Dabf}"
            java.lang.String r8 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r8)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r1 = com.bytedance.sdk.openadsdk.utils.u.b()     // Catch:{ Exception -> 0x00ed }
            r4.b(r8, r1)     // Catch:{ Exception -> 0x00ed }
        L_0x00ed:
            com.bytedance.sdk.component.e.b r8 = r4.a()     // Catch:{ all -> 0x0146 }
            if (r8 == 0) goto L_0x0113
            boolean r1 = r8.f()     // Catch:{ all -> 0x0146 }
            if (r1 == 0) goto L_0x0113
            java.lang.String r1 = r8.d()     // Catch:{ all -> 0x0146 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0146 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0146 }
            if (r1 != 0) goto L_0x0113
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0146 }
            java.lang.String r3 = r8.d()     // Catch:{ all -> 0x0146 }
            r1.<init>(r3)     // Catch:{ all -> 0x0146 }
            boolean r1 = r7.f(r1)     // Catch:{ all -> 0x0146 }
            goto L_0x0114
        L_0x0113:
            r1 = 0
        L_0x0114:
            java.lang.String r3 = "esplv%sicge|b"
            java.lang.String r3 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r3)     // Catch:{ all -> 0x0146 }
            if (r8 == 0) goto L_0x0121
            int r4 = r8.a()     // Catch:{ all -> 0x0146 }
            goto L_0x0122
        L_0x0121:
            r4 = 0
        L_0x0122:
            if (r1 != 0) goto L_0x0130
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x0130
            java.lang.String r8 = "sdpuaw&tip*ecy.|erqvgf"
            java.lang.String r3 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r8)     // Catch:{ all -> 0x0146 }
            r8 = 1
            goto L_0x013d
        L_0x0130:
            if (r8 == 0) goto L_0x013c
            java.lang.String r5 = r8.b()     // Catch:{ all -> 0x0146 }
            if (r5 == 0) goto L_0x013c
            java.lang.String r3 = r8.b()     // Catch:{ all -> 0x0146 }
        L_0x013c:
            r8 = 0
        L_0x013d:
            r7.d(r2)     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.openadsdk.b.i r2 = new com.bytedance.sdk.openadsdk.b.i     // Catch:{ all -> 0x0146 }
            r2.<init>(r1, r4, r3, r8)     // Catch:{ all -> 0x0146 }
            return r2
        L_0x0146:
            r8 = move-exception
            java.lang.String r1 = "NdvBtlOjxe"
            java.lang.String r1 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r1)
            java.lang.String r2 = "uqnleaCqmg~+i|`b"
            java.lang.String r2 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r2)
            com.bytedance.sdk.component.utils.l.c(r1, r2, r8)
            com.bytedance.sdk.openadsdk.b.i r8 = new com.bytedance.sdk.openadsdk.b.i
            r1 = 509(0x1fd, float:7.13E-43)
            java.lang.String r2 = "sdpumfcXj|yr"
            java.lang.String r2 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r2)
            r8.<init>(r0, r1, r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.a(java.util.List):com.bytedance.sdk.openadsdk.b.i");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject a(org.json.JSONObject r6) {
        /*
            r5 = this;
            java.lang.String r0 = "atawmjhXx{chi"
            if (r6 != 0) goto L_0x0005
            return r6
        L_0x0005:
            boolean r1 = i     // Catch:{ Exception -> 0x0047 }
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = "cxrkaw"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r1)     // Catch:{ Exception -> 0x0047 }
            r2 = -1
            int r1 = r6.optInt(r1, r2)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r2 = "mdqpebc"
            java.lang.String r2 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r2)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r2 = r6.optString(r2)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r3 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r0)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r4 = ""
            java.lang.String r3 = r6.optString(r3, r4)     // Catch:{ Exception -> 0x0047 }
            r4 = 3
            if (r1 != r4) goto L_0x002f
            java.lang.String r2 = com.bytedance.sdk.component.utils.a.b(r2)     // Catch:{ Exception -> 0x0047 }
        L_0x002f:
            r1 = r2
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0047 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0047 }
            if (r1 != 0) goto L_0x0047
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{  }
            r1.<init>(r2)     // Catch:{  }
            java.lang.String r0 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r0)     // Catch:{ all -> 0x0045 }
            r1.put(r0, r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0048
        L_0x0045:
            goto L_0x0048
        L_0x0047:
            r1 = r6
        L_0x0048:
            boolean r0 = i
            if (r0 == 0) goto L_0x004d
            r6 = r1
        L_0x004d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.a(org.json.JSONObject):org.json.JSONObject");
    }

    public void a(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.e.o oVar, int i2, n.a aVar) {
        final com.bytedance.sdk.openadsdk.core.a.a aVar2 = new com.bytedance.sdk.openadsdk.core.a.a(aVar);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            final AdSlot adSlot2 = adSlot;
            final com.bytedance.sdk.openadsdk.core.e.o oVar2 = oVar;
            final int i3 = i2;
            k.c().post(new com.bytedance.sdk.component.f.g(c.c1657027613239dc("gdvB`")) {
                public void run() {
                    o.this.b(adSlot2, oVar2, i3, aVar2);
                }
            });
            return;
        }
        b(adSlot, oVar, i2, aVar2);
    }

    public void a(com.bytedance.sdk.openadsdk.core.e.n nVar, List<FilterWord> list) {
        JSONObject b2;
        if (com.bytedance.sdk.openadsdk.core.i.e.a() && (b2 = b(nVar, list)) != null) {
            com.bytedance.sdk.component.e.b.d b3 = com.bytedance.sdk.openadsdk.i.d.a().b().b();
            b3.a(u.g(d.d1657027613261dc("/`rj+db(}gcdb\"jfc}{xqJsa}wn4")));
            b3.c(com.bytedance.sdk.component.utils.a.a(b2).toString());
            b3.a((com.bytedance.sdk.component.e.a.a) new com.bytedance.sdk.component.e.a.a() {
                public void a(com.bytedance.sdk.component.e.b.c cVar, com.bytedance.sdk.component.e.b bVar) {
                }

                public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                }
            });
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031 A[LOOP:0: B:5:0x0020->B:9:0x0031, LOOP_END] */
    public void a(final java.lang.String r3) {
        /*
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L_0x0019
            com.bytedance.sdk.openadsdk.core.o$9 r0 = new com.bytedance.sdk.openadsdk.core.o$9
            java.lang.String r1 = "uqnleaEkaldNdjkyu"
            java.lang.String r1 = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(r1)
            r0.<init>(r1, r3)
            com.bytedance.sdk.component.f.e.a((com.bytedance.sdk.component.f.g) r0)
            goto L_0x002c
        L_0x0019:
            r2.c((java.lang.String) r3)
        L_0x001c:
            r3 = 73
            r0 = 96
        L_0x0020:
            switch(r3) {
                case 72: goto L_0x002c;
                case 73: goto L_0x0024;
                case 74: goto L_0x0027;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0031
        L_0x0024:
            switch(r0) {
                case 94: goto L_0x001c;
                case 95: goto L_0x002b;
                case 96: goto L_0x002b;
                default: goto L_0x0027;
            }
        L_0x0027:
            switch(r0) {
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x001c
        L_0x002b:
            return
        L_0x002c:
            r3 = 74
            r0 = 55
            goto L_0x0020
        L_0x0031:
            r3 = 72
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.a(java.lang.String):void");
    }

    public void a(JSONObject jSONObject, final n.b bVar) {
        while (true) {
            char c2 = '_';
            char c3 = '_';
            while (true) {
                switch (c2) {
                    case '^':
                        if (c3 != '\'') {
                            break;
                        } else {
                            continue;
                        }
                    case '_':
                        switch (c3) {
                            case '^':
                            case '`':
                                continue;
                            case '_':
                                break;
                        }
                    case '`':
                        break;
                }
                switch (c3) {
                    case '7':
                    case '9':
                        break;
                    case '8':
                        break;
                }
                c2 = '^';
                c3 = '}';
            }
        }
        if (!com.bytedance.sdk.openadsdk.core.i.e.a()) {
            if (bVar != null) {
                bVar.a(1000, com.bytedance.sdk.component.e.c.e.e1657027613237dc("Ae\"qatsb{}*b-zj}a}aug{a9jzin{{\f\u0001rOADUB\bJEEXLM[\u0010H]FF\u0015fVV^V^\u001c|s"));
            }
        } else if (jSONObject != null && bVar != null) {
            JSONObject a2 = com.bytedance.sdk.component.utils.a.a(jSONObject);
            com.bytedance.sdk.component.e.b.d b2 = com.bytedance.sdk.openadsdk.i.d.a().b().b();
            try {
                b2.a(com.bytedance.sdk.openadsdk.c.d.a(b2, u.g(com.bytedance.sdk.component.e.c.e.e1657027613237dc("/`rj+db(}gcdb\"}k{>`vctdsGosyr1mEVCQ@\n"))));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            b2.c(a2.toString());
            b2.a((com.bytedance.sdk.component.e.a.a) new com.bytedance.sdk.component.e.a.a() {
                /* JADX WARNING: Can't wrap try/catch for region: R(8:5|6|(1:8)|9|(3:11|12|13)|14|15|(2:17|18)(2:19|(2:21|22)(2:23|35))) */
                /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0049 */
                /* JADX WARNING: Removed duplicated region for block: B:17:0x0053 A[Catch:{ JSONException -> 0x0073 }] */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x0061 A[Catch:{ JSONException -> 0x0073 }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void a(com.bytedance.sdk.component.e.b.c r4, com.bytedance.sdk.component.e.b r5) {
                    /*
                        r3 = this;
                        if (r5 == 0) goto L_0x009f
                        boolean r4 = r5.f()
                        if (r4 == 0) goto L_0x007a
                        java.lang.String r4 = r5.d()
                        java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                        boolean r4 = android.text.TextUtils.isEmpty(r4)
                        if (r4 != 0) goto L_0x007a
                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0073 }
                        java.lang.String r5 = r5.d()     // Catch:{ JSONException -> 0x0073 }
                        r4.<init>(r5)     // Catch:{ JSONException -> 0x0073 }
                        java.lang.String r5 = "cxrkaw"
                        java.lang.String r5 = com.bytedance.sdk.component.b.a.e.e1657027613270dc(r5)     // Catch:{ JSONException -> 0x0073 }
                        r0 = -1
                        int r5 = r4.optInt(r5, r0)     // Catch:{ JSONException -> 0x0073 }
                        java.lang.String r0 = "mdqpebc"
                        java.lang.String r0 = com.bytedance.sdk.component.b.a.e.e1657027613270dc(r0)     // Catch:{ JSONException -> 0x0073 }
                        java.lang.String r0 = r4.optString(r0)     // Catch:{ JSONException -> 0x0073 }
                        r1 = 0
                        r2 = 3
                        if (r5 != r2) goto L_0x003a
                        java.lang.String r1 = com.bytedance.sdk.component.utils.a.b(r0)     // Catch:{ JSONException -> 0x0073 }
                    L_0x003a:
                        r5 = r1
                        java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ JSONException -> 0x0073 }
                        boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0073 }
                        if (r5 != 0) goto L_0x0049
                        org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0049 }
                        r5.<init>(r1)     // Catch:{ all -> 0x0049 }
                        r4 = r5
                    L_0x0049:
                        com.bytedance.sdk.openadsdk.core.o$b r4 = com.bytedance.sdk.openadsdk.core.o.b.a(r4)     // Catch:{ JSONException -> 0x0073 }
                        int r5 = r4.f1526a     // Catch:{ JSONException -> 0x0073 }
                        r0 = 20000(0x4e20, float:2.8026E-41)
                        if (r5 == r0) goto L_0x0061
                        com.bytedance.sdk.openadsdk.core.n$b r5 = r4     // Catch:{ JSONException -> 0x0073 }
                        int r0 = r4.f1526a     // Catch:{ JSONException -> 0x0073 }
                        int r4 = r4.f1526a     // Catch:{ JSONException -> 0x0073 }
                        java.lang.String r4 = com.bytedance.sdk.openadsdk.core.g.a(r4)     // Catch:{ JSONException -> 0x0073 }
                        r5.a(r0, r4)     // Catch:{ JSONException -> 0x0073 }
                        return
                    L_0x0061:
                        com.bytedance.sdk.openadsdk.core.e.s r5 = r4.f1528c     // Catch:{ JSONException -> 0x0073 }
                        if (r5 != 0) goto L_0x006d
                        com.bytedance.sdk.openadsdk.core.o r4 = com.bytedance.sdk.openadsdk.core.o.this     // Catch:{ JSONException -> 0x0073 }
                        com.bytedance.sdk.openadsdk.core.n$b r5 = r4     // Catch:{ JSONException -> 0x0073 }
                        r4.a((com.bytedance.sdk.openadsdk.core.n.b) r5)     // Catch:{ JSONException -> 0x0073 }
                        return
                    L_0x006d:
                        com.bytedance.sdk.openadsdk.core.n$b r5 = r4     // Catch:{ JSONException -> 0x0073 }
                        r5.a(r4)     // Catch:{ JSONException -> 0x0073 }
                        goto L_0x00a6
                    L_0x0073:
                        r4 = move-exception
                        org.json.JSONException r4 = (org.json.JSONException) r4
                        r4.printStackTrace()
                        goto L_0x009f
                    L_0x007a:
                        r4 = -2
                        java.lang.String r4 = com.bytedance.sdk.openadsdk.core.g.a(r4)
                        int r0 = r5.a()
                        boolean r1 = r5.f()
                        if (r1 != 0) goto L_0x0099
                        java.lang.String r1 = r5.b()
                        java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                        boolean r1 = android.text.TextUtils.isEmpty(r1)
                        if (r1 != 0) goto L_0x0099
                        java.lang.String r4 = r5.b()
                    L_0x0099:
                        com.bytedance.sdk.openadsdk.core.n$b r5 = r4
                        r5.a(r0, r4)
                        goto L_0x00a6
                    L_0x009f:
                        com.bytedance.sdk.openadsdk.core.o r4 = com.bytedance.sdk.openadsdk.core.o.this
                        com.bytedance.sdk.openadsdk.core.n$b r5 = r4
                        r4.a((com.bytedance.sdk.openadsdk.core.n.b) r5)
                    L_0x00a6:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.AnonymousClass8.a(com.bytedance.sdk.component.e.b.c, com.bytedance.sdk.component.e.b):void");
                }

                public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                    bVar.a(-2, iOException.getMessage());
                }
            });
        }
    }

    public void a(JSONObject jSONObject, String str) {
        b(jSONObject, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r4 == 60005) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.openadsdk.b.i b(org.json.JSONObject r8) {
        /*
            r7 = this;
            boolean r0 = com.bytedance.sdk.openadsdk.core.i.e.a()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            if (r8 == 0) goto L_0x00b7
            int r0 = r8.length()
            if (r0 > 0) goto L_0x0012
            goto L_0x00b7
        L_0x0012:
            org.json.JSONObject r8 = com.bytedance.sdk.component.utils.a.a((org.json.JSONObject) r8)
            com.bytedance.sdk.openadsdk.i.d r0 = com.bytedance.sdk.openadsdk.i.d.a()
            com.bytedance.sdk.component.e.a r0 = r0.b()
            com.bytedance.sdk.component.e.b.d r0 = r0.b()
            java.lang.String r1 = "/`rj+db(}gcdb\"}k{>aguae8zxnxt2"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r1)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r1 = com.bytedance.sdk.openadsdk.utils.u.g((java.lang.String) r1)     // Catch:{ Exception -> 0x0043 }
            r0.a((java.lang.String) r1)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0043 }
            r0.c(r8)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r8 = "Urgq)Dabf}"
            java.lang.String r8 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r8)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r1 = com.bytedance.sdk.openadsdk.utils.u.b()     // Catch:{ Exception -> 0x0043 }
            r0.b(r8, r1)     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            com.bytedance.sdk.component.e.b r8 = r0.a()
            java.lang.String r0 = "esplv%sicge|b"
            java.lang.String r0 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r0)
            r1 = 0
            if (r8 != 0) goto L_0x0056
            com.bytedance.sdk.openadsdk.b.i r8 = new com.bytedance.sdk.openadsdk.b.i     // Catch:{ all -> 0x00ad }
            r8.<init>(r1, r1, r0, r1)     // Catch:{ all -> 0x00ad }
            return r8
        L_0x0056:
            boolean r2 = r8.f()     // Catch:{ all -> 0x00ad }
            r3 = 1
            if (r2 == 0) goto L_0x0096
            java.lang.String r2 = r8.d()     // Catch:{ all -> 0x00ad }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ all -> 0x00ad }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00ad }
            if (r2 != 0) goto L_0x0096
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x00ad }
            java.lang.String r4 = r8.d()     // Catch:{ all -> 0x00ad }
            r2.<init>(r4)     // Catch:{ all -> 0x00ad }
            java.lang.String r4 = "cnff"
            java.lang.String r4 = com.bytedance.sdk.component.b.a.e.e1657027613270dc(r4)     // Catch:{ all -> 0x00ad }
            r5 = -1
            int r4 = r2.optInt(r4, r5)     // Catch:{ all -> 0x00ad }
            java.lang.String r5 = "d`vb"
            java.lang.String r5 = com.bytedance.sdk.component.b.a.e.e1657027613270dc(r5)     // Catch:{ all -> 0x00ad }
            java.lang.String r6 = ""
            java.lang.String r0 = r2.optString(r5, r6)     // Catch:{ all -> 0x00ad }
            r2 = 20000(0x4e20, float:2.8026E-41)
            if (r4 != r2) goto L_0x008f
            r2 = 1
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            r5 = 60005(0xea65, float:8.4085E-41)
            if (r4 != r5) goto L_0x0097
            goto L_0x0098
        L_0x0096:
            r2 = 0
        L_0x0097:
            r3 = 0
        L_0x0098:
            int r1 = r8.a()     // Catch:{ all -> 0x00aa }
            boolean r4 = r8.f()     // Catch:{ all -> 0x00a7 }
            if (r4 != 0) goto L_0x00b1
            java.lang.String r0 = r8.b()     // Catch:{ all -> 0x00a7 }
            goto L_0x00b1
        L_0x00a7:
            r8 = r1
            r1 = r3
            goto L_0x00af
        L_0x00aa:
            r1 = r3
            r8 = 0
            goto L_0x00af
        L_0x00ad:
            r8 = 0
            r2 = 0
        L_0x00af:
            r3 = r1
            r1 = r8
        L_0x00b1:
            com.bytedance.sdk.openadsdk.b.i r8 = new com.bytedance.sdk.openadsdk.b.i
            r8.<init>(r2, r1, r0, r3)
            return r8
        L_0x00b7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.o.b(org.json.JSONObject):com.bytedance.sdk.openadsdk.b.i");
    }
}
