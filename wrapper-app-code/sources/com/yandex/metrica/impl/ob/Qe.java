package com.yandex.metrica.impl.ob;

public class Qe implements Kn<String> {
    public In a(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return In.a(this, "key is null");
        }
        if (str.startsWith("appmetrica")) {
            return In.a(this, "key starts with appmetrica");
        }
        if (str.length() > 200) {
            return In.a(this, "key length more then 200 characters");
        }
        return In.a(this);
    }
}
