package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.yandex.metrica.impl.ob.fj  reason: case insensitive filesystem */
class C0387fj {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5818a;

    /* renamed from: b  reason: collision with root package name */
    private final B0 f5819b;

    /* renamed from: c  reason: collision with root package name */
    private final C0489jm f5820c;

    C0387fj(Context context, B0 b0, C0489jm jmVar) {
        this.f5818a = context;
        this.f5819b = b0;
        this.f5820c = jmVar;
    }

    public String a() {
        return L0.a(this.f5819b.a(this.f5818a, "uuid.dat"));
    }

    public String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = this.f5820c.a();
            }
            File a2 = this.f5819b.a(this.f5818a, "uuid.dat");
            if (a2 != null) {
                L0.a(str, "uuid.dat", new FileOutputStream(a2));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }
}
