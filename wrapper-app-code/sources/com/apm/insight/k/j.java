package com.apm.insight.k;

import com.apm.insight.h;
import com.apm.insight.l.i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private final String f10716a = ("AAA" + System.currentTimeMillis() + "AAA");

    /* renamed from: b  reason: collision with root package name */
    private HttpURLConnection f10717b;

    /* renamed from: c  reason: collision with root package name */
    private String f10718c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10719d;

    /* renamed from: e  reason: collision with root package name */
    private f f10720e;

    /* renamed from: f  reason: collision with root package name */
    private m f10721f;

    public j(String str, String str2, boolean z) {
        this.f10718c = str2;
        this.f10719d = z;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f10717b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f10717b.setDoOutput(true);
        this.f10717b.setDoInput(true);
        this.f10717b.setRequestMethod("POST");
        HttpURLConnection httpURLConnection2 = this.f10717b;
        httpURLConnection2.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + this.f10716a);
        if (z) {
            this.f10717b.setRequestProperty("Content-Encoding", "gzip");
            this.f10721f = new m(this.f10717b.getOutputStream());
            return;
        }
        this.f10720e = new f(this.f10717b.getOutputStream());
    }

    public String a() {
        ArrayList<String> arrayList = new ArrayList<>();
        byte[] bytes = ("\r\n--" + this.f10716a + "--" + "\r\n").getBytes();
        if (this.f10719d) {
            this.f10721f.write(bytes);
            this.f10721f.b();
            this.f10721f.a();
        } else {
            this.f10720e.write(bytes);
            this.f10720e.flush();
            this.f10720e.a();
        }
        int responseCode = this.f10717b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f10717b.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f10717b.disconnect();
            StringBuilder sb = new StringBuilder();
            for (String append : arrayList) {
                sb.append(append);
            }
            return sb.toString();
        }
        throw new IOException("Server returned non-OK status: " + responseCode);
    }

    public void a(String str, File file, Map<String, String> map) {
        String name = file.getName();
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f10716a);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Map.Entry next : map.entrySet()) {
            sb.append("; ");
            sb.append((String) next.getKey());
            sb.append("=\"");
            sb.append((String) next.getValue());
            sb.append("\"");
        }
        sb.append("\r\n");
        sb.append("Content-Transfer-Encoding: binary");
        sb.append("\r\n");
        sb.append("\r\n");
        if (this.f10719d) {
            this.f10721f.write(sb.toString().getBytes());
        } else {
            this.f10720e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f10719d) {
                this.f10721f.write(bArr, 0, read);
            } else {
                this.f10720e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f10719d) {
            this.f10721f.write("\r\n".getBytes());
            return;
        }
        this.f10720e.write("\r\n".getBytes());
        this.f10720e.flush();
    }

    public void a(String str, String str2) {
        a(str, str2, false);
    }

    public void a(String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f10716a);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"");
        sb.append("\r\n");
        sb.append("Content-Type: text/plain; charset=");
        sb.append(this.f10718c);
        sb.append("\r\n");
        sb.append("\r\n");
        try {
            if (this.f10719d) {
                this.f10721f.write(sb.toString().getBytes());
            } else {
                this.f10720e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        if (z) {
            bytes = h.i().getEncryptImpl().a(bytes);
        }
        try {
            if (this.f10719d) {
                this.f10721f.write(bytes);
                this.f10721f.write("\r\n".getBytes());
                return;
            }
            this.f10720e.write(bytes);
            this.f10720e.write("\r\n".getBytes());
        } catch (IOException unused2) {
        }
    }

    public void a(String str, File... fileArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f10716a);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(str);
        sb.append("\"");
        sb.append("\r\n");
        sb.append("Content-Transfer-Encoding: binary");
        sb.append("\r\n");
        sb.append("\r\n");
        if (this.f10719d) {
            this.f10721f.write(sb.toString().getBytes());
        } else {
            this.f10720e.write(sb.toString().getBytes());
        }
        i.a(this.f10719d ? this.f10721f : this.f10720e, fileArr);
        if (this.f10719d) {
            this.f10721f.write("\r\n".getBytes());
            return;
        }
        this.f10720e.write("\r\n".getBytes());
        this.f10720e.flush();
    }
}
