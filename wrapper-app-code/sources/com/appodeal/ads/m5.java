package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.data.UserPersonalData;
import org.json.JSONObject;

public final class m5 extends j4 implements UserPersonalData {

    /* renamed from: c  reason: collision with root package name */
    public static final m5 f16615c = new m5();

    public final JSONObject getCachedToken() {
        return x2.f();
    }

    public final JSONObject getExtraData() {
        return ExtraData.INSTANCE.asJson();
    }

    public final boolean wasAdIdGenerated() {
        return x2.h();
    }
}
