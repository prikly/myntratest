package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.os.Bundle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.a.a;
import com.applovin.impl.mediation.h;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.d.d;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.s;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public abstract class c extends a implements h.a {

    /* renamed from: a  reason: collision with root package name */
    protected final e f15426a;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public AppLovinAdLoadListener f15427e;

    /* renamed from: f  reason: collision with root package name */
    private final r f15428f;

    /* renamed from: g  reason: collision with root package name */
    private final s f15429g;

    /* renamed from: h  reason: collision with root package name */
    private final Collection<Character> f15430h;
    private final com.applovin.impl.sdk.d.e i;
    private boolean j;

    c(String str, e eVar, n nVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, nVar);
        if (eVar != null) {
            this.f15426a = eVar;
            this.f15427e = appLovinAdLoadListener;
            this.f15428f = nVar.ae();
            this.f15429g = nVar.ad();
            this.f15430h = j();
            this.i = new com.applovin.impl.sdk.d.e();
            return;
        }
        throw new IllegalArgumentException("No ad specified.");
    }

    private Uri a(Uri uri, String str) {
        String str2;
        v vVar;
        StringBuilder sb;
        String str3;
        if (uri != null) {
            String uri2 = uri.toString();
            if (StringUtils.isValidString(uri2)) {
                v vVar2 = this.f15420d;
                if (v.a()) {
                    v vVar3 = this.f15420d;
                    String str4 = this.f15419c;
                    vVar3.b(str4, "Caching " + str + " image...");
                }
                return c(uri2);
            }
            v vVar4 = this.f15420d;
            if (!v.a()) {
                return null;
            }
            vVar = this.f15420d;
            str3 = this.f15419c;
            sb = new StringBuilder();
            sb.append("Failed to cache ");
            sb.append(str);
            str2 = " image";
        } else {
            v vVar5 = this.f15420d;
            if (!v.a()) {
                return null;
            }
            vVar = this.f15420d;
            str3 = this.f15419c;
            sb = new StringBuilder();
            sb.append("No ");
            sb.append(str);
            str2 = " image to cache";
        }
        sb.append(str2);
        vVar.b(str3, sb.toString());
        return null;
    }

    private Uri a(String str, String str2) {
        StringBuilder sb;
        if (this.f15429g != null) {
            return b(str, str2);
        }
        String replace = str2.replace("/", "_");
        String L = this.f15426a.L();
        if (StringUtils.isValidString(L)) {
            replace = L + replace;
        }
        File a2 = this.f15428f.a(replace, this.f15418b.P());
        if (a2 == null) {
            return null;
        }
        if (a2.exists()) {
            this.i.b(a2.length());
            sb = new StringBuilder();
        } else {
            if (!this.f15428f.a(a2, str + str2, (List<String>) Arrays.asList(new String[]{str}), this.i)) {
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append("file://");
        sb.append(a2.getAbsolutePath());
        return Uri.parse(sb.toString());
    }

    private Uri b(String str, String str2) {
        StringBuilder sb;
        String replace = str2.replace("/", "_");
        String L = this.f15426a.L();
        if (StringUtils.isValidString(L)) {
            replace = L + replace;
        }
        File a2 = this.f15429g.a(replace, this.f15418b.P());
        if (a2 == null) {
            return null;
        }
        if (a2.exists()) {
            this.i.b(a2.length());
            sb = new StringBuilder();
        } else {
            if (!this.f15429g.a(a2, str + str2, (List<String>) Arrays.asList(new String[]{str}), this.i)) {
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append("file://");
        sb.append(a2.getAbsolutePath());
        return Uri.parse(sb.toString());
    }

    private Uri c(String str) {
        return c(str, this.f15426a.I(), true);
    }

    private Collection<Character> j() {
        HashSet hashSet = new HashSet();
        for (char valueOf : ((String) this.f15418b.a(b.bv)).toCharArray()) {
            hashSet.add(Character.valueOf(valueOf));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    public Uri a(String str) {
        return a(str, this.f15426a.I(), true);
    }

    /* access modifiers changed from: package-private */
    public Uri a(String str, List<String> list, boolean z) {
        if (this.f15429g != null) {
            return b(str, list, z);
        }
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str2 = this.f15419c;
            vVar2.b(str2, "Caching video " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        String a2 = this.f15428f.a(f(), str, this.f15426a.L(), list, z, this.f15426a.shouldUrlEncodeResourcePath(), this.i);
        if (StringUtils.isValidString(a2)) {
            File a3 = this.f15428f.a(a2, f());
            if (a3 != null) {
                Uri fromFile = Uri.fromFile(a3);
                if (fromFile != null) {
                    v vVar3 = this.f15420d;
                    if (v.a()) {
                        v vVar4 = this.f15420d;
                        String str3 = this.f15419c;
                        vVar4.b(str3, "Finish caching video for ad #" + this.f15426a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a2);
                    }
                    return fromFile;
                }
                v vVar5 = this.f15420d;
                if (!v.a()) {
                    return null;
                }
                v vVar6 = this.f15420d;
                String str4 = this.f15419c;
                vVar6.e(str4, "Unable to create URI from cached video file = " + a3);
                return null;
            }
            v vVar7 = this.f15420d;
            if (!v.a()) {
                return null;
            }
            v vVar8 = this.f15420d;
            String str5 = this.f15419c;
            vVar8.e(str5, "Unable to cache video = " + str + "Video file was missing or null");
            return null;
        }
        v vVar9 = this.f15420d;
        if (v.a()) {
            this.f15420d.e(this.f15419c, "Failed to cache video");
        }
        h();
        return null;
    }

    /* access modifiers changed from: package-private */
    public String a(String str, List<String> list, e eVar) {
        v vVar;
        String str2;
        StringBuilder sb;
        if (!StringUtils.isValidString(str)) {
            return str;
        }
        if (!((Boolean) this.f15418b.a(b.bw)).booleanValue()) {
            v vVar2 = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "Resource caching is disabled, skipping cache...");
            }
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        boolean shouldCancelHtmlCachingIfShown = eVar.shouldCancelHtmlCachingIfShown();
        boolean aK = eVar.aK();
        List<String> H = eVar.H();
        for (String next : list) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < sb2.length()) {
                if (b()) {
                    return str;
                }
                i2 = sb2.indexOf(next, i3);
                if (i2 == -1) {
                    continue;
                    break;
                }
                int length = sb2.length();
                int i4 = i2;
                while (!this.f15430h.contains(Character.valueOf(sb2.charAt(i4))) && i4 < length) {
                    i4++;
                }
                if (i4 <= i2 || i4 == length) {
                    v vVar3 = this.f15420d;
                    if (v.a()) {
                        this.f15420d.e(this.f15419c, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return str;
                }
                String substring = sb2.substring(next.length() + i2, i4);
                if (!StringUtils.isValidString(substring)) {
                    v vVar4 = this.f15420d;
                    if (v.a()) {
                        vVar = this.f15420d;
                        str2 = this.f15419c;
                        sb = new StringBuilder();
                        sb.append("Skip caching of non-resource ");
                    } else {
                        i3 = i4;
                    }
                } else if (!shouldCancelHtmlCachingIfShown || !eVar.hasShown()) {
                    if (aK) {
                        String d2 = eVar.d();
                        if (d2.equals(next + substring)) {
                            v vVar5 = this.f15420d;
                            if (v.a()) {
                                vVar = this.f15420d;
                                str2 = this.f15419c;
                                sb = new StringBuilder();
                                sb.append("Postponing caching for \"");
                                sb.append(substring);
                                substring = "\" video resource";
                            } else {
                                i3 = i4;
                            }
                        }
                    }
                    Uri a2 = a(next, substring);
                    if (a2 != null) {
                        sb2.replace(i2, i4, a2.toString());
                        eVar.b(a2);
                        this.i.b();
                    } else {
                        if (H.contains(next + substring)) {
                            h();
                            this.j = true;
                        }
                        this.i.c();
                    }
                    i3 = i4;
                } else {
                    v vVar6 = this.f15420d;
                    if (v.a()) {
                        this.f15420d.b(this.f15419c, "Cancelling HTML caching due to ad being shown already");
                    }
                    this.i.a();
                    return str;
                }
                sb.append(substring);
                vVar.b(str2, sb.toString());
                i3 = i4;
            }
        }
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.f15418b.L().b(this);
    }

    public void a(a aVar) {
        if (aVar.f().equalsIgnoreCase(this.f15426a.N())) {
            v vVar = this.f15420d;
            if (v.a()) {
                this.f15420d.e(this.f15419c, "Updating flag for timeout...");
            }
            this.j = true;
        }
        this.f15418b.L().b(this);
    }

    /* access modifiers changed from: package-private */
    public void a(AppLovinAdBase appLovinAdBase) {
        d.a(this.i, appLovinAdBase, this.f15418b);
    }

    /* access modifiers changed from: package-private */
    public Uri b(String str, List<String> list, boolean z) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str2 = this.f15419c;
            vVar2.b(str2, "Caching video " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        String a2 = this.f15429g.a(f(), str, this.f15426a.L(), list, z, this.f15426a.shouldUrlEncodeResourcePath(), this.i);
        if (StringUtils.isValidString(a2)) {
            File a3 = this.f15429g.a(a2, f());
            if (a3 != null) {
                Uri fromFile = Uri.fromFile(a3);
                if (fromFile != null) {
                    v vVar3 = this.f15420d;
                    if (v.a()) {
                        v vVar4 = this.f15420d;
                        String str3 = this.f15419c;
                        vVar4.b(str3, "Finish caching video for ad #" + this.f15426a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a2);
                    }
                    return fromFile;
                }
                v vVar5 = this.f15420d;
                if (!v.a()) {
                    return null;
                }
                v vVar6 = this.f15420d;
                String str4 = this.f15419c;
                vVar6.e(str4, "Unable to create URI from cached video file = " + a3);
                return null;
            }
            v vVar7 = this.f15420d;
            if (!v.a()) {
                return null;
            }
            v vVar8 = this.f15420d;
            String str5 = this.f15419c;
            vVar8.e(str5, "Unable to cache video = " + str + "Video file was missing or null");
            return null;
        }
        v vVar9 = this.f15420d;
        if (v.a()) {
            this.f15420d.e(this.f15419c, "Failed to cache video");
        }
        h();
        Bundle bundle = new Bundle();
        bundle.putLong("ad_id", this.f15426a.getAdIdNumber());
        bundle.putInt("load_response_code", this.i.e());
        Exception d2 = this.i.d();
        if (d2 != null) {
            bundle.putString("load_exception_message", d2.getMessage());
        }
        this.f15418b.aj().a(bundle, "video_caching_failed");
        return null;
    }

    /* access modifiers changed from: package-private */
    public String b(final String str) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        com.applovin.impl.sdk.network.c a2 = com.applovin.impl.sdk.network.c.a(this.f15418b).a(str).b("GET").a("").a(0).a();
        final AtomicReference atomicReference = new AtomicReference((Object) null);
        this.f15418b.U().a(a2, new b.a(), new b.c<String>() {
            public void a(int i, String str, String str2) {
                v vVar = c.this.f15420d;
                if (v.a()) {
                    v vVar2 = c.this.f15420d;
                    String str3 = c.this.f15419c;
                    vVar2.e(str3, "Failed to load resource from '" + str + "'");
                }
            }

            public void a(String str, int i) {
                atomicReference.set(str);
            }
        });
        String str2 = (String) atomicReference.get();
        if (str2 != null) {
            this.i.a((long) str2.length());
        }
        return str2;
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public Uri c(String str, List<String> list, boolean z) {
        if (this.f15429g != null) {
            return d(str, list, z);
        }
        try {
            String a2 = this.f15428f.a(f(), str, this.f15426a.L(), list, z, this.f15426a.shouldUrlEncodeResourcePath(), this.i);
            if (!StringUtils.isValidString(a2)) {
                return null;
            }
            File a3 = this.f15428f.a(a2, f());
            if (a3 != null) {
                Uri fromFile = Uri.fromFile(a3);
                if (fromFile != null) {
                    return fromFile;
                }
                v vVar = this.f15420d;
                if (!v.a()) {
                    return null;
                }
                this.f15420d.e(this.f15419c, "Unable to extract Uri from image file");
                return null;
            }
            v vVar2 = this.f15420d;
            if (!v.a()) {
                return null;
            }
            v vVar3 = this.f15420d;
            String str2 = this.f15419c;
            vVar3.e(str2, "Unable to retrieve File from cached image filename = " + a2);
            return null;
        } catch (Throwable th) {
            v vVar4 = this.f15420d;
            if (!v.a()) {
                return null;
            }
            v vVar5 = this.f15420d;
            String str3 = this.f15419c;
            vVar5.b(str3, "Failed to cache image at url = " + str, th);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        v vVar = this.f15420d;
        if (v.a()) {
            this.f15420d.b(this.f15419c, "Caching mute images...");
        }
        Uri a2 = a(this.f15426a.aC(), "mute");
        if (a2 != null) {
            this.f15426a.c(a2);
        }
        Uri a3 = a(this.f15426a.aD(), "unmute");
        if (a3 != null) {
            this.f15426a.d(a3);
        }
        v vVar2 = this.f15420d;
        if (v.a()) {
            v vVar3 = this.f15420d;
            String str = this.f15419c;
            vVar3.b(str, "Ad updated with muteImageFilename = " + this.f15426a.aC() + ", unmuteImageFilename = " + this.f15426a.aD());
        }
    }

    /* access modifiers changed from: package-private */
    public Uri d(String str, List<String> list, boolean z) {
        try {
            String a2 = this.f15429g.a(f(), str, this.f15426a.L(), list, z, this.f15426a.shouldUrlEncodeResourcePath(), this.i);
            if (!StringUtils.isValidString(a2)) {
                return null;
            }
            File a3 = this.f15429g.a(a2, f());
            if (a3 != null) {
                Uri fromFile = Uri.fromFile(a3);
                if (fromFile != null) {
                    return fromFile;
                }
                v vVar = this.f15420d;
                if (!v.a()) {
                    return null;
                }
                this.f15420d.e(this.f15419c, "Unable to extract Uri from image file");
                return null;
            }
            v vVar2 = this.f15420d;
            if (!v.a()) {
                return null;
            }
            v vVar3 = this.f15420d;
            String str2 = this.f15419c;
            vVar3.e(str2, "Unable to retrieve File from cached image filename = " + a2);
            return null;
        } catch (Throwable th) {
            v vVar4 = this.f15420d;
            if (!v.a()) {
                return null;
            }
            v vVar5 = this.f15420d;
            String str3 = this.f15419c;
            vVar5.b(str3, "Failed to cache image at url = " + str, th);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public String e(String str, List<String> list, boolean z) {
        InputStream inputStream;
        if (this.f15429g != null) {
            return f(str, list, z);
        }
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                v vVar = this.f15420d;
                if (v.a()) {
                    this.f15420d.b(this.f15419c, "Nothing to cache, skipping...");
                }
                return null;
            }
            String fileName = ((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.b.fe)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
            if (z) {
                fileName = StringUtils.encodeUriString(fileName, this.f15418b);
            }
            if (StringUtils.isValidString(this.f15426a.L())) {
                fileName = this.f15426a.L() + fileName;
            }
            try {
                File a2 = this.f15428f.a(fileName, f());
                if (a2 != null && a2.exists()) {
                    return this.f15428f.a(a2);
                }
                inputStream = this.f15428f.a(str, list, true, this.i);
                if (inputStream != null) {
                    try {
                        this.f15428f.b(inputStream, a2);
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                Utils.close(inputStream, this.f15418b);
                return this.f15428f.a(a2);
            } catch (Throwable th2) {
                v vVar2 = this.f15420d;
                if (v.a()) {
                    this.f15420d.b(this.f15419c, "Resource at " + str + " failed to load.", th2);
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public String f(String str, List<String> list, boolean z) {
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                v vVar = this.f15420d;
                if (v.a()) {
                    this.f15420d.b(this.f15419c, "Nothing to cache, skipping...");
                }
                return null;
            }
            String fileName = ((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.b.fe)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
            if (z) {
                fileName = StringUtils.encodeUriString(fileName, this.f15418b);
            }
            if (StringUtils.isValidString(this.f15426a.L())) {
                fileName = this.f15426a.L() + fileName;
            }
            File a2 = this.f15429g.a(fileName, f());
            ByteArrayOutputStream a3 = (a2 == null || !a2.exists()) ? null : this.f15429g.a(a2);
            if (a3 == null) {
                a3 = this.f15429g.a(str, list, true, this.i);
                if (a3 != null) {
                    this.f15429g.a(a3, a2);
                    this.i.a((long) a3.size());
                }
            } else {
                this.i.b((long) a3.size());
            }
            try {
                return a3.toString("UTF-8");
            } catch (UnsupportedEncodingException e2) {
                v vVar2 = this.f15420d;
                if (v.a()) {
                    this.f15420d.b(this.f15419c, "UTF-8 encoding not supported.", e2);
                }
            } catch (Throwable th) {
                v vVar3 = this.f15420d;
                if (v.a()) {
                    this.f15420d.b(this.f15419c, "String resource at " + str + " failed to load.", th);
                }
                return null;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f15427e;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            this.f15427e = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.b(str, "Rendered new ad:" + this.f15426a);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (c.this.f15427e != null) {
                    c.this.f15427e.adReceived(c.this.f15426a);
                    AppLovinAdLoadListener unused = c.this.f15427e = null;
                }
            }
        });
    }

    public void run() {
        if (this.f15426a.M()) {
            v vVar = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "Subscribing to timeout events...");
            }
            this.f15418b.L().a((h.a) this);
        }
    }
}
