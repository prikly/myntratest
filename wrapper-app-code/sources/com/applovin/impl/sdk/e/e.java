package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.webkit.URLUtil;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.b.a;
import com.applovin.impl.b.d;
import com.applovin.impl.b.i;
import com.applovin.impl.b.o;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
import java.util.List;

class e extends c {

    /* renamed from: e  reason: collision with root package name */
    private final a f15438e;

    public e(a aVar, n nVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", aVar, nVar, appLovinAdLoadListener);
        this.f15438e = aVar;
    }

    private void j() {
        String str;
        String str2;
        v vVar;
        v vVar2;
        String str3;
        String str4;
        v vVar3;
        String str5;
        String str6;
        if (!b()) {
            if (this.f15438e.aU()) {
                d aO = this.f15438e.aO();
                if (aO != null) {
                    i b2 = aO.b();
                    if (b2 != null) {
                        Uri b3 = b2.b();
                        String uri = b3 != null ? b3.toString() : "";
                        String c2 = b2.c();
                        if (URLUtil.isValidUrl(uri) || StringUtils.isValidString(c2)) {
                            if (b2.a() == i.a.STATIC) {
                                v vVar4 = this.f15420d;
                                if (v.a()) {
                                    this.f15420d.b(this.f15419c, "Caching static companion ad at " + uri + APSSharedUtil.TRUNCATE_SEPARATOR);
                                }
                                Uri c3 = c(uri, Collections.emptyList(), false);
                                if (c3 != null) {
                                    b2.a(c3);
                                } else {
                                    v vVar5 = this.f15420d;
                                    if (v.a()) {
                                        vVar2 = this.f15420d;
                                        str3 = this.f15419c;
                                        str4 = "Failed to cache static companion ad";
                                    } else {
                                        return;
                                    }
                                }
                            } else if (b2.a() == i.a.HTML) {
                                if (StringUtils.isValidString(uri)) {
                                    v vVar6 = this.f15420d;
                                    if (v.a()) {
                                        this.f15420d.b(this.f15419c, "Begin caching HTML companion ad. Fetching from " + uri + APSSharedUtil.TRUNCATE_SEPARATOR);
                                    }
                                    c2 = b(uri);
                                    if (StringUtils.isValidString(c2)) {
                                        v vVar7 = this.f15420d;
                                        if (v.a()) {
                                            vVar3 = this.f15420d;
                                            str5 = this.f15419c;
                                            str6 = "HTML fetched. Caching HTML now...";
                                        }
                                        b2.a(a(c2, (List<String>) Collections.emptyList(), (com.applovin.impl.sdk.ad.e) this.f15438e));
                                    } else {
                                        v vVar8 = this.f15420d;
                                        if (v.a()) {
                                            this.f15420d.e(this.f15419c, "Unable to load companion ad resources from " + uri);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    v vVar9 = this.f15420d;
                                    if (v.a()) {
                                        vVar3 = this.f15420d;
                                        str5 = this.f15419c;
                                        str6 = "Caching provided HTML for companion ad. No fetch required. HTML: " + c2;
                                    }
                                    b2.a(a(c2, (List<String>) Collections.emptyList(), (com.applovin.impl.sdk.ad.e) this.f15438e));
                                }
                                vVar3.b(str5, str6);
                                b2.a(a(c2, (List<String>) Collections.emptyList(), (com.applovin.impl.sdk.ad.e) this.f15438e));
                            } else if (b2.a() == i.a.IFRAME) {
                                v vVar10 = this.f15420d;
                                if (v.a()) {
                                    vVar = this.f15420d;
                                    str2 = this.f15419c;
                                    str = "Skip caching of iFrame resource...";
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                            this.f15438e.a(true);
                            return;
                        }
                        v vVar11 = this.f15420d;
                        if (v.a()) {
                            this.f15420d.d(this.f15419c, "Companion ad does not have any resources attached. Skipping...");
                            return;
                        }
                        return;
                    }
                    v vVar12 = this.f15420d;
                    if (v.a()) {
                        vVar2 = this.f15420d;
                        str3 = this.f15419c;
                        str4 = "Failed to retrieve non-video resources from companion ad. Skipping...";
                    } else {
                        return;
                    }
                    vVar2.e(str3, str4);
                    return;
                }
                v vVar13 = this.f15420d;
                if (v.a()) {
                    vVar = this.f15420d;
                    str2 = this.f15419c;
                    str = "No companion ad provided. Skipping...";
                } else {
                    return;
                }
            } else {
                v vVar14 = this.f15420d;
                if (v.a()) {
                    vVar = this.f15420d;
                    str2 = this.f15419c;
                    str = "Companion ad caching disabled. Skipping...";
                } else {
                    return;
                }
            }
            vVar.b(str2, str);
        }
    }

    private void k() {
        o aN;
        Uri b2;
        if (!b()) {
            if (!this.f15438e.aV()) {
                v vVar = this.f15420d;
                if (v.a()) {
                    this.f15420d.b(this.f15419c, "Video caching disabled. Skipping...");
                }
            } else if (this.f15438e.aM() != null && (aN = this.f15438e.aN()) != null && (b2 = aN.b()) != null) {
                Uri a2 = a(b2.toString(), (List<String>) Collections.emptyList(), false);
                if (a2 != null) {
                    v vVar2 = this.f15420d;
                    if (v.a()) {
                        v vVar3 = this.f15420d;
                        String str = this.f15419c;
                        vVar3.b(str, "Video file successfully cached into: " + a2);
                    }
                    aN.a(a2);
                    return;
                }
                v vVar4 = this.f15420d;
                if (v.a()) {
                    v vVar5 = this.f15420d;
                    String str2 = this.f15419c;
                    vVar5.e(str2, "Failed to cache video file: " + aN);
                }
            }
        }
    }

    private void l() {
        String str;
        String str2;
        String str3;
        v vVar;
        if (!b()) {
            if (this.f15438e.aT() != null) {
                v vVar2 = this.f15420d;
                if (v.a()) {
                    this.f15420d.b(this.f15419c, "Begin caching HTML template. Fetching from " + this.f15438e.aT() + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                str = e(this.f15438e.aT().toString(), this.f15438e.I(), this.f15438e.shouldUrlEncodeResourcePath());
            } else {
                str = this.f15438e.aS();
            }
            if (StringUtils.isValidString(str)) {
                String a2 = a(str, this.f15438e.I(), this.f15426a);
                if (this.f15438e.q() && this.f15438e.isOpenMeasurementEnabled()) {
                    a2 = this.f15418b.ao().a(a2);
                }
                this.f15438e.a(a2);
                v vVar3 = this.f15420d;
                if (v.a()) {
                    vVar = this.f15420d;
                    str3 = this.f15419c;
                    str2 = "Finish caching HTML template " + this.f15438e.aS() + " for ad #" + this.f15438e.getAdIdNumber();
                } else {
                    return;
                }
            } else {
                v vVar4 = this.f15420d;
                if (v.a()) {
                    vVar = this.f15420d;
                    str3 = this.f15419c;
                    str2 = "Unable to load HTML template";
                } else {
                    return;
                }
            }
            vVar.b(str3, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f15438e.o().e();
        super.h();
    }

    /* access modifiers changed from: package-private */
    public void i() {
        this.f15438e.o().c();
        super.i();
    }

    public void run() {
        super.run();
        if (this.f15438e.f()) {
            v vVar = this.f15420d;
            if (v.a()) {
                v vVar2 = this.f15420d;
                String str = this.f15419c;
                vVar2.b(str, "Begin caching for VAST streaming ad #" + this.f15426a.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            c();
            if (this.f15438e.m()) {
                i();
            }
            if (this.f15438e.l() == a.b.COMPANION_AD) {
                j();
                l();
            } else {
                k();
            }
            if (!this.f15438e.m()) {
                i();
            }
            if (this.f15438e.l() == a.b.COMPANION_AD) {
                k();
            } else {
                j();
                l();
            }
        } else {
            v vVar3 = this.f15420d;
            if (v.a()) {
                v vVar4 = this.f15420d;
                String str2 = this.f15419c;
                vVar4.b(str2, "Begin caching for VAST ad #" + this.f15426a.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            c();
            j();
            k();
            l();
            i();
        }
        v vVar5 = this.f15420d;
        if (v.a()) {
            v vVar6 = this.f15420d;
            String str3 = this.f15419c;
            vVar6.b(str3, "Finished caching VAST ad #" + this.f15438e.getAdIdNumber());
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f15438e.getCreatedAtMillis();
        com.applovin.impl.sdk.d.d.a(this.f15438e, this.f15418b);
        com.applovin.impl.sdk.d.d.a(currentTimeMillis, (AppLovinAdBase) this.f15438e, this.f15418b);
        a((AppLovinAdBase) this.f15438e);
        this.f15438e.b();
        a();
    }
}
