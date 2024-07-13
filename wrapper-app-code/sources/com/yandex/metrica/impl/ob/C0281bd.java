package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C0632pf;

/* renamed from: com.yandex.metrica.impl.ob.bd  reason: case insensitive filesystem */
public class C0281bd {

    /* renamed from: a  reason: collision with root package name */
    private final Vb f5531a;

    /* renamed from: b  reason: collision with root package name */
    private final C0256ad f5532b;

    public C0281bd(Vb vb, C0256ad adVar) {
        this.f5531a = vb;
        this.f5532b = adVar;
    }

    public C0632pf.b a(long j, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Hc b2 = this.f5531a.b(j, str);
                if (b2 != null) {
                    return this.f5532b.a(b2);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
