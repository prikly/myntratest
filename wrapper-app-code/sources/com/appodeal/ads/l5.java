package com.appodeal.ads;

import com.appnext.base.b.i;
import com.appodeal.ads.UserSettings;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.exception_handler.a;
import com.ironsource.mediationsdk.IronSourceSegment;
import org.json.JSONObject;

public final class l5 implements UserData {
    public static volatile l5 l;

    /* renamed from: a  reason: collision with root package name */
    public String f16589a;

    /* renamed from: b  reason: collision with root package name */
    public UserSettings.Gender f16590b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f16591c;

    /* renamed from: d  reason: collision with root package name */
    public String f16592d;

    /* renamed from: e  reason: collision with root package name */
    public String f16593e;

    /* renamed from: f  reason: collision with root package name */
    public String f16594f;

    /* renamed from: g  reason: collision with root package name */
    public String f16595g;

    /* renamed from: h  reason: collision with root package name */
    public Float f16596h;
    public Float i;
    public String j;
    public String k;

    public static l5 a() {
        if (l == null) {
            synchronized (l5.class) {
                if (l == null) {
                    l = new l5();
                }
            }
        }
        return l;
    }

    public static void a(JSONObject jSONObject) {
        int optInt;
        int optInt2;
        UserSettings.Gender fromInteger;
        if (jSONObject != null) {
            l5 a2 = a();
            JSONObject optJSONObject = jSONObject.optJSONObject("user_settings");
            if (optJSONObject != null) {
                if (a2.f16590b == null && optJSONObject.has("gender") && (optInt2 = optJSONObject.optInt("gender", -1)) > -1 && (fromInteger = UserSettings.Gender.fromInteger(Integer.valueOf(optInt2))) != null) {
                    a2.f16590b = fromInteger;
                }
                if (a2.f16591c == null && optJSONObject.has(IronSourceSegment.AGE) && (optInt = optJSONObject.optInt(IronSourceSegment.AGE, -1)) > -1) {
                    a2.f16591c = Integer.valueOf(optInt);
                }
                if (optJSONObject.has(i.fC)) {
                    float optDouble = (float) optJSONObject.optDouble(i.fC, -1.0d);
                    if (optDouble > -1.0f) {
                        a2.f16596h = Float.valueOf(optDouble);
                    }
                }
                if (optJSONObject.has("lon")) {
                    float optDouble2 = (float) optJSONObject.optDouble("lon", -1.0d);
                    if (optDouble2 > -1.0f) {
                        a2.i = Float.valueOf(optDouble2);
                    }
                }
                a2.j = n5.a(optJSONObject, "city", a2.j);
                a2.k = n5.a(optJSONObject, "zip", a2.k);
            }
            a2.f16592d = n5.a(jSONObject, "ip", a2.f16592d);
            a2.f16593e = n5.a(jSONObject, "ipv6", a2.f16593e);
            a2.f16594f = n5.a(jSONObject, "country_id", a2.f16594f);
            a2.f16595g = n5.a(jSONObject, "address", a2.f16595g);
        }
    }

    public final String getAddress() {
        return this.f16595g;
    }

    @Deprecated
    public final Integer getAge() {
        return this.f16591c;
    }

    public final String getCity() {
        return this.j;
    }

    public final String getCountryId() {
        return this.f16594f;
    }

    @Deprecated
    public final UserSettings.Gender getGender() {
        return this.f16590b;
    }

    public final String getIp() {
        return this.f16592d;
    }

    public final String getIpv6() {
        return this.f16593e;
    }

    public final Float getLat() {
        return this.f16596h;
    }

    public final Float getLon() {
        return this.i;
    }

    public final String getUserId() {
        return this.f16589a;
    }

    public final String getZip() {
        return this.k;
    }

    @Deprecated
    public final UserSettings setAge(int i2) {
        Log.log("UserSettings", LogConstants.EVENT_SET, String.format("age: %s", new Object[]{Integer.valueOf(i2)}), Log.LogLevel.verbose);
        this.f16591c = Integer.valueOf(i2);
        return this;
    }

    @Deprecated
    public final UserSettings setGender(UserSettings.Gender gender) {
        if (gender == null) {
            Log.log(new a("Unable to set gender to null"));
            return this;
        }
        Log.log("UserSettings", LogConstants.EVENT_SET, String.format("gender: %s", new Object[]{gender}), Log.LogLevel.verbose);
        this.f16590b = gender;
        return this;
    }

    public final UserSettings setUserId(String str) {
        if (str == null) {
            Log.log(new a("Unable to set user id to null"));
            return this;
        }
        Log.log("UserSettings", LogConstants.EVENT_SET, String.format("userId: %s", new Object[]{str}), Log.LogLevel.verbose);
        this.f16589a = str;
        return this;
    }
}
