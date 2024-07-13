package com.bytedance.sdk.openadsdk.b;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.j;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.h.c.c;
import com.bytedance.sdk.openadsdk.multipro.a.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.LinkedList;
import java.util.List;

/* compiled from: StatsEventRepertoryImpl */
public class s implements f<c.a> {

    /* renamed from: a  reason: collision with root package name */
    protected final com.bytedance.sdk.openadsdk.core.c f360a = com.bytedance.sdk.openadsdk.core.c.a(e());

    /* renamed from: b  reason: collision with root package name */
    private final Context f361b;

    public String c() {
        return "logstats";
    }

    public s(Context context) {
        this.f361b = context;
    }

    public Context e() {
        Context context = this.f361b;
        return context == null ? m.a() : context;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0041 */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0047 A[Catch:{ all -> 0x0075 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.bytedance.sdk.openadsdk.h.c.c.a> a(int r11, java.lang.String r12) {
        /*
            r10 = this;
            if (r11 <= 0) goto L_0x001d
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x001d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r12 = " DESC limit "
            r0.append(r12)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            goto L_0x001e
        L_0x001d:
            r11 = 0
        L_0x001e:
            r7 = r11
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            com.bytedance.sdk.openadsdk.multipro.aidl.c r12 = new com.bytedance.sdk.openadsdk.multipro.aidl.c
            android.content.Context r0 = r10.e()
            java.lang.String r1 = r10.c()
            java.lang.String r8 = "id"
            java.lang.String r9 = "value"
            java.lang.String[] r2 = new java.lang.String[]{r8, r9}
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.util.Map r0 = com.bytedance.sdk.openadsdk.multipro.a.a.a(r0, r1, r2, r3, r4, r5, r6, r7)
            r12.<init>(r0)
        L_0x0041:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0071
            int r0 = r12.getColumnIndex(r8)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r12.getString(r0)     // Catch:{ all -> 0x0075 }
            int r1 = r12.getColumnIndex(r9)     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = r12.getString(r1)     // Catch:{ all -> 0x0075 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0075 }
            if (r2 != 0) goto L_0x0041
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0075 }
            if (r2 != 0) goto L_0x0041
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0041 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0041 }
            com.bytedance.sdk.openadsdk.h.c.c$a r1 = new com.bytedance.sdk.openadsdk.h.c.c$a     // Catch:{ Exception -> 0x0041 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0041 }
            r11.add(r1)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0041
        L_0x0071:
            r12.close()
            return r11
        L_0x0075:
            r11 = move-exception
            r12.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.b.s.a(int, java.lang.String):java.util.List");
    }

    public synchronized void a(c.a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(OSOutcomeConstants.OUTCOME_ID, aVar.f1990a);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, aVar.f1991b.toString());
        contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry", 0);
        a.a(e(), c(), contentValues);
    }

    public synchronized void a(List<c.a> list) {
        if (!j.a(list)) {
            LinkedList linkedList = new LinkedList();
            for (c.a aVar : list) {
                linkedList.add(aVar.f1990a);
            }
            a.a(e(), "DELETE FROM " + c() + " WHERE " + a(OSOutcomeConstants.OUTCOME_ID, linkedList, 1000, true));
        }
    }

    public synchronized void a(int i, long j) {
        b(i, j);
    }

    private synchronized void b(int i, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        Context e2 = e();
        String c2 = c();
        a.a(e2, c2, "gen_time <? AND retry >?", new String[]{currentTimeMillis + "", i + ""});
    }

    public synchronized void a(List<c.a> list, int i, long j) {
        if (!j.a(list)) {
            try {
                b(list);
                b(i, j);
            } catch (Exception unused) {
            }
        }
    }

    private synchronized void b(List<c.a> list) {
        LinkedList linkedList = new LinkedList();
        for (c.a aVar : list) {
            linkedList.add(aVar.f1990a);
        }
        a.a(e(), "UPDATE " + c() + " SET " + "retry" + " = " + "retry" + "+1" + " WHERE " + a(OSOutcomeConstants.OUTCOME_ID, linkedList, 1000, true));
    }

    public void a(boolean z) {
        this.f360a.a("stats_serverbusy_flag", z);
    }

    public boolean a() {
        return this.f360a.b("stats_serverbusy_flag", false);
    }

    public int b() {
        return this.f360a.b("stats_serverbusy_retrycount", 0);
    }

    public void a(int i) {
        this.f360a.a("stats_serverbusy_retrycount", i);
    }

    public static String f() {
        return "CREATE TABLE IF NOT EXISTS " + "logstats" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + OSOutcomeConstants.OUTCOME_ID + " TEXT UNIQUE," + AppMeasurementSdk.ConditionalUserProperty.VALUE + " TEXT ," + "gen_time" + " TEXT , " + "retry" + " INTEGER default 0" + ")";
    }

    private static String a(String str, List<?> list, int i, boolean z) {
        int i2;
        String str2 = z ? " IN " : " NOT IN ";
        String str3 = z ? " OR " : " AND ";
        int min = Math.min(i, 1000);
        int size = list.size();
        if (size % min == 0) {
            i2 = size / min;
        } else {
            i2 = (size / min) + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * min;
            String a2 = a(TextUtils.join("','", list.subList(i4, Math.min(i4 + min, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            sb.append(str);
            sb.append(str2);
            sb.append("('");
            sb.append(a2);
            sb.append("')");
        }
        String sb2 = sb.toString();
        return a(sb2, str + str2 + "('')");
    }

    private static String a(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
