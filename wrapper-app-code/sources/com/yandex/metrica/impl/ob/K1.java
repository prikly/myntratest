package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public class K1 {
    private Map<String, String> b(String str) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            int lastIndexOf = str.lastIndexOf(63);
            if (lastIndexOf >= 0) {
                str = str.substring(lastIndexOf + 1);
            }
            if (str.contains("=")) {
                for (String str2 : str.split("&")) {
                    int indexOf = str2.indexOf("=");
                    if (indexOf >= 0) {
                        hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                    } else {
                        hashMap.put(str2, "");
                    }
                }
            }
        }
        return hashMap;
    }

    public C0567n0 a(String str) {
        HashMap hashMap;
        String decode = Uri.decode((String) ((HashMap) b(str)).get("appmetrica_deep_link"));
        if (!TextUtils.isEmpty(decode)) {
            HashMap hashMap2 = (HashMap) b(decode);
            hashMap = new HashMap(hashMap2.size());
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put(Uri.decode((String) entry.getKey()), Uri.decode((String) entry.getValue()));
            }
        } else {
            hashMap = null;
        }
        return new C0567n0(decode, hashMap, str);
    }
}
