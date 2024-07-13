package com.applovin.sdk;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import io.bidmachine.ads.networks.amazon.BuildConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppLovinSdkUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f16092a = new Handler(Looper.getMainLooper());

    public static final class Size {
        public static final Size ZERO = new Size(0, 0);

        /* renamed from: a  reason: collision with root package name */
        private int f16093a;

        /* renamed from: b  reason: collision with root package name */
        private int f16094b;

        private Size() {
        }

        public Size(int i, int i2) {
            this.f16093a = i;
            this.f16094b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Size)) {
                return false;
            }
            Size size = (Size) obj;
            return this.f16093a == size.getWidth() && this.f16094b == size.getHeight();
        }

        public int getHeight() {
            return this.f16094b;
        }

        public int getWidth() {
            return this.f16093a;
        }

        public int hashCode() {
            int i = this.f16094b;
            int i2 = this.f16093a;
            return i ^ ((i2 >>> 16) | (i2 << 16));
        }

        public String toString() {
            return this.f16093a + "x" + this.f16094b;
        }
    }

    private static boolean a(String str, String str2) {
        for (String startsWith : CollectionUtils.explode(str2)) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static int dpToPx(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static int getOrientation(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return 0;
        }
        return configuration.orientation;
    }

    public static boolean isEmulator() {
        return a(Build.DEVICE, "goldfish,vbox") || a(Build.HARDWARE, "ranchu,generic,vbox") || a(Build.MANUFACTURER, "Genymotion") || a(Build.MODEL, "Android SDK built for x86");
    }

    public static boolean isFireOS(Context context) {
        return BuildConfig.ADAPTER_NAME.equalsIgnoreCase(Build.MANUFACTURER) || isFireTv(context);
    }

    public static boolean isFireTv(Context context) {
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    public static boolean isSdkVersionGreaterThanOrEqualTo(String str) {
        return AppLovinSdk.VERSION_CODE >= Utils.toVersionCode(str);
    }

    public static boolean isTablet(Context context) {
        Point a2 = h.a(context);
        return Math.min(a2.x, a2.y) >= dpToPx(context, 600);
    }

    public static boolean isTv(Context context) {
        if (isFireTv(context)) {
            return true;
        }
        return context.getPackageManager().hasSystemFeature(h.d() ? "android.software.leanback" : "android.hardware.type.television");
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static int pxToDp(Context context, int i) {
        return (int) Math.ceil((double) (((float) i) / context.getResources().getDisplayMetrics().density));
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(false, runnable);
    }

    public static void runOnUiThread(boolean z, Runnable runnable) {
        if (z || !Utils.isMainThread()) {
            f16092a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j) {
        runOnUiThreadDelayed(runnable, j, f16092a);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j, Handler handler) {
        if (j > 0) {
            handler.postDelayed(runnable, j);
        } else if (Utils.isMainThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static Map<String, String> toMap(JSONObject jSONObject) throws JSONException {
        return JsonUtils.toStringMap(jSONObject);
    }
}
