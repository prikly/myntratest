package com.adcolony.sdk;

import android.os.Bundle;
import java.util.HashMap;

class r0 {

    /* renamed from: a  reason: collision with root package name */
    private static int f10267a;

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<String, Integer> f10268b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static HashMap<String, Integer> f10269c = new HashMap<>();

    static boolean a(int i, Bundle bundle) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i != 0) {
            if (i != 1 || bundle == null) {
                return false;
            }
            String string = bundle.getString("zone_id");
            if (f10268b.get(string) == null) {
                f10268b.put(string, Integer.valueOf(currentTimeMillis));
            }
            if (f10269c.get(string) == null) {
                f10269c.put(string, 0);
            }
            if (currentTimeMillis - f10268b.get(string).intValue() > 1) {
                f10269c.put(string, 1);
                f10268b.put(string, Integer.valueOf(currentTimeMillis));
                return false;
            }
            int intValue = f10269c.get(string).intValue() + 1;
            f10269c.put(string, Integer.valueOf(intValue));
            return intValue > 3;
        } else if (currentTimeMillis - f10267a < 5) {
            return true;
        } else {
            f10267a = currentTimeMillis;
            return false;
        }
    }
}
