package com.appodeal.ads;

import java.util.Comparator;

/* renamed from: com.appodeal.ads.-$$Lambda$rSYQdmrxYtotw-mOi7K9wynd7B4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$rSYQdmrxYtotwmOi7K9wynd7B4 implements Comparator {
    public static final /* synthetic */ $$Lambda$rSYQdmrxYtotwmOi7K9wynd7B4 INSTANCE = new $$Lambda$rSYQdmrxYtotwmOi7K9wynd7B4();

    private /* synthetic */ $$Lambda$rSYQdmrxYtotwmOi7K9wynd7B4() {
    }

    public final int compare(Object obj, Object obj2) {
        return Double.compare(((NativeAd) obj2).getPredictedEcpm(), ((NativeAd) obj).getPredictedEcpm());
    }
}
