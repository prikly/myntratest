package com.appodeal.ads.regulator;

import android.content.Context;
import com.appodeal.consent.Consent;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;

public interface h {
    Object a(Context context, String str, Continuation<? super Consent> continuation);

    void a(JSONObject jSONObject);

    boolean a();

    boolean a(UserConsent userConsent);

    boolean a(Consent consent);

    boolean a(Boolean bool);

    boolean a(String str);

    boolean b();

    Consent c();

    Boolean d();

    boolean e();

    String f();

    boolean g();

    String getUSPrivacyString();
}
