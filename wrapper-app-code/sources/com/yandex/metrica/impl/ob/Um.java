package com.yandex.metrica.impl.ob;

public class Um implements Vm {

    /* renamed from: a  reason: collision with root package name */
    public final int f5197a;

    public Um(int i) {
        this.f5197a = i;
    }

    public int a() {
        return this.f5197a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f5197a + '}';
    }

    public static Vm a(Vm... vmArr) {
        int i = 0;
        for (Vm vm : vmArr) {
            if (vm != null) {
                i += vm.a();
            }
        }
        return new Um(i);
    }
}
