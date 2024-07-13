package io.bidmachine;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import io.bidmachine.utils.DeviceUtils;
import java.util.concurrent.atomic.AtomicBoolean;

public class UserAgentProvider {
    private static String defaultHttpAgent;
    private static String generatedUserAgent;
    /* access modifiers changed from: private */
    public static String webUserAgent;
    private static final AtomicBoolean webUserAgentProcessed = new AtomicBoolean(false);

    static {
        try {
            defaultHttpAgent = System.getProperty("http.agent", "");
        } catch (Throwable unused) {
        }
    }

    public static void initialize(Context context) {
        findWebUserAgent(context);
    }

    public static String getUserAgent(Context context) {
        if (webUserAgent == null) {
            findWebUserAgent(context);
        }
        if (!TextUtils.isEmpty(webUserAgent)) {
            return webUserAgent;
        }
        if (generatedUserAgent == null) {
            generatedUserAgent = UserAgentCreator.create(context);
        }
        if (!TextUtils.isEmpty(generatedUserAgent)) {
            return generatedUserAgent;
        }
        return defaultHttpAgent;
    }

    private static void findWebUserAgent(Context context) {
        if (Build.VERSION.SDK_INT >= 17 && webUserAgentProcessed.compareAndSet(false, true)) {
            final Context applicationContext = context.getApplicationContext();
            new Thread(new Runnable() {
                public void run() {
                    try {
                        String unused = UserAgentProvider.webUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
                    } catch (Throwable unused2) {
                    }
                }
            }).start();
        }
    }

    private static class UserAgentCreator {
        private UserAgentCreator() {
        }

        /* access modifiers changed from: private */
        public static String create(Context context) {
            try {
                StringBuilder sb = new StringBuilder("Mozilla/5.0");
                sb.append(" (Linux; Android ");
                sb.append(DeviceUtils.getOsVersion());
                sb.append("; ");
                sb.append(DeviceUtils.getModel());
                sb.append(" Build/");
                sb.append(DeviceUtils.getBuildId());
                sb.append("; wv)");
                sb.append(" AppleWebKit/537.36 (KHTML, like Gecko)");
                sb.append(" Version/4.0");
                PackageManager packageManager = context.getPackageManager();
                appendChromeToUserAgent(packageManager, sb);
                appendMobileToUserAgent(context, packageManager, sb);
                return sb.toString();
            } catch (Throwable unused) {
                return "";
            }
        }

        private static void appendChromeToUserAgent(PackageManager packageManager, StringBuilder sb) {
            String[] strArr = {"com.android.chrome", "com.google.android.webview", "com.android.webview"};
            int i = 0;
            while (i < 3) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(strArr[i], 0);
                    sb.append(" Chrome/");
                    sb.append(packageInfo.versionName);
                    return;
                } catch (Throwable unused) {
                    i++;
                }
            }
        }

        private static void appendMobileToUserAgent(Context context, PackageManager packageManager, StringBuilder sb) {
            String str;
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                sb.append(" Mobile");
                sb.append(" ");
                if (applicationInfo.labelRes == 0) {
                    str = applicationInfo.nonLocalizedLabel.toString();
                } else {
                    str = context.getString(applicationInfo.labelRes);
                }
                sb.append(str);
                sb.append("/");
                sb.append(packageInfo.versionName);
            } catch (Throwable unused) {
            }
        }
    }
}
