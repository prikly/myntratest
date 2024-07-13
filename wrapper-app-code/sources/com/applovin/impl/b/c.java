package com.applovin.impl.b;

import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.v;
import java.util.ArrayList;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f14274a;

    private c(List<b> list) {
        this.f14274a = list;
    }

    public static c a(s sVar, c cVar, e eVar, n nVar) {
        List list;
        if (cVar != null) {
            try {
                list = cVar.a();
            } catch (Throwable th) {
                nVar.D();
                if (!v.a()) {
                    return null;
                }
                nVar.D().b("VastAdVerifications", "Error occurred while initializing", th);
                return null;
            }
        } else {
            list = new ArrayList();
        }
        for (s a2 : sVar.a("Verification")) {
            b a3 = b.a(a2, eVar, nVar);
            if (a3 != null) {
                list.add(a3);
            }
        }
        return new c(list);
    }

    public List<b> a() {
        return this.f14274a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f14274a.equals(((c) obj).f14274a);
    }

    public int hashCode() {
        return this.f14274a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f14274a + '\'' + '}';
    }
}
