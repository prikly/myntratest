package com.yandex.metrica.networktasks.api;

import android.net.Uri;
import android.text.TextUtils;

public class NetworkTaskForSendingDataParamsAppender {

    /* renamed from: a  reason: collision with root package name */
    private final RequestBodyEncrypter f7319a;

    public NetworkTaskForSendingDataParamsAppender(RequestBodyEncrypter requestBodyEncrypter) {
        this.f7319a = requestBodyEncrypter;
    }

    public void appendCommitHash(Uri.Builder builder, String str, String str2) {
        if (str2 != null && str2.contains("source") && !TextUtils.isEmpty(str)) {
            builder.appendQueryParameter("commit_hash", str);
        }
    }

    public void appendEncryptedData(Uri.Builder builder) {
        if (this.f7319a.getEncryptionMode() == RequestBodyEncryptionMode.AES_RSA) {
            builder.appendQueryParameter("encrypted_request", "1");
        }
    }
}
