package com.appodeal.ads.modules.common.internal.data;

import android.content.Context;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0003H&J\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\"\u001a\u00020\u0007H&J\b\u0010#\u001a\u00020\u0007H&J\u0015\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010%H&¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020\u0007H&J\b\u0010(\u001a\u00020\u0003H&J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010*\u001a\u00020\u000fH&J\b\u0010+\u001a\u00020\u000fH&J\b\u0010,\u001a\u00020\u000fH&¨\u0006-"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/data/DeviceData;", "", "getAndroidId", "", "context", "Landroid/content/Context;", "getAppRamSize", "", "getBatteryLevel", "", "getBatteryTemperature", "(Landroid/content/Context;)Ljava/lang/Float;", "getBootTime", "getBrandName", "getChargingStatus", "", "(Landroid/content/Context;)Ljava/lang/Boolean;", "getConnectionData", "Lcom/appodeal/ads/modules/common/internal/data/ConnectionData;", "getConnectionType", "getDeviceLanguage", "getDeviceName", "getDisplayDpi", "getKernelVersion", "getLowRamMemoryStatus", "getModelId", "getModelName", "getOsBuildVersion", "getPlatformName", "getScreenDensity", "getScreenHeight", "getScreenOrientation", "", "getScreenWidth", "getStorageFree", "getStorageSize", "getSupportedAbis", "", "()[Ljava/lang/String;", "getTimeStamp", "getTimeZone", "getTotalFreeRam", "isConnected", "isDeviceEmulator", "isDeviceRooted", "apd_internal"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface DeviceData {
    String getAndroidId(Context context);

    long getAppRamSize(Context context);

    float getBatteryLevel(Context context);

    Float getBatteryTemperature(Context context);

    long getBootTime();

    String getBrandName();

    Boolean getChargingStatus(Context context);

    ConnectionData getConnectionData(Context context);

    String getConnectionType(Context context);

    String getDeviceLanguage();

    String getDeviceName(Context context);

    float getDisplayDpi(Context context);

    String getKernelVersion();

    boolean getLowRamMemoryStatus(Context context);

    String getModelId();

    String getModelName();

    String getOsBuildVersion();

    String getPlatformName();

    float getScreenDensity(Context context);

    float getScreenHeight(Context context);

    int getScreenOrientation(Context context);

    float getScreenWidth(Context context);

    long getStorageFree();

    long getStorageSize();

    String[] getSupportedAbis();

    long getTimeStamp();

    String getTimeZone();

    long getTotalFreeRam(Context context);

    boolean isConnected();

    boolean isDeviceEmulator();

    boolean isDeviceRooted();
}
