package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.MutableContextWrapper;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private MutableContextWrapper f9109a;

    public final Activity a() {
        return (Activity) this.f9109a.getBaseContext();
    }

    public final synchronized void a(Activity activity) {
        if (this.f9109a == null) {
            this.f9109a = new MutableContextWrapper(activity);
        }
        this.f9109a.setBaseContext(activity);
    }

    public final synchronized void b() {
        this.f9109a = null;
    }
}
