package com.appodeal.ads.segments;

import java.util.Random;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f17244a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(0);
        this.f17244a = fVar;
    }

    public final Object invoke() {
        int i;
        Integer valueOf = Integer.valueOf(this.f17244a.f17245a.b());
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        if (valueOf == null) {
            Integer valueOf2 = Integer.valueOf(new Random().nextInt(100) + 1);
            this.f17244a.f17245a.a(valueOf2.intValue());
            i = valueOf2.intValue();
        } else {
            i = valueOf.intValue();
        }
        return Integer.valueOf(i);
    }
}
