package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;

class G2 implements C0539lm<Context, Intent, Void> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ V f4034a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CountDownLatch f4035b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ H2 f4036c;

    G2(H2 h2, V v, CountDownLatch countDownLatch) {
        this.f4036c = h2;
        this.f4034a = v;
        this.f4035b = countDownLatch;
    }

    public Object a(Object obj, Object obj2) {
        Context context = (Context) obj;
        Intent intent = (Intent) obj2;
        this.f4034a.a(this.f4036c.c());
        this.f4035b.countDown();
        this.f4036c.k.b(this);
        return null;
    }
}
