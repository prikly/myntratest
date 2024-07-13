package com.applovin.impl.mediation.nativeAds.a;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.m;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.Map;
import java.util.TreeSet;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final m<Integer> f15071a = new m<>();

    /* renamed from: b  reason: collision with root package name */
    private final TreeSet<Integer> f15072b = new TreeSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Integer, MaxAd> f15073c = CollectionUtils.map();

    /* renamed from: d  reason: collision with root package name */
    private int f15074d;

    /* renamed from: e  reason: collision with root package name */
    private int f15075e;

    public a(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    private int a(int i, boolean z) {
        int d2 = this.f15071a.d(Integer.valueOf(i));
        if (!z) {
            int i2 = i + d2;
            while (d2 < this.f15071a.size() && i2 >= this.f15071a.a(d2).intValue()) {
                i2++;
                d2++;
            }
        }
        return d2;
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            v.i("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f15071a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (maxAdPlacerSettings.isRepeatingEnabled()) {
            int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
            if (this.f15071a.isEmpty()) {
                this.f15071a.add(Integer.valueOf(repeatingInterval - 1));
            }
            int intValue = this.f15071a.a().intValue();
            while (true) {
                intValue += repeatingInterval;
                if (this.f15071a.size() < maxAdPlacerSettings.getMaxAdCount()) {
                    this.f15071a.add(Integer.valueOf(intValue));
                } else {
                    return;
                }
            }
        }
    }

    private void c(int i, int i2) {
        if (this.f15073c.containsKey(Integer.valueOf(i))) {
            this.f15073c.put(Integer.valueOf(i2), this.f15073c.get(Integer.valueOf(i)));
            this.f15072b.add(Integer.valueOf(i2));
            this.f15073c.remove(Integer.valueOf(i));
            this.f15072b.remove(Integer.valueOf(i));
        }
    }

    public int a() {
        int i = this.f15074d;
        if (!(i == -1 || this.f15075e == -1)) {
            while (i <= this.f15075e) {
                if (a(i) && !b(i)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public void a(int i, int i2) {
        this.f15074d = i;
        this.f15075e = i2;
    }

    public void a(MaxAd maxAd, int i) {
        this.f15073c.put(Integer.valueOf(i), maxAd);
        this.f15072b.add(Integer.valueOf(i));
    }

    public void a(Collection<Integer> collection) {
        for (Integer next : collection) {
            this.f15073c.remove(next);
            this.f15072b.remove(next);
        }
    }

    public boolean a(int i) {
        return this.f15071a.contains(Integer.valueOf(i));
    }

    public Collection<Integer> b() {
        return new TreeSet(this.f15072b);
    }

    public void b(int i, int i2) {
        i(i);
        h(i2);
    }

    public boolean b(int i) {
        return this.f15072b.contains(Integer.valueOf(i));
    }

    public MaxAd c(int i) {
        return this.f15073c.get(Integer.valueOf(i));
    }

    public void c() {
        this.f15073c.clear();
        this.f15072b.clear();
    }

    public Collection<Integer> d(int i) {
        return new TreeSet(this.f15072b.tailSet(Integer.valueOf(i), false));
    }

    public int e(int i) {
        if (i == 0) {
            return 0;
        }
        return i + a(i - 1, false);
    }

    public int f(int i) {
        return i + a(i, false);
    }

    public int g(int i) {
        if (a(i)) {
            return -1;
        }
        return i - a(i, true);
    }

    public void h(int i) {
        int c2 = this.f15071a.c(Integer.valueOf(i));
        for (int size = this.f15071a.size() - 1; size >= c2; size--) {
            Integer a2 = this.f15071a.a(size);
            int intValue = a2.intValue() + 1;
            c(a2.intValue(), intValue);
            this.f15071a.a(size, Integer.valueOf(intValue));
        }
    }

    public void i(int i) {
        int c2 = this.f15071a.c(Integer.valueOf(i));
        if (a(i)) {
            this.f15073c.remove(Integer.valueOf(i));
            this.f15072b.remove(Integer.valueOf(i));
            this.f15071a.b(c2);
        }
        while (c2 < this.f15071a.size()) {
            Integer a2 = this.f15071a.a(c2);
            int intValue = a2.intValue() - 1;
            c(a2.intValue(), intValue);
            this.f15071a.a(c2, Integer.valueOf(intValue));
            c2++;
        }
    }
}
