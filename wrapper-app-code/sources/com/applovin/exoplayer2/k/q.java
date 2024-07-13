package com.applovin.exoplayer2.k;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.exoplayer2.k.t;
import com.applovin.exoplayer2.l.ai;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public class q extends e implements t {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f13421b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13422c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13423d;

    /* renamed from: e  reason: collision with root package name */
    private final String f13424e;

    /* renamed from: f  reason: collision with root package name */
    private final t.f f13425f;

    /* renamed from: g  reason: collision with root package name */
    private final t.f f13426g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f13427h;
    private Predicate<String> i;
    private l j;
    private HttpURLConnection k;
    private InputStream l;
    private boolean m;
    private int n;
    private long o;
    private long p;

    public static final class a implements t.b {

        /* renamed from: a  reason: collision with root package name */
        private final t.f f13428a = new t.f();

        /* renamed from: b  reason: collision with root package name */
        private aa f13429b;

        /* renamed from: c  reason: collision with root package name */
        private Predicate<String> f13430c;

        /* renamed from: d  reason: collision with root package name */
        private String f13431d;

        /* renamed from: e  reason: collision with root package name */
        private int f13432e = 8000;

        /* renamed from: f  reason: collision with root package name */
        private int f13433f = 8000;

        /* renamed from: g  reason: collision with root package name */
        private boolean f13434g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f13435h;

        public a a(String str) {
            this.f13431d = str;
            return this;
        }

        /* renamed from: b */
        public q c() {
            q qVar = new q(this.f13431d, this.f13432e, this.f13433f, this.f13434g, this.f13428a, this.f13430c, this.f13435h);
            aa aaVar = this.f13429b;
            if (aaVar != null) {
                qVar.a(aaVar);
            }
            return qVar;
        }
    }

    @Deprecated
    public q() {
        this((String) null, 8000, 8000);
    }

    @Deprecated
    public q(String str, int i2, int i3) {
        this(str, i2, i3, false, (t.f) null);
    }

    @Deprecated
    public q(String str, int i2, int i3, boolean z, t.f fVar) {
        this(str, i2, i3, z, fVar, (Predicate<String>) null, false);
    }

    private q(String str, int i2, int i3, boolean z, t.f fVar, Predicate<String> predicate, boolean z2) {
        super(true);
        this.f13424e = str;
        this.f13422c = i2;
        this.f13423d = i3;
        this.f13421b = z;
        this.f13425f = fVar;
        this.i = predicate;
        this.f13426g = new t.f();
        this.f13427h = z2;
    }

    private HttpURLConnection a(URL url, int i2, byte[] bArr, long j2, long j3, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection a2 = a(url);
        a2.setConnectTimeout(this.f13422c);
        a2.setReadTimeout(this.f13423d);
        HashMap hashMap = new HashMap();
        t.f fVar = this.f13425f;
        if (fVar != null) {
            hashMap.putAll(fVar.a());
        }
        hashMap.putAll(this.f13426g.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            a2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a3 = u.a(j2, j3);
        if (a3 != null) {
            a2.setRequestProperty("Range", a3);
        }
        String str = this.f13424e;
        if (str != null) {
            a2.setRequestProperty("User-Agent", str);
        }
        a2.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        a2.setInstanceFollowRedirects(z2);
        a2.setDoOutput(bArr != null);
        a2.setRequestMethod(l.a(i2));
        if (bArr != null) {
            a2.setFixedLengthStreamingMode(bArr.length);
            a2.connect();
            OutputStream outputStream = a2.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            a2.connect();
        }
        return a2;
    }

    private URL a(URL url, String str, l lVar) throws t.c {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new t.c("Unsupported protocol redirect: " + protocol, lVar, 2001, 1);
                } else if (this.f13421b || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    throw new t.c("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", lVar, 2001, 1);
                }
            } catch (MalformedURLException e2) {
                throw new t.c((IOException) e2, lVar, 2001, 1);
            }
        } else {
            throw new t.c("Null location redirect", lVar, 2001, 1);
        }
    }

    private void a(long j2, l lVar) throws IOException {
        if (j2 != 0) {
            byte[] bArr = new byte[4096];
            while (j2 > 0) {
                int read = ((InputStream) ai.a(this.l)).read(bArr, 0, (int) Math.min(j2, (long) 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new t.c((IOException) new InterruptedIOException(), lVar, 2000, 1);
                } else if (read != -1) {
                    j2 -= (long) read;
                    a(read);
                } else {
                    throw new t.c(lVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
                }
            }
        }
    }

    private static void a(HttpURLConnection httpURLConnection, long j2) {
        if (httpURLConnection != null && ai.f13525a >= 19 && ai.f13525a <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j2 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j2 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = ((Class) com.applovin.exoplayer2.l.a.b(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    private static boolean a(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private int b(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.o;
        if (j2 != -1) {
            long j3 = j2 - this.p;
            if (j3 == 0) {
                return -1;
            }
            i3 = (int) Math.min((long) i3, j3);
        }
        int read = ((InputStream) ai.a(this.l)).read(bArr, i2, i3);
        if (read == -1) {
            return -1;
        }
        this.p += (long) read;
        a(read);
        return read;
    }

    private HttpURLConnection d(l lVar) throws IOException {
        HttpURLConnection a2;
        l lVar2 = lVar;
        URL url = new URL(lVar2.f13370a.toString());
        int i2 = lVar2.f13372c;
        byte[] bArr = lVar2.f13373d;
        long j2 = lVar2.f13376g;
        long j3 = lVar2.f13377h;
        boolean b2 = lVar2.b(1);
        if (!this.f13421b && !this.f13427h) {
            return a(url, i2, bArr, j2, j3, b2, true, lVar2.f13374e);
        }
        URL url2 = url;
        int i3 = i2;
        byte[] bArr2 = bArr;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (i4 <= 20) {
                long j4 = j2;
                int i6 = i3;
                long j5 = j2;
                int i7 = i5;
                URL url3 = url2;
                long j6 = j3;
                a2 = a(url2, i3, bArr2, j4, j3, b2, false, lVar2.f13374e);
                int responseCode = a2.getResponseCode();
                String headerField = a2.getHeaderField(LogConstants.EVENT_LOCATION);
                if ((i6 == 1 || i6 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    a2.disconnect();
                    url2 = a(url3, headerField, lVar2);
                    i3 = i6;
                } else if (i6 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return a2;
                } else {
                    a2.disconnect();
                    if (!(this.f13427h && responseCode == 302)) {
                        bArr2 = null;
                        i3 = 1;
                    } else {
                        i3 = i6;
                    }
                    url2 = a(url3, headerField, lVar2);
                }
                i4 = i7;
                j2 = j5;
                j3 = j6;
            } else {
                throw new t.c((IOException) new NoRouteToHostException("Too many redirects: " + i5), lVar2, 2001, 1);
            }
        }
        return a2;
    }

    private void e() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                com.applovin.exoplayer2.l.q.c("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.k = null;
        }
    }

    public int a(byte[] bArr, int i2, int i3) throws t.c {
        try {
            return b(bArr, i2, i3);
        } catch (IOException e2) {
            throw t.c.a(e2, (l) ai.a(this.j), 2);
        }
    }

    public long a(l lVar) throws t.c {
        byte[] bArr;
        this.j = lVar;
        long j2 = 0;
        this.p = 0;
        this.o = 0;
        b(lVar);
        try {
            HttpURLConnection d2 = d(lVar);
            this.k = d2;
            this.n = d2.getResponseCode();
            String responseMessage = d2.getResponseMessage();
            int i2 = this.n;
            long j3 = -1;
            if (i2 < 200 || i2 > 299) {
                Map headerFields = d2.getHeaderFields();
                if (this.n == 416) {
                    if (lVar.f13376g == u.a(d2.getHeaderField("Content-Range"))) {
                        this.m = true;
                        c(lVar);
                        if (lVar.f13377h != -1) {
                            return lVar.f13377h;
                        }
                        return 0;
                    }
                }
                InputStream errorStream = d2.getErrorStream();
                if (errorStream != null) {
                    try {
                        bArr = ai.a(errorStream);
                    } catch (IOException unused) {
                        bArr = ai.f13530f;
                    }
                } else {
                    bArr = ai.f13530f;
                }
                byte[] bArr2 = bArr;
                e();
                throw new t.e(this.n, responseMessage, this.n == 416 ? new j(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, lVar, bArr2);
            }
            String contentType = d2.getContentType();
            Predicate<String> predicate = this.i;
            if (predicate == null || predicate.apply(contentType)) {
                if (this.n == 200 && lVar.f13376g != 0) {
                    j2 = lVar.f13376g;
                }
                boolean a2 = a(d2);
                if (a2 || lVar.f13377h != -1) {
                    this.o = lVar.f13377h;
                } else {
                    long a3 = u.a(d2.getHeaderField("Content-Length"), d2.getHeaderField("Content-Range"));
                    if (a3 != -1) {
                        j3 = a3 - j2;
                    }
                    this.o = j3;
                }
                try {
                    this.l = d2.getInputStream();
                    if (a2) {
                        this.l = new GZIPInputStream(this.l);
                    }
                    this.m = true;
                    c(lVar);
                    try {
                        a(j2, lVar);
                        return this.o;
                    } catch (IOException e2) {
                        e();
                        if (e2 instanceof t.c) {
                            throw ((t.c) e2);
                        }
                        throw new t.c(e2, lVar, 2000, 1);
                    }
                } catch (IOException e3) {
                    e();
                    throw new t.c(e3, lVar, 2000, 1);
                }
            } else {
                e();
                throw new t.d(contentType, lVar);
            }
        } catch (IOException e4) {
            e();
            throw t.c.a(e4, lVar, 1);
        }
    }

    public Uri a() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    public Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.k;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    public void c() throws t.c {
        try {
            InputStream inputStream = this.l;
            if (inputStream != null) {
                long j2 = -1;
                if (this.o != -1) {
                    j2 = this.o - this.p;
                }
                a(this.k, j2);
                inputStream.close();
            }
            this.l = null;
            e();
            if (this.m) {
                this.m = false;
                d();
            }
        } catch (IOException e2) {
            throw new t.c(e2, (l) ai.a(this.j), 2000, 3);
        } catch (Throwable th) {
            this.l = null;
            e();
            if (this.m) {
                this.m = false;
                d();
            }
            throw th;
        }
    }
}
