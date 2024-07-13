package com.appodeal.ads.modules.common.internal.data;

import android.content.Context;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\f\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0015H&J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\u0018\u001a\u00020\u0015H&¨\u0006\u0019"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/data/ApplicationData;", "Lcom/appodeal/ads/modules/common/internal/data/SessionData;", "getAppName", "", "getBuildVersion", "getFrameworkName", "getFrameworkVersion", "getInstaller", "context", "Landroid/content/Context;", "getPackageName", "getPluginVersion", "getSdkKey", "getSdkVersion", "getSegmentId", "", "getTargetSdkVersion", "getVersionCode", "", "getVersionName", "isAppodealInitialized", "", "isAppodealInitializing", "isSideLoaded", "isTestMode", "apd_internal"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ApplicationData extends SessionData {
    String getAppName();

    String getBuildVersion();

    String getFrameworkName();

    String getFrameworkVersion();

    String getInstaller(Context context);

    String getPackageName(Context context);

    String getPluginVersion();

    String getSdkKey();

    String getSdkVersion();

    long getSegmentId();

    String getTargetSdkVersion(Context context);

    int getVersionCode(Context context);

    String getVersionName(Context context);

    boolean isAppodealInitialized();

    boolean isAppodealInitializing();

    boolean isSideLoaded(Context context);

    boolean isTestMode();
}
