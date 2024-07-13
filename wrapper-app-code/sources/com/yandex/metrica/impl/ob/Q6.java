package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class Q6 implements Converter<String, byte[]> {
    /* renamed from: a */
    public byte[] fromModel(String str) {
        if (Intrinsics.areEqual((Object) "native", (Object) str)) {
            str = "JVM";
        }
        Charset charset = Charsets.UTF_8;
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public Object toModel(Object obj) {
        byte[] bArr = (byte[]) obj;
        throw new UnsupportedOperationException();
    }
}
