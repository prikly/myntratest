package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import com.iab.omid.library.applovin.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class a extends AdSession {
    private static final Pattern l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a  reason: collision with root package name */
    private final AdSessionContext f7634a;

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionConfiguration f7635b;

    /* renamed from: c  reason: collision with root package name */
    private final List<e> f7636c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f7637d;

    /* renamed from: e  reason: collision with root package name */
    private AdSessionStatePublisher f7638e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7639f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7640g = false;

    /* renamed from: h  reason: collision with root package name */
    private final String f7641h;
    private boolean i;
    private boolean j;
    private PossibleObstructionListener k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f7635b = adSessionConfiguration;
        this.f7634a = adSessionContext;
        this.f7641h = UUID.randomUUID().toString();
        d((View) null);
        this.f7638e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f7638e.i();
        c.c().a(this);
        this.f7638e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private static void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!l.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    private e b(View view) {
        for (e next : this.f7636c) {
            if (next.c().get() == view) {
                return next;
            }
        }
        return null;
    }

    private void b() {
        if (this.j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void c(View view) {
        Collection<a> b2 = c.c().b();
        if (b2 != null && !b2.isEmpty()) {
            for (a next : b2) {
                if (next != this && next.c() == view) {
                    next.f7637d.clear();
                }
            }
        }
    }

    private void d(View view) {
        this.f7637d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.applovin.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            for (com.iab.omid.library.applovin.weakreference.a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.k.onPossibleObstructionsDetected(this.f7641h, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.j = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f7640g) {
            a(view);
            a(str);
            if (b(view) == null) {
                this.f7636c.add(new e(view, friendlyObstructionPurpose, str));
            }
        }
    }

    public View c() {
        return (View) this.f7637d.get();
    }

    public List<e> d() {
        return this.f7636c;
    }

    public boolean e() {
        return this.k != null;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f7640g) {
            g.a((Object) errorType, "Error type is null");
            g.a(str, "Message is null");
            getAdSessionStatePublisher().a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public boolean f() {
        return this.f7639f && !this.f7640g;
    }

    public void finish() {
        if (!this.f7640g) {
            this.f7637d.clear();
            removeAllFriendlyObstructions();
            this.f7640g = true;
            getAdSessionStatePublisher().f();
            c.c().b(this);
            getAdSessionStatePublisher().b();
            this.f7638e = null;
            this.k = null;
        }
    }

    public boolean g() {
        return this.f7640g;
    }

    public String getAdSessionId() {
        return this.f7641h;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f7638e;
    }

    public boolean h() {
        return this.f7635b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f7635b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f7639f;
    }

    /* access modifiers changed from: package-private */
    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.i = true;
    }

    /* access modifiers changed from: package-private */
    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.j = true;
    }

    public void registerAdView(View view) {
        if (!this.f7640g) {
            g.a((Object) view, "AdView is null");
            if (c() != view) {
                d(view);
                getAdSessionStatePublisher().a();
                c(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f7640g) {
            this.f7636c.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f7640g) {
            a(view);
            e b2 = b(view);
            if (b2 != null) {
                this.f7636c.remove(b2);
            }
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.k = possibleObstructionListener;
    }

    public void start() {
        if (!this.f7639f) {
            this.f7639f = true;
            c.c().c(this);
            this.f7638e.a(h.c().b());
            this.f7638e.a(com.iab.omid.library.applovin.internal.a.a().b());
            this.f7638e.a(this, this.f7634a);
        }
    }
}
