package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.e;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.mediationsdk.a  reason: case insensitive filesystem */
abstract class C0879a {

    /* renamed from: a  reason: collision with root package name */
    e f8385a = null;

    /* renamed from: b  reason: collision with root package name */
    int f8386b;

    /* renamed from: c  reason: collision with root package name */
    final CopyOnWriteArrayList<C0880b> f8387c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    C0880b f8388d;

    /* renamed from: e  reason: collision with root package name */
    C0880b f8389e;

    /* renamed from: f  reason: collision with root package name */
    String f8390f;

    /* renamed from: g  reason: collision with root package name */
    String f8391g;

    /* renamed from: h  reason: collision with root package name */
    IronSourceLoggerManager f8392h = IronSourceLoggerManager.getLogger();
    boolean i = false;
    Boolean j;
    boolean k;
    boolean l = true;
    private String m = IronSourceConstants.EVENTS_ERROR_REASON;
    private String n = "status";
    private String o = IronSourceConstants.EVENTS_PLACEMENT_NAME;
    private String p = IronSourceConstants.EVENTS_REWARD_NAME;
    private String q = IronSourceConstants.EVENTS_REWARD_AMOUNT;
    private String r = "providerPriority";

    C0879a() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Context context, boolean z);

    /* access modifiers changed from: package-private */
    public final void a(C0880b bVar) {
        this.f8387c.add(bVar);
        e eVar = this.f8385a;
        if (eVar != null) {
            synchronized (eVar) {
                try {
                    if (bVar.m != 99) {
                        eVar.f8902a.put(eVar.d(bVar), Integer.valueOf(bVar.m));
                    }
                } catch (Exception e2) {
                    eVar.f8904c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "addSmash", e2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public synchronized void b() {
        this.l = false;
    }

    /* access modifiers changed from: package-private */
    public final void b(C0880b bVar) {
        try {
            String str = H.a().l;
            if (!TextUtils.isEmpty(str) && bVar.f8565b != null) {
                IronSourceLoggerManager ironSourceLoggerManager = bVar.q;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                ironSourceLoggerManager.log(ironSourceTag, bVar.j() + ":setMediationSegment(segment:" + str + ")", 1);
                bVar.f8565b.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                String pluginFrameworkVersion = ConfigFile.getConfigFile().getPluginFrameworkVersion();
                if (bVar.f8565b != null) {
                    bVar.f8565b.setPluginData(pluginType, pluginFrameworkVersion);
                }
            }
        } catch (Exception e2) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f8392h;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager2.log(ironSourceTag2, ":setCustomParams():" + e2.toString(), 3);
        }
    }
}
