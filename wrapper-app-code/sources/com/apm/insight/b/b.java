package com.apm.insight.b;

import android.content.Context;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.h;
import com.apm.insight.l.i;
import com.apm.insight.l.l;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.a;
import com.apm.insight.runtime.o;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    static volatile boolean f10444a = true;

    /* renamed from: f  reason: collision with root package name */
    private static volatile boolean f10445f;
    private long A = 0;
    private final Runnable B = new Runnable() {
        public void run() {
            try {
                b.this.a(200, 25);
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
        }
    };
    private int C = 0;
    private List<Pattern> D = null;
    private File E = null;

    /* renamed from: b  reason: collision with root package name */
    Pattern f10446b = null;

    /* renamed from: c  reason: collision with root package name */
    private c f10447c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f10448d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f10449e;

    /* renamed from: g  reason: collision with root package name */
    private long f10450g = -1;

    /* renamed from: h  reason: collision with root package name */
    private File f10451h = null;
    /* access modifiers changed from: private */
    public boolean i = true;
    private JSONObject j;
    private JSONObject k;
    private String l = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
    private String m = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
    private String n = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
    private String o = "npth_inner_default";
    private JSONArray p;
    private JSONObject q;
    private int r = 0;
    private long s = -1;
    private JSONArray t;
    private JSONArray u;
    private JSONObject v;
    private boolean w;
    private final Object x = new Object();
    private volatile boolean y;
    private long z = -1;

    public b(Context context) {
        this.f10448d = context;
    }

    private static String a(float f2) {
        return f2 <= 0.0f ? "0%" : f2 <= 0.1f ? "0% - 10%" : f2 <= 0.3f ? "10% - 30%" : f2 <= 0.6f ? "30% - 60%" : f2 <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    private static String a(float f2, float f3) {
        return f3 > 0.0f ? a(f2 / f3) : f2 > 0.0f ? "100%" : "0%";
    }

    private JSONObject a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray a2 = l.a(256, 128, jSONArray);
        if (a2.length() != jSONArray.length()) {
            this.r++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", a2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0225, code lost:
        if (r3 != 5) goto L_0x028c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02e9 A[LOOP:3: B:99:0x020b->B:154:0x02e9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x040e A[EDGE_INSN: B:214:0x040e->B:201:0x040e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x03f3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0082 A[EDGE_INSN: B:220:0x0082->B:18:0x0082 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03b5 A[EDGE_INSN: B:221:0x03b5->B:190:0x03b5 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r30, org.json.JSONObject r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r31
            android.os.SystemClock.uptimeMillis()
            java.lang.String r2 = "\n"
            r3 = r30
            java.lang.String[] r2 = r3.split(r2)
            r3 = 3
            float[] r4 = new float[r3]
            r4 = {-1082130432, -1082130432, -1082130432} // fill-array
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            int r10 = r2.length
            java.lang.String r11 = "unknown"
            r15 = r11
            r16 = r15
            r13 = 0
            r14 = 0
            r17 = 0
        L_0x0038:
            java.lang.String r12 = "total"
            if (r13 >= r10) goto L_0x0408
            r3 = r2[r13]
            boolean r18 = android.text.TextUtils.isEmpty(r3)
            if (r18 == 0) goto L_0x0053
            r18 = r2
            r25 = r7
            r26 = r8
            r27 = r9
            r19 = r10
            r22 = r11
            r7 = 3
            goto L_0x03f3
        L_0x0053:
            r18 = r2
            java.lang.String r2 = ""
            r19 = r10
            r10 = 1
            if (r14 == 0) goto L_0x03ca
            if (r14 == r10) goto L_0x02fd
            r10 = 2
            if (r14 == r10) goto L_0x02f1
            r10 = 3
            if (r14 == r10) goto L_0x0070
            r25 = r7
            r26 = r8
            r27 = r9
            r22 = r11
            r23 = r14
            goto L_0x03b5
        L_0x0070:
            java.lang.String r10 = "\\s"
            java.lang.String[] r10 = r3.split(r10)
            r22 = r11
            int r11 = r10.length
            r23 = r14
            r14 = 2
            if (r11 >= r14) goto L_0x0086
            r25 = r7
        L_0x0080:
            r26 = r8
        L_0x0082:
            r27 = r9
            goto L_0x03b5
        L_0x0086:
            r11 = 0
            r14 = r10[r11]
            java.lang.String r11 = "CPU"
            boolean r11 = r11.equalsIgnoreCase(r14)
            if (r11 == 0) goto L_0x00dc
            r11 = 1
            r14 = r10[r11]
            java.lang.String r11 = "usage"
            boolean r11 = r11.equalsIgnoreCase(r14)
            if (r11 == 0) goto L_0x00dc
            java.lang.String r2 = "ago"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x00a6
            r17 = 1
        L_0x00a6:
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x00d1
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x00d1
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x00d1
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x00d1
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x00c5
            goto L_0x00d1
        L_0x00c5:
            r25 = r7
            r26 = r8
            r27 = r9
            r14 = r23
            r0 = 4
            r7 = 3
            goto L_0x03f0
        L_0x00d1:
            r25 = r7
            r26 = r8
            r27 = r9
            r0 = 4
            r7 = 3
            r14 = 4
            goto L_0x03f0
        L_0x00dc:
            boolean r11 = r5.isEmpty()
            if (r11 != 0) goto L_0x00fb
            boolean r11 = r6.isEmpty()
            if (r11 != 0) goto L_0x00fb
            boolean r11 = r7.isEmpty()
            if (r11 != 0) goto L_0x00fb
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L_0x00fb
            boolean r11 = r8.isEmpty()
            if (r11 != 0) goto L_0x00fb
            goto L_0x00d1
        L_0x00fb:
            boolean r11 = r5.isEmpty()
            if (r11 == 0) goto L_0x0112
            r11 = 1
            r14 = r10[r11]
            java.lang.String r11 = "TOTAL:"
            boolean r11 = r14.equalsIgnoreCase(r11)
            if (r11 == 0) goto L_0x0112
            r11 = r2
            r0 = r5
            r25 = r7
            goto L_0x01aa
        L_0x0112:
            android.content.Context r11 = r0.f10448d
            java.lang.String r11 = r11.getPackageName()
            boolean r11 = r3.contains(r11)
            if (r11 == 0) goto L_0x0173
            r11 = r2
            r3 = 0
        L_0x0120:
            int r14 = r10.length
            if (r3 >= r14) goto L_0x016c
            r14 = r10[r3]
            r24 = r11
            android.content.Context r11 = r0.f10448d
            java.lang.String r11 = r11.getPackageName()
            boolean r11 = r14.contains(r11)
            if (r11 == 0) goto L_0x015f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r14 = r10[r3]
            r0 = r10[r3]
            r25 = r7
            r7 = 47
            int r0 = r0.indexOf(r7)
            r7 = 1
            int r0 = r0 + r7
            r21 = r10[r3]
            int r21 = r21.length()
            int r1 = r21 + -1
            java.lang.String r0 = r14.substring(r0, r1)
            r11.append(r0)
            r0 = 95
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            goto L_0x0163
        L_0x015f:
            r25 = r7
            r11 = r24
        L_0x0163:
            int r3 = r3 + 1
            r0 = r29
            r1 = r31
            r7 = r25
            goto L_0x0120
        L_0x016c:
            r25 = r7
            r24 = r11
            r0 = r25
            goto L_0x01aa
        L_0x0173:
            r25 = r7
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0186
            java.lang.String r0 = "system_server:"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0186
            r11 = r2
            r0 = r6
            goto L_0x01aa
        L_0x0186:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0197
            java.lang.String r0 = "kswapd"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0197
            r11 = r2
            r0 = r9
            goto L_0x01aa
        L_0x0197:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x01a8
            java.lang.String r0 = "dex2oat"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x01a8
            r11 = r2
            r0 = r8
            goto L_0x01aa
        L_0x01a8:
            r11 = r2
            r0 = 0
        L_0x01aa:
            if (r0 == 0) goto L_0x0080
            r1 = 0
        L_0x01ad:
            r3 = r10[r1]
            java.lang.String r7 = "%"
            boolean r3 = r3.contains(r7)
            if (r3 != 0) goto L_0x01bc
            int r1 = r1 + 1
            int r3 = r10.length
            if (r1 < r3) goto L_0x01ad
        L_0x01bc:
            r14 = r10[r1]     // Catch:{ all -> 0x01ee }
            java.lang.String r14 = r14.replace(r7, r2)     // Catch:{ all -> 0x01ee }
            java.lang.Float r14 = java.lang.Float.valueOf(r14)     // Catch:{ all -> 0x01ee }
            float r14 = r14.floatValue()     // Catch:{ all -> 0x01ee }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ee }
            r3.<init>()     // Catch:{ all -> 0x01ee }
            r3.append(r11)     // Catch:{ all -> 0x01ee }
            r3.append(r12)     // Catch:{ all -> 0x01ee }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01ee }
            if (r0 != r5) goto L_0x01de
            r26 = r8
            goto L_0x01e6
        L_0x01de:
            r26 = r8
            int r8 = com.apm.insight.l.d.e()     // Catch:{ all -> 0x01f0 }
            float r8 = (float) r8     // Catch:{ all -> 0x01f0 }
            float r14 = r14 / r8
        L_0x01e6:
            java.lang.Float r8 = java.lang.Float.valueOf(r14)     // Catch:{ all -> 0x01f0 }
            r0.put(r3, r8)     // Catch:{ all -> 0x01f0 }
            goto L_0x0208
        L_0x01ee:
            r26 = r8
        L_0x01f0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r14 = java.lang.Float.valueOf(r8)
            r0.put(r3, r14)
        L_0x0208:
            int r1 = r1 + 3
            r3 = 0
        L_0x020b:
            int r8 = r10.length
            if (r1 >= r8) goto L_0x0082
            java.lang.String r8 = "kernel"
            java.lang.String r14 = "softirq"
            r27 = r9
            if (r3 == 0) goto L_0x023e
            r9 = 1
            if (r3 == r9) goto L_0x0238
            r9 = 2
            if (r3 == r9) goto L_0x0233
            r8 = 3
            if (r3 == r8) goto L_0x022e
            r8 = 4
            if (r3 == r8) goto L_0x0229
            r8 = 5
            r28 = r3
            if (r3 == r8) goto L_0x0281
            goto L_0x028c
        L_0x0229:
            r28 = r3
            r20 = 5
            goto L_0x0276
        L_0x022e:
            r28 = r3
            r20 = 5
            goto L_0x0268
        L_0x0233:
            r28 = r3
            r20 = 5
            goto L_0x025a
        L_0x0238:
            r9 = 2
            r20 = 5
            r28 = r3
            goto L_0x0250
        L_0x023e:
            r20 = 5
            r9 = r10[r1]
            r28 = r3
            java.lang.String r3 = "user"
            boolean r3 = r3.equalsIgnoreCase(r9)
            if (r3 == 0) goto L_0x0250
            java.lang.String r8 = "user"
            r3 = 1
            goto L_0x028f
        L_0x0250:
            r3 = r10[r1]
            boolean r3 = r8.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x025a
            r3 = 2
            goto L_0x028f
        L_0x025a:
            r3 = r10[r1]
            java.lang.String r8 = "iowait"
            boolean r3 = r8.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0268
            java.lang.String r8 = "iowait"
            r3 = 3
            goto L_0x028f
        L_0x0268:
            r3 = r10[r1]
            java.lang.String r8 = "irq"
            boolean r3 = r8.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0276
            java.lang.String r8 = "irq"
            r3 = 4
            goto L_0x028f
        L_0x0276:
            r3 = r10[r1]
            boolean r3 = r14.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0281
            r8 = r14
            r3 = 5
            goto L_0x028f
        L_0x0281:
            r3 = r10[r1]
            boolean r3 = r14.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x028c
            r3 = 6
            r8 = r14
            goto L_0x028f
        L_0x028c:
            r3 = r28
            r8 = 0
        L_0x028f:
            if (r8 == 0) goto L_0x02e0
            int r9 = r1 + -1
            r9 = r10[r9]     // Catch:{ all -> 0x02c5 }
            java.lang.String r9 = r9.replace(r7, r2)     // Catch:{ all -> 0x02c5 }
            java.lang.Float r9 = java.lang.Float.valueOf(r9)     // Catch:{ all -> 0x02c5 }
            float r9 = r9.floatValue()     // Catch:{ all -> 0x02c5 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c5 }
            r14.<init>()     // Catch:{ all -> 0x02c5 }
            r14.append(r11)     // Catch:{ all -> 0x02c5 }
            r14.append(r8)     // Catch:{ all -> 0x02c5 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x02c5 }
            if (r0 != r5) goto L_0x02b5
            r20 = r7
            goto L_0x02bd
        L_0x02b5:
            r20 = r7
            int r7 = com.apm.insight.l.d.e()     // Catch:{ all -> 0x02c7 }
            float r7 = (float) r7     // Catch:{ all -> 0x02c7 }
            float r9 = r9 / r7
        L_0x02bd:
            java.lang.Float r7 = java.lang.Float.valueOf(r9)     // Catch:{ all -> 0x02c7 }
            r0.put(r14, r7)     // Catch:{ all -> 0x02c7 }
            goto L_0x02e2
        L_0x02c5:
            r20 = r7
        L_0x02c7:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r9 = java.lang.Float.valueOf(r8)
            r0.put(r7, r9)
            goto L_0x02e4
        L_0x02e0:
            r20 = r7
        L_0x02e2:
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x02e4:
            r7 = 6
            if (r3 < r7) goto L_0x02e9
            goto L_0x03b5
        L_0x02e9:
            int r1 = r1 + 3
            r7 = r20
            r9 = r27
            goto L_0x020b
        L_0x02f1:
            r25 = r7
            r26 = r8
            r27 = r9
            r22 = r11
            r23 = r14
            goto L_0x0381
        L_0x02fd:
            r25 = r7
            r26 = r8
            r27 = r9
            r22 = r11
            r23 = r14
            java.lang.String r3 = r3.trim()
            java.lang.String r0 = r3.toLowerCase()
            java.lang.String r1 = "shortmsg"
            boolean r1 = r0.startsWith(r1)
            r7 = 58
            if (r1 == 0) goto L_0x0322
            int r1 = r3.indexOf(r7)
            r3.substring(r1)
            r10 = 0
            goto L_0x0332
        L_0x0322:
            java.lang.String r1 = "reason:"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x03b7
            int r1 = r3.indexOf(r7)
            r3.substring(r1)
            r10 = 1
        L_0x0332:
            java.lang.String r1 = "input dispatch"
            boolean r1 = r0.contains(r1)
            java.lang.String r7 = "executing service"
            if (r1 == 0) goto L_0x0341
            java.lang.String r0 = "Input dispatching timed out"
        L_0x033e:
            r16 = r0
            goto L_0x037a
        L_0x0341:
            java.lang.String r1 = "broadcast of intent"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x034c
            java.lang.String r0 = "Broadcast of Intent"
            goto L_0x033e
        L_0x034c:
            boolean r1 = r0.contains(r7)
            if (r1 == 0) goto L_0x036d
            java.lang.String r0 = "null"
            boolean r0 = r0.equalsIgnoreCase(r15)
            if (r0 == 0) goto L_0x036a
            java.lang.String r0 = "service "
            int r0 = r3.indexOf(r0)
            int r0 = r0 + 8
            java.lang.String r0 = r3.substring(r0)
            java.lang.String r15 = r0.trim()
        L_0x036a:
            r16 = r7
            goto L_0x037a
        L_0x036d:
            java.lang.String r1 = "service.startforeground"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0378
            java.lang.String r0 = "not call Service.startForeground"
            goto L_0x033e
        L_0x0378:
            r16 = r22
        L_0x037a:
            if (r10 == 0) goto L_0x0381
            r0 = 4
            r7 = 3
            r14 = 2
            goto L_0x03f0
        L_0x0381:
            java.lang.String r0 = r3.trim()
            java.lang.String r1 = "Load:"
            boolean r3 = r0.startsWith(r1)
            if (r3 == 0) goto L_0x03b5
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "/"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r7 = 3
            if (r7 != r1) goto L_0x03b2
            r1 = 0
        L_0x03a0:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x03b2
            r2 = r0[r1]
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r2 = r2.floatValue()
            r4[r1] = r2
            int r1 = r1 + 1
            goto L_0x03a0
        L_0x03b2:
            r0 = 4
            r14 = 3
            goto L_0x03f0
        L_0x03b5:
            r7 = 3
            goto L_0x03ed
        L_0x03b7:
            r7 = 3
            java.lang.String r1 = "appfreeze"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x03ed
            r0 = 10
            java.lang.String r1 = "AppFreeze"
            r16 = r1
            r0 = 4
            r14 = 10
            goto L_0x03f0
        L_0x03ca:
            r25 = r7
            r26 = r8
            r27 = r9
            r22 = r11
            r23 = r14
            r7 = 3
            java.lang.String r0 = r3.trim()
            java.lang.String r1 = "tag:"
            boolean r3 = r0.startsWith(r1)
            if (r3 == 0) goto L_0x03ed
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r0 = r0.trim()
            r15 = r0
            r0 = 4
            r14 = 1
            goto L_0x03f0
        L_0x03ed:
            r14 = r23
            r0 = 4
        L_0x03f0:
            if (r14 < r0) goto L_0x03f3
            goto L_0x040e
        L_0x03f3:
            int r13 = r13 + 1
            r0 = r29
            r1 = r31
            r2 = r18
            r10 = r19
            r11 = r22
            r7 = r25
            r8 = r26
            r9 = r27
            r3 = 3
            goto L_0x0038
        L_0x0408:
            r25 = r7
            r26 = r8
            r27 = r9
        L_0x040e:
            r0 = r16
            java.lang.String r1 = "anr_tag"
            r2 = r31
            r2.put(r1, r15)
            java.lang.String r1 = java.lang.String.valueOf(r17)
            java.lang.String r3 = "anr_has_ago"
            r2.put(r3, r1)
            java.lang.String r1 = "anr_reason"
            r2.put(r1, r0)
            java.lang.String r0 = "app"
            r1 = r25
            a(r1, r2, r0)
            a(r5, r2, r12)
            boolean r0 = r6.isEmpty()
            java.lang.String r1 = "npth_anr_systemserver_total"
            java.lang.String r3 = "not found"
            if (r0 == 0) goto L_0x043d
            r2.put(r1, r3)
            goto L_0x044c
        L_0x043d:
            java.lang.Float r0 = com.apm.insight.l.r.a((java.util.Map<? super java.lang.String, java.lang.Float>) r6)
            float r0 = r0.floatValue()
            java.lang.String r0 = b((float) r0)
            r2.put(r1, r0)
        L_0x044c:
            boolean r0 = r27.isEmpty()
            java.lang.String r1 = "npth_anr_kswapd_total"
            if (r0 == 0) goto L_0x0458
            r2.put(r1, r3)
            goto L_0x0467
        L_0x0458:
            java.lang.Float r0 = com.apm.insight.l.r.a((java.util.Map<? super java.lang.String, java.lang.Float>) r27)
            float r0 = r0.floatValue()
            java.lang.String r0 = b((float) r0)
            r2.put(r1, r0)
        L_0x0467:
            boolean r0 = r26.isEmpty()
            java.lang.String r1 = "npth_anr_dex2oat_total"
            if (r0 == 0) goto L_0x0473
            r2.put(r1, r3)
            goto L_0x0482
        L_0x0473:
            java.lang.Float r0 = com.apm.insight.l.r.a((java.util.Map<? super java.lang.String, java.lang.Float>) r26)
            float r0 = r0.floatValue()
            java.lang.String r0 = b((float) r0)
            r2.put(r1, r0)
        L_0x0482:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(java.lang.String, org.json.JSONObject):void");
    }

    private static void a(HashMap<String, Float> hashMap, JSONObject jSONObject, String str) {
        String str2;
        String a2;
        String str3 = "npth_anr_" + str;
        if (hashMap.isEmpty()) {
            str2 = str3 + "_total";
            a2 = "not found";
        } else {
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            for (Map.Entry next : hashMap.entrySet()) {
                String str4 = (String) next.getKey();
                if (str4.endsWith("user")) {
                    f2 += ((Float) next.getValue()).floatValue();
                } else if (str4.endsWith("kernel")) {
                    f3 += ((Float) next.getValue()).floatValue();
                } else if (str4.endsWith("iowait")) {
                    f4 += ((Float) next.getValue()).floatValue();
                } else if (str4.endsWith("irq")) {
                    f5 += ((Float) next.getValue()).floatValue();
                } else if (str4.endsWith("softirq")) {
                    f6 += ((Float) next.getValue()).floatValue();
                }
            }
            float f7 = f2 + f3 + f4 + f5 + f6;
            jSONObject.put(str3 + "_total", b(f7));
            jSONObject.put(str3 + "_kernel_user_ratio", a(f3, f7));
            str2 = str3 + "_iowait_user_ratio";
            a2 = a(f4, f7);
        }
        jSONObject.put(str2, a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0194, code lost:
        if (android.text.TextUtils.isEmpty(r0) != false) goto L_0x01b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(org.json.JSONArray r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            if (r2 != 0) goto L_0x0007
            return
        L_0x0007:
            r3 = 0
            r1.j = r3
            r1.q = r3
            r4 = 0
            r1.r = r4
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.String r7 = "unknown"
            r1.l = r7
            r1.m = r7
            r1.n = r7
            r7 = 3
            int[] r7 = new int[r7]
            r7 = {0, 0, 0} // fill-array
            r8 = r0
            r0 = r3
            r9 = 0
            r10 = 0
        L_0x0030:
            int r11 = r17.length()
            if (r9 >= r11) goto L_0x01b9
            java.lang.String r11 = r2.optString(r9)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            java.lang.String r13 = "NPTH_CATCH"
            r14 = 40
            java.lang.String r15 = "main"
            r3 = 1
            if (r12 == 0) goto L_0x00ca
            int r11 = r8.length()
            if (r11 <= 0) goto L_0x00bb
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto L_0x00bb
            org.json.JSONObject r11 = r1.j
            if (r11 != 0) goto L_0x0064
            boolean r11 = r15.equals(r0)
            if (r11 == 0) goto L_0x0064
            org.json.JSONObject r11 = r1.c((org.json.JSONArray) r8)
            r1.j = r11
            goto L_0x006b
        L_0x0064:
            org.json.JSONObject r11 = r1.a((java.lang.String) r0, (org.json.JSONArray) r8)
            r5.put(r11)
        L_0x006b:
            boolean r11 = r15.equals(r0)     // Catch:{ all -> 0x007d }
            if (r11 != 0) goto L_0x007d
            int r11 = r0.indexOf(r14)     // Catch:{ all -> 0x007d }
            java.lang.String r11 = r0.substring(r4, r11)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = r11.trim()     // Catch:{ all -> 0x007d }
        L_0x007d:
            r11 = r0
            boolean r0 = r1.a((java.lang.String) r11)
            if (r0 != 0) goto L_0x00bb
            int[] r0 = r1.b((org.json.JSONArray) r8)     // Catch:{ IllegalArgumentException -> 0x0089, all -> 0x0092 }
            goto L_0x0093
        L_0x0089:
            r0 = move-exception
            r12 = r0
            com.apm.insight.c r0 = com.apm.insight.b.a()
            r0.a((java.lang.String) r13, (java.lang.Throwable) r12)
        L_0x0092:
            r0 = 0
        L_0x0093:
            if (r0 != 0) goto L_0x0096
            goto L_0x00bb
        L_0x0096:
            r12 = r0[r4]
            r13 = r7[r4]
            if (r12 <= r13) goto L_0x00a2
            r12 = r0[r4]
            r7[r4] = r12
            r1.l = r11
        L_0x00a2:
            r12 = r0[r3]
            r13 = r7[r3]
            if (r12 <= r13) goto L_0x00ae
            r12 = r0[r3]
            r7[r3] = r12
            r1.m = r11
        L_0x00ae:
            r3 = 2
            r12 = r0[r3]
            r13 = r7[r3]
            if (r12 <= r13) goto L_0x00bb
            r0 = r0[r3]
            r7[r3] = r0
            r1.n = r11
        L_0x00bb:
            int r0 = r8.length()
            if (r0 <= 0) goto L_0x00c7
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r8 = r0
        L_0x00c7:
            r0 = 0
            goto L_0x01b3
        L_0x00ca:
            if (r10 == 0) goto L_0x0197
            if (r10 == r3) goto L_0x00d0
            goto L_0x01b3
        L_0x00d0:
            java.lang.String r12 = " prio="
            boolean r12 = r11.contains(r12)
            if (r12 == 0) goto L_0x0190
            int r12 = r8.length()
            if (r12 <= 0) goto L_0x014c
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x014c
            org.json.JSONObject r12 = r1.j
            if (r12 != 0) goto L_0x00f5
            boolean r12 = r15.equals(r0)
            if (r12 == 0) goto L_0x00f5
            org.json.JSONObject r12 = r1.c((org.json.JSONArray) r8)
            r1.j = r12
            goto L_0x00fc
        L_0x00f5:
            org.json.JSONObject r12 = r1.a((java.lang.String) r0, (org.json.JSONArray) r8)
            r5.put(r12)
        L_0x00fc:
            boolean r12 = r15.equals(r0)     // Catch:{ all -> 0x010e }
            if (r12 != 0) goto L_0x010e
            int r12 = r0.indexOf(r14)     // Catch:{ all -> 0x010e }
            java.lang.String r12 = r0.substring(r4, r12)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = r12.trim()     // Catch:{ all -> 0x010e }
        L_0x010e:
            r12 = r0
            boolean r0 = r1.a((java.lang.String) r12)
            if (r0 != 0) goto L_0x014c
            int[] r0 = r1.b((org.json.JSONArray) r8)     // Catch:{ IllegalArgumentException -> 0x011a, all -> 0x0123 }
            goto L_0x0124
        L_0x011a:
            r0 = move-exception
            r14 = r0
            com.apm.insight.c r0 = com.apm.insight.b.a()
            r0.a((java.lang.String) r13, (java.lang.Throwable) r14)
        L_0x0123:
            r0 = 0
        L_0x0124:
            if (r0 != 0) goto L_0x0127
            goto L_0x014c
        L_0x0127:
            r13 = r0[r4]
            r14 = r7[r4]
            if (r13 <= r14) goto L_0x0133
            r13 = r0[r4]
            r7[r4] = r13
            r1.l = r12
        L_0x0133:
            r13 = r0[r3]
            r14 = r7[r3]
            if (r13 <= r14) goto L_0x013f
            r13 = r0[r3]
            r7[r3] = r13
            r1.m = r12
        L_0x013f:
            r13 = 2
            r14 = r0[r13]
            r4 = r7[r13]
            if (r14 <= r4) goto L_0x014c
            r0 = r0[r13]
            r7[r13] = r0
            r1.n = r12
        L_0x014c:
            r0 = 34
            int r4 = r11.indexOf(r0, r3)
            java.lang.String r4 = r11.substring(r3, r4)
            boolean r12 = r15.equals(r4)
            if (r12 != 0) goto L_0x0180
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            java.lang.String r4 = "  ("
            r12.append(r4)
            r4 = 2
            int r0 = r11.indexOf(r0, r4)
            int r0 = r0 + r3
            java.lang.String r0 = r11.substring(r0)
            r12.append(r0)
            java.lang.String r0 = " )"
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            goto L_0x0181
        L_0x0180:
            r0 = r4
        L_0x0181:
            int r3 = r8.length()
            if (r3 <= 0) goto L_0x018c
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
        L_0x018c:
            r8.put(r11)
            goto L_0x01b3
        L_0x0190:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x018c
            goto L_0x01b0
        L_0x0197:
            java.lang.String r4 = "DALVIK THREADS"
            boolean r4 = r11.startsWith(r4)
            if (r4 != 0) goto L_0x01af
            java.lang.String r4 = "suspend"
            boolean r4 = r11.startsWith(r4)
            if (r4 != 0) goto L_0x01af
            java.lang.String r4 = "\""
            boolean r4 = r11.startsWith(r4)
            if (r4 == 0) goto L_0x01b0
        L_0x01af:
            r10 = 1
        L_0x01b0:
            r6.put(r11)
        L_0x01b3:
            int r9 = r9 + 1
            r3 = 0
            r4 = 0
            goto L_0x0030
        L_0x01b9:
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x01dd
            r1.p = r6
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01d9 }
            r0.<init>()     // Catch:{ JSONException -> 0x01d9 }
            r1.q = r0     // Catch:{ JSONException -> 0x01d9 }
            java.lang.String r2 = "thread_all_count"
            int r3 = r5.length()     // Catch:{ JSONException -> 0x01d9 }
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x01d9 }
            org.json.JSONObject r0 = r1.q     // Catch:{ JSONException -> 0x01d9 }
            java.lang.String r2 = "thread_stacks"
            r0.put(r2, r5)     // Catch:{ JSONException -> 0x01d9 }
            goto L_0x01dd
        L_0x01d9:
            r0 = move-exception
            r0.printStackTrace()
        L_0x01dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(org.json.JSONArray):void");
    }

    private boolean a(long j2) {
        if (this.y) {
            this.y = false;
            b(j2);
        }
        return false;
    }

    private boolean a(String str) {
        if (this.D == null) {
            JSONArray c2 = a.c();
            if (c2 != null) {
                this.D = new LinkedList();
                this.o = c2.optString(0);
                for (int i2 = 1; i2 < c2.length(); i2++) {
                    try {
                        this.D.add(Pattern.compile(c2.optString(i2)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.D == null) {
                LinkedList linkedList = new LinkedList();
                this.D = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.D.add(Pattern.compile("^default_npth_thread$"));
                this.D.add(Pattern.compile("^RenderThread$"));
                this.D.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        for (Pattern matcher : this.D) {
            if (matcher.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private static String b(float f2) {
        return a(f2 / 100.0f);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:2|3|(1:5)(1:6)|7|8|9|(3:11|12|13)|17|(1:20)|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00db, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        com.apm.insight.b.a().a("NPTH_CATCH", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ee, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ef, code lost:
        com.apm.insight.b.a().a("NPTH_CATCH", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x005f */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0063 A[Catch:{ IOException -> 0x00e3, all -> 0x00db, all -> 0x00ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e7 A[Catch:{ IOException -> 0x00e3, all -> 0x00db, all -> 0x00ee }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(long r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            long r4 = r1.A
            long r6 = r1.z
            java.lang.String r0 = "anr_trace"
            java.lang.String r8 = "\n"
            java.lang.String r9 = ".txt"
            r10 = 95
            r11 = 58
            r12 = 21
            r13 = 0
            r14 = 1
            java.lang.String r15 = "NPTH_CATCH"
            int r16 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r16 == 0) goto L_0x00fb
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005f }
            r1.s = r4     // Catch:{ all -> 0x005f }
            com.apm.insight.b.h r4 = com.apm.insight.b.g.b()     // Catch:{ all -> 0x005f }
            org.json.JSONArray r4 = r4.c()     // Catch:{ all -> 0x005f }
            r1.u = r4     // Catch:{ all -> 0x005f }
            r4 = 100
            org.json.JSONArray r4 = com.apm.insight.b.k.a((int) r4, (long) r2)     // Catch:{ all -> 0x005f }
            r1.t = r4     // Catch:{ all -> 0x005f }
            com.apm.insight.b.h r4 = com.apm.insight.b.g.b()     // Catch:{ all -> 0x005f }
            com.apm.insight.b.h$e r2 = r4.a((long) r2)     // Catch:{ all -> 0x005f }
            org.json.JSONObject r2 = r2.a()     // Catch:{ all -> 0x005f }
            r1.k = r2     // Catch:{ all -> 0x005f }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x005f }
            r2.<init>()     // Catch:{ all -> 0x005f }
            r1.v = r2     // Catch:{ all -> 0x005f }
            android.content.Context r3 = r1.f10448d     // Catch:{ all -> 0x005f }
            com.apm.insight.l.a.a((android.content.Context) r3, (org.json.JSONObject) r2)     // Catch:{ all -> 0x005f }
            boolean r2 = r17.g()     // Catch:{ all -> 0x005f }
            r1.w = r2     // Catch:{ all -> 0x005f }
            boolean r2 = com.apm.insight.Npth.hasCrash()     // Catch:{ all -> 0x005f }
            if (r2 != 0) goto L_0x005c
            r2 = 1
            goto L_0x005d
        L_0x005c:
            r2 = 0
        L_0x005d:
            r1.i = r2     // Catch:{ all -> 0x005f }
        L_0x005f:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00ee }
            if (r2 < r12) goto L_0x00e3
            long r2 = r1.s     // Catch:{ all -> 0x00ee }
            r1.f10450g = r2     // Catch:{ all -> 0x00ee }
            java.lang.String r2 = com.apm.insight.l.o.b()     // Catch:{ all -> 0x00ee }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x00ee }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x00ee }
            android.content.Context r5 = r1.f10448d     // Catch:{ all -> 0x00ee }
            java.io.File r5 = com.apm.insight.l.o.f((android.content.Context) r5)     // Catch:{ all -> 0x00ee }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x00ee }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r5.<init>()     // Catch:{ all -> 0x00ee }
            java.lang.String r6 = "trace_"
            r5.append(r6)     // Catch:{ all -> 0x00ee }
            android.content.Context r6 = r1.f10448d     // Catch:{ all -> 0x00ee }
            java.lang.String r6 = com.apm.insight.l.a.c(r6)     // Catch:{ all -> 0x00ee }
            java.lang.String r6 = r6.replace(r11, r10)     // Catch:{ all -> 0x00ee }
            r5.append(r6)     // Catch:{ all -> 0x00ee }
            r5.append(r9)     // Catch:{ all -> 0x00ee }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00ee }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ee }
            java.io.File r4 = r3.getParentFile()     // Catch:{ all -> 0x00ee }
            r4.mkdirs()     // Catch:{ all -> 0x00ee }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r4.<init>()     // Catch:{ all -> 0x00ee }
            java.text.DateFormat r5 = com.apm.insight.l.b.a()     // Catch:{ all -> 0x00ee }
            java.util.Date r6 = new java.util.Date     // Catch:{ all -> 0x00ee }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ee }
            r6.<init>(r9)     // Catch:{ all -> 0x00ee }
            java.lang.String r5 = r5.format(r6)     // Catch:{ all -> 0x00ee }
            r4.append(r5)     // Catch:{ all -> 0x00ee }
            r4.append(r8)     // Catch:{ all -> 0x00ee }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00ee }
            com.apm.insight.l.i.a((java.io.File) r3, (java.lang.String) r4, (boolean) r13)     // Catch:{ all -> 0x00ee }
            com.apm.insight.runtime.r.a((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x00ee }
            com.apm.insight.nativecrash.NativeImpl.i(r0)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x00e3, all -> 0x00db }
            org.json.JSONArray r0 = com.apm.insight.l.i.b((java.lang.String) r0)     // Catch:{ IOException -> 0x00e3, all -> 0x00db }
            r1.p = r0     // Catch:{ IOException -> 0x00e3, all -> 0x00db }
            r1.a((org.json.JSONArray) r0)     // Catch:{ IOException -> 0x00e3, all -> 0x00db }
            goto L_0x00e3
        L_0x00db:
            r0 = move-exception
            com.apm.insight.c r2 = com.apm.insight.b.a()     // Catch:{ all -> 0x00ee }
            r2.a((java.lang.String) r15, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00ee }
        L_0x00e3:
            org.json.JSONObject r0 = r1.j     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x00f6
            org.json.JSONObject r0 = com.apm.insight.b.d.a((boolean) r14)     // Catch:{ all -> 0x00ee }
            r1.j = r0     // Catch:{ all -> 0x00ee }
            goto L_0x00f6
        L_0x00ee:
            r0 = move-exception
            com.apm.insight.c r2 = com.apm.insight.b.a()
            r2.a((java.lang.String) r15, (java.lang.Throwable) r0)
        L_0x00f6:
            com.apm.insight.l.f.a()
            goto L_0x0192
        L_0x00fb:
            long r2 = r1.s     // Catch:{ all -> 0x018a }
            r1.f10450g = r2     // Catch:{ all -> 0x018a }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x018a }
            if (r2 < r12) goto L_0x017f
            java.lang.String r2 = com.apm.insight.l.o.b()     // Catch:{ all -> 0x018a }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x018a }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x018a }
            android.content.Context r5 = r1.f10448d     // Catch:{ all -> 0x018a }
            java.io.File r5 = com.apm.insight.l.o.f((android.content.Context) r5)     // Catch:{ all -> 0x018a }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x018a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x018a }
            r5.<init>()     // Catch:{ all -> 0x018a }
            java.lang.String r6 = "trace"
            r5.append(r6)     // Catch:{ all -> 0x018a }
            android.content.Context r6 = r1.f10448d     // Catch:{ all -> 0x018a }
            java.lang.String r6 = com.apm.insight.l.a.c(r6)     // Catch:{ all -> 0x018a }
            java.lang.String r6 = r6.replace(r11, r10)     // Catch:{ all -> 0x018a }
            r5.append(r6)     // Catch:{ all -> 0x018a }
            r5.append(r9)     // Catch:{ all -> 0x018a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x018a }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x018a }
            java.io.File r4 = r3.getParentFile()     // Catch:{ all -> 0x018a }
            r4.mkdirs()     // Catch:{ all -> 0x018a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x018a }
            r4.<init>()     // Catch:{ all -> 0x018a }
            java.text.DateFormat r5 = com.apm.insight.l.b.a()     // Catch:{ all -> 0x018a }
            java.util.Date r6 = new java.util.Date     // Catch:{ all -> 0x018a }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x018a }
            r6.<init>(r9)     // Catch:{ all -> 0x018a }
            java.lang.String r5 = r5.format(r6)     // Catch:{ all -> 0x018a }
            r4.append(r5)     // Catch:{ all -> 0x018a }
            r4.append(r8)     // Catch:{ all -> 0x018a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x018a }
            com.apm.insight.l.i.a((java.io.File) r3, (java.lang.String) r4, (boolean) r13)     // Catch:{ all -> 0x018a }
            com.apm.insight.runtime.r.a((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ all -> 0x018a }
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x018a }
            com.apm.insight.nativecrash.NativeImpl.i(r0)     // Catch:{ all -> 0x018a }
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x017f, all -> 0x0177 }
            org.json.JSONArray r0 = com.apm.insight.l.i.b((java.lang.String) r0)     // Catch:{ IOException -> 0x017f, all -> 0x0177 }
            r1.p = r0     // Catch:{ IOException -> 0x017f, all -> 0x0177 }
            r1.a((org.json.JSONArray) r0)     // Catch:{ IOException -> 0x017f, all -> 0x0177 }
            goto L_0x017f
        L_0x0177:
            r0 = move-exception
            com.apm.insight.c r2 = com.apm.insight.b.a()     // Catch:{ all -> 0x018a }
            r2.a((java.lang.String) r15, (java.lang.Throwable) r0)     // Catch:{ all -> 0x018a }
        L_0x017f:
            org.json.JSONObject r0 = r1.j     // Catch:{ all -> 0x018a }
            if (r0 != 0) goto L_0x0192
            org.json.JSONObject r0 = com.apm.insight.b.d.a((boolean) r14)     // Catch:{ all -> 0x018a }
            r1.j = r0     // Catch:{ all -> 0x018a }
            goto L_0x0192
        L_0x018a:
            r0 = move-exception
            com.apm.insight.c r2 = com.apm.insight.b.a()
            r2.a((java.lang.String) r15, (java.lang.Throwable) r0)
        L_0x0192:
            long r2 = r1.z
            r1.A = r2
            r4 = -1
            r1.z = r4
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x01a3
            r2 = 1
            long r4 = r4 - r2
            r1.A = r4
        L_0x01a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.b(long):void");
    }

    private static void b(String str) {
        for (ICrashCallback onCrash : o.a().e()) {
            try {
                onCrash.onCrash(CrashType.ANR, str, (Thread) null);
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
        }
    }

    private int[] b(JSONArray jSONArray) {
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            String optString = jSONArray.optString(i2);
            int indexOf = (optString == null || optString.isEmpty()) ? -1 : optString.indexOf("utm=");
            if (indexOf > 0) {
                if (this.f10446b == null) {
                    this.f10446b = Pattern.compile("[^0-9]+");
                }
                String[] split = this.f10446b.split(optString.substring(indexOf));
                if (split == null || split.length < 2) {
                    return null;
                }
                try {
                    int intValue = Integer.decode(split[1]).intValue();
                    int intValue2 = Integer.decode(split[2]).intValue();
                    return new int[]{intValue, intValue2, intValue + intValue2};
                } catch (Throwable unused) {
                    throw new IllegalArgumentException("Err stack line: " + optString);
                }
            } else {
                i2++;
            }
        }
        return null;
    }

    private String c(long j2) {
        long j3 = j2 - h.j();
        return j3 < 30000 ? "0 - 30s" : j3 < 60000 ? "30s - 1min" : j3 < 120000 ? "1min - 2min" : j3 < 300000 ? "2min - 5min" : j3 < TTAdConstant.AD_MAX_EVENT_TIME ? "5min - 10min" : j3 < 1800000 ? "10min - 30min" : j3 < 3600000 ? "30min - 1h" : "1h - ";
    }

    private JSONObject c(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray a2 = l.a(256, 128, jSONArray);
        if (a2.length() != jSONArray.length()) {
            this.r++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < a2.length(); i2++) {
                sb.append(a2.getString(i2));
                sb.append(10);
            }
            jSONObject.put("mainStackFromTrace", sb.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private boolean g() {
        boolean z2 = !com.apm.insight.l.a.a(this.f10448d);
        if (!z2 || com.apm.insight.runtime.a.b.d().e() > 2000) {
            return z2;
        }
        return false;
    }

    private File h() {
        if (this.E == null) {
            File filesDir = this.f10448d.getFilesDir();
            this.E = new File(filesDir, "has_anr_signal_" + com.apm.insight.l.a.c(this.f10448d).replaceAll(":", "_"));
        }
        return this.E;
    }

    private boolean i() {
        return a.i();
    }

    public void a() {
        if (!this.f10449e) {
            this.f10447c = new c(this);
            this.f10450g = h.j();
            this.f10449e = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x0444 */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03ed A[SYNTHETIC, Splitter:B:145:0x03ed] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0416 A[Catch:{ all -> 0x0493 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x046b A[Catch:{ all -> 0x0477 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r26, int r27) {
        /*
            r25 = this;
            r1 = r25
            boolean r0 = com.apm.insight.b.f.a()
            long r2 = android.os.SystemClock.uptimeMillis()
            boolean r4 = r1.a((long) r2)
            android.content.Context r5 = r1.f10448d
            r6 = 1
            java.lang.String r5 = com.apm.insight.b.d.a((android.content.Context) r5, (int) r6)
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = "normal"
            boolean r10 = android.text.TextUtils.isEmpty(r5)
            r11 = 0
            if (r10 == 0) goto L_0x0026
            if (r4 == 0) goto L_0x0026
            r10 = 1
            goto L_0x0027
        L_0x0026:
            r10 = 0
        L_0x0027:
            java.lang.String r12 = "unknown"
            java.lang.String r13 = "unknown"
            java.lang.String r14 = "unknown"
            r15 = 20000(0x4e20, double:9.8813E-320)
            if (r4 != 0) goto L_0x004a
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x0038
            goto L_0x004a
        L_0x0038:
            r6 = r14
            r4 = 0
            r11 = 0
            r15 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r14 = r13
            r13 = r12
            r12 = r9
            r9 = 0
            goto L_0x00c1
        L_0x004a:
            java.lang.Object r4 = r1.x
            monitor-enter(r4)
            if (r10 != 0) goto L_0x0051
            r7 = 1
            goto L_0x0052
        L_0x0051:
            r7 = 0
        L_0x0052:
            monitor-exit(r4)     // Catch:{ all -> 0x049e }
            org.json.JSONObject r4 = r1.j
            if (r4 == 0) goto L_0x006c
            long r12 = java.lang.System.currentTimeMillis()
            r8 = r7
            long r6 = r1.f10450g
            long r12 = r12 - r6
            int r4 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r4 > 0) goto L_0x006d
            if (r10 == 0) goto L_0x0068
            java.lang.String r4 = "trace_only"
            goto L_0x006a
        L_0x0068:
            java.lang.String r4 = "trace_last"
        L_0x006a:
            r9 = r4
            goto L_0x0078
        L_0x006c:
            r8 = r7
        L_0x006d:
            boolean r4 = r1.y
            if (r4 == 0) goto L_0x0075
            r1.y = r11
            java.lang.String r9 = "trace_after"
        L_0x0075:
            r1.b((long) r2)
        L_0x0078:
            org.json.JSONObject r4 = r1.j
            java.lang.String r12 = r1.l
            java.lang.String r13 = r1.m
            java.lang.String r14 = r1.n
            org.json.JSONArray r6 = r1.p
            org.json.JSONArray r7 = r1.u
            org.json.JSONArray r15 = r1.t
            org.json.JSONObject r11 = r1.v
            r19 = r4
            org.json.JSONObject r4 = r1.k
            r20 = r4
            boolean r4 = r1.w
            r21 = r6
            r22 = r7
            long r6 = r1.s
            r23 = r4
            if (r10 != 0) goto L_0x00b4
            r4 = 0
            r1.j = r4
            r1.p = r4
            r1.t = r4
            r1.k = r4
            r1.u = r4
            java.lang.String r4 = "unknown"
            r1.l = r4
            java.lang.String r4 = "unknown"
            r1.m = r4
            java.lang.String r4 = "unknown"
            r1.n = r4
            r4 = 0
            r1.r = r4
        L_0x00b4:
            r4 = r21
            r21 = r22
            r24 = r9
            r9 = r8
            r7 = r6
            r6 = r14
            r14 = r13
            r13 = r12
            r12 = r24
        L_0x00c1:
            if (r10 != 0) goto L_0x0121
            boolean r22 = android.text.TextUtils.isEmpty(r5)
            if (r22 == 0) goto L_0x0121
            org.json.JSONObject r0 = r1.j
            if (r0 == 0) goto L_0x00ff
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.f10450g
            long r2 = r2 - r4
            r4 = 20000(0x4e20, double:9.8813E-320)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ff
            r2 = 0
            r1.j = r2
            r1.p = r2
            r1.t = r2
            r1.k = r2
            r1.u = r2
            java.lang.String r0 = "unknown"
            r1.l = r0
            java.lang.String r0 = "unknown"
            r1.m = r0
            java.lang.String r0 = "unknown"
            r1.n = r0
            r2 = 0
            r1.r = r2
            java.io.File r0 = r1.f10451h
            if (r0 == 0) goto L_0x00fb
            com.apm.insight.l.i.a((java.io.File) r0)
        L_0x00fb:
            r3 = 0
            r1.f10451h = r3
            return r2
        L_0x00ff:
            org.json.JSONObject r0 = r1.j
            if (r0 == 0) goto L_0x011f
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.f10450g
            long r2 = r2 - r4
            r4 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x011f
            boolean r0 = com.apm.insight.nativecrash.NativeImpl.g()
            if (r0 == 0) goto L_0x011d
            java.io.File r0 = r25.h()
            com.apm.insight.l.i.a((java.io.File) r0)
        L_0x011d:
            r2 = 0
            return r2
        L_0x011f:
            r2 = 0
            return r2
        L_0x0121:
            if (r19 != 0) goto L_0x016a
            if (r15 != 0) goto L_0x0157
            com.apm.insight.b.h r17 = com.apm.insight.b.g.b()     // Catch:{ all -> 0x0152 }
            org.json.JSONArray r17 = r17.c()     // Catch:{ all -> 0x0152 }
            r18 = r11
            r11 = 100
            org.json.JSONArray r15 = com.apm.insight.b.k.a((int) r11, (long) r2)     // Catch:{ all -> 0x014f }
            com.apm.insight.b.h r11 = com.apm.insight.b.g.b()     // Catch:{ all -> 0x014f }
            com.apm.insight.b.h$e r2 = r11.a((long) r2)     // Catch:{ all -> 0x014f }
            org.json.JSONObject r20 = r2.a()     // Catch:{ all -> 0x014f }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x014f }
            r2.<init>()     // Catch:{ all -> 0x014f }
            android.content.Context r3 = r1.f10448d     // Catch:{ all -> 0x014d }
            com.apm.insight.l.a.a((android.content.Context) r3, (org.json.JSONObject) r2)     // Catch:{ all -> 0x014d }
            r11 = r2
            goto L_0x015b
        L_0x014d:
            r11 = r2
            goto L_0x0161
        L_0x014f:
            r11 = r18
            goto L_0x0161
        L_0x0152:
            r18 = r11
            r17 = r21
            goto L_0x0161
        L_0x0157:
            r18 = r11
            r17 = r21
        L_0x015b:
            boolean r2 = f10444a     // Catch:{ all -> 0x0161 }
            org.json.JSONObject r19 = com.apm.insight.b.d.a((boolean) r2)     // Catch:{ all -> 0x0161 }
        L_0x0161:
            r2 = r17
            r3 = r19
            r17 = r9
            r9 = r20
            goto L_0x0174
        L_0x016a:
            r18 = r11
            r17 = r9
            r3 = r19
            r9 = r20
            r2 = r21
        L_0x0174:
            if (r3 == 0) goto L_0x049d
            int r18 = r3.length()
            if (r18 <= 0) goto L_0x049d
            r18 = r5
            java.lang.String r5 = "pid"
            r19 = r0
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x0493 }
            r3.put(r5, r0)     // Catch:{ all -> 0x0493 }
            java.lang.String r0 = "package"
            android.content.Context r5 = r1.f10448d     // Catch:{ all -> 0x0493 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x0493 }
            r3.put(r0, r5)     // Catch:{ all -> 0x0493 }
            java.lang.String r0 = "is_remote_process"
            r5 = 0
            r3.put(r0, r5)     // Catch:{ all -> 0x0493 }
            java.lang.String r0 = "is_new_stack"
            r5 = 10
            r3.put(r0, r5)     // Catch:{ all -> 0x0493 }
            com.apm.insight.entity.a r0 = new com.apm.insight.entity.a     // Catch:{ all -> 0x0493 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0493 }
            r5.<init>()     // Catch:{ all -> 0x0493 }
            r0.<init>(r5)     // Catch:{ all -> 0x0493 }
            java.lang.String r5 = "data"
            r20 = r6
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x0493 }
            r0.a((java.lang.String) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x0493 }
            java.lang.String r5 = "is_anr"
            r26 = r3
            r6 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0493 }
            r0.a((java.lang.String) r5, (java.lang.Object) r3)     // Catch:{ all -> 0x0493 }
            java.lang.String r3 = "anrType"
            r0.a((java.lang.String) r3, (java.lang.Object) r12)     // Catch:{ all -> 0x0493 }
            java.lang.String r3 = "history_message"
            r0.a((java.lang.String) r3, (java.lang.Object) r2)     // Catch:{ all -> 0x0493 }
            java.lang.String r2 = "current_message"
            r0.a((java.lang.String) r2, (java.lang.Object) r9)     // Catch:{ all -> 0x0493 }
            java.lang.String r2 = "pending_messages"
            r0.a((java.lang.String) r2, (java.lang.Object) r15)     // Catch:{ all -> 0x0493 }
            java.lang.String r2 = "anr_time"
            long r21 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0493 }
            java.lang.Long r3 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0493 }
            r0.a((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0493 }
            java.lang.String r2 = "crash_time"
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0493 }
            r0.a((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0493 }
            com.apm.insight.c.b.b()     // Catch:{ all -> 0x0493 }
            r0.c((org.json.JSONObject) r11)     // Catch:{ all -> 0x0493 }
            java.lang.String r2 = "anr_info"
            if (r10 == 0) goto L_0x01f9
            java.lang.String r3 = "没有抓到ANR_INFO, 原因可能是:\n1. 用户以极快的手速在ANR弹窗出现时点击了关闭应用.\n2. 用户难以忍受卡顿而强行关闭了应用.\n3. 某无良系统在ANR时不给任何通知直接强杀应用进程组.\n\n该ANR只会在以下情况上报:\n1. 收到ANR信号(SIGQUIT).\n2. 应用处于前台或2秒前在前台.\n3. 主进程发生.\n4. 进程确实被杀."
            goto L_0x01fb
        L_0x01f9:
            r3 = r18
        L_0x01fb:
            r0.a((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0493 }
            if (r4 == 0) goto L_0x0205
            java.lang.String r2 = "dump_trace"
            r0.a((java.lang.String) r2, (java.lang.Object) r4)     // Catch:{ all -> 0x0493 }
        L_0x0205:
            java.lang.String r2 = "all_thread_stacks"
            if (r10 != 0) goto L_0x021b
            org.json.JSONObject r3 = r1.q     // Catch:{ all -> 0x0493 }
            if (r3 == 0) goto L_0x0215
            org.json.JSONObject r3 = r1.q     // Catch:{ all -> 0x0493 }
            int r3 = r3.length()     // Catch:{ all -> 0x0493 }
            if (r3 != 0) goto L_0x021b
        L_0x0215:
            r3 = 0
            org.json.JSONObject r4 = com.apm.insight.l.v.b((java.lang.String) r3)     // Catch:{ all -> 0x0493 }
            goto L_0x021d
        L_0x021b:
            org.json.JSONObject r4 = r1.q     // Catch:{ all -> 0x0493 }
        L_0x021d:
            r0.a((java.lang.String) r2, (java.lang.Object) r4)     // Catch:{ all -> 0x0493 }
            com.apm.insight.runtime.a.f r2 = com.apm.insight.runtime.a.f.a()     // Catch:{ all -> 0x0493 }
            com.apm.insight.CrashType r3 = com.apm.insight.CrashType.ANR     // Catch:{ all -> 0x0493 }
            com.apm.insight.entity.a r2 = r2.a((com.apm.insight.CrashType) r3, (com.apm.insight.entity.a) r0)     // Catch:{ all -> 0x0493 }
            java.lang.String r0 = "is_background"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r23)     // Catch:{ all -> 0x0493 }
            r2.a((java.lang.String) r0, (java.lang.Object) r3)     // Catch:{ all -> 0x0493 }
            java.lang.String r0 = "logcat"
            java.lang.String r3 = com.apm.insight.h.f()     // Catch:{ all -> 0x0493 }
            org.json.JSONArray r3 = com.apm.insight.runtime.k.b(r3)     // Catch:{ all -> 0x0493 }
            r2.a((java.lang.String) r0, (java.lang.Object) r3)     // Catch:{ all -> 0x0493 }
            java.lang.String r0 = "has_dump"
            java.lang.String r3 = "true"
            r2.a((java.lang.String) r0, (java.lang.Object) r3)     // Catch:{ all -> 0x0493 }
            java.lang.String r0 = "crash_uuid"
            com.apm.insight.CrashType r3 = com.apm.insight.CrashType.ANR     // Catch:{ all -> 0x0493 }
            r4 = 0
            java.lang.String r3 = com.apm.insight.h.a(r7, r3, r4, r4)     // Catch:{ all -> 0x0493 }
            r2.a((java.lang.String) r0, (java.lang.Object) r3)     // Catch:{ all -> 0x0493 }
            java.lang.String r0 = "jiffy"
            long r3 = com.apm.insight.runtime.q.a.a()     // Catch:{ all -> 0x0493 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0493 }
            r2.a((java.lang.String) r0, (java.lang.Object) r3)     // Catch:{ all -> 0x0493 }
            org.json.JSONObject r0 = r2.h()     // Catch:{ all -> 0x0493 }
            java.lang.String r3 = "filters"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ all -> 0x0493 }
            org.json.JSONObject r3 = r2.h()     // Catch:{ all -> 0x0493 }
            com.apm.insight.entity.d.b(r3)     // Catch:{ all -> 0x0493 }
            if (r0 != 0) goto L_0x0283
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x027f }
            r3.<init>()     // Catch:{ all -> 0x027f }
            java.lang.String r0 = "filters"
            r2.a((java.lang.String) r0, (java.lang.Object) r3)     // Catch:{ all -> 0x027e }
            goto L_0x0284
        L_0x027e:
            r0 = r3
        L_0x027f:
            r4 = r18
            goto L_0x03ea
        L_0x0283:
            r3 = r0
        L_0x0284:
            java.lang.String r0 = "anrType"
            r3.put(r0, r12)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "max_utm_thread"
            r3.put(r0, r13)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "max_stm_thread"
            r3.put(r0, r14)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "max_utm_stm_thread"
            r14 = r20
            r3.put(r0, r14)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "max_utm_thread_version"
            java.lang.String r4 = r1.o     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "crash_length"
            java.lang.String r4 = r1.c((long) r7)     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "disable_looper_monitor"
            boolean r4 = com.apm.insight.runtime.a.d()     // Catch:{ all -> 0x03e7 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "npth_force_apm_crash"
            boolean r4 = com.apm.insight.c.b.b()     // Catch:{ all -> 0x03e7 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "sdk_version"
            java.lang.String r4 = "1.3.8.nourl-alpha.0"
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "has_logcat"
            boolean r4 = r2.a()     // Catch:{ all -> 0x03e7 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "memory_leak"
            boolean r4 = r2.f()     // Catch:{ all -> 0x03e7 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "fd_leak"
            boolean r4 = r2.d()     // Catch:{ all -> 0x03e7 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "threads_leak"
            boolean r4 = r2.e()     // Catch:{ all -> 0x03e7 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "is_64_devices"
            boolean r4 = com.apm.insight.entity.Header.a()     // Catch:{ all -> 0x03e7 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "is_64_runtime"
            boolean r4 = com.apm.insight.nativecrash.NativeImpl.e()     // Catch:{ all -> 0x03e7 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "is_x86_devices"
            boolean r4 = com.apm.insight.entity.Header.b()     // Catch:{ all -> 0x03e7 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "has_meminfo_file"
            boolean r4 = r2.g()     // Catch:{ all -> 0x03e7 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "is_root"
            boolean r4 = com.apm.insight.nativecrash.b.m()     // Catch:{ all -> 0x03e7 }
            if (r4 == 0) goto L_0x033e
            java.lang.String r4 = "true"
            goto L_0x0340
        L_0x033e:
            java.lang.String r4 = "false"
        L_0x0340:
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "anr_normal_trace"
            boolean r4 = r1.y     // Catch:{ all -> 0x03e7 }
            if (r4 != 0) goto L_0x034a
            goto L_0x034b
        L_0x034a:
            r6 = 0
        L_0x034b:
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "anr_no_run"
            java.lang.String r4 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "crash_after_crash"
            boolean r4 = com.apm.insight.Npth.hasCrash()     // Catch:{ all -> 0x03e7 }
            if (r4 == 0) goto L_0x0366
            java.lang.String r4 = "true"
            goto L_0x0368
        L_0x0366:
            java.lang.String r4 = "false"
        L_0x0368:
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "from_file"
            boolean r4 = com.apm.insight.b.d.a()     // Catch:{ all -> 0x03e7 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "has_dump"
            java.lang.String r4 = "true"
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "from_kill"
            java.lang.String r4 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "last_resume_activity"
            com.apm.insight.runtime.a.b r4 = com.apm.insight.runtime.a.b.d()     // Catch:{ all -> 0x03e7 }
            java.lang.String r4 = r4.h()     // Catch:{ all -> 0x03e7 }
            r3.put(r0, r4)     // Catch:{ all -> 0x03e7 }
            int r0 = r1.r     // Catch:{ all -> 0x03e7 }
            if (r0 <= 0) goto L_0x03a4
            java.lang.String r0 = "may_have_stack_overflow"
            int r4 = r1.r     // Catch:{ all -> 0x027e }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x027e }
            r3.put(r0, r4)     // Catch:{ all -> 0x027e }
        L_0x03a4:
            if (r10 != 0) goto L_0x03b8
            r4 = r18
            r1.a((java.lang.String) r4, (org.json.JSONObject) r3)     // Catch:{ all -> 0x03ac }
            goto L_0x03eb
        L_0x03ac:
            r0 = move-exception
            r5 = r0
            com.apm.insight.c r0 = com.apm.insight.b.a()     // Catch:{ all -> 0x03e9 }
            java.lang.String r6 = "NPTH_CATCH"
            r0.a((java.lang.String) r6, (java.lang.Throwable) r5)     // Catch:{ all -> 0x03e9 }
            goto L_0x03eb
        L_0x03b8:
            r4 = r18
            boolean r0 = r25.i()     // Catch:{ all -> 0x03e9 }
            if (r0 != 0) goto L_0x03eb
            java.lang.String r0 = "aid"
            com.apm.insight.entity.Header r5 = r2.i()     // Catch:{ all -> 0x03e9 }
            org.json.JSONObject r5 = r5.f()     // Catch:{ all -> 0x03e9 }
            java.lang.String r6 = "aid"
            java.lang.Object r5 = r5.opt(r6)     // Catch:{ all -> 0x03e9 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x03e9 }
            r3.put(r0, r5)     // Catch:{ all -> 0x03e9 }
            com.apm.insight.entity.Header r0 = r2.i()     // Catch:{ all -> 0x03e9 }
            org.json.JSONObject r0 = r0.f()     // Catch:{ all -> 0x03e9 }
            java.lang.String r5 = "aid"
            r6 = 2010(0x7da, float:2.817E-42)
            r0.put(r5, r6)     // Catch:{ all -> 0x03e9 }
            goto L_0x03eb
        L_0x03e7:
            r4 = r18
        L_0x03e9:
            r0 = r3
        L_0x03ea:
            r3 = r0
        L_0x03eb:
            if (r10 == 0) goto L_0x0416
            java.lang.String r0 = com.apm.insight.k.e.c()     // Catch:{ all -> 0x0493 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0493 }
            android.content.Context r4 = r1.f10448d     // Catch:{ all -> 0x0493 }
            java.io.File r4 = com.apm.insight.l.o.a((android.content.Context) r4)     // Catch:{ all -> 0x0493 }
            com.apm.insight.CrashType r5 = com.apm.insight.CrashType.ANR     // Catch:{ all -> 0x0493 }
            r6 = 0
            java.lang.String r5 = com.apm.insight.h.a(r7, r5, r6, r6)     // Catch:{ all -> 0x0493 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0493 }
            r1.f10451h = r3     // Catch:{ all -> 0x0493 }
            java.lang.String r4 = r3.getName()     // Catch:{ all -> 0x0493 }
            org.json.JSONObject r2 = r2.h()     // Catch:{ all -> 0x0493 }
            boolean r5 = com.apm.insight.k.e.b()     // Catch:{ all -> 0x0493 }
            com.apm.insight.l.i.a(r3, r4, r0, r2, r5)     // Catch:{ all -> 0x0493 }
            goto L_0x049d
        L_0x0416:
            java.io.File r0 = r1.f10451h     // Catch:{ all -> 0x0493 }
            if (r0 == 0) goto L_0x0422
            java.io.File r0 = r1.f10451h     // Catch:{ all -> 0x0493 }
            com.apm.insight.l.i.a((java.io.File) r0)     // Catch:{ all -> 0x0493 }
            r5 = 0
            r1.f10451h = r5     // Catch:{ all -> 0x0493 }
        L_0x0422:
            com.apm.insight.a.a r0 = com.apm.insight.a.a.a()     // Catch:{ all -> 0x0493 }
            com.apm.insight.CrashType r5 = com.apm.insight.CrashType.ANR     // Catch:{ all -> 0x0493 }
            java.lang.String r6 = com.apm.insight.h.e()     // Catch:{ all -> 0x0493 }
            r0.a((com.apm.insight.CrashType) r5, (long) r7, (java.lang.String) r6)     // Catch:{ all -> 0x0493 }
            java.io.File r0 = com.apm.insight.l.f.f()     // Catch:{ all -> 0x0444 }
            long r5 = r0.length()     // Catch:{ all -> 0x0444 }
            r9 = 1024(0x400, double:5.06E-321)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0444
            java.lang.String r0 = "has_system_traces"
            java.lang.String r5 = "true"
            r2.a((java.lang.String) r0, (java.lang.String) r5)     // Catch:{ all -> 0x0444 }
        L_0x0444:
            java.lang.String r0 = com.apm.insight.h.f()     // Catch:{ all -> 0x0477 }
            java.io.File r0 = com.apm.insight.l.o.e((java.lang.String) r0)     // Catch:{ all -> 0x0477 }
            java.lang.String r5 = com.apm.insight.h.f()     // Catch:{ all -> 0x0477 }
            java.io.File r5 = com.apm.insight.l.o.f((java.lang.String) r5)     // Catch:{ all -> 0x0477 }
            org.json.JSONArray r0 = com.apm.insight.nativecrash.c.a(r0, r5)     // Catch:{ all -> 0x0477 }
            java.lang.String r5 = "leak_threads_count"
            int r6 = r0.length()     // Catch:{ all -> 0x0477 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0477 }
            r3.put(r5, r6)     // Catch:{ all -> 0x0477 }
            int r3 = r0.length()     // Catch:{ all -> 0x0477 }
            if (r3 <= 0) goto L_0x0477
            java.lang.String r3 = com.apm.insight.h.f()     // Catch:{ all -> 0x0477 }
            java.io.File r3 = com.apm.insight.l.o.g((java.lang.String) r3)     // Catch:{ all -> 0x0477 }
            r5 = 0
            com.apm.insight.l.i.a((java.io.File) r3, (org.json.JSONArray) r0, (boolean) r5)     // Catch:{ all -> 0x0477 }
        L_0x0477:
            java.lang.String r0 = "mainStackFromTrace"
            r3 = r26
            java.lang.String r0 = r3.optString(r0)     // Catch:{ all -> 0x0493 }
            org.json.JSONArray r0 = com.apm.insight.entity.b.a((java.lang.String) r0)     // Catch:{ all -> 0x0493 }
            org.json.JSONObject r2 = r2.h()     // Catch:{ all -> 0x0493 }
            com.apm.insight.b.b$2 r3 = new com.apm.insight.b.b$2     // Catch:{ all -> 0x0493 }
            r3.<init>(r7)     // Catch:{ all -> 0x0493 }
            com.apm.insight.entity.b.a((org.json.JSONObject) r2, (org.json.JSONArray) r0, (com.apm.insight.entity.b.a) r3)     // Catch:{ all -> 0x0493 }
            b((java.lang.String) r4)     // Catch:{ all -> 0x0493 }
            goto L_0x049d
        L_0x0493:
            r0 = move-exception
            com.apm.insight.c r2 = com.apm.insight.b.a()
            java.lang.String r3 = "NPTH_CATCH"
            r2.a((java.lang.String) r3, (java.lang.Throwable) r0)
        L_0x049d:
            return r17
        L_0x049e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x049e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(int, int):boolean");
    }

    public void b() {
        if (this.f10449e) {
            this.f10449e = false;
            c cVar = this.f10447c;
            if (cVar != null) {
                cVar.b();
            }
            this.f10447c = null;
        }
    }

    public void c() {
        c cVar = this.f10447c;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void d() {
        if (!f10445f) {
            synchronized (this.x) {
                if (!f10445f) {
                    this.B.run();
                }
            }
        }
    }

    public void e() {
        if (NativeImpl.g()) {
            try {
                i.a(h(), String.valueOf(this.C + 1), false);
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
        }
        this.z = SystemClock.uptimeMillis();
        this.y = true;
    }

    public void f() {
        File h2 = h();
        try {
            int intValue = Integer.decode(i.c(h2.getAbsolutePath())).intValue();
            this.C = intValue;
            if (intValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            i.a(h2);
        }
    }
}
