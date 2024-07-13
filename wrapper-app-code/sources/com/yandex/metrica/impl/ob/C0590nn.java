package com.yandex.metrica.impl.ob;

import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/yandex/metrica/impl/ob/nn;", "", "Landroid/content/pm/PackageManager;", "packageManager", "", "packageName", "a", "(Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, k = 1, mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.impl.ob.nn  reason: case insensitive filesystem */
public final class C0590nn {

    /* renamed from: a  reason: collision with root package name */
    public static final C0590nn f6359a = new C0590nn();

    private C0590nn() {
    }

    public static final String a(PackageManager packageManager, String str) {
        InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(str);
        Intrinsics.checkNotNullExpressionValue(installSourceInfo, "packageManager.getInstallSourceInfo(packageName)");
        return installSourceInfo.getInstallingPackageName();
    }
}
