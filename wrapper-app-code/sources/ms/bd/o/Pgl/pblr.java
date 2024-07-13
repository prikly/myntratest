package ms.bd.o.Pgl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

class pblr extends SSLSocketFactory {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f9720b = {(String) pblk.a(16777217, 0, 0, "fe1361", new byte[]{67, 75, 113, 81, 88, 104, 55})};

    /* renamed from: a  reason: collision with root package name */
    final SSLSocketFactory f9721a;

    public pblr(SSLSocketFactory sSLSocketFactory) {
        this.f9721a = sSLSocketFactory;
    }

    private Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(f9720b);
        }
        return socket;
    }

    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return a(this.f9721a.createSocket(str, i));
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return a(this.f9721a.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return a(this.f9721a.createSocket(inetAddress, i));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return a(this.f9721a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return a(this.f9721a.createSocket(socket, str, i, z));
    }

    public String[] getDefaultCipherSuites() {
        return this.f9721a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f9721a.getSupportedCipherSuites();
    }
}
