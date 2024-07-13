package com.applovin.impl.sdk.e;

import android.net.Uri;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad.a;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdLoadListener;

public class d extends c {

    /* renamed from: e  reason: collision with root package name */
    private final a f15435e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15436f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15437g;

    public d(a aVar, n nVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, nVar, appLovinAdLoadListener);
        this.f15435e = aVar;
    }

    private void j() {
        v vVar = this.f15420d;
        if (v.a()) {
            this.f15420d.b(this.f15419c, "Caching HTML resources...");
        }
        String a2 = a(this.f15435e.b(), this.f15435e.I(), (e) this.f15435e);
        if (this.f15435e.q() && this.f15435e.isOpenMeasurementEnabled()) {
            a2 = this.f15418b.ao().a(a2);
        }
        this.f15435e.a(a2);
        this.f15435e.a(true);
        v vVar2 = this.f15420d;
        if (v.a()) {
            v vVar3 = this.f15420d;
            String str = this.f15419c;
            vVar3.b(str, "Finish caching non-video resources for ad #" + this.f15435e.getAdIdNumber());
        }
        v vVar4 = this.f15420d;
        String str2 = this.f15419c;
        vVar4.a(str2, "Ad updated with cachedHTML = " + this.f15435e.b());
    }

    private void k() {
        Uri a2;
        if (!b() && (a2 = a(this.f15435e.i())) != null) {
            if (this.f15435e.aK()) {
                this.f15435e.a(this.f15435e.b().replaceFirst(this.f15435e.e(), a2.toString()));
                v vVar = this.f15420d;
                if (v.a()) {
                    this.f15420d.b(this.f15419c, "Replaced video URL with cached video URI in HTML for web video ad");
                }
            }
            this.f15435e.g();
            this.f15435e.a(a2);
        }
    }

    public void a(boolean z) {
        this.f15436f = z;
    }

    public void b(boolean z) {
        this.f15437g = z;
    }

    public void run() {
        super.run();
        boolean f2 = this.f15435e.f();
        boolean z = this.f15437g;
        if (f2 || z) {
            v vVar = this.f15420d;
            if (v.a()) {
                v vVar2 = this.f15420d;
                String str = this.f15419c;
                vVar2.b(str, "Begin caching for streaming ad #" + this.f15435e.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            c();
            if (f2) {
                if (this.f15436f) {
                    i();
                }
                j();
                if (!this.f15436f) {
                    i();
                }
                k();
            } else {
                i();
                j();
            }
        } else {
            v vVar3 = this.f15420d;
            if (v.a()) {
                v vVar4 = this.f15420d;
                String str2 = this.f15419c;
                vVar4.b(str2, "Begin processing for non-streaming ad #" + this.f15435e.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            c();
            j();
            k();
            i();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f15435e.getCreatedAtMillis();
        com.applovin.impl.sdk.d.d.a(this.f15435e, this.f15418b);
        com.applovin.impl.sdk.d.d.a(currentTimeMillis, (AppLovinAdBase) this.f15435e, this.f15418b);
        a((AppLovinAdBase) this.f15435e);
        a();
    }
}
