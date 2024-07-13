package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Oh;
import com.yandex.metrica.impl.ob.Tl;
import com.yandex.metrica.impl.ob.Ui;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Ti {

    /* renamed from: a  reason: collision with root package name */
    private final Ii f5038a;

    /* renamed from: b  reason: collision with root package name */
    private final Hi f5039b;

    /* renamed from: c  reason: collision with root package name */
    private final Oi f5040c;

    /* renamed from: d  reason: collision with root package name */
    private final Ri f5041d;

    /* renamed from: e  reason: collision with root package name */
    private final Qi f5042e;

    /* renamed from: f  reason: collision with root package name */
    private final Ni f5043f;

    /* renamed from: g  reason: collision with root package name */
    private final Si f5044g;

    /* renamed from: h  reason: collision with root package name */
    private final Ji f5045h;
    private final Wi i;
    private final Li j;
    private final Pi k;
    private final Z9 l;
    private final Yi m;
    private final Xi n;
    private final Ci o;
    private final Di p;
    private final Ei q;
    private final Bi r;
    private final Ki s;
    private final Fi t;
    private final Gi u;
    private final Vi v;
    private final Mi w;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Ti() {
        /*
            r25 = this;
            r0 = r25
            com.yandex.metrica.impl.ob.Ki r2 = new com.yandex.metrica.impl.ob.Ki
            r1 = r2
            r2.<init>()
            com.yandex.metrica.impl.ob.Ii r3 = new com.yandex.metrica.impl.ob.Ii
            r2 = r3
            r3.<init>()
            com.yandex.metrica.impl.ob.Hi r4 = new com.yandex.metrica.impl.ob.Hi
            r3 = r4
            r4.<init>()
            com.yandex.metrica.impl.ob.Oi r5 = new com.yandex.metrica.impl.ob.Oi
            r4 = r5
            r5.<init>()
            com.yandex.metrica.impl.ob.Ri r6 = new com.yandex.metrica.impl.ob.Ri
            r5 = r6
            r6.<init>()
            com.yandex.metrica.impl.ob.Qi r7 = new com.yandex.metrica.impl.ob.Qi
            r6 = r7
            r7.<init>()
            com.yandex.metrica.impl.ob.Ni r8 = new com.yandex.metrica.impl.ob.Ni
            r7 = r8
            r8.<init>()
            com.yandex.metrica.impl.ob.Si r9 = new com.yandex.metrica.impl.ob.Si
            r8 = r9
            r9.<init>()
            com.yandex.metrica.impl.ob.Ji r10 = new com.yandex.metrica.impl.ob.Ji
            r9 = r10
            r10.<init>()
            com.yandex.metrica.impl.ob.Wi r11 = new com.yandex.metrica.impl.ob.Wi
            r10 = r11
            r11.<init>()
            com.yandex.metrica.impl.ob.Li r12 = new com.yandex.metrica.impl.ob.Li
            r11 = r12
            r12.<init>()
            com.yandex.metrica.impl.ob.Pi r13 = new com.yandex.metrica.impl.ob.Pi
            r12 = r13
            r13.<init>()
            com.yandex.metrica.impl.ob.Z9 r14 = new com.yandex.metrica.impl.ob.Z9
            r13 = r14
            r14.<init>()
            com.yandex.metrica.impl.ob.Yi r15 = new com.yandex.metrica.impl.ob.Yi
            r14 = r15
            r15.<init>()
            com.yandex.metrica.impl.ob.Xi r16 = new com.yandex.metrica.impl.ob.Xi
            r15 = r16
            r16.<init>()
            com.yandex.metrica.impl.ob.Di r17 = new com.yandex.metrica.impl.ob.Di
            r16 = r17
            r17.<init>()
            com.yandex.metrica.impl.ob.Ei r18 = new com.yandex.metrica.impl.ob.Ei
            r17 = r18
            r18.<init>()
            com.yandex.metrica.impl.ob.Ci r19 = new com.yandex.metrica.impl.ob.Ci
            r18 = r19
            r19.<init>()
            com.yandex.metrica.impl.ob.Bi r20 = new com.yandex.metrica.impl.ob.Bi
            r19 = r20
            r20.<init>()
            com.yandex.metrica.impl.ob.Fi r21 = new com.yandex.metrica.impl.ob.Fi
            r20 = r21
            r21.<init>()
            com.yandex.metrica.impl.ob.Gi r22 = new com.yandex.metrica.impl.ob.Gi
            r21 = r22
            r22.<init>()
            com.yandex.metrica.impl.ob.Vi r23 = new com.yandex.metrica.impl.ob.Vi
            r22 = r23
            r23.<init>()
            com.yandex.metrica.impl.ob.Mi r24 = new com.yandex.metrica.impl.ob.Mi
            r23 = r24
            r24.<init>()
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Ti.<init>():void");
    }

    public Ui a(byte[] bArr) {
        String str;
        Ui ui = new Ui();
        try {
            this.s.getClass();
            Tl.a aVar = new Tl.a(new String(bArr, "UTF-8"));
            JSONObject optJSONObject = aVar.optJSONObject("device_id");
            String str2 = "";
            if (optJSONObject != null) {
                str2 = optJSONObject.optString("hash");
                str = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            } else {
                str = str2;
            }
            ui.d(str);
            ui.c(str2);
            a(ui, aVar);
            ui.a(Ui.a.OK);
            return ui;
        } catch (Throwable unused) {
            Ui ui2 = new Ui();
            ui2.a(Ui.a.BAD);
            return ui2;
        }
    }

    public Ti(Ki ki, Ii ii, Hi hi, Oi oi, Ri ri, Qi qi, Ni ni, Si si, Ji ji, Wi wi, Li li, Pi pi, Z9 z9, Yi yi, Xi xi, Di di, Ei ei, Ci ci, Bi bi, Fi fi, Gi gi, Vi vi, Mi mi) {
        this.f5038a = ii;
        this.f5039b = hi;
        this.f5040c = oi;
        this.f5041d = ri;
        this.f5042e = qi;
        this.f5043f = ni;
        this.f5044g = si;
        this.f5045h = ji;
        this.i = wi;
        this.j = li;
        this.k = pi;
        this.l = z9;
        this.m = yi;
        this.n = xi;
        this.p = di;
        this.q = ei;
        this.o = ci;
        this.r = bi;
        this.s = ki;
        this.t = fi;
        this.u = gi;
        this.v = vi;
        this.w = mi;
    }

    private void a(Ui ui, Tl.a aVar) throws JSONException {
        String str;
        Oh.a aVar2;
        long j2;
        long j3;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3 = aVar.optJSONObject("queries");
        if (!(optJSONObject3 == null || (optJSONObject2 = optJSONObject3.optJSONObject("list")) == null)) {
            JSONObject optJSONObject4 = optJSONObject2.optJSONObject("sdk_list");
            if (optJSONObject4 != null) {
                ui.h(optJSONObject4.optString("url", (String) null));
            }
            JSONObject optJSONObject5 = optJSONObject2.optJSONObject("host");
            if (optJSONObject5 != null) {
                ui.a(optJSONObject5.optString("url", (String) null));
            }
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = aVar.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject optJSONObject6 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (optJSONObject6 != null) {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = optJSONObject6.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject7 = optJSONObject6.optJSONObject(next);
                if (optJSONObject7 != null && optJSONObject7.has(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                    hashMap.put(next, optJSONObject7.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                }
            }
            ui.e(Tl.c((Map<String, String>) hashMap));
        }
        JSONObject optJSONObject8 = aVar.optJSONObject("locale");
        if (optJSONObject8 == null || (optJSONObject = optJSONObject8.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false)) {
            str = "";
        } else {
            str = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE, "");
        }
        ui.b(str);
        JSONObject optJSONObject9 = aVar.optJSONObject("time");
        if (optJSONObject9 != null) {
            try {
                ui.a(Long.valueOf(optJSONObject9.getLong("max_valid_difference_seconds")));
            } catch (Throwable unused2) {
            }
        }
        If.s sVar = new If.s();
        JSONObject optJSONObject10 = aVar.optJSONObject("stat_sending");
        if (optJSONObject10 != null) {
            sVar.f4235a = Tl.a(Tl.a(optJSONObject10, "disabled_reporting_interval_seconds", (Long) null), TimeUnit.SECONDS, sVar.f4235a);
        }
        ui.a(this.l.toModel(sVar));
        ArrayList arrayList = new ArrayList();
        JSONObject optJSONObject11 = aVar.optJSONObject("mediascope_api_keys");
        if (!(optJSONObject11 == null || (optJSONArray2 = optJSONObject11.optJSONArray("list")) == null)) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                try {
                    arrayList.add(optJSONArray2.getString(i2));
                } catch (Throwable unused3) {
                }
            }
        }
        ui.d((List<String>) arrayList);
        this.f5039b.a(ui, aVar);
        this.f5038a.a(ui, aVar);
        this.f5040c.getClass();
        JSONObject optJSONObject12 = aVar.optJSONObject("permissions");
        if (!(optJSONObject12 == null || (optJSONArray = optJSONObject12.optJSONArray("list")) == null)) {
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                JSONObject optJSONObject13 = optJSONArray.optJSONObject(i3);
                if (optJSONObject13 != null) {
                    String optString = optJSONObject13.optString("name");
                    boolean optBoolean = optJSONObject13.optBoolean("enabled");
                    if (TextUtils.isEmpty(optString)) {
                        ui.a("", false);
                    } else {
                        ui.a(optString, optBoolean);
                    }
                }
            }
        }
        this.f5041d.a(ui, aVar);
        this.f5042e.getClass();
        If ifR = new If();
        JSONObject optJSONObject14 = aVar.optJSONObject("retry_policy");
        int i4 = ifR.H;
        int i5 = ifR.I;
        if (optJSONObject14 != null) {
            i4 = optJSONObject14.optInt("max_interval_seconds", i4);
            i5 = optJSONObject14.optInt("exponential_multiplier", ifR.I);
        }
        ui.a(new RetryPolicyConfig(i4, i5));
        this.f5043f.getClass();
        if (ui.e().f4954c) {
            JSONObject optJSONObject15 = aVar.optJSONObject("permissions_collecting");
            If.n nVar = new If.n();
            if (optJSONObject15 != null) {
                j2 = optJSONObject15.optLong("check_interval_seconds", nVar.f4210a);
                j3 = optJSONObject15.optLong("force_send_interval_seconds", nVar.f4211b);
            } else {
                j2 = nVar.f4210a;
                j3 = nVar.f4211b;
            }
            ui.a(new C0261ai(j2, j3));
        }
        this.f5044g.a(ui, aVar);
        this.f5045h.a(ui, aVar);
        this.j.a(ui, (JSONObject) aVar);
        this.k.a(ui, aVar);
        this.m.a(ui, aVar);
        ui.b(this.n.a(aVar, "ui_event_sending", C0542m0.b()));
        ui.c(this.n.a(aVar, "ui_raw_event_sending", C0542m0.b()));
        ui.a(this.n.a(aVar, "ui_collecting_for_bridge", C0542m0.a()));
        this.o.a(ui, aVar);
        ui.a(this.i.a(aVar, "throttling"));
        ui.a(this.p.a(aVar));
        this.q.a(ui, aVar);
        this.r.getClass();
        JSONObject optJSONObject16 = aVar.optJSONObject("attribution");
        if (optJSONObject16 != null) {
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray3 = optJSONObject16.optJSONArray("deeplink_conditions");
            if (optJSONArray3 != null) {
                for (int i6 = 0; i6 < optJSONArray3.length(); i6++) {
                    JSONObject optJSONObject17 = optJSONArray3.optJSONObject(i6);
                    String optString2 = optJSONObject17.optString("key", (String) null);
                    if (!TextUtils.isEmpty(optString2)) {
                        String optString3 = optJSONObject17.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) null);
                        if (optString3 == null) {
                            aVar2 = null;
                        } else {
                            aVar2 = new Oh.a(optString3);
                        }
                        arrayList2.add(new Pair(optString2, aVar2));
                    }
                }
            }
            ui.a(new Oh(arrayList2));
        }
        this.t.a(ui, aVar);
        if (ui.e().w) {
            this.u.a(ui, aVar);
        }
        this.v.a(ui, aVar);
        this.w.a(ui, aVar);
    }
}
