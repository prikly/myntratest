package com.appodeal.ads.utils;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public final class t extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    public final SSLSocketFactory f17570a;

    public static class a extends SSLSocket {

        /* renamed from: a  reason: collision with root package name */
        public final SSLSocket f17571a;

        public a(SSLSocket sSLSocket) {
            this.f17571a = sSLSocket;
        }

        public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.f17571a.addHandshakeCompletedListener(handshakeCompletedListener);
        }

        public final void bind(SocketAddress socketAddress) {
            this.f17571a.bind(socketAddress);
        }

        public final synchronized void close() {
            this.f17571a.close();
        }

        public final void connect(SocketAddress socketAddress) {
            this.f17571a.connect(socketAddress);
        }

        public final void connect(SocketAddress socketAddress, int i) {
            this.f17571a.connect(socketAddress, i);
        }

        public final boolean equals(Object obj) {
            return this.f17571a.equals(obj);
        }

        public final SocketChannel getChannel() {
            return this.f17571a.getChannel();
        }

        public final boolean getEnableSessionCreation() {
            return this.f17571a.getEnableSessionCreation();
        }

        public final String[] getEnabledCipherSuites() {
            return this.f17571a.getEnabledCipherSuites();
        }

        public final String[] getEnabledProtocols() {
            return this.f17571a.getEnabledProtocols();
        }

        public final InetAddress getInetAddress() {
            return this.f17571a.getInetAddress();
        }

        public final InputStream getInputStream() {
            return this.f17571a.getInputStream();
        }

        public final boolean getKeepAlive() {
            return this.f17571a.getKeepAlive();
        }

        public final InetAddress getLocalAddress() {
            return this.f17571a.getLocalAddress();
        }

        public final int getLocalPort() {
            return this.f17571a.getLocalPort();
        }

        public final SocketAddress getLocalSocketAddress() {
            return this.f17571a.getLocalSocketAddress();
        }

        public final boolean getNeedClientAuth() {
            return this.f17571a.getNeedClientAuth();
        }

        public final boolean getOOBInline() {
            return this.f17571a.getOOBInline();
        }

        public final OutputStream getOutputStream() {
            return this.f17571a.getOutputStream();
        }

        public final int getPort() {
            return this.f17571a.getPort();
        }

        public final synchronized int getReceiveBufferSize() {
            return this.f17571a.getReceiveBufferSize();
        }

        public final SocketAddress getRemoteSocketAddress() {
            return this.f17571a.getRemoteSocketAddress();
        }

        public final boolean getReuseAddress() {
            return this.f17571a.getReuseAddress();
        }

        public final synchronized int getSendBufferSize() {
            return this.f17571a.getSendBufferSize();
        }

        public final SSLSession getSession() {
            return this.f17571a.getSession();
        }

        public final int getSoLinger() {
            return this.f17571a.getSoLinger();
        }

        public final synchronized int getSoTimeout() {
            return this.f17571a.getSoTimeout();
        }

        public final String[] getSupportedCipherSuites() {
            return this.f17571a.getSupportedCipherSuites();
        }

        public final String[] getSupportedProtocols() {
            return this.f17571a.getSupportedProtocols();
        }

        public final boolean getTcpNoDelay() {
            return this.f17571a.getTcpNoDelay();
        }

        public final int getTrafficClass() {
            return this.f17571a.getTrafficClass();
        }

        public final boolean getUseClientMode() {
            return this.f17571a.getUseClientMode();
        }

        public final boolean getWantClientAuth() {
            return this.f17571a.getWantClientAuth();
        }

        public final boolean isBound() {
            return this.f17571a.isBound();
        }

        public final boolean isClosed() {
            return this.f17571a.isClosed();
        }

        public final boolean isConnected() {
            return this.f17571a.isConnected();
        }

        public final boolean isInputShutdown() {
            return this.f17571a.isInputShutdown();
        }

        public final boolean isOutputShutdown() {
            return this.f17571a.isOutputShutdown();
        }

        public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.f17571a.removeHandshakeCompletedListener(handshakeCompletedListener);
        }

        public final void sendUrgentData(int i) {
            this.f17571a.sendUrgentData(i);
        }

        public final void setEnableSessionCreation(boolean z) {
            this.f17571a.setEnableSessionCreation(z);
        }

        public final void setEnabledCipherSuites(String[] strArr) {
            this.f17571a.setEnabledCipherSuites(strArr);
        }

        public final void setKeepAlive(boolean z) {
            this.f17571a.setKeepAlive(z);
        }

        public final void setNeedClientAuth(boolean z) {
            this.f17571a.setNeedClientAuth(z);
        }

        public final void setOOBInline(boolean z) {
            this.f17571a.setOOBInline(z);
        }

        public final void setPerformancePreferences(int i, int i2, int i3) {
            this.f17571a.setPerformancePreferences(i, i2, i3);
        }

        public final synchronized void setReceiveBufferSize(int i) {
            this.f17571a.setReceiveBufferSize(i);
        }

        public final void setReuseAddress(boolean z) {
            this.f17571a.setReuseAddress(z);
        }

        public final synchronized void setSendBufferSize(int i) {
            this.f17571a.setSendBufferSize(i);
        }

        public final void setSoLinger(boolean z, int i) {
            this.f17571a.setSoLinger(z, i);
        }

        public final synchronized void setSoTimeout(int i) {
            this.f17571a.setSoTimeout(i);
        }

        public final void setTcpNoDelay(boolean z) {
            this.f17571a.setTcpNoDelay(z);
        }

        public final void setTrafficClass(int i) {
            this.f17571a.setTrafficClass(i);
        }

        public final void setUseClientMode(boolean z) {
            this.f17571a.setUseClientMode(z);
        }

        public final void setWantClientAuth(boolean z) {
            this.f17571a.setWantClientAuth(z);
        }

        public final void shutdownInput() {
            this.f17571a.shutdownInput();
        }

        public final void shutdownOutput() {
            this.f17571a.shutdownOutput();
        }

        public final void startHandshake() {
            this.f17571a.startHandshake();
        }

        public final String toString() {
            return this.f17571a.toString();
        }
    }

    public static class b extends a {
        public b(SSLSocket sSLSocket) {
            super(sSLSocket);
        }

        public final void setEnabledProtocols(String[] strArr) {
            String str;
            PrintStream printStream;
            if (strArr != null && strArr.length == 1 && "SSLv3".equals(strArr[0])) {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.f17571a.getEnabledProtocols()));
                if (arrayList.size() > 1) {
                    arrayList.remove("SSLv3");
                    printStream = System.out;
                    str = "Removed SSLv3 from enabled protocols";
                } else {
                    printStream = System.out;
                    str = "SSL stuck with protocol available for " + arrayList;
                }
                printStream.println(str);
                strArr = (String[]) arrayList.toArray(new String[0]);
            }
            this.f17571a.setEnabledProtocols(strArr);
        }
    }

    public t(SSLSocketFactory sSLSocketFactory) {
        this.f17570a = sSLSocketFactory;
    }

    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f17570a.createSocket(str, i);
        return createSocket instanceof SSLSocket ? new b((SSLSocket) createSocket) : createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f17570a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f17570a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f17570a.createSocket(str, i, inetAddress, i2);
        return createSocket instanceof SSLSocket ? new b((SSLSocket) createSocket) : createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f17570a.createSocket(inetAddress, i);
        return createSocket instanceof SSLSocket ? new b((SSLSocket) createSocket) : createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f17570a.createSocket(inetAddress, i, inetAddress2, i2);
        return createSocket instanceof SSLSocket ? new b((SSLSocket) createSocket) : createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f17570a.createSocket(socket, str, i, z);
        return createSocket instanceof SSLSocket ? new b((SSLSocket) createSocket) : createSocket;
    }
}
