package com.appodeal.ads;

import com.appodeal.ads.Native;
import com.appodeal.ads.h2;
import com.appodeal.ads.o1;
import com.appodeal.ads.o4;
import com.appodeal.ads.t0;
import com.appodeal.ads.w2;
import kotlin.jvm.internal.Intrinsics;

public final class s4 {
    public static final int a(u<?, ?, ?> uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        if (uVar instanceof o1.a) {
            return 1;
        }
        if (uVar instanceof w2.b) {
            return 2;
        }
        if (uVar instanceof o4.b) {
            return 128;
        }
        if (uVar instanceof t0.b) {
            return 3164;
        }
        if (uVar instanceof h2.b) {
            return 256;
        }
        if (uVar instanceof Native.a) {
            return 512;
        }
        g1.f16413a.b(Intrinsics.stringPlus("unexpected AdTypeController: ", uVar));
        return 0;
    }
}
