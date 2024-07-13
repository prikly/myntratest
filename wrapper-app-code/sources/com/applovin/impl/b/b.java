package com.applovin.impl.b;

import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f14270a;

    /* renamed from: b  reason: collision with root package name */
    private final List<h> f14271b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14272c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<k> f14273d;

    private b(String str, List<h> list, String str2, Set<k> set) {
        this.f14270a = str;
        this.f14271b = list;
        this.f14272c = str2;
        this.f14273d = set;
    }

    public static b a(s sVar, e eVar, n nVar) {
        try {
            String str = sVar.b().get("vendor");
            s c2 = sVar.c("VerificationParameters");
            String c3 = c2 != null ? c2.c() : null;
            List<s> a2 = sVar.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(a2.size());
            for (s a3 : a2) {
                h a4 = h.a(a3, nVar);
                if (a4 != null) {
                    arrayList.add(a4);
                }
            }
            Map map = CollectionUtils.map();
            m.a(sVar, (Map<String, Set<k>>) map, eVar, nVar);
            return new b(str, arrayList, c3, (Set) map.get("verificationNotExecuted"));
        } catch (Throwable th) {
            nVar.D();
            if (v.a()) {
                nVar.D().b("VastAdVerification", "Error occurred while initializing", th);
            }
            return null;
        }
    }

    public String a() {
        return this.f14270a;
    }

    public List<h> b() {
        return this.f14271b;
    }

    public String c() {
        return this.f14272c;
    }

    public Set<k> d() {
        return this.f14273d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f14270a;
        if (str == null ? bVar.f14270a != null : !str.equals(bVar.f14270a)) {
            return false;
        }
        List<h> list = this.f14271b;
        if (list == null ? bVar.f14271b != null : !list.equals(bVar.f14271b)) {
            return false;
        }
        String str2 = this.f14272c;
        if (str2 == null ? bVar.f14272c != null : !str2.equals(bVar.f14272c)) {
            return false;
        }
        Set<k> set = this.f14273d;
        Set<k> set2 = bVar.f14273d;
        return set != null ? set.equals(set2) : set2 == null;
    }

    public int hashCode() {
        String str = this.f14270a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<h> list = this.f14271b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f14272c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set<k> set = this.f14273d;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f14270a + '\'' + "javascriptResources='" + this.f14271b + '\'' + "verificationParameters='" + this.f14272c + '\'' + "errorEventTrackers='" + this.f14273d + '\'' + '}';
    }
}
