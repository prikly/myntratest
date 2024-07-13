package com.iab.omid.library.appodeal.adsession;

import android.view.View;
import com.iab.omid.library.appodeal.b.c;
import com.iab.omid.library.appodeal.b.f;
import com.iab.omid.library.appodeal.d.e;
import com.iab.omid.library.appodeal.publisher.AdSessionStatePublisher;
import com.iab.omid.library.appodeal.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class a extends AdSession {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f7753a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionContext f7754b;

    /* renamed from: c  reason: collision with root package name */
    private final AdSessionConfiguration f7755c;

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f7756d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.appodeal.e.a f7757e;

    /* renamed from: f  reason: collision with root package name */
    private AdSessionStatePublisher f7758f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7759g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7760h = false;
    private final String i;
    private boolean j;
    private boolean k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f7755c = adSessionConfiguration;
        this.f7754b = adSessionContext;
        this.i = UUID.randomUUID().toString();
        c((View) null);
        this.f7758f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.appodeal.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f7758f.a();
        com.iab.omid.library.appodeal.b.a.a().a(this);
        this.f7758f.a(adSessionConfiguration);
    }

    private c a(View view) {
        for (c next : this.f7756d) {
            if (next.a().get() == view) {
                return next;
            }
        }
        return null;
    }

    private void a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f7753a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    private static void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void c(View view) {
        this.f7757e = new com.iab.omid.library.appodeal.e.a(view);
    }

    private void d(View view) {
        Collection<a> b2 = com.iab.omid.library.appodeal.b.a.a().b();
        if (b2 != null && !b2.isEmpty()) {
            for (a next : b2) {
                if (next != this && next.d() == view) {
                    next.f7757e.clear();
                }
            }
        }
    }

    private void j() {
        if (this.j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void k() {
        if (this.k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public List<c> a() {
        return this.f7756d;
    }

    /* access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        k();
        getAdSessionStatePublisher().a(jSONObject);
        this.k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f7760h) {
            b(view);
            a(str);
            if (a(view) == null) {
                this.f7756d.add(new c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        j();
        getAdSessionStatePublisher().g();
        this.j = true;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        k();
        getAdSessionStatePublisher().h();
        this.k = true;
    }

    public View d() {
        return (View) this.f7757e.get();
    }

    public boolean e() {
        return this.f7759g && !this.f7760h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f7760h) {
            e.a((Object) errorType, "Error type is null");
            e.a(str, "Message is null");
            getAdSessionStatePublisher().a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public boolean f() {
        return this.f7759g;
    }

    public void finish() {
        if (!this.f7760h) {
            this.f7757e.clear();
            removeAllFriendlyObstructions();
            this.f7760h = true;
            getAdSessionStatePublisher().f();
            com.iab.omid.library.appodeal.b.a.a().c(this);
            getAdSessionStatePublisher().b();
            this.f7758f = null;
        }
    }

    public boolean g() {
        return this.f7760h;
    }

    public String getAdSessionId() {
        return this.i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f7758f;
    }

    public boolean h() {
        return this.f7755c.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f7755c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f7760h) {
            e.a((Object) view, "AdView is null");
            if (d() != view) {
                c(view);
                getAdSessionStatePublisher().i();
                d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f7760h) {
            this.f7756d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f7760h) {
            b(view);
            c a2 = a(view);
            if (a2 != null) {
                this.f7756d.remove(a2);
            }
        }
    }

    public void start() {
        if (!this.f7759g) {
            this.f7759g = true;
            com.iab.omid.library.appodeal.b.a.a().b(this);
            this.f7758f.a(f.a().d());
            this.f7758f.a(this, this.f7754b);
        }
    }
}
