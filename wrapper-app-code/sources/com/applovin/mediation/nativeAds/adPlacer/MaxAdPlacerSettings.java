package com.applovin.mediation.nativeAds.adPlacer;

import com.applovin.impl.sdk.v;
import java.util.Set;
import java.util.TreeSet;

public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a  reason: collision with root package name */
    private final String f16060a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Integer> f16061b = new TreeSet();

    /* renamed from: c  reason: collision with root package name */
    private int f16062c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f16063d = 256;

    /* renamed from: e  reason: collision with root package name */
    private int f16064e = 4;

    public MaxAdPlacerSettings(String str) {
        this.f16060a = str;
    }

    public void addFixedPosition(int i) {
        this.f16061b.add(Integer.valueOf(i));
    }

    public String getAdUnitId() {
        return this.f16060a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f16061b;
    }

    public int getMaxAdCount() {
        return this.f16063d;
    }

    public int getMaxPreloadedAdCount() {
        return this.f16064e;
    }

    public int getRepeatingInterval() {
        return this.f16062c;
    }

    public boolean hasValidPositioning() {
        return !this.f16061b.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f16062c >= 2;
    }

    public void resetFixedPositions() {
        this.f16061b.clear();
    }

    public void setMaxAdCount(int i) {
        this.f16063d = i;
    }

    public void setMaxPreloadedAdCount(int i) {
        this.f16064e = i;
    }

    public void setRepeatingInterval(int i) {
        if (i >= 2) {
            this.f16062c = i;
            v.f("MaxAdPlacerSettings", "Repeating interval set to " + i);
            return;
        }
        this.f16062c = 0;
        v.h("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i + ", which is less than minimum value of " + 2);
    }

    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f16060a + '\'' + ", fixedPositions=" + this.f16061b + ", repeatingInterval=" + this.f16062c + ", maxAdCount=" + this.f16063d + ", maxPreloadedAdCount=" + this.f16064e + '}';
    }
}
