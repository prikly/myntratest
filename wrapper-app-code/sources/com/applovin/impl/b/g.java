package com.applovin.impl.b;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.v;
import io.bidmachine.utils.IabUtils;
import java.util.HashSet;
import java.util.Set;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final Set<k> f14296a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Set<k> f14297b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private Uri f14298c;

    /* renamed from: d  reason: collision with root package name */
    private Uri f14299d;

    /* renamed from: e  reason: collision with root package name */
    private int f14300e;

    /* renamed from: f  reason: collision with root package name */
    private int f14301f;

    public static g a(s sVar, n nVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (nVar != null) {
            s b2 = sVar.b("StaticResource");
            if (b2 == null || !URLUtil.isValidUrl(b2.c())) {
                nVar.D();
                if (!v.a()) {
                    return null;
                }
                nVar.D().e("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
                return null;
            }
            g gVar = new g();
            gVar.f14298c = Uri.parse(b2.c());
            s c2 = sVar.c("IconClickThrough");
            if (c2 != null && URLUtil.isValidUrl(c2.c())) {
                gVar.f14299d = Uri.parse(c2.c());
            }
            String str = sVar.b().get(IabUtils.KEY_WIDTH);
            int i = 0;
            int parseInt = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
            String str2 = sVar.b().get(IabUtils.KEY_HEIGHT);
            if (str2 != null && Integer.parseInt(str2) > 0) {
                i = Integer.parseInt(str2);
            }
            int intValue = ((Integer) nVar.a(b.ey)).intValue();
            if (parseInt <= 0 || i <= 0) {
                gVar.f14301f = intValue;
            } else {
                double d2 = (double) (((float) parseInt) / ((float) i));
                int min = Math.min(Math.max(parseInt, i), intValue);
                if (parseInt >= i) {
                    gVar.f14300e = min;
                    gVar.f14301f = (int) (((double) min) / d2);
                    return gVar;
                }
                gVar.f14301f = min;
                intValue = (int) (((double) min) * d2);
            }
            gVar.f14300e = intValue;
            return gVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public Uri a() {
        return this.f14298c;
    }

    public Uri b() {
        return this.f14299d;
    }

    public int c() {
        return this.f14300e;
    }

    public int d() {
        return this.f14301f;
    }

    public Set<k> e() {
        return this.f14296a;
    }

    public Set<k> f() {
        return this.f14297b;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + a() + "', clickUri='" + b() + "', width=" + c() + ", height=" + d() + "}";
    }
}
