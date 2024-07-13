package com.applovin.impl.mediation.a;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private final h f14452a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14453b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14454c;

    /* renamed from: d  reason: collision with root package name */
    private final String f14455d;

    /* renamed from: e  reason: collision with root package name */
    private final String f14456e;

    public interface a {
        void a(g gVar);
    }

    private g(h hVar, com.applovin.impl.mediation.g gVar, String str, String str2) {
        String str3;
        this.f14452a = hVar;
        this.f14455d = str;
        this.f14456e = str2;
        if (gVar != null) {
            this.f14453b = gVar.h();
            str3 = gVar.i();
        } else {
            str3 = null;
            this.f14453b = null;
        }
        this.f14454c = str3;
    }

    public static g a(h hVar, com.applovin.impl.mediation.g gVar, String str) {
        if (hVar == null) {
            throw new IllegalArgumentException("No spec specified");
        } else if (gVar != null) {
            return new g(hVar, gVar, str, (String) null);
        } else {
            throw new IllegalArgumentException("No adapterWrapper specified");
        }
    }

    public static g a(h hVar, String str) {
        return b(hVar, (com.applovin.impl.mediation.g) null, str);
    }

    public static g b(h hVar, com.applovin.impl.mediation.g gVar, String str) {
        if (hVar != null) {
            return new g(hVar, gVar, (String) null, str);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public h a() {
        return this.f14452a;
    }

    public String b() {
        return this.f14453b;
    }

    public String c() {
        return this.f14454c;
    }

    public String d() {
        return this.f14455d;
    }

    public String e() {
        return this.f14456e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f14452a);
        sb.append(", mSdkVersion='");
        sb.append(this.f14453b);
        sb.append('\'');
        sb.append(", mAdapterVersion='");
        sb.append(this.f14454c);
        sb.append('\'');
        sb.append(", mSignalDataLength='");
        String str = this.f14455d;
        sb.append(str != null ? str.length() : 0);
        sb.append('\'');
        sb.append(", mErrorMessage=");
        sb.append(this.f14456e);
        sb.append('}');
        return sb.toString();
    }
}
