package com.appodeal.ads;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k5 implements j5 {

    /* renamed from: a  reason: collision with root package name */
    public final Lazy f16565a;

    public static final class a extends Lambda implements Function0<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k5 f16566a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ s<?> f16567b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(k5 k5Var, s<?> sVar) {
            super(0);
            this.f16566a = k5Var;
            this.f16567b = sVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
            if (r1.equals(com.appodeal.ads.modules.common.internal.Constants.DEBUG_INTERSTITIAL) == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
            if (r1.equals(com.appodeal.ads.modules.common.internal.Constants.BANNER) == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
            r0 = "http://herokuapp.appodeal.com/android_waterfall_banner";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
            if (r1.equals("native") == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
            r0 = "http://herokuapp.appodeal.com/android_waterfall_native";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
            if (r1.equals(com.appodeal.ads.modules.common.internal.Constants.DEBUG_NON_REWARDED_VIDEO) == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
            r0 = "http://herokuapp.appodeal.com/android_waterfall_video";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
            if (r1.equals("banner") == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
            r0 = "http://herokuapp.appodeal.com/android_waterfall_interstitial";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
            if (r1.equals(com.appodeal.ads.modules.common.internal.Constants.DEBUG_MREC) == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
            if (r1.equals(com.appodeal.ads.modules.common.internal.Constants.MREC) == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
            r0 = "http://herokuapp.appodeal.com/android_waterfall_mrec";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
            if (r1.equals(com.appodeal.ads.modules.common.internal.Constants.DEBUG_NATIVE) == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
            if (r1.equals(com.appodeal.ads.modules.common.internal.Constants.DEBUG_BANNER) == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
            if (r1.equals("video") == false) goto L_0x0080;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke() {
            /*
                r2 = this;
                com.appodeal.ads.k5 r0 = r2.f16566a
                com.appodeal.ads.s<?> r1 = r2.f16567b
                java.lang.String r1 = r1.a()
                r0.getClass()
                if (r1 == 0) goto L_0x0080
                int r0 = r1.hashCode()
                switch(r0) {
                    case -1907025354: goto L_0x0074;
                    case -1840422033: goto L_0x006b;
                    case -1396342996: goto L_0x005f;
                    case -1210465393: goto L_0x0053;
                    case -1052618729: goto L_0x0047;
                    case -1031406050: goto L_0x003b;
                    case 95458899: goto L_0x0032;
                    case 112202875: goto L_0x0029;
                    case 624073610: goto L_0x0020;
                    case 894337923: goto L_0x0016;
                    default: goto L_0x0014;
                }
            L_0x0014:
                goto L_0x0080
            L_0x0016:
                java.lang.String r0 = "debug_native"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0050
                goto L_0x0080
            L_0x0020:
                java.lang.String r0 = "debug_banner_320"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0044
                goto L_0x0080
            L_0x0029:
                java.lang.String r0 = "video"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x005c
                goto L_0x0080
            L_0x0032:
                java.lang.String r0 = "debug"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0068
                goto L_0x0080
            L_0x003b:
                java.lang.String r0 = "banner_320"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0044
                goto L_0x0080
            L_0x0044:
                java.lang.String r0 = "http://herokuapp.appodeal.com/android_waterfall_banner"
                goto L_0x0082
            L_0x0047:
                java.lang.String r0 = "native"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0050
                goto L_0x0080
            L_0x0050:
                java.lang.String r0 = "http://herokuapp.appodeal.com/android_waterfall_native"
                goto L_0x0082
            L_0x0053:
                java.lang.String r0 = "debug_video"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x005c
                goto L_0x0080
            L_0x005c:
                java.lang.String r0 = "http://herokuapp.appodeal.com/android_waterfall_video"
                goto L_0x0082
            L_0x005f:
                java.lang.String r0 = "banner"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0068
                goto L_0x0080
            L_0x0068:
                java.lang.String r0 = "http://herokuapp.appodeal.com/android_waterfall_interstitial"
                goto L_0x0082
            L_0x006b:
                java.lang.String r0 = "debug_mrec"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x007d
                goto L_0x0080
            L_0x0074:
                java.lang.String r0 = "banner_mrec"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x007d
                goto L_0x0080
            L_0x007d:
                java.lang.String r0 = "http://herokuapp.appodeal.com/android_waterfall_mrec"
                goto L_0x0082
            L_0x0080:
                java.lang.String r0 = "http://herokuapp.appodeal.com/android_waterfall_rewarded_video"
            L_0x0082:
                com.appodeal.ads.s<?> r1 = r2.f16567b
                boolean r1 = r1.f17190b
                if (r1 == 0) goto L_0x0089
                goto L_0x008a
            L_0x0089:
                r0 = 0
            L_0x008a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.k5.a.invoke():java.lang.Object");
        }
    }

    public k5(s<?> sVar) {
        Intrinsics.checkNotNullParameter(sVar, "adRequestParams");
        this.f16565a = LazyKt.lazy(new a(this, sVar));
    }

    public final String c() {
        return (String) this.f16565a.getValue();
    }
}
