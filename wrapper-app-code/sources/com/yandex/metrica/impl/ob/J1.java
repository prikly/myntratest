package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.C0604oc;
import com.yandex.metrica.impl.ob.C0656qf;
import com.yandex.metrica.impl.ob.E;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class J1 {

    /* renamed from: a  reason: collision with root package name */
    private static Map<C0374f6, Integer> f4298a;

    /* renamed from: b  reason: collision with root package name */
    private static SparseArray<C0374f6> f4299b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<C0244a1, Integer> f4300c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<C0244a1, C0678re> f4301d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f4302e = 0;

    class a implements Ge {
        a() {
        }

        public byte[] a(C0655qe qeVar, Lg lg) {
            byte[] bArr;
            if (!TextUtils.isEmpty(qeVar.f6570b)) {
                try {
                    C0334dg a2 = C0334dg.a(Base64.decode(qeVar.f6570b, 0));
                    C0703sf sfVar = new C0703sf();
                    String str = a2.f5664a;
                    if (str == null) {
                        bArr = new byte[0];
                    } else {
                        bArr = str.getBytes();
                    }
                    sfVar.f6781a = bArr;
                    sfVar.f6783c = a2.f5665b;
                    sfVar.f6782b = a2.f5666c;
                    int ordinal = a2.f5667d.ordinal();
                    int i = 2;
                    if (ordinal == 1) {
                        i = 1;
                    } else if (ordinal != 2) {
                        i = 0;
                    }
                    sfVar.f6784d = i;
                    return MessageNano.toByteArray(sfVar);
                } catch (Throwable unused) {
                }
            }
            return new byte[0];
        }
    }

    class b implements C0702se {
        b() {
        }

        public Integer a(C0655qe qeVar) {
            return qeVar.k;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        C0374f6 f6Var = C0374f6.FOREGROUND;
        hashMap.put(f6Var, 0);
        C0374f6 f6Var2 = C0374f6.BACKGROUND;
        hashMap.put(f6Var2, 1);
        f4298a = Collections.unmodifiableMap(hashMap);
        SparseArray<C0374f6> sparseArray = new SparseArray<>();
        sparseArray.put(0, f6Var);
        sparseArray.put(1, f6Var2);
        f4299b = sparseArray;
        HashMap hashMap2 = new HashMap();
        C0244a1 a1Var = C0244a1.EVENT_TYPE_INIT;
        hashMap2.put(a1Var, 1);
        C0244a1 a1Var2 = C0244a1.EVENT_TYPE_REGULAR;
        hashMap2.put(a1Var2, 4);
        C0244a1 a1Var3 = C0244a1.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(a1Var3, 5);
        C0244a1 a1Var4 = C0244a1.EVENT_TYPE_ALIVE;
        hashMap2.put(a1Var4, 7);
        C0244a1 a1Var5 = C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED;
        hashMap2.put(a1Var5, 3);
        C0244a1 a1Var6 = C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(a1Var6, 26);
        C0244a1 a1Var7 = C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        hashMap2.put(a1Var7, 26);
        C0244a1 a1Var8 = C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(a1Var8, 26);
        C0244a1 a1Var9 = C0244a1.EVENT_TYPE_ANR;
        hashMap2.put(a1Var9, 25);
        C0244a1 a1Var10 = C0244a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        hashMap2.put(a1Var10, 3);
        C0244a1 a1Var11 = C0244a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(a1Var11, 26);
        C0244a1 a1Var12 = C0244a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH;
        hashMap2.put(a1Var12, 3);
        C0244a1 a1Var13 = C0244a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(a1Var13, 26);
        C0244a1 a1Var14 = C0244a1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF;
        hashMap2.put(a1Var14, 26);
        C0244a1 a1Var15 = a1Var;
        C0244a1 a1Var16 = C0244a1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(a1Var16, 26);
        C0244a1 a1Var17 = C0244a1.EVENT_TYPE_EXCEPTION_USER;
        C0244a1 a1Var18 = a1Var9;
        hashMap2.put(a1Var17, 6);
        C0244a1 a1Var19 = C0244a1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        C0244a1 a1Var20 = a1Var8;
        hashMap2.put(a1Var19, 27);
        C0244a1 a1Var21 = a1Var7;
        C0244a1 a1Var22 = C0244a1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(a1Var22, 27);
        C0244a1 a1Var23 = C0244a1.EVENT_TYPE_IDENTITY;
        C0244a1 a1Var24 = a1Var6;
        hashMap2.put(a1Var23, 8);
        C0244a1 a1Var25 = a1Var5;
        hashMap2.put(C0244a1.EVENT_TYPE_IDENTITY_LIGHT, 28);
        C0244a1 a1Var26 = C0244a1.EVENT_TYPE_STATBOX;
        hashMap2.put(a1Var26, 11);
        C0244a1 a1Var27 = C0244a1.EVENT_TYPE_SET_USER_INFO;
        C0244a1 a1Var28 = a1Var26;
        hashMap2.put(a1Var27, 12);
        C0244a1 a1Var29 = a1Var27;
        C0244a1 a1Var30 = C0244a1.EVENT_TYPE_REPORT_USER_INFO;
        hashMap2.put(a1Var30, 12);
        C0244a1 a1Var31 = C0244a1.EVENT_TYPE_FIRST_ACTIVATION;
        C0244a1 a1Var32 = a1Var30;
        hashMap2.put(a1Var31, 13);
        C0244a1 a1Var33 = C0244a1.EVENT_TYPE_START;
        C0244a1 a1Var34 = a1Var31;
        hashMap2.put(a1Var33, 2);
        C0244a1 a1Var35 = C0244a1.EVENT_TYPE_APP_OPEN;
        C0244a1 a1Var36 = a1Var33;
        hashMap2.put(a1Var35, 16);
        C0244a1 a1Var37 = C0244a1.EVENT_TYPE_APP_UPDATE;
        C0244a1 a1Var38 = a1Var35;
        hashMap2.put(a1Var37, 17);
        C0244a1 a1Var39 = C0244a1.EVENT_TYPE_PERMISSIONS;
        C0244a1 a1Var40 = a1Var37;
        hashMap2.put(a1Var39, 18);
        C0244a1 a1Var41 = C0244a1.EVENT_TYPE_APP_FEATURES;
        C0244a1 a1Var42 = a1Var39;
        hashMap2.put(a1Var41, 19);
        C0244a1 a1Var43 = C0244a1.EVENT_TYPE_SEND_USER_PROFILE;
        C0244a1 a1Var44 = a1Var41;
        hashMap2.put(a1Var43, 20);
        C0244a1 a1Var45 = C0244a1.EVENT_TYPE_SEND_REVENUE_EVENT;
        C0244a1 a1Var46 = a1Var43;
        hashMap2.put(a1Var45, 21);
        C0244a1 a1Var47 = C0244a1.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        C0244a1 a1Var48 = a1Var45;
        hashMap2.put(a1Var47, 40);
        C0244a1 a1Var49 = C0244a1.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        C0244a1 a1Var50 = a1Var47;
        hashMap2.put(a1Var49, 35);
        C0244a1 a1Var51 = a1Var49;
        hashMap2.put(C0244a1.EVENT_TYPE_CLEANUP, 29);
        C0244a1 a1Var52 = C0244a1.EVENT_TYPE_VIEW_TREE;
        hashMap2.put(a1Var52, 30);
        C0244a1 a1Var53 = C0244a1.EVENT_TYPE_RAW_VIEW_TREE;
        C0244a1 a1Var54 = a1Var52;
        hashMap2.put(a1Var53, 34);
        C0244a1 a1Var55 = C0244a1.EVENT_TYPE_STATBOX_EXP;
        C0244a1 a1Var56 = a1Var53;
        hashMap2.put(a1Var55, 36);
        C0244a1 a1Var57 = C0244a1.EVENT_TYPE_WEBVIEW_SYNC;
        C0244a1 a1Var58 = a1Var55;
        hashMap2.put(a1Var57, 38);
        f4300c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        C0556me meVar = new C0556me();
        C0244a1 a1Var59 = a1Var57;
        C0631pe peVar = new C0631pe();
        C0244a1 a1Var60 = a1Var23;
        C0581ne neVar = new C0581ne();
        C0244a1 a1Var61 = a1Var22;
        C0481je jeVar = new C0481je();
        C0244a1 a1Var62 = a1Var19;
        Fe fe = new Fe();
        C0244a1 a1Var63 = a1Var17;
        Be be = new Be();
        C0244a1 a1Var64 = a1Var16;
        C0678re a2 = C0678re.a().a((Ge) be).a((C0606oe) be).a();
        C0678re a3 = C0678re.a().a((Ge) peVar).a();
        C0631pe peVar2 = peVar;
        C0678re a4 = C0678re.a().a((Ge) jeVar).a();
        C0481je jeVar2 = jeVar;
        C0678re a5 = C0678re.a().a((Ge) fe).a();
        C0678re reVar = a5;
        C0678re a6 = C0678re.a().a((Ge) new He()).a();
        hashMap3.put(a1Var2, a3);
        hashMap3.put(a1Var3, C0678re.a().a((Ge) new a()).a());
        hashMap3.put(a1Var4, C0678re.a().a((C0846ye) meVar).a((Ge) neVar).a((C0822xe) new C0506ke()).a((C0870ze) new C0531le()).a());
        hashMap3.put(a1Var10, a2);
        hashMap3.put(a1Var12, a2);
        hashMap3.put(a1Var11, a2);
        hashMap3.put(a1Var13, a2);
        hashMap3.put(a1Var14, a2);
        hashMap3.put(a1Var64, a2);
        hashMap3.put(a1Var63, a3);
        hashMap3.put(a1Var62, a4);
        hashMap3.put(a1Var61, a4);
        hashMap3.put(a1Var60, C0678re.a().a((Ge) peVar2).a((C0606oe) new C0798we()).a());
        hashMap3.put(a1Var28, a3);
        hashMap3.put(a1Var29, a3);
        hashMap3.put(a1Var32, a3);
        hashMap3.put(a1Var25, a3);
        hashMap3.put(a1Var24, a4);
        hashMap3.put(a1Var21, a4);
        hashMap3.put(a1Var20, a4);
        hashMap3.put(a1Var18, a4);
        hashMap3.put(a1Var36, C0678re.a().a((C0846ye) new C0556me()).a((Ge) jeVar2).a());
        hashMap3.put(C0244a1.EVENT_TYPE_CUSTOM_EVENT, C0678re.a().a((C0702se) new b()).a());
        hashMap3.put(a1Var38, a3);
        C0678re a7 = C0678re.a().a((C0846ye) meVar).a();
        hashMap3.put(a1Var42, a7);
        hashMap3.put(a1Var44, a7);
        hashMap3.put(a1Var46, a4);
        hashMap3.put(a1Var48, a4);
        hashMap3.put(a1Var50, a4);
        hashMap3.put(a1Var51, reVar);
        hashMap3.put(a1Var54, a3);
        hashMap3.put(a1Var56, a3);
        hashMap3.put(a1Var15, a6);
        hashMap3.put(a1Var40, a6);
        hashMap3.put(a1Var34, a3);
        hashMap3.put(a1Var58, a3);
        hashMap3.put(a1Var59, a3);
        f4301d = Collections.unmodifiableMap(hashMap3);
    }

    public static C0656qf.f a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("start_time");
        Long asLong2 = contentValues.getAsLong("server_time_offset");
        Boolean asBoolean = contentValues.getAsBoolean("obtained_before_first_sync");
        C0656qf.f fVar = new C0656qf.f();
        if (asLong != null) {
            fVar.f6634a = asLong.longValue();
            fVar.f6635b = ((GregorianCalendar) GregorianCalendar.getInstance()).getTimeZone().getOffset(asLong.longValue() * 1000) / 1000;
        }
        if (asLong2 != null) {
            fVar.f6636c = asLong2.longValue();
        }
        if (asBoolean != null) {
            fVar.f6637d = asBoolean.booleanValue();
        }
        return fVar;
    }

    public static C0607of[] b(JSONArray jSONArray) {
        try {
            C0607of[] ofVarArr = new C0607of[jSONArray.length()];
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        ofVarArr[i] = b(optJSONObject);
                    }
                    i++;
                } catch (Throwable unused) {
                    return ofVarArr;
                }
            }
            return ofVarArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static C0607of b(JSONObject jSONObject) {
        C0607of ofVar = new C0607of();
        int optInt = jSONObject.optInt("signal_strength", ofVar.f6407b);
        if (optInt != -1) {
            ofVar.f6407b = optInt;
        }
        ofVar.f6406a = jSONObject.optInt("cell_id", ofVar.f6406a);
        ofVar.f6408c = jSONObject.optInt("lac", ofVar.f6408c);
        ofVar.f6409d = jSONObject.optInt("country_code", ofVar.f6409d);
        ofVar.f6410e = jSONObject.optInt("operator_id", ofVar.f6410e);
        ofVar.f6411f = jSONObject.optString("operator_name", ofVar.f6411f);
        ofVar.f6412g = jSONObject.optBoolean("is_connected", ofVar.f6412g);
        ofVar.f6413h = jSONObject.optInt("cell_type", 0);
        ofVar.i = jSONObject.optInt("pci", ofVar.i);
        ofVar.j = jSONObject.optLong("last_visible_time_offset", ofVar.j);
        ofVar.k = jSONObject.optInt("lte_rsrq", ofVar.k);
        ofVar.l = jSONObject.optInt("lte_rssnr", ofVar.l);
        ofVar.n = jSONObject.optInt("arfcn", ofVar.n);
        ofVar.m = jSONObject.optInt("lte_rssi", ofVar.m);
        ofVar.o = jSONObject.optInt("lte_bandwidth", ofVar.o);
        ofVar.p = jSONObject.optInt("lte_cqi", ofVar.p);
        return ofVar;
    }

    static C0374f6 a(int i) {
        C0374f6 f6Var = f4299b.get(i);
        return f6Var == null ? C0374f6.FOREGROUND : f6Var;
    }

    public static C0679rf[] a(JSONArray jSONArray) {
        try {
            C0679rf[] rfVarArr = new C0679rf[jSONArray.length()];
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    rfVarArr[i] = a(jSONArray.getJSONObject(i));
                    i++;
                } catch (Throwable unused) {
                    return rfVarArr;
                }
            }
            return rfVarArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static C0679rf a(JSONObject jSONObject) {
        try {
            C0679rf rfVar = new C0679rf();
            rfVar.f6715a = jSONObject.getString("mac");
            rfVar.f6716b = jSONObject.getInt("signal_strength");
            rfVar.f6717c = jSONObject.getString("ssid");
            rfVar.f6718d = jSONObject.optBoolean("is_connected");
            rfVar.f6719e = jSONObject.optLong("last_visible_offset_seconds", 0);
            return rfVar;
        } catch (Throwable unused) {
            C0679rf rfVar2 = new C0679rf();
            rfVar2.f6715a = jSONObject.optString("mac");
            return rfVar2;
        }
    }

    public static Integer b(C0244a1 a1Var) {
        if (a1Var == null) {
            return null;
        }
        return f4300c.get(a1Var);
    }

    static int a(C0374f6 f6Var) {
        Integer num = f4298a.get(f6Var);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static C0678re a(C0244a1 a1Var) {
        C0678re reVar = a1Var != null ? f4301d.get(a1Var) : null;
        return reVar == null ? C0678re.b() : reVar;
    }

    public static int a(E.b.a aVar) {
        int ordinal = aVar.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static int a(C0604oc.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            return 0;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 3 : 2;
        }
        return 1;
    }
}
