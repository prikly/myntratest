package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.yandex.metrica.impl.ob.C0685rl;

class Ak {

    /* renamed from: a  reason: collision with root package name */
    private final C0462ik f3710a;

    /* renamed from: b  reason: collision with root package name */
    private final C0780vk f3711b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3712c;

    Ak(C0852yk<?> ykVar, int i) {
        this(ykVar, i, new C0462ik(ykVar.b()));
    }

    /* access modifiers changed from: package-private */
    public C0685rl.b a(String str) {
        if (str == null) {
            return null;
        }
        Pair<Boolean, C0685rl.b> a2 = this.f3711b.a(this.f3712c, str);
        if (a2 != null) {
            return (C0685rl.b) a2.second;
        }
        C0685rl.b a3 = this.f3710a.a(str);
        this.f3711b.a(this.f3712c, str, a3 != null, a3);
        return a3;
    }

    Ak(C0852yk<?> ykVar, int i, C0462ik ikVar) {
        this.f3712c = i;
        this.f3710a = ikVar;
        this.f3711b = ykVar.a();
    }
}
