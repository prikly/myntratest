package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* compiled from: NetworkUtils */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private static p f19261a;

    public static boolean a(Context context) {
        NetworkInfo[] allNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (!(connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null)) {
                for (NetworkInfo networkInfo : allNetworkInfo) {
                    if (networkInfo.getState() == NetworkInfo.State.CONNECTED || networkInfo.getState() == NetworkInfo.State.CONNECTING) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static int b(Context context) {
        int c2 = c(context);
        if (c2 == 1) {
            return 0;
        }
        if (c2 == 4) {
            return 1;
        }
        if (c2 == 5) {
            return 4;
        }
        if (c2 != 6) {
            return c2;
        }
        return 6;
    }

    public static int c(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            if (!activeNetworkInfo.isAvailable()) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (telephonyManager.getNetworkType()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
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
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        if (f19261a == null || !f19261a.a(context, telephonyManager)) {
                            return 5;
                        }
                        return 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        if (TextUtils.isEmpty(subtypeName) || (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000"))) {
                            return 1;
                        }
                        return 3;
                }
            } else if (type != 1) {
                return 1;
            } else {
                return 4;
            }
        } catch (Throwable unused) {
            return 1;
        }
    }

    public static boolean d(Context context) {
        return c(context) == 4;
    }

    public static boolean e(Context context) {
        return c(context) == 5;
    }

    public static boolean f(Context context) {
        return c(context) == 6;
    }

    public static String g(Context context) {
        int c2 = c(context);
        if (c2 == 2) {
            return "2g";
        }
        if (c2 == 3) {
            return "3g";
        }
        if (c2 == 4) {
            return "wifi";
        }
        if (c2 != 5) {
            return c2 != 6 ? "mobile" : "5g";
        }
        return "4g";
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"));
    }
}
