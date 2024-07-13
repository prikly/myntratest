package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.d.e;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import java.io.File;
import java.util.Collections;

public class a extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final e f15620a = new e();

    /* renamed from: e  reason: collision with root package name */
    private final AppLovinNativeAdImpl f15621e;

    /* renamed from: f  reason: collision with root package name */
    private final C0152a f15622f;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a  reason: collision with other inner class name */
    public interface C0152a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, n nVar, C0152a aVar) {
        super("TaskCacheNativeAd", nVar);
        this.f15621e = appLovinNativeAdImpl;
        this.f15622f = aVar;
    }

    private Uri a(Uri uri) {
        if (uri == null) {
            return null;
        }
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.b(str, "Attempting to cache resource: " + uri);
        }
        String a2 = this.f15418b.ad() != null ? this.f15418b.ad().a(f(), uri.toString(), this.f15621e.getCachePrefix(), Collections.emptyList(), false, true, this.f15620a) : this.f15418b.ae().a(f(), uri.toString(), this.f15621e.getCachePrefix(), Collections.emptyList(), false, true, this.f15620a);
        if (StringUtils.isValidString(a2)) {
            File a3 = this.f15418b.ad() != null ? this.f15418b.ad().a(a2, f()) : this.f15418b.ae().a(a2, f());
            if (a3 != null) {
                Uri fromFile = Uri.fromFile(a3);
                if (fromFile != null) {
                    return fromFile;
                }
                v vVar3 = this.f15420d;
                if (v.a()) {
                    this.f15420d.e(this.f15419c, "Unable to extract Uri from image file");
                }
            } else {
                v vVar4 = this.f15420d;
                if (v.a()) {
                    v vVar5 = this.f15420d;
                    String str2 = this.f15419c;
                    vVar5.e(str2, "Unable to retrieve File from cached image filename = " + a2);
                }
            }
        }
        return null;
    }

    public void run() {
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.b(str, "Begin caching ad #" + this.f15621e.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        Uri a2 = a(this.f15621e.getIconUri());
        if (a2 != null) {
            this.f15621e.setIconUri(a2);
        }
        Uri a3 = a(this.f15621e.getMainImageUri());
        if (a3 != null) {
            this.f15621e.setMainImageUri(a3);
        }
        Uri a4 = a(this.f15621e.getPrivacyIconUri());
        if (a4 != null) {
            this.f15621e.setPrivacyIconUri(a4);
        }
        v vVar3 = this.f15420d;
        if (v.a()) {
            v vVar4 = this.f15420d;
            String str2 = this.f15419c;
            vVar4.b(str2, "Finished caching ad #" + this.f15621e.getAdIdNumber());
        }
        this.f15622f.a(this.f15621e);
    }
}
