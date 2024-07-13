package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.UUID;

public class Ln implements Kn<String> {
    public In a(Object obj) {
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            return In.a(this, "ApiKey is empty. Please, read official documentation how to obtain one: https://yandex.com/dev/appmetrica/doc/mobile-sdk-dg/concepts/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return In.a(this);
        } catch (Throwable unused) {
            return In.a(this, "Invalid ApiKey=" + str + ". " + "Please, read official documentation how to obtain one:" + " " + "https://yandex.com/dev/appmetrica/doc/mobile-sdk-dg/concepts/android-initialize.html");
        }
    }
}
