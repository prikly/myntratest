package com.applovin.exoplayer2.k;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public final class ab extends e {

    /* renamed from: a  reason: collision with root package name */
    private final int f13332a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f13333b;

    /* renamed from: c  reason: collision with root package name */
    private final DatagramPacket f13334c;

    /* renamed from: d  reason: collision with root package name */
    private Uri f13335d;

    /* renamed from: e  reason: collision with root package name */
    private DatagramSocket f13336e;

    /* renamed from: f  reason: collision with root package name */
    private MulticastSocket f13337f;

    /* renamed from: g  reason: collision with root package name */
    private InetAddress f13338g;

    /* renamed from: h  reason: collision with root package name */
    private InetSocketAddress f13339h;
    private boolean i;
    private int j;

    public static final class a extends j {
        public a(Throwable th, int i) {
            super(th, i);
        }
    }

    public ab() {
        this(2000);
    }

    public ab(int i2) {
        this(i2, 8000);
    }

    public ab(int i2, int i3) {
        super(true);
        this.f13332a = i3;
        this.f13333b = new byte[i2];
        this.f13334c = new DatagramPacket(this.f13333b, 0, i2);
    }

    public int a(byte[] bArr, int i2, int i3) throws a {
        if (i3 == 0) {
            return 0;
        }
        if (this.j == 0) {
            try {
                this.f13336e.receive(this.f13334c);
                int length = this.f13334c.getLength();
                this.j = length;
                a(length);
            } catch (SocketTimeoutException e2) {
                throw new a(e2, 2002);
            } catch (IOException e3) {
                throw new a(e3, 2001);
            }
        }
        int length2 = this.f13334c.getLength();
        int i4 = this.j;
        int min = Math.min(i4, i3);
        System.arraycopy(this.f13333b, length2 - i4, bArr, i2, min);
        this.j -= min;
        return min;
    }

    public long a(l lVar) throws a {
        DatagramSocket datagramSocket;
        Uri uri = lVar.f13370a;
        this.f13335d = uri;
        String host = uri.getHost();
        int port = this.f13335d.getPort();
        b(lVar);
        try {
            this.f13338g = InetAddress.getByName(host);
            this.f13339h = new InetSocketAddress(this.f13338g, port);
            if (this.f13338g.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f13339h);
                this.f13337f = multicastSocket;
                multicastSocket.joinGroup(this.f13338g);
                datagramSocket = this.f13337f;
            } else {
                datagramSocket = new DatagramSocket(this.f13339h);
            }
            this.f13336e = datagramSocket;
            this.f13336e.setSoTimeout(this.f13332a);
            this.i = true;
            c(lVar);
            return -1;
        } catch (SecurityException e2) {
            throw new a(e2, 2006);
        } catch (IOException e3) {
            throw new a(e3, 2001);
        }
    }

    public Uri a() {
        return this.f13335d;
    }

    public void c() {
        this.f13335d = null;
        MulticastSocket multicastSocket = this.f13337f;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f13338g);
            } catch (IOException unused) {
            }
            this.f13337f = null;
        }
        DatagramSocket datagramSocket = this.f13336e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f13336e = null;
        }
        this.f13338g = null;
        this.f13339h = null;
        this.j = 0;
        if (this.i) {
            this.i = false;
            d();
        }
    }
}
