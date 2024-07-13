package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.ironsource.sdk.c.d;
import com.ironsource.sdk.c.e;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.e.a.a;
import com.ironsource.sdk.g.f;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9258a = q.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final Context f9259b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ironsource.sdk.e.a.a f9260c = new com.ironsource.sdk.e.a.a();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        String f9261a;

        /* renamed from: b  reason: collision with root package name */
        JSONObject f9262b;

        /* renamed from: c  reason: collision with root package name */
        String f9263c;

        /* renamed from: d  reason: collision with root package name */
        String f9264d;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public q(Context context) {
        this.f9259b = context;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, x.d.a aVar) {
        com.ironsource.sdk.e.a.a aVar2;
        JSONObject jSONObject = new JSONObject(str);
        a aVar3 = new a((byte) 0);
        aVar3.f9261a = jSONObject.optString("omidFunction");
        aVar3.f9262b = jSONObject.optJSONObject("omidParams");
        aVar3.f9263c = jSONObject.optString("success");
        aVar3.f9264d = jSONObject.optString("fail");
        f fVar = new f();
        if (aVar3.f9262b != null) {
            String optString = aVar3.f9262b.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString)) {
                fVar.a("adViewId", optString);
            }
        }
        try {
            String str2 = aVar3.f9261a;
            char c2 = 65535;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals("activate")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -984459207:
                    if (str2.equals("getOmidData")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 70701699:
                    if (str2.equals("finishSession")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1208109646:
                    if (str2.equals("impressionOccurred")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1850541012:
                    if (str2.equals("startSession")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (c2 != 0) {
                if (c2 == 1) {
                    com.ironsource.sdk.e.a.a aVar4 = this.f9260c;
                    a.C0088a a2 = a.C0088a.a(aVar3.f9262b);
                    if (!aVar4.f9478d) {
                        throw new IllegalStateException("OMID has not been activated");
                    } else if (!TextUtils.isEmpty(a2.f9485g)) {
                        String str3 = a2.f9485g;
                        if (!aVar4.f9477c.containsKey(str3)) {
                            e a3 = d.a().a(str3);
                            if (a3 != null) {
                                AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(a2.f9484f, a2.f9483e, a2.f9480b, a2.f9481c, a2.f9479a), AdSessionContext.createHtmlAdSessionContext(aVar4.f9476b, a3.b(), (String) null, a2.f9482d));
                                createAdSession.registerAdView(a3.b());
                                createAdSession.start();
                                aVar4.f9477c.put(str3, createAdSession);
                            } else {
                                throw new IllegalStateException("No adview found with the provided adViewId");
                            }
                        } else {
                            throw new IllegalStateException("OMID Session has already started");
                        }
                    } else {
                        throw new IllegalStateException("Missing adview id in OMID params");
                    }
                } else if (c2 == 2) {
                    com.ironsource.sdk.e.a.a aVar5 = this.f9260c;
                    JSONObject jSONObject2 = aVar3.f9262b;
                    aVar5.a(jSONObject2);
                    String optString2 = jSONObject2.optString("adViewId");
                    AdSession adSession = aVar5.f9477c.get(optString2);
                    if (adSession != null) {
                        adSession.finish();
                        aVar5.f9477c.remove(optString2);
                    } else {
                        throw new IllegalStateException("OMID Session has not started");
                    }
                } else if (c2 == 3) {
                    com.ironsource.sdk.e.a.a aVar6 = this.f9260c;
                    JSONObject jSONObject3 = aVar3.f9262b;
                    aVar6.a(jSONObject3);
                    AdSession adSession2 = aVar6.f9477c.get(jSONObject3.optString("adViewId"));
                    if (adSession2 != null) {
                        AdEvents createAdEvents = AdEvents.createAdEvents(adSession2);
                        if (jSONObject3.optBoolean("signalLoaded")) {
                            createAdEvents.loaded();
                        }
                        createAdEvents.impressionOccurred();
                    } else {
                        throw new IllegalStateException("OMID Session has not started");
                    }
                } else if (c2 == 4) {
                    aVar2 = this.f9260c;
                } else {
                    throw new IllegalArgumentException(String.format("%s | unsupported OMID API", new Object[]{aVar3.f9261a}));
                }
                aVar.a(true, aVar3.f9263c, fVar);
            }
            com.ironsource.sdk.e.a.a aVar7 = this.f9260c;
            Context context = this.f9259b;
            if (!aVar7.f9478d) {
                Omid.activate(context);
                aVar7.f9478d = true;
            }
            aVar2 = this.f9260c;
            fVar = aVar2.a();
            aVar.a(true, aVar3.f9263c, fVar);
        } catch (Exception e2) {
            fVar.a("errMsg", e2.getMessage());
            String str4 = f9258a;
            Logger.i(str4, "OMIDJSAdapter " + aVar3.f9261a + " Exception: " + e2.getMessage());
            aVar.a(false, aVar3.f9264d, fVar);
        }
    }
}
