package com.criteo.publisher.model;

import com.criteo.publisher.f;
import com.criteo.publisher.i0.c;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.n0.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: AdUnitMapper */
public class g {

    /* renamed from: d  reason: collision with root package name */
    private static final AdSize f2792d = new AdSize(2, 2);

    /* renamed from: e  reason: collision with root package name */
    private static final Collection<com.criteo.publisher.i0.a> f2793e = Arrays.asList(new com.criteo.publisher.i0.a[]{com.criteo.publisher.i0.a.GAM_APP_BIDDING, com.criteo.publisher.i0.a.MOPUB_APP_BIDDING});

    /* renamed from: a  reason: collision with root package name */
    private final com.criteo.publisher.logging.g f2794a = h.b(getClass());

    /* renamed from: b  reason: collision with root package name */
    private final k f2795b;

    /* renamed from: c  reason: collision with root package name */
    private final c f2796c;

    public g(k kVar, c cVar) {
        this.f2795b = kVar;
        this.f2796c = cVar;
    }

    public List<List<n>> a(List<AdUnit> list) {
        HashSet hashSet = new HashSet();
        for (AdUnit next : list) {
            if (next != null) {
                hashSet.add(new n(a(next), next.getAdUnitId(), next.getAdUnitType()));
            }
        }
        return a(a((Collection<n>) hashSet), 8);
    }

    /* compiled from: AdUnitMapper */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2797a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.criteo.publisher.n0.a[] r0 = com.criteo.publisher.n0.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2797a = r0
                com.criteo.publisher.n0.a r1 = com.criteo.publisher.n0.a.CRITEO_BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2797a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.criteo.publisher.n0.a r1 = com.criteo.publisher.n0.a.CRITEO_INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2797a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.criteo.publisher.n0.a r1 = com.criteo.publisher.n0.a.CRITEO_REWARDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2797a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.criteo.publisher.n0.a r1 = com.criteo.publisher.n0.a.CRITEO_CUSTOM_NATIVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.model.g.a.<clinit>():void");
        }
    }

    private AdSize a(AdUnit adUnit) {
        int i = a.f2797a[adUnit.getAdUnitType().ordinal()];
        if (i == 1) {
            return ((BannerAdUnit) adUnit).getSize();
        }
        if (i == 2 || i == 3) {
            return this.f2795b.a();
        }
        if (i == 4) {
            return f2792d;
        }
        throw new IllegalArgumentException("Found an invalid AdUnit");
    }

    public n b(AdUnit adUnit) {
        List<List<n>> a2 = a((List<AdUnit>) Collections.singletonList(adUnit));
        if (a2.isEmpty() || a2.get(0).isEmpty()) {
            return null;
        }
        return (n) a2.get(0).get(0);
    }

    private List<n> a(Collection<n> collection) {
        ArrayList arrayList = new ArrayList();
        com.criteo.publisher.i0.a c2 = this.f2796c.c();
        for (n next : collection) {
            if (next.b().isEmpty() || next.c().getWidth() <= 0 || next.c().getHeight() <= 0) {
                this.f2794a.a(f.a(next));
            } else if (next.a() != com.criteo.publisher.n0.a.CRITEO_REWARDED || f2793e.contains(c2)) {
                arrayList.add(next);
            } else {
                this.f2794a.a(f.a(next, c2));
            }
        }
        return arrayList;
    }

    static <T> List<List<T>> a(List<T> list, int i) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < list.size()) {
            int i3 = i2 + i;
            arrayList.add(list.subList(i2, Math.min(i3, list.size())));
            i2 = i3;
        }
        return arrayList;
    }
}
