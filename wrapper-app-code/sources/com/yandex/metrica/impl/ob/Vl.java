package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.coreutils.logger.BaseLogger;
import java.util.Locale;

public abstract class Vl extends BaseLogger {

    /* renamed from: b  reason: collision with root package name */
    private static String f5238b = "";

    /* renamed from: a  reason: collision with root package name */
    private final String f5239a;

    public Vl(String str) {
        super(false);
        this.f5239a = "[" + A2.a(str) + "] ";
    }

    public static void a(Context context) {
        f5238b = "[" + context.getPackageName() + "] : ";
    }

    /* access modifiers changed from: protected */
    public String formatMessage(String str, Object[] objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public String getPrefix() {
        String str = f5238b;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = this.f5239a;
        if (str3 != null) {
            str2 = str3;
        }
        return str + str2;
    }
}
