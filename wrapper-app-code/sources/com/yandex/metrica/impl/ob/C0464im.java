package com.yandex.metrica.impl.ob;

import com.applovin.sdk.AppLovinEventTypes;

/* renamed from: com.yandex.metrica.impl.ob.im  reason: case insensitive filesystem */
public enum C0464im {
    LOGIN(AppLovinEventTypes.USER_LOGGED_IN),
    LOGOUT("logout"),
    SWITCH("switch"),
    UPDATE("update");
    

    /* renamed from: a  reason: collision with root package name */
    private String f6001a;

    private C0464im(String str) {
        this.f6001a = str;
    }

    public String toString() {
        return this.f6001a;
    }
}
