package com.yandex.metrica.networktasks.api;

import java.util.Map;

public class ResponseDataHolder {

    /* renamed from: a  reason: collision with root package name */
    private int f7326a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f7327b;

    /* renamed from: c  reason: collision with root package name */
    private Map f7328c;

    /* renamed from: d  reason: collision with root package name */
    private final ResponseValidityChecker f7329d;

    public ResponseDataHolder(ResponseValidityChecker responseValidityChecker) {
        this.f7329d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f7326a;
    }

    public byte[] getResponseData() {
        return this.f7327b;
    }

    public Map getResponseHeaders() {
        return this.f7328c;
    }

    public boolean isValidResponse() {
        return this.f7329d.isResponseValid(this.f7326a);
    }

    public void setResponseCode(int i) {
        this.f7326a = i;
    }

    public void setResponseData(byte[] bArr) {
        this.f7327b = bArr;
    }

    public void setResponseHeaders(Map map) {
        this.f7328c = map;
    }
}
