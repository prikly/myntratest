package com.criteo.publisher.h0;

import com.criteo.publisher.i0.a;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.model.s;
import com.criteo.publisher.n0.o;
import com.criteo.publisher.n0.p;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* compiled from: MoPubHeaderBidding */
public class e implements d {

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f2534b = Arrays.asList(new String[]{"crt_cpm", "crt_displayUrl", "crt_size", "crt_format"});

    /* renamed from: a  reason: collision with root package name */
    public final g f2535a = h.b(getClass());

    public boolean b(Object obj) {
        return p.b(obj, "com.mopub.mobileads.MoPubView") || p.b(obj, "com.mopub.mobileads.MoPubInterstitial") || p.b(obj, "com.mopub.mobileads.MoPubRewardedAdManager$RequestParameters");
    }

    public a a() {
        return a.MOPUB_APP_BIDDING;
    }

    public void a(Object obj) {
        String c2;
        if (b(obj) && (c2 = c(obj)) != null) {
            a(obj, b(c2));
        }
    }

    private String b(String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split(",")) {
            if (!a(str2)) {
                sb.append(str2);
                sb.append(",");
            }
        }
        return sb.toString().replaceAll(",$", "");
    }

    private boolean a(String str) {
        for (String str2 : f2534b) {
            if (str.startsWith(str2 + ":")) {
                return true;
            }
        }
        return false;
    }

    public void a(Object obj, com.criteo.publisher.n0.a aVar, s sVar) {
        String str;
        if (b(obj)) {
            String d2 = sVar.d();
            if (sVar.p()) {
                d2 = c(d2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("crt_cpm");
            sb.append(":");
            sb.append(sVar.a());
            sb.append(",");
            sb.append("crt_displayUrl");
            sb.append(":");
            sb.append(d2);
            if (aVar == com.criteo.publisher.n0.a.CRITEO_BANNER) {
                sb.append(",");
                sb.append("crt_size");
                sb.append(":");
                sb.append(sVar.k());
                sb.append("x");
                sb.append(sVar.e());
            }
            if (sVar.p()) {
                sb.append(",");
                sb.append("crt_format");
                sb.append(":");
                sb.append("video");
            }
            String c2 = c(obj);
            if (c2 != null) {
                str = c2 + "," + sb;
            } else {
                str = sb.toString();
            }
            a(obj, str);
            this.f2535a.a(a.a(a(), sb.toString()));
        }
    }

    /* access modifiers changed from: package-private */
    public String c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLEncoder.encode(str, Charset.forName("UTF-8").name());
        } catch (UnsupportedEncodingException e2) {
            o.a((Throwable) e2);
            return null;
        }
    }

    private String c(Object obj) {
        if (p.b(obj, "com.mopub.mobileads.MoPubView") || p.b(obj, "com.mopub.mobileads.MoPubInterstitial")) {
            return (String) p.a(obj, "getKeywords", new Object[0]);
        }
        if (p.b(obj, "com.mopub.mobileads.MoPubRewardedAdManager$RequestParameters")) {
            return (String) p.a(obj, "mKeywords");
        }
        throw new UnsupportedOperationException("Unsupported object " + obj);
    }

    private void a(Object obj, String str) {
        if (p.b(obj, "com.mopub.mobileads.MoPubView") || p.b(obj, "com.mopub.mobileads.MoPubInterstitial")) {
            p.a(obj, "setKeywords", str);
        } else if (p.b(obj, "com.mopub.mobileads.MoPubRewardedAdManager$RequestParameters")) {
            p.a(obj, "mKeywords", (Object) str);
        } else {
            throw new UnsupportedOperationException("Unsupported object " + obj);
        }
    }
}
