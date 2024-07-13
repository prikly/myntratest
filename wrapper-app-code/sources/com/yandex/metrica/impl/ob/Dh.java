package com.yandex.metrica.impl.ob;

import android.net.Uri;
import com.appnext.base.a.c.d;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dh extends Ah {
    Dh(Socket socket, Uri uri, Gh gh, C0336di diVar, Hh hh) {
        super(socket, uri, gh, diVar, hh);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Set<String> queryParameterNames = this.f3708d.getQueryParameterNames();
        HashMap hashMap = new HashMap();
        for (String next : queryParameterNames) {
            hashMap.put(next, this.f3708d.getQueryParameter(next));
        }
        hashMap.remove(d.COLUMN_TYPE);
        a("HTTP/1.1 200 OK", (Map<String, String>) new HashMap(), new byte[0]);
        ((Jh) this.f3706b).a(hashMap, this.f3705a.getLocalPort(), this.f3709e);
    }
}
