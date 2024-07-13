package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class R6 implements Converter<Map<String, ? extends String>, C0383ff[]> {
    /* renamed from: a */
    public C0383ff[] fromModel(Map<String, String> map) {
        int size = map.size();
        C0383ff[] ffVarArr = new C0383ff[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ffVarArr[i2] = new C0383ff();
        }
        for (Map.Entry next : map.entrySet()) {
            C0383ff ffVar = ffVarArr[i];
            String str = (String) next.getKey();
            Charset charset = Charsets.UTF_8;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                ffVar.f5815a = bytes;
                C0383ff ffVar2 = ffVarArr[i];
                String str2 = (String) next.getValue();
                Charset charset2 = Charsets.UTF_8;
                if (str2 != null) {
                    byte[] bytes2 = str2.getBytes(charset2);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                    ffVar2.f5816b = bytes2;
                    i++;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return ffVarArr;
    }

    public Object toModel(Object obj) {
        C0383ff[] ffVarArr = (C0383ff[]) obj;
        throw new UnsupportedOperationException();
    }
}
