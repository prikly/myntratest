package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;

/* renamed from: com.yandex.metrica.impl.ob.h6  reason: case insensitive filesystem */
public final class C0424h6 {

    /* renamed from: a  reason: collision with root package name */
    private final C0473j6 f5899a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, byte[]> f5900b;

    public C0424h6(Context context, I3 i3) {
        String a2 = i3.a();
        if (a2 != null) {
            A2.a(a2);
        }
        C0473j6 j6Var = new C0473j6(context, i3);
        this.f5899a = j6Var;
        this.f5900b = MapsKt.toMutableMap(j6Var.a());
    }

    public final Map<String, byte[]> a() {
        return new HashMap(this.f5900b);
    }

    public final void a(String str, byte[] bArr) {
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                byte[] put = this.f5900b.put(str, bArr);
                this.f5899a.a(this.f5900b);
            }
        }
        byte[] remove = this.f5900b.remove(str);
        this.f5899a.a(this.f5900b);
    }
}
