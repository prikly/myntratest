package com.yandex.metrica.impl.ob;

import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.v9  reason: case insensitive filesystem */
public class C0769v9 {

    /* renamed from: a  reason: collision with root package name */
    private final a f6969a;

    /* renamed from: b  reason: collision with root package name */
    private final Ql f6970b;

    /* renamed from: com.yandex.metrica.impl.ob.v9$a */
    public static class a {
    }

    public C0769v9() {
        this(new a(), new Ql());
    }

    public byte[] a(byte[] bArr, String str) {
        try {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            a aVar = this.f6969a;
            byte[] bytes = str.getBytes();
            aVar.getClass();
            C0806wm wmVar = new C0806wm("AES/CBC/PKCS5Padding", bytes, copyOfRange);
            if (A2.a(bArr)) {
                return null;
            }
            return this.f6970b.uncompress(wmVar.a(bArr, 16, bArr.length - 16));
        } catch (Throwable unused) {
            return null;
        }
    }

    public C0769v9(a aVar, Ql ql) {
        this.f6969a = aVar;
        this.f6970b = ql;
    }
}
