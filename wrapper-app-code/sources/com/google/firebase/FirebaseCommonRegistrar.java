package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.KotlinDetector;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public List<Component<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DefaultUserAgentPublisher.component());
        arrayList.add(DefaultHeartBeatController.component());
        arrayList.add(LibraryVersionComponent.create("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(LibraryVersionComponent.create("fire-core", "20.2.0"));
        arrayList.add(LibraryVersionComponent.create("device-name", safeValue(Build.PRODUCT)));
        arrayList.add(LibraryVersionComponent.create("device-model", safeValue(Build.DEVICE)));
        arrayList.add(LibraryVersionComponent.create("device-brand", safeValue(Build.BRAND)));
        arrayList.add(LibraryVersionComponent.fromContext("android-target-sdk", $$Lambda$FirebaseCommonRegistrar$MJj2GWKO_yLkSyf6AZfNviARrgQ.INSTANCE));
        arrayList.add(LibraryVersionComponent.fromContext("android-min-sdk", $$Lambda$FirebaseCommonRegistrar$pGT1RcP4RapBpOq2V73IRqI1I.INSTANCE));
        arrayList.add(LibraryVersionComponent.fromContext("android-platform", $$Lambda$FirebaseCommonRegistrar$OMGxGzs72JnsFA__aYRvT3a3SZo.INSTANCE));
        arrayList.add(LibraryVersionComponent.fromContext("android-installer", $$Lambda$FirebaseCommonRegistrar$0SsttI_xA8sAI74ZXlgAQ_rvhA.INSTANCE));
        String detectVersion = KotlinDetector.detectVersion();
        if (detectVersion != null) {
            arrayList.add(LibraryVersionComponent.create("kotlin", detectVersion));
        }
        return arrayList;
    }

    static /* synthetic */ String lambda$getComponents$0(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    static /* synthetic */ String lambda$getComponents$1(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    static /* synthetic */ String lambda$getComponents$2(Context context) {
        if (Build.VERSION.SDK_INT >= 16 && context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (Build.VERSION.SDK_INT >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (Build.VERSION.SDK_INT < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
        }
        return "auto";
    }

    static /* synthetic */ String lambda$getComponents$3(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? safeValue(installerPackageName) : "";
    }

    private static String safeValue(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }
}
