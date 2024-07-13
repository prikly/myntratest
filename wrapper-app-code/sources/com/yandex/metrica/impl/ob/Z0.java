package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Map;

public class Z0 {

    static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static String a(int i) {
        Map<String, Integer> map = C0395g2.f5839a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : C0395g2.f5839a.entrySet()) {
            if (((Integer) next.getValue()).intValue() == i) {
                arrayList.add(next.getKey());
            }
        }
        if (arrayList.size() == 1) {
            return (String) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        }
        return String.format("One of %s", new Object[]{arrayList});
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
