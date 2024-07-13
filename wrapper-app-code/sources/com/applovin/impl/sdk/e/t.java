package com.applovin.impl.sdk.e;

import com.applovin.impl.b.a;
import com.applovin.impl.b.c;
import com.applovin.impl.b.d;
import com.applovin.impl.b.e;
import com.applovin.impl.b.f;
import com.applovin.impl.b.j;
import com.applovin.impl.b.k;
import com.applovin.impl.b.m;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdType;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.HashSet;
import java.util.Set;

class t extends a {

    /* renamed from: a  reason: collision with root package name */
    private final e f15506a;

    /* renamed from: e  reason: collision with root package name */
    private final AppLovinAdLoadListener f15507e;

    t(e eVar, AppLovinAdLoadListener appLovinAdLoadListener, n nVar) {
        super("TaskRenderVastAd", nVar);
        this.f15507e = appLovinAdLoadListener;
        this.f15506a = eVar;
    }

    public void run() {
        v vVar = this.f15420d;
        if (v.a()) {
            this.f15420d.b(this.f15419c, "Rendering VAST ad...");
        }
        int size = this.f15506a.b().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str = "";
        j jVar = null;
        com.applovin.impl.b.n nVar = null;
        d dVar = null;
        c cVar = null;
        String str2 = str;
        for (s next : this.f15506a.b()) {
            s c2 = next.c(m.a(next) ? "Wrapper" : "InLine");
            if (c2 != null) {
                s c3 = c2.c("AdSystem");
                if (c3 != null) {
                    jVar = j.a(c3, jVar, this.f15418b);
                }
                str = m.a(c2, "AdTitle", str);
                str2 = m.a(c2, "Description", str2);
                m.a(c2.a("Impression"), (Set<k>) hashSet, this.f15506a, this.f15418b);
                s b2 = c2.b("ViewableImpression");
                if (b2 != null) {
                    m.a(b2.a("Viewable"), (Set<k>) hashSet, this.f15506a, this.f15418b);
                }
                s c4 = c2.c("AdVerifications");
                if (c4 != null) {
                    cVar = c.a(c4, cVar, this.f15506a, this.f15418b);
                }
                m.a(c2.a(LogConstants.EVENT_ERROR), (Set<k>) hashSet2, this.f15506a, this.f15418b);
                s b3 = c2.b("Creatives");
                if (b3 != null) {
                    for (s next2 : b3.d()) {
                        s b4 = next2.b("Linear");
                        if (b4 != null) {
                            nVar = com.applovin.impl.b.n.a(b4, nVar, this.f15506a, this.f15418b);
                        } else {
                            s c5 = next2.c("CompanionAds");
                            if (c5 != null) {
                                s c6 = c5.c("Companion");
                                if (c6 != null) {
                                    dVar = d.a(c6, dVar, this.f15506a, this.f15418b);
                                }
                            } else {
                                v vVar2 = this.f15420d;
                                if (v.a()) {
                                    this.f15420d.e(this.f15419c, "Received and will skip rendering for an unidentified creative: " + next2);
                                }
                            }
                        }
                    }
                }
            } else {
                v vVar3 = this.f15420d;
                if (v.a()) {
                    this.f15420d.e(this.f15419c, "Did not find wrapper or inline response for node: " + next);
                }
            }
        }
        a a2 = new a.C0139a().a(this.f15418b).a(this.f15506a.c()).b(this.f15506a.d()).a(this.f15506a.e()).a(this.f15506a.f()).a(str).b(str2).a(jVar).a(nVar).a(dVar).a(cVar).a((Set<k>) hashSet).a(cVar).b((Set<k>) hashSet2).a();
        f a3 = m.a(a2);
        if (a3 == null) {
            v vVar4 = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "Finished rendering VAST ad: " + a2);
            }
            a2.o().b();
            e eVar = new e(a2, this.f15418b, this.f15507e);
            o.a aVar = o.a.CACHING_OTHER;
            if (((Boolean) this.f15418b.a(b.br)).booleanValue()) {
                if (a2.getType() == AppLovinAdType.REGULAR) {
                    aVar = o.a.CACHING_INTERSTITIAL;
                } else if (a2.getType() == AppLovinAdType.INCENTIVIZED) {
                    aVar = o.a.CACHING_INCENTIVIZED;
                }
            }
            this.f15418b.V().a((a) eVar, aVar);
            return;
        }
        m.a(this.f15506a, this.f15507e, a3, -6, this.f15418b);
    }
}
