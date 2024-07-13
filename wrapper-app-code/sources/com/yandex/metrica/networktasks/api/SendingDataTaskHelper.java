package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.DefaultResponseParser;
import com.yandex.metrica.networktasks.impl.h;
import java.io.IOException;

public class SendingDataTaskHelper {

    /* renamed from: a  reason: collision with root package name */
    private final RequestBodyEncrypter f7330a;

    /* renamed from: b  reason: collision with root package name */
    private final Compressor f7331b;

    /* renamed from: c  reason: collision with root package name */
    private final h f7332c;

    /* renamed from: d  reason: collision with root package name */
    private final RequestDataHolder f7333d;

    /* renamed from: e  reason: collision with root package name */
    private final ResponseDataHolder f7334e;

    /* renamed from: f  reason: collision with root package name */
    private final NetworkResponseHandler f7335f;

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new h(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, h hVar, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler networkResponseHandler) {
        this.f7330a = requestBodyEncrypter;
        this.f7331b = compressor;
        this.f7332c = hVar;
        this.f7333d = requestDataHolder;
        this.f7334e = responseDataHolder;
        this.f7335f = networkResponseHandler;
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f7335f.handle(this.f7334e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        RequestDataHolder requestDataHolder = this.f7333d;
        this.f7332c.getClass();
        requestDataHolder.applySendTime(System.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(byte[] bArr) {
        byte[] encrypt;
        try {
            byte[] compress = this.f7331b.compress(bArr);
            if (compress == null || (encrypt = this.f7330a.encrypt(compress)) == null) {
                return false;
            }
            this.f7333d.setPostData(encrypt);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
