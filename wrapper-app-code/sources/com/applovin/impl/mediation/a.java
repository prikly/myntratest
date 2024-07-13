package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.a.c;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;

public class a extends com.applovin.impl.sdk.utils.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.a f14423a;

    /* renamed from: b  reason: collision with root package name */
    private final v f14424b;

    /* renamed from: c  reason: collision with root package name */
    private C0140a f14425c;

    /* renamed from: d  reason: collision with root package name */
    private c f14426d;

    /* renamed from: e  reason: collision with root package name */
    private int f14427e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14428f;

    /* renamed from: com.applovin.impl.mediation.a$a  reason: collision with other inner class name */
    public interface C0140a {
        void a(c cVar);
    }

    a(n nVar) {
        this.f14424b = nVar.D();
        this.f14423a = nVar.ai();
    }

    public void a() {
        if (v.a()) {
            this.f14424b.b("AdActivityObserver", "Cancelling...");
        }
        this.f14423a.b(this);
        this.f14425c = null;
        this.f14426d = null;
        this.f14427e = 0;
        this.f14428f = false;
    }

    public void a(c cVar, C0140a aVar) {
        if (v.a()) {
            v vVar = this.f14424b;
            vVar.b("AdActivityObserver", "Starting for ad " + cVar.getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        a();
        this.f14425c = aVar;
        this.f14426d = cVar;
        this.f14423a.a(this);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f14428f) {
            this.f14428f = true;
        }
        this.f14427e++;
        if (v.a()) {
            this.f14424b.b("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.f14427e);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (this.f14428f) {
            this.f14427e--;
            if (v.a()) {
                this.f14424b.b("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.f14427e);
            }
            if (this.f14427e <= 0) {
                if (v.a()) {
                    this.f14424b.b("AdActivityObserver", "Last ad Activity destroyed");
                }
                if (this.f14425c != null) {
                    if (v.a()) {
                        this.f14424b.b("AdActivityObserver", "Invoking callback...");
                    }
                    this.f14425c.a(this.f14426d);
                }
                a();
            }
        }
    }
}
