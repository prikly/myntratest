package com.bytedance.sdk.component.e.b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.a;
import com.bytedance.sdk.component.b.a.c;
import com.bytedance.sdk.component.b.a.e;
import com.bytedance.sdk.component.b.a.f;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;
import com.bytedance.sdk.component.b.a.m;
import com.bytedance.sdk.component.e.d.d;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: GetExecutor */
public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19132a = new a.C0228a().a().b();

    /* renamed from: b  reason: collision with root package name */
    public static final a f19133b = new a.C0228a().b();

    /* renamed from: g  reason: collision with root package name */
    private a f19134g = f19132a;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, String> f19135h = new HashMap();

    public b(i iVar) {
        super(iVar);
    }

    public void a(String str, String str2) {
        if (str == null) {
            d.b("GetExecutor", "name cannot be null !!!");
        } else {
            this.f19135h.put(str, str2);
        }
    }

    public void a(final com.bytedance.sdk.component.e.a.a aVar) {
        try {
            k.a aVar2 = new k.a();
            f.a aVar3 = new f.a();
            Uri parse = Uri.parse(this.f19142f);
            aVar3.a(parse.getScheme());
            aVar3.b(parse.getHost());
            String encodedPath = parse.getEncodedPath();
            if (!TextUtils.isEmpty(encodedPath)) {
                if (encodedPath.startsWith("/")) {
                    encodedPath = encodedPath.substring(1);
                }
                aVar3.c(encodedPath);
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.size() > 0) {
                for (String next : queryParameterNames) {
                    this.f19135h.put(next, parse.getQueryParameter(next));
                }
            }
            for (Map.Entry next2 : this.f19135h.entrySet()) {
                aVar3.a(URLEncoder.encode((String) next2.getKey(), "UTF-8"), URLEncoder.encode((String) next2.getValue(), "UTF-8"));
            }
            a(aVar2);
            aVar2.a(this.f19134g);
            aVar2.a((Object) b());
            this.f19139c.a(aVar2.a(aVar3.b()).a().b()).a(new c() {
                public void a(com.bytedance.sdk.component.b.a.b bVar, IOException iOException) {
                    com.bytedance.sdk.component.e.a.a aVar = aVar;
                    if (aVar != null) {
                        aVar.a((c) b.this, iOException);
                    }
                }

                public void a(com.bytedance.sdk.component.b.a.b bVar, m mVar) throws IOException {
                    if (aVar != null) {
                        HashMap hashMap = new HashMap();
                        if (mVar != null) {
                            e g2 = mVar.g();
                            if (g2 != null) {
                                for (int i = 0; i < g2.a(); i++) {
                                    hashMap.put(g2.a(i), g2.b(i));
                                }
                            }
                            aVar.a((c) b.this, new com.bytedance.sdk.component.e.b(mVar.d(), mVar.c(), mVar.e(), hashMap, mVar.f().b(), mVar.b(), mVar.a()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            if (aVar != null) {
                aVar.a((c) this, new IOException(th.getMessage()));
            }
        }
    }

    public com.bytedance.sdk.component.e.b a() {
        try {
            k.a aVar = new k.a();
            f.a aVar2 = new f.a();
            Uri parse = Uri.parse(this.f19142f);
            aVar2.a(parse.getScheme());
            aVar2.b(parse.getHost());
            String encodedPath = parse.getEncodedPath();
            if (!TextUtils.isEmpty(encodedPath)) {
                if (encodedPath.startsWith("/")) {
                    encodedPath = encodedPath.substring(1);
                }
                aVar2.c(encodedPath);
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.size() > 0) {
                for (String next : queryParameterNames) {
                    this.f19135h.put(next, parse.getQueryParameter(next));
                }
            }
            for (Map.Entry next2 : this.f19135h.entrySet()) {
                aVar2.a(URLEncoder.encode((String) next2.getKey(), "UTF-8"), URLEncoder.encode((String) next2.getValue(), "UTF-8"));
            }
            a(aVar);
            aVar.a(this.f19134g);
            aVar.a((Object) b());
            m a2 = this.f19139c.a(aVar.a(aVar2.b()).a().b()).a();
            if (a2 == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            e g2 = a2.g();
            if (g2 != null) {
                for (int i = 0; i < g2.a(); i++) {
                    hashMap.put(g2.a(i), g2.b(i));
                }
            }
            return new com.bytedance.sdk.component.e.b(a2.d(), a2.c(), a2.e(), hashMap, a2.f().b(), a2.b(), a2.a());
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
