package com.yandex.metrica.impl.ob;

import android.app.Activity;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.pl  reason: case insensitive filesystem */
public class C0638pl {

    /* renamed from: a  reason: collision with root package name */
    private final Kk f6476a;

    /* renamed from: b  reason: collision with root package name */
    private final Ik f6477b;

    /* renamed from: c  reason: collision with root package name */
    private final Jk f6478c;

    /* renamed from: d  reason: collision with root package name */
    private final Gk f6479d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6480e;

    public C0638pl(Kk kk, Ik ik, Jk jk, Gk gk, String str) {
        this.f6476a = kk;
        this.f6477b = ik;
        this.f6478c = jk;
        this.f6479d = gk;
        this.f6480e = str;
    }

    public JSONObject a(Activity activity, C0339dl dlVar, C0439hl hlVar, Ak ak, long j) {
        JSONObject a2 = this.f6476a.a(activity, j);
        try {
            this.f6478c.a(a2, new JSONObject(), this.f6480e);
            this.f6478c.a(a2, this.f6477b.a(dlVar, hlVar, ak, (a2.toString().getBytes().length + (this.f6479d.a(new JSONObject()).toString().getBytes().length - 2)) - 2), this.f6480e);
        } catch (Throwable unused) {
        }
        return a2;
    }
}
