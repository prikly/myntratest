package com.applovin.impl.sdk.e;

import com.applovin.impl.b.e;
import com.applovin.impl.b.f;
import com.applovin.impl.b.m;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdLoadListener;

class x extends a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final e f15517a;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AppLovinAdLoadListener f15518e;

    x(e eVar, AppLovinAdLoadListener appLovinAdLoadListener, n nVar) {
        super("TaskResolveVastWrapper", nVar);
        this.f15518e = appLovinAdLoadListener;
        this.f15517a = eVar;
    }

    /* access modifiers changed from: private */
    public void a(int i) {
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.e(str, "Failed to resolve VAST wrapper due to error code " + i);
        }
        if (i == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f15518e;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
                return;
            }
            return;
        }
        m.a(this.f15517a, this.f15518e, i == -1001 ? f.TIMED_OUT : f.GENERAL_WRAPPER_ERROR, i, this.f15418b);
    }

    public void run() {
        String a2 = m.a(this.f15517a);
        if (StringUtils.isValidString(a2)) {
            v vVar = this.f15420d;
            if (v.a()) {
                v vVar2 = this.f15420d;
                String str = this.f15419c;
                vVar2.b(str, "Resolving VAST ad with depth " + this.f15517a.a() + " at " + a2);
            }
            try {
                this.f15418b.V().a((a) new u<s>(c.a(this.f15418b).a(a2).b("GET").a(s.f15948a).a(((Integer) this.f15418b.a(b.ew)).intValue()).b(((Integer) this.f15418b.a(b.ex)).intValue()).c(false).a(), this.f15418b) {
                    public void a(int i, String str, s sVar) {
                        v vVar = this.f15420d;
                        if (v.a()) {
                            v vVar2 = this.f15420d;
                            String str2 = this.f15419c;
                            vVar2.e(str2, "Unable to resolve VAST wrapper. Server returned " + i);
                        }
                        x.this.a(i);
                    }

                    public void a(s sVar, int i) {
                        this.f15418b.V().a((a) r.a(sVar, x.this.f15517a, x.this.f15518e, x.this.f15418b));
                    }
                });
            } catch (Throwable th) {
                v vVar3 = this.f15420d;
                if (v.a()) {
                    this.f15420d.b(this.f15419c, "Unable to resolve VAST wrapper", th);
                }
            }
        } else {
            v vVar4 = this.f15420d;
            if (v.a()) {
                this.f15420d.e(this.f15419c, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
        }
    }
}
