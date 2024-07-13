package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.z1  reason: case insensitive filesystem */
public class C0857z1 {

    /* renamed from: a  reason: collision with root package name */
    private final B0 f7205a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7206b;

    public C0857z1(Xl xl) {
        this(xl, new B0());
    }

    public void a(Context context) {
        long j;
        synchronized (this) {
        }
        if (!this.f7206b) {
            synchronized (this) {
                try {
                    String a2 = L0.a(this.f7205a.a(context, "metrica_service_settings.dat"));
                    if (!TextUtils.isEmpty(a2)) {
                        j = new JSONObject(a2).optLong("delay");
                    }
                } catch (Throwable unused) {
                }
                j = 0;
            }
            if (j > 0) {
                try {
                    Thread.sleep(j);
                } catch (Throwable unused2) {
                }
            }
            this.f7206b = true;
        }
    }

    C0857z1(Xl xl, B0 b0) {
        this.f7206b = false;
        this.f7205a = b0;
    }
}
