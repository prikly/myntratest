package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import org.json.JSONObject;

public class He implements Ge {

    /* renamed from: a  reason: collision with root package name */
    private final C0631pe f4113a;

    public He() {
        this(new C0631pe());
    }

    public byte[] a(C0655qe qeVar, Lg lg) {
        if (!lg.T() && !TextUtils.isEmpty(qeVar.f6570b)) {
            try {
                JSONObject jSONObject = new JSONObject(qeVar.f6570b);
                jSONObject.remove("preloadInfo");
                qeVar.f6570b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f4113a.a(qeVar, lg);
    }

    He(C0631pe peVar) {
        this.f4113a = peVar;
    }
}
