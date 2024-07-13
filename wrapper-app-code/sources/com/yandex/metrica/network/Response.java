package com.yandex.metrica.network;

import com.yandex.metrica.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Response {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7279a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7280b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f7281c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f7282d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f7283e;

    /* renamed from: f  reason: collision with root package name */
    private final Throwable f7284f;

    public Response(Throwable th) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th);
    }

    public Response(boolean z, int i, byte[] bArr, byte[] bArr2, Map map, Throwable th) {
        this.f7279a = z;
        this.f7280b = i;
        this.f7281c = bArr;
        this.f7282d = bArr2;
        this.f7283e = map == null ? Collections.emptyMap() : e.a(map);
        this.f7284f = th;
    }

    public int getCode() {
        return this.f7280b;
    }

    public byte[] getErrorData() {
        return this.f7282d;
    }

    public Throwable getException() {
        return this.f7284f;
    }

    public Map getHeaders() {
        return this.f7283e;
    }

    public byte[] getResponseData() {
        return this.f7281c;
    }

    public boolean isCompleted() {
        return this.f7279a;
    }

    public String toString() {
        return "Response{completed=" + this.f7279a + ", code=" + this.f7280b + ", responseDataLength=" + this.f7281c.length + ", errorDataLength=" + this.f7282d.length + ", headers=" + this.f7283e + ", exception=" + this.f7284f + '}';
    }
}
