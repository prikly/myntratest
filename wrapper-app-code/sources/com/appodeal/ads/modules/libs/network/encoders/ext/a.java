package com.appodeal.ads.modules.libs.network.encoders.ext;

import com.appodeal.ads.modules.libs.network.encoders.c;
import com.appodeal.ads.modules.libs.network.encoders.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class a {
    public static final byte[] a(byte[] bArr, String str, List<? extends c> list) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(list, "decoders");
        for (c a2 : list) {
            bArr = a2.a(str, bArr);
        }
        return bArr;
    }

    public static final byte[] a(byte[] bArr, List<? extends d> list) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(list, "encoders");
        for (d a2 : list) {
            bArr = a2.a(bArr);
        }
        return bArr;
    }
}
