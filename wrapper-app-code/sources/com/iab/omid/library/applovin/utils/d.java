package com.iab.omid.library.applovin.utils;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.applovin.a;

public final class d {
    public static void a(String str) {
        if (a.f7633a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    public static void a(String str, Exception exc) {
        if ((a.f7633a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
