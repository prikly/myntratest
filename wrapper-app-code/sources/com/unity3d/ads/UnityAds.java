package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.services.ads.UnityAdsImplementation;

public final class UnityAds {

    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT
    }

    public static void initialize(Context context, String str) {
        UnityAdsImplementation.getInstance().initialize(context, str, false, (IUnityAdsInitializationListener) null);
    }

    public static void initialize(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        UnityAdsImplementation.getInstance().initialize(context, str, false, iUnityAdsInitializationListener);
    }

    public static void initialize(Context context, String str, boolean z) {
        UnityAdsImplementation.getInstance().initialize(context, str, z, (IUnityAdsInitializationListener) null);
    }

    public static void initialize(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        UnityAdsImplementation.getInstance().initialize(context, str, z, iUnityAdsInitializationListener);
    }

    public static boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    public static boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    public static String getVersion() {
        return UnityAdsImplementation.getInstance().getVersion();
    }

    @Deprecated
    public static void show(Activity activity, String str) {
        UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), (IUnityAdsShowListener) null);
    }

    public static void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
    }

    @Deprecated
    public static void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions) {
        UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, (IUnityAdsShowListener) null);
    }

    public static void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
    }

    public static void setDebugMode(boolean z) {
        UnityAdsImplementation.getInstance().setDebugMode(z);
    }

    public static boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    @Deprecated
    public static void load(String str) {
        load(str, new IUnityAdsLoadListener() {
            public void onUnityAdsAdLoaded(String str) {
            }

            public void onUnityAdsFailedToLoad(String str, UnityAdsLoadError unityAdsLoadError, String str2) {
            }
        });
    }

    public static void load(String str, IUnityAdsLoadListener iUnityAdsLoadListener) {
        UnityAdsImplementation.getInstance().load(str, new UnityAdsLoadOptions(), iUnityAdsLoadListener);
    }

    public static void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        UnityAdsImplementation.getInstance().load(str, unityAdsLoadOptions, iUnityAdsLoadListener);
    }

    public static String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    public static void getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        UnityAdsImplementation.getInstance().getToken(iUnityAdsTokenListener);
    }
}
