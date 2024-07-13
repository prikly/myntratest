package com.yandex.metrica.impl.ob;

import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.j0  reason: case insensitive filesystem */
public class C0467j0 {

    /* renamed from: a  reason: collision with root package name */
    private final K0 f6003a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Boolean, String> f6004b = new HashMap();

    public C0467j0(K0 k0) {
        this.f6003a = k0;
    }

    public void a(Intent intent) {
        if (intent != null) {
            a(intent.getDataString(), false);
        }
    }

    public void b(String str) {
        a(str, true);
    }

    public void a(String str) {
        a(str, false);
    }

    private void a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            if (!A2.a((Object) str, (Object) this.f6004b.get(Boolean.valueOf(!z)))) {
                this.f6003a.a(str, z);
            }
            this.f6004b.put(Boolean.valueOf(z), str);
        }
    }
}
