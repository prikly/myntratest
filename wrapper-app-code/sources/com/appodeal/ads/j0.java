package com.appodeal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appodeal.ads.modules.common.internal.data.ApplicationData;
import com.appodeal.ads.segments.n;
import com.appodeal.ads.storage.o;
import com.appodeal.ads.utils.Log;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j0 implements ApplicationData {

    /* renamed from: c  reason: collision with root package name */
    public static final j0 f16489c = new j0();

    /* renamed from: a  reason: collision with root package name */
    public final Lazy f16490a = LazyKt.lazy(a.f16492a);

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f16491b = CollectionsKt.listOf("com.android.vending", "com.google.android.feedback", "com.amazon.venezia");

    public static final class a extends Lambda implements Function0<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16492a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return o.f17407b;
        }
    }

    public final String getAppName() {
        return i0.f16472a;
    }

    public final String getBuildVersion() {
        String str = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(str, "RELEASE");
        return str;
    }

    public final String getFrameworkName() {
        return q4.f17053g;
    }

    public final String getFrameworkVersion() {
        return q4.i;
    }

    public final String getInstaller(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            Log.log(th);
            return null;
        }
    }

    public final String getPackageName(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return packageName;
    }

    public final String getPluginVersion() {
        return q4.f17054h;
    }

    public final String getSdkKey() {
        return ((com.appodeal.ads.storage.a) this.f16490a.getValue()).c();
    }

    public final String getSdkVersion() {
        return q4.n();
    }

    public final long getSegmentId() {
        return n.c().f17272a;
    }

    public final String getSessionUuid() {
        return q4.m().j();
    }

    public final String getTargetSdkVersion(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return String.valueOf(context.getApplicationInfo().targetSdkVersion);
    }

    public final long getUptime() {
        return q4.m().h();
    }

    public final long getUptimeMono() {
        return q4.m().i();
    }

    public final int getVersionCode(Context context) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullParameter(context, "context");
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            packageInfo = packageManager.getPackageInfo(packageName, 0);
        } catch (Throwable th) {
            Log.log(th);
            packageInfo = null;
        }
        if (packageInfo == null) {
            return 0;
        }
        return packageInfo.versionCode;
    }

    public final String getVersionName(Context context) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullParameter(context, "context");
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            packageInfo = packageManager.getPackageInfo(packageName, 0);
        } catch (Throwable th) {
            Log.log(th);
            packageInfo = null;
        }
        if (packageInfo == null) {
            return null;
        }
        return packageInfo.versionName;
    }

    public final boolean isAppodealInitialized() {
        return q4.f17049c;
    }

    public final boolean isAppodealInitializing() {
        return q4.f17048b;
    }

    public final boolean isSideLoaded(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String installer = getInstaller(context);
        return installer != null && this.f16491b.contains(installer);
    }

    public final boolean isTestMode() {
        return r0.f17086b;
    }
}
