package com.applovin.impl.b;

import android.net.Uri;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.v;
import io.bidmachine.utils.IabUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private int f14275a;

    /* renamed from: b  reason: collision with root package name */
    private int f14276b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f14277c;

    /* renamed from: d  reason: collision with root package name */
    private i f14278d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<k> f14279e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Set<k>> f14280f = CollectionUtils.map();

    private d() {
    }

    public static d a(s sVar, d dVar, e eVar, n nVar) {
        s b2;
        if (sVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (nVar != null) {
            if (dVar == null) {
                try {
                    dVar = new d();
                } catch (Throwable th) {
                    nVar.D();
                    if (!v.a()) {
                        return null;
                    }
                    nVar.D().b("VastCompanionAd", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (dVar.f14275a == 0 && dVar.f14276b == 0) {
                int parseInt = StringUtils.parseInt(sVar.b().get(IabUtils.KEY_WIDTH));
                int parseInt2 = StringUtils.parseInt(sVar.b().get(IabUtils.KEY_HEIGHT));
                if (parseInt > 0 && parseInt2 > 0) {
                    dVar.f14275a = parseInt;
                    dVar.f14276b = parseInt2;
                }
            }
            dVar.f14278d = i.a(sVar, dVar.f14278d, nVar);
            if (dVar.f14277c == null && (b2 = sVar.b("CompanionClickThrough")) != null) {
                String c2 = b2.c();
                if (StringUtils.isValidString(c2)) {
                    dVar.f14277c = Uri.parse(c2);
                }
            }
            m.a(sVar.a("CompanionClickTracking"), dVar.f14279e, eVar, nVar);
            m.a(sVar, dVar.f14280f, eVar, nVar);
            return dVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public Uri a() {
        return this.f14277c;
    }

    public i b() {
        return this.f14278d;
    }

    public Set<k> c() {
        return this.f14279e;
    }

    public Map<String, Set<k>> d() {
        return this.f14280f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f14275a != dVar.f14275a || this.f14276b != dVar.f14276b) {
            return false;
        }
        Uri uri = this.f14277c;
        if (uri == null ? dVar.f14277c != null : !uri.equals(dVar.f14277c)) {
            return false;
        }
        i iVar = this.f14278d;
        if (iVar == null ? dVar.f14278d != null : !iVar.equals(dVar.f14278d)) {
            return false;
        }
        Set<k> set = this.f14279e;
        if (set == null ? dVar.f14279e != null : !set.equals(dVar.f14279e)) {
            return false;
        }
        Map<String, Set<k>> map = this.f14280f;
        Map<String, Set<k>> map2 = dVar.f14280f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i = ((this.f14275a * 31) + this.f14276b) * 31;
        Uri uri = this.f14277c;
        int i2 = 0;
        int hashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        i iVar = this.f14278d;
        int hashCode2 = (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        Set<k> set = this.f14279e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<k>> map = this.f14280f;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f14275a + ", height=" + this.f14276b + ", destinationUri=" + this.f14277c + ", nonVideoResource=" + this.f14278d + ", clickTrackers=" + this.f14279e + ", eventTrackers=" + this.f14280f + '}';
    }
}
