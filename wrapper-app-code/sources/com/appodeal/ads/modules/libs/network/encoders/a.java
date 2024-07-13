package com.appodeal.ads.modules.libs.network.encoders;

import android.util.Base64;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

public final class a implements c, d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16768a = new a();

    public final Map<String, List<String>> a() {
        return MapsKt.emptyMap();
    }

    public final byte[] a(String str, byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "data");
        byte[] decode = Base64.decode(bArr, 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(data, Base64.DEFAULT)");
        return decode;
    }

    public final byte[] a(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "data");
        byte[] encode = Base64.encode(bArr, 0);
        Intrinsics.checkNotNullExpressionValue(encode, "encode(data, Base64.DEFAULT)");
        return encode;
    }
}
