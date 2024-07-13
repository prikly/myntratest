package com.bytedance.sdk.openadsdk.core.g;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.core.m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PermissionsManager */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1194a = d.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private static d f1195e = null;

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, Integer> f1196f = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Set<String> f1197b = new HashSet(1);

    /* renamed from: c  reason: collision with root package name */
    private final List<WeakReference<e>> f1198c = new ArrayList(1);

    /* renamed from: d  reason: collision with root package name */
    private final List<e> f1199d = new ArrayList(1);

    public static d a() {
        if (f1195e == null) {
            f1195e = new d();
        }
        return f1195e;
    }

    private d() {
        b();
    }

    private synchronized void b() {
        if (Build.VERSION.SDK_INT > 28) {
            c();
            return;
        }
        for (Field field : Manifest.permission.class.getFields()) {
            String str = null;
            try {
                str = (String) field.get("");
            } catch (IllegalAccessException e2) {
                Log.e(f1194a, "Could not access field", e2);
            }
            this.f1197b.add(str);
        }
    }

    private void c() {
        PackageInfo packageInfo;
        String[] strArr;
        Context a2 = m.a();
        if (a2 != null) {
            try {
                PackageManager packageManager = a2.getPackageManager();
                String packageName = a2.getPackageName();
                if (packageManager != null && (packageInfo = packageManager.getPackageInfo(packageName, 4096)) != null && (strArr = packageInfo.requestedPermissions) != null) {
                    if (strArr.length != 0) {
                        for (int i = 0; i < strArr.length; i++) {
                            if (!TextUtils.isEmpty(strArr[i])) {
                                this.f1197b.add(strArr[i]);
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private synchronized void a(String[] strArr, e eVar) {
        if (eVar != null) {
            eVar.a(strArr);
            this.f1199d.add(eVar);
            this.f1198c.add(new WeakReference(eVar));
        }
    }

    private synchronized void a(e eVar) {
        Iterator<WeakReference<e>> it = this.f1198c.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            if (next.get() == eVar || next.get() == null) {
                it.remove();
            }
        }
        Iterator<e> it2 = this.f1199d.iterator();
        while (it2.hasNext()) {
            if (it2.next() == eVar) {
                it2.remove();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0034, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 != 0) goto L_0x0006
            monitor-exit(r3)
            return r0
        L_0x0006:
            boolean r1 = com.bytedance.sdk.openadsdk.utils.m.e()     // Catch:{ all -> 0x0035 }
            r2 = 1
            if (r1 == 0) goto L_0x0024
            boolean r1 = com.bytedance.sdk.openadsdk.core.g.a.a(r4, r5)     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0022
            int r4 = com.bytedance.sdk.openadsdk.core.g.b.a(r4, r5)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0021
            java.util.Set<java.lang.String> r4 = r3.f1197b     // Catch:{ all -> 0x0035 }
            boolean r4 = r4.contains(r5)     // Catch:{ all -> 0x0035 }
            if (r4 != 0) goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            monitor-exit(r3)
            return r0
        L_0x0024:
            int r4 = com.bytedance.sdk.openadsdk.core.g.b.a(r4, r5)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0032
            java.util.Set<java.lang.String> r4 = r3.f1197b     // Catch:{ all -> 0x0035 }
            boolean r4 = r4.contains(r5)     // Catch:{ all -> 0x0035 }
            if (r4 != 0) goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            monitor-exit(r3)
            return r0
        L_0x0035:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.g.d.a(android.content.Context, java.lang.String):boolean");
    }

    public synchronized void a(Activity activity, String[] strArr, e eVar) {
        if (activity != null) {
            try {
                a(strArr, eVar);
                if (Build.VERSION.SDK_INT < 23) {
                    b(activity, strArr, eVar);
                } else {
                    List<String> c2 = c(activity, strArr, eVar);
                    if (c2.isEmpty()) {
                        a(eVar);
                    } else {
                        b.a(activity, (String[]) c2.toArray(new String[c2.size()]), 1);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            return;
        }
        return;
    }

    private void b(Activity activity, String[] strArr, e eVar) {
        boolean z;
        for (String str : strArr) {
            if (eVar != null) {
                try {
                    if (!this.f1197b.contains(str)) {
                        z = eVar.a(str, c.NOT_FOUND);
                    } else if (b.a(activity, str) != 0) {
                        z = eVar.a(str, c.DENIED);
                    } else {
                        z = eVar.a(str, c.GRANTED);
                    }
                    if (z) {
                        break;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        a(eVar);
    }

    private List<String> c(Activity activity, String[] strArr, e eVar) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (!this.f1197b.contains(str)) {
                if (eVar != null) {
                    eVar.a(str, c.NOT_FOUND);
                }
            } else if (!a((Context) activity, str)) {
                arrayList.add(str);
            } else if (eVar != null) {
                eVar.a(str, c.GRANTED);
            }
        }
        return arrayList;
    }

    public synchronized void a(Activity activity, String[] strArr, int[] iArr) {
        try {
            new ArrayList(3);
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str = strArr[i];
                if ((iArr[i] == -1 || (com.bytedance.sdk.openadsdk.utils.m.e() && !a.a(activity, str))) && iArr[i] != -1) {
                    iArr[i] = -1;
                }
            }
            a(strArr, iArr, (String[]) null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r0.remove();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String[] r6, int[] r7, java.lang.String[] r8) {
        /*
            r5 = this;
            int r8 = r6.length     // Catch:{ all -> 0x0047 }
            int r0 = r7.length     // Catch:{ all -> 0x0047 }
            if (r0 >= r8) goto L_0x0005
            int r8 = r7.length     // Catch:{ all -> 0x0047 }
        L_0x0005:
            java.util.List<java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.g.e>> r0 = r5.f1198c     // Catch:{ all -> 0x0047 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0047 }
        L_0x000b:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0034
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0047 }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x0047 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0047 }
            com.bytedance.sdk.openadsdk.core.g.e r1 = (com.bytedance.sdk.openadsdk.core.g.e) r1     // Catch:{ all -> 0x0047 }
            r2 = 0
        L_0x001e:
            if (r2 >= r8) goto L_0x000b
            if (r1 == 0) goto L_0x0030
            r3 = r6[r2]     // Catch:{ all -> 0x0047 }
            r4 = r7[r2]     // Catch:{ all -> 0x0047 }
            boolean r3 = r1.a((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            int r2 = r2 + 1
            goto L_0x001e
        L_0x0030:
            r0.remove()     // Catch:{ all -> 0x0047 }
            goto L_0x000b
        L_0x0034:
            java.util.List<com.bytedance.sdk.openadsdk.core.g.e> r6 = r5.f1199d     // Catch:{ all -> 0x0047 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0047 }
        L_0x003a:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0047 }
            if (r7 == 0) goto L_0x004b
            r6.next()     // Catch:{ all -> 0x0047 }
            r6.remove()     // Catch:{ all -> 0x0047 }
            goto L_0x003a
        L_0x0047:
            r6 = move-exception
            r6.printStackTrace()
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.g.d.a(java.lang.String[], int[], java.lang.String[]):void");
    }
}
