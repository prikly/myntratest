package com.bytedance.sdk.openadsdk.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.d.d.d;
import com.bytedance.sdk.component.d.d.g;
import com.bytedance.sdk.component.utils.h;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.b.a;
import com.bytedance.sdk.openadsdk.core.b;
import com.bytedance.sdk.openadsdk.core.d.c;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.j;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.p;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdEventManager */
public class e {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0009 A[LOOP:0: B:1:0x0009->B:13:0x0009, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0020 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r1, com.bytedance.sdk.openadsdk.core.e.n r2) {
        /*
            java.lang.String r0 = "l`lgmkawino"
            java.lang.String r0 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r0)
            a((android.content.Context) r1, (com.bytedance.sdk.openadsdk.core.e.n) r2, (java.lang.String) r0)
        L_0x0009:
            r1 = 94
            r2 = 75
            r0 = 93
        L_0x000f:
            switch(r1) {
                case 92: goto L_0x0015;
                case 93: goto L_0x0018;
                case 94: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0020
        L_0x0013:
            r1 = 4
            goto L_0x0020
        L_0x0015:
            switch(r2) {
                case 21: goto L_0x0020;
                case 22: goto L_0x0020;
                case 23: goto L_0x0020;
                default: goto L_0x0018;
            }
        L_0x0018:
            switch(r2) {
                case 91: goto L_0x0009;
                case 92: goto L_0x0020;
                case 93: goto L_0x001c;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            r2 = 91
            goto L_0x0018
        L_0x0020:
            r1 = 93
            r2 = 93
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.b.e.a(android.content.Context, com.bytedance.sdk.openadsdk.core.e.n):void");
    }

    public static void a(Context context, n nVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(g.g1657027613257dc("rdlgawYsqyo"), g.g1657027613257dc("h4"));
            jSONObject2.putOpt(g.g1657027613257dc("rdlgawYsqyoT>"), 0);
            jSONObject.putOpt(g.g1657027613257dc("ae]f|qtfWmkm"), jSONObject2);
        } catch (Exception unused) {
        }
        c(context, nVar, str, g.g1657027613257dc("oqgm[ptkWa?"), jSONObject);
    }

    public static void a(Context context, n nVar, String str, long j) {
        while (true) {
            char c2 = 'I';
            while (true) {
                switch (c2) {
                    case 'H':
                        JSONObject jSONObject = new JSONObject();
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.putOpt(g.g1657027613257dc("rdlgawYsqyo"), g.g1657027613257dc("h4"));
                            jSONObject2.putOpt(g.g1657027613257dc("rdlgawYsqyoT>"), 0);
                            jSONObject2.putOpt(g.g1657027613257dc("iovfvdesafdTahzgu"), Integer.valueOf(nVar.g()));
                            jSONObject.putOpt(g.g1657027613257dc("ae]f|qtfWmkm"), jSONObject2);
                            jSONObject.put(g.g1657027613257dc("dtpbplii"), Math.min(j, TTAdConstant.AD_MAX_EVENT_TIME));
                        } catch (Exception unused) {
                        }
                        c(context, nVar, str, g.g1657027613257dc("lncg"), jSONObject);
                        return;
                    case 'J':
                    default:
                        c2 = 'H';
                }
            }
        }
    }

    public static void a(Context context, n nVar, String str, long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("ig]otZjhimcekR}zsrw`g"), z ? 1 : 2);
            jSONObject2.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ae]f|qtfWmkm"), jSONObject.toString());
            jSONObject2.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("dtpbplii"), j);
        } catch (Throwable th) {
            l.b(th.toString());
        }
        e(context, nVar, str, com.bytedance.sdk.component.e.c.g.g1657027613239dc("lq]okdbnfn"), jSONObject2);
    }

    public static void a(Context context, n nVar, String str, String str2) {
        c(context, nVar, str, str2);
    }

    public static void a(Context context, n nVar, String str, String str2, long j, int i, Map<String, Object> map, j jVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(d.d1657027613261dc("dtpbplii"), j);
            jSONObject.put(d.d1657027613261dc("pdp`akr"), i);
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
            }
            if ((d.d1657027613261dc("fdgg[gtbib").equals(str2) || d.d1657027613261dc("fdgg[jpbz").equals(str2)) && jVar != null) {
                jVar.a(jSONObject2);
            }
            jSONObject.put(d.d1657027613261dc("ae]f|qtfWmkm"), jSONObject2.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        e(context, nVar, str, str2, jSONObject);
    }

    public static void a(Context context, n nVar, String str, String str2, long j, JSONObject jSONObject) {
        while (true) {
            char c2 = 15;
            while (true) {
                switch (c2) {
                    case 13:
                    case 14:
                        if (context != null && nVar != null && jSONObject != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("dtpbplii"), j);
                                jSONObject2.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ae]f|qtfWmkm"), jSONObject.toString());
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            e(context, nVar, str, str2, jSONObject2);
                            return;
                        }
                        return;
                    default:
                        c2 = 14;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        switch(r0) {
            case 39: goto L_0x0060;
            case 40: goto L_0x0004;
            case 41: goto L_0x0004;
            default: goto L_0x005d;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        r0 = '\'';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0004, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r4, com.bytedance.sdk.openadsdk.core.e.n r5, java.lang.String r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
        /*
            r0 = 56
            r1 = 60
        L_0x0004:
            r2 = 41
        L_0x0006:
            switch(r2) {
                case 40: goto L_0x000a;
                case 41: goto L_0x0060;
                case 42: goto L_0x0004;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0004
        L_0x000a:
            switch(r1) {
                case 81: goto L_0x000e;
                case 82: goto L_0x005a;
                case 83: goto L_0x0012;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0060
        L_0x000e:
            switch(r0) {
                case 29: goto L_0x0012;
                case 30: goto L_0x0012;
                case 31: goto L_0x0060;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x005a
        L_0x0012:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            if (r8 == 0) goto L_0x0040
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x004e }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x004e }
        L_0x0026:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x004e }
            if (r2 == 0) goto L_0x0040
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x004e }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x004e }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x004e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x004e }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x004e }
            r0.put(r3, r2)     // Catch:{ all -> 0x004e }
            goto L_0x0026
        L_0x0040:
            java.lang.String r8 = "ae]f|qtfWmkm"
            java.lang.String r8 = com.bytedance.sdk.component.b.a.e.e1657027613270dc(r8)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004e }
            r1.put(r8, r0)     // Catch:{ all -> 0x004e }
            goto L_0x0056
        L_0x004e:
            r8 = move-exception
            java.lang.String r8 = r8.toString()
            com.bytedance.sdk.component.utils.l.b(r8)
        L_0x0056:
            e((android.content.Context) r4, (com.bytedance.sdk.openadsdk.core.e.n) r5, (java.lang.String) r6, (java.lang.String) r7, (org.json.JSONObject) r1)
            return
        L_0x005a:
            switch(r0) {
                case 39: goto L_0x0060;
                case 40: goto L_0x0004;
                case 41: goto L_0x0004;
                default: goto L_0x005d;
            }
        L_0x005d:
            r0 = 39
            goto L_0x005a
        L_0x0060:
            r2 = 40
            r1 = 83
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.b.e.a(android.content.Context, com.bytedance.sdk.openadsdk.core.e.n, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public static void a(Context context, n nVar, String str, String str2, JSONObject jSONObject) {
        while (true) {
            char c2 = '^';
            char c3 = '}';
            while (true) {
                switch (c2) {
                    case '^':
                        break;
                    case '_':
                        switch (c3) {
                            case '^':
                            case '`':
                                break;
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
                c2 = '_';
                c3 = '_';
            }
        }
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("ae]f|qtfWmkm"), jSONObject.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            e(context, nVar, str, str2, jSONObject2);
        } else {
            c(context, nVar, str, str2);
        }
        if (com.bytedance.sdk.component.b.a.e.e1657027613270dc("cmk`o").equals(str2)) {
            p.c(nVar);
        }
    }

    public static void a(Context context, n nVar, String str, String str2, JSONObject jSONObject, long j) {
        if (context != null && nVar != null && jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ae]f|qtfWmkm"), jSONObject.toString());
                jSONObject2.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("dtpbplii"), j);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            e(context, nVar, str, str2, jSONObject2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|4|(3:6|(2:9|7)|52)|10|(1:12)(1:13)|14|15|(4:17|18|19|(2:21|22))|26|(3:28|29|(2:33|(1:35)(2:36|(1:38))))|39|40|44|(1:46)|47|(1:49)|50|51) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0138 */
    @com.bytedance.JProtect
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r5, com.bytedance.sdk.openadsdk.core.e.n r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.Object> r8, java.lang.Double r9) {
        /*
            r5 = 0
            com.bytedance.sdk.openadsdk.core.p.b((com.bytedance.sdk.openadsdk.core.e.n) r6)     // Catch:{ JSONException -> 0x013e }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x013e }
            r0.<init>()     // Catch:{ JSONException -> 0x013e }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x013c }
            r1.<init>()     // Catch:{ JSONException -> 0x013c }
            if (r8 == 0) goto L_0x0032
            java.util.Set r8 = r8.entrySet()     // Catch:{ JSONException -> 0x013c }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ JSONException -> 0x013c }
        L_0x0018:
            boolean r2 = r8.hasNext()     // Catch:{ JSONException -> 0x013c }
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r8.next()     // Catch:{ JSONException -> 0x013c }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ JSONException -> 0x013c }
            java.lang.Object r3 = r2.getKey()     // Catch:{ JSONException -> 0x013c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x013c }
            java.lang.Object r2 = r2.getValue()     // Catch:{ JSONException -> 0x013c }
            r1.put(r3, r2)     // Catch:{ JSONException -> 0x013c }
            goto L_0x0018
        L_0x0032:
            java.lang.String r8 = "iovfvdesafdTahzgu"
            java.lang.String r8 = com.bytedance.sdk.component.b.a.e.e1657027613270dc(r8)     // Catch:{ JSONException -> 0x013c }
            int r2 = r6.g()     // Catch:{ JSONException -> 0x013c }
            r1.put(r8, r2)     // Catch:{ JSONException -> 0x013c }
            java.lang.String r8 = "rdco[lhsm{khxdaaO|wg|zr"
            java.lang.String r8 = com.bytedance.sdk.component.b.a.e.e1657027613270dc(r8)     // Catch:{ JSONException -> 0x013c }
            int r2 = r6.f()     // Catch:{ JSONException -> 0x013c }
            r1.put(r8, r2)     // Catch:{ JSONException -> 0x013c }
            java.lang.String r8 = "ae]f|qtfWmkm"
            java.lang.String r8 = com.bytedance.sdk.component.b.a.e.e1657027613270dc(r8)     // Catch:{ JSONException -> 0x013c }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x013c }
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x013c }
            java.lang.String r8 = "lne\\a}rui"
            java.lang.String r8 = com.bytedance.sdk.component.b.a.e.e1657027613270dc(r8)     // Catch:{ JSONException -> 0x013c }
            java.lang.String r1 = r6.ac()     // Catch:{ JSONException -> 0x013c }
            r0.putOpt(r8, r1)     // Catch:{ JSONException -> 0x013c }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x013c }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            double r1 = (double) r1     // Catch:{ JSONException -> 0x013c }
            double r3 = com.bytedance.sdk.openadsdk.utils.u.g((com.bytedance.sdk.openadsdk.core.e.n) r6)     // Catch:{ JSONException -> 0x013c }
            double r1 = r1 - r3
            java.lang.Double r8 = java.lang.Double.valueOf(r1)     // Catch:{ JSONException -> 0x013c }
            float r8 = r8.floatValue()     // Catch:{ JSONException -> 0x013c }
            java.lang.String r1 = "simt[qojm"
            java.lang.String r1 = com.bytedance.sdk.component.b.a.e.e1657027613270dc(r1)     // Catch:{ JSONException -> 0x013c }
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r8 = 0
        L_0x0088:
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch:{ JSONException -> 0x013c }
            r0.putOpt(r1, r8)     // Catch:{ JSONException -> 0x013c }
            java.lang.String r8 = "u`]skiodq"
            java.lang.String r8 = com.bytedance.sdk.component.b.a.e.e1657027613270dc(r8)     // Catch:{ JSONException -> 0x013c }
            int r1 = r6.F()     // Catch:{ JSONException -> 0x013c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x013c }
            r0.putOpt(r8, r1)     // Catch:{ JSONException -> 0x013c }
            java.lang.String r8 = r6.s()     // Catch:{ JSONException -> 0x013c }
            r1 = r8
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ JSONException -> 0x013c }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x013c }
            java.lang.String r2 = "tufptZvuajo"
            if (r1 != 0) goto L_0x00d9
            r1 = r8
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ JSONException -> 0x013c }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x013c }
            if (r1 != 0) goto L_0x00d9
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ all -> 0x00cd }
            r1 = 1203982336(0x47c35000, float:100000.0)
            float r8 = r8 * r1
            int r8 = java.lang.Math.round(r8)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r2)     // Catch:{ all -> 0x00cd }
            r0.put(r1, r8)     // Catch:{ all -> 0x00cd }
            goto L_0x00d9
        L_0x00cd:
            r8 = move-exception
            java.lang.String r1 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r2)     // Catch:{ JSONException -> 0x013c }
            r3 = 0
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x013c }
            r8.printStackTrace()     // Catch:{ JSONException -> 0x013c }
        L_0x00d9:
            java.util.Map r8 = r6.aj()     // Catch:{ JSONException -> 0x013c }
            if (r8 == 0) goto L_0x0138
            java.util.Map r8 = r6.aj()     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "sei\\flbcagmTxt~j"
            java.lang.String r1 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r1)     // Catch:{ all -> 0x0138 }
            java.lang.Object r8 = r8.get(r1)     // Catch:{ all -> 0x0138 }
            if (r8 == 0) goto L_0x0138
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0138 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ all -> 0x0138 }
            r1 = 2
            if (r8 != r1) goto L_0x0138
            r3 = 4681608360884174848(0x40f86a0000000000, double:100000.0)
            if (r9 == 0) goto L_0x0113
            java.lang.String r8 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r2)     // Catch:{ all -> 0x0138 }
            double r1 = r9.doubleValue()     // Catch:{ all -> 0x0138 }
            double r1 = r1 * r3
            long r1 = java.lang.Math.round(r1)     // Catch:{ all -> 0x0138 }
            r0.put(r8, r1)     // Catch:{ all -> 0x0138 }
            goto L_0x0138
        L_0x0113:
            java.util.Map r8 = r6.aj()     // Catch:{ all -> 0x0138 }
            java.lang.String r9 = "psk`a"
            java.lang.String r9 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r9)     // Catch:{ all -> 0x0138 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ all -> 0x0138 }
            if (r8 == 0) goto L_0x0138
            java.lang.String r9 = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc(r2)     // Catch:{ all -> 0x0138 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0138 }
            double r1 = java.lang.Double.parseDouble(r8)     // Catch:{ all -> 0x0138 }
            double r1 = r1 * r3
            long r1 = java.lang.Math.round(r1)     // Catch:{ all -> 0x0138 }
            r0.put(r9, r1)     // Catch:{ all -> 0x0138 }
        L_0x0138:
            com.bytedance.sdk.openadsdk.b.o.a(r6, r7)     // Catch:{ JSONException -> 0x013c }
            goto L_0x013f
        L_0x013c:
            goto L_0x013f
        L_0x013e:
            r0 = r5
        L_0x013f:
            com.bytedance.sdk.openadsdk.b.a$a r8 = new com.bytedance.sdk.openadsdk.b.a$a
            r8.<init>()
            com.bytedance.sdk.openadsdk.b.a$a r7 = r8.b((java.lang.String) r7)
            java.lang.String r8 = "simt"
            java.lang.String r8 = com.bytedance.sdk.component.b.a.e.e1657027613270dc(r8)
            com.bytedance.sdk.openadsdk.b.a$a r7 = r7.c((java.lang.String) r8)
            java.lang.String r8 = r6.Y()
            com.bytedance.sdk.openadsdk.b.a$a r7 = r7.f((java.lang.String) r8)
            java.lang.String r8 = r6.Z()
            com.bytedance.sdk.openadsdk.b.a$a r7 = r7.a((java.lang.String) r8)
            com.bytedance.sdk.openadsdk.b.a$a r7 = r7.a((org.json.JSONObject) r0)
            r7.a((com.bytedance.sdk.openadsdk.b.a.a) r5)
            android.content.Context r5 = com.bytedance.sdk.openadsdk.core.m.a()
            java.lang.String r5 = com.bytedance.sdk.openadsdk.core.j.a(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0189
            java.util.List r5 = r6.R()
            com.bytedance.sdk.openadsdk.k.a r7 = com.bytedance.sdk.openadsdk.core.m.g()
            r8 = 1
            java.util.List r5 = com.bytedance.sdk.openadsdk.k.e.a(r5, r8)
            r7.a(r5)
        L_0x0189:
            boolean r5 = com.bytedance.sdk.component.utils.l.c()
            if (r5 == 0) goto L_0x01b1
            java.lang.String r5 = "AeGuakr"
            java.lang.String r5 = com.bytedance.sdk.component.b.a.e.e1657027613270dc(r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "simt$"
            java.lang.String r8 = com.bytedance.sdk.component.b.a.e.e1657027613270dc(r8)
            r7.append(r8)
            java.lang.String r6 = r6.Y()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.bytedance.sdk.component.utils.l.c(r5, r6)
        L_0x01b1:
            com.bytedance.sdk.openadsdk.core.s.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.b.e.a(android.content.Context, com.bytedance.sdk.openadsdk.core.e.n, java.lang.String, java.util.Map, java.lang.Double):void");
    }

    public static void a(Context context, String str, long j) {
        c.a(context, str, j);
    }

    @JProtect
    public static void a(Context context, String str, n nVar, com.bytedance.sdk.openadsdk.core.e.g gVar, String str2, boolean z, Map<String, Object> map, int i) {
        char c2 = 18;
        while (true) {
            char c3 = '.';
            while (true) {
                switch (c3) {
                    case '-':
                        if (c2 <= '?') {
                            break;
                        } else {
                            break;
                        }
                    case '.':
                        break;
                    case '/':
                        if (c2 != 4) {
                            if (c2 == 5) {
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                }
                c3 = '-';
                c2 = 6;
            }
        }
        if (context == null) {
            m.a();
        }
        JSONObject jSONObject = new JSONObject();
        if (gVar != null) {
            try {
                JSONObject a2 = gVar.a();
                a2.put(com.bytedance.sdk.component.e.d.c.c1657027613239dc("ir]ueioc"), z);
                if (i >= 1 && i <= 2) {
                    a2.put(com.bytedance.sdk.component.e.d.c.c1657027613239dc("urgq[gcoicd~Rzv`t"), i);
                }
                if (map != null) {
                    for (Map.Entry next : map.entrySet()) {
                        a2.put((String) next.getKey(), next.getValue());
                    }
                }
                a2.put(com.bytedance.sdk.component.e.d.c.c1657027613239dc("iovfvdesafdTahzgu"), nVar.g());
                jSONObject.put(com.bytedance.sdk.component.e.d.c.c1657027613239dc("ae]f|qtfWmkm"), a2.toString());
            } catch (JSONException unused) {
            }
        }
        jSONObject.putOpt(com.bytedance.sdk.component.e.c.g.g1657027613239dc("lne\\a}rui"), nVar.ac());
        float floatValue = Double.valueOf(((double) (System.currentTimeMillis() / 1000)) - u.g(nVar)).floatValue();
        String c1657027613239dc = com.bytedance.sdk.component.e.d.c.c1657027613239dc("simt[qojm");
        if (floatValue <= 0.0f) {
            floatValue = 0.0f;
        }
        jSONObject.putOpt(c1657027613239dc, Float.valueOf(floatValue));
        jSONObject.putOpt(com.bytedance.sdk.component.e.d.c.c1657027613239dc("u`]skiodq"), Integer.valueOf(nVar.F()));
        new a.C0000a().b(str2).c(str).f(nVar.Y()).a(nVar.Z()).a(jSONObject).a((com.bytedance.sdk.openadsdk.b.a.a) null);
        if (!TextUtils.isEmpty(j.a(m.a())) && com.bytedance.sdk.component.e.d.c.c1657027613239dc("cmk`o").equals(str)) {
            m.g().a(com.bytedance.sdk.openadsdk.k.e.a(nVar.S(), true));
        }
        if (l.c()) {
            String c1657027613239dc2 = com.bytedance.sdk.component.e.d.c.c1657027613239dc("AeGuakr");
            l.c(c1657027613239dc2, str + com.bytedance.sdk.component.e.d.c.c1657027613239dc(" ") + nVar.Y());
        }
        if (com.bytedance.sdk.component.e.d.c.c1657027613239dc("cmk`o").equals(str)) {
            p.c(nVar);
        }
    }

    public static void a(AdSlot adSlot) {
        String codeId;
        if (adSlot == null) {
            codeId = "";
        } else if (TextUtils.isEmpty(adSlot.getBidAdm())) {
            codeId = adSlot.getCodeId();
        } else {
            return;
        }
        a(codeId);
    }

    public static void a(n nVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        r0 = 'I';
        r1 = '`';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x0041;
            case 56: goto L_0x000f;
            case 57: goto L_0x000f;
            default: goto L_0x000e;
        };
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.bytedance.sdk.openadsdk.core.e.n r5, java.lang.String r6) {
        /*
        L_0x0000:
            r0 = 74
            r1 = 55
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0000;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0046
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0041;
                case 95: goto L_0x000f;
                case 96: goto L_0x000f;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x0041;
                case 56: goto L_0x000f;
                case 57: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0041
        L_0x000f:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "rdtfmfcX|z"
            java.lang.String r2 = com.bytedance.sdk.component.e.c.a.a1657027613243dc(r2)     // Catch:{ Exception -> 0x0033 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0033 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0033 }
            java.lang.String r2 = "ae]f|qtfWmkm"
            java.lang.String r2 = com.bytedance.sdk.component.e.c.a.a1657027613243dc(r2)     // Catch:{ Exception -> 0x0033 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0033 }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0033 }
        L_0x0033:
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.m.a()
            java.lang.String r2 = "bhfgmkaXzline{k"
            java.lang.String r2 = com.bytedance.sdk.component.e.c.a.a1657027613243dc(r2)
            e((android.content.Context) r1, (com.bytedance.sdk.openadsdk.core.e.n) r5, (java.lang.String) r6, (java.lang.String) r2, (org.json.JSONObject) r0)
            return
        L_0x0041:
            r0 = 73
            r1 = 96
            goto L_0x0004
        L_0x0046:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.b.e.a(com.bytedance.sdk.openadsdk.core.e.n, java.lang.String):void");
    }

    public static void a(n nVar, String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("dtpbplii"), j);
        } catch (Exception unused) {
        }
        e(m.a(), nVar, str, com.bytedance.sdk.component.e.c.a.a1657027613243dc("bhfgmkaXdfko"), jSONObject);
    }

    public static void a(n nVar, String str, long j, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (j != -1) {
            try {
                jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("dtpbplii"), j);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                jSONObject2.put((String) next.getKey(), next.getValue());
            }
        }
        jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ae]f|qtfWmkm"), jSONObject2.toString());
        a(nVar, com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("oqgm[db"), str, jSONObject, (j) null, (com.bytedance.sdk.openadsdk.b.a.a) null);
    }

    public static void a(n nVar, String str, String str2) {
        while (true) {
            char c2 = 15;
            while (true) {
                switch (c2) {
                    case 13:
                    case 14:
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.putOpt(com.bytedance.sdk.component.e.c.a.a1657027613243dc("esplvZkto"), str2);
                            jSONObject.putOpt(com.bytedance.sdk.component.e.c.a.a1657027613243dc("ae]f|qtfWmkm"), jSONObject2);
                        } catch (JSONException unused) {
                        }
                        e(m.a(), nVar, str, com.bytedance.sdk.component.e.c.a.a1657027613243dc("simt[`tug{"), jSONObject);
                        return;
                    default:
                        c2 = 14;
                }
            }
        }
    }

    @JProtect
    public static void a(n nVar, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                String optString = jSONObject.optString(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ae]f|qtfWmkm"), (String) null);
                if (optString != null) {
                    jSONObject2 = new JSONObject(optString);
                }
                if (!com.bytedance.sdk.component.e.c.g.g1657027613239dc("cmk`o").equals(str3)) {
                    jSONObject2.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("ddtjg`"), com.bytedance.sdk.openadsdk.utils.e.e(m.a()).toString());
                }
                jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ae]f|qtfWmkm"), jSONObject2.toString());
                jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("t`e"), str2);
                if (com.bytedance.sdk.component.e.c.g.g1657027613239dc("cmk`o").equals(str3)) {
                    p.c(nVar);
                    float floatValue = Double.valueOf(((double) (System.currentTimeMillis() / 1000)) - u.e(jSONObject.optString(com.bytedance.sdk.component.e.c.g.g1657027613239dc("lne\\a}rui")))).floatValue();
                    String a1657027613243dc = com.bytedance.sdk.component.e.c.a.a1657027613243dc("simt[qojm");
                    if (floatValue <= 0.0f) {
                        floatValue = 0.0f;
                    }
                    jSONObject.putOpt(a1657027613243dc, Float.valueOf(floatValue));
                    if (!TextUtils.isEmpty(j.a(m.a())) && nVar != null) {
                        m.g().a(com.bytedance.sdk.openadsdk.k.e.a(nVar.S(), true));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        new a.C0000a().d(str).b(str2).c(str3).f(String.valueOf(j)).g(String.valueOf(j2)).a(nVar.Z()).a(jSONObject).a((com.bytedance.sdk.openadsdk.b.a.a) null);
        if (l.c()) {
            l.c(com.bytedance.sdk.component.e.c.g.g1657027613239dc("AeGuakr"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("sdlgNvGcMoex"));
        }
    }

    public static void a(n nVar, String str, String str2, JSONObject jSONObject, j jVar, com.bytedance.sdk.openadsdk.b.a.a aVar) {
        if (nVar != null) {
            new a.C0000a().f(nVar.Y()).e(nVar.ac()).a(nVar.Z()).b(str).c(str2).a(jSONObject).a(aVar);
        }
    }

    @JProtect
    public static void a(n nVar, String str, Map<String, Object> map) {
        char c2 = 'R';
        while (true) {
            switch (c2) {
                case 'P':
                case 'Q':
                    Context a2 = m.a();
                    JSONObject jSONObject = new JSONObject();
                    if (map == null || map.size() <= 0) {
                        c(a2, nVar, str, com.bytedance.sdk.component.e.c.e.e1657027613237dc("lncg[dbXl|xjxdaa"));
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(com.bytedance.sdk.component.e.c.e.e1657027613237dc("ddtjg`"), com.bytedance.sdk.openadsdk.utils.e.e(a2).toString());
                        Object remove = map.remove(com.bytedance.sdk.component.e.c.e.e1657027613237dc("tnvbhZrnel"));
                        for (Map.Entry next : map.entrySet()) {
                            jSONObject2.put((String) next.getKey(), next.getValue());
                        }
                        if (remove instanceof Long) {
                            jSONObject.put(com.bytedance.sdk.component.e.c.e.e1657027613237dc("dtpbplii"), remove);
                        } else {
                            jSONObject.put(com.bytedance.sdk.component.e.c.e.e1657027613237dc("dtpbplii"), 0);
                        }
                        jSONObject.put(com.bytedance.sdk.component.e.c.e.e1657027613237dc("ae]f|qtfWmkm"), jSONObject2.toString());
                    } catch (Exception unused) {
                    }
                    e(a2, nVar, str, com.bytedance.sdk.component.e.c.e.e1657027613237dc("lncg[dbXl|xjxdaa"), jSONObject);
                    return;
                default:
                    c2 = 'P';
            }
        }
    }

    public static void a(n nVar, List<FilterWord> list) {
        com.bytedance.sdk.openadsdk.dislike.a.a().a(nVar, list);
        if (l.c()) {
            String e1657027613270dc = com.bytedance.sdk.component.b.a.e.e1657027613270dc("AeGuakr");
            l.c(e1657027613270dc, com.bytedance.sdk.component.b.a.e.e1657027613270dc("tu]gmvjnclUbob`/") + nVar.Y());
        }
    }

    public static void a(final String str) {
        h.a().post(new Runnable() {
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("smmw"), str);
                    jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ae]f|qtfWmkm"), jSONObject2.toString());
                    long currentTimeMillis = System.currentTimeMillis() - com.bytedance.sdk.openadsdk.utils.p.c();
                    if (currentTimeMillis > TTAdConstant.AD_MAX_EVENT_TIME || currentTimeMillis < 0) {
                        com.bytedance.sdk.openadsdk.utils.p.d();
                        return;
                    }
                    jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("dtpbplii"), currentTimeMillis);
                    e.a(b.a(new JSONObject(com.bytedance.sdk.openadsdk.utils.p.a())), com.bytedance.sdk.openadsdk.utils.p.b(), com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ndzw[iiflVymy}"), jSONObject, (j) null, (com.bytedance.sdk.openadsdk.b.a.a) null);
                } catch (Throwable unused) {
                }
            }
        });
    }

    @JProtect
    public static void a(String str, n nVar, String str2, j jVar) {
        if (nVar != null && jVar != null && jVar.a()) {
            final String str3 = str;
            final j jVar2 = jVar;
            final n nVar2 = nVar;
            final String str4 = str2;
            com.bytedance.sdk.component.f.e.b().execute(new com.bytedance.sdk.component.f.g(com.bytedance.sdk.component.b.a.e.e1657027613270dc("aeQkkrRnelXn|b|{")) {
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("dtpbplii"), str3);
                        if (!(jVar2 == null || jVar2.b() == null)) {
                            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ae]f|qtfWmkm"), jVar2.b().toString());
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    e.e(m.a(), nVar2, str4, com.bytedance.sdk.component.e.c.d.d1657027613220dc("ae]pljqX|`gn"), jSONObject);
                }
            });
        }
    }

    public static void b(Context context, n nVar, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ae]phjrX|pzn"), nVar.x().getNativeAdType());
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("iovfvdesafdTahzgu"), nVar.g());
            jSONObject2.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ae]f|qtfWmkm"), jSONObject.toString());
        } catch (Throwable th) {
            l.b(th.toString());
        }
        e(context, nVar, str, com.bytedance.sdk.component.e.c.g.g1657027613239dc("phawqwcXkechg"), jSONObject2);
    }

    @JProtect
    public static void b(Context context, n nVar, String str, long j) {
        String str2;
        String str3;
        if (context != null && m.h().F()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("dtpbplii"), System.currentTimeMillis() - j);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1695837674:
                    if (str.equals(g.g1657027613257dc("b`lmawYfl"))) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1364000502:
                    if (str.equals(g.g1657027613257dc("rdubvaccWcoib"))) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -764631662:
                    if (str.equals(g.g1657027613257dc("ftnowftbmgUbbyk}ce{g}tzHy}"))) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -712491894:
                    if (str.equals(g.g1657027613257dc("el`f``bXim"))) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1844104722:
                    if (str.equals(g.g1657027613257dc("iovfvdesafd"))) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1912999166:
                    if (str.equals(g.g1657027613257dc("dsct[db"))) {
                        c2 = 5;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                str3 = "b`lmawYflVfdmizf}t";
            } else if (c2 == 1) {
                str3 = "iovfvdesafdT`bokdxv";
            } else if (c2 == 2) {
                str3 = "el`f``bXimUgclj{y|w";
            } else if (c2 == 3) {
                str3 = "rdubvaccWcoibQcpvg}xs";
            } else if (c2 == 4) {
                str3 = "ftnowftbmgUbbyk}ce{g}tzHy}Ews|zkILG";
            } else if (c2 != 5) {
                str2 = "";
                e(context, nVar, str, str2, jSONObject);
            } else {
                str3 = "dsct[dbXdfkoxdcj";
            }
            str2 = g.g1657027613257dc(str3);
            e(context, nVar, str, str2, jSONObject);
        }
    }

    public static void b(Context context, n nVar, String str, String str2) {
        c(context, nVar, str, str2);
    }

    public static void b(Context context, n nVar, String str, String str2, long j, JSONObject jSONObject) {
        while (true) {
            char c2 = 15;
            while (true) {
                switch (c2) {
                    case 13:
                    case 14:
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put(i.i1657027613257dc("dtpbplii"), j);
                            if (jSONObject != null) {
                                jSONObject2.putOpt(com.bytedance.sdk.component.b.a.e.e1657027613270dc("ae]f|qtfWmkm"), jSONObject);
                            }
                        } catch (Exception unused) {
                        }
                        String i1657027613257dc = i.i1657027613257dc("ile@efnb");
                        l.c(i1657027613257dc, i.i1657027613257dc("Rdrlvq&ci}k1,") + jSONObject2.toString());
                        e(context, nVar, str, str2, jSONObject2);
                        return;
                    default:
                        c2 = 14;
                }
            }
        }
    }

    public static void b(Context context, n nVar, String str, String str2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ae]f|qtfWmkm"), jSONObject2.toString());
        e(context, nVar, str, str2, jSONObject);
    }

    public static void b(Context context, n nVar, String str, String str2, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                jSONObject2.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ae]f|qtfWmkm"), jSONObject.toString());
            } catch (Exception unused) {
            }
        }
        e(context, nVar, str, str2, jSONObject2);
    }

    public static void b(n nVar, String str, Map<String, Object> map) {
        a(nVar, str, -1, map);
    }

    @JProtect
    private static void c(Context context, n nVar, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(com.bytedance.sdk.component.e.c.g.g1657027613239dc("lne\\a}rui"), nVar.ac());
            jSONObject.putOpt(com.bytedance.sdk.component.e.c.g.g1657027613239dc("u`]skiodq"), Integer.valueOf(nVar.F()));
        } catch (JSONException unused) {
        }
        new a.C0000a().b(str).c(str2).f(nVar.Y()).a(nVar.Z()).a(jSONObject).a((com.bytedance.sdk.openadsdk.b.a.a) null);
        if (l.c()) {
            String g1657027613239dc = com.bytedance.sdk.component.e.c.g.g1657027613239dc("AeGuakr");
            l.c(g1657027613239dc, com.bytedance.sdk.component.e.c.g.g1657027613239dc("t`e9$") + str + com.bytedance.sdk.component.e.c.g.g1657027613239dc("l``fh?&") + str2 + com.bytedance.sdk.component.e.c.g.g1657027613239dc(" ") + nVar.Y());
        }
    }

    public static void c(Context context, n nVar, String str, String str2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("ae]f|qtfWmkm"), jSONObject2.toString());
        e(context, nVar, str, str2, jSONObject);
    }

    @JProtect
    public static void c(Context context, n nVar, String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        e(context, nVar, str, str2, jSONObject);
    }

    public static void d(Context context, n nVar, String str, String str2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
            }
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ae]f|qtfWmkm"), jSONObject2.toString());
        } catch (Exception unused) {
        }
        e(context, nVar, str, str2, jSONObject);
    }

    public static void e(Context context, n nVar, String str, String str2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
            }
            jSONObject.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("ae]f|qtfWmkm"), jSONObject2.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        e(context, nVar, str, str2, jSONObject);
    }

    /* access modifiers changed from: private */
    @JProtect
    public static void e(Context context, n nVar, String str, String str2, JSONObject jSONObject) {
        if (nVar != null) {
            if (jSONObject != null) {
                try {
                    jSONObject.putOpt(com.bytedance.sdk.component.e.c.d.d1657027613220dc("lne\\a}rui"), nVar.ac());
                    jSONObject.putOpt(com.bytedance.sdk.component.e.c.d.d1657027613220dc("u`]skiodq"), Integer.valueOf(nVar.F()));
                } catch (JSONException unused) {
                }
            } else {
                l.c(com.bytedance.sdk.component.e.c.d.d1657027613220dc("AeGuakr"), com.bytedance.sdk.component.e.c.d.d1657027613220dc("cbp#hja+(eelShv{bp2zg5szhmc"));
            }
            new a.C0000a().b(str).c(str2).f(nVar.Y()).a(nVar.Z()).a(jSONObject).a((com.bytedance.sdk.openadsdk.b.a.a) null);
            if (l.c()) {
                String d1657027613220dc = com.bytedance.sdk.component.e.c.d.d1657027613220dc("AeGuakr");
                l.c(d1657027613220dc, com.bytedance.sdk.component.e.c.d.d1657027613220dc("t`e9$") + str + com.bytedance.sdk.component.e.c.d.d1657027613220dc("l``fh?&") + str2 + com.bytedance.sdk.component.e.c.d.d1657027613220dc(" ") + nVar.Y());
            }
        }
    }
}
