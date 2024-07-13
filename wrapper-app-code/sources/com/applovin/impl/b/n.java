package com.applovin.impl.b;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private List<o> f14322a = Collections.emptyList();

    /* renamed from: b  reason: collision with root package name */
    private List<String> f14323b = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    private int f14324c;

    /* renamed from: d  reason: collision with root package name */
    private Uri f14325d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<k> f14326e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private g f14327f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Set<k>> f14328g = CollectionUtils.map();

    public enum a {
        UNSPECIFIED,
        LOW,
        MEDIUM,
        HIGH
    }

    private n() {
    }

    private n(e eVar) {
        this.f14323b = eVar.g();
    }

    private static int a(String str, com.applovin.impl.sdk.n nVar) {
        try {
            List<String> explode = CollectionUtils.explode(str, ":");
            if (explode.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds((long) StringUtils.parseInt(explode.get(0))) + TimeUnit.MINUTES.toSeconds((long) StringUtils.parseInt(explode.get(1))) + ((long) StringUtils.parseInt(explode.get(2))));
            }
        } catch (Throwable unused) {
            nVar.D();
            if (v.a()) {
                v D = nVar.D();
                D.e("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        r0 = r0.b("Icon");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.applovin.impl.b.n a(com.applovin.impl.sdk.utils.s r4, com.applovin.impl.b.n r5, com.applovin.impl.b.e r6, com.applovin.impl.sdk.n r7) {
        /*
            if (r4 == 0) goto L_0x00d9
            if (r6 == 0) goto L_0x00d1
            if (r7 == 0) goto L_0x00c9
            if (r5 == 0) goto L_0x0009
            goto L_0x000e
        L_0x0009:
            com.applovin.impl.b.n r5 = new com.applovin.impl.b.n     // Catch:{ all -> 0x00b2 }
            r5.<init>(r6)     // Catch:{ all -> 0x00b2 }
        L_0x000e:
            int r0 = r5.f14324c     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "Duration"
            com.applovin.impl.sdk.utils.s r0 = r4.b(r0)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = r0.c()     // Catch:{ all -> 0x00b2 }
            int r0 = a((java.lang.String) r0, (com.applovin.impl.sdk.n) r7)     // Catch:{ all -> 0x00b2 }
            if (r0 <= 0) goto L_0x0026
            r5.f14324c = r0     // Catch:{ all -> 0x00b2 }
        L_0x0026:
            java.lang.String r0 = "MediaFiles"
            com.applovin.impl.sdk.utils.s r0 = r4.b(r0)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x0045
            java.util.List r0 = a((com.applovin.impl.sdk.utils.s) r0, (com.applovin.impl.sdk.n) r7)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x0045
            int r1 = r0.size()     // Catch:{ all -> 0x00b2 }
            if (r1 <= 0) goto L_0x0045
            java.util.List<com.applovin.impl.b.o> r1 = r5.f14322a     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x0043
            java.util.List<com.applovin.impl.b.o> r1 = r5.f14322a     // Catch:{ all -> 0x00b2 }
            r0.addAll(r1)     // Catch:{ all -> 0x00b2 }
        L_0x0043:
            r5.f14322a = r0     // Catch:{ all -> 0x00b2 }
        L_0x0045:
            java.lang.String r0 = "VideoClicks"
            com.applovin.impl.sdk.utils.s r0 = r4.b(r0)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x0074
            android.net.Uri r1 = r5.f14325d     // Catch:{ all -> 0x00b2 }
            if (r1 != 0) goto L_0x0069
            java.lang.String r1 = "ClickThrough"
            com.applovin.impl.sdk.utils.s r1 = r0.b(r1)     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x0069
            java.lang.String r1 = r1.c()     // Catch:{ all -> 0x00b2 }
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x0069
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ all -> 0x00b2 }
            r5.f14325d = r1     // Catch:{ all -> 0x00b2 }
        L_0x0069:
            java.lang.String r1 = "ClickTracking"
            java.util.List r0 = r0.a(r1)     // Catch:{ all -> 0x00b2 }
            java.util.Set<com.applovin.impl.b.k> r1 = r5.f14326e     // Catch:{ all -> 0x00b2 }
            com.applovin.impl.b.m.a((java.util.List<com.applovin.impl.sdk.utils.s>) r0, (java.util.Set<com.applovin.impl.b.k>) r1, (com.applovin.impl.b.e) r6, (com.applovin.impl.sdk.n) r7)     // Catch:{ all -> 0x00b2 }
        L_0x0074:
            java.lang.String r0 = "Icons"
            com.applovin.impl.sdk.utils.s r0 = r4.b(r0)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00ac
            java.lang.String r1 = "Icon"
            com.applovin.impl.sdk.utils.s r0 = r0.b(r1)     // Catch:{ all -> 0x00b2 }
            com.applovin.impl.b.g r1 = com.applovin.impl.b.g.a(r0, r7)     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x00ac
            java.lang.String r2 = "IconClicks"
            com.applovin.impl.sdk.utils.s r2 = r0.b(r2)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x009d
            java.lang.String r3 = "IconClickTracking"
            java.util.List r2 = r2.a(r3)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x009d
            java.util.Set<com.applovin.impl.b.k> r3 = r1.f14296a     // Catch:{ all -> 0x00b2 }
            com.applovin.impl.b.m.a((java.util.List<com.applovin.impl.sdk.utils.s>) r2, (java.util.Set<com.applovin.impl.b.k>) r3, (com.applovin.impl.b.e) r6, (com.applovin.impl.sdk.n) r7)     // Catch:{ all -> 0x00b2 }
        L_0x009d:
            java.lang.String r2 = "IconViewTracking"
            java.util.List r0 = r0.a(r2)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00aa
            java.util.Set<com.applovin.impl.b.k> r2 = r1.f14297b     // Catch:{ all -> 0x00b2 }
            com.applovin.impl.b.m.a((java.util.List<com.applovin.impl.sdk.utils.s>) r0, (java.util.Set<com.applovin.impl.b.k>) r2, (com.applovin.impl.b.e) r6, (com.applovin.impl.sdk.n) r7)     // Catch:{ all -> 0x00b2 }
        L_0x00aa:
            r5.f14327f = r1     // Catch:{ all -> 0x00b2 }
        L_0x00ac:
            java.util.Map<java.lang.String, java.util.Set<com.applovin.impl.b.k>> r0 = r5.f14328g     // Catch:{ all -> 0x00b2 }
            com.applovin.impl.b.m.a((com.applovin.impl.sdk.utils.s) r4, (java.util.Map<java.lang.String, java.util.Set<com.applovin.impl.b.k>>) r0, (com.applovin.impl.b.e) r6, (com.applovin.impl.sdk.n) r7)     // Catch:{ all -> 0x00b2 }
            return r5
        L_0x00b2:
            r4 = move-exception
            r7.D()
            boolean r5 = com.applovin.impl.sdk.v.a()
            if (r5 == 0) goto L_0x00c7
            com.applovin.impl.sdk.v r5 = r7.D()
            java.lang.String r6 = "VastVideoCreative"
            java.lang.String r7 = "Error occurred while initializing"
            r5.b(r6, r7, r4)
        L_0x00c7:
            r4 = 0
            return r4
        L_0x00c9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "No sdk specified."
            r4.<init>(r5)
            throw r4
        L_0x00d1:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "No context specified."
            r4.<init>(r5)
            throw r4
        L_0x00d9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "No node specified."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b.n.a(com.applovin.impl.sdk.utils.s, com.applovin.impl.b.n, com.applovin.impl.b.e, com.applovin.impl.sdk.n):com.applovin.impl.b.n");
    }

    private static List<o> a(s sVar, com.applovin.impl.sdk.n nVar) {
        List<s> a2 = sVar.a("MediaFile");
        ArrayList arrayList = new ArrayList(a2.size());
        List<String> explode = CollectionUtils.explode((String) nVar.a(b.et));
        List<String> explode2 = CollectionUtils.explode((String) nVar.a(b.es));
        for (s a3 : a2) {
            o a4 = o.a(a3, nVar);
            if (a4 != null) {
                try {
                    String c2 = a4.c();
                    if (!StringUtils.isValidString(c2) || explode.contains(c2)) {
                        if (((Boolean) nVar.a(b.eu)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a4.b().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                            }
                        }
                        nVar.D();
                        if (v.a()) {
                            v D = nVar.D();
                            D.d("VastVideoCreative", "Video file not supported: " + a4);
                        }
                    }
                    arrayList.add(a4);
                } catch (Throwable th) {
                    nVar.D();
                    if (v.a()) {
                        v D2 = nVar.D();
                        D2.b("VastVideoCreative", "Failed to validate video file: " + a4, th);
                    }
                }
            }
        }
        return arrayList;
    }

    public o a(a aVar) {
        List<o> list = this.f14322a;
        if (list == null || list.size() == 0) {
            return null;
        }
        List arrayList = new ArrayList(3);
        for (String next : this.f14323b) {
            for (o next2 : this.f14322a) {
                String c2 = next2.c();
                if (StringUtils.isValidString(c2) && next.equalsIgnoreCase(c2)) {
                    arrayList.add(next2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f14322a;
        }
        if (h.c()) {
            Collections.sort(arrayList, new Comparator<o>() {
                /* renamed from: a */
                public int compare(o oVar, o oVar2) {
                    return Integer.compare(oVar.d(), oVar2.d());
                }
            });
        }
        return (o) arrayList.get(aVar == a.LOW ? 0 : aVar == a.MEDIUM ? arrayList.size() / 2 : arrayList.size() - 1);
    }

    public List<o> a() {
        return this.f14322a;
    }

    public int b() {
        return this.f14324c;
    }

    public Uri c() {
        return this.f14325d;
    }

    public Set<k> d() {
        return this.f14326e;
    }

    public Map<String, Set<k>> e() {
        return this.f14328g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f14324c != nVar.f14324c) {
            return false;
        }
        List<o> list = this.f14322a;
        if (list == null ? nVar.f14322a != null : !list.equals(nVar.f14322a)) {
            return false;
        }
        Uri uri = this.f14325d;
        if (uri == null ? nVar.f14325d != null : !uri.equals(nVar.f14325d)) {
            return false;
        }
        Set<k> set = this.f14326e;
        if (set == null ? nVar.f14326e != null : !set.equals(nVar.f14326e)) {
            return false;
        }
        Map<String, Set<k>> map = this.f14328g;
        Map<String, Set<k>> map2 = nVar.f14328g;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public g f() {
        return this.f14327f;
    }

    public int hashCode() {
        List<o> list = this.f14322a;
        int i = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f14324c) * 31;
        Uri uri = this.f14325d;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set<k> set = this.f14326e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<k>> map = this.f14328g;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f14322a + ", durationSeconds=" + this.f14324c + ", destinationUri=" + this.f14325d + ", clickTrackers=" + this.f14326e + ", eventTrackers=" + this.f14328g + ", industryIcon=" + this.f14327f + '}';
    }
}
