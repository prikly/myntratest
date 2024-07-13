package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Fh;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* renamed from: com.yandex.metrica.impl.ob.vh  reason: case insensitive filesystem */
class C0777vh implements Fh {

    /* renamed from: a  reason: collision with root package name */
    private final File f7001a;

    C0777vh(File file) {
        this.f7001a = file;
    }

    public ServerSocket a(int i) throws IOException, Fh.a {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            KeyManagerFactory instance2 = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            KeyStore instance3 = KeyStore.getInstance("PKCS12");
            instance3.load(new FileInputStream(this.f7001a), "`0l}%01ny{jl~;|&".toCharArray());
            instance2.init(instance3, "`0l}%01ny{jl~;|&".toCharArray());
            instance.init(instance2.getKeyManagers(), (TrustManager[]) null, (SecureRandom) null);
            return instance.getServerSocketFactory().createServerSocket(i);
        } catch (Exception e2) {
            throw new Fh.a("https_open_error", e2);
        }
    }
}
