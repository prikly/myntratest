package com.adcolony.sdk;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;
import com.adcolony.sdk.e0;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import io.bidmachine.utils.IabUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, Runnable> f9984a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, c> f9985b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public ConcurrentHashMap<String, AdColonyInterstitial> f9986c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ConcurrentHashMap<String, AdColonyAdViewListener> f9987d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public ConcurrentHashMap<String, AdColonyAdViewListener> f9988e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Map<String, AdColonyAdView> f9989f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Object f9990g = new Object();

    class a implements j0 {
        a() {
        }

        public void a(h0 h0Var) {
            d.this.e(h0Var);
        }
    }

    class b implements j0 {

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f9993a;

            a(h0 h0Var) {
                this.f9993a = h0Var;
            }

            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) d.this.f9986c.get(c0.h(this.f9993a.a(), OSOutcomeConstants.OUTCOME_ID));
                if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
                    adColonyInterstitial.getListener().onAudioStopped(adColonyInterstitial);
                }
            }
        }

        b() {
        }

        public void a(h0 h0Var) {
            z0.b((Runnable) new a(h0Var));
        }
    }

    class c implements j0 {

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f9996a;

            a(h0 h0Var) {
                this.f9996a = h0Var;
            }

            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) d.this.f9986c.get(c0.h(this.f9996a.a(), OSOutcomeConstants.OUTCOME_ID));
                if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
                    adColonyInterstitial.getListener().onAudioStarted(adColonyInterstitial);
                }
            }
        }

        c() {
        }

        public void a(h0 h0Var) {
            z0.b((Runnable) new a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$d  reason: collision with other inner class name */
    class C0094d implements j0 {
        C0094d() {
        }

        public void a(h0 h0Var) {
            d.this.i(h0Var);
        }
    }

    class e implements j0 {
        e() {
        }

        public void a(h0 h0Var) {
            d.this.h(h0Var);
        }
    }

    class f implements j0 {
        f() {
        }

        public void a(h0 h0Var) {
            boolean unused = d.this.g(h0Var);
        }
    }

    class g implements j0 {
        g(d dVar) {
        }

        public void a(h0 h0Var) {
            f1 b2 = c0.b();
            c0.b(b2, "success", true);
            h0Var.a(b2).c();
        }
    }

    class h implements j0 {

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f10001a;

            a(h hVar, h0 h0Var) {
                this.f10001a = h0Var;
            }

            public void run() {
                h0 h0Var = this.f10001a;
                h0Var.a(h0Var.a()).c();
            }
        }

        h(d dVar) {
        }

        public void a(h0 h0Var) {
            z0.b((Runnable) new a(this, h0Var));
        }
    }

    class i implements j0 {
        i(d dVar) {
        }

        public void a(h0 h0Var) {
            o0.c().a(h0Var);
        }
    }

    class j implements Runnable {
        j(d dVar) {
        }

        public void run() {
            r o = a.b().o();
            if (o.a() != null) {
                o.a().dismiss();
                o.a((AlertDialog) null);
            }
        }
    }

    class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f10002a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h0 f10003b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AdColonyAdViewListener f10004c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f10005d;

        k(Context context, h0 h0Var, AdColonyAdViewListener adColonyAdViewListener, String str) {
            this.f10002a = context;
            this.f10003b = h0Var;
            this.f10004c = adColonyAdViewListener;
            this.f10005d = str;
        }

        public void run() {
            AdColonyAdView adColonyAdView;
            try {
                adColonyAdView = new AdColonyAdView(this.f10002a, this.f10003b, this.f10004c);
            } catch (RuntimeException e2) {
                new e0.a().a(e2.toString()).a(e0.i);
                adColonyAdView = null;
            }
            synchronized (d.this.f9990g) {
                if (d.this.f9988e.remove(this.f10005d) != null) {
                    if (adColonyAdView == null) {
                        d.this.a(this.f10004c);
                        return;
                    }
                    d.this.f9989f.put(this.f10005d, adColonyAdView);
                    adColonyAdView.setOmidManager(this.f10004c.b());
                    adColonyAdView.e();
                    this.f10004c.a((p0) null);
                    this.f10004c.onRequestFilled(adColonyAdView);
                }
            }
        }
    }

    class l implements j0 {

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f10008a;

            a(h0 h0Var) {
                this.f10008a = h0Var;
            }

            public void run() {
                d.this.c(this.f10008a);
            }
        }

        l() {
        }

        public void a(h0 h0Var) {
            z0.b((Runnable) new a(h0Var));
        }
    }

    class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0 f10010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitial f10011b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitialListener f10012c;

        m(d dVar, h0 h0Var, AdColonyInterstitial adColonyInterstitial, AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f10010a = h0Var;
            this.f10011b = adColonyInterstitial;
            this.f10012c = adColonyInterstitialListener;
        }

        public void run() {
            f1 a2 = this.f10010a.a();
            if (this.f10011b.e() == null) {
                this.f10011b.a(c0.f(a2, "iab"));
            }
            this.f10011b.a(c0.h(a2, "ad_id"));
            this.f10011b.c(c0.h(a2, "creative_id"));
            this.f10011b.setViewNetworkPassFilter(c0.h(a2, "view_network_pass_filter"));
            p0 e2 = this.f10011b.e();
            if (!(e2 == null || e2.d() == 2)) {
                try {
                    e2.a();
                } catch (IllegalArgumentException unused) {
                    new e0.a().a("IllegalArgumentException when creating omid session").a(e0.i);
                }
            }
            this.f10012c.onRequestFilled(this.f10011b);
        }
    }

    class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdColonyAdViewListener f10013a;

        n(d dVar, AdColonyAdViewListener adColonyAdViewListener) {
            this.f10013a = adColonyAdViewListener;
        }

        public void run() {
            AdColonyAdViewListener adColonyAdViewListener = this.f10013a;
            adColonyAdViewListener.onRequestNotFilled(AdColony.a(adColonyAdViewListener.c()));
            if (!a.c()) {
                new e0.a().a("RequestNotFilled called for AdView due to a missing context. ").a(e0.i);
            }
        }
    }

    class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f10014a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f10015b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f10016c;

        o(String str, String str2, long j) {
            this.f10014a = str;
            this.f10015b = str2;
            this.f10016c = j;
        }

        public void run() {
            d.this.f9984a.remove(this.f10014a);
            AdColonyAdViewListener adColonyAdViewListener = (AdColonyAdViewListener) d.this.f9987d.remove(this.f10014a);
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onRequestNotFilled(AdColony.a(this.f10015b));
                f1 b2 = c0.b();
                c0.a(b2, OSOutcomeConstants.OUTCOME_ID, this.f10014a);
                c0.a(b2, "zone_id", this.f10015b);
                c0.b(b2, "type", 1);
                c0.b(b2, "request_fail_reason", 26);
                new h0("AdSession.on_request_failure", 1, b2).c();
                e0.a a2 = new e0.a().a("RequestNotFilled called due to a native timeout. ");
                e0.a a3 = a2.a("Timeout set to: " + a.b().d() + " ms. ");
                e0.a a4 = a3.a("AdView request time allowed: " + this.f10016c + " ms. ");
                a4.a("AdView with adSessionId(" + this.f10014a + ") - request failed.").a(e0.i);
            }
        }
    }

    class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f10018a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f10019b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f10020c;

        p(String str, String str2, long j) {
            this.f10018a = str;
            this.f10019b = str2;
            this.f10020c = j;
        }

        public void run() {
            AdColonyInterstitialListener adColonyInterstitialListener;
            d.this.f9984a.remove(this.f10018a);
            AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) d.this.f9986c.remove(this.f10018a);
            if (adColonyInterstitial == null) {
                adColonyInterstitialListener = null;
            } else {
                adColonyInterstitialListener = adColonyInterstitial.getListener();
            }
            if (adColonyInterstitialListener != null) {
                adColonyInterstitialListener.onRequestNotFilled(AdColony.a(this.f10019b));
                f1 b2 = c0.b();
                c0.a(b2, OSOutcomeConstants.OUTCOME_ID, this.f10018a);
                c0.a(b2, "zone_id", this.f10019b);
                c0.b(b2, "type", 0);
                c0.b(b2, "request_fail_reason", 26);
                new h0("AdSession.on_request_failure", 1, b2).c();
                e0.a a2 = new e0.a().a("RequestNotFilled called due to a native timeout. ");
                e0.a a3 = a2.a("Timeout set to: " + a.b().d() + " ms. ");
                e0.a a4 = a3.a("Interstitial request time allowed: " + this.f10020c + " ms. ");
                a4.a("Interstitial with adSessionId(" + this.f10018a + ") - request failed.").a(e0.i);
            }
        }
    }

    class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitialListener f10022a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitial f10023b;

        q(d dVar, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyInterstitial adColonyInterstitial) {
            this.f10022a = adColonyInterstitialListener;
            this.f10023b = adColonyInterstitial;
        }

        public void run() {
            a.b().e(false);
            this.f10022a.onClosed(this.f10023b);
        }
    }

    class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f10024a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b1 f10025b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f10026c;

        r(String str, b1 b1Var, c cVar) {
            this.f10024a = str;
            this.f10025b = b1Var;
            this.f10026c = cVar;
        }

        public void run() {
            p0 p0Var;
            int i;
            try {
                AdColonyInterstitial adColonyInterstitial = d.this.f().get(this.f10024a);
                AdColonyAdView adColonyAdView = d.this.d().get(this.f10024a);
                if (adColonyInterstitial == null) {
                    p0Var = null;
                } else {
                    p0Var = adColonyInterstitial.e();
                }
                if (p0Var == null && adColonyAdView != null) {
                    p0Var = adColonyAdView.getOmidManager();
                }
                if (p0Var == null) {
                    i = -1;
                } else {
                    i = p0Var.d();
                }
                if (p0Var != null && i == 2) {
                    p0Var.a((WebView) this.f10025b);
                    p0Var.a(this.f10026c);
                }
            } catch (IllegalArgumentException unused) {
                new e0.a().a("IllegalArgumentException when creating omid session").a(e0.i);
            }
        }
    }

    class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f10028a;

        s(d dVar, c cVar) {
            this.f10028a = cVar;
        }

        public void run() {
            for (int i = 0; i < this.f10028a.i().size(); i++) {
                a.b(this.f10028a.j().get(i), this.f10028a.i().get(i));
            }
            this.f10028a.j().clear();
            this.f10028a.i().clear();
            this.f10028a.removeAllViews();
            c cVar = this.f10028a;
            cVar.z = null;
            cVar.y = null;
            for (b1 next : cVar.n().values()) {
                if (!(next instanceof e)) {
                    if (next instanceof c1) {
                        a.b().a((k0) (c1) next);
                    } else {
                        next.l();
                    }
                }
            }
            for (a1 next2 : this.f10028a.m().values()) {
                next2.j();
                next2.k();
            }
            this.f10028a.m().clear();
            this.f10028a.l().clear();
            this.f10028a.n().clear();
            this.f10028a.h().clear();
            this.f10028a.e().clear();
            this.f10028a.f().clear();
            this.f10028a.g().clear();
            this.f10028a.m = true;
        }
    }

    class t implements j0 {

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f10030a;

            a(h0 h0Var) {
                this.f10030a = h0Var;
            }

            public void run() {
                boolean unused = d.this.d(this.f10030a);
            }
        }

        t() {
        }

        public void a(h0 h0Var) {
            z0.b((Runnable) new a(h0Var));
        }
    }

    class u implements j0 {
        u() {
        }

        public void a(h0 h0Var) {
            boolean unused = d.this.k(h0Var);
        }
    }

    class v implements j0 {
        v() {
        }

        public void a(h0 h0Var) {
            boolean unused = d.this.j(h0Var);
        }
    }

    class w implements j0 {
        w() {
        }

        public void a(h0 h0Var) {
            boolean unused = d.this.f(h0Var);
        }
    }

    class x implements j0 {
        x() {
        }

        public void a(h0 h0Var) {
            boolean unused = d.this.l(h0Var);
        }
    }

    class y implements j0 {
        y() {
        }

        public void a(h0 h0Var) {
            d.this.b(h0Var);
        }
    }

    class z implements j0 {
        z() {
        }

        public void a(h0 h0Var) {
            d.this.a(h0Var);
        }
    }

    d() {
    }

    /* access modifiers changed from: private */
    public boolean g(h0 h0Var) {
        String h2 = c0.h(h0Var.a(), OSOutcomeConstants.OUTCOME_ID);
        f1 b2 = c0.b();
        c0.a(b2, OSOutcomeConstants.OUTCOME_ID, h2);
        Context a2 = a.a();
        if (a2 == null) {
            c0.b(b2, "has_audio", false);
            h0Var.a(b2).c();
            return false;
        }
        boolean b3 = z0.b(z0.a(a2));
        double a3 = z0.a(z0.a(a2));
        c0.b(b2, "has_audio", b3);
        c0.a(b2, "volume", a3);
        h0Var.a(b2).c();
        return b3;
    }

    /* access modifiers changed from: private */
    public boolean j(h0 h0Var) {
        f1 a2 = h0Var.a();
        String b2 = h0Var.b();
        String h2 = c0.h(a2, "ad_session_id");
        int d2 = c0.d(a2, "view_id");
        c cVar = this.f9985b.get(h2);
        if (cVar == null) {
            a(b2, h2);
            return false;
        }
        View view = cVar.e().get(Integer.valueOf(d2));
        if (view == null) {
            a(b2, "" + d2);
            return false;
        }
        cVar.removeView(view);
        cVar.addView(view, view.getLayoutParams());
        return true;
    }

    /* access modifiers changed from: private */
    public boolean k(h0 h0Var) {
        f1 a2 = h0Var.a();
        String b2 = h0Var.b();
        String h2 = c0.h(a2, "ad_session_id");
        int d2 = c0.d(a2, "view_id");
        c cVar = this.f9985b.get(h2);
        if (cVar == null) {
            a(b2, h2);
            return false;
        }
        View view = cVar.e().get(Integer.valueOf(d2));
        if (view == null) {
            a(b2, "" + d2);
            return false;
        }
        view.bringToFront();
        return true;
    }

    /* access modifiers changed from: private */
    public boolean l(h0 h0Var) {
        f1 a2 = h0Var.a();
        String h2 = c0.h(a2, OSOutcomeConstants.OUTCOME_ID);
        AdColonyInterstitial adColonyInterstitial = this.f9986c.get(h2);
        AdColonyAdView adColonyAdView = this.f9989f.get(h2);
        int a3 = c0.a(a2, AdUnitActivity.EXTRA_ORIENTATION, -1);
        boolean z2 = adColonyAdView != null;
        if (adColonyInterstitial != null || z2) {
            c0.a(c0.b(), OSOutcomeConstants.OUTCOME_ID, h2);
            if (adColonyInterstitial != null) {
                adColonyInterstitial.a(a3);
                adColonyInterstitial.n();
            }
            return true;
        }
        a(h0Var.b(), h2);
        return false;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f9984a = new ConcurrentHashMap<>();
        this.f9985b = new HashMap<>();
        this.f9986c = new ConcurrentHashMap<>();
        this.f9987d = new ConcurrentHashMap<>();
        this.f9988e = new ConcurrentHashMap<>();
        this.f9989f = Collections.synchronizedMap(new HashMap());
        a.a("AdContainer.create", (j0) new l());
        a.a("AdContainer.destroy", (j0) new t());
        a.a("AdContainer.move_view_to_index", (j0) new u());
        a.a("AdContainer.move_view_to_front", (j0) new v());
        a.a("AdSession.finish_fullscreen_ad", (j0) new w());
        a.a("AdSession.start_fullscreen_ad", (j0) new x());
        a.a("AdSession.ad_view_available", (j0) new y());
        a.a("AdSession.ad_view_unavailable", (j0) new z());
        a.a("AdSession.expiring", (j0) new a());
        a.a("AdSession.audio_stopped", (j0) new b());
        a.a("AdSession.audio_started", (j0) new c());
        a.a("AdSession.interstitial_available", (j0) new C0094d());
        a.a("AdSession.interstitial_unavailable", (j0) new e());
        a.a("AdSession.has_audio", (j0) new f());
        a.a("WebView.prepare", (j0) new g(this));
        a.a("AdSession.expanded", (j0) new h(this));
        a.a("AdColony.odt_event", (j0) new i(this));
    }

    /* access modifiers changed from: package-private */
    public boolean i(h0 h0Var) {
        f1 a2 = h0Var.a();
        String h2 = c0.h(a2, OSOutcomeConstants.OUTCOME_ID);
        AdColonyInterstitial adColonyInterstitial = this.f9986c.get(h2);
        if (adColonyInterstitial == null || adColonyInterstitial.j()) {
            return false;
        }
        AdColonyInterstitialListener listener = adColonyInterstitial.getListener();
        if (listener == null) {
            a(h0Var.b(), h2);
            return false;
        }
        z0.c(this.f9984a.remove(h2));
        if (!a.c()) {
            a(adColonyInterstitial);
            return false;
        }
        adColonyInterstitial.t();
        adColonyInterstitial.a(c0.h(a2, "ad_id"));
        adColonyInterstitial.c(c0.h(a2, "creative_id"));
        adColonyInterstitial.d(c0.h(a2, "ad_request_id"));
        z0.b((Runnable) new m(this, h0Var, adColonyInterstitial, listener));
        return true;
    }

    /* access modifiers changed from: private */
    public boolean d(h0 h0Var) {
        String h2 = c0.h(h0Var.a(), "ad_session_id");
        c cVar = this.f9985b.get(h2);
        if (cVar == null) {
            a(h0Var.b(), h2);
            return false;
        }
        a(cVar);
        return true;
    }

    /* access modifiers changed from: private */
    public boolean f(h0 h0Var) {
        AdColonyInterstitialListener adColonyInterstitialListener;
        f1 a2 = h0Var.a();
        int d2 = c0.d(a2, "status");
        if (d2 == 5 || d2 == 1 || d2 == 0 || d2 == 6) {
            return false;
        }
        String h2 = c0.h(a2, OSOutcomeConstants.OUTCOME_ID);
        AdColonyInterstitial remove = this.f9986c.remove(h2);
        if (remove == null) {
            adColonyInterstitialListener = null;
        } else {
            adColonyInterstitialListener = remove.getListener();
        }
        if (adColonyInterstitialListener == null) {
            a(h0Var.b(), h2);
            return false;
        }
        z0.b((Runnable) new q(this, adColonyInterstitialListener, remove));
        remove.o();
        remove.a((c) null);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean b(h0 h0Var) {
        String h2 = c0.h(h0Var.a(), OSOutcomeConstants.OUTCOME_ID);
        AdColonyAdViewListener remove = this.f9987d.remove(h2);
        if (remove == null) {
            a(h0Var.b(), h2);
            return false;
        }
        this.f9988e.put(h2, remove);
        z0.c(this.f9984a.remove(h2));
        Context a2 = a.a();
        if (a2 == null) {
            a(remove);
            return false;
        }
        z0.b((Runnable) new k(a2, h0Var, remove, h2));
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean c(h0 h0Var) {
        Context a2 = a.a();
        if (a2 == null) {
            return false;
        }
        f1 a3 = h0Var.a();
        String h2 = c0.h(a3, "ad_session_id");
        c cVar = new c(a2.getApplicationContext(), h2);
        cVar.j(h0Var);
        this.f9985b.put(h2, cVar);
        if (c0.d(a3, IabUtils.KEY_WIDTH) == 0) {
            AdColonyInterstitial adColonyInterstitial = this.f9986c.get(h2);
            if (adColonyInterstitial == null) {
                a(h0Var.b(), h2);
                return false;
            }
            adColonyInterstitial.a(cVar);
        } else {
            cVar.c(false);
        }
        f1 b2 = c0.b();
        c0.b(b2, "success", true);
        h0Var.a(b2).c();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean e(h0 h0Var) {
        f1 a2 = h0Var.a();
        String h2 = c0.h(a2, OSOutcomeConstants.OUTCOME_ID);
        if (c0.d(a2, "type") != 0) {
            return true;
        }
        AdColonyInterstitial remove = this.f9986c.remove(h2);
        if (!a.c() || remove == null || !remove.p()) {
            a(h0Var.b(), h2);
            return true;
        }
        z0.b((Runnable) new j(this));
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean a(h0 h0Var) {
        String h2 = c0.h(h0Var.a(), OSOutcomeConstants.OUTCOME_ID);
        AdColonyAdViewListener remove = this.f9987d.remove(h2);
        if (remove == null) {
            a(h0Var.b(), h2);
            return false;
        }
        z0.c(this.f9984a.remove(h2));
        a(remove);
        return true;
    }

    /* access modifiers changed from: package-private */
    public Map<String, AdColonyAdView> d() {
        return this.f9989f;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (AdColonyInterstitial next : this.f9986c.values()) {
            if (next != null && next.m()) {
                next.e("Controller was reloaded and current ad was closed");
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(AdColonyAdViewListener adColonyAdViewListener) {
        z0.b((Runnable) new n(this, adColonyAdViewListener));
    }

    private void a(AdColonyInterstitial adColonyInterstitial) {
        adColonyInterstitial.q();
        if (!a.c()) {
            e0.a a2 = new e0.a().a("RequestNotFilled called due to a missing context. ");
            a2.a("Interstitial with adSessionId(" + adColonyInterstitial.b() + ").").a(e0.i);
        }
    }

    /* access modifiers changed from: package-private */
    public List<AdColonyInterstitial> g() {
        ArrayList arrayList = new ArrayList();
        for (AdColonyInterstitial next : f().values()) {
            if (!next.isExpired()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        HashSet<AdColonyAdViewListener> hashSet = new HashSet<>();
        synchronized (this.f9990g) {
            for (String remove : this.f9988e.keySet()) {
                AdColonyAdViewListener remove2 = this.f9988e.remove(remove);
                if (remove2 != null) {
                    hashSet.add(remove2);
                }
            }
            for (String remove3 : this.f9987d.keySet()) {
                AdColonyAdViewListener remove4 = this.f9987d.remove(remove3);
                if (remove4 != null) {
                    hashSet.add(remove4);
                }
            }
        }
        for (AdColonyAdViewListener a2 : hashSet) {
            a(a2);
        }
        for (String next : this.f9986c.keySet()) {
            AdColonyInterstitial adColonyInterstitial = this.f9986c.get(next);
            if (adColonyInterstitial != null && adColonyInterstitial.l()) {
                this.f9986c.remove(next);
                a(adColonyInterstitial);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ConcurrentHashMap<String, AdColonyAdViewListener> e() {
        return this.f9987d;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions, long j2) {
        f1 f1Var;
        String a2 = z0.a();
        float s2 = a.b().n().s();
        f1 b2 = c0.b();
        c0.a(b2, "zone_id", str);
        c0.b(b2, "type", 1);
        c0.b(b2, "width_pixels", (int) (((float) adColonyAdSize.getWidth()) * s2));
        c0.b(b2, "height_pixels", (int) (((float) adColonyAdSize.getHeight()) * s2));
        c0.b(b2, IabUtils.KEY_WIDTH, adColonyAdSize.getWidth());
        c0.b(b2, IabUtils.KEY_HEIGHT, adColonyAdSize.getHeight());
        c0.a(b2, OSOutcomeConstants.OUTCOME_ID, a2);
        if (!(adColonyAdOptions == null || (f1Var = adColonyAdOptions.f9809d) == null)) {
            c0.a(b2, "options", f1Var);
        }
        adColonyAdViewListener.a(str);
        adColonyAdViewListener.a(adColonyAdSize);
        this.f9987d.put(a2, adColonyAdViewListener);
        this.f9984a.put(a2, new o(a2, str, j2));
        new h0("AdSession.on_request", 1, b2).c();
        z0.a(this.f9984a.get(a2), j2);
    }

    /* access modifiers changed from: package-private */
    public HashMap<String, c> c() {
        return this.f9985b;
    }

    /* access modifiers changed from: package-private */
    public ConcurrentHashMap<String, AdColonyInterstitial> f() {
        return this.f9986c;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions, long j2) {
        String a2 = z0.a();
        k b2 = a.b();
        AdColonyInterstitial adColonyInterstitial = new AdColonyInterstitial(a2, adColonyInterstitialListener, str);
        f1 b3 = c0.b();
        c0.a(b3, "zone_id", str);
        c0.b(b3, "fullscreen", true);
        Rect w2 = b2.n().w();
        c0.b(b3, IabUtils.KEY_WIDTH, w2.width());
        c0.b(b3, IabUtils.KEY_HEIGHT, w2.height());
        c0.b(b3, "type", 0);
        c0.a(b3, OSOutcomeConstants.OUTCOME_ID, a2);
        if (!(adColonyAdOptions == null || adColonyAdOptions.f9809d == null)) {
            adColonyInterstitial.a(adColonyAdOptions);
            c0.a(b3, "options", adColonyAdOptions.f9809d);
        }
        this.f9986c.put(a2, adColonyInterstitial);
        this.f9984a.put(a2, new p(a2, str, j2));
        new h0("AdSession.on_request", 1, b3).c();
        z0.a(this.f9984a.get(a2), j2);
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, f1 f1Var, String str) {
        h0 h0Var = new h0("AdSession.finish_fullscreen_ad", 0);
        c0.b(f1Var, "status", 1);
        h0Var.b(f1Var);
        new e0.a().a(str).a(e0.f10045h);
        ((b) context).a(h0Var);
    }

    /* access modifiers changed from: package-private */
    public void a(b1 b1Var, String str, c cVar) {
        z0.b((Runnable) new r(str, b1Var, cVar));
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        z0.b((Runnable) new s(this, cVar));
        AdColonyAdView adColonyAdView = this.f9989f.get(cVar.a());
        if (adColonyAdView == null || adColonyAdView.d()) {
            this.f9985b.remove(cVar.a());
            cVar.y = null;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean h(h0 h0Var) {
        AdColonyInterstitialListener adColonyInterstitialListener;
        String h2 = c0.h(h0Var.a(), OSOutcomeConstants.OUTCOME_ID);
        AdColonyInterstitial remove = this.f9986c.remove(h2);
        if (remove == null) {
            adColonyInterstitialListener = null;
        } else {
            adColonyInterstitialListener = remove.getListener();
        }
        if (adColonyInterstitialListener == null) {
            a(h0Var.b(), h2);
            return false;
        }
        z0.c(this.f9984a.remove(h2));
        a(remove);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2) {
        new e0.a().a("Message '").a(str).a("' sent with invalid id: ").a(str2).a(e0.f10045h);
    }

    /* access modifiers changed from: package-private */
    public AdColonyAdView a(String str) {
        AdColonyAdView remove;
        synchronized (this.f9990g) {
            remove = this.f9989f.remove(str);
        }
        return remove;
    }
}
