package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.vm  reason: case insensitive filesystem */
public class C0782vm {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7005a;

    public C0782vm(Context context) {
        this.f7005a = context;
    }

    public byte[] a() {
        try {
            return Tl.b(new StringBuilder(this.f7005a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public byte[] b() {
        try {
            return Tl.b(this.f7005a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
