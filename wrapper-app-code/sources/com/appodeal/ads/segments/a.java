package com.appodeal.ads.segments;

import com.appodeal.ads.m;

public final /* synthetic */ class a {
    public static int a(String str) {
        for (int i : m.b(2)) {
            if (a(i).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return 0;
    }

    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "AND";
        }
        if (i == 2) {
            return "OR";
        }
        throw null;
    }
}
