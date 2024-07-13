package com.applovin.impl.sdk.e;

import com.applovin.impl.b.e;
import com.applovin.impl.b.f;
import com.applovin.impl.b.m;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

public abstract class r extends a {

    /* renamed from: a  reason: collision with root package name */
    private final AppLovinAdLoadListener f15497a;

    /* renamed from: e  reason: collision with root package name */
    private final a f15498e;

    private static final class a extends e {
        a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, n nVar) {
            super(jSONObject, jSONObject2, bVar, nVar);
        }

        /* access modifiers changed from: package-private */
        public void a(s sVar) {
            if (sVar != null) {
                this.f14282a.add(sVar);
                return;
            }
            throw new IllegalArgumentException("No aggregated vast response specified");
        }
    }

    private static final class b extends r {

        /* renamed from: a  reason: collision with root package name */
        private final String f15499a;

        b(String str, e eVar, AppLovinAdLoadListener appLovinAdLoadListener, n nVar) {
            super(eVar, appLovinAdLoadListener, nVar);
            this.f15499a = str;
        }

        public void run() {
            a(a(this.f15499a));
        }
    }

    private static final class c extends r {

        /* renamed from: a  reason: collision with root package name */
        private final JSONObject f15500a;

        c(e eVar, AppLovinAdLoadListener appLovinAdLoadListener, n nVar) {
            super(eVar, appLovinAdLoadListener, nVar);
            this.f15500a = eVar.c();
        }

        public void run() {
            f fVar;
            v vVar = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f15500a, "xml", (String) null);
            if (!StringUtils.isValidString(string)) {
                v vVar2 = this.f15420d;
                if (v.a()) {
                    this.f15420d.e(this.f15419c, "No VAST response received.");
                }
                fVar = f.NO_WRAPPER_RESPONSE;
            } else if (string.length() < ((Integer) this.f15418b.a(com.applovin.impl.sdk.c.b.eq)).intValue()) {
                a(a(string));
                return;
            } else {
                v vVar3 = this.f15420d;
                if (v.a()) {
                    this.f15420d.e(this.f15419c, "VAST response is over max length");
                }
                fVar = f.XML_PARSING;
            }
            a(fVar);
        }
    }

    private static final class d extends r {

        /* renamed from: a  reason: collision with root package name */
        private final s f15501a;

        d(s sVar, e eVar, AppLovinAdLoadListener appLovinAdLoadListener, n nVar) {
            super(eVar, appLovinAdLoadListener, nVar);
            if (sVar == null) {
                throw new IllegalArgumentException("No response specified.");
            } else if (eVar == null) {
                throw new IllegalArgumentException("No context specified.");
            } else if (appLovinAdLoadListener != null) {
                this.f15501a = sVar;
            } else {
                throw new IllegalArgumentException("No callback specified.");
            }
        }

        public void run() {
            v vVar = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "Processing VAST Wrapper response...");
            }
            a(this.f15501a);
        }
    }

    r(e eVar, AppLovinAdLoadListener appLovinAdLoadListener, n nVar) {
        super("TaskProcessVastResponse", nVar);
        if (eVar != null) {
            this.f15497a = appLovinAdLoadListener;
            this.f15498e = (a) eVar;
            return;
        }
        throw new IllegalArgumentException("No context specified.");
    }

    public static r a(s sVar, e eVar, AppLovinAdLoadListener appLovinAdLoadListener, n nVar) {
        return new d(sVar, eVar, appLovinAdLoadListener, nVar);
    }

    public static r a(String str, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, n nVar) {
        return new b(str, new a(jSONObject, jSONObject2, bVar, nVar), appLovinAdLoadListener, nVar);
    }

    public static r a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, n nVar) {
        return new c(new a(jSONObject, jSONObject2, bVar, nVar), appLovinAdLoadListener, nVar);
    }

    /* access modifiers changed from: protected */
    public s a(String str) {
        try {
            return t.a(str, this.f15418b);
        } catch (Throwable th) {
            v vVar = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "Failed to process VAST response", th);
            }
            a(f.XML_PARSING);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(f fVar) {
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.e(str, "Failed to process VAST response due to VAST error code " + fVar);
        }
        m.a((e) this.f15498e, this.f15497a, fVar, -6, this.f15418b);
    }

    /* access modifiers changed from: package-private */
    public void a(s sVar) {
        f fVar;
        a aVar;
        int a2 = this.f15498e.a();
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.b(str, "Finished parsing XML at depth " + a2);
        }
        this.f15498e.a(sVar);
        if (m.a(sVar)) {
            int intValue = ((Integer) this.f15418b.a(com.applovin.impl.sdk.c.b.er)).intValue();
            if (a2 < intValue) {
                v vVar3 = this.f15420d;
                if (v.a()) {
                    this.f15420d.b(this.f15419c, "VAST response is wrapper. Resolving...");
                }
                aVar = new x(this.f15498e, this.f15497a, this.f15418b);
            } else {
                v vVar4 = this.f15420d;
                if (v.a()) {
                    v vVar5 = this.f15420d;
                    String str2 = this.f15419c;
                    vVar5.e(str2, "Reached beyond max wrapper depth of " + intValue);
                }
                fVar = f.WRAPPER_LIMIT_REACHED;
                a(fVar);
                return;
            }
        } else if (m.b(sVar)) {
            v vVar6 = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "VAST response is inline. Rendering ad...");
            }
            aVar = new t(this.f15498e, this.f15497a, this.f15418b);
        } else {
            v vVar7 = this.f15420d;
            if (v.a()) {
                this.f15420d.e(this.f15419c, "VAST response is an error");
            }
            fVar = f.NO_WRAPPER_RESPONSE;
            a(fVar);
            return;
        }
        this.f15418b.V().a(aVar);
    }
}
