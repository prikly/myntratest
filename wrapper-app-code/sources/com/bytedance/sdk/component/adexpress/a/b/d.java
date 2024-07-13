package com.bytedance.sdk.component.adexpress.a.b;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.a.a.a;
import com.bytedance.sdk.component.adexpress.a.c.b;
import com.bytedance.sdk.component.adexpress.a.c.c;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: TmplDiffManager */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f18326a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f18327b = new AtomicBoolean(false);

    public static d a() {
        if (f18326a == null) {
            synchronized (d.class) {
                if (f18326a == null) {
                    f18326a = new d();
                }
            }
        }
        return f18326a;
    }

    private d() {
    }

    public b a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return c.a().a(str);
    }

    public Set<String> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return c.a().b(str);
    }

    private void b() {
        if (a.a().c() != null) {
            int a2 = a.a().c().a();
            if (a2 <= 0) {
                a2 = 100;
            }
            List<b> b2 = c.a().b();
            if (b2.isEmpty() || a2 >= b2.size()) {
                l.b("TmplDiffManager", "end doCheckAndDeleteTask maxTplCnt,local size" + a2 + ", 目前存储的模版的个数 " + b2.size());
                return;
            }
            TreeMap treeMap = new TreeMap();
            for (b next : b2) {
                treeMap.put(next.g(), next);
            }
            HashSet hashSet = new HashSet();
            int size = (int) (((float) b2.size()) - (((float) a2) * 0.75f));
            int i = 0;
            for (Map.Entry entry : treeMap.entrySet()) {
                if (entry != null && i < size) {
                    i++;
                    ((Long) entry.getKey()).longValue();
                    b bVar = (b) entry.getValue();
                    if (bVar != null) {
                        hashSet.add(bVar.b());
                    }
                }
            }
            a((Set<String>) hashSet);
            this.f18327b.set(false);
        }
    }

    private JSONObject c(String str) {
        if (a.a().c() == null) {
            return null;
        }
        com.bytedance.sdk.component.e.b.b g2 = a.a().c().g();
        g2.a(str);
        com.bytedance.sdk.component.e.b a2 = g2.a();
        if (a2 != null) {
            try {
                if (a2.f() && a2.d() != null) {
                    return new JSONObject(a2.d());
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public void a(c cVar, String str) {
        if (cVar == null) {
            l.e("TmplDiffManager", "saveTemplate error: tplInfo == null");
            return;
        }
        final String str2 = cVar.f18351a;
        final String str3 = cVar.f18353c;
        final String str4 = cVar.f18352b;
        final String str5 = cVar.f18354d;
        final String str6 = cVar.f18355e;
        final String h2 = TextUtils.isEmpty(str) ? a.a().c() != null ? a.a().c().h() : "" : str;
        if (TextUtils.isEmpty(str2)) {
            l.e("TmplDiffManager", "saveTemplate error:tmpId is empty");
        } else {
            e.a(new g("saveTemplate") {
                public void run() {
                    d.this.a(str2, str3, str4, str5, str6, h2);
                }
            }, 10);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.bytedance.sdk.component.adexpress.a.c.b r0 = r7.a((java.lang.String) r8)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0021
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x001f
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0014
            goto L_0x001f
        L_0x0014:
            r0 = r7
            r1 = r13
            r2 = r8
            r3 = r10
            r4 = r9
            r5 = r11
            r6 = r12
            r0.b(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0055 }
            goto L_0x003f
        L_0x001f:
            monitor-exit(r7)
            return
        L_0x0021:
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x002b
            r7.a(r9, r13, r8)     // Catch:{ all -> 0x0055 }
            goto L_0x003f
        L_0x002b:
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0035
            r7.a(r9, r13, r8)     // Catch:{ all -> 0x0055 }
            goto L_0x003f
        L_0x0035:
            r0 = r7
            r1 = r13
            r2 = r8
            r3 = r10
            r4 = r9
            r5 = r11
            r6 = r12
            r0.b(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0055 }
        L_0x003f:
            boolean r8 = com.bytedance.sdk.component.adexpress.a.b.e.b(r12)     // Catch:{ all -> 0x0055 }
            boolean r9 = com.bytedance.sdk.component.adexpress.a.b.a.f()     // Catch:{ all -> 0x0055 }
            if (r9 == 0) goto L_0x004b
            if (r8 == 0) goto L_0x0053
        L_0x004b:
            com.bytedance.sdk.component.adexpress.a.b.b r8 = com.bytedance.sdk.component.adexpress.a.b.b.a()     // Catch:{ all -> 0x0055 }
            r9 = 1
            r8.a((boolean) r9)     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r7)
            return
        L_0x0055:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.a.b.d.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private void b(String str, String str2, String str3, String str4, String str5, String str6) {
        c.a().a(new b().a(str).b(str2).c(str3).d(str4).e(str5).f(str6).a(Long.valueOf(System.currentTimeMillis())));
        b();
    }

    private void a(String str, String str2, String str3) {
        JSONObject c2;
        if (!TextUtils.isEmpty(str) && (c2 = c(str)) != null) {
            String optString = c2.optString("md5");
            String optString2 = c2.optString(MediationMetaData.KEY_VERSION);
            String optString3 = c2.optString("data");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                b a2 = new b().a(str2).b(str3).c(optString).d(str).e(optString3).f(optString2).a(Long.valueOf(System.currentTimeMillis()));
                c.a().a(a2);
                b();
                if (e.b(optString2)) {
                    a2.f(optString2);
                    b.a().a(true);
                }
            }
        }
    }

    public void a(Set<String> set) {
        try {
            c.a().a(set);
        } catch (Throwable th) {
            l.b("TmplDiffManager", th.getMessage());
        }
    }
}
