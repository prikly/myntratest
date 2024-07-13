package com.bytedance.sdk.component.b.a.a.a;

import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.b;
import com.bytedance.sdk.component.b.a.c;
import com.bytedance.sdk.component.b.a.d;
import com.bytedance.sdk.component.b.a.g;
import com.bytedance.sdk.component.b.a.k;
import com.bytedance.sdk.component.b.a.m;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: NetCall */
public class a implements b {

    /* renamed from: c  reason: collision with root package name */
    private static AtomicBoolean f18843c = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    k f18844a;

    /* renamed from: b  reason: collision with root package name */
    d f18845b;

    a(k kVar, d dVar) {
        this.f18844a = kVar;
        this.f18845b = dVar;
    }

    public m a() throws IOException {
        this.f18845b.c().remove(this);
        this.f18845b.d().add(this);
        if (this.f18845b.c().size() + this.f18845b.d().size() > this.f18845b.a() || f18843c.get()) {
            this.f18845b.d().remove(this);
            return null;
        } else if (this.f18844a.f18929a == null || this.f18844a.f18929a.f18909a == null || this.f18844a.f18929a.f18909a.size() <= 0) {
            return a(this.f18844a);
        } else {
            ArrayList arrayList = new ArrayList(this.f18844a.f18929a.f18909a);
            arrayList.add(new g() {
                public m a(g.a aVar) throws IOException {
                    return a.this.a(aVar.a());
                }
            });
            return ((g) arrayList.get(0)).a(new b(arrayList, this.f18844a));
        }
    }

    public m a(k kVar) throws IOException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(kVar.b().a().toString()).openConnection();
            if (kVar.d() != null && kVar.d().size() > 0) {
                for (Map.Entry next : kVar.d().entrySet()) {
                    for (String addRequestProperty : (List) next.getValue()) {
                        httpURLConnection.addRequestProperty((String) next.getKey(), addRequestProperty);
                    }
                }
            }
            if (kVar.f() == null) {
                httpURLConnection.setRequestMethod("GET");
            } else {
                if (!c() && kVar.f().f18937a != null && !TextUtils.isEmpty(kVar.f().f18937a.a())) {
                    httpURLConnection.addRequestProperty("Content-Type", kVar.f().f18937a.a());
                }
                httpURLConnection.setRequestMethod(kVar.c());
                if ("POST".equalsIgnoreCase(kVar.c())) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(kVar.f().f18938b.getBytes());
                    outputStream.flush();
                    outputStream.close();
                }
            }
            if (kVar.f18929a != null) {
                if (kVar.f18929a.f18911c != null) {
                    httpURLConnection.setConnectTimeout((int) kVar.f18929a.f18911c.toMillis(kVar.f18929a.f18910b));
                }
                if (kVar.f18929a.f18911c != null) {
                    httpURLConnection.setReadTimeout((int) kVar.f18929a.f18913e.toMillis(kVar.f18929a.f18912d));
                }
            }
            httpURLConnection.connect();
            if (f18843c.get()) {
                httpURLConnection.disconnect();
                this.f18845b.d().remove(this);
                return null;
            }
            f fVar = new f(httpURLConnection, kVar);
            this.f18845b.d().remove(this);
            return fVar;
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.f18845b.d().remove(this);
            throw th;
        }
    }

    private boolean c() {
        if (this.f18844a.d() == null) {
            return false;
        }
        return this.f18844a.d().containsKey("Content-Type");
    }

    public void a(final c cVar) {
        this.f18845b.b().submit(new Runnable() {
            public void run() {
                try {
                    m a2 = a.this.a();
                    if (a2 == null) {
                        cVar.a((b) a.this, new IOException("response is null"));
                    } else {
                        cVar.a((b) a.this, a2);
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                    cVar.a((b) a.this, e2);
                }
            }
        });
    }

    /* renamed from: b */
    public b clone() {
        return new a(this.f18844a, this.f18845b);
    }
}
