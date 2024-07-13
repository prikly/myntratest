package com.applovin.impl.sdk.a;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.List;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    protected final AppLovinAdBase f15181a;

    /* renamed from: b  reason: collision with root package name */
    protected final n f15182b;

    /* renamed from: c  reason: collision with root package name */
    protected final v f15183c;

    /* renamed from: d  reason: collision with root package name */
    protected final String f15184d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f15185e;

    /* renamed from: f  reason: collision with root package name */
    protected AdSession f15186f;

    /* renamed from: g  reason: collision with root package name */
    protected AdEvents f15187g;

    public b(AppLovinAdBase appLovinAdBase) {
        this.f15181a = appLovinAdBase;
        this.f15182b = appLovinAdBase.getSdk();
        this.f15183c = appLovinAdBase.getSdk().D();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + ":" + appLovinAdBase.getDspName();
        }
        this.f15184d = str;
    }

    /* access modifiers changed from: protected */
    public abstract AdSessionConfiguration a();

    /* access modifiers changed from: protected */
    public abstract AdSessionContext a(WebView webView);

    public void a(View view) {
        a(view, (List<d>) Collections.emptyList());
    }

    public void a(final View view, final List<d> list) {
        a("update main view: " + view, (Runnable) new Runnable() {
            public void run() {
                b.this.f15186f.registerAdView(view);
                b.this.f15186f.removeAllFriendlyObstructions();
                for (d dVar : list) {
                    if (dVar.a() != null) {
                        try {
                            b.this.f15186f.addFriendlyObstruction(dVar.a(), dVar.b(), dVar.c());
                        } catch (Throwable th) {
                            v vVar = b.this.f15183c;
                            if (v.a()) {
                                v vVar2 = b.this.f15183c;
                                String str = b.this.f15184d;
                                vVar2.b(str, "Failed to add friendly obstruction (" + dVar + ")", th);
                            }
                        }
                    }
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void a(AdSession adSession) {
    }

    public void a(final String str) {
        a("track error", (Runnable) new Runnable() {
            public void run() {
                b.this.f15186f.error(ErrorType.VIDEO, str);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void a(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                try {
                    if (!b.this.f15185e) {
                        v vVar = b.this.f15183c;
                        if (v.a()) {
                            v vVar2 = b.this.f15183c;
                            String str = b.this.f15184d;
                            vVar2.e(str, "Failed to run operation: " + str);
                            return;
                        }
                        return;
                    }
                    v vVar3 = b.this.f15183c;
                    if (v.a()) {
                        v vVar4 = b.this.f15183c;
                        String str2 = b.this.f15184d;
                        vVar4.b(str2, "Running operation: " + str);
                    }
                    runnable.run();
                } catch (Throwable th) {
                    v vVar5 = b.this.f15183c;
                    if (v.a()) {
                        v vVar6 = b.this.f15183c;
                        String str3 = b.this.f15184d;
                        vVar6.b(str3, "Failed to run operation: " + str, th);
                    }
                }
            }
        });
    }

    public void b() {
        b((WebView) null);
    }

    public void b(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                AdSessionContext a2;
                if (!b.this.f15181a.isOpenMeasurementEnabled()) {
                    v vVar = b.this.f15183c;
                    if (v.a()) {
                        b.this.f15183c.c(b.this.f15184d, "Skip starting session - Open Measurement disabled");
                    }
                } else if (b.this.f15186f != null) {
                    v vVar2 = b.this.f15183c;
                    if (v.a()) {
                        v vVar3 = b.this.f15183c;
                        String str = b.this.f15184d;
                        vVar3.d(str, "Attempting to start session again for ad: " + b.this.f15181a);
                    }
                } else {
                    v vVar4 = b.this.f15183c;
                    if (v.a()) {
                        b.this.f15183c.b(b.this.f15184d, "Starting session");
                    }
                    AdSessionConfiguration a3 = b.this.a();
                    if (a3 != null && (a2 = b.this.a(webView)) != null) {
                        try {
                            b.this.f15186f = AdSession.createAdSession(a3, a2);
                            try {
                                b.this.f15187g = AdEvents.createAdEvents(b.this.f15186f);
                                b bVar = b.this;
                                bVar.a(bVar.f15186f);
                                b.this.f15186f.start();
                                b.this.f15185e = true;
                                v vVar5 = b.this.f15183c;
                                if (v.a()) {
                                    b.this.f15183c.b(b.this.f15184d, "Session started");
                                }
                            } catch (Throwable th) {
                                v vVar6 = b.this.f15183c;
                                if (v.a()) {
                                    b.this.f15183c.b(b.this.f15184d, "Failed to create ad events", th);
                                }
                            }
                        } catch (Throwable th2) {
                            v vVar7 = b.this.f15183c;
                            if (v.a()) {
                                b.this.f15183c.b(b.this.f15184d, "Failed to create session", th2);
                            }
                        }
                    }
                }
            }
        });
    }

    public void c() {
        a("track loaded", (Runnable) new Runnable() {
            public void run() {
                b.this.f15187g.loaded();
            }
        });
    }

    public void d() {
        a("track impression event", (Runnable) new Runnable() {
            public void run() {
                b.this.f15187g.impressionOccurred();
            }
        });
    }

    public void e() {
        a("stop session", (Runnable) new Runnable() {
            public void run() {
                b.this.f15185e = false;
                b.this.f15186f.finish();
                b.this.f15186f = null;
                b.this.f15187g = null;
            }
        });
    }
}
