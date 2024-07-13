package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import com.iab.omid.library.ironsrc.b.c;
import com.iab.omid.library.ironsrc.b.f;
import com.iab.omid.library.ironsrc.d.e;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class a extends AdSession {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f7860a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionContext f7861b;

    /* renamed from: c  reason: collision with root package name */
    private final AdSessionConfiguration f7862c;

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f7863d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.ironsrc.e.a f7864e;

    /* renamed from: f  reason: collision with root package name */
    private AdSessionStatePublisher f7865f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7866g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7867h = false;
    private String i;
    private boolean j;
    private boolean k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f7862c = adSessionConfiguration;
        this.f7861b = adSessionContext;
        this.i = UUID.randomUUID().toString();
        c((View) null);
        this.f7865f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.ironsrc.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f7865f.a();
        com.iab.omid.library.ironsrc.b.a.a().a(this);
        this.f7865f.a(adSessionConfiguration);
    }

    private c a(View view) {
        for (c next : this.f7863d) {
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
        if (str.length() > 50 || !f7860a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    private void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void c(View view) {
        this.f7864e = new com.iab.omid.library.ironsrc.e.a(view);
    }

    private void d(View view) {
        Collection<a> b2 = com.iab.omid.library.ironsrc.b.a.a().b();
        if (b2 != null && b2.size() > 0) {
            for (a next : b2) {
                if (next != this && next.d() == view) {
                    next.f7864e.clear();
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
        return this.f7863d;
    }

    /* access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        k();
        getAdSessionStatePublisher().a(jSONObject);
        this.k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f7867h) {
            b(view);
            a(str);
            if (a(view) == null) {
                this.f7863d.add(new c(view, friendlyObstructionPurpose, str));
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
        return (View) this.f7864e.get();
    }

    public boolean e() {
        return this.f7866g && !this.f7867h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f7867h) {
            e.a((Object) errorType, "Error type is null");
            e.a(str, "Message is null");
            getAdSessionStatePublisher().a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public boolean f() {
        return this.f7866g;
    }

    public void finish() {
        if (!this.f7867h) {
            this.f7864e.clear();
            removeAllFriendlyObstructions();
            this.f7867h = true;
            getAdSessionStatePublisher().f();
            com.iab.omid.library.ironsrc.b.a.a().c(this);
            getAdSessionStatePublisher().b();
            this.f7865f = null;
        }
    }

    public boolean g() {
        return this.f7867h;
    }

    public String getAdSessionId() {
        return this.i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f7865f;
    }

    public boolean h() {
        return this.f7862c.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f7862c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f7867h) {
            e.a((Object) view, "AdView is null");
            if (d() != view) {
                c(view);
                getAdSessionStatePublisher().i();
                d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f7867h) {
            this.f7863d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f7867h) {
            b(view);
            c a2 = a(view);
            if (a2 != null) {
                this.f7863d.remove(a2);
            }
        }
    }

    public void start() {
        if (!this.f7866g) {
            this.f7866g = true;
            com.iab.omid.library.ironsrc.b.a.a().b(this);
            this.f7865f.a(f.a().d());
            this.f7865f.a(this, this.f7861b);
        }
    }
}
