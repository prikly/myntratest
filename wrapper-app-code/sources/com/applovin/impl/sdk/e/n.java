package com.applovin.impl.sdk.e;

import android.app.Activity;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.e;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.l;
import com.applovin.impl.sdk.utils.q;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class n extends a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final com.applovin.impl.sdk.n f15459a;

    public n(com.applovin.impl.sdk.n nVar) {
        super("TaskInitializeSdk", nVar);
        this.f15459a = nVar;
    }

    private void a() {
        if (!this.f15459a.G().a()) {
            Activity ar = this.f15459a.ar();
            if (ar != null) {
                this.f15459a.G().a(ar);
            } else {
                this.f15459a.V().a((a) new z(this.f15459a, true, new Runnable() {
                    public void run() {
                        n.this.f15459a.G().a(n.this.f15459a.ai().a());
                    }
                }), o.a.MAIN, TimeUnit.SECONDS.toMillis(1));
            }
        }
    }

    private void b() {
        String str;
        if (!this.f15459a.e()) {
            boolean d2 = this.f15459a.O().d();
            if (d2) {
                str = this.f15459a.Y().k().f15750b + " (use this for test devices)";
            } else {
                str = "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
            }
            Map<String, Object> d3 = this.f15459a.Y().d();
            Map<String, Object> c2 = this.f15459a.Y().c();
            l lVar = new l();
            lVar.a().a("=====AppLovin SDK=====");
            lVar.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f15459a.a(b.dI)).a("Ad Review Version", e.a()).a("OM SDK Version", this.f15459a.ao().c());
            lVar.a("===Device Info===").a("OS", Utils.getAndroidOSInfo()).a(IronSourceConstants.TYPE_GAID, str).a("Model", d3.get("model")).a("Locale", d3.get("locale")).a("Emulator", d3.get("sim")).a("Tablet", d3.get("is_tablet"));
            lVar.a("===App Info===").a("Application ID", c2.get("package_name")).a("Target SDK", c2.get("target_sdk")).a("ExoPlayer Version", Integer.valueOf(Utils.getExoPlayerVersionCode()));
            lVar.a("===SDK Settings===").a("SDK Key", this.f15459a.C()).a("Mediation Provider", this.f15459a.u()).a("TG", q.a(this.f15459a)).a("AEI", this.f15459a.a(b.au)).a("MEI", this.f15459a.a(b.av)).a("Test Mode On", Boolean.valueOf(this.f15459a.N().a())).a("Verbose Logging On", Boolean.valueOf(d2));
            lVar.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(k.a(f()));
            lVar.a();
            v.f("AppLovinSdk", lVar.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0180, code lost:
        if (r12.f15459a.d() != false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01df, code lost:
        if (r12.f15459a.d() != false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01e2, code lost:
        r2 = "failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01e3, code lost:
        r10.append(r2);
        r10.append(" in ");
        r10.append(java.lang.System.currentTimeMillis() - r6);
        r10.append("ms");
        r8.b(r9, r10.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = " in "
            java.lang.String r2 = "succeeded"
            java.lang.String r3 = "failed"
            java.lang.String r4 = " initialization "
            java.lang.String r5 = "AppLovin SDK "
            long r6 = java.lang.System.currentTimeMillis()
            com.applovin.impl.sdk.v r8 = r12.f15420d
            boolean r8 = com.applovin.impl.sdk.v.a()
            if (r8 == 0) goto L_0x0037
            com.applovin.impl.sdk.v r8 = r12.f15420d
            java.lang.String r9 = r12.f15419c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Initializing AppLovin SDK v"
            r10.append(r11)
            java.lang.String r11 = com.applovin.sdk.AppLovinSdk.VERSION
            r10.append(r11)
            java.lang.String r11 = "..."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r8.b(r9, r10)
        L_0x0037:
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.d.g r8 = r8.W()     // Catch:{ all -> 0x0183 }
            r8.d()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.d.g r8 = r8.W()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.d.f r9 = com.applovin.impl.sdk.d.f.f15401e     // Catch:{ all -> 0x0183 }
            r8.c(r9)     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.d.g r8 = r8.W()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.d.f r9 = com.applovin.impl.sdk.d.f.f15402f     // Catch:{ all -> 0x0183 }
            r8.c(r9)     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.r r8 = r8.ae()     // Catch:{ all -> 0x0183 }
            android.content.Context r9 = r12.f()     // Catch:{ all -> 0x0183 }
            r8.a((android.content.Context) r9)     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.r r8 = r8.ae()     // Catch:{ all -> 0x0183 }
            android.content.Context r9 = r12.f()     // Catch:{ all -> 0x0183 }
            r8.b((android.content.Context) r9)     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.e.o r8 = r8.V()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.e.b r9 = new com.applovin.impl.sdk.e.b     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r10 = r12.f15459a     // Catch:{ all -> 0x0183 }
            r9.<init>(r10)     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.e.o$a r10 = com.applovin.impl.sdk.e.o.a.MAIN     // Catch:{ all -> 0x0183 }
            r8.a((com.applovin.impl.sdk.e.a) r9, (com.applovin.impl.sdk.e.o.a) r10)     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.o r8 = r8.Y()     // Catch:{ all -> 0x0183 }
            r8.e()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.utils.o r8 = r8.ak()     // Catch:{ all -> 0x0183 }
            r8.a()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.a.a.a r8 = r8.an()     // Catch:{ all -> 0x0183 }
            r8.a()     // Catch:{ all -> 0x0183 }
            android.content.Context r8 = r12.f()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r9 = r12.f15459a     // Catch:{ all -> 0x0183 }
            boolean r8 = com.applovin.impl.sdk.utils.Utils.isPubInDebugMode(r8, r9)     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x00ae
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            r8.h()     // Catch:{ all -> 0x0183 }
        L_0x00ae:
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.array.ArrayService r8 = r8.aq()     // Catch:{ all -> 0x0183 }
            r8.collectAppHubData()     // Catch:{ all -> 0x0183 }
            r12.b()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.c.b.ec     // Catch:{ all -> 0x0183 }
            java.lang.Object r8 = r8.a(r9)     // Catch:{ all -> 0x0183 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0183 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x00d2
            com.applovin.impl.sdk.e.n$1 r8 = new com.applovin.impl.sdk.e.n$1     // Catch:{ all -> 0x0183 }
            r8.<init>()     // Catch:{ all -> 0x0183 }
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(r8)     // Catch:{ all -> 0x0183 }
        L_0x00d2:
            r12.a()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            r9 = 1
            r8.a((boolean) r9)     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.network.f r8 = r8.X()     // Catch:{ all -> 0x0183 }
            r8.c()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            com.applovin.sdk.AppLovinEventService r8 = r8.x()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.EventServiceImpl r8 = (com.applovin.impl.sdk.EventServiceImpl) r8     // Catch:{ all -> 0x0183 }
            r8.maybeTrackAppOpenEvent()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.mediation.debugger.b r8 = r8.K()     // Catch:{ all -> 0x0183 }
            boolean r8 = r8.b()     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x0103
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            boolean r8 = r8.e()     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x0129
        L_0x0103:
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.c.a.f15342h     // Catch:{ all -> 0x0183 }
            java.lang.Object r8 = r8.a(r9)     // Catch:{ all -> 0x0183 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0183 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x0132
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            android.content.Context r8 = r8.P()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r9 = r12.f15459a     // Catch:{ all -> 0x0183 }
            boolean r8 = com.applovin.impl.sdk.utils.Utils.isPubInDebugMode(r8, r9)     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x0132
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            boolean r8 = r8.f()     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x0132
        L_0x0129:
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.mediation.debugger.b r8 = r8.K()     // Catch:{ all -> 0x0183 }
            r8.a()     // Catch:{ all -> 0x0183 }
        L_0x0132:
            com.applovin.impl.sdk.n r8 = r12.f15459a
            com.applovin.impl.sdk.a.f r8 = r8.ao()
            r8.a()
            com.applovin.impl.sdk.n r8 = r12.f15459a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.c.b.aI
            java.lang.Object r8 = r8.a(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x015e
            com.applovin.impl.sdk.n r8 = r12.f15459a
            com.applovin.impl.sdk.c.b<java.lang.Long> r9 = com.applovin.impl.sdk.c.b.aJ
            java.lang.Object r8 = r8.a(r9)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            com.applovin.impl.sdk.n r10 = r12.f15459a
            r10.a((long) r8)
        L_0x015e:
            com.applovin.impl.sdk.v r8 = r12.f15420d
            boolean r8 = com.applovin.impl.sdk.v.a()
            if (r8 == 0) goto L_0x01fb
            com.applovin.impl.sdk.v r8 = r12.f15420d
            java.lang.String r9 = r12.f15419c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r10.append(r5)
            r10.append(r4)
            com.applovin.impl.sdk.n r4 = r12.f15459a
            boolean r4 = r4.d()
            if (r4 == 0) goto L_0x01e2
            goto L_0x01e3
        L_0x0183:
            r8 = move-exception
            java.lang.String r9 = "AppLovinSdk"
            java.lang.String r10 = "Failed to initialize SDK!"
            com.applovin.impl.sdk.v.c(r9, r10, r8)     // Catch:{ all -> 0x01fc }
            com.applovin.impl.sdk.n r8 = r12.f15459a     // Catch:{ all -> 0x01fc }
            r9 = 0
            r8.a((boolean) r9)     // Catch:{ all -> 0x01fc }
            com.applovin.impl.sdk.n r8 = r12.f15459a
            com.applovin.impl.sdk.a.f r8 = r8.ao()
            r8.a()
            com.applovin.impl.sdk.n r8 = r12.f15459a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.c.b.aI
            java.lang.Object r8 = r8.a(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x01bd
            com.applovin.impl.sdk.n r8 = r12.f15459a
            com.applovin.impl.sdk.c.b<java.lang.Long> r9 = com.applovin.impl.sdk.c.b.aJ
            java.lang.Object r8 = r8.a(r9)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            com.applovin.impl.sdk.n r10 = r12.f15459a
            r10.a((long) r8)
        L_0x01bd:
            com.applovin.impl.sdk.v r8 = r12.f15420d
            boolean r8 = com.applovin.impl.sdk.v.a()
            if (r8 == 0) goto L_0x01fb
            com.applovin.impl.sdk.v r8 = r12.f15420d
            java.lang.String r9 = r12.f15419c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r10.append(r5)
            r10.append(r4)
            com.applovin.impl.sdk.n r4 = r12.f15459a
            boolean r4 = r4.d()
            if (r4 == 0) goto L_0x01e2
            goto L_0x01e3
        L_0x01e2:
            r2 = r3
        L_0x01e3:
            r10.append(r2)
            r10.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            r10.append(r1)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            r8.b(r9, r0)
        L_0x01fb:
            return
        L_0x01fc:
            r8 = move-exception
            com.applovin.impl.sdk.n r9 = r12.f15459a
            com.applovin.impl.sdk.a.f r9 = r9.ao()
            r9.a()
            com.applovin.impl.sdk.n r9 = r12.f15459a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r10 = com.applovin.impl.sdk.c.b.aI
            java.lang.Object r9 = r9.a(r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0229
            com.applovin.impl.sdk.n r9 = r12.f15459a
            com.applovin.impl.sdk.c.b<java.lang.Long> r10 = com.applovin.impl.sdk.c.b.aJ
            java.lang.Object r9 = r9.a(r10)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            com.applovin.impl.sdk.n r11 = r12.f15459a
            r11.a((long) r9)
        L_0x0229:
            com.applovin.impl.sdk.v r9 = r12.f15420d
            boolean r9 = com.applovin.impl.sdk.v.a()
            if (r9 == 0) goto L_0x0267
            com.applovin.impl.sdk.v r9 = r12.f15420d
            java.lang.String r10 = r12.f15419c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r11.append(r5)
            r11.append(r4)
            com.applovin.impl.sdk.n r4 = r12.f15459a
            boolean r4 = r4.d()
            if (r4 == 0) goto L_0x024e
            goto L_0x024f
        L_0x024e:
            r2 = r3
        L_0x024f:
            r11.append(r2)
            r11.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            r11.append(r1)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            r9.b(r10, r0)
        L_0x0267:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.n.run():void");
    }
}
