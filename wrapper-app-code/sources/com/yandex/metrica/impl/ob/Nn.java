package com.yandex.metrica.impl.ob;

class Nn implements Kn<Integer> {
    Nn() {
    }

    public In a(Integer num) {
        if (num == null || num.intValue() > 0) {
            return In.a(this);
        }
        return In.a(this, "Invalid quantity value " + num);
    }
}
