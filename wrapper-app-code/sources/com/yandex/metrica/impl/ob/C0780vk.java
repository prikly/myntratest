package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.yandex.metrica.impl.ob.C0685rl;

/* renamed from: com.yandex.metrica.impl.ob.vk  reason: case insensitive filesystem */
class C0780vk {

    /* renamed from: a  reason: collision with root package name */
    private final C0639pm<C0804wk, Pair<Boolean, C0685rl.b>> f7003a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7004b;

    C0780vk(int i, int i2) {
        this.f7003a = new C0828xk(i);
        this.f7004b = i2;
    }

    /* access modifiers changed from: package-private */
    public void a(int i, String str, boolean z, C0685rl.b bVar) {
        if (str.length() <= this.f7004b) {
            this.f7003a.a(new C0804wk(i, str), new Pair(Boolean.valueOf(z), bVar));
        }
    }

    /* access modifiers changed from: package-private */
    public Pair<Boolean, C0685rl.b> a(int i, String str) {
        if (str.length() > this.f7004b) {
            return null;
        }
        return this.f7003a.a(new C0804wk(i, str));
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f7003a.a();
    }
}
