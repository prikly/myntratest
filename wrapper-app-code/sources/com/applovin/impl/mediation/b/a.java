package com.applovin.impl.mediation.b;

import android.app.Activity;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.a.f;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.List;

public class a extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<f> f14550a;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Activity f14551e;

    /* renamed from: com.applovin.impl.mediation.b.a$a  reason: collision with other inner class name */
    public static class C0142a extends com.applovin.impl.sdk.e.a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final f f14554a;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final List<f> f14555e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final Activity f14556f;

        private C0142a(f fVar, List<f> list, n nVar, Activity activity) {
            super("TaskSequentialInitAdapter:" + fVar.R(), nVar, true);
            this.f14556f = activity;
            this.f14554a = fVar;
            this.f14555e = list;
        }

        public void run() {
            v vVar = this.f15420d;
            if (v.a()) {
                v vVar2 = this.f15420d;
                String str = this.f15419c;
                vVar2.b(str, "Auto-initing " + this.f14554a + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f15418b.G().a(this.f14554a, this.f14556f, new Runnable() {
                public void run() {
                    v unused = C0142a.this.f15420d;
                    if (v.a()) {
                        v d2 = C0142a.this.f15420d;
                        String b2 = C0142a.this.f15419c;
                        d2.b(b2, "Initialization task for adapter '" + C0142a.this.f14554a.S() + "' finished");
                    }
                    int indexOf = C0142a.this.f14555e.indexOf(C0142a.this.f14554a);
                    if (indexOf < C0142a.this.f14555e.size() - 1) {
                        f fVar = (f) C0142a.this.f14555e.get(indexOf + 1);
                        C0142a.this.f15418b.V().a((com.applovin.impl.sdk.e.a) new C0142a(fVar, C0142a.this.f14555e, C0142a.this.f15418b, C0142a.this.f14556f), o.a.MAIN, fVar.af());
                        return;
                    }
                    v unused2 = C0142a.this.f15420d;
                    if (v.a()) {
                        C0142a.this.f15420d.b(C0142a.this.f15419c, "Finished initializing adapters");
                    }
                }
            });
        }
    }

    public a(List<f> list, Activity activity, n nVar) {
        super("TaskAutoInitAdapters", nVar, true);
        this.f14550a = list;
        this.f14551e = activity;
    }

    public void run() {
        try {
            if (this.f14550a.size() > 0) {
                v vVar = this.f15420d;
                if (v.a()) {
                    v vVar2 = this.f15420d;
                    String str = this.f15419c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Auto-initing ");
                    sb.append(this.f14550a.size());
                    sb.append(" adapters");
                    sb.append(this.f15418b.N().a() ? " in test mode" : "");
                    sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
                    vVar2.b(str, sb.toString());
                }
                if (TextUtils.isEmpty(this.f15418b.u())) {
                    this.f15418b.c(AppLovinMediationProvider.MAX);
                } else if (!this.f15418b.f()) {
                    v.i("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f15418b.u());
                }
                if (this.f14551e == null) {
                    v.i("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
                }
                if (((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.a.Q)).booleanValue()) {
                    f fVar = this.f14550a.get(0);
                    this.f15418b.V().a((com.applovin.impl.sdk.e.a) new C0142a(fVar, this.f14550a, this.f15418b, this.f14551e), o.a.MAIN, fVar.af());
                    return;
                }
                for (final f next : this.f14550a) {
                    this.f15418b.V().a((Runnable) new Runnable() {
                        public void run() {
                            v unused = a.this.f15420d;
                            if (v.a()) {
                                v c2 = a.this.f15420d;
                                String b2 = a.this.f15419c;
                                c2.b(b2, "Auto-initing adapter: " + next);
                            }
                            a.this.f15418b.G().a(next, a.this.f14551e);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            v vVar3 = this.f15420d;
            if (v.a()) {
                this.f15420d.b(this.f15419c, "Failed to auto-init adapters", th);
            }
        }
    }
}
