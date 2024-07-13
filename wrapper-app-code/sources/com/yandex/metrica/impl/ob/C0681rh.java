package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.net.ServerSocket;

/* renamed from: com.yandex.metrica.impl.ob.rh  reason: case insensitive filesystem */
class C0681rh implements Fh {
    C0681rh() {
    }

    public ServerSocket a(int i) throws IOException {
        return new ServerSocket(i);
    }
}
