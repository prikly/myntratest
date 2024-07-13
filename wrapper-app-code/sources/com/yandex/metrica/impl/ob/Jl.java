package com.yandex.metrica.impl.ob;

import android.os.Build;
import java.util.Set;

public class Jl {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f4386a;

    public Jl(Set<String> set) {
        this.f4386a = set;
    }

    public String a() {
        if (A2.a(21)) {
            String a2 = a(Build.SUPPORTED_64_BIT_ABIS);
            return a2 != null ? a2 : a(Build.SUPPORTED_32_BIT_ABIS);
        }
        return a(new String[]{Build.CPU_ABI, Build.CPU_ABI2});
    }

    private String a(String[] strArr) {
        for (String str : strArr) {
            if (this.f4386a.contains(str)) {
                return str;
            }
        }
        return null;
    }
}
