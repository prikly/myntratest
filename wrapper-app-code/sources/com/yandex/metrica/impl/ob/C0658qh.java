package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.util.Base64;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.qh  reason: case insensitive filesystem */
class C0658qh extends Ah {

    /* renamed from: f  reason: collision with root package name */
    private final String f6644f;

    /* renamed from: com.yandex.metrica.impl.ob.qh$a */
    class a extends HashMap<String, String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ byte[] f6645a;

        a(C0658qh qhVar, byte[] bArr) {
            this.f6645a = bArr;
            put("Content-Type", "text/plain; charset=utf-8");
            put("Access-Control-Allow-Origin", "*");
            put("Access-Control-Allow-Methods", "GET");
            put("Content-Length", String.valueOf(bArr.length));
        }
    }

    C0658qh(Socket socket, Uri uri, Gh gh, C0336di diVar, String str, Hh hh) {
        super(socket, uri, gh, diVar, hh);
        this.f6644f = str;
    }

    public void a() {
        try {
            byte[] encode = Base64.encode(new C0854ym().a(this.f6644f.getBytes()), 0);
            a("HTTP/1.1 200 OK", (Map<String, String>) new a(this, encode), encode);
        } catch (Throwable unused) {
        }
    }
}
