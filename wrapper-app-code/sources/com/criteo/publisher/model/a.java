package com.criteo.publisher.model;

import com.criteo.publisher.l0.d.c;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* compiled from: $AutoValue_CdbRequest */
abstract class a extends o {

    /* renamed from: a  reason: collision with root package name */
    private final String f2707a;

    /* renamed from: b  reason: collision with root package name */
    private final v f2708b;

    /* renamed from: c  reason: collision with root package name */
    private final z f2709c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2710d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2711e;

    /* renamed from: f  reason: collision with root package name */
    private final c f2712f;

    /* renamed from: g  reason: collision with root package name */
    private final List<q> f2713g;

    a(String str, v vVar, z zVar, String str2, int i, c cVar, List<q> list) {
        if (str != null) {
            this.f2707a = str;
            if (vVar != null) {
                this.f2708b = vVar;
                if (zVar != null) {
                    this.f2709c = zVar;
                    if (str2 != null) {
                        this.f2710d = str2;
                        this.f2711e = i;
                        this.f2712f = cVar;
                        if (list != null) {
                            this.f2713g = list;
                            return;
                        }
                        throw new NullPointerException("Null slots");
                    }
                    throw new NullPointerException("Null sdkVersion");
                }
                throw new NullPointerException("Null user");
            }
            throw new NullPointerException("Null publisher");
        }
        throw new NullPointerException("Null id");
    }

    public String b() {
        return this.f2707a;
    }

    public v d() {
        return this.f2708b;
    }

    public z g() {
        return this.f2709c;
    }

    public String e() {
        return this.f2710d;
    }

    public int c() {
        return this.f2711e;
    }

    @SerializedName("gdprConsent")
    public c a() {
        return this.f2712f;
    }

    public List<q> f() {
        return this.f2713g;
    }

    public String toString() {
        return "CdbRequest{id=" + this.f2707a + ", publisher=" + this.f2708b + ", user=" + this.f2709c + ", sdkVersion=" + this.f2710d + ", profileId=" + this.f2711e + ", gdprData=" + this.f2712f + ", slots=" + this.f2713g + "}";
    }

    public boolean equals(Object obj) {
        c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f2707a.equals(oVar.b()) || !this.f2708b.equals(oVar.d()) || !this.f2709c.equals(oVar.g()) || !this.f2710d.equals(oVar.e()) || this.f2711e != oVar.c() || ((cVar = this.f2712f) != null ? !cVar.equals(oVar.a()) : oVar.a() != null) || !this.f2713g.equals(oVar.f())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((((((this.f2707a.hashCode() ^ 1000003) * 1000003) ^ this.f2708b.hashCode()) * 1000003) ^ this.f2709c.hashCode()) * 1000003) ^ this.f2710d.hashCode()) * 1000003) ^ this.f2711e) * 1000003;
        c cVar = this.f2712f;
        return ((hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003) ^ this.f2713g.hashCode();
    }
}
