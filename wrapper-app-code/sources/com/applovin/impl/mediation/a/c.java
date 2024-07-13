package com.applovin.impl.mediation.a;

import android.os.SystemClock;
import com.applovin.impl.mediation.g;
import com.applovin.impl.sdk.c.a;
import com.applovin.impl.sdk.n;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class c extends a {

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<com.applovin.impl.sdk.b.c> f14436c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f14437d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f14438e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14439f;

    private c(c cVar, g gVar) {
        super(cVar.aa(), cVar.Q(), cVar.P(), gVar, cVar.f14445b);
        this.f14438e = new AtomicBoolean();
        this.f14436c = cVar.f14436c;
        this.f14437d = cVar.f14437d;
    }

    public c(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, n nVar) {
        super(map, jSONObject, jSONObject2, (g) null, nVar);
        this.f14438e = new AtomicBoolean();
        this.f14436c = new AtomicReference<>();
        this.f14437d = new AtomicBoolean();
    }

    public long A() {
        long b2 = b("ad_hidden_timeout_ms", -1);
        return b2 >= 0 ? b2 : a("ad_hidden_timeout_ms", ((Long) this.f14445b.a(a.H)).longValue());
    }

    public boolean B() {
        if (b("schedule_ad_hidden_on_ad_dismiss", (Boolean) false).booleanValue()) {
            return true;
        }
        return a("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f14445b.a(a.I)).booleanValue();
    }

    public long C() {
        long b2 = b("ad_hidden_on_ad_dismiss_callback_delay_ms", -1);
        return b2 >= 0 ? b2 : a("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f14445b.a(a.J)).longValue());
    }

    public long D() {
        if (u() > 0) {
            return SystemClock.elapsedRealtime() - u();
        }
        return -1;
    }

    public long E() {
        long b2 = b("fullscreen_display_delay_ms", -1);
        return b2 >= 0 ? b2 : ((Long) this.f14445b.a(a.u)).longValue();
    }

    public long F() {
        return b("ahdm", ((Long) this.f14445b.a(a.w)).longValue());
    }

    public boolean G() {
        return b("susaode", (Boolean) this.f14445b.a(a.v)).booleanValue();
    }

    public String H() {
        return b("bcode", "");
    }

    public String I() {
        return a("mcode", "");
    }

    public boolean J() {
        return this.f14437d.get();
    }

    public void K() {
        this.f14437d.set(true);
    }

    public com.applovin.impl.sdk.b.c L() {
        return this.f14436c.getAndSet((Object) null);
    }

    public AtomicBoolean M() {
        return this.f14438e;
    }

    public boolean N() {
        return this.f14439f;
    }

    public a a(g gVar) {
        return new c(this, gVar);
    }

    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.f14436c.set(cVar);
    }

    public void a(boolean z) {
        this.f14439f = z;
    }

    public long z() {
        long b2 = b("ad_expiration_ms", -1);
        return b2 >= 0 ? b2 : a("ad_expiration_ms", ((Long) this.f14445b.a(a.C)).longValue());
    }
}
