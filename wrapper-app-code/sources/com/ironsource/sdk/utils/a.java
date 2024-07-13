package com.ironsource.sdk.utils;

import android.content.Context;
import com.ironsource.environment.h;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    private static a f9619g;

    /* renamed from: a  reason: collision with root package name */
    public String f9620a = h.h();

    /* renamed from: b  reason: collision with root package name */
    public String f9621b = h.g();

    /* renamed from: c  reason: collision with root package name */
    public String f9622c = h.i();

    /* renamed from: d  reason: collision with root package name */
    public String f9623d = h.e();

    /* renamed from: e  reason: collision with root package name */
    public int f9624e = h.f();

    /* renamed from: f  reason: collision with root package name */
    public String f9625f;

    private a(Context context) {
        this.f9625f = h.i(context);
    }

    public static a a(Context context) {
        if (f9619g == null) {
            f9619g = new a(context);
        }
        return f9619g;
    }

    public static void a() {
        f9619g = null;
    }

    public static float b(Context context) {
        return h.l(context);
    }
}
