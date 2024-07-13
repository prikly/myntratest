package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0890l;
import com.ironsource.mediationsdk.a.c;
import com.ironsource.mediationsdk.a.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.f;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.k;
import com.ironsource.mediationsdk.utils.o;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.k  reason: case insensitive filesystem */
public final class C0889k implements com.ironsource.mediationsdk.sdk.a {

    /* renamed from: a  reason: collision with root package name */
    private C0890l f8657a;

    /* renamed from: b  reason: collision with root package name */
    private IronSourceBannerLayout f8658b;

    /* renamed from: c  reason: collision with root package name */
    private f f8659c;

    /* renamed from: d  reason: collision with root package name */
    private a f8660d = a.NOT_INITIATED;

    /* renamed from: e  reason: collision with root package name */
    private IronSourceLoggerManager f8661e = IronSourceLoggerManager.getLogger();

    /* renamed from: f  reason: collision with root package name */
    private String f8662f;

    /* renamed from: g  reason: collision with root package name */
    private String f8663g;

    /* renamed from: h  reason: collision with root package name */
    private final CopyOnWriteArrayList<C0890l> f8664h = new CopyOnWriteArrayList<>();
    private long i;
    private Timer j;
    private AtomicBoolean k = new AtomicBoolean();
    private AtomicBoolean l = new AtomicBoolean();
    private com.ironsource.mediationsdk.utils.f m;
    private com.ironsource.mediationsdk.utils.f n;
    private int o;
    private int p;

    /* renamed from: com.ironsource.mediationsdk.k$a */
    enum a {
        NOT_INITIATED,
        READY_TO_LOAD,
        FIRST_LOAD_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        RELOAD_IN_PROGRESS
    }

    public C0889k(List<NetworkSettings> list, String str, String str2, long j2, int i2, int i3) {
        this.f8662f = str;
        this.f8663g = str2;
        this.i = (long) i2;
        C0888j.a().f8651a = i3;
        for (int i4 = 0; i4 < list.size(); i4++) {
            NetworkSettings networkSettings = list.get(i4);
            AbstractAdapter a2 = C0882d.a().a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a2 == null || !C0883e.a().a(a2)) {
                a(networkSettings.getProviderInstanceName() + " can't load adapter or wrong version");
            } else {
                this.f8664h.add(new C0890l(this, networkSettings, a2, j2, i4 + 1));
            }
        }
        this.f8659c = null;
        a(a.READY_TO_LOAD);
    }

    private void a(int i2) {
        a(i2, (Object[][]) null);
    }

    private void a(int i2, C0890l lVar) {
        a(i2, lVar, (Object[][]) null);
    }

    private void a(int i2, C0890l lVar, Object[][] objArr) {
        a(i2, lVar, objArr, this.p);
    }

    private void a(int i2, C0890l lVar, Object[][] objArr, int i3) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(lVar);
        try {
            if (this.f8658b != null) {
                a(providerAdditionalData, this.f8658b.getSize());
            }
            if (this.f8659c != null) {
                providerAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f8659c.getPlacementName());
            }
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i3);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e2) {
            this.f8661e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendProviderEvent " + Log.getStackTraceString(e2), 3);
        }
        d.e().b(new c(i2, providerAdditionalData));
    }

    private void a(int i2, Object[][] objArr) {
        a(i2, objArr, this.p);
    }

    private void a(int i2, Object[][] objArr, int i3) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (this.f8658b != null) {
                a(mediationAdditionalData, this.f8658b.getSize());
            }
            if (this.f8659c != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f8659c.getPlacementName());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i3);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e2) {
            this.f8661e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendMediationEvent " + Log.getStackTraceString(e2), 3);
        }
        d.e().b(new c(i2, mediationAdditionalData));
    }

    private void a(a aVar) {
        this.f8660d = aVar;
        a("state=" + aVar.name());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(com.ironsource.mediationsdk.C0889k r8) {
        /*
            com.ironsource.mediationsdk.k$a r0 = r8.f8660d
            com.ironsource.mediationsdk.k$a r1 = com.ironsource.mediationsdk.C0889k.a.RELOAD_IN_PROGRESS
            if (r0 == r1) goto L_0x001e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onReloadTimer wrong state="
            r0.<init>(r1)
            com.ironsource.mediationsdk.k$a r1 = r8.f8660d
            java.lang.String r1 = r1.name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.a((java.lang.String) r0)
            return
        L_0x001e:
            r0 = 0
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r2 = "checking with IronsourceLifecycleManager if app in foreground"
            r1.verbose(r2)
            com.ironsource.lifecycle.d r1 = com.ironsource.lifecycle.d.a()
            boolean r1 = r1.b()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x00e1
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r8.f8658b
            java.lang.String r4 = "banner is null"
            if (r1 != 0) goto L_0x003f
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r1.verbose(r4)
        L_0x003d:
            r1 = 0
            goto L_0x0078
        L_0x003f:
            boolean r1 = r1.isShown()
            if (r1 != 0) goto L_0x004d
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r5 = "banner or one of its parents are INVISIBLE or GONE"
        L_0x0049:
            r1.verbose(r5)
            goto L_0x003d
        L_0x004d:
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r8.f8658b
            boolean r1 = r1.hasWindowFocus()
            if (r1 != 0) goto L_0x005a
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r5 = "banner has no window focus"
            goto L_0x0049
        L_0x005a:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r8.f8658b
            boolean r1 = r5.getGlobalVisibleRect(r1)
            com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "visible = "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.verbose(r6)
        L_0x0078:
            if (r1 == 0) goto L_0x00de
            com.ironsource.mediationsdk.utils.o r1 = com.ironsource.mediationsdk.utils.o.a()
            r5 = 3
            int r1 = r1.b((int) r5)
            r8.p = r1
            r1 = 3011(0xbc3, float:4.22E-42)
            r8.a((int) r1)
            r1 = 3012(0xbc4, float:4.221E-42)
            com.ironsource.mediationsdk.l r5 = r8.f8657a
            r8.a((int) r1, (com.ironsource.mediationsdk.C0890l) r5)
            com.ironsource.mediationsdk.utils.f r1 = new com.ironsource.mediationsdk.utils.f
            r1.<init>()
            r8.m = r1
            com.ironsource.mediationsdk.utils.f r1 = new com.ironsource.mediationsdk.utils.f
            r1.<init>()
            r8.n = r1
            com.ironsource.mediationsdk.l r1 = r8.f8657a
            java.lang.String r5 = "reloadBanner()"
            r1.a((java.lang.String) r5)
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f8676e
            if (r5 == 0) goto L_0x00c9
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f8676e
            boolean r5 = r5.isDestroyed()
            if (r5 == 0) goto L_0x00b3
            goto L_0x00c9
        L_0x00b3:
            r1.b()
            com.ironsource.mediationsdk.l$a r4 = com.ironsource.mediationsdk.C0890l.a.LOADED
            r1.a((com.ironsource.mediationsdk.C0890l.a) r4)
            com.ironsource.mediationsdk.AbstractAdapter r4 = r1.f8672a
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f8676e
            com.ironsource.mediationsdk.model.NetworkSettings r6 = r1.f8673b
            org.json.JSONObject r6 = r6.getBannerSettings()
            r4.reloadBanner(r5, r6, r1)
            goto L_0x00dc
        L_0x00c9:
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f8676e
            if (r5 != 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            java.lang.String r4 = "banner is destroyed"
        L_0x00d0:
            com.ironsource.mediationsdk.sdk.a r5 = r1.f8674c
            com.ironsource.mediationsdk.logger.IronSourceError r6 = new com.ironsource.mediationsdk.logger.IronSourceError
            r7 = 610(0x262, float:8.55E-43)
            r6.<init>(r7, r4)
            r5.a((com.ironsource.mediationsdk.logger.IronSourceError) r6, (com.ironsource.mediationsdk.C0890l) r1, (boolean) r3)
        L_0x00dc:
            r1 = 0
            goto L_0x00e4
        L_0x00de:
            java.lang.String r0 = "banner is not visible - start reload timer"
            goto L_0x00e3
        L_0x00e1:
            java.lang.String r0 = "app in background - start reload timer"
        L_0x00e3:
            r1 = 1
        L_0x00e4:
            if (r1 == 0) goto L_0x0106
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r1.verbose(r0)
            r0 = 3200(0xc80, float:4.484E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r2][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r3] = r5
            r5 = 614(0x266, float:8.6E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            r1[r3] = r4
            r8.a((int) r0, (java.lang.Object[][]) r1)
            r8.d()
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C0889k.a(com.ironsource.mediationsdk.k):void");
    }

    private void a(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f8661e;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, "BannerManager " + str, 0);
    }

    private void a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        try {
            String description = iSBannerSize.getDescription();
            char c2 = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                jSONObject.put("bannerAdSize", 1);
            } else if (c2 == 1) {
                jSONObject.put("bannerAdSize", 2);
            } else if (c2 == 2) {
                jSONObject.put("bannerAdSize", 3);
            } else if (c2 == 3) {
                jSONObject.put("bannerAdSize", 5);
            } else if (c2 == 4) {
                jSONObject.put("bannerAdSize", 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
        } catch (Exception e2) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f8661e;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "sendProviderEvent " + Log.getStackTraceString(e2), 3);
        }
    }

    private boolean a() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f8658b;
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    private void b() {
        Iterator<C0890l> it = this.f8664h.iterator();
        while (it.hasNext()) {
            it.next().f8675d = true;
        }
    }

    private void b(C0890l lVar, View view, FrameLayout.LayoutParams layoutParams) {
        this.f8657a = lVar;
        this.f8658b.a(view, layoutParams);
    }

    private void b(C0890l lVar, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("bindView = " + z + " smash - " + lVar.a());
        a((int) IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
        a((int) IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.m))}});
        this.o = o.a().b(3);
        o.a().a(3);
        if (z) {
            b(lVar, view, layoutParams);
        }
        d();
    }

    private boolean c() {
        Iterator<C0890l> it = this.f8664h.iterator();
        while (it.hasNext()) {
            C0890l next = it.next();
            if (next.f8675d && this.f8657a != next) {
                a(this.f8660d == a.FIRST_LOAD_IN_PROGRESS ? 3002 : IronSourceConstants.BN_INSTANCE_RELOAD, next, (Object[][]) null);
                this.n = new com.ironsource.mediationsdk.utils.f();
                next.a(this.f8658b.a(), this.f8662f, this.f8663g);
                return true;
            }
        }
        return false;
    }

    private void d() {
        try {
            e();
            if (this.i > 0) {
                Timer timer = new Timer();
                this.j = timer;
                timer.schedule(new TimerTask() {
                    public final void run() {
                        C0889k.a(C0889k.this);
                    }
                }, this.i * 1000);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void e() {
        Timer timer = this.j;
        if (timer != null) {
            timer.cancel();
            this.j = null;
        }
    }

    public final synchronized void a(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout == null) {
            this.f8661e.log(IronSourceLogger.IronSourceTag.API, "destroyBanner banner cannot be null", 3);
        } else if (ironSourceBannerLayout.isDestroyed()) {
            this.f8661e.log(IronSourceLogger.IronSourceTag.API, "Banner is already destroyed and can't be used anymore. Please create a new one using IronSource.createBanner API", 3);
        } else {
            a((int) IronSourceConstants.BN_DESTROY, (Object[][]) null, this.o);
            e();
            if (this.f8657a != null) {
                a((int) IronSourceConstants.BN_INSTANCE_DESTROY, this.f8657a, (Object[][]) null);
                C0890l lVar = this.f8657a;
                lVar.a("destroyBanner()");
                if (lVar.f8672a == null) {
                    lVar.a("destroyBanner() mAdapter == null");
                } else {
                    lVar.f8672a.destroyBanner(lVar.f8673b.getBannerSettings());
                    lVar.a(C0890l.a.DESTROYED);
                }
                this.f8657a = null;
            }
            ironSourceBannerLayout.b();
            this.f8658b = null;
            this.f8659c = null;
            a(a.READY_TO_LOAD);
        }
    }

    public final synchronized void a(IronSourceBannerLayout ironSourceBannerLayout, f fVar) {
        if (ironSourceBannerLayout != null) {
            try {
                if (!ironSourceBannerLayout.isDestroyed()) {
                    if (fVar != null) {
                        if (!TextUtils.isEmpty(fVar.getPlacementName())) {
                            if (this.f8660d == a.READY_TO_LOAD) {
                                if (!C0888j.a().b()) {
                                    this.p = o.a().b(3);
                                    a(a.FIRST_LOAD_IN_PROGRESS);
                                    this.f8658b = ironSourceBannerLayout;
                                    this.f8659c = fVar;
                                    a(3001, (Object[][]) null);
                                    if (k.b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), fVar.getPlacementName())) {
                                        C0888j a2 = C0888j.a();
                                        a2.a(ironSourceBannerLayout, new IronSourceError(604, "placement " + fVar.getPlacementName() + " is capped"));
                                        a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 604}});
                                        a(a.READY_TO_LOAD);
                                        return;
                                    }
                                    this.m = new com.ironsource.mediationsdk.utils.f();
                                    Iterator<C0890l> it = this.f8664h.iterator();
                                    while (it.hasNext()) {
                                        it.next().f8675d = true;
                                    }
                                    this.n = new com.ironsource.mediationsdk.utils.f();
                                    C0890l lVar = this.f8664h.get(0);
                                    a(3002, lVar, (Object[][]) null);
                                    lVar.a(ironSourceBannerLayout.a(), this.f8662f, this.f8663g);
                                    return;
                                }
                            }
                            this.f8661e.log(IronSourceLogger.IronSourceTag.API, "A banner is already loaded", 3);
                            return;
                        }
                    }
                    Object[] objArr = new Object[1];
                    objArr[0] = fVar == null ? "placement is null" : "placement name is empty";
                    this.f8661e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr), 3);
                    return;
                }
            } catch (Exception e2) {
                C0888j a3 = C0888j.a();
                a3.a(ironSourceBannerLayout, new IronSourceError(605, "loadBanner() failed " + e2.getMessage()));
                a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 605}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e2.getMessage()}});
                a(a.READY_TO_LOAD);
                return;
            }
        }
        Object[] objArr2 = new Object[1];
        objArr2[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
        this.f8661e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr2), 3);
    }

    public final void a(C0890l lVar) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.a());
        if (a()) {
            this.f8658b.c();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a((int) IronSourceConstants.BN_CALLBACK_CLICK, objArr, this.o);
        a((int) IronSourceConstants.BN_INSTANCE_CLICK, lVar, objArr, this.o);
    }

    public final void a(C0890l lVar, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.a());
        if (this.f8660d == a.FIRST_LOAD_IN_PROGRESS) {
            a(3005, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
            b(lVar, view, layoutParams);
            f fVar = this.f8659c;
            String placementName = fVar != null ? fVar.getPlacementName() : "";
            k.f(ContextProvider.getInstance().getCurrentActiveActivity(), placementName);
            if (k.b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), placementName)) {
                a((int) IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
            }
            a((int) IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.m))}});
            this.f8658b.a(lVar.a());
            this.o = o.a().b(3);
            o.a().a(3);
            a(a.RELOAD_IN_PROGRESS);
            d();
        } else if (this.f8660d == a.LOAD_IN_PROGRESS) {
            a(a.RELOAD_IN_PROGRESS);
            b(lVar, view, layoutParams, true);
        } else {
            a((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, lVar, (Object[][]) null);
        }
    }

    public final void a(C0890l lVar, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.a());
        if (this.f8660d != a.RELOAD_IN_PROGRESS) {
            a("onBannerAdReloaded " + lVar.a() + " wrong state=" + this.f8660d.name());
            a((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, lVar, (Object[][]) null);
            return;
        }
        IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
        b(lVar, view, layoutParams, z);
    }

    public final void a(IronSourceError ironSourceError, C0890l lVar, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + lVar.a());
        if (this.f8660d == a.FIRST_LOAD_IN_PROGRESS || this.f8660d == a.LOAD_IN_PROGRESS) {
            if (z) {
                a((int) IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
            } else {
                a((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
            }
            if (!c()) {
                if (this.f8660d == a.FIRST_LOAD_IN_PROGRESS) {
                    C0888j.a().a(this.f8658b, new IronSourceError(606, "No ads to show"));
                    a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 606}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.m))}});
                    a(a.READY_TO_LOAD);
                    return;
                }
                a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.m))}});
                a(a.RELOAD_IN_PROGRESS);
                d();
                return;
            }
            return;
        }
        a("onBannerAdLoadFailed " + lVar.a() + " wrong state=" + this.f8660d.name());
    }

    public final void b(C0890l lVar) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.a());
        if (a()) {
            this.f8658b.e();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a((int) IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, this.o);
        a((int) IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, lVar, objArr, this.o);
    }

    public final void b(IronSourceError ironSourceError, C0890l lVar, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + lVar.a());
        if (this.f8660d != a.RELOAD_IN_PROGRESS) {
            a("onBannerAdReloadFailed " + lVar.a() + " wrong state=" + this.f8660d.name());
            return;
        }
        if (z) {
            a((int) IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
        } else {
            a((int) IronSourceConstants.BN_INSTANCE_RELOAD_ERROR, lVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
        }
        if (this.f8664h.size() == 1) {
            a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.m))}});
            d();
            return;
        }
        a(a.LOAD_IN_PROGRESS);
        b();
        c();
    }

    public final void c(C0890l lVar) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.a());
        if (a()) {
            this.f8658b.d();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a((int) IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, this.o);
        a((int) IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, lVar, objArr, this.o);
    }

    public final void d(C0890l lVar) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.a());
        if (a()) {
            this.f8658b.f();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a((int) IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, this.o);
        a((int) IronSourceConstants.BN_INSTANCE_LEAVE_APP, lVar, objArr, this.o);
    }

    public final void e(C0890l lVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + lVar.a());
        a((int) IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
        a((int) IronSourceConstants.BN_INSTANCE_SHOW, lVar, (Object[][]) null);
    }
}
