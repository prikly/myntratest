package com.bytedance.sdk.openadsdk.b;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.j;
import com.bytedance.sdk.openadsdk.core.c;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.a.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.LinkedList;
import java.util.List;

/* compiled from: AdEventRepertoryImpl */
public class g implements f<a> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f304a;

    /* renamed from: b  reason: collision with root package name */
    private final c f305b = c.a(c());

    public String d() {
        return "adevent";
    }

    public g(Context context) {
        this.f304a = context;
    }

    public Context c() {
        Context context = this.f304a;
        return context == null ? m.a() : context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:11|(3:13|14|28)(1:27)|26|9|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        throw r9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0041 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047 A[Catch:{ all -> 0x0070 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<com.bytedance.sdk.openadsdk.b.a> a(int r9, java.lang.String r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            if (r9 <= 0) goto L_0x001e
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0075 }
            if (r1 != 0) goto L_0x001e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r0.<init>()     // Catch:{ all -> 0x0075 }
            r0.append(r10)     // Catch:{ all -> 0x0075 }
            java.lang.String r10 = " DESC limit "
            r0.append(r10)     // Catch:{ all -> 0x0075 }
            r0.append(r9)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0075 }
        L_0x001e:
            r7 = r0
            java.util.LinkedList r9 = new java.util.LinkedList     // Catch:{ all -> 0x0075 }
            r9.<init>()     // Catch:{ all -> 0x0075 }
            com.bytedance.sdk.openadsdk.multipro.aidl.c r10 = new com.bytedance.sdk.openadsdk.multipro.aidl.c     // Catch:{ all -> 0x0075 }
            android.content.Context r0 = r8.c()     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = r8.d()     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = "id"
            java.lang.String r3 = "value"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ all -> 0x0075 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.util.Map r0 = com.bytedance.sdk.openadsdk.multipro.a.a.a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0075 }
            r10.<init>(r0)     // Catch:{ all -> 0x0075 }
        L_0x0041:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = "id"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = "value"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x0041
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0041 }
            r2.<init>(r1)     // Catch:{ all -> 0x0041 }
            com.bytedance.sdk.openadsdk.b.a r1 = new com.bytedance.sdk.openadsdk.b.a     // Catch:{ all -> 0x0041 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0041 }
            r9.add(r1)     // Catch:{ all -> 0x0041 }
            goto L_0x0041
        L_0x006b:
            r10.close()     // Catch:{ all -> 0x0075 }
            monitor-exit(r8)
            return r9
        L_0x0070:
            r9 = move-exception
            r10.close()     // Catch:{ all -> 0x0075 }
            throw r9     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.b.g.a(int, java.lang.String):java.util.List");
    }

    public synchronized void a(a aVar) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(OSOutcomeConstants.OUTCOME_ID, aVar.f206a);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, aVar.b().toString());
            contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("retry", 0);
            a.a(c(), d(), contentValues);
        } catch (Throwable unused) {
        }
    }

    public synchronized void a(List<a> list) {
        if (!j.a(list)) {
            LinkedList linkedList = new LinkedList();
            for (a aVar : list) {
                linkedList.add(aVar.f206a);
            }
            a.a(c(), "DELETE FROM " + d() + " WHERE " + a(OSOutcomeConstants.OUTCOME_ID, linkedList, 1000, true));
        }
    }

    public synchronized void a(int i, long j) {
        b(i, j);
    }

    private synchronized void b(int i, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        Context c2 = c();
        String d2 = d();
        a.a(c2, d2, "gen_time <? AND retry >?", new String[]{currentTimeMillis + "", i + ""});
    }

    public synchronized void a(List<a> list, int i, long j) {
        if (!j.a(list)) {
            try {
                b(list);
                b(i, j);
            } catch (Exception unused) {
            }
        }
    }

    private synchronized void b(List<a> list) {
        LinkedList linkedList = new LinkedList();
        for (a aVar : list) {
            linkedList.add(aVar.f206a);
        }
        a.a(c(), "UPDATE " + d() + " SET " + "retry" + " = " + "retry" + "+1" + " WHERE " + a(OSOutcomeConstants.OUTCOME_ID, linkedList, 1000, true));
    }

    public void a(boolean z) {
        this.f305b.a("serverbusy_flag", z);
    }

    public boolean a() {
        return this.f305b.b("serverbusy_flag", false);
    }

    public int b() {
        return this.f305b.b("serverbusy_retrycount", 0);
    }

    public void a(int i) {
        this.f305b.a("serverbusy_retrycount", i);
    }

    public static String e() {
        return "CREATE TABLE IF NOT EXISTS " + "adevent" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + OSOutcomeConstants.OUTCOME_ID + " TEXT UNIQUE," + AppMeasurementSdk.ConditionalUserProperty.VALUE + " TEXT ," + "gen_time" + " TEXT , " + "retry" + " INTEGER default 0" + ")";
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
