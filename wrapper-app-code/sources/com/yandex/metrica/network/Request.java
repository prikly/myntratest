package com.yandex.metrica.network;

import android.text.TextUtils;
import com.yandex.metrica.network.impl.e;
import java.util.HashMap;
import java.util.Map;

public class Request {

    /* renamed from: a  reason: collision with root package name */
    private final String f7271a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7272b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f7273c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f7274d;

    public class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final String f7275a;

        /* renamed from: b  reason: collision with root package name */
        private String f7276b;

        /* renamed from: c  reason: collision with root package name */
        private byte[] f7277c = new byte[0];

        /* renamed from: d  reason: collision with root package name */
        private final Map f7278d = new HashMap();

        public Builder(String str) {
            this.f7275a = str;
        }

        public Builder addHeader(String str, String str2) {
            this.f7278d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.f7275a, this.f7276b, this.f7277c, this.f7278d);
        }

        public Builder post(byte[] bArr) {
            this.f7277c = bArr;
            return withMethod("POST");
        }

        public Builder withMethod(String str) {
            this.f7276b = str;
            return this;
        }
    }

    private Request(String str, String str2, byte[] bArr, Map map) {
        this.f7271a = str;
        this.f7272b = TextUtils.isEmpty(str2) ? "GET" : str2;
        this.f7273c = bArr;
        this.f7274d = e.a(map);
    }

    public byte[] getBody() {
        return this.f7273c;
    }

    public Map getHeaders() {
        return this.f7274d;
    }

    public String getMethod() {
        return this.f7272b;
    }

    public String getUrl() {
        return this.f7271a;
    }

    public String toString() {
        return "Request{url=" + this.f7271a + ", method='" + this.f7272b + '\'' + ", bodyLength=" + this.f7273c.length + ", headers=" + this.f7274d + '}';
    }
}
