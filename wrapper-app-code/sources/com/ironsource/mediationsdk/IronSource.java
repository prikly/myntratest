package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0891m;
import com.ironsource.mediationsdk.M;
import com.ironsource.mediationsdk.P;
import com.ironsource.mediationsdk.a.d;
import com.ironsource.mediationsdk.a.g;
import com.ironsource.mediationsdk.a.h;
import com.ironsource.mediationsdk.c.a;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.model.j;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.OfferwallListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class IronSource {
    public static final String DataSource_MOPUB = "MoPub";

    public enum AD_UNIT {
        REWARDED_VIDEO("rewardedVideo"),
        INTERSTITIAL("interstitial"),
        OFFERWALL("offerwall"),
        BANNER("banner");
        

        /* renamed from: a  reason: collision with root package name */
        private String f8191a;

        private AD_UNIT(String str) {
            this.f8191a = str;
        }

        public final String toString() {
            return this.f8191a;
        }
    }

    public static void addImpressionDataListener(ImpressionDataListener impressionDataListener) {
        H a2 = H.a();
        if (a.a(impressionDataListener, "addImpressionDataListener - listener is null")) {
            k.a().a(impressionDataListener);
            if (a2.z != null) {
                a2.z.a(impressionDataListener);
            }
            if (a2.A != null) {
                a2.A.a(impressionDataListener);
            }
            if (a2.C != null) {
                a2.C.a(impressionDataListener);
            }
            if (a2.D != null) {
                a2.D.a(impressionDataListener);
            }
            if (a2.B != null) {
                a2.B.a(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void clearRewardedVideoServerParameters() {
        H.a().n = null;
    }

    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        H a2 = H.a();
        a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "createBanner()", 1);
        if (activity == null) {
            a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    public static void destroyBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        H a2 = H.a();
        a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (a2.K && a2.B != null) {
                P p = a2.B;
                IronLog.INTERNAL.verbose("");
                P.AnonymousClass2 r2 = new C0891m.b(ironSourceBannerLayout) {

                    /* renamed from: a */
                    private /* synthetic */ IronSourceBannerLayout f8288a;

                    public final void a(
/*
Method generation error in method: com.ironsource.mediationsdk.P.2.a():void, dex: classes3.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.mediationsdk.P.2.a():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/

                    public final void a(
/*
Method generation error in method: com.ironsource.mediationsdk.P.2.a(java.lang.String):void, dex: classes3.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.mediationsdk.P.2.a(java.lang.String):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                };
                if (ironSourceBannerLayout != null) {
                    if (!ironSourceBannerLayout.isDestroyed()) {
                        r2.a();
                        return;
                    }
                }
                Object[] objArr = new Object[1];
                objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
                r2.a(String.format("can't destroy banner - %s", objArr));
            } else if (a2.f8164e != null) {
                a2.f8164e.a(ironSourceBannerLayout);
            } else if (a2.N != null) {
                a2.N.a(ironSourceBannerLayout);
            }
        } catch (Throwable th) {
            a2.f8165f.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public static String getAdvertiserId(Context context) {
        H.a();
        return H.a(context);
    }

    public static synchronized String getISDemandOnlyBiddingData() {
        String l;
        synchronized (IronSource.class) {
            l = H.a().l();
        }
        return l;
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        String b2;
        synchronized (IronSource.class) {
            b2 = H.a().b(context);
        }
        return b2;
    }

    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return H.a().k(str);
    }

    public static void getOfferwallCredits() {
        H a2 = H.a();
        a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", 1);
        try {
            O o = a2.f8163d;
            if (o.f8271a != null) {
                o.f8271a.getOfferwallCredits();
            }
        } catch (Throwable th) {
            a2.f8165f.logException(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", th);
        }
    }

    public static Placement getRewardedVideoPlacementInfo(String str) {
        return H.a().l(str);
    }

    public static void init(Activity activity, String str) {
        init(activity, str, (AD_UNIT[]) null);
    }

    public static void init(Activity activity, String str, InitializationListener initializationListener) {
        init(activity, str, initializationListener, (AD_UNIT[]) null);
    }

    public static void init(Activity activity, String str, InitializationListener initializationListener, AD_UNIT... ad_unitArr) {
        H.a().a(activity, str, false, initializationListener, ad_unitArr);
    }

    public static void init(Activity activity, String str, AD_UNIT... ad_unitArr) {
        H.a().a(activity, str, false, (InitializationListener) null, ad_unitArr);
    }

    @Deprecated
    public static void initISDemandOnly(Activity activity, String str, AD_UNIT... ad_unitArr) {
        H.a().a((Context) activity, str, (InitializationListener) null, ad_unitArr);
    }

    public static void initISDemandOnly(Context context, String str, AD_UNIT... ad_unitArr) {
        H.a().a(context, str, (InitializationListener) null, ad_unitArr);
    }

    public static boolean isBannerPlacementCapped(String str) {
        return H.a().n(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return H.a().i(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return H.a().g(str);
    }

    public static boolean isInterstitialPlacementCapped(String str) {
        return H.a().m(str);
    }

    public static boolean isInterstitialReady() {
        return H.a().g();
    }

    public static boolean isOfferwallAvailable() {
        return H.a().j();
    }

    public static boolean isRewardedVideoAvailable() {
        return H.a().c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = com.ironsource.mediationsdk.H.AnonymousClass1.f8169b[r1 - 1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isRewardedVideoPlacementCapped(java.lang.String r7) {
        /*
            com.ironsource.mediationsdk.H r0 = com.ironsource.mediationsdk.H.a()
            int r1 = r0.o(r7)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001c
            int[] r5 = com.ironsource.mediationsdk.H.AnonymousClass1.f8169b
            int r1 = r1 - r4
            r1 = r5[r1]
            if (r1 == r4) goto L_0x001a
            if (r1 == r2) goto L_0x001a
            r5 = 3
            if (r1 == r5) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            if (r1 == 0) goto L_0x003f
            boolean r5 = r0.u
            boolean r6 = r0.E
            int r0 = r0.L
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r5, r6, r0)
            if (r7 == 0) goto L_0x003a
            java.lang.Object[][] r5 = new java.lang.Object[r4][]
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = "placement"
            r2[r3] = r6
            r2[r4] = r7
            r5[r3] = r2
            com.ironsource.mediationsdk.H.a((org.json.JSONObject) r0, (java.lang.Object[][]) r5)
        L_0x003a:
            r7 = 1110(0x456, float:1.555E-42)
            com.ironsource.mediationsdk.H.a((int) r7, (org.json.JSONObject) r0)
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.IronSource.isRewardedVideoPlacementCapped(java.lang.String):boolean");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        H.a().a(ironSourceBannerLayout, "");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        H.a().a(ironSourceBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(Activity activity, IronSourceBannerLayout ironSourceBannerLayout, String str, String str2) {
        H.a().a(activity, ironSourceBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        H.a().d(activity, str, (String) null);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitial(String str) {
        H.a().d((Activity) null, str, (String) null);
    }

    public static void loadISDemandOnlyInterstitialWithAdm(Activity activity, String str, String str2) {
        H.a().c(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitialWithAdm(String str, String str2) {
        H.a().c((Activity) null, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        H.a().b(activity, str, (String) null);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideo(String str) {
        H.a().b((Activity) null, str, (String) null);
    }

    public static void loadISDemandOnlyRewardedVideoWithAdm(Activity activity, String str, String str2) {
        H.a().a(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideoWithAdm(String str, String str2) {
        H.a().a((Activity) null, str, str2);
    }

    public static void loadInterstitial() {
        H a2 = H.a();
        a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", 1);
        try {
            if (a2.v) {
                a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                C0894p.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", "Interstitial"));
            } else if (!a2.x) {
                a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadInterstitial()", 3);
                C0894p.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", "Interstitial"));
            } else {
                M.a b2 = M.a().b();
                if (b2 == M.a.INIT_FAILED) {
                    a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C0894p.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                } else if (b2 == M.a.INIT_IN_PROGRESS) {
                    if (M.a().c()) {
                        a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        C0894p.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                        return;
                    }
                    a2.J = true;
                } else if (!a2.h()) {
                    a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "No interstitial configurations found", 3);
                    C0894p.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                } else if (!a2.H) {
                    a2.f8162c.c();
                } else {
                    if (a2.I) {
                        if (a2.C != null) {
                            a2.C.e();
                            return;
                        }
                    } else if (a2.A != null) {
                        a2.A.d();
                        return;
                    }
                    a2.J = true;
                }
            }
        } catch (Throwable th) {
            a2.f8165f.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            C0894p.a().a(AD_UNIT.INTERSTITIAL, new IronSourceError(510, th.getMessage()));
        }
    }

    public static void loadRewardedVideo() {
        H a2 = H.a();
        a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", 1);
        try {
            if (a2.u) {
                a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                C0894p.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (!a2.F) {
                a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video is not initiated with manual load", 3);
            } else if (!a2.w) {
                a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadRewardedVideo()", 3);
                C0894p.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                M.a b2 = M.a().b();
                if (b2 == M.a.INIT_FAILED) {
                    a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C0894p.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (b2 == M.a.INIT_IN_PROGRESS) {
                    if (M.a().c()) {
                        a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        C0894p.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                        return;
                    }
                    a2.G = true;
                } else if (!a2.d()) {
                    a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "No rewarded video configurations found", 3);
                    C0894p.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (a2.D == null) {
                    a2.G = true;
                } else {
                    a2.D.e();
                }
            }
        } catch (Throwable th) {
            a2.f8165f.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th);
            C0894p.a().a(AD_UNIT.REWARDED_VIDEO, new IronSourceError(510, th.getMessage()));
        }
    }

    public static void onPause(Activity activity) {
        H a2 = H.a();
        try {
            a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            a2.f8165f.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    public static void onResume(Activity activity) {
        H a2 = H.a();
        try {
            a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "onResume()", 1);
            ContextProvider.getInstance().onResume(activity);
        } catch (Throwable th) {
            a2.f8165f.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
        }
    }

    public static void removeImpressionDataListener(ImpressionDataListener impressionDataListener) {
        H a2 = H.a();
        if (a.a(impressionDataListener, "removeImpressionDataListener - listener is null")) {
            k.a().b(impressionDataListener);
            if (a2.z != null) {
                a2.z.b(impressionDataListener);
            }
            if (a2.A != null) {
                a2.A.b(impressionDataListener);
            }
            if (a2.C != null) {
                a2.C.b(impressionDataListener);
            }
            if (a2.D != null) {
                a2.D.b(impressionDataListener);
            }
            if (a2.B != null) {
                a2.B.b(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("remove impression data listener from " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void removeInterstitialListener() {
        H a2 = H.a();
        a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        a2.f8166g.f8827b = null;
    }

    public static void removeOfferwallListener() {
        H a2 = H.a();
        a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "removeOfferwallListener()", 1);
        a2.f8166g.f8828c = null;
    }

    public static void removeRewardedVideoListener() {
        H a2 = H.a();
        a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        a2.f8166g.f8826a = null;
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        H a2 = H.a();
        if (a.a(jSONObject, "setAdRevenueData - impressionData is null") && a.a(str, "setAdRevenueData - dataSource is null")) {
            a2.O.a(str, jSONObject);
        }
    }

    public static void setAdaptersDebug(boolean z) {
        H.a();
        H.a(z);
    }

    public static void setConsent(boolean z) {
        H.a().b(z);
    }

    public static boolean setDynamicUserId(String str) {
        return H.a().c(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        H.a();
        H.a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        H.a();
        H.a(iSDemandOnlyRewardedVideoListener);
    }

    @Deprecated
    public static void setImpressionDataListener(ImpressionDataListener impressionDataListener) {
        H a2 = H.a();
        IronLog.API.info("removing all impression data listeners");
        k.a().c();
        if (a2.z != null) {
            a2.z.b();
        }
        if (a2.A != null) {
            a2.A.b();
        }
        if (a2.C != null) {
            a2.C.g();
        }
        if (a2.D != null) {
            a2.D.g();
        }
        if (a2.B != null) {
            a2.B.b();
        }
        addImpressionDataListener(impressionDataListener);
    }

    public static void setInterstitialListener(InterstitialListener interstitialListener) {
        H a2 = H.a();
        a2.f8165f.log(IronSourceLogger.IronSourceTag.API, interstitialListener == null ? "setInterstitialListener(ISListener:null)" : "setInterstitialListener(ISListener)", 1);
        a2.f8166g.f8827b = interstitialListener;
        B.a().a(interstitialListener);
        C0894p.a().f8807a = interstitialListener;
    }

    public static void setLogListener(LogListener logListener) {
        H a2 = H.a();
        if (logListener == null) {
            a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        a2.f8167h.f8698c = logListener;
        IronSourceLoggerManager ironSourceLoggerManager = a2.f8165f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
    }

    public static void setManualLoadRewardedVideo(RewardedVideoManualListener rewardedVideoManualListener) {
        H.a().a(rewardedVideoManualListener);
    }

    public static void setMediationSegment(String str) {
        H a2 = H.a();
        try {
            a2.f8165f.log(IronSourceLogger.IronSourceTag.API, a2.f8160a + ":setMediationSegment(segment:" + str + ")", 1);
            com.ironsource.d.a aVar = new com.ironsource.d.a();
            H.a(str, aVar);
            if (aVar.a()) {
                a2.l = str;
            } else {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, aVar.b().toString(), 2);
            }
        } catch (Exception e2) {
            IronSourceLoggerManager ironSourceLoggerManager = a2.f8165f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, a2.f8160a + ":setMediationSegment(segment:" + str + ")", e2);
        }
    }

    public static void setMediationType(String str) {
        H.a().d(str);
    }

    public static void setMetaData(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        H.a().a(str, (List<String>) arrayList);
    }

    public static void setMetaData(String str, List<String> list) {
        H.a().a(str, list);
    }

    public static void setNetworkData(String str, JSONObject jSONObject) {
        H.a();
        H.a(str, jSONObject);
    }

    public static void setOfferwallListener(OfferwallListener offerwallListener) {
        H a2 = H.a();
        a2.f8165f.log(IronSourceLogger.IronSourceTag.API, offerwallListener == null ? "setOfferwallListener(OWListener:null)" : "setOfferwallListener(OWListener)", 1);
        a2.f8166g.f8828c = offerwallListener;
    }

    public static void setRewardedVideoListener(RewardedVideoListener rewardedVideoListener) {
        H.a().a(rewardedVideoListener);
    }

    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        H a2 = H.a();
        if (map != null) {
            try {
                if (map.size() != 0) {
                    a2.f8165f.log(IronSourceLogger.IronSourceTag.API, a2.f8160a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                    a2.n = new HashMap(map);
                }
            } catch (Exception e2) {
                IronSourceLoggerManager ironSourceLoggerManager = a2.f8165f;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.logException(ironSourceTag, a2.f8160a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e2);
            }
        }
    }

    public static void setSegment(IronSourceSegment ironSourceSegment) {
        H a2 = H.a();
        a2.s = ironSourceSegment;
        if (a2.D != null) {
            a2.D.a(ironSourceSegment);
        }
        if (a2.z != null) {
            a2.z.a(ironSourceSegment);
        }
        if (a2.C != null) {
            a2.C.a(ironSourceSegment);
        }
        if (a2.A != null) {
            a2.A.a(ironSourceSegment);
        }
        if (a2.B != null) {
            a2.B.a(ironSourceSegment);
        }
        d.e().v = a2.s;
        h.e().v = a2.s;
        g.w.v = a2.s;
    }

    public static void setSegmentListener(SegmentListener segmentListener) {
        H a2 = H.a();
        if (a2.f8166g != null) {
            a2.f8166g.f8829d = segmentListener;
            M.a().p = a2.f8166g;
        }
    }

    public static void setUserId(String str) {
        H.a().a(str, true);
    }

    public static void shouldTrackNetworkState(Context context, boolean z) {
        H a2 = H.a();
        a2.q = context;
        a2.r = Boolean.valueOf(z);
        if (a2.H) {
            if (a2.I) {
                if (a2.C != null) {
                    a2.C.b(z);
                }
            } else if (a2.A != null) {
                a2.A.a(z);
            }
        } else if (a2.f8162c != null) {
            a2.f8162c.a(context, z);
        }
        if (a2.E) {
            if (a2.z != null) {
                a2.z.a(context, z);
            }
        } else if (a2.f8161b != null) {
            a2.f8161b.a(context, z);
        }
    }

    public static void showISDemandOnlyInterstitial(String str) {
        H a2 = H.a();
        IronSourceLoggerManager ironSourceLoggerManager = a2.f8165f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyInterstitial() instanceId=" + str, 1);
        try {
            if (!a2.v) {
                a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in mediation mode. Use showInterstitial instead", 3);
            } else if (a2.M == null) {
                a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "Interstitial video was not initiated", 3);
                A.a().b(str, new IronSourceError(508, "Interstitial video was not initiated"));
            } else {
                C0897s sVar = a2.M;
                if (!sVar.f8822a.containsKey(str)) {
                    C0897s.a((int) IronSourceConstants.IS_INSTANCE_NOT_FOUND, str);
                    A.a().b(str, ErrorBuilder.buildNonExistentInstanceError("Interstitial"));
                    return;
                }
                C0898t tVar = sVar.f8822a.get(str);
                sVar.a((int) IronSourceConstants.IS_INSTANCE_SHOW, tVar);
                tVar.a();
            }
        } catch (Exception e2) {
            a2.f8165f.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyInterstitial", e2);
            A.a().b(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
        }
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        H.a().f(str);
    }

    public static void showInterstitial() {
        H a2 = H.a();
        a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "showInterstitial()", 1);
        try {
            if (a2.v) {
                a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                a2.f8166g.onInterstitialAdShowFailed(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"));
            } else if (!a2.h()) {
                a2.f8166g.onInterstitialAdShowFailed(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            } else {
                InterstitialPlacement e2 = a2.e();
                if (e2 != null) {
                    a2.h(e2.getPlacementName());
                } else {
                    a2.f8166g.onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT, "showInterstitial error: empty default placement in response"));
                }
            }
        } catch (Exception e3) {
            a2.f8165f.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e3);
            a2.f8166g.onInterstitialAdShowFailed(new IronSourceError(510, e3.getMessage()));
        }
    }

    public static void showInterstitial(String str) {
        H.a().h(str);
    }

    public static void showOfferwall() {
        H a2 = H.a();
        try {
            a2.f8165f.log(IronSourceLogger.IronSourceTag.API, "showOfferwall()", 1);
            if (!a2.i()) {
                a2.f8166g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            j a3 = a2.i.f8939c.f8746c.a();
            if (a3 != null) {
                a2.j(a3.f8762b);
            }
        } catch (Exception e2) {
            a2.f8165f.logException(IronSourceLogger.IronSourceTag.API, "showOfferwall()", e2);
            a2.f8166g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    public static void showOfferwall(String str) {
        H.a().j(str);
    }

    public static void showRewardedVideo() {
        H a2 = H.a();
        if (!a2.d()) {
            a2.f8166g.onRewardedVideoAdShowFailed(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            a2.f8165f.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement b2 = a2.b();
        if (b2 == null) {
            a2.f8165f.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
            a2.f8166g.onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, "showRewardedVideo error: empty default placement in response"));
            return;
        }
        a2.e(b2.getPlacementName());
    }

    public static void showRewardedVideo(String str) {
        H.a().e(str);
    }
}
