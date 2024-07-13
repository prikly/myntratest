package com.applovin.impl.b;

import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.v;
import com.unity3d.ads.metadata.MediationMetaData;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private String f14312a;

    /* renamed from: b  reason: collision with root package name */
    private String f14313b;

    private j() {
    }

    public static j a(s sVar, j jVar, n nVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (nVar != null) {
            if (jVar == null) {
                try {
                    jVar = new j();
                } catch (Throwable th) {
                    nVar.D();
                    if (!v.a()) {
                        return null;
                    }
                    nVar.D().b("VastSystemInfo", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (!StringUtils.isValidString(jVar.f14312a)) {
                String c2 = sVar.c();
                if (StringUtils.isValidString(c2)) {
                    jVar.f14312a = c2;
                }
            }
            if (!StringUtils.isValidString(jVar.f14313b)) {
                String str = sVar.b().get(MediationMetaData.KEY_VERSION);
                if (StringUtils.isValidString(str)) {
                    jVar.f14313b = str;
                }
            }
            return jVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        String str = this.f14312a;
        if (str == null ? jVar.f14312a != null : !str.equals(jVar.f14312a)) {
            return false;
        }
        String str2 = this.f14313b;
        String str3 = jVar.f14313b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f14312a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f14313b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.f14312a + '\'' + ", version='" + this.f14313b + '\'' + '}';
    }
}
