package com.applovin.impl.sdk.a;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.b.a;
import com.applovin.impl.b.b;
import com.applovin.impl.b.f;
import com.applovin.impl.b.h;
import com.applovin.impl.b.k;
import com.applovin.impl.b.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class g extends b {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ boolean f15208h = (!g.class.desiredAssertionStatus());
    private final a i;
    private final AtomicBoolean j = new AtomicBoolean();
    /* access modifiers changed from: private */
    public MediaEvents k;
    /* access modifiers changed from: private */
    public final VastProperties l;
    private final AtomicBoolean m = new AtomicBoolean();
    private final AtomicBoolean n = new AtomicBoolean();
    private final AtomicBoolean o = new AtomicBoolean();
    private final AtomicBoolean p = new AtomicBoolean();

    public g(a aVar) {
        super(aVar);
        this.i = aVar;
        this.l = aVar.i() == -1 ? VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE) : VastProperties.createVastPropertiesForSkippableMedia((float) aVar.i(), true, Position.STANDALONE);
    }

    /* access modifiers changed from: protected */
    public AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.VIDEO, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NATIVE, false);
        } catch (Throwable th) {
            v vVar = this.f15183c;
            if (v.a()) {
                this.f15183c.b(this.f15184d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public AdSessionContext a(WebView webView) {
        Set<k> d2;
        f fVar;
        if (f15208h || this.i.aW() != null) {
            ArrayList arrayList = new ArrayList();
            for (b next : this.i.aW().a()) {
                List<h> b2 = next.b();
                if (!b2.isEmpty()) {
                    ArrayList<h> arrayList2 = new ArrayList<>();
                    for (h next2 : b2) {
                        if ("omid".equalsIgnoreCase(next2.a())) {
                            arrayList2.add(next2);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        d2 = next.d();
                        fVar = f.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED;
                        m.a(d2, fVar, this.f15182b);
                    } else {
                        ArrayList<URL> arrayList3 = new ArrayList<>();
                        for (h b3 : arrayList2) {
                            try {
                                arrayList3.add(new URL(b3.b()));
                            } catch (Throwable th) {
                                v vVar = this.f15183c;
                                if (v.a()) {
                                    this.f15183c.b(this.f15184d, "Failed to parse JavaScript resource url", th);
                                }
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            String c2 = next.c();
                            String a2 = next.a();
                            if (!StringUtils.isValidString(c2) || StringUtils.isValidString(a2)) {
                                for (URL url : arrayList3) {
                                    arrayList.add(StringUtils.isValidString(c2) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(a2, url, c2) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                                }
                            }
                        }
                    }
                }
                d2 = next.d();
                fVar = f.FAILED_TO_LOAD_RESOURCE;
                m.a(d2, fVar, this.f15182b);
            }
            String e2 = this.f15182b.ao().e();
            if (TextUtils.isEmpty(e2)) {
                v vVar2 = this.f15183c;
                if (v.a()) {
                    this.f15183c.e(this.f15184d, "JavaScript SDK content not loaded successfully");
                }
                return null;
            }
            try {
                return AdSessionContext.createNativeAdSessionContext(this.f15182b.ao().d(), e2, arrayList, this.i.getOpenMeasurementContentUrl(), this.i.getOpenMeasurementCustomReferenceData());
            } catch (Throwable th2) {
                v vVar3 = this.f15183c;
                if (!v.a()) {
                    return null;
                }
                this.f15183c.b(this.f15184d, "Failed to create ad session context", th2);
                return null;
            }
        } else {
            throw new AssertionError();
        }
    }

    public void a(final float f2, final boolean z) {
        if (this.m.compareAndSet(false, true)) {
            a("track started", (Runnable) new Runnable() {
                public void run() {
                    g.this.k.start(f2, z ? 0.0f : 1.0f);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void a(AdSession adSession) {
        try {
            this.k = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            v vVar = this.f15183c;
            if (v.a()) {
                this.f15183c.b(this.f15184d, "Failed to create media events", th);
            }
        }
    }

    public void a(final boolean z) {
        a("track volume changed", (Runnable) new Runnable() {
            public void run() {
                g.this.k.volumeChange(z ? 0.0f : 1.0f);
            }
        });
    }

    public void c() {
        a("track loaded", (Runnable) new Runnable() {
            public void run() {
                g.this.f15187g.loaded(g.this.l);
            }
        });
    }

    public void f() {
        if (this.n.compareAndSet(false, true)) {
            a("track first quartile", (Runnable) new Runnable() {
                public void run() {
                    g.this.k.firstQuartile();
                }
            });
        }
    }

    public void g() {
        if (this.o.compareAndSet(false, true)) {
            a("track midpoint", (Runnable) new Runnable() {
                public void run() {
                    g.this.k.midpoint();
                }
            });
        }
    }

    public void h() {
        if (this.p.compareAndSet(false, true)) {
            a("track third quartile", (Runnable) new Runnable() {
                public void run() {
                    g.this.k.thirdQuartile();
                }
            });
        }
    }

    public void i() {
        a("track completed", (Runnable) new Runnable() {
            public void run() {
                g.this.k.complete();
            }
        });
    }

    public void j() {
        a("track paused", (Runnable) new Runnable() {
            public void run() {
                g.this.k.pause();
            }
        });
    }

    public void k() {
        a("track resumed", (Runnable) new Runnable() {
            public void run() {
                g.this.k.resume();
            }
        });
    }

    public void l() {
        if (this.j.compareAndSet(false, true)) {
            a("buffer started", (Runnable) new Runnable() {
                public void run() {
                    g.this.k.bufferStart();
                }
            });
        }
    }

    public void m() {
        if (this.j.compareAndSet(true, false)) {
            a("buffer finished", (Runnable) new Runnable() {
                public void run() {
                    g.this.k.bufferFinish();
                }
            });
        }
    }

    public void n() {
        a("track skipped", (Runnable) new Runnable() {
            public void run() {
                g.this.k.skipped();
            }
        });
    }

    public void o() {
        a("track clicked", (Runnable) new Runnable() {
            public void run() {
                g.this.k.adUserInteraction(InteractionType.CLICK);
            }
        });
    }
}
