package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C0632pf;

public class Zc {

    /* renamed from: a  reason: collision with root package name */
    private final Vb f5411a;

    /* renamed from: b  reason: collision with root package name */
    private final Yc f5412b;

    public Zc(Vb vb, Yc yc) {
        this.f5411a = vb;
        this.f5412b = yc;
    }

    public C0632pf.a a(long j, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C0529lc a2 = this.f5411a.a(j, str);
                if (a2 != null) {
                    return this.f5412b.a(a2);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
