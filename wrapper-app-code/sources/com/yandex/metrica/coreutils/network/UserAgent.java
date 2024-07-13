package com.yandex.metrica.coreutils.network;

import android.os.Build;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/metrica/coreutils/network/UserAgent;", "", "()V", "formDeviceName", "", "getFor", "sdkName", "versionName", "buildNumber", "core-utils_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: UserAgent.kt */
public final class UserAgent {
    public static final UserAgent INSTANCE = new UserAgent();

    private UserAgent() {
    }

    public static final String getFor(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "sdkName");
        Intrinsics.checkNotNullParameter(str2, "versionName");
        Intrinsics.checkNotNullParameter(str3, "buildNumber");
        return str + '/' + str2 + '.' + str3 + " (" + INSTANCE.formDeviceName() + "; Android " + Build.VERSION.RELEASE + ')';
    }

    private final String formDeviceName() {
        String str;
        String str2 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str2, "Build.MODEL");
        String str3 = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str3, "Build.MANUFACTURER");
        if (StringsKt.startsWith$default(str2, str3, false, 2, (Object) null)) {
            str = Build.MODEL;
        } else {
            str = Build.MANUFACTURER + " " + Build.MODEL;
        }
        Intrinsics.checkNotNullExpressionValue(str, "if (Build.MODEL.startsWi…\" + Build.MODEL\n        }");
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
        return StringsKt.capitalize(str, locale);
    }
}
