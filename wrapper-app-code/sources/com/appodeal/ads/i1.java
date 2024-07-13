package com.appodeal.ads;

import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;

public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f16480a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16481b;

    public i1(String str, String str2) {
        this.f16480a = str;
        this.f16481b = str2;
    }

    public final void a() {
        a((String) null);
    }

    public final void a(String str) {
        String str2;
        String str3 = this.f16480a;
        if (TextUtils.isEmpty(str)) {
            str2 = this.f16481b;
        } else {
            str2 = String.format("%s. %s", new Object[]{this.f16481b, str});
        }
        Log.log(LogConstants.KEY_SDK_PUBLIC, str3, str2, Log.LogLevel.verbose);
    }

    public final void b(String str) {
        Log.log(LogConstants.KEY_SDK_PUBLIC, this.f16480a, String.format("%s. Error during executing method - %s", new Object[]{this.f16481b, str}), Log.LogLevel.verbose);
    }
}
