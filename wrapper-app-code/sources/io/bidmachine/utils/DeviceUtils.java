package io.bidmachine.utils;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.applovin.sdk.AppLovinEventTypes;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.unity3d.services.core.device.MimeTypes;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class DeviceUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getBuildId() {
        return Build.ID;
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public static int getOrientation(Context context) {
        if (context != null) {
            return context.getResources().getConfiguration().orientation;
        }
        return 0;
    }

    public static Set<String> getInputLanguageSet(Context context) {
        HashSet hashSet = new HashSet();
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager == null) {
                return hashSet;
            }
            for (InputMethodInfo enabledInputMethodSubtypeList : inputMethodManager.getEnabledInputMethodList()) {
                for (InputMethodSubtype next : inputMethodManager.getEnabledInputMethodSubtypeList(enabledInputMethodSubtypeList, true)) {
                    if (next.getMode().equals("keyboard")) {
                        String str = null;
                        if (Build.VERSION.SDK_INT >= 24) {
                            str = next.getLanguageTag();
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = next.getLocale();
                        }
                        if (!TextUtils.isEmpty(str)) {
                            int indexOf = str.indexOf("_");
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            hashSet.add(str);
                        }
                    }
                }
            }
            String language = Locale.getDefault().getLanguage();
            if (!TextUtils.isEmpty(language)) {
                hashSet.add(language);
            }
            return hashSet;
        } catch (Exception unused) {
        }
    }

    public static Boolean isRingMuted(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        int ringerMode = audioManager.getRingerMode();
        boolean z = true;
        if (!(ringerMode == 0 || ringerMode == 1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026 A[ADDED_TO_REGION, Catch:{ Exception -> 0x0032 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean isCharging(android.content.Context r6) {
        /*
            r0 = 0
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ Exception -> 0x0032 }
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0032 }
            android.content.Intent r6 = r6.registerReceiver(r0, r1)     // Catch:{ Exception -> 0x0032 }
            if (r6 == 0) goto L_0x0032
            java.lang.String r1 = "plugged"
            r2 = -1
            int r6 = r6.getIntExtra(r1, r2)     // Catch:{ Exception -> 0x0032 }
            r1 = 0
            r2 = 1
            if (r6 == r2) goto L_0x001f
            r3 = 2
            if (r6 != r3) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            goto L_0x0020
        L_0x001f:
            r3 = 1
        L_0x0020:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0032 }
            r5 = 17
            if (r4 < r5) goto L_0x002d
            if (r3 != 0) goto L_0x002b
            r3 = 4
            if (r6 != r3) goto L_0x002c
        L_0x002b:
            r1 = 1
        L_0x002c:
            r3 = r1
        L_0x002d:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0032 }
            return r6
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.utils.DeviceUtils.isCharging(android.content.Context):java.lang.Boolean");
    }

    public static Double getBatteryLevel(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra >= 0 && intExtra2 > 0) {
                    return Double.valueOf(((double) Math.round((((double) intExtra) / ((double) intExtra2)) * 100.0d)) / 100.0d);
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static Boolean isBatterySaverEnabled(Context context) {
        PowerManager powerManager;
        if (Build.VERSION.SDK_INT < 21 || (powerManager = (PowerManager) context.getSystemService("power")) == null) {
            return null;
        }
        return Boolean.valueOf(powerManager.isPowerSaveMode());
    }

    public static boolean isDarkModeEnabled(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static Boolean isAirplaneModeOn(Context context) {
        int i;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (Build.VERSION.SDK_INT >= 17) {
                i = Settings.Global.getInt(contentResolver, "airplane_mode_on");
            } else {
                i = Settings.System.getInt(contentResolver, "airplane_mode_on");
            }
            return Boolean.valueOf(i != 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Boolean isDoNotDisturbOn(Context context) {
        try {
            if (Build.VERSION.SDK_INT < 17) {
                return null;
            }
            return Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "zen_mode") != 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getDeviceName(Context context) {
        String str;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (Build.VERSION.SDK_INT >= 17) {
                str = Settings.Global.getString(contentResolver, "device_name");
            } else {
                str = Settings.System.getString(contentResolver, "device_name");
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String string = Settings.Secure.getString(contentResolver, "bluetooth_name");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (!Utils.isPermissionGranted(context, "android.permission.BLUETOOTH_CONNECT") || defaultAdapter == null) {
                return null;
            }
            return defaultAdapter.getName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Integer getScreenBrightness(Context context) {
        try {
            return Integer.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_brightness"));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Double getScreenBrightnessRatio(Context context) {
        Integer screenBrightness = getScreenBrightness(context);
        if (screenBrightness == null) {
            return null;
        }
        return Double.valueOf(((double) Math.round((((double) screenBrightness.intValue()) / 255.0d) * 100.0d)) / 100.0d);
    }

    public static ConnectionType getConnectionType(Context context) {
        NetworkInfo activeNetworkInfo = Utils.getActiveNetworkInfo(context);
        if (activeNetworkInfo == null) {
            return ConnectionType.CONNECTION_TYPE_INVALID;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return getMobileNetworkType(activeNetworkInfo);
        }
        if (type == 1) {
            return ConnectionType.CONNECTION_TYPE_WIFI;
        }
        if (type != 9) {
            return ConnectionType.CONNECTION_TYPE_INVALID;
        }
        return ConnectionType.CONNECTION_TYPE_ETHERNET;
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static boolean isTablet(Context context) {
        DisplayMetrics displayMetrics = getDisplayMetrics(context);
        double d2 = (double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi);
        double d3 = (double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi);
        return Math.sqrt((d2 * d2) + (d3 * d3)) >= 6.6d;
    }

    public static int getScreenDpi(Context context) {
        return getDisplayMetrics(context).densityDpi;
    }

    public static String getPhoneMCCMNC(Context context) {
        String networkOperator;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null || (networkOperator = telephonyManager.getNetworkOperator()) == null || networkOperator.length() < 3) {
                return null;
            }
            return String.format("%s-%s", new Object[]{networkOperator.substring(0, 3), networkOperator.substring(3)});
        } catch (Exception e2) {
            Logger.log((Throwable) e2);
            return null;
        }
    }

    public static String getPhoneOperator(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
            return null;
        } catch (Exception e2) {
            Logger.log((Throwable) e2);
            return null;
        }
    }

    private static ConnectionType getMobileNetworkType(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 0:
                return ConnectionType.CONNECTION_TYPE_CELLULAR_NETWORK_UNKNOWN;
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return ConnectionType.CONNECTION_TYPE_CELLULAR_NETWORK_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return ConnectionType.CONNECTION_TYPE_CELLULAR_NETWORK_3G;
            case 20:
                return ConnectionType.CONNECTION_TYPE_CELLULAR_NETWORK_5G;
            default:
                return ConnectionType.CONNECTION_TYPE_CELLULAR_NETWORK_4G;
        }
    }
}
