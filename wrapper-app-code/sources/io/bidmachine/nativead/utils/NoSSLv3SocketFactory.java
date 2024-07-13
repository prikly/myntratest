package io.bidmachine.nativead.utils;

import io.bidmachine.core.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class NoSSLv3SocketFactory extends SSLSocketFactory {
    private final SSLSocketFactory delegate;

    public NoSSLv3SocketFactory() {
        this.delegate = HttpsURLConnection.getDefaultSSLSocketFactory();
    }

    public NoSSLv3SocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.delegate = sSLSocketFactory;
    }

    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    private Socket makeSocketSafe(Socket socket) {
        return socket instanceof SSLSocket ? new NoSSLv3SSLSocket((SSLSocket) socket) : socket;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return makeSocketSafe(this.delegate.createSocket(socket, str, i, z));
    }

    public Socket createSocket(String str, int i) throws IOException {
        return makeSocketSafe(this.delegate.createSocket(str, i));
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return makeSocketSafe(this.delegate.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return makeSocketSafe(this.delegate.createSocket(inetAddress, i));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return makeSocketSafe(this.delegate.createSocket(inetAddress, i, inetAddress2, i2));
    }

    private static class NoSSLv3SSLSocket extends DelegateSSLSocket {
        private NoSSLv3SSLSocket(SSLSocket sSLSocket) {
            super(sSLSocket);
        }

        public void setEnabledProtocols(String[] strArr) {
            if (strArr != null && strArr.length == 1 && "SSLv3".equals(strArr[0])) {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.delegate.getEnabledProtocols()));
                if (arrayList.size() > 1) {
                    arrayList.remove("SSLv3");
                    System.out.println("Removed SSLv3 from enabled protocols");
                } else {
                    PrintStream printStream = System.out;
                    printStream.println("SSL stuck with protocol available for " + arrayList);
                }
                strArr = (String[]) arrayList.toArray(new String[0]);
            }
            super.setEnabledProtocols(strArr);
        }
    }

    public static class DelegateSSLSocket extends SSLSocket {
        final SSLSocket delegate;

        DelegateSSLSocket(SSLSocket sSLSocket) {
            this.delegate = sSLSocket;
        }

        public String[] getSupportedCipherSuites() {
            return this.delegate.getSupportedCipherSuites();
        }

        public String[] getEnabledCipherSuites() {
            return this.delegate.getEnabledCipherSuites();
        }

        public void setEnabledCipherSuites(String[] strArr) {
            this.delegate.setEnabledCipherSuites(strArr);
        }

        public String[] getSupportedProtocols() {
            return this.delegate.getSupportedProtocols();
        }

        public String[] getEnabledProtocols() {
            return this.delegate.getEnabledProtocols();
        }

        public void setEnabledProtocols(String[] strArr) {
            this.delegate.setEnabledProtocols(strArr);
        }

        public SSLSession getSession() {
            return this.delegate.getSession();
        }

        public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.delegate.addHandshakeCompletedListener(handshakeCompletedListener);
        }

        public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.delegate.removeHandshakeCompletedListener(handshakeCompletedListener);
        }

        public void startHandshake() throws IOException {
            this.delegate.startHandshake();
        }

        public void setUseClientMode(boolean z) {
            this.delegate.setUseClientMode(z);
        }

        public boolean getUseClientMode() {
            return this.delegate.getUseClientMode();
        }

        public void setNeedClientAuth(boolean z) {
            this.delegate.setNeedClientAuth(z);
        }

        public void setWantClientAuth(boolean z) {
            this.delegate.setWantClientAuth(z);
        }

        public boolean getNeedClientAuth() {
            return this.delegate.getNeedClientAuth();
        }

        public boolean getWantClientAuth() {
            return this.delegate.getWantClientAuth();
        }

        public void setEnableSessionCreation(boolean z) {
            this.delegate.setEnableSessionCreation(z);
        }

        public boolean getEnableSessionCreation() {
            return this.delegate.getEnableSessionCreation();
        }

        public void bind(SocketAddress socketAddress) throws IOException {
            this.delegate.bind(socketAddress);
        }

        public synchronized void close() throws IOException {
            Utils.close(this.delegate);
        }

        public void connect(SocketAddress socketAddress) throws IOException {
            this.delegate.connect(socketAddress);
        }

        public void connect(SocketAddress socketAddress, int i) throws IOException {
            this.delegate.connect(socketAddress, i);
        }

        public SocketChannel getChannel() {
            return this.delegate.getChannel();
        }

        public InetAddress getInetAddress() {
            return this.delegate.getInetAddress();
        }

        public InputStream getInputStream() throws IOException {
            return this.delegate.getInputStream();
        }

        public boolean getKeepAlive() throws SocketException {
            return this.delegate.getKeepAlive();
        }

        public InetAddress getLocalAddress() {
            return this.delegate.getLocalAddress();
        }

        public int getLocalPort() {
            return this.delegate.getLocalPort();
        }

        public SocketAddress getLocalSocketAddress() {
            return this.delegate.getLocalSocketAddress();
        }

        public boolean getOOBInline() throws SocketException {
            return this.delegate.getOOBInline();
        }

        public OutputStream getOutputStream() throws IOException {
            return this.delegate.getOutputStream();
        }

        public int getPort() {
            return this.delegate.getPort();
        }

        public synchronized int getReceiveBufferSize() throws SocketException {
            return this.delegate.getReceiveBufferSize();
        }

        public SocketAddress getRemoteSocketAddress() {
            return this.delegate.getRemoteSocketAddress();
        }

        public boolean getReuseAddress() throws SocketException {
            return this.delegate.getReuseAddress();
        }

        public synchronized int getSendBufferSize() throws SocketException {
            return this.delegate.getSendBufferSize();
        }

        public int getSoLinger() throws SocketException {
            return this.delegate.getSoLinger();
        }

        public synchronized int getSoTimeout() throws SocketException {
            return this.delegate.getSoTimeout();
        }

        public boolean getTcpNoDelay() throws SocketException {
            return this.delegate.getTcpNoDelay();
        }

        public int getTrafficClass() throws SocketException {
            return this.delegate.getTrafficClass();
        }

        public boolean isBound() {
            return this.delegate.isBound();
        }

        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        public boolean isConnected() {
            return this.delegate.isConnected();
        }

        public boolean isInputShutdown() {
            return this.delegate.isInputShutdown();
        }

        public boolean isOutputShutdown() {
            return this.delegate.isOutputShutdown();
        }

        public void sendUrgentData(int i) throws IOException {
            this.delegate.sendUrgentData(i);
        }

        public void setKeepAlive(boolean z) throws SocketException {
            this.delegate.setKeepAlive(z);
        }

        public void setOOBInline(boolean z) throws SocketException {
            this.delegate.setOOBInline(z);
        }

        public void setPerformancePreferences(int i, int i2, int i3) {
            this.delegate.setPerformancePreferences(i, i2, i3);
        }

        public synchronized void setReceiveBufferSize(int i) throws SocketException {
            this.delegate.setReceiveBufferSize(i);
        }

        public void setReuseAddress(boolean z) throws SocketException {
            this.delegate.setReuseAddress(z);
        }

        public synchronized void setSendBufferSize(int i) throws SocketException {
            this.delegate.setSendBufferSize(i);
        }

        public void setSoLinger(boolean z, int i) throws SocketException {
            this.delegate.setSoLinger(z, i);
        }

        public synchronized void setSoTimeout(int i) throws SocketException {
            this.delegate.setSoTimeout(i);
        }

        public void setTcpNoDelay(boolean z) throws SocketException {
            this.delegate.setTcpNoDelay(z);
        }

        public void setTrafficClass(int i) throws SocketException {
            this.delegate.setTrafficClass(i);
        }

        public void shutdownInput() throws IOException {
            this.delegate.shutdownInput();
        }

        public void shutdownOutput() throws IOException {
            this.delegate.shutdownOutput();
        }

        public String toString() {
            return this.delegate.toString();
        }

        public boolean equals(Object obj) {
            return this.delegate.equals(obj);
        }
    }
}
