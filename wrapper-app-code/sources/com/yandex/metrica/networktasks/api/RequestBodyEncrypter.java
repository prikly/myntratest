package com.yandex.metrica.networktasks.api;

public interface RequestBodyEncrypter {
    byte[] encrypt(byte[] bArr);

    RequestBodyEncryptionMode getEncryptionMode();
}
