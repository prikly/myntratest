package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.server.b;
import com.ironsource.mediationsdk.utils.a;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.n  reason: case insensitive filesystem */
public abstract class C0892n {

    /* renamed from: a  reason: collision with root package name */
    protected a f8800a;

    /* renamed from: b  reason: collision with root package name */
    protected IronSourceSegment f8801b;

    /* renamed from: c  reason: collision with root package name */
    private HashSet<ImpressionDataListener> f8802c = new HashSet<>();

    public C0892n(HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        this.f8802c = hashSet;
        this.f8800a = new a();
        this.f8801b = ironSourceSegment;
    }

    protected static String c() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public final void a(IronSource.AD_UNIT ad_unit) {
        this.f8800a.a(ad_unit, false);
    }

    public final void a(IronSourceSegment ironSourceSegment) {
        this.f8801b = ironSourceSegment;
    }

    public final void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f8802c.add(impressionDataListener);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(b bVar, String str) {
        if (bVar != null) {
            ImpressionData a2 = bVar.a(str);
            if (a2 != null) {
                Iterator<ImpressionDataListener> it = this.f8802c.iterator();
                while (it.hasNext()) {
                    ImpressionDataListener next = it.next();
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + a2);
                    next.onImpressionSuccess(a2);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    /* access modifiers changed from: protected */
    public final void a(JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        boolean z = false;
        if (jSONObject != null) {
            z = jSONObject.optBoolean("isAdUnitCapped", false);
        }
        this.f8800a.a(ad_unit, z);
    }

    public final void b() {
        synchronized (this) {
            this.f8802c.clear();
        }
    }

    public final void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f8802c.remove(impressionDataListener);
        }
    }
}
