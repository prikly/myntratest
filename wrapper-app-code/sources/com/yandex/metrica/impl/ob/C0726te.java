package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0656qf;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: com.yandex.metrica.impl.ob.te  reason: case insensitive filesystem */
public final class C0726te {

    /* renamed from: a  reason: collision with root package name */
    private final D9 f6835a = new D9();

    public C0656qf.d.a.b[] a(byte[] bArr) {
        int i = 0;
        if (bArr == null) {
            return new C0656qf.d.a.b[0];
        }
        Map<String, byte[]> a2 = this.f6835a.toModel(bArr);
        int size = a2.size();
        C0656qf.d.a.b[] bVarArr = new C0656qf.d.a.b[size];
        for (int i2 = 0; i2 < size; i2++) {
            bVarArr[i2] = new C0656qf.d.a.b();
        }
        for (Object next : ((LinkedHashMap) a2).entrySet()) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) next;
            C0656qf.d.a.b bVar = bVarArr[i];
            String str = (String) entry.getKey();
            Charset charset = Charsets.UTF_8;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                bVar.f6620a = bytes;
                bVar.f6621b = (byte[]) entry.getValue();
                i = i3;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return bVarArr;
    }
}
