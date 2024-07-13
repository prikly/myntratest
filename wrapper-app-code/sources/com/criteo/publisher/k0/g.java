package com.criteo.publisher.k0;

import com.criteo.publisher.f0.t;
import com.criteo.publisher.logging.RemoteLogRecords;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.model.o;
import com.criteo.publisher.model.r;
import com.criteo.publisher.model.w;
import com.criteo.publisher.model.y;
import com.criteo.publisher.n0.l;
import com.criteo.publisher.n0.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PubSdkApi */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final com.criteo.publisher.logging.g f2588a = h.b(getClass());

    /* renamed from: b  reason: collision with root package name */
    private final com.criteo.publisher.n0.g f2589b;

    /* renamed from: c  reason: collision with root package name */
    private final l f2590c;

    public g(com.criteo.publisher.n0.g gVar, l lVar) {
        this.f2589b = gVar;
        this.f2590c = lVar;
    }

    public y a(w wVar) throws IOException {
        HttpURLConnection a2 = a(new URL(this.f2589b.c() + "/config/app"), (String) null, "POST");
        a(a2, (Object) wVar);
        InputStream a3 = a(a2);
        try {
            y yVar = (y) this.f2590c.a(y.class, a3);
            if (a3 != null) {
                a3.close();
            }
            return yVar;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public r a(o oVar, String str) throws Exception {
        HttpURLConnection a2 = a(new URL(this.f2589b.c() + "/inapp/v2"), str, "POST");
        a2.setDoOutput(true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.f2590c.a((Object) oVar, (OutputStream) byteArrayOutputStream);
            this.f2588a.a(f.b(byteArrayOutputStream.toString("UTF-8")));
            a2.getOutputStream().write(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.close();
            InputStream a3 = a(a2);
            try {
                String a4 = com.criteo.publisher.n0.r.a(a3);
                this.f2588a.a(f.a(a4));
                r a5 = r.a(a(a4));
                if (a3 != null) {
                    a3.close();
                }
                return a5;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public JSONObject a(int i, String str, String str2, String str3, int i2, String str4, String str5) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put("appId", str);
        if (str2 != null) {
            hashMap.put("gaid", str2);
        }
        hashMap.put("eventType", str3);
        hashMap.put("limitedAdTracking", String.valueOf(i2));
        if (str5 != null) {
            hashMap.put("gdpr_consent", str5);
        }
        InputStream a2 = a(new URL(this.f2589b.j() + ("/appevent/v1/" + i + "?" + a((Map<String, String>) hashMap))), str4);
        try {
            JSONObject a3 = a(a2);
            if (a2 != null) {
                a2.close();
            }
            return a3;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public InputStream a(URL url) throws IOException {
        return a(url, (String) null);
    }

    public void a(t tVar) throws IOException {
        a("/csm", (Object) tVar);
    }

    public void a(List<RemoteLogRecords> list) throws IOException {
        a("/inapp/logs", (Object) list);
    }

    private void a(String str, Object obj) throws IOException {
        HttpURLConnection a2 = a(new URL(this.f2589b.c() + str), (String) null, "POST");
        a(a2, obj);
        a(a2).close();
    }

    public InputStream a(URL url, String str) throws IOException {
        return a(a(url, str, "GET"));
    }

    private HttpURLConnection a(URL url, String str, String str2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setReadTimeout(this.f2589b.n());
        httpURLConnection.setConnectTimeout(this.f2589b.n());
        httpURLConnection.setRequestProperty("Content-Type", "text/plain");
        if (!s.a((CharSequence) str)) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        return httpURLConnection;
    }

    private static InputStream a(HttpURLConnection httpURLConnection) throws IOException {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200 || responseCode == 204) {
            return httpURLConnection.getInputStream();
        }
        throw new d(responseCode);
    }

    private static JSONObject a(InputStream inputStream) throws IOException, JSONException {
        return a(com.criteo.publisher.n0.r.a(inputStream));
    }

    private static JSONObject a(String str) throws JSONException {
        if (s.a((CharSequence) str)) {
            return new JSONObject();
        }
        return new JSONObject(str);
    }

    private void a(HttpURLConnection httpURLConnection, Object obj) throws IOException {
        httpURLConnection.setDoOutput(true);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            this.f2590c.a(obj, outputStream);
            if (outputStream != null) {
                outputStream.close();
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private String a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry next : map.entrySet()) {
                sb.append(URLEncoder.encode((String) next.getKey(), Charset.forName("UTF-8").name()));
                sb.append("=");
                sb.append(URLEncoder.encode((String) next.getValue(), Charset.forName("UTF-8").name()));
                sb.append("&");
            }
        } catch (Exception e2) {
            this.f2588a.a("Impossible to encode params string", (Throwable) e2);
        }
        if (sb.length() > 0) {
            return sb.substring(0, sb.length() - 1);
        }
        return sb.toString();
    }
}
