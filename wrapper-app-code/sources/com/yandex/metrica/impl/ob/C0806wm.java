package com.yandex.metrica.impl.ob;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.yandex.metrica.impl.ob.wm  reason: case insensitive filesystem */
public class C0806wm {

    /* renamed from: a  reason: collision with root package name */
    private final String f7073a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f7074b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f7075c;

    public C0806wm(String str, byte[] bArr, byte[] bArr2) {
        this.f7073a = str;
        this.f7074b = bArr;
        this.f7075c = bArr2;
    }

    public byte[] a(byte[] bArr) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f7074b, "AES");
        Cipher instance = Cipher.getInstance(this.f7073a);
        instance.init(1, secretKeySpec, new IvParameterSpec(this.f7075c));
        return instance.doFinal(bArr);
    }

    public byte[] a(byte[] bArr, int i, int i2) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f7074b, "AES");
        Cipher instance = Cipher.getInstance(this.f7073a);
        instance.init(2, secretKeySpec, new IvParameterSpec(this.f7075c));
        return instance.doFinal(bArr, i, i2);
    }
}
