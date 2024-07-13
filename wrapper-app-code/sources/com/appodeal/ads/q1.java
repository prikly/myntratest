package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.o1;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.w2;

public final class q1 {

    /* renamed from: f  reason: collision with root package name */
    public static volatile q1 f17033f;

    /* renamed from: a  reason: collision with root package name */
    public InterstitialCallbacks f17034a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17035b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17036c = true;

    /* renamed from: d  reason: collision with root package name */
    public final a f17037d;

    /* renamed from: e  reason: collision with root package name */
    public final b f17038e;

    public class a extends c<r1, p1, o1.c> {
        public a(q1 q1Var) {
            super();
        }

        public final u<p1, r1, o1.c> a() {
            return o1.a();
        }
    }

    public class b extends c<q5, o5, w2.a> {
        public b(q1 q1Var) {
            super();
        }

        public final u<o5, q5, w2.a> a() {
            return w2.a();
        }
    }

    public abstract class c<AdRequestType extends r<AdObjectType>, AdObjectType extends l, RequestParamsType extends s> extends g<AdRequestType, AdObjectType, Object> {

        /* renamed from: a  reason: collision with root package name */
        public c f17039a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17040b = false;

        /* renamed from: c  reason: collision with root package name */
        public boolean f17041c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f17042d = false;

        public c() {
        }

        public abstract u<AdObjectType, AdRequestType, RequestParamsType> a();

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
            if (r0.j == false) goto L_0x0053;
         */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.content.Context r6, RequestParamsType r7) {
            /*
                r5 = this;
                com.appodeal.ads.u r0 = r5.a()
                boolean r1 = r7.f17189a
                if (r1 == 0) goto L_0x000c
                r0.b((android.content.Context) r6, r7)
                return
            L_0x000c:
                boolean r1 = r0.i
                if (r1 != 0) goto L_0x001a
                java.lang.String r6 = "Interstitial"
                java.lang.String r7 = "Request Failed"
                java.lang.String r0 = "isn't initialized"
                com.appodeal.ads.utils.Log.log((java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r0)
                return
            L_0x001a:
                boolean r1 = r5.f17041c
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0053
                r5.f17041c = r3
                r5.f17040b = r2
                r5.f17042d = r3
                com.appodeal.ads.r r1 = r0.f()
                if (r1 == 0) goto L_0x0046
                boolean r4 = r1.u
                if (r4 == 0) goto L_0x0046
                boolean r4 = r0.j
                if (r4 != 0) goto L_0x0046
                AdObjectType r1 = r1.s
                if (r1 == 0) goto L_0x0041
                com.appodeal.ads.f5 r1 = r1.f16570c
                boolean r1 = r1.isPrecache()
                if (r1 == 0) goto L_0x0041
                goto L_0x0042
            L_0x0041:
                r2 = 0
            L_0x0042:
                r5.a(r2)
                goto L_0x0053
            L_0x0046:
                if (r1 == 0) goto L_0x0054
                boolean r1 = r1.b()
                if (r1 != 0) goto L_0x0054
                boolean r1 = r0.j
                if (r1 == 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r2 = 0
            L_0x0054:
                if (r2 == 0) goto L_0x0059
                r0.b((android.content.Context) r6, r7)
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.q1.c.a(android.content.Context, com.appodeal.ads.s):void");
        }

        public final void a(AdRequestType adrequesttype, AdObjectType adobjecttype) {
            Log.log("Interstitial", LogConstants.EVENT_NOTIFY_CLOSED, Log.LogLevel.verbose);
            if (q1.this.f17034a != null) {
                q1.this.f17034a.onInterstitialClosed();
            }
        }

        public final void a(AdRequestType adrequesttype, AdObjectType adobjecttype, Object obj) {
            Log.log("Interstitial", LogConstants.EVENT_NOTIFY_CLICKED, Log.LogLevel.verbose);
            if (q1.this.f17034a != null) {
                q1.this.f17034a.onInterstitialClicked();
            }
        }

        public final void a(boolean z) {
            this.f17042d = false;
            if (!q1.this.f17035b) {
                q1.this.f17035b = true;
                Log.log("Interstitial", LogConstants.EVENT_NOTIFY_LOADED, String.format("isPrecache: %s", new Object[]{Boolean.valueOf(z)}), Log.LogLevel.verbose);
                if (q1.this.f17034a != null) {
                    q1.this.f17034a.onInterstitialLoaded(z);
                }
            }
        }

        public final void b(AdRequestType adrequesttype, AdObjectType adobjecttype) {
            if (a().k()) {
                this.f17041c = true;
                a().c(com.appodeal.ads.context.b.f16327b.getApplicationContext());
            }
            r f2 = this.f17039a.a().f();
            if (f2 == null || !f2.p() || this.f17039a.a().p()) {
                Log.log("Interstitial", LogConstants.EVENT_NOTIFY_EXPIRED, Log.LogLevel.verbose);
                if (q1.this.f17034a != null) {
                    q1.this.f17034a.onInterstitialExpired();
                }
                if (q1.this.f17036c) {
                    q1.this.f17035b = false;
                }
            }
        }

        public final void b(r rVar, l lVar, Object obj) {
            this.f17042d = true;
            Log.log("Interstitial", LogConstants.EVENT_NOTIFY_SHOW_FAILED, Log.LogLevel.verbose);
            if (q1.this.f17034a != null) {
                q1.this.f17034a.onInterstitialShowFailed();
            }
            c cVar = this.f17039a;
            if (!cVar.f17040b || cVar.f17042d || cVar.a().m()) {
                this.f17041c = true;
                c cVar2 = this.f17039a;
                if (cVar2.f17040b && cVar2.f17042d) {
                    cVar2.f17041c = true;
                }
            }
        }

        public final void c(AdRequestType adrequesttype, AdObjectType adobjecttype, Object obj) {
            Log.log("Interstitial", LogConstants.EVENT_NOTIFY_SHOWN, Log.LogLevel.verbose);
            if (q1.this.f17034a != null) {
                q1.this.f17034a.onInterstitialShown();
            }
            q1.this.f17035b = false;
            this.f17040b = false;
            this.f17042d = false;
            this.f17041c = true;
            c cVar = this.f17039a;
            if (cVar.f17040b && cVar.f17042d) {
                cVar.f17041c = true;
            } else if (q4.e(cVar.a().d().getCode())) {
                c cVar2 = this.f17039a;
                cVar2.a(q4.f(cVar2.a().d().getCode()));
            }
            if (adrequesttype != null && !adrequesttype.q() && q1.a().b()) {
                r f2 = a().f();
                if (f2 == null || f2.b()) {
                    a().c(com.appodeal.ads.context.b.f16327b.getApplicationContext());
                }
            }
        }

        public final void d(r rVar, l lVar) {
            this.f17042d = true;
            c cVar = this.f17039a;
            if (!cVar.f17040b || cVar.f17042d || cVar.a().m()) {
                this.f17041c = true;
                Log.log("Interstitial", LogConstants.EVENT_NOTIFY_LOAD_FAILED, Log.LogLevel.verbose);
                if (q1.this.f17034a != null) {
                    q1.this.f17034a.onInterstitialFailedToLoad();
                }
                c cVar2 = this.f17039a;
                if (cVar2.f17040b && cVar2.f17042d) {
                    cVar2.f17041c = true;
                }
            }
        }

        public final void e(AdRequestType adrequesttype, AdObjectType adobjecttype) {
            a(adobjecttype != null && adobjecttype.f16570c.isPrecache());
        }
    }

    public q1() {
        a aVar = new a(this);
        this.f17037d = aVar;
        b bVar = new b(this);
        this.f17038e = bVar;
        aVar.f17039a = bVar;
        bVar.f17039a = aVar;
    }

    public static q1 a() {
        if (f17033f == null) {
            synchronized (q1.class) {
                if (f17033f == null) {
                    f17033f = new q1();
                }
            }
        }
        return f17033f;
    }

    public final boolean b() {
        return this.f17036c;
    }

    public final void c() {
        this.f17035b = false;
        this.f17037d.f17041c = true;
        this.f17038e.f17041c = true;
    }
}
