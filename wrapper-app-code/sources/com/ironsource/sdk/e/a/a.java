package com.ironsource.sdk.e.a;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.g.f;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9475a = Omid.getVersion();

    /* renamed from: b  reason: collision with root package name */
    public final Partner f9476b = Partner.createPartner("Ironsrc", "7");

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, AdSession> f9477c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f9478d = false;

    /* renamed from: com.ironsource.sdk.e.a.a$a  reason: collision with other inner class name */
    public static class C0088a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f9479a;

        /* renamed from: b  reason: collision with root package name */
        public Owner f9480b;

        /* renamed from: c  reason: collision with root package name */
        public Owner f9481c;

        /* renamed from: d  reason: collision with root package name */
        public String f9482d;

        /* renamed from: e  reason: collision with root package name */
        public ImpressionType f9483e;

        /* renamed from: f  reason: collision with root package name */
        public CreativeType f9484f;

        /* renamed from: g  reason: collision with root package name */
        public String f9485g;

        /* renamed from: h  reason: collision with root package name */
        private Owner f9486h;

        public static C0088a a(JSONObject jSONObject) {
            C0088a aVar = new C0088a();
            aVar.f9479a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String optString = jSONObject.optString("impressionOwner", "");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    aVar.f9480b = Owner.valueOf(optString.toUpperCase());
                    String optString2 = jSONObject.optString("videoEventsOwner", "");
                    if (!TextUtils.isEmpty(optString)) {
                        try {
                            aVar.f9481c = Owner.valueOf(optString2.toUpperCase());
                            aVar.f9482d = jSONObject.optString("customReferenceData", "");
                            aVar.f9484f = c(jSONObject);
                            aVar.f9483e = b(jSONObject);
                            String optString3 = jSONObject.optString("adViewId", "");
                            if (!TextUtils.isEmpty(optString3)) {
                                aVar.f9485g = optString3;
                                aVar.f9486h = d(jSONObject);
                                return aVar;
                            }
                            throw new IllegalArgumentException("Missing adview id in OMID params" + optString3);
                        } catch (IllegalArgumentException unused) {
                            throw new IllegalArgumentException("Invalid OMID videoEventsOwner " + optString2);
                        }
                    } else {
                        throw new IllegalArgumentException("Missing OMID videoEventsOwner");
                    }
                } catch (IllegalArgumentException unused2) {
                    throw new IllegalArgumentException("Invalid OMID impressionOwner " + optString);
                }
            } else {
                throw new IllegalArgumentException("Missing OMID impressionOwner");
            }
        }

        private static ImpressionType b(JSONObject jSONObject) {
            String optString = jSONObject.optString("impressionType", "");
            if (!TextUtils.isEmpty(optString)) {
                for (ImpressionType impressionType : ImpressionType.values()) {
                    if (optString.equalsIgnoreCase(impressionType.toString())) {
                        return impressionType;
                    }
                }
                throw new IllegalArgumentException("Missing OMID creativeType" + optString);
            }
            throw new IllegalArgumentException("Missing OMID creativeType" + optString);
        }

        private static CreativeType c(JSONObject jSONObject) {
            String optString = jSONObject.optString("creativeType", "");
            if (!TextUtils.isEmpty(optString)) {
                for (CreativeType creativeType : CreativeType.values()) {
                    if (optString.equalsIgnoreCase(creativeType.toString())) {
                        return creativeType;
                    }
                }
                throw new IllegalArgumentException("Missing OMID creativeType" + optString);
            }
            throw new IllegalArgumentException("Missing OMID creativeType" + optString);
        }

        private static Owner d(JSONObject jSONObject) {
            try {
                return Owner.valueOf(jSONObject.optString("videoEventsOwner", "").toUpperCase());
            } catch (IllegalArgumentException unused) {
                return Owner.NONE;
            }
        }
    }

    public final f a() {
        f fVar = new f();
        fVar.a("omidVersion", SDKUtils.encodeString(f9475a));
        fVar.a("omidPartnerName", SDKUtils.encodeString("Ironsrc"));
        fVar.a("omidPartnerVersion", SDKUtils.encodeString("7"));
        fVar.a("omidActiveAdSessions", SDKUtils.encodeString(Arrays.toString(this.f9477c.keySet().toArray())));
        return fVar;
    }

    public void a(JSONObject jSONObject) {
        if (!this.f9478d) {
            throw new IllegalStateException("OMID has not been activated");
        } else if (jSONObject == null) {
            throw new IllegalStateException("OMID Session has not started");
        }
    }
}
