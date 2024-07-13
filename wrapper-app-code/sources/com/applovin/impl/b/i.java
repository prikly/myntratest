package com.applovin.impl.b;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.v;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private a f14304a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f14305b;

    /* renamed from: c  reason: collision with root package name */
    private String f14306c;

    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private i() {
    }

    static i a(s sVar, i iVar, n nVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (nVar != null) {
            if (iVar == null) {
                try {
                    iVar = new i();
                } catch (Throwable th) {
                    nVar.D();
                    if (!v.a()) {
                        return null;
                    }
                    nVar.D().b("VastNonVideoResource", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (iVar.f14305b == null && !StringUtils.isValidString(iVar.f14306c)) {
                String a2 = a(sVar, "StaticResource");
                if (URLUtil.isValidUrl(a2)) {
                    iVar.f14305b = Uri.parse(a2);
                    iVar.f14304a = a.STATIC;
                    return iVar;
                }
                String a3 = a(sVar, "IFrameResource");
                if (StringUtils.isValidString(a3)) {
                    iVar.f14304a = a.IFRAME;
                    if (URLUtil.isValidUrl(a3)) {
                        iVar.f14305b = Uri.parse(a3);
                    } else {
                        iVar.f14306c = a3;
                    }
                    return iVar;
                }
                String a4 = a(sVar, "HTMLResource");
                if (StringUtils.isValidString(a4)) {
                    iVar.f14304a = a.HTML;
                    if (URLUtil.isValidUrl(a4)) {
                        iVar.f14305b = Uri.parse(a4);
                    } else {
                        iVar.f14306c = a4;
                    }
                }
            }
            return iVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    private static String a(s sVar, String str) {
        s b2 = sVar.b(str);
        if (b2 != null) {
            return b2.c();
        }
        return null;
    }

    public a a() {
        return this.f14304a;
    }

    public void a(Uri uri) {
        this.f14305b = uri;
    }

    public void a(String str) {
        this.f14306c = str;
    }

    public Uri b() {
        return this.f14305b;
    }

    public String c() {
        return this.f14306c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f14304a != iVar.f14304a) {
            return false;
        }
        Uri uri = this.f14305b;
        if (uri == null ? iVar.f14305b != null : !uri.equals(iVar.f14305b)) {
            return false;
        }
        String str = this.f14306c;
        String str2 = iVar.f14306c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        a aVar = this.f14304a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f14305b;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f14306c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f14304a + ", resourceUri=" + this.f14305b + ", resourceContents='" + this.f14306c + '\'' + '}';
    }
}
