package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Fd implements C0797wd {

    /* renamed from: a  reason: collision with root package name */
    private Set<String> f4004a;

    public Fd(List<Bd> list) {
        if (list == null) {
            this.f4004a = new HashSet();
            return;
        }
        this.f4004a = new HashSet(list.size());
        for (Bd next : list) {
            if (next.f3765b) {
                this.f4004a.add(next.f3764a);
            }
        }
    }

    public boolean a(String str) {
        return this.f4004a.contains(str);
    }

    public String toString() {
        return "StartupBasedPermissionStrategy{mEnabledPermissions=" + this.f4004a + '}';
    }
}
