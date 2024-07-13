package com.appsgeyser.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.appsgeyser.sdk.InternalEntryPoint;
import com.appsgeyser.sdk.ads.AdView;
import com.appsgeyser.sdk.ads.FullScreenBanner;
import com.appsgeyser.sdk.ads.fastTrack.FastTrackAdsController;
import com.appsgeyser.sdk.ads.rewardedVideo.RewardedAdHelper;
import com.appsgeyser.sdk.ads.rewardedVideo.rewardedFacades.RewardedVideoFacade;
import com.appsgeyser.sdk.inapp.PurchaseController;
import com.appsgeyser.sdk.inapp.ui.AccessActivity;
import com.appsgeyser.sdk.inapp.ui.DisableAdsPurchaseDialogFragment;
import com.appsgeyser.sdk.utils.RateApp.MarketChecker;
import com.appsgeyser.sdk.utils.UpdateManager;

public final class AppsgeyserSDK {

    public interface OfferWallEnabledListener {
        void isOfferWallEnabled(boolean z);
    }

    public interface OnAboutDialogEnableListener {
        void onDialogEnableReceived(boolean z);
    }

    public interface OnAccessDataEnableListener {
        void onAccessDataEnable(String str);
    }

    public interface OnAdditionalJsLoaded {
        void onJsLoaded(String str);
    }

    public interface OnDisableAdsDataEnableListener {
        void onDisableAdsDataEnable(String str);
    }

    public interface OnInAppUpdateEnableListener {
        void onInAppUpdateEnable(boolean z);
    }

    public interface OnRateMyAppEnableListener {
        void onRateMyAppEnableReceived(boolean z);
    }

    public static void takeOff(Activity activity, String str, String str2, String str3) {
        InternalEntryPoint.getInstance().takeOff(activity, str, str2, str3);
    }

    public static void setAdView(AdView adView) {
        InternalEntryPoint.getInstance().setAdView(adView);
    }

    public static FullScreenBanner getFullScreenBanner(Context context) {
        return InternalEntryPoint.getInstance().getFullScreenBanner(context);
    }

    public static FastTrackAdsController getFastTrackAdsController() {
        return InternalEntryPoint.getInstance().getFastTrackAdsController();
    }

    public static PurchaseController getPurchaseController() {
        return PurchaseController.getInstance();
    }

    public static void isAppOnMarket(Context context, MarketChecker.OnReceiveListener onReceiveListener) {
        InternalEntryPoint.getInstance().getMarketChecker().chekIsAppOnMarket(context.getPackageName(), onReceiveListener);
    }

    public static UpdateManager getUpdateManager() {
        return UpdateManager.getInstance();
    }

    public static void onPause(Context context) {
        InternalEntryPoint.getInstance().onPause(context);
    }

    public static void onResume(Context context) {
        InternalEntryPoint.getInstance().onResume(context);
    }

    public static void showAboutDialog(Activity activity) {
        InternalEntryPoint.getInstance().showAboutDialog(activity);
    }

    public static void isAboutDialogEnabled(Context context, OnAboutDialogEnableListener onAboutDialogEnableListener) {
        InternalEntryPoint.getInstance().getNewConfigPhp(context, onAboutDialogEnableListener);
    }

    public static void isInappUpdateEnabled(Context context, OnInAppUpdateEnableListener onInAppUpdateEnableListener) {
        InternalEntryPoint.getInstance().getNewConfigPhp(context, onInAppUpdateEnableListener);
    }

    public static void isAccessDataEnable(Context context, OnAccessDataEnableListener onAccessDataEnableListener) {
        InternalEntryPoint.getInstance().getNewConfigPhp(context, onAccessDataEnableListener);
    }

    public static void isDisableAdsDataEnable(Context context, OnDisableAdsDataEnableListener onDisableAdsDataEnableListener) {
        InternalEntryPoint.getInstance().getNewConfigPhp(context, onDisableAdsDataEnableListener);
    }

    public static void isRateMyAppEnabled(Context context, OnRateMyAppEnableListener onRateMyAppEnableListener) {
        InternalEntryPoint.getInstance().getNewConfigPhp(context, onRateMyAppEnableListener);
    }

    public static void isOfferWallEnabled(Context context, OfferWallEnabledListener offerWallEnabledListener) {
        InternalEntryPoint.getInstance().checkIsOfferWallEnabled(context, offerWallEnabledListener);
    }

    public static void getAdditionalJsCode(OnAdditionalJsLoaded onAdditionalJsLoaded) {
        InternalEntryPoint.getInstance().getAdditionalJsCode(onAdditionalJsLoaded);
    }

    public static void loadRewardedVideo(RewardedVideoFacade.RewardedVideoListener rewardedVideoListener) {
        RewardedAdHelper rewardedAdHelper = InternalEntryPoint.getInstance().getRewardedAdHelper();
        if (rewardedAdHelper != null) {
            rewardedAdHelper.loadRewardedVideo(rewardedVideoListener);
        }
    }

    public static void showRewardedVideo() {
        InternalEntryPoint.getInstance().getRewardedAdHelper().showRewardedVideo();
    }

    public static void setApplicationInstance(Application application) {
        InternalEntryPoint.getInstance().setApplication(application);
    }

    public static void setAfterConsentRequestCompletedListener(InternalEntryPoint.AfterConsentRequestListener afterConsentRequestListener) {
        InternalEntryPoint.getInstance().setAfterConsentRequestCompletedListener(afterConsentRequestListener);
    }

    public static String getAdditionalJsCode() {
        return InternalEntryPoint.getInstance().getAdditionalJsCode();
    }

    public static void launchAccessActivity(Context context, int i) {
        Intent intent = new Intent(context, AccessActivity.class);
        intent.putExtra("iconId", i);
        context.startActivity(intent);
    }

    public static void launchDisableAdsDialog(AppCompatActivity appCompatActivity, int i) {
        new DisableAdsPurchaseDialogFragment(i).show(appCompatActivity.getSupportFragmentManager(), "DisableAds");
    }
}
