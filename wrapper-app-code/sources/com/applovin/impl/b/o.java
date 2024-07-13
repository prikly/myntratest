package com.applovin.impl.b;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.v;
import io.bidmachine.utils.IabUtils;
import java.util.Locale;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private Uri f14335a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f14336b;

    /* renamed from: c  reason: collision with root package name */
    private a f14337c;

    /* renamed from: d  reason: collision with root package name */
    private String f14338d;

    /* renamed from: e  reason: collision with root package name */
    private int f14339e;

    /* renamed from: f  reason: collision with root package name */
    private int f14340f;

    /* renamed from: g  reason: collision with root package name */
    private int f14341g;

    public enum a {
        Progressive,
        Streaming
    }

    private o() {
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    public static o a(s sVar, n nVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (nVar != null) {
            try {
                String c2 = sVar.c();
                if (URLUtil.isValidUrl(c2)) {
                    Uri parse = Uri.parse(c2);
                    o oVar = new o();
                    oVar.f14335a = parse;
                    oVar.f14336b = parse;
                    oVar.f14341g = StringUtils.parseInt(sVar.b().get("bitrate"));
                    oVar.f14337c = a(sVar.b().get("delivery"));
                    oVar.f14340f = StringUtils.parseInt(sVar.b().get(IabUtils.KEY_HEIGHT));
                    oVar.f14339e = StringUtils.parseInt(sVar.b().get(IabUtils.KEY_WIDTH));
                    oVar.f14338d = sVar.b().get("type").toLowerCase(Locale.ENGLISH);
                    return oVar;
                }
                nVar.D();
                if (!v.a()) {
                    return null;
                }
                nVar.D().e("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            } catch (Throwable th) {
                nVar.D();
                if (!v.a()) {
                    return null;
                }
                nVar.D().b("VastVideoFile", "Error occurred while initializing", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public Uri a() {
        return this.f14335a;
    }

    public void a(Uri uri) {
        this.f14336b = uri;
    }

    public Uri b() {
        return this.f14336b;
    }

    public String c() {
        return this.f14338d;
    }

    public int d() {
        return this.f14341g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f14339e != oVar.f14339e || this.f14340f != oVar.f14340f || this.f14341g != oVar.f14341g) {
            return false;
        }
        Uri uri = this.f14335a;
        if (uri == null ? oVar.f14335a != null : !uri.equals(oVar.f14335a)) {
            return false;
        }
        Uri uri2 = this.f14336b;
        if (uri2 == null ? oVar.f14336b != null : !uri2.equals(oVar.f14336b)) {
            return false;
        }
        if (this.f14337c != oVar.f14337c) {
            return false;
        }
        String str = this.f14338d;
        String str2 = oVar.f14338d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f14335a;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f14336b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f14337c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f14338d;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((hashCode3 + i) * 31) + this.f14339e) * 31) + this.f14340f) * 31) + this.f14341g;
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f14335a + ", videoUri=" + this.f14336b + ", deliveryType=" + this.f14337c + ", fileType='" + this.f14338d + '\'' + ", width=" + this.f14339e + ", height=" + this.f14340f + ", bitrate=" + this.f14341g + '}';
    }
}
