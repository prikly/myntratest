package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.e0;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;

class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private HttpURLConnection f10270a;

    /* renamed from: b  reason: collision with root package name */
    private InputStream f10271b;

    /* renamed from: c  reason: collision with root package name */
    private h0 f10272c;

    /* renamed from: d  reason: collision with root package name */
    private a f10273d;

    /* renamed from: e  reason: collision with root package name */
    private g f10274e = null;

    /* renamed from: f  reason: collision with root package name */
    private String f10275f;

    /* renamed from: g  reason: collision with root package name */
    private int f10276g = 0;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10277h = false;
    private Map<String, List<String>> i;
    private String j = "";
    private String k = "";
    String l = "";
    String m = "";
    boolean n;
    int o;
    int p;

    interface a {
        void a(s sVar, h0 h0Var, Map<String, List<String>> map);
    }

    s(h0 h0Var, a aVar) {
        this.f10272c = h0Var;
        this.f10273d = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        r1 = "UTF-8";
        r2 = r7.f10275f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r2 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (r2.isEmpty() != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        r1 = r7.f10275f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if ((r9 instanceof java.io.ByteArrayOutputStream) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r2 = r7.f10270a.getHeaderField("Content-Type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r7.f10274e == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r2 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r2.contains("application/octet-stream") == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        if (((java.io.ByteArrayOutputStream) r9).size() == 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        r7.m = r7.f10274e.b(((java.io.ByteArrayOutputStream) r9).toByteArray());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        r7.m = ((java.io.ByteArrayOutputStream) r9).toString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        if (r9 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ac, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.io.InputStream r8, java.io.OutputStream r9) throws java.lang.Exception {
        /*
            r7 = this;
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00ba }
            r0.<init>(r8)     // Catch:{ all -> 0x00ba }
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x00b0 }
        L_0x0009:
            r3 = 0
            int r4 = r0.read(r2, r3, r1)     // Catch:{ all -> 0x00b0 }
            r5 = -1
            if (r4 == r5) goto L_0x0058
            int r5 = r7.o     // Catch:{ all -> 0x00b0 }
            int r5 = r5 + r4
            r7.o = r5     // Catch:{ all -> 0x00b0 }
            boolean r6 = r7.f10277h     // Catch:{ all -> 0x00b0 }
            if (r6 == 0) goto L_0x0054
            int r6 = r7.f10276g     // Catch:{ all -> 0x00b0 }
            if (r5 > r6) goto L_0x001f
            goto L_0x0054
        L_0x001f:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r2.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "Data exceeds expected maximum ("
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            int r3 = r7.o     // Catch:{ all -> 0x00b0 }
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            int r3 = r7.f10276g     // Catch:{ all -> 0x00b0 }
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "): "
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            java.net.HttpURLConnection r3 = r7.f10270a     // Catch:{ all -> 0x00b0 }
            java.net.URL r3 = r3.getURL()     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00b0 }
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b0 }
            r1.<init>(r2)     // Catch:{ all -> 0x00b0 }
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x0054:
            r9.write(r2, r3, r4)     // Catch:{ all -> 0x00b0 }
            goto L_0x0009
        L_0x0058:
            java.lang.String r1 = "UTF-8"
            java.lang.String r2 = r7.f10275f     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0066
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00b0 }
            if (r2 != 0) goto L_0x0066
            java.lang.String r1 = r7.f10275f     // Catch:{ all -> 0x00b0 }
        L_0x0066:
            boolean r2 = r9 instanceof java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x00a2
            java.net.HttpURLConnection r2 = r7.f10270a     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r2 = r2.getHeaderField(r3)     // Catch:{ all -> 0x00b0 }
            com.adcolony.sdk.g r3 = r7.f10274e     // Catch:{ all -> 0x00b0 }
            if (r3 == 0) goto L_0x0099
            if (r2 == 0) goto L_0x0099
            java.lang.String r3 = "application/octet-stream"
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0099
            r2 = r9
            java.io.ByteArrayOutputStream r2 = (java.io.ByteArrayOutputStream) r2     // Catch:{ all -> 0x00b0 }
            int r2 = r2.size()     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0099
            com.adcolony.sdk.g r1 = r7.f10274e     // Catch:{ all -> 0x00b0 }
            r2 = r9
            java.io.ByteArrayOutputStream r2 = (java.io.ByteArrayOutputStream) r2     // Catch:{ all -> 0x00b0 }
            byte[] r2 = r2.toByteArray()     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = r1.b(r2)     // Catch:{ all -> 0x00b0 }
            r7.m = r1     // Catch:{ all -> 0x00b0 }
            goto L_0x00a2
        L_0x0099:
            r2 = r9
            java.io.ByteArrayOutputStream r2 = (java.io.ByteArrayOutputStream) r2     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = r2.toString(r1)     // Catch:{ all -> 0x00b0 }
            r7.m = r1     // Catch:{ all -> 0x00b0 }
        L_0x00a2:
            r0.close()     // Catch:{ all -> 0x00ba }
            if (r9 == 0) goto L_0x00aa
            r9.close()
        L_0x00aa:
            if (r8 == 0) goto L_0x00af
            r8.close()
        L_0x00af:
            return
        L_0x00b0:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00b5 }
            goto L_0x00b9
        L_0x00b5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ba }
        L_0x00b9:
            throw r1     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            if (r9 == 0) goto L_0x00c0
            r9.close()
        L_0x00c0:
            if (r8 == 0) goto L_0x00c5
            r8.close()
        L_0x00c5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.s.a(java.io.InputStream, java.io.OutputStream):void");
    }

    private boolean c() throws IOException {
        f1 a2 = this.f10272c.a();
        String h2 = c0.h(a2, "content_type");
        String h3 = c0.h(a2, AppLovinEventTypes.USER_VIEWED_CONTENT);
        f1 n2 = a2.n("dictionaries");
        f1 n3 = a2.n("dictionaries_mapping");
        this.l = c0.h(a2, "url");
        if (n2 != null) {
            g.a(n2.f());
        }
        if (a.b().H() && n3 != null) {
            this.f10274e = g.a(c0.i(n3, "request"), c0.i(n3, "response"));
        }
        String h4 = c0.h(a2, "user_agent");
        int a3 = c0.a(a2, "read_timeout", 60000);
        int a4 = c0.a(a2, "connect_timeout", 60000);
        boolean b2 = c0.b(a2, "no_redirect");
        this.l = c0.h(a2, "url");
        this.j = c0.h(a2, "filepath");
        StringBuilder sb = new StringBuilder();
        sb.append(a.b().z().d());
        String str = this.j;
        sb.append(str.substring(str.lastIndexOf("/") + 1));
        this.k = sb.toString();
        this.f10275f = c0.h(a2, "encoding");
        int a5 = c0.a(a2, "max_size", 0);
        this.f10276g = a5;
        this.f10277h = a5 != 0;
        this.o = 0;
        this.f10271b = null;
        this.f10270a = null;
        this.i = null;
        if (!this.l.startsWith("file://")) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.l).openConnection();
            this.f10270a = httpURLConnection;
            httpURLConnection.setReadTimeout(a3);
            this.f10270a.setConnectTimeout(a4);
            this.f10270a.setInstanceFollowRedirects(!b2);
            if (h4 != null && !h4.equals("")) {
                this.f10270a.setRequestProperty("User-Agent", h4);
            }
            if (this.f10274e != null) {
                this.f10270a.setRequestProperty("Content-Type", "application/octet-stream");
                this.f10270a.setRequestProperty("Req-Dict-Id", this.f10274e.b());
                this.f10270a.setRequestProperty("Resp-Dict-Id", this.f10274e.c());
            } else {
                this.f10270a.setRequestProperty("Accept-Charset", h.f10089a.name());
                if (!h2.equals("")) {
                    this.f10270a.setRequestProperty("Content-Type", h2);
                }
            }
            if (this.f10272c.b().equals("WebServices.post")) {
                this.f10270a.setDoOutput(true);
                g gVar = this.f10274e;
                if (gVar != null) {
                    byte[] a6 = gVar.a(h3);
                    this.f10270a.setFixedLengthStreamingMode(a6.length);
                    this.f10270a.getOutputStream().write(a6);
                    this.f10270a.getOutputStream().flush();
                } else {
                    this.f10270a.setFixedLengthStreamingMode(h3.getBytes(h.f10089a).length);
                    new PrintStream(this.f10270a.getOutputStream()).print(h3);
                }
            }
        } else if (this.l.startsWith("file:///android_asset/")) {
            Context a7 = a.a();
            if (a7 != null) {
                this.f10271b = a7.getAssets().open(this.l.substring(22));
            }
        } else {
            this.f10271b = new FileInputStream(this.l.substring(7));
        }
        if (this.f10270a == null && this.f10271b == null) {
            return false;
        }
        return true;
    }

    private void d() throws Exception {
        OutputStream outputStream;
        InputStream inputStream;
        String b2 = this.f10272c.b();
        if (this.f10271b != null) {
            outputStream = this.j.length() == 0 ? new ByteArrayOutputStream(4096) : new FileOutputStream(new File(this.j).getAbsolutePath());
        } else if (b2.equals("WebServices.download")) {
            this.f10271b = this.f10270a.getInputStream();
            outputStream = new FileOutputStream(this.k);
        } else if (b2.equals("WebServices.get")) {
            this.f10271b = this.f10270a.getInputStream();
            outputStream = new ByteArrayOutputStream(4096);
        } else if (b2.equals("WebServices.post")) {
            this.f10270a.connect();
            if (this.f10270a.getResponseCode() < 200 || this.f10270a.getResponseCode() > 299) {
                inputStream = this.f10270a.getErrorStream();
            } else {
                inputStream = this.f10270a.getInputStream();
            }
            this.f10271b = inputStream;
            outputStream = new ByteArrayOutputStream(4096);
        } else {
            outputStream = null;
        }
        HttpURLConnection httpURLConnection = this.f10270a;
        if (httpURLConnection != null) {
            this.p = httpURLConnection.getResponseCode();
            this.i = this.f10270a.getHeaderFields();
        }
        a(this.f10271b, outputStream);
    }

    /* access modifiers changed from: package-private */
    public h0 b() {
        return this.f10272c;
    }

    public void run() {
        boolean z;
        boolean z2 = false;
        this.n = false;
        try {
            if (c()) {
                d();
                if (this.f10272c.b().equals("WebServices.post")) {
                    if (this.p != 200) {
                        z = false;
                        this.n = z;
                    }
                }
                z = true;
                this.n = z;
            }
        } catch (MalformedURLException e2) {
            new e0.a().a("MalformedURLException: ").a(e2.toString()).a(e0.i);
            this.n = true;
        } catch (OutOfMemoryError unused) {
            e0.a a2 = new e0.a().a("Out of memory error - disabling AdColony. (").a(this.o).a("/").a(this.f10276g);
            a2.a("): " + this.l).a(e0.f10045h);
            a.b().b(true);
        } catch (IOException e3) {
            new e0.a().a("Download of ").a(this.l).a(" failed: ").a(e3.toString()).a(e0.f10044g);
            int i2 = this.p;
            if (i2 == 0) {
                i2 = 504;
            }
            this.p = i2;
        } catch (IllegalStateException e4) {
            new e0.a().a("okhttp error: ").a(e4.toString()).a(e0.f10045h);
            e4.printStackTrace();
        } catch (DataFormatException e5) {
            new e0.a().a("Exception, possibly trying to decompress plain response: ").a(e5.toString()).a(e0.i);
            e5.printStackTrace();
        } catch (IllegalArgumentException e6) {
            new e0.a().a("Exception, possibly response encoded with different dictionary: ").a(e6.toString()).a(e0.i);
            e6.printStackTrace();
        } catch (AssertionError e7) {
            new e0.a().a("okhttp error: ").a(e7.toString()).a(e0.f10045h);
            e7.printStackTrace();
        } catch (Exception e8) {
            new e0.a().a("Exception: ").a(e8.toString()).a(e0.f10045h);
            e8.printStackTrace();
        }
        z2 = true;
        if (z2) {
            if (this.f10272c.b().equals("WebServices.download")) {
                a(this.k, this.j);
            }
            this.f10273d.a(this, this.f10272c, this.i);
        }
    }

    private void a(String str, String str2) {
        try {
            String substring = str2.substring(0, str2.lastIndexOf("/") + 1);
            if (!str2.equals("") && !substring.equals(a.b().z().d()) && !new File(str).renameTo(new File(str2))) {
                new e0.a().a("Moving of ").a(str).a(" failed.").a(e0.f10044g);
            }
        } catch (Exception e2) {
            new e0.a().a("Exception: ").a(e2.toString()).a(e0.f10045h);
            e2.printStackTrace();
        }
    }
}
