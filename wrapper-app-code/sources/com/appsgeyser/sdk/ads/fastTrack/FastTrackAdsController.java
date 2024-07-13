package com.appsgeyser.sdk.ads.fastTrack;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import com.appsgeyser.sdk.InternalEntryPoint;
import com.appsgeyser.sdk.ads.fastTrack.FastTrackAdsController;
import com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackBaseAdapter;
import com.appsgeyser.sdk.configuration.models.ConfigPhp;
import com.appsgeyser.sdk.inapp.models.statuses.Status;
import com.appsgeyser.sdk.inapp.models.statuses.SuccessStatus;
import com.appsgeyser.sdk.ui.AppsgeyserProgressDialog;
import java.lang.ref.WeakReference;
import rx.functions.Action1;
import rx.subjects.BehaviorSubject;

public class FastTrackAdsController {
    private static FastTrackAdsController instance;
    private FastTrackBaseAdapter adsAdapter;
    private WeakReference<Activity> bannerActivityTmp = null;
    private String bannerPlacementTagTmp = null;
    private WeakReference<ViewGroup> bannerViewContainerTmp = null;
    private BehaviorSubject<BannerViewPlacementWrapper> bannerViewPlacementPublishSubject = BehaviorSubject.create();
    private BehaviorSubject<ContextConfigWrapper> consentPendingBlocker = BehaviorSubject.create();
    private BehaviorSubject<FastTrackBaseAdapter.FullscreenListener> fullscreenListenerPublishSubject = BehaviorSubject.create();
    private String fullscreenPendingLoadTag;
    private String fullscreenPendingPlacementTag;
    private boolean fullscreenPendingUseFrequencyTimer;
    private boolean isActive;
    private boolean isNativeEnable;
    private BehaviorSubject<NativeAdRequestWrapper> nativeAdRequestWrapperBehaviorSubject = BehaviorSubject.create();
    private BehaviorSubject<NativeViewReadyListenerWrapper> nativeViewReadyListenerWrapperBehaviorSubject = BehaviorSubject.create();

    private class NativeAdRequestWrapper {
    }

    private FastTrackAdsController() {
    }

    public static synchronized FastTrackAdsController getInstance() {
        FastTrackAdsController fastTrackAdsController;
        synchronized (FastTrackAdsController.class) {
            if (instance == null) {
                instance = new FastTrackAdsController();
            }
            fastTrackAdsController = instance;
        }
        return fastTrackAdsController;
    }

    public void requestInit(ConfigPhp configPhp, Context context) {
        this.consentPendingBlocker.onNext(new ContextConfigWrapper(configPhp, context));
    }

    public void consentRequestProcessFinished() {
        this.consentPendingBlocker.subscribe(new Action1() {
            public final void call(Object obj) {
                FastTrackAdsController.this.init((FastTrackAdsController.ContextConfigWrapper) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(com.appsgeyser.sdk.ads.fastTrack.FastTrackAdsController.ContextConfigWrapper r6) {
        /*
            r5 = this;
            com.appsgeyser.sdk.configuration.models.ConfigPhp r0 = r6.getConfigPhp()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "fastTrackTag"
            android.util.Log.d(r1, r0)
            com.appsgeyser.sdk.configuration.models.ConfigPhp r0 = r6.getConfigPhp()
            com.appsgeyser.sdk.ads.fastTrack.FastTrackSdkModel r0 = r0.getActiveAdsSDK()
            java.lang.String r2 = r0.getName()
            int r3 = r2.hashCode()
            r4 = 1
            switch(r3) {
                case -1892803072: goto L_0x005e;
                case -963943683: goto L_0x0054;
                case -790102013: goto L_0x004a;
                case -291586939: goto L_0x0040;
                case 958098324: goto L_0x0036;
                case 1236048015: goto L_0x002c;
                case 1314914054: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0068
        L_0x0022:
            java.lang.String r3 = "appnextSdk"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0068
            r2 = 1
            goto L_0x0069
        L_0x002c:
            java.lang.String r3 = "htmlSdk"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0068
            r2 = 5
            goto L_0x0069
        L_0x0036:
            java.lang.String r3 = "facebookSdk"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0068
            r2 = 2
            goto L_0x0069
        L_0x0040:
            java.lang.String r3 = "unitySdk"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0068
            r2 = 3
            goto L_0x0069
        L_0x004a:
            java.lang.String r3 = "multiAdsSdk"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0068
            r2 = 6
            goto L_0x0069
        L_0x0054:
            java.lang.String r3 = "admobSdk"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0068
            r2 = 0
            goto L_0x0069
        L_0x005e:
            java.lang.String r3 = "appodealSdk"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0068
            r2 = 4
            goto L_0x0069
        L_0x0068:
            r2 = -1
        L_0x0069:
            switch(r2) {
                case 0: goto L_0x00fe;
                case 1: goto L_0x00ed;
                case 2: goto L_0x00dc;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00b8;
                case 5: goto L_0x00a7;
                case 6: goto L_0x0096;
                default: goto L_0x006c;
            }
        L_0x006c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown adsAdapter: "
            r2.append(r3)
            java.lang.String r3 = r0.getName()
            r2.append(r3)
            java.lang.String r3 = " . Disabling ads controller."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
            com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackDisabledAdapter r1 = new com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackDisabledAdapter
            android.content.Context r2 = r6.getContext()
            r1.<init>(r0, r2)
            r5.adsAdapter = r1
            goto L_0x0110
        L_0x0096:
            java.lang.String r2 = "initializing multiAds adsAdapter"
            android.util.Log.d(r1, r2)
            com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackMultiAdsAdapter r1 = new com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackMultiAdsAdapter
            android.content.Context r2 = r6.getContext()
            r1.<init>(r0, r2)
            r5.adsAdapter = r1
            goto L_0x0110
        L_0x00a7:
            java.lang.String r2 = "initializing html adsAdapter"
            android.util.Log.d(r1, r2)
            com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackHtmlAdapter r1 = new com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackHtmlAdapter
            android.content.Context r2 = r6.getContext()
            r1.<init>(r0, r2)
            r5.adsAdapter = r1
            goto L_0x0110
        L_0x00b8:
            java.lang.String r2 = "initializing appodeal adsAdapter"
            android.util.Log.d(r1, r2)
            com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackAppodealAdapter r1 = new com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackAppodealAdapter
            android.content.Context r2 = r6.getContext()
            r1.<init>(r0, r2)
            r5.adsAdapter = r1
            r5.isNativeEnable = r4
            goto L_0x0110
        L_0x00cb:
            java.lang.String r2 = "initializing unity adsAdapter"
            android.util.Log.d(r1, r2)
            com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackUnityAdapter r1 = new com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackUnityAdapter
            android.content.Context r2 = r6.getContext()
            r1.<init>(r0, r2)
            r5.adsAdapter = r1
            goto L_0x0110
        L_0x00dc:
            java.lang.String r2 = "initializing facebook adsAdapter"
            android.util.Log.d(r1, r2)
            com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackFacebookAdapter r1 = new com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackFacebookAdapter
            android.content.Context r2 = r6.getContext()
            r1.<init>(r0, r2)
            r5.adsAdapter = r1
            goto L_0x0110
        L_0x00ed:
            java.lang.String r2 = "initializing appnext adsAdapter"
            android.util.Log.d(r1, r2)
            com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackAppnextAdapter r1 = new com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackAppnextAdapter
            android.content.Context r2 = r6.getContext()
            r1.<init>(r0, r2)
            r5.adsAdapter = r1
            goto L_0x0110
        L_0x00fe:
            java.lang.String r2 = "initializing admob adsAdapter"
            android.util.Log.d(r1, r2)
            com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackAdmobAdapter r1 = new com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackAdmobAdapter
            android.content.Context r2 = r6.getContext()
            r1.<init>(r0, r2)
            r5.adsAdapter = r1
            r5.isNativeEnable = r4
        L_0x0110:
            rx.subjects.BehaviorSubject<com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackBaseAdapter$FullscreenListener> r0 = r5.fullscreenListenerPublishSubject
            com.appsgeyser.sdk.ads.fastTrack.-$$Lambda$FastTrackAdsController$MJ40-uST79s2Q36nLMwJceHje8A r1 = new com.appsgeyser.sdk.ads.fastTrack.-$$Lambda$FastTrackAdsController$MJ40-uST79s2Q36nLMwJceHje8A
            r1.<init>()
            r0.subscribe(r1)
            rx.subjects.BehaviorSubject<com.appsgeyser.sdk.ads.fastTrack.FastTrackAdsController$BannerViewPlacementWrapper> r0 = r5.bannerViewPlacementPublishSubject
            com.appsgeyser.sdk.ads.fastTrack.-$$Lambda$FastTrackAdsController$Bhk5kkCzW4qovUastg9szpspU1Y r1 = new com.appsgeyser.sdk.ads.fastTrack.-$$Lambda$FastTrackAdsController$Bhk5kkCzW4qovUastg9szpspU1Y
            r1.<init>()
            r0.subscribe(r1)
            rx.subjects.BehaviorSubject<com.appsgeyser.sdk.ads.fastTrack.FastTrackAdsController$NativeViewReadyListenerWrapper> r0 = r5.nativeViewReadyListenerWrapperBehaviorSubject
            com.appsgeyser.sdk.ads.fastTrack.-$$Lambda$FastTrackAdsController$usLDFd7exJoKQqFr2XwrtISLmCw r1 = new com.appsgeyser.sdk.ads.fastTrack.-$$Lambda$FastTrackAdsController$usLDFd7exJoKQqFr2XwrtISLmCw
            r1.<init>()
            r0.subscribe(r1)
            rx.subjects.BehaviorSubject<com.appsgeyser.sdk.ads.fastTrack.FastTrackAdsController$NativeAdRequestWrapper> r0 = r5.nativeAdRequestWrapperBehaviorSubject
            com.appsgeyser.sdk.ads.fastTrack.-$$Lambda$FastTrackAdsController$CPYd8lAjMSZz7clvId8QBSRyaMY r1 = new com.appsgeyser.sdk.ads.fastTrack.-$$Lambda$FastTrackAdsController$CPYd8lAjMSZz7clvId8QBSRyaMY
            r1.<init>()
            r0.subscribe(r1)
            com.appsgeyser.sdk.inapp.utils.DisableAdsSharedPrefs r0 = com.appsgeyser.sdk.inapp.utils.DisableAdsSharedPrefs.getInstance()
            boolean r0 = r0.getDisableAdsActiveFlag()
            r0 = r0 ^ r4
            r5.setActive(r0)
            com.appsgeyser.sdk.inapp.PurchaseController r0 = com.appsgeyser.sdk.inapp.PurchaseController.getInstance()
            com.appsgeyser.sdk.ads.fastTrack.-$$Lambda$FastTrackAdsController$bYEACm0OrJjpZZouSXOpc-O0JD4 r1 = new com.appsgeyser.sdk.ads.fastTrack.-$$Lambda$FastTrackAdsController$bYEACm0OrJjpZZouSXOpc-O0JD4
            r1.<init>(r6)
            r0.subscribeDisableAdsStatus(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsgeyser.sdk.ads.fastTrack.FastTrackAdsController.init(com.appsgeyser.sdk.ads.fastTrack.FastTrackAdsController$ContextConfigWrapper):void");
    }

    public /* synthetic */ void lambda$init$0$FastTrackAdsController(FastTrackBaseAdapter.FullscreenListener fullscreenListener) {
        this.adsAdapter.setFullscreenListener(fullscreenListener);
    }

    public /* synthetic */ void lambda$init$1$FastTrackAdsController(BannerViewPlacementWrapper bannerViewPlacementWrapper) {
        this.adsAdapter.initBannerView(bannerViewPlacementWrapper.getBannerViewContainer(), bannerViewPlacementWrapper.getPlacementTag(), bannerViewPlacementWrapper.getActivity());
    }

    public /* synthetic */ void lambda$init$2$FastTrackAdsController(NativeViewReadyListenerWrapper nativeViewReadyListenerWrapper) {
        this.adsAdapter.setNativeViewReadyListener(nativeViewReadyListenerWrapper.getListener());
    }

    public /* synthetic */ void lambda$init$3$FastTrackAdsController(NativeAdRequestWrapper nativeAdRequestWrapper) {
        this.adsAdapter.sendNativeViewRequest();
    }

    public /* synthetic */ void lambda$init$5$FastTrackAdsController(ContextConfigWrapper contextConfigWrapper, Status status) {
        new Handler(contextConfigWrapper.context.getMainLooper()).post(new Runnable(status, contextConfigWrapper) {
            public final /* synthetic */ Status f$1;
            public final /* synthetic */ FastTrackAdsController.ContextConfigWrapper f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                FastTrackAdsController.this.lambda$init$4$FastTrackAdsController(this.f$1, this.f$2);
            }
        });
    }

    public /* synthetic */ void lambda$init$4$FastTrackAdsController(Status status, ContextConfigWrapper contextConfigWrapper) {
        String str;
        if (status instanceof SuccessStatus) {
            SuccessStatus successStatus = (SuccessStatus) status;
            setActive(!successStatus.isFeatureActive() || !successStatus.isFeaturePurchased());
            if ((!successStatus.isFeatureActive() || !successStatus.isFeaturePurchased()) && (str = this.fullscreenPendingLoadTag) != null) {
                showFullscreen(str, contextConfigWrapper.getContext(), this.fullscreenPendingPlacementTag, this.fullscreenPendingUseFrequencyTimer);
            }
        }
    }

    private void setActive(boolean z) {
        this.isActive = z;
        if (z) {
            WeakReference<ViewGroup> weakReference = this.bannerViewContainerTmp;
            if (weakReference != null && this.bannerActivityTmp != null && this.bannerPlacementTagTmp != null) {
                setBannerViewContainer((ViewGroup) weakReference.get(), (Activity) this.bannerActivityTmp.get(), this.bannerPlacementTagTmp);
                this.bannerViewContainerTmp = null;
                this.bannerActivityTmp = null;
                this.bannerPlacementTagTmp = null;
                return;
            }
            return;
        }
        hideSmallBanner();
    }

    private void hideSmallBanner() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                FastTrackAdsController.this.lambda$hideSmallBanner$6$FastTrackAdsController();
            }
        });
    }

    public /* synthetic */ void lambda$hideSmallBanner$6$FastTrackAdsController() {
        if (this.bannerViewPlacementPublishSubject.getValue() != null && this.bannerViewPlacementPublishSubject.getValue().bannerViewContainer != null) {
            this.bannerViewPlacementPublishSubject.getValue().bannerViewContainer.setVisibility(8);
            onPause();
        }
    }

    public void showFullscreen(String str, Context context, String str2, boolean z) {
        if (!this.isActive || InternalEntryPoint.getInstance().isConsentRequestProcessActive()) {
            this.fullscreenPendingLoadTag = str;
            this.fullscreenPendingPlacementTag = str2;
            this.fullscreenPendingUseFrequencyTimer = z;
            Log.d("fastTrackTag", "fasttrack controller not activated");
            return;
        }
        if (context != null) {
            this.adsAdapter.setContext(context);
            this.adsAdapter.setProgressDialog(new AppsgeyserProgressDialog(context));
        }
        new Handler(this.adsAdapter.getContext().getMainLooper()).postDelayed(new Runnable(str, str2, z, context) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ boolean f$3;
            public final /* synthetic */ Context f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                FastTrackAdsController.this.lambda$showFullscreen$7$FastTrackAdsController(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        }, 1000);
        this.fullscreenPendingLoadTag = null;
        this.fullscreenPendingPlacementTag = null;
        this.fullscreenPendingUseFrequencyTimer = z;
    }

    public /* synthetic */ void lambda$showFullscreen$7$FastTrackAdsController(String str, String str2, boolean z, Context context) {
        this.adsAdapter.showFullscreen(str, str2, z, context);
        Log.d("fastTrackTag", "attempt to show fullscreen");
    }

    public void showPendingFullscreen(Context context) {
        String str = this.fullscreenPendingLoadTag;
        if (str != null) {
            showFullscreen(str, context, this.fullscreenPendingPlacementTag, this.fullscreenPendingUseFrequencyTimer);
        }
    }

    public void setFullscreenListener(FastTrackBaseAdapter.FullscreenListener fullscreenListener) {
        if (fullscreenListener != null) {
            this.fullscreenListenerPublishSubject.onNext(fullscreenListener);
        }
    }

    public void setBannerViewContainer(ViewGroup viewGroup, Activity activity, String str) {
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            if (this.isActive) {
                this.bannerViewPlacementPublishSubject.onNext(new BannerViewPlacementWrapper(viewGroup, str, activity));
                return;
            }
            this.bannerActivityTmp = new WeakReference<>(activity);
            this.bannerViewContainerTmp = new WeakReference<>(viewGroup);
            this.bannerPlacementTagTmp = "onStart";
        }
    }

    public void showRewardedVideo(FastTrackBaseAdapter.RewardedVideoListener rewardedVideoListener, String str) {
        if (rewardedVideoListener == null) {
            return;
        }
        if (this.isActive) {
            this.adsAdapter.showRewardedVideo(rewardedVideoListener, str);
            Log.d("fastTrackTag", "attempt to show rewardedVideo");
            return;
        }
        rewardedVideoListener.onVideoDeactivated();
        Log.d("fastTrackTag", "fasttrack controller not activated");
    }

    public boolean isActive() {
        return this.isActive;
    }

    public void onPause() {
        FastTrackBaseAdapter fastTrackBaseAdapter = this.adsAdapter;
        if (fastTrackBaseAdapter != null) {
            fastTrackBaseAdapter.onPause();
        }
    }

    public void onResume(Context context) {
        FastTrackBaseAdapter fastTrackBaseAdapter = this.adsAdapter;
        if (fastTrackBaseAdapter != null) {
            fastTrackBaseAdapter.onResume(context);
        }
    }

    private class ContextConfigWrapper {
        ConfigPhp configPhp;
        Context context;

        ContextConfigWrapper(ConfigPhp configPhp2, Context context2) {
            this.configPhp = configPhp2;
            this.context = context2;
        }

        /* access modifiers changed from: package-private */
        public ConfigPhp getConfigPhp() {
            return this.configPhp;
        }

        /* access modifiers changed from: package-private */
        public Context getContext() {
            return this.context;
        }
    }

    private class BannerViewPlacementWrapper {
        Activity activity;
        ViewGroup bannerViewContainer;
        String placementTag;

        BannerViewPlacementWrapper(ViewGroup viewGroup, String str, Activity activity2) {
            this.bannerViewContainer = viewGroup;
            this.placementTag = str;
            this.activity = activity2;
        }

        /* access modifiers changed from: package-private */
        public ViewGroup getBannerViewContainer() {
            return this.bannerViewContainer;
        }

        /* access modifiers changed from: package-private */
        public String getPlacementTag() {
            return this.placementTag;
        }

        /* access modifiers changed from: package-private */
        public Activity getActivity() {
            return this.activity;
        }
    }

    private class NativeViewReadyListenerWrapper {
        private FastTrackBaseAdapter.NativeViewReadyListener listener;

        public FastTrackBaseAdapter.NativeViewReadyListener getListener() {
            return this.listener;
        }
    }
}
