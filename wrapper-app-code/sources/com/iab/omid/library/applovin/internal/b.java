package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.a;

public class b extends d {

    /* renamed from: d  reason: collision with root package name */
    private static b f7665d = new b();

    private b() {
    }

    public static b g() {
        return f7665d;
    }

    public void b(boolean z) {
        for (a adSessionStatePublisher : c.c().b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().a(z);
        }
    }

    public boolean d() {
        for (a c2 : c.c().a()) {
            View c3 = c2.c();
            if (c3 != null && c3.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
