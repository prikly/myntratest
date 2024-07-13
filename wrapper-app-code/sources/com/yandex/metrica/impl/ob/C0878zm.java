package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;
import com.yandex.metrica.networktasks.api.RequestBodyEncryptionMode;

/* renamed from: com.yandex.metrica.impl.ob.zm  reason: case insensitive filesystem */
public class C0878zm implements RequestBodyEncrypter {

    /* renamed from: a  reason: collision with root package name */
    private C0854ym f7245a;

    public C0878zm() {
        this(new C0854ym());
    }

    public byte[] encrypt(byte[] bArr) {
        return this.f7245a.a(bArr);
    }

    public RequestBodyEncryptionMode getEncryptionMode() {
        return RequestBodyEncryptionMode.AES_RSA;
    }

    C0878zm(C0854ym ymVar) {
        this.f7245a = ymVar;
    }
}
