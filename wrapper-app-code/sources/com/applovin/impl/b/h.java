package com.applovin.impl.b;

import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.v;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final String f14302a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14303b;

    private h(String str, String str2) {
        this.f14302a = str;
        this.f14303b = str2;
    }

    public static h a(s sVar, n nVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (nVar != null) {
            try {
                return new h(sVar.b().get("apiFramework"), sVar.c());
            } catch (Throwable th) {
                nVar.D();
                if (!v.a()) {
                    return null;
                }
                nVar.D().b("VastJavaScriptResource", "Error occurred while initializing", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public String a() {
        return this.f14302a;
    }

    public String b() {
        return this.f14303b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f14302a;
        if (str == null ? hVar.f14302a != null : !str.equals(hVar.f14302a)) {
            return false;
        }
        String str2 = this.f14303b;
        String str3 = hVar.f14303b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f14302a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f14303b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.f14302a + '\'' + ", javascriptResourceUrl='" + this.f14303b + '\'' + '}';
    }
}
