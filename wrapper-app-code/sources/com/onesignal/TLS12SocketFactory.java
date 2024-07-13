package com.onesignal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class TLS12SocketFactory extends SSLSocketFactory {
    SSLSocketFactory sslSocketFactory;

    public TLS12SocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public String[] getDefaultCipherSuites() {
        return this.sslSocketFactory.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.sslSocketFactory.getSupportedCipherSuites();
    }

    public Socket createSocket() throws IOException {
        return enableTLS(this.sslSocketFactory.createSocket());
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return enableTLS(this.sslSocketFactory.createSocket(socket, str, i, z));
    }

    public Socket createSocket(String str, int i) throws IOException {
        return enableTLS(this.sslSocketFactory.createSocket(str, i));
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return enableTLS(this.sslSocketFactory.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return enableTLS(this.sslSocketFactory.createSocket(inetAddress, i));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return enableTLS(this.sslSocketFactory.createSocket(inetAddress, i, inetAddress2, i2));
    }

    private Socket enableTLS(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socket;
    }
}
