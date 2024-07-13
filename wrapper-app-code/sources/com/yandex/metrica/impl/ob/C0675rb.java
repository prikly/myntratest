package com.yandex.metrica.impl.ob;

import android.content.pm.FeatureInfo;

/* renamed from: com.yandex.metrica.impl.ob.rb  reason: case insensitive filesystem */
public abstract class C0675rb {

    /* renamed from: com.yandex.metrica.impl.ob.rb$a */
    public static class a extends C0675rb {
        public C0699sb b(FeatureInfo featureInfo) {
            return new C0699sb(featureInfo.name, featureInfo.version, c(featureInfo));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rb$b */
    public static class b extends C0675rb {
        public C0699sb b(FeatureInfo featureInfo) {
            return new C0699sb(featureInfo.name, -1, c(featureInfo));
        }
    }

    public C0699sb a(FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i = featureInfo.reqGlEsVersion;
        if (i == 0) {
            return b(featureInfo);
        }
        return new C0699sb("openGlFeature", i, c(featureInfo));
    }

    /* access modifiers changed from: protected */
    public abstract C0699sb b(FeatureInfo featureInfo);

    /* access modifiers changed from: package-private */
    public boolean c(FeatureInfo featureInfo) {
        return (featureInfo.flags & 1) != 0;
    }
}
