package com.iab.omid.library.adcolony.d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.adcolony.a;

public final class c {
    public static void a(String str) {
        if (a.f7419a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    public static void a(String str, Exception exc) {
        if ((a.f7419a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}