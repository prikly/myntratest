package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import com.appnext.base.b.i;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.i0  reason: case insensitive filesystem */
public final class C0443i0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5954a;

    /* renamed from: b  reason: collision with root package name */
    private final E f5955b;

    /* renamed from: c  reason: collision with root package name */
    private final C0783w f5956c;

    /* renamed from: d  reason: collision with root package name */
    private final C0772vc f5957d;

    /* renamed from: e  reason: collision with root package name */
    private final I2 f5958e;

    /* renamed from: f  reason: collision with root package name */
    private final D9 f5959f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public ContentValues f5960g;

    /* renamed from: h  reason: collision with root package name */
    private Lg f5961h;

    public C0443i0(Context context) {
        this(context, F0.g().c(), F0.g().b(), C0772vc.a(context), H2.a(context));
    }

    public C0443i0 a(ContentValues contentValues) {
        this.f5960g = contentValues;
        return this;
    }

    public C0443i0 a(Lg lg) {
        this.f5961h = lg;
        return this;
    }

    public void a() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject);
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        this.f5960g.put("report_request_parameters", jSONObject.toString());
    }

    C0443i0(Context context, E e2, C0783w wVar, C0772vc vcVar, H2 h2) {
        this.f5959f = new D9();
        this.f5954a = context;
        this.f5955b = e2;
        this.f5956c = wVar;
        this.f5957d = vcVar;
        this.f5958e = h2.a();
    }

    private void a(JSONObject jSONObject) throws JSONException {
        JSONObject putOpt = jSONObject.putOpt("dId", this.f5961h.g()).putOpt("uId", this.f5961h.w()).putOpt("appVer", this.f5961h.f()).putOpt("appBuild", this.f5961h.b());
        this.f5961h.getClass();
        JSONObject putOpt2 = putOpt.putOpt("analyticsSdkVersionName", "5.3.0");
        this.f5961h.getClass();
        JSONObject putOpt3 = putOpt2.putOpt("kitBuildNumber", "45003240").putOpt("kitBuildType", this.f5961h.j()).putOpt("osVer", this.f5961h.o()).putOpt("osApiLev", Integer.valueOf(this.f5961h.n())).putOpt("lang", this.f5961h.k()).putOpt("root", this.f5961h.h()).putOpt("app_debuggable", this.f5961h.z()).putOpt("app_framework", this.f5961h.c()).putOpt("attribution_id", Integer.valueOf(this.f5961h.C()));
        this.f5961h.getClass();
        putOpt3.putOpt("commit_hash", "a72bf6f57701ed3c2b8ed570054febbff4e58c12");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.util.Collection} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.yandex.metrica.impl.ob.Bm r6, com.yandex.metrica.impl.ob.C0687s.a r7, com.yandex.metrica.impl.ob.vn<com.yandex.metrica.impl.ob.C0754ui.b, java.lang.Object> r8) {
        /*
            r5 = this;
            com.yandex.metrica.impl.ob.c0 r0 = r6.f3785a
            android.content.ContentValues r1 = r5.f5960g
            java.lang.String r2 = r0.f5574a
            java.lang.String r3 = "name"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f5960g
            java.lang.String r2 = r0.f5575b
            java.lang.String r3 = "value"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f5960g
            int r2 = r0.f5578e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "type"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f5960g
            int r2 = r0.f5579f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "custom_type"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f5960g
            java.lang.String r2 = r0.h()
            java.lang.String r3 = "error_environment"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f5960g
            java.lang.String r2 = r0.p()
            java.lang.String r3 = "user_info"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f5960g
            int r2 = r0.f5581h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "truncated"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f5960g
            android.content.Context r2 = r5.f5954a
            int r2 = com.yandex.metrica.impl.ob.H1.b((android.content.Context) r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "connection_type"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f5960g
            java.lang.String r2 = r0.m()
            java.lang.String r3 = "profile_id"
            r1.put(r3, r2)
            android.content.ContentValues r1 = r5.f5960g
            com.yandex.metrica.impl.ob.Em r6 = r6.f3786b
            int r6 = r6.a()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r2 = "encrypting_mode"
            r1.put(r2, r6)
            android.content.ContentValues r6 = r5.f5960g
            com.yandex.metrica.impl.ob.D0 r1 = r0.j()
            int r1 = r1.f3843a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "first_occurrence_status"
            r6.put(r2, r1)
            com.yandex.metrica.impl.ob.y0 r6 = r0.n()
            if (r6 == 0) goto L_0x00a2
            android.content.ContentValues r1 = r5.f5960g
            int r6 = r6.f7134a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r2 = "source"
            r1.put(r2, r6)
        L_0x00a2:
            java.lang.Boolean r6 = r0.c()
            if (r6 == 0) goto L_0x00af
            android.content.ContentValues r1 = r5.f5960g
            java.lang.String r2 = "attribution_id_changed"
            r1.put(r2, r6)
        L_0x00af:
            android.content.ContentValues r6 = r5.f5960g
            java.lang.Integer r1 = r0.k()
            java.lang.String r2 = "open_id"
            r6.put(r2, r1)
            android.content.ContentValues r6 = r5.f5960g
            com.yandex.metrica.impl.ob.D9 r1 = r5.f5959f
            java.util.Map r0 = r0.i()
            byte[] r0 = r1.fromModel((java.util.Map<java.lang.String, byte[]>) r0)
            java.lang.String r1 = "extras"
            r6.put(r1, r0)
            android.content.ContentValues r6 = r5.f5960g
            java.lang.String r0 = r7.f6766a
            java.lang.String r1 = "app_environment"
            r6.put(r1, r0)
            android.content.ContentValues r6 = r5.f5960g
            long r0 = r7.f6767b
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "app_environment_revision"
            r6.put(r0, r7)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = "enabled"
            r0 = 0
            com.yandex.metrica.impl.ob.Lg r1 = r5.f5961h     // Catch:{ all -> 0x012a }
            boolean r1 = r1.Q()     // Catch:{ all -> 0x012a }
            r6.put(r7, r1)     // Catch:{ all -> 0x012a }
            com.yandex.metrica.impl.ob.Lg r7 = r5.f5961h     // Catch:{ all -> 0x012a }
            boolean r7 = r7.Q()     // Catch:{ all -> 0x012a }
            if (r7 == 0) goto L_0x010f
            com.yandex.metrica.impl.ob.Lg r7 = r5.f5961h     // Catch:{ all -> 0x012a }
            android.location.Location r7 = r7.H()     // Catch:{ all -> 0x012a }
            if (r7 != 0) goto L_0x010a
            com.yandex.metrica.impl.ob.vc r7 = r5.f5957d     // Catch:{ all -> 0x012a }
            android.location.Location r7 = r7.a()     // Catch:{ all -> 0x012a }
            r1 = r0
            goto L_0x0111
        L_0x010a:
            com.yandex.metrica.impl.ob.K2 r1 = com.yandex.metrica.impl.ob.K2.a(r7)     // Catch:{ all -> 0x012a }
            goto L_0x0111
        L_0x010f:
            r7 = r0
            r1 = r7
        L_0x0111:
            if (r1 != 0) goto L_0x0119
            if (r7 == 0) goto L_0x0119
            com.yandex.metrica.impl.ob.K2 r1 = com.yandex.metrica.impl.ob.K2.b(r7)     // Catch:{ all -> 0x012a }
        L_0x0119:
            if (r1 == 0) goto L_0x011e
            r5.a(r6, r1)     // Catch:{ all -> 0x012a }
        L_0x011e:
            android.content.ContentValues r7 = r5.f5960g     // Catch:{ all -> 0x012a }
            java.lang.String r1 = "location_info"
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x012a }
            r7.put(r1, r6)     // Catch:{ all -> 0x012a }
            goto L_0x012b
        L_0x012a:
        L_0x012b:
            java.util.EnumMap r6 = new java.util.EnumMap
            java.lang.Class<com.yandex.metrica.impl.ob.ui$b> r7 = com.yandex.metrica.impl.ob.C0754ui.b.class
            r6.<init>(r7)
            com.yandex.metrica.impl.ob.F0 r7 = com.yandex.metrica.impl.ob.F0.g()
            com.yandex.metrica.impl.ob.Xj r7 = r7.v()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            com.yandex.metrica.impl.ob.h0 r2 = new com.yandex.metrica.impl.ob.h0
            r2.<init>(r5, r1)
            r7.a((com.yandex.metrica.impl.ob.C0779vj) r2)
            com.yandex.metrica.impl.ob.ui$b r2 = com.yandex.metrica.impl.ob.C0754ui.b.WIFI
            com.yandex.metrica.impl.ob.I2 r3 = r5.f5958e
            java.lang.Object r3 = r3.a()
            r6.put(r2, r3)
            com.yandex.metrica.impl.ob.ui$b r3 = com.yandex.metrica.impl.ob.C0754ui.b.CELL
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x015c
            r1 = r0
            goto L_0x0162
        L_0x015c:
            java.lang.Object r1 = r1.getFirst()
            java.util.Collection r1 = (java.util.Collection) r1
        L_0x0162:
            r6.put(r3, r1)
            com.yandex.metrica.impl.ob.zn r6 = r8.a(r6)
            android.content.ContentValues r8 = r5.f5960g
            com.yandex.metrica.impl.ob.zn$a r1 = r6.f7246a
            com.yandex.metrica.impl.ob.zn$a r4 = com.yandex.metrica.impl.ob.zn.a.NOT_CHANGED
            if (r1 != r4) goto L_0x0173
            r1 = 1
            goto L_0x0174
        L_0x0173:
            r1 = 0
        L_0x0174:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r4 = "has_omitted_data"
            r8.put(r4, r1)
            com.yandex.metrica.impl.ob.zn$a r8 = r6.f7246a
            D r1 = r6.f7247b
            if (r1 != 0) goto L_0x0185
            r1 = r0
            goto L_0x018d
        L_0x0185:
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r1.get(r3)
            java.util.Collection r1 = (java.util.Collection) r1
        L_0x018d:
            com.yandex.metrica.impl.ob.g0 r3 = new com.yandex.metrica.impl.ob.g0
            r3.<init>(r5)
            r7.a((com.yandex.metrica.impl.ob.C0263ak) r3)
            com.yandex.metrica.impl.ob.zn$a r7 = com.yandex.metrica.impl.ob.zn.a.NEW
            if (r8 == r7) goto L_0x019d
            com.yandex.metrica.impl.ob.zn$a r3 = com.yandex.metrica.impl.ob.zn.a.REFRESH
            if (r8 != r3) goto L_0x01ae
        L_0x019d:
            if (r1 == 0) goto L_0x01ae
            android.content.ContentValues r8 = r5.f5960g
            org.json.JSONArray r1 = com.yandex.metrica.impl.ob.Tl.a((java.util.Collection<com.yandex.metrica.impl.ob.C0755uj>) r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "cell_info"
            r8.put(r3, r1)
        L_0x01ae:
            com.yandex.metrica.impl.ob.zn$a r8 = r6.f7246a
            D r6 = r6.f7247b
            if (r6 != 0) goto L_0x01b5
            goto L_0x01be
        L_0x01b5:
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r6 = r6.get(r2)
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
        L_0x01be:
            com.yandex.metrica.impl.ob.zn$a r6 = com.yandex.metrica.impl.ob.zn.a.REFRESH
            if (r8 == r6) goto L_0x01c4
            if (r8 != r7) goto L_0x01d5
        L_0x01c4:
            if (r0 == 0) goto L_0x01d5
            org.json.JSONArray r6 = com.yandex.metrica.impl.ob.F2.a(r0)
            android.content.ContentValues r7 = r5.f5960g
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "wifi_network_info"
            r7.put(r8, r6)
        L_0x01d5:
            android.content.ContentValues r6 = r5.f5960g
            com.yandex.metrica.impl.ob.E r7 = r5.f5955b
            com.yandex.metrica.impl.ob.E$b$a r7 = r7.b()
            int r7 = r7.a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "battery_charge_type"
            r6.put(r8, r7)
            android.content.ContentValues r6 = r5.f5960g
            com.yandex.metrica.impl.ob.w r7 = r5.f5956c
            com.yandex.metrica.impl.ob.w$a r7 = r7.c()
            com.yandex.metrica.impl.ob.oc$a r7 = com.yandex.metrica.impl.ob.C0604oc.a.a((com.yandex.metrica.impl.ob.C0783w.a) r7)
            java.lang.String r7 = r7.a()
            java.lang.String r8 = "collection_mode"
            r6.put(r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0443i0.a(com.yandex.metrica.impl.ob.Bm, com.yandex.metrica.impl.ob.s$a, com.yandex.metrica.impl.ob.vn):void");
    }

    private void a(JSONObject jSONObject, K2 k2) throws JSONException {
        jSONObject.put(i.fC, k2.getLatitude());
        jSONObject.put("lon", k2.getLongitude());
        jSONObject.putOpt("timestamp", Long.valueOf(k2.getTime()));
        jSONObject.putOpt("precision", k2.hasAccuracy() ? Float.valueOf(k2.getAccuracy()) : null);
        jSONObject.putOpt("direction", k2.hasBearing() ? Float.valueOf(k2.getBearing()) : null);
        jSONObject.putOpt("speed", k2.hasSpeed() ? Float.valueOf(k2.getSpeed()) : null);
        jSONObject.putOpt("altitude", k2.hasAltitude() ? Double.valueOf(k2.getAltitude()) : null);
        jSONObject.putOpt(IronSourceConstants.EVENTS_PROVIDER, C0267b.a(k2.getProvider(), (String) null));
        jSONObject.putOpt("original_provider", k2.a());
    }
}
