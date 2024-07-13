package com.applovin.impl.sdk;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdContentRating;
import com.applovin.sdk.AppLovinGender;
import com.applovin.sdk.AppLovinTargetingData;
import com.google.android.gms.common.Scopes;
import java.util.List;
import java.util.Map;

public class AppLovinTargetingDataImpl implements AppLovinTargetingData {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f15138a = CollectionUtils.map();

    /* renamed from: b  reason: collision with root package name */
    private final Object f15139b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private Integer f15140c = null;

    /* renamed from: d  reason: collision with root package name */
    private AppLovinGender f15141d = null;

    /* renamed from: e  reason: collision with root package name */
    private AppLovinAdContentRating f15142e = null;

    /* renamed from: f  reason: collision with root package name */
    private String f15143f = null;

    /* renamed from: g  reason: collision with root package name */
    private String f15144g = null;

    /* renamed from: h  reason: collision with root package name */
    private List<String> f15145h = null;
    private List<String> i = null;

    private void a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f15139b) {
                if (StringUtils.isValidString(str2)) {
                    this.f15138a.put(str, str2);
                } else {
                    this.f15138a.remove(str);
                }
            }
        }
    }

    public void clearAll() {
        synchronized (this.f15139b) {
            this.f15138a.clear();
        }
    }

    public Map<String, String> getAllData() {
        Map<String, String> map;
        synchronized (this.f15139b) {
            map = CollectionUtils.map(this.f15138a);
        }
        return map;
    }

    public String getEmail() {
        return this.f15143f;
    }

    public AppLovinGender getGender() {
        return this.f15141d;
    }

    public List<String> getInterests() {
        return this.i;
    }

    public List<String> getKeywords() {
        return this.f15145h;
    }

    public AppLovinAdContentRating getMaximumAdContentRating() {
        return this.f15142e;
    }

    public String getPhoneNumber() {
        return this.f15144g;
    }

    public Integer getYearOfBirth() {
        return this.f15140c;
    }

    public void setEmail(String str) {
        a(Scopes.EMAIL, str != null ? StringUtils.toFullSHA1Hash(str.toLowerCase().trim()) : str);
        this.f15143f = str;
    }

    public void setGender(AppLovinGender appLovinGender) {
        String str;
        if (appLovinGender != null) {
            if (appLovinGender == AppLovinGender.FEMALE) {
                str = "F";
            } else if (appLovinGender == AppLovinGender.MALE) {
                str = "M";
            } else if (appLovinGender == AppLovinGender.OTHER) {
                str = "O";
            }
            a("gender", str);
            this.f15141d = appLovinGender;
        }
        str = null;
        a("gender", str);
        this.f15141d = appLovinGender;
    }

    public void setInterests(List<String> list) {
        a("interests", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.i = list;
    }

    public void setKeywords(List<String> list) {
        a("keywords", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f15145h = list;
    }

    public void setMaximumAdContentRating(AppLovinAdContentRating appLovinAdContentRating) {
        a("maximum_ad_content_rating", (appLovinAdContentRating == null || appLovinAdContentRating == AppLovinAdContentRating.NONE) ? null : Integer.toString(appLovinAdContentRating.ordinal()));
        this.f15142e = appLovinAdContentRating;
    }

    public void setPhoneNumber(String str) {
        a("phone_number", str != null ? StringUtils.toFullSHA1Hash(str.replaceAll("[^0-9]", "")) : str);
        this.f15144g = str;
    }

    public void setYearOfBirth(Integer num) {
        a("year_of_birth", num == null ? null : Integer.toString(num.intValue()));
        this.f15140c = num;
    }
}
